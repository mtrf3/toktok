package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C40328FsC;
import X.C51541KKr;
import X.C75792yF;
import X.C76800UCe;
import X.HG3;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.JYQ;
import X.KMZ;
import X.O1I;
import X.X1D;
import android.net.Uri;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenAlertMethod;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.ShowSearchRSReportPanelMethod;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import yq4.a;

/* loaded from: classes9.dex */
public class AqS61S1100000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
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
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS61S1100000_8 aqS61S1100000_8, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        ((ShowSearchRSReportPanelMethod) aqS61S1100000_8.l1).LIZJ("confirm", aqS61S1100000_8.s0);
        ShowSearchRSReportPanelMethod showSearchRSReportPanelMethod = (ShowSearchRSReportPanelMethod) aqS61S1100000_8.l1;
        String str2 = aqS61S1100000_8.s0;
        showSearchRSReportPanelMethod.getClass();
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "sug_recommend").appendQueryParameter("object_id", showSearchRSReportPanelMethod.LJLJJLL).appendQueryParameter("owner_id", HG3.LJIILL().getCurUserId()).appendQueryParameter("sug_content", showSearchRSReportPanelMethod.LJLJI);
        m mVar = new m();
        try {
            mVar.LJJIIZ("raw_query", showSearchRSReportPanelMethod.LJLILLLLZI);
            mVar.LJJIIZ("words_content", showSearchRSReportPanelMethod.LJLJI);
            mVar.LJJIIJ("words_position", Integer.valueOf(showSearchRSReportPanelMethod.LJLJJI));
            mVar.LJJIIZ("impr_id", showSearchRSReportPanelMethod.LJLJJL);
            mVar.LJJIIZ("group_id", showSearchRSReportPanelMethod.LJLJJLL);
            mVar.LJJIIZ("words_source", showSearchRSReportPanelMethod.LJLJL);
            mVar.LJJIIZ("feedback_id", str2);
            str = C75792yF.LIZJ(mVar);
        } catch (Exception unused) {
            str = "";
        }
        appendQueryParameter.appendQueryParameter("extra", str);
        a.LJIILLIIL().LIZIZ(showSearchRSReportPanelMethod.LJLIL, appendQueryParameter);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS61S1100000_8 aqS61S1100000_8, Object it) {
        o.LJIIIZ(it, "it");
        ((ShowSearchRSReportPanelMethod) aqS61S1100000_8.l1).LIZJ("not_relevant", aqS61S1100000_8.s0);
        ActivityC45651qj activityC45651qj = ((ShowSearchRSReportPanelMethod) aqS61S1100000_8.l1).LJLIL;
        if (activityC45651qj != null) {
            C40328FsC.LIZLLL(activityC45651qj, R.string.qeh);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS61S1100000_8 aqS61S1100000_8, Object it) {
        o.LJIIIZ(it, "it");
        KMZ kmz = (KMZ) aqS61S1100000_8.l1;
        boolean z = !o.LJ(aqS61S1100000_8.s0, kmz.LLD);
        if (z) {
            kmz.LJLLLLLL = true;
        }
        kmz.LJLILLLLZI = z;
        KMZ kmz2 = (KMZ) aqS61S1100000_8.l1;
        kmz2.LJZL = kmz2.LJLILLLLZI;
        kmz2.LLD = aqS61S1100000_8.s0;
        kmz2.LJIILL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS61S1100000_8 aqS61S1100000_8, Object it) {
        o.LJIIIZ(it, "it");
        ((OpenAlertMethod) aqS61S1100000_8.l1).LIZJ("confirm", aqS61S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS61S1100000_8 aqS61S1100000_8, Object it) {
        o.LJIIIZ(it, "it");
        ((OpenAlertMethod) aqS61S1100000_8.l1).LIZJ("center", aqS61S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS61S1100000_8 aqS61S1100000_8, Object it) {
        o.LJIIIZ(it, "it");
        ((OpenAlertMethod) aqS61S1100000_8.l1).LIZJ("cancel", aqS61S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS61S1100000_8 aqS61S1100000_8, Object it) {
        InterfaceC88471Ynr<SearchMixFeed, String, Boolean> interfaceC88471Ynr = ((JYQ) aqS61S1100000_8.l1).LIZ;
        o.LJIIIIZZ(it, "it");
        return interfaceC88471Ynr.invoke(it, aqS61S1100000_8.s0);
    }

    public static final Object invoke$6(AqS61S1100000_8 aqS61S1100000_8, Object obj) {
        SearchFragment runDelegates = (SearchFragment) obj;
        o.LJIIIZ(runDelegates, "$this$runDelegates");
        runDelegates.xa((DynamicPatch) aqS61S1100000_8.l1, aqS61S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS61S1100000_8 aqS61S1100000_8, Object it) {
        o.LJIIIZ(it, "it");
        ((C51541KKr) aqS61S1100000_8.l1).LJII("confirm", aqS61S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS61S1100000_8 aqS61S1100000_8, Object it) {
        o.LJIIIZ(it, "it");
        ((C51541KKr) aqS61S1100000_8.l1).LJII("cancel", aqS61S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS61S1100000_8 aqS61S1100000_8, Object obj) {
        String str;
        O1I it = (O1I) obj;
        o.LJIIIZ(it, "it");
        if (it.LJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file:/");
            LIZ.append(it.LJI);
            str = X1D.LIZIZ(LIZ);
        } else {
            str = aqS61S1100000_8.s0;
        }
        KMZ kmz = (KMZ) aqS61S1100000_8.l1;
        boolean z = !o.LJ(str, kmz.LLD);
        if (z) {
            kmz.LJLLLLLL = true;
        }
        kmz.LJLILLLLZI = z;
        KMZ kmz2 = (KMZ) aqS61S1100000_8.l1;
        kmz2.LJZL = kmz2.LJLILLLLZI;
        kmz2.LLD = str;
        kmz2.LJIILL();
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS61S1100000_8(X.KMZ r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 9: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS61S1100000_8.<init>(X.KMZ, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S1100000_8(JYQ jyq, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = jyq;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S1100000_8(C51541KKr c51541KKr, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c51541KKr;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S1100000_8(DynamicPatch dynamicPatch, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = dynamicPatch;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S1100000_8(OpenAlertMethod openAlertMethod, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = openAlertMethod;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S1100000_8(ShowSearchRSReportPanelMethod showSearchRSReportPanelMethod, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = showSearchRSReportPanelMethod;
        this.s0 = str;
    }
}
