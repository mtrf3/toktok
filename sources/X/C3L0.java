package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3L0 */
/* loaded from: classes2.dex */
public abstract class C3L0 implements C3LS {
    public final C3L9 LJLILLLLZI;
    public volatile C81983Jq LJLJJI;
    public final java.util.Map<C81983Jq, InterfaceC81953Jn> LJLJI = new ConcurrentHashMap();
    public final ConcurrentHashSet LJLIL = new ConcurrentHashSet();

    public abstract void LJI(boolean z);

    public abstract void LJII(int i, Handler handler, InterfaceC81953Jn interfaceC81953Jn);

    public static boolean LJFF() {
        return C55888Lwa.LIZIZ.LJJI(true);
    }

    public final InterfaceC81953Jn LJ() {
        C81983Jq c81983Jq = this.LJLJJI;
        if (c81983Jq != null) {
            return (InterfaceC81953Jn) ((ConcurrentHashMap) this.LJLJI).get(c81983Jq);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3L9] */
    public C3L0() {
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "getMainLooper()");
        this.LJLILLLLZI = new Handler(LLJJJJ, this) { // from class: X.3L9
            public final WeakReference<C3LS> LIZ;

            @Override // android.os.Handler
            public final void handleMessage(Message msg) {
                InterfaceC81953Jn interfaceC81953Jn;
                o.LJIIIZ(msg, "msg");
                super.handleMessage(msg);
                C3LS c3ls = this.LIZ.get();
                if (c3ls != null) {
                    int i = msg.what;
                    if (i != 1) {
                        if (i != 2) {
                            return;
                        }
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.arg1 = msg.arg1;
                        obtain.obj = msg.obj;
                        sendMessageDelayed(obtain, 300L);
                        return;
                    }
                    Object obj = msg.obj;
                    if (!(obj instanceof InterfaceC81953Jn) || (interfaceC81953Jn = (InterfaceC81953Jn) obj) == null) {
                        C34B.LIZJ("SessionListRefreshHandler", "no pagination data");
                    } else {
                        c3ls.LIZ(msg.arg1, interfaceC81953Jn);
                    }
                }
            }

            {
                o.LJIIIZ(this, "handler");
                this.LIZ = new WeakReference<>(this);
            }
        };
    }

    public void LIZLLL(C3LO<C3L4> observer, Handler handler) {
        o.LJIIIZ(observer, "observer");
        o.LJIIIZ(handler, "handler");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("binding observer: ");
        LIZ.append(observer);
        C34B.LIZIZ("SessionListManagerV2", X1D.LIZIZ(LIZ));
        this.LJLIL.add(observer);
    }

    public static /* synthetic */ void LJIIIIZZ(C3L0 c3l0, int i, InterfaceC81953Jn interfaceC81953Jn, int i2) {
        C3L9 c3l9;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c3l9 = c3l0.LJLILLLLZI;
        } else {
            c3l9 = null;
        }
        c3l0.LJII(i, c3l9, interfaceC81953Jn);
    }
}
