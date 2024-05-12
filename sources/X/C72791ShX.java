package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.ShX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72791ShX extends W5G {
    public boolean LJLIL;

    public C72791ShX(Context context) {
        super(context);
        this.LJLIL = true;
    }

    public final void LIZ(boolean z) {
        Animatable LIZ;
        try {
            InterfaceC81252Vui controller = getController();
            if (controller == null || (LIZ = controller.LIZ()) == null) {
                return;
            }
            if (z && this.LJLIL) {
                LIZ.start();
            } else {
                LIZ.stop();
            }
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        if (i == 0 && getVisibility() == 0) {
            z = true;
        }
        LIZ(z);
    }

    @Override // X.VA9
    public void setController(InterfaceC81252Vui interfaceC81252Vui) {
        super.setController(interfaceC81252Vui);
    }

    public void setEnableAnimation(boolean z) {
        this.LJLIL = z;
    }

    public C72791ShX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = true;
    }

    @Override // X.VA9, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ(z);
    }
}
