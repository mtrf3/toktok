package kotlin.jvm.internal;

import X.ARH;
import X.ARI;
import X.ARL;
import X.ARN;
import X.AbstractC029409q;
import X.AbstractC62625Ohx;
import X.AbstractC65781Prl;
import X.AbstractC73430Srq;
import X.AnonymousClass391;
import X.AnonymousClass499;
import X.C101713yx;
import X.C101743z0;
import X.C1042547h;
import X.C109544Rq;
import X.C110794Wl;
import X.C112874br;
import X.C162476Zf;
import X.C16880lQ;
import X.C26338AVi;
import X.C32151Nz;
import X.C32V;
import X.C43I;
import X.C47135Ieh;
import X.C4B6;
import X.C4B8;
import X.C4B9;
import X.C62387Oe7;
import X.C68322mC;
import X.C72412sn;
import X.C72912tb;
import X.C73454SsE;
import X.C73542Ste;
import X.C73969T1h;
import X.C76800UCe;
import X.C77119UOl;
import X.C784636c;
import X.C79146V4k;
import X.C793439m;
import X.C7MY;
import X.C81243Gu;
import X.C86913b5;
import X.C87503c2;
import X.C88873eF;
import X.C88903eI;
import X.C90253gT;
import X.C90743hG;
import X.C90753hH;
import X.C91453iP;
import X.C98583tu;
import X.C98793uF;
import X.C99033ud;
import X.C9PM;
import X.EF7;
import X.EnumC101493yb;
import X.EnumC235129Kq;
import X.EnumC88973eP;
import X.InterfaceC101453yX;
import X.InterfaceC62225ObV;
import X.InterfaceC62474OfW;
import X.InterfaceC62573Oh7;
import X.InterfaceC65784Pro;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.InterfaceC88923eK;
import X.O6R;
import X.OSZ;
import X.T16;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.AfS53S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.assem.StickerSetContentEditButtonAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.IMInputEditTextAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.assem.GroupChatDetailAssem;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.business.tcm.TCMOrderDeleteApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.assem.TrendingBillboardHeaderAssem;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.viewmodel.TrendingBillboardViewModel;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import yq4.a;

