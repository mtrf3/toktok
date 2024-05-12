package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.opencamera;

import X.AbstractDialogC29234Bde;
import X.C03880Dg;
import X.C0NB;
import X.C16880lQ;
import X.C1XG;
import X.C2A7;
import X.C32213Ckb;
import X.C47135Ieh;
import X.C65300Pk0;
import X.C73411SrX;
import X.C73943T0h;
import X.C73969T1h;
import X.C74632TQu;
import X.C75058Td0;
import X.C75559Tl5;
import X.C8E;
import X.CN1;
import X.InterfaceC06390Mx;
import X.InterfaceC75441TjB;
import X.InterfaceC75558Tl4;
import X.TMC;
import X.TQU;
import X.UPJ;
import Y.ACListenerS33S0100000_13;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRestoreEffectBugFixSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class MultiLiveAnchorOpenCameraDialog extends AbstractDialogC29234Bde implements GenericLifecycleObserver {
    public final DataChannel LJLJI;
    public final LifecycleOwner LJLJJI;
    public final String LJLJJL;
    public C73411SrX LJLJJLL;
    public boolean LJLJL;
    public final String LJLJLJ;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mDataHolder;

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.cz9;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LJLJL = true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final void LJJIIJZLJL() {
        String str;
        TQU LIZLLL;
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJ = true;
            String str2 = this.LJLJJL;
            if (o.LJ(str2, "end_link_and_no_guest")) {
                str = "business_mute_host_end_link_and_no_guest";
            } else if (o.LJ(str2, "close_link")) {
                str = "business_mute_host_close_link";
            } else {
                str = "business_unknown";
            }
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LIZLLL = R6.LIZLLL()) != null) {
                LIZLLL.LIZ(Boolean.FALSE, str, null);
            }
            if (LinkMicRestoreEffectBugFixSetting.INSTANCE.isEnable() && C8E.LJ().R6() == null) {
                InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
                o.LJIIIIZZ(LIZ, "getService(T::class.java)");
                ((IEffectService) LIZ).getLiveGameEffectHelper();
                C1XG.LIZJ();
            }
            UPJ.LJFF(40, C73943T0h.LIZ());
            DataChannel dataChannel = this.LJLJI;
            if (dataChannel != null) {
                dataChannel.qv0(MultiLiveAnchorMuteVideoEvent.class, new C74632TQu(true, str));
            }
            JSONObject LJ = C47135Ieh.LJ("log_name", "ttlive_multilive_anchor_switch_camera", "switch", "on");
            LJ.put("way", "Anchor's camera is opened forcedly in MultiLiveAnchorOpenCameraDialog");
            C0NB.LJIIIZ(this.LJLJLJ, LJ.toString());
            dismiss();
            return;
        }
        o.LJIJI("mDataHolder");
        throw null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LJLJL) {
            LJJIIJZLJL();
        }
        this.LJLJL = false;
    }

    @Override // X.DialogC38611fN, android.app.Dialog
    public final void show() {
        WindowManager.LayoutParams layoutParams;
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-7930910107063758100")).LIZ) {
            super.show();
        }
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
            if (layoutParams != null) {
                layoutParams.dimAmount = 0.0f;
            }
        } else {
            layoutParams = null;
        }
        Window window2 = getWindow();
        if (window2 == null) {
            return;
        }
        window2.setAttributes(layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            dataChannel.qv0(AnchorOpenCameraEvent.class, new C32213Ckb(false, this.LJLJJL));
        }
        C73411SrX c73411SrX = this.LJLJJLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLJJI.getLifecycle().removeObserver(this);
    }

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJJI.getLifecycle().addObserver(this);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            dataChannel.qv0(AnchorOpenCameraEvent.class, new C32213Ckb(true, this.LJLJJL));
        }
        this.LJLJJLL = (C73411SrX) TMC.LJIL(0L, 1L, TimeUnit.SECONDS).LJJLIIIJ(6L).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS65S0100000_13(this, 25), C75058Td0.LJLIL);
        C16880lQ.LJJIII((C2A7) findViewById(R.id.hbi), new ACListenerS33S0100000_13(this, 23));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLiveAnchorOpenCameraDialog(Context context, DataChannel dataChannel, LifecycleOwner owner, String str) {
        super(context);
        o.LJIIIZ(owner, "owner");
        this.LJLJI = dataChannel;
        this.LJLJJI = owner;
        this.LJLJJL = str;
        this.LJLJLJ = "MultiLiveAnchorOpenCamera";
        C75559Tl5.LIZIZ.LIZLLL(this);
    }
}
