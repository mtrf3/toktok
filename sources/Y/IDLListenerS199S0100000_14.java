package Y;

import X.C41997Ge1;
import X.C5NP;
import X.C64493PSv;
import X.C72418SbW;
import X.C78996UzQ;
import X.C80289VfB;
import X.C80290VfC;
import X.C80716Vm4;
import X.C83383Wnz;
import X.C83547Wqd;
import X.InterfaceC83388Wo4;
import X.InterfaceC83564Wqu;
import X.KL2;
import X.VOO;
import X.VPF;
import X.VSG;
import X.ViewOnClickListenerC81018Vqw;
import X.WOB;
import X.X1D;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDLListenerS199S0100000_14 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            case 6:
                onGlobalLayout$6(this);
                return;
            case 7:
                onGlobalLayout$7(this);
                return;
            case 8:
                onGlobalLayout$8(this);
                return;
            case 9:
                onGlobalLayout$9(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS199S0100000_14 iDLListenerS199S0100000_14) {
        ((C80716Vm4) iDLListenerS199S0100000_14.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS199S0100000_14);
        C80716Vm4 c80716Vm4 = (C80716Vm4) iDLListenerS199S0100000_14.l0;
        c80716Vm4.LJLJLJ = c80716Vm4.LJLJJLL.getCurrentItem();
        C80716Vm4 c80716Vm42 = (C80716Vm4) iDLListenerS199S0100000_14.l0;
        c80716Vm42.LIZLLL(c80716Vm42.LJLJLJ, true);
        C80716Vm4 c80716Vm43 = (C80716Vm4) iDLListenerS199S0100000_14.l0;
        c80716Vm43.LIZIZ(c80716Vm43.LJLJLJ, 0);
    }

    public static final void onGlobalLayout$1(IDLListenerS199S0100000_14 iDLListenerS199S0100000_14) {
        ViewGroup viewGroup = ((WOB) iDLListenerS199S0100000_14.l0).LJLLJ;
        if (viewGroup != null) {
            int measuredWidth = viewGroup.getMeasuredWidth();
            TextView textView = ((WOB) iDLListenerS199S0100000_14.l0).LJLLL;
            if (textView != null) {
                int measuredWidth2 = textView.getMeasuredWidth();
                LinearLayout linearLayout = ((WOB) iDLListenerS199S0100000_14.l0).LJLLLL;
                if (linearLayout != null) {
                    if (measuredWidth < linearLayout.getMeasuredWidth() + measuredWidth2) {
                        int[] iArr = new int[2];
                        TextView textView2 = ((WOB) iDLListenerS199S0100000_14.l0).LJLLL;
                        if (textView2 != null) {
                            textView2.getLocationOnScreen(iArr);
                            int i = iArr[0];
                            int[] iArr2 = new int[2];
                            LinearLayout linearLayout2 = ((WOB) iDLListenerS199S0100000_14.l0).LJLLLL;
                            if (linearLayout2 != null) {
                                linearLayout2.getLocationOnScreen(iArr2);
                                float LIZJ = (iArr2[0] - i) - KL2.LIZJ(((WOB) iDLListenerS199S0100000_14.l0).mActivity, 16.0f);
                                TextView textView3 = ((WOB) iDLListenerS199S0100000_14.l0).LJLLL;
                                if (textView3 != null) {
                                    ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                                    layoutParams.width = (int) LIZJ;
                                    TextView textView4 = ((WOB) iDLListenerS199S0100000_14.l0).LJLLL;
                                    if (textView4 != null) {
                                        textView4.setLayoutParams(layoutParams);
                                    } else {
                                        o.LJIJI("countDownTitleTextView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("countDownTitleTextView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("countDownSwitchView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("countDownTitleTextView");
                            throw null;
                        }
                    }
                    ViewGroup viewGroup2 = ((WOB) iDLListenerS199S0100000_14.l0).LJLLJ;
                    if (viewGroup2 != null) {
                        viewGroup2.getViewTreeObserver().removeGlobalOnLayoutListener(iDLListenerS199S0100000_14);
                        return;
                    } else {
                        o.LJIJI("countDownTitleView");
                        throw null;
                    }
                }
                o.LJIJI("countDownSwitchView");
                throw null;
            }
            o.LJIJI("countDownTitleTextView");
            throw null;
        }
        o.LJIJI("countDownTitleView");
        throw null;
    }

    public static final void onGlobalLayout$2(IDLListenerS199S0100000_14 iDLListenerS199S0100000_14) {
        boolean z;
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        ((VSG) iDLListenerS199S0100000_14.l0).LJFF();
        boolean z2 = true;
        if (((VSG) iDLListenerS199S0100000_14.l0).LIZ()) {
            VSG vsg = (VSG) iDLListenerS199S0100000_14.l0;
            Rect rect = vsg.LJI;
            int i = rect.bottom - rect.top;
            int i2 = vsg.LJII;
            if (i / i2 < 0.8d) {
                z = true;
            } else {
                z = false;
            }
            int i3 = i2 - i;
            if (vsg.LJIIL != i3) {
                vsg.LJIJ = true;
                vsg.LJIIL = i3;
            } else {
                vsg.LJIJ = false;
            }
            if (vsg.LJIJ || vsg.LJIILJJIL || vsg.LJIILL) {
                if (z) {
                    C41997Ge1 c41997Ge1 = vsg.LJ;
                    if (c41997Ge1 != null && c41997Ge1.isFocused()) {
                        VSG vsg2 = (VSG) iDLListenerS199S0100000_14.l0;
                        LynxBaseUI parentBaseUI = vsg2.LJIJJLI.getParentBaseUI();
                        while (true) {
                            if (parentBaseUI == null) {
                                break;
                            }
                            if (parentBaseUI instanceof AbsLynxUIScroll) {
                                T t = ((LynxUI) parentBaseUI).mView;
                                o.LJFF(t, "parentUI.view");
                                i -= t.getTop();
                                break;
                            }
                            parentBaseUI = parentBaseUI.getParentBaseUI();
                        }
                        vsg2.LJIILIIL = i;
                        ((VSG) iDLListenerS199S0100000_14.l0).LJ();
                    }
                } else if (vsg.LJIIIZ) {
                    Activity LJIIJJI = C78996UzQ.LJIIJJI(vsg.LIZIZ);
                    LynxBaseUI parentBaseUI2 = vsg.LJIJJLI.getParentBaseUI();
                    while (true) {
                        if (parentBaseUI2 == null) {
                            break;
                        }
                        if (parentBaseUI2 instanceof AbsLynxUIScroll) {
                            LynxUI lynxUI = (LynxUI) parentBaseUI2;
                            View childAt = ((ViewGroup) lynxUI.mView).getChildAt(0);
                            o.LJFF(childAt, "parentUI.view.getChildAt(0)");
                            if (childAt.getPaddingBottom() != 0) {
                                ((ViewGroup) lynxUI.mView).getChildAt(0).setPadding(0, 0, 0, 0);
                                vsg.LJIILLIIL = false;
                                while (vsg.LJIJJ > 0) {
                                    if (LJIIJJI != null && (window = LJIIJJI.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
                                        viewTreeObserver.removeOnGlobalLayoutListener(vsg.LIZLLL);
                                    }
                                    vsg.LJIJJ--;
                                }
                            }
                        } else {
                            parentBaseUI2 = parentBaseUI2.getParentBaseUI();
                        }
                    }
                }
            }
        }
        LynxBaseInputView lynxBaseInputView = ((VSG) iDLListenerS199S0100000_14.l0).LJIJJLI;
        Rect rect2 = lynxBaseInputView.LLIIIL.LJI;
        if ((rect2.bottom - rect2.top) / r1.LJII >= 0.8d) {
            z2 = false;
        }
        if (lynxBaseInputView.LLIIII && !z2) {
            C41997Ge1 c41997Ge12 = lynxBaseInputView.LJLIL;
            if (c41997Ge12 != null) {
                c41997Ge12.clearFocus();
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
    }

    public static final void onGlobalLayout$3(IDLListenerS199S0100000_14 iDLListenerS199S0100000_14) {
        ((VSG) iDLListenerS199S0100000_14.l0).LJ();
    }

    public static final void onGlobalLayout$4(IDLListenerS199S0100000_14 iDLListenerS199S0100000_14) {
        ((ViewOnClickListenerC81018Vqw) iDLListenerS199S0100000_14.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS199S0100000_14);
        ViewOnClickListenerC81018Vqw viewOnClickListenerC81018Vqw = (ViewOnClickListenerC81018Vqw) iDLListenerS199S0100000_14.l0;
        viewOnClickListenerC81018Vqw.LJZ = viewOnClickListenerC81018Vqw.getMeasuredWidth();
        ViewOnClickListenerC81018Vqw viewOnClickListenerC81018Vqw2 = (ViewOnClickListenerC81018Vqw) iDLListenerS199S0100000_14.l0;
        viewOnClickListenerC81018Vqw2.LJZI = viewOnClickListenerC81018Vqw2.LJLJLJ.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = ((ViewOnClickListenerC81018Vqw) iDLListenerS199S0100000_14.l0).LJLJLLL.getLayoutParams();
        ViewOnClickListenerC81018Vqw viewOnClickListenerC81018Vqw3 = (ViewOnClickListenerC81018Vqw) iDLListenerS199S0100000_14.l0;
        layoutParams.width = viewOnClickListenerC81018Vqw3.LJZ - viewOnClickListenerC81018Vqw3.LJLLL;
        viewOnClickListenerC81018Vqw3.LJLJLLL.setLayoutParams(layoutParams);
    }

    public static final void onGlobalLayout$5(IDLListenerS199S0100000_14 iDLListenerS199S0100000_14) {
        LLog.LIZLLL(1, "Lynx", "onGlobalLayout invoked.");
        VPF vpf = (VPF) iDLListenerS199S0100000_14.l0;
        vpf.getClass();
        C64493PSv.LIZ().execute(new ARunnableS50S0100000_14(vpf, 195));
    }

    public static final void onGlobalLayout$6(IDLListenerS199S0100000_14 iDLListenerS199S0100000_14) {
        ((VOO) iDLListenerS199S0100000_14.l0).LJI = true;
    }

    public static final void onGlobalLayout$7(IDLListenerS199S0100000_14 iDLListenerS199S0100000_14) {
        Rect rect = new Rect();
        View view = ((C83547Wqd) iDLListenerS199S0100000_14.l0).LIZ;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int height = rect.height();
        C83547Wqd c83547Wqd = (C83547Wqd) iDLListenerS199S0100000_14.l0;
        C5NP c5np = c83547Wqd.LJFF;
        if (c5np != null && c83547Wqd.LIZIZ != height) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("softKeyBoard old Height:");
            LIZ.append(((C83547Wqd) iDLListenerS199S0100000_14.l0).LIZIZ);
            LIZ.append(", new Height:");
            LIZ.append(height);
            c5np.d(X1D.LIZIZ(LIZ));
        }
        C83547Wqd c83547Wqd2 = (C83547Wqd) iDLListenerS199S0100000_14.l0;
        int i = c83547Wqd2.LIZIZ;
        if (i == 0) {
            c83547Wqd2.LIZIZ = height;
            return;
        }
        if (i == height) {
            return;
        }
        InterfaceC83564Wqu interfaceC83564Wqu = c83547Wqd2.LIZJ;
        if (interfaceC83564Wqu != null) {
            int i2 = i - height;
            int i3 = c83547Wqd2.LIZLLL;
            if (i2 > i3) {
                interfaceC83564Wqu.keyBoardShow(i - height);
            } else if (i > height) {
                interfaceC83564Wqu.keyBoardModify(i - height);
            } else if (height - i > i3) {
                interfaceC83564Wqu.keyBoardHide(height - i);
            } else if (i < height) {
                interfaceC83564Wqu.keyBoardModify(i - height);
            }
        }
        ((C83547Wqd) iDLListenerS199S0100000_14.l0).LIZIZ = height;
    }

    public static final void onGlobalLayout$8(IDLListenerS199S0100000_14 iDLListenerS199S0100000_14) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        C80289VfB c80289VfB = (C80289VfB) iDLListenerS199S0100000_14.l0;
        c80289VfB.getLocationOnScreen(c80289VfB.LJLJLLL);
        C80289VfB c80289VfB2 = (C80289VfB) iDLListenerS199S0100000_14.l0;
        boolean z4 = true;
        if (c80289VfB2.LJLJLLL[1] == 0) {
            z = true;
        } else {
            z = false;
        }
        C80290VfC c80290VfC = c80289VfB2.LJLJL;
        if (c80290VfC.LJLLLLLL != z) {
            c80290VfC.LJLLLLLL = z;
            if (c80290VfC.LJLILLLLZI.getChildCount() == 0 && c80290VfC.LJLLLLLL) {
                i = c80290VfC.LJZ;
            } else {
                i = 0;
            }
            C72418SbW c72418SbW = c80290VfC.LJLIL;
            c72418SbW.setPadding(0, i, 0, c72418SbW.getPaddingBottom());
        }
        ((C80289VfB) iDLListenerS199S0100000_14.l0).setDrawTopInsetForeground(z);
        for (Context context = ((C80289VfB) iDLListenerS199S0100000_14.l0).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity != null) {
                    if (activity.findViewById(R.id.content).getHeight() == ((C80289VfB) iDLListenerS199S0100000_14.l0).getHeight()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C80289VfB c80289VfB3 = (C80289VfB) iDLListenerS199S0100000_14.l0;
                    if (!z2 || !z3) {
                        z4 = false;
                    }
                    c80289VfB3.setDrawBottomInsetForeground(z4);
                    return;
                }
                return;
            }
        }
    }

    public static final void onGlobalLayout$9(IDLListenerS199S0100000_14 iDLListenerS199S0100000_14) {
        Rect rect = new Rect();
        View view = ((C83383Wnz) iDLListenerS199S0100000_14.l0).LIZ;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int height = rect.height();
        C83383Wnz c83383Wnz = (C83383Wnz) iDLListenerS199S0100000_14.l0;
        int i = c83383Wnz.LIZIZ;
        if (i == 0) {
            c83383Wnz.LIZIZ = height;
            return;
        }
        if (i == height) {
            return;
        }
        InterfaceC83388Wo4 interfaceC83388Wo4 = c83383Wnz.LIZJ;
        if (interfaceC83388Wo4 != null) {
            int i2 = i - height;
            int i3 = c83383Wnz.LIZLLL;
            if (i2 > i3) {
                interfaceC83388Wo4.keyBoardShow(i2);
            } else if (i > height) {
                interfaceC83388Wo4.LIZIZ();
            } else if (height - i > i3) {
                interfaceC83388Wo4.LIZ();
            } else if (i < height) {
                interfaceC83388Wo4.LIZIZ();
            }
        }
        ((C83383Wnz) iDLListenerS199S0100000_14.l0).LIZIZ = height;
    }

    public IDLListenerS199S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
