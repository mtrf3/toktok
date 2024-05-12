package X;

import X.AbstractC31467CWp;
import android.graphics.Bitmap;
import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.AqS168S0200000_5;

/* loaded from: classes6.dex */
public abstract class CXA<T extends AbstractC31467CWp> extends AbstractC31476CWy<T> {
    public final ImageModel LIZLLL;
    public W4W<C81392Vwy<W5A>> LJ;
    public boolean LJFF;
    public Bitmap LJI;

    @Override // X.AbstractC31476CWy
    public final void LJ() {
        this.LJFF = false;
        W4W<C81392Vwy<W5A>> w4w = this.LJ;
        if (w4w != null) {
            w4w.close();
        }
    }

    @Override // X.AbstractC31476CWy
    public final void LJFF() {
        if (this.LJI == null && !this.LJFF) {
            this.LJFF = true;
            W4W<C81392Vwy<W5A>> w4w = this.LJ;
            if (w4w != null) {
                w4w.close();
            }
            W4W<C81392Vwy<W5A>> w4w2 = null;
            W5O[] LIZLLL = C15620jO.LIZLLL(this.LIZLLL, null, null);
            if (LIZLLL != null && LIZLLL.length != 0) {
                w4w2 = W8E.LJII().LJI().LJ(LIZLLL[0], null);
            }
            this.LJ = w4w2;
            if (w4w2 != null) {
                ((AbstractC48384Iyq) w4w2).LJ(new CXB(this), C79561VKj.LJLIL);
            }
        }
    }

    public CXA(Handler handler, ImageModel imageModel, AqS168S0200000_5 aqS168S0200000_5) {
        super(handler, aqS168S0200000_5);
        this.LIZLLL = imageModel;
    }
}
