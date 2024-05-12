package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* renamed from: X.NvI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60904NvI {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Context context) {
        Object LLILL = C16880lQ.LLILL(context, "window");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:123:0x0327
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.BlO, X.Bks] */
    public static void LIZIZ(android.content.Context r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60904NvI.LIZIZ(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (com.bytedance.mt.protector.impl.collections.ListProtector.get(r1.LIZIZ, ((java.util.ArrayList) r1).size() - 1) == null) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(boolean r7, X.C31124CJk r8, com.bytedance.hybrid.spark.SparkContext r9, android.content.Context r10) {
        /*
            X.34K r3 = new X.34K
            r3.<init>()
            r3.element = r7
            X.0ev r1 = X.C12840eu.LIZ
            java.util.List<X.0et> r0 = r1.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 == 0) goto L4c
        L14:
            r0 = 1
            r3.element = r0
        L17:
            X.2mC r4 = new X.2mC
            r4.<init>()
            boolean r0 = r10 instanceof X.C29S
            if (r0 == 0) goto L2e
        L20:
            r4.element = r10
            kotlin.jvm.internal.AqS65S0400000_5 r2 = new kotlin.jvm.internal.AqS65S0400000_5
            r7 = 0
            r6 = r8
            r5 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            X.C29306Beo.LJJJ(r2)
            return
        L2e:
            X.1qj r0 = X.C29306Beo.LIZ(r10)
            if (r0 == 0) goto L39
            X.1qj r10 = X.C29306Beo.LIZ(r10)
            goto L20
        L39:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAction> r0 = com.bytedance.android.livesdkapi.host.IHostAction.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdkapi.host.IHostAction r0 = (com.bytedance.android.livesdkapi.host.IHostAction) r0
            android.app.Activity r1 = r0.getTopActivity()
            boolean r0 = r1 instanceof X.C29S
            if (r0 == 0) goto L4a
            r2 = r1
        L4a:
            r10 = r2
            goto L20
        L4c:
            java.util.List<X.0et> r1 = r1.LIZIZ
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r0 = r0 + (-1)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            if (r0 != 0) goto L17
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60904NvI.LIZJ(boolean, X.CJk, com.bytedance.hybrid.spark.SparkContext, android.content.Context):void");
    }
}
