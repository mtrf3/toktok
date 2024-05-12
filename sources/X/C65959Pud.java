package X;

import android.os.SystemClock;
import com.bytedance.helios.api.consumer.ReportParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.Pud, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65959Pud implements InterfaceC65943PuN {
    @Override // X.InterfaceC65943PuN
    public final int LIZ() {
        return 8;
    }

    @Override // X.InterfaceC65943PuN
    public final int priority() {
        return 0;
    }

    @Override // X.InterfaceC65943PuN
    public final void LIZIZ(PYQ event) {
        ReportParam LIZJ;
        String str;
        ReportParam LIZJ2;
        ReportParam LIZJ3;
        ReportParam LIZJ4;
        ReportParam LIZJ5;
        ReportParam LIZJ6;
        String str2;
        ReportParam LIZJ7;
        C65961Puf c65961Puf;
        ReportParam LIZJ8;
        ReportParam LIZJ9;
        ReportParam LIZJ10;
        ReportParam LIZJ11;
        ReportParam LIZJ12;
        ReportParam LIZJ13;
        ReportParam LIZJ14;
        String str3;
        ReportParam LIZJ15;
        ArrayList arrayList;
        Object obj;
        ReportParam LIZJ16;
        Object obj2;
        ReportParam LIZJ17;
        ReportParam LIZJ18;
        long j;
        o.LJIIIZ(event, "event");
        if (event instanceof C65896Ptc) {
            List<ReportParam> list = event.LJJJJL().LJLLLL;
            LIZJ = C65960Pue.LIZJ("pl_btm", C12460eI.LJFF(), "category");
            list.add(LIZJ);
            C18080nM.LIZ.getClass();
            C18090nN c18090nN = C18080nM.LIZJ;
            String str4 = null;
            if (c18090nN != null) {
                str = c18090nN.LJ;
            } else {
                str = null;
            }
            LIZJ2 = C65960Pue.LIZJ("pl_btm_pre", str, "category");
            list.add(LIZJ2);
            C65961Puf c65961Puf2 = C65960Pue.LJFF;
            LIZJ3 = C65960Pue.LIZJ("pl_page_name", c65961Puf2.LIZ, "category");
            list.add(LIZJ3);
            LIZJ4 = C65960Pue.LIZJ("pl_pre_page_name", c65961Puf2.LIZJ, "category");
            list.add(LIZJ4);
            java.util.Set<String> set = C65960Pue.LJI;
            LIZJ5 = C65960Pue.LIZJ("pl_page_stack", set, "category");
            list.add(LIZJ5);
            LIZJ6 = C65960Pue.LIZJ("pl_optimize_page_stack", new ArrayList(set), "category");
            list.add(LIZJ6);
            C65964Pui<String> c65964Pui = C65960Pue.LJIIIIZZ;
            if (c65964Pui == null || (str2 = c65964Pui.toString()) == null) {
                str2 = "";
            }
            LIZJ7 = C65960Pue.LIZJ("pl_activity_trace", str2, "category");
            list.add(LIZJ7);
            if (o.LJ(c65961Puf2.LIZ, "com.ss.android.ugc.aweme.main.MainActivity")) {
                c65961Puf = C65960Pue.LIZJ;
                if (c65961Puf.LIZ == null) {
                    c65961Puf = C65960Pue.LIZIZ;
                }
            } else {
                c65961Puf = C65960Pue.LIZLLL;
            }
            LIZJ8 = C65960Pue.LIZJ("pl_fragment_name", c65961Puf.LIZ, "category");
            list.add(LIZJ8);
            C65961Puf c65961Puf3 = C65960Pue.LIZIZ;
            LIZJ9 = C65960Pue.LIZJ("pl_fragment_in_main", c65961Puf3.LIZ, "category");
            list.add(LIZJ9);
            LIZJ10 = C65960Pue.LIZJ("pl_pre_fragment_in_main", c65961Puf3.LIZJ, "category");
            list.add(LIZJ10);
            C65961Puf c65961Puf4 = C65960Pue.LIZJ;
            LIZJ11 = C65960Pue.LIZJ("pl_inner_fragment_in_main", c65961Puf4.LIZ, "category");
            list.add(LIZJ11);
            LIZJ12 = C65960Pue.LIZJ("pl_pre_inner_fragment_in_main", c65961Puf4.LIZJ, "category");
            list.add(LIZJ12);
            C65961Puf c65961Puf5 = C65960Pue.LIZLLL;
            LIZJ13 = C65960Pue.LIZJ("pl_fragment_in_other", c65961Puf5.LIZ, "category");
            list.add(LIZJ13);
            LIZJ14 = C65960Pue.LIZJ("pl_pre_fragment_in_other", c65961Puf5.LIZJ, "category");
            list.add(LIZJ14);
            C65964Pui<String> c65964Pui2 = C65960Pue.LJIIIZ;
            if (c65964Pui2 == null || (str3 = c65964Pui2.toString()) == null) {
                str3 = "";
            }
            LIZJ15 = C65960Pue.LIZJ("pl_fragment_trace", str3, "category");
            list.add(LIZJ15);
            List<String> list2 = ViewOnAttachStateChangeListenerC65968Pum.LJLJLJ;
            synchronized (list2) {
                arrayList = new ArrayList(list2);
            }
            if (arrayList.size() >= 1) {
                obj = AnonymousClass028.LIZIZ(arrayList, 1, arrayList);
            } else {
                obj = null;
            }
            LIZJ16 = C65960Pue.LIZJ("pl_optimize_fragment_name", obj, "category");
            list.add(LIZJ16);
            if (arrayList.size() >= 2) {
                obj2 = AnonymousClass028.LIZIZ(arrayList, 2, arrayList);
            } else {
                obj2 = null;
            }
            LIZJ17 = C65960Pue.LIZJ("pl_optimize_pre_fragment_name", obj2, "category");
            list.add(LIZJ17);
            LIZJ18 = C65960Pue.LIZJ("pl_optimize_fragment_list", arrayList, "category");
            list.add(LIZJ18);
            list.add(C65960Pue.LIZJ("pl_time_since_cold_boot", Long.valueOf(SystemClock.elapsedRealtime() - C56672Kh.LIZ().LJJIIZ), "metric"));
            long j2 = -1;
            if (C56672Kh.LIZ().LJJIIZI > 0) {
                j = C56672Kh.LIZ().LJJIIZI - C56672Kh.LIZ().LJJIIZ;
            } else {
                j = -1;
            }
            list.add(C65960Pue.LIZJ("pl_cold_boot_cost_time", Long.valueOf(j), "metric"));
            if (C56672Kh.LIZ().LJJIJ > 0) {
                j2 = C56672Kh.LIZ().LJJIJ - C56672Kh.LIZ().LJJIIZ;
            }
            list.add(C65960Pue.LIZJ("pl_first_feed_cost_time", Long.valueOf(j2), "metric"));
            list.add(C65960Pue.LIZJ("pl_boot_stage", C56672Kh.LIZ().LJJIII.name(), "category"));
            if (o.LJ("local_test", EF7.LJIILIIL)) {
                for (ReportParam reportParam : list) {
                    reportParam.getKey();
                    Objects.toString(reportParam.getValue());
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append(" ");
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("current Activity : ");
                LIZ.append(C65960Pue.LJFF.LIZ);
                LIZ.append("\ncurrent List : ");
                LIZ.append((Object) sb);
                LIZ.append("\ncurrent Fragment : ");
                if (arrayList.size() >= 1) {
                    str4 = (String) AnonymousClass028.LIZIZ(arrayList, 1, arrayList);
                }
                LIZ.append(str4);
                X1D.LIZIZ(LIZ);
            }
        }
    }
}
