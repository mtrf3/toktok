package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC111054Xl extends Dialog {
    public C8IC LJLIL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
    }

    @Override // android.app.Dialog
    public final void show() {
        C8IC c8ic = this.LJLIL;
        if (c8ic != null) {
            c8ic.setVisibility(0);
        }
        if (new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "5634882733345127044")).LIZ) {
            return;
        }
        super.show();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC111054Xl(Context context) {
        super(context, R.style.ht);
        o.LJIIIZ(context, "context");
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ane);
        C8IC c8ic = (C8IC) findViewById(R.id.ceq);
        this.LJLIL = c8ic;
        if (c8ic != null) {
            c8ic.setMessage(R.string.rjz);
        }
        C8IC c8ic2 = this.LJLIL;
        if (c8ic2 != null) {
            c8ic2.setVisibility(0);
        }
        setCanceledOnTouchOutside(false);
    }
}
