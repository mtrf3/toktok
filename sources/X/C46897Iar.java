package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Iar, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46897Iar extends C46742IWc {
    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        LIZLLL(2);
    }

    @Override // X.C46742IWc, X.IZT
    public final int getOrder() {
        return LiveLayoutPreloadThreadPriority.DEFAULT;
    }

    public C46897Iar(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    public final void LIZLLL(int i) {
        C47282Ih4 q7;
        List<C46898Ias> list;
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null || (q7 = this.LJLILLLLZI.q7()) == null || (list = q7.LJJJJLI) == null || list.size() <= 0) {
            return;
        }
        for (C46898Ias c46898Ias : list) {
            Object obj = c46898Ias.LIZIZ;
            if (obj != null && c46898Ias.LIZLLL == i) {
                try {
                    int i2 = c46898Ias.LIZJ;
                    if (i2 == 1) {
                        player.LJLLLL(c46898Ias.LIZ, ((Integer) obj).intValue());
                    } else if (i2 == 2) {
                        player.LLFF(c46898Ias.LIZ, ((Long) obj).longValue());
                    } else if (i2 == 3) {
                        player.LJLLILLLL(((Float) obj).floatValue(), c46898Ias.LIZ);
                    } else if (i2 == 4) {
                        player.LLILL(c46898Ias.LIZ, (String) obj);
                    } else if (i2 == 5) {
                        player.LLILL(c46898Ias.LIZ, ((JSONObject) obj).toString());
                    } else if (i2 == 6) {
                        player.LLILL(c46898Ias.LIZ, ((JSONArray) obj).toString());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        LIZLLL(3);
    }
}
