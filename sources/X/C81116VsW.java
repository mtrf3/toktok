package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: X.VsW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81116VsW extends ContextWrapper {
    public int LIZ;
    public Resources.Theme LIZIZ;
    public LayoutInflater LIZJ;
    public Resources LIZLLL;
    public final boolean LJ;

    public final void LIZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.LIZIZ.setTo(theme);
            }
        }
        this.LIZIZ.applyStyle(this.LIZ, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.LIZLLL == null) {
            this.LIZLLL = super.getResources();
        }
        return this.LIZLLL;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.LIZIZ;
        if (theme != null) {
            return theme;
        }
        LIZ();
        return this.LIZIZ;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.LIZJ == null) {
                this.LIZJ = C16880lQ.LLZIL(getBaseContext()).cloneInContext(this);
            }
            return this.LIZJ;
        }
        return C16880lQ.LLILL(getBaseContext(), str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.LIZ != i) {
            this.LIZ = i;
            if (this.LJ) {
                this.LIZIZ = null;
                this.LIZLLL = null;
            }
            LIZ();
        }
    }

    public C81116VsW(Context context, int i) {
        super(context);
        this.LIZ = i;
        if (i != 0) {
        } else {
            throw new IllegalArgumentException("themeResId can't be zero");
        }
    }

    public C81116VsW(Context context, Resources.Theme theme) {
        super(context);
        C78932UyO.LJI(theme, "theme can't be null");
        this.LIZIZ = theme;
        this.LJ = true;
    }
}
