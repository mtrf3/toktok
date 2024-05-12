package Y;

import X.C1I1;
import X.C50924Jyi;
import X.C62397OeH;
import X.C62707OjH;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC62452OfA;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.trill.share.data.ShareDatabase;
import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public class ACallableS8S1101000_10 implements Callable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS8S1101000_10 aCallableS8S1101000_10) {
        MobClick LIZLLL = C1I1.LIZLLL("banner_show", "discovery");
        LIZLLL.setExtValueLong(aCallableS8S1101000_10.i2);
        LIZLLL.setValue(String.valueOf(((Banner) aCallableS8S1101000_10.l1).getCreativeId()));
        FMX.onEvent(LIZLLL);
        C50924Jyi c50924Jyi = new C50924Jyi();
        c50924Jyi.setBannerId(((Banner) aCallableS8S1101000_10.l1).getBid());
        c50924Jyi.setTagId(aCallableS8S1101000_10.s0);
        c50924Jyi.setClientOrder(aCallableS8S1101000_10.i2);
        FMX.LJIIL("banner_show", c50924Jyi.buildParams());
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS8S1101000_10 aCallableS8S1101000_10) {
        C62397OeH c62397OeH = (C62397OeH) aCallableS8S1101000_10.l1;
        String str = aCallableS8S1101000_10.s0;
        int i = aCallableS8S1101000_10.i2;
        c62397OeH.getClass();
        if (TextUtils.equals("more", str)) {
            return null;
        }
        try {
            ShareDatabase shareDatabase = c62397OeH.LIZJ;
            if (shareDatabase == null) {
                return null;
            }
            InterfaceC62452OfA LJIJI = shareDatabase.LJIJI();
            LJIJI.LIZIZ(new C62707OjH(Long.valueOf(System.currentTimeMillis()), str, Integer.valueOf(i)));
            Integer num = c62397OeH.LIZLLL;
            if (num == null) {
                return null;
            }
            LJIJI.LJ(num);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public ACallableS8S1101000_10(int i, Object obj, String str, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
