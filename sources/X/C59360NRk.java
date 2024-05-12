package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import ujb.o;

/* renamed from: X.NRk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59360NRk implements InterfaceC59366NRq<NSN> {
    public static final NSS LJLJJLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final NSN LJLIL;
    public final OF1 LJLILLLLZI = C1DF.LJJIFFI(this, C59371NRv.LJLIL);
    public final View LJLJI;
    public final TuxTextView LJLJJI;
    public final C62846OlW LJLJJL;

    static {
        TBT tbt = new TBT(C59360NRk.class, "container", "getContainer()Landroid/view/ViewGroup;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt};
        LJLJJLL = new NSS();
    }

    public final ViewGroup LIZ() {
        return (ViewGroup) this.LJLILLLLZI.LIZ(this, LJLJL[0]);
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
        int i;
        this.LJLJJI.setText(this.LJLIL.LIZIZ());
        View view = this.LJLJI;
        GradientDrawable gradientDrawable = new GradientDrawable();
        LJLJJLL.getClass();
        if (L2J.LIZ()) {
            i = 6;
        } else {
            i = 2;
        }
        gradientDrawable.setCornerRadius(C32151Nz.LJIIZILJ(Integer.valueOf(i)));
        gradientDrawable.setShape(0);
        view.setBackground(gradientDrawable);
        String LIZ = this.LJLIL.LIZ();
        if (LIZ != null && LIZ.length() > 0) {
            if (o.LJJJJ(LIZ, ".webp", false)) {
                C78765Uvh.LIZJ(this.LJLJJL, this.LJLIL.LIZ(), -1, -1, false);
            } else {
                C78765Uvh.LJIIIZ(this.LJLJJL, this.LJLIL.LIZ(), -1, -1);
            }
            this.LJLJJL.setVisibility(0);
            return;
        }
        this.LJLJJL.setVisibility(8);
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    public C59360NRk(NSN nsn) {
        this.LJLIL = nsn;
        if (LIZ().findViewById(R.id.bmw) == null) {
            LIZ().addView(C16880lQ.LLLLIILL(C16880lQ.LLZIL(LIZ().getContext()), R.layout.y2, LIZ(), false));
        }
        View findViewById = LIZ().findViewById(R.id.bmw);
        kotlin.jvm.internal.o.LJIIIIZZ(findViewById, "container.findViewById(R…ommerce_button_container)");
        this.LJLJI = findViewById;
        View findViewById2 = LIZ().findViewById(R.id.bmy);
        kotlin.jvm.internal.o.LJIIIIZZ(findViewById2, "container.findViewById(R…ommerce_button_text_view)");
        this.LJLJJI = (TuxTextView) findViewById2;
        View findViewById3 = LIZ().findViewById(R.id.bmx);
        kotlin.jvm.internal.o.LJIIIIZZ(findViewById3, "container.findViewById(R…ommerce_button_icon_view)");
        this.LJLJJL = (C62846OlW) findViewById3;
    }

    @Override // X.InterfaceC59366NRq
    public final void LJJLIIIIJ(int i) {
        GradientDrawable gradientDrawable;
        View view = this.LJLJI;
        Drawable background = view.getBackground();
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setColor(i);
        }
        view.setBackground(view.getBackground());
    }

    @Override // X.InterfaceC59366NRq
    public final void LLZZZIL(int i) {
        C59363NRn.LIZ(this, i);
    }

    @Override // X.InterfaceC59366NRq
    public final void qM(int i) {
        C59363NRn.LIZIZ(this, i);
    }

    @Override // X.InterfaceC59366NRq
    public final void setVisibility(int i) {
        C59363NRn.LIZJ(this, i);
    }

    @Override // X.InterfaceC59366NRq
    public final void ur0(float f) {
        ((NSG) L9()).getContainer().setRotation(f);
    }
}
