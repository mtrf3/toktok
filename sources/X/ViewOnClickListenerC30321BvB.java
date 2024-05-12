package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.guide.GuidanceViewModel;
import com.bytedance.android.livesdk.model.message.NewAnchorEffectParams;
import com.bytedance.android.livesdk.model.message.NewAnchorGuideConfig;
import com.bytedance.android.livesdk.model.message.NewAnchorGuideMsgInfo;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BvB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC30321BvB implements View.OnClickListener {
    public final /* synthetic */ GuidanceViewModel LJLIL;
    public final /* synthetic */ NewAnchorGuideConfig LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ LifecycleOwner LJLJJI;
    public final /* synthetic */ NewAnchorGuideMsgInfo LJLJJL;

    public ViewOnClickListenerC30321BvB(GuidanceViewModel guidanceViewModel, NewAnchorGuideConfig newAnchorGuideConfig, String str, LifecycleOwner lifecycleOwner, NewAnchorGuideMsgInfo newAnchorGuideMsgInfo) {
        this.LJLIL = guidanceViewModel;
        this.LJLILLLLZI = newAnchorGuideConfig;
        this.LJLJI = str;
        this.LJLJJI = lifecycleOwner;
        this.LJLJJL = newAnchorGuideMsgInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C29285BeT c29285BeT;
        GuidanceViewModel guidanceViewModel = this.LJLIL;
        DataChannel dataChannel = guidanceViewModel.LJLIL;
        if (dataChannel != null) {
            NewAnchorGuideConfig newAnchorGuideConfig = this.LJLILLLLZI;
            String str = this.LJLJI;
            LifecycleOwner lifecycleOwner = this.LJLJJI;
            NewAnchorGuideMsgInfo newAnchorGuideMsgInfo = this.LJLJJL;
            NewAnchorEffectParams newAnchorEffectParams = newAnchorGuideConfig.effectParams;
            if (newAnchorEffectParams != null) {
                c29285BeT = new C29285BeT(newAnchorEffectParams.effectPanel, newAnchorEffectParams.resourceId, newAnchorEffectParams.tabKey);
            } else {
                c29285BeT = null;
            }
            C29293Beb.LIZIZ(c29285BeT, str, dataChannel, lifecycleOwner, C29306Beo.LIZIZ(view.getContext()), false);
            guidanceViewModel.lv0(false);
            BZI LIZ = C28787BRn.LIZ("livesdk_guidance_tip_click");
            LIZ.LJIILLIIL(guidanceViewModel.LJLIL);
            LIZ.LJIJJ(newAnchorGuideMsgInfo.messageKey, "tip_name");
            LIZ.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()), "online_user");
            LIZ.LJJIIJZLJL();
        }
    }
}
