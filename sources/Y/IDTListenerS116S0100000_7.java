package Y;

import X.C00F;
import X.C162696a1;
import X.C188727au;
import X.C41634GVq;
import X.C42810Gr8;
import X.C42830GrS;
import X.C46051I5n;
import X.C46118I8c;
import X.C46119I8d;
import X.C46183IAp;
import X.DialogC42922Gsw;
import X.FMX;
import X.I88;
import X.InterfaceC82683Wch;
import X.Z9N;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes8.dex */
public class IDTListenerS116S0100000_7 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case 9:
                return onTouch$9(this, view, motionEvent);
            case 10:
                return onTouch$10(this, view, motionEvent);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case 12:
                return onTouch$12(this, view, motionEvent);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS116S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        InterfaceC82683Wch interfaceC82683Wch = ((I88) iDTListenerS116S0100000_7.l0).LJLJJL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Z9N.LIZIZ.LJFF().LIZLLL(((C46183IAp) iDTListenerS116S0100000_7.l0).LLJILJILJ().LJI(), ((C46183IAp) iDTListenerS116S0100000_7.l0).LLJILJILJ().shootWay, ((C46183IAp) iDTListenerS116S0100000_7.l0).LLJILJILJ().LJIJI());
            return false;
        }
        return false;
    }

    public static final boolean onTouch$10(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        int i;
        int i2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        C41634GVq c41634GVq = (C41634GVq) iDTListenerS116S0100000_7.l0;
                        c41634GVq.LJJII = false;
                        c41634GVq.LJJIJIL.setValue(Boolean.FALSE);
                        ((C41634GVq) iDTListenerS116S0100000_7.l0).LJJIFFI = System.currentTimeMillis();
                        if (((C41634GVq) iDTListenerS116S0100000_7.l0).LJIILIIL != 0 && C00F.LIZ(31744, 0, "studio_global_publish_progress", true) > 0) {
                            C41634GVq.LIZLLL((C41634GVq) iDTListenerS116S0100000_7.l0, 3);
                        }
                        C41634GVq c41634GVq2 = (C41634GVq) iDTListenerS116S0100000_7.l0;
                        c41634GVq2.LJIL = -1.0f;
                        c41634GVq2.LJJ = -1.0f;
                    }
                } else {
                    C41634GVq c41634GVq3 = (C41634GVq) iDTListenerS116S0100000_7.l0;
                    if (c41634GVq3.LJIILL) {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        WindowManager.LayoutParams layoutParams = c41634GVq3.LJIIJ;
                        int i3 = layoutParams.x;
                        float f = c41634GVq3.LJIL;
                        if (f < 0.0f) {
                            i = 0;
                        } else {
                            i = (int) (rawX - f);
                        }
                        layoutParams.x = i3 + i;
                        int i4 = layoutParams.y;
                        float f2 = c41634GVq3.LJJ;
                        if (f2 < 0.0f) {
                            i2 = 0;
                        } else {
                            i2 = (int) (rawY - f2);
                        }
                        layoutParams.y = i4 + i2;
                        WindowManager windowManager = c41634GVq3.LJIIJJI;
                        if (windowManager != null) {
                            windowManager.updateViewLayout(c41634GVq3.LIZIZ, layoutParams);
                        }
                        ((C41634GVq) iDTListenerS116S0100000_7.l0).LJJIJIL.setValue(Boolean.TRUE);
                    }
                    float rawX2 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    C41634GVq c41634GVq4 = (C41634GVq) iDTListenerS116S0100000_7.l0;
                    float f3 = rawX2 - c41634GVq4.LJIL;
                    float sqrt = (float) Math.sqrt(f3 * f3);
                    long currentTimeMillis = System.currentTimeMillis();
                    C41634GVq c41634GVq5 = (C41634GVq) iDTListenerS116S0100000_7.l0;
                    c41634GVq4.LJJIJ = sqrt / ((float) (currentTimeMillis - c41634GVq5.LJJIJIIJIL));
                    c41634GVq5.LJJIJIIJI = rawX2 - c41634GVq5.LJIL;
                    c41634GVq5.LJIL = rawX2;
                    c41634GVq5.LJJ = rawY2;
                    c41634GVq5.LJJIJIIJIL = System.currentTimeMillis();
                    C41634GVq c41634GVq6 = (C41634GVq) iDTListenerS116S0100000_7.l0;
                    float abs = Math.abs(c41634GVq6.LJIJJ - c41634GVq6.LJIL);
                    C41634GVq c41634GVq7 = (C41634GVq) iDTListenerS116S0100000_7.l0;
                    if (abs > c41634GVq7.LJIIL || Math.abs(c41634GVq7.LJIJJLI - c41634GVq7.LJJ) > ((C41634GVq) iDTListenerS116S0100000_7.l0).LJIIL) {
                        ((C41634GVq) iDTListenerS116S0100000_7.l0).LJJII = false;
                    }
                }
            } else {
                C41634GVq c41634GVq8 = (C41634GVq) iDTListenerS116S0100000_7.l0;
                c41634GVq8.LJJII = false;
                c41634GVq8.LJJIJIL.setValue(Boolean.FALSE);
                ((C41634GVq) iDTListenerS116S0100000_7.l0).LJIL = motionEvent.getRawX();
                ((C41634GVq) iDTListenerS116S0100000_7.l0).LJJ = motionEvent.getRawY();
                ((C41634GVq) iDTListenerS116S0100000_7.l0).LJJIFFI = System.currentTimeMillis();
                C41634GVq c41634GVq9 = (C41634GVq) iDTListenerS116S0100000_7.l0;
                float abs2 = Math.abs(c41634GVq9.LJIJJ - c41634GVq9.LJIL);
                C41634GVq c41634GVq10 = (C41634GVq) iDTListenerS116S0100000_7.l0;
                if (abs2 < c41634GVq10.LJIIL) {
                    float abs3 = Math.abs(c41634GVq10.LJIJJLI - c41634GVq10.LJJ);
                    C41634GVq c41634GVq11 = (C41634GVq) iDTListenerS116S0100000_7.l0;
                    if (abs3 < c41634GVq11.LJIIL && c41634GVq11.LJJIFFI - c41634GVq11.LJJI < c41634GVq11.LJJIIZI) {
                        c41634GVq11.LJJIIJ++;
                    }
                }
                if (((C41634GVq) iDTListenerS116S0100000_7.l0).LJIILIIL != 0 && C00F.LIZ(31744, 0, "studio_global_publish_progress", true) > 0) {
                    C41634GVq.LIZLLL((C41634GVq) iDTListenerS116S0100000_7.l0, 3);
                }
                C41634GVq c41634GVq12 = (C41634GVq) iDTListenerS116S0100000_7.l0;
                c41634GVq12.LJIL = -1.0f;
                c41634GVq12.LJJ = -1.0f;
            }
        } else {
            C41634GVq c41634GVq13 = (C41634GVq) iDTListenerS116S0100000_7.l0;
            c41634GVq13.LJJII = true;
            c41634GVq13.LJIJJ = motionEvent.getRawX();
            ((C41634GVq) iDTListenerS116S0100000_7.l0).LJIJJLI = motionEvent.getRawY();
            ((C41634GVq) iDTListenerS116S0100000_7.l0).LJJI = System.currentTimeMillis();
            C41634GVq c41634GVq14 = (C41634GVq) iDTListenerS116S0100000_7.l0;
            c41634GVq14.LJIILJJIL.postDelayed(new ARunnableS43S0100000_7(c41634GVq14, 133), c41634GVq14.LJJIIJZLJL);
            C41634GVq c41634GVq15 = (C41634GVq) iDTListenerS116S0100000_7.l0;
            if (c41634GVq15.LJJIII) {
                c41634GVq15.LJJIII = false;
                c41634GVq15.LJIILJJIL.postDelayed(new ARunnableS43S0100000_7(c41634GVq15, 134), c41634GVq15.LJJIIZ);
            }
        }
        return false;
    }

    public static final boolean onTouch$11(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((C42810Gr8) ((RecyclerView.ViewHolder) iDTListenerS116S0100000_7.l0)).LJLJJI.setAlpha(0.5f);
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        ((C42810Gr8) ((RecyclerView.ViewHolder) iDTListenerS116S0100000_7.l0)).LJLJJI.setAlpha(1.0f);
        return false;
    }

    public static final boolean onTouch$12(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        Integer valueOf;
        if (view != null) {
            C42830GrS c42830GrS = (C42830GrS) iDTListenerS116S0100000_7.l0;
            if (view.isEnabled() && motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
                if (valueOf.intValue() == 0) {
                    c42830GrS.LJLJJL = motionEvent.getX();
                    c42830GrS.LJLJJLL = motionEvent.getY();
                    c42830GrS.L(true);
                } else if (valueOf.intValue() != 5) {
                    if (valueOf.intValue() == 2) {
                        c42830GrS.LJLJL = motionEvent.getX();
                        c42830GrS.LJLJLJ = motionEvent.getY();
                        float abs = Math.abs(c42830GrS.LJLJJL - c42830GrS.LJLJL);
                        float abs2 = Math.abs(c42830GrS.LJLJJLL - c42830GrS.LJLJLJ);
                        float scaledTouchSlop = ViewConfiguration.get(c42830GrS.itemView.getContext()).getScaledTouchSlop();
                        if (abs > scaledTouchSlop || abs2 > scaledTouchSlop) {
                            c42830GrS.L(false);
                        }
                    } else if (valueOf.intValue() == 3 || valueOf.intValue() == 1) {
                        c42830GrS.L(false);
                    }
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$13(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && (num.intValue() == 0 || num.intValue() == 2 || num.intValue() == 1)) {
            ((C46051I5n) iDTListenerS116S0100000_7.l0).LJ = System.currentTimeMillis();
        }
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        C162696a1.LIZ((Activity) iDTListenerS116S0100000_7.l0);
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        InterfaceC82683Wch interfaceC82683Wch = ((C46118I8c) iDTListenerS116S0100000_7.l0).LJLL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$4(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        InterfaceC82683Wch interfaceC82683Wch = ((C46118I8c) iDTListenerS116S0100000_7.l0).LJLL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$5(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        InterfaceC82683Wch interfaceC82683Wch = ((C46119I8d) iDTListenerS116S0100000_7.l0).LJLJLJ;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$6(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        InterfaceC82683Wch interfaceC82683Wch = ((C46119I8d) iDTListenerS116S0100000_7.l0).LJLJLJ;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r1 != 3) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$7(Y.IDTListenerS116S0100000_7 r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            int r1 = r7.getAction()
            r4 = 0
            r3 = 1
            if (r1 == r3) goto L1c
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto L1c
        Le:
            return r4
        Lf:
            java.lang.Object r1 = r5.l0
            X.Ggu r1 = (X.C42176Ggu) r1
            int r0 = r1.LJLJI
            if (r0 >= 0) goto Le
            int r0 = r1.LJLILLLLZI
            r1.LJLJI = r0
            goto Le
        L1c:
            java.lang.Object r0 = r5.l0
            X.Ggu r0 = (X.C42176Ggu) r0
            int r1 = r0.LJLILLLLZI
            int r0 = r0.LJLJI
            int r1 = r1 - r0
            int r1 = java.lang.Math.abs(r1)
            r0 = 10
            if (r1 <= r0) goto L42
            java.lang.Object r0 = r5.l0
            X.Ggu r0 = (X.C42176Ggu) r0
            X.Yns<? super java.lang.Boolean, X.UCe> r2 = r0.LJLJJI
            if (r2 == 0) goto L42
            int r1 = r0.LJLILLLLZI
            int r0 = r0.LJLJI
            if (r1 <= r0) goto L4a
        L3b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.invoke(r0)
        L42:
            java.lang.Object r1 = r5.l0
            X.Ggu r1 = (X.C42176Ggu) r1
            r0 = -1
            r1.LJLJI = r0
            goto Le
        L4a:
            r3 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDTListenerS116S0100000_7.onTouch$7(Y.IDTListenerS116S0100000_7, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$8(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            TuxTextView tuxTextView = ((DialogC42922Gsw) iDTListenerS116S0100000_7.l0).LJLZ;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
            }
            EditText editText = ((DialogC42922Gsw) iDTListenerS116S0100000_7.l0).LJLLLL;
            if (editText != null) {
                editText.setCursorVisible(true);
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", "click_search");
            c188727au.LJIIIZ("enter_from", "label_panel");
            FMX.LJIIL("enter_anchor_search", c188727au.LIZ);
            view.performClick();
        }
        return false;
    }

    public static final boolean onTouch$9(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view, MotionEvent motionEvent) {
        ((DialogC42922Gsw) iDTListenerS116S0100000_7.l0).LJJIFFI();
        return false;
    }
}
