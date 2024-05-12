package X;

import Y.IDCListenerS135S0100000;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0Pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC06970Pd extends Dialog {
    public final boolean LJLIL;
    public final JSONObject LJLILLLLZI;
    public View LJLJI;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        String str;
        super.onBackPressed();
        if (this.LJLIL) {
            str = "double_side";
        } else {
            str = "single_side";
        }
        C0U3.LIZLLL(str, "iqa_failed", "return", this.LJLILLLLZI);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.d1v);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        View findViewById = findViewById(R.id.lq8);
        this.LJLJI = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 64), findViewById);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC06970Pd(Context context, JSONObject jSONObject, boolean z) {
        super(context, R.style.ac6);
        o.LJIIIZ(context, "context");
        this.LJLIL = z;
        this.LJLILLLLZI = jSONObject;
    }
}
