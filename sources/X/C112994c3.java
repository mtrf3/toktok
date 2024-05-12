package X;

import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;

/* renamed from: X.4c3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public /* synthetic */ class C112994c3 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ActionLinkType.values().length];
        try {
            iArr[ActionLinkType.DEEP_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionLinkType.H5_LINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionLinkType.FOLLOW_USER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ActionLinkType.CALLBACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ActionLinkType.INVALID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ActionLinkType.REFRESH.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
