package X;

import Y.IDDListenerS145S0100000_5;
import android.content.DialogInterface;
import android.view.Window;

/* renamed from: X.Bnp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class DialogC29865Bnp extends DialogC38611fN {
    public final boolean LJLILLLLZI;
    public DialogInterface.OnShowListener LJLJI;
    public DialogInterface.OnDismissListener LJLJJI;
    public final DialogInterfaceOnShowListenerC29866Bnq LJLJJL;
    public final IDDListenerS145S0100000_5 LJLJJLL;

    @Override // X.DialogC38611fN, android.app.Dialog
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            C28289B8j.LIZIZ(0, window);
            if (this.LJLILLLLZI) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-2, -1);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener == this.LJLJJLL) {
            super.setOnDismissListener(onDismissListener);
        } else {
            this.LJLJJI = onDismissListener;
        }
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        if (onShowListener == this.LJLJJL) {
            super.setOnShowListener(onShowListener);
        } else {
            this.LJLJI = onShowListener;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Bnq, android.content.DialogInterface$OnShowListener] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC29865Bnp(android.content.Context r6, boolean r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L3d
            r0 = 2131887461(0x7f120565, float:1.940953E38)
        L5:
            r5.<init>(r6, r0)
            X.Bnq r4 = new X.Bnq
            r4.<init>()
            r5.LJLJJL = r4
            Y.IDDListenerS145S0100000_5 r3 = new Y.IDDListenerS145S0100000_5
            r0 = 10
            r3.<init>(r5, r0)
            r5.LJLJJLL = r3
            android.view.Window r2 = r5.getWindow()
            if (r2 == 0) goto L2d
            android.view.Window r1 = r5.getWindow()
            r0 = 1
            r1.requestFeature(r0)
            if (r7 == 0) goto L36
            r0 = 80
            r2.setGravity(r0)
        L2d:
            r5.LJLILLLLZI = r7
            r5.setOnShowListener(r4)
            r5.setOnDismissListener(r3)
            return
        L36:
            r0 = 8388613(0x800005, float:1.175495E-38)
            r2.setGravity(r0)
            goto L2d
        L3d:
            r0 = 2131887466(0x7f12056a, float:1.940954E38)
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC29865Bnp.<init>(android.content.Context, boolean):void");
    }
}
