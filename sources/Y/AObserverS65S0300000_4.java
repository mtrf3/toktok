package Y;

import X.A8R;
import X.ActivityC45651qj;
import X.C188727au;
import X.C254739zB;
import X.C26045AKb;
import X.C65777Prh;
import X.FMX;
import X.OSZ;
import X.SY4;
import X.ViewOnClickListenerC57173McD;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorExtraModel;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AObserverS65S0300000_4 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS65S0300000_4 aObserverS65S0300000_4, Object obj) {
        String str;
        A8R a8r;
        Map it = (Map) obj;
        o.LJIIIIZZ(it, "it");
        C254739zB c254739zB = (C254739zB) it.get((Long) aObserverS65S0300000_4.l0);
        if (c254739zB != null && !c254739zB.LJFF && (a8r = (A8R) aObserverS65S0300000_4.l1) != null) {
            a8r.setPricingTitle$anchor_business_release(c254739zB.LIZJ);
        }
        C188727au c188727au = new C188727au();
        PaidContentAnchorExtraModel paidContentAnchorExtraModel = ((PaidContentCustomAnchorViewModel) aObserverS65S0300000_4.l2).LJLJI;
        String str2 = null;
        if (paidContentAnchorExtraModel != null) {
            str = paidContentAnchorExtraModel.iapID;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("iap_id", str);
        AnchorCommonStruct anchorCommonStruct = ((PaidContentCustomAnchorViewModel) aObserverS65S0300000_4.l2).LJLILLLLZI;
        if (anchorCommonStruct != null) {
            str2 = anchorCommonStruct.getId();
        }
        c188727au.LJIIIZ("anchor_id", str2);
        FMX.LJIIL("paid_content_anchor_prefetch_price", c188727au.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$1(AObserverS65S0300000_4 aObserverS65S0300000_4, Object obj) {
        OSZ osz = (OSZ) obj;
        if (((Boolean) osz.getSecond()).booleanValue()) {
            Object first = osz.getFirst();
            if (first != null) {
                ((ViewOnClickListenerC57173McD) aObserverS65S0300000_4.l0).LJLILLLLZI.add(first);
            }
        } else {
            Set<String> set = ((ViewOnClickListenerC57173McD) aObserverS65S0300000_4.l0).LJLILLLLZI;
            C65777Prh.LIZ(set).remove(osz.getFirst());
        }
        ViewOnClickListenerC57173McD viewOnClickListenerC57173McD = (ViewOnClickListenerC57173McD) aObserverS65S0300000_4.l0;
        if (viewOnClickListenerC57173McD.LJLLL) {
            if (viewOnClickListenerC57173McD.LJLILLLLZI.isEmpty()) {
                ((SY4) aObserverS65S0300000_4.l1).setEnabled(false);
                C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) aObserverS65S0300000_4.l2);
                c26045AKb.LJIIIIZZ(R.string.f3w);
                c26045AKb.LJIIJ();
                return;
            }
            ((SY4) aObserverS65S0300000_4.l1).setEnabled(true);
        }
    }

    public AObserverS65S0300000_4(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
