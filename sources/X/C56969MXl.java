package X;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MXl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56969MXl extends C56968MXk {
    @Override // X.C56968MXk
    public ViewGroup.LayoutParams getButtonLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
        o.LJIIIIZZ(layoutParams, "mMainBtn.layoutParams");
        return layoutParams;
    }

    @Override // X.C56968MXk, X.InterfaceC56973MXp
    public final int LIZ(TextView textView) {
        o.LJIIIZ(textView, "textView");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.string.gkd));
        arrayList.add(Integer.valueOf(R.string.exk));
        arrayList.add(Integer.valueOf(R.string.gk4));
        arrayList.add(Integer.valueOf(R.string.exm));
        arrayList.add(Integer.valueOf(R.string.gix));
        int LJJIJIIJI = C78983UzD.LJJIJIIJI(textView, arrayList, (int) KL2.LIZJ(getContext(), 80.0f), (int) KL2.LIZJ(getContext(), 120.0f));
        int i = this.LJLJJI;
        if (i <= 0 || LJJIJIIJI < i) {
            return LJJIJIIJI;
        }
        return i;
    }

    public final void LIZJ(int i) {
        C56970MXm c56970MXm = this.LJLIL;
        if (c56970MXm == null) {
            return;
        }
        C023107f.LJII(c56970MXm, i);
        this.LJLIL.setPadding(8, 0, 8, 0);
        this.LJLIL.setFontType("medium");
    }

    @Override // X.C56968MXk
    public void setButtonLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o.LJIIIZ(layoutParams, "layoutParams");
        this.LJLJJI = layoutParams.width;
        C56970MXm mMainBtn = this.LJLIL;
        o.LJIIIIZZ(mMainBtn, "mMainBtn");
        C56971MXn.LIZ(C56969MXl.class, new C56972MXo(LIZ(mMainBtn)));
        this.LJLIL.setLayoutParams(layoutParams);
    }

    @Override // X.C56968MXk
    public void setFollowButtonTextAndIcon(int i) {
        if (i == 1) {
            this.LJLIL.setText(getResources().getText(R.string.gix));
            Paint paint = new Paint();
            paint.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
            if (paint.measureText(getContext().getString(R.string.gix)) >= 110.0f) {
                LIZJ(R.style.a7t);
                return;
            }
            return;
        }
        super.setFollowButtonTextAndIcon(i);
        LIZJ(R.style.a7w);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56969MXl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
    }

    @Override // X.C56968MXk, X.InterfaceC51700KQu
    public final void LJJI(int i, int i2) {
        LIZJ(R.style.a7w);
        LJI(i, i2, null);
    }
}
