package redhat.medicare;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MedicarePlan implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String name;
   private java.lang.String type;
   private java.lang.String coverage;
   private String medicarePay;
   private String basicPlanPays;
   private String youpay;

   public MedicarePlan()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.lang.String getCoverage()
   {
      return this.coverage;
   }

   public void setCoverage(java.lang.String coverage)
   {
      this.coverage = coverage;
   }

   public java.lang.String getMedicarePay()
   {
      return this.medicarePay;
   }

   public void setMedicarePay(java.lang.String medicarePay)
   {
      this.medicarePay = medicarePay;
   }

   public java.lang.String getBasicPlanPays()
   {
      return this.basicPlanPays;
   }

   public void setBasicPlanPays(java.lang.String basicPlanPays)
   {
      this.basicPlanPays = basicPlanPays;
   }

   public java.lang.String getYoupay()
   {
      return this.youpay;
   }

   public void setYoupay(java.lang.String youpay)
   {
      this.youpay = youpay;
   }

   public MedicarePlan(java.lang.String name, java.lang.String type,
         java.lang.String coverage, java.lang.String medicarePay,
         java.lang.String basicPlanPays, java.lang.String youpay)
   {
      this.name = name;
      this.type = type;
      this.coverage = coverage;
      this.medicarePay = medicarePay;
      this.basicPlanPays = basicPlanPays;
      this.youpay = youpay;
   }

}