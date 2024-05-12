package X;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentSizeModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ND8 {
    public static final boolean LIZIZ(double d) {
        if (Math.abs(d + 10000) <= 1.0E-4d) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(double d) {
        if (Math.abs(d + 1) <= 1.0E-4d) {
            return true;
        }
        return false;
    }

    public static final void LJII(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            C16880lQ.LJLLL(view, (ViewGroup) parent);
        }
    }

    public static final C58958NBy LJIIIIZZ(AnoleComponentSizeModel anoleComponentSizeModel) {
        double LJIILL;
        double LJIILL2;
        if (anoleComponentSizeModel.getWidth() <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            LJIILL = anoleComponentSizeModel.getWidth();
        } else {
            LJIILL = C17N.LJIILL(anoleComponentSizeModel.getWidth());
        }
        if (anoleComponentSizeModel.getHeight() <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            LJIILL2 = anoleComponentSizeModel.getHeight();
        } else {
            LJIILL2 = C17N.LJIILL(anoleComponentSizeModel.getHeight());
        }
        return new C58958NBy(LJIILL, LJIILL2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C58958NBy LIZ(X.AbstractC58982NCw r8, X.NDG r9) {
        /*
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = r8.LJLIL
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentSizeModel r7 = r0.getSize()
            if (r7 == 0) goto La6
            java.lang.String r1 = r7.getType()
            java.lang.String r0 = "percentage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r9.LJLILLLLZI
            X.NBy r3 = (X.C58958NBy) r3
            X.NBy r0 = new X.NBy
            double r1 = r3.LJLIL
            double r5 = r7.getWidth()
            double r5 = r5 * r1
            double r3 = r3.LJLILLLLZI
            double r1 = r7.getHeight()
            double r1 = r1 * r3
            r0.<init>(r5, r1)
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "absolute"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L39
            X.NBy r0 = LJIIIIZZ(r7)
            goto L2b
        L39:
            java.lang.String r0 = "bybusiness"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L9e
            X.NBy r4 = r8.LJLJJLL
            if (r4 != 0) goto L4a
            X.NBy r0 = LJIIIIZZ(r7)
            goto L2b
        L4a:
            double r0 = r4.LJLIL
            boolean r0 = LIZJ(r0)
            if (r0 == 0) goto L96
            double r0 = r7.getWidth()
            boolean r0 = LIZJ(r0)
            if (r0 == 0) goto L8d
            double r2 = r7.getWidth()
        L60:
            double r0 = r4.LJLILLLLZI
            boolean r0 = LIZJ(r0)
            if (r0 == 0) goto L85
            double r0 = r7.getHeight()
            boolean r0 = LIZJ(r0)
            if (r0 == 0) goto L7c
            double r4 = r7.getHeight()
        L76:
            X.NBy r0 = new X.NBy
            r0.<init>(r2, r4)
            goto L2b
        L7c:
            double r0 = r7.getHeight()
            int r0 = X.C17N.LJIILL(r0)
            goto L8b
        L85:
            double r0 = r4.LJLILLLLZI
            int r0 = X.C17N.LJIILL(r0)
        L8b:
            double r4 = (double) r0
            goto L76
        L8d:
            double r0 = r7.getWidth()
            int r0 = X.C17N.LJIILL(r0)
            goto L9c
        L96:
            double r0 = r4.LJLIL
            int r0 = X.C17N.LJIILL(r0)
        L9c:
            double r2 = (double) r0
            goto L60
        L9e:
            X.B7X r1 = new X.B7X
            java.lang.String r0 = "componentModel.size.type is unknown type"
            r1.<init>(r0)
            throw r1
        La6:
            X.B7X r1 = new X.B7X
            java.lang.String r0 = "componentModel.size is null"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ND8.LIZ(X.NCw, X.NDG):X.NBy");
    }

    public static final void LIZLLL(View contentView, ViewGroup containerView, AnoleComponentAppearModel appearModel, AbstractC58982NCw abstractC58982NCw) {
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        ND9 LJIJJLI;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int i5;
        int i6;
        int i7;
        int i8;
        o.LJIIIZ(abstractC58982NCw, "<this>");
        o.LJIIIZ(containerView, "containerView");
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(appearModel, "appearModel");
        AnoleComponentLayoutModel layout = abstractC58982NCw.LJLIL.getLayout();
        if (layout != null) {
            NDG LIZLLL = abstractC58982NCw.LJLJI.LIZLLL();
            if (LIZLLL != null) {
                AnoleComponentLayoutModel layout2 = abstractC58982NCw.LJLIL.getLayout();
                if (layout2 != null) {
                    str = layout2.getType();
                } else {
                    str = null;
                }
                if (o.LJ(str, "percentage")) {
                    C58958NBy LIZ = LIZ(abstractC58982NCw, LIZLLL);
                    ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams3.width = (int) LIZ.LJLIL;
                        marginLayoutParams3.height = (int) LIZ.LJLILLLLZI;
                        C58958NBy c58958NBy = (C58958NBy) LIZLLL.LJLILLLLZI;
                        PointF pointF = (PointF) LIZLLL.LJLJI;
                        double d = 0.5f;
                        PointF pointF2 = new PointF((float) (((layout.getX() - d) * c58958NBy.LJLIL) + pointF.x), (float) (((layout.getY() - d) * c58958NBy.LJLILLLLZI) + pointF.y));
                        if (LIZJ(LIZ.LJLIL) && LIZJ(LIZ.LJLILLLLZI)) {
                            marginLayoutParams3.width = -1;
                            marginLayoutParams3.height = -1;
                            marginLayoutParams3.setMarginStart((int) pointF2.x);
                            marginLayoutParams3.topMargin = (int) pointF2.y;
                            contentView.setLayoutParams(marginLayoutParams3);
                        } else if (LIZJ(LIZ.LJLIL)) {
                            marginLayoutParams3.width = -1;
                            marginLayoutParams3.setMarginStart((int) pointF2.x);
                            marginLayoutParams3.topMargin = (int) pointF2.y;
                            contentView.setLayoutParams(marginLayoutParams3);
                        } else if (LIZJ(LIZ.LJLILLLLZI)) {
                            marginLayoutParams3.height = -1;
                            marginLayoutParams3.setMarginStart((int) pointF2.x);
                            marginLayoutParams3.topMargin = (int) pointF2.y;
                            contentView.setLayoutParams(marginLayoutParams3);
                        } else {
                            marginLayoutParams3.setMarginStart((int) pointF2.x);
                            marginLayoutParams3.topMargin = (int) pointF2.y;
                            contentView.setLayoutParams(marginLayoutParams3);
                        }
                        ViewGroup.LayoutParams layoutParams2 = contentView.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            i5 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams2);
                        } else {
                            i5 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams3 = contentView.getLayoutParams();
                        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                            i6 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams3);
                        } else {
                            i6 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams4 = contentView.getLayoutParams();
                        if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams4 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        if (marginLayoutParams4 != null) {
                            i7 = marginLayoutParams4.topMargin;
                        } else {
                            i7 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams5 = contentView.getLayoutParams();
                        if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams5 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                        if (marginLayoutParams5 != null) {
                            i8 = marginLayoutParams5.bottomMargin;
                        } else {
                            i8 = 0;
                        }
                        abstractC58982NCw.LJLJLLL = new ND9(i5, i6, i8, i7);
                    } else {
                        throw new B7X("contentView.layoutParams as? ViewGroup.MarginLayoutParams is null");
                    }
                } else if (o.LJ(str, "absolute")) {
                    C58958NBy LIZ2 = LIZ(abstractC58982NCw, LIZLLL);
                    ViewGroup.LayoutParams layoutParams6 = contentView.getLayoutParams();
                    if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                        marginLayoutParams.width = -1;
                        marginLayoutParams.height = -1;
                        boolean LIZIZ = LIZIZ(layout.getLeft());
                        boolean LIZIZ2 = LIZIZ(layout.getRight());
                        boolean LIZIZ3 = LIZIZ(layout.getTop());
                        boolean LIZIZ4 = LIZIZ(layout.getBottom());
                        if (layout.getLeft() < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (LIZIZ && LIZIZ2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (LIZIZ3 && LIZIZ4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean LIZJ = LIZJ(LIZ2.LJLIL);
                        boolean LIZJ2 = LIZJ(LIZ2.LJLILLLLZI);
                        int height = containerView.getHeight();
                        double d2 = LIZ2.LJLILLLLZI;
                        int width = containerView.getWidth();
                        double d3 = LIZ2.LJLIL;
                        int LJIILL = C17N.LJIILL(layout.getLeft());
                        int LJIILL2 = C17N.LJIILL(layout.getRight());
                        int LJIILL3 = C17N.LJIILL(layout.getTop());
                        int LJIILL4 = C17N.LJIILL(layout.getBottom());
                        if (z2) {
                            if (z3) {
                                LJ(width, d3, marginLayoutParams, abstractC58982NCw);
                                LJFF(height, d2, marginLayoutParams, abstractC58982NCw);
                                marginLayoutParams.width = (int) LIZ2.LJLIL;
                                marginLayoutParams.height = (int) LIZ2.LJLILLLLZI;
                            } else {
                                LJ(width, d3, marginLayoutParams, abstractC58982NCw);
                                if (LIZIZ3) {
                                    marginLayoutParams.topMargin = (int) (height - (d2 + LJIILL4));
                                } else {
                                    marginLayoutParams.topMargin = LJIILL3;
                                    if (!LIZIZ4) {
                                        marginLayoutParams.bottomMargin = LJIILL4;
                                    }
                                }
                                if (!LIZJ2) {
                                    marginLayoutParams.height = (int) LIZ2.LJLILLLLZI;
                                }
                                marginLayoutParams.width = (int) LIZ2.LJLIL;
                            }
                        } else if (z3) {
                            LJFF(height, d2, marginLayoutParams, abstractC58982NCw);
                            LJI(LIZIZ, marginLayoutParams, width, d3, LJIILL2, z, LJIILL, LIZIZ2, LIZJ, LIZ2);
                            marginLayoutParams.height = (int) LIZ2.LJLILLLLZI;
                        } else {
                            LJI(LIZIZ, marginLayoutParams, width, d3, LJIILL2, z, LJIILL, LIZIZ2, LIZJ, LIZ2);
                            if (LIZIZ3) {
                                marginLayoutParams.topMargin = (int) (height - (d2 + LJIILL4));
                            } else {
                                marginLayoutParams.topMargin = LJIILL3;
                                if (!LIZIZ4) {
                                    marginLayoutParams.bottomMargin = LJIILL4;
                                }
                            }
                            if (!LIZJ2) {
                                marginLayoutParams.height = (int) LIZ2.LJLILLLLZI;
                            }
                        }
                        abstractC58982NCw.LJII();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("layoutByAbsolute size:");
                        LIZ3.append(LIZ2);
                        C242549fW.LIZ(X1D.LIZIZ(LIZ3));
                        contentView.setLayoutParams(marginLayoutParams);
                        ViewGroup.LayoutParams layoutParams7 = contentView.getLayoutParams();
                        if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                            i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams7);
                        } else {
                            i = 0;
                        }
                        ViewGroup.LayoutParams layoutParams8 = contentView.getLayoutParams();
                        if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                            i2 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams8);
                        } else {
                            i2 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams9 = contentView.getLayoutParams();
                        if (!(layoutParams9 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams9 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams9;
                        if (marginLayoutParams6 != null) {
                            i3 = marginLayoutParams6.topMargin;
                        } else {
                            i3 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams10 = contentView.getLayoutParams();
                        if (!(layoutParams10 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams10 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams10;
                        if (marginLayoutParams7 != null) {
                            i4 = marginLayoutParams7.bottomMargin;
                        } else {
                            i4 = 0;
                        }
                        abstractC58982NCw.LJLJLLL = new ND9(i, i2, i4, i3);
                    } else {
                        throw new B7X("contentView.layoutParams as? ViewGroup.MarginLayoutParams is null");
                    }
                } else {
                    throw new B7X("componentModel.layout.type is unknown type");
                }
                AnoleComponentAnimationModel LIZIZ5 = C78950Uyg.LIZIZ(appearModel.getAnimations());
                if (LIZIZ5 != null && (LJIJJLI = C78949Uyf.LJIJJLI(abstractC58982NCw, containerView, contentView, LIZIZ5.getType(), true)) != null) {
                    ViewGroup.LayoutParams layoutParams11 = contentView.getLayoutParams();
                    if ((layoutParams11 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams11) != null) {
                        marginLayoutParams2.setMarginStart(LJIJJLI.LIZ);
                        marginLayoutParams2.topMargin = LJIJJLI.LIZLLL;
                        contentView.setLayoutParams(marginLayoutParams2);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new B7X("displayInfo is null");
        }
        throw new B7X("componentModel.layout is null");
    }

    public static final void LJ(int i, double d, ViewGroup.MarginLayoutParams marginLayoutParams, AbstractC58982NCw abstractC58982NCw) {
        double d2 = i - d;
        if (d2 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            marginLayoutParams.setMarginStart((int) (d2 / 2));
        }
        abstractC58982NCw.LJII();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("layoutByAbsolute,centerHorizontal,parentWidth = ");
        LIZ.append(i);
        LIZ.append(",viewWidth = ");
        LIZ.append(d);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    public static final void LJFF(int i, double d, ViewGroup.MarginLayoutParams marginLayoutParams, AbstractC58982NCw abstractC58982NCw) {
        double d2 = i - d;
        if (d2 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            marginLayoutParams.topMargin = (int) (d2 / 2);
        }
        abstractC58982NCw.LJII();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("layoutByAbsolute,centerVertical,parentHeight = ");
        LIZ.append(i);
        LIZ.append(",viewHeight = ");
        LIZ.append(d);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    public static final void LJI(boolean z, ViewGroup.MarginLayoutParams marginLayoutParams, int i, double d, int i2, boolean z2, int i3, boolean z3, boolean z4, C58958NBy c58958NBy) {
        if (z) {
            marginLayoutParams.setMarginStart((int) (i - (d + i2)));
        } else {
            if (!z2) {
                marginLayoutParams.setMarginStart(i3);
            } else {
                marginLayoutParams.setMarginStart(0);
            }
            if (!z3) {
                marginLayoutParams.setMarginEnd(i2);
            }
        }
        if (!z4) {
            marginLayoutParams.width = (int) c58958NBy.LJLIL;
        }
    }
}
