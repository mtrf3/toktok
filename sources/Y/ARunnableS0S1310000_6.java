package Y;

import X.ActivityC45651qj;
import X.C26045AKb;
import X.C31811Ce7;
import X.C39489Fef;
import X.C39492Fei;
import X.C39494Fek;
import X.C45804HyK;
import X.InterfaceC37146Ehy;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS0S1310000_6 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Fragment fragment;
        Context context = (Context) this.l1;
        if (context instanceof ActivityC45651qj) {
            ((ShowToastMethod) this.l2).getClass();
            List<Fragment> LJJJJLI = ((ActivityC45651qj) context).getSupportFragmentManager().LJJJJLI();
            o.LJIIIIZZ(LJJJJLI, "activity.supportFragmentManager.fragments");
            Iterator<Fragment> it = LJJJJLI.iterator();
            while (it.hasNext()) {
                fragment = it.next();
                if (fragment instanceof DialogFragment) {
                    break;
                }
            }
        }
        fragment = null;
        if (!this.z4) {
            if (fragment == null) {
                Activity LJIJJ = C45804HyK.LJIJJ((Context) this.l1);
                if (LJIJJ != null) {
                    C31811Ce7.LIZIZ(LJIJJ, this.s0);
                }
            }
            C26045AKb c26045AKb = new C26045AKb(fragment);
            c26045AKb.LJIIIZ(this.s0);
            c26045AKb.LJIIJ();
        } else {
            if (fragment == null) {
                Activity LJIJJ2 = C45804HyK.LJIJJ((Context) this.l1);
                if (LJIJJ2 != null) {
                    boolean z = this.z4;
                    String str = this.s0;
                    if (z) {
                        C26045AKb c26045AKb2 = new C26045AKb(LJIJJ2);
                        c26045AKb2.LJIIIZ(str);
                        c26045AKb2.LIZ(true);
                        c26045AKb2.LJIIJ();
                    } else {
                        C31811Ce7.LIZIZ(LJIJJ2, str);
                    }
                }
            }
            C26045AKb c26045AKb3 = new C26045AKb(fragment);
            c26045AKb3.LJIIIZ(this.s0);
            c26045AKb3.LJIIJ();
        }
        InterfaceC37146Ehy interfaceC37146Ehy = (InterfaceC37146Ehy) this.l3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 1);
        interfaceC37146Ehy.LIZIZ(jSONObject);
    }

    public final void LIZ$1() {
        Map<String, String> map;
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jsb_name", ((C39489Fef) this.l2).LJLILLLLZI);
        String str5 = this.s0;
        if (str5 != null) {
            jSONObject.put("risk_id", str5);
        }
        C39492Fei c39492Fei = (C39492Fei) this.l3;
        if (c39492Fei != null && (str4 = c39492Fei.LJLIL) != null) {
            jSONObject.put("url", str4);
        }
        C39492Fei c39492Fei2 = (C39492Fei) this.l3;
        if (c39492Fei2 != null && (str3 = c39492Fei2.LJLJJI) != null) {
            jSONObject.put("host", str3);
        }
        C39492Fei c39492Fei3 = (C39492Fei) this.l3;
        if (c39492Fei3 != null && (str2 = c39492Fei3.LJLJI) != null) {
            jSONObject.put("scheme", str2);
        }
        C39492Fei c39492Fei4 = (C39492Fei) this.l3;
        if (c39492Fei4 != null && (str = c39492Fei4.LJLJJLL) != null) {
            jSONObject.put("path", str);
        }
        C39492Fei c39492Fei5 = (C39492Fei) this.l3;
        if (c39492Fei5 != null && (map = c39492Fei5.LJLJL) != null && (!map.isEmpty())) {
            if (this.z4) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next().getKey(), "");
                }
                jSONObject.put("querys", linkedHashMap);
            } else {
                jSONObject.put("querys", map);
            }
        }
        IEventMonitor iEventMonitor = ((C39494Fek) this.l1).LIZIZ;
        if (iEventMonitor != null) {
            iEventMonitor.monitorCommonLog("rasp_risk_jsb", jSONObject);
        }
    }

    public static final void run$0(ARunnableS0S1310000_6 aRunnableS0S1310000_6) {
        boolean LIZ;
        try {
            aRunnableS0S1310000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1310000_6 aRunnableS0S1310000_6) {
        boolean LIZ;
        try {
            aRunnableS0S1310000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1310000_6(Object obj, Object obj2, boolean z, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.z4 = z;
        this.s0 = str;
        this.l3 = obj3;
    }
}
