package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EventTrigger extends Event {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_EventTrigger(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getAction() {
        return EffectCreatorJniJNI.EventTrigger_getAction(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.EventTrigger_getClassName(this.swigCPtr, this);
    }

    public TriggerExtraData getExtraData() {
        return new TriggerExtraData(EffectCreatorJniJNI.EventTrigger_getExtraData(this.swigCPtr, this), false);
    }

    public double getExtraDataDelayTime() {
        return EffectCreatorJniJNI.EventTrigger_getExtraDataDelayTime(this.swigCPtr, this);
    }

    public double getExtraDataFPS() {
        return EffectCreatorJniJNI.EventTrigger_getExtraDataFPS(this.swigCPtr, this);
    }

    public Feature getExtraDataFeature() {
        long EventTrigger_getExtraDataFeature = EffectCreatorJniJNI.EventTrigger_getExtraDataFeature(this.swigCPtr, this);
        if (EventTrigger_getExtraDataFeature == 0) {
            return null;
        }
        return new Feature(EventTrigger_getExtraDataFeature, true);
    }

    public TriggerExtraDataType getExtraDataType() {
        return TriggerExtraDataType.swigToEnum(EffectCreatorJniJNI.EventTrigger_getExtraDataType(this.swigCPtr, this));
    }

    public String getKey() {
        return EffectCreatorJniJNI.EventTrigger_getKey(this.swigCPtr, this);
    }

    public TriggerType getType() {
        return TriggerType.swigToEnum(EffectCreatorJniJNI.EventTrigger_getType(this.swigCPtr, this));
    }

    public EventTrigger() {
        this(EffectCreatorJniJNI.new_EventTrigger__SWIG_1(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.EventTrigger_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public EventTrigger(Project project) {
        this(EffectCreatorJniJNI.new_EventTrigger__SWIG_0(Project.getCPtr(project), project), true);
    }

    public static EventTrigger dynamicCast(Element element) {
        long EventTrigger_dynamicCast__SWIG_0 = EffectCreatorJniJNI.EventTrigger_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (EventTrigger_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new EventTrigger(EventTrigger_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(EventTrigger eventTrigger) {
        if (eventTrigger == null) {
            return 0L;
        }
        return eventTrigger.swigCPtr;
    }

    public static TriggerType typeOfAction(String str) {
        return TriggerType.swigToEnum(EffectCreatorJniJNI.EventTrigger_typeOfAction(str));
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void getUsedAlgorithm(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.EventTrigger_getUsedAlgorithm(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public void setAction(String str) {
        EffectCreatorJniJNI.EventTrigger_setAction__SWIG_1(this.swigCPtr, this, str);
    }

    public void setExtraData(TriggerExtraData triggerExtraData) {
        EffectCreatorJniJNI.EventTrigger_setExtraData__SWIG_1(this.swigCPtr, this, TriggerExtraData.getCPtr(triggerExtraData), triggerExtraData);
    }

    public Error setExtraDataDelayTime(double d) {
        return new Error(EffectCreatorJniJNI.EventTrigger_setExtraDataDelayTime(this.swigCPtr, this, d), true);
    }

    public Error setExtraDataFPS(double d) {
        return new Error(EffectCreatorJniJNI.EventTrigger_setExtraDataFPS(this.swigCPtr, this, d), true);
    }

    public Error setExtraDataFeature(Feature feature) {
        return new Error(EffectCreatorJniJNI.EventTrigger_setExtraDataFeature(this.swigCPtr, this, Feature.getCPtr(feature), feature), true);
    }

    public Error setKey(String str) {
        return new Error(EffectCreatorJniJNI.EventTrigger_setKey(this.swigCPtr, this, str), true);
    }

    public void setType(TriggerType triggerType) {
        EffectCreatorJniJNI.EventTrigger_setType__SWIG_1(this.swigCPtr, this, triggerType.swigValue());
    }

    @Override // com.bytedance.ies.effectcreator.swig.Event, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public EventTrigger(long j, boolean z) {
        super(EffectCreatorJniJNI.EventTrigger_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void setAction(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventTrigger_setAction__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setExtraData(TriggerExtraData triggerExtraData, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventTrigger_setExtraData__SWIG_0(this.swigCPtr, this, TriggerExtraData.getCPtr(triggerExtraData), triggerExtraData, changeFrom.swigValue());
    }

    public void setType(TriggerType triggerType, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.EventTrigger_setType__SWIG_0(this.swigCPtr, this, triggerType.swigValue(), changeFrom.swigValue());
    }

    public void setTypeAndAction(TriggerType triggerType, String str) {
        EffectCreatorJniJNI.EventTrigger_setTypeAndAction(this.swigCPtr, this, triggerType.swigValue(), str);
    }
}
