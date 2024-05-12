package Y;

import X.AbstractC62595OhT;
import X.AbstractC86187Xs7;
import X.BZI;
import X.C08680Vs;
import X.C162476Zf;
import X.C16880lQ;
import X.C188727au;
import X.C251669uE;
import X.C26045AKb;
import X.C28787BRn;
import X.C29227BdX;
import X.C30591Hz;
import X.C36922EeM;
import X.C38354F3m;
import X.C39061g6;
import X.C61200O0e;
import X.C61618OGg;
import X.C61624OGm;
import X.C61627OGp;
import X.C61628OGq;
import X.C62287OcV;
import X.C62488Ofk;
import X.C62648OiK;
import X.C62727Ojb;
import X.C77117UOj;
import X.C78857UxB;
import X.C78862UxG;
import X.C79004UzY;
import X.C79493Ab;
import X.C86184Xs4;
import X.CN1;
import X.FMX;
import X.InterfaceC62486Ofi;
import X.K0R;
import X.NZD;
import X.OHT;
import X.OP7;
import X.OP8;
import X.OPA;
import X.Q0C;
import X.SFS;
import X.X1D;
import X.XVF;
import X.XVG;
import X.XXF;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ACListenerS28S0101000_10 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS28S0101000_10 aCListenerS28S0101000_10, View view) {
        DataChannel dataChannel;
        switch (aCListenerS28S0101000_10.i1) {
            case 0:
                LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aCListenerS28S0101000_10.l0;
                liveRoomUserInfoWidget.LLILLIZIL();
                if (!liveRoomUserInfoWidget.LLILLIZIL && (dataChannel = liveRoomUserInfoWidget.dataChannel) != null) {
                    dataChannel.pv0(ResetSilentTimerEvent.class);
                    return;
                }
                return;
            case 1:
                NZD nzd = (NZD) aCListenerS28S0101000_10.l0;
                nzd.getClass();
                int id = view.getId();
                nzd.LIZ().dismiss();
                String currentUrl = nzd.LJI.LJIIJJI().getCurrentUrl();
                if (id == R.id.hbo) {
                    Activity activity = nzd.LJFF;
                    if (C38354F3m.LJ(currentUrl)) {
                        return;
                    }
                    try {
                        Intent intent = new Intent();
                        intent.setData(UriProtector.parse(currentUrl));
                        intent.setAction("android.intent.action.VIEW");
                        C16880lQ.LIZIZ(activity, intent);
                        return;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
                if (id == R.id.bva) {
                    Activity activity2 = nzd.LJFF;
                    C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476399124, "bpea-214");
                    if (C38354F3m.LJ(currentUrl)) {
                        return;
                    }
                    try {
                        OHT.LIZ("", currentUrl, activity2, LJJIIJ);
                    } catch (Q0C e2) {
                        C36922EeM.LIZ(e2);
                    }
                    C26045AKb c26045AKb = new C26045AKb(activity2);
                    c26045AKb.LJFF(R.drawable.anx);
                    c26045AKb.LJIIIIZZ(R.string.se6);
                    c26045AKb.LJIIJ();
                    return;
                }
                if (id != R.id.itn) {
                    return;
                }
                nzd.LJI.LJIIJJI().refresh();
                return;
            default:
                Fragment fragment = (Fragment) aCListenerS28S0101000_10.l0;
                fragment.getClass();
                K0R.LIZIZ.LIZ(fragment.getContext(), "following_feed", "homepage_follow");
                return;
        }
    }

    public static final void onClick$1(ACListenerS28S0101000_10 aCListenerS28S0101000_10, View view) {
        boolean LIZ;
        LIZ = C251669uE.LIZ(view, LinkMicRtcMixBitrateSetting.DEFAULT);
        if (LIZ) {
            return;
        }
        C62488Ofk c62488Ofk = (C62488Ofk) aCListenerS28S0101000_10.l0;
        c62488Ofk.LJLJI.LIZIZ((InterfaceC62486Ofi) ListProtector.get(c62488Ofk.LJLIL, aCListenerS28S0101000_10.i1));
    }

    public static final void onClick$2(ACListenerS28S0101000_10 aCListenerS28S0101000_10, View view) {
        OP8 op8;
        OP7 op7 = (OP7) aCListenerS28S0101000_10.l0;
        int i = OPA.LIZ[op7.LJLJJI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    op8 = OP8.SELECTED;
                } else {
                    throw new C162476Zf();
                }
            } else {
                op8 = OP8.UNSELECTED;
            }
            o.LJIIIZ(op8, "<set-?>");
            op7.LJLJJI = op8;
            ((OP7) aCListenerS28S0101000_10.l0).LJLJI.invoke(Integer.valueOf(aCListenerS28S0101000_10.i1));
            ((OP7) aCListenerS28S0101000_10.l0).L();
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(((OP7) aCListenerS28S0101000_10.l0).LJLIL);
        c26045AKb.LJIIIIZZ(R.string.hme);
        c26045AKb.LJIIJ();
    }

    public static final void onClick$3(ACListenerS28S0101000_10 aCListenerS28S0101000_10, View view) {
        ((C62727Ojb) aCListenerS28S0101000_10.l0).LJLJI.LIZ(aCListenerS28S0101000_10.i1);
    }

    public static final void onClick$4(ACListenerS28S0101000_10 aCListenerS28S0101000_10, View view) {
        C62287OcV c62287OcV = (C62287OcV) aCListenerS28S0101000_10.l0;
        int i = aCListenerS28S0101000_10.i1;
        c62287OcV.LJLILLLLZI = i;
        AqS176S0100000_10 aqS176S0100000_10 = c62287OcV.LJLJI;
        if (aqS176S0100000_10 != null) {
            aqS176S0100000_10.invoke(Integer.valueOf(i));
        }
        ((C62287OcV) aCListenerS28S0101000_10.l0).notifyDataSetChanged();
    }

    public static final void onClick$5(ACListenerS28S0101000_10 aCListenerS28S0101000_10, View view) {
        boolean z;
        switch (aCListenerS28S0101000_10.i1) {
            case 0:
                ((AbstractC86187Xs7) aCListenerS28S0101000_10.l0).LJLJI.jv0(Boolean.TRUE, "dismiss_live_window");
                return;
            default:
                C62648OiK c62648OiK = (C62648OiK) aCListenerS28S0101000_10.l0;
                if (c62648OiK.LJLJJI != null) {
                    boolean z2 = true;
                    ((Keva) C79493Ab.LIZ.getValue()).storeBoolean((String) C79493Ab.LIZJ.getValue(), true);
                    if (c62648OiK.LJLJJI.getCheckedRadioButtonId() == R.id.ayr) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c62648OiK.LJIIJ(z);
                    if (c62648OiK.LJLJJI.getCheckedRadioButtonId() != R.id.ayr) {
                        z2 = false;
                    }
                    c62648OiK.LJIIL("download", z2);
                    return;
                }
                return;
        }
    }

    public static final void onClick$6(ACListenerS28S0101000_10 aCListenerS28S0101000_10, View view) {
        String LIZIZ;
        switch (aCListenerS28S0101000_10.i1) {
            case 0:
                C29227BdX c29227BdX = (C29227BdX) aCListenerS28S0101000_10.l0;
                if (c29227BdX.LJ == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("show_source", c29227BdX.LJFF);
                hashMap.put("banner_id", String.valueOf(c29227BdX.LJ.id));
                C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
                hashMap.put("tab_type", c08680Vs.LJII);
                BZI LIZ = C28787BRn.LIZ("banner_click");
                LIZ.LJJIFFI(hashMap);
                LIZ.LJIIZILJ();
                LIZ.LJIJJ(Integer.valueOf(c29227BdX.LJI + 1), "banner_position");
                LIZ.LJIJJ(C77117UOj.LJIIL(c29227BdX.LJ), "activity_id");
                LIZ.LJIJJ("more_anchor", "banner_page");
                LIZ.LJIJJ("campaign_static", "banner_type");
                LIZ.LJIJJ(c08680Vs.LJIIJJI, "landing_reason");
                LIZ.LJJIIJZLJL();
                if (TextUtils.isEmpty(c29227BdX.LJ.schemaUrl) || CN1.LIZ(IHostAction.class) == null) {
                    return;
                }
                ((IHostAction) CN1.LIZ(IHostAction.class)).handleSchema(c29227BdX.LIZLLL, c29227BdX.LJ.schemaUrl, new Bundle());
                return;
            case 1:
                C61627OGp c61627OGp = (C61627OGp) aCListenerS28S0101000_10.l0;
                Banner banner = c61627OGp.LJLJJL;
                if (banner == null || TextUtils.isEmpty(banner.getSchema())) {
                    return;
                }
                String schema = c61627OGp.LJLJJL.getSchema();
                Banner.BannerSchemaType schemaType = c61627OGp.LJLJJL.getSchemaType();
                int i = C61618OGg.LIZ[schemaType.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        try {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("aweme://webview/?url=");
                            LIZ2.append(URLEncoder.encode(schema, "UTF-8"));
                            SmartRouter.buildRoute(c61627OGp.itemView.getContext(), X1D.LIZIZ(LIZ2)).open(10086);
                        } catch (UnsupportedEncodingException e) {
                            C16880lQ.LLLLIIL(e);
                            return;
                        }
                    } else {
                        String uuid = UUID.randomUUID().toString();
                        SmartRoute buildRoute = SmartRouter.buildRoute(c61627OGp.itemView.getContext(), c61627OGp.LJLJJL.getSchema());
                        buildRoute.withParam("process_id", uuid);
                        buildRoute.withParam("extra_music_from", "choose_music_with_banner");
                        buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", c61627OGp.LJLIL);
                        buildRoute.withParam("from_banner_id", c61627OGp.LJLJJL.getBid());
                        buildRoute.withParam("banner_id", c61627OGp.LJLJJL.getBid());
                        buildRoute.withParam("banner_type", schemaType.mobValue);
                        buildRoute.open(10086);
                        List LJIIL = C30591Hz.LJIIL(c61627OGp.LJLJJL.getSchema());
                        if (!C79004UzY.LJJIFFI(LJIIL) && LJIIL.size() > 1) {
                            XVF.LJIIIIZZ(new XVG("change_music_page", "", "click_banner", XVF.LIZ), (String) ListProtector.get(LJIIL, 1), true, uuid);
                        }
                    }
                } else {
                    if (!schema.contains("?")) {
                        StringBuilder LIZJ = b1.LIZJ(schema, "?musicType=");
                        LIZJ.append(c61627OGp.LJLIL);
                        LIZIZ = X1D.LIZIZ(LIZJ);
                    } else {
                        StringBuilder LIZJ2 = b1.LIZJ(schema, "&musicType=");
                        LIZJ2.append(c61627OGp.LJLIL);
                        LIZIZ = X1D.LIZIZ(LIZJ2);
                    }
                    SmartRoute buildRoute2 = SmartRouter.buildRoute(c61627OGp.itemView.getContext(), LIZIZ);
                    buildRoute2.withParam("sound_page_scene", c61627OGp.LJLJJI);
                    buildRoute2.withParam("extra_music_from", "choose_music_with_banner");
                    buildRoute2.withParam("max_video_duration", c61627OGp.LJLJL);
                    buildRoute2.withParam("shoot_video_length", c61627OGp.LJLJLJ);
                    buildRoute2.withParam("from_banner_id", c61627OGp.LJLJJL.getBid());
                    buildRoute2.withParam("banner_id", c61627OGp.LJLJJL.getBid());
                    buildRoute2.withParam("banner_type", schemaType.mobValue);
                    if (schemaType == Banner.BannerSchemaType.AI_RECOMMEND_PLAYLIST) {
                        buildRoute2.withParam("ai_recommend_playlist", true);
                    }
                    buildRoute2.open(10086);
                    XVF.LJIIIZ(C30591Hz.LJIILIIL(c61627OGp.LJLJJL.getSchema(), "name"), "click_banner", null, Integer.valueOf(c61627OGp.LJLJJLL), c61627OGp.LJLJJL.getBid(), "change_music_page", c61627OGp.LJLJJL.getCategoryId());
                }
                Banner banner2 = c61627OGp.LJLJJL;
                int i2 = c61627OGp.LJLJJLL;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "change_music_page");
                c188727au.LJIIIZ("banner_id", banner2.getBid());
                c188727au.LJIIIZ("client_order", Integer.toString(i2));
                int i3 = C61628OGq.LIZIZ[banner2.getSchemaType().ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        c188727au.LJI("category_id", banner2.getCategoryId());
                    }
                } else {
                    c188727au.LJI("music_id", banner2.getMusicId());
                }
                if (XVF.LIZJ()) {
                    c188727au.LJI("is_commercial", "1");
                }
                FMX.LJIIL("banner_click", c188727au.LIZ);
                return;
            case 2:
                ((XXF) aCListenerS28S0101000_10.l0).onClick(view);
                return;
            case 3:
                C86184Xs4 c86184Xs4 = (C86184Xs4) aCListenerS28S0101000_10.l0;
                if (c86184Xs4.LJI()) {
                    return;
                }
                c86184Xs4.LJIILJJIL(0);
                return;
            case 4:
                ((StickerPropDetailFragment) aCListenerS28S0101000_10.l0).Rl("click_name");
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS28S0101000_10.l0).lambda$initUnits$37(view);
                return;
        }
    }

    public static final void onClick$7(ACListenerS28S0101000_10 aCListenerS28S0101000_10, View view) {
        String LIZIZ;
        String str;
        switch (aCListenerS28S0101000_10.i1) {
            case 0:
                C61624OGm c61624OGm = (C61624OGm) aCListenerS28S0101000_10.l0;
                Banner banner = c61624OGm.LJLJJL;
                if (banner != null && !TextUtils.isEmpty(banner.getSchema())) {
                    String schema = c61624OGm.LJLJJL.getSchema();
                    if (schema != null && schema.startsWith("aweme://assmusic/category/")) {
                        if (!schema.contains("?")) {
                            StringBuilder LIZJ = b1.LIZJ(schema, "?musicType=");
                            LIZJ.append(c61624OGm.LJLIL);
                            LIZIZ = X1D.LIZIZ(LIZJ);
                        } else {
                            StringBuilder LIZJ2 = b1.LIZJ(schema, "&musicType=");
                            LIZJ2.append(c61624OGm.LJLIL);
                            LIZIZ = X1D.LIZIZ(LIZJ2);
                        }
                        SmartRouter.buildRoute(c61624OGm.itemView.getContext(), LIZIZ).open(10086);
                        String LJIILIIL = C30591Hz.LJIILIIL(c61624OGm.LJLJJL.getSchema(), "name");
                        String bid = c61624OGm.LJLJJL.getBid();
                        List LJIIL = C30591Hz.LJIIL(LIZIZ);
                        if (!C79004UzY.LJJIFFI(LJIIL) && LJIIL.size() >= 2) {
                            str = (String) ListProtector.get(LJIIL, 1);
                        } else {
                            str = "";
                        }
                        SFS.LJJII(LJIILIIL, "click_banner", bid, "change_music_page", str);
                        return;
                    }
                    if (!TextUtils.isEmpty(schema) && (schema.startsWith("http://") || schema.startsWith("https://"))) {
                        try {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("aweme://webview/?url=");
                            LIZ.append(URLEncoder.encode(schema, "UTF-8"));
                            LIZ.append("&use_spark=1");
                            SmartRouter.buildRoute(c61624OGm.itemView.getContext(), X1D.LIZIZ(LIZ)).open(10086);
                            return;
                        } catch (UnsupportedEncodingException e) {
                            C16880lQ.LLLLIIL(e);
                            return;
                        }
                    }
                    String uuid = UUID.randomUUID().toString();
                    SmartRoute buildRoute = SmartRouter.buildRoute(c61624OGm.itemView.getContext(), c61624OGm.LJLJJL.getSchema());
                    buildRoute.withParam("process_id", uuid);
                    buildRoute.open(10086);
                    List LJIIL2 = C30591Hz.LJIIL(c61624OGm.LJLJJL.getSchema());
                    if (C79004UzY.LJJIFFI(LJIIL2) || LJIIL2.size() > 1) {
                    }
                    return;
                }
                return;
            case 1:
                ((SettingNewVersionFragment) aCListenerS28S0101000_10.l0).lambda$initUnits$39(view);
                return;
            default:
                AbstractC62595OhT abstractC62595OhT = (AbstractC62595OhT) aCListenerS28S0101000_10.l0;
                if (abstractC62595OhT.LJZL == null) {
                    return;
                }
                AwemeService.LIZ().R1(abstractC62595OhT.LJZL);
                C61200O0e LIZLLL = C61200O0e.LIZLLL();
                Activity activity = abstractC62595OhT.LJLJLJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("aweme://aweme/detail/");
                LIZ2.append(abstractC62595OhT.LJZL.getAid());
                C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ2));
                c39061g6.LIZ(abstractC62595OhT.LJZL.getEnterpriseType(), "profile_enterprise_type");
                c39061g6.LIZIZ("query_aweme_mode", "from_local");
                c39061g6.LIZIZ("enter_from", "release");
                c39061g6.LIZIZ("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload");
                LIZLLL.LJI(activity, c39061g6.LIZJ());
                AVExternalServiceImpl.LIZ().publishService().setPublishStatus(11);
                abstractC62595OhT.dismiss();
                return;
        }
    }

    public ACListenerS28S0101000_10(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
