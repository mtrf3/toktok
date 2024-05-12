package X;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Sqo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73366Sqo implements InterfaceC73367Sqp {
    public final MutableLiveData<java.util.Map<String, OSZ<TEA, Integer>>> LIZ = new MutableLiveData<>();
    public final MutableLiveData<OSJ<Effect, TEA, Integer>> LIZIZ = new MutableLiveData<>();
    public final InterfaceC73389SrB LIZJ;
    public final InterfaceC84497XEf LIZLLL;

    @Override // X.InterfaceC73367Sqp
    public final MutableLiveData LIZ() {
        return this.LIZIZ;
    }

    public C73366Sqo(InterfaceC73389SrB interfaceC73389SrB, InterfaceC84497XEf interfaceC84497XEf) {
        this.LIZJ = interfaceC73389SrB;
        this.LIZLLL = interfaceC84497XEf;
    }

    @Override // X.InterfaceC73367Sqp
    public final OSZ<TEA, Integer> LIZJ(Effect data, boolean z) {
        OSZ<TEA, Integer> osz;
        o.LJIIIZ(data, "data");
        java.util.Map<String, OSZ<TEA, Integer>> value = this.LIZ.getValue();
        if (value != null) {
            osz = value.get(data.getId());
        } else {
            osz = null;
        }
        if (C82894Wg6.LIZIZ.LJIIJJI()) {
            if (osz != null) {
                return osz;
            }
            return new OSZ<>(TEA.UNKNOWN, 0);
        }
        if (osz == null) {
            if (z) {
                if (C44687HgJ.LIZIZ(data.getUnzipPath())) {
                    return new OSZ<>(TEA.UNKNOWN, 0);
                }
                return new OSZ<>(TEA.NOT_DOWNLOAD, 0);
            }
            InterfaceC73389SrB interfaceC73389SrB = this.LIZJ;
            if (interfaceC73389SrB != null && interfaceC73389SrB.LIZIZ(data)) {
                osz = new OSZ<>(TEA.UNKNOWN, 0);
            } else {
                InterfaceC84497XEf interfaceC84497XEf = this.LIZLLL;
                if (interfaceC84497XEf != null && C30591Hz.LJII(data, interfaceC84497XEf)) {
                    osz = new OSZ<>(TEA.UNKNOWN, 0);
                } else {
                    osz = new OSZ<>(TEA.NOT_DOWNLOAD, 0);
                }
            }
            LIZIZ(data, osz.getFirst(), osz.getSecond(), false);
        }
        return osz;
    }

    @Override // X.InterfaceC73367Sqp
    public final void LIZIZ(Effect effect, TEA state, Integer num, boolean z) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(state, "state");
        java.util.Map<String, OSZ<TEA, Integer>> value = this.LIZ.getValue();
        if (value == null) {
            value = new ConcurrentHashMap<>();
        }
        java.util.Map<String, OSZ<TEA, Integer>> LIZJ = C65777Prh.LIZJ(value);
        LIZJ.put(effect.getId(), new OSZ<>(state, num));
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "Looper.getMainLooper()");
        if (o.LJ(LLLLIIIILLL, LLJJJJ.getThread())) {
            this.LIZ.setValue(LIZJ);
        } else {
            this.LIZ.postValue(LIZJ);
        }
        if (z) {
            Thread LLLLIIIILLL2 = C16880lQ.LLLLIIIILLL();
            Looper LLJJJJ2 = C16880lQ.LLJJJJ();
            o.LJIIIIZZ(LLJJJJ2, "Looper.getMainLooper()");
            if (o.LJ(LLLLIIIILLL2, LLJJJJ2.getThread())) {
                this.LIZIZ.setValue(new OSJ<>(effect, state, num));
            } else {
                this.LIZIZ.postValue(new OSJ<>(effect, state, num));
            }
        }
    }
}
