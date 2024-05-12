package Y;

import X.C16880lQ;
import X.C8DO;
import X.FKM;
import X.FMX;
import X.LQA;
import X.OHI;
import android.view.View;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ARunnableS12S0100100_3 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

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

    public static final void run$0(ARunnableS12S0100100_3 aRunnableS12S0100100_3) {
        boolean LIZ;
        try {
            View view = ((InteractAreaComponent) aRunnableS12S0100100_3.l0).LLFII;
            if (view != null) {
                view.setVisibility(0);
                ((InteractAreaComponent) aRunnableS12S0100100_3.l0).n4(aRunnableS12S0100100_3.j1, true);
            } else {
                o.LJIJI("infoAreaContainer");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$1(ARunnableS12S0100100_3 aRunnableS12S0100100_3) {
        String str;
        FeedFragment feedFragment = (FeedFragment) aRunnableS12S0100100_3.l0;
        long j = aRunnableS12S0100100_3.j1;
        if ("homepage_nearby".equals(feedFragment.LJLJI)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("enable_location", LQA.LIZIZ.LIZ());
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            feedFragment.getContext();
            FMX.LJI(0L, "stay_time", feedFragment.LJLJI, String.valueOf(j), jSONObject);
        } else {
            feedFragment.getContext();
            FMX.LJIIIIZZ("stay_time", feedFragment.LJLJI, j);
        }
        if (feedFragment instanceof C8DO) {
            Aweme ya = ((C8DO) feedFragment).ya();
            HashMap hashMap = new HashMap();
            if (ya != null) {
                hashMap.put("author_id", ya.getAuthorUid());
                hashMap.put("group_id", ya.getGroupId());
                OHI ohi = OHI.LIZ;
                AwemeHostApplication LIZ = FKM.LIZ();
                ohi.getClass();
                if (OHI.LJ(LIZ, "android.permission.ACCESS_COARSE_LOCATION")) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("enable_location", str);
            }
            FMX.LJIIL("exit_homepage_nearby", hashMap);
        }
        feedFragment.xl(j);
    }

    public ARunnableS12S0100100_3(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
