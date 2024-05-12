package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.Display;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.ies.xelement.video.pro.LynxVideoUI;
import com.ss.android.videoshop.context.VideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.VaE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79982VaE extends FrameLayout {
    public final YS4 LJLIL;
    public final C72792ShY LJLILLLLZI;
    public final C79983VaF LJLJI;
    public float[] LJLJJI;

    public final EnumC79984VaG LIZ() {
        VideoContext videoContext;
        YS4 ys4;
        YS3 ys3;
        VideoContext videoContext2;
        boolean isPlaying;
        YS7 ys7;
        YS7 ys72;
        YS4 ys42 = this.LJLIL;
        YS3 ys32 = ys42.LJLJI;
        if (ys32 == null ? (videoContext = ys42.LJLJJL) == null || !videoContext.isCurrentView(ys42) || !ys42.LJLJJL.isPaused() : (ys72 = ys32.LJLL) == null || !ys72.isPaused()) {
            if (!this.LJLIL.LIZLLL() && ((ys3 = (ys4 = this.LJLIL).LJLJI) == null ? (videoContext2 = ys4.LJLJJL) == null || !videoContext2.isCurrentView(ys4) || !ys4.LJLJJL.isPlayCompleted() : (ys7 = ys3.LJLL) == null || !ys7.isVideoPlayCompleted())) {
                YS4 ys43 = this.LJLIL;
                YS3 ys33 = ys43.LJLJI;
                if (ys33 != null) {
                    isPlaying = ys33.LJIILJJIL();
                } else {
                    VideoContext videoContext3 = ys43.LJLJJL;
                    if (videoContext3 != null && videoContext3.isCurrentView(ys43)) {
                        isPlaying = ys43.LJLJJL.isPlaying();
                    }
                    return EnumC79984VaG.READY;
                }
                if (isPlaying) {
                    return EnumC79984VaG.PLAYING;
                }
                return EnumC79984VaG.READY;
            }
        }
        return EnumC79984VaG.STOP;
    }

    public final int getDuration() {
        return this.LJLIL.getDuration();
    }

    public final void LIZIZ() {
        Activity LIZJ = LIZJ(getContext());
        if (LIZJ != null) {
            WindowManager windowManager = LIZJ.getWindowManager();
            o.LJFF(windowManager, "activity.windowManager");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            o.LJFF(defaultDisplay, "activity.windowManager.defaultDisplay");
            int rotation = defaultDisplay.getRotation();
            int i = 1;
            if (rotation != 0) {
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation == 3) {
                            i = 8;
                        }
                    } else {
                        i = 9;
                    }
                } else {
                    i = 0;
                }
            }
            VideoContext.getVideoContext(getContext()).setScreenOrientation(i);
        }
    }

    public static Activity LIZJ(Context context) {
        if (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                return LIZJ(((ContextWrapper) context).getBaseContext());
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas == null || this.LJLJJI == null) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayer(new RectF(0.0f, 0.0f, getWidth(), getHeight()), null, 31);
        Path path = new Path();
        path.addRoundRect(new RectF(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom()), this.LJLJJI, Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }

    public final void setBorderRadius(float[] fArr) {
        this.LJLJJI = fArr;
        invalidate();
    }

    public final void setEngineFactory(InterfaceC58392Mvs engineFactory) {
        o.LJIIJ(engineFactory, "engineFactory");
        this.LJLIL.setVideoEngineFactory(engineFactory);
    }

    public final void setMuted(boolean z) {
        this.LJLIL.setMute(z);
    }

    public final void setPlayEntity(C79985VaH entity) {
        o.LJIIJ(entity, "entity");
        this.LJLIL.setPlayEntity(entity);
    }

    public final void setUrlConstructor(YTA yta) {
        this.LJLIL.setPlayUrlConstructor(yta);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79982VaE(LynxVideoUI videoUI, Context context) {
        super(context);
        o.LJIIJ(videoUI, "videoUI");
        o.LJIIJ(context, "context");
        YS4 ys4 = new YS4(context);
        this.LJLIL = ys4;
        C72792ShY c72792ShY = new C72792ShY(context);
        this.LJLILLLLZI = c72792ShY;
        C79983VaF c79983VaF = new C79983VaF(videoUI, this);
        this.LJLJI = c79983VaF;
        addView(ys4, -1, -1);
        ys4.setAttachListener(new C77321UWf());
        ys4.setAsyncRelease(true);
        VideoContext videoContext = ys4.LJLJJL;
        if (videoContext != null) {
            videoContext.registerVideoPlayListener(c79983VaF);
        }
        addView(c72792ShY, -1, -1);
    }

    public final void LIZLLL(long j, boolean z) {
        boolean isPlaying;
        YS7 ys7;
        YS4 ys4 = this.LJLIL;
        YS3 ys3 = ys4.LJLJI;
        if (ys3 != null) {
            if (j >= 0 && (ys7 = ys3.LJLL) != null) {
                ys7.seekTo(j);
            }
        } else {
            VideoContext videoContext = ys4.LJLJJL;
            if (videoContext != null && videoContext.isCurrentView(ys4)) {
                ys4.LJLJJL.seekTo(j);
            }
        }
        if (z) {
            YS4 ys42 = this.LJLIL;
            YS3 ys32 = ys42.LJLJI;
            if (ys32 != null) {
                YS7 ys72 = ys32.LJLL;
                if (ys72 == null || !ys72.isPaused()) {
                    return;
                }
            } else {
                VideoContext videoContext2 = ys42.LJLJJL;
                if (videoContext2 == null || !videoContext2.isCurrentView(ys42) || !ys42.LJLJJL.isPaused()) {
                    return;
                }
            }
            this.LJLIL.LJFF();
            return;
        }
        YS4 ys43 = this.LJLIL;
        YS3 ys33 = ys43.LJLJI;
        if (ys33 != null) {
            isPlaying = ys33.LJIILJJIL();
        } else {
            VideoContext videoContext3 = ys43.LJLJJL;
            if (videoContext3 == null || !videoContext3.isCurrentView(ys43)) {
                return;
            } else {
                isPlaying = ys43.LJLJJL.isPlaying();
            }
        }
        if (!isPlaying) {
            return;
        }
        this.LJLIL.LJ();
    }
}
