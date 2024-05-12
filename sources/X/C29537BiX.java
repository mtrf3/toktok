package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BiX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29537BiX extends PagerAdapter {
    public final Context LJLILLLLZI;
    public final List<? extends ImageModel> LJLJI;
    public final LayoutInflater LJLJJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJI.size();
    }

    public C29537BiX(Context context, List list) {
        this.LJLILLLLZI = context;
        this.LJLJI = list;
        Object LLILL = C16880lQ.LLILL(context, "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.LJLJJI = (LayoutInflater) LLILL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(this.LJLJJI, R.layout.dh8, container, false);
        o.LJIIIIZZ(LLLLIILL, "mLayoutInflater.inflate(…se,\n                    )");
        View findViewById = LLLLIILL.findViewById(R.id.kak);
        o.LJII(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        C17190lv LJII = C17190lv.LJII(this.LJLILLLLZI);
        LJII.LIZ(ImageView.ScaleType.FIT_CENTER);
        LJII.LJFF = (ImageModel) ListProtector.get(this.LJLJI, i);
        LJII.LIZJ(findViewById);
        container.addView(LLLLIILL);
        return LLLLIILL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        if (view == object) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        C16880lQ.LJLLL((View) object, container);
    }
}
