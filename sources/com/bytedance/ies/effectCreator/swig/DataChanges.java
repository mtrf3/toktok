package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class DataChanges {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_DataChanges(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void clear() {
        EffectCreatorJniJNI.DataChanges_clear(this.swigCPtr, this);
    }

    public EEStdElementSet getAdded() {
        long DataChanges_added_get = EffectCreatorJniJNI.DataChanges_added_get(this.swigCPtr, this);
        if (DataChanges_added_get == 0) {
            return null;
        }
        return new EEStdElementSet(DataChanges_added_get, false);
    }

    public EEStdStringMap getModified() {
        long DataChanges_modified_get = EffectCreatorJniJNI.DataChanges_modified_get(this.swigCPtr, this);
        if (DataChanges_modified_get == 0) {
            return null;
        }
        return new EEStdStringMap(DataChanges_modified_get, false);
    }

    public EEStdElementSet getRemoved() {
        long DataChanges_removed_get = EffectCreatorJniJNI.DataChanges_removed_get(this.swigCPtr, this);
        if (DataChanges_removed_get == 0) {
            return null;
        }
        return new EEStdElementSet(DataChanges_removed_get, false);
    }

    public boolean hasChanges() {
        return EffectCreatorJniJNI.DataChanges_hasChanges(this.swigCPtr, this);
    }

    public DataChanges() {
        this(EffectCreatorJniJNI.new_DataChanges(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DataChanges dataChanges) {
        if (dataChanges == null) {
            return 0L;
        }
        return dataChanges.swigCPtr;
    }

    public void setAdded(EEStdElementSet eEStdElementSet) {
        EffectCreatorJniJNI.DataChanges_added_set(this.swigCPtr, this, EEStdElementSet.getCPtr(eEStdElementSet), eEStdElementSet);
    }

    public void setModified(EEStdStringMap eEStdStringMap) {
        EffectCreatorJniJNI.DataChanges_modified_set(this.swigCPtr, this, EEStdStringMap.getCPtr(eEStdStringMap), eEStdStringMap);
    }

    public void setRemoved(EEStdElementSet eEStdElementSet) {
        EffectCreatorJniJNI.DataChanges_removed_set(this.swigCPtr, this, EEStdElementSet.getCPtr(eEStdElementSet), eEStdElementSet);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DataChanges(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
