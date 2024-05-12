package X;

import android.text.TextUtils;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMV {
    public static final ArrayList<String> LIZ = C47261Igj.LJII("jsb_bid", "regex_bid", "config_bid");
    public static final ArrayList<String> LIZIZ = C47261Igj.LJII("[?&]bd_hybrid_monitor_bid=([^&#]+)", "[?&]bdhm_bid=([^&#]+)");
    public static final ArrayList<String> LIZJ = C47261Igj.LJII("[?&]bdhm_pid=([^&#]+)");

    public static JSONObject LIZ(VM4 event) {
        o.LJIIJ(event, "event");
        JSONObject jSONObject = new JSONObject();
        String LIZJ2 = LIZJ(event);
        BidInfo.BidConfig LIZLLL = LIZLLL(LIZJ2);
        JSONObject jSONObject2 = new JSONObject();
        C77123UOp.LJJJJZI("event_type", event.LJIIJ, jSONObject);
        C77123UOp.LJJJJZI("container_id", event.LIZIZ, jSONObject);
        VMG vmg = event.LJ;
        if (vmg != null) {
            JSONObject LLLLLLLZIL = vmg.LLLLLLLZIL();
            C77123UOp.LJJJLIIL(jSONObject, "nativeBase", LLLLLLLZIL);
            C77123UOp.LJJJLIIL(LLLLLLLZIL, "bid_info", jSONObject2);
            C77123UOp.LJJJJZI("bid", LIZJ2, jSONObject2);
            C77123UOp.LJJJJZI("setting_bid", LIZLLL.bid, jSONObject2);
            C77123UOp.LJJJJZ("hit_sample", LIZLLL.hitSample, jSONObject2);
            C77123UOp.LJJJJZ("setting_id", LIZLLL.settingId, jSONObject2);
        }
        AbstractC38228EzQ abstractC38228EzQ = event.LJIIL;
        if (abstractC38228EzQ != null) {
            C77123UOp.LJJJLIIL(jSONObject, "nativeInfo", abstractC38228EzQ.LLLLLLLZIL());
        }
        JSONObject jSONObject3 = event.LJIILJJIL;
        if (jSONObject3 != null) {
            C77123UOp.LJJJLIIL(jSONObject, "jsInfo", jSONObject3);
        }
        JSONObject jSONObject4 = event.LJFF;
        if (jSONObject4 != null) {
            C77123UOp.LJJJLIIL(jSONObject, "jsBase", jSONObject4);
        }
        C35894E6w c35894E6w = event.LJI;
        if (c35894E6w != null) {
            C77123UOp.LJJJLIIL(jSONObject, "containerBase", c35894E6w.LLLLLLLZIL());
        }
        C35893E6v c35893E6v = event.LJIILIIL;
        if (c35893E6v != null) {
            C77123UOp.LJJJLIIL(jSONObject, "containerInfo", c35893E6v.LLLLLLLZIL());
        }
        if (event.LJIIIIZZ != null) {
            java.util.Map map = event.LJIIIIZZ;
            if (map == null) {
                map = new HashMap();
            }
            C77123UOp.LJJJLIIL(jSONObject, "extra", new JSONObject(map));
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:63|64)|(2:66|(6:68|69|70|71|(2:73|(1:75))|77))|80|69|70|71|(0)|77) */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:71:0x00e3, B:73:0x00e9), top: B:70:0x00e3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LIZIZ(X.VM5 r8) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VMV.LIZIZ(X.VM5):org.json.JSONObject");
    }

    public static String LIZJ(Object event) {
        VM5 vm5;
        C79604VMa c79604VMa;
        o.LJIIJ(event, "event");
        if (event instanceof VM4) {
            return LJFF((VMM) event);
        }
        if (!(event instanceof VM5) || (c79604VMa = (vm5 = (VM5) event).LJIIL) == null) {
            return "";
        }
        if (!TextUtils.isEmpty(c79604VMa.LIZIZ)) {
            C79604VMa c79604VMa2 = vm5.LJIIL;
            if (c79604VMa2 != null) {
                String str = c79604VMa2.LIZIZ;
                o.LJFF(str, "event.customInfo!!.bid");
                return str;
            }
            o.LJIIZILJ();
            throw null;
        }
        return LJFF((VMM) event);
    }

    public static BidInfo.BidConfig LIZLLL(String bid) {
        o.LJIIJ(bid, "bid");
        HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
        o.LJFF(hybridMultiMonitor, "HybridMultiMonitor.getInstance()");
        InterfaceC40069Fo1 hybridSettingManager = hybridMultiMonitor.getHybridSettingManager();
        o.LJFF(hybridSettingManager, "HybridMultiMonitor.getIn…ce().hybridSettingManager");
        BidInfo.BidConfig LIZ2 = hybridSettingManager.LIZ().LIZ(bid);
        o.LJFF(LIZ2, "HybridMultiMonitor.getIn…gManager.bidInfo.get(bid)");
        return LIZ2;
    }

    public static JSONObject LJ(VMM event) {
        o.LJIIJ(event, "event");
        if (event instanceof VM4) {
            return LIZ((VM4) event);
        }
        if (event instanceof VM5) {
            return LIZIZ((VM5) event);
        }
        return new JSONObject();
    }

    public static String LJFF(VMM vmm) {
        java.util.Map<String, Object> map = vmm.LIZLLL;
        Iterator<String> it = LIZ.iterator();
        while (true) {
            Object obj = "";
            if (it.hasNext()) {
                Object key = it.next();
                Object obj2 = ((LinkedHashMap) map).get(key);
                if ((obj2 instanceof String) && (!ujb.o.LJJJJJL((CharSequence) obj2))) {
                    o.LJFF(key, "key");
                    if (o.LJ("regex_bid", key)) {
                        java.util.Map<String, Object> map2 = vmm.LJIIIIZZ;
                        Object obj3 = null;
                        if (map2 != null) {
                            obj3 = ((LinkedHashMap) map2).get("regex_source");
                        }
                        if ((obj3 instanceof String) && obj3 != null) {
                            obj = obj3;
                        }
                    } else {
                        obj = key;
                    }
                    vmm.LJ.LLLLZ(obj, "bid_source");
                    return (String) obj2;
                }
            } else {
                vmm.LJ.LLLLZ("default_bid", "bid_source");
                return "";
            }
        }
    }

    public static void LJIIIIZZ(VMM vmm) {
        JSONObject jSONObject;
        C79604VMa c79604VMa;
        String str;
        JSONObject jSONObject2;
        C35894E6w c35894E6w = vmm.LJI;
        if (c35894E6w != null) {
            jSONObject = c35894E6w.LLLLLLLZIL();
        } else {
            jSONObject = null;
        }
        String schema = C77123UOp.LJJJJLI("schema", jSONObject);
        if (!(vmm instanceof VM4) ? !(vmm instanceof VM5) || (c79604VMa = ((VM5) vmm).LJIIL) == null || (str = c79604VMa.LIZ) == null : (str = vmm.LJ.LJLIL) == null) {
            str = "";
        }
        if (o.LJ(str, "")) {
            try {
                String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(schema), "url");
                if (queryParameter != null) {
                    str = queryParameter;
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        o.LJFF(schema, "schema");
        C35672DzI c35672DzI = new C35672DzI(str, schema);
        C35731E0p LJII = LJII(c35672DzI.LIZIZ, c35672DzI.LIZ, true);
        vmm.LIZLLL(LJII.LIZIZ, "regex_source");
        vmm.LIZLLL.put("regex_bid", LJII.LIZ);
        o.LJFF(C77123UOp.LJJJJLI("pid", vmm.LJFF), "JsonUtils.safeOptStr(event.jsBase, \"pid\")");
        if (!ujb.o.LJJJJJL(r1)) {
            return;
        }
        if (vmm.LJFF == null) {
            vmm.LJFF = new JSONObject();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(c35672DzI.LIZ);
        linkedList.add(c35672DzI.LIZIZ);
        String LJI = LJI(linkedList, LIZJ);
        if (!(true ^ ujb.o.LJJJJJL(LJI)) || (jSONObject2 = vmm.LJFF) == null) {
            return;
        }
        jSONObject2.put("pid", LJI);
    }

    public static String LJI(List list, List list2) {
        int i;
        boolean z;
        Iterator it = list.iterator();
        String str = "";
        loop0: while (it.hasNext()) {
            String str2 = (String) it.next();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (!ujb.o.LJJJJJL(str2)) {
                    Matcher matcher = PatternProtector.compile(str3).matcher(str2);
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        o.LJFF(group, "matcher.group(1)");
                        int length = group.length() - 1;
                        int i2 = 0;
                        boolean z2 = false;
                        while (i2 <= length) {
                            if (!z2) {
                                i = i2;
                            } else {
                                i = length;
                            }
                            if (group.charAt(i) <= ' ') {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z2) {
                                if (!z) {
                                    z2 = true;
                                } else {
                                    i2++;
                                }
                            } else {
                                if (!z) {
                                    break;
                                }
                                length--;
                            }
                        }
                        str = C132805Jc.LIZJ(length, 1, group, i2);
                    }
                    if (!ujb.o.LJJJJJL(str)) {
                        break loop0;
                    }
                }
            }
        }
        return str;
    }

    public static C35731E0p LJII(String schema, String url, boolean z) {
        o.LJIIJ(schema, "schema");
        o.LJIIJ(url, "url");
        LinkedList linkedList = new LinkedList();
        linkedList.add(url);
        linkedList.add(schema);
        String LJI = LJI(linkedList, LIZIZ);
        C35731E0p c35731E0p = new C35731E0p(LJI, "regex_param_bid");
        if (ujb.o.LJJJJJL(LJI) && (!ujb.o.LJJJJJL(url))) {
            HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
            o.LJFF(hybridMultiMonitor, "HybridMultiMonitor.getInstance()");
            InterfaceC40069Fo1 hybridSettingManager = hybridMultiMonitor.getHybridSettingManager();
            o.LJFF(hybridSettingManager, "HybridMultiMonitor.getIn…ce().hybridSettingManager");
            LJI = C38916FPc.LIZ(url, hybridSettingManager.LIZIZ(), z);
            c35731E0p = new C35731E0p(LJI, "regex_list_bid");
        }
        C1JX.LJIIIIZZ("regexMatcher: ", LJI);
        return c35731E0p;
    }
}
