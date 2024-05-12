package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EBL {
    public static final EBL LIZ = new EBL();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(EBO.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(EBP.LJLIL);

    static {
        java.util.Set services = ServiceManager.get().getServices(ISmartCheckService.class);
        o.LJFF(services, "ServiceManager.get().get…ices(SERVICE::class.java)");
        for (Object obj : services) {
            LIZ.getClass();
            ((ConcurrentHashMap) LIZJ.getValue()).put(obj, Boolean.valueOf(C35588Dxw.LIZ().getEnable()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.EBN
            if (r0 == 0) goto Lad
            r7 = r11
            X.EBN r7 = (X.EBN) r7
            int r2 = r7.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lad
            int r2 = r2 - r1
            r7.LJLJI = r2
        L12:
            java.lang.Object r2 = r7.LJLIL
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJI
            r6 = 1
            if (r0 == 0) goto L4a
            if (r0 != r6) goto Lb4
            X.C141335gf.LIZJ(r2)
        L20:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.String r0 = "successes"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "finish init: "
            r1.append(r0)
            java.lang.String r3 = ","
            r4 = 0
            r7 = 62
            r5 = r4
            r6 = r4
            java.lang.String r0 = X.ORZ.LLD(r2, r3, r4, r5, r6, r7)
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
        L47:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4a:
            X.C141335gf.LIZJ(r2)
            com.ss.android.ugc.aweme.ecommerce.smartcheck.core.SmartCheckSettingModel r0 = X.C35588Dxw.LIZ()
            boolean r0 = r0.getEnable()
            if (r0 != 0) goto L5a
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5a:
            X.Ol8 r0 = X.EBL.LIZIZ
            java.lang.Object r1 = r0.getValue()
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r6)
            if (r0 == 0) goto L47
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.Ol8 r0 = X.EBL.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.util.Set r1 = r0.keySet()
            java.lang.String r0 = "checkServices.keys"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r5 = r1.iterator()
        L83:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService r4 = (com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService) r4
            X.XIA r0 = X.C78613UtF.LIZJ
            X.2gm r3 = X.C48841JEv.LIZ(r0)
            X.EBQ r2 = new X.EBQ
            r1 = 0
            r2.<init>(r4, r1)
            r0 = 3
            X.XKn r0 = X.XKX.LIZIZ(r3, r1, r1, r2, r0)
            r9.add(r0)
            goto L83
        La4:
            r7.LJLJI = r6
            java.lang.Object r2 = X.T1W.LIZ(r9, r7)
            if (r2 != r8) goto L20
            return r8
        Lad:
            X.EBN r7 = new X.EBN
            r7.<init>(r10, r11)
            goto L12
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EBL.LIZIZ(X.2kd):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:19:0x012b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r13, boolean r14, X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EBL.LIZ(java.lang.String, boolean, X.2kd):java.lang.Object");
    }
}
