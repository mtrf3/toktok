package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Fe8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39456Fe8 implements IHostRouterDepend {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C39463FeF.LJLIL);

    public final IMainService LIZ() {
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-mMainServiceDepend>(...)");
        return (IMainService) value;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final AbstractC39461FeD provideRouteOpenExceptionHandler(C31926Cfy c31926Cfy) {
        return new C39460FeC();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final List<AbstractC39461FeD> provideRouteOpenHandlerList(C31926Cfy c31926Cfy) {
        return C47261Igj.LJJIJIIJI(new C39462FeE(), new C39465FeH(this, c31926Cfy), new C39459FeB(this), new C39458FeA(this, c31926Cfy), new C39457Fe9(this, c31926Cfy));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r4 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = 1
            r1 = 0
            if (r4 == 0) goto L33
            java.lang.String r0 = "__live_platform__%3Dwebcast"
            boolean r0 = ujb.s.LJJJLZIJ(r4, r0, r1)
            if (r0 != r2) goto L27
            boolean r0 = X.C35534Dx4.LIZIZ(r4)
            if (r0 == 0) goto L25
            int r0 = X.C35534Dx4.LIZ()
            if (r0 == r2) goto L1f
            int r1 = X.C35534Dx4.LIZ()
            r0 = 4
            if (r1 != r0) goto L25
        L1f:
            java.lang.String r0 = "&__live_platform__=webcast&use_spark=1"
            java.lang.String r4 = defpackage.i0.LJFF(r4, r0)
        L25:
            if (r4 == 0) goto L33
        L27:
            boolean r0 = X.C35546DxG.LIZLLL(r4)
            if (r0 == 0) goto L33
            java.lang.String r0 = "&use_spark=1"
            java.lang.String r4 = defpackage.i0.LJFF(r4, r0)
        L33:
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L42
            X.O0e r0 = X.C61200O0e.LIZLLL()
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r0 = r0.LJI(r3, r4)
        L41:
            return r0
        L42:
            X.O0e r0 = X.C61200O0e.LIZLLL()
            boolean r0 = r0.LJII(r4)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39456Fe8.LIZIZ(android.content.Context, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (r10.length() > 0) goto L36;
     */
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean closeView(X.C31926Cfy r8, X.EnumC37847EtH r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39456Fe8.closeView(X.Cfy, X.EtH, java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r0.LIZ().contains(X.EnumC37847EtH.ALL) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r0.LIZ().contains(r10) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r0 = r0.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r7 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r3 = r0.LIZIZ(r1, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r3 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r0 = r0.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        r0 = r0.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        r1 = (android.content.Context) r7.LIZ(android.content.Context.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        return r3;
     */
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean openSchema(X.C31926Cfy r7, java.lang.String r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, X.EnumC37847EtH r10, android.content.Context r11) {
        /*
            r6 = this;
            java.lang.String r0 = "schema"
            kotlin.jvm.internal.o.LJIIJ(r8, r0)
            java.lang.String r0 = "extraParams"
            kotlin.jvm.internal.o.LJIIJ(r9, r0)
            java.lang.String r0 = "platformType"
            kotlin.jvm.internal.o.LJIIJ(r10, r0)
            java.util.List r0 = r6.provideRouteOpenHandlerList(r7)
            X.FeD r5 = r6.provideRouteOpenExceptionHandler(r7)
            java.util.Iterator r3 = r0.iterator()
            r4 = 0
            r0 = r4
            r2 = r4
        L1e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r3.next()
            X.FeD r1 = (X.AbstractC39461FeD) r1
            if (r2 != 0) goto L31
            r0 = r1
        L2d:
            r1.LIZIZ = r5
            r2 = r1
            goto L1e
        L31:
            r2.LIZ = r1
            goto L2d
        L34:
            r3 = 0
            if (r0 == 0) goto L6c
        L37:
            java.util.List r2 = r0.LIZ()
            X.EtH r1 = X.EnumC37847EtH.ALL
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L4d
            java.util.List r1 = r0.LIZ()
            boolean r1 = r1.contains(r10)
            if (r1 == 0) goto L64
        L4d:
            if (r7 == 0) goto L50
            goto L52
        L50:
            r1 = r4
            goto L5a
        L52:
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r1 = r7.LIZ(r1)     // Catch: java.lang.Throwable -> L67
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L67
        L5a:
            boolean r3 = r0.LIZIZ(r1, r8, r9)     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L61
            goto L6c
        L61:
            X.FeD r0 = r0.LIZ     // Catch: java.lang.Throwable -> L67
            goto L69
        L64:
            X.FeD r0 = r0.LIZ
            goto L69
        L67:
            X.FeD r0 = r0.LIZIZ
        L69:
            if (r0 == 0) goto L6c
            goto L37
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39456Fe8.openSchema(X.Cfy, java.lang.String, java.util.Map, X.EtH, android.content.Context):boolean");
    }
}
