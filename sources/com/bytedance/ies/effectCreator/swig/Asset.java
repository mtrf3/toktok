package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class Asset extends Element {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_Asset(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getAbsoluteAssetPath() {
        return EffectCreatorJniJNI.Asset_getAbsoluteAssetPath(this.swigCPtr, this);
    }

    public String getAbsoluteAssetSubPath() {
        return EffectCreatorJniJNI.Asset_getAbsoluteAssetSubPath(this.swigCPtr, this);
    }

    public String getAbsoluteCoverImgPath() {
        return EffectCreatorJniJNI.Asset_getAbsoluteCoverImgPath(this.swigCPtr, this);
    }

    public String getAssetCoverImgPath() {
        return EffectCreatorJniJNI.Asset_getAssetCoverImgPath(this.swigCPtr, this);
    }

    public EEStdStringList getAssetEffectPaths() {
        return new EEStdStringList(EffectCreatorJniJNI.Asset_getAssetEffectPaths(this.swigCPtr, this), false);
    }

    public String getAssetName() {
        return EffectCreatorJniJNI.Asset_getAssetName(this.swigCPtr, this);
    }

    public String getAssetPath() {
        return EffectCreatorJniJNI.Asset_getAssetPath(this.swigCPtr, this);
    }

    public AssetSource getAssetSource() {
        return new AssetSource(EffectCreatorJniJNI.Asset_getAssetSource(this.swigCPtr, this), true);
    }

    public String getAssetSubPath() {
        return EffectCreatorJniJNI.Asset_getAssetSubPath(this.swigCPtr, this);
    }

    public AssetType getAssetType() {
        return AssetType.swigToEnum(EffectCreatorJniJNI.Asset_getAssetType(this.swigCPtr, this));
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.Asset_getClassName(this.swigCPtr, this);
    }

    public AssetFileType getFileType() {
        return AssetFileType.swigToEnum(EffectCreatorJniJNI.Asset_getFileType(this.swigCPtr, this));
    }

    public String loadAmgResObject() {
        return EffectCreatorJniJNI.Asset_loadAmgResObject(this.swigCPtr, this);
    }

    public Asset() {
        this(EffectCreatorJniJNI.new_Asset__SWIG_0(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.Asset_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public Asset(Project project) {
        this(EffectCreatorJniJNI.new_Asset__SWIG_1(Project.getCPtr(project), project), true);
    }

    public static Asset dynamicCast(Element element) {
        long Asset_dynamicCast__SWIG_0 = EffectCreatorJniJNI.Asset_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (Asset_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new Asset(Asset_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(Asset asset) {
        if (asset == null) {
            return 0L;
        }
        return asset.swigCPtr;
    }

    public void setAssetCoverImgPath(String str) {
        EffectCreatorJniJNI.Asset_setAssetCoverImgPath__SWIG_1(this.swigCPtr, this, str);
    }

    public void setAssetEffectPaths(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.Asset_setAssetEffectPaths__SWIG_1(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public void setAssetName(String str) {
        EffectCreatorJniJNI.Asset_setAssetName__SWIG_1(this.swigCPtr, this, str);
    }

    public void setAssetPath(String str) {
        EffectCreatorJniJNI.Asset_setAssetPath__SWIG_1(this.swigCPtr, this, str);
    }

    public void setAssetSource(AssetSource assetSource) {
        EffectCreatorJniJNI.Asset_setAssetSource__SWIG_1(this.swigCPtr, this, AssetSource.getCPtr(assetSource), assetSource);
    }

    public void setAssetSubPath(String str) {
        EffectCreatorJniJNI.Asset_setAssetSubPath__SWIG_1(this.swigCPtr, this, str);
    }

    public void setAssetType(AssetType assetType) {
        EffectCreatorJniJNI.Asset_setAssetType__SWIG_1(this.swigCPtr, this, assetType.swigValue());
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public Asset(long j, boolean z) {
        super(EffectCreatorJniJNI.Asset_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void setAssetCoverImgPath(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Asset_setAssetCoverImgPath__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setAssetEffectPaths(EEStdStringList eEStdStringList, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Asset_setAssetEffectPaths__SWIG_0(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList, changeFrom.swigValue());
    }

    public void setAssetHash(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Asset_setAssetHash(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setAssetName(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Asset_setAssetName__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setAssetPath(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Asset_setAssetPath__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setAssetSource(AssetSource assetSource, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Asset_setAssetSource__SWIG_0(this.swigCPtr, this, AssetSource.getCPtr(assetSource), assetSource, changeFrom.swigValue());
    }

    public void setAssetSubPath(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Asset_setAssetSubPath__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setAssetType(AssetType assetType, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Asset_setAssetType__SWIG_0(this.swigCPtr, this, assetType.swigValue(), changeFrom.swigValue());
    }
}
