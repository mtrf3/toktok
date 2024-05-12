package X;

import Y.ACallableS105S0100000_2;
import Y.ACallableS80S0200000_2;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.IDqS184S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.5zH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152875zH {
    public final C133765Mu LIZ(String str) {
        return new C133765Mu(str, null, null, null, 62);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.5zP] */
    public final C152955zP LIZJ(VideoPublishEditModel videoPublishEditModel) {
        final C152935zN c152935zN;
        if (!C5OG.LIZ()) {
            C10K LIZIZ = C10K.LIZIZ(new ACallableS105S0100000_2(videoPublishEditModel, 29), ExecutorC149205tM.LJLILLLLZI, null);
            try {
                LIZIZ.LJIJI();
            } catch (InterruptedException e) {
                H78.LJ(e);
            }
            if (!LIZIZ.LJIILJJIL()) {
                c152935zN = (C152935zN) LIZIZ.LJIIJJI();
            } else {
                throw new RuntimeException("publish create image presenter failed", LIZIZ.LJIIJ());
            }
        } else {
            c152935zN = new C152935zN(videoPublishEditModel);
        }
        return new InterfaceC43346Gzm() { // from class: X.5zP
            @Override // X.InterfaceC43346Gzm
            public final boolean LIZ() {
                return C152935zN.this.LIZLLL();
            }

            @Override // X.InterfaceC43346Gzm
            public final void cancel() {
                C152935zN.this.LIZ();
            }

            @Override // X.InterfaceC43346Gzm
            public final void pause() {
                Iterator it = ((ArrayList) C152935zN.this.LIZLLL).iterator();
                while (it.hasNext()) {
                    ((RunnableC151315wl) it.next()).LJLJLLL = true;
                }
            }

            @Override // X.InterfaceC43346Gzm
            public final void resume() {
                Iterator it = ((ArrayList) C152935zN.this.LIZLLL).iterator();
                while (it.hasNext()) {
                    RunnableC151315wl runnableC151315wl = (RunnableC151315wl) it.next();
                    runnableC151315wl.LJLJLLL = false;
                    runnableC151315wl.LJLLI.unlock();
                }
            }

            @Override // X.InterfaceC43346Gzm
            public final void LIZIZ(VideoPublishEditModel videoPublishEditModel2, C43345Gzl c43345Gzl, IDqS184S0200000_7 iDqS184S0200000_7, AqS173S0100000_7 aqS173S0100000_7) {
                C152935zN.this.LJ(videoPublishEditModel2, c43345Gzl, iDqS184S0200000_7, aqS173S0100000_7);
            }
        };
    }

    public static final InterfaceC153045zY LIZIZ(VideoPublishEditModel editModel, InterfaceC88472Yns<? super C76940UHo, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(editModel, "editModel");
        C76940UHo c76940UHo = new C76940UHo();
        interfaceC88472Yns.invoke(c76940UHo);
        InterfaceC153045zY interfaceC153045zY = null;
        C10K LIZIZ = C10K.LIZIZ(new ACallableS80S0200000_2(editModel, c76940UHo, 7), ExecutorC149205tM.LJLILLLLZI, null);
        o.LJIIIIZZ(LIZIZ, "editModel: VideoPublishE…NSTANCE\n                )");
        try {
            LIZIZ.LJIJI();
        } catch (InterruptedException unused) {
        }
        C138635cJ c138635cJ = (C138635cJ) LIZIZ.LJIIJJI();
        if (c138635cJ != null) {
            interfaceC153045zY = c138635cJ.LJIIIZ;
        }
        if (!LIZIZ.LJIILJJIL() && interfaceC153045zY != null) {
            return interfaceC153045zY;
        }
        throw new RuntimeException("publish create VEEditor failed", LIZIZ.LJIIJ());
    }
}
