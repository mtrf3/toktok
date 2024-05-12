package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.WEf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81949WEf {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public int LJFF;
    public String LJI;
    public String LJII;
    public List<ImageView> LJIIIIZZ;
    public List<String> LJIIIZ;
    public List<String> LJIIJ;
    public List<String> LJIIJJI;
    public C81954WEk LJIIL;
    public C81951WEh LJIILIIL;
    public C70842RrC LJIILJJIL;
    public C62875Olz LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public InterfaceC81959WEp LJIJ;
    public View LJIJI;
    public int LJIJJ;

    public final WER LIZ() {
        if (this.LJIILL == null) {
            this.LJIILL = new C62875Olz();
        }
        return this.LJIILL;
    }

    public final Drawable LIZIZ(Context context) {
        if (this.LIZIZ != 0) {
            return context.getResources().getDrawable(this.LIZIZ);
        }
        return null;
    }
}
