package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vg1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80341Vg1 implements InterfaceC80337Vfx {
    public final /* synthetic */ C80342Vg2 LIZ;

    public C80341Vg1(C80342Vg2 c80342Vg2) {
        this.LIZ = c80342Vg2;
    }

    @Override // X.InterfaceC80337Vfx
    public final void LIZ(C80315Vfb c80315Vfb) {
        EditText editText = c80315Vfb.getEditText();
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            C80342Vg2 c80342Vg2 = this.LIZ;
            int boxBackgroundMode = c80342Vg2.LIZ.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(c80342Vg2.LJIIL);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(c80342Vg2.LJIIJJI);
            }
            C80342Vg2 c80342Vg22 = this.LIZ;
            c80342Vg22.getClass();
            if (autoCompleteTextView.getKeyListener() == null) {
                int boxBackgroundMode2 = c80342Vg22.LIZ.getBoxBackgroundMode();
                C80418VhG boxBackground = c80342Vg22.LIZ.getBoxBackground();
                int LJJIII = C78966Uyw.LJJIII(R.attr.a4i, autoCompleteTextView);
                int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                if (boxBackgroundMode2 == 2) {
                    int LJJIII2 = C78966Uyw.LJJIII(R.attr.a4y, autoCompleteTextView);
                    C80418VhG c80418VhG = new C80418VhG(boxBackground.LJLIL.LIZ);
                    int LJJIL = C78966Uyw.LJJIL(0.1f, LJJIII, LJJIII2);
                    c80418VhG.LJIIJJI(new ColorStateList(iArr, new int[]{LJJIL, 0}));
                    c80418VhG.setTint(LJJIII2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{LJJIL, LJJIII2});
                    C80418VhG c80418VhG2 = new C80418VhG(boxBackground.LJLIL.LIZ);
                    c80418VhG2.setTint(-1);
                    C16300kU.LJIILLIIL(autoCompleteTextView, new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c80418VhG, c80418VhG2), boxBackground}));
                } else if (boxBackgroundMode2 == 1) {
                    int boxBackgroundColor = c80342Vg22.LIZ.getBoxBackgroundColor();
                    C16300kU.LJIILLIIL(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, new int[]{C78966Uyw.LJJIL(0.1f, LJJIII, boxBackgroundColor), boxBackgroundColor}), boxBackground, boxBackground));
                }
            }
            C80342Vg2 c80342Vg23 = this.LIZ;
            c80342Vg23.getClass();
            autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC80355VgF(c80342Vg23, autoCompleteTextView));
            autoCompleteTextView.setOnFocusChangeListener(c80342Vg23.LJ);
            autoCompleteTextView.setOnDismissListener(new C80362VgM(c80342Vg23));
            autoCompleteTextView.setThreshold(0);
            autoCompleteTextView.removeTextChangedListener(this.LIZ.LIZLLL);
            autoCompleteTextView.addTextChangedListener(this.LIZ.LIZLLL);
            c80315Vfb.setEndIconCheckable(true);
            c80315Vfb.setErrorIconDrawable((Drawable) null);
            if (autoCompleteTextView.getKeyListener() == null) {
                C16300kU.LJIJ(this.LIZ.LIZJ, 2);
            }
            c80315Vfb.setTextInputAccessibilityDelegate(this.LIZ.LJFF);
            c80315Vfb.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }
}
