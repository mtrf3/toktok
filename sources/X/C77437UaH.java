package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.UaH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77437UaH extends C38601fM<C77437UaH> {
    public CharSequence LIZJ;
    public CharSequence LIZLLL;
    public CharSequence LJ;
    public CharSequence LJFF;
    public String LJI;
    public CharSequence LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public float LJIIL;
    public DialogInterface.OnClickListener LJIILIIL;
    public DialogInterface.OnClickListener LJIILJJIL;
    public DialogInterface.OnDismissListener LJIILL;
    public DialogInterface.OnShowListener LJIILLIIL;
    public View.OnClickListener LJIIZILJ;
    public View LJIJ;
    public View LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public final int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public boolean LJJII;
    public final boolean LJJIII;
    public int LJJIIJ;
    public boolean LJJIIJZLJL;
    public DialogInterface.OnKeyListener LJJIIZ;
    public DialogInterface.OnCancelListener LJJIIZI;
    public boolean LJJIJ;

    public final DialogC77438UaI LIZ() {
        DialogC77438UaI dialogC77438UaI = new DialogC77438UaI(this.LIZ, this);
        dialogC77438UaI.LLIFFJFJJ = this.LJIIIIZZ;
        dialogC77438UaI.LLILLL = this.LJIIJ;
        dialogC77438UaI.LLILZ = this.LJIIJJI;
        dialogC77438UaI.LLILZIL = this.LJIIL;
        dialogC77438UaI.LLF = this.LIZJ;
        dialogC77438UaI.LLFZ = this.LJI;
        dialogC77438UaI.LLFF = this.LIZLLL;
        dialogC77438UaI.LLFII = this.LJFF;
        dialogC77438UaI.LLFFF = this.LJ;
        dialogC77438UaI.LLI = null;
        dialogC77438UaI.LLIIII = this.LJIILIIL;
        dialogC77438UaI.LLIIIILZ = this.LJIILJJIL;
        dialogC77438UaI.LLIIIZ = this.LJIJJLI;
        dialogC77438UaI.LLIIIL = this.LJIJJ;
        dialogC77438UaI.LLIIL = this.LJJ;
        dialogC77438UaI.LLIIJI = this.LJIL;
        dialogC77438UaI.LLIIIJ = this.LJIIZILJ;
        dialogC77438UaI.LJLJLLL = this.LJII;
        dialogC77438UaI.LLIILII = this.LJIILL;
        dialogC77438UaI.LLII = this.LJIIIZ;
        dialogC77438UaI.LLIILZL = this.LJIILLIIL;
        dialogC77438UaI.LLIIZ = this.LJJI;
        dialogC77438UaI.LLIL = this.LJJIFFI;
        dialogC77438UaI.LLILII = this.LJJII;
        dialogC77438UaI.LLILZLL = this.LJJIJ;
        dialogC77438UaI.LLILIL = this.LJIJ;
        dialogC77438UaI.LJLLL = this.LJIJI;
        dialogC77438UaI.LLIIJLIL = this.LJJIII;
        dialogC77438UaI.LLILLIZIL = this.LJJIIJ;
        dialogC77438UaI.LLILLJJLI = this.LJJIIJZLJL;
        dialogC77438UaI.setOnKeyListener(this.LJJIIZ);
        dialogC77438UaI.setOnCancelListener(this.LJJIIZI);
        return dialogC77438UaI;
    }

    public C77437UaH(Context context) {
        super(context);
        this.LJJ = 17;
        this.LJJII = true;
        this.LJJIII = true;
        this.LJJIIJ = -1;
        this.LJJIJ = true;
    }

    public final void LIZIZ(int i) {
        this.LJI = this.LIZ.getString(i);
    }

    public final void LJI(int i) {
        this.LIZJ = this.LIZ.getString(i);
    }

    public final void LIZJ(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        LIZLLL(onClickListener, this.LIZ.getString(i), z);
    }

    public final void LIZLLL(DialogInterface.OnClickListener onClickListener, CharSequence charSequence, boolean z) {
        this.LJFF = charSequence;
        this.LJIILJJIL = onClickListener;
        this.LJIJJLI = z;
    }

    public final void LJ(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        LJFF(onClickListener, this.LIZ.getString(i), z);
    }

    public final void LJFF(DialogInterface.OnClickListener onClickListener, CharSequence charSequence, boolean z) {
        this.LJ = charSequence;
        this.LJIILIIL = onClickListener;
        this.LJIJJ = z;
    }
}
