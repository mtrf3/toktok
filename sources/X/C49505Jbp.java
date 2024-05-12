package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Jbp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49505Jbp {
    public final RecyclerView LIZ;
    public final C48952JJc LIZIZ;
    public final C49002JLa<Aweme> LIZJ;

    public C49505Jbp(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
        C48952JJc c48952JJc = new C48952JJc();
        this.LIZIZ = c48952JJc;
        this.LIZJ = new C49002JLa<>(c48952JJc);
        recyclerView.LJII(new C49506Jbq(), -1);
    }
}
