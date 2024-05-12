package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OOe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogC61824OOe extends Dialog {
    public InterfaceC61825OOf LJLIL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        InterfaceC61825OOf interfaceC61825OOf = this.LJLIL;
        if (interfaceC61825OOf != null) {
            interfaceC61825OOf.X();
        }
    }

    public DialogC61824OOe(Context context) {
        super(context, R.style.a4z);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ma, C16880lQ.LLZIL(context), null);
        ((C223338pd) LLLZIIL.findViewById(R.id.lud)).LIZIZ();
        setContentView(LLLZIIL);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = (int) KL2.LIZJ(context, 57.0f);
        attributes.width = (int) KL2.LIZJ(context, 57.0f);
        window.setAttributes(attributes);
    }
}
