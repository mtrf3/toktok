package X;

import Y.ARunnableS0S0800000_5;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.LiveLimitedTimeDiscountGiftInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveDiscountGiftPriceHide;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeOptPhase1;
import com.bytedance.android.livesdk.model.Gift;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CoX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32457CoX {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC32458CoY LIZIZ() {
        if (C32696CsO.LIZJ) {
            return EnumC32458CoY.EDUCATION_VERSION;
        }
        if (AbstractC32320CmK.LIZ.LJIIL()) {
            int value = LiveFirstRechargeOptPhase1.INSTANCE.getValue();
            if (value != 1) {
                if (value != 2) {
                    if (value != 3) {
                        return EnumC32458CoY.ONLINE_BEFORE_RECHARGE;
                    }
                    return EnumC32458CoY.NEW_PACK_BEFORE_RECHARGE;
                }
                return EnumC32458CoY.NEW_PACK_BEFORE_RECHARGE;
            }
            return EnumC32458CoY.GIFT_BEFORE_RECHARGE;
        }
        return EnumC32458CoY.ONLINE_RECHARGED;
    }

    public static void LJII(C47121t6 c47121t6) {
        if (c47121t6 != null) {
            C0NB.LIZIZ("LiveFirstRechargeViewHelper", "updateGiftCoinAndPrice");
            int ordinal = LIZIZ().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2) {
                    c47121t6.setText(C15380j0.LJIILJJIL(R.string.o1j));
                    return;
                } else {
                    c47121t6.setText(C15380j0.LJIILJJIL(R.string.llh));
                    return;
                }
            }
            c47121t6.setText(C15380j0.LJIILJJIL(R.string.mon));
        }
    }

    public static void LIZLLL(boolean z, C32334CmY c32334CmY) {
        if (c32334CmY != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateCountdownLabel(selected=");
            LIZ2.append(z);
            LIZ2.append(')');
            C0NB.LIZIZ("LiveFirstRechargeViewHelper", X1D.LIZIZ(LIZ2));
            if (!z && LIZIZ() == EnumC32458CoY.ONLINE_RECHARGED) {
                C29306Beo.LJJLJLI(c32334CmY);
                c32334CmY.LIZIZ();
            } else {
                C29306Beo.LJI(c32334CmY);
            }
        }
    }

    public static void LJ(ImageView imageView, C47121t6 c47121t6) {
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo;
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo2;
        if (imageView != null && c47121t6 != null) {
            C0NB.LIZIZ("LiveFirstRechargeViewHelper", "updateGiftCoinAndPrice");
            int ordinal = LIZIZ().ordinal();
            int i = 0;
            if (ordinal != 0) {
                long j = 0;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                return;
                            }
                        } else {
                            C29306Beo.LJJLJLI(imageView);
                            C29306Beo.LJJLJLI(c47121t6);
                            C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
                            Gift LJI = c32313CmD.LJI();
                            if (LJI != null) {
                                i = LJI.diamondCount;
                            }
                            GiftsInfo giftsInfo = c32313CmD.LJ;
                            if (giftsInfo != null && (liveLimitedTimeDiscountGiftInfo2 = giftsInfo.firstRechargeGiftInfo) != null) {
                                j = liveLimitedTimeDiscountGiftInfo2.originalPrice;
                            }
                            c47121t6.setText(LIZ(i, C15380j0.LIZIZ(R.color.bc), C15380j0.LIZIZ(R.color.be), j));
                            return;
                        }
                    } else {
                        C29306Beo.LJI(imageView);
                        C29306Beo.LJJLJLI(c47121t6);
                        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.llf);
                        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_gi…Panel_rechargePack_Coins)");
                        int LIZIZ = C15380j0.LIZIZ(R.color.ag);
                        SpannableString spannableString = new SpannableString(LJIILJJIL);
                        spannableString.setSpan(new ForegroundColorSpan(LIZIZ), 0, LJIILJJIL.length(), 33);
                        c47121t6.setText(spannableString);
                        return;
                    }
                }
                C29306Beo.LJJLJLI(imageView);
                C29306Beo.LJJLJLI(c47121t6);
                C32313CmD c32313CmD2 = AbstractC32320CmK.LIZ;
                Gift LJI2 = c32313CmD2.LJI();
                if (LJI2 != null) {
                    i = LJI2.diamondCount;
                }
                GiftsInfo giftsInfo2 = c32313CmD2.LJ;
                if (giftsInfo2 != null && (liveLimitedTimeDiscountGiftInfo = giftsInfo2.firstRechargeGiftInfo) != null) {
                    j = liveLimitedTimeDiscountGiftInfo.originalPrice;
                }
                c47121t6.setText(LIZ(i, C15380j0.LIZIZ(R.color.ag), C15380j0.LIZIZ(R.color.a4b), j));
                return;
            }
            C29306Beo.LJI(imageView);
            C29306Beo.LJJLJLI(c47121t6);
            String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.mh3);
            o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_live_foryou)");
            int LIZIZ2 = C15380j0.LIZIZ(R.color.be);
            SpannableString spannableString2 = new SpannableString(LJIILJJIL2);
            spannableString2.setSpan(new ForegroundColorSpan(LIZIZ2), 0, LJIILJJIL2.length(), 33);
            c47121t6.setText(spannableString2);
        }
    }

    public static void LJI(boolean z, C47121t6 c47121t6) {
        String str;
        if (c47121t6 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateGiftName(selected=");
            LIZ2.append(z);
            LIZ2.append(')');
            C0NB.LIZIZ("LiveFirstRechargeViewHelper", X1D.LIZIZ(LIZ2));
            if (z) {
                C29306Beo.LJI(c47121t6);
                return;
            }
            C29306Beo.LJJLJLI(c47121t6);
            int ordinal = LIZIZ().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3 && ordinal != 4) {
                            return;
                        }
                    } else {
                        c47121t6.setText(C15380j0.LJIILJJIL(R.string.l_b));
                        return;
                    }
                }
                if (LiveDiscountGiftPriceHide.INSTANCE.newUi()) {
                    str = C15380j0.LJIILJJIL(R.string.llg);
                } else {
                    Gift LJI = AbstractC32320CmK.LIZ.LJI();
                    if (LJI != null) {
                        str = LJI.name;
                    } else {
                        str = null;
                    }
                }
                c47121t6.setText(str);
                return;
            }
            c47121t6.setText(C15380j0.LJIILJJIL(R.string.mhd));
        }
    }

    public static void LJIIIIZZ(boolean z, C47121t6 c47121t6) {
        if (c47121t6 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateTopRechargeLabel(selected=");
            LIZ2.append(z);
            LIZ2.append(')');
            C0NB.LIZIZ("LiveFirstRechargeViewHelper", X1D.LIZIZ(LIZ2));
            if (z) {
                C29306Beo.LJI(c47121t6);
                return;
            }
            int ordinal = LIZIZ().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        C29306Beo.LJI(c47121t6);
                        return;
                    }
                } else {
                    C29306Beo.LJJLJLI(c47121t6);
                    c47121t6.setText(C15380j0.LJIILJJIL(R.string.lle));
                    return;
                }
            }
            C29306Beo.LJJLJLI(c47121t6);
            c47121t6.setText(C15380j0.LJIILJJIL(R.string.mma));
        }
    }

    public static SpannableString LIZ(long j, int i, int i2, long j2) {
        boolean z = !LiveDiscountGiftPriceHide.INSTANCE.newUi();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("  ");
        if (z) {
            sb.append(j2);
            sb.append(" ");
        }
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, String.valueOf(j).length(), 33);
        if (z) {
            spannableString.setSpan(new StrikethroughSpan(), String.valueOf(j).length() + 1, String.valueOf(j2).length() + String.valueOf(j).length() + 3, 33);
            spannableString.setSpan(new ForegroundColorSpan(i2), String.valueOf(j).length() + 1, String.valueOf(j2).length() + String.valueOf(j).length() + 3, 33);
        }
        return spannableString;
    }

    public static void LJFF(boolean z, C29701Eo c29701Eo, C47061t0 c47061t0, C47061t0 c47061t02, C47061t0 c47061t03) {
        Animation animation;
        if (c29701Eo == null || c47061t0 == null || c47061t02 == null || c47061t03 == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateGiftImage(selected=");
        LIZ2.append(z);
        LIZ2.append(')');
        C0NB.LIZIZ("LiveFirstRechargeViewHelper", X1D.LIZIZ(LIZ2));
        int ordinal = LIZIZ().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            return;
                        }
                    } else {
                        c29701Eo.cancelAnimation();
                        Object tag = c47061t03.getTag();
                        if ((tag instanceof AnimationSet) && (animation = (Animation) tag) != null) {
                            animation.cancel();
                        }
                        C29306Beo.LJI(c29701Eo);
                        C29306Beo.LJI(c47061t03);
                        if (z) {
                            C29306Beo.LJI(c47061t0);
                            C29306Beo.LJJLJLI(c47061t02);
                            return;
                        } else {
                            C29306Beo.LJJLJLI(c47061t0);
                            C29306Beo.LJI(c47061t02);
                            return;
                        }
                    }
                } else {
                    C29306Beo.LJI(c29701Eo);
                    C29306Beo.LJI(c47061t0);
                    C29306Beo.LJI(c47061t02);
                    C29306Beo.LJJLJLI(c47061t03);
                    c47061t03.setImageResource(R.drawable.d1o);
                    C15490jB.LJ(c47061t03, "tiktok_live_revenue_normal_1", "ttlive_first_recharge_coins_v2.png");
                    if (z) {
                        c47061t03.setScaleX(1.0f);
                        c47061t03.setScaleY(1.0f);
                        return;
                    } else {
                        c47061t03.setScaleX(0.8f);
                        c47061t03.setScaleY(0.8f);
                        return;
                    }
                }
            }
            C29306Beo.LJI(c29701Eo);
            C29306Beo.LJI(c47061t03);
            if (z) {
                C29306Beo.LJI(c47061t0);
                C29306Beo.LJJLJLI(c47061t02);
                return;
            } else {
                C29306Beo.LJJLJLI(c47061t0);
                C29306Beo.LJI(c47061t02);
                return;
            }
        }
        C29306Beo.LJJLJLI(c29701Eo);
        C29306Beo.LJI(c47061t0);
        C29306Beo.LJI(c47061t02);
        C29306Beo.LJI(c47061t03);
    }

    public static void LIZJ(boolean z, boolean z2, View view, C29701Eo c29701Eo, C47061t0 c47061t0, C47061t0 c47061t02, C47061t0 c47061t03, C32334CmY c32334CmY, C47121t6 c47121t6, ImageView imageView, C47121t6 c47121t62, View view2, C47121t6 c47121t63) {
        if (view == null || c29701Eo == null || c47061t0 == null || c47061t02 == null || c47061t03 == null || c32334CmY == null || c47121t6 == null || imageView == null || c47121t62 == null || view2 == null || c47121t63 == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onRootAttachedToWindow(selected=");
        LIZ2.append(z);
        LIZ2.append(", firstAttach=");
        LIZ2.append(z2);
        LIZ2.append(')');
        C0NB.LIZIZ("LiveFirstRechargeViewHelper", X1D.LIZIZ(LIZ2));
        int ordinal = LIZIZ().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return;
                    }
                    BZI LIZ3 = C28787BRn.LIZ("livesdk_first_recharge_gift_show");
                    C32456CoW.LIZ(LIZ3);
                    C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
                    LIZ3.LJIJJ(Long.valueOf(c32313CmD.LJII()), "gift_id");
                    LIZ3.LJJIIJZLJL();
                    if (c32313CmD.LJIIIIZZ) {
                        c32313CmD.LJIIIIZZ = false;
                        BZI LIZ4 = C28787BRn.LIZ("livesdk_first_recharge_gift_preview");
                        LIZ4.LJIJJ(C32455CoV.LJIILIIL(), "user_id");
                        LIZ4.LJIJJ(C32455CoV.LJIILL(), "room_id");
                        LIZ4.LJIJJ(C32455CoV.LJIIL(), "anchor_id");
                        LIZ4.LJIJJ(Long.valueOf(c32313CmD.LJII()), "gift_id");
                        LIZ4.LJIJJ("call", "preview_type");
                        LIZ4.LJJIIJZLJL();
                        int value = LiveFirstRechargeOptPhase1.INSTANCE.getValue();
                        if (value != 2 && value != 3) {
                            C0NB.LIZIZ("LiveFirstRechargeViewHelper", "onRootAttachedToWindow transform animation online");
                            view.post(new ARunnableS0S0800000_5(view, c29701Eo, c47061t0, c47061t02, c47061t03, c32334CmY, c47121t6, view2, 1));
                            return;
                        } else {
                            C0NB.LIZIZ("LiveFirstRechargeViewHelper", "onRootAttachedToWindow transform animation exp2/3");
                            view.post(new ARunnableS0S0800000_5(view, c29701Eo, c47061t0, c47061t02, c47061t03, c32334CmY, c47121t6, view2, 0));
                            return;
                        }
                    }
                    C0NB.LIZIZ("LiveFirstRechargeViewHelper", "onRootAttachedToWindow normal recharged animation");
                    return;
                }
                BZI LIZ5 = C28787BRn.LIZ("livesdk_first_recharge_welcome_entrance_show");
                C32456CoW.LIZ(LIZ5);
                LIZ5.LJJIIJZLJL();
                return;
            }
            BZI LIZ6 = C28787BRn.LIZ("livesdk_first_recharge_welcome_entrance_show");
            C32456CoW.LIZ(LIZ6);
            LIZ6.LJJIIJZLJL();
            return;
        }
        BZI LIZ7 = C28787BRn.LIZ("livesdk_first_recharge_welcome_entrance_show");
        C32456CoW.LIZ(LIZ7);
        LIZ7.LJJIIJZLJL();
        C15490jB.LJIIJ(c29701Eo, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_revenue_normal_1"), "ttlive_gift_first_pack_item_lottie.zip", z);
    }
}
