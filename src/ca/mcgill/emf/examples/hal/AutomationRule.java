/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.AutomationRule#getActivitylog <em>Activitylog</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getAutomationRule()
 * @model
 * @generated
 */
public interface AutomationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Activitylog</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActivityLog#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitylog</em>' reference.
	 * @see #setActivitylog(ActivityLog)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getAutomationRule_Activitylog()
	 * @see ca.mcgill.emf.examples.hal.ActivityLog#getRules
	 * @model opposite="rules" required="true"
	 * @generated
	 */
	ActivityLog getActivitylog();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.AutomationRule#getActivitylog <em>Activitylog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitylog</em>' reference.
	 * @see #getActivitylog()
	 * @generated
	 */
	void setActivitylog(ActivityLog value);

} // AutomationRule
