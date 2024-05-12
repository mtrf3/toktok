package X;

import com.bytedance.ttnet.TTNetInit;

/* renamed from: X.PbB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64753PbB extends C64779Pbb {
    public static final InterfaceC64790Pbm LIZ() {
        C64693PaD LJIILIIL = C64693PaD.LJIILIIL(TTNetInit.getTTNetDepend().getContext());
        if (C64730Pao.LIZJ == null) {
            synchronized (C64730Pao.class) {
                if (C64730Pao.LIZJ == null) {
                    C64730Pao.LIZJ = new C64730Pao(LJIILIIL);
                }
            }
        }
        return C64730Pao.LIZJ;
    }
}
