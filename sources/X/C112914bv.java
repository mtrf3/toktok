package X;

import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;

/* renamed from: X.4bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public /* synthetic */ class C112914bv {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[IconTypeComponent.values().length];
        try {
            iArr[IconTypeComponent.MODERATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IconTypeComponent.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IconTypeComponent.RESTRICTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[IconTypeComponent.ABNORMAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[IconTypeComponent.SERVER_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[IconTypeComponent.DEFAULT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
