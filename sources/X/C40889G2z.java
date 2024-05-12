package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguage;
import com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguageExtra;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.G2z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40889G2z extends AbstractC88823eA {
    public final List<JourneyContentLanguage> LJLILLLLZI;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLJI;
    public final JourneyContentLanguageExtra LJLJJI;
    public final LinkedHashSet<Integer> LJLJJL;

    @Override // X.AbstractC88823eA
    public final int LJLLLLLL() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC88823eA
    public final RecyclerView.ViewHolder LJLZ(ViewGroup viewGroup) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bez, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new G39(this, view);
    }

    @Override // X.AbstractC88823eA
    public final G35 LJZ(ViewGroup parent) {
        String str;
        o.LJIIIZ(parent, "parent");
        String str2 = this.LJLIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        JourneyContentLanguageExtra journeyContentLanguageExtra = this.LJLJJI;
        if (journeyContentLanguageExtra != null && (str = journeyContentLanguageExtra.text) != null) {
            str3 = str;
        }
        G35 LIZ = G34.LIZ(parent, str2, str3);
        ViewGroup.LayoutParams layoutParams = LIZ.itemView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) KL2.LIZJ(LIZ.itemView.getContext(), 28.0f);
        LIZ.itemView.setLayoutParams(marginLayoutParams);
        return LIZ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder p0, int i) {
        o.LJIIIZ(p0, "p0");
        if (p0 instanceof G39) {
            int i2 = i - 1;
            JourneyContentLanguage contentLanguage = (JourneyContentLanguage) ListProtector.get(this.LJLILLLLZI, i2);
            boolean contains = this.LJLJJL.contains(Integer.valueOf(i2));
            o.LJIIIZ(contentLanguage, "contentLanguage");
            ((ImageView) p0.itemView.findViewById(R.id.b_j)).setSelected(contains);
            ((TextView) p0.itemView.findViewById(R.id.cwy)).setText(contentLanguage.en_name);
            ((TextView) p0.itemView.findViewById(R.id.g9b)).setText(contentLanguage.local_name);
            ViewGroup.LayoutParams layoutParams = p0.itemView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int adapterPosition = p0.getAdapterPosition() - 1;
            if (adapterPosition <= 1) {
                marginLayoutParams.topMargin = 0;
            } else {
                marginLayoutParams.topMargin = -((int) KL2.LIZJ(p0.itemView.getContext(), 8.0f));
            }
            if (adapterPosition % 2 == 0) {
                marginLayoutParams.leftMargin = 0;
            } else {
                marginLayoutParams.leftMargin = -((int) KL2.LIZJ(p0.itemView.getContext(), 0.0f));
            }
            p0.itemView.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C40889G2z(java.util.List r2, kotlin.jvm.internal.AqS172S0100000_6 r3, com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguageExtra r4) {
        /*
            r1 = this;
            java.lang.String r0 = "contentLanguage"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            if (r4 == 0) goto L1a
            java.lang.String r0 = r4.title
        L9:
            r1.<init>(r0)
            r1.LJLILLLLZI = r2
            r1.LJLJI = r3
            r1.LJLJJI = r4
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.LJLJJL = r0
            return
        L1a:
            r0 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40889G2z.<init>(java.util.List, kotlin.jvm.internal.AqS172S0100000_6, com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguageExtra):void");
    }
}