/* loaded from: classes2.dex */
public class AqS105S0300000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.LinkedHashMap, T] */
    public static final Object invoke$0(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        VideoSticker videoSticker;
        EnumC88973eP enumC88973eP;
        EnumC88973eP enumC88973eP2;
        String str = (String) obj;
        C68322mC c68322mC = new C68322mC();
        SetSticker setSticker = null;
        if (str != null && str.length() > 0) {
            ?? linkedHashMap = new LinkedHashMap();
            C77119UOl.LJJIJ("enter_method", str);
            c68322mC.element = linkedHashMap;
        }
        InputView inputView = (InputView) aqS105S0300000_1.l0;
        ChatViewModel chatViewModel = inputView.LLIILZL;
        if (chatViewModel != null) {
            C32V c32v = (C32V) aqS105S0300000_1.l1;
            String conversationId = inputView.LJLZ.getConversationId();
            C4B8 enterMethod = (C4B8) aqS105S0300000_1.l2;
            Map map = (Map) c68322mC.element;
            o.LJIIIZ(conversationId, "conversationId");
            o.LJIIIZ(enterMethod, "enterMethod");
            if (c32v instanceof SetSticker) {
                setSticker = (SetSticker) c32v;
            }
            if (setSticker != null) {
                chatViewModel.LJLJJL = 103;
                int i = C4B9.LIZ[enterMethod.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            enumC88973eP2 = EnumC88973eP.FAVOURITE_TAB;
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        enumC88973eP2 = EnumC88973eP.DM_STICKER_PANEL;
                    }
                } else {
                    enumC88973eP2 = EnumC88973eP.KEYWORD_SUGGESTION;
                }
                C88873eF.LJII(setSticker, conversationId, enumC88973eP2, map, 48);
            }
            if ((c32v instanceof VideoSticker) && (videoSticker = (VideoSticker) c32v) != null) {
                chatViewModel.LJLJJL = 104;
                int i2 = C4B9.LIZ[enterMethod.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            enumC88973eP = EnumC88973eP.FAVOURITE_TAB;
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        enumC88973eP = EnumC88973eP.DM_STICKER_PANEL;
                    }
                } else {
                    enumC88973eP = EnumC88973eP.KEYWORD_SUGGESTION;
                }
                C88873eF.LIZ.LJIIIIZZ(videoSticker, conversationId, enumC88973eP, map, C88903eI.LIZ(), EF7.LIZIZ());
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        C87503c2 state = (C87503c2) obj;
        o.LJIIIZ(state, "state");
        if (state.getListState().LJLIL instanceof C72912tb) {
            View containerView = ((UIAssem) aqS105S0300000_1.l0).getContainerView();
            List list = (List) aqS105S0300000_1.l1;
            int i = 0;
            if (list == null || list.isEmpty()) {
                StickerSetContentViewModel v3 = ((StickerSetContentEditButtonAssem) aqS105S0300000_1.l2).v3();
                if (o.LJ(((C87503c2) v3.getState()).LJLILLLLZI, C86913b5.LIZ)) {
                    v3.iv0();
                }
                i = 8;
            }
            containerView.setVisibility(i);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI = true;
        C793439m c793439m = (C793439m) aqS105S0300000_1.l0;
        actionGroup.LJI(R.string.q4v, new AqS105S0300000_1((Context) aqS105S0300000_1.l2, (Aweme) aqS105S0300000_1.l1, c793439m, 9));
        actionGroup.LJIIIIZZ(R.string.cga, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C62387Oe7 c62387Oe7 = ((C90253gT) aqS105S0300000_1.l0).LJLJLLL;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LIZ((InterfaceC62225ObV) aqS105S0300000_1.l1, booleanValue, c62387Oe7.LJIIJ, ((C110794Wl) aqS105S0300000_1.l2).LJLIL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        AbstractC62625Ohx shareContent = (AbstractC62625Ohx) obj;
        o.LJIIIZ(shareContent, "shareContent");
        final InterfaceC62225ObV interfaceC62225ObV = (InterfaceC62225ObV) aqS105S0300000_1.l0;
        Context context = (Context) aqS105S0300000_1.l1;
        final SharePackage sharePackage = (SharePackage) aqS105S0300000_1.l2;
        interfaceC62225ObV.LJIIJ(shareContent, context, new InterfaceC62573Oh7() { // from class: X.4Wt
            @Override // X.InterfaceC62573Oh7
            public final C4P8 LJ() {
                return null;
            }

            @Override // X.InterfaceC62573Oh7
            public final void LJIIJ(boolean z) {
                String str;
                String str2;
                Bundle bundle;
                if (C110864Ws.LIZ.contains(InterfaceC62225ObV.this.key())) {
                    SharePackage sharePackage2 = sharePackage;
                    String key = InterfaceC62225ObV.this.key();
                    if (z) {
                        str = "success";
                    } else {
                        str = "fail";
                    }
                    SharePackage sharePackage3 = sharePackage;
                    if (sharePackage3 == null || (bundle = sharePackage3.extras) == null || (str2 = bundle.getString("now_type")) == null) {
                        str2 = "";
                    }
                    C62468OfQ.LJII(sharePackage2, key, str, str2, null, 48);
                }
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        int intValue = ((Number) obj).intValue();
        C79146V4k.LJJIIJ(((InterfaceC70422pa) aqS105S0300000_1.l0).getCoroutineContext());
        return ((AbstractC029409q) aqS105S0300000_1.l1).createViewHolder((RecyclerView) aqS105S0300000_1.l2, intValue);
    }

    public static final Object invoke$14(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        int i;
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        ((View.OnClickListener) aqS105S0300000_1.l0).onClick((View) aqS105S0300000_1.l1);
        it.LIZJ = true;
        C99033ud c99033ud = ((C112874br) aqS105S0300000_1.l2).LJII;
        if (c99033ud != null) {
            i = c99033ud.getChatType();
        } else {
            i = -1;
        }
        AnonymousClass499.LIZIZ(C98583tu.LIZIZ(i), "view");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.eqo, new AqS105S0300000_1((View.OnClickListener) aqS105S0300000_1.l0, (View) aqS105S0300000_1.l1, (C112874br) aqS105S0300000_1.l2, 14));
        actionGroup.LJIIIIZZ(R.string.eqk, new AqS167S0100000_1((C112874br) aqS105S0300000_1.l2, 448));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        AbstractC73430Srq LIZ;
        ARN args = (ARN) obj;
        o.LJIIIZ(args, "args");
        args.LIZJ = false;
        ((ARL) ListProtector.get(((ARH) aqS105S0300000_1.l0).LJFF, 0)).LIZ(C101743z0.LJLIL);
        ((C101713yx) aqS105S0300000_1.l1).LIZIZ.LIZLLL((EnumC101493yb) aqS105S0300000_1.l2);
        InterfaceC101453yX LJFF = a.LJIILIIL().LJFF();
        if (LJFF != null && (LIZ = LJFF.LIZ(((EnumC101493yb) aqS105S0300000_1.l2).toSettingCons())) != null) {
            C73542Ste.LJIIIIZZ(LIZ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()), new AqS167S0100000_1((ARH) aqS105S0300000_1.l0, 477), new AqS148S0200000_1((C101713yx) aqS105S0300000_1.l1, (EnumC101493yb) aqS105S0300000_1.l2, 53), null, 4);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        C9PM setState = (C9PM) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C9PM.LIZ(setState, null, null, null, null, false, false, null, null, null, (EnumC235129Kq) aqS105S0300000_1.l2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, new C43I(new OSZ((ProfileUser) aqS105S0300000_1.l0, (User) aqS105S0300000_1.l1)), null, -513, 479);
    }

    public static final Object invoke$2(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        EnumC88973eP enumC88973eP;
        EnumC88973eP enumC88973eP2;
        String str = (String) obj;
        LinkedHashMap linkedHashMap = null;
        if (str != null && str.length() > 0) {
            linkedHashMap = new LinkedHashMap();
            C77119UOl.LJJIJ("enter_method", str);
        }
        ChatRoomInputVM A3 = ((IMInputEditTextAssem) aqS105S0300000_1.l0).A3();
        C32V c32v = (C32V) aqS105S0300000_1.l1;
        String conversationId = ((IMInputEditTextAssem) aqS105S0300000_1.l0).v3().LJLIL.getConversationId();
        C4B8 stickerEnterMethod = (C4B8) aqS105S0300000_1.l2;
        InterfaceC88923eK messageSenderTaskBuilder = C88903eI.LIZ();
        Context LIZIZ = EF7.LIZIZ();
        A3.getClass();
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(stickerEnterMethod, "stickerEnterMethod");
        o.LJIIIZ(messageSenderTaskBuilder, "messageSenderTaskBuilder");
        if (c32v instanceof SetSticker) {
            SetSticker setSticker = (SetSticker) c32v;
            int i = C4B6.LIZ[stickerEnterMethod.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC88973eP2 = EnumC88973eP.FAVOURITE_TAB;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    enumC88973eP2 = EnumC88973eP.DM_STICKER_PANEL;
                }
            } else {
                enumC88973eP2 = EnumC88973eP.KEYWORD_SUGGESTION;
            }
            C88873eF.LJI(setSticker, conversationId, enumC88973eP2, linkedHashMap, messageSenderTaskBuilder, LIZIZ);
        } else if (c32v instanceof VideoSticker) {
            C88873eF c88873eF = C88873eF.LIZ;
            VideoSticker videoSticker = (VideoSticker) c32v;
            int i2 = C4B6.LIZ[stickerEnterMethod.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        enumC88973eP = EnumC88973eP.FAVOURITE_TAB;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    enumC88973eP = EnumC88973eP.DM_STICKER_PANEL;
                }
            } else {
                enumC88973eP = EnumC88973eP.KEYWORD_SUGGESTION;
            }
            c88873eF.LJIIIIZZ(videoSticker, conversationId, enumC88973eP, linkedHashMap, messageSenderTaskBuilder, LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.rtj, new AqS132S0200000_1((Activity) aqS105S0300000_1.l0, (Activity) aqS105S0300000_1.l1, (InterfaceC65784Pro<C76800UCe>) 34));
        actionGroup.LJIIIIZZ(R.string.rti, new AqS167S0100000_1((InterfaceC88472Yns) aqS105S0300000_1.l2, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) 198));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS105S0300000_1 aqS105S0300000_1, Object it) {
        CharSequence charSequence;
        SmartImageView smartImageView;
        o.LJIIIZ(it, "it");
        ((View) aqS105S0300000_1.l0).setVisibility(0);
        int LIZ = C47135Ieh.LIZ(16, C47135Ieh.LIZ(12, ((FrameLayout) aqS105S0300000_1.l1).getWidth()));
        TuxTextView tuxTextView = ((TrendingBillboardHeaderAssem) aqS105S0300000_1.l2).LJLLI;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(63);
            TuxTextView tuxTextView2 = ((TrendingBillboardHeaderAssem) aqS105S0300000_1.l2).LJLLI;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.dj);
                String LIZJ = BDDateFormat.LIZJ(new BDDateFormat("lll-Y"), System.currentTimeMillis());
                Context context = ((TrendingBillboardHeaderAssem) aqS105S0300000_1.l2).getContext();
                if (context == null || (charSequence = context.getText(R.string.sjw)) == null) {
                    charSequence = "Last updated:";
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append((Object) charSequence);
                LIZ2.append(' ');
                LIZ2.append(LIZJ);
                LIZ2.append(' ');
                String LIZIZ = X1D.LIZIZ(LIZ2);
                TuxTextView tuxTextView3 = ((TrendingBillboardHeaderAssem) aqS105S0300000_1.l2).LJLLI;
                if (tuxTextView3 != null) {
                    if (tuxTextView3.getPaint().measureText(charSequence.toString()) > LIZ) {
                        TuxTextView tuxTextView4 = ((TrendingBillboardHeaderAssem) aqS105S0300000_1.l2).LJLLI;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setTuxFont(73);
                        } else {
                            o.LJIJI("updateTime");
                            throw null;
                        }
                    }
                    TuxTextView tuxTextView5 = ((TrendingBillboardHeaderAssem) aqS105S0300000_1.l2).LJLLI;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setText(LIZIZ);
                        TrendingBillboardHeaderAssem trendingBillboardHeaderAssem = (TrendingBillboardHeaderAssem) aqS105S0300000_1.l2;
                        List<String> list = ((TrendingBillboardViewModel) trendingBillboardHeaderAssem.LJLJLLL.getValue()).LJLIL;
                        if (list != null) {
                            int LIZIZ2 = C7MY.LIZIZ(492);
                            LinearLayout linearLayout = trendingBillboardHeaderAssem.LJLLJ;
                            if (linearLayout != null) {
                                if (LIZIZ2 >= linearLayout.getWidth()) {
                                    Integer num = 0;
                                    for (int i = 0; i < 3; i++) {
                                        SmartImageView smartImageView2 = new SmartImageView(trendingBillboardHeaderAssem.getContext());
                                        LinearLayout linearLayout2 = trendingBillboardHeaderAssem.LJLLJ;
                                        if (linearLayout2 != null) {
                                            linearLayout2.addView(smartImageView2);
                                            smartImageView2.getLayoutParams().height = C7MY.LIZIZ(164);
                                            smartImageView2.getLayoutParams().width = C7MY.LIZIZ(164);
                                            LinearLayout linearLayout3 = trendingBillboardHeaderAssem.LJLLJ;
                                            if (linearLayout3 != null) {
                                                if (linearLayout3.getChildCount() == 1) {
                                                    smartImageView = smartImageView2;
                                                    C26338AVi.LJI(smartImageView2, AnonymousClass391.LIZJ(-48), null, null, null, false, 30);
                                                } else {
                                                    smartImageView = smartImageView2;
                                                    LinearLayout linearLayout4 = trendingBillboardHeaderAssem.LJLLJ;
                                                    if (linearLayout4 != null) {
                                                        if (linearLayout4.getChildCount() == 2) {
                                                            LinearLayout linearLayout5 = trendingBillboardHeaderAssem.LJLLJ;
                                                            if (linearLayout5 != null) {
                                                                int LIZ3 = (C47135Ieh.LIZ(164, C47135Ieh.LIZ(116, linearLayout5.getWidth())) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(98))) / 2;
                                                                C26338AVi.LJI(smartImageView, Integer.valueOf(LIZ3), num, Integer.valueOf(LIZ3), num, false, 16);
                                                            } else {
                                                                o.LJIJI("bannerContainer");
                                                                throw null;
                                                            }
                                                        } else {
                                                            LinearLayout linearLayout6 = trendingBillboardHeaderAssem.LJLLJ;
                                                            if (linearLayout6 != null) {
                                                                if (linearLayout6.getChildCount() == 3) {
                                                                    Integer num2 = num;
                                                                    Integer num3 = num;
                                                                    num = num;
                                                                    C26338AVi.LJI(smartImageView, num2, num3, AnonymousClass391.LIZJ(-66), num, false, 16);
                                                                }
                                                            } else {
                                                                o.LJIJI("bannerContainer");
                                                                throw null;
                                                            }
                                                        }
                                                    } else {
                                                        o.LJIJI("bannerContainer");
                                                        throw null;
                                                    }
                                                }
                                                W5F LJIIIIZZ = W5U.LJIIIIZZ((String) ListProtector.get(list, i));
                                                LJIIIIZZ.LJJIIJ = smartImageView;
                                                C16880lQ.LLJJJ(LJIIIIZZ);
                                            } else {
                                                o.LJIJI("bannerContainer");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("bannerContainer");
                                            throw null;
                                        }
                                    }
                                } else {
                                    Iterator<String> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        trendingBillboardHeaderAssem.L3(it2.next());
                                    }
                                    int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(list.size() * 164)));
                                    while (true) {
                                        LinearLayout linearLayout7 = trendingBillboardHeaderAssem.LJLLJ;
                                        if (linearLayout7 != null) {
                                            if (LJJIIZ >= linearLayout7.getWidth()) {
                                                break;
                                            }
                                            Iterator<String> it3 = list.iterator();
                                            while (it3.hasNext()) {
                                                trendingBillboardHeaderAssem.L3(it3.next());
                                                LJJIIZ += O6R.LJJIIZ(C32151Nz.LJIIZILJ(164));
                                                LinearLayout linearLayout8 = trendingBillboardHeaderAssem.LJLLJ;
                                                if (linearLayout8 != null) {
                                                    if (LJJIIZ >= linearLayout8.getWidth()) {
                                                        break;
                                                    }
                                                } else {
                                                    o.LJIJI("bannerContainer");
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            o.LJIJI("bannerContainer");
                                            throw null;
                                        }
                                    }
                                }
                            } else {
                                o.LJIJI("bannerContainer");
                                throw null;
                            }
                        }
                        return C76800UCe.LIZ;
                    }
                    o.LJIJI("updateTime");
                    throw null;
                }
                o.LJIJI("updateTime");
                throw null;
            }
            o.LJIJI("updateTime");
            throw null;
        }
        o.LJIJI("updateTime");
        throw null;
    }

    public static final Object invoke$5(AqS105S0300000_1 aqS105S0300000_1, Object it) {
        o.LJIIIZ(it, "it");
        C98793uF.LIZLLL(new C91453iP((C109544Rq) aqS105S0300000_1.l0, null, 6), (Activity) aqS105S0300000_1.l1, "2", (C109544Rq) aqS105S0300000_1.l0, 16);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((C109544Rq) aqS105S0300000_1.l0).getSender());
        LIZ.append("");
        C1042547h.LJII(X1D.LIZIZ(LIZ), "sensitive_content_inline", null, C98583tu.LIZIZ(((C99033ud) aqS105S0300000_1.l2).getChatType()), 20);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AqS105S0300000_1 aqS105S0300000_1, Object it) {
        o.LJIIIZ(it, "it");
        new C784636c((Activity) aqS105S0300000_1.l0, (IMUser) ((C68322mC) aqS105S0300000_1.l1).element, "chat", null, null, null, C98583tu.LIZIZ(((C99033ud) aqS105S0300000_1.l2).getChatType()), 56).LJI();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Context) aqS105S0300000_1.l0).getString(R.string.gvl);
        o.LJIIIIZZ(string, "context.getString(R.stri…roup_chat_39_confirm_ctr)");
        actionGroup.LJII(string, new AqS132S0200000_1((GroupChatDetailAssem) aqS105S0300000_1.l1, (C81243Gu) aqS105S0300000_1.l2, 45));
        actionGroup.LJIIIIZZ(R.string.cg_, C90753hH.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS105S0300000_1 aqS105S0300000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Context) aqS105S0300000_1.l0).getString(R.string.q05);
        o.LJIIIIZZ(string, "context.getString(R.string.remove)");
        actionGroup.LJFF(string, new AqS132S0200000_1((GroupChatDetailAssem) aqS105S0300000_1.l1, (C81243Gu) aqS105S0300000_1.l2, 49));
        actionGroup.LJIIIIZZ(R.string.cg_, C90743hG.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS105S0300000_1 aqS105S0300000_1, Object it) {
        o.LJIIIZ(it, "it");
        TCMOrderDeleteApi tCMOrderDeleteApi = ((C793439m) aqS105S0300000_1.l0).LJLJJL;
        String valueOf = String.valueOf(((Aweme) aqS105S0300000_1.l1).getStarAtlasOrderId());
        String aid = ((Aweme) aqS105S0300000_1.l1).getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        C73454SsE LJJJ = tCMOrderDeleteApi.applyDeleteTCMOrder(valueOf, aid).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        Context context = (Context) aqS105S0300000_1.l2;
        LJJJ.LJJJLIIL(new AfS53S0100000_1(context, 58), new AfS53S0100000_1(context, 59));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS105S0300000_1(InterfaceC70422pa interfaceC70422pa, InterfaceC70422pa interfaceC70422pa2, AbstractC029409q<?> abstractC029409q, RecyclerView recyclerView) {
        super(1);
        this.$t = recyclerView;
        this.l0 = interfaceC70422pa;
        this.l1 = interfaceC70422pa2;
        this.l2 = abstractC029409q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0300000_1(C90253gT c90253gT, InterfaceC62225ObV interfaceC62225ObV, C110794Wl c110794Wl, int i) {
        super(1);
        this.$t = i;
        this.l0 = c90253gT;
        this.l1 = interfaceC62225ObV;
        this.l2 = c110794Wl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0300000_1(C109544Rq c109544Rq, Activity activity, C99033ud c99033ud, int i) {
        super(1);
        this.$t = i;
        this.l0 = c109544Rq;
        this.l1 = activity;
        this.l2 = c99033ud;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0300000_1(ARH arh, C101713yx c101713yx, EnumC101493yb enumC101493yb, int i) {
        super(1);
        this.$t = i;
        this.l0 = arh;
        this.l1 = c101713yx;
        this.l2 = enumC101493yb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS105S0300000_1(Activity activity, Activity activity2, C68322mC<IMUser> c68322mC, C99033ud c99033ud) {
        super(1);
        this.$t = c99033ud;
        this.l0 = activity;
        this.l1 = activity2;
        this.l2 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS105S0300000_1(Activity activity, Activity activity2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = activity;
        this.l1 = activity2;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0300000_1(Context context, InterfaceC62225ObV interfaceC62225ObV, SharePackage sharePackage, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC62225ObV;
        this.l1 = context;
        this.l2 = sharePackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0300000_1(Context context, Aweme aweme, C793439m c793439m, int i) {
        super(1);
        this.$t = i;
        this.l0 = c793439m;
        this.l1 = aweme;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0300000_1(Context context, GroupChatDetailAssem groupChatDetailAssem, C81243Gu c81243Gu, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = groupChatDetailAssem;
        this.l2 = c81243Gu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0300000_1(View.OnClickListener onClickListener, View view, C112874br c112874br, int i) {
        super(1);
        this.$t = i;
        this.l0 = onClickListener;
        this.l1 = view;
        this.l2 = c112874br;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0300000_1(View view, FrameLayout frameLayout, TrendingBillboardHeaderAssem trendingBillboardHeaderAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = frameLayout;
        this.l2 = trendingBillboardHeaderAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS105S0300000_1(UIAssem uIAssem, UIAssem uIAssem2, List<C72412sn> list, StickerSetContentEditButtonAssem stickerSetContentEditButtonAssem) {
        super(1);
        this.$t = stickerSetContentEditButtonAssem;
        this.l0 = uIAssem;
        this.l1 = uIAssem2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0300000_1(InputView inputView, C32V c32v, C4B8 c4b8, int i) {
        super(1);
        this.$t = i;
        this.l0 = inputView;
        this.l1 = c32v;
        this.l2 = c4b8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0300000_1(IMInputEditTextAssem iMInputEditTextAssem, C32V c32v, C4B8 c4b8, int i) {
        super(1);
        this.$t = i;
        this.l0 = iMInputEditTextAssem;
        this.l1 = c32v;
        this.l2 = c4b8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0300000_1(ProfileUser profileUser, User user, EnumC235129Kq enumC235129Kq, int i) {
        super(1);
        this.$t = i;
        this.l0 = profileUser;
        this.l1 = user;
        this.l2 = enumC235129Kq;
    }
}
