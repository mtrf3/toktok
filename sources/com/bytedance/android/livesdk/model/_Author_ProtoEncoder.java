package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes16.dex */
public final class _Author_ProtoEncoder implements InterfaceC64604PXc<Author> {
    public static int LIZJ(Author author) {
        return C30957CCz.LJIIIZ(6, author.videoTotalFavoriteCount) + C30957CCz.LJIIIZ(2, author.videoTotalPlayCount) + C30957CCz.LJIIIZ(1, author.videoTotalCount);
    }

    public static void LIZIZ(CD6 cd6, Author author) {
        long j = author.videoTotalCount;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        long j2 = author.videoTotalPlayCount;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j2);
        long j3 = author.videoTotalFavoriteCount;
        cd6.LIZLLL(6, 0);
        cd6.LJFF(j3);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, Author author) {
        LIZIZ(cd6, author);
    }
}
