package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EventObject extends EventItem {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.EventItem, com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_EventObject(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getAnimation() {
        return EffectCreatorJniJNI.EventObject_getAnimation__SWIG_1(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.EventItem, com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.EventObject_getClassName(this.swigCPtr, this);
    }

    public EventStandardNode getEndEventNode() {
        long EventObject_getEndEventNode = EffectCreatorJniJNI.EventObject_getEndEventNode(this.swigCPtr, this);
        if (EventObject_getEndEventNode == 0) {
            return null;
        }
        return new EventStandardNode(EventObject_getEndEventNode, true);
    }

    public ElementId getEndEventNodeId() {
        return new ElementId(EffectCreatorJniJNI.EventObject_getEndEventNodeId(this.swigCPtr, this), true);
    }

    public String getEndTrigger() {
        return EffectCreatorJniJNI.EventObject_getEndTrigger__SWIG_1(this.swigCPtr, this);
    }

    public ElementId getFeatureId() {
        return new ElementId(EffectCreatorJniJNI.EventObject_getFeatureId(this.swigCPtr, this), true);
    }

    public ElementId getParentSequenceId() {
        return new ElementId(EffectCreatorJniJNI.EventObject_getParentSequenceId(this.swigCPtr, this), true);
    }

    public EventStandardNode getStartEventNode() {
        long EventObject_getStartEventNode = EffectCreatorJniJNI.EventObject_getStartEventNode(this.swigCPtr, this);
        if (EventObject_getStartEventNode == 0) {
            return null;
        }
        return new EventStandardNode(EventObject_getStartEventNode, true);
    }

    public ElementId getStartEventNodeId() {
        return new ElementId(EffectCreatorJniJNI.EventObject_getStartEventNodeId(this.swigCPtr, this), true);
    }

    public String getStartTrigger() {
        return EffectCreatorJniJNI.EventObject_getStartTrigger__SWIG_1(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.EventItem
    public boolean isEdited() {
        return EffectCreatorJniJNI.EventObject_isEdited(this.swigCPtr, this);
    }

    public EventObject() {
        this(EffectCreatorJniJNI.new_EventObject__SWIG_1(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.EventObject_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.EventItem, com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public EventObject(Project project) {
        this(EffectCreatorJniJNI.new_EventObject__SWIG_0(Project.getCPtr(project), project), true);
    }

    public static EventObject create(Project project) {
        long EventObject_create = EffectCreatorJniJNI.EventObject_create(Project.getCPtr(project), project);
        if (EventObject_create == 0) {
            return null;
        }
        return new EventObject(EventObject_create, true);
    }

    public static EventObject dynamicCast(Element element) {
        long EventObject_dynamicCast__SWIG_0 = EffectCreatorJniJNI.EventObject_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (EventObject_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new EventObject(EventObject_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(EventObject eventObject) {
        if (eventObject == null) {
            return 0L;
        }
        return eventObject.swigCPtr;
    }

    public String getAnimation(int i) {
        return EffectCreatorJniJNI.EventObject_getAnimation__SWIG_0(this.swigCPtr, this, i);
    }

    public String getEndTrigger(int i) {
        return EffectCreatorJniJNI.EventObject_getEndTrigger__SWIG_0(this.swigCPtr, this, i);
    }

    public String getStartTrigger(int i) {
        return EffectCreatorJniJNI.EventObject_getStartTrigger__SWIG_0(this.swigCPtr, this, i);
    }

    public void setEndEventNodeId(ElementId elementId) {
        EffectCreatorJniJNI.EventObject_setEndEventNodeId__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void setFeatureId(ElementId elementId) {
        EffectCreatorJniJNI.EventObject_setFeatureId__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void setParentSequenceId(ElementId elementId) {
        EffectCreatorJniJNI.EventObject_setParentSequenceId__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void setStartEventNodeId(ElementId elementId) {
        EffectCreatorJniJNI.EventObject_setStartEventNodeId__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    @Override // com.bytedance.ies.effectcreator.swig.EventItem, com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public EventObject(long j, boolean z) {
        super(EffectCreatorJniJNI.EventObject_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void setEndEventNodeId(ElementId elementId, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventObject_setEndEventNodeId__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, changeFrom.swigValue());
    }

    public void setFeatureId(ElementId elementId, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventObject_setFeatureId__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, changeFrom.swigValue());
    }

    public void setParentSequenceId(ElementId elementId, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventObject_setParentSequenceId__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, changeFrom.swigValue());
    }

    public void setStartEventNodeId(ElementId elementId, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventObject_setStartEventNodeId__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, changeFrom.swigValue());
    }
}
