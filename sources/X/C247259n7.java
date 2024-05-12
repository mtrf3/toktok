package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.Content;
import com.bytedance.touchpoint.core.model.FeedButton;
import com.bytedance.touchpoint.core.model.PopupView;
import com.bytedance.touchpoint.core.model.ReferralFeedBanner;
import com.bytedance.touchpoint.core.model.Video;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9n7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247259n7 implements AnonymousClass907 {
    public View LIZ;
    public View LIZIZ;
    public TuxTextView LIZJ;
    public TuxTextView LIZLLL;
    public View LJ;
    public View LJFF;
    public View LJI;
    public View LJII;
    public ReferralFeedBanner LJIIIIZZ;
    public int LJIIIZ = -1;

    @Override // X.AnonymousClass907
    public final void LIZIZ() {
    }

    @Override // X.AnonymousClass907
    public final void LIZLLL() {
    }

    @Override // X.AnonymousClass907
    public final void LIZJ() {
        View view = this.LIZ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJ;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJI;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJII;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.LJFF;
        if (view5 != null) {
            view5.setVisibility(0);
        }
    }

    @Override // X.AnonymousClass907
    public final boolean isShowing() {
        View view = this.LIZ;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass907
    public final void LIZ(ViewStub viewStub, Context context, int i, View view, View view2, View view3, View view4, final String eventType) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        List<Video> list;
        Video video;
        PopupView popupView;
        final FeedButton feedButton;
        String str;
        String str2;
        GradientDrawable.Orientation orientation;
        ArrayList arrayList;
        int[] iArr;
        int[] iArr2;
        float[] fArr;
        TuxTextView tuxTextView;
        View view5;
        TuxTextView tuxTextView2;
        o.LJIIIZ(eventType, "eventType");
        LIZJ();
        if (context != null) {
            C247339nF.LJI.getClass();
            ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) C2MW.LIZ().LIZLLL(C247409nM.LIZIZ(eventType).LJ);
            if (referralFeedBanner != null) {
                this.LJIIIIZZ = referralFeedBanner;
                this.LJIIIZ = i;
                this.LJ = view;
                this.LJFF = view2;
                this.LJI = view3;
                this.LJII = view4;
                viewStub.setLayoutResource(R.layout.ctk);
                View view6 = this.LIZ;
                if (view6 == null) {
                    View inflate = viewStub.inflate();
                    this.LIZ = inflate;
                    if (inflate != null) {
                        tuxTextView = (TuxTextView) inflate.findViewById(R.id.m25);
                    } else {
                        tuxTextView = null;
                    }
                    this.LIZLLL = tuxTextView;
                    View view7 = this.LIZ;
                    if (view7 != null) {
                        view5 = view7.findViewById(R.id.e5k);
                    } else {
                        view5 = null;
                    }
                    this.LIZIZ = view5;
                    View view8 = this.LIZ;
                    if (view8 != null) {
                        tuxTextView2 = (TuxTextView) view8.findViewById(R.id.e5i);
                    } else {
                        tuxTextView2 = null;
                    }
                    this.LIZJ = tuxTextView2;
                } else {
                    view6.setVisibility(0);
                }
                C247289nA c247289nA = (C247289nA) C95J.LIZ(8);
                if (c247289nA != null) {
                    i2 = c247289nA.LIZIZ();
                } else {
                    i2 = 0;
                }
                View view9 = this.LIZIZ;
                if (view9 != null && (layoutParams = view9.getLayoutParams()) != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin += i2;
                    View view10 = this.LIZIZ;
                    if (view10 != null) {
                        view10.setLayoutParams(marginLayoutParams);
                    }
                    final ReferralFeedBanner referralFeedBanner2 = this.LJIIIIZZ;
                    if (referralFeedBanner2 != null && (list = referralFeedBanner2.videos) != null && (video = (Video) ListProtector.get(list, this.LJIIIZ)) != null && (popupView = video.popupView) != null && (feedButton = popupView.button) != null) {
                        final TuxTextView tuxTextView3 = this.LIZLLL;
                        if (tuxTextView3 != null) {
                            Content content = feedButton.content;
                            if (content != null) {
                                str = content.text;
                            } else {
                                str = null;
                            }
                            tuxTextView3.setText(str);
                            C247489nU c247489nU = C247489nU.LIZ;
                            Content content2 = feedButton.content;
                            if (content2 != null) {
                                str2 = content2.color;
                            } else {
                                str2 = null;
                            }
                            tuxTextView3.setTextColor(C247489nU.LIZIZ(c247489nU, str2));
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            int i3 = feedButton.gradientType;
                            if (i3 == 0) {
                                gradientDrawable.setColor(C247489nU.LIZIZ(c247489nU, feedButton.bgColor));
                                gradientDrawable.setCornerRadius(C32151Nz.LJIIZILJ(8));
                            } else {
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            if (i3 != 4) {
                                                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                                            } else {
                                                orientation = GradientDrawable.Orientation.TR_BL;
                                            }
                                        } else {
                                            orientation = GradientDrawable.Orientation.TL_BR;
                                        }
                                    } else {
                                        orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                    }
                                } else {
                                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                                }
                                List<String> list2 = feedButton.backgroundColors;
                                if (list2 != null) {
                                    arrayList = new ArrayList(C32I.LJJL(list2, 10));
                                    Iterator<String> it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Integer.valueOf(C247489nU.LIZIZ(C247489nU.LIZ, it.next())));
                                    }
                                } else {
                                    arrayList = null;
                                }
                                List<Float> list3 = feedButton.locations;
                                if (Build.VERSION.SDK_INT >= 29 && list3 != null && list3.size() > 0) {
                                    if (arrayList != null) {
                                        iArr2 = ORZ.LLJ(arrayList);
                                    } else {
                                        iArr2 = null;
                                    }
                                    if (list3 != null) {
                                        fArr = ORZ.LLIZ(list3);
                                    } else {
                                        fArr = null;
                                    }
                                    gradientDrawable.setColors(iArr2, fArr);
                                } else {
                                    if (arrayList != null) {
                                        iArr = ORZ.LLJ(arrayList);
                                    } else {
                                        iArr = null;
                                    }
                                    gradientDrawable.setColors(iArr);
                                }
                                gradientDrawable.setGradientType(0);
                                gradientDrawable.setOrientation(orientation);
                                gradientDrawable.setCornerRadius(C32151Nz.LJIIZILJ(8));
                            }
                            tuxTextView3.setBackground(gradientDrawable);
                            C16880lQ.LJJJJI(tuxTextView3, new View.OnClickListener() { // from class: X.9n8
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view11) {
                                    int i4;
                                    ReferralFeedBanner referralFeedBanner3 = referralFeedBanner2;
                                    int i5 = referralFeedBanner3.LIZ;
                                    Integer num = referralFeedBanner3.LIZJ;
                                    if (num != null) {
                                        i4 = num.intValue();
                                    } else {
                                        i4 = 0;
                                    }
                                    C247479nT.LIZ(i5, i4);
                                    C247519nX.LIZ.LJ(this.LJIIIIZZ, eventType);
                                    C247409nM c247409nM = C247339nF.LJI;
                                    Context context2 = TuxTextView.this.getContext();
                                    String str3 = feedButton.jumpLink;
                                    String str4 = referralFeedBanner2.LIZIZ;
                                    c247409nM.getClass();
                                    C247409nM.LJFF(context2, str3, str4);
                                }
                            });
                        }
                        View view11 = this.LIZIZ;
                        if (view11 != null) {
                            view11.setBackground(null);
                        }
                        TuxTextView tuxTextView4 = this.LIZJ;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setText(referralFeedBanner2.hint);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }
}
