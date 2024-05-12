package X;

import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.IReviewGalleryBottomInfoStyle;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RpQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C70732RpQ implements InterfaceC70778RqA {
    public final GalleryViewerFragment LJLIL;
    public final GalleryViewerViewModel LJLILLLLZI;
    public final int LJLJI;
    public View LJLJJI;
    public final int LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @Override // X.InterfaceC70778RqA
    public final void LIZIZ() {
        ViewGroup viewGroup;
        View view = this.LJLJJI;
        ViewParent viewParent = null;
        if (view != null) {
            viewParent = view.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            C16880lQ.LJLLL(this.LJLJJI, viewGroup);
        }
    }

    public void LIZ(C69698RXa c69698RXa) {
        boolean z;
        TextView textView;
        View findViewById;
        View findViewById2;
        TextView textView2;
        int i;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        TuxIconView tuxIconView;
        View findViewById6;
        TextView textView3;
        View findViewById7;
        TextView textView4;
        LTF ltf;
        TextView textView5;
        W5G w5g;
        String str;
        Image image;
        List<String> urls;
        if (c69698RXa != null) {
            View view = this.LJLJJI;
            String str2 = null;
            if (view != null && (w5g = (W5G) view.findViewById(R.id.ad0)) != null) {
                ReviewItemStruct.User user = c69698RXa.LJFF;
                if (user != null && (image = user.avatar) != null && (urls = image.getUrls()) != null) {
                    str = (String) ORZ.LJLLLL(urls);
                } else {
                    str = null;
                }
                w5g.setImageURI(str);
            }
            View view2 = this.LJLJJI;
            if (view2 != null && (textView5 = (TextView) view2.findViewById(R.id.mq0)) != null) {
                ReviewItemStruct.User user2 = c69698RXa.LJFF;
                if (user2 != null) {
                    str2 = user2.name;
                }
                textView5.setText(str2);
            }
            String str3 = c69698RXa.LIZIZ;
            if (str3 != null) {
                float parseFloat = CastFloatProtector.parseFloat(str3);
                View view3 = this.LJLJJI;
                if (view3 != null && (ltf = (LTF) view3.findViewById(R.id.inq)) != null) {
                    ltf.setRate(parseFloat);
                }
            }
            View view4 = this.LJLJJI;
            if (view4 != null && (textView4 = (TextView) view4.findViewById(R.id.mkg)) != null) {
                textView4.setText(c69698RXa.LIZJ);
            }
            String str4 = c69698RXa.LJI;
            if (str4 == null || str4.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                View view5 = this.LJLJJI;
                if (view5 != null && (findViewById7 = view5.findViewById(R.id.m2v)) != null) {
                    findViewById7.setVisibility(8);
                }
            } else {
                View view6 = this.LJLJJI;
                if (view6 != null && (findViewById = view6.findViewById(R.id.m2v)) != null) {
                    findViewById.setVisibility(0);
                }
                View view7 = this.LJLJJI;
                if (view7 != null && (textView = (TextView) view7.findViewById(R.id.m2v)) != null) {
                    textView.setText(c69698RXa.LJI);
                }
            }
            Integer num = c69698RXa.LIZLLL;
            if (num == null || num.intValue() == 0) {
                View view8 = this.LJLJJI;
                if (view8 != null && (textView2 = (TextView) view8.findViewById(R.id.fr4)) != null) {
                    textView2.setText("");
                }
                View view9 = this.LJLJJI;
                if (view9 != null && (findViewById2 = view9.findViewById(R.id.fr4)) != null) {
                    findViewById2.setVisibility(8);
                }
            } else {
                View view10 = this.LJLJJI;
                if (view10 != null && (textView3 = (TextView) view10.findViewById(R.id.fr4)) != null) {
                    textView3.setText(String.valueOf(c69698RXa.LIZLLL));
                }
                View view11 = this.LJLJJI;
                if (view11 != null && (findViewById6 = view11.findViewById(R.id.fr4)) != null) {
                    findViewById6.setVisibility(0);
                }
            }
            C2068389v c2068389v = new C2068389v();
            if (o.LJ(c69698RXa.LJ, Boolean.TRUE)) {
                i = R.raw.icon_thumbs_up_fill;
            } else {
                i = R.raw.icon_thumbs_up;
            }
            c2068389v.LIZ = i;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            View view12 = this.LJLJJI;
            if (view12 != null && (tuxIconView = (TuxIconView) view12.findViewById(R.id.fqt)) != null) {
                tuxIconView.setTuxIcon(c2068389v);
            }
            View view13 = this.LJLJJI;
            if (view13 != null && (findViewById5 = view13.findViewById(R.id.fqt)) != null) {
                findViewById5.post(new ARunnableS48S0100000_12(this, 76));
            }
            View view14 = this.LJLJJI;
            if (view14 != null && (findViewById4 = view14.findViewById(R.id.fr4)) != null) {
                C16880lQ.LJIIJ(new Au2S19S0200000_12(this, c69698RXa, 42, 42), findViewById4);
            }
            View view15 = this.LJLJJI;
            if (view15 != null && (findViewById3 = view15.findViewById(R.id.fqt)) != null) {
                C16880lQ.LJIIJ(new Au2S19S0200000_12(this, c69698RXa, 43, 42), findViewById3);
            }
        }
    }

    @Override // X.InterfaceC70778RqA
    public final void LJFF(int i) {
        View view = this.LJLJJI;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // X.InterfaceC70778RqA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageSelected(int r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel r0 = r4.LJLILLLLZI
            r2 = 0
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<java.util.concurrent.CopyOnWriteArrayList<X.RpB>> r0 = r0.LJLLLLLL
            if (r0 == 0) goto L48
            java.lang.Object r3 = r0.getValue()
            java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3
            if (r3 == 0) goto L49
            int r0 = r3.size()
        L15:
            if (r5 >= r0) goto L71
            if (r3 == 0) goto L46
            java.lang.Object r0 = r3.get(r5)
            X.RpB r0 = (X.C70717RpB) r0
            if (r0 == 0) goto L46
            X.RXa r1 = r0.LIZIZ
        L23:
            com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel r0 = r4.LJLILLLLZI
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<X.RXa> r0 = r0.LJLZ
        L29:
            if (r1 == 0) goto L42
            java.lang.String r1 = r1.LIZ
        L2d:
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.getValue()
            X.RXa r0 = (X.C69698RXa) r0
            if (r0 == 0) goto L40
            java.lang.String r0 = r0.LIZ
        L39:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L4b
            return
        L40:
            r0 = r2
            goto L39
        L42:
            r1 = r2
            goto L2d
        L44:
            r0 = r2
            goto L29
        L46:
            r1 = r2
            goto L23
        L48:
            r3 = r2
        L49:
            r0 = 0
            goto L15
        L4b:
            com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel r0 = r4.LJLILLLLZI
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<X.RXa> r1 = r0.LJLZ
            if (r1 == 0) goto L62
            if (r3 == 0) goto L72
            java.lang.Object r0 = r3.get(r5)
            X.RpB r0 = (X.C70717RpB) r0
            if (r0 == 0) goto L72
            X.RXa r0 = r0.LIZIZ
        L5f:
            r1.postValue(r0)
        L62:
            if (r3 == 0) goto L6e
            java.lang.Object r0 = r3.get(r5)
            X.RpB r0 = (X.C70717RpB) r0
            if (r0 == 0) goto L6e
            X.RXa r2 = r0.LIZIZ
        L6e:
            r4.LIZ(r2)
        L71:
            return
        L72:
            r0 = r2
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70732RpQ.onPageSelected(int):void");
    }

    @Override // X.InterfaceC70778RqA
    public final void setAlpha(float f) {
        View view = this.LJLJJI;
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    @Override // X.InterfaceC70778RqA
    public void LJI(FrameLayout parent, DialogC70776Rq8 dialog) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(dialog, "dialog");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        View LIZ = C27531ArH.LIZ(R.layout.a6k, context, null, false);
        ((AbstractC70866Rra) C024607u.LIZ.LIZIZ(ViewDataBinding.LIZIZ(null), LIZ, R.layout.a6k)).LJIILLIIL((IReviewGalleryBottomInfoStyle) this.LJLJJLL.getValue());
        ((LTF) LIZ.findViewById(R.id.inq)).setStarSize(((IReviewGalleryBottomInfoStyle) this.LJLJJLL.getValue()).getStarSize());
        View avatar_view = LIZ.findViewById(R.id.ad0);
        o.LJIIIIZZ(avatar_view, "avatar_view");
        ViewGroup.LayoutParams layoutParams = avatar_view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
            layoutParams.width = ((IReviewGalleryBottomInfoStyle) this.LJLJJLL.getValue()).getAvatarWidth();
            layoutParams.height = ((IReviewGalleryBottomInfoStyle) this.LJLJJLL.getValue()).getAvatarHeight();
            avatar_view.setLayoutParams(layoutParams);
        }
        this.LJLJJI = LIZ;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        parent.addView(this.LJLJJI, layoutParams2);
    }

    public C70732RpQ(GalleryViewerFragment fragment, GalleryViewerViewModel galleryViewerViewModel, int i) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        this.LJLILLLLZI = galleryViewerViewModel;
        this.LJLJI = i;
        this.LJLJJL = C7MY.LIZIZ(6);
        this.LJLJJLL = C221108m2.LIZIZ(C70733RpR.LJLIL);
    }
}
