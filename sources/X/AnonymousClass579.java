package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.579, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass579 extends RecyclerView.ViewHolder {
    public final C5CJ LJLIL;
    public final TextView LJLILLLLZI;
    public final ImageView LJLJI;
    public final FrameLayout LJLJJI;
    public final ImageView LJLJJL;
    public final TextView LJLJJLL;
    public final ImageView LJLJL;
    public final C29701Eo LJLJLJ;
    public final C59Z LJLJLLL;

    public AnonymousClass579(ConstraintLayout constraintLayout) {
        super(constraintLayout);
        View findViewById = constraintLayout.findViewById(R.id.iyq);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.resourceItemImage)");
        this.LJLIL = (C5CJ) findViewById;
        View findViewById2 = constraintLayout.findViewById(R.id.iyu);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.resourceItemText)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = constraintLayout.findViewById(R.id.iys);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.resourceItemMask)");
        this.LJLJI = (ImageView) findViewById3;
        View findViewById4 = constraintLayout.findViewById(R.id.iyr);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.resourceItemLoading)");
        FrameLayout frameLayout = (FrameLayout) findViewById4;
        this.LJLJJI = frameLayout;
        View findViewById5 = constraintLayout.findViewById(R.id.iyn);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.resourceItemDownload)");
        this.LJLJJL = (ImageView) findViewById5;
        View findViewById6 = constraintLayout.findViewById(R.id.iyt);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.resourceItemMaskText)");
        this.LJLJJLL = (TextView) findViewById6;
        View findViewById7 = constraintLayout.findViewById(R.id.iyk);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.resourceItemClear)");
        this.LJLJL = (ImageView) findViewById7;
        this.LJLJLJ = (C29701Eo) constraintLayout.findViewById(R.id.iyv);
        C59Z c59z = (C59Z) constraintLayout.findViewById(R.id.bbi);
        this.LJLJLLL = c59z;
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.DEFAULT_EDIT_MODE, Boolean.FALSE)).booleanValue()) {
            frameLayout.setVisibility(8);
            if (c59z != null) {
                c59z.setBgCircleColor(C04330Ez.LIZIZ(c59z.getContext(), R.color.rk));
                c59z.setProgressColor(-1);
                c59z.setMaxProgress(100);
                c59z.setCircleWidth(C134855Qz.LIZ(2.0f));
                c59z.setBgCircleWidth(C134855Qz.LIZ(4.0f));
                return;
            }
            return;
        }
        String str = C1291054w.LIZLLL().LIZLLL.LJ;
        if (str == null) {
            return;
        }
        C04650Gf.LIZJ(C132105Gk.LIZ(), str).LIZIZ(new InterfaceC04760Gq() { // from class: X.57P
            @Override // X.InterfaceC04760Gq
            public final void onResult(Object obj) {
                C0GY c0gy = (C0GY) obj;
                C29701Eo c29701Eo = AnonymousClass579.this.LJLJLJ;
                if (c29701Eo != null) {
                    c29701Eo.setComposition(c0gy);
                }
                C29701Eo c29701Eo2 = AnonymousClass579.this.LJLJLJ;
                if (c29701Eo2 != null) {
                    c29701Eo2.playAnimation();
                }
            }
        });
    }
}
