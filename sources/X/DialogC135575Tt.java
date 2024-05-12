package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5Tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class DialogC135575Tt extends Dialog {
    public final C29701Eo LJLIL;
    public boolean LJLILLLLZI;

    @Override // android.app.Dialog
    public final void show() {
        if (!this.LJLILLLLZI) {
            this.LJLIL.playAnimation();
            this.LJLILLLLZI = true;
        }
        if (new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-5487351445668400490")).LIZ) {
            return;
        }
        super.show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.LJLIL.cancelAnimation();
        this.LJLILLLLZI = false;
        super.dismiss();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC135575Tt(Context context) {
        super(context, R.style.jg);
        o.LJIIIZ(context, "context");
        setContentView(R.layout.bnh);
        View findViewById = findViewById(R.id.f41);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.iv_guide_animation)");
        C29701Eo c29701Eo = (C29701Eo) findViewById;
        this.LJLIL = c29701Eo;
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        c29701Eo.setAnimation("stickpoint_switch_music_loading.json");
        c29701Eo.getAnimation();
        c29701Eo.setRepeatCount(-1);
    }
}
