package X;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223328pc extends FrameLayout implements InterfaceC80914VpG {
    public boolean LJLIL;
    public final C223338pd LJLILLLLZI;
    public int LJLJI;
    public final C62822Ol8 LJLJJI;

    private final C61995OUt getVibrationHelper() {
        return (C61995OUt) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC80914VpG
    public int getActualHeight() {
        return C7MY.LIZIZ(44);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C223328pc(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        C223338pd c223338pd = new C223338pd(context, null, 6);
        this.LJLILLLLZI = c223338pd;
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(context, 1592));
        addView(c223338pd, new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(36)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(36)), 17));
    }

    @Override // X.InterfaceC80914VpG
    public final void LIZ(boolean z) {
        this.LJLIL = z;
        if (z) {
            this.LJLILLLLZI.LIZIZ();
        } else {
            this.LJLILLLLZI.LIZJ();
        }
    }

    @Override // X.InterfaceC80914VpG
    public final void LJJJJJL(boolean z) {
        if (z) {
            setVisibility(4);
            this.LJLILLLLZI.LIZJ();
        } else {
            setVisibility(0);
            if (this.LJLIL) {
                this.LJLILLLLZI.LIZIZ();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.LJLILLLLZI.setVisibility(i);
    }

    @Override // X.InterfaceC80914VpG
    public final void LIZIZ(int i, boolean z) {
        boolean z2;
        if (!this.LJLIL) {
            float LJIIZILJ = i / C32151Nz.LJIIZILJ(44);
            int i2 = (int) LJIIZILJ;
            C223338pd c223338pd = this.LJLILLLLZI;
            float abs = Math.abs(LJIIZILJ - i2);
            if ((i2 & 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c223338pd.LJLJL) {
                c223338pd.LIZ();
            }
            c223338pd.LJLJJL = abs;
            c223338pd.LJLJLJ = false;
            c223338pd.LJLJJLL = false;
            c223338pd.LJLLLL = z2;
            c223338pd.postInvalidate();
            int min = Math.min(i, this.LJLJI);
            int max = Math.max(i, this.LJLJI);
            int i3 = -C7MY.LIZIZ(44);
            if (min <= i3 && i3 <= max && !z) {
                if (Build.VERSION.SDK_INT >= 29) {
                    getVibrationHelper().LIZ();
                } else {
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    new C61995OUt(context).LIZIZ(85, 61);
                }
            }
        }
        this.LJLJI = i;
    }
}
