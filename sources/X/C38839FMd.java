package X;

import Y.ARunnableS42S0100000_6;
import android.app.Activity;
import android.app.Application;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.FMd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38839FMd implements InterfaceC55373LoH {
    public final Activity LJLIL;
    public C38842FMg LJLILLLLZI;

    public final Application LIZ() {
        Application application = this.LJLIL.getApplication();
        o.LJIIIIZZ(application, "activity.application");
        return application;
    }

    @Override // X.InterfaceC55373LoH
    public final Resources.Theme LLLJL() {
        C38842FMg c38842FMg = this.LJLILLLLZI;
        if (c38842FMg != null && c38842FMg.LIZJ && C34710Djm.LJII() && !o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            return LIZ().getTheme();
        }
        return null;
    }

    @Override // X.InterfaceC55373LoH
    public final AssetManager f() {
        C38842FMg c38842FMg = this.LJLILLLLZI;
        if (c38842FMg != null && c38842FMg.LIZJ && C34710Djm.LJII() && !o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            return LIZ().getAssets();
        }
        return null;
    }

    @Override // X.InterfaceC55373LoH
    public final Resources getResources() {
        C38842FMg c38842FMg = this.LJLILLLLZI;
        if (c38842FMg != null && c38842FMg.LIZJ && C34710Djm.LJII() && !o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            return LIZ().getResources();
        }
        return null;
    }

    public C38839FMd(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
    }

    @Override // X.InterfaceC55373LoH
    public final Object LLIILZL(String name) {
        o.LJIIIZ(name, "name");
        if (Build.VERSION.SDK_INT > 27 && ((Boolean) C34565DhR.LIZ.getValue()).booleanValue() && TextUtils.equals("layout_inflater", name)) {
            if (this.LJLIL.getBaseContext() != null) {
                return C67012k5.LJ.LIZIZ(this.LJLIL);
            }
            "System services not available to Activities before onCreate()".toString();
            throw new IllegalStateException("System services not available to Activities before onCreate()");
        }
        return null;
    }

    @Override // X.InterfaceC55373LoH
    public final void LLJLL(int i) {
        C38842FMg c38842FMg = this.LJLILLLLZI;
        if (c38842FMg != null && c38842FMg.LIZJ && C34710Djm.LJII()) {
            C38842FMg c38842FMg2 = this.LJLILLLLZI;
            if (c38842FMg2 != null) {
                Application LIZ = LIZ();
                if (c38842FMg2.LIZJ) {
                    LIZ.setTheme(c38842FMg2.LIZ);
                    LIZ.getResources().getConfiguration().setTo(c38842FMg2.LIZIZ);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C62822Ol8 c62822Ol8 = C35274Dss.LIZIZ;
        int i2 = 1;
        if (((Number) c62822Ol8.getValue()).intValue() == 1) {
            this.LJLIL.getResources().getDrawable(R.drawable.bnr, LLLJL());
        } else if (((Number) c62822Ol8.getValue()).intValue() == 2) {
            C38995FSd.LIZIZ().execute(new ARunnableS42S0100000_6(this, 43));
        }
        C38995FSd.LIZIZ().execute(new ARunnableS42S0100000_6(this, 44));
        if (((Boolean) C34565DhR.LIZ.getValue()).booleanValue()) {
            if (!((Boolean) C34565DhR.LJFF.getValue()).booleanValue() && !((Boolean) C34565DhR.LIZJ.getValue()).booleanValue() && !((Boolean) C34565DhR.LJ.getValue()).booleanValue()) {
                i2 = 0;
            }
            C67012k5.LJ.LIZJ(new C38845FMj(this), i2);
        }
    }
}
