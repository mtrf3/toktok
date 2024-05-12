package X;

import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import o53.IDdS476S0100000_10;

/* renamed from: X.O7t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61397O7t implements InterfaceC81841WAb {
    public final /* synthetic */ IDdS476S0100000_10 LJLIL;

    @Override // X.InterfaceC81841WAb
    public final void LIZIZ(AnimatedDrawable2 animatedDrawable2) {
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
    }

    public C61397O7t(IDdS476S0100000_10 iDdS476S0100000_10) {
        this.LJLIL = iDdS476S0100000_10;
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZ(AnimatedDrawable2 animatedDrawable2) {
        O8N o8n = (O8N) this.LJLIL.l0;
        if (o8n != null) {
            C61389O7l c61389O7l = (C61389O7l) o8n;
            if (c61389O7l.LIZ) {
                return;
            }
            c61389O7l.LIZJ.LJII(1);
            O7W o7w = c61389O7l.LIZJ;
            o7w.LJIIIZ(o7w.LLIFFJFJJ.LJIIIIZZ());
            c61389O7l.LIZ = true;
        }
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        O8N o8n = (O8N) this.LJLIL.l0;
        if (o8n != null) {
            ((C61389O7l) o8n).LIZIZ();
        }
    }
}
