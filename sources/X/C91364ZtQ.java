package X;

import com.ss.android.ugc.aweme.dsp.common.model.MusicPlayInfo;

/* renamed from: X.ZtQ, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91364ZtQ implements InterfaceC47122IeU {
    public final /* synthetic */ InterfaceC88472Yns<C47121IeT, C76800UCe> LIZ;
    public final /* synthetic */ MusicPlayInfo LIZIZ;

    public C91364ZtQ(MusicPlayInfo musicPlayInfo, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = musicPlayInfo;
    }

    @Override // X.InterfaceC47122IeU
    public final void LIZ(C47121IeT c47121IeT) {
        Long l;
        Long l2;
        InterfaceC88472Yns<C47121IeT, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c47121IeT);
        }
        int i = c47121IeT.LIZ;
        if (i != 2) {
            if (i != 3) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Preload failed associated with special key(");
            LIZ.append(this.LIZIZ.getMediaId());
            LIZ.append("),cost:");
            LIZ.append(System.currentTimeMillis() - C91150Zpy.LIZ);
            LIZ.append("ms");
            X1D.LIZIZ(LIZ);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("preload success, mediaId(");
        LIZ2.append(this.LIZIZ.getMediaId());
        LIZ2.append("), preloadSize(");
        C47106IeE c47106IeE = c47121IeT.LIZIZ;
        String str = null;
        if (c47106IeE != null) {
            l = Long.valueOf(c47106IeE.LJ);
        } else {
            l = null;
        }
        LIZ2.append(C91149Zpx.LIZJ(l));
        LIZ2.append("), mediaSize(");
        C47106IeE c47106IeE2 = c47121IeT.LIZIZ;
        if (c47106IeE2 != null) {
            l2 = Long.valueOf(c47106IeE2.LIZLLL);
        } else {
            l2 = null;
        }
        LIZ2.append(C91149Zpx.LIZJ(l2));
        LIZ2.append("), path(");
        C47106IeE c47106IeE3 = c47121IeT.LIZIZ;
        if (c47106IeE3 != null) {
            str = c47106IeE3.LIZJ;
        }
        LIZ2.append(str);
        LIZ2.append("),cost:");
        LIZ2.append(System.currentTimeMillis() - C91150Zpy.LIZ);
        LIZ2.append("ms");
        X1D.LIZIZ(LIZ2);
    }
}
