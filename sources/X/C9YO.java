package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.9YO, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9YO extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final C9YL LJLILLLLZI;

    public C9YO(View view) {
        super(view);
        this.LJLIL = view;
        C9YL c9yl = new C9YL();
        this.LJLILLLLZI = c9yl;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.g_1);
        recyclerView.setAdapter(c9yl);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
    }
}
