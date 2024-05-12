package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class GWD implements InterfaceC41605GUn<CreateBaseAwemeResponse> {
    @Override // X.InterfaceC41605GUn
    public final void J6(String str) {
    }

    @Override // X.InterfaceC41605GUn
    public final void U9(int i, boolean z) {
    }

    @Override // X.InterfaceC41605GUn
    public final void Z3(C41759GaB c41759GaB, PublishModel publishModel) {
    }

    @Override // X.InterfaceC41605GUn
    public final void w8() {
    }

    @Override // X.InterfaceC41605GUn
    public final void K6(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z, PublishModel publishModel) {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity instanceof SparkActivity) {
            C26045AKb c26045AKb = new C26045AKb(topActivity);
            c26045AKb.LJIIIIZZ(R.string.faa);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIJ();
        }
    }
}
