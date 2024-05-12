package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G31 extends AbstractC88823eA {
    public final List<G36> LJLILLLLZI;
    public final InterfaceC88472Yns<G36, C76800UCe> LJLJI;
    public G36 LJLJJI;

    @Override // X.AbstractC88823eA
    public final int LJLLLLLL() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC88823eA
    public final RecyclerView.ViewHolder LJLZ(ViewGroup viewGroup) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bey, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new G3A(this, view);
    }

    @Override // X.AbstractC88823eA
    public final G35 LJZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        String str = this.LJLIL;
        if (str == null) {
            str = "";
        }
        G35 LIZ = G34.LIZ(parent, str, "");
        ViewGroup.LayoutParams layoutParams = LIZ.itemView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) KL2.LIZJ(LIZ.itemView.getContext(), 48.0f);
        LIZ.itemView.setLayoutParams(marginLayoutParams);
        return LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            boolean r0 = r6 instanceof X.G3A
            if (r0 == 0) goto L76
            X.G3A r6 = (X.G3A) r6
            int r0 = r6.getAdapterPosition()
            int r4 = r0 + (-1)
            android.view.View r1 = r6.itemView
            r0 = 2131362654(0x7f0a035e, float:1.8345095E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.G31 r0 = r6.LJLIL
            java.util.List<X.G36> r0 = r0.LJLILLLLZI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            X.G36 r0 = (X.G36) r0
            java.lang.String r0 = r0.LIZIZ()
            r1.setText(r0)
            android.view.View r1 = r6.itemView
            r0 = 2131364208(0x7f0a0970, float:1.8348247E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            X.G31 r1 = r6.LJLIL
            X.G36 r0 = r1.LJLJJI
            r3 = 0
            if (r0 == 0) goto L88
            java.util.List<X.G36> r0 = r1.LJLILLLLZI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            X.G36 r0 = (X.G36) r0
            java.lang.String r1 = r0.LIZJ()
            X.G31 r0 = r6.LJLIL
            X.G36 r0 = r0.LJLJJI
            kotlin.jvm.internal.o.LJI(r0)
            java.lang.String r0 = r0.LIZJ()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L88
            r0 = 1
        L5d:
            r2.setSelected(r0)
            android.view.View r0 = r6.itemView
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            kotlin.jvm.internal.o.LJII(r2, r0)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r4 != 0) goto L77
            r2.topMargin = r3
        L71:
            android.view.View r0 = r6.itemView
            r0.setLayoutParams(r2)
        L76:
            return
        L77:
            android.view.View r0 = r6.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 1090519040(0x41000000, float:8.0)
            float r0 = X.KL2.LIZJ(r1, r0)
            int r0 = (int) r0
            int r0 = -r0
            r2.topMargin = r0
            goto L71
        L88:
            r0 = 0
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G31.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public G31(String str, List list, AqS172S0100000_6 aqS172S0100000_6) {
        super(str);
        this.LJLILLLLZI = list;
        this.LJLJI = aqS172S0100000_6;
    }
}
