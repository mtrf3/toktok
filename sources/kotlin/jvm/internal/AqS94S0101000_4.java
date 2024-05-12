package kotlin.jvm.internal;

import X.AEB;
import X.AYX;
import X.AbstractC234519Ih;
import X.AbstractC65781Prl;
import X.C119774mz;
import X.C198577qn;
import X.C2301491m;
import X.C232689Bg;
import X.C232699Bh;
import X.C232719Bj;
import X.C234509Ig;
import X.C234529Ii;
import X.C237159Sl;
import X.C238889Zc;
import X.C25847ACl;
import X.C25859ACx;
import X.C26070ALa;
import X.C26429AYv;
import X.C27162AlK;
import X.C27531ArH;
import X.C38350F3i;
import X.C3C1;
import X.C43I;
import X.C45804HyK;
import X.C57002Lo;
import X.C76800UCe;
import X.C82B;
import X.C98Q;
import X.C9BH;
import X.C9BX;
import X.InterfaceC232739Bl;
import X.InterfaceC88472Yns;
import X.LB1;
import X.OSZ;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ProgressDragHintViewModel;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import com.ss.android.ugc.aweme.contentlanguage.view.LanguageListFragment;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LeadMessage;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.kids.setting.items.language.KidAppLanguageListFragment;
import com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.recommend.UserProfileUserCardVM;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.recommendbutton.HeaderCTARecommendButtonComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class AqS94S0101000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        View it = (View) obj;
        o.LJIIIZ(it, "it");
        it.getHitRect((Rect) aqS94S0101000_4.l0);
        return new OSZ(Integer.valueOf(Math.abs(((Rect) aqS94S0101000_4.l0).centerX() - aqS94S0101000_4.i1)), it);
    }

    public static final Object invoke$1(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        C9BX it = (C9BX) obj;
        o.LJIIIZ(it, "it");
        if (((ProgressDragHintViewModel) aqS94S0101000_4.l0).LJLJJI) {
            int i = C232689Bg.LIZ[it.LJLJJL.ordinal()];
            String str = null;
            C9BH c9bh = null;
            if (i != 1) {
                if (i == 2) {
                    ProgressDragHintViewModel progressDragHintViewModel = (ProgressDragHintViewModel) aqS94S0101000_4.l0;
                    int i2 = aqS94S0101000_4.i1;
                    List<Utterance> list = progressDragHintViewModel.LJLILLLLZI;
                    if (list != null) {
                        if (ProgressDragHintViewModel.hv0(it, i2)) {
                            progressDragHintViewModel.gv0(it.LJLILLLLZI);
                        } else {
                            Utterance kv0 = progressDragHintViewModel.kv0(0, list.size(), i2);
                            if (kv0 != null) {
                                c9bh = new C9BH((int) kv0.getStartTime(), (int) kv0.getEndTime(), kv0.getText());
                            }
                            progressDragHintViewModel.gv0(c9bh);
                            progressDragHintViewModel.setState(new AqS170S0100000_4(c9bh, 1058));
                        }
                    }
                }
            } else {
                ProgressDragHintViewModel progressDragHintViewModel2 = (ProgressDragHintViewModel) aqS94S0101000_4.l0;
                int i3 = aqS94S0101000_4.i1;
                progressDragHintViewModel2.getClass();
                if (ProgressDragHintViewModel.hv0(it, i3)) {
                    progressDragHintViewModel2.gv0(it.LJLILLLLZI);
                } else {
                    InterfaceC232739Bl interfaceC232739Bl = progressDragHintViewModel2.LJLIL.get();
                    if (interfaceC232739Bl != null) {
                        str = interfaceC232739Bl.LIZLLL(i3);
                    }
                    C9BH lv0 = ProgressDragHintViewModel.lv0(str);
                    progressDragHintViewModel2.gv0(lv0);
                    progressDragHintViewModel2.setState(new AqS170S0100000_4(lv0, 1058));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        UserState it = (UserState) obj;
        o.LJIIIZ(it, "it");
        if (((C26070ALa) aqS94S0101000_4.l0) != null) {
            int i = aqS94S0101000_4.i1;
            User m150clone = it.getUser().m150clone();
            m150clone.setLivePushNotificationStatus(i);
            if (m150clone.getFollowStatus() == 0) {
                m150clone.setLivePushNotificationStatus(2);
            }
            AYX LJ = UserService.LIZ().LJ();
            String uid = m150clone.getUid();
            o.LJIIIIZZ(uid, "cloneUser.uid");
            LJ.put(uid, m150clone);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        boolean z;
        AbstractC234519Ih it = (AbstractC234519Ih) obj;
        o.LJIIIZ(it, "it");
        C234509Ig c234509Ig = (C234509Ig) it;
        if (aqS94S0101000_4.i1 != ((KidAppLanguageListFragment) aqS94S0101000_4.l0).LJLJJI) {
            z = true;
        } else {
            z = false;
        }
        c234509Ig.LJ = z;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        boolean z;
        C25847ACl it = (C25847ACl) obj;
        o.LJIIIZ(it, "it");
        if (aqS94S0101000_4.i1 == ((C237159Sl) aqS94S0101000_4.l0).LJLJJI) {
            z = true;
        } else {
            z = false;
        }
        return C25847ACl.LJIILJJIL(it, z, false, false, 8190);
    }

    public static final Object invoke$13(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        if (obj != null) {
            return new C198577qn(new C43I(new OSZ((Exception) aqS94S0101000_4.l0, Integer.valueOf(aqS94S0101000_4.i1))));
        }
        return null;
    }

    public static final Object invoke$14(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        TuxIconView it = (TuxIconView) obj;
        o.LJIIIZ(it, "it");
        int i = aqS94S0101000_4.i1;
        HeaderCTARecommendButtonComponent headerCTARecommendButtonComponent = (HeaderCTARecommendButtonComponent) aqS94S0101000_4.l0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    headerCTARecommendButtonComponent.getClass();
                    it.setIconRes(R.raw.icon_spinner_normal);
                    it.clearAnimation();
                    it.setRotation(180.0f);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setRepeatCount(-1);
                    rotateAnimation.setRepeatMode(1);
                    rotateAnimation.setDuration(600L);
                    it.startAnimation(rotateAnimation);
                }
            } else {
                headerCTARecommendButtonComponent.getClass();
                it.clearAnimation();
                it.setIconRes(R.raw.icon_arrow_triangle_down_fill);
                it.animate().rotation(180.0f).start();
            }
        } else {
            headerCTARecommendButtonComponent.getClass();
            it.clearAnimation();
            it.setIconRes(R.raw.icon_arrow_triangle_down_fill);
            it.animate().rotation(360.0f).start();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        String str;
        LeadMessage leadMessage;
        String str2;
        String str3;
        String str4;
        String str5;
        String currency;
        String priceVal;
        Float LJJIJLIJ;
        String str6;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        logView.plusAssign("page_name", "logistics");
        logView.plusAssign("sub_page_name", "shipping");
        logView.plusAssign("previous_page", "product_detail");
        logView.plusAssign("option_type", "shipping_type");
        Map<String, String> map = ((LogisticDTO) aqS94S0101000_4.l0).eventTrackInfo;
        if (map != null && (str6 = map.get("ship_from")) != null) {
            logView.plusAssign("ship_from", str6);
        }
        Price price = ((LogisticDTO) aqS94S0101000_4.l0).shippingFee;
        if (price != null && (priceVal = price.getPriceVal()) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(priceVal)) != null) {
            logView.plusAssign("shipping_price", Float.valueOf(LJJIJLIJ.floatValue()));
        }
        Price price2 = ((LogisticDTO) aqS94S0101000_4.l0).shippingFee;
        if (price2 != null && (currency = price2.getCurrency()) != null) {
            logView.plusAssign("shipping_currency", currency);
        }
        Map<String, String> map2 = ((LogisticDTO) aqS94S0101000_4.l0).eventTrackInfo;
        if (map2 != null && (str5 = map2.get("shipping_type")) != null) {
            logView.plusAssign("option_name", str5);
        }
        Map<String, String> map3 = ((LogisticDTO) aqS94S0101000_4.l0).eventTrackInfo;
        if (map3 != null && (str4 = map3.get("est_delivery_day_max")) != null) {
            logView.plusAssign("est_delivery_day_max", str4);
        }
        Map<String, String> map4 = ((LogisticDTO) aqS94S0101000_4.l0).eventTrackInfo;
        if (map4 != null && (str3 = map4.get("est_delivery_day_min")) != null) {
            logView.plusAssign("est_delivery_day_min", str3);
        }
        logView.plusAssign("rank", Integer.valueOf(aqS94S0101000_4.i1));
        LogisticTextDTO logisticTextDTO = ((LogisticDTO) aqS94S0101000_4.l0).logisticText;
        if (logisticTextDTO == null || (leadMessage = logisticTextDTO.leadMessage) == null || (str2 = leadMessage.fromOverseas) == null || str2.length() == 0) {
            str = "local";
        } else {
            str = "overseas";
        }
        logView.plusAssign("ship_from", str);
        logView.plusAssign("option_type", "shipping_type");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        int i;
        int intValue = ((Number) obj).intValue();
        int i2 = aqS94S0101000_4.i1;
        FollowListAdapter followListAdapter = (FollowListAdapter) aqS94S0101000_4.l0;
        boolean z = false;
        Object LJZL = followListAdapter.LJZL(intValue, false);
        if (LJZL instanceof C26429AYv) {
            i = ((C26429AYv) LJZL).LJLIL;
        } else if (LJZL instanceof LB1) {
            i = ((LB1) LJZL).LJLIL;
        } else {
            if (LJZL instanceof C57002Lo) {
                LJZL.getClass();
            }
            i = 0;
        }
        if (i2 == i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$17(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        C43I c43i;
        C98Q setState = (C98Q) obj;
        o.LJIIIZ(setState, "$this$setState");
        C3C1 c3c1 = new C3C1(new Exception("load fail!"));
        UserProfileUserCardVM userProfileUserCardVM = (UserProfileUserCardVM) aqS94S0101000_4.l0;
        int i = aqS94S0101000_4.i1;
        userProfileUserCardVM.getClass();
        if (i == 0) {
            c43i = new C43I(Integer.valueOf(R.string.sem));
        } else {
            c43i = null;
        }
        return C98Q.LIZ(setState, false, 0, 0, false, c3c1, c43i, null, null, false, false, 970);
    }

    public static final Object invoke$18(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        C98Q setState = (C98Q) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C98Q.LIZ(setState, false, aqS94S0101000_4.i1, 0, false, null, null, new C43I((User) aqS94S0101000_4.l0), null, false, false, 957);
    }

    public static final Object invoke$19(AqS94S0101000_4 aqS94S0101000_4, Object it) {
        o.LJIIIZ(it, "it");
        Context context = ((C119774mz) aqS94S0101000_4.l0).getContext();
        o.LJIIIIZZ(context, "flow.context");
        View LIZ = C27531ArH.LIZ(R.layout.a3v, context, (C119774mz) aqS94S0101000_4.l0, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(aqS94S0101000_4.i1, (int) C45804HyK.LJJ(108));
        marginLayoutParams.setMarginEnd(C27162AlK.LJIIIZ);
        LIZ.setLayoutParams(marginLayoutParams);
        return LIZ;
    }

    public static final Object invoke$2(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        C232719Bj c232719Bj;
        C9BX it = (C9BX) obj;
        o.LJIIIZ(it, "it");
        ((ProgressDragHintViewModel) aqS94S0101000_4.l0).LJLJI.clear();
        ProgressDragHintViewModel progressDragHintViewModel = (ProgressDragHintViewModel) aqS94S0101000_4.l0;
        progressDragHintViewModel.LJLJJI = it.LJLJI;
        int i = C232699Bh.LIZ[it.LJLJJL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                c232719Bj = new C232719Bj(false, 7);
            } else {
                c232719Bj = new C232719Bj(((ProgressDragHintViewModel) aqS94S0101000_4.l0).jv0(it, aqS94S0101000_4.i1), 6);
            }
        } else {
            c232719Bj = new C232719Bj(((ProgressDragHintViewModel) aqS94S0101000_4.l0).iv0(it, aqS94S0101000_4.i1), 6);
        }
        progressDragHintViewModel.LJLJJL = c232719Bj;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        int i;
        int intValue = ((Number) obj).intValue();
        int i2 = aqS94S0101000_4.i1;
        PushSettingFollowListAdapter pushSettingFollowListAdapter = (PushSettingFollowListAdapter) aqS94S0101000_4.l0;
        boolean z = false;
        Object LJZL = pushSettingFollowListAdapter.LJZL(intValue, false);
        if (LJZL instanceof C26429AYv) {
            i = ((C26429AYv) LJZL).LJLIL;
        } else if (LJZL instanceof LB1) {
            i = ((LB1) LJZL).LJLIL;
        } else {
            if (LJZL instanceof C57002Lo) {
                LJZL.getClass();
            }
            i = 0;
        }
        if (i2 == i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        C25859ACx it = (C25859ACx) obj;
        o.LJIIIZ(it, "it");
        BaMessageSettingActivity baMessageSettingActivity = (BaMessageSettingActivity) aqS94S0101000_4.l0;
        return C25859ACx.LJIILJJIL(it, baMessageSettingActivity.LLFZ(new C238889Zc(baMessageSettingActivity.LJLLLLLL, aqS94S0101000_4.i1)), null, false, null, null, false, false, null, false, false, false, false, 8388606);
    }

    public static final Object invoke$4(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        boolean z;
        AbstractC234519Ih navAction = (AbstractC234519Ih) obj;
        o.LJIIIZ(navAction, "navAction");
        C234509Ig c234509Ig = (C234509Ig) navAction;
        if (aqS94S0101000_4.i1 != ((LanguageListFragment) aqS94S0101000_4.l0).LJLJJLL) {
            z = true;
        } else {
            z = false;
        }
        c234509Ig.LJ = z;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        AEB it = (AEB) obj;
        o.LJIIIZ(it, "it");
        String string = ((CreatorToolsActivity) aqS94S0101000_4.l0).getString(aqS94S0101000_4.i1);
        o.LJIIIIZZ(string, "getString(titleTextRes)");
        return AEB.LIZJ(it, string, false, false, false, 16382);
    }

    public static final Object invoke$6(AqS94S0101000_4 aqS94S0101000_4, Object it) {
        o.LJIIIZ(it, "it");
        Context context = ((C119774mz) aqS94S0101000_4.l0).getContext();
        o.LJIIIIZZ(context, "flow.context");
        View LIZ = C27531ArH.LIZ(R.layout.a41, context, (C119774mz) aqS94S0101000_4.l0, false);
        int i = aqS94S0101000_4.i1;
        ViewGroup.LayoutParams layoutParams = LIZ.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i;
            LIZ.setLayoutParams(layoutParams);
        }
        return LIZ;
    }

    public static final Object invoke$7(AqS94S0101000_4 aqS94S0101000_4, Object it) {
        o.LJIIIZ(it, "it");
        SmartImageView smartImageView = new SmartImageView(((C119774mz) aqS94S0101000_4.l0).getContext());
        int i = aqS94S0101000_4.i1;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i);
        int i2 = C27162AlK.LJIIIZ;
        marginLayoutParams.setMarginEnd(i2);
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.bottomMargin = i2;
        smartImageView.setLayoutParams(marginLayoutParams);
        return smartImageView;
    }

    public static final Object invoke$8(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        boolean z;
        AbstractC234519Ih it = (AbstractC234519Ih) obj;
        o.LJIIIZ(it, "it");
        C234529Ii c234529Ii = (C234529Ii) it;
        if (aqS94S0101000_4.i1 > 0 || ((DistrictFragment) aqS94S0101000_4.l0).Al().LJLJI != null) {
            z = true;
        } else {
            z = false;
        }
        c234529Ii.LJI = z;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS94S0101000_4 aqS94S0101000_4, Object obj) {
        C82B setState = (C82B) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82B.LIZ(setState, new C43I(Integer.valueOf(aqS94S0101000_4.i1)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I((C2301491m) aqS94S0101000_4.l0), null, null, null, 125829118);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(int i, C2301491m c2301491m, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c2301491m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(int i, C237159Sl c237159Sl, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c237159Sl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(int i, Rect rect, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = rect;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(int i, LanguageListFragment languageListFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = languageListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(int i, DistrictFragment districtFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = districtFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(int i, FollowListAdapter followListAdapter, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = followListAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(int i, KidAppLanguageListFragment kidAppLanguageListFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = kidAppLanguageListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(int i, PushSettingFollowListAdapter pushSettingFollowListAdapter, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = pushSettingFollowListAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(int i, HeaderCTARecommendButtonComponent headerCTARecommendButtonComponent, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = headerCTARecommendButtonComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(C119774mz c119774mz, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c119774mz;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(C26070ALa c26070ALa, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c26070ALa;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(ProgressDragHintViewModel progressDragHintViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = progressDragHintViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(BaMessageSettingActivity baMessageSettingActivity, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = baMessageSettingActivity;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(CreatorToolsActivity creatorToolsActivity, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = creatorToolsActivity;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(LogisticDTO logisticDTO, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = logisticDTO;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(User user, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = user;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(UserProfileUserCardVM userProfileUserCardVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = userProfileUserCardVM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0101000_4(Exception exc, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = exc;
        this.i1 = i;
    }
}
