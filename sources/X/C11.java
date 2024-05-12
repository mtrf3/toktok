package X;

import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.EnterRoom3sEvent;
import com.bytedance.android.livesdk.dataChannel.ShowAudienceInteractionFeatureToolbarChannel;
import com.bytedance.android.livesdk.dataChannel.ShowInteractionFeatureDialogEvent;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2Setting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C11 implements InterfaceViewOnClickListenerC30227Btf {
    public DataChannel LJLILLLLZI;
    public InterfaceC30237Btp LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public C16 LJLJJLL;
    public long LJLJL;
    public Context LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(C10.LJLIL);
    public int LJLLI = -1;

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
        FragmentManager fragmentManager;
        LiveDialogFragment liveDialogFragment = (LiveDialogFragment) this.LJLIL.getValue();
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) == null) {
            return;
        }
        C1XY.LJJIIJZLJL(liveDialogFragment, fragmentManager, "ToolbarInteractionFeatureBehavior");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        EnumC29605Bjd enumC29605Bjd;
        String str;
        ActivityC45651qj LIZIZ;
        o.LJIIIZ(v, "v");
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.LJLJL < 500) {
            return;
        }
        this.LJLJL = uptimeMillis;
        BZI LIZ = C28787BRn.LIZ("livesdk_interaction_entrance_click");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        C16 c16 = this.LJLJJLL;
        EnumC29605Bjd enumC29605Bjd2 = null;
        if (c16 != null) {
            enumC29605Bjd = c16.LJIIIZ;
        } else {
            enumC29605Bjd = null;
        }
        EnumC29605Bjd enumC29605Bjd3 = EnumC29605Bjd.CUSTOM_POLL;
        if (enumC29605Bjd == enumC29605Bjd3) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str, "is_end_show");
        LIZ.LJJIIJZLJL();
        C16 c162 = this.LJLJJLL;
        if (c162 != null) {
            enumC29605Bjd2 = c162.LJIIIZ;
        }
        if (enumC29605Bjd2 == enumC29605Bjd3) {
            if (c162 != null) {
                c162.LJIIIIZZ();
            }
            Context context = v.getContext();
            if (context == null || (LIZIZ = C29306Beo.LIZIZ(context)) == null) {
                return;
            }
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IRoomFunctionService.class);
            o.LJIIIIZZ(LIZ2, "getService(IRoomFunctionService::class.java)");
            C06040Lo.LIZ((IRoomFunctionService) LIZ2, "interaction_entrance", LIZIZ, this.LJLILLLLZI, 24);
            return;
        }
        LIZ();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        B73.LIZJ(this);
        C16 c16 = this.LJLJJLL;
        if (c16 != null) {
            c16.LJIIJ();
        }
        if (LiveRecycleWidgetV2Setting.INSTANCE.getValue()) {
            this.LJLJJLL = null;
            this.LJLILLLLZI = null;
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        LifecycleOwner lifecycleOwner;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = interfaceC30237Btp;
        interfaceC30237Btp.la();
        this.LJLJLJ = interfaceC30237Btp.getContext();
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.lv0(dataChannel2.LJLJJI, ShowAudienceInteractionFeatureToolbarChannel.class, new AqS171S0100000_5(this, 22));
            dataChannel2.lv0(dataChannel2.LJLJJI, EnterRoom3sEvent.class, new AqS171S0100000_5(this, 23));
            dataChannel2.lv0(dataChannel2.LJLJJI, ShowInteractionFeatureDialogEvent.class, new AqS171S0100000_5(this, 24));
        }
        this.LJLJJLL = new C16(dataChannel, EnumC30212BtQ.INTERACTION, interfaceC30237Btp);
        C30326BvG.LIZ.post(new ARunnableS41S0100000_5(this, 5), this);
        LiveIconView liveIconView = (LiveIconView) interfaceC30237Btp.LIZ(R.id.ldg);
        if (LiveCommentWidthOptSetting.INSTANCE.isStrategyEnable()) {
            View LJFF = interfaceC30237Btp.LJFF();
            if (LJFF != null) {
                LJFF.post(new ARunnableS24S0200000_5(this, liveIconView, 6));
            }
            Object obj = this.LJLJLJ;
            if (obj instanceof LifecycleOwner) {
                lifecycleOwner = (LifecycleOwner) obj;
            } else {
                lifecycleOwner = null;
            }
            if (dataChannel != null) {
                dataChannel.ov0(lifecycleOwner, CommentCompressOnSmallEvent.class, new AqS136S0200000_5(liveIconView, this, 1));
            }
        }
    }
}
