package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BX3 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ C29163BcV LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BX3(Context context, DataChannel dataChannel, C29163BcV c29163BcV, String str) {
        super(0);
        this.LJLIL = context;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = c29163BcV;
        this.LJLJJI = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (r1.booleanValue() != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    @Override // X.InterfaceC65784Pro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke() {
        /*
            r10 = this;
            r2 = 0
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> La
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto La
            goto Lc
        La:
            r4 = 0
            goto L25
        Lc:
            X.CdP r1 = new X.CdP
            android.content.Context r0 = r10.LJLIL
            r1.<init>(r0)
            r0 = 2131847503(0x7f11694f, float:1.9328485E38)
            java.lang.String r0 = X.C15380j0.LJIILJJIL(r0)
            r1.LIZIZ = r0
            X.Ce9 r4 = r1.LIZ()
            if (r4 == 0) goto L25
            X.C29306Beo.LJJJJIZL(r4)
        L25:
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r10.LJLILLLLZI
            java.lang.Class<com.bytedance.android.livesdk.broadcast.IsPreviewStartTryMode> r1 = com.bytedance.android.livesdk.broadcast.IsPreviewStartTryMode.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.rv0(r1, r0)
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.s3
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "TRY_MODE_CO_HOST_WEBP_SHOW.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L7a
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.u3
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "TRY_MODE_INTERACTION_WEBP_SHOW.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L7a
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.v3
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "TRY_MODE_GIFTS_WEBP_SHOW.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L7a
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.t3
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "TRY_MODE_MULTI_GUEST_WEBP_SHOW.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L7b
        L7a:
            r2 = 1
        L7b:
            X.BP4 r0 = X.C28718BOw.LIZ()
            com.bytedance.android.livesdk.api.BroadcastRoomApi r0 = r0.LIZ()
            X.Svk r0 = r0.mockTryModeRoom(r2)
            X.Svk r2 = X.C1EW.LIZ(r0)
            Y.AfS7S1400000_5 r3 = new Y.AfS7S1400000_5
            com.bytedance.ies.sdk.datachannel.DataChannel r5 = r10.LJLILLLLZI
            X.BcV r6 = r10.LJLJI
            android.content.Context r8 = r10.LJLIL
            java.lang.String r7 = r10.LJLJJI
            r9 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            Y.AfS54S0200000_5 r1 = new Y.AfS54S0200000_5
            r0 = 73
            r1.<init>(r4, r5, r0)
            r2.LJJJLIIL(r3, r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BX3.invoke():java.lang.Object");
    }
}
