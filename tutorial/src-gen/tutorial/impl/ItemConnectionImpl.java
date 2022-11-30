/**
 */
package tutorial.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tutorial.Component;
import tutorial.ItemConnection;
import tutorial.Marker;
import tutorial.TutorialPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tutorial.impl.ItemConnectionImpl#getComponentA <em>Component A</em>}</li>
 *   <li>{@link tutorial.impl.ItemConnectionImpl#getComponentB <em>Component B</em>}</li>
 *   <li>{@link tutorial.impl.ItemConnectionImpl#getMarkerA <em>Marker A</em>}</li>
 *   <li>{@link tutorial.impl.ItemConnectionImpl#getMarkerB <em>Marker B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemConnectionImpl extends MinimalEObjectImpl.Container implements ItemConnection {
	/**
	 * The cached value of the '{@link #getComponentA() <em>Component A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentA()
	 * @generated
	 * @ordered
	 */
	protected Component componentA;

	/**
	 * The cached value of the '{@link #getComponentB() <em>Component B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentB()
	 * @generated
	 * @ordered
	 */
	protected Component componentB;

	/**
	 * The cached value of the '{@link #getMarkerA() <em>Marker A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerA()
	 * @generated
	 * @ordered
	 */
	protected Marker markerA;

	/**
	 * The cached value of the '{@link #getMarkerB() <em>Marker B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerB()
	 * @generated
	 * @ordered
	 */
	protected Marker markerB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TutorialPackage.Literals.ITEM_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponentA() {
		if (componentA != null && componentA.eIsProxy()) {
			InternalEObject oldComponentA = (InternalEObject) componentA;
			componentA = (Component) eResolveProxy(oldComponentA);
			if (componentA != oldComponentA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TutorialPackage.ITEM_CONNECTION__COMPONENT_A, oldComponentA, componentA));
			}
		}
		return componentA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponentA() {
		return componentA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentA(Component newComponentA) {
		Component oldComponentA = componentA;
		componentA = newComponentA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.ITEM_CONNECTION__COMPONENT_A,
					oldComponentA, componentA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponentB() {
		if (componentB != null && componentB.eIsProxy()) {
			InternalEObject oldComponentB = (InternalEObject) componentB;
			componentB = (Component) eResolveProxy(oldComponentB);
			if (componentB != oldComponentB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TutorialPackage.ITEM_CONNECTION__COMPONENT_B, oldComponentB, componentB));
			}
		}
		return componentB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponentB() {
		return componentB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentB(Component newComponentB) {
		Component oldComponentB = componentB;
		componentB = newComponentB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.ITEM_CONNECTION__COMPONENT_B,
					oldComponentB, componentB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marker getMarkerA() {
		if (markerA != null && markerA.eIsProxy()) {
			InternalEObject oldMarkerA = (InternalEObject) markerA;
			markerA = (Marker) eResolveProxy(oldMarkerA);
			if (markerA != oldMarkerA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TutorialPackage.ITEM_CONNECTION__MARKER_A,
							oldMarkerA, markerA));
			}
		}
		return markerA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marker basicGetMarkerA() {
		return markerA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkerA(Marker newMarkerA) {
		Marker oldMarkerA = markerA;
		markerA = newMarkerA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.ITEM_CONNECTION__MARKER_A, oldMarkerA,
					markerA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marker getMarkerB() {
		if (markerB != null && markerB.eIsProxy()) {
			InternalEObject oldMarkerB = (InternalEObject) markerB;
			markerB = (Marker) eResolveProxy(oldMarkerB);
			if (markerB != oldMarkerB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TutorialPackage.ITEM_CONNECTION__MARKER_B,
							oldMarkerB, markerB));
			}
		}
		return markerB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marker basicGetMarkerB() {
		return markerB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkerB(Marker newMarkerB) {
		Marker oldMarkerB = markerB;
		markerB = newMarkerB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.ITEM_CONNECTION__MARKER_B, oldMarkerB,
					markerB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_A:
			if (resolve)
				return getComponentA();
			return basicGetComponentA();
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_B:
			if (resolve)
				return getComponentB();
			return basicGetComponentB();
		case TutorialPackage.ITEM_CONNECTION__MARKER_A:
			if (resolve)
				return getMarkerA();
			return basicGetMarkerA();
		case TutorialPackage.ITEM_CONNECTION__MARKER_B:
			if (resolve)
				return getMarkerB();
			return basicGetMarkerB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_A:
			setComponentA((Component) newValue);
			return;
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_B:
			setComponentB((Component) newValue);
			return;
		case TutorialPackage.ITEM_CONNECTION__MARKER_A:
			setMarkerA((Marker) newValue);
			return;
		case TutorialPackage.ITEM_CONNECTION__MARKER_B:
			setMarkerB((Marker) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_A:
			setComponentA((Component) null);
			return;
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_B:
			setComponentB((Component) null);
			return;
		case TutorialPackage.ITEM_CONNECTION__MARKER_A:
			setMarkerA((Marker) null);
			return;
		case TutorialPackage.ITEM_CONNECTION__MARKER_B:
			setMarkerB((Marker) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_A:
			return componentA != null;
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_B:
			return componentB != null;
		case TutorialPackage.ITEM_CONNECTION__MARKER_A:
			return markerA != null;
		case TutorialPackage.ITEM_CONNECTION__MARKER_B:
			return markerB != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemConnectionImpl
