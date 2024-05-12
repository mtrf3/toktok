package X;

import Y.IDcS16S0300000_5;
import android.content.Context;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BHj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28523BHj implements InterfaceC28918BWo {
    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 205;
    }

    public static void LIZJ(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_toggle_popup_click");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(str, "click_type");
        LIZ.LJJIIJZLJL();
    }

    public static void LIZLLL(DataChannel dataChannel) {
        String str;
        LiveMode liveMode;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_toggle_popup_show");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            str = C28509BGv.LIZ(liveMode);
        } else {
            str = "";
        }
        LIZ.LJIJJ(str, "live_type");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r4 != null) goto L7;
     */
    @Override // X.InterfaceC28918BWo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.BIK r9, X.AbstractC65782Prm r10) {
        /*
            r8 = this;
            X.XKg r2 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r10)
            r2.<init>(r0)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<com.bytedance.android.live.slot.model.ECBcToggleChannel> r0 = com.bytedance.android.live.slot.model.ECBcToggleChannel.class
            java.lang.Object r4 = r1.mv0(r0)
            X.BHn r4 = (X.C28527BHn) r4
            r5 = -1
            if (r4 == 0) goto L7c
            X.BHr r0 = r4.LIZ
            if (r0 == 0) goto L7c
            int r7 = r0.LIZJ
        L1c:
            X.BHr r0 = r4.LIZ
            if (r0 == 0) goto L22
            int r5 = r0.LJ
        L22:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r9.LIZIZ
            if (r1 == 0) goto L7a
            java.lang.Class<com.bytedance.android.live.LiveModeChannel> r0 = com.bytedance.android.live.LiveModeChannel.class
            java.lang.Object r6 = r1.kv0(r0)
        L2c:
            r0 = 2
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode[] r3 = new com.bytedance.android.livesdkapi.depend.model.live.LiveMode[r0]
            r1 = 0
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            r3[r1] = r0
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.THIRD_PARTY
            r1 = 1
            r3[r1] = r0
            java.util.List r0 = X.C47261Igj.LJJIJIIJI(r3)
            boolean r0 = X.ORZ.LJLJJI(r6, r0)
            if (r0 == 0) goto L5a
            boolean r0 = X.C78847Ux1.LJIIZILJ()
            if (r0 != 0) goto L5a
            if (r7 != r1) goto L5a
            android.content.Context r0 = r9.LIZ
            r8.LJ(r0, r2, r4, r9)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r9.LIZIZ
            LIZLLL(r0)
        L55:
            java.lang.Object r0 = r2.LIZ()
            return r0
        L5a:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
            if (r6 != r0) goto L71
            boolean r0 = X.C78847Ux1.LJIIZILJ()
            if (r0 != 0) goto L71
            if (r5 != r1) goto L71
            android.content.Context r0 = r9.LIZ
            r8.LJ(r0, r2, r4, r9)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r9.LIZIZ
            LIZLLL(r0)
            goto L55
        L71:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.C3C5.m7constructorimpl(r0)
            r2.resumeWith(r0)
            goto L55
        L7a:
            r6 = 0
            goto L2c
        L7c:
            r7 = -1
            if (r4 == 0) goto L22
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28523BHj.LIZIZ(X.BIK, X.Prm):java.lang.Object");
    }

    public final void LJ(Context context, C84654XKg c84654XKg, C28527BHn c28527BHn, BIK bik) {
        C78847Ux1.LJJJJJ(bik.LIZIZ, "show");
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LJ(R.drawable.coa);
        c47071t1.LJIILLIIL(R.string.lgf);
        c47071t1.LJFF(R.string.lge);
        c47071t1.LJIIL(R.string.lgk, new IDcS16S0300000_5(this, bik, c84654XKg, 3));
        c47071t1.LJIIIZ(R.string.lh2, new C28524BHk(c84654XKg, c28527BHn, this, bik));
        c47071t1.LJIILL = false;
        LiveDialog LIZ = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "3884114878137104677")).LIZ) {
            LIZ.show();
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJJLIIIIJ;
        Boolean bool = Boolean.TRUE;
        c48459J0d.LIZ(bool);
        InterfaceC30442Bx8.LJJLIIIJ.LIZ(bool);
    }
}
