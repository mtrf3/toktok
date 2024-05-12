package X;

import Y.IDBReceiverS10S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.videoshop.context.LifeCycleObserver;
import com.ss.android.videoshop.context.VideoContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VIr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class EnumC79517VIr implements InterfaceC79519VIt, InterfaceC48276Ix6 {
    public static final EnumC79517VIr KEEPER;
    public static final /* synthetic */ EnumC79517VIr[] LJLJJLL;
    public final java.util.Map<Context, VideoContext> LJLIL = new HashMap();
    public C79520VIu LJLILLLLZI;
    public C48275Ix5 LJLJI;
    public boolean LJLJJI;
    public final IDBReceiverS10S0100000_14 LJLJJL;
    public VideoContext currentVideoContext;
    public EnumC48190Ivi networkType;

    @Override // X.InterfaceC48276Ix6
    public void onScreenOn() {
    }

    static {
        EnumC79517VIr enumC79517VIr = new EnumC79517VIr();
        KEEPER = enumC79517VIr;
        LJLJJLL = new EnumC79517VIr[]{enumC79517VIr};
    }

    public EnumC79517VIr() {
        IDBReceiverS10S0100000_14 iDBReceiverS10S0100000_14 = new IDBReceiverS10S0100000_14(this, 0);
        this.LJLJJL = iDBReceiverS10S0100000_14;
        Context context = C78999UzT.LJLIL;
        if (context != null) {
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = new C79520VIu(context, this);
            }
            if (this.LJLJI == null) {
                this.LJLJI = new C48275Ix5(context, this);
            }
        }
        Context context2 = C78999UzT.LJLIL;
        IntentFilter LIZ = AnonymousClass028.LIZ("android.net.conn.CONNECTIVITY_CHANGE");
        if (context2 != null) {
            try {
                C16880lQ.LJJLIIIJILLIZJL(iDBReceiverS10S0100000_14, context2, LIZ);
                this.LJLJJI = true;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static EnumC79517VIr[] values() {
        return (EnumC79517VIr[]) LJLJJLL.clone();
    }

    public EnumC48190Ivi getNetworkType() {
        Context context = C78999UzT.LJLIL;
        if (!this.LJLJJI && context != null) {
            this.networkType = C48189Ivh.LJ(context);
        }
        return this.networkType;
    }

    @Override // X.InterfaceC48276Ix6
    public void onScreenOff() {
        VideoContext videoContext = this.currentVideoContext;
        if (videoContext != null) {
            Iterator<Map.Entry<Lifecycle, LifeCycleObserver>> it = videoContext.lifeCycleVideoHandlerMap.entrySet().iterator();
            while (it.hasNext()) {
                LifeCycleObserver value = it.next().getValue();
                if (value != null) {
                    value.onScreenOff(this.currentVideoContext);
                }
            }
        }
    }

    public C79520VIu getVideoAudioFocusController() {
        return this.LJLILLLLZI;
    }

    public static EnumC79517VIr valueOf(String str) {
        return (EnumC79517VIr) V0N.LJJJ(EnumC79517VIr.class, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoContext getVideoContext(Context context) {
        if (C78999UzT.LJLIL == null && context != null) {
            C78999UzT.LJLIL = C16880lQ.LLLLL(context);
        }
        if (!this.LJLJJI) {
            Context context2 = C78999UzT.LJLIL;
            IntentFilter LIZ = AnonymousClass028.LIZ("android.net.conn.CONNECTIVITY_CHANGE");
            if (context2 != null) {
                try {
                    C16880lQ.LJJLIIIJILLIZJL(this.LJLJJL, context2, LIZ);
                    this.LJLJJI = true;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        Activity LIZ2 = C48672J8i.LIZ(context);
        if (!(LIZ2 instanceof LifecycleOwner)) {
            return null;
        }
        if (((HashMap) this.LJLIL).containsKey(LIZ2)) {
            return (VideoContext) ((HashMap) this.LJLIL).get(LIZ2);
        }
        VideoContext videoContext = new VideoContext(LIZ2);
        if (((LifecycleOwner) LIZ2).getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            ((HashMap) this.LJLIL).put(LIZ2, videoContext);
        }
        return videoContext;
    }

    public void onActResume(VideoContext videoContext) {
        Context context = C78999UzT.LJLIL;
        if (context != null) {
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = new C79520VIu(context, this);
            }
            if (this.LJLJI == null) {
                this.LJLJI = new C48275Ix5(context, this);
            }
        }
        if (videoContext != null) {
            videoContext.videoAudioFocusController = this.LJLILLLLZI;
            videoContext.videoScreenStateController = this.LJLJI;
            videoContext.setTryToInterceptPlay(true);
            this.currentVideoContext = videoContext;
        }
    }

    @Override // X.InterfaceC79519VIt
    public void onAudioFocusGain(boolean z) {
        VideoContext videoContext = this.currentVideoContext;
        if (videoContext != null) {
            Iterator<Map.Entry<Lifecycle, LifeCycleObserver>> it = videoContext.lifeCycleVideoHandlerMap.entrySet().iterator();
            while (it.hasNext()) {
                LifeCycleObserver value = it.next().getValue();
                if (value != null) {
                    value.onAudioFocusGain(this.currentVideoContext, z);
                }
            }
        }
    }

    @Override // X.InterfaceC79519VIt
    public void onAudioFocusLoss(boolean z) {
        VideoContext videoContext = this.currentVideoContext;
        if (videoContext != null) {
            Iterator<Map.Entry<Lifecycle, LifeCycleObserver>> it = videoContext.lifeCycleVideoHandlerMap.entrySet().iterator();
            while (it.hasNext()) {
                LifeCycleObserver value = it.next().getValue();
                if (value != null) {
                    value.onAudioFocusLoss(this.currentVideoContext, z);
                }
            }
        }
    }

    @Override // X.InterfaceC48276Ix6
    public void onScreenUserPresent(boolean z) {
        VideoContext videoContext = this.currentVideoContext;
        if (videoContext != null) {
            Iterator<Map.Entry<Lifecycle, LifeCycleObserver>> it = videoContext.lifeCycleVideoHandlerMap.entrySet().iterator();
            while (it.hasNext()) {
                LifeCycleObserver value = it.next().getValue();
                if (value != null) {
                    value.onScreenUserPresent(this.currentVideoContext);
                }
            }
        }
    }

    public void onActDestroy(Context context, VideoContext videoContext) {
        if (videoContext != null) {
            videoContext.videoAudioFocusController = null;
            videoContext.videoScreenStateController = null;
            if (videoContext == this.currentVideoContext) {
                this.currentVideoContext = null;
            }
        }
        ((HashMap) this.LJLIL).remove(context);
        Iterator it = ((HashMap) this.LJLIL).keySet().iterator();
        while (it.hasNext()) {
            Object obj = (Context) it.next();
            if ((obj instanceof LifecycleOwner) && ((LifecycleOwner) obj).getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                it.remove();
            }
        }
    }
}
