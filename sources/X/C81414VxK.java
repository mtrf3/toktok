package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.VxK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81414VxK implements InterfaceC81421VxR {
    public final /* synthetic */ C81433Vxd LIZ;

    @Override // X.InterfaceC81421VxR
    public final void LIZJ() {
        try {
            Context requireSceneContext = this.LIZ.requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            new C61995OUt(requireSceneContext).LIZIZ(50, 61);
        } catch (Exception unused) {
        }
    }

    public C81414VxK(C81433Vxd c81433Vxd) {
        this.LIZ = c81433Vxd;
    }

    @Override // X.InterfaceC81421VxR
    public final void LIZ(MotionEvent motionEvent) {
        o.LJIIIZ(motionEvent, "motionEvent");
        C119344mI c119344mI = this.LIZ.LJLLI;
        if (c119344mI != null) {
            int childCount = c119344mI.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C119344mI c119344mI2 = this.LIZ.LJLLI;
                if (c119344mI2 != null) {
                    View childAt = c119344mI2.getChildAt(i);
                    if ((childAt instanceof C81366VwY) && childAt != null) {
                        childAt.setAlpha(1.0f);
                    }
                } else {
                    o.LJIJI("tabContainer");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("tabContainer");
        throw null;
    }

    @Override // X.InterfaceC81421VxR
    public final void LIZIZ(MotionEvent motionEvent) {
        C81366VwY c81366VwY;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        o.LJIIIZ(motionEvent, "motionEvent");
        C119344mI c119344mI = this.LIZ.LJLLI;
        Throwable th = null;
        if (c119344mI != null) {
            int childCount = c119344mI.getChildCount();
            char c = 0;
            int i7 = 0;
            while (i7 < childCount) {
                C119344mI c119344mI2 = this.LIZ.LJLLI;
                if (c119344mI2 != null) {
                    View childAt = c119344mI2.getChildAt(i7);
                    if ((childAt instanceof C81366VwY) && (c81366VwY = (C81366VwY) childAt) != null) {
                        C81433Vxd c81433Vxd = this.LIZ;
                        if (((Boolean) c81433Vxd.LLII.getValue()).booleanValue()) {
                            C119344mI c119344mI3 = c81433Vxd.LJLLI;
                            if (c119344mI3 != null) {
                                float width = c119344mI3.getWidth() / 2;
                                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = c81433Vxd.LJLL;
                                if (viewOnTouchListenerC81419VxP != null) {
                                    i = (int) (width - (viewOnTouchListenerC81419VxP.LLFII / 2));
                                } else {
                                    o.LJIJI("tabHost");
                                    throw th;
                                }
                            } else {
                                o.LJIJI("tabContainer");
                                throw th;
                            }
                        } else {
                            View view = c81433Vxd.LJLLILLLL;
                            if (view != null) {
                                int[] iArr = new int[2];
                                view.getLocationOnScreen(iArr);
                                i = iArr[c];
                            } else {
                                o.LJIJI("selectedBg");
                                throw th;
                            }
                        }
                        int[] iArr2 = new int[2];
                        c81366VwY.getLocationOnScreen(iArr2);
                        int abs = Math.abs(i - iArr2[c]);
                        if (abs <= c81366VwY.getMeasuredWidth() / 2) {
                            TextView textView = c81366VwY.getTextView();
                            Context context = c81366VwY.getContext();
                            o.LJIIIIZZ(context, "context");
                            Integer LJI = C79045V0n.LJI(R.attr.do, context);
                            if (LJI != null) {
                                i6 = LJI.intValue();
                            } else {
                                i6 = -16777216;
                            }
                            textView.setTextColor(i6);
                            c81366VwY.setAlpha(((c81366VwY.getMeasuredWidth() - abs) * 2.0f) / c81366VwY.getMeasuredWidth());
                            c81366VwY.LJJLJLI();
                        } else if (abs > c81366VwY.getMeasuredWidth() / 2 && abs <= c81366VwY.getMeasuredWidth()) {
                            TextView textView2 = c81366VwY.getTextView();
                            Context context2 = c81366VwY.getContext();
                            o.LJIIIIZZ(context2, "context");
                            Integer LJI2 = C79045V0n.LJI(R.attr.dk, context2);
                            if (LJI2 != null) {
                                i4 = LJI2.intValue();
                            } else {
                                i4 = -1;
                            }
                            textView2.setTextColor(i4);
                            TextView textView3 = c81366VwY.getTextView();
                            Context context3 = c81366VwY.getContext();
                            o.LJIIIIZZ(context3, "context");
                            Integer LJI3 = C79045V0n.LJI(R.attr.ef, context3);
                            if (LJI3 != null) {
                                i5 = LJI3.intValue();
                            } else {
                                i5 = -16777216;
                            }
                            textView3.setShadowLayer(5.0f, 0.0f, 1.0f, i5);
                            c81366VwY.setAlpha(((abs - (c81366VwY.getMeasuredWidth() / 2)) * 2.0f) / c81366VwY.getMeasuredWidth());
                        } else {
                            TextView textView4 = c81366VwY.getTextView();
                            Context context4 = c81366VwY.getContext();
                            o.LJIIIIZZ(context4, "context");
                            Integer LJI4 = C79045V0n.LJI(R.attr.dk, context4);
                            if (LJI4 != null) {
                                i2 = LJI4.intValue();
                            } else {
                                i2 = -1;
                            }
                            textView4.setTextColor(i2);
                            TextView textView5 = c81366VwY.getTextView();
                            Context context5 = c81366VwY.getContext();
                            o.LJIIIIZZ(context5, "context");
                            Integer LJI5 = C79045V0n.LJI(R.attr.ef, context5);
                            if (LJI5 != null) {
                                i3 = LJI5.intValue();
                            } else {
                                i3 = -16777216;
                            }
                            textView5.setShadowLayer(5.0f, 0.0f, 1.0f, i3);
                            c81366VwY.setAlpha(1.0f);
                        }
                        th = null;
                    }
                    i7++;
                    c = 0;
                } else {
                    o.LJIJI("tabContainer");
                    throw th;
                }
            }
            return;
        }
        o.LJIJI("tabContainer");
        throw null;
    }
}
