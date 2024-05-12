package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M86 implements C0A5 {
    public float LJLIL;
    public final /* synthetic */ MixVideosDialog LJLILLLLZI;

    @Override // X.C0A5
    public final void LIZ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
    }

    @Override // X.C0A5
    public final void LIZIZ(boolean z) {
    }

    public M86(MixVideosDialog mixVideosDialog) {
        this.LJLILLLLZI = mixVideosDialog;
    }

    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
        int action = e.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            float y = e.getY() - this.LJLIL;
            this.LJLIL = y;
            if (y > 10.0f) {
                String str = this.LJLILLLLZI.LJLJJLL;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str);
                c188727au.LJIIIZ("direction", "down");
                FMX.LJIIL("slide_playlist_video_list", c188727au.LIZ);
                return false;
            }
            if (y >= -10.0f) {
                return false;
            }
            String str2 = this.LJLILLLLZI.LJLJJLL;
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", str2);
            c188727au2.LJIIIZ("direction", "up");
            FMX.LJIIL("slide_playlist_video_list", c188727au2.LIZ);
            return false;
        }
        this.LJLIL = e.getY();
        return false;
    }
}
