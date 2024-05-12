package kotlin.jvm.internal;

import X.ASQ;
import X.ASX;
import X.AbstractC65781Prl;
import X.C50365Jph;
import X.C51258K9u;
import X.C72837SiH;
import X.C76800UCe;
import X.C78685UuP;
import X.InterfaceC65784Pro;
import X.InterfaceC72840SiK;
import X.JGU;
import X.JIB;
import X.JPH;
import X.JPJ;
import X.JPM;
import X.JPP;
import X.JTI;
import X.ORS;
import X.ORY;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecomsearch.middle.feedback.EcommerceSearchMiddleFeedback;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class AqS68S0400000_8 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS68S0400000_8 aqS68S0400000_8) {
        ((JPM) aqS68S0400000_8.l0).LJLL.removeAllViews();
        View view = (View) aqS68S0400000_8.l1;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        JIB provider = (JIB) aqS68S0400000_8.l2;
        JGU jgu = (JGU) aqS68S0400000_8.l3;
        o.LJIIIZ(provider, "provider");
        JPJ jpj = new JPJ(new JTI(C50365Jph.LIZIZ(R.layout.cht, (ViewGroup) view)), provider, jgu);
        ((JPM) aqS68S0400000_8.l0).LJLL.addView(jpj.LJIIIZ());
        ((JPM) aqS68S0400000_8.l0).o1(jpj);
        jpj.LJIIL().LJLLI = (JPM) aqS68S0400000_8.l0;
        return jpj;
    }

    public static final Object invoke$1(AqS68S0400000_8 aqS68S0400000_8) {
        C72837SiH c72837SiH = (C72837SiH) aqS68S0400000_8.l0;
        String type = ((EcommerceSearchMiddleFeedback.FeedbackQuestion) aqS68S0400000_8.l1).getType();
        c72837SiH.getClass();
        boolean LJ = o.LJ(type, "image");
        String wordContent = ((InterfaceC72840SiK) aqS68S0400000_8.l2).getWordContent();
        String productId = ((InterfaceC72840SiK) aqS68S0400000_8.l2).getProductId();
        if (LJ && C78685UuP.LJJJZ(productId)) {
            String[] stringArray = Keva.getRepo("ecommerce_search_repo").getStringArray("ec_search_middle_feedback_products", new String[0]);
            o.LJIIIIZZ(stringArray, "getRepo(ECommerceSearchC…BACK_PRODUCTS, arrayOf())");
            List LJLIIIL = ORY.LJLIIIL(stringArray);
            ArrayList arrayList = (ArrayList) LJLIIIL;
            if (arrayList.size() >= 10) {
                ORS.LJJLJ(LJLIIIL);
            }
            arrayList.add(productId);
            Keva.getRepo("ecommerce_search_repo").storeStringArray("ec_search_middle_feedback_products", (String[]) arrayList.toArray(new String[0]));
        } else {
            String[] stringArray2 = Keva.getRepo("ecommerce_search_repo").getStringArray("ec_search_middle_feedback_words", new String[0]);
            o.LJIIIIZZ(stringArray2, "getRepo(ECommerceSearchC…EEDBACK_WORDS, arrayOf())");
            List LJLIIIL2 = ORY.LJLIIIL(stringArray2);
            ArrayList arrayList2 = (ArrayList) LJLIIIL2;
            if (arrayList2.size() >= 10) {
                ORS.LJJLJ(LJLIIIL2);
            }
            arrayList2.add(wordContent);
            Keva.getRepo("ecommerce_search_repo").storeStringArray("ec_search_middle_feedback_words", (String[]) arrayList2.toArray(new String[0]));
        }
        C51258K9u.LIZIZ = null;
        C51258K9u.LIZLLL.clear();
        Keva.getRepo("ecommerce_search_repo").storeStringArray("ecommerce_suggest_words", new String[0]);
        ASQ.LIZLLL((LinearLayout) aqS68S0400000_8.l3, ASX.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS68S0400000_8 aqS68S0400000_8) {
        ((JPP) aqS68S0400000_8.l0).LJLJLLL.removeAllViews();
        View view = (View) aqS68S0400000_8.l1;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        JIB provider = (JIB) aqS68S0400000_8.l2;
        JGU jgu = (JGU) aqS68S0400000_8.l3;
        o.LJIIIZ(provider, "provider");
        JPH jph = new JPH(new JTI(C50365Jph.LIZIZ(R.layout.ci1, (ViewGroup) view)), provider, jgu);
        ((JPP) aqS68S0400000_8.l0).LJLJLLL.addView(jph.LJIIIZ());
        ((JPP) aqS68S0400000_8.l0).o1(jph);
        jph.LJIIL().LJLLI = (JPP) aqS68S0400000_8.l0;
        return jph;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S0400000_8(JPM jpm, View view, JIB jib, JGU jgu, int i) {
        super(0);
        this.$t = i;
        this.l0 = jpm;
        this.l1 = view;
        this.l2 = jib;
        this.l3 = jgu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S0400000_8(JPP jpp, View view, JIB jib, JGU jgu, int i) {
        super(0);
        this.$t = i;
        this.l0 = jpp;
        this.l1 = view;
        this.l2 = jib;
        this.l3 = jgu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S0400000_8(C72837SiH c72837SiH, EcommerceSearchMiddleFeedback.FeedbackQuestion feedbackQuestion, InterfaceC72840SiK interfaceC72840SiK, LinearLayout linearLayout, int i) {
        super(0);
        this.$t = i;
        this.l0 = c72837SiH;
        this.l1 = feedbackQuestion;
        this.l2 = interfaceC72840SiK;
        this.l3 = linearLayout;
    }
}
