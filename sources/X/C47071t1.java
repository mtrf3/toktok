package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import java.util.ArrayList;

/* renamed from: X.1t1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C47071t1 extends C40971jB<C47071t1> {
    public CharSequence LIZJ;
    public View LIZLLL;
    public CharSequence LJ;
    public C0NG LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public float LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public DialogInterface.OnShowListener LJIILLIIL;
    public DialogInterface.OnDismissListener LJIIZILJ;
    public DialogInterface.OnCancelListener LJIJ;
    public C15M LJIJI;
    public AnonymousClass176 LJIJJ;
    public C006800y LJIJJLI;
    public C39481gm LJIL;
    public C39501go LJJ;
    public C279617w LJJI;
    public C279817y LJJIFFI;
    public C0K6 LJJII;

    public final void LIZIZ() {
        this.LJFF = null;
        this.LJI = false;
        this.LJII = -2;
        this.LJIIIIZZ = -2;
    }

    public final LiveDialog LIZ() {
        return new LiveDialog(this.LIZ, this);
    }

    public C47071t1(Context context) {
        super(context);
        this.LJII = -2;
        this.LJIIIIZZ = -2;
        this.LJIILJJIL = true;
        this.LJIILL = true;
    }

    public final void LIZJ(AnonymousClass176 anonymousClass176) {
        this.LJIJJ = anonymousClass176;
        this.LJIJJLI = null;
    }

    public final void LIZLLL(C28998BZq c28998BZq) {
        LIZIZ();
        c28998BZq.LIZJ = 3;
        this.LJFF = c28998BZq;
        this.LJIIJJI = 2.3f;
        this.LJIIL = true;
    }

    public final void LJ(int i) {
        this.LJI = C0TT.LIZ.LIZIZ(i, false);
        Drawable LIZ = C0TU.LIZ(i, this.LIZ);
        if (this.LJFF == null && LIZ == null) {
            return;
        }
        LIZIZ();
        this.LJFF = new C0NG(LIZ, 1);
    }

    public final void LJFF(int i) {
        LJII(this.LIZ.getResources().getString(i));
    }

    public final void LJI(View view) {
        if (this.LIZLLL != null || view != null) {
            this.LIZLLL = view;
            this.LJ = "";
        }
    }

    public final void LJII(CharSequence charSequence) {
        if (!TextUtils.isEmpty(this.LJ) || !TextUtils.isEmpty(charSequence)) {
            this.LJ = charSequence;
            this.LIZLLL = null;
        }
    }

    public final void LJIIIIZZ(int i) {
        LJIIIZ(i, new T28());
    }

    public final void LJIIJJI(int i) {
        LJIIL(i, new T28());
    }

    public final void LJIILLIIL(int i) {
        this.LIZJ = this.LIZ.getResources().getString(i);
    }

    public final void LJIIIZ(int i, C0K7 c0k7) {
        LJIIJ(this.LIZ.getResources().getString(i), c0k7);
    }

    public final void LJIIJ(CharSequence charSequence, C0K7 c0k7) {
        C39491gn c39491gn = new C39491gn();
        c39491gn.LIZ = charSequence;
        c39491gn.LIZJ = c0k7;
        this.LJJ = new C39501go(c39491gn);
        AnonymousClass175 anonymousClass175 = new AnonymousClass175();
        anonymousClass175.LIZ(this.LJIL);
        anonymousClass175.LIZ(this.LJJ);
        LIZJ(new AnonymousClass176(anonymousClass175));
    }

    public final void LJIIL(int i, C0K7 c0k7) {
        LJIILIIL(this.LIZ.getResources().getString(i), c0k7);
    }

    public final void LJIILIIL(CharSequence charSequence, C0K7 c0k7) {
        C39471gl c39471gl = new C39471gl();
        c39471gl.LIZ = charSequence;
        c39471gl.LIZJ = c0k7;
        this.LJIL = new C39481gm(c39471gl);
        AnonymousClass175 anonymousClass175 = new AnonymousClass175();
        anonymousClass175.LIZ(this.LJIL);
        anonymousClass175.LIZ(this.LJJ);
        LIZJ(new AnonymousClass176(anonymousClass175));
    }

    public final void LJIILJJIL(CharSequence charSequence, C0K7 c0k7) {
        C279517v c279517v = new C279517v();
        c279517v.LIZ = charSequence;
        c279517v.LIZJ = c0k7;
        this.LJJI = new C279617w(c279517v);
        C006700x c006700x = new C006700x();
        C279617w c279617w = this.LJJI;
        if (c279617w != null) {
            ((ArrayList) c006700x.LIZ).add(c279617w);
        }
        C279817y c279817y = this.LJJIFFI;
        if (c279817y != null) {
            ((ArrayList) c006700x.LIZ).add(c279817y);
        }
        this.LJIJJLI = new C006800y(c006700x);
        this.LJIJJ = null;
    }

    public final void LJIILL(CharSequence charSequence, C0K7 c0k7) {
        C279717x c279717x = new C279717x();
        c279717x.LIZ = charSequence;
        c279717x.LIZJ = c0k7;
        this.LJJIFFI = new C279817y(c279717x);
        C006700x c006700x = new C006700x();
        C279617w c279617w = this.LJJI;
        if (c279617w != null) {
            ((ArrayList) c006700x.LIZ).add(c279617w);
        }
        C279817y c279817y = this.LJJIFFI;
        if (c279817y != null) {
            ((ArrayList) c006700x.LIZ).add(c279817y);
        }
        this.LJIJJLI = new C006800y(c006700x);
        this.LJIJJ = null;
    }
}
