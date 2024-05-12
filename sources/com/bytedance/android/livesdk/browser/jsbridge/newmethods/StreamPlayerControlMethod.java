package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38127Exn;
import X.B35;
import X.B57;
import X.BUH;
import X.C38131Exr;
import X.C76800UCe;
import X.CN1;
import X.InterfaceC28738BPq;
import X.InterfaceC29266BeA;
import X.InterfaceC65349Pkn;
import android.app.Activity;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;
import ql1.IDbS495S0100000_5;

/* loaded from: classes6.dex */
public final class StreamPlayerControlMethod extends AbstractC38127Exn<State, Object> implements InterfaceC29266BeA {
    @Override // X.InterfaceC29266BeA
    public void onBridgeRelease() {
        Activity activity;
        if (BUH.LIZ == null) {
            return;
        }
        String str = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str);
        B35 LIZLLL = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Wp().LIZLLL(str);
        State state = BUH.LIZ;
        if (state != null) {
            if (LIZIZ != null && state.getMute() != LIZIZ.isMute()) {
                LIZIZ.LJJJJ(str, "restore mute from JSB", state.getMute());
            }
            if (LIZLLL == null || (!state.getPause()) != LIZLLL.isPlaying()) {
                if (state.getPause()) {
                    IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
                    if (iHostAction != null) {
                        activity = iHostAction.getTopActivity();
                    } else {
                        activity = null;
                    }
                    if (LIZLLL != null) {
                        LIZLLL.stopWhenJoinInteract(activity);
                    }
                } else if (LIZLLL != null) {
                    LIZLLL.tryResumePlay();
                }
            }
        }
        BUH.LIZ = null;
    }

    /* loaded from: classes6.dex */
    public static final class State {

        @InterfaceC65349Pkn("mute")
        public boolean mute;

        @InterfaceC65349Pkn("pause")
        public boolean pause;

        public final boolean getMute() {
            return this.mute;
        }

        public final boolean getPause() {
            return this.pause;
        }

        public final void setMute(boolean z) {
            this.mute = z;
        }

        public final void setPause(boolean z) {
            this.pause = z;
        }
    }

    public StreamPlayerControlMethod() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamPlayerControlMethod(SparkContext sparkContext) {
        this();
        o.LJIIIZ(sparkContext, "sparkContext");
        sparkContext.LJJI(new IDbS495S0100000_5(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x005f, code lost:
    
        if ((!r7.getPause()) == r5.isPlaying()) goto L10;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke2(com.bytedance.android.livesdk.browser.jsbridge.newmethods.StreamPlayerControlMethod.State r7, X.C38131Exr r8) {
        /*
            r6 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.BLz r0 = X.B57.LIZ
            com.bytedance.android.livesdkapi.session.EnterRoomLinkSession r0 = r0.LIZ()
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r0.mEnterRoomConfig
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            java.lang.String r4 = r0.warmUpPlayerTag
            java.lang.Class<com.bytedance.android.live.livepullstream.api.IPullStreamService> r0 = com.bytedance.android.live.livepullstream.api.IPullStreamService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.livepullstream.api.IPullStreamService r0 = (com.bytedance.android.live.livepullstream.api.IPullStreamService) r0
            X.BQ9 r0 = r0.Tx()
            X.BPq r3 = r0.LIZIZ(r4)
            java.lang.Class<com.bytedance.android.live.livepullstream.api.IPullStreamService> r0 = com.bytedance.android.live.livepullstream.api.IPullStreamService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.livepullstream.api.IPullStreamService r0 = (com.bytedance.android.live.livepullstream.api.IPullStreamService) r0
            X.BMZ r0 = r0.Wp()
            X.B35 r5 = r0.LIZLLL(r4)
            if (r5 == 0) goto L88
            if (r3 == 0) goto L55
            boolean r0 = r5.isPlaying()
            r2 = r0 ^ 1
            boolean r1 = r3.isMute()
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.StreamPlayerControlMethod$State r0 = X.BUH.LIZ
            if (r0 != 0) goto L55
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.StreamPlayerControlMethod$State r0 = new com.bytedance.android.livesdk.browser.jsbridge.newmethods.StreamPlayerControlMethod$State
            r0.<init>()
            r0.setPause(r2)
            r0.setMute(r1)
            X.BUH.LIZ = r0
        L55:
            boolean r0 = r7.getPause()
            r1 = r0 ^ 1
            boolean r0 = r5.isPlaying()
            if (r1 != r0) goto L88
        L61:
            if (r3 == 0) goto L6d
            boolean r1 = r7.getMute()
            boolean r0 = r3.isMute()
            if (r1 != r0) goto L6e
        L6d:
            return
        L6e:
            boolean r2 = r7.getMute()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "set mute from JSB , current hybrid page url is "
            r1.append(r0)
            java.lang.String r0 = r8.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r3.LJJJJ(r4, r0, r2)
            goto L6d
        L88:
            boolean r0 = r7.getPause()
            if (r0 == 0) goto L96
            if (r5 == 0) goto L61
            android.content.Context r0 = r8.LIZ
            r5.stopWhenJoinInteract(r0)
            goto L61
        L96:
            if (r5 == 0) goto L61
            r5.tryResumePlay()
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.StreamPlayerControlMethod.invoke2(com.bytedance.android.livesdk.browser.jsbridge.newmethods.StreamPlayerControlMethod$State, X.Exr):void");
    }

    @Override // X.AbstractC38127Exn
    public /* bridge */ /* synthetic */ Object invoke(State state, C38131Exr c38131Exr) {
        invoke2(state, c38131Exr);
        return C76800UCe.LIZ;
    }
}
