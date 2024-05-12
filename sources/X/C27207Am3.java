package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.engine.PageTemplateManger$loadTemplate$1", f = "PageTemplateManger.kt", l = {54, 58, 59}, m = "invokeSuspend")
/* renamed from: X.Am3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27207Am3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;

    public C27207Am3(InterfaceC67352kd<? super C27207Am3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27207Am3(interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r0 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        r6 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r6.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        r5 = r6.next();
        r0 = r5.template;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        X.C79057V0z.LJJJJIZL(r0.intValue(), X.C27206Am2.LIZLLL(), X.C27206Am2.LIZJ(r5.biz_line, r5.region, r5.page_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        return X.C76800UCe.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if (r0 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006c, code lost:
    
        if (r9 != null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x005c -> B:10:0x0062). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLILLLLZI
            r6 = 0
            r5 = 2
            r4 = 3
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto L2f
            if (r0 == r5) goto L1b
            if (r0 != r4) goto L13
            int r2 = r8.LJLIL
            goto L5f
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            int r2 = r8.LJLIL
            X.C141335gf.LIZJ(r9)
            goto L52
        L21:
            X.C141335gf.LIZJ(r9)
            X.Am9 r0 = com.ss.android.ugc.aweme.ecommerce.core.engine.TemplateApi.LIZ     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> Lbe
            r8.LJLILLLLZI = r3     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r9 = r0.LIZ(r8)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> Lbe
            if (r9 != r7) goto L32
            return r7
        L2f:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> Lbe
        L32:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r9 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r9     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> Lbe
            goto L36
        L35:
            r9 = r6
        L36:
            r2 = 1
        L37:
            if (r9 == 0) goto L43
            boolean r0 = r9.isCodeOK()
            if (r0 != r3) goto L43
            T r0 = r9.data
            if (r0 != 0) goto L6e
        L43:
            if (r2 > r4) goto L6c
            r8.LJLIL = r2
            r8.LJLILLLLZI = r5
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r8)
            if (r0 != r7) goto L52
            return r7
        L52:
            X.Am9 r0 = com.ss.android.ugc.aweme.ecommerce.core.engine.TemplateApi.LIZ     // Catch: java.lang.Throwable -> L65 java.util.concurrent.CancellationException -> L6a
            r8.LJLIL = r2     // Catch: java.lang.Throwable -> L65 java.util.concurrent.CancellationException -> L6a
            r8.LJLILLLLZI = r4     // Catch: java.lang.Throwable -> L65 java.util.concurrent.CancellationException -> L6a
            java.lang.Object r9 = r0.LIZ(r8)     // Catch: java.lang.Throwable -> L65 java.util.concurrent.CancellationException -> L6a
            if (r9 != r7) goto L62
            goto L69
        L5f:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> L65 java.util.concurrent.CancellationException -> L6a
        L62:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r9 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r9     // Catch: java.lang.Throwable -> L65 java.util.concurrent.CancellationException -> L6a
            goto L66
        L65:
            r9 = r6
        L66:
            int r2 = r2 + 1
            goto L37
        L69:
            return r7
        L6a:
            r0 = move-exception
            throw r0
        L6c:
            if (r9 == 0) goto L78
        L6e:
            T r0 = r9.data
            com.ss.android.ugc.aweme.ecommerce.core.engine.PreBizParserResponseData r0 = (com.ss.android.ugc.aweme.ecommerce.core.engine.PreBizParserResponseData) r0
            if (r0 == 0) goto L78
            java.util.List<com.ss.android.ugc.aweme.ecommerce.core.engine.BizParserInfo> r0 = r0.page_biz_list
            if (r0 != 0) goto L8e
        L78:
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.core.engine.PreBizParserResponseData> r2 = com.ss.android.ugc.aweme.ecommerce.core.engine.PreBizParserResponseData.class
            com.ss.android.ugc.aweme.ecommerce.core.engine.PreBizParserResponseData r1 = X.C58652Rx.LIZ
            java.lang.String r0 = "ecom_page_template_config"
            java.lang.Object r0 = r3.LJIIIIZZ(r0, r2, r1)
            com.ss.android.ugc.aweme.ecommerce.core.engine.PreBizParserResponseData r0 = (com.ss.android.ugc.aweme.ecommerce.core.engine.PreBizParserResponseData) r0
            if (r0 != 0) goto Lb9
        L8a:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.core.engine.BizParserInfo> r0 = r1.page_biz_list
            if (r0 == 0) goto Lbb
        L8e:
        L8f:
            java.util.Iterator r6 = r0.iterator()
        L93:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r5 = r6.next()
            com.ss.android.ugc.aweme.ecommerce.core.engine.BizParserInfo r5 = (com.ss.android.ugc.aweme.ecommerce.core.engine.BizParserInfo) r5
            java.lang.Integer r0 = r5.template
            if (r0 == 0) goto L93
            int r4 = r0.intValue()
            com.bytedance.keva.Keva r3 = X.C27206Am2.LIZLLL()
            java.lang.String r2 = r5.biz_line
            java.lang.String r1 = r5.region
            java.lang.String r0 = r5.page_name
            java.lang.String r0 = X.C27206Am2.LIZJ(r2, r1, r0)
            X.C79057V0z.LJJJJIZL(r4, r3, r0)
            goto L93
        Lb9:
            r1 = r0
            goto L8a
        Lbb:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lbe:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27207Am3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C27207Am3(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
