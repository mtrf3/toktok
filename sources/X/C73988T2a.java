package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.T2a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73988T2a {
    public final View LIZ;
    public final T2V LIZIZ;

    public C73988T2a(ViewGroup parent, RecyclerView.RecycledViewPool viewPool, T2Y emojiInputListener) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewPool, "viewPool");
        o.LJIIIZ(emojiInputListener, "emojiInputListener");
        View LIZIZ = C1FL.LIZIZ(parent, R.layout.dd2, parent, false, "from(parent.context)\n   …list_view, parent, false)");
        this.LIZ = LIZIZ;
        View findViewById = LIZIZ.findViewById(R.id.btg);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.content_container)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        T2V t2v = new T2V(context, emojiInputListener);
        this.LIZIZ = t2v;
        LIZIZ.getContext();
        SSGridLayoutManager sSGridLayoutManager = new SSGridLayoutManager(7, 1);
        recyclerView.setAdapter(t2v);
        recyclerView.setLayoutManager(sSGridLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setRecycledViewPool(viewPool);
    }
}
