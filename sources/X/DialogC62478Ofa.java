package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* renamed from: X.Ofa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class DialogC62478Ofa extends C18Z {
    public final InterfaceC62517OgD LJLJI;

    @Override // X.C18Z, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window.setLayout(-1, -1);
        }
        this.LJLJI.LIZLLL(this);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        this.LJLJI.LIZ(z);
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.LJLJI.LJ(z);
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(View view) {
        o.LJIIIZ(view, "view");
        super.setContentView(LJIJJ(this, 0, view, null, 5));
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(LJIJJ(this, i, null, null, 6));
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o.LJIIIZ(view, "view");
        super.setContentView(LJIJJ(this, 0, view, layoutParams, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC62478Ofa(Context context, InterfaceC62517OgD interfaceC62517OgD, C62387Oe7 c62387Oe7, int i) {
        super(context, i);
        o.LJIIIZ(context, "context");
        this.LJLJI = interfaceC62517OgD;
        LJIJI(1);
    }

    public static View LJIJJ(DialogC62478Ofa dialogC62478Ofa, int i, View view, ViewGroup.LayoutParams layoutParams, int i2) {
        int i3 = i;
        View view2 = view;
        if ((i2 & 1) != 0) {
            i3 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = null;
        if ((i2 & 2) != 0) {
            view2 = null;
        }
        if ((i2 & 4) == 0) {
            layoutParams2 = layoutParams;
        }
        dialogC62478Ofa.getClass();
        return dialogC62478Ofa.LJLJI.LIZJ(dialogC62478Ofa, i3, view2, layoutParams2, C119364mK.LIZ(dialogC62478Ofa.getContext()));
    }
}
