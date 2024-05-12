package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: X.Vhd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80441Vhd extends C013603o {
    public static final int[][] LJLJL = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList LJLJJL;
    public boolean LJLJJLL;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.LJLJJL == null) {
            int LJJIII = C78966Uyw.LJJIII(com.zhiliaoapp.musically.R.attr.a4h, this);
            int LJJIII2 = C78966Uyw.LJJIII(com.zhiliaoapp.musically.R.attr.a4q, this);
            int LJJIII3 = C78966Uyw.LJJIII(com.zhiliaoapp.musically.R.attr.a4y, this);
            this.LJLJJL = new ColorStateList(LJLJL, new int[]{C78966Uyw.LJJIL(1.0f, LJJIII3, LJJIII), C78966Uyw.LJJIL(0.54f, LJJIII3, LJJIII2), C78966Uyw.LJJIL(0.38f, LJJIII3, LJJIII2), C78966Uyw.LJJIL(0.38f, LJJIII3, LJJIII2)});
        }
        return this.LJLJJL;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LJLJJLL && C07L.LIZ(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.LJLJJLL = z;
        if (z) {
            C07L.LIZJ(this, getMaterialThemeColorsTintList());
        } else {
            C07L.LIZJ(this, null);
        }
    }

    public C80441Vhd(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, com.zhiliaoapp.musically.R.attr.b6g, com.zhiliaoapp.musically.R.style.a0k), attributeSet, com.zhiliaoapp.musically.R.attr.b6g);
        Context context2 = getContext();
        TypedArray LIZLLL = C80244VeS.LIZLLL(context2, attributeSet, new int[]{com.zhiliaoapp.musically.R.attr.a0n, com.zhiliaoapp.musically.R.attr.bvw}, com.zhiliaoapp.musically.R.attr.b6g, com.zhiliaoapp.musically.R.style.a0k, new int[0]);
        if (LIZLLL.hasValue(0)) {
            C07L.LIZJ(this, C80285Vf7.LIZ(context2, LIZLLL, 0));
        }
        this.LJLJJLL = LIZLLL.getBoolean(1, false);
        LIZLLL.recycle();
    }
}
