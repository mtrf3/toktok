package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: X.1CR, reason: invalid class name */
/* loaded from: classes.dex */
public class C1CR extends AbstractC03490Bt {
    public static final String[] LLFZ = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final C03380Bi LLI;
    public static final C03390Bj LLIFFJFJJ;
    public static final C03400Bk LLII;
    public static final C03410Bl LLIIII;
    public static final C03420Bm LLIIIILZ;

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Bi] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0Bj] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0Bk] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0Bl] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0Bm] */
    static {
        final Class<PointF> cls = PointF.class;
        new Property<Drawable, PointF>(cls) { // from class: X.0Bh
            public final Rect LIZ = new Rect();

            @Override // android.util.Property
            public final PointF get(Drawable drawable) {
                drawable.copyBounds(this.LIZ);
                Rect rect = this.LIZ;
                return new PointF(rect.left, rect.top);
            }

            @Override // android.util.Property
            public final void set(Drawable drawable, PointF pointF) {
                Drawable drawable2 = drawable;
                PointF pointF2 = pointF;
                drawable2.copyBounds(this.LIZ);
                this.LIZ.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
                drawable2.setBounds(this.LIZ);
            }
        };
        final Class<PointF> cls2 = PointF.class;
        LLI = new Property<C03440Bo, PointF>(cls2) { // from class: X.0Bi
            @Override // android.util.Property
            public final /* bridge */ /* synthetic */ PointF get(C03440Bo c03440Bo) {
                return null;
            }

            @Override // android.util.Property
            public final void set(C03440Bo c03440Bo, PointF pointF) {
                C03440Bo c03440Bo2 = c03440Bo;
                PointF pointF2 = pointF;
                c03440Bo2.getClass();
                c03440Bo2.LIZ = Math.round(pointF2.x);
                int round = Math.round(pointF2.y);
                c03440Bo2.LIZIZ = round;
                int i = c03440Bo2.LJFF + 1;
                c03440Bo2.LJFF = i;
                if (i == c03440Bo2.LJI) {
                    C03930Dl.LIZ(c03440Bo2.LJ, c03440Bo2.LIZ, round, c03440Bo2.LIZJ, c03440Bo2.LIZLLL);
                    c03440Bo2.LJFF = 0;
                    c03440Bo2.LJI = 0;
                }
            }
        };
        final Class<PointF> cls3 = PointF.class;
        LLIFFJFJJ = new Property<C03440Bo, PointF>(cls3) { // from class: X.0Bj
            @Override // android.util.Property
            public final /* bridge */ /* synthetic */ PointF get(C03440Bo c03440Bo) {
                return null;
            }

            @Override // android.util.Property
            public final void set(C03440Bo c03440Bo, PointF pointF) {
                C03440Bo c03440Bo2 = c03440Bo;
                PointF pointF2 = pointF;
                c03440Bo2.getClass();
                c03440Bo2.LIZJ = Math.round(pointF2.x);
                int round = Math.round(pointF2.y);
                c03440Bo2.LIZLLL = round;
                int i = c03440Bo2.LJI + 1;
                c03440Bo2.LJI = i;
                if (c03440Bo2.LJFF == i) {
                    C03930Dl.LIZ(c03440Bo2.LJ, c03440Bo2.LIZ, c03440Bo2.LIZIZ, c03440Bo2.LIZJ, round);
                    c03440Bo2.LJFF = 0;
                    c03440Bo2.LJI = 0;
                }
            }
        };
        final Class<PointF> cls4 = PointF.class;
        LLII = new Property<View, PointF>(cls4) { // from class: X.0Bk
            @Override // android.util.Property
            public final /* bridge */ /* synthetic */ PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public final void set(View view, PointF pointF) {
                View view2 = view;
                PointF pointF2 = pointF;
                C03930Dl.LIZ(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
            }
        };
        final Class<PointF> cls5 = PointF.class;
        LLIIII = new Property<View, PointF>(cls5) { // from class: X.0Bl
            @Override // android.util.Property
            public final /* bridge */ /* synthetic */ PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public final void set(View view, PointF pointF) {
                View view2 = view;
                PointF pointF2 = pointF;
                C03930Dl.LIZ(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
            }
        };
        final Class<PointF> cls6 = PointF.class;
        LLIIIILZ = new Property<View, PointF>(cls6) { // from class: X.0Bm
            @Override // android.util.Property
            public final /* bridge */ /* synthetic */ PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public final void set(View view, PointF pointF) {
                View view2 = view;
                PointF pointF2 = pointF;
                int round = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                C03930Dl.LIZ(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
            }
        };
    }

    @Override // X.AbstractC03490Bt
    public final String[] LJIILLIIL() {
        return LLFZ;
    }

    public static final void LJJIJL(C03860De c03860De) {
        View view = c03860De.LIZIZ;
        if (C16330kX.LIZJ(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            ((HashMap) c03860De.LIZ).put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            ((HashMap) c03860De.LIZ).put("android:changeBounds:parent", c03860De.LIZIZ.getParent());
        }
    }

    @Override // X.AbstractC03490Bt
    public final void LIZLLL(C03860De c03860De) {
        LJJIJL(c03860De);
    }

    @Override // X.AbstractC03490Bt
    public final void LJI(C03860De c03860De) {
        LJJIJL(c03860De);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC03490Bt
    public Animator LJIIJ(ViewGroup viewGroup, C03860De c03860De, C03860De c03860De2) {
        int i;
        ObjectAnimator objectAnimator;
        if (c03860De == null || c03860De2 == null) {
            return null;
        }
        java.util.Map<String, Object> map = c03860De.LIZ;
        java.util.Map<String, Object> map2 = c03860De2.LIZ;
        Object obj = ((HashMap) map).get("android:changeBounds:parent");
        Object obj2 = ((HashMap) map2).get("android:changeBounds:parent");
        if (obj == null || obj2 == null) {
            return null;
        }
        View view = c03860De2.LIZIZ;
        Rect rect = (Rect) ((HashMap) c03860De.LIZ).get("android:changeBounds:bounds");
        Rect rect2 = (Rect) ((HashMap) c03860De2.LIZ).get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) ((HashMap) c03860De.LIZ).get("android:changeBounds:clip");
        Object obj3 = ((HashMap) c03860De2.LIZ).get("android:changeBounds:clip");
        if ((i10 != 0 && i11 != 0) || (i12 != 0 && i13 != 0)) {
            if (i2 != i3 || i4 != i5) {
                i = 1;
            } else {
                i = 0;
            }
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        } else {
            i = 0;
        }
        if (rect3 == null ? obj3 != null : !rect3.equals(obj3)) {
            i++;
        }
        if (i > 0) {
            C03930Dl.LIZ(view, i2, i4, i6, i8);
            if (i == 2) {
                if (i10 == i12 && i11 == i13) {
                    objectAnimator = ObjectAnimator.ofObject(view, LLIIIILZ, (TypeConverter) null, this.LLF.LLILZ(i2, i4, i3, i5));
                } else {
                    final C03440Bo c03440Bo = new C03440Bo(view);
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(c03440Bo, LLI, (TypeConverter) null, this.LLF.LLILZ(i2, i4, i3, i5));
                    ObjectAnimator ofObject2 = ObjectAnimator.ofObject(c03440Bo, LLIFFJFJJ, (TypeConverter) null, this.LLF.LLILZ(i6, i8, i7, i9));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofObject, ofObject2);
                    animatorSet.addListener(new AnimatorListenerAdapter(c03440Bo) { // from class: X.0Bn
                        public C03440Bo mViewBounds;

                        {
                            this.mViewBounds = c03440Bo;
                        }
                    });
                    objectAnimator = animatorSet;
                }
            } else if (i2 != i3 || i4 != i5) {
                objectAnimator = ObjectAnimator.ofObject(view, LLIIII, (TypeConverter) null, this.LLF.LLILZ(i2, i4, i3, i5));
            } else {
                objectAnimator = ObjectAnimator.ofObject(view, LLII, (TypeConverter) null, this.LLF.LLILZ(i6, i8, i7, i9));
            }
            if (view.getParent() instanceof ViewGroup) {
                final ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                C03890Dh.LIZ(viewGroup2, true);
                LIZ(new C1CS() { // from class: X.1hy
                    public boolean LJLIL;

                    @Override // X.C1CS, X.InterfaceC03480Bs
                    public final void LIZJ(AbstractC03490Bt abstractC03490Bt) {
                        if (!this.LJLIL) {
                            C03890Dh.LIZ(viewGroup2, false);
                        }
                        abstractC03490Bt.LJIL(this);
                    }

                    @Override // X.C1CS, X.InterfaceC03480Bs
                    public final void LIZLLL(AbstractC03490Bt abstractC03490Bt) {
                        C03890Dh.LIZ(viewGroup2, true);
                    }

                    @Override // X.C1CS, X.InterfaceC03480Bs
                    public final void LJ(C1CW c1cw) {
                        C03890Dh.LIZ(viewGroup2, false);
                        this.LJLIL = true;
                    }

                    @Override // X.C1CS, X.InterfaceC03480Bs
                    public final void LJFF(AbstractC03490Bt abstractC03490Bt) {
                        C03890Dh.LIZ(viewGroup2, false);
                    }
                });
            }
            return objectAnimator;
        }
        return null;
    }
}
