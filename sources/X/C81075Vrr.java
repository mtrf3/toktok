package X;

import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS238S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Vrr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81075Vrr extends PagerAdapter implements InterfaceC81086Vs2 {
    public final Context LJLILLLLZI;
    public final ArrayList<String> LJLJI;
    public final int LJLJJI;
    public ArrayList<PoiGalleryAnchorData> LJLJJL;
    public int LJLJJLL;
    public C81078Vru LJLJL;
    public final View LJLJLJ;
    public boolean LJLJLLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return view == object;
    }

    @Override // X.InterfaceC81086Vs2
    public final void LIZIZ() {
        C29S c29s;
        C81078Vru c81078Vru;
        if (C81074Vrq.LIZIZ(this.LJLJJLL, this.LJLJJL) && (c81078Vru = this.LJLJL) != null) {
            Context context = this.LJLILLLLZI;
            View view = this.LJLJLJ;
            ArrayList<PoiGalleryAnchorData> arrayList = this.LJLJJL;
            if (arrayList == null) {
                return;
            }
            C81074Vrq.LIZ(context, view, arrayList, c81078Vru, this.LJLJJLL);
            return;
        }
        Context context2 = this.LJLILLLLZI;
        if ((context2 instanceof C29S) && (c29s = (C29S) context2) != null) {
            View findViewById = c29s.findViewById(R.id.hu0);
            o.LJIIIIZZ(findViewById, "activity.findViewById(R.…oi_gallery_black_overlay)");
            View findViewById2 = c29s.findViewById(R.id.hu3);
            o.LJIIIIZZ(findViewById2, "activity.findViewById(R.id.poi_gallery_navBar)");
            View findViewById3 = c29s.findViewById(R.id.hu7);
            o.LJIIIIZZ(findViewById3, "activity.findViewById(R.id.poi_gallery_view_pager)");
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setStartOffset(100L);
            alphaAnimation.setAnimationListener(new IDAListenerS238S0100000_14(c29s, 7));
            findViewById2.startAnimation(alphaAnimation);
            findViewById.startAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setFillAfter(true);
            alphaAnimation2.setDuration(200L);
            alphaAnimation2.setAnimationListener(new IDAListenerS238S0100000_14(c29s, 8));
            findViewById3.startAnimation(alphaAnimation2);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        ArrayList<String> arrayList = this.LJLJI;
        if (arrayList != null) {
            return arrayList.size();
        }
        "Required image list must be non-null".toString();
        throw new IllegalArgumentException("Required image list must be non-null");
    }

    @Override // X.InterfaceC81086Vs2
    public final void LIZ(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDragByDistance: ");
        LIZ.append(f);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        View view = this.LJLJLJ;
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLILLLLZI), R.layout.c0t, container, false);
        View findViewById = LLLLIILL.findViewById(R.id.hu1);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.poi_gallery_image)");
        C81078Vru c81078Vru = (C81078Vru) findViewById;
        C73305Spp statusView = (C73305Spp) LLLLIILL.findViewById(R.id.hu6);
        ArrayList<String> arrayList = this.LJLJI;
        if (arrayList != null) {
            Object obj = ListProtector.get(arrayList, i);
            o.LJIIIIZZ(obj, "urlList[position]");
            o.LJIIIIZZ(statusView, "statusView");
            android.net.Uri uri = UriProtector.parse((String) obj);
            o.LJIIIIZZ(uri, "uri");
            InterfaceC70869Rrd LIZJ = W5U.LIZJ();
            if (LIZJ != null) {
                LIZJ.LIZJ(uri, new C81090Vs6(i, uri, statusView, c81078Vru, this));
            }
            c81078Vru.setOnDragOuterWidgetsChangeListener(this);
            container.addView(LLLLIILL);
            return LLLLIILL;
        }
        "Required image list must be non-null".toString();
        throw new IllegalArgumentException("Required image list must be non-null");
    }

    public C81075Vrr(int i, Context context, ArrayList arrayList) {
        View view;
        C29S c29s;
        o.LJIIIZ(context, "context");
        this.LJLILLLLZI = context;
        this.LJLJI = arrayList;
        this.LJLJJI = i;
        if ((context instanceof C29S) && (c29s = (C29S) context) != null) {
            view = c29s.findViewById(R.id.hu0);
        } else {
            view = null;
        }
        this.LJLJLJ = view instanceof View ? view : null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        C16880lQ.LJLLL((View) object, container);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object object) {
        View view;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        this.LJLJJLL = i;
        C81078Vru c81078Vru = null;
        if ((object instanceof View) && (view = (View) object) != null) {
            c81078Vru = (C81078Vru) view.findViewById(R.id.hu1);
        }
        this.LJLJL = c81078Vru;
    }

    public final void LJJIII(C81078Vru piv, int i, C73305Spp c73305Spp, boolean z, android.net.Uri uri) {
        C29S c29s;
        if (z) {
            c73305Spp.setVisibility(8);
            piv.setVisibility(0);
        } else {
            c73305Spp.setVisibility(0);
            C252569vg.LIZ(c73305Spp, "", null, new C81076Vrs(i, uri, c73305Spp, piv, this));
        }
        if (i == this.LJLJJI && !this.LJLJLLL) {
            if (z && C81074Vrq.LIZIZ(i, this.LJLJJL)) {
                Context context = this.LJLILLLLZI;
                View view = this.LJLJLJ;
                ArrayList<PoiGalleryAnchorData> arrayList = this.LJLJJL;
                if (arrayList == null) {
                    return;
                }
                o.LJIIIZ(context, "context");
                o.LJIIIZ(piv, "piv");
                PoiGalleryAnchorData poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i);
                if (poiGalleryAnchorData != null && poiGalleryAnchorData.x >= 0 && poiGalleryAnchorData.y >= 0 && poiGalleryAnchorData.w > 0 && poiGalleryAnchorData.h > 0) {
                    Matrix LIZLLL = C81081Vrx.LIZLLL();
                    RectF LJI = C81081Vrx.LJI();
                    piv.LIZJ(LJI);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("tryDoStartAnimWithAnchor currentAnchor x: ");
                    LIZ.append(poiGalleryAnchorData.x);
                    LIZ.append(", y: ");
                    LIZ.append(poiGalleryAnchorData.y);
                    LIZ.append(", w: ");
                    LIZ.append(poiGalleryAnchorData.w);
                    LIZ.append(", h: ");
                    LIZ.append(poiGalleryAnchorData.h);
                    LIZ.append("; \n bound: x: ");
                    LIZ.append(LJI.left);
                    LIZ.append(", y: ");
                    LIZ.append(LJI.top);
                    LIZ.append(", w: ");
                    LIZ.append(LJI.width());
                    LIZ.append(", h: ");
                    LIZ.append(LJI.height());
                    String msg = X1D.LIZIZ(LIZ);
                    o.LJIIIZ(msg, "msg");
                    float f = 2;
                    LIZLLL.postScale(poiGalleryAnchorData.w / LJI.width(), poiGalleryAnchorData.h / LJI.height(), (LJI.width() / f) + LJI.left, (LJI.height() / f) + LJI.top);
                    LIZLLL.postTranslate((poiGalleryAnchorData.x + (poiGalleryAnchorData.w / 2)) - ((LJI.width() / f) + LJI.left), ((poiGalleryAnchorData.y - KL2.LJIIL(context)) + (poiGalleryAnchorData.h / 2)) - ((LJI.height() / f) + LJI.top));
                    piv.LJI(LIZLLL, 0L, null, null);
                    C81081Vrx.LIZJ(LIZLLL);
                    Matrix LIZLLL2 = C81081Vrx.LIZLLL();
                    piv.LJI(LIZLLL2, 300L, null, new AUListenerS90S0100000_1(view, 27));
                    C81081Vrx.LIZJ(LIZLLL2);
                }
            } else {
                Context context2 = this.LJLILLLLZI;
                if ((context2 instanceof C29S) && (c29s = (C29S) context2) != null) {
                    final View findViewById = c29s.findViewById(R.id.hu0);
                    o.LJIIIIZZ(findViewById, "activity.findViewById(R.…oi_gallery_black_overlay)");
                    View findViewById2 = c29s.findViewById(R.id.hu3);
                    o.LJIIIIZZ(findViewById2, "activity.findViewById(R.id.poi_gallery_navBar)");
                    final FrameLayout frameLayout = (FrameLayout) findViewById2;
                    View findViewById3 = c29s.findViewById(R.id.hu7);
                    o.LJIIIIZZ(findViewById3, "activity.findViewById(R.id.poi_gallery_view_pager)");
                    final ViewPager viewPager = (ViewPager) findViewById3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setDuration(100L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3iY
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            findViewById.setAlpha(floatValue);
                            frameLayout.setAlpha(floatValue);
                            viewPager.setAlpha(floatValue);
                        }
                    });
                    ofFloat.start();
                }
            }
            this.LJLJLLL = true;
        }
    }
}
