package X;

import android.content.Context;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;

/* renamed from: X.ZjZ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90753ZjZ extends AbstractC90446Zec {
    public final ImageView LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Context LJ;
    public C90749ZjV LJFF;

    @Override // X.AbstractC90446Zec
    public final void LIZJ() {
        this.LIZIZ.setEnabled(false);
    }

    @Override // X.AbstractC90446Zec
    public final void LJ() {
        C90749ZjV c90749ZjV;
        this.LIZIZ.setEnabled(false);
        C90613ZhJ LIZJ = ZYJ.LIZIZ(this.LJ).LIZ().LIZJ();
        if (LIZJ != null && (c90749ZjV = this.LJFF) != null) {
            QH7.LJ("Must be called from the main thread.");
            ((HashSet) LIZJ.LIZLLL).remove(c90749ZjV);
        }
        this.LIZ = null;
    }

    public final void LJFF() {
        String str;
        C90613ZhJ LIZJ = ZYJ.LIZIZ(this.LJ).LIZ().LIZJ();
        boolean z = false;
        if (LIZJ != null && LIZJ.LIZJ()) {
            C90639Zhj c90639Zhj = this.LIZ;
            if (c90639Zhj == null || !c90639Zhj.LJIIIZ()) {
                this.LIZIZ.setEnabled(false);
            } else {
                this.LIZIZ.setEnabled(true);
            }
            QH7.LJ("Must be called from the main thread.");
            C90880Zlc c90880Zlc = LIZJ.LJII;
            if (c90880Zlc != null) {
                c90880Zlc.LJII();
                if (c90880Zlc.LJIL) {
                    z = true;
                }
            }
            this.LIZIZ.setSelected(z);
            ImageView imageView = this.LIZIZ;
            if (z) {
                str = this.LIZLLL;
            } else {
                str = this.LIZJ;
            }
            imageView.setContentDescription(str);
            return;
        }
        this.LIZIZ.setEnabled(false);
    }

    @Override // X.AbstractC90446Zec
    public final void LIZIZ() {
        LJFF();
    }

    @Override // X.AbstractC90446Zec
    public final void LIZLLL(C90613ZhJ c90613ZhJ) {
        if (this.LJFF == null) {
            this.LJFF = new C90749ZjV(this);
        }
        super.LIZLLL(c90613ZhJ);
        C90749ZjV c90749ZjV = this.LJFF;
        c90613ZhJ.getClass();
        QH7.LJ("Must be called from the main thread.");
        if (c90749ZjV != null) {
            ((HashSet) c90613ZhJ.LIZLLL).add(c90749ZjV);
        }
        LJFF();
    }

    public C90753ZjZ(Context context, ImageView imageView) {
        this.LIZIZ = imageView;
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LJ = LLLLL;
        this.LIZJ = LLLLL.getString(R.string.x);
        this.LIZLLL = LLLLL.getString(R.string.ai);
        imageView.setEnabled(false);
        this.LJFF = null;
    }
}
