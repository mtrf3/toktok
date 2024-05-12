package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class LokiInfo {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_LokiInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getCategory() {
        return EffectCreatorJniJNI.LokiInfo_category_get(this.swigCPtr, this);
    }

    public String getIdentify() {
        return EffectCreatorJniJNI.LokiInfo_identify_get(this.swigCPtr, this);
    }

    public boolean getNeedDownload() {
        return EffectCreatorJniJNI.LokiInfo_needDownload_get(this.swigCPtr, this);
    }

    public String getPanelName() {
        return EffectCreatorJniJNI.LokiInfo_panelName_get(this.swigCPtr, this);
    }

    public LokiInfo() {
        this(EffectCreatorJniJNI.new_LokiInfo(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(LokiInfo lokiInfo) {
        if (lokiInfo == null) {
            return 0L;
        }
        return lokiInfo.swigCPtr;
    }

    public void setCategory(String str) {
        EffectCreatorJniJNI.LokiInfo_category_set(this.swigCPtr, this, str);
    }

    public void setIdentify(String str) {
        EffectCreatorJniJNI.LokiInfo_identify_set(this.swigCPtr, this, str);
    }

    public void setNeedDownload(boolean z) {
        EffectCreatorJniJNI.LokiInfo_needDownload_set(this.swigCPtr, this, z);
    }

    public void setPanelName(String str) {
        EffectCreatorJniJNI.LokiInfo_panelName_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public LokiInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
