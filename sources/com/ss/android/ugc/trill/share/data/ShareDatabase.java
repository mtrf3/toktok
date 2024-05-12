package com.ss.android.ugc.trill.share.data;

import X.AbstractC03300Ba;
import X.C0BV;
import X.C0BW;
import X.C16880lQ;
import X.C68892R2a;
import X.C68893R2b;
import X.InterfaceC62452OfA;
import android.content.Context;

/* loaded from: classes12.dex */
public abstract class ShareDatabase extends AbstractC03300Ba {
    public static volatile ShareDatabase LJIIL;
    public static final C68892R2a LJIILIIL = new C68892R2a();
    public static final C68893R2b LJIILJJIL = new C68893R2b();

    public abstract InterfaceC62452OfA LJIJI();

    public static ShareDatabase LJIJ(Context context) {
        if (LJIIL == null) {
            synchronized (ShareDatabase.class) {
                try {
                    if (LJIIL == null) {
                        C0BW LIZ = C0BV.LIZ(C16880lQ.LLLLL(context), ShareDatabase.class, "share.db");
                        LIZ.LIZ(LJIILIIL, LJIILJJIL);
                        LIZ.LJII = true;
                        LJIIL = (ShareDatabase) LIZ.LIZIZ();
                    }
                } finally {
                }
            }
        }
        return LJIIL;
    }
}
