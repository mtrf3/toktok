package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rus, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC71070Rus implements Runnable {
    public final /* synthetic */ Boolean LJLIL;
    public final /* synthetic */ C71076Ruy LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ Aweme LJLJJI;
    public final /* synthetic */ FeedEcCardConfig LJLJJL;
    public final /* synthetic */ FeedEcCardStyle LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;

    public RunnableC71070Rus(C71076Ruy c71076Ruy, FeedEcCardConfig feedEcCardConfig, FeedEcCardStyle feedEcCardStyle, Aweme aweme, Boolean bool, String str, String str2, boolean z) {
        this.LJLIL = bool;
        this.LJLILLLLZI = c71076Ruy;
        this.LJLJI = z;
        this.LJLJJI = aweme;
        this.LJLJJL = feedEcCardConfig;
        this.LJLJJLL = feedEcCardStyle;
        this.LJLJL = str;
        this.LJLJLJ = str2;
    }

    public final void LIZ() {
        String str;
        long j;
        List<String> list;
        Boolean bool = this.LJLIL;
        String str2 = null;
        if (o.LJ(bool, Boolean.TRUE)) {
            str = "down";
        } else if (o.LJ(bool, Boolean.FALSE)) {
            str = "up";
        } else {
            str = null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C71076Ruy c71076Ruy = this.LJLILLLLZI;
        if (c71076Ruy != null) {
            j = c71076Ruy.LJII;
        } else {
            j = 0;
        }
        long j2 = elapsedRealtime - j;
        if (c71076Ruy != null) {
            list = c71076Ruy.LJFF;
        } else {
            list = null;
        }
        if (c71076Ruy != null) {
            str2 = c71076Ruy.LJI;
        }
        C71065Run.LJIIL(list, ED2.LIZ(str2), this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, j2, this.LJLJL, str, this.LJLJLJ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
