package X;

import Y.AfS57S0100000_5;
import Y.IDAListenerS39S0200000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSimplifiedGoLivePageSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.ChB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32001ChB implements InterfaceViewOnClickListenerC30227Btf {
    public final Room LJLIL;
    public final DataChannel LJLILLLLZI;
    public boolean LJLJI;
    public C73411SrX LJLJJI;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public final void LIZ() {
        if (this.LJLILLLLZI != null) {
            C32004ChE c32004ChE = new C32004ChE(null);
            if (this.LJLJI) {
                c32004ChE.LJIIIIZZ = C32003ChD.LIZ;
            }
            c32004ChE.LIZIZ = "icon";
            c32004ChE.LJI = C31120CJg.LIZ.cx();
            c32004ChE.LJIIL = SystemClock.uptimeMillis();
            this.LJLILLLLZI.qv0(SendGiftEvent.class, c32004ChE);
        }
        EnumC32619Cr9 enumC32619Cr9 = EnumC32619Cr9.NORMAL;
        EnumC32607Cqx enumC32607Cqx = EnumC32607Cqx.EVENT;
        if (this.LJLJI) {
            enumC32619Cr9 = EnumC32619Cr9.ANIMATION;
            enumC32607Cqx = EnumC32607Cqx.WEEKLY_RANKING_GIFT;
        }
        C32000ChA.LIZ(this.LJLIL, enumC32619Cr9, enumC32607Cqx);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r3.LJLILLLLZI
            boolean r0 = X.C29306Beo.LJJII(r0)
            if (r0 == 0) goto L8e
            boolean r0 = X.C78540Us4.LJJIII()
            if (r0 == 0) goto L8e
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.v3
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "TRY_MODE_GIFTS_WEBP_SHOW.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L8e
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            X.0Mx r2 = X.CN1.LIZ(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r2 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r2
            Y.ACListenerS25S0100000_5 r1 = new Y.ACListenerS25S0100000_5
            r0 = 420(0x1a4, float:5.89E-43)
            r1.<init>(r3, r0)
            java.lang.String r0 = "gift"
            com.bytedance.android.livesdk.LiveDialogFragment r2 = r2.createTryModeEducationDialogFragment(r0, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r3.LJLILLLLZI
            androidx.fragment.app.FragmentManager r1 = X.C29306Beo.LJFF(r0)
            if (r1 == 0) goto L48
            java.lang.String r0 = "try_mode_gift_anchor_manage_dialog"
            r2.show(r1, r0)
        L48:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r3.LJLILLLLZI
            if (r0 == 0) goto L8d
            com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt r0 = com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt.INSTANCE
            boolean r0 = r0.getEnable()
            if (r0 != 0) goto L5b
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LJLILLLLZI
            java.lang.Class<com.bytedance.android.live.gift.ResetSilentTimerEvent> r0 = com.bytedance.android.live.gift.ResetSilentTimerEvent.class
            r1.pv0(r0)
        L5b:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LJLILLLLZI
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel> r0 = com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel.class
            java.lang.Object r1 = r1.kv0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L8d
            java.lang.String r0 = "livesdk_anchor_gift_click"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r3.LJLILLLLZI
            r2.LJIILLIIL(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r3.LJLIL
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = r0.getStreamType()
            java.lang.String r0 = "mRoom.streamType"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r1 = X.C28509BGv.LIZ(r1)
            java.lang.String r0 = "live_type"
            r2.LJIJJ(r1, r0)
            r2.LJJIIJZLJL()
        L8d:
            return
        L8e:
            r3.LIZ()
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32001ChB.onClick(android.view.View):void");
    }

    public C32001ChB(Room mRoom, DataChannel dataChannel) {
        o.LJIIIZ(mRoom, "mRoom");
        this.LJLIL = mRoom;
        this.LJLILLLLZI = dataChannel;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        C73411SrX c73411SrX = this.LJLJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        String str;
        ImageModel imageModel;
        o.LJIIIZ(dataChannel, "dataChannel");
        if (C32003ChD.LIZIZ) {
            this.LJLJI = true;
            C47061t0 weeklyRankingGiftImage = (C47061t0) interfaceC30237Btp.LIZ(R.id.nij);
            o.LJIIIIZZ(weeklyRankingGiftImage, "weeklyRankingGiftImage");
            IDAListenerS39S0200000_5 iDAListenerS39S0200000_5 = new IDAListenerS39S0200000_5(weeklyRankingGiftImage, this, 3);
            Gift findGiftById = GiftManager.inst().findGiftById(C32003ChD.LIZ);
            ImageModel imageModel2 = null;
            if (findGiftById != null) {
                imageModel = findGiftById.image;
            } else {
                imageModel = null;
            }
            C15620jO.LIZIZ(imageModel, weeklyRankingGiftImage);
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(weeklyRankingGiftImage, (Property<C47061t0, Float>) View.SCALE_X, 1.0f, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(weeklyRankingGiftImage, (Property<C47061t0, Float>) View.SCALE_Y, 1.0f, 0.0f);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.setStartDelay(7200L);
            animatorSet.setDuration(250L);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(iDAListenerS39S0200000_5);
            IDAListenerS39S0200000_5 iDAListenerS39S0200000_52 = new IDAListenerS39S0200000_5(weeklyRankingGiftImage, animatorSet, 2);
            Gift findGiftById2 = GiftManager.inst().findGiftById(C32003ChD.LIZ);
            if (findGiftById2 != null) {
                imageModel2 = findGiftById2.image;
            }
            C15620jO.LIZIZ(imageModel2, weeklyRankingGiftImage);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(weeklyRankingGiftImage, (Property<C47061t0, Float>) View.SCALE_X, 0.0f, 1.15f, 0.9f, 1.04f, 0.98f, 1.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(weeklyRankingGiftImage, (Property<C47061t0, Float>) View.SCALE_Y, 0.0f, 1.15f, 0.9f, 1.04f, 0.98f, 1.0f);
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            animatorSet2.setDuration(1200L);
            animatorSet2.playTogether(ofFloat3, ofFloat4);
            animatorSet2.addListener(iDAListenerS39S0200000_52);
            this.LJLJJI = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(700L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(animatorSet2, 326));
        }
        if (this.LJLIL.getStreamType().isUsingCamera && LiveSimplifiedGoLivePageSetting.INSTANCE.enableSimplifiedGoLivePageV1orV2()) {
            str = "settings";
        } else {
            str = "outside";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_gift_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(str, "position");
        LIZ.LJJIIJZLJL();
    }
}
