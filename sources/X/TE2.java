package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;

/* loaded from: classes13.dex */
public final class TE2 implements TE1 {
    public final List<TE1> LIZ = new ArrayList();

    @Override // X.TE1
    public final void LIZLLL(int i) {
        Iterator<TE1> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(i);
        }
    }

    @Override // X.TE1
    public final void clear(String str) {
        Iterator<TE1> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().clear(str);
        }
    }

    @Override // X.TE1
    public final void LIZ(List<? extends Effect> list, List<String> list2, List<Integer> list3) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((TE1) it.next()).LIZ(list, list2, list3);
        }
    }

    @Override // X.TE1
    public final void LIZJ(int i, String str, Bundle bundle, InterfaceC88472Yns<? super Integer, ? extends Effect> interfaceC88472Yns) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((TE1) it.next()).LIZJ(i, str, bundle, interfaceC88472Yns);
        }
    }

    @Override // X.TE1
    public final void LIZIZ(int i, int i2, String str, Bundle bundle, AqS143S0200000_12 aqS143S0200000_12) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((TE1) it.next()).LIZIZ(i, i2, str, bundle, aqS143S0200000_12);
        }
    }
}
