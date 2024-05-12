package com.ss.android.ugc.aweme.relation.monitor;

import X.AbstractC72932td;
import X.AbstractC78649Utp;
import X.C162476Zf;
import X.C221018lt;
import X.C33X;
import X.C3C1;
import X.C57819Mmd;
import X.C72912tb;
import X.C72922tc;
import X.C76800UCe;
import X.C78642Uti;
import X.C78646Utm;
import X.C78650Utq;
import X.C78652Uts;
import X.C98433tf;
import X.EnumC41264GHk;
import X.InterfaceC65784Pro;
import X.InterfaceC72447Sbz;
import X.InterfaceC88471Ynr;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class RelationPageMonitor implements InterfaceC72447Sbz {
    public static final Map<String, Long> LJLLILLLL = new LinkedHashMap();
    public static final Map<String, Integer> LJLLJ = new LinkedHashMap();
    public final C57819Mmd LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC65784Pro<Long> LJLJI;
    public final InterfaceC88471Ynr<String, JSONObject, C76800UCe> LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public C78652Uts LJLJL;
    public final boolean LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public AbstractC72932td<C76800UCe> LJLLI;

    public RelationPageMonitor() {
        throw null;
    }

    @Override // X.InterfaceC72447Sbz
    public final void Dc() {
        long j;
        if (this.LJLJJL == 0) {
            C78652Uts c78652Uts = this.LJLJL;
            if (c78652Uts != null) {
                j = this.LJLJI.invoke().longValue() - c78652Uts.LJ;
            } else {
                j = -1;
            }
            this.LJLL = j;
        }
        this.LJLJJL++;
    }

    @Override // X.InterfaceC72447Sbz
    public final void k0() {
        C78652Uts c78652Uts;
        if (this.LJLJJLL || (c78652Uts = this.LJLJL) == null) {
            return;
        }
        long longValue = this.LJLJI.invoke().longValue();
        LJLLILLLL.put(this.LJLILLLLZI, Long.valueOf(longValue));
        LIZ(new C78650Utq(this.LJLJJL, this.LJLLI, longValue - c78652Uts.LJ, this.LJLJLLL, this.LJLL));
        this.LJLJJLL = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key: ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", trace end!");
        C221018lt.LJFF("Relation_Page", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC72447Sbz
    public final void qy() {
        int i;
        long j;
        if (this.LJLJJLL) {
            return;
        }
        long longValue = this.LJLJI.invoke().longValue();
        Map<String, Integer> map = LJLLJ;
        Integer num = (Integer) ((LinkedHashMap) map).get(this.LJLILLLLZI);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int i2 = i + 1;
        map.put(this.LJLILLLLZI, Integer.valueOf(i2));
        Long l = (Long) ((LinkedHashMap) LJLLILLLL).get(this.LJLILLLLZI);
        if (l != null) {
            j = longValue - l.longValue();
        } else {
            j = -1;
        }
        C78652Uts c78652Uts = new C78652Uts(i2, j, longValue);
        this.LJLJL = c78652Uts;
        LIZ(c78652Uts);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key: ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", trace start!");
        C221018lt.LJFF("Relation_Page", X1D.LIZIZ(LIZ));
    }

    public RelationPageMonitor(C57819Mmd c57819Mmd) {
        String key = c57819Mmd.LIZIZ();
        C98433tf uptimeMs = C98433tf.LJLIL;
        C78642Uti c78642Uti = new C78642Uti(C78646Utm.LIZ);
        o.LJIIIZ(key, "key");
        o.LJIIIZ(uptimeMs, "uptimeMs");
        this.LJLIL = c57819Mmd;
        this.LJLILLLLZI = key;
        this.LJLJI = uptimeMs;
        this.LJLJJI = c78642Uti;
        this.LJLJLJ = true;
        this.LJLJLLL = -1L;
        this.LJLL = -1L;
        this.LJLLI = new C72922tc();
    }

    public final void LIZ(AbstractC78649Utp abstractC78649Utp) {
        String str;
        Object valueOf;
        JSONObject jSONObject = new JSONObject();
        C78646Utm c78646Utm = C78646Utm.LIZ;
        JSONObject put = jSONObject.put("action", abstractC78649Utp.LIZ);
        EnumC41264GHk enumC41264GHk = abstractC78649Utp.LIZIZ;
        c78646Utm.getClass();
        JSONObject put2 = put.put("net_status", C78646Utm.LJ(enumC41264GHk));
        o.LJIIIIZZ(put2, "category\n            .pu…tion.netStatus.toValue())");
        C78646Utm.LIZ(this.LJLIL.LIZLLL(), put2);
        if (abstractC78649Utp instanceof C78652Uts) {
            C78652Uts c78652Uts = (C78652Uts) abstractC78649Utp;
            JSONObject put3 = jSONObject.put("enter_cnt", c78652Uts.LIZJ);
            long j = c78652Uts.LIZLLL;
            if (j <= 0) {
                valueOf = -1L;
            } else {
                valueOf = Integer.valueOf((int) (j / 1000));
            }
            put3.put("enter_duration", valueOf);
        } else if (abstractC78649Utp instanceof C78650Utq) {
            C78650Utq c78650Utq = (C78650Utq) abstractC78649Utp;
            AbstractC72932td<C76800UCe> abstractC72932td = c78650Utq.LIZLLL;
            o.LJIIIZ(abstractC72932td, "<this>");
            if (abstractC72932td instanceof C3C1) {
                str = "error";
            } else if ((abstractC72932td instanceof C72922tc) || o.LJ(abstractC72932td, C33X.LIZ)) {
                str = "loading";
            } else if (abstractC72932td instanceof C72912tb) {
                str = "normal";
            } else {
                throw new C162476Zf();
            }
            jSONObject.put("state", str).put("show_cnt", c78650Utq.LIZJ).put("stay_duration", c78650Utq.LJ).put("load_time", C78646Utm.LIZIZ(c78646Utm, c78650Utq.LJFF)).put("first_item_load_time", C78646Utm.LIZIZ(c78646Utm, c78650Utq.LJI));
        }
        jSONObject.put("is_valid", C78646Utm.LJFF(this.LJLJLJ));
        this.LJLJJI.invoke("relation_list_page_track", jSONObject);
    }

    @Override // X.InterfaceC72447Sbz
    public final void lp(RecyclerView recyclerView) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationPage_");
        LIZ.append(this.LJLIL.LIZ);
        LIZ.append('_');
        LIZ.append(this.LJLIL.LIZJ);
        PerfMonitorServiceImpl.LIZ().LJ(recyclerView, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC72447Sbz
    public final void s20(AbstractC72932td<C76800UCe> abstractC72932td) {
        long j;
        this.LJLLI = abstractC72932td;
        if ((abstractC72932td instanceof C72912tb) || (abstractC72932td instanceof C3C1)) {
            C78652Uts c78652Uts = this.LJLJL;
            if (c78652Uts != null) {
                j = this.LJLJI.invoke().longValue() - c78652Uts.LJ;
            } else {
                j = -1;
            }
            this.LJLJLLL = j;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key: ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", trace state: ");
        LIZ.append(abstractC72932td);
        LIZ.append('!');
        C221018lt.LJFF("Relation_Page", X1D.LIZIZ(LIZ));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            k0();
        }
        if (this.LJLJJLL) {
            source.getLifecycle().removeObserver(this);
        }
    }
}
