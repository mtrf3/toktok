package X;

import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseArray;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IFrequencyInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRW implements YRT {
    public static final /* synthetic */ int LJJIIZI = 0;
    public final YRK LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public List<String> LIZLLL;
    public List<String> LJ;
    public List<String> LJFF;
    public long LJI;
    public boolean LJII;
    public InterfaceC87393YRp LJIIIIZZ;
    public final List<IInterceptor> LJIIIZ;
    public final List<IFrequencyInterceptor> LJIIJ;
    public final SparseArray<java.util.Set<OnMessageListener>> LJIIJJI;
    public final SparseArray<java.util.Set<OnMessageListener>> LJIIL;
    public final SparseArray<java.util.Set<OnIMMessageListener>> LJIILIIL;
    public final C87384YRg LJIILJJIL;
    public final C87384YRg LJIILL;
    public IMessageWsClient LJIILLIIL;
    public boolean LJIIZILJ;
    public long LJIJ;
    public int LJIJI;
    public InterfaceC87391YRn LJIJJ;
    public final YRZ LJIJJLI;
    public final YRX LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public Handler LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public final ConcurrentHashMap<String, Object> LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;

    @Override // X.YRT
    public final void onRelease() {
        this.LJJIIJZLJL = false;
        this.LJIJJ.onRelease();
        this.LJIL.onRelease();
        this.LJIJJLI.onRelease();
        ((CopyOnWriteArrayList) this.LJIIIZ).clear();
        ((CopyOnWriteArrayList) this.LJIIJ).clear();
        this.LJIIJJI.clear();
        this.LJIIL.clear();
        this.LJIILJJIL.LIZIZ();
        this.LJIILIIL.clear();
        this.LJIILL.LIZIZ();
        this.LJIJ = 0L;
        Handler handler = this.LJJIFFI;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJJIIJ.clear();
    }

    @Override // X.YRT
    public final void onStart() {
        this.LJJIIJZLJL = true;
        this.LJIJ = SystemClock.elapsedRealtime();
        this.LJIJI++;
        this.LJIJJ.onStart();
        this.LJIL.getClass();
        this.LJIJJLI.getClass();
    }

    @Override // X.YRT
    public final void startPrefetchMessage() {
    }

    @Override // X.YRT
    public final void LIZ() {
        this.LJJIFFI = new Handler(C16880lQ.LLJJJJ());
        this.LJIJJ.LIZ();
        this.LJIL.getClass();
        this.LJIJJLI.LIZ();
    }

    @Override // X.YRT
    public final void onDestroy() {
        this.LJIJJ.onDestroy();
        this.LJIL.onDestroy();
        this.LJIJJLI.onDestroy();
        ((CopyOnWriteArrayList) this.LJIIIZ).clear();
        ((CopyOnWriteArrayList) this.LJIIJ).clear();
        this.LJIIJJI.clear();
        this.LJIIL.clear();
        this.LJIILIIL.clear();
        this.LJIILJJIL.LIZIZ();
        this.LJIILL.LIZIZ();
        this.LJIJI = 0;
        this.LJJII = 0;
        this.LJJIII = 0;
        Handler handler = this.LJJIFFI;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJJIIJ.clear();
    }

    public YRW(YRK portal) {
        o.LJIIIZ(portal, "portal");
        this.LIZ = portal;
        this.LIZIZ = 512;
        this.LIZLLL = new ArrayList();
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
        this.LJI = 10L;
        this.LJIIIIZZ = new C87387YRj();
        this.LJIIIZ = new CopyOnWriteArrayList();
        this.LJIIJ = new CopyOnWriteArrayList();
        this.LJIIJJI = new SparseArray<>();
        this.LJIIL = new SparseArray<>();
        this.LJIILIIL = new SparseArray<>();
        this.LJIILJJIL = new C87384YRg(this.LIZIZ, portal);
        this.LJIILL = new C87384YRg(this.LIZIZ, portal);
        this.LJIIZILJ = true;
        this.LJIJJ = new C87383YRf(portal, this);
        this.LJIJJLI = new YRZ(portal, this);
        this.LJIL = new YRX(portal, this);
        this.LJJIIJ = new ConcurrentHashMap<>();
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        boolean z;
        InterfaceC87393YRp c87378YRa;
        IMessageWsClient iMessageWsClient;
        o.LJIIIZ(configuration, "configuration");
        C87379YRb c87379YRb = configuration.LIZ;
        this.LIZIZ = c87379YRb.LIZ;
        int i = c87379YRb.LJIIIIZZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 6) {
                            if (i != 7) {
                                this.LJIJJ = new C87380YRc(this.LIZ, this);
                            } else {
                                this.LJIJJ = new YRY(this.LIZ, this);
                            }
                        } else {
                            this.LJIJJ = new C87381YRd(this.LIZ, this);
                        }
                    } else {
                        this.LJIJJ = new C87385YRh(this.LIZ, this);
                    }
                } else {
                    this.LJIJJ = new C87382YRe(this.LIZ, this);
                }
            } else {
                this.LJIJJ = new C87380YRc(this.LIZ, this);
            }
        } else {
            this.LJIJJ = new C87383YRf(this.LIZ, this);
        }
        C87379YRb c87379YRb2 = configuration.LIZ;
        int i2 = c87379YRb2.LJIILJJIL;
        this.LJJ = c87379YRb2.LJIIZILJ;
        if (c87379YRb2.LJIIIIZZ == 6) {
            z = true;
        } else {
            z = false;
        }
        this.LJJI = z;
        if (i2 <= 0) {
            c87378YRa = new C87387YRj();
        } else {
            c87378YRa = new C87378YRa(i2, this.LIZ);
        }
        this.LJIIIIZZ = c87378YRa;
        this.LJIJJ.LIZLLL(configuration);
        this.LJIL.getClass();
        this.LJIJJLI.getClass();
        C87379YRb c87379YRb3 = configuration.LIZ;
        this.LIZJ = c87379YRb3.LIZJ;
        this.LIZLLL = c87379YRb3.LIZLLL;
        this.LJ = c87379YRb3.LJ;
        this.LJFF = c87379YRb3.LJFF;
        this.LJI = c87379YRb3.LJII;
        this.LJII = c87379YRb3.LIZIZ;
        this.LJJIIZ = c87379YRb3.LJIJ;
        ((CopyOnWriteArrayList) this.LJIIIZ).clear();
        ((CopyOnWriteArrayList) this.LJIIIZ).addAll(configuration.LIZIZ.LIZ);
        ((CopyOnWriteArrayList) this.LJIIJ).clear();
        ((CopyOnWriteArrayList) this.LJIIJ).addAll(configuration.LIZIZ.LIZIZ);
        YRJ yrj = configuration.LIZIZ.LIZJ;
        if (yrj != null) {
            iMessageWsClient = yrj.LJLIL;
        } else {
            iMessageWsClient = null;
        }
        this.LJIILLIIL = iMessageWsClient;
        this.LJIIZILJ = true;
        this.LJIJI = 0;
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        this.LJJIIJZLJL = false;
        this.LJIJJ.LJIIIIZZ(stopMessageConfig);
        this.LJIL.LJIIIIZZ(stopMessageConfig);
        this.LJIJJLI.LJIIIIZZ(stopMessageConfig);
    }

    public final boolean LJIIJJI(IMessage iMessage) {
        if (iMessage.getDispatchStrategy() == 1 && this.LJ.contains(iMessage.getMethodName())) {
            return true;
        }
        if (this.LIZJ) {
            if (this.LIZLLL.contains(iMessage.getMethodName()) || (C32072CiK.LIZJ(iMessage.getGeneralMessageType()) && !this.LJFF.contains(iMessage.getMethodName()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
        ((CopyOnWriteArrayList) this.LJIIIZ).clear();
        this.LJIILJJIL.LIZIZ();
        this.LJIILL.LIZIZ();
        ((CopyOnWriteArrayList) this.LJIIIZ).addAll(currentConfiguration.LIZIZ.LIZ);
        ((CopyOnWriteArrayList) this.LJIIJ).clear();
        ((CopyOnWriteArrayList) this.LJIIJ).addAll(currentConfiguration.LIZIZ.LIZIZ);
        this.LJIIZILJ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(long j, List messages) {
        o.LJIIIZ(messages, "messages");
        if (!this.LJJIIJZLJL && this.LJJIIZ) {
            this.LIZ.LIZJ().log("MessagePortal", "but isStarted is false dispatchMessage");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = messages.iterator();
        while (it.hasNext()) {
            IMessage iMessage = (IMessage) it.next();
            java.util.Map<String, Object> extraParams = iMessage.getExtraParams();
            o.LJIIIIZZ(extraParams, "message.extraParams");
            extraParams.put(MessageMonitor.getLiveMessageStageName("enqueue_time", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
            if (!this.LJII) {
                arrayList.add(iMessage);
            } else {
                if (iMessage.getMessageSEI() != null && iMessage.getDispatchTimeoutMillis() <= 0) {
                    iMessage.removeMessageSEI();
                }
                if (iMessage.getMessageSEI() != null || iMessage.getDependID() != null) {
                    arrayList2.add(iMessage);
                } else {
                    arrayList.add(iMessage);
                }
            }
        }
        List<IMessage> LJFF = this.LJIJJ.LJFF();
        Iterator it2 = ((CopyOnWriteArrayList) this.LJIIJ).iterator();
        List messages2 = arrayList;
        while (it2.hasNext()) {
            messages2 = ((IFrequencyInterceptor) it2.next()).onFrequencyMessage(messages2, LJFF);
        }
        if (!messages2.isEmpty()) {
            YRS LJI = this.LIZ.LJI();
            LJI.getClass();
            o.LJIIIZ(messages2, "messages");
            Iterator it3 = ((CopyOnWriteArrayList) LJI.LIZ).iterator();
            while (it3.hasNext()) {
                ((EventListener) it3.next()).onPreDispatchMessages(messages2);
            }
            this.LJIJJ.LJI(j, messages2);
            if (this.LJJ) {
                this.LJIL.LJI(j, messages2);
            }
        }
        if (!arrayList2.isEmpty()) {
            this.LJIJJLI.LJI(j, arrayList2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
    
        if (r3 != 3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.ss.ugc.live.sdk.message.data.IMessage r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YRW.LJIIIZ(com.ss.ugc.live.sdk.message.data.IMessage, boolean):void");
    }

    public final void LJIIJ(OnIMMessageListener onIMMessageListener, IMessage iMessage) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        onIMMessageListener.onMessage(iMessage);
        if (SystemClock.elapsedRealtime() - elapsedRealtime >= this.LJI && CN0.LIZ) {
            MessageMonitor LIZJ = this.LIZ.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("a message has timeout!!! ");
            LIZ.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            LIZ.append("ms, method: ");
            LIZ.append(iMessage.getMethodName());
            LIZ.append(", from: ");
            LIZ.append(onIMMessageListener.getClass());
            LIZJ.log("MessageDispatchDelegate", X1D.LIZIZ(LIZ));
        }
    }

    public final void LJIIL(IMessage message, boolean z) {
        o.LJIIIZ(message, "message");
        if (!this.LJJIIJZLJL && this.LJJIIZ) {
            MessageMonitor LIZJ = this.LIZ.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("but isStarted is false onMessage roomid=");
            LIZ.append(message.getDimension());
            LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
            return;
        }
        java.util.Map<String, Object> extraParams = message.getExtraParams();
        o.LJIIIIZZ(extraParams, "message.extraParams");
        extraParams.put(MessageMonitor.getLiveMessageStageName("enqueue_time", MessageMonitor.Stage.END), Long.valueOf(SystemClock.elapsedRealtime()));
        java.util.Map<String, Object> extraParams2 = message.getExtraParams();
        o.LJIIIIZZ(extraParams2, "message.extraParams");
        extraParams2.put(MessageMonitor.getLiveMessageStageName("interceptor_time", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
        synchronized (this) {
            if (message.getIntercepted() == null) {
                Iterator it = ((CopyOnWriteArrayList) this.LJIIIZ).iterator();
                while (it.hasNext()) {
                    if (((IInterceptor) it.next()).onMessage(message)) {
                        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LJI().LIZ).iterator();
                        while (it2.hasNext()) {
                            ((EventListener) it2.next()).onInterceptMessage(message);
                        }
                        message.setIntercepted(Boolean.TRUE);
                        return;
                    }
                }
                message.setIntercepted(Boolean.FALSE);
            } else {
                boolean LJ = o.LJ(message.getIntercepted(), Boolean.TRUE);
                if (LJ) {
                    return;
                }
            }
            java.util.Map<String, Object> extraParams3 = message.getExtraParams();
            o.LJIIIIZZ(extraParams3, "message.extraParams");
            extraParams3.put(MessageMonitor.getLiveMessageStageName("interceptor_time", MessageMonitor.Stage.END), Long.valueOf(SystemClock.elapsedRealtime()));
            LJIIIZ(message, z);
        }
    }

    public final void LJIILIIL(int i, OnMessageListener listener) {
        o.LJIIIZ(listener, "listener");
        if (this.LJJ) {
            java.util.Set<OnMessageListener> set = this.LJIIL.get(i);
            if (set == null) {
                set = new CopyOnWriteArraySet<>();
                this.LJIIL.put(i, set);
            }
            set.add(listener);
            return;
        }
        LJIILJJIL(i, listener);
    }

    public final void LJIILJJIL(int i, OnMessageListener listener) {
        o.LJIIIZ(listener, "listener");
        java.util.Set<OnMessageListener> set = this.LJIIJJI.get(i);
        if (set == null) {
            set = new CopyOnWriteArraySet<>();
            this.LJIIJJI.put(i, set);
        }
        set.add(listener);
    }

    public static void LJIILL(SparseArray sparseArray, Integer num, OnMessageListener onMessageListener) {
        if (num != null) {
            java.util.Set set = (java.util.Set) sparseArray.get(num.intValue());
            if (set != null && (!set.isEmpty())) {
                set.remove(onMessageListener);
                return;
            }
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            java.util.Set set2 = (java.util.Set) sparseArray.valueAt(i);
            if (set2 != null) {
                set2.remove(onMessageListener);
            }
        }
    }
}
