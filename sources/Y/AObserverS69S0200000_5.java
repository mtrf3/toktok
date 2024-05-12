package Y;

import X.AnimationAnimationListenerC31705CcP;
import X.BJP;
import X.C03150Al;
import X.C03200Aq;
import X.C04330Ez;
import X.C09;
import X.C0CM;
import X.C15380j0;
import X.C16880lQ;
import X.C1Q4;
import X.C1YG;
import X.C1YH;
import X.C259910h;
import X.C26338AVi;
import X.C28509BGv;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29813Bmz;
import X.C30244Btw;
import X.C30245Btx;
import X.C30268BuK;
import X.C30770C5u;
import X.C31256COm;
import X.C31415CUp;
import X.C31684Cc4;
import X.C31685Cc5;
import X.C31688Cc8;
import X.C31689Cc9;
import X.C31690CcA;
import X.C31691CcB;
import X.C31692CcC;
import X.C31693CcD;
import X.C31697CcH;
import X.C31698CcI;
import X.C31699CcJ;
import X.C32444CoK;
import X.C32676Cs4;
import X.C32691CsJ;
import X.C32713Csf;
import X.C32721Csn;
import X.C32785Ctp;
import X.C38354F3m;
import X.C47121t6;
import X.C71178Rwc;
import X.C72400SbE;
import X.C76800UCe;
import X.C79272V9g;
import X.C79277V9l;
import X.CN1;
import X.CV3;
import X.CVC;
import X.CVG;
import X.CVH;
import X.EnumC29816Bn2;
import X.EnumC30208BtM;
import X.EnumC30241Btt;
import X.EnumC32734Ct0;
import X.InterfaceC30205BtJ;
import X.InterfaceC30237Btp;
import X.InterfaceC31694CcE;
import X.InterfaceC31710CcU;
import X.InterfaceC88472Yns;
import X.V8L;
import X.X1D;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.extendscreen.StarCommentExtendWidget;
import com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.slot.LivePinCardCheckCurrentBusinessSetting;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotHeightChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FullBottomContainerHeightChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AObserverS69S0200000_5 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onChanged$16(this, obj);
                return;
            case 17:
                onChanged$17(this, obj);
                return;
            case 18:
                onChanged$18(this, obj);
                return;
            case 19:
                onChanged$19(this, obj);
                return;
            case 20:
                onChanged$20(this, obj);
                return;
            case 21:
                onChanged$21(this, obj);
                return;
            case 22:
                onChanged$22(this, obj);
                return;
            case 23:
                onChanged$23(this, obj);
                return;
            case 24:
                onChanged$24(this, obj);
                return;
            case 25:
                onChanged$25(this, obj);
                return;
            case 26:
                onChanged$26(this, obj);
                return;
            case 27:
                onChanged$27(this, obj);
                return;
            case 28:
                onChanged$28(this, obj);
                return;
            case 29:
                onChanged$29(this, obj);
                return;
            case 30:
                onChanged$30(this, obj);
                return;
            case 31:
                onChanged$31(this, obj);
                return;
            case 32:
                onChanged$32(this, obj);
                return;
            case 33:
                onChanged$33(this, obj);
                return;
            case 34:
                onChanged$34(this, obj);
                return;
            case 35:
                onChanged$35(this, obj);
                return;
            case 36:
                onChanged$36(this, obj);
                return;
            case 37:
                onChanged$37(this, obj);
                return;
            case 38:
                onChanged$38(this, obj);
                return;
            case 39:
                onChanged$39(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onChanged$40(this, obj);
                return;
            case 41:
                onChanged$41(this, obj);
                return;
            case 42:
                onChanged$42(this, obj);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onChanged$43(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        boolean z;
        C0CM c0cm;
        Integer it = (Integer) obj;
        List<C32713Csf> value = ((GiftPanelLeafViewModel) aObserverS69S0200000_5.l0).LJLJI.getValue();
        if (value != null) {
            Iterator<C32713Csf> it2 = value.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    int i2 = it2.next().LIZ;
                    if (it != null && i2 == it.intValue()) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            C32676Cs4 c32676Cs4 = (C32676Cs4) aObserverS69S0200000_5.l1;
            int intValue = valueOf.intValue();
            if (intValue != -1 || (c0cm = c32676Cs4.LJZI) == null || intValue != c0cm.getCurrentItem() || c32676Cs4.LLIILZL) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("changing currentItem gift page to type:");
                LIZ.append(it);
                C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ));
                C0CM c0cm2 = c32676Cs4.LJZI;
                if (c0cm2 != null) {
                    c0cm2.setCurrentItem(intValue);
                }
                o.LJIIIIZZ(it, "it");
                c32676Cs4.LJJJJZ(it.intValue());
                int intValue2 = it.intValue();
                if (c32676Cs4.LJJIJIL() != null) {
                    z = GiftPanelLeafViewModel.iv0(intValue2);
                } else {
                    z = false;
                }
                C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
                if (C29306Beo.LJIILLIIL(Boolean.valueOf(c32785Ctp.LJIIL))) {
                    if (c32785Ctp.LJIIJJI) {
                        c32785Ctp.LJIIJJI = false;
                        C32444CoK.LIZ("GiftPanelSwipe", "sending click event");
                        C29813Bmz c29813Bmz = C29813Bmz.LIZ;
                        EnumC29816Bn2 enumC29816Bn2 = EnumC29816Bn2.CLICK;
                        c29813Bmz.getClass();
                        C29813Bmz.LIZ(intValue2, z, enumC29816Bn2);
                        return;
                    }
                    C32444CoK.LIZ("GiftPanelSwipe", "sending swipe event");
                    C29813Bmz c29813Bmz2 = C29813Bmz.LIZ;
                    EnumC29816Bn2 enumC29816Bn22 = EnumC29816Bn2.SWIPE;
                    c29813Bmz2.getClass();
                    C29813Bmz.LIZ(intValue2, z, enumC29816Bn22);
                    return;
                }
                c32785Ctp.LJIIL = false;
            }
        }
    }

    public static final void onChanged$1(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        Drawable drawable = (Drawable) obj;
        if (!Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue())) {
            return;
        }
        ((BottomLeftSlotWidget) aObserverS69S0200000_5.l1).LJLZ();
        ImageView imageView = ((BottomLeftSlotWidget) aObserverS69S0200000_5.l1).LJLJJLL;
        if (drawable == null) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ((BottomLeftSlotWidget) aObserverS69S0200000_5.l1).LJLJJLL.setImageDrawable(drawable);
    }

    public static final void onChanged$10(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        Drawable drawable = (Drawable) obj;
        if (!o.LJ(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue(), Boolean.TRUE)) {
            return;
        }
        ((C31699CcJ) aObserverS69S0200000_5.l1).LIZJ();
        ImageView imageView = ((C31699CcJ) aObserverS69S0200000_5.l1).LJLLLL;
        if (imageView == null) {
            return;
        }
        if (drawable == null) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        imageView.setImageDrawable(drawable);
    }

    public static final void onChanged$11(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        String str = (String) obj;
        if (!o.LJ(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue(), Boolean.TRUE) || ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLL.getValue() != null) {
            return;
        }
        ((C31699CcJ) aObserverS69S0200000_5.l1).LIZJ();
        TextView textView = ((C31699CcJ) aObserverS69S0200000_5.l1).LJLLLLLL;
        if (textView != null) {
            if (TextUtils.isEmpty(str)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            textView.setText(str);
        }
        C31699CcJ c31699CcJ = (C31699CcJ) aObserverS69S0200000_5.l1;
        if (str != null) {
            c31699CcJ.getClass();
            if (str.length() > 1) {
                TextView textView2 = c31699CcJ.LJLLLLLL;
                if (textView2 == null) {
                    return;
                }
                textView2.setMaxWidth(C15380j0.LIZ(36.0f));
                C26338AVi.LJIIIZ(textView2, Integer.valueOf(C15380j0.LIZ(5.0f)), 0, Integer.valueOf(C15380j0.LIZ(5.0f)), 0, 16);
                return;
            }
        }
        TextView textView3 = c31699CcJ.LJLLLLLL;
        if (textView3 == null) {
            return;
        }
        textView3.setMaxWidth(C15380j0.LIZ(15.0f));
        C26338AVi.LJIIIZ(textView3, 0, 0, 0, 0, 16);
    }

    public static final void onChanged$12(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        if (!o.LJ(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue(), Boolean.TRUE)) {
            return;
        }
        C31699CcJ c31699CcJ = (C31699CcJ) aObserverS69S0200000_5.l1;
        Drawable value = ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJLJ.getValue();
        if (value != null) {
            ImageView imageView = c31699CcJ.LJLLI;
            if (imageView == null) {
                return;
            }
            imageView.setImageDrawable(value);
            return;
        }
        c31699CcJ.getClass();
    }

    public static final void onChanged$13(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        Drawable drawable = (Drawable) obj;
        if (!o.LJ(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue(), Boolean.TRUE)) {
            return;
        }
        C31699CcJ c31699CcJ = (C31699CcJ) aObserverS69S0200000_5.l1;
        if (drawable != null) {
            ImageView imageView = c31699CcJ.LJLLI;
            if (imageView == null) {
                return;
            }
            imageView.setImageDrawable(drawable);
            return;
        }
        c31699CcJ.getClass();
    }

    public static final void onChanged$14(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        C47121t6 c47121t6;
        String str = (String) obj;
        if (!o.LJ(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue(), Boolean.TRUE) || (c47121t6 = ((C31699CcJ) aObserverS69S0200000_5.l1).LJLLJ) == null) {
            return;
        }
        c47121t6.setText(str);
    }

    public static final void onChanged$15(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        List<String> list;
        C31697CcH c31697CcH = (C31697CcH) obj;
        if (c31697CcH == null || c31697CcH.LIZIZ == null || (list = c31697CcH.LIZ) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = (String) ListProtector.get(list, i);
            int size2 = arrayList.size();
            if (size2 >= ((ArrayList) ((C31699CcJ) aObserverS69S0200000_5.l0).LLFFF).size()) {
                break;
            }
            if (str != null) {
                V8L LIZIZ = V8L.LIZIZ(C15380j0.LIZ(4.0f));
                Context context = ((C31699CcJ) aObserverS69S0200000_5.l0).LJLIL;
                if (context != null) {
                    LIZIZ.LJFF = C259910h.LIZIZ(R.attr.ar7, context);
                    LIZIZ.LIZLLL(C15380j0.LIZ(1.0f));
                }
                C31698CcI c31698CcI = (C31698CcI) ListProtector.get(((C31699CcJ) aObserverS69S0200000_5.l0).LLFFF, size2);
                arrayList.add(new C79277V9l(str, c31698CcI.LIZ, c31698CcI.LIZIZ, LIZIZ, c31698CcI.LIZJ, c31698CcI.LIZLLL));
            }
        }
        C31699CcJ c31699CcJ = (C31699CcJ) aObserverS69S0200000_5.l0;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS69S0200000_5.l1;
        String str2 = c31697CcH.LIZIZ;
        o.LJIIIIZZ(str2, "tipsInfoWithIconList.tipsText");
        IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) aObserverS69S0200000_5.l1;
        long j = slotViewModel2.LL;
        InterfaceC31694CcE interfaceC31694CcE = slotViewModel2.LLFII;
        C71178Rwc c71178Rwc = slotViewModel2.LLFZ;
        c31699CcJ.getClass();
        C72400SbE c72400SbE = new C72400SbE(slotViewModel);
        c31699CcJ.LLF = c72400SbE;
        c72400SbE.LIZIZ(arrayList, new C79272V9g(arrayList, c31699CcJ, str2, j, interfaceC31694CcE, c71178Rwc));
    }

    public static final void onChanged$16(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        ImageView alertImageView;
        ImageView alertImageView2;
        Drawable drawable = (Drawable) obj;
        if (C29306Beo.LJIL(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue())) {
            return;
        }
        C31685Cc5 c31685Cc5 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
        if (c31685Cc5 != null) {
            c31685Cc5.LJJLJLI();
        }
        C31685Cc5 c31685Cc52 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
        if (c31685Cc52 != null && (alertImageView2 = c31685Cc52.getAlertImageView()) != null) {
            int i = 0;
            if (drawable == null) {
                i = 8;
            }
            alertImageView2.setVisibility(i);
        }
        C31685Cc5 c31685Cc53 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
        if (c31685Cc53 == null || (alertImageView = c31685Cc53.getAlertImageView()) == null) {
            return;
        }
        alertImageView.setImageDrawable(drawable);
    }

    public static final void onChanged$17(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        C31685Cc5 c31685Cc5;
        View redDotView;
        Boolean bool = (Boolean) obj;
        if (C29306Beo.LJIL(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue())) {
            return;
        }
        int i = 0;
        if (((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLL.getValue() != null || !TextUtils.isEmpty(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJJI.getValue())) {
            return;
        }
        C31685Cc5 c31685Cc52 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
        if (c31685Cc52 != null) {
            c31685Cc52.LJJLJLI();
        }
        if (((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LLFFF(C29306Beo.LJJIFFI(bool)) || (c31685Cc5 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI) == null || (redDotView = c31685Cc5.getRedDotView()) == null) {
            return;
        }
        if (!C29306Beo.LJJIFFI(bool)) {
            i = 8;
        }
        redDotView.setVisibility(i);
    }

    public static final void onChanged$18(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        TextView alertText;
        TextView alertText2;
        TextView alertText3;
        TextView alertText4;
        String str = (String) obj;
        if (C29306Beo.LJIL(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue())) {
            return;
        }
        Boolean bool = ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LLIFFJFJJ;
        o.LJIIIIZZ(bool, "viewModel.gamePartnershipBusiness");
        int i = 8;
        if (bool.booleanValue()) {
            C31685Cc5 c31685Cc5 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
            if (c31685Cc5 != null) {
                c31685Cc5.LJJLJLI();
            }
            C31685Cc5 c31685Cc52 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
            if (c31685Cc52 != null && (alertText4 = c31685Cc52.getAlertText()) != null) {
                alertText4.setVisibility(8);
            }
            C31685Cc5 c31685Cc53 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
            if (c31685Cc53 == null || (alertText3 = c31685Cc53.getAlertText()) == null) {
                return;
            }
            alertText3.setText("");
            return;
        }
        if (((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLL.getValue() != null) {
            return;
        }
        C31685Cc5 c31685Cc54 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
        if (c31685Cc54 != null) {
            c31685Cc54.LJJLJLI();
        }
        C31685Cc5 c31685Cc55 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
        if (c31685Cc55 != null && (alertText2 = c31685Cc55.getAlertText()) != null) {
            if (!TextUtils.isEmpty(str)) {
                i = 0;
            }
            alertText2.setVisibility(i);
        }
        C31685Cc5 c31685Cc56 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
        if (c31685Cc56 == null || (alertText = c31685Cc56.getAlertText()) == null) {
            return;
        }
        alertText.setText(str);
    }

    public static final void onChanged$19(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        ImageView imageView;
        String str = (String) obj;
        if (C29306Beo.LJIL(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue())) {
            return;
        }
        C31685Cc5 c31685Cc5 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
        if (c31685Cc5 != null) {
            imageView = c31685Cc5.getIconView();
        } else {
            imageView = null;
        }
        C1YG c1yg = new C1YG(imageView);
        c1yg.LJIILLIIL = str;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0;
        c1yg.LJIIL = new C31693CcD(slotViewModel);
        c1yg.LJI = slotViewModel.LL;
        c1yg.LJII = true;
        C30770C5u.LIZLLL(new C1YH(c1yg), C09.GUIDE_SELL_SERIES);
    }

    public static final void onChanged$2(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        if (!Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue())) {
            return;
        }
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLL.getValue() != null || !TextUtils.isEmpty(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJJI.getValue())) {
            return;
        }
        ((BottomLeftSlotWidget) aObserverS69S0200000_5.l1).LJLZ();
        View view = ((BottomLeftSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
        if (bool.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public static final void onChanged$20(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        C31685Cc5 c31685Cc5;
        ImageView iconView;
        ImageView iconView2;
        Drawable drawable = (Drawable) obj;
        if (C29306Beo.LJIL(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue())) {
            return;
        }
        C31685Cc5 c31685Cc52 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI;
        if (c31685Cc52 != null && (iconView2 = c31685Cc52.getIconView()) != null) {
            iconView2.setImageDrawable(drawable);
        }
        if (!o.LJ(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LLIFFJFJJ, Boolean.TRUE) || (c31685Cc5 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI) == null || (iconView = c31685Cc5.getIconView()) == null) {
            return;
        }
        iconView.setAlpha(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LLII);
    }

    public static final void onChanged$21(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        C31685Cc5 c31685Cc5;
        TextView textView;
        String str = (String) obj;
        if (C29306Beo.LJIL(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue()) || (c31685Cc5 = ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).LJLJJI) == null || (textView = c31685Cc5.getTextView()) == null) {
            return;
        }
        textView.setText(str);
    }

    public static final void onChanged$22(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (C29306Beo.LJIL(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue())) {
            return;
        }
        Boolean bool2 = ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LLIFFJFJJ;
        o.LJIIIIZZ(bool2, "viewModel.gamePartnershipBusiness");
        if (!bool2.booleanValue()) {
            return;
        }
        if (bool.booleanValue()) {
            ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).show();
        } else {
            ((PreviewBaseSlotWidget) aObserverS69S0200000_5.l1).hide();
        }
    }

    public static final void onChanged$23(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        ((C32691CsJ) aObserverS69S0200000_5.l0).LJLZ((C32721Csn) aObserverS69S0200000_5.l1, (EnumC32734Ct0) obj);
    }

    public static final void onChanged$24(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        String str;
        Boolean bool = (Boolean) obj;
        InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(((C31692CcC) aObserverS69S0200000_5.l1).LJLLLL);
        if (pk != null) {
            if (bool.booleanValue()) {
                pk.LJIJI(EnumC30208BtM.AUDIENCE_SLOT, ((C31692CcC) aObserverS69S0200000_5.l1).LJLLLL);
            } else {
                pk.LJIIJ(EnumC30208BtM.AUDIENCE_SLOT, ((C31692CcC) aObserverS69S0200000_5.l1).LJLLLL);
            }
        }
        InterfaceC30237Btp interfaceC30237Btp = ((C31692CcC) aObserverS69S0200000_5.l1).LJLJJL;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            i = 0;
        } else {
            i = 8;
        }
        interfaceC30237Btp.setVisibility(i);
        if (bool2.equals(bool)) {
            ((InterfaceC31710CcU) aObserverS69S0200000_5.l0).LLJJL("during_live");
        }
        if (bool2.equals(bool)) {
            str = ((InterfaceC31710CcU) aObserverS69S0200000_5.l0).LIZ();
        } else {
            str = "";
        }
        BJP.LIZIZ(str);
        HashMap hashMap = new HashMap();
        C31692CcC c31692CcC = (C31692CcC) aObserverS69S0200000_5.l1;
        if (!c31692CcC.LJLLJ) {
            C31688Cc8.LIZ(((C31692CcC) aObserverS69S0200000_5.l1).LJLLL, hashMap, c31692CcC.LJLJI.getDataContainer());
            C31684Cc4.LJFF((InterfaceC31710CcU) aObserverS69S0200000_5.l0, hashMap);
        }
        InterfaceC31710CcU interfaceC31710CcU = (InterfaceC31710CcU) aObserverS69S0200000_5.l0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("slot visible change, visible: ");
        LIZ.append(bool);
        C31684Cc4.LIZJ("ToolbarAudienceSlotBehavior", interfaceC31710CcU, X1D.LIZIZ(LIZ), hashMap);
        ((C31692CcC) aObserverS69S0200000_5.l1).LJLLJ = true;
    }

    public static final void onChanged$25(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLL.getValue() == null && TextUtils.isEmpty(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJJI.getValue())) {
            ((C31692CcC) aObserverS69S0200000_5.l1).LIZ();
            View view = ((C31692CcC) aObserverS69S0200000_5.l1).LJLJL;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public static final void onChanged$26(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        String str = (String) obj;
        if (((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLL.getValue() == null) {
            ((C31692CcC) aObserverS69S0200000_5.l1).LIZ();
            TextView textView = ((C31692CcC) aObserverS69S0200000_5.l1).LJLJLJ;
            if (TextUtils.isEmpty(str)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            ((C31692CcC) aObserverS69S0200000_5.l1).LJLJLJ.setText(str);
        }
    }

    public static final void onChanged$27(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        C31692CcC c31692CcC = (C31692CcC) aObserverS69S0200000_5.l1;
        Drawable value = ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJLJ.getValue();
        if (value != null) {
            c31692CcC.LJLJJLL.setIcon(value);
        } else {
            c31692CcC.getClass();
        }
    }

    public static final void onChanged$28(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        Drawable drawable = (Drawable) obj;
        C31692CcC c31692CcC = (C31692CcC) aObserverS69S0200000_5.l1;
        ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJL.getValue();
        if (drawable != null) {
            c31692CcC.LJLJJLL.setIcon(drawable);
        } else {
            c31692CcC.getClass();
        }
    }

    public static final void onChanged$29(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        String str = (String) obj;
        if (!Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLILLLLZI.getValue())) {
            return;
        }
        C31692CcC c31692CcC = (C31692CcC) aObserverS69S0200000_5.l1;
        long j = ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LL;
        c31692CcC.getClass();
        C1YG c1yg = new C1YG(c31692CcC.LJLJJL.LJFF());
        c1yg.LJIILLIIL = str;
        c1yg.LJIIL = new C31691CcB(c31692CcC);
        c1yg.LJI = j;
        c1yg.LJII = true;
        C30770C5u.LIZLLL(new C1YH(c1yg), C09.ANCHOR_COMMERCE_ADD_PRODUCT);
    }

    public static final void onChanged$3(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        String str = (String) obj;
        if (!Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue()) || ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLL.getValue() != null) {
            return;
        }
        ((BottomLeftSlotWidget) aObserverS69S0200000_5.l1).LJLZ();
        TextView textView = ((BottomLeftSlotWidget) aObserverS69S0200000_5.l1).LJLJJL;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        ((BottomLeftSlotWidget) aObserverS69S0200000_5.l1).LJLJJL.setText(str);
        BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aObserverS69S0200000_5.l1;
        if (str != null) {
            bottomLeftSlotWidget.getClass();
            if (str.length() > 1) {
                bottomLeftSlotWidget.LJLJJL.setMaxWidth(C15380j0.LIZ(36.0f));
                bottomLeftSlotWidget.LJLJJL.setPadding(C15380j0.LIZ(5.0f), 0, C15380j0.LIZ(5.0f), 0);
                return;
            }
        }
        bottomLeftSlotWidget.LJLJJL.setMaxWidth(C15380j0.LIZ(15.0f));
        bottomLeftSlotWidget.LJLJJL.setPadding(0, 0, 0, 0);
    }

    public static final void onChanged$30(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        Boolean it = (Boolean) obj;
        if (o.LJ(Boolean.valueOf(((LiveDrawerDialogV3) aObserverS69S0200000_5.l0).LJLLI), it)) {
            return;
        }
        LiveDrawerDialogV3 liveDrawerDialogV3 = (LiveDrawerDialogV3) aObserverS69S0200000_5.l0;
        o.LJIIIIZZ(it, "it");
        liveDrawerDialogV3.LJLLI = it.booleanValue();
        C47121t6 c47121t6 = (C47121t6) aObserverS69S0200000_5.l1;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setText(((LiveDrawerDialogV3) aObserverS69S0200000_5.l0).xl(it.booleanValue()));
    }

    public static final void onChanged$31(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        C31689Cc9 c31689Cc9 = (C31689Cc9) aObserverS69S0200000_5.l0;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS69S0200000_5.l1;
        Boolean bool = (Boolean) obj;
        c31689Cc9.getClass();
        Animator animator = slotViewModel.LLI;
        if (animator != null) {
            if (bool.booleanValue()) {
                animator.setTarget(c31689Cc9.LJLJLJ);
                animator.start();
            } else {
                if (animator.isRunning()) {
                    animator.cancel();
                }
                animator.setTarget(null);
            }
        }
    }

    public static final void onChanged$32(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        InterfaceC30237Btp interfaceC30237Btp = ((C31689Cc9) aObserverS69S0200000_5.l1).LJLJJI;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(obj)) {
            i = 0;
        } else {
            i = 8;
        }
        interfaceC30237Btp.setVisibility(i);
        if (bool.equals(obj)) {
            ((InterfaceC31710CcU) aObserverS69S0200000_5.l0).LLJJL("during_live");
        }
        HashMap hashMap = new HashMap();
        C31689Cc9 c31689Cc9 = (C31689Cc9) aObserverS69S0200000_5.l1;
        if (!c31689Cc9.LJLLILLLL) {
            long LIZ = C31684Cc4.LIZ("param_live_slot_start_time_long", c31689Cc9.LJLJI.getDataContainer());
            if (LIZ > 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(SystemClock.uptimeMillis() - LIZ);
                LIZ2.append("");
                hashMap.put("all_time", X1D.LIZIZ(LIZ2));
            }
            if (((C31689Cc9) aObserverS69S0200000_5.l1).LJLLJ > 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(SystemClock.uptimeMillis() - ((C31689Cc9) aObserverS69S0200000_5.l1).LJLLJ);
                LIZ3.append("");
                hashMap.put("load_time", X1D.LIZIZ(LIZ3));
            }
            C31684Cc4.LJFF((InterfaceC31710CcU) aObserverS69S0200000_5.l0, hashMap);
        }
        InterfaceC31710CcU interfaceC31710CcU = (InterfaceC31710CcU) aObserverS69S0200000_5.l0;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("slot visible change, visible: ");
        LIZ4.append(obj);
        C31684Cc4.LIZJ("ToolbarBroadcastSlotBehavior", interfaceC31710CcU, X1D.LIZIZ(LIZ4), hashMap);
        ((C31689Cc9) aObserverS69S0200000_5.l1).LJLLILLLL = true;
    }

    public static final void onChanged$33(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLL.getValue() == null && TextUtils.isEmpty(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJJI.getValue())) {
            ((C31689Cc9) aObserverS69S0200000_5.l1).LIZ();
            View view = ((C31689Cc9) aObserverS69S0200000_5.l1).LJLJJLL;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public static final void onChanged$34(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        String str = (String) obj;
        if (((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLL.getValue() == null) {
            ((C31689Cc9) aObserverS69S0200000_5.l1).LIZ();
            TextView textView = ((C31689Cc9) aObserverS69S0200000_5.l1).LJLJL;
            if (TextUtils.isEmpty(str)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            ((C31689Cc9) aObserverS69S0200000_5.l1).LJLJL.setText(str);
        }
    }

    public static final void onChanged$35(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        Drawable drawable = (Drawable) obj;
        C31689Cc9 c31689Cc9 = (C31689Cc9) aObserverS69S0200000_5.l1;
        if (c31689Cc9.LJLLI) {
            c31689Cc9.LIZIZ(drawable, ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJLJ.getValue());
            return;
        }
        if (drawable instanceof C1Q4) {
            drawable.setTint(C04330Ez.LIZIZ(c31689Cc9.LJLJJL.getContext(), R.color.aat));
        }
        c31689Cc9.LJLJJL.setIcon(drawable);
    }

    public static final void onChanged$36(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        Drawable drawable = (Drawable) obj;
        C31689Cc9 c31689Cc9 = (C31689Cc9) aObserverS69S0200000_5.l1;
        if (c31689Cc9.LJLLI) {
            c31689Cc9.LIZIZ(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJL.getValue(), drawable);
            return;
        }
        if (drawable instanceof C1Q4) {
            drawable.setTint(C04330Ez.LIZIZ(c31689Cc9.LJLJJL.getContext(), R.color.aat));
        }
        c31689Cc9.LJLJJL.setIcon(drawable);
    }

    public static final void onChanged$37(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        String str = (String) obj;
        if (!Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLILLLLZI.getValue())) {
            return;
        }
        C31689Cc9 c31689Cc9 = (C31689Cc9) aObserverS69S0200000_5.l1;
        long j = ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LL;
        c31689Cc9.getClass();
        C1YG c1yg = new C1YG(c31689Cc9.LJLJJI.LJFF());
        c1yg.LJIILLIIL = str;
        c1yg.LJIIL = new C31690CcA(c31689Cc9);
        c1yg.LJI = j;
        c1yg.LJII = true;
        C30770C5u.LIZLLL(new C1YH(c1yg), C09.ANCHOR_COMMERCE_ADD_PRODUCT);
    }

    public static final void onChanged$38(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        C30268BuK c30268BuK = (C30268BuK) obj;
        if (c30268BuK.LIZIZ) {
            if (c30268BuK.LIZ) {
                C30245Btx c30245Btx = (C30245Btx) aObserverS69S0200000_5.l0;
                EnumC30241Btt enumC30241Btt = (EnumC30241Btt) aObserverS69S0200000_5.l1;
                if (C28509BGv.LIZIZ((LiveMode) c30245Btx.LIZLLL.getValue())) {
                    return;
                }
                c30245Btx.LIZIZ.add(enumC30241Btt);
                c30245Btx.LIZJ();
                return;
            }
            C30245Btx c30245Btx2 = (C30245Btx) aObserverS69S0200000_5.l0;
            EnumC30241Btt enumC30241Btt2 = (EnumC30241Btt) aObserverS69S0200000_5.l1;
            if (C28509BGv.LIZIZ((LiveMode) c30245Btx2.LIZLLL.getValue())) {
                return;
            }
            c30245Btx2.LIZIZ.remove(enumC30241Btt2);
            c30245Btx2.LIZJ();
        }
    }

    public static final void onChanged$39(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        C30268BuK c30268BuK = (C30268BuK) obj;
        if (c30268BuK.LIZIZ) {
            if (c30268BuK.LIZ) {
                C30244Btw c30244Btw = (C30244Btw) aObserverS69S0200000_5.l0;
                EnumC30241Btt enumC30241Btt = (EnumC30241Btt) aObserverS69S0200000_5.l1;
                c30244Btw.LIZIZ.add(enumC30241Btt);
                if (c30244Btw.LJ.contains(enumC30241Btt)) {
                    c30244Btw.LIZLLL.add(enumC30241Btt);
                }
                c30244Btw.LIZJ();
                return;
            }
            C30244Btw c30244Btw2 = (C30244Btw) aObserverS69S0200000_5.l0;
            EnumC30241Btt enumC30241Btt2 = (EnumC30241Btt) aObserverS69S0200000_5.l1;
            if (c30244Btw2.LIZJ.remove(enumC30241Btt2)) {
                c30244Btw2.LIZJ.remove(enumC30241Btt2);
            } else {
                c30244Btw2.LIZIZ.remove(enumC30241Btt2);
            }
            if (c30244Btw2.LJ.contains(enumC30241Btt2)) {
                c30244Btw2.LIZLLL.remove(enumC30241Btt2);
            }
            c30244Btw2.LIZJ();
        }
    }

    public static final void onChanged$4(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        if (!Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue())) {
            return;
        }
        BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aObserverS69S0200000_5.l1;
        Drawable value = ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJLJ.getValue();
        if (value != null) {
            bottomLeftSlotWidget.LJLILLLLZI.setImageDrawable(value);
        } else {
            bottomLeftSlotWidget.getClass();
        }
    }

    public static final void onChanged$40(AObserverS69S0200000_5 aObserverS69S0200000_5, Object it) {
        if (it != ((User) aObserverS69S0200000_5.l0)) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aObserverS69S0200000_5.l1;
            o.LJIIIIZZ(it, "it");
            interfaceC88472Yns.invoke(it);
        }
    }

    public static final void onChanged$41(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        boolean z;
        CVG cvg = (CVG) obj;
        C31256COm c31256COm = ((StarCommentExtendWidget) aObserverS69S0200000_5.l0).LJLILLLLZI;
        if (c31256COm != null && !c31256COm.canScrollVertically(1)) {
            z = true;
        } else {
            z = false;
        }
        ((C31415CUp) aObserverS69S0200000_5.l1).LJLZ(cvg.LIZ);
        CVH cvh = cvg.LIZJ;
        if (cvh == CVH.INSERT) {
            ((C31415CUp) aObserverS69S0200000_5.l1).notifyItemInserted(cvg.LIZIZ);
        } else if (cvh == CVH.REPLACE) {
            ((C31415CUp) aObserverS69S0200000_5.l1).notifyItemChanged(cvg.LIZIZ);
        }
        if (z) {
            StarCommentExtendWidget starCommentExtendWidget = (StarCommentExtendWidget) aObserverS69S0200000_5.l0;
            C31256COm c31256COm2 = starCommentExtendWidget.LJLILLLLZI;
            if (c31256COm2 != null) {
                c31256COm2.setPendingScroll(true);
            }
            starCommentExtendWidget.LJLJJI = true;
            StarCommentExtendWidget starCommentExtendWidget2 = (StarCommentExtendWidget) aObserverS69S0200000_5.l0;
            C31256COm c31256COm3 = starCommentExtendWidget2.LJLILLLLZI;
            if (c31256COm3 != null) {
                c31256COm3.postDelayed(new ARunnableS24S0200000_5(starCommentExtendWidget2, (C31415CUp) aObserverS69S0200000_5.l1, 78), 100L);
            }
        }
        TextView textView = ((StarCommentExtendWidget) aObserverS69S0200000_5.l0).LJLIL;
        if (textView == null) {
            return;
        }
        textView.setText(C15380j0.LJIILL(R.string.o4h, Integer.valueOf(((C31415CUp) aObserverS69S0200000_5.l1).LJLIL.size())));
    }

    public static final void onChanged$42(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object obj2 = ListProtector.get(list, i);
            i++;
            ((CVC) obj2).LJLLL = i;
            arrayList.add(obj2);
        }
        List<?> list2 = ((C31415CUp) aObserverS69S0200000_5.l0).LJLIL;
        o.LJIIIIZZ(list2, "adapter.items");
        ((C31415CUp) aObserverS69S0200000_5.l0).LJLZ(arrayList);
        if (!list2.isEmpty()) {
            try {
                C03150Al LIZ = C03200Aq.LIZ(new CV3(list2, arrayList), false);
                C31415CUp c31415CUp = (C31415CUp) aObserverS69S0200000_5.l0;
                o.LJII(c31415CUp, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
                LIZ.LIZJ(c31415CUp);
            } catch (Exception unused) {
            }
        }
        ((StarCommentManageDialog) aObserverS69S0200000_5.l1).vl(list2.isEmpty());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (r0 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$43(Y.AObserverS69S0200000_5 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS69S0200000_5.onChanged$43(Y.AObserverS69S0200000_5, java.lang.Object):void");
    }

    public static final void onChanged$5(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        Drawable drawable = (Drawable) obj;
        if (!Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue())) {
            return;
        }
        BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aObserverS69S0200000_5.l1;
        ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJL.getValue();
        if (drawable != null) {
            bottomLeftSlotWidget.LJLILLLLZI.setImageDrawable(drawable);
        } else {
            bottomLeftSlotWidget.getClass();
        }
    }

    public static final void onChanged$6(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        boolean z;
        String str;
        Pair pair = (Pair) obj;
        if (!LivePinCardCheckCurrentBusinessSetting.INSTANCE.isEnabled() || (str = ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).LJLJLLL) == null || (pair != null && (C38354F3m.LIZJ((String) pair.second, str) || C38354F3m.LIZJ((String) pair.second, "visibility_reason_conflict") || C38354F3m.LIZJ((String) pair.second, "visibility_reason_dispose")))) {
            z = true;
        } else {
            z = false;
        }
        if (((FrameL2SlotWidget) aObserverS69S0200000_5.l1).getView() == null || pair == null || !z) {
            return;
        }
        IFrameSlot iFrameSlot = (IFrameSlot) ((InterfaceC31710CcU) aObserverS69S0200000_5.l0).LLJJJIL();
        Object obj2 = pair.first;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(obj2)) {
            FrameL2SlotWidget frameL2SlotWidget = (FrameL2SlotWidget) aObserverS69S0200000_5.l1;
            frameL2SlotWidget.LJLJLLL = (String) pair.second;
            if (!(frameL2SlotWidget.getView() instanceof ViewGroup)) {
                return;
            }
            if (((FrameL2SlotWidget) aObserverS69S0200000_5.l1).isShowing()) {
                View view = ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).getView();
                Objects.requireNonNull(view);
                if (((ViewGroup) view).getChildCount() > 0) {
                    return;
                }
            }
            if (C29232Bdc.LJFF(((FrameL2SlotWidget) aObserverS69S0200000_5.l1).dataChannel)) {
                return;
            }
            ((ViewGroup) ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).getView()).removeAllViews();
            FrameL2SlotWidget frameL2SlotWidget2 = (FrameL2SlotWidget) aObserverS69S0200000_5.l1;
            frameL2SlotWidget2.LJLJI = iFrameSlot.LJFF(frameL2SlotWidget2.getContext());
            FrameL2SlotWidget frameL2SlotWidget3 = (FrameL2SlotWidget) aObserverS69S0200000_5.l1;
            if (frameL2SlotWidget3.LJLJI == null) {
                return;
            }
            ((ViewGroup) frameL2SlotWidget3.getView()).addView(((FrameL2SlotWidget) aObserverS69S0200000_5.l1).LJLJI);
            if (((FrameL2SlotWidget) aObserverS69S0200000_5.l1).LJLJJI) {
                return;
            }
            ((InterfaceC31710CcU) aObserverS69S0200000_5.l0).LLJJL("during_live");
            ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).show();
            HashMap hashMap = new HashMap();
            FrameL2SlotWidget frameL2SlotWidget4 = (FrameL2SlotWidget) aObserverS69S0200000_5.l1;
            if (!frameL2SlotWidget4.LJLJJLL) {
                C31688Cc8.LIZ(((FrameL2SlotWidget) aObserverS69S0200000_5.l1).LJLJL, hashMap, frameL2SlotWidget4.LJLIL.getDataContainer());
                C31684Cc4.LJFF((InterfaceC31710CcU) aObserverS69S0200000_5.l0, hashMap);
            }
            ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).LJLJJLL = true;
            C31684Cc4.LIZJ("FrameL2SlotWidget", (InterfaceC31710CcU) aObserverS69S0200000_5.l0, "slot visible change, visible: true", hashMap);
            DataChannel dataChannel = ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(FrameL2SlotVisibilityChannel.class, bool);
            }
            Animation LIZJ = iFrameSlot.LIZJ();
            if (LIZJ != null) {
                ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).LJLJI.startAnimation(LIZJ);
                C31684Cc4.LIZIZ("FrameL2SlotWidget", (InterfaceC31710CcU) aObserverS69S0200000_5.l0, "slot start in anim");
            }
            if (!((FrameL2SlotWidget) aObserverS69S0200000_5.l1).LJLJI.hasOnClickListeners()) {
                C16880lQ.LJIIJ(new ACListenerS40S0200000_5(aObserverS69S0200000_5, iFrameSlot, 3), ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).LJLJI);
            }
            ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).LJLJI.post(new ARunnableS41S0100000_5(aObserverS69S0200000_5, 45));
            return;
        }
        FrameL2SlotWidget frameL2SlotWidget5 = (FrameL2SlotWidget) aObserverS69S0200000_5.l1;
        if (frameL2SlotWidget5.LJLJI == null || !frameL2SlotWidget5.isShowing()) {
            return;
        }
        Animation LIZLLL = iFrameSlot.LIZLLL();
        if (LIZLLL == null || "visibility_reason_conflict".equals(pair.second) || "visibility_reason_dispose".equals(pair.second)) {
            if (((FrameL2SlotWidget) aObserverS69S0200000_5.l1).getView() instanceof ViewGroup) {
                ((ViewGroup) ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).getView()).removeAllViews();
                ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).hide();
                iFrameSlot.LJII((String) pair.second);
                C31684Cc4.LIZIZ("FrameL2SlotWidget", (InterfaceC31710CcU) aObserverS69S0200000_5.l0, "slot visible change, visible: false");
            }
            DataChannel dataChannel2 = ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).dataChannel;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.rv0(FullBottomContainerHeightChannel.class, 0);
            ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).dataChannel.rv0(FrameL2SlotVisibilityChannel.class, Boolean.FALSE);
            return;
        }
        LIZLLL.setAnimationListener(new AnimationAnimationListenerC31705CcP(aObserverS69S0200000_5, iFrameSlot, pair));
        ((FrameL2SlotWidget) aObserverS69S0200000_5.l1).LJLJI.startAnimation(LIZLLL);
        C31684Cc4.LIZIZ("FrameL2SlotWidget", (InterfaceC31710CcU) aObserverS69S0200000_5.l0, "slot start end anim");
    }

    public static final void onChanged$7(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        C47121t6 c47121t6;
        BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aObserverS69S0200000_5.l0;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS69S0200000_5.l1;
        String str = (String) obj;
        bottomLeftSlotWidget.getClass();
        if (!Boolean.TRUE.equals(slotViewModel.LJLIL.getValue()) || (c47121t6 = bottomLeftSlotWidget.LJLJL) == null) {
            return;
        }
        c47121t6.setText(str);
    }

    public static final void onChanged$8(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        Pair pair = (Pair) obj;
        if (((FrameL3SlotWidget) aObserverS69S0200000_5.l1).getView() == null || pair == null) {
            return;
        }
        Object obj2 = pair.first;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(obj2)) {
            if (!(((FrameL3SlotWidget) aObserverS69S0200000_5.l1).getView() instanceof ViewGroup)) {
                return;
            }
            if (((FrameL3SlotWidget) aObserverS69S0200000_5.l1).isShowing() && ((ViewGroup) ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).getView()).getChildCount() > 0) {
                return;
            }
            ((ViewGroup) ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).getView()).removeAllViews();
            FrameL3SlotWidget frameL3SlotWidget = (FrameL3SlotWidget) aObserverS69S0200000_5.l1;
            frameL3SlotWidget.LJLJJI = frameL3SlotWidget.LJLILLLLZI.LJFF(frameL3SlotWidget.getContext());
            FrameL3SlotWidget frameL3SlotWidget2 = (FrameL3SlotWidget) aObserverS69S0200000_5.l1;
            if (frameL3SlotWidget2.LJLJJI == null) {
                return;
            }
            ((ViewGroup) frameL3SlotWidget2.getView()).addView(((FrameL3SlotWidget) aObserverS69S0200000_5.l1).LJLJJI);
            if (((FrameL3SlotWidget) aObserverS69S0200000_5.l1).LJLJL) {
                return;
            }
            ((InterfaceC31710CcU) aObserverS69S0200000_5.l0).LLJJL("during_live");
            ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).show();
            HashMap hashMap = new HashMap();
            FrameL3SlotWidget frameL3SlotWidget3 = (FrameL3SlotWidget) aObserverS69S0200000_5.l1;
            if (!frameL3SlotWidget3.LJLJLJ) {
                C31688Cc8.LIZ(((FrameL3SlotWidget) aObserverS69S0200000_5.l1).LJLJLLL, hashMap, frameL3SlotWidget3.LJLIL.getDataContainer());
                C31684Cc4.LJFF((InterfaceC31710CcU) aObserverS69S0200000_5.l0, hashMap);
            }
            ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).LJLJLJ = true;
            C31684Cc4.LIZJ("FrameL3SlotWidget", (InterfaceC31710CcU) aObserverS69S0200000_5.l0, "slot visible change, visible: true", hashMap);
            DataChannel dataChannel = ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(FrameL3SlotVisibilityChannel.class, bool);
            }
            Animation LIZJ = ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).LJLILLLLZI.LIZJ();
            if (LIZJ != null) {
                ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).LJLJJI.startAnimation(LIZJ);
                C31684Cc4.LIZIZ("FrameL3SlotWidget", (InterfaceC31710CcU) aObserverS69S0200000_5.l0, "slot start in anim");
            }
            if (!((FrameL3SlotWidget) aObserverS69S0200000_5.l1).LJLJJI.hasOnClickListeners()) {
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(aObserverS69S0200000_5, 41), ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).LJLJJI);
            }
            ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).LJLJJI.post(new ARunnableS41S0100000_5(aObserverS69S0200000_5, 44));
            return;
        }
        if (!((FrameL3SlotWidget) aObserverS69S0200000_5.l1).isShowing()) {
            return;
        }
        FrameL3SlotWidget frameL3SlotWidget4 = (FrameL3SlotWidget) aObserverS69S0200000_5.l1;
        if (frameL3SlotWidget4.LJLJJI == null) {
            return;
        }
        Animation LIZLLL = frameL3SlotWidget4.LJLILLLLZI.LIZLLL();
        if (LIZLLL == null || "visibility_reason_conflict".equals(pair.second) || "visibility_reason_dispose".equals(pair.second)) {
            if (((FrameL3SlotWidget) aObserverS69S0200000_5.l1).getView() instanceof ViewGroup) {
                ((ViewGroup) ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).getView()).removeAllViews();
                ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).hide();
                C31684Cc4.LIZIZ("FrameL3SlotWidget", (InterfaceC31710CcU) aObserverS69S0200000_5.l0, "slot visible change, visible: false");
            }
            DataChannel dataChannel2 = ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).dataChannel;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.rv0(FrameL3SlotVisibilityChannel.class, Boolean.FALSE);
            ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).dataChannel.rv0(FrameL3SlotHeightChannel.class, 0);
            return;
        }
        LIZLLL.setAnimationListener(new IDAListenerS232S0100000_5(aObserverS69S0200000_5, 0));
        ((FrameL3SlotWidget) aObserverS69S0200000_5.l1).LJLJJI.startAnimation(LIZLLL);
        C31684Cc4.LIZIZ("FrameL3SlotWidget", (InterfaceC31710CcU) aObserverS69S0200000_5.l0, "slot start end anim");
    }

    public static final void onChanged$9(AObserverS69S0200000_5 aObserverS69S0200000_5, Object obj) {
        int i;
        Boolean hasRedPoint = (Boolean) obj;
        if (!o.LJ(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLIL.getValue(), Boolean.TRUE) || ((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLL.getValue() != null || !TextUtils.isEmpty(((IIconSlot.SlotViewModel) aObserverS69S0200000_5.l0).LJLJJI.getValue())) {
            return;
        }
        ((C31699CcJ) aObserverS69S0200000_5.l1).LIZJ();
        View view = ((C31699CcJ) aObserverS69S0200000_5.l1).LJLLL;
        if (view == null) {
            return;
        }
        o.LJIIIIZZ(hasRedPoint, "hasRedPoint");
        if (hasRedPoint.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public AObserverS69S0200000_5(BottomLeftSlotWidget bottomLeftSlotWidget, IIconSlot.SlotViewModel slotViewModel, int i) {
        this.$t = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.l1 = bottomLeftSlotWidget;
                this.l0 = slotViewModel;
                return;
            default:
                this.l0 = bottomLeftSlotWidget;
                this.l1 = slotViewModel;
                return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS69S0200000_5(com.bytedance.android.live.slot.IIconSlot.SlotViewModel r2, X.C31699CcJ r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 9: goto Le;
                case 10: goto Le;
                case 11: goto Le;
                case 12: goto Le;
                case 13: goto Le;
                case 14: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS69S0200000_5.<init>(com.bytedance.android.live.slot.IIconSlot$SlotViewModel, X.CcJ, int):void");
    }

    public AObserverS69S0200000_5(C31689Cc9 c31689Cc9, IIconSlot.SlotViewModel slotViewModel, int i) {
        this.$t = i;
        switch (i) {
            case 31:
                this.l0 = c31689Cc9;
                this.l1 = slotViewModel;
                return;
            default:
                this.l1 = c31689Cc9;
                this.l0 = slotViewModel;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS69S0200000_5(Object obj, User user, InterfaceC88472Yns<? super User, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = obj;
        this.l1 = user;
    }
}
