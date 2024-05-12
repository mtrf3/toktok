package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* renamed from: X.18Z, reason: invalid class name */
/* loaded from: classes.dex */
public class C18Z extends Dialog implements AnonymousClass026 {
    public AppCompatDelegateImpl LJLIL;
    public final C18Y LJLILLLLZI;

    public C18Z() {
        throw null;
    }

    @Override // X.AnonymousClass026
    public final void onSupportActionModeFinished(AbstractC25580zS abstractC25580zS) {
    }

    @Override // X.AnonymousClass026
    public final void onSupportActionModeStarted(AbstractC25580zS abstractC25580zS) {
    }

    @Override // X.AnonymousClass026
    public final AbstractC25580zS onWindowStartingSupportActionMode(InterfaceC25570zR interfaceC25570zR) {
        return null;
    }

    public final AnonymousClass027 LJIIZILJ() {
        if (this.LJLIL == null) {
            this.LJLIL = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.LJLIL;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        LJIIZILJ().LJIILLIIL();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LJIIZILJ().LJIILIIL();
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        LJIIZILJ().LJIJJLI();
    }

    public final boolean LJIJ(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean LJIJI(int i) {
        return LJIIZILJ().LJJ(1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C16260kQ.LIZIZ(this.LJLILLLLZI, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i) {
        return (T) LJIIZILJ().LJII(i);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        LJIIZILJ().LJIIL();
        super.onCreate(bundle);
        LJIIZILJ().LJIILL(bundle);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        LJIIZILJ().LJJI(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        LJIIZILJ().LJJIIZ(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        LJIIZILJ().LJJIFFI(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        LJIIZILJ().LJJIIZ(charSequence);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.18Y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C18Z(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r4 = 1
            r3 = 2130969842(0x7f0404f2, float:1.7548377E38)
            if (r7 != 0) goto L3c
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r0 = r6.getTheme()
            r0.resolveAttribute(r3, r1, r4)
            int r0 = r1.resourceId
        L14:
            r5.<init>(r6, r0)
            X.18Y r0 = new X.18Y
            r0.<init>()
            r5.LJLILLLLZI = r0
            X.027 r2 = r5.LJIIZILJ()
            if (r7 != 0) goto L32
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r0 = r6.getTheme()
            r0.resolveAttribute(r3, r1, r4)
            int r7 = r1.resourceId
        L32:
            r0 = r2
            androidx.appcompat.app.AppCompatDelegateImpl r0 = (androidx.appcompat.app.AppCompatDelegateImpl) r0
            r0.LLIIZ = r7
            r0 = 0
            r2.LJIILL(r0)
            return
        L3c:
            r0 = r7
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18Z.<init>(android.content.Context, int):void");
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LJIIZILJ().LIZLLL(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LJIIZILJ().LJJII(view, layoutParams);
    }
}
