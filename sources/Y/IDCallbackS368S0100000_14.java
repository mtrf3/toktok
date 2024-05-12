package Y;

import X.C16880lQ;
import X.C81120Vsa;
import X.C81121Vsb;
import X.C81122Vsc;
import X.C81245Vub;
import X.C81246Vuc;
import X.C81247Vud;
import X.InterfaceC81248Vue;
import X.VE2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.bytedance.ies.sdk.widgets.LayeredElementConfiguration;
import com.ss.videoarch.live.ttquic.PreloadListener;
import com.ss.videoarch.live.ttquic.PreloadManager;
import com.ss.videoarch.live.ttquic.TTEvent;

/* loaded from: classes15.dex */
public class IDCallbackS368S0100000_14 implements Handler.Callback {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                return handleMessage$0(this, message);
            case 1:
                return handleMessage$1(this, message);
            case 2:
                return handleMessage$2(this, message);
            default:
                return false;
        }
    }

    public IDCallbackS368S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean handleMessage$0(IDCallbackS368S0100000_14 iDCallbackS368S0100000_14, Message message) {
        C81247Vud c81247Vud = (C81247Vud) message.obj;
        if (c81247Vud.LJFF == null || c81247Vud.LIZ == null) {
            return true;
        }
        try {
            if (c81247Vud.LJ == null) {
                if (c81247Vud.LIZLLL == 0) {
                    c81247Vud.LJ = C16880lQ.LLLLIILL(((C81246Vuc) iDCallbackS368S0100000_14.l0).LIZ, c81247Vud.LIZJ, c81247Vud.LIZIZ, false);
                } else {
                    c81247Vud.LJ = C16880lQ.LLLLIILL(((C81246Vuc) iDCallbackS368S0100000_14.l0).LIZ.cloneInContext(new ContextThemeWrapper(((C81246Vuc) iDCallbackS368S0100000_14.l0).LIZ.getContext(), c81247Vud.LIZLLL)), c81247Vud.LIZJ, c81247Vud.LIZIZ, false);
                }
            }
            InterfaceC81248Vue interfaceC81248Vue = c81247Vud.LJFF;
            if (interfaceC81248Vue != null) {
                interfaceC81248Vue.onInflateFinished(c81247Vud.LJ, c81247Vud.LIZJ, c81247Vud.LIZIZ);
            }
        } catch (NullPointerException e) {
            if (LayeredElementConfiguration.INSTANCE.getDebug()) {
                throw e;
            }
        }
        C81245Vub c81245Vub = ((C81246Vuc) iDCallbackS368S0100000_14.l0).LIZJ;
        c81245Vub.getClass();
        c81247Vud.LJFF = null;
        c81247Vud.LIZ = null;
        c81247Vud.LIZIZ = null;
        c81247Vud.LIZJ = 0;
        c81247Vud.LJ = null;
        c81245Vub.LJLILLLLZI.LIZ(c81247Vud);
        return true;
    }

    public static final boolean handleMessage$1(IDCallbackS368S0100000_14 iDCallbackS368S0100000_14, Message message) {
        C81122Vsc c81122Vsc = (C81122Vsc) message.obj;
        if (c81122Vsc.LIZLLL == null) {
            c81122Vsc.LIZLLL = C16880lQ.LLLLIILL(((C81120Vsa) iDCallbackS368S0100000_14.l0).LIZ, c81122Vsc.LIZJ, c81122Vsc.LIZIZ, false);
        }
        c81122Vsc.LJ.onInflateFinished(c81122Vsc.LIZLLL, c81122Vsc.LIZJ, c81122Vsc.LIZIZ);
        C81121Vsb c81121Vsb = ((C81120Vsa) iDCallbackS368S0100000_14.l0).LIZJ;
        c81121Vsb.getClass();
        c81122Vsc.LJ = null;
        c81122Vsc.LIZ = null;
        c81122Vsc.LIZIZ = null;
        c81122Vsc.LIZJ = 0;
        c81122Vsc.LIZLLL = null;
        c81121Vsb.LJLILLLLZI.LIZ(c81122Vsc);
        return true;
    }

    public static final boolean handleMessage$2(IDCallbackS368S0100000_14 iDCallbackS368S0100000_14, Message message) {
        TTEvent tTEvent = (TTEvent) message.obj;
        ((PreloadManager) iDCallbackS368S0100000_14.l0).updateTaskState(tTEvent);
        if (!TextUtils.isEmpty(tTEvent.url)) {
            PreloadManager preloadManager = (PreloadManager) iDCallbackS368S0100000_14.l0;
            VE2 ve2 = preloadManager.mTasks.get(preloadManager.cacheKey(tTEvent.url));
            if (ve2 != null) {
                tTEvent.bundle = ve2.LJLJLLL;
                tTEvent.mode = ve2.LJLJL;
                synchronized (((PreloadManager) iDCallbackS368S0100000_14.l0).mListenerLock) {
                    PreloadListener preloadListener = ((PreloadManager) iDCallbackS368S0100000_14.l0).mListeners.get(Integer.valueOf(ve2.LJLILLLLZI));
                    if (preloadListener != null) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("preload_event", tTEvent.what);
                        bundle.putString("preload_url", tTEvent.url);
                        bundle.putString("preload_error", tTEvent.error);
                        bundle.putInt("preload_code", tTEvent.code);
                        bundle.putInt("preload_sub_code", tTEvent.subCode);
                        bundle.putInt("preload_num", tTEvent.preloadNum);
                        bundle.putInt("video_cached_num", tTEvent.videoCachedNum);
                        bundle.putInt("audio_cached_num", tTEvent.audioCachedNum);
                        bundle.putInt("video_init_section_cached", tTEvent.videoInitSectionCached);
                        bundle.putInt("audio_init_section_cached", tTEvent.audioInitSectionCached);
                        bundle.putLong("cache_read_bytes", tTEvent.cacheReadBytes);
                        bundle.putLong("cache_write_bytes", tTEvent.cacheWriteBytes);
                        bundle.putInt("cache_mode", tTEvent.cacheMode);
                        bundle.putInt("cache_frame_count", tTEvent.cacheFrameCount);
                        bundle.putLong("cache_duration", tTEvent.cacheDuration);
                        bundle.putInt("cache_size", tTEvent.cacheSize);
                        bundle.putLong("cancel_cost_time", tTEvent.cancelCostTime);
                        bundle.putInt("opt_cancel_task", tTEvent.optCancelTask);
                        bundle.putInt("mode", tTEvent.mode);
                        bundle.putBundle("ext_info", tTEvent.bundle);
                        preloadListener.onPreloadEvent(tTEvent.what, bundle);
                    }
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
