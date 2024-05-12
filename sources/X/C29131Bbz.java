package X;

import Y.ARunnableS24S0200000_5;
import android.text.TextUtils;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.internal.b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Bbz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29131Bbz extends TBS implements InterfaceC88472Yns<Room, C76800UCe> {
    public C29131Bbz(Object obj) {
        super(1, obj, PreviewStartLiveWidget.class, "jumpToLive", "jumpToLive(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Room room) {
        String str;
        Boolean bool;
        Integer num;
        String str2;
        Integer num2;
        DialogC31813Ce9 dialogC31813Ce9;
        Room p0 = room;
        o.LJIIIZ(p0, "p0");
        PreviewStartLiveWidget previewStartLiveWidget = (PreviewStartLiveWidget) this.receiver;
        previewStartLiveWidget.getClass();
        ((ConcurrentHashMap) DataChannelGlobal.LJLJJI.LJLIL).remove(C29029BaL.class);
        C32019ChT.LIZJ();
        if (previewStartLiveWidget.isViewValid && (dialogC31813Ce9 = previewStartLiveWidget.LJLL) != null) {
            C29306Beo.LJJJJ(dialogC31813Ce9);
        }
        C3Z c3z = C3Z.LIZ;
        previewStartLiveWidget.LLFF();
        c3z.getClass();
        C3Z.LJ(p0);
        LiveSlowFunctionOptSetting liveSlowFunctionOptSetting = LiveSlowFunctionOptSetting.INSTANCE;
        if (liveSlowFunctionOptSetting.inSlowFunctionOptNew()) {
            C38995FSd.LIZIZ().submit(RunnableC29133Bc1.LJLIL);
        } else {
            C29697Bl7.LJIIL();
        }
        Creator creator = p0.creator;
        boolean z = false;
        if (creator != null && (num2 = creator.roomContinue) != null) {
            C0N7.LJI(p0, previewStartLiveWidget.LLF(), previewStartLiveWidget.dataChannel, num2.intValue(), false);
            if (C28509BGv.LJ(previewStartLiveWidget.LLF())) {
                b.LJIIIIZZ();
            }
        }
        DataChannel dataChannel = previewStartLiveWidget.dataChannel;
        Long l = null;
        if (dataChannel != null) {
            str = (String) dataChannel.kv0(PreviewTitleChannel.class);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean isLiveTypeAudio = p0.isLiveTypeAudio();
            String str3 = previewStartLiveWidget.LLF().logStreamingType;
            o.LJIIIIZZ(str3, "mLiveMode.logStreamingType");
            DataChannel dataChannel2 = previewStartLiveWidget.dataChannel;
            BZI LIZ = C28787BRn.LIZ("pm_live_take_title_write");
            LIZ.LJIILLIIL(dataChannel2);
            LIZ.LJIIL("other");
            LIZ.LJIIIZ("live_take");
            LIZ.LJIJJ(str3, "streaming_type");
            if (isLiveTypeAudio) {
                str2 = "audio_live";
            } else {
                str2 = "video_live";
            }
            LIZ.LJIJ(str2);
            LIZ.LJJIIJZLJL();
        }
        C30355Bvj.LJII().LIZ(p0.getId());
        Creator creator2 = p0.creator;
        if (creator2 == null || (num = creator2.roomContinue) == null || num.intValue() != 2) {
            LiveMode LLF = previewStartLiveWidget.LLF();
            DataChannel dataChannel3 = previewStartLiveWidget.dataChannel;
            if (dataChannel3 != null && (bool = (Boolean) dataChannel3.kv0(BDL.class)) != null) {
                z = bool.booleanValue();
            }
            C29697Bl7.LJ(LLF, dataChannel3, z, Long.valueOf(p0.getId()));
        }
        C29689Bkz c29689Bkz = C29689Bkz.LIZ;
        LiveMode LLF2 = previewStartLiveWidget.LLF();
        c29689Bkz.getClass();
        C29689Bkz.LJ = LLF2;
        c29689Bkz.LJIIL(new AqS136S0200000_5(previewStartLiveWidget, p0, 58));
        if (liveSlowFunctionOptSetting.inSlowFunctionOptNew()) {
            C38995FSd.LIZIZ().submit(new ARunnableS24S0200000_5(p0, previewStartLiveWidget, 90));
        } else {
            boolean isLiveTypeAudio2 = p0.isLiveTypeAudio();
            LiveMode LLF3 = previewStartLiveWidget.LLF();
            InterfaceC05190Ih LLFFF = PreviewStartLiveWidget.LLFFF();
            if (LLFFF != null) {
                l = Long.valueOf(LLFFF.getId());
            }
            C0N7.LJJI(isLiveTypeAudio2, LLF3, String.valueOf(l), previewStartLiveWidget.dataChannel);
        }
        EnumC30836C8i enumC30836C8i = EnumC30836C8i.LiveResource;
        if (!enumC30836C8i.isInstalled()) {
            enumC30836C8i.checkInstall(previewStartLiveWidget.context, new C29132Bc0(previewStartLiveWidget, p0));
        } else {
            previewStartLiveWidget.LLIIII(p0);
        }
        return C76800UCe.LIZ;
    }
}
