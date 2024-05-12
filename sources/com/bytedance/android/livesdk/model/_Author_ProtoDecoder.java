package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _Author_ProtoDecoder implements InterfaceC31105CIr<Author> {
    public static Author LIZIZ(Q9H q9h) {
        Author author = new Author();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 6) {
                            Q9J.LIZJ(q9h);
                        } else {
                            author.videoTotalFavoriteCount = q9h.LJIIJJI();
                        }
                    } else {
                        author.videoTotalPlayCount = q9h.LJIIJJI();
                    }
                } else {
                    author.videoTotalCount = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return author;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Author LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
