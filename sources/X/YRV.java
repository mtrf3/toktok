package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageSEI;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IFrequencyInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRV implements IMessageManager {
    public final YRU LIZ;
    public boolean LIZIZ;

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void needMessage() {
        this.LIZIZ = true;
        if (this.LIZ.LJIIIIZZ.LJIIIZ(EnumC87389YRl.INITED) || this.LIZ.LJIIIIZZ.LJIIIZ(EnumC87389YRl.READY)) {
            this.LIZ.LJIIJ();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void destroyMessage() {
        YRU yru = this.LIZ;
        yru.LIZJ().log("MessagePortal", "destroyMessage");
        Iterator<YRT> it = yru.LJIIIZ.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
        yru.LIZ.quit();
        yru.LIZIZ.quit();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final String getDomain() {
        IMessageWsClient iMessageWsClient;
        String domain;
        C32075CiN c32075CiN = this.LIZ.LJIIIIZZ().LIZ.LIZJ;
        if (c32075CiN != null) {
            YRJ yrj = c32075CiN.LIZIZ.LIZJ;
            if (yrj == null || (iMessageWsClient = yrj.LJLIL) == null || (domain = iMessageWsClient.getDomain()) == null) {
                return "";
            }
            return domain;
        }
        o.LJIJI("messageConfiguration");
        throw null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final java.util.Map<String, String> getFetchHistoryParams() {
        IMessageWsClient iMessageWsClient;
        java.util.Map<String, String> fetchHistoryParams;
        C32075CiN c32075CiN = this.LIZ.LJIIIIZZ().LIZ.LIZJ;
        if (c32075CiN != null) {
            YRJ yrj = c32075CiN.LIZIZ.LIZJ;
            if (yrj == null || (iMessageWsClient = yrj.LJLIL) == null || (fetchHistoryParams = iMessageWsClient.getFetchHistoryParams()) == null) {
                return C113554cx.LJJJLIIL();
            }
            return fetchHistoryParams;
        }
        o.LJIJI("messageConfiguration");
        throw null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final C32075CiN getMessageConfiguration() {
        C32075CiN c32075CiN = this.LIZ.LIZJ;
        if (c32075CiN != null) {
            return c32075CiN;
        }
        o.LJIJI("messageConfiguration");
        throw null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final Looper getMessageDispatchLooper() {
        return this.LIZ.LJFF.LJIJJ.LJII();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final boolean isWsConnected() {
        IMessageWsClient iMessageWsClient;
        C32075CiN c32075CiN = this.LIZ.LJIIIIZZ().LIZ.LIZJ;
        if (c32075CiN != null) {
            YRJ yrj = c32075CiN.LIZIZ.LIZJ;
            if (yrj != null && (iMessageWsClient = yrj.LJLIL) != null) {
                return iMessageWsClient.isWsConnected();
            }
            return false;
        }
        o.LJIJI("messageConfiguration");
        throw null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void releaseMessage() {
        YRU yru = this.LIZ;
        yru.LIZJ().log("MessagePortal", "releaseMessage");
        Iterator<YRT> it = yru.LJIIIZ.iterator();
        while (it.hasNext()) {
            it.next().onRelease();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void startMessage() {
        if (!this.LIZIZ) {
            return;
        }
        this.LIZ.LJIIJ();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void startPrefetchMessage() {
        YRU yru = this.LIZ;
        MessageMonitor LIZJ = yru.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startPrefetchMessage, stateManager: ");
        LIZ.append(yru.LJIIIIZZ);
        LIZ.append(", dimension: ");
        LIZ.append(yru.LJIIIIZZ().LIZJ);
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
        Iterator<YRT> it = yru.LJIIIZ.iterator();
        while (it.hasNext()) {
            it.next().startPrefetchMessage();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void addEventListener(EventListener eventListener) {
        if (eventListener != null) {
            YRS yrs = this.LIZ.LJ;
            yrs.getClass();
            if (!((CopyOnWriteArrayList) yrs.LIZ).contains(eventListener)) {
                ((CopyOnWriteArrayList) yrs.LIZ).add(eventListener);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void addFrequencyInterceptor(IFrequencyInterceptor iFrequencyInterceptor) {
        if (iFrequencyInterceptor != null) {
            YRU yru = this.LIZ;
            yru.getClass();
            YRW yrw = yru.LJFF;
            yrw.getClass();
            if (!((CopyOnWriteArrayList) yrw.LJIIJ).contains(iFrequencyInterceptor)) {
                ((CopyOnWriteArrayList) yrw.LJIIJ).add(iFrequencyInterceptor);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void addInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor != null) {
            YRU yru = this.LIZ;
            yru.getClass();
            YRW yrw = yru.LJFF;
            yrw.getClass();
            if (!((CopyOnWriteArrayList) yrw.LJIIIZ).contains(iInterceptor)) {
                ((CopyOnWriteArrayList) yrw.LJIIIZ).add(iInterceptor);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void insertMessage(IMessage iMessage) {
        if (iMessage != null) {
            this.LIZ.LJIIIZ(iMessage, false);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void onMessageSEI(MessageSEI messageSEI) {
        Message obtainMessage;
        if (messageSEI != null) {
            YRU yru = this.LIZ;
            yru.getClass();
            YRW yrw = yru.LJFF;
            yrw.getClass();
            if (yrw.LJII) {
                YRZ yrz = yrw.LJIJJLI;
                yrz.getClass();
                Handler handler = yrz.LIZLLL;
                if (handler != null && (obtainMessage = handler.obtainMessage(151, messageSEI)) != null) {
                    obtainMessage.sendToTarget();
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void refresh(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
        this.LIZ.LJII(configuration);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void removeEventListener(EventListener eventListener) {
        if (eventListener != null) {
            YRS yrs = this.LIZ.LJ;
            yrs.getClass();
            ((CopyOnWriteArrayList) yrs.LIZ).remove(eventListener);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void removeFrequencyInterceptor(IFrequencyInterceptor iFrequencyInterceptor) {
        if (iFrequencyInterceptor != null) {
            YRU yru = this.LIZ;
            yru.getClass();
            YRW yrw = yru.LJFF;
            yrw.getClass();
            ((CopyOnWriteArrayList) yrw.LJIIJ).remove(iFrequencyInterceptor);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void removeInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor != null) {
            YRU yru = this.LIZ;
            yru.getClass();
            YRW yrw = yru.LJFF;
            yrw.getClass();
            ((CopyOnWriteArrayList) yrw.LJIIIZ).remove(iInterceptor);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void removeMessageListener(OnIMMessageListener onIMMessageListener) {
        if (onIMMessageListener != null) {
            YRU yru = this.LIZ;
            yru.getClass();
            YRW yrw = yru.LJFF;
            yrw.getClass();
            if (yrw.LJJI) {
                int size = yrw.LJIILIIL.size();
                for (int i = 0; i < size; i++) {
                    java.util.Set<OnIMMessageListener> valueAt = yrw.LJIILIIL.valueAt(i);
                    if (valueAt != null) {
                        valueAt.remove(onIMMessageListener);
                    }
                }
                return;
            }
            YRW.LJIILL(yrw.LJIIJJI, null, onIMMessageListener);
            if (yrw.LJJ) {
                YRW.LJIILL(yrw.LJIIL, null, onIMMessageListener);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void stopMessage(C30176Bsq stopMessageConfig) {
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        YRU yru = this.LIZ;
        yru.getClass();
        yru.LIZJ().log("MessagePortal", "stopMessage");
        Iterator<YRT> it = yru.LJIIIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ(stopMessageConfig);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void removeMessageListener(OnMessageListener onMessageListener) {
        if (onMessageListener != null) {
            YRU yru = this.LIZ;
            yru.getClass();
            YRW yrw = yru.LJFF;
            yrw.getClass();
            YRW.LJIILL(yrw.LJIIJJI, null, onMessageListener);
            if (yrw.LJJ) {
                YRW.LJIILL(yrw.LJIIL, null, onMessageListener);
            }
        }
    }

    public YRV(YRU yru, boolean z) {
        this.LIZ = yru;
        this.LIZIZ = z;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void addAsyncMessageListener(int i, OnMessageListener onMessageListener) {
        if (onMessageListener != null) {
            YRU yru = this.LIZ;
            yru.getClass();
            yru.LJFF.LJIILIIL(i, onMessageListener);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void addMessageListener(int i, OnIMMessageListener onIMMessageListener) {
        if (onIMMessageListener != null) {
            YRU yru = this.LIZ;
            yru.getClass();
            YRW yrw = yru.LJFF;
            yrw.getClass();
            if (yrw.LJJI) {
                int i2 = UQ1.LIZ[onIMMessageListener.messageListenerType().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    yrw.LJIILIIL(i, onIMMessageListener);
                    return;
                } else {
                    java.util.Set<OnIMMessageListener> set = yrw.LJIILIIL.get(i);
                    if (set == null) {
                        set = new CopyOnWriteArraySet<>();
                        yrw.LJIILIIL.put(i, set);
                    }
                    set.add(onIMMessageListener);
                    return;
                }
            }
            yrw.LJIILJJIL(i, onIMMessageListener);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void insertMessage(IMessage iMessage, boolean z) {
        if (iMessage != null) {
            this.LIZ.LJIIIZ(iMessage, z);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void removeMessageListener(int i, OnMessageListener onMessageListener) {
        if (onMessageListener != null) {
            YRU yru = this.LIZ;
            Integer valueOf = Integer.valueOf(i);
            yru.getClass();
            YRW yrw = yru.LJFF;
            yrw.getClass();
            YRW.LJIILL(yrw.LJIIJJI, valueOf, onMessageListener);
            if (yrw.LJJ) {
                YRW.LJIILL(yrw.LJIIL, valueOf, onMessageListener);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void resetRoomInfo(long j, C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
        YRU yru = this.LIZ;
        yru.getClass();
        MessageMonitor LIZJ = yru.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resetDimension, stateManager: ");
        LIZ.append(yru.LJIIIIZZ);
        LIZ.append(", dimension: ");
        LIZ.append(j);
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
        yru.LIZJ = configuration;
        yru.LJIIIIZZ().LIZJ = j;
        Iterator<YRT> it = yru.LJIIIZ.iterator();
        while (it.hasNext()) {
            it.next().LJ(j, configuration);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void addMessageListener(int i, OnMessageListener onMessageListener) {
        if (onMessageListener != null) {
            YRU yru = this.LIZ;
            yru.getClass();
            yru.LJFF.LJIILJJIL(i, onMessageListener);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public final void sendRequest(long j, C64972Pei request, YMF callback) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(callback, "callback");
        YRU yru = this.LIZ;
        yru.getClass();
        yru.LJI.LIZIZ(j, request, callback);
    }
}
