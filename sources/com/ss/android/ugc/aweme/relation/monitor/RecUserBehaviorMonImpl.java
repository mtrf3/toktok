package com.ss.android.ugc.aweme.relation.monitor;

import X.AbstractC029409q;
import X.AbstractC57828Mmm;
import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C162476Zf;
import X.C221018lt;
import X.C221108m2;
import X.C223208pQ;
import X.C33X;
import X.C3C1;
import X.C45804HyK;
import X.C57778Mly;
import X.C57789Mm9;
import X.C57819Mmd;
import X.C62822Ol8;
import X.C72912tb;
import X.C72922tc;
import X.C76800UCe;
import X.C78643Utj;
import X.C78646Utm;
import X.C78648Uto;
import X.C78651Utr;
import X.C98423te;
import X.HG3;
import X.InterfaceC53896LDg;
import X.InterfaceC57760Mlg;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.OSZ;
import X.RBX;
import X.X1D;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import defpackage.b0;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class RecUserBehaviorMonImpl implements InterfaceC57760Mlg {
    public static C78648Uto LJLZ;
    public final C57819Mmd LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC65784Pro<Long> LJLJI;
    public final InterfaceC88471Ynr<String, JSONObject, C76800UCe> LJLJJI;
    public String LJLJJL;
    public C57778Mly LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public final boolean LJLLI;
    public boolean LJLLILLLL;
    public OSZ<String, ? extends InterfaceC53896LDg> LJLLJ;
    public long LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    public RecUserBehaviorMonImpl() {
        throw null;
    }

    static {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        LJLZ = new C78648Uto(curUserId, false, 62);
    }

    public final JSONObject LIZ() {
        return (JSONObject) this.LJLLLL.getValue();
    }

    @Override // X.InterfaceC57760Mlg
    public final void O20() {
        if (this.LJLLILLLL) {
            return;
        }
        LIZIZ("NOTIFICATION");
    }

    @Override // X.InterfaceC57760Mlg
    public final AbstractC029409q<?> Wk0() {
        return (AbstractC029409q) this.LJLLLLLL.getValue();
    }

    @Override // X.InterfaceC57760Mlg
    public final void k0() {
        String str;
        if (this.LJLLILLLL) {
            return;
        }
        this.LJLLILLLL = true;
        if (this.LJLLL == -1) {
            return;
        }
        JSONObject put = LIZ().put("stay_duration", this.LJLJI.invoke().longValue() - this.LJLLL);
        C78646Utm c78646Utm = C78646Utm.LIZ;
        boolean z = this.LJLLI;
        c78646Utm.getClass();
        JSONObject put2 = put.put("is_valid", C78646Utm.LJFF(z)).put("show_cnt", this.LJLJL).put("paging_cnt", this.LJLJLJ).put("load_time", C78646Utm.LIZIZ(c78646Utm, this.LJLJLLL)).put("first_item_load_time", C78646Utm.LIZIZ(c78646Utm, this.LJLL));
        AbstractC72932td<C223208pQ> abstractC72932td = this.LJLJJLL.LIZ;
        if ((abstractC72932td instanceof C33X) || (abstractC72932td instanceof C72922tc)) {
            str = "loading";
        } else if (abstractC72932td instanceof C3C1) {
            str = "error";
        } else if (abstractC72932td instanceof C72912tb) {
            str = "normal";
        } else {
            throw new C162476Zf();
        }
        put2.put("state", str).putOpt("extra", this.LJLJJL);
        C78646Utm.LIZLLL(new AqS163S0100000_13(this, 252));
    }

    public RecUserBehaviorMonImpl(C57819Mmd c57819Mmd) {
        String key = c57819Mmd.LIZIZ();
        C98423te uptimeMs = C98423te.LJLIL;
        C78643Utj c78643Utj = new C78643Utj(C78646Utm.LIZ);
        o.LJIIIZ(key, "key");
        o.LJIIIZ(uptimeMs, "uptimeMs");
        this.LJLIL = c57819Mmd;
        this.LJLILLLLZI = key;
        this.LJLJI = uptimeMs;
        this.LJLJJI = c78643Utj;
        this.LJLJJLL = new C57778Mly(0);
        this.LJLJLLL = -1L;
        this.LJLL = -1L;
        this.LJLLI = true;
        this.LJLLL = -1L;
        this.LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 255));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 699));
        C221108m2.LIZIZ(new AqS162S0100000_12(this, 892));
    }

    public final void LIZIZ(String str) {
        ActivityC45651qj LJJIFFI;
        if (this.LJLLJ != null) {
            return;
        }
        C78646Utm.LIZ.getClass();
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || (LJJIFFI = C45804HyK.LJJIFFI(topActivity)) == null) {
            return;
        }
        Hox LIZ = Hox.LJLLI.LIZ(LJJIFFI);
        C78651Utr c78651Utr = new C78651Utr(this, LIZ, str);
        LIZ.hv0(str, c78651Utr);
        this.LJLLJ = new OSZ<>(str, c78651Utr);
    }

    @Override // X.InterfaceC57760Mlg
    public final void d80(String extra) {
        o.LJIIIZ(extra, "extra");
        this.LJLJJL = extra;
    }

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        if (!this.LJLLILLLL && (abstractC57828Mmm instanceof C57789Mm9) && (abstractC57828Mmm.LIZ instanceof RecUser)) {
            if (this.LJLJL == 0) {
                this.LJLL = this.LJLJI.invoke().longValue() - this.LJLLL;
            }
            this.LJLJL++;
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
        if (this.LJLLILLLL) {
            return;
        }
        this.LJLJJLL = state;
        AbstractC72932td<C223208pQ> abstractC72932td = state.LIZ;
        if (abstractC72932td instanceof C72912tb) {
            if (this.LJLJLLL == -1) {
                this.LJLJLLL = this.LJLJI.invoke().longValue() - this.LJLLL;
            }
        } else if (abstractC72932td instanceof C72922tc) {
            this.LJLJLJ = 1;
        }
        if (state.LIZIZ instanceof C72922tc) {
            this.LJLJLJ++;
        }
    }

    @Override // X.InterfaceC57760Mlg
    public final void xk0(String str) {
        int i;
        if (this.LJLLILLLL) {
            return;
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        String str2 = LJLZ.LIZ;
        if (curUserId != null && !o.LJ(str2, curUserId)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("change user, ");
            LIZ.append(str2);
            LIZ.append(" to ");
            LIZ.append(curUserId);
            C221018lt.LJFF("PerfMonitor", X1D.LIZIZ(LIZ));
            LJLZ = new C78648Uto(str2, true, 30);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start tracing key: ");
        b0.LJFF(LIZ2, this.LJLILLLLZI, LIZ2, "PerfMonitor");
        long longValue = this.LJLJI.invoke().longValue();
        this.LJLLL = longValue;
        Map<String, Integer> map = LJLZ.LJ;
        Integer num = map.get(this.LJLILLLLZI);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int i2 = i + 1;
        map.put(this.LJLILLLLZI, Integer.valueOf(i2));
        LJLZ.LIZIZ++;
        LIZ().put("enter_cnt", i2).put("all_enter_cnt", LJLZ.LIZIZ);
        long j = LJLZ.LIZJ;
        if (j != -1) {
            long j2 = longValue - j;
            LIZ().put("all_rec_duration", j2);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("enter global scene, duration(S): ");
            LIZ3.append(j2 / 1000);
            C221018lt.LJFF("PerfMonitor", X1D.LIZIZ(LIZ3));
        }
        C78648Uto c78648Uto = LJLZ;
        c78648Uto.LIZJ = longValue;
        Long l = c78648Uto.LIZLLL.get(this.LJLILLLLZI);
        if (l != null) {
            long longValue2 = l.longValue();
            if (longValue2 != -1) {
                long j3 = longValue - longValue2;
                LIZ().put("rec_duration", j3);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("enter same scene, duration(S): ");
                LIZ4.append(j3 / 1000);
                C221018lt.LJFF("PerfMonitor", X1D.LIZIZ(LIZ4));
            }
        }
        LJLZ.LIZLLL.put(this.LJLILLLLZI, Long.valueOf(longValue));
        if (str != null) {
            LIZIZ(str);
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            k0();
        }
        if (this.LJLLILLLL) {
            OSZ<String, ? extends InterfaceC53896LDg> osz = this.LJLLJ;
            if (osz != null) {
                String first = osz.getFirst();
                InterfaceC53896LDg second = osz.getSecond();
                C78646Utm.LIZ.getClass();
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null && (LJJIFFI = C45804HyK.LJJIFFI(topActivity)) != null) {
                    Hox.LJLLI.LIZ(LJJIFFI).zv0(first, second);
                }
            }
            source.getLifecycle().removeObserver(this);
        }
    }
}
