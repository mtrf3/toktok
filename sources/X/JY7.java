package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JY7 implements C0A5 {
    public final /* synthetic */ JVP LJLIL;

    @Override // X.C0A5
    public final void LIZ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
    }

    @Override // X.C0A5
    public final void LIZIZ(boolean z) {
    }

    public JY7(JVP jvp) {
        this.LJLIL = jvp;
    }

    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView rv, MotionEvent e) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
        if (e.getAction() == 0) {
            Context context = rv.getContext();
            if ((context instanceof SearchResultActivity) && (activityC45651qj = (ActivityC45651qj) context) != null) {
                JVP jvp = this.LJLIL;
                View LJJIJIIJI = rv.LJJIJIIJI(e.getX(), e.getY());
                if (!o.LJ(LJJIJIIJI, jvp.LLF)) {
                    jvp.LLF = LJJIJIIJI;
                    C55230Lly.LIZLLL(activityC45651qj, null).getTree().LIZIZ("source_default_key", new JY8(new WeakReference(LJJIJIIJI)), JY8.class);
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
