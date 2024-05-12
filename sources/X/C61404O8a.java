package X;

import Y.ARunnableS46S0100000_10;
import android.os.Looper;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS0S1410200_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.O8a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61404O8a implements InterfaceC61405O8b {
    public final InterfaceC61405O8b LIZ = C61359O6h.LJIIZILJ;
    public final ExecutorService LIZIZ = C61359O6h.LJI;
    public static final C48749JBh LIZLLL = new C48749JBh();
    public static final C5H3 LIZJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C61406O8c.LJLIL);

    public static final C61404O8a LJFF() {
        LIZLLL.getClass();
        return (C61404O8a) LIZJ.getValue();
    }

    public final void LJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            this.LIZIZ.execute(new ARunnableS46S0100000_10((InterfaceC65784Pro) interfaceC65784Pro, 150));
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC61405O8b
    public final void LIZ(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        LJ(new AqS0S1410200_10(this, view, j, list, str, z, j2, jSONObject, 1));
    }

    @Override // X.InterfaceC61405O8b
    public final void LIZIZ(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        LJ(new AqS0S1410200_10(this, view, j, list, str, z, j2, jSONObject, 0));
    }

    @Override // X.InterfaceC61405O8b
    public final void LIZJ(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        LJ(new AqS0S1410200_10(this, view, j, list, str, z, j2, jSONObject, 3));
    }

    @Override // X.InterfaceC61405O8b
    public final void LIZLLL(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        LJ(new AqS0S1410200_10(this, view, j, list, str, z, j2, jSONObject, 2));
    }
}
