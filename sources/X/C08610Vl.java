package X;

import android.os.Handler;
import com.bytedance.als.ui.state.LiveState;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08610Vl<STATE> {
    public boolean LIZIZ;
    public STATE LJ;
    public final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public final C1HQ<TBW<?, ?>, LiveState<?>> LIZJ = new C1HQ<>();
    public final LiveState<STATE> LIZLLL = new LiveState<>(new IDqS420S0100000(this, 94));

    public C08610Vl(STATE state) {
        this.LJ = state;
    }

    public final <V> LiveState<V> LIZ(TBW<STATE, ? extends V> property) {
        o.LJIIIZ(property, "property");
        return LIZIZ(property);
    }

    public final synchronized <V> LiveState<V> LIZIZ(TBW<STATE, ? extends V> property) {
        o.LJIIIZ(property, "property");
        LiveState<V> liveState = (LiveState) this.LIZJ.getOrDefault(property, null);
        if (liveState != null) {
            return liveState;
        }
        LiveState<V> liveState2 = new LiveState<>(new IDqS176S0200000(this, property, 35));
        this.LIZJ.put(property, liveState2);
        return liveState2;
    }

    public final void LIZJ(boolean z) {
        this.LIZIZ = true;
        try {
            Collection<LiveState<?>> values = this.LIZJ.values();
            o.LJIIIIZZ(values, "mLiveStateMap.values");
            Iterator<LiveState<?>> it = values.iterator();
            while (it.hasNext()) {
                it.next().LJI(z);
            }
            if (true ^ this.LIZLLL.LIZIZ.isEmpty()) {
                this.LIZLLL.LJI(z);
            }
        } finally {
            this.LIZIZ = false;
        }
    }

    public void LIZLLL(final InterfaceC88472Yns block, final boolean z) {
        o.LJIIIZ(block, "block");
        this.LIZ.post(new Runnable() { // from class: X.0Vm
            /* JADX WARN: Type inference failed for: r0v2, types: [STATE, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C08610Vl c08610Vl = C08610Vl.this;
                    c08610Vl.LJ = block.invoke(c08610Vl.LJ);
                    C08610Vl.this.LIZJ(z);
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
