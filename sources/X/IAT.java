package X;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IAT implements InterfaceC74343TFr {
    public static final IAT LIZ = new IAT();

    @Override // X.InterfaceC74343TFr
    public final void LIZ(List list, List list2, List list3) {
    }

    @Override // X.InterfaceC74343TFr
    public final void LIZIZ(Effect effect, String str, String str2, int i, String tabType, Bundle bundle) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(tabType, "tabType");
    }

    @Override // X.InterfaceC74343TFr
    public final void LIZJ(int i, long j) {
    }

    @Override // X.InterfaceC74343TFr
    public final void LIZLLL(Effect effect, boolean z, String str, OSZ<String, String>... oszArr) {
        o.LJIIIZ(effect, "effect");
    }

    @Override // X.InterfaceC74343TFr
    public final void LJ(String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
    }

    @Override // X.InterfaceC74343TFr
    public final void LJI(String categoryKey, String str) {
        o.LJIIIZ(categoryKey, "categoryKey");
    }

    @Override // X.InterfaceC74343TFr
    public final void LJII(long j, String str) {
    }

    @Override // X.InterfaceC74343TFr
    public final void LJIIIIZZ(long j, boolean z) {
    }

    @Override // X.InterfaceC74343TFr
    public final void LJIIIZ(Effect effect, boolean z, String str, int i, boolean z2, Bundle bundle) {
        o.LJIIIZ(effect, "effect");
    }

    @Override // X.InterfaceC74343TFr
    public final void LJIIJ(String str, String str2, String str3, int i, int i2, LinearLayoutManager layoutManager) {
        o.LJIIIZ(layoutManager, "layoutManager");
    }

    @Override // X.InterfaceC74343TFr
    public final InterfaceC74346TFu LJFF() {
        return IAU.LIZ;
    }
}