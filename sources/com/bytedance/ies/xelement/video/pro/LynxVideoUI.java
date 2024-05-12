package com.bytedance.ies.xelement.video.pro;

import X.C113554cx;
import X.C49615Jdb;
import X.C61259O2l;
import X.C79982VaE;
import X.C79983VaF;
import X.C79985VaH;
import X.C79986VaI;
import X.EWS;
import X.EnumC79984VaG;
import X.O30;
import X.OSZ;
import X.VNL;
import X.VNU;
import X.VPD;
import X.VQ3;
import X.VQQ;
import X.X1D;
import X.YS3;
import X.YS4;
import X.YS7;
import X.YTA;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.videoshop.context.VideoContext;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxVideoUI extends UISimpleView<C79982VaE> implements GenericLifecycleObserver {
    public final String LJLIL;
    public C79985VaH LJLILLLLZI;
    public EnumC79984VaG LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public O30<C61259O2l> LJZ;
    public YTA LJZI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onHostResume(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onHostPause(lifecycleOwner);
        }
    }

    @VPD(name = "cache-size")
    public final void setCacheSize(int i) {
    }

    @VPD(name = "rate")
    public final void setRate(double d) {
    }

    @VPD(name = "volume")
    public final void setVolume(float f) {
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        Lifecycle lifecycle;
        super.destroy();
        this.LJLJI = EnumC79984VaG.DESTROY;
        C79982VaE c79982VaE = (C79982VaE) this.mView;
        YS4 ys4 = c79982VaE.LJLIL;
        C79983VaF c79983VaF = c79982VaE.LJLJI;
        VideoContext videoContext = ys4.LJLJJL;
        if (videoContext != null) {
            videoContext.unregisterVideoPlayListener(c79983VaF);
        }
        c79982VaE.LJLIL.LJII();
        Object obj = null;
        try {
            VideoContext videoContext2 = VideoContext.getVideoContext(c79982VaE.getContext());
            if (videoContext2 != null) {
                videoContext2.setLayerHostMediaLayout(null);
            }
            VideoContext videoContext3 = VideoContext.getVideoContext(c79982VaE.getContext());
            if (videoContext3 != null) {
                videoContext3.setSimpleMediaView(null);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Fail to set VideoContext's objects to null ");
            LIZ.append(e);
            LLog.LIZLLL(4, "LynxVideoView", X1D.LIZIZ(LIZ));
        }
        VNU mContext = this.mContext;
        o.LJFF(mContext, "mContext");
        Context baseContext = mContext.getBaseContext();
        if (baseContext instanceof LifecycleOwner) {
            obj = baseContext;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void initialize() {
        Lifecycle lifecycle;
        super.initialize();
        this.LJLJI = EnumC79984VaG.INIT;
        VNU mContext = this.mContext;
        o.LJFF(mContext, "mContext");
        Object baseContext = mContext.getBaseContext();
        if (!(baseContext instanceof LifecycleOwner)) {
            baseContext = null;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) baseContext;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxVideoUI(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLIL = "LynxVideoUI";
        this.LJLJI = EnumC79984VaG.INIT;
        this.LJLJJI = "";
        this.LJLL = "contain";
        this.LJLLI = "";
        this.LJLLILLLL = "";
        this.LJLLJ = "";
        this.LJLLL = true;
        this.LJLLLL = "";
    }

    public final void LJIJJLI(Callback callback) {
        boolean z;
        VideoContext videoContext;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        YS4 ys4 = ((C79982VaE) this.mView).LJLIL;
        VideoContext videoContext2 = ys4.LJLJJL;
        if (videoContext2 != null && videoContext2.isCurrentView(ys4) && ys4.LJLJJL.isFullScreen()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            javaOnlyMap.putString("msg", "already fullscreen");
            if (callback != null) {
                callback.invoke(0, javaOnlyMap);
                return;
            }
            return;
        }
        C79982VaE c79982VaE = (C79982VaE) this.mView;
        c79982VaE.LIZIZ();
        YS3 ys3 = c79982VaE.LJLIL.LJLJI;
        if (ys3 != null && (videoContext = ys3.LLIILZL) != null) {
            videoContext.enterFullScreen();
        }
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    public final void LJIL(Callback callback) {
        boolean z;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        YS4 ys4 = ((C79982VaE) this.mView).LJLIL;
        VideoContext videoContext = ys4.LJLJJL;
        if (videoContext != null && videoContext.isCurrentView(ys4) && ys4.LJLJJL.isFullScreen()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C79982VaE c79982VaE = (C79982VaE) this.mView;
            VideoContext.getVideoContext(c79982VaE.getContext()).setScreenOrientation(-1);
            YS4 ys42 = c79982VaE.LJLIL;
            YS3 ys3 = ys42.LJLJI;
            if (ys3 != null) {
                VideoContext videoContext2 = ys3.LLIILZL;
                if (videoContext2 != null) {
                    videoContext2.exitFullScreen();
                }
            } else {
                VideoContext videoContext3 = ys42.LJLJJL;
                if (videoContext3 != null && videoContext3.isCurrentView(ys42)) {
                    ys42.LJLJJL.exitFullScreen();
                }
            }
            if (callback != null) {
                callback.invoke(0, javaOnlyMap);
                return;
            }
            return;
        }
        javaOnlyMap.putString("msg", "not in fullscreen");
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    public final void LJJ(Callback callback) {
        this.LJLJI = ((C79982VaE) this.mView).LIZ();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C79986VaI.LIZIZ[this.LJLJI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("error state: ");
                    LIZ.append(this.LJLJI);
                    javaOnlyMap.putString("error", X1D.LIZIZ(LIZ));
                    String str = this.LJLIL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("invoke pause in wrong state: ");
                    LIZ2.append(this.LJLJI);
                    LLog.LIZLLL(4, str, X1D.LIZIZ(LIZ2));
                    if (callback != null) {
                        callback.invoke(1, javaOnlyMap);
                        return;
                    }
                    return;
                }
                javaOnlyMap.putString("msg", "just ready");
                if (callback == null) {
                    return;
                }
                callback.invoke(0, javaOnlyMap);
                return;
            }
            javaOnlyMap.putString("msg", "already pause");
            if (callback == null) {
                return;
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        ((C79982VaE) this.mView).LJLIL.LJ();
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    public final void LJJI(Callback callback) {
        if (this.LJLJI != EnumC79984VaG.READY) {
            this.LJLJI = ((C79982VaE) this.mView).LIZ();
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C79986VaI.LIZ[this.LJLJI.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("error state: ");
                LIZ.append(this.LJLJI);
                javaOnlyMap.putString("error", X1D.LIZIZ(LIZ));
                String str = this.LJLIL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("invoke play in wrong state: ");
                LIZ2.append(this.LJLJI);
                LLog.LIZLLL(4, str, X1D.LIZIZ(LIZ2));
                if (callback != null) {
                    callback.invoke(1, javaOnlyMap);
                    return;
                }
                return;
            }
            javaOnlyMap.putString("msg", "already play");
            if (callback == null) {
                return;
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        C79982VaE c79982VaE = (C79982VaE) this.mView;
        c79982VaE.LIZIZ();
        c79982VaE.LJLIL.LJFF();
        this.LJLZ = false;
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02df  */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.W5O, REQUEST] */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterPropsUpdated(X.VPA r16) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.video.pro.LynxVideoUI.afterPropsUpdated(X.VPA):void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIJ(context, "context");
        return new C79982VaE(this, context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onBorderRadiusUpdated(int i) {
        VQQ LIZIZ;
        super.onBorderRadiusUpdated(i);
        VQ3 vq3 = this.mLynxBackground;
        float[] fArr = null;
        if (vq3 != null && (LIZIZ = vq3.LIZIZ()) != null) {
            T mView = this.mView;
            o.LJFF(mView, "mView");
            int paddingLeft = mView.getPaddingLeft();
            T mView2 = this.mView;
            o.LJFF(mView2, "mView");
            int paddingRight = mView2.getPaddingRight();
            T mView3 = this.mView;
            o.LJFF(mView3, "mView");
            int paddingTop = mView3.getPaddingTop();
            T mView4 = this.mView;
            o.LJFF(mView4, "mView");
            int paddingBottom = mView4.getPaddingBottom();
            T mView5 = this.mView;
            o.LJFF(mView5, "mView");
            float width = mView5.getWidth() + paddingLeft + paddingRight;
            T mView6 = this.mView;
            o.LJFF(mView6, "mView");
            LIZIZ.LJ(width, mView6.getHeight() + paddingTop + paddingBottom);
            float[] LIZ = LIZIZ.LIZ();
            if (LIZ != null) {
                int i2 = 0;
                if (LIZ.length == 8) {
                    float f = paddingLeft;
                    float f2 = paddingTop;
                    float f3 = paddingRight;
                    float f4 = paddingBottom;
                    float[] fArr2 = {f, f2, f3, f2, f3, f4, f, f4};
                    do {
                        LIZ[i2] = Math.max(0.0f, LIZ[i2] - fArr2[i2]);
                        i2++;
                    } while (i2 < 8);
                    fArr = LIZ;
                }
            }
        }
        ((C79982VaE) this.mView).setBorderRadius(fArr);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onHostPause(LifecycleOwner host) {
        o.LJIIJ(host, "host");
        if (this.LJLJLLL) {
            LJJ(null);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onHostResume(LifecycleOwner host) {
        o.LJIIJ(host, "host");
        if (this.LJLJLLL && !this.LJLZ) {
            LJJI(null);
        }
    }

    @VPD(name = "autolifecycle")
    public final void setAutoLifeCycle(boolean z) {
        this.LJLJLLL = z;
    }

    @VPD(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        this.LJLJJLL = z;
    }

    @VPD(name = "cache")
    public final void setCache(boolean z) {
        this.LJLLL = z;
    }

    @VPD(name = "__control")
    public final void setControl(String str) {
        this.LJLLI = str;
    }

    @VPD(name = "inittime")
    public final void setInitTime(int i) {
        this.LJLJLJ = i;
    }

    @VPD(name = "loop")
    public final void setLoop(boolean z) {
        this.LJLJL = z;
    }

    @VPD(name = "muted")
    public final void setMuted(boolean z) {
        this.LJLJJL = z;
    }

    @VPD(name = "objectfit")
    public final void setObjectFit(String objectFit) {
        o.LJIIJ(objectFit, "objectFit");
        this.LJLL = objectFit;
    }

    @VPD(name = "poster")
    public final void setPoster(String str) {
        this.LJLLJ = str;
    }

    @VPD(name = "preload-key")
    public final void setPreloadKey(String preloadKey) {
        o.LJIIJ(preloadKey, "preloadKey");
        this.LJLLLL = preloadKey;
    }

    @VPD(name = "src")
    public final void setSrc(String str) {
        if (str != null) {
            this.LJLLLLLL = true ^ o.LJ(this.LJLJJI, str);
            this.LJLJJI = str;
            String str2 = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set Src: ");
            LIZ.append(str);
            LLog.LIZLLL(2, str2, X1D.LIZIZ(LIZ));
            return;
        }
        LLog.LIZLLL(4, this.LJLIL, "src is null");
        LJJII("error", C113554cx.LJJJLZIJ(new OSZ("src is null", "msg")));
    }

    @VPD(name = "video-tag")
    public final void setVideoTag(String str) {
        this.LJLLILLLL = str;
    }

    public final void LJJII(String str, Map<String, ? extends Object> map) {
        VNL vnl;
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), str);
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                c49615Jdb.LIZJ(entry.getValue(), entry.getKey());
            }
            vnl.LIZIZ(c49615Jdb);
        }
    }

    @EWS
    public final void exitFullScreen(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        LJIL(callback);
    }

    @EWS
    public final void getDuration(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        callback.invoke(0, Integer.valueOf(((C79982VaE) this.mView).getDuration()));
    }

    @EWS
    public final void pause(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        this.LJLZ = true;
        LJJ(callback);
    }

    @EWS
    public final void play(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        LJJI(callback);
    }

    @EWS
    public final void requestFullScreen(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        LJIJJLI(callback);
    }

    @EWS
    public final void seek(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        LJJIFFI(params.getLong("position"), params.getBoolean("play"), callback);
    }

    @EWS
    public final void stop(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        this.LJLJI = ((C79982VaE) this.mView).LIZ();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C79986VaI.LIZJ[this.LJLJI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("error state: ");
                    LIZ.append(this.LJLJI);
                    javaOnlyMap.putString("msg", X1D.LIZIZ(LIZ));
                    String str = this.LJLIL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("invoke stop in wrong state: ");
                    LIZ2.append(this.LJLJI);
                    LLog.LIZLLL(4, str, X1D.LIZIZ(LIZ2));
                    callback.invoke(1, javaOnlyMap);
                    return;
                }
                javaOnlyMap.putString("msg", "just ready");
                callback.invoke(0, javaOnlyMap);
                return;
            }
            ((C79982VaE) this.mView).LIZLLL(0L, false);
            callback.invoke(0, javaOnlyMap);
            return;
        }
        C79982VaE c79982VaE = (C79982VaE) this.mView;
        c79982VaE.LJLIL.LJ();
        YS4 ys4 = c79982VaE.LJLIL;
        YS3 ys3 = ys4.LJLJI;
        if (ys3 != null) {
            YS7 ys7 = ys3.LJLL;
            if (ys7 != null) {
                ys7.seekTo(0L);
            }
        } else {
            VideoContext videoContext = ys4.LJLJJL;
            if (videoContext != null && videoContext.isCurrentView(ys4)) {
                ys4.LJLJJL.seekTo(0L);
            }
        }
        callback.invoke(0, javaOnlyMap);
    }

    public final void LJJIFFI(long j, boolean z, Callback callback) {
        this.LJLJI = ((C79982VaE) this.mView).LIZ();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C79986VaI.LIZLLL[this.LJLJI.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error state: ");
            LIZ.append(this.LJLJI);
            javaOnlyMap.putString("msg", X1D.LIZIZ(LIZ));
            String str = this.LJLIL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("invoke seek in wrong state: ");
            LIZ2.append(this.LJLJI);
            LLog.LIZLLL(4, str, X1D.LIZIZ(LIZ2));
            if (callback != null) {
                callback.invoke(1, javaOnlyMap);
                return;
            }
            return;
        }
        ((C79982VaE) this.mView).LIZLLL(j, z);
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }
}
