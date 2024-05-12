package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GsJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42883GsJ extends FrameLayout implements InterfaceC42882GsI {
    public View LJLIL;
    public FrameLayout LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;

    public final void LIZIZ() {
        if (!this.LJLJJL) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LJLILLLLZI.getLayoutParams();
        int i = layoutParams.height;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int LIZLLL = (((C81184Vtc.LIZLLL(getContext()) - this.LJLJJLL) - iArr[1]) / 2) - (i / 2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = LIZLLL;
        this.LJLILLLLZI.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC42882GsI
    public final void LIZ(int i) {
        if (this.LJLJI != i) {
            this.LJLJI = i;
        }
    }

    public void setLoadingLayoutUsage(int i) {
        this.LJLJJI = i;
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LJLIL.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.LJLIL.setLayoutParams(layoutParams);
        }
    }

    public void setUseScreenHeight(int i) {
        this.LJLJJL = true;
        this.LJLJJLL = i;
        LIZIZ();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        GGO ggo;
        super.setVisibility(i);
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        view.setVisibility(i);
        int i2 = this.LJLJJI;
        if (i2 == -1) {
            return;
        }
        if (i == 0) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(i2, ggo, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_GONE, null);
    }

    public C42883GsJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C60903NvH.LJIIJJI().getUiService().getClass();
        this.LJLJI = 0;
        this.LJLJJI = -1;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cro, this, true);
        this.LJLIL = LLLLIILL.findViewById(R.id.cfh);
        this.LJLILLLLZI = (FrameLayout) LLLLIILL.findViewById(R.id.iaa);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZIZ();
    }
}
