package X;

import Y.ARunnableS32S0200000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkFinishReason;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiHostLeaveWhenRtcError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U7G implements InterfaceC76734U9q {
    public final /* synthetic */ U7F LIZ;

    @Override // X.InterfaceC76734U9q
    public final void LJIIL() {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILL(String str) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILLIIL(String str, String str2) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJIZL(LinkCoreError linkCoreError) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJJ(long j, String str) {
    }

    public U7G(U7F u7f) {
        this.LIZ = u7f;
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJI(LinkCoreError error) {
        o.LJIIIZ(error, "error");
        if (MultiHostLeaveWhenRtcError.INSTANCE.getValue()) {
            U7F u7f = this.LIZ;
            LeaveChannelData.Builder builder = new LeaveChannelData.Builder();
            builder.setLeaveSource(LinkFinishReason.Companion.stateToString(4));
            builder.setLeaveReason(4);
            u7f.LLLZZ(builder.build(), null);
        }
        U7F u7f2 = this.LIZ;
        u7f2.getClass();
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(u7f2, error, 100));
    }

    @Override // X.InterfaceC76734U9q
    public final void onFirstRemoteVideoFrameRender(String str) {
        UC7.LJ("firstRemoteVideoFrameRender linkMicId:", str, "CoLinker");
        this.LIZ.LJJ.put(str, Boolean.TRUE);
        this.LIZ.LJJJ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015f  */
    @Override // X.InterfaceC76734U9q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7G.LJIIJJI(java.lang.String, java.lang.String):void");
    }
}
