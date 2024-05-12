package X;

import com.bytedance.ies.effecteditor.swig.EffectEditorJniJNI;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAsset;
import com.bytedance.ies.effecteditor.swig.UIAnnotationBase;
import com.bytedance.ies.effecteditor.swig.UIAnnotationCache;
import com.bytedance.ies.effecteditor.swig.UIAnnotationCategory;
import com.bytedance.ies.effecteditor.swig.UIAnnotationCategoryPtrVector;
import com.bytedance.ies.effecteditor.swig.UIAnnotationError;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationOptionList;
import com.bytedance.ies.effecteditor.swig.UIAnnotationParser;
import com.bytedance.ies.effecteditor.swig.UIAnnotationSlider;
import com.bytedance.ies.effecteditor.swig.UIAnnotationTextInput;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes16.dex */
public final class XN6 {
    public final UIAnnotationParser LIZ;
    public String LIZIZ;
    public String LIZJ;
    public XN9<?, ?>[] LIZLLL;
    public C78832Uwm[] LJ;
    public java.util.Map<String, C78832Uwm> LJFF;

    public final String[] LIZJ() {
        String[] strArr;
        synchronized (this) {
            strArr = new String[this.LIZ.getTags().size()];
            this.LIZ.getTags().toArray(strArr);
        }
        return strArr;
    }

