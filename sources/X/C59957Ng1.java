package X;

import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;

/* renamed from: X.Ng1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59957Ng1 implements InterfaceC60819Ntv {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;
    public final /* synthetic */ TemplateData LJLJI;
    public final /* synthetic */ LynxViewClient LJLJJI;
    public final /* synthetic */ JTD LJLJJL;

    @Override // X.M2J
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (0 != 0) goto L24;
     */
    @Override // X.InterfaceC60819Ntv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.InterfaceC60710NsA r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C60606NqU
            if (r0 == 0) goto Lb1
            java.lang.String r1 = r7.LJLIL
            java.lang.String r0 = "search-result-mask"
            r3 = 0
            boolean r0 = ujb.s.LJJJLZIJ(r1, r0, r3)
            r2 = 1
            if (r0 != 0) goto L57
            boolean r0 = X.C52202KeE.LIZ
            if (r0 != r2) goto L57
            r5 = r8
            X.NqU r5 = (X.C60606NqU) r5
            X.NtS r0 = r7.LJLILLLLZI
            android.content.Context r0 = r0.getContext()
            int r1 = X.KL2.LJIIJJI(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.LJI = r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.LJFF = r0
            X.Ndj r4 = new X.Ndj
            r4.<init>()
            java.lang.String r6 = r7.LJLIL
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L5b
        L45:
            X.Ng3 r0 = X.EnumC59959Ng3.PART_ON_LAYOUT
            int r0 = r0.id()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L4f:
            r4.LIZIZ = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.LIZ = r0
            r5.LJJIII = r4
        L57:
            java.lang.String r0 = r7.LJLIL
            goto L86
        L5b:
            X.Ol8 r0 = X.L4J.LIZIZ
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = X.JWA.LIZ(r6)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L45
            android.os.Looper r1 = X.C16880lQ.LLJJJJ()
            android.os.Looper r0 = android.os.Looper.myLooper()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L45
            X.Ng3 r0 = X.EnumC59959Ng3.MULTI_THREADS
            int r0 = r0.id()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L4f
        L86:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.NullPointerException -> L99
            java.lang.String r0 = "async_create_view"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.NullPointerException -> L99
            if (r0 == 0) goto La0
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.NullPointerException -> L99
            if (r0 != r2) goto La0
            goto L9b
        L99:
            if (r3 == 0) goto La0
        L9b:
            r0 = r8
            X.NqU r0 = (X.C60606NqU) r0
            r0.LJIIJJI = r2
        La0:
            X.NqU r8 = (X.C60606NqU) r8
            com.lynx.tasm.TemplateData r0 = r7.LJLJI
            r8.LJIIIIZZ = r0
            com.lynx.tasm.LynxViewClient r0 = r7.LJLJJI
            if (r0 == 0) goto Lad
            r8.LJI(r0)
        Lad:
            X.JTD r0 = r7.LJLJJL
            r8.LJIJJ = r0
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59957Ng1.LJIL(X.NsA):void");
    }

    public C59957Ng1(String str, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, TemplateData templateData, LynxViewClient lynxViewClient, JTD jtd) {
        this.LJLIL = str;
        this.LJLILLLLZI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LJLJI = templateData;
        this.LJLJJI = lynxViewClient;
        this.LJLJJL = jtd;
    }
}
