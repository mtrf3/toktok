package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EventCommandUnit extends Event {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_EventCommandUnit(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public EEStdStringList actionKeyShowList() {
        return new EEStdStringList(EffectCreatorJniJNI.EventCommandUnit_actionKeyShowList(this.swigCPtr, this), true);
    }

    public boolean actionSupportDetect() {
        return EffectCreatorJniJNI.EventCommandUnit_actionSupportDetect(this.swigCPtr, this);
    }

    public EEStdFeatureList appearActionConflictDetect() {
        return new EEStdFeatureList(EffectCreatorJniJNI.EventCommandUnit_appearActionConflictDetect(this.swigCPtr, this), true);
    }

    public EventAction getAction() {
        long EventCommandUnit_getAction__SWIG_1 = EffectCreatorJniJNI.EventCommandUnit_getAction__SWIG_1(this.swigCPtr, this);
        if (EventCommandUnit_getAction__SWIG_1 == 0) {
            return null;
        }
        return new EventAction(EventCommandUnit_getAction__SWIG_1, true);
    }

    public EEStdEventActionList getActionList() {
        return new EEStdEventActionList(EffectCreatorJniJNI.EventCommandUnit_getActionList(this.swigCPtr, this), true);
    }

    public EEStdElementList getActionsVector() {
        return new EEStdElementList(EffectCreatorJniJNI.EventCommandUnit_getActionsVector(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.EventCommandUnit_getClassName(this.swigCPtr, this);
    }

    public ElementId getFeatureGroupId() {
        return new ElementId(EffectCreatorJniJNI.EventCommandUnit_getFeatureGroupId(this.swigCPtr, this), true);
    }

    public ElementId getFeatureId() {
        return new ElementId(EffectCreatorJniJNI.EventCommandUnit_getFeatureId(this.swigCPtr, this), true);
    }

    public EEStdFeatureList getFeatures() {
        return new EEStdFeatureList(EffectCreatorJniJNI.EventCommandUnit_getFeatures(this.swigCPtr, this), true);
    }

    public EventCommandUnit() {
        this(EffectCreatorJniJNI.new_EventCommandUnit__SWIG_1(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.EventCommandUnit_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public EventCommandUnit(Project project) {
        this(EffectCreatorJniJNI.new_EventCommandUnit__SWIG_0(Project.getCPtr(project), project), true);
    }

    public static EventCommandUnit create(Project project) {
        long EventCommandUnit_create = EffectCreatorJniJNI.EventCommandUnit_create(Project.getCPtr(project), project);
        if (EventCommandUnit_create == 0) {
            return null;
        }
        return new EventCommandUnit(EventCommandUnit_create, true);
    }

    public static EventCommandUnit dynamicCast(Element element) {
        long EventCommandUnit_dynamicCast__SWIG_0 = EffectCreatorJniJNI.EventCommandUnit_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (EventCommandUnit_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new EventCommandUnit(EventCommandUnit_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(EventCommandUnit eventCommandUnit) {
        if (eventCommandUnit == null) {
            return 0L;
        }
        return eventCommandUnit.swigCPtr;
    }

    public EventAction getAction(int i) {
        long EventCommandUnit_getAction__SWIG_0 = EffectCreatorJniJNI.EventCommandUnit_getAction__SWIG_0(this.swigCPtr, this, i);
        if (EventCommandUnit_getAction__SWIG_0 == 0) {
            return null;
        }
        return new EventAction(EventCommandUnit_getAction__SWIG_0, true);
    }

    public void removeFeature(ElementId elementId) {
        EffectCreatorJniJNI.EventCommandUnit_removeFeature(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void setFeatureGroupId(ElementId elementId) {
        EffectCreatorJniJNI.EventCommandUnit_setFeatureGroupId__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void setFeatureId(ElementId elementId) {
        EffectCreatorJniJNI.EventCommandUnit_setFeatureId__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public Error setFeatures(EEStdFeatureList eEStdFeatureList) {
        return new Error(EffectCreatorJniJNI.EventCommandUnit_setFeatures(this.swigCPtr, this, EEStdFeatureList.getCPtr(eEStdFeatureList), eEStdFeatureList), true);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public EventCommandUnit(long j, boolean z) {
        super(EffectCreatorJniJNI.EventCommandUnit_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void exchangeFeature(Feature feature, Feature feature2) {
        EffectCreatorJniJNI.EventCommandUnit_exchangeFeature(this.swigCPtr, this, Feature.getCPtr(feature), feature, Feature.getCPtr(feature2), feature2);
    }

    public void setFeatureGroupId(ElementId elementId, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventCommandUnit_setFeatureGroupId__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, changeFrom.swigValue());
    }

    public void setFeatureId(ElementId elementId, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventCommandUnit_setFeatureId__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, changeFrom.swigValue());
    }
}
