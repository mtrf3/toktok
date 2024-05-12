package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.MovementMethod;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MSD extends LBN {
    public final EnumC53542Kzq LJLIL;
    public CharSequence LJLILLLLZI;
    public CharSequence LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public MovementMethod LJLJLJ;
    public MovementMethod LJLJLLL;
    public View.OnClickListener LJLL;
    public View.OnClickListener LJLLI;
    public final java.util.Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLILLLL;
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

    public final void LIZIZ() {
        LIZ(R.id.gm_).setVisibility(8);
        ((C223338pd) LIZ(R.id.g85)).setVisibility(0);
        ((C223338pd) LIZ(R.id.g85)).LIZIZ();
    }

    public final void LJ() {
        C223338pd c223338pd = (C223338pd) LIZ(R.id.g85);
        if (c223338pd.LJLJLJ) {
            c223338pd.LIZJ();
        }
        ((C223338pd) LIZ(R.id.g85)).setVisibility(8);
    }

    public final MovementMethod getEmptyMovementMethod() {
        return this.LJLJLJ;
    }

    public final View.OnClickListener getEmptyOnClickListener() {
        return this.LJLL;
    }

    public final CharSequence getEmptyText() {
        return this.LJLILLLLZI;
    }

    public final int getEmptyTextColor() {
        return this.LJLJJI;
    }

    public final int getEmptyTextFont() {
        return this.LJLJJL;
    }

    public final MovementMethod getErrorMovementMethod() {
        return this.LJLJLLL;
    }

    public final View.OnClickListener getErrorOnClickListener() {
        return this.LJLLI;
    }

    public final CharSequence getErrorText() {
        return this.LJLJI;
    }

    public final int getErrorTextColor() {
        return this.LJLJJLL;
    }

    public final int getErrorTextFont() {
        return this.LJLJL;
    }

    @Override // X.LBN
    public EnumC53542Kzq getVariant() {
        return this.LJLIL;
    }

    public MSD(Context context) {
        super(context, null, R.attr.kp);
        this.LJLIL = EnumC53542Kzq.STATUS;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c_, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.rp, R.attr.rq, R.attr.rr, R.attr.rs}, R.attr.kp, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…sFooter, defStyleAttr, 0)");
        this.LJLJJI = obtainStyledAttributes.getColor(0, 0);
        this.LJLJJL = obtainStyledAttributes.getInt(1, 0);
        this.LJLJJLL = obtainStyledAttributes.getColor(2, 0);
        this.LJLJL = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        LIZ(R.id.gn9).setVisibility(0);
    }

    public final void LIZJ(boolean z) {
        LJ();
        if (!z) {
            LIZLLL(this.LJLILLLLZI, this.LJLJLJ, this.LJLL, this.LJLJJL, this.LJLJJI);
        } else {
            LIZ(R.id.gm_).setVisibility(8);
        }
    }

    public final void setEmptyMovementMethod(MovementMethod movementMethod) {
        this.LJLJLJ = movementMethod;
    }

    public final void setEmptyOnClickListener(View.OnClickListener onClickListener) {
        this.LJLL = onClickListener;
    }

    public final void setEmptyText(CharSequence charSequence) {
        this.LJLILLLLZI = charSequence;
    }

    public final void setEmptyTextColor(int i) {
        this.LJLJJI = i;
    }

    public final void setEmptyTextFont(int i) {
        this.LJLJJL = i;
    }

    public final void setErrorMovementMethod(MovementMethod movementMethod) {
        this.LJLJLLL = movementMethod;
    }

    public final void setErrorOnClickListener(View.OnClickListener onClickListener) {
        this.LJLLI = onClickListener;
    }

    public final void setErrorText(CharSequence charSequence) {
        this.LJLJI = charSequence;
    }

    public final void setErrorTextColor(int i) {
        this.LJLJJLL = i;
    }

    public final void setErrorTextFont(int i) {
        this.LJLJL = i;
    }

    public final void LIZLLL(CharSequence charSequence, MovementMethod movementMethod, View.OnClickListener onClickListener, int i, int i2) {
        if (charSequence != null) {
            TuxTextView tuxTextView = (TuxTextView) LIZ(R.id.gn9);
            tuxTextView.setText(charSequence);
            tuxTextView.setTuxFont(i);
            tuxTextView.setTextColor(i2);
            tuxTextView.setMovementMethod(movementMethod);
            C16880lQ.LJJJJI(tuxTextView, onClickListener);
            if (onClickListener == null) {
                tuxTextView.setOnTouchListener(null);
            } else {
                C78897Uxp.LJJJJLI(tuxTextView, null);
            }
            LIZ(R.id.gm_).setVisibility(0);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        LIZ(R.id.gm_).setVisibility(8);
    }
}
