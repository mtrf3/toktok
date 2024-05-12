package Y;

import X.ActivityC45651qj;
import X.B83;
import X.BEA;
import X.BQQ;
import X.BV9;
import X.BWS;
import X.BZI;
import X.C01R;
import X.C15380j0;
import X.C1FL;
import X.C28787BRn;
import X.C28871BUt;
import X.C29033BaP;
import X.C29306Beo;
import X.C29355Bfb;
import X.C29356Bfc;
import X.C29374Bfu;
import X.C29377Bfx;
import X.C29390BgA;
import X.C29494Bhq;
import X.C30882CAc;
import X.C32289Clp;
import X.C32364Cn2;
import X.C32537Cpp;
import X.C38354F3m;
import X.C51029K0z;
import X.C73943T0h;
import X.C76800UCe;
import X.C78895Uxn;
import X.C78920UyC;
import X.C7N;
import X.C87095YGd;
import X.CN1;
import X.EnumC31514CYk;
import X.InterfaceC29405BgP;
import X.InterfaceC65784Pro;
import X.JBR;
import X.KNV;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.setting.AnchorRankingSettingDialog;
import com.bytedance.android.live.rank.impl.setting.NewRankSettingDialog;
import com.bytedance.android.live.toolbar.ToolbarButtonMoreDialogNew;
import com.bytedance.android.livesdk.broadcast.interaction.toolbar.LiveToolbarMoreSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.AnchorTechViewPagerDialog;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.impl.revenue.subscription.dialog.SubscribeGiftSubHintDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionGiftSendDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcaseAnchorOnboardGuideModeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAnchorOnboardGuideH5LinkSettingNew;
import com.bytedance.android.livesdk.livesetting.subscription.LiveAnchorSubGiftSchemaSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveGiftSubTermsSchemaSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveReplayFaqSetting;
import com.bytedance.android.livesdk.model.message.CommentsMessage;
import com.bytedance.android.livesdk.qa.TurnQuestionDialog;
import com.bytedance.android.livesdk.rank.impl.CloseRankDialogEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDCSpanS31S0100000_5 extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                return;
            case 1:
                updateDrawState$1(this, textPaint);
                return;
            case 2:
                updateDrawState$2(this, textPaint);
                return;
            case 3:
                o.LJIIIZ(textPaint, "ds");
                return;
            case 4:
            default:
                super.updateDrawState(textPaint);
                return;
            case 5:
                o.LJIIIZ(textPaint, "ds");
                return;
            case 6:
                updateDrawState$5(this, textPaint);
                return;
            case 7:
                updateDrawState$6(this, textPaint);
                return;
            case 8:
                updateDrawState$7(this, textPaint);
                return;
            case 9:
                updateDrawState$8(this, textPaint);
                return;
            case 10:
                updateDrawState$9(this, textPaint);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                o.LJIIIZ(textPaint, "ds");
                return;
            case 12:
                updateDrawState$11(this, textPaint);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                o.LJIIIZ(textPaint, "ds");
                return;
            case 14:
                o.LJIIIZ(textPaint, "ds");
                return;
        }
    }

    public IDCSpanS31S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        String value = LiveReplayFaqSetting.INSTANCE.getValue();
        if (C38354F3m.LJ(value)) {
            if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                value = "https://inapp-va.tiktokv.com/falcon/webcast_mt/page/faq/index.html";
            } else {
                value = "https://inapp.tiktokv.com/falcon/webcast_mt/page/faq/index.html";
            }
        }
        C7N.LJFF().Lu();
        Context context = ((PreviewReplayWidget) iDCSpanS31S0100000_5.l0).context;
        C28871BUt c28871BUt = new C28871BUt(value);
        c28871BUt.LIZJ = true;
        C30882CAc.LJII(context, c28871BUt);
        C78920UyC.LJI("livesdk_faq_enter_click", "livetake_page", "event_page");
        ((PreviewReplayWidget) iDCSpanS31S0100000_5.l0).LLFII("1");
    }

    public static final void onClick$1(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((SubscribeGiftSubHintDialog) iDCSpanS31S0100000_5.l0).getContext(), LiveAnchorSubGiftSchemaSetting.INSTANCE.getGiftSubFaqSchema());
    }

    public static final void onClick$10(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View view) {
        FragmentManager fragmentManager = (FragmentManager) ((BV9) iDCSpanS31S0100000_5.l0).LL.kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            new TurnQuestionDialog().show(fragmentManager, "HeaderViewHolder");
        }
    }

    public static final void onClick$11(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        long j;
        Room room;
        o.LJIIIZ(widget, "widget");
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(((LiveToolbarMoreSheet) iDCSpanS31S0100000_5.l0).getContext());
        if (LIZIZ != null) {
            LiveToolbarMoreSheet liveToolbarMoreSheet = (LiveToolbarMoreSheet) iDCSpanS31S0100000_5.l0;
            liveToolbarMoreSheet.dismiss();
            IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(liveToolbarMoreSheet);
            if (LJIILIIL != null && (room = (Room) LJIILIIL.kv0(RoomChannel.class)) != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            iHostAction.jumpToFeedBack(LIZIZ, j);
        }
    }

    public static final void onClick$12(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        C32289Clp c32289Clp = (C32289Clp) iDCSpanS31S0100000_5.l0;
        if (c32289Clp.LIZIZ) {
            ((IActionHandlerService) c32289Clp.LIZJ.getValue()).handle(((C32289Clp) iDCSpanS31S0100000_5.l0).LIZ, "https://support.tiktok.com/en/live-gifts-wallet/tiktok-live/live-gifts-on-tiktok");
        } else {
            ((IActionHandlerService) c32289Clp.LIZJ.getValue()).handle(((C32289Clp) iDCSpanS31S0100000_5.l0).LIZ, "https://support.tiktok.com/en/live-gifts-wallet/gifts/send-a-gift-during-a-live-on-tiktok");
        }
    }

    public static final void onClick$13(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        ((Runnable) iDCSpanS31S0100000_5.l0).run();
    }

    public static final void onClick$14(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        long j;
        Room room;
        o.LJIIIZ(widget, "widget");
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(((ToolbarButtonMoreDialogNew) iDCSpanS31S0100000_5.l0).getContext());
        if (LIZIZ != null) {
            ToolbarButtonMoreDialogNew toolbarButtonMoreDialogNew = (ToolbarButtonMoreDialogNew) iDCSpanS31S0100000_5.l0;
            toolbarButtonMoreDialogNew.dismiss();
            IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(toolbarButtonMoreDialogNew);
            if (LJIILIIL != null && (room = (Room) LJIILIIL.kv0(RoomChannel.class)) != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            iHostAction.jumpToFeedBack(LIZIZ, j);
        }
    }

    public static final void onClick$2(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        ((InterfaceC65784Pro) iDCSpanS31S0100000_5.l0).invoke();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String, O] */
    public static final void onClick$3(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View p0) {
        FragmentManager LJFF;
        o.LJIIIZ(p0, "p0");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((RankListFragment) iDCSpanS31S0100000_5.l0).LJLJLJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        RankListFragment rankListFragment = (RankListFragment) iDCSpanS31S0100000_5.l0;
        if (rankListFragment.LJLJJI.LIZ == EnumC31514CYk.GIFT_RANK) {
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(rankListFragment);
            if (LJIILIIL != null) {
                LJIILIIL.pv0(CloseRankDialogEvent.class);
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            StringBuilder LIZ = X1D.LIZ();
            ((C32537Cpp) dataChannelGlobal.gv0(C29033BaP.class)).LIZ = JBR.LJFF(LIZ, ((RankListFragment) iDCSpanS31S0100000_5.l0).LJLJJI.LIZIZ.rankName, "_bottom_bar", LIZ);
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL((RankListFragment) iDCSpanS31S0100000_5.l0);
            if (LJIILIIL2 != null) {
                try {
                    FragmentManager fragmentManager = (FragmentManager) LJIILIIL2.kv0(C29494Bhq.class);
                    if (fragmentManager != null) {
                        Bundle LIZ2 = C01R.LIZ("is_from_lynx_audience_list", false);
                        NewRankSettingDialog newRankSettingDialog = new NewRankSettingDialog();
                        newRankSettingDialog.setArguments(LIZ2);
                        newRankSettingDialog.show(fragmentManager, fragmentManager.getClass().getName());
                        return;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(rankListFragment);
        if (LJIILIIL3 != null && (LJFF = C29306Beo.LJFF(LJIILIIL3)) != null) {
            new AnchorRankingSettingDialog().show(LJFF, "AnchorRankingSettingDialog");
        }
    }

    public static final void onClick$4(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View view) {
        if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            Context context = ((View) ((C29390BgA) iDCSpanS31S0100000_5.l0).LIZ.get()).getContext();
            C29356Bfc c29356Bfc = new C29356Bfc();
            c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.sot);
            c29356Bfc.LIZJ = 0;
            ((C29374Bfu) LIZIZ).LIZLLL(context, new C29377Bfx(c29356Bfc)).LIZ(new C29355Bfb());
            return;
        }
        CommentsMessage commentsMessage = (CommentsMessage) ((C29390BgA) iDCSpanS31S0100000_5.l0).LJ.LJIJJLI;
        if (commentsMessage.actionType == 1 && !TextUtils.isEmpty(commentsMessage.actionContent)) {
            C32364Cn2 c32364Cn2 = new C32364Cn2(((CommentsMessage) ((C29390BgA) iDCSpanS31S0100000_5.l0).LJ.LJIJJLI).actionContent);
            Room room = ((C29390BgA) iDCSpanS31S0100000_5.l0).LIZJ;
            if (room != null && room.getOwner() != null) {
                c32364Cn2.LIZIZ(((C29390BgA) iDCSpanS31S0100000_5.l0).LIZJ.getOwner().getId(), "anchor_id");
                c32364Cn2.LIZIZ(((C29390BgA) iDCSpanS31S0100000_5.l0).LIZJ.getId(), "room_id");
            }
            c32364Cn2.LIZIZ(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), "user_id");
            BWS bws = new BWS(8, c32364Cn2.LIZLLL(), "");
            bws.LJII = true;
            C73943T0h.LIZ().LIZIZ(bws);
        }
    }

    public static final void onClick$5(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        ((Runnable) iDCSpanS31S0100000_5.l0).run();
    }

    public static final void onClick$6(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        ((Runnable) iDCSpanS31S0100000_5.l0).run();
    }

    public static final void onClick$7(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        String value = LiveBroadcastAnchorOnboardGuideH5LinkSettingNew.INSTANCE.getValue();
        String str = "";
        if (ujb.o.LJJJLIIL(value, ((AnchorTechViewPagerDialog) iDCSpanS31S0100000_5.l0).LJLLI, false) && (value = UriProtector.getQueryParameter(UriProtector.parse(value), "url")) == null) {
            value = "";
        }
        AnchorTechViewPagerDialog anchorTechViewPagerDialog = (AnchorTechViewPagerDialog) iDCSpanS31S0100000_5.l0;
        anchorTechViewPagerDialog.getClass();
        C32364Cn2 c32364Cn2 = new C32364Cn2(value);
        c32364Cn2.LIZIZ(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), "user_id");
        List<BQQ> list = anchorTechViewPagerDialog.LJLJLLL;
        if (list != null) {
            if (!LiveBroadcaseAnchorOnboardGuideModeSetting.INSTANCE.showMode2() || (list = anchorTechViewPagerDialog.LJLL) != null) {
                if (anchorTechViewPagerDialog.LJLJL < list.size()) {
                    str = ((BQQ) ListProtector.get(list, anchorTechViewPagerDialog.LJLJL)).LIZLLL;
                }
                c32364Cn2.LIZJ("enter_from", str);
                c32364Cn2.LIZ(anchorTechViewPagerDialog.LJLJL, "page_rank");
                String uri = UriProtector.parse(c32364Cn2.LIZLLL()).toString();
                o.LJIIIIZZ(uri, "parse(urlBuilder.build()).toString()");
                String uri2 = new Uri.Builder().scheme(((AnchorTechViewPagerDialog) iDCSpanS31S0100000_5.l0).LJLLI).authority("webcast_webview").appendQueryParameter("url", uri).appendQueryParameter("trans_status_bar", "1").appendQueryParameter("use_spark", "1").appendQueryParameter("block_back_press", "1").build().toString();
                o.LJIIIIZZ(uri2, "Builder().scheme(webcast…      .build().toString()");
                ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((AnchorTechViewPagerDialog) iDCSpanS31S0100000_5.l0).getContext(), uri2);
                return;
            }
            o.LJIJI("mode2ItemDataList");
            throw null;
        }
        o.LJIJI("mode1ItemDataList");
        throw null;
    }

    public static final void onClick$8(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        String str;
        String str2;
        o.LJIIIZ(widget, "widget");
        BEA.LIZ.getClass();
        int LIZIZ = BEA.LIZIZ();
        LiveEditText liveEditText = (LiveEditText) iDCSpanS31S0100000_5.l0;
        if (liveEditText != null) {
            liveEditText.setText(String.valueOf(LIZIZ));
        }
        boolean LJ = BEA.LJ();
        String firstPanelFrom = BEA.LJJIIZI;
        String secondPanelFrom = BEA.LJJIJ;
        if (BEA.LJIJI > BEA.LJIJJ) {
            str = "highest";
        } else {
            str = "suggest";
        }
        boolean z = BEA.LJIILL;
        o.LJIIIZ(firstPanelFrom, "firstPanelFrom");
        o.LJIIIZ(secondPanelFrom, "secondPanelFrom");
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_limit_gear_setting_apply_click");
        KNV.LJ(LJ ? 1 : 0, LIZ, "is_anchor", firstPanelFrom, "first_panel_from");
        LIZ.LJIJJ(secondPanelFrom, "second_panel_from");
        C78895Uxn.LIZIZ(LIZ, str, "apply_type", LIZIZ, "apply_amount");
        if (z) {
            str2 = "coins";
        } else {
            str2 = "currency";
        }
        C1FL.LJI(LIZ, str2, "coins_or_currency");
    }

    public static final void onClick$9(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        if (!((SubscriptionGiftSendDialog) iDCSpanS31S0100000_5.l0).LJLLL) {
            return;
        }
        Locale currentLocale = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale();
        LiveGiftSubTermsSchemaSetting liveGiftSubTermsSchemaSetting = LiveGiftSubTermsSchemaSetting.INSTANCE;
        String LIZ = C87095YGd.LIZ(currentLocale);
        o.LJIIIIZZ(LIZ, "getWebcastLanguage(locale)");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((SubscriptionGiftSendDialog) iDCSpanS31S0100000_5.l0).getContext(), liveGiftSubTermsSchemaSetting.getSchema(LIZ));
    }

    public static final void updateDrawState$0(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$1(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$11(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$5(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(ColorProtector.parseColor("#FE2C55"));
    }

    public static final void updateDrawState$6(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$7(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$8(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$9(IDCSpanS31S0100000_5 iDCSpanS31S0100000_5, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
