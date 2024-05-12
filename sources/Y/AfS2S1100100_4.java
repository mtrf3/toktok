package Y;

import X.AFF;
import X.AFJ;
import X.AFM;
import X.C198517qh;
import X.C26045AKb;
import X.C28064Azs;
import X.C28068Azw;
import X.C2U8;
import X.C39398FdC;
import X.C45804HyK;
import X.InterfaceC64592gB;
import X.ORZ;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.List;

/* loaded from: classes5.dex */
public class AfS2S1100100_4 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS2S1100100_4 afS2S1100100_4, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        String str2 = null;
        ((C28064Azs) afS2S1100100_4.l1).LIZIZ(null);
        long currentTimeMillis = System.currentTimeMillis() - afS2S1100100_4.j2;
        String str3 = afS2S1100100_4.s0;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        List<String> list = ((C28064Azs) afS2S1100100_4.l1).LIZJ;
        if (list != null) {
            str2 = (String) ORZ.LJLLJ(list);
        }
        C28068Azw.LIZ(str3, false, str, "-1", 0L, currentTimeMillis, null, null, null, str2);
    }

    public static final void accept$1(AfS2S1100100_4 afS2S1100100_4, Object obj) {
        if (((BaseResponse) obj).status_code != 0) {
            AFF.LIZIZ();
        } else {
            Context context = (Context) afS2S1100100_4.l1;
            String str = afS2S1100100_4.s0;
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                c26045AKb.LJIIIIZZ(R.string.ho6);
                c26045AKb.LJIIJ();
                ReportAwemeManager.LIZJ().LIZ(str);
                C2U8.LIZ(new AFM(str));
                C39398FdC c39398FdC = C39398FdC.LIZ;
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("object_type", "video");
                c198517qh.LIZ.put("is_success", 1);
                C39398FdC.LIZIZ("submit_report_reason", q.LIZJ(c198517qh.LIZ, "reason_id", AFF.LIZ(), c198517qh, c39398FdC));
            }
        }
        AFJ.LIZ(-1, 0, afS2S1100100_4.j2, "kids_api_report");
    }

    public AfS2S1100100_4(Object obj, long j, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.j2 = j;
    }
}
