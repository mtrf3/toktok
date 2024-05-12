package Y;

import X.AbstractC38911fr;
import X.C42247Gi3;
import X.InterfaceC64592gB;
import android.app.Activity;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AfS4S1100100_7 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS4S1100100_7 afS4S1100100_7, Object obj) {
        VideoInfoFromURLResponse response = (VideoInfoFromURLResponse) obj;
        Activity activity = (Activity) afS4S1100100_7.l1;
        o.LJIIIIZZ(response, "response");
        C42247Gi3.LIZJ(activity, response, afS4S1100100_7.j2, afS4S1100100_7.s0);
    }

    public static final void accept$1(AfS4S1100100_7 afS4S1100100_7, Object obj) {
        C42247Gi3.LIZJ((Activity) afS4S1100100_7.l1, new VideoInfoFromURLResponse(104, null, null), afS4S1100100_7.j2, afS4S1100100_7.s0);
    }

    public static final void accept$2(AfS4S1100100_7 afS4S1100100_7, Object obj) {
        AbstractC38911fr abstractC38911fr = (AbstractC38911fr) afS4S1100100_7.l1;
        if (abstractC38911fr != null) {
            abstractC38911fr.LJJII(System.currentTimeMillis() - afS4S1100100_7.j2, afS4S1100100_7.s0);
        }
    }

    public static final void accept$3(AfS4S1100100_7 afS4S1100100_7, Object obj) {
        Throwable th = (Throwable) obj;
        AbstractC38911fr abstractC38911fr = (AbstractC38911fr) afS4S1100100_7.l1;
        if (abstractC38911fr != null) {
            String str = afS4S1100100_7.s0;
            long currentTimeMillis = System.currentTimeMillis() - afS4S1100100_7.j2;
            if (!(th instanceof Exception)) {
                th = null;
            }
            abstractC38911fr.LJJIFFI(str, currentTimeMillis, (Exception) th, null);
        }
    }

    public AfS4S1100100_7(long j, Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.j2 = j;
        this.s0 = str;
    }
}
