package com.bytedance.android.livesdk.broadcast.voicechat.layer;

import X.BZV;
import X.BZW;
import X.BZZ;
import X.C221108m2;
import X.C28985BZd;
import X.C28988BZg;
import X.C29963BpP;
import X.C2D;
import X.C30355Bvj;
import X.C30425Bwr;
import X.C30488Bxs;
import X.C32141Ny;
import X.C44878HjO;
import X.C62822Ol8;
import X.C72818Shy;
import X.EnumC30204BtI;
import X.InterfaceC21020s6;
import X.InterfaceC30498By2;
import X.InterfaceC72822Si2;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BGMDialogShowEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastEnableSubOnlyLiveEvent;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveTalkStateEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class VoiceChatWidget extends LiveWidget {
    public static final /* synthetic */ int LJLL = 0;
    public InterfaceC30498By2 LJLIL;
    public final InterfaceC21020s6 LJLILLLLZI;
    public final FragmentManager LJLJI;
    public final IAudioFilterManager LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public LiveDialogFragment LJLJL;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 351));
    public final C30488Bxs LJLJLLL = new C30488Bxs(this);

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        if (!this.LJLJJL) {
            this.LJLJJL = true;
        }
        C72818Shy.LIZLLL("live_goal_update_event", (InterfaceC72822Si2) this.LJLJLJ.getValue());
        this.dataChannel.kv0(RoomChannel.class);
        EnumC30204BtI.MUSIC.load(this.dataChannel, new C28985BZd(new C28988BZg(this)));
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.VOICE_EFFECT;
        DataChannel dataChannel = this.dataChannel;
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        enumC30204BtI.load(dataChannel, new BZW(context));
        EnumC30204BtI.SOUND_EFFECT.load(this.dataChannel, new BZV());
        EnumC30204BtI.ECHO_MODE.load(this.dataChannel, new C30425Bwr());
        EnumC30204BtI.MUTE_MIC.load(this.dataChannel, new C29963BpP(this));
        DataChannel dataChannel2 = this.dataChannel;
        dataChannel2.lv0(this, ECLiveStatusChangeChannel.class, BZZ.LJLIL);
        dataChannel2.lv0(this, LiveTalkStateEvent.class, new AqS171S0100000_5(this, 748));
        dataChannel2.lv0(this, BroadcastEnableSubOnlyLiveEvent.class, new AqS171S0100000_5(this, 749));
        dataChannel2.lv0(this, MuteMicChannel.class, new AqS171S0100000_5(this, 750));
        dataChannel2.lv0(this, BGMDialogShowEvent.class, new AqS171S0100000_5(this, 751));
        this.dataChannel.lv0(this, PauseLiveChannel.class, new AqS171S0100000_5(this, 752));
        if (this.LJLJJI != null) {
            C30355Bvj.LJIIJJI();
            DataChannel dataChannel3 = this.dataChannel;
            IAudioFilterManager audioManager = this.LJLJJI;
            o.LJIIIZ(audioManager, "audioManager");
            C32141Ny.LIZLLL = dataChannel3;
            C32141Ny.LIZIZ = audioManager;
            C32141Ny.LIZJ = audioManager.getAudioStrangeVoice();
        }
        InterfaceC21020s6 interfaceC21020s6 = this.LJLILLLLZI;
        if (interfaceC21020s6 != null) {
            PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-startVideoCapture-355", "", "start broadcast");
            LIZ.policies(PrivacyPolicyStore.getVideoPrivacyPolicy());
            interfaceC21020s6.LJJII(LIZ.build());
        }
        InterfaceC21020s6 interfaceC21020s62 = this.LJLILLLLZI;
        if (interfaceC21020s62 != null) {
            interfaceC21020s62.setTextureFrameAvailableListener(this.LJLJLLL);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("live_goal_update_event", (InterfaceC72822Si2) this.LJLJLJ.getValue());
    }

    public VoiceChatWidget(C2D c2d, InterfaceC21020s6 interfaceC21020s6, FragmentManager fragmentManager) {
        IAudioFilterManager iAudioFilterManager;
        this.LJLIL = c2d;
        this.LJLILLLLZI = interfaceC21020s6;
        this.LJLJI = fragmentManager;
        if (interfaceC21020s6 != null) {
            iAudioFilterManager = interfaceC21020s6.getAudioFilterMgr();
        } else {
            iAudioFilterManager = null;
        }
        this.LJLJJI = iAudioFilterManager;
    }
}
