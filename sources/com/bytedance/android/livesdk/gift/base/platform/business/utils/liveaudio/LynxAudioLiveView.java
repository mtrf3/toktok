package com.bytedance.android.livesdk.gift.base.platform.business.utils.liveaudio;

import X.C32444CoK;
import X.C39902FlK;
import X.C60905NvJ;
import X.C94G;
import X.EWS;
import X.InterfaceC61488OBg;
import X.VNU;
import X.VPD;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.forest.model.RequestParams;
import com.lynx.react.bridge.Callback;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import defpackage.a1;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LynxAudioLiveView extends UISimpleView<C94G> {
    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        GiftAudioPlayer.LJLIL.release();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxAudioLiveView(VNU context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        o.LJIIIZ(context, "context");
        GiftAudioPlayer.LJLIL.init(context);
        return new FrameLayout(context) { // from class: X.94G
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context);
                a1.LJFF(context, "context");
            }
        };
    }

    @EWS
    public final void pause(Callback callback) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(getSign());
        LIZ.append(", Control method: --> pause()");
        LLog.LIZLLL(2, "LiveAudioPlayerView", X1D.LIZIZ(LIZ));
        GiftAudioPlayer.LJLIL.pause();
    }

    @EWS
    public final void play(Callback callback) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(getSign());
        LIZ.append(", Control method: --> play()");
        LLog.LIZLLL(2, "LiveAudioPlayerView", X1D.LIZIZ(LIZ));
        GiftAudioPlayer.LJLIL.start();
    }

    @VPD(name = "src")
    public final void setSrc(String src) {
        C39902FlK c39902FlK;
        o.LJIIIZ(src, "src");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(getSign());
        LIZ.append(", setSrc -> ");
        LIZ.append(src);
        LLog.LIZLLL(2, "LiveAudioPlayerView", X1D.LIZIZ(LIZ));
        GiftAudioPlayer giftAudioPlayer = GiftAudioPlayer.LJLIL;
        giftAudioPlayer.getClass();
        InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(null, Boolean.TRUE);
        if (LIZIZ instanceof C39902FlK) {
            c39902FlK = (C39902FlK) LIZIZ;
        } else {
            c39902FlK = null;
        }
        RequestParams requestParams = new RequestParams(null, 1, null);
        if (c39902FlK != null) {
            c39902FlK.LIZLLL(src, requestParams, new AqS63S1100000_10(giftAudioPlayer, src, 0));
        }
        String str = GiftAudioPlayer.LJLILLLLZI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("url ");
        LIZ2.append(giftAudioPlayer);
        LIZ2.append(".url");
        C32444CoK.LIZ(str, X1D.LIZIZ(LIZ2));
    }

    @VPD(name = "volume")
    public final void setVolume(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(getSign());
        LIZ.append(", setVolume -> ");
        LIZ.append(f);
        LLog.LIZLLL(2, "LiveAudioPlayerView", X1D.LIZIZ(LIZ));
        GiftAudioPlayer.LJLIL.setVolume(f);
    }

    @EWS
    public final void stop(Callback callback) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(getSign());
        LIZ.append(", Control method: --> stop()");
        LLog.LIZLLL(2, "LiveAudioPlayerView", X1D.LIZIZ(LIZ));
        GiftAudioPlayer.LJLIL.stop();
    }
}
