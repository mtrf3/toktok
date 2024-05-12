package X;

import android.view.KeyEvent;
import android.widget.ImageView;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class W54 implements Runnable {
    public final /* synthetic */ W5E LJLIL;
    public final /* synthetic */ W5D LJLILLLLZI;
    public final /* synthetic */ InterfaceC81252Vui LJLJI;
    public final /* synthetic */ W5O[] LJLJJI;
    public final /* synthetic */ C81250Vug LJLJJL;
    public final /* synthetic */ ImageView LJLJJLL;

    public final void LIZ() {
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIJ = this.LJLIL.LIZLLL;
        LIZJ.LJII = this.LJLILLLLZI;
        LIZJ.LJIIL = this.LJLJI;
        boolean z = true;
        LIZJ.LJFF(true, this.LJLJJI);
        LIZJ.LJIIJJI = false;
        this.LJLIL.getClass();
        if (this.LJLIL.LJJIZ == null) {
            z = false;
        }
        LIZJ.LJIIIZ = z;
        W4R LIZ = LIZJ.LIZ();
        this.LJLILLLLZI.LJIIIIZZ = LIZ;
        LIZ.LIZLLL(new W53(this.LJLIL));
        C81250Vug c81250Vug = this.LJLJJL;
        if (c81250Vug == null) {
            this.LJLJJLL.getContext();
            C81250Vug c81250Vug2 = new C81250Vug(null);
            C79083V1z.LJFF(this.LJLIL.hashCode(), "FrescoBareImageLoader", "into", "draweeHolder create");
            W55 w55 = new W55(c81250Vug2);
            c81250Vug2.LJIIIIZZ(W5R.LIZ(this.LJLJJLL, this.LJLIL));
            c81250Vug2.LJII(LIZ);
            KeyEvent.Callback callback = this.LJLJJLL;
            if (callback instanceof W56) {
                ((W56) callback).LIZ();
            }
            if (this.LJLJJLL.isAttachedToWindow()) {
                w55.onViewAttachedToWindow(this.LJLJJLL);
            }
            this.LJLJJLL.addOnAttachStateChangeListener(w55);
            this.LJLJJLL.setOnTouchListener(w55);
            ImageView imageView = this.LJLJJLL;
            if (imageView != null) {
                Object tag = imageView.getTag();
                if (tag instanceof C78755UvX) {
                    ((HashMap) tag).put("DraweeHolder", c81250Vug2);
                } else {
                    imageView.setTag(new C78755UvX(c81250Vug2));
                }
            }
            this.LJLJJLL.setImageDrawable(c81250Vug2.LIZJ());
            return;
        }
        c81250Vug.LJFF();
        this.LJLJJL.LJIIIIZZ(W5R.LIZ(this.LJLJJLL, this.LJLIL));
        this.LJLJJL.LJII(LIZ);
        this.LJLJJL.LJ();
        this.LJLJJLL.setImageDrawable(this.LJLJJL.LIZJ());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public W54(ImageView imageView, W5E w5e, W5D w5d, InterfaceC81252Vui interfaceC81252Vui, C81250Vug c81250Vug, W5O[] w5oArr) {
        this.LJLIL = w5e;
        this.LJLILLLLZI = w5d;
        this.LJLJI = interfaceC81252Vui;
        this.LJLJJI = w5oArr;
        this.LJLJJL = c81250Vug;
        this.LJLJJLL = imageView;
    }
}
