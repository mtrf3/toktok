package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMW {
    public static final VLY LIZ = new VLY();
    public static final ConcurrentHashMap<String, AtomicLong> LIZIZ = new ConcurrentHashMap<>();
    public static final VN7<OSZ<VMM, InterfaceC79582VLe>> LIZJ = new VN7<>(new VMY());

    public static void LIZLLL(VM5 vm5) {
        LIZJ.LIZ(new OSZ<>(vm5, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean LIZIZ(VMM vmm, BidInfo.BidConfig bidConfig) {
        boolean z;
        char c;
        boolean z2;
        char c2;
        boolean z3;
        if (vmm instanceof VM4) {
            String str = vmm.LJ.LJLJI;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 117588) {
                    if (hashCode == 3337239 && str.equals("lynx")) {
                        String str2 = vmm.LJIIJ;
                        if (!C77318UWc.LJLIL) {
                            str2.getClass();
                            switch (str2.hashCode()) {
                                case -1480388560:
                                    if (str2.equals("performance")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1323516222:
                                    if (str2.equals("jsbPerf")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -892481938:
                                    if (str2.equals("static")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -588767010:
                                    if (str2.equals("jsbPerfV2")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 93819220:
                                    if (str2.equals("blank")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 194292771:
                                    if (str2.equals("res_loader_perf_template")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 281935726:
                                    if (str2.equals("fetchError")) {
                                        c2 = 6;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 299602137:
                                    if (str2.equals("js_exception")) {
                                        c2 = 7;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 831602183:
                                    if (str2.equals("containerError")) {
                                        c2 = '\b';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1008268974:
                                    if (str2.equals("navigationStart")) {
                                        c2 = '\t';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1157772918:
                                    if (str2.equals("res_loader_perf")) {
                                        c2 = '\n';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1521451035:
                                    if (str2.equals("res_loader_error")) {
                                        c2 = 11;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1727072305:
                                    if (str2.equals("nativeError")) {
                                        c2 = '\f';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1830775838:
                                    if (str2.equals("res_loader_error_template")) {
                                        c2 = '\r';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1910899023:
                                    if (str2.equals("jsbError")) {
                                        c2 = 14;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    z3 = bidConfig.performance_lynx;
                                    break;
                                case 1:
                                case 3:
                                    z3 = bidConfig.jsb_perf_lynx;
                                    break;
                                case 2:
                                    z3 = bidConfig.static_error_lynx;
                                    break;
                                case 4:
                                    z3 = bidConfig.blank_lynx;
                                    break;
                                case 5:
                                    z3 = bidConfig.res_loader_perf_template_lynx;
                                    break;
                                case 6:
                                    z3 = bidConfig.fetch_error_lynx;
                                    break;
                                case 7:
                                    z3 = bidConfig.js_exception_lynx;
                                    break;
                                case '\b':
                                    z3 = bidConfig.container_error;
                                    break;
                                case '\t':
                                    z3 = bidConfig.navigation_start_lynx;
                                    break;
                                case '\n':
                                    z3 = bidConfig.res_loader_perf_lynx;
                                    break;
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                    z3 = bidConfig.res_loader_error_lynx;
                                    break;
                                case '\f':
                                    z3 = bidConfig.native_error_lynx;
                                    break;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                    z3 = bidConfig.res_loader_error_template_lynx;
                                    break;
                                case 14:
                                    z3 = bidConfig.jsb_error_lynx;
                                    break;
                                default:
                                    z3 = false;
                                    break;
                            }
                            C16880lQ.LLLZ("sampling eventType: %s, sampleHit: %b， use: %s", new Object[]{str2, Boolean.valueOf(z3), bidConfig.bid});
                            return z3;
                        }
                        return true;
                    }
                } else if (str.equals("web")) {
                    String str3 = vmm.LJIIJ;
                    if (!C77318UWc.LJLIL) {
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -1898518694:
                                if (str3.equals("falconPerf")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1577087617:
                                if (str3.equals("resource_performance")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1323516222:
                                if (str3.equals("jsbPerf")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -892481938:
                                if (str3.equals("static")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -588767010:
                                if (str3.equals("jsbPerfV2")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -109980519:
                                if (str3.equals("static_sri")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2994720:
                                if (str3.equals("ajax")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3437289:
                                if (str3.equals("perf")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 93819220:
                                if (str3.equals("blank")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 194292771:
                                if (str3.equals("res_loader_perf_template")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 281935726:
                                if (str3.equals("fetchError")) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 299602137:
                                if (str3.equals("js_exception")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 831602183:
                                if (str3.equals("containerError")) {
                                    c = '\f';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1008268974:
                                if (str3.equals("navigationStart")) {
                                    c = '\r';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1157772918:
                                if (str3.equals("res_loader_perf")) {
                                    c = 14;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1521451035:
                                if (str3.equals("res_loader_error")) {
                                    c = 15;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1727072305:
                                if (str3.equals("nativeError")) {
                                    c = 16;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1830775838:
                                if (str3.equals("res_loader_error_template")) {
                                    c = 17;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1910899023:
                                if (str3.equals("jsbError")) {
                                    c = 18;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                z2 = bidConfig.falcon_perf_web;
                                break;
                            case 1:
                                z2 = bidConfig.static_perf_web;
                                break;
                            case 2:
                            case 4:
                                z2 = bidConfig.jsb_perf_web;
                                break;
                            case 3:
                                z2 = bidConfig.static_error_web;
                                break;
                            case 5:
                                z2 = bidConfig.static_sri_web;
                                break;
                            case 6:
                                z2 = bidConfig.ajax_web;
                                break;
                            case 7:
                                z2 = bidConfig.perf_web;
                                break;
                            case '\b':
                                z2 = bidConfig.blank_web;
                                break;
                            case '\t':
                                z2 = bidConfig.res_loader_perf_template_web;
                                break;
                            case '\n':
                                z2 = bidConfig.fetch_error_web;
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                z2 = bidConfig.js_exception_web;
                                break;
                            case '\f':
                                z2 = bidConfig.container_error;
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                z2 = bidConfig.navigation_start_web;
                                break;
                            case 14:
                                z2 = bidConfig.res_loader_perf_web;
                                break;
                            case 15:
                                z2 = bidConfig.res_loader_error_web;
                                break;
                            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                z2 = bidConfig.native_error_web;
                                break;
                            case 17:
                                z2 = bidConfig.res_loader_error_template_web;
                                break;
                            case 18:
                                z2 = bidConfig.jsb_error_web;
                                break;
                            default:
                                z2 = false;
                                break;
                        }
                        C16880lQ.LLLZ("sampling eventType: %s, sampleHit: %b, use: %s", new Object[]{str3, Boolean.valueOf(z2), bidConfig.bid});
                        return z2;
                    }
                    return true;
                }
            }
            String str4 = vmm.LJIIJ;
            if (!C77318UWc.LJLIL) {
                str4.getClass();
                if (!str4.equals("containerError")) {
                    return false;
                }
                return bidConfig.container_error;
            }
            return true;
        }
        if (vmm instanceof VM5) {
            C79604VMa c79604VMa = ((VM5) vmm).LJIIL;
            if (c79604VMa != null) {
                String str5 = c79604VMa.LIZIZ;
                String str6 = c79604VMa.LIZJ;
                if (TextUtils.isEmpty(str6)) {
                    return false;
                }
                if (VMX.LIZJ(str5, str6) == 1) {
                    o.LJFF(C16880lQ.LLLZ("bid: %s, event: %s, sample hit", Arrays.copyOf(new Object[]{str5, str6}, 2)), "java.lang.String.format(format, *args)");
                } else {
                    if (VMX.LIZJ(str5, str6) == 0) {
                        o.LJFF(C16880lQ.LLLZ("bid: %s, event: %s, sample not hit", Arrays.copyOf(new Object[]{str5, str6}, 2)), "java.lang.String.format(format, *args)");
                        return false;
                    }
                    o.LJFF(C16880lQ.LLLZ("bid: %s, event: %s, sample not found, checking all...", Arrays.copyOf(new Object[]{str5, str6}, 2)), "java.lang.String.format(format, *args)");
                    String str7 = c79604VMa.LIZJ;
                    if (VMX.LIZIZ(str7) == 1) {
                        o.LJFF(C16880lQ.LLLZ("event: %s, sample hit", Arrays.copyOf(new Object[]{str7}, 1)), "java.lang.String.format(format, *args)");
                    } else {
                        if (VMX.LIZIZ(str7) == 0) {
                            o.LJFF(C16880lQ.LLLZ("event: %s, sample not hit", Arrays.copyOf(new Object[]{str7}, 1)), "java.lang.String.format(format, *args)");
                            return false;
                        }
                        o.LJFF(C16880lQ.LLLZ("event: %s, sample not found, checking canSample level...", Arrays.copyOf(new Object[]{str7}, 1)), "java.lang.String.format(format, *args)");
                        HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
                        o.LJFF(hybridMultiMonitor, "HybridMultiMonitor.getInstance()");
                        InterfaceC40069Fo1 hybridSettingManager = hybridMultiMonitor.getHybridSettingManager();
                        o.LJFF(hybridSettingManager, "HybridMultiMonitor.getIn…ce().hybridSettingManager");
                        BidInfo LIZ2 = hybridSettingManager.LIZ();
                        o.LJFF(LIZ2, "HybridMultiMonitor.getIn…ridSettingManager.bidInfo");
                        BidInfo.BidConfig LIZ3 = LIZ2.LIZ(c79604VMa.LIZIZ);
                        if (LIZ3 == null) {
                            return false;
                        }
                        int i = c79604VMa.LJIIJJI;
                        if (!C77318UWc.LJLIL) {
                            switch (i) {
                                case 0:
                                    z = LIZ3.custom_p0;
                                    break;
                                case 1:
                                    z = LIZ3.custom_p1;
                                    break;
                                case 2:
                                    z = LIZ3.custom_p2;
                                    break;
                                case 3:
                                    z = LIZ3.custom_p3;
                                    break;
                                case 4:
                                    z = LIZ3.custom_p4;
                                    break;
                                case 5:
                                    z = LIZ3.custom_p5;
                                    break;
                                case 6:
                                    z = LIZ3.custom_p6;
                                    break;
                                case 7:
                                    z = LIZ3.custom_p7;
                                    break;
                                default:
                                    z = LIZ3.custom_p8;
                                    break;
                            }
                            C16880lQ.LLLZ("canSample level: %s, sampleHit: %b, use: %s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z), LIZ3.bid});
                            return z;
                        }
                    }
                }
                return true;
            }
            o.LJIIZILJ();
            throw null;
        }
        return false;
    }

    public static String LJ(String eventType, String containerType, JSONObject jSONObject) {
        String str;
        o.LJIIJ(eventType, "eventType");
        o.LJIIJ(containerType, "containerType");
        if (VMS.logType.isEnabled()) {
            if (C79606VMc.LIZIZ.contains(eventType)) {
                str = "bd_hybrid_monitor_p_zero";
            } else if (C79606VMc.LIZJ.contains(eventType)) {
                str = "bd_hybrid_monitor_p_one";
            } else {
                str = "bd_hybrid_monitor_normal";
            }
            if (!C79606VMc.LIZ) {
                C09900aA.LJ(str, jSONObject);
            }
        } else {
            str = "bd_hybrid_monitor_service_all_in_one";
            if (!C79606VMc.LIZ) {
                C09900aA.LJI("bd_hybrid_monitor_service_all_in_one", null, null, jSONObject);
            }
        }
        return str;
    }

    public static void LIZ(InterfaceC79582VLe interfaceC79582VLe, JSONObject jSONObject, String eventType, String str, VMM vmm) {
        VLY vly = LIZ;
        vly.getClass();
        o.LJIIJ(eventType, "eventType");
        String str2 = "custom";
        if (!TextUtils.equals("custom", eventType)) {
            String LJJJJLI = C77123UOp.LJJJJLI("navigation_id", C77123UOp.LJJJJJ("nativeBase", jSONObject));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append('_');
            LIZ2.append(eventType);
            LIZ2.append('_');
            LIZ2.append(LJJJJLI);
            str2 = X1D.LIZIZ(LIZ2);
        }
        if (vly.LIZ.containsKey(eventType) && TextUtils.equals(str2, null)) {
            VLW vlw = vly.LIZ.get(eventType);
            if (vlw != null) {
                if (vlw.LIZ(vly.LIZIZ, jSONObject)) {
                    vly.LIZJ++;
                    vmm.onEventTerminated(EnumC65355Pkt.EVENT_REPEATED);
                } else {
                    vly.LIZ();
                    LIZJ(interfaceC79582VLe, jSONObject, eventType, str, vmm);
                }
            }
        } else {
            vly.LIZ();
            LIZJ(interfaceC79582VLe, jSONObject, eventType, str, vmm);
        }
        vly.LJFF = interfaceC79582VLe;
        vly.LIZIZ = jSONObject;
        vly.LIZLLL = eventType;
        vly.LJ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0097 A[Catch: all -> 0x00ac, TryCatch #3 {all -> 0x00ac, blocks: (B:42:0x007a, B:44:0x007e, B:14:0x0097, B:17:0x00a0, B:12:0x0091), top: B:41:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:24:0x00b7, B:26:0x00c0, B:28:0x00c8, B:30:0x00d6, B:32:0x00f0, B:33:0x0101, B:34:0x00ce), top: B:23:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101 A[Catch: all -> 0x010b, TRY_LEAVE, TryCatch #2 {all -> 0x010b, blocks: (B:24:0x00b7, B:26:0x00c0, B:28:0x00c8, B:30:0x00d6, B:32:0x00f0, B:33:0x0101, B:34:0x00ce), top: B:23:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.InterfaceC79582VLe r10, org.json.JSONObject r11, java.lang.String r12, java.lang.String r13, X.VMM r14) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VMW.LIZJ(X.VLe, org.json.JSONObject, java.lang.String, java.lang.String, X.VMM):void");
    }
}
