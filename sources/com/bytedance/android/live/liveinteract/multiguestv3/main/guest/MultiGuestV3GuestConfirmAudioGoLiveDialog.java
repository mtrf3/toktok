package com.bytedance.android.live.liveinteract.multiguestv3.main.guest;

import X.C03880Dg;
import X.C113554cx;
import X.C29306Beo;
import X.C2A7;
import X.C31829CeP;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C73411SrX;
import X.C73969T1h;
import X.C74751TVj;
import X.C75559Tl5;
import X.C78880UxY;
import X.C87277YNd;
import X.InterfaceC74236TBo;
import X.OSZ;
import X.TBT;
import X.TMC;
import Y.AfS57S0100000_5;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class MultiGuestV3GuestConfirmAudioGoLiveDialog extends MultiGuestV3BottomConfirmDialog {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFII;
    public C73411SrX LLFF;
    public C73411SrX LLFFF;

    static {
        TBT tbt = new TBT(MultiGuestV3GuestConfirmAudioGoLiveDialog.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LLFII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3BottomConfirmDialog
    public final int LJJIFFI() {
        return R.layout.deq;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3BottomConfirmDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3BottomConfirmDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, X.DialogC47081t2, android.app.Dialog
    public final void show() {
        String str;
        MultiGuestDataHolder multiGuestDataHolder;
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/guest/MultiGuestV3BottomConfirmDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "2439188176465729496")).LIZ) {
            super.show();
        }
        OSZ[] oszArr = new OSZ[3];
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
        if (!(obj instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) obj) == null || (str = multiGuestDataHolder.LJJJJI) == null) {
            str = "others";
        }
        oszArr[0] = new OSZ("guest_invite_type", str);
        oszArr[1] = new OSZ("action_type", "show");
        oszArr[2] = new OSZ("click_decision", CardStruct.IStatusCode.DEFAULT);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        C78880UxY.LJIILLIIL(LJJLIIIIJ);
        C78880UxY.LJIIZILJ(LJJLIIIIJ);
        C74751TVj.LJIIJ("livesdk_guest_audio_preview_page", LJJLIIIIJ);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3BottomConfirmDialog, X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        C73411SrX c73411SrX = this.LLFF;
        if (c73411SrX != null) {
            C29306Beo.LJJJJI(c73411SrX);
        }
        C73411SrX c73411SrX2 = this.LLFFF;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3BottomConfirmDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2A7 c2a7 = this.LLD;
        if (c2a7 != null) {
            C87277YNd.LJJIIZ(c2a7);
        }
        ImageView imageView = this.LLF;
        if (imageView != null) {
            C87277YNd.LJJIIZ(imageView);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.LLFF = (C73411SrX) TMC.LJIL(0L, 1L, timeUnit).LJJLIIIJ(6L).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 26), C31829CeP.LJLIL);
        this.LLFFF = (C73411SrX) TMC.LJIL(0L, 1L, timeUnit).LJJLIIIJ(MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime.INSTANCE.getValue()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 27));
    }
}
