package X;

import com.bytedance.ies.nle.editor_jni.NLERenderAction;
import com.bytedance.ies.nle.editor_jni.NLEVEOperationResType;

/* renamed from: X.5OH, reason: invalid class name */
/* loaded from: classes3.dex */
public /* synthetic */ class C5OH {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[NLEVEOperationResType.values().length];
        try {
            iArr[NLEVEOperationResType.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NLEVEOperationResType.EFFECT_AMAZING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NLEVEOperationResType.EFFECT_NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NLEVEOperationResType.EFFECT_COMPOSER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[NLEVEOperationResType.EFFECT_TIME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[NLERenderAction.values().length];
        try {
            iArr2[NLERenderAction.ACTION_INSERT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[NLERenderAction.ACTION_DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[NLERenderAction.ACTION_UPDATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        LIZIZ = iArr2;
    }
}
