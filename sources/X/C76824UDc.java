package X;

import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import Y.AUListenerS71S0101000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.guide.LiveGiftGuideWidgetV2;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterEducationSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.GuidePageResource;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS1S0303000_13;
import kotlin.jvm.internal.AqS37S0210000_5;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.UDc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76824UDc implements UDZ {
    public final ImageView LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;
    public final ImageView LIZLLL;
    public final FrameLayout LJ;
    public final C29701Eo LJFF;
    public final TextView LJI;
    public final C47121t6 LJII;
    public final LiveIconView LJIIIIZZ;
    public final LinearLayout LJIIIZ;
    public final ConstraintLayout LJIIJ;
    public final String LJIIJJI;

    public final int hashCode() {
        return this.LJIIJJI.hashCode() + ((this.LJIIJ.hashCode() + ((this.LJIIIZ.hashCode() + ((this.LJIIIIZZ.hashCode() + ((this.LJII.hashCode() + ((this.LJI.hashCode() + ((this.LJFF.hashCode() + ((this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftGuideViewComponent(giftIcon=");
        sb.append(this.LIZ);
        sb.append(", tvTitle=");
        sb.append(this.LIZIZ);
        sb.append(", descriptionTv=");
        sb.append(this.LIZJ);
        sb.append(", userAvatar=");
        sb.append(this.LIZLLL);
        sb.append(", badgeContainer=");
        sb.append(this.LJ);
        sb.append(", lvFirstGift=");
        sb.append(this.LJFF);
        sb.append(", sendButtonText=");
        sb.append(this.LJI);
        sb.append(", sendButtonRight=");
        sb.append(this.LJII);
        sb.append(", crossClose=");
        sb.append(this.LJIIIIZZ);
        sb.append(", sendButtonComb=");
        sb.append(this.LJIIIZ);
        sb.append(", whiteArea=");
        sb.append(this.LJIIJ);
        sb.append(", guideType=");
        return C07670Rv.LIZIZ(sb, this.LJIIJJI, ')');
    }

    public static String LJ() {
        User user;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            user = ((C29374Bfu) LIZIZ).LJ();
        } else {
            user = null;
        }
        String LJIILL = C15380j0.LJIILL(R.string.ln9, C05170If.LIZ(user));
        o.LJIIIIZZ(LJIILL, "getString(R.string.pm_gifting_guide_hi, username)");
        return LJIILL;
    }

    @Override // X.UDZ
    public final ConstraintLayout LIZ() {
        return this.LJIIJ;
    }

    @Override // X.UDZ
    public final void LIZIZ() {
        C76823UDb.LIZ(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76824UDc)) {
            return false;
        }
        C76824UDc c76824UDc = (C76824UDc) obj;
        if (o.LJ(this.LIZ, c76824UDc.LIZ) && o.LJ(this.LIZIZ, c76824UDc.LIZIZ) && o.LJ(this.LIZJ, c76824UDc.LIZJ) && o.LJ(this.LIZLLL, c76824UDc.LIZLLL) && o.LJ(this.LJ, c76824UDc.LJ) && o.LJ(this.LJFF, c76824UDc.LJFF) && o.LJ(this.LJI, c76824UDc.LJI) && o.LJ(this.LJII, c76824UDc.LJII) && o.LJ(this.LJIIIIZZ, c76824UDc.LJIIIIZZ) && o.LJ(this.LJIIIZ, c76824UDc.LJIIIZ) && o.LJ(this.LJIIJ, c76824UDc.LJIIJ) && o.LJ(this.LJIIJJI, c76824UDc.LJIIJJI)) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(int i, boolean z) {
        User user;
        if (o.LJ(this.LJIIJJI, EnumC76826UDe.GIFT_GUIDE_POPUP_BALANCE.getValue()) || z) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LIZJ.setText(C15380j0.LJIILJJIL(R.string.l8a));
        } else {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                user = room.getOwner();
            } else {
                user = null;
            }
            this.LIZJ.setText(C15380j0.LJIILL(R.string.l8_, C05170If.LIZ(user)));
        }
    }

    public static C76831UDj LJFF(Gift gift, GiftGuideMessage giftGuideMessage, boolean z) {
        String title;
        String description;
        C76831UDj c76831UDj;
        Text text;
        String title2;
        Text text2;
        String description2;
        List<Text> list;
        List<Text> list2;
        List<Text> list3;
        if (giftGuideMessage.shouldUseConfig) {
            ImageModel imageModel = gift.image;
            GuidePageResource guidePageResource = (GuidePageResource) ORZ.LJLLLL(giftGuideMessage.guidePageResources);
            Text text3 = null;
            if (guidePageResource != null && (list3 = guidePageResource.texts) != null) {
                text = (Text) ORZ.LJLLLLLL(0, list3);
            } else {
                text = null;
            }
            if (z) {
                title2 = C15380j0.LJIILJJIL(R.string.llr);
                description2 = C15380j0.LJIILJJIL(R.string.lln);
            } else {
                title2 = CXJ.LJFF(text, "").toString();
                if (ujb.o.LJJJJJL(title2)) {
                    title2 = LJ();
                }
                GuidePageResource guidePageResource2 = (GuidePageResource) ORZ.LJLLLL(giftGuideMessage.guidePageResources);
                if (guidePageResource2 == null || (list = guidePageResource2.texts) == null || (text2 = (Text) ORZ.LJLLLLLL(1, list)) == null) {
                    text2 = giftGuideMessage.content;
                }
                description2 = CXJ.LJFF(text2, "").toString();
            }
            GuidePageResource guidePageResource3 = (GuidePageResource) ORZ.LJLLLL(giftGuideMessage.guidePageResources);
            if (guidePageResource3 != null && (list2 = guidePageResource3.texts) != null) {
                text3 = (Text) ORZ.LJLLLLLL(2, list2);
            }
            CharSequence LJFF = CXJ.LJFF(text3, "");
            if (ujb.o.LJJJJJL(LJFF)) {
                LJFF = C15380j0.LJIILJJIL(R.string.t0o);
            }
            o.LJIIIIZZ(title2, "title");
            o.LJIIIIZZ(description2, "description");
            String obj = LJFF.toString();
            if (imageModel != null) {
                c76831UDj = new C76831UDj(title2, description2, obj, imageModel);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            if (z) {
                title = C15380j0.LJIILJJIL(R.string.llr);
                description = C15380j0.LJIILJJIL(R.string.lln);
            } else {
                title = LJ();
                description = C32499CpD.LIZ(giftGuideMessage.content).toString();
            }
            o.LJIIIIZZ(title, "title");
            o.LJIIIIZZ(description, "description");
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.t0o);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.ttlive_send)");
            ImageModel imageModel2 = gift.image;
            if (imageModel2 != null) {
                c76831UDj = new C76831UDj(title, description, LJIILJJIL, imageModel2);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return c76831UDj;
    }

    public static void LJI(float f, int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = (int) (i * f);
        layoutParams.width = i2;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    @Override // X.UDZ
    public final void LIZJ(Context context, DataChannel dataChannel, GiftGuideMessage giftGuideMessage, LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2, int i, AqS136S0200000_5 aqS136S0200000_5, AqS37S0210000_5 aqS37S0210000_5, boolean z) {
        String str;
        boolean z2;
        String LJIILJJIL;
        String LJIILJJIL2;
        String LJIILJJIL3;
        User user;
        String LJIILL;
        String LJIILJJIL4;
        String desc;
        C32207CkV c32207CkV;
        ViewGroup viewGroup;
        if (o.LJ(giftGuideMessage.guideType, "gift_guide_bubble")) {
            C73943T0h.LIZ().LIZIZ(new Object() { // from class: X.0ji
            });
            return;
        }
        if (o.LJ(giftGuideMessage.guideType, EnumC76826UDe.GIFT_GUIDE_MATCH_ITEM_BUBBLE.getValue())) {
            if (giftGuideMessage.guidePageResources.isEmpty() || ((GuidePageResource) ListProtector.get(giftGuideMessage.guidePageResources, 0)).icons.isEmpty() || ((GuidePageResource) ListProtector.get(giftGuideMessage.guidePageResources, 0)).texts.isEmpty()) {
                C73943T0h.LIZ().LIZIZ(new C15920js(Integer.valueOf((int) giftGuideMessage.giftId), null, giftGuideMessage.content));
                return;
            } else {
                C73943T0h.LIZ().LIZIZ(new C15920js(Integer.valueOf((int) giftGuideMessage.giftId), (ImageModel) ListProtector.get(((GuidePageResource) ListProtector.get(giftGuideMessage.guidePageResources, 0)).icons, 0), (Text) ListProtector.get(((GuidePageResource) ListProtector.get(giftGuideMessage.guidePageResources, 0)).texts, 0)));
                return;
            }
        }
        AqS179S0100000_13 aqS179S0100000_13 = new AqS179S0100000_13(aqS136S0200000_5, 499);
        AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(aqS37S0210000_5, 437);
        Gift findGiftById = GiftManager.inst().findGiftById(giftGuideMessage.giftId);
        if (findGiftById != null) {
            if (o.LJ(giftGuideMessage.guideType, EnumC76826UDe.GIFT_GUIDE_POPUP_BALANCE.getValue())) {
                C76831UDj LJFF = LJFF(findGiftById, giftGuideMessage, z);
                String str2 = LJFF.LJLIL;
                String str3 = LJFF.LJLILLLLZI;
                String str4 = LJFF.LJLJI;
                C15650jR.LIZ().LJIIIZ(LJFF.LJLJJI).LJIIJJI(this.LIZ);
                this.LIZIZ.setText(str2);
                this.LIZJ.setText(str3);
                this.LJI.setText(str4);
            } else if (o.LJ(giftGuideMessage.guideType, EnumC76826UDe.GIFT_GUIDE_POPUP_BADGE.getValue())) {
                this.LIZ.setImageResource(R.drawable.d0r);
                TextView textView = this.LIZIZ;
                if (z) {
                    LJIILJJIL4 = C15380j0.LJIILJJIL(R.string.llr);
                } else {
                    LJIILJJIL4 = C15380j0.LJIILJJIL(R.string.kdj);
                }
                textView.setText(LJIILJJIL4);
                if (z) {
                    desc = C15380j0.LJIILJJIL(R.string.lln);
                } else {
                    desc = C15380j0.LJIILJJIL(R.string.kd8);
                }
                o.LJIIIIZZ(desc, "desc");
                int LJJLIIIJL = s.LJJLIIIJL(desc, "{0:image}", 0, false, 6);
                if (LJJLIIIJL > 0) {
                    int LIZ = C15380j0.LIZ(12.0f);
                    int i2 = LJJLIIIJL + 9;
                    SpannableString spannableString = new SpannableString(desc);
                    ColorDrawable colorDrawable = new ColorDrawable(0);
                    colorDrawable.setBounds(0, 0, LIZ, LIZ);
                    C32207CkV c32207CkV2 = new C32207CkV(colorDrawable);
                    spannableString.setSpan(c32207CkV2, LJJLIIIJL, i2, 33);
                    this.LIZJ.setText(spannableString);
                    ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(findGiftById.image, new U5U(new AqS1S0303000_13(spannableString, c32207CkV2, LJJLIIIJL, i2, this, LIZ, 1)));
                } else {
                    this.LIZJ.setText(desc);
                }
                int LIZ2 = C15380j0.LIZ(44.0f);
                LJI(0.9f, LIZ2, this.LIZ);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.15f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                ofFloat.setStartDelay(500L);
                ofFloat.addUpdateListener(new AUListenerS71S0101000_9(this, LIZ2, 3));
                ofFloat.start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.15f, 0.9f);
                ofFloat2.setDuration(300L);
                ofFloat2.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                ofFloat2.setStartDelay(800L);
                ofFloat2.addUpdateListener(new AUListenerS71S0101000_9(this, LIZ2, 4));
                ofFloat2.start();
                C76732zl c76732zl = new C76732zl();
                c76732zl.element = C15380j0.LIZ(29.0f);
                if (CCJ.LIZ(C15380j0.LIZLLL())) {
                    c76732zl.element = -c76732zl.element;
                    this.LIZLLL.setScaleX(-1.0f);
                    this.LJ.setScaleX(-1.0f);
                }
                int LIZ3 = C15380j0.LIZ(-7.0f);
                this.LJ.setVisibility(0);
                this.LJ.setAlpha(0.0f);
                C15640jQ.LJIIIIZZ(this.LIZLLL, ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb());
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.setDuration(350L);
                ofFloat3.setInterpolator(C18950ol.LIZIZ(0.7f, 0.01f, 1.0f, 1.01f));
                ofFloat3.setStartDelay(1100L);
                ofFloat3.addUpdateListener(new LBC(this, LIZ2, c76732zl, LIZ3));
                ofFloat3.start();
            } else if (C76825UDd.LIZIZ(giftGuideMessage)) {
                C29306Beo.LJI(this.LIZ);
                C29306Beo.LJI(this.LJ);
                C29306Beo.LJJLJLI(this.LJFF);
                C29701Eo c29701Eo = this.LJFF;
                String LIZ4 = CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_revenue_demand_1");
                if (C15380j0.LJIIZILJ()) {
                    str = "ttlive_first_gift_small_lottie_rtl.zip";
                } else {
                    str = "ttlive_first_gift_small_lottie_ltr.zip";
                }
                CXY.LIZ(liveGiftGuideWidgetV2, c29701Eo, LIZ4, str, C47261Igj.LJJIJ("image_4"), C47261Igj.LJJIJ(((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarMedium()), C15380j0.LIZ(36.0f), C15380j0.LIZ(36.0f), false);
                EnumC76827UDf.Companion.getClass();
                LiveGiftNewGifterEducationSetting.NewGifterConfig value = LiveGiftNewGifterEducationSetting.INSTANCE.getValue();
                if (value != null && value.giftGuidePopupStyle == EnumC76827UDf.GROUP_1.getValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    TextView textView2 = this.LIZIZ;
                    if (z) {
                        LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.llr);
                    } else {
                        LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.l89);
                    }
                    textView2.setText(LJIILJJIL3);
                    Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                    if (room != null) {
                        user = room.getOwner();
                    } else {
                        user = null;
                    }
                    String LIZ5 = C05170If.LIZ(user);
                    if (z) {
                        LJIILL = C15380j0.LJIILJJIL(R.string.lln);
                    } else {
                        LJIILL = C15380j0.LJIILL(R.string.l8_, LIZ5);
                    }
                    this.LIZJ.setText(LJIILL);
                } else {
                    TextView textView3 = this.LIZIZ;
                    if (z) {
                        LJIILJJIL = C15380j0.LJIILJJIL(R.string.llr);
                    } else {
                        LJIILJJIL = C15380j0.LJIILJJIL(R.string.l89);
                    }
                    textView3.setText(LJIILJJIL);
                    if (z) {
                        LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.lln);
                    } else {
                        LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.l8a);
                    }
                    this.LIZJ.setText(LJIILJJIL2);
                }
            } else {
                C76831UDj LJFF2 = LJFF(findGiftById, giftGuideMessage, z);
                String str5 = LJFF2.LJLIL;
                String str6 = LJFF2.LJLILLLLZI;
                String str7 = LJFF2.LJLJI;
                C15650jR.LIZ().LJIIIZ(LJFF2.LJLJJI).LJIIJJI(this.LIZ);
                this.LIZIZ.setText(str5);
                this.LIZJ.setText(str6);
                this.LJI.setText(str7);
            }
            C47121t6 c47121t6 = this.LJII;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable LIZIZ = C04270Et.LIZIZ(context, R.drawable.d27);
            if (LIZIZ != null) {
                LIZIZ.setBounds(0, 0, C15380j0.LIZ(11.0f), C15380j0.LIZ(11.0f));
                c32207CkV = new C32207CkV(LIZIZ);
            } else {
                c32207CkV = null;
            }
            if (C15380j0.LJIIZILJ()) {
                spannableStringBuilder.append((CharSequence) "(");
                spannableStringBuilder.append((CharSequence) String.valueOf(findGiftById.diamondCount));
                spannableStringBuilder.append((CharSequence) ".");
                spannableStringBuilder.append((CharSequence) ")");
            } else {
                spannableStringBuilder.append((CharSequence) "(");
                spannableStringBuilder.append((CharSequence) ".");
                spannableStringBuilder.append((CharSequence) String.valueOf(findGiftById.diamondCount));
                spannableStringBuilder.append((CharSequence) ")");
            }
            int LJJLIIIJL2 = s.LJJLIIIJL(spannableStringBuilder, ".", 0, false, 6);
            spannableStringBuilder.setSpan(c32207CkV, LJJLIIIJL2, LJJLIIIJL2 + 1, 33);
            c47121t6.setText(spannableStringBuilder);
            ViewParent parent = this.LJIIJ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C16880lQ.LJIIL(viewGroup, new ACListenerS33S0100000_13(aqS179S0100000_13, 166));
            }
            C16880lQ.LJJII(this.LJIIIIZZ, new ACListenerS33S0100000_13(aqS179S0100000_13, 167));
            C16880lQ.LJIIZILJ(this.LJIIIZ, new ACListenerS47S0200000_13(aqS163S0100000_13, aqS179S0100000_13, 38));
        }
        LIZLLL(i, z);
    }

    public C76824UDc(ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, FrameLayout frameLayout, C29701Eo c29701Eo, TextView textView3, C47121t6 c47121t6, LiveIconView liveIconView, LinearLayout linearLayout, ConstraintLayout constraintLayout, String str) {
        this.LIZ = imageView;
        this.LIZIZ = textView;
        this.LIZJ = textView2;
        this.LIZLLL = imageView2;
        this.LJ = frameLayout;
        this.LJFF = c29701Eo;
        this.LJI = textView3;
        this.LJII = c47121t6;
        this.LJIIIIZZ = liveIconView;
        this.LJIIIZ = linearLayout;
        this.LJIIJ = constraintLayout;
        this.LJIIJJI = str;
    }
}
