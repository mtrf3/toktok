package X;

import Y.ACListenerS26S1200000_4;
import Y.ALAdapterS3S0100000_4;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.touchpoint.core.model.Content;
import com.bytedance.touchpoint.core.model.FeedButton;
import com.bytedance.touchpoint.core.model.Picture;
import com.bytedance.touchpoint.core.model.PopupView;
import com.bytedance.touchpoint.core.model.ReferralFeedBanner;
import com.bytedance.touchpoint.core.model.Title;
import com.bytedance.touchpoint.core.model.Video;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9n9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247279n9 implements AnonymousClass907 {
    public View LIZIZ;
    public LinearLayout LIZJ;
    public TuxTextView LIZLLL;
    public TuxTextView LJ;
    public ImageView LJFF;
    public W5G LJI;
    public LinearLayout LJII;
    public TuxTextView LJIIIIZZ;
    public TuxTextView LJIIIZ;
    public C29701Eo LJIIJ;
    public FrameLayout LJIIJJI;
    public ImageView LJIIL;
    public TuxTextView LJIILIIL;
    public TuxTextView LJIILJJIL;
    public LinearLayout LJIILL;
    public SmartImageView LJIILLIIL;
    public TuxSheet LJIIZILJ;
    public ReferralFeedBanner LJIJ;
    public View LJIJI;
    public View LJIJJ;
    public View LJIJJLI;
    public View LJIL;
    public Context LJJ;
    public boolean LJJI;
    public String LJJII;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C96R.LJLIL);
    public int LJJIFFI = -1;

    @Override // X.AnonymousClass907
    public final void LIZIZ() {
        int i;
        ReferralFeedBanner referralFeedBanner = this.LJIJ;
        if (referralFeedBanner != null) {
            i = referralFeedBanner.bannerType;
        } else {
            i = 0;
        }
        if (i == 1) {
            C29701Eo c29701Eo = this.LJIIJ;
            if (c29701Eo != null) {
                c29701Eo.cancelAnimation();
            }
            C29701Eo c29701Eo2 = this.LJIIJ;
            if (c29701Eo2 != null) {
                c29701Eo2.clearAnimation();
            }
            LinearLayout linearLayout = this.LJII;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            TuxTextView tuxTextView = this.LJIIIIZZ;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(4);
            }
            TuxTextView tuxTextView2 = this.LJIIIZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(4);
            }
            FrameLayout frameLayout = this.LJIIJJI;
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
            }
        } else {
            LinearLayout linearLayout2 = this.LIZJ;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
        LinearLayout linearLayout3 = this.LJIILL;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        String str = null;
        if (!this.LJJI) {
            C247739nt.LIZ(C247669nm.LIZ(), 9, "", null, 28);
            this.LJJI = true;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null) {
            str = abstractC247499nV.LJIIJ();
        }
        linkedHashMap.put("region", str);
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            interfaceC247459nR.LIZIZ("feed_activation_video_swipe_click", linkedHashMap);
        }
    }

    @Override // X.AnonymousClass907
    public final void LIZJ() {
        View view = this.LIZIZ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJIJI;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJIJJLI;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJIL;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.LJIJJ;
        if (view5 != null) {
            view5.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0112, code lost:
    
        if (X.C3C5.m10exceptionOrNullimpl(r0) != null) goto L74;
     */
    @Override // X.AnonymousClass907
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247279n9.LIZLLL():void");
    }

    public final int LJI() {
        Integer num;
        List<Picture> list;
        Picture picture;
        List<Video> list2;
        Video video;
        ReferralFeedBanner referralFeedBanner = this.LJIJ;
        if (referralFeedBanner != null) {
            num = Integer.valueOf(referralFeedBanner.bannerType);
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 1) {
            ReferralFeedBanner referralFeedBanner2 = this.LJIJ;
            if (referralFeedBanner2 == null || (list2 = referralFeedBanner2.videos) == null || (video = (Video) ORZ.LJLLLLLL(this.LJJIFFI, list2)) == null) {
                return 0;
            }
            return video.multiShowCount;
        }
        ReferralFeedBanner referralFeedBanner3 = this.LJIJ;
        if (referralFeedBanner3 == null || (list = referralFeedBanner3.pictures) == null || (picture = (Picture) ORZ.LJLLLLLL(this.LJJIFFI, list)) == null) {
            return 0;
        }
        return picture.multiShowCount;
    }

    public final String LJIIIIZZ() {
        Video video;
        String str;
        Picture picture;
        ReferralFeedBanner referralFeedBanner = this.LJIJ;
        if (referralFeedBanner == null) {
            return "";
        }
        if (referralFeedBanner.bannerType == 1) {
            List<Picture> list = referralFeedBanner.pictures;
            if (list == null || (picture = (Picture) ORZ.LJLLLLLL(this.LJJIFFI, list)) == null || (str = picture.materialId) == null) {
                return "";
            }
        } else {
            List<Video> list2 = referralFeedBanner.videos;
            if (list2 == null || (video = (Video) ORZ.LJLLLLLL(this.LJJIFFI, list2)) == null || (str = video.materialId) == null) {
                return "";
            }
        }
        return str;
    }

    public final int LJIIIZ() {
        int i;
        Resources resources;
        DisplayMetrics displayMetrics;
        Context context = this.LJJ;
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            i = displayMetrics.heightPixels;
        } else {
            i = 812;
        }
        return C7MY.LIZIZ(i);
    }

    public final void LJIIJJI() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJIILL, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new ALAdapterS3S0100000_4(this, 33));
        ofFloat.start();
    }

    @Override // X.AnonymousClass907
    public final boolean isShowing() {
        View view = this.LIZIZ;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static void LJFF(int i, View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin += i;
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x028c, code lost:
    
        if (r0 != null) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247279n9.LJIIJ(java.lang.String, java.lang.String):void");
    }

    public static CharSequence LJII(Title title, Title title2, int i) {
        String str;
        String str2;
        String str3 = null;
        if (title2 != null) {
            str = title2.text;
        } else {
            str = null;
        }
        if (title != null) {
            str3 = title.text;
        }
        if (str == null || str.length() == 0 || title2 == null || (str2 = title2.color) == null || str2.length() == 0 || str3 == null || !s.LJJJLZIJ(str3, str, false)) {
            return str3;
        }
        int LJJLIIIJL = s.LJJLIIIJL(title.text, str, 0, false, 6);
        int length = str.length() + LJJLIIIJL;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) title.text);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), LJJLIIIJL, length, 33);
        return new SpannedString(spannableStringBuilder);
    }

    public static void LJ(C247279n9 c247279n9, TuxTextView tuxTextView, Title title, Title title2) {
        int i;
        String str;
        String str2;
        c247279n9.getClass();
        String str3 = null;
        if (title != null && (str2 = title.color) != null && str2.length() > 0 && tuxTextView != null) {
            tuxTextView.setTextColor(C247489nU.LIZIZ(C247489nU.LIZ, str2));
        }
        if (title2 == null || (str = title2.color) == null || str.length() == 0) {
            i = -1;
        } else {
            C247489nU c247489nU = C247489nU.LIZ;
            if (title2 != null) {
                str3 = title2.color;
            }
            i = C247489nU.LIZIZ(c247489nU, str3);
        }
        if (tuxTextView != null) {
            tuxTextView.setText(LJII(title, title2, i));
        }
    }

    @Override // X.AnonymousClass907
    public final void LIZ(ViewStub viewStub, Context context, int i, View view, View view2, View view3, View view4, String eventType) {
        Picture picture;
        Drawable drawable;
        Content content;
        String str;
        Content content2;
        String str2;
        float f;
        Video video;
        Title title;
        Title title2;
        Drawable drawable2;
        FeedButton feedButton;
        String str3;
        FeedButton feedButton2;
        Content content3;
        LinearLayout linearLayout;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        ImageView imageView;
        W5G w5g;
        LinearLayout linearLayout2;
        TuxTextView tuxTextView3;
        TuxTextView tuxTextView4;
        C29701Eo c29701Eo;
        FrameLayout frameLayout;
        ImageView imageView2;
        TuxTextView tuxTextView5;
        LinearLayout linearLayout3;
        TuxTextView tuxTextView6;
        SmartImageView smartImageView;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        o.LJIIIZ(eventType, "eventType");
        LIZJ();
        if (context != null) {
            C247339nF.LJI.getClass();
            ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) C2MW.LIZ().LIZLLL(C247409nM.LIZIZ(eventType).LJ);
            if (referralFeedBanner != null) {
                this.LJIJ = referralFeedBanner;
                this.LJJ = context;
                this.LJJIFFI = i;
                this.LJIJI = view;
                this.LJIJJ = view2;
                this.LJIJJLI = view3;
                this.LJIL = view4;
                this.LJJII = eventType;
                View view5 = this.LIZIZ;
                String str4 = null;
                if (view5 == null) {
                    View inflate = viewStub.inflate();
                    this.LIZIZ = inflate;
                    if (inflate != null) {
                        linearLayout = (LinearLayout) inflate.findViewById(R.id.n8l);
                    } else {
                        linearLayout = null;
                    }
                    this.LIZJ = linearLayout;
                    View view6 = this.LIZIZ;
                    if (view6 != null) {
                        tuxTextView = (TuxTextView) view6.findViewById(R.id.n8m);
                    } else {
                        tuxTextView = null;
                    }
                    this.LIZLLL = tuxTextView;
                    View view7 = this.LIZIZ;
                    if (view7 != null) {
                        tuxTextView2 = (TuxTextView) view7.findViewById(R.id.n4o);
                    } else {
                        tuxTextView2 = null;
                    }
                    this.LJ = tuxTextView2;
                    View view8 = this.LIZIZ;
                    if (view8 != null) {
                        imageView = (ImageView) view8.findViewById(R.id.n4n);
                    } else {
                        imageView = null;
                    }
                    this.LJFF = imageView;
                    View view9 = this.LIZIZ;
                    if (view9 != null) {
                        w5g = (W5G) view9.findViewById(R.id.hpd);
                    } else {
                        w5g = null;
                    }
                    this.LJI = w5g;
                    View view10 = this.LIZIZ;
                    if (view10 != null) {
                        linearLayout2 = (LinearLayout) view10.findViewById(R.id.hpe);
                    } else {
                        linearLayout2 = null;
                    }
                    this.LJII = linearLayout2;
                    View view11 = this.LIZIZ;
                    if (view11 != null) {
                        tuxTextView3 = (TuxTextView) view11.findViewById(R.id.hp9);
                    } else {
                        tuxTextView3 = null;
                    }
                    this.LJIIIIZZ = tuxTextView3;
                    View view12 = this.LIZIZ;
                    if (view12 != null) {
                        tuxTextView4 = (TuxTextView) view12.findViewById(R.id.hp8);
                    } else {
                        tuxTextView4 = null;
                    }
                    this.LJIIIZ = tuxTextView4;
                    View view13 = this.LIZIZ;
                    if (view13 != null) {
                        c29701Eo = (C29701Eo) view13.findViewById(R.id.hp7);
                    } else {
                        c29701Eo = null;
                    }
                    this.LJIIJ = c29701Eo;
                    View view14 = this.LIZIZ;
                    if (view14 != null) {
                        frameLayout = (FrameLayout) view14.findViewById(R.id.hp3);
                    } else {
                        frameLayout = null;
                    }
                    this.LJIIJJI = frameLayout;
                    View view15 = this.LIZIZ;
                    if (view15 != null) {
                        imageView2 = (ImageView) view15.findViewById(R.id.hp4);
                    } else {
                        imageView2 = null;
                    }
                    this.LJIIL = imageView2;
                    View view16 = this.LIZIZ;
                    if (view16 != null) {
                        tuxTextView5 = (TuxTextView) view16.findViewById(R.id.hp5);
                    } else {
                        tuxTextView5 = null;
                    }
                    this.LJIILIIL = tuxTextView5;
                    View view17 = this.LIZIZ;
                    if (view17 != null) {
                        linearLayout3 = (LinearLayout) view17.findViewById(R.id.e5k);
                    } else {
                        linearLayout3 = null;
                    }
                    this.LJIILL = linearLayout3;
                    View view18 = this.LIZIZ;
                    if (view18 != null) {
                        tuxTextView6 = (TuxTextView) view18.findViewById(R.id.e5i);
                    } else {
                        tuxTextView6 = null;
                    }
                    this.LJIILJJIL = tuxTextView6;
                    View view19 = this.LIZIZ;
                    if (view19 != null) {
                        smartImageView = (SmartImageView) view19.findViewById(R.id.l70);
                    } else {
                        smartImageView = null;
                    }
                    this.LJIILLIIL = smartImageView;
                    C247289nA c247289nA = (C247289nA) C95J.LIZ(8);
                    if (c247289nA != null) {
                        i2 = c247289nA.LIZIZ();
                    } else {
                        i2 = 0;
                    }
                    LJFF(i2, this.LJIILL);
                    LJFF(i2, this.LIZJ);
                    if (LJIIIZ() < 700) {
                        LinearLayout linearLayout4 = this.LJII;
                        if (linearLayout4 != null) {
                            layoutParams = linearLayout4.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.topMargin = C7MY.LIZIZ(85);
                        }
                        LinearLayout linearLayout5 = this.LJII;
                        if (linearLayout5 != null) {
                            linearLayout5.setLayoutParams(marginLayoutParams);
                        }
                        TuxTextView tuxTextView7 = this.LJIIIZ;
                        if (tuxTextView7 != null) {
                            layoutParams2 = tuxTextView7.getLayoutParams();
                        } else {
                            layoutParams2 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        if (marginLayoutParams2 != null) {
                            marginLayoutParams2.topMargin = C7MY.LIZIZ(8);
                        }
                        TuxTextView tuxTextView8 = this.LJIIIZ;
                        if (tuxTextView8 != null) {
                            tuxTextView8.setLayoutParams(marginLayoutParams2);
                        }
                        C29701Eo c29701Eo2 = this.LJIIJ;
                        if (c29701Eo2 != null) {
                            layoutParams3 = c29701Eo2.getLayoutParams();
                        } else {
                            layoutParams3 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        if (marginLayoutParams3 != null) {
                            marginLayoutParams3.width = C7MY.LIZIZ(326);
                            marginLayoutParams3.height = C7MY.LIZIZ(297);
                            marginLayoutParams3.topMargin = -C7MY.LIZIZ(21);
                        }
                        C29701Eo c29701Eo3 = this.LJIIJ;
                        if (c29701Eo3 != null) {
                            c29701Eo3.setLayoutParams(marginLayoutParams3);
                        }
                        FrameLayout frameLayout2 = this.LJIIJJI;
                        if (frameLayout2 != null) {
                            layoutParams4 = frameLayout2.getLayoutParams();
                        } else {
                            layoutParams4 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        if (marginLayoutParams4 != null) {
                            marginLayoutParams4.topMargin = -C7MY.LIZIZ(26);
                            marginLayoutParams4.width = C7MY.LIZIZ(160);
                            marginLayoutParams4.height = C7MY.LIZIZ(48);
                        }
                        FrameLayout frameLayout3 = this.LJIIJJI;
                        if (frameLayout3 != null) {
                            frameLayout3.setLayoutParams(marginLayoutParams4);
                        }
                    }
                    C247289nA c247289nA2 = (C247289nA) C95J.LIZ(8);
                    if (c247289nA2 != null && c247289nA2.LJIIIIZZ()) {
                        C29701Eo c29701Eo4 = this.LJIIJ;
                        if (c29701Eo4 != null) {
                            ViewGroup.LayoutParams layoutParams5 = c29701Eo4.getLayoutParams();
                            layoutParams5.width = C7MY.LIZIZ(330);
                            c29701Eo4.setLayoutParams(layoutParams5);
                        }
                        LinearLayout linearLayout6 = this.LIZJ;
                        if (linearLayout6 != null) {
                            ViewGroup.LayoutParams layoutParams6 = linearLayout6.getLayoutParams();
                            if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                                layoutParams6 = null;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams6;
                            if (marginLayoutParams5 != null) {
                                marginLayoutParams5.width = C7MY.LIZIZ(340);
                                marginLayoutParams5.leftMargin = 0;
                                marginLayoutParams5.rightMargin = 0;
                                linearLayout6.setLayoutParams(marginLayoutParams5);
                            }
                        }
                    }
                } else {
                    view5.setVisibility(0);
                }
                ReferralFeedBanner referralFeedBanner2 = this.LJIJ;
                if (referralFeedBanner2 != null) {
                    int i3 = referralFeedBanner2.bannerType;
                    if (i3 == 2) {
                        List<Video> list = referralFeedBanner2.videos;
                        if (list != null && (video = (Video) ORZ.LJLLLLLL(this.LJJIFFI, list)) != null) {
                            TuxTextView tuxTextView9 = this.LIZLLL;
                            PopupView popupView = video.popupView;
                            if (popupView != null) {
                                title = popupView.title;
                                title2 = popupView.highlightTitle;
                            } else {
                                title = null;
                                title2 = null;
                            }
                            LJ(this, tuxTextView9, title, title2);
                            TuxTextView tuxTextView10 = this.LJ;
                            if (tuxTextView10 != null) {
                                PopupView popupView2 = video.popupView;
                                if (popupView2 != null && (feedButton2 = popupView2.button) != null && (content3 = feedButton2.content) != null) {
                                    str3 = content3.text;
                                } else {
                                    str3 = null;
                                }
                                tuxTextView10.setText(str3);
                            }
                            ImageView imageView3 = this.LJFF;
                            if (imageView3 != null) {
                                drawable2 = imageView3.getDrawable();
                            } else {
                                drawable2 = null;
                            }
                            if (drawable2 instanceof GradientDrawable) {
                                GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
                                C247489nU c247489nU = C247489nU.LIZ;
                                PopupView popupView3 = video.popupView;
                                if (popupView3 != null && (feedButton = popupView3.button) != null) {
                                    str4 = feedButton.bgColor;
                                }
                                gradientDrawable.setColor(C247489nU.LIZIZ(c247489nU, str4));
                            }
                            ImageView imageView4 = this.LJFF;
                            if (imageView4 != null) {
                                C16880lQ.LJIILLIIL(imageView4, new ACListenerS26S1200000_4(this, video, eventType, 6));
                            }
                        } else {
                            return;
                        }
                    } else if (i3 == 1) {
                        List<Picture> list2 = referralFeedBanner2.pictures;
                        if (list2 == null || (picture = (Picture) ORZ.LJLLLLLL(this.LJJIFFI, list2)) == null) {
                            return;
                        }
                        W5G w5g2 = this.LJI;
                        if (w5g2 != null) {
                            w5g2.setVisibility(0);
                        }
                        W5G w5g3 = this.LJI;
                        if (w5g3 != null) {
                            w5g3.setImageURI(picture.bgImage);
                        }
                        LJ(this, this.LJIIIIZZ, picture.title, picture.highlightTitle);
                        TuxTextView tuxTextView11 = this.LJIIIIZZ;
                        if (tuxTextView11 != null) {
                            if (LJIIIZ() < 700) {
                                f = 24.0f;
                            } else {
                                f = 28.0f;
                            }
                            tuxTextView11.LJJJ(f);
                        }
                        LJ(this, this.LJIIIZ, picture.subTitle, null);
                        ImageView imageView5 = this.LJIIL;
                        if (imageView5 != null) {
                            drawable = imageView5.getDrawable();
                        } else {
                            drawable = null;
                        }
                        if (drawable instanceof GradientDrawable) {
                            GradientDrawable gradientDrawable2 = (GradientDrawable) drawable;
                            C247489nU c247489nU2 = C247489nU.LIZ;
                            FeedButton feedButton3 = picture.button;
                            if (feedButton3 != null) {
                                str2 = feedButton3.bgColor;
                            } else {
                                str2 = null;
                            }
                            gradientDrawable2.setColor(C247489nU.LIZIZ(c247489nU2, str2));
                        }
                        ImageView imageView6 = this.LJIIL;
                        if (imageView6 != null) {
                            C16880lQ.LJIILLIIL(imageView6, new ACListenerS26S1200000_4(this, picture, eventType, 7));
                        }
                        TuxTextView tuxTextView12 = this.LJIILIIL;
                        if (tuxTextView12 != null) {
                            FeedButton feedButton4 = picture.button;
                            if (feedButton4 != null && (content2 = feedButton4.content) != null) {
                                str = content2.text;
                            } else {
                                str = null;
                            }
                            tuxTextView12.setText(str);
                        }
                        TuxTextView tuxTextView13 = this.LJIILIIL;
                        if (tuxTextView13 != null) {
                            C247489nU c247489nU3 = C247489nU.LIZ;
                            FeedButton feedButton5 = picture.button;
                            if (feedButton5 != null && (content = feedButton5.content) != null) {
                                str4 = content.color;
                            }
                            tuxTextView13.setTextColor(C247489nU.LIZIZ(c247489nU3, str4));
                        }
                    }
                    TuxTextView tuxTextView14 = this.LJIILJJIL;
                    if (tuxTextView14 != null) {
                        tuxTextView14.setText(referralFeedBanner2.hint);
                    }
                    View view20 = this.LJIJI;
                    if (view20 != null) {
                        view20.setVisibility(8);
                    }
                    View view21 = this.LJIJJLI;
                    if (view21 != null) {
                        view21.setVisibility(8);
                    }
                    View view22 = this.LJIL;
                    if (view22 != null) {
                        view22.setVisibility(8);
                    }
                    View view23 = this.LJIJJ;
                    if (view23 != null) {
                        view23.setVisibility(8);
                    }
                }
            }
        }
    }
}
