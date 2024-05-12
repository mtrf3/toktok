package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.api.LinkInviteSuccessEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;

/* renamed from: X.Tkq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75544Tkq implements InterfaceC75754ToE {
    public final /* synthetic */ C75749To9 LIZ;
    public final /* synthetic */ DataChannel LIZIZ;
    public final /* synthetic */ WeakReference<Context> LIZJ;

    @Override // X.InterfaceC75754ToE
    public final void LIZ() {
        if (this.LIZ.LJ == EnumC75614Tly.ACTIVITY) {
            C73943T0h.LIZ().LIZIZ(new C32184Ck8(200, "Success", true));
        }
        this.LIZIZ.pv0(LinkInviteSuccessEvent.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L25;
     */
    @Override // X.InterfaceC75754ToE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.Throwable r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException
            if (r0 != 0) goto L8
            boolean r0 = r7 instanceof X.C46344IGu
            if (r0 == 0) goto L9
        L8:
            return
        L9:
            java.lang.ref.WeakReference<android.content.Context> r0 = r6.LIZJ
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            boolean r0 = r7 instanceof X.C276516r
            r4 = 0
            if (r0 == 0) goto L62
            r0 = r7
            X.16r r0 = (X.C276516r) r0
            int r3 = r0.getErrorCode()
        L1d:
            java.lang.String r5 = ""
            if (r1 == 0) goto L3d
            if (r7 == 0) goto L38
            boolean r0 = r7 instanceof X.C29401Dk
            if (r0 == 0) goto L52
            X.1Dk r7 = (X.C29401Dk) r7
            java.lang.String r2 = r7.getAlert()
            java.lang.String r1 = r7.getPrompt()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L5a
            r5 = r2
        L38:
            java.lang.String r0 = "getHandleExceptionMsg(contextGet, exception)"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
        L3d:
            X.To9 r0 = r6.LIZ
            X.Tly r1 = r0.LJ
            X.Tly r0 = X.EnumC75614Tly.ACTIVITY
            if (r1 != r0) goto L64
            X.T0h r1 = X.C73943T0h.LIZ()
            X.Ck8 r0 = new X.Ck8
            r0.<init>(r3, r5, r4)
            r1.LIZIZ(r0)
            goto L8
        L52:
            r0 = 2131847291(0x7f11687b, float:1.9328055E38)
            java.lang.String r1 = r1.getString(r0)
            goto L60
        L5a:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L38
        L60:
            r5 = r1
            goto L38
        L62:
            r3 = 0
            goto L1d
        L64:
            X.C30868C9o.LJI(r5)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75544Tkq.LIZIZ(java.lang.Throwable):void");
    }

    public C75544Tkq(C75749To9 c75749To9, DataChannel dataChannel, WeakReference<Context> weakReference) {
        this.LIZ = c75749To9;
        this.LIZIZ = dataChannel;
        this.LIZJ = weakReference;
    }
}
