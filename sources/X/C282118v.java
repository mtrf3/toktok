package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.18v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C282118v extends AppCompatImageView implements C02V {
    public final /* synthetic */ ActionMenuPresenter LJLIL;

    @Override // X.C02V
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.C02V
    public final boolean LJIJJ() {
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.LJLIL.LJIILIIL();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C282118v(ActionMenuPresenter actionMenuPresenter, Context context) {
        super(context, null, R.attr.ut);
        this.LJLIL = actionMenuPresenter;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        C03E.LIZ(this, getContentDescription());
        setOnTouchListener(new C03O(this) { // from class: X.18u
            @Override // X.C03O
            public final AnonymousClass112 LIZIZ() {
                C282218w c282218w = C282118v.this.LJLIL.LJZL;
                if (c282218w == null) {
                    return null;
                }
                return c282218w.LIZ();
            }

            @Override // X.C03O
            public final boolean LIZJ() {
                C282118v.this.LJLIL.LJIILIIL();
                return true;
            }

            @Override // X.C03O
            public final boolean LIZLLL() {
                ActionMenuPresenter actionMenuPresenter2 = C282118v.this.LJLIL;
                if (actionMenuPresenter2.LLD != null) {
                    return false;
                }
                actionMenuPresenter2.LJIIJJI();
                return true;
            }
        });
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            C07820Sk.LJFF(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
