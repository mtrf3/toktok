package X;

import Y.ARunnableS4S0201000_1;
import Y.IDLListenerS189S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4BT, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4BT extends C4BP {
    public static final /* synthetic */ int LL = 0;
    public View LJLJJL;
    public EditText LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public C4C8 LJLLILLLL;
    public boolean LJLLJ;
    public long LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public long LJZI;
    public boolean LJZL;

    public int getSoftKeyboardHeight() {
        return C99583vW.LIZ(0);
    }

    private int getCurrentHeight() {
        return C99583vW.LIZ(this.LJLJLLL);
    }

    public final void LJ() {
        this.LJLIL = this.LJLILLLLZI;
        this.LJLILLLLZI = -1;
        setVisibility(8);
        AnonymousClass435.LIZ(C45804HyK.LJIJJ(getContext()), this.LJLJJLL);
        InterfaceC1032943p interfaceC1032943p = this.LJLJI;
        if (interfaceC1032943p != null) {
            interfaceC1032943p.LJIIL(null, this.LJLIL, -1, false);
        }
    }

    public View getEmojiPanel() {
        return this.LJLJJI.get(1);
    }

    public int getPanelHeight() {
        if (this.LJLILLLLZI == -1) {
            return 0;
        }
        if (this.LJLLI) {
            return getSoftKeyboardHeight();
        }
        return getMeasuredHeight();
    }

    public final void LIZIZ() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int currentHeight = getCurrentHeight();
        if (layoutParams.height == currentHeight) {
            return;
        }
        layoutParams.height = currentHeight;
        setLayoutParams(layoutParams);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(fixInputLayoutHeight): Panel size readjusted to ");
        LIZ.append(currentHeight);
        C34B.LJI("SoftInputResizeFuncLayoutView", X1D.LIZIZ(LIZ));
    }

    public final void LJFF() {
        View findViewById = getRootView().findViewById(R.id.edy);
        if (findViewById == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (this.LJLZ > C39687Fhr.LJIIL(getContext()).LIZJ / 2) {
            layoutParams.height = this.LJLZ;
        } else {
            layoutParams.height = C39687Fhr.LJIIL(getContext()).LIZJ;
        }
        findViewById.setLayoutParams(layoutParams);
    }

    public static void LIZLLL(C4BT c4bt) {
        boolean z;
        if (c4bt.LJLJL || c4bt.LJLLLL) {
            return;
        }
        if (c4bt.LJLJLJ) {
            if (c4bt.getHeight() == c4bt.getCurrentHeight() || c4bt.getHeight() <= 0) {
                return;
            }
            c4bt.LIZIZ();
            return;
        }
        Rect rect = new Rect();
        Activity LJIJJ = C45804HyK.LJIJJ(c4bt.getContext());
        if (LJIJJ == null || c4bt.LIZJ(LJIJJ)) {
            return;
        }
        View view = c4bt.LJLJJL;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            LJIJJ.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int LIZJ = C60996Nwm.LIZJ(LJIJJ);
        int LJ = C61410O8g.LJ(LJIJJ);
        int LJJJJLI = C63081OpJ.LJJJJLI(LJIJJ);
        int i = ((LIZJ - rect.bottom) - LJ) + LJJJJLI;
        int i2 = (LIZJ - LJ) - LJJJJLI;
        float f = i2;
        if (i >= ((int) (f * 0.18d))) {
            z = true;
        } else {
            if (i >= C1DF.LJIIIZ(60)) {
                C78983UzD.LJIIZILJ(new Throwable("soft keyboard's height is less than 18% of the screen's height, but more than 60dp"));
                C34B.LJIIIIZZ("SoftInputResizeFuncLayoutView", "soft keyboard's height is less than 18% of the screen's height, but more than 60dp");
            }
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bottom=");
        LIZ.append(rect.bottom);
        LIZ.append(" top=");
        C15890jp.LIZIZ(LIZ, rect.top, " heightDiff=", i, " maxHeight=");
        LIZ.append(i2);
        LIZ.append(" curShowing=");
        C76965UIn.LIZJ(LIZ, c4bt.LJLLI, " calculatedShowing=", z, " panelType=");
        LIZ.append(c4bt.LJLILLLLZI);
        C34B.LJI("SoftInputResizeFuncLayoutView", X1D.LIZIZ(LIZ));
        float f2 = i;
        SettingsManager.LIZLLL().getClass();
        if (f2 >= SettingsManager.LIZJ("dm_keyboard_max_height_config", 1.0f) * f) {
            SettingsManager.LIZLLL().getClass();
            i = (int) (SettingsManager.LIZJ("dm_keyboard_max_height_config", 1.0f) * f);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("heightDifference too large model=");
            LIZ2.append(Build.MODEL);
            C34B.LJIIIIZZ("SoftInputResizeFuncLayoutView", X1D.LIZIZ(LIZ2));
        }
        if (c4bt.LJLLI == z || SystemClock.elapsedRealtime() - c4bt.LJLLL <= 500) {
            return;
        }
        c4bt.LJLLL = SystemClock.elapsedRealtime();
        StringBuilder LJI = JBR.LJI("Soft keyboard is showing: ", z, ". Store showing status: ");
        LJI.append(c4bt.LJLLI);
        LJI.append(". Current panel type: ");
        LJI.append(c4bt.LJLILLLLZI);
        LJI.append(". rect bottom: ");
        LJI.append(rect.bottom);
        C34B.LJI("SoftInputResizeFuncLayoutView", X1D.LIZIZ(LJI));
        c4bt.LJLLI = z;
        c4bt.getLocationInWindow(new int[2]);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("(softKeyboardChange) Keyboard Show: ");
        LIZ3.append(z);
        LIZ3.append(" Destination Height: ");
        LIZ3.append(i);
        C34B.LJI("SoftInputResizeFuncLayoutView", X1D.LIZIZ(LIZ3));
        if (z) {
            if (i > 0 && C99583vW.LIZ != i) {
                C99583vW.LIZIZ.storeInt("last_keyboard_height", i);
                C99583vW.LIZ = i;
            }
            c4bt.LIZIZ();
            int i3 = c4bt.LJLILLLLZI;
            c4bt.LJLIL = i3;
            c4bt.LJLILLLLZI = -2;
            InterfaceC1032943p interfaceC1032943p = c4bt.LJLJI;
            if (interfaceC1032943p != null) {
                interfaceC1032943p.LJIIL(null, i3, -2, false);
            }
        } else if (c4bt.LJLILLLLZI == -2) {
            c4bt.LJI(-1, false);
        }
        C4C8 c4c8 = c4bt.LJLLILLLL;
        if (c4c8 != null) {
            c4c8.LIZ(z);
        }
        if (c4bt.LJLLLLLL && z) {
            c4bt.LJFF();
        }
        if (c4bt.LJLILLLLZI != 1) {
            return;
        }
        int currentHeight = c4bt.getCurrentHeight();
        if (currentHeight < c4bt.LJLL) {
            c4bt.setInputLayoutHeight(c4bt.LJLJLLL);
        } else {
            c4bt.setInputLayoutHeight(currentHeight);
        }
    }

    public final boolean LIZJ(Activity activity) {
        if (!this.LJLLJ) {
            return false;
        }
        int i = activity.getResources().getConfiguration().orientation;
        if (this.LJZ != i) {
            this.LJZ = i;
            this.LJZI = SystemClock.uptimeMillis();
            this.LJZL = true;
        }
        if (this.LJZL) {
            if (SystemClock.uptimeMillis() - this.LJZI <= 1000) {
                return true;
            }
            this.LJZL = false;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(C49R.LIZ.LIZLLL);
    }

    public void setDefaultPanelHeight(int i) {
        this.LJLJLLL = i;
    }

    public void setEditText(EditText editText) {
        this.LJLJJLL = editText;
    }

    public void setFixKeyboardHeight(boolean z) {
        this.LJLJLJ = z;
    }

    public void setForceHide(boolean z) {
        this.LJLJL = z;
    }

    public void setInputLayoutHeight(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        setLayoutParams(layoutParams);
    }

    public void setNeedBlockResetOnScreenOrientation(boolean z) {
        this.LJLLJ = z;
    }

    public void setOnKeyBordChangedListener(C4C8 c4c8) {
        this.LJLLILLLL = c4c8;
    }

    public void setOuterView(View view) {
        this.LJLJJL = view;
    }

    public C4BT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJZ = -1;
        this.LJLJLJ = false;
        this.LJLJLLL = getResources().getDimensionPixelSize(R.dimen.vf);
        this.LJLL = (int) C32151Nz.LJIIZILJ(200);
        getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS189S0100000_1(this, 3));
    }

    public final void LJI(int i, boolean z) {
        InputMethodManager inputMethodManager;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Switching from ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" to ");
        LIZ.append(i);
        C34B.LJI("SoftInputResizeFuncLayoutView", X1D.LIZIZ(LIZ));
        int i2 = this.LJLILLLLZI;
        if (i2 == i && (i2 != -2 || this.LJLLI)) {
            return;
        }
        Activity LJIJJ = C45804HyK.LJIJJ(getContext());
        if (i == -1) {
            setVisibility(8);
            AnonymousClass435.LIZ(LJIJJ, this.LJLJJLL);
            int i3 = this.LJLILLLLZI;
            this.LJLIL = i3;
            this.LJLILLLLZI = i;
            InterfaceC1032943p interfaceC1032943p = this.LJLJI;
            if (interfaceC1032943p != null) {
                interfaceC1032943p.LJIIL(null, i3, i, z);
                return;
            }
            return;
        }
        if (i == -2) {
            this.LJLJJLL.requestFocus();
            EditText editText = this.LJLJJLL;
            if (editText != null) {
                Context context = editText.getContext();
                o.LJIIIIZZ(context, "view.context");
                Object LLILL = C16880lQ.LLILL(context, "input_method");
                if ((LLILL instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) LLILL) != null && !inputMethodManager.showSoftInput(editText, 0)) {
                    editText.postDelayed(new ARunnableS4S0201000_1(inputMethodManager, editText, 4), 100L);
                }
            }
            this.LJLIL = this.LJLILLLLZI;
            this.LJLILLLLZI = i;
            for (int i4 = 0; i4 < this.LJLJJI.size(); i4++) {
                this.LJLJJI.get(this.LJLJJI.keyAt(i4)).setVisibility(8);
            }
            setVisibility(0);
            InterfaceC1032943p interfaceC1032943p2 = this.LJLJI;
            if (interfaceC1032943p2 == null) {
                return;
            }
            interfaceC1032943p2.LJIIL(null, this.LJLIL, i, z);
            return;
        }
        View view = this.LJLJJI.get(i);
        if (view == null) {
            return;
        }
        setVisibility(0);
        int size = this.LJLJJI.size();
        for (int i5 = 0; i5 < size; i5++) {
            int keyAt = this.LJLJJI.keyAt(i5);
            if (keyAt != i) {
                this.LJLJJI.get(keyAt).setVisibility(8);
            }
        }
        view.setVisibility(0);
        this.LJLIL = this.LJLILLLLZI;
        this.LJLILLLLZI = i;
        AnonymousClass435.LIZ(LJIJJ, this.LJLJJLL);
        InterfaceC1032943p interfaceC1032943p3 = this.LJLJI;
        if (interfaceC1032943p3 == null) {
            return;
        }
        interfaceC1032943p3.LJIIL(view, this.LJLIL, i, z);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), 1073741824));
    }
}
