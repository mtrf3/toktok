package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.zhiliaoapp.musically.R;

/* renamed from: X.7yU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C203347yU extends X3I {
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public C203417yb LJ;
    public TuxTextView LJFF;

    public C203347yU() {
        super(1);
    }

    public final Drawable LIZ() {
        int i;
        int i2;
        int i3;
        int i4;
        StateListDrawable stateListDrawable = new StateListDrawable();
        boolean booleanValue = ((Boolean) C203367yW.LIZ.getValue()).booleanValue();
        Context LIZIZ = EF7.LIZIZ();
        if (booleanValue) {
            i = R.raw.icon_color_bookmark_shadow;
        } else {
            i = R.drawable.b84;
        }
        SY9 LIZJ = LIZJ(i, LIZIZ);
        if (C202677xP.LIZIZ()) {
            Context LIZIZ2 = EF7.LIZIZ();
            if (booleanValue) {
                i4 = R.raw.icon_color_bookmark_shadow_alt_1;
            } else {
                i4 = R.drawable.axd;
            }
            LIZJ = LIZJ(i4, LIZIZ2);
        }
        stateListDrawable.addState(new int[]{-16842913}, LIZJ);
        if (C202677xP.LIZIZ()) {
            int[] iArr = {android.R.attr.state_selected};
            Context LIZIZ3 = EF7.LIZIZ();
            if (booleanValue) {
                i3 = R.raw.icon_color_bookmark_yellow_shadow_alt_1;
            } else {
                i3 = R.drawable.axe;
            }
            stateListDrawable.addState(iArr, LIZJ(i3, LIZIZ3));
        } else {
            int[] iArr2 = {android.R.attr.state_selected};
            Context LIZIZ4 = EF7.LIZIZ();
            if (booleanValue) {
                i2 = R.raw.icon_color_bookmark_yellow_shadow;
            } else {
                i2 = R.drawable.b85;
            }
            stateListDrawable.addState(iArr2, LIZJ(i2, LIZIZ4));
        }
        return stateListDrawable;
    }

    public int LIZIZ() {
        if (C202677xP.LIZIZ()) {
            return C7MY.LIZIZ(32);
        }
        if (FavoriteServiceImpl.LJIJJLI().LJIJJ() || C8D3.LIZJ()) {
            return C7MY.LIZIZ(36);
        }
        return C7MY.LIZIZ(40);
    }

    public final SY9 LIZJ(int i, Context context) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LIZIZ = LIZIZ();
        c2068389v.LIZJ = LIZIZ();
        return c2068389v.LIZ(context);
    }
}
