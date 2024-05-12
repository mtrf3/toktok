package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.music.model.MusicChartRankStruct;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OH5 extends TAT {
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ OQN LJLJJL;
    public final /* synthetic */ TextView LJLJJLL;
    public final /* synthetic */ MusicChartRankStruct LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;

    @Override // X.TAT
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        b0.LJ(LIZ, this.LJLJJI, "&click_time=", currentTimeMillis);
        String url = X1D.LIZIZ(LIZ);
        if (C19N.LJ("enable_music_chart_opt", true)) {
            OQN oqn = this.LJLJJL;
            Context context = this.LJLJJLL.getContext();
            oqn.getClass();
            o.LJIIIZ(url, "url");
            if (context != null) {
                SparkContext LIZIZ = C42193GhB.LIZIZ(url);
                LIZIZ.LJIL(new C38345F3d());
                OKG.LIZLLL(C40343FsR.LJIILJJIL, context, LIZIZ);
            }
        } else {
            SmartRouter.buildRoute(v.getContext(), url).open();
        }
        String id = this.LJLJL.getId();
        String str = this.LJLJLJ;
        String str2 = this.LJLJLLL;
        int rank = this.LJLJL.getRank();
        C188727au c188727au = new C188727au();
        if (id == null) {
            id = "";
        }
        c188727au.LJIIIZ("chart_id", id);
        c188727au.LJIIIZ("enter_method", "click_more_list");
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("group_id", str);
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("music_id", str2);
        c188727au.LIZLLL(rank, "order");
        c188727au.LJIIIZ("page", "single_song");
        FMX.LJIIL("click_music_list_entrance", c188727au.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OH5(String str, OQN oqn, TextView textView, MusicChartRankStruct musicChartRankStruct, String str2, String str3) {
        super(500L);
        this.LJLJJI = str;
        this.LJLJJL = oqn;
        this.LJLJJLL = textView;
        this.LJLJL = musicChartRankStruct;
        this.LJLJLJ = str2;
        this.LJLJLLL = str3;
    }
}
