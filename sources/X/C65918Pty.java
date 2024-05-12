package X;

import Y.ARunnableS15S0101000_11;
import Y.ARunnableS3S1101000_11;
import com.bytedance.helios.common.utils.CostTimeline;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.service.INetworkApiService;

/* renamed from: X.Pty, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65918Pty {
    public static final java.util.Set<String> LIZ = C77275UUl.LJIIIIZZ("helios", "bpea", "rule");

    /* JADX WARN: Removed duplicated region for block: B:155:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C39519Ff9 LIZ(X.PYQ r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65918Pty.LIZ(X.PYQ, java.lang.String):X.Ff9");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01cc A[EDGE_INSN: B:172:0x01cc->B:109:0x01cc BREAK  A[LOOP:0: B:103:0x01b6->B:171:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0447 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0505  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C39519Ff9 LIZIZ(X.PYQ r29, com.bytedance.helios.common.utils.CostTimeline r30) {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65918Pty.LIZIZ(X.PYQ, com.bytedance.helios.common.utils.CostTimeline):X.Ff9");
    }

    public static void LIZJ(PYQ pyq, CostTimeline costTimeline) {
        C65902Pti c65902Pti;
        INetworkApiService iNetworkApiService;
        int i = pyq.LJJJJL().LJLIL.LIZ;
        if (pyq instanceof C65902Pti) {
            C65938PuI c65938PuI = pyq.LJJJJL().LJLJJLL;
            if ((c65938PuI.LJLIL || c65938PuI.LJLILLLLZI) && NetworkComponent.INSTANCE.isOffLineEnv() && (iNetworkApiService = (c65902Pti = (C65902Pti) pyq).LJLILLLLZI) != null) {
                iNetworkApiService.copyResponseBody(c65902Pti);
            }
        }
        CostTimeline.logCostTime$default(costTimeline, "handleCopyResponse", null, 0L, null, 14, null);
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS15S0101000_11(i, pyq, 11));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("id: ");
        LIZ2.append(i);
        LIZ2.append(" memberName:");
        LIZ2.append(pyq.LJJJJL().LJLIL.LIZLLL);
        LIZ2.append(" uuid:");
        LIZ2.append(pyq.LJJJJL().LL);
        costTimeline.logTotal("guardCost", X1D.LIZIZ(LIZ2));
        costTimeline.printLog("Helios:Network-Cost");
        HandlerThreadC65936PuG.LIZ();
        HandlerThreadC65936PuG.LJLILLLLZI.post(new ARunnableS3S1101000_11(i, costTimeline, "guard", 2));
    }
}
