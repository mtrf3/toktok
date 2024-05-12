package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157966Hw extends C80890Vos {
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final List<C157776Hd> LJLJL;
    public final C83297Wmb LJLJLJ;
    public final LinearLayoutManager LJLJLLL;
    public boolean LJLL;
    public final java.util.Map<Integer, View> LJLLI;

    public final View LJ(int i) {
        java.util.Map<Integer, View> map = this.LJLLI;
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LJLJJLL.invoke();
        super.onDetachedFromWindow();
    }

    public static void LJFF(boolean z) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(1603, ggo, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_GONE, null);
    }

    @Override // X.C80890Vos
    public final void LIZLLL(int i) {
        int i2 = 4;
        int i3 = 8;
        boolean z = true;
        if (C157956Hv.LIZ()) {
            if (i == 1) {
                this.LJLL = true;
                postDelayed(new ARunnableS38S0100000_2(this, 138), 300L);
            } else {
                this.LJLL = false;
                if (LJ(R.id.ci6).getVisibility() == 0) {
                    ((C223338pd) LJ(R.id.ci6)).setVisibility(8);
                    LJFF(false);
                }
            }
            View LJ = LJ(R.id.j_0);
            if (i == 0) {
                i2 = 0;
            }
            LJ.setVisibility(i2);
            return;
        }
        View view = this.LJLIL;
        if (view != null) {
            if (i == 0) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            if (i == 1) {
                i3 = 0;
            }
            view2.setVisibility(i3);
        }
        if (i != 0) {
            z = false;
        }
        LJFF(z);
    }

    public final void LJI(C157776Hd effectTextBean) {
        o.LJIIIZ(effectTextBean, "effectTextBean");
        int indexOf = ((ArrayList) this.LJLJL).indexOf(effectTextBean);
        if (indexOf >= 0) {
            this.LJLJLJ.notifyItemChanged(indexOf);
        }
    }

    @Override // X.C80890Vos
    public final View LIZJ(Context context, AttributeSet attributeSet) {
        o.LJIIIZ(context, "context");
        if (C157956Hv.LIZ()) {
            return null;
        }
        return new C157976Hx(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157966Hw(Context context, C6I1 textDownloader, C6I1 fontDownloader, AqS168S0100000_2 aqS168S0100000_2, AqS152S0100000_2 aqS152S0100000_2) {
        super(context, null);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(textDownloader, "textDownloader");
        o.LJIIIZ(fontDownloader, "fontDownloader");
        this.LJLLI = new LinkedHashMap();
        this.LJLJJLL = aqS152S0100000_2;
        ArrayList arrayList = new ArrayList();
        this.LJLJL = arrayList;
        C83297Wmb c83297Wmb = new C83297Wmb(arrayList, textDownloader, fontDownloader, aqS168S0100000_2);
        this.LJLJLJ = c83297Wmb;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        this.LJLJLLL = linearLayoutManager;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.au_, this, true);
        ((RecyclerView) LJ(R.id.j_0)).setLayoutManager(linearLayoutManager);
        ((RecyclerView) LJ(R.id.j_0)).setAdapter(c83297Wmb);
    }
}
