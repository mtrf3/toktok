package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.ugc.android.editor.base.resource.ResourceItem;

/* renamed from: X.XEw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84514XEw implements IFetchEffectChannelListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC84517XEz<ResourceItem> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        Exception exc;
        int i;
        InterfaceC84517XEz<ResourceItem> interfaceC84517XEz = this.LIZIZ;
        if (interfaceC84517XEz != null) {
            if (exceptionResult != null) {
                exc = exceptionResult.getException();
                i = exceptionResult.getErrorCode();
            } else {
                exc = null;
                i = -1;
            }
            interfaceC84517XEz.LIZ(new C57M(exc, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x000f, code lost:
    
        if (r8 != null) goto L8;
     */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r8) {
        /*
            r7 = this;
            com.ss.ugc.effectplatform.model.EffectChannelResponse r8 = (com.ss.ugc.effectplatform.model.EffectChannelResponse) r8
            if (r8 == 0) goto La
            java.util.List r5 = r8.getAll_category_effects()
            if (r5 != 0) goto L11
        La:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r8 == 0) goto L51
        L11:
            java.util.List r6 = r8.getUrl_prefix()
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L51
            java.util.Iterator r4 = r5.iterator()
        L21:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r3 = r4.next()
            com.ss.ugc.effectplatform.model.Effect r3 = (com.ss.ugc.effectplatform.model.Effect) r3
            java.lang.String r1 = r3.getExtra()
            if (r1 == 0) goto L21
            boolean r0 = ujb.o.LJJJJJL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L21
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r1)
            java.lang.String r1 = "prefix"
            java.lang.Object r0 = X.ORZ.LJLLJ(r6)
            r2.put(r1, r0)
            java.lang.String r0 = r2.toString()
            r3.setExtra(r0)
            goto L21
        L51:
            java.lang.String r1 = r7.LIZ
            java.lang.String r0 = "panel"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.Map<java.lang.String, java.util.List<com.ss.ugc.effectplatform.model.Effect>> r0 = X.C84286X6c.LIZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.put(r1, r5)
            java.util.List r1 = X.C1296657a.LIZIZ(r5)
            X.XEz<com.ss.ugc.android.editor.base.resource.ResourceItem> r0 = r7.LIZIZ
            if (r0 == 0) goto L6a
            r0.onSuccess(r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84514XEw.onSuccess(java.lang.Object):void");
    }

    public C84514XEw(String str, C57A c57a) {
        this.LIZ = str;
        this.LIZIZ = c57a;
    }
}
