package Y;

import X.AFJ;
import X.C2U8;
import X.C82715WdD;
import X.InterfaceC64592gB;
import X.OB8;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AfS1S0101100_14 implements InterfaceC64592gB {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS1S0101100_14 afS1S0101100_14, Object obj) {
        String str;
        if (((BaseResponse) obj).status_code != 0) {
            ((C82715WdD) afS1S0101100_14.l0).LJII(afS1S0101100_14.i1);
        } else {
            Aweme aweme = ((C82715WdD) afS1S0101100_14.l0).LJLILLLLZI;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            o.LJI(str);
            boolean z = true;
            if (afS1S0101100_14.i1 != 1) {
                z = false;
            }
            C2U8.LIZ(new OB8(str, z));
        }
        AFJ.LIZ(-1, 0, afS1S0101100_14.j2, "kids_api_digg");
    }

    public static final void accept$1(AfS1S0101100_14 afS1S0101100_14, Object obj) {
        ((C82715WdD) afS1S0101100_14.l0).LJII(afS1S0101100_14.i1);
        AFJ.LIZ(-1, -1, afS1S0101100_14.j2, "kids_api_digg");
    }

    public AfS1S0101100_14(C82715WdD c82715WdD, int i, long j, int i2) {
        this.$t = i2;
        this.l0 = c82715WdD;
        this.i1 = i;
        this.j2 = j;
    }
}
