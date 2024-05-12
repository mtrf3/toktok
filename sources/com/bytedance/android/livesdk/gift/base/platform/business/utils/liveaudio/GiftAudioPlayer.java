package com.bytedance.android.livesdk.gift.base.platform.business.utils.liveaudio;

import X.AbstractC33791Uh;
import X.C15380j0;
import X.C15830jj;
import X.C32257ClJ;
import X.C32444CoK;
import X.X1D;
import android.content.Context;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.gift.IGiftAudioPlayer;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class GiftAudioPlayer implements IGiftAudioPlayer {
    public static IAVPlayer LJLJI;
    public static TTVideoEngine LJLJJI;
    public static final GiftAudioPlayer LJLIL = new GiftAudioPlayer();
    public static final String LJLILLLLZI = "GiftAudioPlayer";
    public static String LJLJJL = "";

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C15830jj.LIZ(this);
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void pause() {
        if (LJLJI != null && C32257ClJ.LJFF() == 1) {
            IAVPlayer iAVPlayer = LJLJI;
            if (iAVPlayer != null) {
                iAVPlayer.pause();
            }
            C32444CoK.LIZ(LJLILLLLZI, "avplayer play pause");
            return;
        }
        TTVideoEngine tTVideoEngine = LJLJJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJL();
        }
        C32444CoK.LIZ(LJLILLLLZI, "mEngine play pause");
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void release() {
        TTVideoEngine tTVideoEngine = LJLJJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIJILLIZJL();
        }
        IAVPlayer iAVPlayer = LJLJI;
        if (iAVPlayer != null) {
            iAVPlayer.stop();
        }
        C32444CoK.LIZ(LJLILLLLZI, "release");
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void start() {
        if (LJLJI != null && C32257ClJ.LJFF() == 1) {
            IAVPlayer iAVPlayer = LJLJI;
            if (iAVPlayer != null) {
                iAVPlayer.setDataSource(C15380j0.LIZLLL(), LJLJJL);
            }
            IAVPlayer iAVPlayer2 = LJLJI;
            if (iAVPlayer2 != null) {
                iAVPlayer2.prepare();
            }
            IAVPlayer iAVPlayer3 = LJLJI;
            if (iAVPlayer3 != null) {
                iAVPlayer3.setMixerEnable(false);
            }
            IAVPlayer iAVPlayer4 = LJLJI;
            if (iAVPlayer4 != null) {
                iAVPlayer4.start();
            }
            String str = LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("avplayer play start, url");
            LIZ.append(LJLJJL);
            C32444CoK.LIZ(str, X1D.LIZIZ(LIZ));
            return;
        }
        TTVideoEngine tTVideoEngine = LJLJJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LL(LJLJJL);
        }
        TTVideoEngine tTVideoEngine2 = LJLJJI;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.LJJLI();
        }
        String str2 = LJLILLLLZI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("mEnginePlayer play start, url");
        LIZ2.append(LJLJJL);
        C32444CoK.LIZ(str2, X1D.LIZIZ(LIZ2));
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void stop() {
        if (LJLJI != null && C32257ClJ.LJFF() == 1) {
            IAVPlayer iAVPlayer = LJLJI;
            if (iAVPlayer != null) {
                iAVPlayer.stop();
            }
            C32444CoK.LIZ(LJLILLLLZI, "avplayer play stop");
            return;
        }
        TTVideoEngine tTVideoEngine = LJLJJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJJJJJIL();
        }
        C32444CoK.LIZ(LJLILLLLZI, "mEngine play stop");
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        DataChannelGlobal.LJLJJI.pv0(LiveStreamGlobalChannel.class, this, new AqS180S0100000_14(context, 20));
        if (LJLJI == null || C32257ClJ.LJFF() == 0) {
            LJLJJI = new TTVideoEngine(context, 0);
            String str = LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Engine Player");
            LIZ.append(LJLJJI);
            C32444CoK.LIZ(str, X1D.LIZIZ(LIZ));
        }
        String str2 = LJLILLLLZI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("init avplayer");
        LIZ2.append(LJLJI);
        LIZ2.append("，engineplayer");
        LIZ2.append(LJLJJI);
        C32444CoK.LIZ(str2, X1D.LIZIZ(LIZ2));
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void setListener(AbstractC33791Uh abstractC33791Uh) {
        IAVPlayer iAVPlayer = LJLJI;
        if (iAVPlayer != null) {
            iAVPlayer.setEventListener(null);
        }
        IAVPlayer iAVPlayer2 = LJLJI;
        if (iAVPlayer2 != null) {
            iAVPlayer2.setErrorListener(null);
        }
    }

    @Override // com.bytedance.android.live.gift.IGiftAudioPlayer
    public final void setVolume(float f) {
        String str = LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set volume");
        LIZ.append(f);
        C32444CoK.LIZ(str, X1D.LIZIZ(LIZ));
        IAVPlayer iAVPlayer = LJLJI;
        if (iAVPlayer != null) {
            iAVPlayer.setVolume(f);
        }
        TTVideoEngine tTVideoEngine = LJLJJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJJIJIL(f, f);
        }
    }
}
