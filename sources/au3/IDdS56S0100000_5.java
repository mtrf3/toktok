package au3;

import X.AbstractC32677Cs5;
import X.AbstractC32678Cs6;
import X.AnonymousClass030;
import X.C15380j0;
import X.C16880lQ;
import X.C28439BEd;
import X.C29306Beo;
import X.C29867Bnr;
import X.C30588BzU;
import X.C31644CbQ;
import X.C32522Cpa;
import X.C32531Cpj;
import X.C32609Cqz;
import X.C32785Ctp;
import X.C47061t0;
import X.C48459J0d;
import X.InterfaceC30442Bx8;
import X.KL2;
import X.V1B;
import Y.ARunnableS41S0100000_5;
import Y.IDAListenerS74S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDdS56S0100000_5 extends V1B {
    public final int $t;
    public Object l0;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, i2, str);
                return;
            case 1:
                LJIILJJIL$1(this, i, i2, str);
                return;
            case 2:
                LJIILJJIL$2(this, i, i2, str);
                return;
            case 3:
                LJIILJJIL$3(this, i, i2, str);
                return;
            case 4:
            case 5:
            case 6:
            case 9:
            case 14:
            default:
                super.LJIILJJIL(i, i2, str);
                return;
            case 7:
                LJIILJJIL$4(this, i, i2, str);
                return;
            case 8:
                LJIILJJIL$5(this, i, i2, str);
                return;
            case 10:
                LJIILJJIL$6(this, i, i2, str);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILJJIL$7(this, i, i2, str);
                return;
            case 12:
                LJIILJJIL$8(this, i, i2, str);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJIILJJIL$9(this, i, i2, str);
                return;
            case 15:
                LJIILJJIL$10(this, i, i2, str);
                return;
        }
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, exc, str);
                return;
            case 1:
                LJIILL$1(this, exc, str);
                return;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            default:
                super.LJIILL(exc, str);
                return;
            case 3:
                LJIILL$2(this, exc, str);
                return;
            case 8:
                LJIILL$3(this, exc, str);
                return;
            case 9:
                LJIILL$4(this, exc, str);
                return;
            case 12:
                LJIILL$5(this, exc, str);
                return;
            case 14:
                LJIILL$6(this, exc, str);
                return;
        }
    }

    @Override // X.V1B
    public final void LJLIIIL(boolean z) {
        switch (this.$t) {
            case 4:
                LJLIIIL$0(this, z);
                return;
            case 5:
                LJLIIIL$1(this, z);
                return;
            case 6:
                LJLIIIL$2(this, z);
                return;
            default:
                super.LJLIIIL(z);
                return;
        }
    }

    public IDdS56S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(IDdS56S0100000_5 iDdS56S0100000_5, boolean z) {
        int i;
        ImageView imageView = ((ClearScreenUserInfoWidget) iDdS56S0100000_5.l0).LJLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        KL2.LJIILLIIL(i, imageView);
    }

    public static final void LJLIIIL$1(IDdS56S0100000_5 iDdS56S0100000_5, boolean z) {
        int i;
        ImageView imageView = ((ClearScreenUserInfoWidget) iDdS56S0100000_5.l0).LJLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        KL2.LJIILLIIL(i, imageView);
    }

    public static final void LJLIIIL$2(IDdS56S0100000_5 iDdS56S0100000_5, boolean z) {
        int i;
        ImageView imageView = ((LiveRoomUserInfoWidget) iDdS56S0100000_5.l0).LJLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        KL2.LJIILLIIL(i, imageView);
    }

    public static final void LJIILL$0(IDdS56S0100000_5 iDdS56S0100000_5, Exception exc, String str) {
        PreviewGameDropsWidget previewGameDropsWidget = (PreviewGameDropsWidget) iDdS56S0100000_5.l0;
        previewGameDropsWidget.getClass();
        C30588BzU.LIZLLL(previewGameDropsWidget.dataChannel, "live_take_page", previewGameDropsWidget.LLIIIILZ());
    }

    public static final void LJIILL$1(IDdS56S0100000_5 iDdS56S0100000_5, Exception exc, String str) {
        LinearLayout linearLayout = ((TopRightBannerWidget) iDdS56S0100000_5.l0).LJLJI;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            ImageView imageView = ((TopRightBannerWidget) iDdS56S0100000_5.l0).LJLJL;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            } else {
                o.LJIJI("mAnimateView");
                throw null;
            }
        }
        o.LJIJI("staticContainer");
        throw null;
    }

    public static final void LJIILL$2(IDdS56S0100000_5 iDdS56S0100000_5, Exception exc, String str) {
        C29306Beo.LJI(((ProgrammedLiveFollowCardWidget) iDdS56S0100000_5.l0).LJLJJL);
    }

    public static final void LJIILL$3(IDdS56S0100000_5 iDdS56S0100000_5, Exception exc, String str) {
        ImageView imageView = ((AbstractC32678Cs6) iDdS56S0100000_5.l0).LJLJI;
        if (imageView != null) {
            C29306Beo.LJI(imageView);
        }
    }

    public static final void LJIILL$4(IDdS56S0100000_5 iDdS56S0100000_5, Exception exc, String str) {
        ((C29867Bnr) iDdS56S0100000_5.l0).LIZ();
    }

    public static final void LJIILL$5(IDdS56S0100000_5 iDdS56S0100000_5, Exception exc, String str) {
        ImageView imageView = ((AbstractC32677Cs5) iDdS56S0100000_5.l0).LJLJI;
        if (imageView != null) {
            C29306Beo.LJI(imageView);
        }
    }

    public static final void LJIILL$6(IDdS56S0100000_5 iDdS56S0100000_5, Exception exc, String str) {
        GiftColorInfo giftColorInfo;
        List<String> list;
        String str2;
        C32522Cpa c32522Cpa = ((C32531Cpj) iDdS56S0100000_5.l0).LJLJJI;
        if (c32522Cpa != null && (giftColorInfo = c32522Cpa.LIZ) != null && (list = giftColorInfo.colorValues) != null && list.size() > 0) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            if (list == null || (str2 = (String) ListProtector.get(list, 0)) == null) {
                str2 = "#FFFFFF";
            }
            paint.setColor(ColorProtector.parseColor(str2));
            C47061t0 c47061t0 = ((C32531Cpj) iDdS56S0100000_5.l0).LJLJJL;
            if (c47061t0 == null) {
                return;
            }
            c47061t0.setBackground(shapeDrawable);
        }
    }

    public static final void LJIILJJIL$0(IDdS56S0100000_5 iDdS56S0100000_5, int i, int i2, String str) {
        ((PreviewGameDropsWidget) iDdS56S0100000_5.l0).LJLJJL = 2;
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.LJJLIIIJLLLLLLLZ;
        c48459J0d.LIZ(Long.valueOf(c48459J0d.LIZJ().longValue() + 1));
        PreviewGameDropsWidget previewGameDropsWidget = (PreviewGameDropsWidget) iDdS56S0100000_5.l0;
        previewGameDropsWidget.getClass();
        C30588BzU.LIZLLL(previewGameDropsWidget.dataChannel, "live_take_page", previewGameDropsWidget.LLIIIILZ());
        AnonymousClass030.LJFF(InterfaceC30442Bx8.LJJLIIJ);
    }

    public static final void LJIILJJIL$1(IDdS56S0100000_5 iDdS56S0100000_5, int i, int i2, String str) {
        TopRightBannerWidget topRightBannerWidget = (TopRightBannerWidget) iDdS56S0100000_5.l0;
        ImageView imageView = topRightBannerWidget.LJLJL;
        if (imageView != null) {
            Object parent = imageView.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            int width = ((View) parent).getWidth();
            if (topRightBannerWidget.LJLJL != null) {
                float width2 = ((width - r0.getWidth()) * 0.5f) + C15380j0.LIZ(10.0f);
                if (topRightBannerWidget.LJLJL != null) {
                    float height = (r0.getHeight() * 0.8f) + C15380j0.LIZ(10.0f);
                    ImageView imageView2 = topRightBannerWidget.LJLJL;
                    if (imageView2 != null) {
                        o.LJII(imageView2.getParent(), "null cannot be cast to non-null type android.view.View");
                        float height2 = height - ((View) r0).getHeight();
                        AnimatorSet animatorSet = topRightBannerWidget.LJLJLJ;
                        if (animatorSet != null) {
                            C16880lQ.LJLJJI(animatorSet);
                            animatorSet.end();
                        }
                        ImageView imageView3 = topRightBannerWidget.LJLJL;
                        if (imageView3 != null) {
                            IDAListenerS74S0100000_5 iDAListenerS74S0100000_5 = new IDAListenerS74S0100000_5(topRightBannerWidget, 17);
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.1f).setDuration(400L), ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.1f).setDuration(400L), ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(400L));
                            AnimatorSet animatorSet4 = new AnimatorSet();
                            animatorSet4.playTogether(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.SCALE_X, 1.1f, 1.0f).setDuration(400L), ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.SCALE_Y, 1.1f, 1.0f).setDuration(400L));
                            animatorSet2.playSequentially(animatorSet3, animatorSet4);
                            AnimatorSet animatorSet5 = new AnimatorSet();
                            AnimatorSet animatorSet6 = new AnimatorSet();
                            animatorSet6.playTogether(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.6f).setDuration(800L), ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.6f).setDuration(800L), ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.TRANSLATION_X, 0.0f, width2).setDuration(800L), ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.TRANSLATION_Y, 0.0f, height2).setDuration(800L));
                            AnimatorSet animatorSet7 = new AnimatorSet();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.ROTATION, 0.0f, 8.0f).setDuration(120L);
                            ObjectAnimator duration2 = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.ROTATION, 8.0f, -8.0f).setDuration(120L);
                            ObjectAnimator duration3 = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.ROTATION, -8.0f, 0.0f).setDuration(120L);
                            animatorSet7.setStartDelay(1000L);
                            animatorSet7.playSequentially(duration, duration2, duration3);
                            AnimatorSet animatorSet8 = new AnimatorSet();
                            animatorSet8.playTogether(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.SCALE_X, 0.6f, 0.5f).setDuration(400L), ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.SCALE_Y, 0.6f, 0.5f).setDuration(400L), ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(400L));
                            animatorSet8.setStartDelay(2200L);
                            animatorSet5.playTogether(animatorSet6, animatorSet7, animatorSet8);
                            AnimatorSet animatorSet9 = new AnimatorSet();
                            animatorSet9.playSequentially(animatorSet2, animatorSet5);
                            animatorSet9.addListener(iDAListenerS74S0100000_5);
                            topRightBannerWidget.LJLJLJ = animatorSet9;
                            animatorSet9.start();
                            return;
                        }
                        o.LJIJI("mAnimateView");
                        throw null;
                    }
                    o.LJIJI("mAnimateView");
                    throw null;
                }
                o.LJIJI("mAnimateView");
                throw null;
            }
            o.LJIJI("mAnimateView");
            throw null;
        }
        o.LJIJI("mAnimateView");
        throw null;
    }

    public static final void LJIILJJIL$10(IDdS56S0100000_5 iDdS56S0100000_5, int i, int i2, String str) {
        ViewGroup.LayoutParams layoutParams = ((C31644CbQ) iDdS56S0100000_5.l0).getBadgeIcon().getLayoutParams();
        layoutParams.width = (int) (((C15380j0.LJFF(R.dimen.afa) / i2) * i) + 0.5f);
        layoutParams.height = C15380j0.LJFF(R.dimen.afa);
        ((C31644CbQ) iDdS56S0100000_5.l0).getBadgeIcon().setLayoutParams(layoutParams);
    }

    public static final void LJIILJJIL$2(IDdS56S0100000_5 iDdS56S0100000_5, int i, int i2, String str) {
        ViewGroup.LayoutParams layoutParams = ((C47061t0) iDdS56S0100000_5.l0).getLayoutParams();
        layoutParams.width = (int) (layoutParams.height * (i / i2));
        ((C47061t0) iDdS56S0100000_5.l0).setLayoutParams(layoutParams);
    }

    public static final void LJIILJJIL$3(IDdS56S0100000_5 iDdS56S0100000_5, int i, int i2, String str) {
        C29306Beo.LJJLJLI(((ProgrammedLiveFollowCardWidget) iDdS56S0100000_5.l0).LJLJJL);
    }

    public static final void LJIILJJIL$4(IDdS56S0100000_5 iDdS56S0100000_5, int i, int i2, String str) {
        ((AbstractC32678Cs6) iDdS56S0100000_5.l0).h0(i, i2);
    }

    public static final void LJIILJJIL$5(IDdS56S0100000_5 iDdS56S0100000_5, int i, int i2, String str) {
        ((AbstractC32678Cs6) iDdS56S0100000_5.l0).h0(i, i2);
    }

    public static final void LJIILJJIL$6(IDdS56S0100000_5 iDdS56S0100000_5, int i, int i2, String str) {
        ViewGroup.LayoutParams layoutParams = ((C28439BEd) iDdS56S0100000_5.l0).LJLJL.getLayoutParams();
        int LIZ = C15380j0.LIZ(32.0f);
        layoutParams.width = LIZ;
        layoutParams.height = (i2 * LIZ) / i;
        ((C28439BEd) iDdS56S0100000_5.l0).LJLJL.setLayoutParams(layoutParams);
    }

    public static final void LJIILJJIL$7(IDdS56S0100000_5 iDdS56S0100000_5, int i, int i2, String str) {
        ((AbstractC32677Cs5) iDdS56S0100000_5.l0).f0(i, i2);
    }

    public static final void LJIILJJIL$8(IDdS56S0100000_5 iDdS56S0100000_5, int i, int i2, String str) {
        ((AbstractC32677Cs5) iDdS56S0100000_5.l0).f0(i, i2);
    }

    public static final void LJIILJJIL$9(IDdS56S0100000_5 iDdS56S0100000_5, int i, int i2, String str) {
        C32785Ctp.LJIILIIL.getClass();
        C32785Ctp.LJIIJJI("color_change");
        C32609Cqz c32609Cqz = (C32609Cqz) iDdS56S0100000_5.l0;
        ImageView imageView = c32609Cqz.LJLJI;
        if (imageView != null) {
            imageView.postDelayed(new ARunnableS41S0100000_5(c32609Cqz, 317), 100L);
        }
        C47061t0 c47061t0 = ((C32609Cqz) iDdS56S0100000_5.l0).LJLJJI;
        if (c47061t0 != null) {
            C29306Beo.LJJLIIIJJI(c47061t0, true);
        }
        InterfaceC30442Bx8.c.LIZ(Boolean.TRUE);
    }
}
