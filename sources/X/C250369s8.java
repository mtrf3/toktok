package X;

import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.core.model.Bubble;
import defpackage.i0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250369s8 implements InterfaceC249899rN {
    public Bubble LIZ;
    public boolean LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C250449sG.LJLIL);

    @Override // X.InterfaceC249899rN
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC249899rN
    public final void LIZLLL(String str, InterfaceC249909rO interfaceC249909rO) {
    }

    @Override // X.InterfaceC249899rN
    public final void LIZIZ(HashMap<Integer, Bubble> hashMap) {
        String str;
        Bubble bubble = hashMap.get(11);
        this.LIZ = bubble;
        if (bubble != null) {
            str = bubble.longContent;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            this.LIZIZ = false;
            return;
        }
        Bubble bubble2 = this.LIZ;
        if (bubble2 != null) {
            if (i0.LIZJ("_bubble_show_num_", bubble2.bubbleId, (Keva) this.LIZJ.getValue(), 0) >= bubble2.totalTimes) {
                this.LIZIZ = false;
                return;
            }
            int LIZIZ = C245559kN.LIZIZ();
            String str2 = bubble2.bubbleId;
            Keva keva = (Keva) this.LIZJ.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("_bubble_last_show_time_");
            LIZ.append(str2);
            if (LIZIZ - keva.getInt(X1D.LIZIZ(LIZ), 0) > TimeUnit.DAYS.toSeconds(bubble2.showAgainTime)) {
                this.LIZIZ = true;
            }
        }
    }

    @Override // X.InterfaceC249899rN
    public final boolean LIZ(InterfaceC249909rO interfaceC249909rO, int i) {
        Bubble bubble;
        if (!this.LIZIZ || (bubble = this.LIZ) == null) {
            return false;
        }
        String str = bubble.longContent;
        if (str == null) {
            str = "";
        }
        interfaceC249909rO.LJJIL(str, bubble, false, new View.OnClickListener() { // from class: X.9rT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null) {
                    abstractC247499nV.LIZJ(null);
                }
            }
        });
        String str2 = bubble.bubbleId;
        ((Keva) this.LIZJ.getValue()).storeInt(i0.LJFF("_bubble_show_num_", str2), i0.LIZJ("_bubble_show_num_", str2, (Keva) this.LIZJ.getValue(), 0) + 1);
        ((Keva) this.LIZJ.getValue()).storeInt(i0.LJFF("_bubble_last_show_time_", str2), C245559kN.LIZIZ());
        return true;
    }
}
