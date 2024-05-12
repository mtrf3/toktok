package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0zU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25600zU extends ContextWrapper {
    public int LIZ;
    public Resources.Theme LIZIZ;
    public LayoutInflater LIZJ;
    public Configuration LIZLLL;
    public Resources LJ;

    public C25600zU() {
        super(null);
    }

    public final void LIZIZ() {
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
        if (this.LJ == null) {
            Configuration configuration = this.LIZLLL;
            if (configuration == null) {
                this.LJ = super.getResources();
            } else {
                this.LJ = createConfigurationContext(configuration).getResources();
            }
        }
        return this.LJ;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.LIZIZ;
        if (theme != null) {
            return theme;
        }
        if (this.LIZ == 0) {
            this.LIZ = R.style.pl;
        }
        LIZIZ();
        return this.LIZIZ;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final void LIZ(Configuration configuration) {
        if (this.LJ == null) {
            if (this.LIZLLL == null) {
                this.LIZLLL = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
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
            LIZIZ();
        }
    }

    public C25600zU(Context context, int i) {
        super(context);
        this.LIZ = i;
    }
}
