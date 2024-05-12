package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EventManagerV2 {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EventManagerV2(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void apply() {
        EffectCreatorJniJNI.EventManagerV2_apply(this.swigCPtr, this);
    }

    public EventCommand createCommand() {
        long EventManagerV2_createCommand = EffectCreatorJniJNI.EventManagerV2_createCommand(this.swigCPtr, this);
        if (EventManagerV2_createCommand == 0) {
            return null;
        }
        return new EventCommand(EventManagerV2_createCommand, true);
    }

    public EEStdEventCommandList getCommandList() {
        return new EEStdEventCommandList(EffectCreatorJniJNI.EventManagerV2_getCommandList(this.swigCPtr, this), true);
    }

    public Error init() {
        return new Error(EffectCreatorJniJNI.EventManagerV2_init(this.swigCPtr, this), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EventManagerV2 eventManagerV2) {
        if (eventManagerV2 == null) {
            return 0L;
        }
        return eventManagerV2.swigCPtr;
    }

    public void getUsedAlgorithm(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.EventManagerV2_getUsedAlgorithm(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public Error insertCommandToBottom(EventCommand eventCommand) {
        return new Error(EffectCreatorJniJNI.EventManagerV2_insertCommandToBottom(this.swigCPtr, this, EventCommand.getCPtr(eventCommand), eventCommand), true);
    }

    public Error removeCommand(EventCommand eventCommand) {
        return new Error(EffectCreatorJniJNI.EventManagerV2_removeCommand(this.swigCPtr, this, EventCommand.getCPtr(eventCommand), eventCommand), true);
    }

    public Error removeItemAndDereferenceTrigger(ElementId elementId) {
        return new Error(EffectCreatorJniJNI.EventManagerV2_removeItemAndDereferenceTrigger(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId), true);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public EventManagerV2(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public Error exchangeFeature(Feature feature, Feature feature2) {
        return new Error(EffectCreatorJniJNI.EventManagerV2_exchangeFeature(this.swigCPtr, this, Feature.getCPtr(feature), feature, Feature.getCPtr(feature2), feature2), true);
    }

    public Error insertCommand(EventCommand eventCommand, EventCommand eventCommand2) {
        return new Error(EffectCreatorJniJNI.EventManagerV2_insertCommand(this.swigCPtr, this, EventCommand.getCPtr(eventCommand), eventCommand, EventCommand.getCPtr(eventCommand2), eventCommand2), true);
    }

    public Error moveCommand(EventCommand eventCommand, EventCommand eventCommand2) {
        return new Error(EffectCreatorJniJNI.EventManagerV2_moveCommand(this.swigCPtr, this, EventCommand.getCPtr(eventCommand), eventCommand, EventCommand.getCPtr(eventCommand2), eventCommand2), true);
    }
}
