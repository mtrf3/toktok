package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EventSequence extends EventItem {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.EventItem, com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_EventSequence(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.EventItem, com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.EventSequence_getClassName(this.swigCPtr, this);
    }

    public EEStdElementList getObjectVector() {
        return new EEStdElementList(EffectCreatorJniJNI.EventSequence_getObjectVector(this.swigCPtr, this), true);
    }

    public SequenceMode getSequenceMode() {
        return SequenceMode.swigToEnum(EffectCreatorJniJNI.EventSequence_getSequenceMode(this.swigCPtr, this));
    }

    public String getSequenceName() {
        return EffectCreatorJniJNI.EventSequence_getSequenceName(this.swigCPtr, this);
    }

    public ElementId getStopTriggerId() {
        return new ElementId(EffectCreatorJniJNI.EventSequence_getStopTriggerId(this.swigCPtr, this), true);
    }

    public ElementId getSwitchTriggerId() {
        return new ElementId(EffectCreatorJniJNI.EventSequence_getSwitchTriggerId(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.effectcreator.swig.EventItem
    public boolean isEdited() {
        return EffectCreatorJniJNI.EventSequence_isEdited(this.swigCPtr, this);
    }

    public EventSequence() {
        this(EffectCreatorJniJNI.new_EventSequence__SWIG_1(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.EventSequence_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.EventItem, com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public EventSequence(Project project) {
        this(EffectCreatorJniJNI.new_EventSequence__SWIG_0(Project.getCPtr(project), project), true);
    }

    public static EventSequence create(Project project) {
        long EventSequence_create__SWIG_1 = EffectCreatorJniJNI.EventSequence_create__SWIG_1(Project.getCPtr(project), project);
        if (EventSequence_create__SWIG_1 == 0) {
            return null;
        }
        return new EventSequence(EventSequence_create__SWIG_1, true);
    }

    public static EventSequence dynamicCast(Element element) {
        long EventSequence_dynamicCast__SWIG_0 = EffectCreatorJniJNI.EventSequence_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (EventSequence_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new EventSequence(EventSequence_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(EventSequence eventSequence) {
        if (eventSequence == null) {
            return 0L;
        }
        return eventSequence.swigCPtr;
    }

    public void setSequenceMode(SequenceMode sequenceMode) {
        EffectCreatorJniJNI.EventSequence_setSequenceMode__SWIG_1(this.swigCPtr, this, sequenceMode.swigValue());
    }

    public void setSequenceName(String str) {
        EffectCreatorJniJNI.EventSequence_setSequenceName__SWIG_1(this.swigCPtr, this, str);
    }

    public void setStopTriggerId(ElementId elementId) {
        EffectCreatorJniJNI.EventSequence_setStopTriggerId__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void setSwitchTriggerId(ElementId elementId) {
        EffectCreatorJniJNI.EventSequence_setSwitchTriggerId__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    @Override // com.bytedance.ies.effectcreator.swig.EventItem, com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public EventSequence(long j, boolean z) {
        super(EffectCreatorJniJNI.EventSequence_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static EventSequence create(Project project, int i) {
        long EventSequence_create__SWIG_0 = EffectCreatorJniJNI.EventSequence_create__SWIG_0(Project.getCPtr(project), project, i);
        if (EventSequence_create__SWIG_0 == 0) {
            return null;
        }
        return new EventSequence(EventSequence_create__SWIG_0, true);
    }

    public void setSequenceMode(SequenceMode sequenceMode, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventSequence_setSequenceMode__SWIG_0(this.swigCPtr, this, sequenceMode.swigValue(), changeFrom.swigValue());
    }

    public void setSequenceName(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventSequence_setSequenceName__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setStopTriggerId(ElementId elementId, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventSequence_setStopTriggerId__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, changeFrom.swigValue());
    }

    public void setSwitchTriggerId(ElementId elementId, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventSequence_setSwitchTriggerId__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, changeFrom.swigValue());
    }
}
