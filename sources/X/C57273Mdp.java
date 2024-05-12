package X;

import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Mdp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57273Mdp extends PopupWindow {
    public RecyclerView LIZ;
    public TCU LIZIZ;
    public View LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57273Mdp(Context mContext, TCX listener, boolean z) {
        super(mContext);
        View LLLLIILL;
        o.LJIIIZ(mContext, "mContext");
        o.LJIIIZ(listener, "listener");
        if (z) {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(mContext).cloneInContext(new ContextThemeWrapper(mContext, R.style.uw)), R.layout.cpp, null, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(mContext), R.layout.cpp, null, false);
        }
        setContentView(LLLLIILL);
        View findViewById = LLLLIILL.findViewById(R.id.kxo);
        o.LJIIIIZZ(findViewById, "contentView.findViewById…id.switch_music_recycler)");
        this.LIZ = (RecyclerView) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.am3);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById(R.id.blank_view)");
        this.LIZJ = findViewById2;
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(C04330Ez.LIZIZ(mContext, R.color.cz)));
        setFocusable(true);
        setAnimationStyle(R.style.a_v);
        View view = this.LIZJ;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 201), view);
            RecyclerView recyclerView = this.LIZ;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                TCU tcu = new TCU(listener);
                this.LIZIZ = tcu;
                tcu.setShowFooter(false);
                RecyclerView recyclerView2 = this.LIZ;
                if (recyclerView2 != null) {
                    TCU tcu2 = this.LIZIZ;
                    if (tcu2 != null) {
                        recyclerView2.setAdapter(tcu2);
                        return;
                    } else {
                        o.LJIJI("mAdapter");
                        throw null;
                    }
                }
                o.LJIJI("mRecyclerView");
                throw null;
            }
            o.LJIJI("mRecyclerView");
            throw null;
        }
        o.LJIJI("mBlankView");
        throw null;
    }
}
