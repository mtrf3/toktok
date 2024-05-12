package Y;

import X.AbstractC40713FyP;
import X.C113554cx;
import X.C39930Flm;
import X.C61296O3w;
import X.C61298O3y;
import X.C68322mC;
import X.O4B;
import X.O4O;
import X.OL1;
import X.OL2;
import X.OL3;
import X.OL5;
import X.OLA;
import X.OLK;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARunnableS4S0500000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        try {
            O4B o4b = (O4B) this.l0;
            Map<String, String> map = ((AbstractC40713FyP) this.l1).LIZJ;
            if (map == null) {
                map = C113554cx.LJJJLIIL();
            }
            o4b.LJII(map, (Map) this.l2, (O4O) ((C68322mC) this.l3).element, ((C61296O3w) this.l4).LJIIL);
        } catch (Throwable th) {
            C39930Flm.LIZJ("TTNetDepender", "update failed, isSync: false", th, true);
        }
        C61296O3w c61296O3w = (C61296O3w) this.l4;
        if (!c61296O3w.LJIIIIZZ && !c61296O3w.LJII) {
            C61298O3y.LIZIZ.remove(((AbstractC40713FyP) this.l1).toString());
        }
    }

    public final void LIZ$1() {
        String str;
        AwemeTextLabelModel label;
        OLK olk;
        try {
            if (((OL5) this.l0).LJIIIIZZ == null || !OL1.LJFF((Aweme) this.l1) || (olk = ((OL5) this.l0).LJIIIIZZ) == null || !olk.LIZLLL) {
                OLK olk2 = ((OL5) this.l0).LJIIIIZZ;
                if (olk2 != null) {
                    olk2.LIZ();
                }
                AwemeRawAd awemeRawAd = ((Aweme) this.l1).getAwemeRawAd();
                if (awemeRawAd != null && (label = awemeRawAd.getLabel()) != null) {
                    str = label.getLabelName();
                } else {
                    str = null;
                }
                ((OL5) this.l0).LJIIIIZZ = new OLK((Context) this.l2, str);
            }
            OL5 ol5 = (OL5) this.l0;
            OLK olk3 = ol5.LJIIIIZZ;
            if (olk3 != null) {
                olk3.LJ((VSAProductCardsResponse.ProductCard) this.l3, new OLA((Aweme) this.l1), ol5.LJI);
            }
            if (!OL3.LIZJ) {
                OL2.LIZLLL((Context) this.l2, (OL5) this.l0, true, (Bitmap) this.l4);
            } else {
                ((OL5) this.l0).LJIILIIL = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static final void run$0(ARunnableS4S0500000_10 aRunnableS4S0500000_10) {
        boolean LIZ;
        try {
            aRunnableS4S0500000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S0500000_10 aRunnableS4S0500000_10) {
        boolean LIZ;
        try {
            aRunnableS4S0500000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS4S0500000_10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
