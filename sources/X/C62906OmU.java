package X;

import Y.ACListenerS21S0301000_10;
import Y.IDCListenerS52S0200000_10;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.app.AlertController;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OmU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62906OmU extends AbstractDialogInterfaceC26236ARk<C62905OmT> {
    public final DialogInterfaceC39771hF LJLJLJ;

    @Override // X.AbstractDialogInterfaceC26236ARk
    public final Dialog LIZJ() {
        return this.LJLJLJ;
    }

    public C62906OmU(C62905OmT c62905OmT) {
        super(c62905OmT);
        int i;
        T5R t5r;
        T5R t5r2;
        Integer LJ = C79045V0n.LJ(R.attr.kn, c62905OmT.LIZ);
        Context context = c62905OmT.LIZ;
        if (LJ != null) {
            i = LJ.intValue();
        } else {
            i = 0;
        }
        AnonymousClass025 anonymousClass025 = new AnonymousClass025(context, i);
        C62907OmV c62907OmV = c62905OmT.LJIIIIZZ;
        C62907OmV c62907OmV2 = c62905OmT.LJIIIZ;
        C62907OmV c62907OmV3 = c62905OmT.LJIIJ;
        CharSequence charSequence = c62905OmT.LIZIZ;
        if (charSequence != null) {
            t5r = new T5R(charSequence);
            t5r.LIZ(this.LJLIL.LIZ);
        } else {
            t5r = null;
        }
        CharSequence charSequence2 = c62905OmT.LIZJ;
        if (charSequence2 != null) {
            t5r2 = new T5R(charSequence2);
            t5r2.LIZ(this.LJLIL.LIZIZ);
        } else {
            t5r2 = null;
        }
        C008901t c008901t = anonymousClass025.LIZ;
        c008901t.LIZLLL = t5r;
        c008901t.LJFF = t5r2;
        c008901t.LJIIL = c62905OmT.LJII;
        if (c62907OmV != null) {
            T5R t5r3 = new T5R(c62907OmV.LIZ);
            t5r3.LIZ(this.LJLIL.LJ);
            IDCListenerS52S0200000_10 iDCListenerS52S0200000_10 = new IDCListenerS52S0200000_10(c62907OmV, this, 0);
            C008901t c008901t2 = anonymousClass025.LIZ;
            c008901t2.LJI = t5r3;
            c008901t2.LJII = iDCListenerS52S0200000_10;
        }
        if (c62907OmV2 != null) {
            T5R t5r4 = new T5R(c62907OmV2.LIZ);
            t5r4.LIZ(this.LJLIL.LJ);
            IDCListenerS52S0200000_10 iDCListenerS52S0200000_102 = new IDCListenerS52S0200000_10(c62907OmV2, this, 1);
            C008901t c008901t3 = anonymousClass025.LIZ;
            c008901t3.LJIIIIZZ = t5r4;
            c008901t3.LJIIIZ = iDCListenerS52S0200000_102;
        }
        if (c62907OmV3 != null) {
            new T5R(c62907OmV3.LIZ).LIZ(this.LJLIL.LJ);
            CharSequence charSequence3 = c62907OmV3.LIZ;
            IDCListenerS52S0200000_10 iDCListenerS52S0200000_103 = new IDCListenerS52S0200000_10(c62907OmV3, this, 2);
            C008901t c008901t4 = anonymousClass025.LIZ;
            c008901t4.LJIIJ = charSequence3;
            c008901t4.LJIIJJI = iDCListenerS52S0200000_103;
        }
        DialogInterfaceC39771hF LIZ = anonymousClass025.LIZ();
        this.LJLJLJ = LIZ;
        if (LJ == null || LJ.intValue() != 0) {
            TypedArray obtainStyledAttributes = c62905OmT.LIZ.obtainStyledAttributes(null, new int[]{R.attr.rd}, R.attr.kn, 0);
            o.LJIIIIZZ(obtainStyledAttributes, "builder.context.obtainSt…logStyle, 0\n            )");
            int color = obtainStyledAttributes.getColor(0, -1);
            Window window = LIZ.getWindow();
            if (window != null) {
                C28289B8j.LIZIZ(color, window);
            }
            obtainStyledAttributes.recycle();
        }
        LIZ();
        LIZ.setOnShowListener(new DialogInterfaceOnShowListenerC62735Ojj(this, c62907OmV, c62907OmV2, c62907OmV3));
    }

    public final void LJFF(int i, C62907OmV c62907OmV) {
        Button button;
        DialogInterfaceC39771hF dialogInterfaceC39771hF = this.LJLJLJ;
        o.LJII(dialogInterfaceC39771hF, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        AlertController alertController = dialogInterfaceC39771hF.LJLJI;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    alertController.getClass();
                    return;
                }
                button = alertController.LJIIJ;
            } else {
                button = alertController.LJIILJJIL;
            }
        } else {
            button = alertController.LJIJ;
        }
        if (button == null || c62907OmV == null) {
            return;
        }
        C16880lQ.LJIILIIL(button, new ACListenerS21S0301000_10(c62907OmV, dialogInterfaceC39771hF, i, this, 1));
    }
}
