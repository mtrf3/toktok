package X;

import Y.IDrS50S0100000_12;
import android.graphics.Rect;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: X.Sjb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72919Sjb {
    public final RecyclerView LIZ;
    public final InterfaceC72918Sja LIZIZ;
    public boolean LIZJ;
    public final ArrayList<String> LIZLLL;

    public final void LIZ() {
        int[] iArr;
        if (this.LIZ.getVisibility() != 0 || !this.LIZ.isShown() || !this.LIZ.getGlobalVisibleRect(new Rect())) {
            return;
        }
        try {
            C0A2 layoutManager = this.LIZ.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                iArr = new int[]{linearLayoutManager.LLIL(), linearLayoutManager.LLILLIZIL()};
            } else {
                if (!(layoutManager instanceof GridLayoutManager)) {
                    return;
                }
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                iArr = new int[]{gridLayoutManager.LLIL(), gridLayoutManager.LLILLIZIL()};
            }
            if (iArr.length >= 2) {
                int i = iArr[0];
                int i2 = iArr[1];
                if (i > i2) {
                    return;
                }
                while (true) {
                    try {
                        InterfaceC72918Sja interfaceC72918Sja = this.LIZIZ;
                        if (interfaceC72918Sja != null) {
                            interfaceC72918Sja.LIZ(i, this);
                        }
                    } catch (Throwable unused) {
                    }
                    if (i == i2) {
                        return;
                    } else {
                        i++;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public C72919Sjb(RecyclerView recyclerView, InterfaceC72918Sja interfaceC72918Sja) {
        this.LIZ = recyclerView;
        this.LIZIZ = interfaceC72918Sja;
        C16880lQ.LJLLJ(C72919Sjb.class);
        this.LIZJ = true;
        this.LIZLLL = new ArrayList<>();
        recyclerView.LJIIJJI(new IDrS50S0100000_12(this, 7));
    }
}
