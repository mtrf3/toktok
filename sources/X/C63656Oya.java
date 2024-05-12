package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.ReportClientMetricsRequestBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oya, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63656Oya extends AbstractC63515OwJ {
    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
    }

    public C63656Oya() {
        super(EnumC63625Oy5.REPORT_CLIENT_METRICS.getValue());
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        Response response;
        ResponseBody responseBody;
        if (c63622Oy2 != null && (response = c63622Oy2.LJLJL) != null && (responseBody = response.body) != null && responseBody.report_client_metrics_body != null) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63670Oyo c63670Oyo = (C63670Oyo) it.next();
            if (c63670Oyo != null) {
                C63659Oyd c63659Oyd = new C63659Oyd();
                c63659Oyd.LIZLLL = c63670Oyo.LIZ;
                c63659Oyd.LJ = c63670Oyo.LIZIZ;
                c63659Oyd.LJFF = Long.valueOf(c63670Oyo.LIZJ);
                java.util.Map<String, String> map = c63670Oyo.LIZLLL;
                if (map != null) {
                    C63685Oz3.LIZIZ(map);
                    c63659Oyd.LJI = map;
                }
                arrayList.add(c63659Oyd.build());
            }
        }
        C63667Oyl c63667Oyl = new C63667Oyl();
        C63685Oz3.LIZ(arrayList);
        c63667Oyl.LIZLLL = arrayList;
        ReportClientMetricsRequestBody build = c63667Oyl.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJL = build;
        LJIIJJI(0, c89453Z8v.build(), null, new Object[0]);
    }
}
