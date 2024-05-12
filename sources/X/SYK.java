package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes13.dex */
public final class SYK extends Dialog {
    public static final String LJLILLLLZI = C16880lQ.LJLLJ(SYK.class);
    public final Rect LJLIL;

    public static void LIZ(SYK syk) {
        if (new C03880Dg(2).LIZJ(300000, "com/lynx/tasm/behavior/KeyboardMonitor", "show", syk, new Object[0], "void", new C65300Pk0(false, "()V", "2715211376245771380")).LIZ) {
            return;
        }
        syk.show();
    }

    public final View LIZJ() {
        return getWindow().getDecorView();
    }

    public SYK(Context context) {
        super(context);
        this.LJLIL = new Rect(0, 0, 0, 0);
    }

    public static Activity LIZIZ(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZIZ(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(3);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(2, -1);
        getWindow().setSoftInputMode(16);
        getWindow().addFlags(32);
        getWindow().addFlags(8);
        getWindow().addFlags(131072);
        getWindow().clearFlags(2);
        LIZJ().setOutlineProvider(null);
        LIZJ().setElevation(0.0f);
        LIZJ().setTranslationZ(0.0f);
        LIZJ().addOnAttachStateChangeListener(new P8R(this));
    }
}
