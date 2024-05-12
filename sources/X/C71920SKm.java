package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.InputFilter;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.CommentFilterModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SKm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71920SKm extends SKX implements InterfaceC71918SKk {
    public final CommentFilterModel LIZ;
    public Boolean LIZIZ;
    public Boolean LIZJ;

    @Override // X.SKX
    public final int LJII() {
        return R.layout.ah9;
    }

    @Override // X.SKX, X.SKZ
    public final InterfaceC71908SKa LJ() {
        return new C71922SKo(this);
    }

    @Override // X.SKZ
    public final boolean LJI() {
        Integer value = this.LIZ.LJLILLLLZI.LJLILLLLZI.getValue();
        if (value == null || value.intValue() != 1) {
            return false;
        }
        return true;
    }

    public C71920SKm(CommentFilterModel commentFilterModel) {
        this.LIZ = commentFilterModel;
    }

    @Override // X.SKZ
    public final void LIZLLL(SKV holder) {
        o.LJIIIZ(holder, "holder");
        T5T t5t = (T5T) holder.itemView.findViewById(R.id.cqb);
        o.LJII(t5t, "null cannot be cast to non-null type com.bytedance.tux.input.TuxEditText");
        int i = 0;
        t5t.setFilters(new InputFilter[]{new C71921SKn()});
        t5t.setOnEditorActionListener(new C71923SKp(t5t, this));
        View view = holder.itemView;
        if (!LJI()) {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // X.InterfaceC71918SKk
    public final void LIZJ(SKV holder, boolean z, boolean z2) {
        int i;
        o.LJIIIZ(holder, "holder");
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        Integer LIZIZ = C19N.LIZIZ(view, "view.context", R.attr.cl);
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        int LIZIZ2 = C7MY.LIZIZ(6);
        if (o.LJ(this.LIZIZ, Boolean.valueOf(z)) && o.LJ(this.LIZJ, Boolean.valueOf(z2))) {
            return;
        }
        this.LIZIZ = Boolean.valueOf(z);
        this.LIZJ = Boolean.valueOf(z2);
        if (LJJIIZ >= 0) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = LIZIZ;
            if (z) {
                float f = LJJIIZ;
                c110614Vt.LJIIIIZZ = Float.valueOf(f);
                c110614Vt.LJIIIZ = Float.valueOf(f);
            }
            if (z2) {
                float f2 = LJJIIZ;
                c110614Vt.LJIIJ = Float.valueOf(f2);
                c110614Vt.LJIIJJI = Float.valueOf(f2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{C06460Ne.LIZ(view, "view.context", c110614Vt)});
            layerDrawable.setLayerInset(0, LJJIIZ2, 0, LJJIIZ2, 0);
            view.setBackground(layerDrawable);
        }
        if (LJJIIZ2 <= 0 || LIZIZ2 <= 0) {
            return;
        }
        if (z) {
            i = LIZIZ2;
        } else {
            i = 0;
        }
        if (!z2) {
            LIZIZ2 = 0;
        }
        C26338AVi.LJIIIZ(view, Integer.valueOf(LJJIIZ2), Integer.valueOf(i), Integer.valueOf(LJJIIZ2), Integer.valueOf(LIZIZ2), 16);
    }

    @Override // X.SLP
    public final void LIZ(SKZ skz, SKZ skz2, SKV skv, int i) {
        C71916SKi.LIZ(this, skz, skz2, skv);
    }

    @Override // X.SLP
    public final void LIZIZ(SKZ skz, SKZ skz2, SKV holder, int i) {
        o.LJIIIZ(holder, "holder");
        C71916SKi.LIZ(this, skz, skz2, holder);
    }
}
