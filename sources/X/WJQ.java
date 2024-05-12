package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJQ implements InterfaceC81972WFc {
    public final /* synthetic */ C76732zl LIZ;
    public final /* synthetic */ C82622Wbi LIZIZ;
    public final /* synthetic */ C82064WIq LIZJ;

    @Override // X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        return false;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        InterfaceC82199WNv interfaceC82199WNv;
        o.LJIIIZ(view, "view");
        int i = this.LIZ.element;
        if (i == 1 || i == 2) {
            InterfaceC82199WNv interfaceC82199WNv2 = (InterfaceC82199WNv) this.LIZIZ.LJIIIIZZ(null, InterfaceC82199WNv.class);
            if (interfaceC82199WNv2 != null) {
                C82064WIq c82064WIq = this.LIZJ;
                if (!interfaceC82199WNv2.Po0()) {
                    C82200WNw.LIZIZ(interfaceC82199WNv2, null, 3);
                    ShortVideoContext shortVideoContext = c82064WIq.LJ;
                    if (shortVideoContext != null) {
                        C82468WYe.LIZIZ(shortVideoContext);
                        return;
                    } else {
                        o.LJIJI("shortVideoContext");
                        throw null;
                    }
                }
                interfaceC82199WNv2.m5("");
                ShortVideoContext shortVideoContext2 = c82064WIq.LJ;
                if (shortVideoContext2 != null) {
                    C82468WYe.LIZJ(shortVideoContext2, "click_voice_effect_entrance", interfaceC82199WNv2.KK());
                    return;
                } else {
                    o.LJIJI("shortVideoContext");
                    throw null;
                }
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ShortVideoContext shortVideoContext3 = this.LIZJ.LJ;
        if (shortVideoContext3 != null) {
            String musicPath = shortVideoContext3.getMusicPath();
            if (musicPath == null || musicPath.length() <= 0 || (interfaceC82199WNv = (InterfaceC82199WNv) this.LIZIZ.LJIIIIZZ(null, InterfaceC82199WNv.class)) == null) {
                return;
            }
            interfaceC82199WNv.xt0();
            return;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public WJQ(C76732zl c76732zl, C82622Wbi c82622Wbi, C82064WIq c82064WIq) {
        this.LIZ = c76732zl;
        this.LIZIZ = c82622Wbi;
        this.LIZJ = c82064WIq;
    }
}
