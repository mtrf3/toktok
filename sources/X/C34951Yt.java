package X;

import Y.IDfS124S0200000;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.1Yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34951Yt implements InterfaceViewOnClickListenerC30227Btf {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C24S.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C24R.LJLIL);
    public DataChannel LJLJI;
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
    public final boolean ud() {
        return C276716t.LIZJ();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        ActivityC45651qj LIZIZ;
        Intent intent;
        if (view == null || !C276716t.LIZJ()) {
            return;
        }
        Context context = view.getContext();
        boolean z = true;
        if (context != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null && (intent = LIZIZ.getIntent()) != null) {
            z = intent.getBooleanExtra("hotsoon.intent.extra.IS_LANDSCAPE", true);
        }
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
            C05350Ix.LIZ(fragmentManager, "live_take_detail", 4, z);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_dual_device_setting_detail");
        LIZ.LJIJJ(this.LJLILLLLZI.getValue(), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(((Number) this.LJLIL.getValue()).longValue()), "room_id");
        LIZ.LJIJJ("click", "action_type");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        C73411SrX c73411SrX = this.LJLJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLJJI = null;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLJI = dataChannel;
        this.LJLJJI = (C73411SrX) C276716t.LIZJ.LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new IDfS124S0200000(interfaceC30237Btp, this, 13));
    }
}
