package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MXi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56966MXi extends C56968MXk {
    public static final int LJLLI = (int) KL2.LIZJ(EF7.LIZIZ(), 12.0f);
    public static final int LJLLILLLL = (int) KL2.LIZJ(EF7.LIZIZ(), 4.0f);
    public final boolean LJLL;

    public final void LIZJ() {
        C56970MXm c56970MXm = this.LJLIL;
        if (c56970MXm == null) {
            return;
        }
        int i = LJLLI;
        c56970MXm.setPadding(i, 0, i, 0);
        C51736KSe.LIZ(this.LJLIL, 10, 14, C56812MRk.LIZIZ(getContext()));
        this.LJLIL.setFontType("medium");
    }

    @Override // X.C56968MXk, X.InterfaceC56973MXp
    public final int LIZ(TextView textView) {
        return C56812MRk.LIZIZ(textView.getContext());
    }

    @Override // X.C56968MXk
    public void setDoubleFollowButtonText(String str) {
        String string;
        if ((!C78966Uyw.LJJIJ().LIZIZ()) && this.LJLL) {
            if (str == null || C38350F3i.LJJIZ(str) == null) {
                string = getResources().getString(R.string.i3_);
            } else {
                string = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService().LJIIIIZZ(getContext(), (getButtonLayoutParams().width - getPaddingLeft()) - getPaddingRight(), true, str);
            }
            this.LJLIL.setText(string);
            return;
        }
        this.LJLIL.setText(getResources().getText(R.string.exk));
    }

    @Override // X.C56968MXk
    public void setFollowButtonTextAndIcon(int i) {
        if (i == 1) {
            if (getResources() == null) {
                return;
            } else {
                this.LJLIL.setText(getResources().getText(R.string.gix));
            }
        } else {
            super.setFollowButtonTextAndIcon(i);
        }
        LIZJ();
    }

    public C56966MXi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.abc});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        this.LJLL = z;
        obtainStyledAttributes.recycle();
        if (!z) {
            this.LJLL = true;
        }
    }

    @Override // X.C56968MXk, X.InterfaceC51700KQu
    public final void LJJI(int i, int i2) {
        LJI(i, i2, null);
    }

    @Override // X.C56968MXk, X.InterfaceC51700KQu
    public final void LJI(int i, int i2, String str) {
        super.LJI(i, i2, str);
        LIZJ();
        int i3 = LJLLILLLL;
        post(new C9AF(this, i3, i3));
    }
}
