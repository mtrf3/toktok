package X;

import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;

/* renamed from: X.Ng0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59956Ng0 implements InterfaceC60819Ntv {
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ TemplateData LJLJI;
    public final /* synthetic */ LynxViewClient LJLJJI;

    @Override // X.M2J
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (0 != 0) goto L14;
     */
    @Override // X.InterfaceC60819Ntv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.InterfaceC60710NsA r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C60606NqU
            if (r0 == 0) goto L6d
            boolean r0 = X.C52202KeE.LIZ
            r3 = 0
            r2 = 1
            if (r0 != r2) goto L44
            r4 = r6
            X.NqU r4 = (X.C60606NqU) r4
            X.NtS r0 = r5.LJLIL
            android.content.Context r0 = r0.getContext()
            int r1 = X.KL2.LJIIJJI(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.LJI = r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.LJFF = r0
            X.Ndj r1 = new X.Ndj
            r1.<init>()
            X.Ng3 r0 = X.EnumC59959Ng3.PART_ON_LAYOUT
            int r0 = r0.id()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZIZ = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.LIZ = r0
            r4.LJJIII = r1
        L44:
            java.lang.String r0 = r5.LJLILLLLZI
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.NullPointerException -> L59
            java.lang.String r0 = "async_create_view"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.NullPointerException -> L59
            if (r0 == 0) goto L60
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.NullPointerException -> L59
            if (r0 != r2) goto L60
            goto L5b
        L59:
            if (r3 == 0) goto L60
        L5b:
            r0 = r6
            X.NqU r0 = (X.C60606NqU) r0
            r0.LJIIJJI = r2
        L60:
            X.NqU r6 = (X.C60606NqU) r6
            com.lynx.tasm.TemplateData r0 = r5.LJLJI
            r6.LJIIIIZZ = r0
            com.lynx.tasm.LynxViewClient r0 = r5.LJLJJI
            if (r0 == 0) goto L6d
            r6.LJI(r0)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59956Ng0.LJIL(X.NsA):void");
    }

    public C59956Ng0(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, String str, TemplateData templateData, LynxViewClient lynxViewClient) {
        this.LJLIL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LJLILLLLZI = str;
        this.LJLJI = templateData;
        this.LJLJJI = lynxViewClient;
    }
}
