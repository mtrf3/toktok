package com.bytedance.gift.render.engine.alphaplayer.player;

import X.C29306Beo;
import X.C48435Izf;
import X.C48437Izh;
import X.C48449Izt;
import X.J07;
import X.VX7;
import X.VXB;
import X.VXC;
import X.VXD;
import X.VXE;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService;
import com.bytedance.gift.render.engine.alphaplayer.controller.LocalPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class LiveGiftPlayerService implements ILiveGiftPlayerService {
    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        VXE.LIZ(this);
    }

    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService
    public final Object buildDelegateGiftPlayListener(VXD vxd) {
        return new VXB(vxd);
    }

    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService
    public final void clearMasks(Object obj) {
        VX7 vx7;
        LocalPlayerController localPlayerController;
        List<MaskSrc> list;
        if ((obj instanceof VX7) && (vx7 = (VX7) obj) != null && (localPlayerController = vx7.LJI) != null && (list = localPlayerController.LJLJJI) != null) {
            ((ArrayList) list).clear();
        }
    }

    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService
    public final View getAlphaView(Object obj) {
        VX7 vx7;
        LocalPlayerController localPlayerController;
        if (!(obj instanceof VX7) || (vx7 = (VX7) obj) == null || (localPlayerController = vx7.LJI) == null) {
            return null;
        }
        return localPlayerController.getView();
    }

    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService
    public final void stop(Object obj) {
        VX7 vx7;
        if ((obj instanceof VX7) && (vx7 = (VX7) obj) != null) {
            vx7.stop();
        }
    }

    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService
    public final void tryCancel(Object obj) {
        VX7 vx7;
        LocalPlayerController localPlayerController;
        if ((obj instanceof VX7) && (vx7 = (VX7) obj) != null && (localPlayerController = vx7.LJI) != null) {
            localPlayerController.cancel();
        }
    }

    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService
    public final void setAutoReleaseParam(Object obj, boolean z) {
        VX7 vx7;
        if ((obj instanceof VX7) && (vx7 = (VX7) obj) != null) {
            vx7.LJIIIIZZ = z;
        }
    }

    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService
    public final void setMute(Object obj, boolean z) {
        VX7 vx7;
        AbsPlayer absPlayer;
        if ((obj instanceof VX7) && (vx7 = (VX7) obj) != null && (absPlayer = vx7.LJII) != null) {
            if (absPlayer instanceof J07) {
                J07 j07 = (J07) absPlayer;
                j07.LJ = z;
                MediaPlayer mediaPlayer = j07.LIZ;
                if (mediaPlayer != null) {
                    if (z) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                        return;
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                        return;
                    }
                }
                return;
            }
            if (absPlayer instanceof C48449Izt) {
                C48449Izt c48449Izt = (C48449Izt) absPlayer;
                c48449Izt.LJIIIIZZ = z;
                TTVideoEngine tTVideoEngine = c48449Izt.LIZIZ;
                if (tTVideoEngine == null) {
                    return;
                }
                tTVideoEngine.LJLZ(z);
                return;
            }
            if (!(absPlayer instanceof C48437Izh)) {
                return;
            }
            C48437Izh c48437Izh = (C48437Izh) absPlayer;
            c48437Izh.LIZJ = z;
            C48435Izf c48435Izf = c48437Izh.LIZIZ;
            if (c48435Izf == null) {
                return;
            }
            c48435Izf.LJIIJ(z);
        }
    }

    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService
    public final void setTransparentType(Object obj, int i) {
        VX7 vx7;
        if ((obj instanceof VX7) && (vx7 = (VX7) obj) != null) {
            vx7.LJIIJ(i);
        }
    }

    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService
    public final void releasePlayer(Object obj, Object obj2, ViewGroup viewGroup) {
        VXB vxb;
        VX7 vx7;
        if ((obj instanceof VX7) && (vx7 = (VX7) obj) != null) {
            vx7.LJII();
            vx7.LIZLLL = null;
            vx7.LJIIIIZZ();
            vx7.detachAlphaView(viewGroup);
            vx7.release();
        }
        if ((obj2 instanceof VXB) && (vxb = (VXB) obj2) != null) {
            vxb.LIZ = null;
        }
    }

    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService
    public final void start(Object obj, String str, long j) {
        VX7 vx7;
        if ((obj instanceof VX7) && (vx7 = (VX7) obj) != null) {
            vx7.LJI(j, str);
        }
    }

    @Override // com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService
    public final Object createLiveGiftPlayController(Context context, LifecycleOwner lifecycleOwner, Object obj, ViewGroup viewGroup) {
        VXB vxb;
        VXC vxc = null;
        if (obj instanceof VXB) {
            vxb = (VXB) obj;
        } else {
            vxb = null;
        }
        if (context == null) {
            return null;
        }
        VX7 vx7 = new VX7(context, null);
        vx7.LJIIIZ(C29306Beo.LIZIZ(context));
        if (vxb != null) {
            vxc = vxb.LIZ;
        }
        vx7.LIZLLL = vxc;
        vx7.attachAlphaView(viewGroup);
        return vx7;
    }
}
