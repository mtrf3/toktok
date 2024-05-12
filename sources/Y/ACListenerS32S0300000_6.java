package Y;

import X.C2NU;
import X.C40870G2g;
import X.C40889G2z;
import X.C5S1;
import X.G2G;
import X.G31;
import X.G36;
import X.G3A;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.journey.step.contentlanguage.ContentLanguageComponent;
import com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguage;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ACListenerS32S0300000_6 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS32S0300000_6 aCListenerS32S0300000_6, View view) {
        G36 g36;
        ((ImageView) ((View) aCListenerS32S0300000_6.l0).findViewById(R.id.bav)).setSelected(!((View) aCListenerS32S0300000_6.l0).findViewById(R.id.bav).isSelected());
        int adapterPosition = ((G3A) aCListenerS32S0300000_6.l1).getAdapterPosition() - 1;
        if (adapterPosition < 0) {
            return;
        }
        G31 g31 = (G31) aCListenerS32S0300000_6.l2;
        if (((View) aCListenerS32S0300000_6.l0).findViewById(R.id.bav).isSelected()) {
            g36 = (G36) ListProtector.get(((G31) aCListenerS32S0300000_6.l2).LJLILLLLZI, adapterPosition);
        } else {
            g36 = null;
        }
        g31.LJLJJI = g36;
        ((G31) aCListenerS32S0300000_6.l2).notifyDataSetChanged();
        G31 g312 = (G31) aCListenerS32S0300000_6.l2;
        g312.LJLJI.invoke(g312.LJLJJI);
    }

    public static final void onClick$1(ACListenerS32S0300000_6 aCListenerS32S0300000_6, View view) {
        view.getContext();
        if (C2NU.LIZ.LIZIZ()) {
            ((ContentLanguageComponent) aCListenerS32S0300000_6.l0).LJLJLLL = true;
            if (!((C40889G2z) aCListenerS32S0300000_6.l1).LJLJJL.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<Integer> it = ((C40889G2z) aCListenerS32S0300000_6.l1).LJLJJL.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    sb.append(((JourneyContentLanguage) ListProtector.get(((C40870G2g) aCListenerS32S0300000_6.l2).LJLIL, it.next().intValue())).code);
                    if (i != ((C40889G2z) aCListenerS32S0300000_6.l1).LJLJJL.size() - 1) {
                        sb.append(",");
                    }
                    i = i2;
                }
                String sb2 = sb.toString();
                o.LJIIIIZZ(sb2, "languageList.toString()");
                ((ContentLanguageComponent) aCListenerS32S0300000_6.l0).Hl(sb2, false);
                G2G.LIZIZ.LIZ.LJFF(sb2);
            }
            ((ContentLanguageComponent) aCListenerS32S0300000_6.l0).vl(Boolean.FALSE);
            return;
        }
        C5S1 c5s1 = new C5S1(view.getContext());
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    public ACListenerS32S0300000_6(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
