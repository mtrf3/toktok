package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.SearchTimeHelper;
import kotlin.jvm.internal.o;

/* renamed from: X.Jm2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC50138Jm2 implements Runnable {
    public final /* synthetic */ SearchTimeHelper LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C50321Joz LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC50138Jm2(SearchTimeHelper searchTimeHelper, String str, C50321Joz c50321Joz, String str2, String str3) {
        this.LJLIL = searchTimeHelper;
        this.LJLILLLLZI = str;
        this.LJLJI = c50321Joz;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }

    public final void LIZ() {
        String str;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL.LIZ;
        if (currentTimeMillis <= 0 || currentTimeMillis > LivePlayEnforceIntervalSetting.DEFAULT) {
            return;
        }
        String str2 = "general_search";
        if (o.LJ(this.LJLILLLLZI, "general_search")) {
            str = "general";
        } else {
            str = this.LJLILLLLZI;
            str2 = "search_result";
        }
        String searchId = this.LJLJI.getSearchId();
        C50169JmX c50169JmX = new C50169JmX();
        c50169JmX.LJIJI(str2);
        c50169JmX.LJIIZILJ("enter_method", this.LJLJJI);
        c50169JmX.LJIIZILJ("search_keyword", this.LJLJJL);
        c50169JmX.LJIIZILJ("duration", String.valueOf(currentTimeMillis));
        c50169JmX.LJIIZILJ("search_type", str);
        c50169JmX.LJIIZILJ("search_id", searchId);
        c50169JmX.LJIIZILJ("log_pb", C3A5.LIZ.LIZIZ(searchId));
        c50169JmX.LJIILIIL();
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
