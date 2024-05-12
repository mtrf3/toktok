package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AQy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26224AQy {
    public Drawable LIZ;
    public C2068389v LIZIZ;
    public InterfaceC88472Yns<? super ImageView, C76800UCe> LIZJ;
    public CharSequence LJ;
    public CharSequence LJFF;
    public CharSequence LJII;
    public CharSequence LJIIIIZZ;
    public InterfaceC88472Yns<? super AR4, C76800UCe> LJIIIZ;
    public InterfaceC88472Yns<? super AR4, C76800UCe> LJIIJ;
    public View LJIIJJI;
    public View LJIIL;
    public boolean LJIILL;
    public int LIZLLL = 1;
    public final List<Object> LJI = new ArrayList();
    public boolean LJIILIIL = true;
    public boolean LJIILJJIL = true;

    public final ASL LIZ() {
        this.LJIILJJIL = true;
        TuxIntroFragment tuxIntroFragment = new TuxIntroFragment();
        tuxIntroFragment.LJLIL = this;
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = tuxIntroFragment;
        tuxSheet.LJZI = false;
        asl.LJI(0);
        return asl;
    }

    public final void LIZIZ(CharSequence text) {
        o.LJIIIZ(text, "text");
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJI).addAll(C47261Igj.LJJIJ(text));
    }

    public final void LIZJ(List items) {
        o.LJIIIZ(items, "items");
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJI).addAll(items);
    }

    public final void LIZLLL(AR6... ar6Arr) {
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJI).addAll(ORY.LJJZZIII(ar6Arr));
    }

    public final void LJ(C26220AQu... c26220AQuArr) {
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJI).addAll(ORY.LJJZZIII(c26220AQuArr));
    }
}
