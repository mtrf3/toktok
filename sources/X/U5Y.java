package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import java.util.Map;

/* loaded from: classes14.dex */
public final class U5Y implements UC6 {
    public final /* synthetic */ U9E LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ java.util.Map<Integer, Integer> LIZJ;

    @Override // X.UC6
    public final void LIZ(Layout layout) {
        this.LIZ.LJ = layout;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        String str = this.LIZ.LIZIZ;
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("action", "setPositionMap");
        String str2 = this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        oszArr[1] = new OSZ("zoomToLayoutId", str2);
        java.util.Map<String, ?> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        for (Map.Entry<Integer, Integer> entry : this.LIZJ.entrySet()) {
            LJJLIIIIJ.put(String.valueOf(entry.getKey().intValue()), String.valueOf(entry.getValue().intValue()));
        }
        LJIILIIL.LJIIIIZZ(str, LJJLIIIIJ);
    }

    public U5Y(U9E u9e, String str, java.util.Map<Integer, Integer> map) {
        this.LIZ = u9e;
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
