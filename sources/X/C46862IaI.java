package X;

import Y.IDComparatorS36S0000000_8;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.playerkit.model.DashAutoBitrateSet;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.IaI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46862IaI implements InterfaceC46630IRu {
    public static int LIZIZ = -1;
    public static Integer LIZJ;
    public static final ConcurrentHashMap<String, Float> LIZLLL = new ConcurrentHashMap<>(50);
    public static final ConcurrentLinkedQueue<String> LJ = new ConcurrentLinkedQueue<>();
    public final C46980IcC LIZ;

    public C46862IaI() {
        IDimensionBitrateFilterConfig dimensionBitrateFilterConfig = C1DG.LIZ().getConfig().getDimensionBitrateFilterConfig();
        if (dimensionBitrateFilterConfig != null && dimensionBitrateFilterConfig.enable()) {
            this.LIZ = new C46980IcC();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    public final IXW LJ(String str, InterfaceC46867IaN interfaceC46867IaN) {
        IYO LIZIZ2;
        EnumC47177IfN enumC47177IfN;
        IXW ixw = new IXW();
        if (interfaceC46867IaN == null) {
            return ixw;
        }
        int LJI = (int) C1DG.LIZ().LJI().LJI();
        if (C1DG.LIZ().getConfig().getCommonConfig().isUseLastNetworkSpeed()) {
            if (LJI <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                LJI = LIZIZ;
                if (LJI <= 0) {
                    LJI = C1DG.LIZ().getConfig().getCommonConfig().getLastNetworkSpeed();
                }
                C1DG.LIZ().LJI().LIZIZ(LJI);
            } else {
                LIZIZ = LJI;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (IZ8.LJIJI() || IZ8.LJJIJIIJI()) {
            List<Pair<EnumC47177IfN, SimBitRate>> LJFF = interfaceC46867IaN.LJFF();
            if (LJFF != null) {
                for (Pair<EnumC47177IfN, SimBitRate> pair : LJFF) {
                    arrayList.add(pair.second);
                    arrayList2.add(pair.first);
                }
            }
        } else {
            List<Pair<EnumC47177IfN, Integer>> LIZLLL2 = interfaceC46867IaN.LIZLLL();
            if (LIZLLL2 != null) {
                for (Pair<EnumC47177IfN, Integer> pair2 : LIZLLL2) {
                    SimBitRate simBitRate = new SimBitRate();
                    simBitRate.setBitRate(((Integer) pair2.second).intValue());
                    arrayList.add(simBitRate);
                    arrayList2.add(pair2.first);
                    Objects.toString(pair2.second);
                    Objects.toString(pair2.first);
                }
            }
        }
        if (arrayList.size() == 0) {
            return ixw;
        }
        ArrayList arrayList3 = arrayList;
        if (IZ8.LJIJI()) {
            C46980IcC c46980IcC = this.LIZ;
            arrayList3 = arrayList;
            if (c46980IcC != null) {
                arrayList3 = c46980IcC.LIZ(str, arrayList);
            }
        }
        C47164IfA c47164IfA = null;
        if (arrayList3.size() == 1) {
            LIZIZ2 = new IYO();
            LIZIZ2.LJLIL = (IYN) ListProtector.get(arrayList3, 0);
        } else {
            InterfaceC46926IbK LIZIZ3 = C1DG.LIZ().LIZIZ();
            if (LIZIZ3 == null) {
                return ixw;
            }
            C46875IaV c46875IaV = new C46875IaV();
            ((HashMap) c46875IaV.LIZ).put("internet_speed", Integer.valueOf(LJI));
            java.util.Map<String, Object> map = c46875IaV.LIZ;
            if (!IZ8.LJIJI()) {
                Object value = IZ8.LJJIJIL.getValue();
                o.LJIIIIZZ(value, "<get-dashAutoBitrateSet>(...)");
                DashAutoBitrateSet dashAutoBitrateSet = (DashAutoBitrateSet) value;
                if (dashAutoBitrateSet.enable) {
                    ((HashMap) map).put("KEY_AUTO_BITRATE_SET", new C46876IaW(dashAutoBitrateSet));
                }
            }
            HashMap hashMap = (HashMap) map;
            hashMap.put("source_id", str);
            LIZIZ2 = LIZIZ3.LIZIZ(arrayList3, hashMap);
            boolean z = LIZIZ3 instanceof C46979IcB;
            if (LIZIZ2 == null) {
                return ixw;
            }
        }
        int indexOf = arrayList3.indexOf(LIZIZ2.LJLIL);
        if (indexOf >= 0 && indexOf < arrayList2.size()) {
            if (IZ8.LJJIJIIJI()) {
                if (interfaceC46867IaN.getTag() != null) {
                    c47164IfA = interfaceC46867IaN.getTag();
                }
                C47160If6 LJIIL = TTVideoEngine.LJIIL(c47164IfA, 0);
                if (LJIIL == null) {
                    ixw.LIZJ = (EnumC47177IfN) ListProtector.get(arrayList2, indexOf);
                    ixw.LIZLLL = ((SimBitRate) ListProtector.get(arrayList3, indexOf)).getQuality();
                } else {
                    EnumC47176IfM resolution = LJIIL.getResolution();
                    o.LJIIIZ(resolution, "resolution");
                    switch (C47167IfD.LIZ[resolution.ordinal()]) {
                        case 1:
                            enumC47177IfN = EnumC47177IfN.Undefine;
                            break;
                        case 2:
                            enumC47177IfN = EnumC47177IfN.Standard;
                            break;
                        case 3:
                            enumC47177IfN = EnumC47177IfN.High;
                            break;
                        case 4:
                            enumC47177IfN = EnumC47177IfN.SuperHigh;
                            break;
                        case 5:
                            enumC47177IfN = EnumC47177IfN.ExtremelyHigh;
                            break;
                        case 6:
                            enumC47177IfN = EnumC47177IfN.FourK;
                            break;
                        case 7:
                            enumC47177IfN = EnumC47177IfN.HDR;
                            break;
                        case 8:
                            enumC47177IfN = EnumC47177IfN.Auto;
                            break;
                        case 9:
                            enumC47177IfN = EnumC47177IfN.L_Standard;
                            break;
                        case 10:
                            enumC47177IfN = EnumC47177IfN.H_High;
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            enumC47177IfN = EnumC47177IfN.TwoK;
                            break;
                        case 12:
                            enumC47177IfN = EnumC47177IfN.ExtremelyHigh_50F;
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            enumC47177IfN = EnumC47177IfN.TwoK_50F;
                            break;
                        case 14:
                            enumC47177IfN = EnumC47177IfN.FourK_50F;
                            break;
                        case 15:
                            enumC47177IfN = EnumC47177IfN.ExtremelyHigh_60F;
                            break;
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            enumC47177IfN = EnumC47177IfN.TwoK_60F;
                            break;
                        case 17:
                            enumC47177IfN = EnumC47177IfN.FourK_60F;
                            break;
                        case 18:
                            enumC47177IfN = EnumC47177IfN.ExtremelyHigh_120F;
                            break;
                        case 19:
                            enumC47177IfN = EnumC47177IfN.TwoK_120F;
                            break;
                        case 20:
                            enumC47177IfN = EnumC47177IfN.FourK_120F;
                            break;
                        default:
                            enumC47177IfN = EnumC47177IfN.Undefine;
                            break;
                    }
                    ixw.LIZJ = enumC47177IfN;
                    ixw.LIZLLL = LJIIL.LIZIZ(18);
                }
            } else {
                ixw.LIZJ = interfaceC46867IaN.LIZ((EnumC47177IfN) ListProtector.get(arrayList2, indexOf));
            }
            int indexOf2 = arrayList2.indexOf(ixw.LIZJ);
            Session LJ2 = C46664ITc.LJIJ.LJ(str);
            if (LJ2 != null && indexOf2 >= 0 && indexOf2 < arrayList3.size() && ListProtector.get(arrayList3, indexOf2) != null) {
                LJ2.bitrate = ((SimBitRate) ListProtector.get(arrayList3, indexOf2)).getBitRate();
            }
        }
        return ixw;
    }

    public final IXW LIZJ(SimVideoUrlModel simVideoUrlModel, InterfaceC46867IaN interfaceC46867IaN, boolean z) {
        String LJ2;
        long duration;
        int i;
        boolean z2;
        InterfaceC46631IRv superResolutionStrategy = C1DG.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategy();
        new IXW();
        if (simVideoUrlModel != null) {
            LJ2 = simVideoUrlModel.getSourceId();
            duration = (long) simVideoUrlModel.getDuration();
        } else if (interfaceC46867IaN != null) {
            LJ2 = interfaceC46867IaN.LJ();
            duration = interfaceC46867IaN.getDuration();
        } else {
            return null;
        }
        IXW LJ3 = LJ(LJ2, interfaceC46867IaN);
        boolean z3 = true;
        if (z && superResolutionStrategy != null) {
            i = superResolutionStrategy.LJ(LJ2, duration);
        } else {
            i = 1;
        }
        Session LJ4 = C46664ITc.LJIJ.LJ(LJ2);
        if (LJ4 != null) {
            LJ4.preSuperResolution = i;
            if (i == 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            LJ4.isOpenSuperResolution = z2;
        }
        if (i != 100) {
            z3 = false;
        }
        LJ3.LJ = z3;
        return LJ3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r0 = r6.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.getUrlKey()) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r2 = X.C46862IaI.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2.size() <= 50) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r1 = r2.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        X.C46862IaI.LIZLLL.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r2.add(r6.LJLIL.getUrlKey());
        X.C46862IaI.LIZLLL.put(r6.LJLIL.getUrlKey(), java.lang.Float.valueOf(r6.LJLJLJ));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r8 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r5.setHitDashVideoBitrate(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
    
        r5.setHitBitrate(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r2 = X.C46664ITc.LJIJ;
        r4 = r2.LIZIZ(r5.getUri());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r6 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r4.sourceId = r5.getSourceId();
        r4.speed = r6.LJLJLJ;
        r0 = r6.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        r4.bitrate = r0.getBitRate();
        r4.calcBitrate = r6.LJLJI;
        r4.timeCostForSelectSDK = r6.LJLJLLL;
        r4.selectDiffStrForSDK = r6.LJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r5.getSourceId() == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (r6 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r8 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        r2.LJIL(r5.getSourceId(), r3);
        r2.LJJIFFI(r5.getSourceId(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        r1 = r5.getSourceId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        r2.LIZLLL.put(r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        r2.LJJIFFI(r5.getSourceId(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
    
        r4.preSuperResolution = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d9, code lost:
    
        if (r6 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r5, X.IYQ r6, java.util.List r7, boolean r8) {
        /*
            if (r6 == 0) goto Ld8
            X.IYN r0 = r6.LJLIL
            if (r0 == 0) goto Ld8
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Iterator r2 = r7.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ld8
            java.lang.Object r3 = r2.next()
            com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate r3 = (com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate) r3
            int r1 = r3.getBitRate()
            X.IYN r0 = r6.LJLIL
            int r0 = r0.getBitRate()
            if (r1 != r0) goto Lc
        L24:
            X.IYN r0 = r6.LJLIL
            if (r0 == 0) goto L6d
            java.lang.String r0 = r0.getUrlKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L68
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r2 = X.C46862IaI.LJ
            int r1 = r2.size()
            r0 = 50
            if (r1 <= r0) goto L4d
            java.lang.Object r1 = r2.poll()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L4d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Float> r0 = X.C46862IaI.LIZLLL
            r0.remove(r1)
        L4d:
            X.IYN r0 = r6.LJLIL
            java.lang.String r0 = r0.getUrlKey()
            r2.add(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Float> r2 = X.C46862IaI.LIZLLL
            X.IYN r0 = r6.LJLIL
            java.lang.String r1 = r0.getUrlKey()
            int r0 = r6.LJLJLJ
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.put(r1, r0)
        L68:
            if (r8 == 0) goto Ld4
            r5.setHitDashVideoBitrate(r3)
        L6d:
            X.ITc r2 = X.C46664ITc.LJIJ
            java.lang.String r0 = r5.getUri()
            com.ss.android.ugc.playerkit.session.Session r4 = r2.LIZIZ(r0)
            if (r6 == 0) goto Lce
            if (r4 == 0) goto L9c
            java.lang.String r0 = r5.getSourceId()
            r4.sourceId = r0
            int r0 = r6.LJLJLJ
            float r0 = (float) r0
            r4.speed = r0
            X.IYN r0 = r6.LJLIL
            if (r0 == 0) goto L9c
            int r0 = r0.getBitRate()
            r4.bitrate = r0
            double r0 = r6.LJLJI
            r4.calcBitrate = r0
            long r0 = r6.LJLJLLL
            r4.timeCostForSelectSDK = r0
            java.lang.String r0 = r6.LJLL
            r4.selectDiffStrForSDK = r0
        L9c:
            java.lang.String r0 = r5.getSourceId()
            if (r0 == 0) goto Lb4
            if (r6 == 0) goto Lb4
            if (r8 == 0) goto Lb5
            java.lang.String r0 = r5.getSourceId()
            r2.LJIL(r0, r3)
            java.lang.String r0 = r5.getSourceId()
            r2.LJJIFFI(r0, r6)
        Lb4:
            return
        Lb5:
            java.lang.String r1 = r5.getSourceId()
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Ldd
            if (r0 != 0) goto Lc5
            android.util.LruCache<java.lang.String, X.IYN> r0 = r2.LIZLLL     // Catch: java.lang.Throwable -> Ldd
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> Ldd
        Lc5:
            monitor-exit(r2)
            java.lang.String r0 = r5.getSourceId()
            r2.LJJIFFI(r0, r6)
            goto Lb4
        Lce:
            if (r4 == 0) goto L9c
            r0 = 5
            r4.preSuperResolution = r0
            goto L9c
        Ld4:
            r5.setHitBitrate(r6)
            goto L6d
        Ld8:
            r3 = 0
            if (r6 == 0) goto L6d
            goto L24
        Ldd:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46862IaI.LJFF(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, X.IYQ, java.util.List, boolean):void");
    }

    public final IYQ LIZLLL(SimVideoUrlModel simVideoUrlModel, boolean z, int i, boolean z2) {
        List dashBitRate;
        IYQ LIZ;
        String str;
        String str2;
        String str3;
        String str4;
        int codecType;
        int i2;
        boolean z3;
        IYQ iyq = null;
        if (simVideoUrlModel == null) {
            return null;
        }
        if (!z2) {
            if (C1DG.LIZ().getConfig().getCommonConfig().onPreGetProperBitrate(simVideoUrlModel)) {
                return null;
            }
            dashBitRate = simVideoUrlModel.getBitRate();
        } else {
            dashBitRate = simVideoUrlModel.getDashBitRate();
        }
        if (dashBitRate == null) {
            return null;
        }
        int i3 = 0;
        while (i3 < dashBitRate.size()) {
            if (ListProtector.get(dashBitRate, i3) == null) {
                ListProtector.remove(dashBitRate, i3);
            } else {
                i3++;
            }
        }
        Object value = IZ8.LJIIJJI.getValue();
        o.LJIIIIZZ(value, "<get-USE_540P_FOR_LOW_DEVICE>(...)");
        if (((Boolean) value).booleanValue()) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < dashBitRate.size(); i4++) {
                int LJJIIJ = O5Y.LJJIIJ(((SimBitRate) ListProtector.get(dashBitRate, i4)).getQualityType(), ((SimBitRate) ListProtector.get(dashBitRate, i4)).getGearName());
                Object value2 = IZ8.LJIILIIL.getValue();
                o.LJIIIIZZ(value2, "<get-BITRATE_FOR_LOW_DEVICE>(...)");
                if (LJJIIJ <= ((Number) value2).intValue()) {
                    arrayList.add(ListProtector.get(dashBitRate, i4));
                }
            }
            if (arrayList.size() != 0) {
                dashBitRate = arrayList;
            }
        }
        Object value3 = IZ8.LJIIL.getValue();
        o.LJIIIIZZ(value3, "<get-DISABLE_BYTEVC2_BY_RESOLUTION>(...)");
        int intValue = ((Number) value3).intValue();
        if (intValue > 0) {
            while (dashBitRate.iterator().hasNext()) {
                SimBitRate next = dashBitRate.iterator().next();
                if (next.isBytevc1() == 2 && O5Y.LJJIIJ(next.getQualityType(), next.getGearName()) > intValue) {
                    dashBitRate.iterator().remove();
                }
            }
        }
        C46980IcC c46980IcC = this.LIZ;
        if (c46980IcC != null) {
            dashBitRate = c46980IcC.LIZ(simVideoUrlModel.getSourceId(), dashBitRate);
        }
        C46664ITc c46664ITc = C46664ITc.LJIJ;
        String sourceId = simVideoUrlModel.getSourceId();
        synchronized (c46664ITc) {
            if (!TextUtils.isEmpty(sourceId)) {
                ArrayList arrayList2 = new ArrayList();
                if (dashBitRate != null && dashBitRate.size() > 0) {
                    arrayList2.addAll(dashBitRate);
                }
                c46664ITc.LJIIJJI.put(sourceId, arrayList2);
            }
        }
        if (dashBitRate.isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList(dashBitRate);
        Collections.sort(arrayList3, new IDComparatorS36S0000000_8(4));
        InterfaceC46631IRv superResolutionStrategy = C1DG.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategy();
        if (!z || (LIZ = superResolutionStrategy.LIZJ(simVideoUrlModel, arrayList3, i, z2, this)) == null) {
            LIZ = LIZ(simVideoUrlModel, arrayList3, null, i, z2);
        }
        InterfaceC46631IRv superResolutionStrategy2 = C1DG.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategy();
        if (LIZ != null && LIZ.LJLIL != null) {
            iyq = LIZ;
        }
        Session LIZIZ2 = c46664ITc.LIZIZ(simVideoUrlModel.getUri());
        if (z && superResolutionStrategy2 != null) {
            if (iyq != null) {
                IYN iyn = iyq.LJLIL;
                if (iyn instanceof SimBitRate) {
                    codecType = ((SimBitRate) iyn).getCodecType();
                    i2 = (int) ((SimBitRate) iyq.LJLIL).getFps();
                } else {
                    codecType = simVideoUrlModel.getCodecType();
                    i2 = 0;
                }
                int LIZIZ3 = superResolutionStrategy2.LIZIZ(simVideoUrlModel.getSourceId(), z2, (long) simVideoUrlModel.getDuration(), iyq.getQualityType(), iyq.getGearName(), simVideoUrlModel.getAspectRatio(), codecType, i2);
                if (LIZIZ2 != null) {
                    if (LIZIZ3 == 100) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    LIZIZ2.isOpenSuperResolution = z3;
                    LIZIZ2.preSuperResolution = LIZIZ3;
                }
                if (LIZIZ3 == 100 && LIZ != null && LIZ.LJLIL != null) {
                    LIZ.LJLJJLL = true;
                }
            } else if (LIZIZ2 != null) {
                LIZIZ2.preSuperResolution = 10;
            }
        } else if (LIZIZ2 != null) {
            LIZIZ2.preSuperResolution = 9;
        }
        LJFF(simVideoUrlModel, LIZ, arrayList3, z2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("final select:");
        if (iyq != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("bitRate=");
            LIZ3.append(iyq.getBitRate());
            LIZ3.append(", gearName=");
            LIZ3.append(iyq.getGearName());
            LIZ3.append(", qualityType=");
            LIZ3.append(iyq.getQualityType());
            LIZ3.append(", isBytevc1=");
            LIZ3.append(iyq.isBytevc1());
            str = X1D.LIZIZ(LIZ3);
        } else {
            str = "N/A";
        }
        LIZ2.append(str);
        LIZ2.append(", change reason:");
        if (LIZ == null) {
            str2 = "";
        } else {
            str2 = LIZ.LJLJL;
        }
        LIZ2.append(str2);
        X1D.LIZIZ(LIZ2);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("final select:");
        if (iyq != null) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("bitRate=");
            LIZ5.append(iyq.getBitRate());
            LIZ5.append(", gearName=");
            LIZ5.append(iyq.getGearName());
            LIZ5.append(", qualityType=");
            LIZ5.append(iyq.getQualityType());
            LIZ5.append(", isBytevc1=");
            LIZ5.append(iyq.isBytevc1());
            str3 = X1D.LIZIZ(LIZ5);
        } else {
            str3 = "N/A";
        }
        LIZ4.append(str3);
        LIZ4.append(", change reason:");
        if (LIZ == null) {
            str4 = "";
        } else {
            str4 = LIZ.LJLJL;
        }
        LIZ4.append(str4);
        X1D.LIZIZ(LIZ4);
        if (LIZ != null) {
            LIZ.LJLLILLLL = 1;
        }
        return iyq;
    }

    public static java.util.Map LIZIZ(SimVideoUrlModel simVideoUrlModel, double d, IY3 iy3, int i, List list) {
        int LIZLLL2 = IZ8.LIZLLL();
        float f = 1.0f;
        if (simVideoUrlModel != null && !TextUtils.isEmpty(simVideoUrlModel.getMeta())) {
            try {
                JSONObject json = IZG.from(simVideoUrlModel.getMeta()).getJson();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(1.0f);
                String optString = json.optString("qprf", X1D.LIZIZ(LIZ));
                if (!TextUtils.isEmpty(optString)) {
                    f = CastFloatProtector.parseFloat(optString);
                }
            } catch (Exception unused) {
            }
        }
        C46664ITc c46664ITc = C46664ITc.LJIJ;
        String sourceId = simVideoUrlModel.getSourceId();
        c46664ITc.getClass();
        if (!TextUtils.isEmpty(sourceId)) {
            c46664ITc.LJIILL.put(sourceId, Float.valueOf(f));
        }
        C46875IaV c46875IaV = new C46875IaV();
        if (d >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            ((HashMap) c46875IaV.LIZ).put("internet_speed", Integer.valueOf((int) d));
        }
        if (LIZLLL2 == 1) {
            ((HashMap) c46875IaV.LIZ).put("bitrate_adjust_factor_speed", Float.valueOf(f));
        } else if (LIZLLL2 == 2) {
            ((HashMap) c46875IaV.LIZ).put("bitrate_adjust_factor_calc", Float.valueOf(f));
        }
        HashMap hashMap = (HashMap) c46875IaV.LIZ;
        hashMap.put("source_id", simVideoUrlModel.getSourceId());
        hashMap.put("bitrate_quality_config", 1);
        if (iy3 != null) {
            hashMap.put("KEY_AUTO_BITRATE_SET", iy3);
        } else {
            hashMap.remove("KEY_AUTO_BITRATE_SET");
        }
        if (IZ8.LJJII()) {
            hashMap.put("select_type", Integer.valueOf(i));
            hashMap.put("sim_bitrate_list", list);
            hashMap.put("sim_video_url_model", simVideoUrlModel);
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04e3  */
    /* JADX WARN: Type inference failed for: r0v120, types: [X.IYN] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.util.LinkedHashMap, T] */
    /* JADX WARN: Type inference failed for: r0v79, types: [X.IaJ] */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.IaK] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, X.2Wf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.IYQ LIZ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r43, java.util.List<com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate> r44, com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet r45, final int r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46862IaI.LIZ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, java.util.List, com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet, int, boolean):X.IYQ");
    }
}
