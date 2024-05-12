package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BOk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28706BOk extends RecyclerView.ViewHolder {
    public final ViewGroup LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final /* synthetic */ C28703BOh LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28706BOk(C28703BOh c28703BOh, View view) {
        super(view);
        this.LJLJI = c28703BOh;
        View findViewById = view.findViewById(R.id.c9k);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.detection_container)");
        this.LJLIL = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.m53);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.t…detection_question_title)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
    }
}
