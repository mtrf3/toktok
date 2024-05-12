package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.toolbar.TBViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.BsY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30158BsY implements InterfaceC30269BuL {
    public final View LIZ;
    public final View LIZIZ;
    public final TBViewModel LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC30237Btp
    public final void LIZIZ() {
        View view = this.LIZ;
        if (view instanceof FrameLayout) {
            ((ViewGroup) view).setClipChildren(false);
        }
    }

    @Override // X.InterfaceC30237Btp
    public final Context getContext() {
        return this.LIZ.getContext();
    }

    @Override // X.InterfaceC30237Btp
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
        o.LJIIIIZZ(layoutParams, "view.layoutParams");
        return layoutParams;
    }

    @Override // X.InterfaceC30237Btp
    public final int getVisibility() {
        C30268BuK value = this.LIZJ.LJLJL.getValue();
        if (value != null && value.LIZ) {
            return 0;
        }
        return 8;
    }

    @Override // X.InterfaceC30237Btp
    public final void la() {
        this.LIZJ.LJLJL.setValue(new C30268BuK(false, true));
    }

    @Override // X.InterfaceC30269BuL
    public final View LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC30237Btp
    public final View LJFF() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC30237Btp
    public final boolean LJI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC30237Btp
    public final View getContentView() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC30237Btp
    public final <T extends View> T LIZ(int i) {
        return (T) this.LIZ.findViewById(i);
    }

    @Override // X.InterfaceC30237Btp
    public final void LIZJ(boolean z) {
        this.LIZ.setClickable(z);
    }

    @Override // X.InterfaceC30237Btp
    public final void LJ(Runnable runnable) {
        this.LIZIZ.post(runnable);
    }

    @Override // X.InterfaceC30237Btp
    public final void LJII(boolean z) {
        this.LIZLLL = z;
    }

    @Override // X.InterfaceC30237Btp
    public final void LJZI(View view) {
        View view2 = this.LIZIZ;
        if (view2 instanceof FrameLayout) {
            ((ViewGroup) view2).addView(view);
        }
    }

    @Override // X.InterfaceC30237Btp
    public final void setAlpha(float f) {
        this.LIZJ.LJLJJLL.setValue(Float.valueOf(f));
    }

    @Override // X.InterfaceC30237Btp
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.LIZIZ.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC30237Btp
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        C16880lQ.LJIIJ(onClickListener, this.LIZ);
    }

    @Override // X.InterfaceC30237Btp
    public final void setVisibility(int i) {
        boolean z;
        MutableLiveData<C30268BuK> mutableLiveData = this.LIZJ.LJLJL;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.setValue(new C30268BuK(z, true));
    }

    public C30158BsY(View view, View view2, EnumC30241Btt button, TBViewModel tBViewModel) {
        o.LJIIIZ(button, "button");
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = tBViewModel;
        this.LIZLLL = true;
    }
}
