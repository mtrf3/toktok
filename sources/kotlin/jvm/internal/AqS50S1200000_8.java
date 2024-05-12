package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C50098JlO;
import X.C50150JmE;
import X.C50433Jqn;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C51541KKr;
import X.C61295O3v;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.JTO;
import X.KB1;
import X.VNS;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.common.viewmodel.KeyboardModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenAlertMethod;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;

/* loaded from: classes9.dex */
public class AqS50S1200000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS50S1200000_8 aqS50S1200000_8, Object it) {
        C50433Jqn searchCommonModel;
        o.LJIIIZ(it, "it");
        OpenAlertMethod openAlertMethod = (OpenAlertMethod) aqS50S1200000_8.l1;
        ComponentCallbacks2 componentCallbacks2 = (Activity) aqS50S1200000_8.l2;
        String str = aqS50S1200000_8.s0;
        openAlertMethod.getClass();
        if ((componentCallbacks2 instanceof SearchResultActivity) && o.LJ(str, "delete_all")) {
            C50652JuK.Companion.getClass();
            C50650JuI LJII = C50651JuJ.LJII((LifecycleOwner) componentCallbacks2);
            if (LJII != null && (searchCommonModel = LJII.getSearchCommonModel()) != null) {
                searchCommonModel.getEnterFrom();
            }
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) componentCallbacks2;
            if (!KB1.LJII(KB1.LIZ(JTO.LIZIZ(activityC45651qj)))) {
                ((LiveData) ((KeyboardModel) ViewModelProviders.of(activityC45651qj).get(KeyboardModel.class)).LJLIL.getValue()).setValue(1);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS50S1200000_8 aqS50S1200000_8, Object it) {
        o.LJIIIZ(it, "it");
        C51541KKr c51541KKr = (C51541KKr) aqS50S1200000_8.l1;
        Activity activity = (Activity) aqS50S1200000_8.l2;
        String str = aqS50S1200000_8.s0;
        c51541KKr.getClass();
        if (activity instanceof EcSearchResultActivity) {
            o.LJ(str, "delete_all");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS50S1200000_8 aqS50S1200000_8, Object obj) {
        VNS vns;
        C61295O3v it = (C61295O3v) obj;
        o.LJIIIZ(it, "it");
        byte[] S = it.S();
        if (S != null && (vns = ((C50098JlO) aqS50S1200000_8.l1).LJLIL.LIZLLL) != null) {
            vns.ssrHydrate(S, aqS50S1200000_8.s0, (TemplateData) aqS50S1200000_8.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS50S1200000_8 aqS50S1200000_8, Object obj) {
        ((C50150JmE) aqS50S1200000_8.l1).LJIIIZ((QueryCorrectComponentInfo) aqS50S1200000_8.l2, aqS50S1200000_8.s0, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS50S1200000_8 aqS50S1200000_8, Object obj) {
        ((C50150JmE) aqS50S1200000_8.l1).LJIIIZ((QueryCorrectComponentInfo) aqS50S1200000_8.l2, aqS50S1200000_8.s0, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS50S1200000_8 aqS50S1200000_8, Object obj) {
        ((C50150JmE) aqS50S1200000_8.l1).LJIIIZ((QueryCorrectComponentInfo) aqS50S1200000_8.l2, aqS50S1200000_8.s0, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS50S1200000_8 aqS50S1200000_8, Object obj) {
        ((C50150JmE) aqS50S1200000_8.l1).LJIIIZ((QueryCorrectComponentInfo) aqS50S1200000_8.l2, aqS50S1200000_8.s0, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS50S1200000_8 aqS50S1200000_8, Object obj) {
        ((C50150JmE) aqS50S1200000_8.l1).LJIIIZ((QueryCorrectComponentInfo) aqS50S1200000_8.l2, aqS50S1200000_8.s0, false);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S1200000_8(C50098JlO c50098JlO, String str, TemplateData templateData, int i) {
        super(1);
        this.$t = i;
        this.l1 = c50098JlO;
        this.s0 = str;
        this.l2 = templateData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S1200000_8(C50150JmE c50150JmE, QueryCorrectComponentInfo queryCorrectComponentInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c50150JmE;
        this.l2 = queryCorrectComponentInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S1200000_8(C51541KKr c51541KKr, Activity activity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c51541KKr;
        this.l2 = activity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S1200000_8(OpenAlertMethod openAlertMethod, Activity activity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = openAlertMethod;
        this.l2 = activity;
        this.s0 = str;
    }
}
