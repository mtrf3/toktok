package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EventAction extends Event {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_EventAction(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getAnimation() {
        return EffectCreatorJniJNI.EventAction_getAnimation(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.EventAction_getClassName(this.swigCPtr, this);
    }

    public ActionExtraData getExtraData() {
        return new ActionExtraData(EffectCreatorJniJNI.EventAction_getExtraData(this.swigCPtr, this), false);
    }

    public double getExtraDataTimeInterval() {
        return EffectCreatorJniJNI.EventAction_getExtraDataTimeInterval(this.swigCPtr, this);
    }

    public ActionExtraDataType getExtraDataType() {
        return ActionExtraDataType.swigToEnum(EffectCreatorJniJNI.EventAction_getExtraDataType(this.swigCPtr, this));
    }

    public String getKey() {
        return EffectCreatorJniJNI.EventAction_getKey(this.swigCPtr, this);
    }

    public AnimationPlayMode getPlayMode() {
        return AnimationPlayMode.swigToEnum(EffectCreatorJniJNI.EventAction_getPlayMode(this.swigCPtr, this));
    }

    public ActionType getType() {
        return ActionType.swigToEnum(EffectCreatorJniJNI.EventAction_getType(this.swigCPtr, this));
    }

    public EventAction() {
        this(EffectCreatorJniJNI.new_EventAction__SWIG_1(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.EventAction_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public EventAction(Project project) {
        this(EffectCreatorJniJNI.new_EventAction__SWIG_0(Project.getCPtr(project), project), true);
    }

    public static EventAction dynamicCast(Element element) {
        long EventAction_dynamicCast__SWIG_0 = EffectCreatorJniJNI.EventAction_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (EventAction_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new EventAction(EventAction_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(EventAction eventAction) {
        if (eventAction == null) {
            return 0L;
        }
        return eventAction.swigCPtr;
    }

    public static ActionType typeOfAction(String str) {
        return ActionType.swigToEnum(EffectCreatorJniJNI.EventAction_typeOfAction(str));
    }

    public void setAnimation(String str) {
        EffectCreatorJniJNI.EventAction_setAnimation__SWIG_1(this.swigCPtr, this, str);
    }

    public void setExtraData(ActionExtraData actionExtraData) {
        EffectCreatorJniJNI.EventAction_setExtraData__SWIG_1(this.swigCPtr, this, ActionExtraData.getCPtr(actionExtraData), actionExtraData);
    }

    public Error setExtraDataTimeInterval(double d) {
        return new Error(EffectCreatorJniJNI.EventAction_setExtraDataTimeInterval(this.swigCPtr, this, d), true);
    }

    public Error setKey(String str) {
        return new Error(EffectCreatorJniJNI.EventAction_setKey(this.swigCPtr, this, str), true);
    }

    public void setPlayMode(AnimationPlayMode animationPlayMode) {
        EffectCreatorJniJNI.EventAction_setPlayMode__SWIG_1(this.swigCPtr, this, animationPlayMode.swigValue());
    }

    public void setType(ActionType actionType) {
        EffectCreatorJniJNI.EventAction_setType__SWIG_1(this.swigCPtr, this, actionType.swigValue());
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public EventAction(long j, boolean z) {
        super(EffectCreatorJniJNI.EventAction_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void setAnimation(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventAction_setAnimation__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setExtraData(ActionExtraData actionExtraData, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventAction_setExtraData__SWIG_0(this.swigCPtr, this, ActionExtraData.getCPtr(actionExtraData), actionExtraData, changeFrom.swigValue());
    }

    public void setPlayMode(AnimationPlayMode animationPlayMode, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventAction_setPlayMode__SWIG_0(this.swigCPtr, this, animationPlayMode.swigValue(), changeFrom.swigValue());
    }

    public void setType(ActionType actionType, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventAction_setType__SWIG_0(this.swigCPtr, this, actionType.swigValue(), changeFrom.swigValue());
    }
}
