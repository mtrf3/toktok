package X;

import com.ss.android.ugc.aweme.relation.api.IMafUserApi;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import com.ss.android.ugc.aweme.relation.storage.IRelationStorageService;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Mox, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57963Mox {
    public final C57988MpM LIZ;
    public final InterfaceC70422pa LIZIZ;
    public final IRelationStorageService LIZJ;
    public final IMafUserApi LIZLLL;
    public final C55387LoV LJ;
    public final java.util.Set<String> LJFF;
    public boolean LJI;
    public XLM LJII;
    public C57971Mp5 LJIIIIZZ;
    public C57971Mp5 LJIIIZ;
    public C57967Mp1 LJIIJ;

    public final C57967Mp1 LIZIZ() {
        C57967Mp1 c57967Mp1 = this.LJIIJ;
        if (c57967Mp1 != null) {
            return c57967Mp1;
        }
        o.LJIJI("defaultParams");
        throw null;
    }

    public final void LJFF(InterfaceC88472Yns<? super C57970Mp4, C57970Mp4> interfaceC88472Yns) {
        XLM xlm = this.LJII;
        if (xlm != null) {
            C57970Mp4 invoke = interfaceC88472Yns.invoke(xlm.getValue());
            AYY ayy = AYY.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("update to new state: ");
            LIZ.append(invoke);
            String LIZIZ = X1D.LIZIZ(LIZ);
            ayy.getClass();
            AYY.LIZIZ("MafSource", LIZIZ);
            XLM xlm2 = this.LJII;
            if (xlm2 != null) {
                xlm2.setValue(invoke);
                return;
            } else {
                o.LJIJI("_state");
                throw null;
            }
        }
        o.LJIJI("_state");
        throw null;
    }

    public C57963Mox(C57988MpM c57988MpM, InterfaceC70422pa coroutineScope) {
        AnonymousClass393 storageService = AnonymousClass393.LIZIZ;
        MafUserApiService service = MafUserApiService.LIZIZ;
        C55387LoV c55387LoV = C54960Lhc.LIZ;
        o.LJIIIZ(coroutineScope, "coroutineScope");
        o.LJIIIZ(storageService, "storageService");
        o.LJIIIZ(service, "service");
        this.LIZ = c57988MpM;
        this.LIZIZ = coroutineScope;
        this.LIZJ = storageService;
        this.LIZLLL = service;
        this.LJ = c55387LoV;
        this.LJFF = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C57967Mp1 r21, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.relation.model.MaFListResponse> r22) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57963Mox.LIZ(X.Mp1, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C57972Mp6 r15, X.InterfaceC67352kd<? super X.C57971Mp5> r16) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57963Mox.LJ(X.Mp6, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C57972Mp6 r9, java.util.Set<java.lang.String> r10, X.InterfaceC67352kd<? super X.C57971Mp5> r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57963Mox.LIZLLL(X.Mp6, java.util.Set, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009a A[Catch: all -> 0x0143, TryCatch #1 {all -> 0x0143, blocks: (B:12:0x008d, B:14:0x009a, B:15:0x009e, B:16:0x00b1, B:18:0x00b7, B:20:0x00c3, B:22:0x00c7, B:26:0x00d4, B:28:0x00e6, B:30:0x00ec, B:32:0x00f2, B:34:0x0100, B:35:0x0116, B:42:0x0112, B:51:0x004e), top: B:50:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7 A[Catch: all -> 0x0143, TryCatch #1 {all -> 0x0143, blocks: (B:12:0x008d, B:14:0x009a, B:15:0x009e, B:16:0x00b1, B:18:0x00b7, B:20:0x00c3, B:22:0x00c7, B:26:0x00d4, B:28:0x00e6, B:30:0x00ec, B:32:0x00f2, B:34:0x0100, B:35:0x0116, B:42:0x0112, B:51:0x004e), top: B:50:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100 A[Catch: all -> 0x0143, TryCatch #1 {all -> 0x0143, blocks: (B:12:0x008d, B:14:0x009a, B:15:0x009e, B:16:0x00b1, B:18:0x00b7, B:20:0x00c3, B:22:0x00c7, B:26:0x00d4, B:28:0x00e6, B:30:0x00ec, B:32:0x00f2, B:34:0x0100, B:35:0x0116, B:42:0x0112, B:51:0x004e), top: B:50:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[Catch: all -> 0x0143, TryCatch #1 {all -> 0x0143, blocks: (B:12:0x008d, B:14:0x009a, B:15:0x009e, B:16:0x00b1, B:18:0x00b7, B:20:0x00c3, B:22:0x00c7, B:26:0x00d4, B:28:0x00e6, B:30:0x00ec, B:32:0x00f2, B:34:0x0100, B:35:0x0116, B:42:0x0112, B:51:0x004e), top: B:50:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C57972Mp6 r21, X.C57967Mp1 r22, java.util.Set<java.lang.String> r23, X.InterfaceC67352kd<? super X.C57971Mp5> r24) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57963Mox.LIZJ(X.Mp6, X.Mp1, java.util.Set, X.2kd):java.lang.Object");
    }
}
