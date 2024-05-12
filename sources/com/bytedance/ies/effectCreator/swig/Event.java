package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class Event extends Element {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_Event(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.Event_getClassName(this.swigCPtr, this);
    }

    public Event() {
        this(EffectCreatorJniJNI.new_Event__SWIG_1(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.Event_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public Event(Project project) {
        this(EffectCreatorJniJNI.new_Event__SWIG_0(Project.getCPtr(project), project), true);
    }

    public static ActionType actionTypeFromString(String str) {
        return ActionType.swigToEnum(EffectCreatorJniJNI.Event_actionTypeFromString(str));
    }

    public static AnimationPlayMode animationPlayModeFromString(String str) {
        return AnimationPlayMode.swigToEnum(EffectCreatorJniJNI.Event_animationPlayModeFromString(str));
    }

    public static Event dynamicCast(Element element) {
        long Event_dynamicCast__SWIG_0 = EffectCreatorJniJNI.Event_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (Event_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new Event(Event_dynamicCast__SWIG_0, true);
    }

    public static EventMode eventModeFromString(String str) {
        return EventMode.swigToEnum(EffectCreatorJniJNI.Event_eventModeFromString(str));
    }

    public static long getCPtr(Event event) {
        if (event == null) {
            return 0L;
        }
        return event.swigCPtr;
    }

    public static SequenceMode sequenceModeFromString(String str) {
        return SequenceMode.swigToEnum(EffectCreatorJniJNI.Event_sequenceModeFromString(str));
    }

    public static String stringFromActionType(ActionType actionType) {
        return EffectCreatorJniJNI.Event_stringFromActionType(actionType.swigValue());
    }

    public static String stringFromAnimationPlayMode(AnimationPlayMode animationPlayMode) {
        return EffectCreatorJniJNI.Event_stringFromAnimationPlayMode(animationPlayMode.swigValue());
    }

    public static String stringFromEventMode(EventMode eventMode) {
        return EffectCreatorJniJNI.Event_stringFromEventMode(eventMode.swigValue());
    }

    public static String stringFromSequenceMode(SequenceMode sequenceMode) {
        return EffectCreatorJniJNI.Event_stringFromSequenceMode(sequenceMode.swigValue());
    }

    public static String stringFromTriggerMode(TriggerMode triggerMode) {
        return EffectCreatorJniJNI.Event_stringFromTriggerMode(triggerMode.swigValue());
    }

    public static String stringFromTriggerType(TriggerType triggerType) {
        return EffectCreatorJniJNI.Event_stringFromTriggerType(triggerType.swigValue());
    }

    public static TriggerMode triggerModeFromString(String str) {
        return TriggerMode.swigToEnum(EffectCreatorJniJNI.Event_triggerModeFromString(str));
    }

    public static TriggerType triggerTypeFromString(String str) {
        return TriggerType.swigToEnum(EffectCreatorJniJNI.Event_triggerTypeFromString(str));
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public Event(long j, boolean z) {
        super(EffectCreatorJniJNI.Event_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
