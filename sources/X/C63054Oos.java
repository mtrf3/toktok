package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Oos, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63054Oos extends FrameLayout {
    public View LJLIL;
    public RecyclerView LJLILLLLZI;
    public HKG LJLJI;

    public final C63055Oot getCurSelectItemData() {
        o.LJIJI("textEditRecyleViewAdapter");
        throw null;
    }

    public final int getCurSelectPos() {
        o.LJIJI("textEditRecyleViewAdapter");
        throw null;
    }

    public final void setEditListener(HKG hkg) {
        this.LJLJI = hkg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63054Oos(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bnk, this, true);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…extedit_view, this, true)");
        this.LJLIL = LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.l50);
        o.LJIIIIZZ(findViewById, "contentRootView.findViewById(R.id.text_recyleview)");
        this.LJLILLLLZI = (RecyclerView) findViewById;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(1);
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            View view = this.LJLIL;
            if (view != null) {
                View findViewById2 = view.findViewById(R.id.jam);
                o.LJIIIIZZ(findViewById2, "contentRootView.findViewById<View>(R.id.save_btn)");
                C16880lQ.LJIIJ(new C59798NdS(new AqS160S0100000_10(this, 415)), findViewById2);
                View view2 = this.LJLIL;
                if (view2 != null) {
                    View findViewById3 = view2.findViewById(R.id.b3r);
                    o.LJIIIIZZ(findViewById3, "contentRootView.findView…Id<View>(R.id.cancel_btn)");
                    C16880lQ.LJIIJ(new C59798NdS(new AqS160S0100000_10(this, 416)), findViewById3);
                    return;
                }
                o.LJIJI("contentRootView");
                throw null;
            }
            o.LJIJI("contentRootView");
            throw null;
        }
        o.LJIJI("textRecyleView");
        throw null;
    }
}