    static {
        synchronized (XN6.class) {
            X7S.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Asset, new XN7() { // from class: X.XN8
                @Override // X.XN7
                public final XN9 LIZ(UIAnnotationBase uIAnnotationBase, XN6 xn6) {
                    return new XNE(UIAnnotationAsset.dynamicCast(uIAnnotationBase), xn6);
                }
            });
            EffectEditorJniJNI.UIAnnotationAsset_injectUIAnnotation();
            X7S.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Slider, new XN7() { // from class: X.XNB
                @Override // X.XN7
                public final XN9 LIZ(UIAnnotationBase uIAnnotationBase, XN6 xn6) {
                    return new XNH(UIAnnotationSlider.dynamicCast(uIAnnotationBase), xn6);
                }
            });
            EffectEditorJniJNI.UIAnnotationSlider_injectUIAnnotation();
            X7S.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_TextInput, new XN7() { // from class: X.XND
                @Override // X.XN7
                public final XN9 LIZ(UIAnnotationBase uIAnnotationBase, XN6 xn6) {
                    return new XNI(UIAnnotationTextInput.dynamicCast(uIAnnotationBase), xn6);
                }
            });
            EffectEditorJniJNI.UIAnnotationTextInput_injectUIAnnotation();
            X7S.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_OptionList, new XN7() { // from class: X.XNC
                @Override // X.XN7
                public final XN9 LIZ(UIAnnotationBase uIAnnotationBase, XN6 xn6) {
                    return new XNG(UIAnnotationOptionList.dynamicCast(uIAnnotationBase), xn6);
                }
            });
            EffectEditorJniJNI.UIAnnotationOptionList_injectUIAnnotation();
            X7S.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Cache, new XN7() { // from class: X.XNA
                @Override // X.XN7
                public final XN9 LIZ(UIAnnotationBase uIAnnotationBase, XN6 xn6) {
                    return new XNF(UIAnnotationCache.dynamicCast(uIAnnotationBase), xn6);
                }
            });
            EffectEditorJniJNI.UIAnnotationCache_injectUIAnnotation();
        }
    }

    public final void LIZ() {
        synchronized (this) {
            this.LIZ.addTag("tt-child-effect");
        }
    }

    public final UIAnnotationErrorCode LIZLLL() {
        if (!this.LIZ.getStickerPathChanged()) {
            return UIAnnotationErrorCode.UIAnnotationErrorCode_None;
        }
        synchronized (this) {
            if (!this.LIZ.getStickerPathChanged()) {
                return UIAnnotationErrorCode.UIAnnotationErrorCode_None;
            }
            UIAnnotationError uIAnnotationError = new UIAnnotationError();
            this.LIZLLL = LJ(uIAnnotationError);
            return uIAnnotationError.getErrorCode();
        }
    }

    public XN6() {
        this.LIZ = new UIAnnotationParser();
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }

    public final XN9<?, ?>[] LIZIZ(UIAnnotationUIType uIAnnotationUIType) {
        UIAnnotationUIType uIAnnotationUIType2;
        XN9<?, ?>[] xn9Arr = this.LIZLLL;
        if (xn9Arr == null || xn9Arr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.LIZLLL.length);
        for (XN9<?, ?> xn9 : this.LIZLLL) {
            U u = xn9.LIZJ;
            if (u != 0) {
                uIAnnotationUIType2 = u.getUIType();
            } else {
                uIAnnotationUIType2 = UIAnnotationUIType.UIAnnotationUIType_Unknown;
            }
            if (uIAnnotationUIType2 == uIAnnotationUIType) {
                arrayList.add(xn9);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        XN9<?, ?>[] xn9Arr2 = new XN9[arrayList.size()];
        arrayList.toArray(xn9Arr2);
        return xn9Arr2;
    }

    public final XN9<?, ?>[] LJ(UIAnnotationError uIAnnotationError) {
        XN7 xn7;
        XN9<?, ?> LIZ;
        this.LJ = null;
        this.LJFF = null;
        int size = this.LIZ.getUIAnnotationVector(uIAnnotationError).size();
        UIAnnotationBase[] uIAnnotationBaseArr = new UIAnnotationBase[size];
        this.LIZ.getUIAnnotationVector(uIAnnotationError).toArray(uIAnnotationBaseArr);
        if (uIAnnotationError.getErrorCode() != UIAnnotationErrorCode.UIAnnotationErrorCode_None || size <= 0) {
            return null;
        }
        UIAnnotationCategoryPtrVector uIAnnotationCategoryVector = this.LIZ.getUIAnnotationCategoryVector();
        int i = 0;
        if (uIAnnotationCategoryVector.size() > 0) {
            this.LJ = new C78832Uwm[uIAnnotationCategoryVector.size()];
            this.LJFF = new HashMap();
            for (int i2 = 0; i2 < uIAnnotationCategoryVector.size(); i2++) {
                UIAnnotationCategory uIAnnotationCategory = uIAnnotationCategoryVector.get(i2);
                String name = uIAnnotationCategory.getName();
                uIAnnotationCategory.getIconPath();
                C78832Uwm c78832Uwm = new C78832Uwm(name);
                this.LJ[i2] = c78832Uwm;
                ((HashMap) this.LJFF).put(name, c78832Uwm);
            }
        }
        ArrayList arrayList = new ArrayList(size);
        do {
            UIAnnotationBase uIAnnotationBase = uIAnnotationBaseArr[i];
            if (uIAnnotationBase != null) {
                UIAnnotationUIType uIType = uIAnnotationBase.getUIType();
                if (((HashMap) X7S.LIZ().LIZ).containsKey(uIType) && (xn7 = (XN7) ((HashMap) X7S.LIZ().LIZ).get(uIType)) != null && (LIZ = xn7.LIZ(uIAnnotationBase, this)) != null) {
                    if (LIZ instanceof XNE) {
                        XNE xne = (XNE) LIZ;
                        String str = this.LIZJ;
                        synchronized (xne) {
                            if (str == null) {
                                str = "";
                            }
                            xne.LIZLLL = str;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Assets_");
                            LIZ2.append(UUID.randomUUID().toString());
                            xne.LJFF = X1D.LIZIZ(LIZ2);
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(xne.LIZLLL);
                            String str2 = C38977FRl.LIZ;
                            LIZ3.append(str2);
                            LIZ3.append(EffectEditorJniJNI.kUIAnnotationAssetFirstPathInSticker());
                            LIZ3.append(str2);
                            LIZ3.append(xne.LJFF);
                            String LIZIZ = X1D.LIZIZ(LIZ3);
                            xne.LJ = LIZIZ;
                            C38977FRl.LIZIZ(LIZIZ);
                        }
                    }
                    arrayList.add(LIZ);
                }
            }
            i++;
        } while (i < size);
        if (arrayList.size() <= 0) {
            return null;
        }
        XN9<?, ?>[] xn9Arr = new XN9[arrayList.size()];
        arrayList.toArray(xn9Arr);
        return xn9Arr;
    }

    public final void LJFF(String str) {
        if (str == null) {
            return;
        }
        synchronized (this) {
            this.LIZ.removeTag(str);
        }
    }

    public final void LJI(String str) {
        String str2 = this.LIZIZ;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        synchronized (this) {
            this.LIZIZ = str;
            UIAnnotationParser uIAnnotationParser = this.LIZ;
            if (str == null) {
                str = "";
            }
            uIAnnotationParser.setLocalePath(str);
        }
    }

    public XN6(String str, String str2) {
        this();
        String str3 = this.LIZJ;
        if (str3 != null ? !str3.equals(str) : str != null) {
            synchronized (this) {
                this.LIZJ = str;
                this.LIZ.setStickerPath(str == null ? "" : str);
            }
        }
        LJI(str2);
    }
}
