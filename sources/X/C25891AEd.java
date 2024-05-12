package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AEd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25891AEd extends LinearLayout {
    public final View LJLIL;

    public final void setErrorVisibility(boolean z) {
        if (z) {
            View view = this.LJLIL;
            if (view != null) {
                view.setVisibility(4);
                return;
            } else {
                o.LJIJI("reportErrorView");
                throw null;
            }
        }
        View view2 = this.LJLIL;
        if (view2 != null) {
            view2.setVisibility(0);
        } else {
            o.LJIJI("reportErrorView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25891AEd(ActivityC45651qj activityC45651qj, List dataList) {
        super(activityC45651qj, null);
        o.LJIIIZ(dataList, "dataList");
        new LinkedHashMap();
        C16880lQ.LLLZIIL(R.layout.bfv, C16880lQ.LLZIL(activityC45651qj), this);
        View findViewById = findViewById(R.id.ixd);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.report_reason_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        View findViewById2 = findViewById(R.id.iwy);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.report_error_message)");
        this.LJLIL = findViewById2;
        C25888AEa c25888AEa = new C25888AEa(activityC45651qj);
        ((ArrayList) c25888AEa.LJLILLLLZI).clear();
        ((ArrayList) c25888AEa.LJLILLLLZI).addAll(dataList);
        c25888AEa.notifyDataSetChanged();
        recyclerView.setAdapter(c25888AEa);
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }
}
