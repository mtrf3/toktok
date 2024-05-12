package com.ss.android.videoshop.api.stub;

import X.C79518VIs;
import X.C79520VIu;
import X.C81307Vvb;
import X.EnumC79517VIr;
import X.InterfaceC81308Vvc;
import X.JBR;
import X.X1D;
import X.YS2;
import X.YS7;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.videoshop.context.VideoContext;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public class AutoPauseResumeLifeCycleHandler extends C79518VIs implements InterfaceC81308Vvc, WeakHandler.IHandler {
    public C81307Vvb autoPauseResumeCoordinator;
    public int autoPauseStatus;
    public Lifecycle lifecycle;
    public WeakHandler mWeakHandler;
    public VideoContext videoContext;

    public boolean enableClearScreenOffFlagOnResume() {
        return false;
    }

    public long getClearScreenOffFlagInterval() {
        return 500L;
    }

    @Override // X.C79518VIs, X.YSE
    public void onLifeCycleOnCreate(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
    }

    @Override // X.InterfaceC81308Vvc
    public boolean onTryAutoPause() {
        VideoContext videoContext = this.videoContext;
        if (videoContext == null) {
            return false;
        }
        if (this.lifecycle == null || videoContext.getCurrentLifecycle() == this.lifecycle) {
            this.autoPauseStatus = 0;
            if (!this.videoContext.isPlayCompleted() && !this.videoContext.isPaused() && ((this.videoContext.isShouldPlay() || this.videoContext.isPlaying()) && !this.videoContext.isReleased())) {
                this.videoContext.pause();
                this.autoPauseStatus = 1;
            }
            if (this.videoContext.isVideoPatchPlaying()) {
                this.videoContext.pauseVideoPatch();
                if (this.autoPauseStatus == 1) {
                    this.autoPauseStatus = 3;
                } else {
                    this.autoPauseStatus = 2;
                }
            }
            if (this.autoPauseStatus > 0) {
                return true;
            }
        }
        return false;
    }

    public void onViewPaused() {
        this.autoPauseResumeCoordinator.LIZIZ();
    }

    public AutoPauseResumeLifeCycleHandler(VideoContext videoContext) {
        this.mWeakHandler = new WeakHandler(this);
        this.autoPauseStatus = 0;
        C81307Vvb c81307Vvb = new C81307Vvb(videoContext);
        this.autoPauseResumeCoordinator = c81307Vvb;
        c81307Vvb.LJFF = this;
        this.videoContext = videoContext;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 1001) {
            onScreenUserPresent(this.videoContext);
        }
    }

    @Override // X.C79518VIs, X.YSE
    public boolean onBackPressedWhenFullScreen(VideoContext videoContext) {
        if (this.lifecycle == null || videoContext.getCurrentLifecycle() == this.lifecycle) {
            videoContext.exitFullScreen(true);
            return true;
        }
        return false;
    }

    @Override // X.C79518VIs, X.YSE
    public void onScreenOff(VideoContext videoContext) {
        C81307Vvb c81307Vvb = this.autoPauseResumeCoordinator;
        c81307Vvb.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScreenOff ");
        LIZ.append(Integer.toHexString(c81307Vvb.hashCode()));
        X1D.LIZIZ(LIZ);
        c81307Vvb.LIZJ(4);
    }

    @Override // X.C79518VIs, X.YSE
    public void onScreenUserPresent(VideoContext videoContext) {
        C81307Vvb c81307Vvb = this.autoPauseResumeCoordinator;
        c81307Vvb.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScreenOn ");
        LIZ.append(Integer.toHexString(c81307Vvb.hashCode()));
        X1D.LIZIZ(LIZ);
        c81307Vvb.LIZ(4);
    }

    @Override // X.InterfaceC81308Vvc
    public boolean onTryAutoResume(boolean z) {
        VideoContext videoContext = this.videoContext;
        if (videoContext == null) {
            return false;
        }
        if (this.lifecycle == null || videoContext.getCurrentLifecycle() == this.lifecycle) {
            int i = this.autoPauseStatus;
            if (i == 1 || i == 3) {
                if (!z && this.videoContext.isPaused()) {
                    this.videoContext.play();
                    return true;
                }
            } else if (i == 2) {
                List<YS2> videoPatchLayouts = this.videoContext.getVideoPatchLayouts();
                if (videoPatchLayouts != null) {
                    Iterator<YS2> it = videoPatchLayouts.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        YS2 next = it.next();
                        YS7 ys7 = next.LJLL;
                        if (ys7 != null && ys7.isPaused()) {
                            next.LJIL();
                            break;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void setAutoResumeTimeOut(long j) {
        C81307Vvb c81307Vvb = this.autoPauseResumeCoordinator;
        if (c81307Vvb != null) {
            c81307Vvb.LIZ = j;
        }
    }

    public void setEnableAudioFocus(boolean z) {
        C81307Vvb c81307Vvb = this.autoPauseResumeCoordinator;
        c81307Vvb.LJIIIIZZ = z;
        if (z) {
            c81307Vvb.LIZLLL |= 1;
            return;
        }
        int i = c81307Vvb.LIZLLL;
        if ((i & 1) == 0) {
            return;
        }
        c81307Vvb.LIZLLL = i & (-2);
    }

    public void setEnableAutoAudioFocusLoss(boolean z) {
        this.autoPauseResumeCoordinator.LJII = z;
    }

    public AutoPauseResumeLifeCycleHandler(VideoContext videoContext, Lifecycle lifecycle) {
        this(videoContext);
        this.lifecycle = lifecycle;
    }

    @Override // X.C79518VIs, X.YSE
    public void onAudioFocusGain(VideoContext videoContext, boolean z) {
        C81307Vvb c81307Vvb = this.autoPauseResumeCoordinator;
        if (c81307Vvb.LJIIIIZZ) {
            StringBuilder LJI = JBR.LJI("onAudioFocusGain ", z, " ");
            LJI.append(Integer.toHexString(c81307Vvb.hashCode()));
            X1D.LIZIZ(LJI);
            c81307Vvb.LIZ(1);
        }
    }

    @Override // X.C79518VIs, X.YSE
    public void onAudioFocusLoss(VideoContext videoContext, boolean z) {
        C81307Vvb c81307Vvb = this.autoPauseResumeCoordinator;
        if (c81307Vvb.LJIIIIZZ) {
            StringBuilder LJI = JBR.LJI("onAudioFocusLoss ", z, " ");
            LJI.append(Integer.toHexString(c81307Vvb.hashCode()));
            LJI.append(" enableAutoAudioFocusLoss:");
            LJI.append(c81307Vvb.LJII);
            X1D.LIZIZ(LJI);
            if (c81307Vvb.LJII) {
                c81307Vvb.LIZJ(1);
            } else {
                if (z) {
                    return;
                }
                c81307Vvb.LIZJ(1);
            }
        }
    }

    @Override // X.C79518VIs, X.YSE
    public void onLifeCycleOnDestroy(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        if (this.lifecycle == null || videoContext.getCurrentLifecycle() == lifecycleOwner.getLifecycle()) {
            videoContext.release();
            videoContext.releaseVideoPatch();
        }
        C81307Vvb c81307Vvb = this.autoPauseResumeCoordinator;
        if (!c81307Vvb.LJ) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop ");
        LIZ.append(Integer.toHexString(c81307Vvb.hashCode()));
        X1D.LIZIZ(LIZ);
        c81307Vvb.LJ = false;
        c81307Vvb.LIZJ = false;
    }

    @Override // X.C79518VIs, X.YSE
    public void onLifeCycleOnPause(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnPause:");
        LIZ.append(lifecycleOwner.toString());
        X1D.LIZIZ(LIZ);
        this.autoPauseResumeCoordinator.LIZIZ();
        this.mWeakHandler.removeMessages(1001);
    }

    @Override // X.C79518VIs, X.YSE
    public void onLifeCycleOnResume(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnResume:");
        LIZ.append(lifecycleOwner.toString());
        X1D.LIZIZ(LIZ);
        C81307Vvb c81307Vvb = this.autoPauseResumeCoordinator;
        if (!c81307Vvb.LJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("start ");
            LIZ2.append(Integer.toHexString(c81307Vvb.hashCode()));
            X1D.LIZIZ(LIZ2);
            c81307Vvb.LIZJ = false;
            if (c81307Vvb.LJIIIIZZ) {
                c81307Vvb.LIZLLL = 1;
            } else {
                c81307Vvb.LIZLLL = 0;
            }
            c81307Vvb.LJ = true;
        }
        C79520VIu videoAudioFocusController = EnumC79517VIr.KEEPER.getVideoAudioFocusController();
        if (videoAudioFocusController != null) {
            C81307Vvb c81307Vvb2 = this.autoPauseResumeCoordinator;
            if (videoAudioFocusController.LJLJJLL) {
                c81307Vvb2.LIZLLL &= -2;
            } else {
                c81307Vvb2.LIZLLL |= 1;
            }
        }
        C81307Vvb c81307Vvb3 = this.autoPauseResumeCoordinator;
        c81307Vvb3.getClass();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onViewResumed ");
        LIZ3.append(Integer.toHexString(c81307Vvb3.hashCode()));
        X1D.LIZIZ(LIZ3);
        c81307Vvb3.LIZ(2);
        if (c81307Vvb3.LJIIIIZZ && c81307Vvb3.LIZJ) {
            int i = c81307Vvb3.LIZLLL;
            if ((i & 1) != 0 && (i & 4) == 0 && c81307Vvb3.LJI.getVideoAudioFocusController() != null) {
                C79520VIu videoAudioFocusController2 = c81307Vvb3.LJI.getVideoAudioFocusController();
                videoAudioFocusController2.LIZIZ(videoAudioFocusController2.LJLJJL);
            }
        }
        if ((this.autoPauseResumeCoordinator.LIZLLL & 4) != 0 && enableClearScreenOffFlagOnResume()) {
            this.mWeakHandler.sendEmptyMessageDelayed(1001, getClearScreenOffFlagInterval());
        }
    }

    @Override // X.C79518VIs, X.YSE
    public void onLifeCycleOnStart(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnStart:");
        LIZ.append(lifecycleOwner.toString());
        X1D.LIZIZ(LIZ);
    }

    @Override // X.C79518VIs, X.YSE
    public void onLifeCycleOnStop(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnStop:");
        LIZ.append(lifecycleOwner.toString());
        X1D.LIZIZ(LIZ);
        this.autoPauseResumeCoordinator.LIZIZ();
    }

    public AutoPauseResumeLifeCycleHandler(VideoContext videoContext, Lifecycle lifecycle, boolean z) {
        this(videoContext, lifecycle);
        this.autoPauseResumeCoordinator.LJII = z;
    }
}
