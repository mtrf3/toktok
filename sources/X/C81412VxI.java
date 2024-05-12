package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.VxI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81412VxI implements InterfaceC81421VxR {
    public final /* synthetic */ C81518Vz0 LIZ;

    @Override // X.InterfaceC81421VxR
    public final void LIZJ() {
        try {
            Context requireSceneContext = this.LIZ.requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            new C61995OUt(requireSceneContext).LIZIZ(50, 61);
        } catch (Exception unused) {
        }
    }

    public C81412VxI(C81518Vz0 c81518Vz0) {
        this.LIZ = c81518Vz0;
    }

    @Override // X.InterfaceC81421VxR
    public final void LIZ(MotionEvent motionEvent) {
        o.LJIIIZ(motionEvent, "motionEvent");
        int childCount = this.LIZ.LLJILJILJ().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.LIZ.LLJILJILJ().getChildAt(i);
            if ((childAt instanceof C81366VwY) && childAt != null) {
                childAt.setAlpha(1.0f);
            }
        }
    }

    @Override // X.InterfaceC81421VxR
    public final void LIZIZ(MotionEvent motionEvent) {
        C81366VwY c81366VwY;
        int i;
        int i2;
        int i3;
        o.LJIIIZ(motionEvent, "motionEvent");
        int childCount = this.LIZ.LLJILJILJ().getChildCount();
        char c = 0;
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = this.LIZ.LLJILJILJ().getChildAt(i4);
            if ((childAt instanceof C81366VwY) && (c81366VwY = (C81366VwY) childAt) != null) {
                View view = this.LIZ.LJLJJLL;
                if (view != null) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int i5 = iArr[c];
                    int[] iArr2 = new int[2];
                    c81366VwY.getLocationOnScreen(iArr2);
                    int abs = Math.abs(i5 - iArr2[c]);
                    if (abs <= c81366VwY.getMeasuredWidth() / 2) {
                        TextView textView = c81366VwY.getTextView();
                        Context context = c81366VwY.getContext();
                        o.LJIIIIZZ(context, "context");
                        Integer LJI = C79045V0n.LJI(R.attr.do, context);
                        if (LJI != null) {
                            i3 = LJI.intValue();
                        } else {
                            i3 = -16777216;
                        }
                        textView.setTextColor(i3);
                        c81366VwY.setAlpha(((c81366VwY.getMeasuredWidth() - abs) * 2.0f) / c81366VwY.getMeasuredWidth());
                        c81366VwY.LJJLJLI();
                    } else {
                        int i6 = -1;
                        if (abs > c81366VwY.getMeasuredWidth() / 2 && abs <= c81366VwY.getMeasuredWidth()) {
                            TextView textView2 = c81366VwY.getTextView();
                            Context context2 = c81366VwY.getContext();
                            o.LJIIIIZZ(context2, "context");
                            Integer LJI2 = C79045V0n.LJI(R.attr.dk, context2);
                            if (LJI2 != null) {
                                i6 = LJI2.intValue();
                            }
                            textView2.setTextColor(i6);
                            TextView textView3 = c81366VwY.getTextView();
                            Context context3 = c81366VwY.getContext();
                            o.LJIIIIZZ(context3, "context");
                            Integer LJI3 = C79045V0n.LJI(R.attr.ef, context3);
                            if (LJI3 != null) {
                                i2 = LJI3.intValue();
                            } else {
                                i2 = -16777216;
                            }
                            textView3.setShadowLayer(5.0f, 0.0f, 1.0f, i2);
                            c81366VwY.setAlpha(((abs - (c81366VwY.getMeasuredWidth() / 2)) * 2.0f) / c81366VwY.getMeasuredWidth());
                        } else {
                            TextView textView4 = c81366VwY.getTextView();
                            Context context4 = c81366VwY.getContext();
                            o.LJIIIIZZ(context4, "context");
                            Integer LJI4 = C79045V0n.LJI(R.attr.dk, context4);
                            if (LJI4 != null) {
                                i6 = LJI4.intValue();
                            }
                            textView4.setTextColor(i6);
                            TextView textView5 = c81366VwY.getTextView();
                            Context context5 = c81366VwY.getContext();
                            o.LJIIIIZZ(context5, "context");
                            Integer LJI5 = C79045V0n.LJI(R.attr.ef, context5);
                            if (LJI5 != null) {
                                i = LJI5.intValue();
                            } else {
                                i = -16777216;
                            }
                            textView5.setShadowLayer(5.0f, 0.0f, 1.0f, i);
                            c81366VwY.setAlpha(1.0f);
                        }
                    }
                } else {
                    o.LJIJI("selectedBg");
                    throw null;
                }
            }
            i4++;
            c = 0;
        }
    }
}
