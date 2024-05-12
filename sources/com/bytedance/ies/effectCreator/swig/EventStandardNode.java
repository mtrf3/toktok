package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EventStandardNode extends Element {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_EventStandardNode(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getAction() {
        return EffectCreatorJniJNI.EventStandardNode_getAction__SWIG_1(this.swigCPtr, this);
    }

    public EventMode getActionMode() {
        return EventMode.swigToEnum(EffectCreatorJniJNI.EventStandardNode_getActionMode(this.swigCPtr, this));
    }

    public EEStdElementList getActionsVector() {
        return new EEStdElementList(EffectCreatorJniJNI.EventStandardNode_getActionsVector(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.EventStandardNode_getClassName(this.swigCPtr, this);
    }

    public String getTrigger() {
        return EffectCreatorJniJNI.EventStandardNode_getTrigger__SWIG_1(this.swigCPtr, this);
    }

    public EventMode getTriggerMode() {
        return EventMode.swigToEnum(EffectCreatorJniJNI.EventStandardNode_getTriggerMode(this.swigCPtr, this));
    }

    public EEStdElementList getTriggersVector() {
        return new EEStdElementList(EffectCreatorJniJNI.EventStandardNode_getTriggersVector(this.swigCPtr, this), true);
    }

    public EventStandardNode() {
        this(EffectCreatorJniJNI.new_EventStandardNode__SWIG_1(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.EventStandardNode_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public EventStandardNode(Project project) {
        this(EffectCreatorJniJNI.new_EventStandardNode__SWIG_0(Project.getCPtr(project), project), true);
    }

    public static EventStandardNode create(Project project) {
        long EventStandardNode_create = EffectCreatorJniJNI.EventStandardNode_create(Project.getCPtr(project), project);
        if (EventStandardNode_create == 0) {
            return null;
        }
        return new EventStandardNode(EventStandardNode_create, true);
    }

    public static EventStandardNode dynamicCast(Element element) {
        long EventStandardNode_dynamicCast__SWIG_0 = EffectCreatorJniJNI.EventStandardNode_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (EventStandardNode_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new EventStandardNode(EventStandardNode_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(EventStandardNode eventStandardNode) {
        if (eventStandardNode == null) {
            return 0L;
        }
        return eventStandardNode.swigCPtr;
    }

    public String getAction(int i) {
        return EffectCreatorJniJNI.EventStandardNode_getAction__SWIG_0(this.swigCPtr, this, i);
    }

    public String getTrigger(int i) {
        return EffectCreatorJniJNI.EventStandardNode_getTrigger__SWIG_0(this.swigCPtr, this, i);
    }

    public void setActionMode(EventMode eventMode) {
        EffectCreatorJniJNI.EventStandardNode_setActionMode__SWIG_1(this.swigCPtr, this, eventMode.swigValue());
    }

    public void setTriggerMode(EventMode eventMode) {
        EffectCreatorJniJNI.EventStandardNode_setTriggerMode__SWIG_1(this.swigCPtr, this, eventMode.swigValue());
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public EventStandardNode(long j, boolean z) {
        super(EffectCreatorJniJNI.EventStandardNode_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void setActionMode(EventMode eventMode, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventStandardNode_setActionMode__SWIG_0(this.swigCPtr, this, eventMode.swigValue(), changeFrom.swigValue());
    }

    public void setTriggerMode(EventMode eventMode, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventStandardNode_setTriggerMode__SWIG_0(this.swigCPtr, this, eventMode.swigValue(), changeFrom.swigValue());
    }
}
