package X;

import com.ss.android.ugc.aweme.share.base.model.ShareContentType;

/* renamed from: X.OdI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public /* synthetic */ class C62336OdI {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ShareContentType.values().length];
        try {
            iArr[ShareContentType.LINK_PLUS_PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShareContentType.LINK_PLUS_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ShareContentType.PHOTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ShareContentType.VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ShareContentType.LINK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
