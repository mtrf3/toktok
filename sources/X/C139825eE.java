package X;

import android.content.Context;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5eE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139825eE extends AbstractC82681Wcf<C139825eE> {
    public CharSequence LIZJ;
    public InterfaceC88472Yns<? super ImageView, C76800UCe> LIZLLL;

    @Override // X.AbstractC82681Wcf
    public final InterfaceC82683Wch LIZJ() {
        C5ZB c5zb = new C5ZB(this.LIZIZ);
        c5zb.LIZ(this.LIZJ);
        ImageView imageView = (ImageView) c5zb.LJLIL.findViewById(R.id.egd);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = 0;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
        c2068389v.LJ = 0;
        Context context = c5zb.getContext();
        o.LJIIIIZZ(context, "context");
        imageView.setImageDrawable(c2068389v.LIZ(context));
        ((ImageView) c5zb.LJLIL.findViewById(R.id.egd)).setVisibility(8);
        c5zb.setCustomImage(this.LIZLLL);
        LIZLLL(c5zb);
        return super.LIZJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C139825eE(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LIZJ = "";
        Integer LJII = C79045V0n.LJII(context, new int[]{R.attr.tf, R.attr.tg, R.attr.th, R.attr.ti, R.attr.tj, R.attr.tk, R.attr.tl, R.attr.tm, R.attr.tn, R.attr.to}, 6);
        if (LJII != null) {
            LJIIIIZZ(LJII.intValue());
        }
    }

    public final void LJIIJJI(int i) {
        String string = this.LIZIZ.getString(i);
        o.LJIIIIZZ(string, "context.getString(res)");
        this.LIZJ = string;
    }

    public final void LJIIL(CharSequence message) {
        o.LJIIIZ(message, "message");
        this.LIZJ = message;
    }
}
