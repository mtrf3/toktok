package X;

import Y.ARunnableS41S0100000_5;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.AudienceLastSelectDefinitionInfo;
import com.bytedance.android.livesdk.dataChannel.AudienceShareScreenDefinition;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableCacheLastSelectDefinitionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B99 implements Runnable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final DataChannel LJLJJI;
    public final Runnable LJLJJL;

    public final void LIZ() {
        Object obj;
        String str;
        String str2;
        String str3;
        BQ9 Tx;
        InterfaceC28738BPq LIZIZ;
        String valueOf;
        java.util.Map map;
        java.util.Map map2;
        LiveMode liveMode;
        if (EnableCacheLastSelectDefinitionSetting.INSTANCE.isEnableAutoTips()) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.ovn));
        } else {
            C30868C9o.LJI(C15380j0.LJIILL(R.string.o1b, this.LJLIL));
        }
        String str4 = this.LJLILLLLZI;
        DataChannel dataChannel = this.LJLJJI;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BCN.class);
        } else {
            obj = null;
        }
        String valueOf2 = String.valueOf(obj);
        DataChannel dataChannel2 = this.LJLJJI;
        String str5 = "";
        if (dataChannel2 == null || (liveMode = (LiveMode) dataChannel2.kv0(BCX.class)) == null) {
            str = "";
        } else {
            str = C28509BGv.LIZ(liveMode);
        }
        boolean z = this.LJLJI;
        String str6 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else if (!z) {
            str2 = "1";
        } else {
            throw new C162476Zf();
        }
        DataChannel dataChannel3 = this.LJLJJI;
        if (dataChannel3 == null || (map2 = (java.util.Map) dataChannel3.kv0(AudienceLastSelectDefinitionInfo.class)) == null || (str3 = (String) map2.get("sdk_key")) == null) {
            str3 = "";
        }
        try {
            DataChannel dataChannel4 = this.LJLJJI;
            if (dataChannel4 == null || (map = (java.util.Map) dataChannel4.kv0(AudienceLastSelectDefinitionInfo.class)) == null || (valueOf = (String) map.get("start_time")) == null) {
                valueOf = String.valueOf(System.currentTimeMillis());
            }
            str6 = String.valueOf((System.currentTimeMillis() - CastLongProtector.parseLong(valueOf)) / 1000);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reportSwitchSuccess. catch exception=");
            LIZ.append(e);
            C0NB.LJIIIZ("SwitchDefinitionTipsWidget", X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("lastSdkKey");
        LIZ2.append(str3);
        LIZ2.append(".  duration:");
        LIZ2.append(str6);
        C0NB.LJIIIZ("SwitchDefinitionTipsWidget", X1D.LIZIZ(LIZ2));
        IDefinitionService iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class);
        if (iDefinitionService != null) {
            iDefinitionService.FK(valueOf2, str, str2, str6, str3, str4);
        }
        InterfaceC30442Bx8.LLLZ.LIZ(null);
        PushStreamInfo.Quality quality = new PushStreamInfo.Quality();
        quality.name = this.LJLIL;
        quality.sdkKey = this.LJLILLLLZI;
        DataChannel dataChannel5 = this.LJLJJI;
        if (dataChannel5 != null) {
            dataChannel5.rv0(AudienceShareScreenDefinition.class, quality);
        }
        String str7 = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        if (str7 != null) {
            str5 = str7;
        }
        IPullStreamService iPullStreamService = (IPullStreamService) CN1.LIZ(IPullStreamService.class);
        if (iPullStreamService != null && (Tx = iPullStreamService.Tx()) != null && (LIZIZ = Tx.LIZIZ(str5)) != null) {
            LIZIZ.LIZJ(true);
        }
        this.LJLJJL.run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public B99(String rName, String rSdkKey, boolean z, DataChannel dataChannel, ARunnableS41S0100000_5 hideTipsTask) {
        o.LJIIIZ(rName, "rName");
        o.LJIIIZ(rSdkKey, "rSdkKey");
        o.LJIIIZ(hideTipsTask, "hideTipsTask");
        this.LJLIL = rName;
        this.LJLILLLLZI = rSdkKey;
        this.LJLJI = z;
        this.LJLJJI = dataChannel;
        this.LJLJJL = hideTipsTask;
    }
}
