package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import kotlin.jvm.internal.o;

/* renamed from: X.MSd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56831MSd extends C0A6 {
    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        HandlerC56918MVm LIZ = NoticeVideoManager.LIZ();
        if (LIZ != null) {
            LIZ.LJIIIZ(z);
        }
    }
}
