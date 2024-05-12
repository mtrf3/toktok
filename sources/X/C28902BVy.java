package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.EnterRoom3sEvent;
import com.bytedance.android.livesdk.dataChannel.ShowAudienceInteractionDialogQARedPointChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BVy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28902BVy implements InterfaceViewOnClickListenerC30227Btf {
    public final LifecycleOwner LJLIL;
    public InterfaceC30237Btp LJLILLLLZI;
    public DataChannel LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

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
    public final /* synthetic */ boolean ud() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void onHide() {
        if (this.LJLJJLL) {
            this.LJLJJLL = false;
            C28969BYn.LIZ(EnumC30204BtI.QUESTION);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void onShow() {
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Ea(boolean z) {
        if (z && this.LJLJJI) {
            C0Y4.LIZ("livesdk_anchor_qa_red_dot_show");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            if (C29232Bdc.LJFF(dataChannel)) {
                C30868C9o.LIZJ(R.string.ofb);
                return;
            }
            DataChannel dataChannel2 = this.LJLJI;
            if (dataChannel2 != null) {
                BV1.LIZIZ(dataChannel2, "qa_entrance");
                DataChannel dataChannel3 = this.LJLJI;
                if (dataChannel3 != null) {
                    dataChannel3.rv0(ShowAudienceInteractionDialogQARedPointChannel.class, Boolean.FALSE);
                    if (this.LJLJJI) {
                        EnumC30204BtI enumC30204BtI = EnumC30204BtI.QUESTION;
                        DataChannel dataChannel4 = this.LJLJI;
                        if (dataChannel4 != null) {
                            boolean isRedDotShowing = enumC30204BtI.isRedDotShowing(dataChannel4);
                            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_entrance_click");
                            LIZ.LJIJJ(Integer.valueOf(isRedDotShowing ? 1 : 0), "has_red_dot");
                            LIZ.LJIJJ("toolbar", "request_page");
                            LIZ.LJIIZILJ();
                            LIZ.LJJIIJZLJL();
                            return;
                        }
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_qa_entrance_click");
                    LIZ2.LJIJJ("toolbar", "request_page");
                    LIZ2.LJIIZILJ();
                    LIZ2.LJJIIJZLJL();
                    return;
                }
                o.LJIJI("mDataChannel");
                throw null;
            }
            o.LJIJI("mDataChannel");
            throw null;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    public C28902BVy(Context context, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(context, "context");
        this.LJLIL = lifecycleOwner;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        C28852BUa.LIZJ = null;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLJI = dataChannel;
        Object kv0 = dataChannel.kv0(UserIsAnchorChannel.class);
        o.LJI(kv0);
        this.LJLJJI = ((Boolean) kv0).booleanValue();
        Boolean bool = (Boolean) dataChannel.kv0(BNK.class);
        if (bool != null) {
            bool.booleanValue();
        }
        this.LJLILLLLZI = interfaceC30237Btp;
        interfaceC30237Btp.LIZ(R.id.ld4);
        if (this.LJLJJI) {
            InterfaceC30237Btp interfaceC30237Btp2 = this.LJLILLLLZI;
            if (interfaceC30237Btp2 != null) {
                View LJFF = interfaceC30237Btp2.LJFF();
                o.LJIIIIZZ(LJFF, "mView.anchorView");
                DataChannel dataChannel2 = this.LJLJI;
                if (dataChannel2 != null) {
                    C28969BYn.LIZIZ(LJFF, dataChannel2, new AqS155S0100000_5(this, 336));
                    if (this.LJLJJI) {
                        EnumC30204BtI enumC30204BtI = EnumC30204BtI.QUESTION;
                        DataChannel dataChannel3 = this.LJLJI;
                        if (dataChannel3 != null) {
                            boolean isRedDotShowing = enumC30204BtI.isRedDotShowing(dataChannel3);
                            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_entrance_show");
                            LIZ.LJIJJ(Integer.valueOf(isRedDotShowing ? 1 : 0), "has_red_dot");
                            LIZ.LJIJJ(Integer.valueOf(this.LJLJJL ? 1 : 0), "has_guidance");
                            LIZ.LJIJJ("toolbar", "request_page");
                            LIZ.LJIIZILJ();
                            LIZ.LJJIIJZLJL();
                            return;
                        }
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("mDataChannel");
                throw null;
            }
            o.LJIJI("mView");
            throw null;
        }
        if (!C1DH.LJJIIJZLJL(dataChannel)) {
            EnumC30204BtI.QUESTION.unload(dataChannel);
        } else if (!this.LJLJJI) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_qa_entrance_show");
            LIZ2.LJIJJ("toolbar", "request_page");
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
        }
        DataChannel dataChannel4 = this.LJLJI;
        if (dataChannel4 != null) {
            dataChannel4.lv0(this.LJLIL, EnterRoom3sEvent.class, new AqS171S0100000_5(this, 683));
            this.LJLJJLL = true;
        } else {
            o.LJIJI("mDataChannel");
            throw null;
        }
    }
}
