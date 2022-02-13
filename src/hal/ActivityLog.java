/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.ActivityLog#getReadings <em>Readings</em>}</li>
 *   <li>{@link hal.ActivityLog#getCommands <em>Commands</em>}</li>
 *   <li>{@link hal.ActivityLog#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getActivityLog()
 * @model
 * @generated
 */
public interface ActivityLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Readings</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hal.SensorReading#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' reference.
	 * @see #setReadings(SensorReading)
	 * @see hal.HalPackage#getActivityLog_Readings()
	 * @see hal.SensorReading#getActivitylog
	 * @model opposite="activitylog"
	 * @generated
	 */
	SensorReading getReadings();

	/**
	 * Sets the value of the '{@link hal.ActivityLog#getReadings <em>Readings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readings</em>' reference.
	 * @see #getReadings()
	 * @generated
	 */
	void setReadings(SensorReading value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link hal.IssuedCommand}.
	 * It is bidirectional and its opposite is '{@link hal.IssuedCommand#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see hal.HalPackage#getActivityLog_Commands()
	 * @see hal.IssuedCommand#getActivitylog
	 * @model opposite="activitylog"
	 * @generated
	 */
	EList<IssuedCommand> getCommands();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' reference list.
	 * The list contents are of type {@link hal.AutomationRule}.
	 * It is bidirectional and its opposite is '{@link hal.AutomationRule#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' reference list.
	 * @see hal.HalPackage#getActivityLog_Rules()
	 * @see hal.AutomationRule#getActivitylog
	 * @model opposite="activitylog"
	 * @generated
	 */
	EList<AutomationRule> getRules();

} // ActivityLog
