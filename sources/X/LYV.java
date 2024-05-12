package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LYV extends C0A6 {
    public boolean LJLIL;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1 || this.LJLIL) {
                return;
            }
            LiveOuterService.LJJJLL().LJJJJIZL();
            if (C62046OWs.LIZIZ("livesdk_draw_message_window")) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from_merge", "message");
                c188727au.LJIIIZ("enter_method", "live_cover");
                c188727au.LJIIIZ("request_id", "");
                FMX.LJIIL("livesdk_draw_message_window", c188727au.LIZ);
            }
            this.LJLIL = true;
            return;
        }
        this.LJLIL = false;
    }
}
