package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G30 extends AbstractC88823eA {
    public final List<NewUserInterestStruct> LJLILLLLZI;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLJI;
    public final C40865G2b LJLJJI;
    public final G3C LJLJJL;
    public final LinkedHashSet<Integer> LJLJJLL;

    @Override // X.AbstractC88823eA
    public final int LJLLLLLL() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC88823eA
    public final RecyclerView.ViewHolder LJLZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        C56662Kg.LIZ().LIZJ("interest_fragment_create_dataholder", false);
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.bf0, parent, false);
        o.LJIIIIZZ(view, "view");
        G38 g38 = new G38(this, view);
        C56662Kg.LIZ().LJFF("interest_fragment_create_dataholder", false);
        return g38;
    }

    @Override // X.AbstractC88823eA
    public final G35 LJZ(ViewGroup parent) {
        String str;
        o.LJIIIZ(parent, "parent");
        C56662Kg.LIZ().LIZJ("interest_fragment_create_headholder", false);
        String str2 = this.LJLIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        C40865G2b c40865G2b = this.LJLJJI;
        if (c40865G2b != null && (str = c40865G2b.LIZIZ) != null) {
            str3 = str;
        }
        G35 LIZ = G34.LIZ(parent, str2, str3);
        ViewGroup.LayoutParams layoutParams = LIZ.itemView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) KL2.LIZJ(LIZ.itemView.getContext(), 28.0f);
        LIZ.itemView.setLayoutParams(marginLayoutParams);
        C56662Kg.LIZ().LJFF("interest_fragment_create_headholder", false);
        return LIZ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder p0, int i) {
        o.LJIIIZ(p0, "p0");
        if (p0 instanceof G38) {
            G38 g38 = (G38) p0;
            int adapterPosition = g38.getAdapterPosition() - 1;
            ((TextView) g38.itemView.findViewById(R.id.text)).setText(((NewUserInterestStruct) ListProtector.get(g38.LJLJJI.LJLILLLLZI, adapterPosition)).text);
            g38.L(g38.LJLJJI.LJLJJLL.contains(Integer.valueOf(adapterPosition)));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public G30(java.util.List r3, kotlin.jvm.internal.AqS172S0100000_6 r4, X.C40865G2b r5, X.G2Q r6) {
        /*
            r2 = this;
            java.lang.String r0 = "newUserInterestStruct"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "sizeListener"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "imageLoadingFailureCallback"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            if (r5 == 0) goto L2e
            java.lang.String r0 = r5.LIZ
        L13:
            r2.<init>(r0)
            r2.LJLILLLLZI = r3
            r2.LJLJI = r4
            r2.LJLJJI = r5
            r2.LJLJJL = r6
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.LJLJJLL = r0
            r0.addAll(r1)
            return
        L2e:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G30.<init>(java.util.List, kotlin.jvm.internal.AqS172S0100000_6, X.G2b, X.G2Q):void");
    }
}
