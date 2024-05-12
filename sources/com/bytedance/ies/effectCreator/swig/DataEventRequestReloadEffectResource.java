package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class DataEventRequestReloadEffectResource extends DataEvent {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.DataEvent
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_DataEventRequestReloadEffectResource(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.DataEvent
    public String getClassName() {
        return EffectCreatorJniJNI.DataEventRequestReloadEffectResource_getClassName(this.swigCPtr, this);
    }

    public String getPath() {
        return EffectCreatorJniJNI.DataEventRequestReloadEffectResource_path_get(this.swigCPtr, this);
    }

    public DataEventRequestReloadEffectResource() {
        this(EffectCreatorJniJNI.new_DataEventRequestReloadEffectResource(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.DataEventRequestReloadEffectResource_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.DataEvent
    public void finalize() {
        delete();
    }

    public static DataEventRequestReloadEffectResource dynamicCast(DataEvent dataEvent) {
        long DataEventRequestReloadEffectResource_dynamicCast__SWIG_0 = EffectCreatorJniJNI.DataEventRequestReloadEffectResource_dynamicCast__SWIG_0(DataEvent.getCPtr(dataEvent), dataEvent);
        if (DataEventRequestReloadEffectResource_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new DataEventRequestReloadEffectResource(DataEventRequestReloadEffectResource_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(DataEventRequestReloadEffectResource dataEventRequestReloadEffectResource) {
        if (dataEventRequestReloadEffectResource == null) {
            return 0L;
        }
        return dataEventRequestReloadEffectResource.swigCPtr;
    }

    public void setPath(String str) {
        EffectCreatorJniJNI.DataEventRequestReloadEffectResource_path_set(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.effectcreator.swig.DataEvent
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public DataEventRequestReloadEffectResource(long j, boolean z) {
        super(EffectCreatorJniJNI.DataEventRequestReloadEffectResource_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
