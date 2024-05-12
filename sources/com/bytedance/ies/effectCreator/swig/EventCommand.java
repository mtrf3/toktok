package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EventCommand extends Event {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_EventCommand(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public EEStdFeatureList appearActionConflictDetect() {
        return new EEStdFeatureList(EffectCreatorJniJNI.EventCommand_appearActionConflictDetect(this.swigCPtr, this), true);
    }

    public EventCommandUnit createCommandUnit() {
        long EventCommand_createCommandUnit = EffectCreatorJniJNI.EventCommand_createCommandUnit(this.swigCPtr, this);
        if (EventCommand_createCommandUnit == 0) {
            return null;
        }
        return new EventCommandUnit(EventCommand_createCommandUnit, true);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.EventCommand_getClassName(this.swigCPtr, this);
    }

    public EventCommandUnit getCommandUnit() {
        long EventCommand_getCommandUnit__SWIG_1 = EffectCreatorJniJNI.EventCommand_getCommandUnit__SWIG_1(this.swigCPtr, this);
        if (EventCommand_getCommandUnit__SWIG_1 == 0) {
            return null;
        }
        return new EventCommandUnit(EventCommand_getCommandUnit__SWIG_1, true);
    }

    public EEStdEventCommandUnitList getCommandUnitList() {
        return new EEStdEventCommandUnitList(EffectCreatorJniJNI.EventCommand_getCommandUnitList(this.swigCPtr, this), true);
    }

    public EEStdElementList getCommandUnitsVector() {
        return new EEStdElementList(EffectCreatorJniJNI.EventCommand_getCommandUnitsVector(this.swigCPtr, this), true);
    }

    public EventTrigger getTrigger() {
        long EventCommand_getTrigger__SWIG_1 = EffectCreatorJniJNI.EventCommand_getTrigger__SWIG_1(this.swigCPtr, this);
        if (EventCommand_getTrigger__SWIG_1 == 0) {
            return null;
        }
        return new EventTrigger(EventCommand_getTrigger__SWIG_1, true);
    }

    public EEStdEventTriggerList getTriggerList() {
        return new EEStdEventTriggerList(EffectCreatorJniJNI.EventCommand_getTriggerList(this.swigCPtr, this), true);
    }

    public TriggerMode getTriggerMode() {
        return TriggerMode.swigToEnum(EffectCreatorJniJNI.EventCommand_getTriggerMode(this.swigCPtr, this));
    }

    public EEStdElementList getTriggersVector() {
        return new EEStdElementList(EffectCreatorJniJNI.EventCommand_getTriggersVector(this.swigCPtr, this), true);
    }

    public EventCommand() {
        this(EffectCreatorJniJNI.new_EventCommand__SWIG_1(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.EventCommand_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public EventCommand(Project project) {
        this(EffectCreatorJniJNI.new_EventCommand__SWIG_0(Project.getCPtr(project), project), true);
    }

    public static EventCommand create(Project project) {
        long EventCommand_create = EffectCreatorJniJNI.EventCommand_create(Project.getCPtr(project), project);
        if (EventCommand_create == 0) {
            return null;
        }
        return new EventCommand(EventCommand_create, true);
    }

    public static EventCommand dynamicCast(Element element) {
        long EventCommand_dynamicCast__SWIG_0 = EffectCreatorJniJNI.EventCommand_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (EventCommand_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new EventCommand(EventCommand_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(EventCommand eventCommand) {
        if (eventCommand == null) {
            return 0L;
        }
        return eventCommand.swigCPtr;
    }

    public EventCommandUnit getCommandUnit(int i) {
        long EventCommand_getCommandUnit__SWIG_0 = EffectCreatorJniJNI.EventCommand_getCommandUnit__SWIG_0(this.swigCPtr, this, i);
        if (EventCommand_getCommandUnit__SWIG_0 == 0) {
            return null;
        }
        return new EventCommandUnit(EventCommand_getCommandUnit__SWIG_0, true);
    }

    public EventTrigger getTrigger(int i) {
        long EventCommand_getTrigger__SWIG_0 = EffectCreatorJniJNI.EventCommand_getTrigger__SWIG_0(this.swigCPtr, this, i);
        if (EventCommand_getTrigger__SWIG_0 == 0) {
            return null;
        }
        return new EventTrigger(EventCommand_getTrigger__SWIG_0, true);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void getUsedAlgorithm(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.EventCommand_getUsedAlgorithm(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public Error insertCommandUnitToBottom(EventCommandUnit eventCommandUnit) {
        return new Error(EffectCreatorJniJNI.EventCommand_insertCommandUnitToBottom(this.swigCPtr, this, EventCommandUnit.getCPtr(eventCommandUnit), eventCommandUnit), true);
    }

    public Error removeCommandUnit(EventCommandUnit eventCommandUnit) {
        return new Error(EffectCreatorJniJNI.EventCommand_removeCommandUnit(this.swigCPtr, this, EventCommandUnit.getCPtr(eventCommandUnit), eventCommandUnit), true);
    }

    public void removeFeature(ElementId elementId) {
        EffectCreatorJniJNI.EventCommand_removeFeature(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void setTriggerMode(TriggerMode triggerMode) {
        EffectCreatorJniJNI.EventCommand_setTriggerMode__SWIG_1(this.swigCPtr, this, triggerMode.swigValue());
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public EventCommand(long j, boolean z) {
        super(EffectCreatorJniJNI.EventCommand_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void exchangeFeature(Feature feature, Feature feature2) {
        EffectCreatorJniJNI.EventCommand_exchangeFeature(this.swigCPtr, this, Feature.getCPtr(feature), feature, Feature.getCPtr(feature2), feature2);
    }

    public Error insertCommandUnit(EventCommandUnit eventCommandUnit, EventCommandUnit eventCommandUnit2) {
        return new Error(EffectCreatorJniJNI.EventCommand_insertCommandUnit(this.swigCPtr, this, EventCommandUnit.getCPtr(eventCommandUnit), eventCommandUnit, EventCommandUnit.getCPtr(eventCommandUnit2), eventCommandUnit2), true);
    }

    public Error moveCommandUnit(EventCommandUnit eventCommandUnit, EventCommandUnit eventCommandUnit2) {
        return new Error(EffectCreatorJniJNI.EventCommand_moveCommandUnit(this.swigCPtr, this, EventCommandUnit.getCPtr(eventCommandUnit), eventCommandUnit, EventCommandUnit.getCPtr(eventCommandUnit2), eventCommandUnit2), true);
    }

    public void setTriggerMode(TriggerMode triggerMode, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventCommand_setTriggerMode__SWIG_0(this.swigCPtr, this, triggerMode.swigValue(), changeFrom.swigValue());
    }
}
