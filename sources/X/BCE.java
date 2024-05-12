package X;

import Y.IDCListenerS159S0100000_5;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BCE implements InterfaceViewOnClickListenerC30227Btf {
    public final Context LJLIL;
    public DataChannel LJLILLLLZI;
    public DialogC77438UaI LJLJI;

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
    public final /* synthetic */ void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
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
        String str;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.qv0(UserWannaSendMessageEvent.class, new C30926CBu());
            DataChannel dataChannel2 = this.LJLILLLLZI;
            if (dataChannel2 != null) {
                Object kv0 = dataChannel2.kv0(BCX.class);
                if (kv0 == null) {
                    kv0 = LiveMode.VIDEO;
                }
                BZI LIZ = C28787BRn.LIZ("anchor_comment_click");
                LIZ.LJIIZILJ();
                if (kv0 == LiveMode.VIDEO) {
                    str = "video_live";
                } else {
                    str = "third_party";
                }
                LIZ.LJIJ(str);
                LIZ.LJIJJ("more", "click_method");
                LIZ.LJJIIJZLJL();
                return;
            }
            o.LJIJI("dataChannel");
            throw null;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    public BCE(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!InterfaceC30442Bx8.LLF.LIZJ().booleanValue()) {
            if (this.LJLJI == null) {
                C77437UaH c77437UaH = new C77437UaH(this.LJLIL);
                c77437UaH.LJIL = true;
                c77437UaH.LIZIZ(R.string.mg5);
                c77437UaH.LJ(R.string.mo_, new IDCListenerS159S0100000_5(this, 12), false);
                c77437UaH.LIZJ(R.string.snz, BCF.LJLIL, false);
                this.LJLJI = c77437UaH.LIZ();
            }
            DialogC77438UaI dialogC77438UaI = this.LJLJI;
            if (dialogC77438UaI != null) {
                C29306Beo.LJJJJIZL(dialogC77438UaI);
                return;
            }
            return;
        }
        LIZ();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLILLLLZI = dataChannel;
        C77800Ug8.LJ("anchor_comment_show", dataChannel);
    }
}
