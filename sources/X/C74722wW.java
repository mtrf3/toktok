package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi;

/* renamed from: X.2wW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74722wW {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C30M.LJLIL);
    public static final String LIZIZ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZIZ = JBR.LJFF(LIZ2, EF7.LJI.LIZ, "/tiktok/v1/", LIZ2);
    }

    public static final StickerStoreApi LIZ() {
        return (StickerStoreApi) LIZ.getValue();
    }
}
