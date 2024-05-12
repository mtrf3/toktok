package Y;

import X.C38393F4z;
import X.C47061t0;
import X.C75378TiA;
import X.C75792Toq;
import X.C75793Tor;
import X.C78443UqV;
import X.C79004UzY;
import X.C87277YNd;
import X.EnumC32197CkL;
import X.LAV;
import X.TV3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes14.dex */
public class ARunnableS4S1400000_13 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        TextView textView;
        LiveIconView liveIconView;
        C47061t0 c47061t0;
        ViewGroup viewGroup;
        View findViewById;
        ((ViewGroup) this.l1).removeAllViews();
        int LIZ = (int) (LAV.LIZ(this.s0) * ((ViewGroup) this.l1).getWidth());
        ViewGroup viewGroup2 = ((C75792Toq) this.l2).LIZ;
        if (viewGroup2 != null && (findViewById = viewGroup2.findViewById(R.id.hsi)) != null) {
            C79004UzY.LJJJLZIJ(LIZ, LIZ, findViewById);
        }
        ((C75792Toq) this.l2).LJFF((ImageModel) this.l3);
        if (((C75793Tor) this.l4).LIZ == EnumC32197CkL.FEED) {
            C75792Toq c75792Toq = (C75792Toq) this.l2;
            ViewGroup viewGroup3 = (ViewGroup) this.l1;
            c75792Toq.getClass();
            int i = (int) (LIZ * 1.8229166f);
            int i2 = (LIZ - i) / 2;
            int height = viewGroup3.getHeight() - ((LIZ + i) / 2);
            int width = (viewGroup3.getWidth() - i) / 2;
            ViewGroup viewGroup4 = c75792Toq.LIZ;
            if (viewGroup4 != null && (viewGroup = (ViewGroup) viewGroup4.findViewById(R.id.crm)) != null) {
                viewGroup.setClipChildren(false);
            }
            ViewGroup viewGroup5 = c75792Toq.LIZ;
            if (viewGroup5 != null && (c47061t0 = (C47061t0) viewGroup5.findViewById(R.id.hba)) != null) {
                C79004UzY.LJJJLZIJ(i, i, c47061t0);
                C79004UzY.LJJJLL(c47061t0, Integer.valueOf(width), Integer.valueOf(i2), Integer.valueOf(width), Integer.valueOf(height));
                C87277YNd.LJJIJ(c47061t0);
                c75792Toq.LJI = new C75378TiA(c47061t0, true);
            }
        }
        ViewGroup viewGroup6 = ((C75792Toq) this.l2).LIZ;
        if (viewGroup6 != null && (liveIconView = (LiveIconView) viewGroup6.findViewById(R.id.hb3)) != null) {
            int i3 = (int) (LIZ * 0.3125f);
            C79004UzY.LJJJLZIJ(i3, i3, liveIconView);
            liveIconView.setIconHeightRatio(0.6f);
            liveIconView.setIconWidthRatio(0.6f);
        }
        float width2 = ((ViewGroup) this.l1).getWidth() * 0.8f;
        ViewGroup viewGroup7 = ((C75792Toq) this.l2).LIZ;
        if (viewGroup7 != null && (textView = (TextView) viewGroup7.findViewById(R.id.h1d)) != null) {
            textView.setMaxWidth((int) width2);
        }
        ViewGroup viewGroup8 = ((C75792Toq) this.l2).LIZ;
        if (viewGroup8 != null) {
            TV3.LJIILIIL(-1, viewGroup8, (ViewGroup) this.l1);
        }
    }

    public static final void run$0(ARunnableS4S1400000_13 aRunnableS4S1400000_13) {
        boolean LIZ;
        try {
            aRunnableS4S1400000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S1400000_13 aRunnableS4S1400000_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS4S1400000_13.l1;
        Map map = (Map) aRunnableS4S1400000_13.l2;
        Map map2 = (Map) aRunnableS4S1400000_13.l3;
        Map map3 = (Map) aRunnableS4S1400000_13.l4;
        String str = aRunnableS4S1400000_13.s0;
        c78443UqV.getClass();
        c78443UqV.LJJIFFI(Boolean.FALSE, str, C38393F4z.LIZLLL(map), C38393F4z.LIZLLL(map2), C38393F4z.LIZLLL(map3));
    }

    public ARunnableS4S1400000_13(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
    }
}
