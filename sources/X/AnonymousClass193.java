package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;

/* renamed from: X.193, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass193 implements InterfaceC009902d, DialogInterface.OnClickListener {
    public DialogInterfaceC39771hF LJLIL;
    public ListAdapter LJLILLLLZI;
    public CharSequence LJLJI;
    public final /* synthetic */ C010002e LJLJJI;

    @Override // X.InterfaceC009902d
    public final Drawable LIZ() {
        return null;
    }

    @Override // X.InterfaceC009902d
    public final void LJFF(Drawable drawable) {
    }

    @Override // X.InterfaceC009902d
    public final void LJI(int i) {
    }

    @Override // X.InterfaceC009902d
    public final void LJII(int i) {
    }

    @Override // X.InterfaceC009902d
    public final int LJIIIIZZ() {
        return 0;
    }

    @Override // X.InterfaceC009902d
    public final int LJIIIZ() {
        return 0;
    }

    @Override // X.InterfaceC009902d
    public final void LJIIJ(int i) {
    }

    @Override // X.InterfaceC009902d
    public final void dismiss() {
        DialogInterfaceC39771hF dialogInterfaceC39771hF = this.LJLIL;
        if (dialogInterfaceC39771hF != null) {
            dialogInterfaceC39771hF.dismiss();
            this.LJLIL = null;
        }
    }

    @Override // X.InterfaceC009902d
    public final boolean isShowing() {
        DialogInterfaceC39771hF dialogInterfaceC39771hF = this.LJLIL;
        if (dialogInterfaceC39771hF != null) {
            return dialogInterfaceC39771hF.isShowing();
        }
        return false;
    }

    @Override // X.InterfaceC009902d
    public final CharSequence LJIIJJI() {
        return this.LJLJI;
    }

    public AnonymousClass193(C010002e c010002e) {
        this.LJLJJI = c010002e;
    }

    @Override // X.InterfaceC009902d
    public final void LJIIL(CharSequence charSequence) {
        this.LJLJI = charSequence;
    }

    @Override // X.InterfaceC009902d
    public final void LJIILIIL(ListAdapter listAdapter) {
        this.LJLILLLLZI = listAdapter;
    }

    @Override // X.InterfaceC009902d
    public final void LIZIZ(int i, int i2) {
        if (this.LJLILLLLZI == null) {
            return;
        }
        AnonymousClass025 anonymousClass025 = new AnonymousClass025(this.LJLJJI.getPopupContext());
        CharSequence charSequence = this.LJLJI;
        if (charSequence != null) {
            anonymousClass025.LIZ.LIZLLL = charSequence;
        }
        ListAdapter listAdapter = this.LJLILLLLZI;
        int selectedItemPosition = this.LJLJJI.getSelectedItemPosition();
        C008901t c008901t = anonymousClass025.LIZ;
        c008901t.LJIILLIIL = listAdapter;
        c008901t.LJIIZILJ = this;
        c008901t.LJIJJ = selectedItemPosition;
        c008901t.LJIJI = true;
        DialogInterfaceC39771hF LIZ = anonymousClass025.LIZ();
        this.LJLIL = LIZ;
        C008801s c008801s = LIZ.LJLJI.LJI;
        c008801s.setTextDirection(i);
        c008801s.setTextAlignment(i2);
        this.LJLIL.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.LJLJJI.setSelection(i);
        if (this.LJLJJI.getOnItemClickListener() != null) {
            this.LJLJJI.performItemClick(null, i, this.LJLILLLLZI.getItemId(i));
        }
        dismiss();
    }
}
