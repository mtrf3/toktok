package Y;

import X.AbstractC79941VYz;
import X.AbstractC82670WcU;
import X.C162476Zf;
import X.C278817o;
import X.C32151Nz;
import X.C47261Igj;
import X.C78688UuS;
import X.C79377VDh;
import X.C79493VHt;
import X.C79907VXr;
import X.C79909VXt;
import X.C81449Vxt;
import X.C82101WKb;
import X.C82553Wab;
import X.C82666WcQ;
import X.C82672WcW;
import X.C82673WcX;
import X.C82674WcY;
import X.C82675WcZ;
import X.C82676Wca;
import X.C82677Wcb;
import X.C82680Wce;
import X.C83399WoF;
import X.InterfaceC88473Ynt;
import X.L22;
import X.NJO;
import X.O6R;
import X.OSZ;
import X.W20;
import X.W2C;
import X.YS3;
import X.YS7;
import android.app.Activity;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.videoshop.context.VideoContext;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDTListenerS122S0100000_14 implements View.OnTouchListener {
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
            default:
                return false;
        }
    }

    public IDTListenerS122S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS122S0100000_14 iDTListenerS122S0100000_14, View view, MotionEvent event) {
        o.LJFF(event, "event");
        int action = event.getAction();
        boolean z = true;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        o.LJFF(view, "view");
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                        ((LynxBaseInputView) iDTListenerS122S0100000_14.l0).getClass();
                        LynxBaseInputView lynxBaseInputView = (LynxBaseInputView) iDTListenerS122S0100000_14.l0;
                        lynxBaseInputView.LLF = 0.0f;
                        if (Math.abs(view.getScrollY() - ((LynxBaseInputView) iDTListenerS122S0100000_14.l0).LLFF) <= 10) {
                            z = false;
                        }
                        lynxBaseInputView.LLFFF = z;
                    }
                } else if ((!LynxBaseInputView.LJIJJLI((LynxBaseInputView) iDTListenerS122S0100000_14.l0).canScrollVertically(1) && event.getY() < ((LynxBaseInputView) iDTListenerS122S0100000_14.l0).LLF) || (!LynxBaseInputView.LJIJJLI((LynxBaseInputView) iDTListenerS122S0100000_14.l0).canScrollVertically(-1) && event.getY() > ((LynxBaseInputView) iDTListenerS122S0100000_14.l0).LLF)) {
                    o.LJFF(view, "view");
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else {
                o.LJFF(view, "view");
                view.getParent().requestDisallowInterceptTouchEvent(false);
                ((LynxBaseInputView) iDTListenerS122S0100000_14.l0).getClass();
                LynxBaseInputView lynxBaseInputView2 = (LynxBaseInputView) iDTListenerS122S0100000_14.l0;
                lynxBaseInputView2.LLF = 0.0f;
                if (Math.abs(view.getScrollY() - ((LynxBaseInputView) iDTListenerS122S0100000_14.l0).LLFF) <= 10) {
                    z = false;
                }
                lynxBaseInputView2.LLFFF = z;
            }
        } else {
            o.LJFF(view, "view");
            view.getParent().requestDisallowInterceptTouchEvent(true);
            LynxBaseInputView lynxBaseInputView3 = (LynxBaseInputView) iDTListenerS122S0100000_14.l0;
            event.getX();
            lynxBaseInputView3.getClass();
            ((LynxBaseInputView) iDTListenerS122S0100000_14.l0).LLF = event.getY();
            ((LynxBaseInputView) iDTListenerS122S0100000_14.l0).LLFF = view.getScrollY();
        }
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS122S0100000_14 iDTListenerS122S0100000_14, View view, MotionEvent motionEvent) {
        if (view.isEnabled()) {
            ((C83399WoF) iDTListenerS122S0100000_14.l0).LJLJLJ = true;
            return false;
        }
        return false;
    }

    public static final boolean onTouch$10(IDTListenerS122S0100000_14 iDTListenerS122S0100000_14, View view, MotionEvent motionEvent) {
        C79907VXr c79907VXr;
        boolean z;
        boolean z2;
        Activity topActivity = (Activity) iDTListenerS122S0100000_14.l0;
        o.LJIIIZ(topActivity, "$topActivity");
        if (motionEvent.getAction() != 2) {
            NJO.LIZIZ.LIZIZ("SelectTextManager", String.valueOf(motionEvent.getAction()));
        }
        if (motionEvent.getPointerCount() > 1) {
            return true;
        }
        Reference reference = (Reference) ((LinkedHashMap) L22.LIZIZ).get(Integer.valueOf(topActivity.hashCode()));
        Boolean bool = null;
        if (reference != null) {
            c79907VXr = (C79907VXr) reference.get();
        } else {
            c79907VXr = null;
        }
        Integer valueOf = Integer.valueOf(motionEvent.getAction());
        if (valueOf == null || valueOf.intValue() != 0) {
            if (c79907VXr != null && c79907VXr.LJJJJLL()) {
                if (!c79907VXr.LLFZ) {
                    C79909VXt c79909VXt = c79907VXr.LJLZ;
                    if (c79909VXt != null) {
                        c79909VXt.LIZIZ();
                    }
                    c79907VXr.setBackgroundPosition(C47261Igj.LJJIJ(new OSZ(0, 0)));
                    return true;
                }
                return c79907VXr.LJJJJ(motionEvent);
            }
        } else if (c79907VXr != null) {
            int LJIILIIL = C78688UuS.LJIILIIL(15);
            C79909VXt c79909VXt2 = c79907VXr.LJLZ;
            if (c79909VXt2 != null) {
                int[] iArr = new int[2];
                TextView textView = c79909VXt2.LIZIZ;
                if (textView != null) {
                    textView.getLocationInWindow(iArr);
                }
                Float valueOf2 = Float.valueOf(motionEvent.getRawX());
                Float valueOf3 = Float.valueOf(0.0f);
                if (valueOf2 == null) {
                    valueOf2 = valueOf3;
                }
                float floatValue = valueOf2.floatValue() - iArr[0];
                Float valueOf4 = Float.valueOf(motionEvent.getRawY());
                Float valueOf5 = Float.valueOf(0.0f);
                if (valueOf4 == null) {
                    valueOf4 = valueOf5;
                }
                boolean LIZ = C79909VXt.LIZ(floatValue, valueOf4.floatValue() - iArr[1], c79909VXt2.LJ, LJIILIIL);
                Float valueOf6 = Float.valueOf(motionEvent.getRawX());
                Float valueOf7 = Float.valueOf(0.0f);
                if (valueOf6 == null) {
                    valueOf6 = valueOf7;
                }
                float floatValue2 = valueOf6.floatValue() - iArr[0];
                Float valueOf8 = Float.valueOf(motionEvent.getRawY());
                Float valueOf9 = Float.valueOf(0.0f);
                if (valueOf8 == null) {
                    valueOf8 = valueOf9;
                }
                boolean LIZ2 = C79909VXt.LIZ(floatValue2, valueOf8.floatValue() - iArr[1], c79909VXt2.LJFF, LJIILIIL);
                if (LIZ || LIZ2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bool = Boolean.valueOf(z2);
            }
            Boolean bool2 = Boolean.FALSE;
            if (bool == null) {
                bool = bool2;
            }
            if (bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = !z;
            if (c79907VXr != null && c79907VXr.LJJJJLL()) {
                if (z3) {
                    C79909VXt c79909VXt3 = c79907VXr.LJLZ;
                    if (c79909VXt3 != null) {
                        c79909VXt3.LIZIZ();
                    }
                    c79907VXr.setBackgroundPosition(C47261Igj.LJJIJ(new OSZ(0, 0)));
                    List list = (List) ((LinkedHashMap) L22.LIZJ).get(Integer.valueOf(topActivity.hashCode()));
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            View view2 = (View) ((Reference) next).get();
                            if (view2 != null) {
                                view2.getGlobalVisibleRect(new Rect());
                                if (motionEvent.getRawX() > r5.left && motionEvent.getRawX() < r5.right && motionEvent.getRawY() > r5.top && motionEvent.getRawY() < r5.bottom && view2.isShown()) {
                                    if (next != null) {
                                        L22.LJ = new WeakReference<>(c79907VXr);
                                    }
                                }
                            }
                        }
                    }
                    c79907VXr.LJJJJL();
                    return true;
                }
                return c79907VXr.LJJJJ(motionEvent);
            }
        }
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS122S0100000_14 iDTListenerS122S0100000_14, View view, MotionEvent motionEvent) {
        float x;
        float f;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    C82666WcQ c82666WcQ = (C82666WcQ) iDTListenerS122S0100000_14.l0;
                    if (((Boolean) c82666WcQ.LL.getValue()).booleanValue()) {
                        x = c82666WcQ.LJLZ;
                        f = motionEvent.getX();
                    } else {
                        x = motionEvent.getX();
                        f = c82666WcQ.LJLZ;
                    }
                    float f2 = x - f;
                    AbstractC82670WcU abstractC82670WcU = c82666WcQ.LJLLLLLL;
                    C82677Wcb c82677Wcb = C82677Wcb.LIZJ;
                    if (o.LJ(abstractC82670WcU, c82677Wcb)) {
                        View view2 = c82666WcQ.LJLILLLLZI;
                        if (view2 != null) {
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            float min = Math.min(Math.max(0.0f, c82666WcQ.LJLLLLLL.LIZ + f2), (c82666WcQ.LJLLJ - c82666WcQ.LJZL) - c82666WcQ.LJLLL);
                            c82666WcQ.LJZI = min;
                            marginLayoutParams.setMarginStart((int) min);
                            View view3 = c82666WcQ.LJLJLLL;
                            if (view3 != null) {
                                view3.getLayoutParams().width = marginLayoutParams.getMarginStart() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(14.0f)));
                                View view4 = c82666WcQ.LJLJL;
                                if (view4 != null) {
                                    view4.setVisibility(8);
                                    View view5 = c82666WcQ.LJLILLLLZI;
                                    if (view5 != null) {
                                        view5.requestLayout();
                                        TuxTextView tuxTextView = c82666WcQ.LJLJLJ;
                                        if (tuxTextView != null) {
                                            C82673WcX c82673WcX = C82673WcX.LIZIZ;
                                            float f3 = c82666WcQ.LJLLJ;
                                            View view6 = c82666WcQ.LJLILLLLZI;
                                            if (view6 != null) {
                                                o.LJII(view6.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                float marginStart = f3 - ((ViewGroup.MarginLayoutParams) r0).getMarginStart();
                                                View view7 = c82666WcQ.LJLJI;
                                                if (view7 != null) {
                                                    o.LJII(view7.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                    c82673WcX.LIZ = marginStart - ((ViewGroup.MarginLayoutParams) r0).getMarginEnd();
                                                    tuxTextView.setText(c82666WcQ.LLJJ(c82673WcX));
                                                    Integer invoke = c82666WcQ.LLJILJIL().invoke(c82677Wcb);
                                                    Integer invoke2 = c82666WcQ.LLJILJIL().invoke(C82674WcY.LIZJ);
                                                    if (invoke != null && invoke2 != null) {
                                                        c82666WcQ.getUiActions().LJLJI.invoke(new OSZ<>(invoke, invoke2));
                                                        if (!c82666WcQ.LLFF) {
                                                            c82666WcQ.LLFF = true;
                                                            c82666WcQ.getUiActions().LJLJJI.invoke(new OSZ<>(invoke, invoke2));
                                                        }
                                                    }
                                                    if (Math.abs(f2 - c82666WcQ.LJZ) > c82666WcQ.LJLLLL) {
                                                        c82666WcQ.LJZ = f2;
                                                        Integer invoke3 = c82666WcQ.LLJILJIL().invoke(c82677Wcb);
                                                        if (invoke3 != null) {
                                                            c82666WcQ.getUiActions().LJLIL.invoke(Integer.valueOf(invoke3.intValue()));
                                                        }
                                                    }
                                                } else {
                                                    o.LJIJI("endHandleBar");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("startHandleBar");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("timeView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("startHandleBar");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("slider");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("startMaskView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("startHandleBar");
                            throw null;
                        }
                    } else {
                        C82674WcY c82674WcY = C82674WcY.LIZJ;
                        if (o.LJ(abstractC82670WcU, c82674WcY)) {
                            View view8 = c82666WcQ.LJLJI;
                            if (view8 != null) {
                                ViewGroup.LayoutParams layoutParams2 = view8.getLayoutParams();
                                o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                float min2 = Math.min(Math.max(0.0f, c82666WcQ.LJLLLLLL.LIZIZ - f2), (c82666WcQ.LJLLJ - c82666WcQ.LJZI) - c82666WcQ.LJLLL);
                                c82666WcQ.LJZL = min2;
                                marginLayoutParams2.setMarginEnd((int) min2);
                                View view9 = c82666WcQ.LJLL;
                                if (view9 != null) {
                                    view9.getLayoutParams().width = marginLayoutParams2.getMarginEnd() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(14.0f)));
                                    View view10 = c82666WcQ.LJLJL;
                                    if (view10 != null) {
                                        view10.setVisibility(8);
                                        View view11 = c82666WcQ.LJLJI;
                                        if (view11 != null) {
                                            view11.requestLayout();
                                            TuxTextView tuxTextView2 = c82666WcQ.LJLJLJ;
                                            if (tuxTextView2 != null) {
                                                C82673WcX c82673WcX2 = C82673WcX.LIZIZ;
                                                float f4 = c82666WcQ.LJLLJ;
                                                View view12 = c82666WcQ.LJLILLLLZI;
                                                if (view12 != null) {
                                                    o.LJII(view12.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                    float marginStart2 = f4 - ((ViewGroup.MarginLayoutParams) r0).getMarginStart();
                                                    View view13 = c82666WcQ.LJLJI;
                                                    if (view13 != null) {
                                                        o.LJII(view13.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                        c82673WcX2.LIZ = marginStart2 - ((ViewGroup.MarginLayoutParams) r0).getMarginEnd();
                                                        tuxTextView2.setText(c82666WcQ.LLJJ(c82673WcX2));
                                                        Integer invoke4 = c82666WcQ.LLJILJIL().invoke(c82677Wcb);
                                                        Integer invoke5 = c82666WcQ.LLJILJIL().invoke(c82674WcY);
                                                        if (invoke4 != null && invoke5 != null) {
                                                            c82666WcQ.getUiActions().LJLJI.invoke(new OSZ<>(invoke4, invoke5));
                                                            if (!c82666WcQ.LLFF) {
                                                                c82666WcQ.LLFF = true;
                                                                c82666WcQ.getUiActions().LJLJJI.invoke(new OSZ<>(invoke4, invoke5));
                                                            }
                                                        }
                                                        if (Math.abs(f2 - c82666WcQ.LJZ) > c82666WcQ.LJLLLL) {
                                                            c82666WcQ.LJZ = f2;
                                                            Integer invoke6 = c82666WcQ.LLJILJIL().invoke(c82674WcY);
                                                            if (invoke6 != null) {
                                                                c82666WcQ.getUiActions().LJLIL.invoke(Integer.valueOf(invoke6.intValue()));
                                                            }
                                                        }
                                                    } else {
                                                        o.LJIJI("endHandleBar");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("startHandleBar");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("timeView");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("endHandleBar");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("slider");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("endMaskView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("endHandleBar");
                                throw null;
                            }
                        } else {
                            C82676Wca c82676Wca = C82676Wca.LIZJ;
                            if (o.LJ(abstractC82670WcU, c82676Wca)) {
                                View view14 = c82666WcQ.LJLJL;
                                if (view14 != null) {
                                    ViewGroup.LayoutParams layoutParams3 = view14.getLayoutParams();
                                    o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                    View view15 = c82666WcQ.LJLILLLLZI;
                                    if (view15 != null) {
                                        ViewGroup.LayoutParams layoutParams4 = view15.getLayoutParams();
                                        o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                        int marginStart3 = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart();
                                        View view16 = c82666WcQ.LJLILLLLZI;
                                        if (view16 != null) {
                                            int measuredWidth = view16.getMeasuredWidth() + marginStart3;
                                            float LIZ = c82666WcQ.LJLLJ - C278817o.LIZ(5.0f);
                                            View view17 = c82666WcQ.LJLJI;
                                            if (view17 != null) {
                                                o.LJII(view17.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                marginLayoutParams3.setMarginStart((int) Math.min(Math.max(measuredWidth, c82666WcQ.LJLLLLLL.LIZ + f2), (LIZ - ((ViewGroup.MarginLayoutParams) r0).getMarginEnd()) + C278817o.LIZ(14.0f)));
                                                View view18 = c82666WcQ.LJLJL;
                                                if (view18 != null) {
                                                    view18.requestLayout();
                                                    if (Math.abs(f2 - c82666WcQ.LJZ) > c82666WcQ.LJLLLL) {
                                                        c82666WcQ.LJZ = f2;
                                                        Integer invoke7 = c82666WcQ.LLJILJIL().invoke(c82676Wca);
                                                        if (invoke7 != null) {
                                                            c82666WcQ.getUiActions().LJLIL.invoke(Integer.valueOf(invoke7.intValue()));
                                                        }
                                                    }
                                                    TuxTextView tuxTextView3 = c82666WcQ.LJLJLJ;
                                                    if (tuxTextView3 != null) {
                                                        C82672WcW c82672WcW = C82672WcW.LIZIZ;
                                                        View view19 = c82666WcQ.LJLJL;
                                                        if (view19 != null) {
                                                            ViewGroup.LayoutParams layoutParams5 = view19.getLayoutParams();
                                                            o.LJII(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                            int marginStart4 = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart();
                                                            View view20 = c82666WcQ.LJLILLLLZI;
                                                            if (view20 != null) {
                                                                o.LJII(view20.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                                float marginStart5 = (marginStart4 - ((ViewGroup.MarginLayoutParams) r0).getMarginStart()) - C32151Nz.LJIIZILJ(Float.valueOf(14.0f));
                                                                c82672WcW.getClass();
                                                                C82672WcW.LIZJ = marginStart5;
                                                                float f5 = c82666WcQ.LJLLJ;
                                                                View view21 = c82666WcQ.LJLILLLLZI;
                                                                if (view21 != null) {
                                                                    o.LJII(view21.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                                    float marginStart6 = f5 - ((ViewGroup.MarginLayoutParams) r0).getMarginStart();
                                                                    View view22 = c82666WcQ.LJLJI;
                                                                    if (view22 != null) {
                                                                        o.LJII(view22.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                                        c82672WcW.LIZ = marginStart6 - ((ViewGroup.MarginLayoutParams) r0).getMarginEnd();
                                                                        tuxTextView3.setText(c82666WcQ.LLJJ(c82672WcW));
                                                                    } else {
                                                                        o.LJIJI("endHandleBar");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("startHandleBar");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("startHandleBar");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("slider");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("timeView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("slider");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("endHandleBar");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("startHandleBar");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("startHandleBar");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("slider");
                                    throw null;
                                }
                            } else {
                                if (o.LJ(abstractC82670WcU, C82675WcZ.LIZJ)) {
                                    return false;
                                }
                                throw new C162476Zf();
                            }
                        }
                    }
                    return true;
                }
            }
            C82666WcQ c82666WcQ2 = (C82666WcQ) iDTListenerS122S0100000_14.l0;
            c82666WcQ2.LJZ = 0.0f;
            View view23 = c82666WcQ2.LJLJL;
            if (view23 != null) {
                view23.setVisibility(0);
                AbstractC82670WcU abstractC82670WcU2 = c82666WcQ2.LJLLLLLL;
                if (o.LJ(abstractC82670WcU2, C82677Wcb.LIZJ)) {
                    c82666WcQ2.LLFII = false;
                    View view24 = c82666WcQ2.LJLJL;
                    if (view24 != null) {
                        ViewGroup.LayoutParams layoutParams6 = view24.getLayoutParams();
                        o.LJII(layoutParams6, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams6;
                        View view25 = c82666WcQ2.LJLILLLLZI;
                        if (view25 != null) {
                            ViewGroup.LayoutParams layoutParams7 = view25.getLayoutParams();
                            o.LJII(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            marginLayoutParams4.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(14.0f))) + ((ViewGroup.MarginLayoutParams) layoutParams7).getMarginStart());
                            c82666WcQ2.getUiActions().LJLJJLL.invoke();
                        } else {
                            o.LJIJI("startHandleBar");
                            throw null;
                        }
                    } else {
                        o.LJIJI("slider");
                        throw null;
                    }
                } else if (o.LJ(abstractC82670WcU2, C82674WcY.LIZJ)) {
                    c82666WcQ2.LLFII = false;
                    View view26 = c82666WcQ2.LJLJL;
                    if (view26 != null) {
                        ViewGroup.LayoutParams layoutParams8 = view26.getLayoutParams();
                        o.LJII(layoutParams8, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams8;
                        int LJJIIZ = ((int) c82666WcQ2.LJLLJ) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(5.0f)));
                        View view27 = c82666WcQ2.LJLJI;
                        if (view27 != null) {
                            ViewGroup.LayoutParams layoutParams9 = view27.getLayoutParams();
                            o.LJII(layoutParams9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            marginLayoutParams5.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(14.0f))) + (LJJIIZ - ((ViewGroup.MarginLayoutParams) layoutParams9).getMarginEnd()));
                            c82666WcQ2.getUiActions().LJLJJLL.invoke();
                        } else {
                            o.LJIJI("endHandleBar");
                            throw null;
                        }
                    } else {
                        o.LJIJI("slider");
                        throw null;
                    }
                } else {
                    SceneExtensionsKt.LIZJ(c82666WcQ2, new ARunnableS50S0100000_14(c82666WcQ2, 96), 50L);
                }
                TuxTextView tuxTextView4 = c82666WcQ2.LJLJLJ;
                if (tuxTextView4 != null) {
                    C82672WcW c82672WcW2 = C82672WcW.LIZIZ;
                    View view28 = c82666WcQ2.LJLJL;
                    if (view28 != null) {
                        o.LJII(view28.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        float marginStart7 = ((ViewGroup.MarginLayoutParams) r0).getMarginStart() - C32151Nz.LJIIZILJ(Float.valueOf(14.0f));
                        c82672WcW2.getClass();
                        C82672WcW.LIZJ = marginStart7;
                        float f6 = c82666WcQ2.LJLLJ;
                        View view29 = c82666WcQ2.LJLILLLLZI;
                        if (view29 != null) {
                            o.LJII(view29.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            float marginStart8 = f6 - ((ViewGroup.MarginLayoutParams) r0).getMarginStart();
                            View view30 = c82666WcQ2.LJLJI;
                            if (view30 != null) {
                                o.LJII(view30.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                c82672WcW2.LIZ = marginStart8 - ((ViewGroup.MarginLayoutParams) r0).getMarginEnd();
                                tuxTextView4.setText(c82666WcQ2.LLJJ(c82672WcW2));
                                c82666WcQ2.getUiActions().LJLILLLLZI.invoke(Boolean.TRUE);
                                return true;
                            }
                            o.LJIJI("endHandleBar");
                            throw null;
                        }
                        o.LJIJI("startHandleBar");
                        throw null;
                    }
                    o.LJIJI("slider");
                    throw null;
                }
                o.LJIJI("timeView");
                throw null;
            }
            o.LJIJI("slider");
            throw null;
        }
        C82666WcQ c82666WcQ3 = (C82666WcQ) iDTListenerS122S0100000_14.l0;
        c82666WcQ3.getClass();
        c82666WcQ3.LJLZ = motionEvent.getX();
        InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) c82666WcQ3.LLD.getValue();
        View view31 = c82666WcQ3.LJLJL;
        if (view31 != null) {
            C82676Wca c82676Wca2 = C82676Wca.LIZJ;
            if (((Boolean) interfaceC88473Ynt.invoke(view31, motionEvent, c82676Wca2)).booleanValue()) {
                View view32 = c82666WcQ3.LJLJL;
                if (view32 != null) {
                    o.LJII(view32.getLayoutParams(), "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    c82676Wca2.LIZ = ((ViewGroup.MarginLayoutParams) r0).getMarginStart();
                    c82666WcQ3.LJLLLLLL = c82676Wca2;
                    c82666WcQ3.getUiActions().LJLILLLLZI.invoke(Boolean.FALSE);
                    c82666WcQ3.LLFFF = true;
                } else {
                    o.LJIJI("slider");
                    throw null;
                }
            } else {
                InterfaceC88473Ynt interfaceC88473Ynt2 = (InterfaceC88473Ynt) c82666WcQ3.LLD.getValue();
                View view33 = c82666WcQ3.LJLILLLLZI;
                if (view33 != null) {
                    C82677Wcb c82677Wcb2 = C82677Wcb.LIZJ;
                    if (((Boolean) interfaceC88473Ynt2.invoke(view33, motionEvent, c82677Wcb2)).booleanValue()) {
                        c82666WcQ3.LLFII = true;
                        c82677Wcb2.LIZ = c82666WcQ3.LJZI;
                        c82666WcQ3.LJLLLLLL = c82677Wcb2;
                        c82666WcQ3.getUiActions().LJLILLLLZI.invoke(Boolean.FALSE);
                    } else {
                        InterfaceC88473Ynt interfaceC88473Ynt3 = (InterfaceC88473Ynt) c82666WcQ3.LLD.getValue();
                        View view34 = c82666WcQ3.LJLJI;
                        if (view34 != null) {
                            C82674WcY c82674WcY2 = C82674WcY.LIZJ;
                            if (((Boolean) interfaceC88473Ynt3.invoke(view34, motionEvent, c82674WcY2)).booleanValue()) {
                                c82666WcQ3.LLFII = true;
                                c82674WcY2.LIZIZ = c82666WcQ3.LJZL;
                                c82666WcQ3.LJLLLLLL = c82674WcY2;
                                c82666WcQ3.getUiActions().LJLILLLLZI.invoke(Boolean.FALSE);
                            } else {
                                c82666WcQ3.LJLLLLLL = C82675WcZ.LIZJ;
                                return false;
                            }
                        } else {
                            o.LJIJI("endHandleBar");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("startHandleBar");
                    throw null;
                }
            }
            return true;
        }
        o.LJIJI("slider");
        throw null;
    }

    public static final boolean onTouch$3(IDTListenerS122S0100000_14 iDTListenerS122S0100000_14, View view, MotionEvent motionEvent) {
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior;
        if (motionEvent.getAction() == 0 && (viewPagerBottomSheetBehavior = ((W20) iDTListenerS122S0100000_14.l0).LJLJL) != null && viewPagerBottomSheetBehavior.LJIIIZ == 3) {
            Rect rect = new Rect();
            View findViewById = ((W20) iDTListenerS122S0100000_14.l0).findViewById(R.id.c8m);
            if (findViewById != null) {
                findViewById.getGlobalVisibleRect(rect);
            }
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                ((W20) iDTListenerS122S0100000_14.l0).LLJILJIL().Kv0(W2C.LIZ);
            }
        }
        return true;
    }

    public static final boolean onTouch$4(IDTListenerS122S0100000_14 iDTListenerS122S0100000_14, View view, MotionEvent motionEvent) {
        return ((C82553Wab) iDTListenerS122S0100000_14.l0).LJZI.dispatchTouchEvent(motionEvent);
    }

    public static final boolean onTouch$5(IDTListenerS122S0100000_14 iDTListenerS122S0100000_14, View view, MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            C82101WKb c82101WKb = (C82101WKb) iDTListenerS122S0100000_14.l0;
            if (c82101WKb.LJLLLLLL == 1) {
                c82101WKb.LLJLILLLLZIIL();
                return true;
            }
        }
        return false;
    }

    public static final boolean onTouch$6(IDTListenerS122S0100000_14 iDTListenerS122S0100000_14, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((C82680Wce) iDTListenerS122S0100000_14.l0).dismiss();
        }
        return ((C82680Wce) iDTListenerS122S0100000_14.l0).LJLJJL.LJIL;
    }

    public static final boolean onTouch$7(IDTListenerS122S0100000_14 iDTListenerS122S0100000_14, View view, MotionEvent motionEvent) {
        YS7 ys7 = ((YS3) iDTListenerS122S0100000_14.l0).LJLL;
        if (ys7 != null && ys7.isVideoPlayCompleted()) {
            VideoContext videoContext = ((YS3) iDTListenerS122S0100000_14.l0).LLIILZL;
            if (videoContext == null || !videoContext.isFullScreen()) {
                return false;
            }
            return true;
        }
        if (!((YS3) iDTListenerS122S0100000_14.l0).LLIIIILZ.LJ(new C79493VHt())) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    ((YS3) iDTListenerS122S0100000_14.l0).LLIIIILZ.LJ(new C79377VDh(304));
                }
            } else {
                ((YS3) iDTListenerS122S0100000_14.l0).getClass();
                VideoContext videoContext2 = ((YS3) iDTListenerS122S0100000_14.l0).LLIILZL;
                if (videoContext2 == null || !videoContext2.isFullScreen()) {
                    ((YS3) iDTListenerS122S0100000_14.l0).LLIIIILZ.LJ(new C79377VDh(304));
                }
            }
        }
        VideoContext videoContext3 = ((YS3) iDTListenerS122S0100000_14.l0).LLIILZL;
        if (videoContext3 == null || !videoContext3.isFullScreen()) {
            return false;
        }
        return true;
    }

    public static final boolean onTouch$8(IDTListenerS122S0100000_14 iDTListenerS122S0100000_14, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((AbstractC79941VYz) iDTListenerS122S0100000_14.l0).LIZ();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$9(IDTListenerS122S0100000_14 iDTListenerS122S0100000_14, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ((C81449Vxt) iDTListenerS122S0100000_14.l0).LLJJI().hidePanel();
        }
        return true;
    }
}
