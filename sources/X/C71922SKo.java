package X;

import Y.IDTListenerS92S0200000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SKo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71922SKo implements InterfaceC71908SKa {
    public final /* synthetic */ C71920SKm LIZ;

    public C71922SKo(C71920SKm c71920SKm) {
        this.LIZ = c71920SKm;
    }

    @Override // X.InterfaceC71908SKa
    public final SKV LIZ(Context context, ViewGroup parent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ah9, parent, false);
        parent.setOnTouchListener(new IDTListenerS92S0200000_12(context, view, 5));
        o.LJIIIIZZ(view, "view");
        SKV skv = new SKV(view);
        RecyclerView recyclerView = (RecyclerView) skv.itemView.findViewById(R.id.fee);
        C71920SKm c71920SKm = this.LIZ;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context);
        flexboxLayoutManager.LLIZLLLIL(1);
        flexboxLayoutManager.LLIZ(0);
        flexboxLayoutManager.LLILZLL(4);
        flexboxLayoutManager.LLJ(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter(new C71925SKr(context, c71920SKm.LIZ));
        return skv;
    }
}
