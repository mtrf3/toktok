package Y;

import X.C44687HgJ;
import X.C60903NvH;
import X.C76800UCe;
import X.C78764Uvg;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.component.music.MusicService;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class ACallableS1S1000000_2 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS1S1000000_2 aCallableS1S1000000_2) {
        try {
            C44687HgJ.LJIIL(new File(aCallableS1S1000000_2.s0));
        } catch (Exception e) {
            C60903NvH.LJIIJJI().LJJIIZI().LIZ(e);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS1S1000000_2 aCallableS1S1000000_2) {
        return MusicService.LJJLIIIJJI().LJIIL(aCallableS1S1000000_2.s0);
    }

    public static final Object call$2(ACallableS1S1000000_2 aCallableS1S1000000_2) {
        boolean z;
        String str = aCallableS1S1000000_2.s0;
        if (str != null) {
            z = C78764Uvg.LJIIL(UriProtector.parse(str));
        } else {
            z = true;
        }
        return Boolean.valueOf(!z);
    }

    public ACallableS1S1000000_2(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
