package X;

import Y.ACListenerS36S0300000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OP1 extends LinearLayout {
    public final boolean LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public Aweme LJLJJI;
    public boolean LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final OP6 getMAdapter() {
        return (OP6) this.LJLILLLLZI.getValue();
    }

    public final Aweme getMAweme() {
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            return aweme;
        }
        o.LJIJI("mAweme");
        throw null;
    }

    public final C9G8 getMPresenter() {
        return (C9G8) this.LJLJI.getValue();
    }

    public final boolean getShouldDislike() {
        return this.LJLIL;
    }

    public final void setMAweme(Aweme aweme) {
        o.LJIIIZ(aweme, "<set-?>");
        this.LJLJJI = aweme;
    }

    public OP1(Context context, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        super(context, null, 0);
        this.LJLIL = z;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 456));
        this.LJLJI = C221108m2.LIZIZ(C234149Gw.LJLIL);
        View.inflate(context, R.layout.ago, this);
        if (z) {
            View LIZ = LIZ(R.id.bs8);
            ViewGroup.LayoutParams layoutParams = LIZ(R.id.bs8).getLayoutParams();
            layoutParams.height = O6R.LJJIIZ(KL2.LJIIIZ(context) * 0.5f) - C17N.LJIILL(52.0d);
            LIZ.setLayoutParams(layoutParams);
        }
        RecyclerView recyclerView = (RecyclerView) LIZ(R.id.e32);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context, 0);
        flexboxLayoutManager.LLIZLLLIL(1);
        flexboxLayoutManager.LLIZ(0);
        flexboxLayoutManager.LLILZLL(4);
        flexboxLayoutManager.LLJ(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        ((RecyclerView) LIZ(R.id.e32)).setAdapter(getMAdapter());
        ((SY4) LIZ(R.id.kpi)).setEnabled(false);
        C16880lQ.LJJIZ((SY4) LIZ(R.id.kpi), new ACListenerS36S0300000_10(this, context, interfaceC88472Yns, 4));
    }
}
