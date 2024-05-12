package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class DraftUpgradeManager {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_DraftUpgradeManager(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public EEStdLokiInfoList getRequiredLokInfos() {
        return new EEStdLokiInfoList(EffectCreatorJniJNI.DraftUpgradeManager_getRequiredLokInfos(this.swigCPtr, this), false);
    }

    public boolean isNeedUpgradeAfterStickerLoad() {
        return EffectCreatorJniJNI.DraftUpgradeManager_isNeedUpgradeAfterStickerLoad(this.swigCPtr, this);
    }

    public void updateEditorBuiltinAssetVersion() {
        EffectCreatorJniJNI.DraftUpgradeManager_updateEditorBuiltinAssetVersion(this.swigCPtr, this);
    }

    public Error upgradeAfterStickerLoad() {
        return new Error(EffectCreatorJniJNI.DraftUpgradeManager_upgradeAfterStickerLoad(this.swigCPtr, this), true);
    }

    public Error upgradeBeforeStickerLoad() {
        return new Error(EffectCreatorJniJNI.DraftUpgradeManager_upgradeBeforeStickerLoad(this.swigCPtr, this), true);
    }

    public void finalize() {
        delete();
    }

    public DraftUpgradeManager(Project project) {
        this(EffectCreatorJniJNI.new_DraftUpgradeManager(Project.getCPtr(project), project), true);
    }

    public static long getCPtr(DraftUpgradeManager draftUpgradeManager) {
        if (draftUpgradeManager == null) {
            return 0L;
        }
        return draftUpgradeManager.swigCPtr;
    }

    public boolean checkModuleNeedUpgrade(String str) {
        return EffectCreatorJniJNI.DraftUpgradeManager_checkModuleNeedUpgrade(this.swigCPtr, this, str);
    }

    public void setFeatureOnlineRes(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.DraftUpgradeManager_setFeatureOnlineRes(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DraftUpgradeManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void checkUpdate(String str, String str2, String str3) {
        EffectCreatorJniJNI.DraftUpgradeManager_checkUpdate(this.swigCPtr, this, str, str2, str3);
    }
}
