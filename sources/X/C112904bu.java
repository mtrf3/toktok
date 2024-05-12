package X;

import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;

/* renamed from: X.4bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public /* synthetic */ class C112904bu {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC112954bz.values().length];
        try {
            iArr[EnumC112954bz.NO_MASK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC112954bz.SAFETY_MASK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC112954bz.NUDE_MASK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[IconTypeComponent.values().length];
        try {
            iArr2[IconTypeComponent.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[IconTypeComponent.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[IconTypeComponent.SERVER_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[IconTypeComponent.ABNORMAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[IconTypeComponent.MODERATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[IconTypeComponent.RESTRICTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        LIZIZ = iArr2;
    }
}
