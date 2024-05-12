package X;

import com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMY implements VN6<OSZ<? extends VMM, ? extends InterfaceC79582VLe>> {
    @Override // X.VN6
    public void onEventFired(OSZ<? extends VMM, ? extends InterfaceC79582VLe> item) {
        o.LJIIJ(item, "item");
        VMM first = item.getFirst();
        String str = "";
        if (first instanceof VM4) {
            VMM first2 = item.getFirst();
            if (first2 != null) {
                VM4 vm4 = (VM4) first2;
                InterfaceC79582VLe second = item.getSecond();
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("reportNormalData: ");
                    LIZ.append(vm4.LJ.LJLJI);
                    LIZ.append(", ");
                    LIZ.append(vm4.LJIIJ);
                    X1D.LIZIZ(LIZ);
                    VMV.LJIIIIZZ(vm4);
                    String LIZJ = VMV.LIZJ(vm4);
                    BidInfo.BidConfig LIZLLL = VMV.LIZLLL(LIZJ);
                    if (o.LJ(vm4.LJIIJ, "jsbPv")) {
                        String str2 = LIZLLL.bid;
                        o.LJFF(str2, "bidConfig.bid");
                        VMU.LIZIZ(vm4, str2);
                        return;
                    }
                    boolean LIZIZ = VMW.LIZIZ(vm4, LIZLLL);
                    String str3 = vm4.LJIIJ;
                    String str4 = LIZLLL.bid;
                    o.LJFF(str4, "bidConfig.bid");
                    VMU.LIZ(str3, str4);
                    VMU.LIZJ(vm4, LIZJ, LIZIZ);
                    if (!LIZIZ) {
                        if (VMS.eventStream.isEnabled()) {
                            C38045EwT.LIZ(new AqS164S0100000_14((VMM) vm4, 263));
                            return;
                        }
                        return;
                    }
                    String str5 = vm4.LJIIJ;
                    String str6 = LIZLLL.bid;
                    o.LJFF(str6, "bidConfig.bid");
                    VMU.LIZLLL(str5, str6);
                    JSONObject LIZ2 = VMV.LIZ(vm4);
                    ConcurrentHashMap<String, AtomicLong> concurrentHashMap = VMW.LIZIZ;
                    AtomicLong atomicLong = concurrentHashMap.get(LIZJ);
                    if (atomicLong == null) {
                        atomicLong = new AtomicLong();
                        concurrentHashMap.put(LIZJ, atomicLong);
                    }
                    JSONObject jSONObject = new JSONObject();
                    C77123UOp.LJJJJZI("uuid", UUID.randomUUID().toString(), jSONObject);
                    C77123UOp.LJJJJZ("inc_id", atomicLong.incrementAndGet(), jSONObject);
                    C77123UOp.LJJJLIIL(jSONObject, "trace_id", vm4.LIZ());
                    C77123UOp.LJJJLIIL(LIZ2, "debugLog", jSONObject);
                    String str7 = vm4.LJ.LJLJI;
                    if (str7 != null) {
                        str = str7;
                    }
                    VMW.LIZ(second, LIZ2, vm4.LJIIJ, str, vm4);
                    return;
                } catch (Throwable th) {
                    vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
                    C77117UOj.LJIIZILJ(th);
                    return;
                }
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitorV2.event.CommonEvent");
        }
        if (first instanceof VM5) {
            VMM first3 = item.getFirst();
            if (first3 != null) {
                VM5 vm5 = (VM5) first3;
                try {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("monitorCustom: ");
                    LIZ3.append(vm5.LJIIL);
                    X1D.LIZIZ(LIZ3);
                    if (vm5.LJIIL != null) {
                        VMV.LJIIIIZZ(vm5);
                        String LIZJ2 = VMV.LIZJ(vm5);
                        JSONObject LIZIZ2 = VMV.LIZIZ(vm5);
                        C79604VMa c79604VMa = vm5.LJIIL;
                        if (c79604VMa != null) {
                            c79604VMa.LIZIZ = LIZJ2;
                            BidInfo.BidConfig LIZLLL2 = VMV.LIZLLL(LIZJ2);
                            String str8 = LIZLLL2.bid;
                            o.LJFF(str8, "bidConfig.bid");
                            VMU.LIZ("custom", str8);
                            if (vm5.LJII == EnumC40073Fo5.Tea || !VMW.LIZIZ(vm5, LIZLLL2)) {
                                if (VMS.eventStream.isEnabled()) {
                                    C38045EwT.LIZ(new AqS164S0100000_14(vm5, 263));
                                    return;
                                }
                                return;
                            }
                            String str9 = LIZLLL2.bid;
                            o.LJFF(str9, "bidConfig.bid");
                            VMU.LIZLLL("custom", str9);
                            Object[] objArr = new Object[2];
                            C79604VMa c79604VMa2 = vm5.LJIIL;
                            if (c79604VMa2 != null) {
                                objArr[0] = c79604VMa2.LIZIZ;
                                objArr[1] = c79604VMa2.LIZJ;
                                o.LJFF(C16880lQ.LLLZ("do report bid: %s, event: %s", Arrays.copyOf(objArr, 2)), "java.lang.String.format(format, *args)");
                                ConcurrentHashMap<String, AtomicLong> concurrentHashMap2 = VMW.LIZIZ;
                                AtomicLong atomicLong2 = concurrentHashMap2.get(LIZJ2);
                                if (atomicLong2 == null) {
                                    atomicLong2 = new AtomicLong();
                                    concurrentHashMap2.put(LIZJ2, atomicLong2);
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                C77123UOp.LJJJJZI("uuid", UUID.randomUUID().toString(), jSONObject2);
                                C77123UOp.LJJJJZ("inc_id", atomicLong2.incrementAndGet(), jSONObject2);
                                C77123UOp.LJJJLIIL(jSONObject2, "trace_id", vm5.LIZ());
                                C77123UOp.LJJJLIIL(LIZIZ2, "debugLog", jSONObject2);
                                C79604VMa c79604VMa3 = vm5.LJIIL;
                                if (c79604VMa3 != null) {
                                    VMW.LIZ(c79604VMa3.LJIIL, LIZIZ2, "custom", "", vm5);
                                    return;
                                } else {
                                    o.LJIIZILJ();
                                    throw null;
                                }
                            }
                            o.LJIIZILJ();
                            throw null;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    return;
                } catch (Throwable th2) {
                    C77117UOj.LJIIZILJ(th2);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("monitorCustom error: ");
                    LIZ4.append(th2.getMessage());
                    X1D.LIZIZ(LIZ4);
                    return;
                }
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitorV2.event.CustomEvent");
        }
    }
}
