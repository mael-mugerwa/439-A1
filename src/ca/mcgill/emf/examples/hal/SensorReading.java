/**
 */
package ca.mcgill.emf.examples.hal;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorReading#getActivitylog <em>Activitylog</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorReading#getValue <em>Value</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorReading#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.SensorReading#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorReading()
 * @model
 * @generated
 */
public interface SensorReading extends EObject {
	/**
	 * Returns the value of the '<em><b>Activitylog</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActivityLog#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitylog</em>' reference.
	 * @see #setActivitylog(ActivityLog)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorReading_Activitylog()
	 * @see ca.mcgill.emf.examples.hal.ActivityLog#getReadings
	 * @model opposite="readings" required="true"
	 * @generated
	 */
	ActivityLog getActivitylog();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorReading#getActivitylog <em>Activitylog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitylog</em>' reference.
	 * @see #getActivitylog()
	 * @generated
	 */
	void setActivitylog(ActivityLog value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorReading_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorReading#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorReading_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorReading#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Sensor#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensorReading_Sensor()
	 * @see ca.mcgill.emf.examples.hal.Sensor#getReadings
	 * @model opposite="readings"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.SensorReading#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // SensorReading
