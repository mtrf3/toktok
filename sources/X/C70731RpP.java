package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.RpP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70731RpP extends C70732RpQ {
    public View LJLJL;

    @Override // X.C70732RpQ
    public final void LIZ(C69698RXa c69698RXa) {
        boolean z;
        Icon icon;
        Image image;
        SmartImageView smartImageView;
        boolean z2;
        TextView textView;
        View findViewById;
        int i;
        int i2;
        TuxTextView tuxTextView;
        View findViewById2;
        View findViewById3;
        ImageView imageView;
        View findViewById4;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        TextView textView2;
        View findViewById5;
        View findViewById6;
        TextView textView3;
        ImageView imageView2;
        View findViewById7;
        TextView textView4;
        View findViewById8;
        int i3;
        View findViewById9;
        View findViewById10;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView4;
        TextView textView5;
        View findViewById11;
        TextView textView6;
        LTF ltf;
        TextView textView7;
        Image image2;
        Icon icon2;
        Context context;
        if (c69698RXa != null) {
            View view = this.LJLJL;
            if (view != null && (context = view.getContext()) != null && AnonymousClass636.LJIILJJIL(context)) {
                z = true;
            } else {
                z = false;
            }
            String str = null;
            if (z) {
                ReviewItemStruct.User user = c69698RXa.LJFF;
                if (user != null && (icon2 = user.defaultAvatar) != null) {
                    image = icon2.iconDark;
                }
                image = null;
            } else {
                ReviewItemStruct.User user2 = c69698RXa.LJFF;
                if (user2 != null && (icon = user2.defaultAvatar) != null) {
                    image = icon.icon;
                }
                image = null;
            }
            ReviewItemStruct.User user3 = c69698RXa.LJFF;
            if (user3 != null && (image2 = user3.avatar) != null) {
                image = image2;
            }
            W5F LJ = C70759Rpr.LJ(image);
            LJ.LJIIJJI = R.drawable.dds;
            View view2 = this.LJLJL;
            if (view2 != null) {
                smartImageView = (SmartImageView) view2.findViewById(R.id.ad0);
            } else {
                smartImageView = null;
            }
            LJ.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LJ);
            View view3 = this.LJLJL;
            if (view3 != null && (textView7 = (TextView) view3.findViewById(R.id.mq0)) != null) {
                ReviewItemStruct.User user4 = c69698RXa.LJFF;
                if (user4 != null) {
                    str = user4.name;
                }
                textView7.setText(str);
            }
            String str2 = c69698RXa.LIZIZ;
            if (str2 != null) {
                float parseFloat = CastFloatProtector.parseFloat(str2);
                View view4 = this.LJLJL;
                if (view4 != null && (ltf = (LTF) view4.findViewById(R.id.inq)) != null) {
                    ltf.setRate(parseFloat);
                }
            }
            View view5 = this.LJLJL;
            if (view5 != null && (textView6 = (TextView) view5.findViewById(R.id.mkg)) != null) {
                textView6.setText(c69698RXa.LIZJ);
            }
            String str3 = c69698RXa.LJI;
            if (str3 == null || str3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                View view6 = this.LJLJL;
                if (view6 != null && (findViewById11 = view6.findViewById(R.id.m2v)) != null) {
                    findViewById11.setVisibility(8);
                }
            } else {
                View view7 = this.LJLJL;
                if (view7 != null && (findViewById = view7.findViewById(R.id.m2v)) != null) {
                    findViewById.setVisibility(0);
                }
                View view8 = this.LJLJL;
                if (view8 != null && (textView = (TextView) view8.findViewById(R.id.m2v)) != null) {
                    textView.setText(c69698RXa.LJI);
                }
            }
            View view9 = this.LJLJL;
            if (view9 != null && (textView5 = (TextView) view9.findViewById(R.id.j0k)) != null) {
                if (C78685UuP.LJJJZ(c69698RXa.LJIIL)) {
                    textView5.setVisibility(0);
                    textView5.setText(c69698RXa.LJIIL);
                } else {
                    textView5.setVisibility(8);
                }
            }
            Integer num = c69698RXa.LIZLLL;
            if (o.LJ(c69698RXa.LJ, Boolean.TRUE)) {
                View view10 = this.LJLJL;
                i2 = R.attr.e2;
                if (view10 != null && (tuxTextView4 = (TuxTextView) view10.findViewById(R.id.fr4)) != null) {
                    tuxTextView4.setTextColorRes(R.attr.e2);
                }
                i = R.raw.icon_heart_fill;
            } else {
                View view11 = this.LJLJL;
                if (view11 != null && (tuxTextView = (TuxTextView) view11.findViewById(R.id.fr4)) != null) {
                    tuxTextView.setTextColorRes(R.attr.dl);
                }
                i = R.raw.icon_heart;
                i2 = R.attr.dl;
            }
            View view12 = this.LJLJL;
            if (view12 != null && (tuxIconView = (TuxIconView) view12.findViewById(R.id.fqt)) != null) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = i;
                c2068389v.LJ = Integer.valueOf(i2);
                tuxIconView.setTuxIcon(c2068389v);
            }
            if (num == null || num.intValue() != 0) {
                View view13 = this.LJLJL;
                if (view13 != null && (findViewById10 = view13.findViewById(R.id.fr4)) != null) {
                    findViewById10.setVisibility(0);
                }
                View view14 = this.LJLJL;
                if (view14 != null && (findViewById8 = view14.findViewById(R.id.fr5)) != null) {
                    View view15 = this.LJLJL;
                    if (view15 != null && (findViewById9 = view15.findViewById(R.id.j0k)) != null && findViewById9.getVisibility() == 0) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    findViewById8.setVisibility(i3);
                }
            } else {
                View view16 = this.LJLJL;
                if (view16 != null && (findViewById3 = view16.findViewById(R.id.fr4)) != null) {
                    findViewById3.setVisibility(8);
                }
                View view17 = this.LJLJL;
                if (view17 != null && (findViewById2 = view17.findViewById(R.id.fr5)) != null) {
                    findViewById2.setVisibility(8);
                }
            }
            View view18 = this.LJLJL;
            if (view18 != null && (textView4 = (TextView) view18.findViewById(R.id.fr4)) != null) {
                textView4.setText(String.valueOf(num));
            }
            if (C78685UuP.LJJJZ(c69698RXa.LJIILLIIL)) {
                View view19 = this.LJLJL;
                if (view19 != null && (findViewById7 = view19.findViewById(R.id.ffa)) != null) {
                    findViewById7.setVisibility(0);
                }
                View view20 = this.LJLJL;
                if (view20 != null && (imageView2 = (ImageView) view20.findViewById(R.id.ff7)) != null) {
                    imageView2.setVisibility(0);
                }
                View view21 = this.LJLJL;
                if (view21 != null && (textView3 = (TextView) view21.findViewById(R.id.ffa)) != null) {
                    textView3.setText(c69698RXa.LJIILLIIL);
                }
            } else {
                View view22 = this.LJLJL;
                if (view22 != null && (findViewById4 = view22.findViewById(R.id.ffa)) != null) {
                    findViewById4.setVisibility(8);
                }
                View view23 = this.LJLJL;
                if (view23 != null && (imageView = (ImageView) view23.findViewById(R.id.ff7)) != null) {
                    imageView.setVisibility(8);
                }
            }
            View view24 = this.LJLJL;
            if (view24 != null && (findViewById6 = view24.findViewById(R.id.fr4)) != null) {
                C16880lQ.LJIIJ(new Au2S19S0200000_12(this, c69698RXa, 44, 42), findViewById6);
            }
            View view25 = this.LJLJL;
            if (view25 != null && (findViewById5 = view25.findViewById(R.id.fqt)) != null) {
                C16880lQ.LJIIJ(new Au2S19S0200000_12(this, c69698RXa, 45, 42), findViewById5);
            }
            View view26 = this.LJLJL;
            if (view26 != null && (textView2 = (TextView) view26.findViewById(R.id.jy1)) != null) {
                if (C78685UuP.LJJJZ(c69698RXa.LJIILIIL)) {
                    textView2.setVisibility(0);
                    textView2.setText(c69698RXa.LJIILIIL);
                } else {
                    textView2.setVisibility(8);
                }
            }
            Integer num2 = c69698RXa.LJIILJJIL;
            int type = EnumC46493IMn.THIRD_PARTY.getType();
            if (num2 == null || num2.intValue() != type) {
                View view27 = this.LJLJL;
                if (view27 != null && (tuxTextView3 = (TuxTextView) view27.findViewById(R.id.jy1)) != null) {
                    tuxTextView3.setTextColorRes(R.attr.dl);
                    return;
                }
                return;
            }
            View view28 = this.LJLJL;
            if (view28 == null || (tuxTextView2 = (TuxTextView) view28.findViewById(R.id.jy1)) == null) {
                return;
            }
            tuxTextView2.setTextColorRes(R.attr.bx);
            C16880lQ.LJIIJ(new Au2S19S0200000_12(tuxTextView2, c69698RXa, 46, 42), tuxTextView2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // X.C70732RpQ, X.InterfaceC70778RqA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C70731RpP.onPageSelected(int):void");
    }

    @Override // X.C70732RpQ, X.InterfaceC70778RqA
    public final void LJI(FrameLayout parent, DialogC70776Rq8 dialog) {
        LTF ltf;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(dialog, "dialog");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        View LIZ = C27532ArI.LIZ(R.layout.a6l, context, null, false);
        this.LJLJL = LIZ;
        LTF ltf2 = (LTF) LIZ.findViewById(R.id.inq);
        if (ltf2 != null) {
            ltf2.setStarSize(16);
        }
        View view = this.LJLJL;
        if (view != null && (ltf = (LTF) view.findViewById(R.id.inq)) != null) {
            ltf.setNoneTypeStarTintColor(R.attr.dm);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        parent.addView(this.LJLJL, layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70731RpP(GalleryViewerFragment fragment, GalleryViewerViewModel galleryViewerViewModel, int i) {
        super(fragment, galleryViewerViewModel, i);
        o.LJIIIZ(fragment, "fragment");
    }
}
