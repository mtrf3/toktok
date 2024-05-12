package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.skylight.CallBackLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LyA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55986LyA extends LinearLayout {
    public RecyclerView LJLIL;
    public C54703LdT LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55986LyA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attr");
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.a08, this, true);
        this.LJLIL = (RecyclerView) LLLLIILL.findViewById(R.id.isq);
        LLLLIILL.findViewById(R.id.mkm);
        LLLLIILL.findViewById(R.id.mkk);
        LLLLIILL.findViewById(R.id.mkj);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        CallBackLinearLayoutManager callBackLinearLayoutManager = new CallBackLinearLayoutManager(context2, new AqS159S0100000_9(this, 1070));
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(callBackLinearLayoutManager);
        }
        C54703LdT c54703LdT = new C54703LdT();
        this.LJLILLLLZI = c54703LdT;
        c54703LdT.setShowFooter(false);
        RecyclerView recyclerView2 = this.LJLIL;
        if (recyclerView2 == null) {
            return;
        }
        C54703LdT c54703LdT2 = this.LJLILLLLZI;
        if (c54703LdT2 != null) {
            recyclerView2.setAdapter(c54703LdT2);
        } else {
            o.LJIJI("skylightAdapter");
            throw null;
        }
    }
}
