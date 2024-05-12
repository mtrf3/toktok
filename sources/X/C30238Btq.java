package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Btq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30238Btq implements InterfaceC30237Btp {
    public final View LIZ;
    public final View LIZIZ;
    public final EnumC30204BtI LIZJ;
    public final DataChannel LIZLLL;
    public boolean LJ = true;

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
        return this.LIZIZ.getLayoutParams();
    }

    @Override // X.InterfaceC30237Btp
    public final void la() {
        C29306Beo.LJI(this.LIZ);
    }

    @Override // X.InterfaceC30237Btp
    public final int getVisibility() {
        if (ToolBarRefactor.enable()) {
            C30256Bu8 c30256Bu8 = EnumC30241Btt.Companion;
            EnumC30204BtI enumC30204BtI = this.LIZJ;
            c30256Bu8.getClass();
            if (C30256Bu8.LIZIZ(enumC30204BtI)) {
                C30268BuK value = C30256Bu8.LIZ(this.LIZJ).getViewModel(this.LIZLLL).LJLJL.getValue();
                if (value != null && value.LIZ) {
                    return 0;
                }
                return 8;
            }
        }
        return this.LIZ.getVisibility();
    }

    @Override // X.InterfaceC30237Btp
    public final View LJFF() {
        return this.LIZ;
    }

    @Override // X.InterfaceC30237Btp
    public final boolean LJI() {
        return this.LJ;
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
        View view = this.LIZIZ;
        if (view != null) {
            view.post(runnable);
        }
    }

    @Override // X.InterfaceC30237Btp
    public final void LJII(boolean z) {
        this.LJ = z;
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
        this.LIZ.setAlpha(f);
    }

    @Override // X.InterfaceC30237Btp
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((this.LIZIZ.getParent() instanceof FrameLayout) && !(layoutParams instanceof FrameLayout.LayoutParams)) {
            return;
        }
        this.LIZIZ.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC30237Btp
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        C16880lQ.LJIIJ(onClickListener, this.LIZ);
    }

    @Override // X.InterfaceC30237Btp
    public final void setVisibility(int i) {
        boolean z;
        if (ToolBarRefactor.enable()) {
            C30256Bu8 c30256Bu8 = EnumC30241Btt.Companion;
            EnumC30204BtI enumC30204BtI = this.LIZJ;
            c30256Bu8.getClass();
            if (C30256Bu8.LIZIZ(enumC30204BtI)) {
                TBViewModel viewModel = C30256Bu8.LIZ(this.LIZJ).getViewModel(this.LIZLLL);
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                viewModel.hv0(z, true);
                return;
            }
        }
        this.LIZ.setVisibility(i);
    }

    public C30238Btq(View view, View view2, EnumC30204BtI enumC30204BtI, DataChannel dataChannel) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = enumC30204BtI;
        this.LIZLLL = dataChannel;
    }
}
