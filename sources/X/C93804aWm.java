package X;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aWm, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93804aWm extends LinearLayout {
    public final C94259ae7 LJLIL;
    public AppCompatTextView LJLILLLLZI;

    public C93804aWm(Context context) {
        super(context, null, 0);
        this.LJLIL = new C94259ae7();
        setOrientation(1);
        setPadding(C93742aVm.LIZIZ(24), 0, C93742aVm.LIZIZ(24), 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setLayoutParams(C93902aYM.LIZJ(this, -1, -2, 0, 0, null, null, null, null, null, null, 1020));
        new IDqS175S0200000_42(this, context, 15).invoke(appCompatTextView);
        C93902aYM.LIZ(appCompatTextView, this);
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setLayoutParams(C93902aYM.LIZJ(this, -1, -2, 0, 0, null, null, Integer.valueOf(C93742aVm.LIZIZ(6)), null, null, null, 956));
        new IDqS419S0100000_42(this, context, 74).invoke(recyclerView);
        C93902aYM.LIZ(recyclerView, this);
    }

    public final void LIZ(C94384ag8 data, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(data, "data");
        AppCompatTextView appCompatTextView = this.LJLILLLLZI;
        if (appCompatTextView != null) {
            appCompatTextView.setText(data.LJLIL);
            C94259ae7 c94259ae7 = this.LJLIL;
            List<C94383ag7> data2 = data.LJLJI;
            c94259ae7.getClass();
            o.LJIIIZ(data2, "data");
            c94259ae7.LJLIL = data2;
            c94259ae7.notifyDataSetChanged();
            c94259ae7.LJLILLLLZI = interfaceC88472Yns;
            return;
        }
        o.LJIJI("categoryName");
        throw null;
    }
}
