package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RrC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70842RrC extends C0A6 implements InterfaceC70778RqA, JJY, SH9 {
    public final View LJLIL;
    public final List<JJZ> LJLILLLLZI;
    public final InterfaceC70844RrE LJLJI;
    public final int LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public final C70843RrD[] LJLJLJ;
    public boolean LJLJLLL;

    @Override // X.InterfaceC70778RqA
    public final void LJFF(int i) {
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // X.InterfaceC70778RqA
    public final void LIZIZ() {
        ViewGroup viewGroup;
        ViewParent parent = this.LJLIL.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(this.LJLIL, viewGroup);
        }
    }

    public final void LJIILLIIL() {
        if (LJIJ(this.LJLJJLL)) {
            C70843RrD[] c70843RrDArr = this.LJLJLJ;
            int i = this.LJLJJLL;
            C70843RrD c70843RrD = c70843RrDArr[i];
            if (!c70843RrD.LJLILLLLZI && i != this.LJLJL) {
                c70843RrD.LJLILLLLZI = true;
                InterfaceC70844RrE interfaceC70844RrE = this.LJLJI;
                if (interfaceC70844RrE != null) {
                    interfaceC70844RrE.LJFF(i);
                }
            }
        }
        LJIIZILJ(this.LJLJJLL);
    }

    @Override // X.SH9
    public final void LJIIIIZZ(float f) {
        int i = 8;
        if (f > 1.0f) {
            this.LJLIL.setVisibility(8);
            return;
        }
        View view = this.LJLIL;
        if (LJIJ(this.LJLJL)) {
            i = 0;
        }
        view.setVisibility(i);
    }

    @Override // X.JJY
    public final void LJIIJ(int i) {
        this.LJLJLJ[i].LJLIL = true;
    }

    public final void LJIIZILJ(int i) {
        if (i < 0) {
            LJIIZILJ(0);
            return;
        }
        int i2 = this.LJLJJI;
        if (i >= i2) {
            LJIIZILJ(i2 - 1);
        } else {
            this.LJLJL = i;
        }
    }

    public final boolean LJIJ(int i) {
        if (((JJZ) ListProtector.get(this.LJLILLLLZI, i)).LIZ() == EnumC48951JJb.PHOTO && (!this.LJLJLLL || i < this.LJLJJI - 1)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC70778RqA
    public final void onPageSelected(int i) {
        boolean z;
        this.LJLJJLL = i;
        int i2 = 0;
        if (this.LJLJJL) {
            this.LJLJJL = false;
            LJIILLIIL();
            LJIIZILJ(i);
        }
        boolean LJIJ = LJIJ(i);
        if (this.LJLIL.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (LJIJ != z) {
            View view = this.LJLIL;
            if (!LJIJ) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    @Override // X.InterfaceC70778RqA
    public final void setAlpha(float f) {
        this.LJLIL.setAlpha(f);
    }

    @Override // X.InterfaceC70778RqA
    public final void LJI(FrameLayout parent, DialogC70776Rq8 dialog) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(dialog, "dialog");
        View view = this.LJLIL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C7MY.LIZIZ(44), 80);
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        layoutParams.bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(86));
        view.setLayoutParams(layoutParams);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 3, 42), this.LJLIL);
        parent.addView(this.LJLIL);
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            LJIILLIIL();
        }
    }

    public C70842RrC(View contentView, List list, KHI khi) {
        o.LJIIIZ(contentView, "contentView");
        this.LJLIL = contentView;
        this.LJLILLLLZI = list;
        this.LJLJI = khi;
        int size = ((ArrayList) list).size();
        this.LJLJJI = size;
        this.LJLJJL = true;
        this.LJLJL = -1;
        C70843RrD[] c70843RrDArr = new C70843RrD[size];
        for (int i = 0; i < size; i++) {
            c70843RrDArr[i] = new C70843RrD();
        }
        this.LJLJLJ = c70843RrDArr;
    }
}
