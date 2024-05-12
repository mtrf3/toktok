package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.49y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1049449y {
    public static final C113114cF LIZJ = C113114cF.LJLIL;
    public final InterfaceC88471Ynr<Context, String, Boolean> LIZ;
    public final InterfaceC88471Ynr<Context, String, Boolean> LIZIZ;

    public C1049449y() {
        this(null);
    }

    public C1049449y(Object obj) {
        C1044147x c1044147x = new C1044147x(C1043247o.LIZ);
        C113114cF deeplinkOpener = LIZJ;
        o.LJIIIZ(deeplinkOpener, "deeplinkOpener");
        this.LIZ = deeplinkOpener;
        this.LIZIZ = c1044147x;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:22:0x0048
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    public final boolean LIZ(android.content.Context r5, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r6) {
        /*
            r4 = this;
            java.lang.String r0 = "actionLinkComponent"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.util.List<java.lang.String> r0 = r6.data
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 == 0) goto L1b
        Le:
            android.app.Activity r1 = X.C45804HyK.LJIJJ(r5)
            if (r1 == 0) goto L1a
            r0 = 2131828200(0x7f111de8, float:1.9289334E38)
            X.AnonymousClass114.LIZ(r1, r0)
        L1a:
            return r3
        L1b:
            java.util.List<java.lang.String> r0 = r6.data
            java.util.Iterator r2 = r0.iterator()
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L21
        L34:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L3b
            goto Le
        L39:
            r1 = 0
            goto L34
        L3b:
            java.lang.String r2 = android.net.Uri.decode(r1)
            if (r2 != 0) goto L42
            goto Le
        L42:
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType r1 = r6.linkType
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType.DEEP_LINK
            if (r1 != r0) goto L70
        L49:
            java.lang.String r1 = "inc_landing_page_onelink_click"
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            X.C26408AYa.LJIIIIZZ(r1, r2, r0)     // Catch: java.lang.Throwable -> L70
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L61
            java.lang.String r0 = "media_source"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L63
        L61:
            java.lang.String r0 = ""
        L63:
            X.C26408AYa.LJFF(r2, r0, r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "inc_activity_start"
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            X.C26408AYa.LJI(r1, r2, r0)     // Catch: java.lang.Throwable -> L70
        L70:
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType r0 = r6.linkType
            int[] r1 = X.C112994c3.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L83;
                case 2: goto L90;
                case 3: goto Le;
                case 4: goto Le;
                case 5: goto Le;
                case 6: goto Le;
                default: goto L7d;
            }
        L7d:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        L83:
            X.Ynr<android.content.Context, java.lang.String, java.lang.Boolean> r0 = r4.LIZ
            java.lang.Object r0 = r0.invoke(r5, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            goto L9c
        L90:
            X.Ynr<android.content.Context, java.lang.String, java.lang.Boolean> r0 = r4.LIZIZ
            java.lang.Object r0 = r0.invoke(r5, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
        L9c:
            if (r3 != 0) goto L1a
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1049449y.LIZ(android.content.Context, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent):boolean");
    }
}
