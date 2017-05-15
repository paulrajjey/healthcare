package redhat.workerscompensation;

import java.util.Calendar;
import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Claim implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String claimId;
   private java.util.Date dateOfNotice;
   private java.util.Date informedDate;

   private java.lang.String insuredName;

   private java.lang.String insuredAddress;

   private java.lang.String insuredCity;

   private java.lang.String insuredState;

   private java.lang.String insuredZip;

   private java.lang.String emplyeeName;

   private java.lang.String employerAddress;

   private java.lang.String employerState;

   private java.lang.String employerCity;

   private java.util.Date dateOfInjury;

   private java.lang.String workLocation;

   private java.lang.String natureOfIllnessorInjury;

   private java.lang.String injuryIllNessDetail;

   private java.lang.String typeofClaim;

   private java.lang.String typeOfIllNess;

   private java.lang.String injuryCircumstance;

   private java.lang.String subClass;

   private java.util.Date claimWritenNoticeDate;

   private java.util.List<java.lang.String> rejectedReasons;

   private java.lang.String isRejected;

   public Claim()
   {
   }

   public java.lang.String getClaimId()
   {
      return this.claimId;
   }

   public void setClaimId(java.lang.String claimId)
   {
      this.claimId = claimId;
   }

   public java.util.Date getDateOfNotice()
   {
      return this.dateOfNotice;
   }

   public void setDateOfNotice(java.util.Date dateOfNotice)
   {
      this.dateOfNotice = dateOfNotice;
   }

   public java.util.Date getInformedDate()
   {
      return this.informedDate;
   }

   public void setInformedDate(java.util.Date informedDate)
   {
      this.informedDate = informedDate;
   }

   public java.lang.String getInsuredName()
   {
      return this.insuredName;
   }

   public void setInsuredName(java.lang.String insuredName)
   {
      this.insuredName = insuredName;
   }

   public java.lang.String getInsuredAddress()
   {
      return this.insuredAddress;
   }

   public void setInsuredAddress(java.lang.String insuredAddress)
   {
      this.insuredAddress = insuredAddress;
   }

   public java.lang.String getInsuredCity()
   {
      return this.insuredCity;
   }

   public void setInsuredCity(java.lang.String insuredCity)
   {
      this.insuredCity = insuredCity;
   }

   public java.lang.String getInsuredState()
   {
      return this.insuredState;
   }

   public void setInsuredState(java.lang.String insuredState)
   {
      this.insuredState = insuredState;
   }

   public java.lang.String getInsuredZip()
   {
      return this.insuredZip;
   }

   public void setInsuredZip(java.lang.String insuredZip)
   {
      this.insuredZip = insuredZip;
   }

   public java.lang.String getEmplyeeName()
   {
      return this.emplyeeName;
   }

   public void setEmplyeeName(java.lang.String emplyeeName)
   {
      this.emplyeeName = emplyeeName;
   }

   public java.lang.String getEmployerAddress()
   {
      return this.employerAddress;
   }

   public void setEmployerAddress(java.lang.String employerAddress)
   {
      this.employerAddress = employerAddress;
   }

   public java.lang.String getEmployerState()
   {
      return this.employerState;
   }

   public void setEmployerState(java.lang.String employerState)
   {
      this.employerState = employerState;
   }

   public java.lang.String getEmployerCity()
   {
      return this.employerCity;
   }

   public void setEmployerCity(java.lang.String employerCity)
   {
      this.employerCity = employerCity;
   }

   public java.util.Date getDateOfInjury()
   {
      return this.dateOfInjury;
   }

   public void setDateOfInjury(java.util.Date dateOfInjury)
   {
      this.dateOfInjury = dateOfInjury;
   }

   public java.lang.String getWorkLocation()
   {
      return this.workLocation;
   }

   public void setWorkLocation(java.lang.String workLocation)
   {
      this.workLocation = workLocation;
   }

   public java.lang.String getNatureOfIllnessorInjury()
   {
      return this.natureOfIllnessorInjury;
   }

   public void setNatureOfIllnessorInjury(java.lang.String natureOfIllnessorInjury)
   {
      this.natureOfIllnessorInjury = natureOfIllnessorInjury;
   }

   public java.lang.String getInjuryIllNessDetail()
   {
      return this.injuryIllNessDetail;
   }

   public void setInjuryIllNessDetail(java.lang.String injuryIllNessDetail)
   {
      this.injuryIllNessDetail = injuryIllNessDetail;
   }

   public java.lang.String getTypeofClaim()
   {
      return this.typeofClaim;
   }

   public void setTypeofClaim(java.lang.String typeofClaim)
   {
      this.typeofClaim = typeofClaim;
   }

   public java.lang.String getTypeOfIllNess()
   {
      return this.typeOfIllNess;
   }

   public void setTypeOfIllNess(java.lang.String typeOfIllNess)
   {
      this.typeOfIllNess = typeOfIllNess;
   }

   public java.lang.String getInjuryCircumstance()
   {
      return this.injuryCircumstance;
   }

   public void setInjuryCircumstance(java.lang.String injuryCircumstance)
   {
      this.injuryCircumstance = injuryCircumstance;
   }

   public java.lang.String getSubClass()
   {
      return this.subClass;
   }

   public void setSubClass(java.lang.String subClass)
   {
      this.subClass = subClass;
   }

   public java.util.Date getClaimWritenNoticeDate()
   {
      return this.claimWritenNoticeDate;
   }

   public boolean noOfClaimWrittenNoticeGT(int days)
   {

      Calendar endGDt = Calendar.getInstance();
      Date date = endGDt.getTime();
      int val = calculateDays(this.claimWritenNoticeDate, date);

      return val > days ? true : false;

   }

   public int calculateDays(Date startDate, Date endDate)
   {

      Calendar start = Calendar.getInstance();
      start.setTime(startDate);
      Calendar end = Calendar.getInstance();
      end.setTime(endDate);
      int workingDays = 0;
      while (!start.after(end))
      {
         int day = start.get(Calendar.DAY_OF_WEEK);
         if ((day != Calendar.SATURDAY) && (day != Calendar.SUNDAY))
            workingDays++;
         start.add(Calendar.DATE, 1);
      }
      System.out.println(workingDays);
      return workingDays;
   }

   public void setClaimWritenNoticeDate(java.util.Date claimWritenNoticeDate)
   {
      this.claimWritenNoticeDate = claimWritenNoticeDate;
   }

   public java.util.List<java.lang.String> getRejectedReasons()
   {
      return this.rejectedReasons;
   }

   public void setRejectedReasons(java.util.List<java.lang.String> rejectedReasons)
   {
      this.rejectedReasons = rejectedReasons;
   }

   public java.lang.String getIsRejected()
   {
      return this.isRejected;
   }

   public void setIsRejected(java.lang.String isRejected)
   {
      this.isRejected = isRejected;
   }

    public addReason(java.lang.String reason){
        
        if(this.rejectedReasons  == null){
            this.rejectedReasons = new java.util.ArrayList<java.lang.String>();
        }
    }
   public Claim(java.lang.String claimId, java.util.Date dateOfNotice,
         java.util.Date informedDate, java.lang.String insuredName,
         java.lang.String insuredAddress, java.lang.String insuredCity,
         java.lang.String insuredState, java.lang.String insuredZip,
         java.lang.String emplyeeName, java.lang.String employerAddress,
         java.lang.String employerState, java.lang.String employerCity,
         java.util.Date dateOfInjury, java.lang.String workLocation,
         java.lang.String natureOfIllnessorInjury,
         java.lang.String injuryIllNessDetail, java.lang.String typeofClaim,
         java.lang.String typeOfIllNess, java.lang.String injuryCircumstance,
         java.lang.String subClass, java.util.Date claimWritenNoticeDate,
         java.util.List<java.lang.String> rejectedReasons,
         java.lang.String isRejected)
   {
      this.claimId = claimId;
      this.dateOfNotice = dateOfNotice;
      this.informedDate = informedDate;
      this.insuredName = insuredName;
      this.insuredAddress = insuredAddress;
      this.insuredCity = insuredCity;
      this.insuredState = insuredState;
      this.insuredZip = insuredZip;
      this.emplyeeName = emplyeeName;
      this.employerAddress = employerAddress;
      this.employerState = employerState;
      this.employerCity = employerCity;
      this.dateOfInjury = dateOfInjury;
      this.workLocation = workLocation;
      this.natureOfIllnessorInjury = natureOfIllnessorInjury;
      this.injuryIllNessDetail = injuryIllNessDetail;
      this.typeofClaim = typeofClaim;
      this.typeOfIllNess = typeOfIllNess;
      this.injuryCircumstance = injuryCircumstance;
      this.subClass = subClass;
      this.claimWritenNoticeDate = claimWritenNoticeDate;
      this.rejectedReasons = rejectedReasons;
      this.isRejected = isRejected;
   }

}