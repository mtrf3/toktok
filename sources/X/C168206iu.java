package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168206iu extends AbstractC167696i5 {
    public InterfaceC65784Pro<Boolean> LJLJLLL;

    @Override // X.AbstractC167696i5
    public final List<C167736i9> LJLLLLLL(int i) {
        return null;
    }

    @Override // X.AbstractC167696i5
    public final void LJZ(RecyclerView.ViewHolder holder, C167736i9 c167736i9) {
        o.LJIIIZ(holder, "holder");
    }

    @Override // X.AbstractC167696i5, X.AbstractC029409q
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LJLJI, i);
        o.LJIIIIZZ(obj, "effectWrappers[position]");
        C167736i9 c167736i9 = (C167736i9) obj;
        if (c167736i9.LIZLLL) {
            return 10;
        }
        if (c167736i9.LIZIZ) {
            return 0;
        }
        return 1;
    }

    @Override // X.AbstractC167696i5
    public final RecyclerView.ViewHolder LJZI(ViewGroup parent, int i, C167726i8 clickListener) {
        FrameLayout frameLayout;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(clickListener, "clickListener");
        if (i != 0) {
            if (i != 10) {
                final Space space = new Space(parent.getContext());
                return new RecyclerView.ViewHolder(space) { // from class: X.6iw
                };
            }
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.jl, parent, false);
            o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout2 = (FrameLayout) LLLLIILL;
            View findViewById = frameLayout2.findViewById(R.id.kgn);
            C29701Eo c29701Eo = (C29701Eo) frameLayout2.findViewById(R.id.fg2);
            c29701Eo.setAnimationFromUrl("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/Speech_to_song.json");
            c29701Eo.setRepeatCount(-1);
            c29701Eo.playAnimation();
            TuxTextView tuxTextView = (TuxTextView) frameLayout2.findViewById(R.id.m64);
            int min = Math.min(SFS.LJI(60.0d), (int) (C143205jg.LJ() * 0.14d));
            c29701Eo.getLayoutParams().width = min;
            c29701Eo.getLayoutParams().height = min;
            tuxTextView.setHorizontalFadingEdgeEnabled(true);
            tuxTextView.setFadingEdgeLength((int) KL2.LIZJ(tuxTextView.getContext(), 4.0f));
            findViewById.getLayoutParams().width = SFS.LJI(8.0d) + min;
            findViewById.getLayoutParams().height = findViewById.getLayoutParams().width;
            C168996kB c168996kB = new C168996kB(frameLayout2, null, tuxTextView, findViewById, clickListener, null);
            c168996kB.LJLLLL = new C169016kD(findViewById, null);
            return c168996kB;
        }
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJLLL;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.ji, parent, false);
            o.LJII(LLLLIILL2, "null cannot be cast to non-null type android.widget.FrameLayout");
            frameLayout = (FrameLayout) LLLLIILL2;
        } else {
            View LLLLIILL3 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.jk, parent, false);
            o.LJII(LLLLIILL3, "null cannot be cast to non-null type android.widget.FrameLayout");
            frameLayout = (FrameLayout) LLLLIILL3;
        }
        View findViewById2 = frameLayout.findViewById(R.id.kgn);
        SmartImageView smartImageView = (SmartImageView) frameLayout.findViewById(R.id.f2e);
        TuxTextView tuxTextView2 = (TuxTextView) frameLayout.findViewById(R.id.m64);
        int min2 = Math.min(SFS.LJI(60.0d), (int) (C143205jg.LJ() * 0.14d));
        View findViewById3 = frameLayout.findViewById(R.id.f6h);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_loading)");
        TDV tdv = (TDV) findViewById3;
        smartImageView.getLayoutParams().width = min2;
        smartImageView.getLayoutParams().height = min2;
        tdv.getLayoutParams().width = min2;
        tdv.getLayoutParams().height = min2;
        tuxTextView2.setHorizontalFadingEdgeEnabled(true);
        tuxTextView2.setFadingEdgeLength((int) KL2.LIZJ(tuxTextView2.getContext(), 4.0f));
        findViewById2.getLayoutParams().width = SFS.LJI(8.0d) + min2;
        findViewById2.getLayoutParams().height = findViewById2.getLayoutParams().width;
        C168996kB c168996kB2 = new C168996kB(frameLayout, smartImageView, tuxTextView2, findViewById2, clickListener, tdv);
        c168996kB2.LJLLLL = new C169016kD(findViewById2, tdv);
        return c168996kB2;
    }
}
