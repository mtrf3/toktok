package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideUserLevelSparkSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveUserPreviewOptPackageSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FollowGuidVoidSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.StateControlMediaLabelPageUrl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.util.Iterator;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.BiE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29518BiE {
    public final C29484Bhg LIZ;
    public User LIZIZ;
    public final Room LIZJ;
    public final User LIZLLL;
    public final UserProfileEvent LJ;

    public final String LIZ(String str) {
        String queryParameter;
        android.net.Uri parse = UriProtector.parse(str);
        String queryParameter2 = UriProtector.getQueryParameter(parse, "noble_intercept");
        if (queryParameter2 == null || C1E4.LJJIFFI(queryParameter2) == 0) {
            return str;
        }
        String queryParameter3 = UriProtector.getQueryParameter(parse, "url");
        if (queryParameter3 == null) {
            return str;
        }
        String uri = UriProtector.parse(queryParameter3).buildUpon().appendQueryParameter("status_bar_height", String.valueOf(C15380j0.LJIJ(C15450j7.LIZ(this.LIZ.LIZ)))).build().toString();
        o.LJIIIIZZ(uri, "parse(url)\n            .…)\n            .toString()");
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        Iterator LIZ = C47117IeP.LIZ(parse, "uri.queryParameterNames");
        while (LIZ.hasNext()) {
            String str2 = (String) LIZ.next();
            if (str2.equals("url")) {
                queryParameter = uri;
            } else {
                queryParameter = UriProtector.getQueryParameter(parse, str2);
            }
            clearQuery.appendQueryParameter(str2, queryParameter);
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_nobility_page_click");
        LIZ2.LJIJJ("card", "type");
        LIZ2.LJJIIJZLJL();
        String uri2 = clearQuery.build().toString();
        o.LJIIIIZZ(uri2, "finalUri.build().toString()");
        return uri2;
    }

    public final void LIZIZ(BadgeStruct badgeStruct) {
        String str;
        String str2;
        int i;
        String str3;
        o.LJIIIZ(badgeStruct, "badgeStruct");
        int i2 = badgeStruct.badgeScene;
        if (i2 != 4) {
            if (i2 != 9) {
                if (i2 != 11) {
                    return;
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_live_pro_badge_show");
                LIZ.LJIJJ(Long.valueOf(this.LIZJ.getOwnerUserId()), "anchor_id");
                LIZ.LJIJJ(Long.valueOf(this.LIZJ.getId()), "room_id");
                LIZ.LJIJJ("profile_card", "position");
                LIZ.LJIJJ(Integer.valueOf(this.LIZ.LIZJ.LIZ() ? 1 : 0), "is_anchor");
                LIZ.LJJIIJZLJL();
                return;
            }
            C28965BYj.LIZJ("live_mini_profile");
            return;
        }
        String str4 = "anchor";
        String str5 = "self_anchor_personal_profile";
        if (C29232Bdc.LJIIIIZZ(this.LIZ.LJIIIIZZ)) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_subscribe_icon_show");
            LIZ2.LJIILLIIL(this.LIZ.LJIIIIZZ);
            C06490Nh.LIZLLL(LIZ2, "self_anchor_personal_profile", "show_entrance", "anchor", "user_type");
        }
        if (this.LIZ.LIZJ.LIZJ() || this.LIZ.LIZJ.LJ() || this.LIZ.LIZJ.LIZ.coHostEnable) {
            if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_subscribe_medal_show")) {
                return;
            }
            BZI LIZ3 = C28787BRn.LIZ("livesdk_subscribe_medal_show");
            LIZ3.LJIJJ(Long.valueOf(this.LIZJ.getId()), "room_id");
            LIZ3.LJIJJ(Long.valueOf(this.LIZ.LIZJ.LIZIZ.getId()), "user_id");
            LIZ3.LJIJJ(Long.valueOf(this.LIZIZ.getId()), "to_user_id");
            if (!this.LIZ.LIZJ.LIZ()) {
                str4 = "user";
            }
            LIZ3.LJIJJ(str4, "user_type");
            LIZ3.LJIJJ(BJM.LJFF(), "enter_from_merge");
            LIZ3.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
            LIZ3.LJIJJ(BJM.LJIILIIL(), "request_id");
            LIZ3.LJIJJ(BJM.LJIJ(), "video_id");
            if (this.LIZ.LIZJ.LIZJ()) {
                if (!this.LIZ.LIZJ.LIZLLL()) {
                    str5 = "host_anchor_personal_profile";
                }
            } else if (this.LIZ.LIZJ.LIZ()) {
                str5 = "other_anchor_personal_profile";
            } else {
                str5 = "link_anchor_personal_profile";
            }
            LIZ3.LJIJJ(str5, "show_entrance");
            LIZ3.LJJIIJZLJL();
            return;
        }
        BZI LIZ4 = C28787BRn.LIZ("livesdk_privilege_badge_show");
        LIZ4.LIZJ("click");
        LIZ4.LJIJJ(Long.valueOf(this.LIZJ.getOwnerUserId()), "anchor_id");
        LIZ4.LJIJJ(Long.valueOf(this.LIZJ.getId()), "room_id");
        LIZ4.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ4.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        LIZ4.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ4.LJIJJ(BJM.LJIJ(), "video_id");
        LIZ4.LJIJJ("personal_profile", "show_entrance");
        PrivilegeLogExtra privilegeLogExtra = badgeStruct.logExtra;
        String str6 = "";
        if (privilegeLogExtra == null || (str = privilegeLogExtra.privilege_id) == null) {
            str = "";
        }
        LIZ4.LJIJJ(str, "privilege_id");
        C28246B6s c28246B6s = (C28246B6s) this.LIZ.LJIIIIZZ.kv0(BJO.class);
        if (c28246B6s != null && (str3 = c28246B6s.LIZ) != null) {
            str6 = str3;
        }
        LIZ4.LJIJJ(str6, "event_page");
        if (this.LIZ.LIZJ.LIZ()) {
            str2 = "anchor_c_audience";
        } else if (this.LIZ.LIZJ.LIZLLL()) {
            str2 = "self_c_self";
        } else {
            str2 = "audience_c_audience";
        }
        LIZ4.LJIJJ(str2, "show_type");
        if (badgeStruct.greyedByClient != 0) {
            i = 0;
        } else {
            i = 1;
        }
        LIZ4.LJIJJ(Integer.valueOf(i), "is_grey");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ4.LJIILL())) {
            LIZ4.LJJIIJZLJL();
        } else {
            LIZ4.LJJIJ();
            LIZ4.LJJIIZI();
        }
    }

    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.String, O] */
    public final void LIZJ(BadgeStruct badge) {
        String LIZ;
        String secUid;
        String str;
        int LJIJ;
        o.LJIIIZ(badge, "badge");
        UserProfileEvent userProfileEvent = this.LJ;
        if (userProfileEvent != null && userProfileEvent.disableNavigateBadgeType == badge.badgeScene) {
            return;
        }
        int i = badge.badgeScene;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        String str3 = "";
        String str4 = "anchor";
        int i2 = 0;
        if (i != 4) {
            if (i != 11) {
                if (i != 8) {
                    if (i != 9) {
                        String str5 = badge.schemaUrl;
                        if (!C29306Beo.LJIJJLI(str5) || str5 == null) {
                            return;
                        }
                        C32364Cn2 c32364Cn2 = new C32364Cn2(LIZ(str5));
                        if (C29514BiA.LIZ(badge)) {
                            c32364Cn2.LIZJ("show_entrance", this.LJ.mShowEntrance);
                            if (!this.LIZ.LIZJ.LIZ()) {
                                str4 = "user";
                            }
                            c32364Cn2.LIZJ("user_type", str4);
                            c32364Cn2.LIZIZ(this.LIZIZ.getId(), "to_user_id");
                            PrivilegeLogExtra privilegeLogExtra = badge.logExtra;
                            if (privilegeLogExtra != null) {
                                c32364Cn2.LIZJ("privilege_id", privilegeLogExtra.privilege_id);
                                c32364Cn2.LIZJ("data_version_id", privilegeLogExtra.data_version);
                            }
                            if (LiveUserPreviewOptPackageSetting.INSTANCE.isEnable()) {
                                c32364Cn2.LIZJ("show_mask", CardStruct.IStatusCode.DEFAULT);
                            }
                        }
                        if (C29514BiA.LIZIZ(badge)) {
                            c32364Cn2.LIZIZ(this.LIZIZ.getId(), "to_user_id");
                            c32364Cn2.LIZJ("enter_from_merge", BJM.LJFF());
                            c32364Cn2.LIZJ("enter_method", BJM.LJIIIIZZ());
                            if (!this.LIZ.LJ) {
                                c32364Cn2.LIZJ("landscape_height", "100%");
                            }
                        }
                        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LIZ.LIZ, c32364Cn2.LIZLLL());
                    } else {
                        C29682Bks LIZJ = C29683Bkt.LIZJ(StateControlMediaLabelPageUrl.INSTANCE.getValue());
                        C29484Bhg c29484Bhg = this.LIZ;
                        if (c29484Bhg.LJ) {
                            LJIJ = 450;
                        } else {
                            LJIJ = (int) C15380j0.LJIJ(B9K.LIZJ(c29484Bhg.LIZ));
                        }
                        BY3 by3 = BY3.DP;
                        LIZJ.LJIIJ(LJIJ, by3);
                        LIZJ.LJIL((int) C15380j0.LJIJ(B9K.LIZJ(this.LIZ.LIZ)), by3);
                        C29682Bks.LJIJI(LIZJ, 8);
                        if (this.LIZ.LJ) {
                            LIZJ.LJIJJ("bottom");
                            LIZJ.LJIIIZ("bottom");
                        } else {
                            LIZJ.LJIIIZ("right");
                            LIZJ.LJIJJ("right");
                        }
                        IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
                        Context context = this.LIZ.LIZ;
                        String uri = LIZJ.LIZ().toString();
                        o.LJIIIIZZ(uri, "builder.build().toString()");
                        iHybridContainerService.Vs0(context, uri, C29524BiK.LJLIL);
                        BZI LIZ2 = C28787BRn.LIZ("scm_tag_click");
                        C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ2, "object_id", "live_mini_profile", "current_page");
                        LIZ2.LJIJJ(C64707PaR.LIZJ, "country_code");
                        LIZ2.LJJIIJZLJL();
                    }
                } else {
                    String str6 = badge.schemaUrl;
                    if (str6 == null) {
                        return;
                    }
                    C32364Cn2 c32364Cn22 = new C32364Cn2(LIZ(str6));
                    c32364Cn22.LIZJ("show_entrance", "personal_profile_badge");
                    if (this.LIZ.LJ) {
                        if (!LiveGiftGuideUserLevelSparkSetting.INSTANCE.getValue()) {
                            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LIZ.LIZ, c32364Cn22.LIZLLL());
                        } else {
                            String LIZLLL = c32364Cn22.LIZLLL();
                            if (LIZLLL != null) {
                                ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).Vs0(this.LIZ.LIZ, LIZLLL, new AqS171S0100000_5(this, 910));
                            }
                        }
                    } else {
                        C73943T0h LIZ3 = C73943T0h.LIZ();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("user_level_badge_");
                        LIZ4.append(c32364Cn22.LIZLLL());
                        LIZ3.LIZIZ(new B3N(X1D.LIZIZ(LIZ4)));
                    }
                    BZI LIZ5 = C28787BRn.LIZ("livesdk_click_user_level");
                    LIZ5.LJIIZILJ();
                    LIZ5.LJIJJ(Long.valueOf(this.LIZLLL.getId()), "user_id");
                    if (!this.LIZ.LIZJ.LIZ()) {
                        str4 = "user";
                    }
                    LIZ5.LJIJJ(str4, "user_type");
                    CombineBadgeStruct combineBadgeStruct = badge.combineBadgeStruct;
                    if (combineBadgeStruct != null && (str = combineBadgeStruct.str) != null) {
                        i2 = C1E4.LJJIFFI(PatternProtector.compile("[^0-9]").matcher(str).replaceAll(""));
                    }
                    UFE.LIZIZ(i2, LIZ5, "user_level");
                }
            } else {
                String str7 = badge.schemaUrl;
                if (str7 == null) {
                    return;
                }
                String LIZ6 = LIZ(str7);
                C29484Bhg c29484Bhg2 = this.LIZ;
                if (c29484Bhg2.LJ) {
                    String str8 = (String) c29484Bhg2.LJIIIIZZ.kv0(C29519BiF.class);
                    if (str8 != null) {
                        SparkContext.Companion.getClass();
                        InterfaceC40159FpT LIZ7 = C39359FcZ.LIZ(str8);
                        if (LIZ7 != null) {
                            LIZ7.close();
                        }
                    }
                    ((C32537Cpp) this.LIZ.LJIIIIZZ.gv0(C29519BiF.class)).LIZ = ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).Vs0(this.LIZ.LIZ, LIZ6, new AqS171S0100000_5(this, 911)).containerId;
                } else {
                    C73943T0h.LIZ().LIZIZ(new B3N(i0.LJFF("live_pro_badge_", LIZ6)));
                }
                this.LIZ.LIZLLL.dismiss();
                BZI LIZ8 = C28787BRn.LIZ("livesdk_live_pro_badge_click");
                LIZ8.LJIJJ(Long.valueOf(this.LIZJ.getOwnerUserId()), "anchor_id");
                LIZ8.LJIJJ(Long.valueOf(this.LIZJ.getId()), "room_id");
                LIZ8.LJIJJ(Integer.valueOf(this.LIZ.LIZJ.LIZ() ? 1 : 0), "is_anchor");
                LIZ8.LJJIIJZLJL();
            }
        } else if (!this.LIZ.LIZJ.LJ()) {
            C29484Bhg c29484Bhg3 = this.LIZ;
            if (!c29484Bhg3.LIZJ.LIZ.coHostEnable) {
                if (C29232Bdc.LJIIIIZZ(c29484Bhg3.LJIIIIZZ)) {
                    ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).wr0(this.LIZ.LJIIIIZZ, "self_anchor_personal_profile");
                    BZI LIZ9 = C28787BRn.LIZ("livesdk_subscribe_icon_click");
                    LIZ9.LJIILLIIL(this.LIZ.LJIIIIZZ);
                    C06490Nh.LIZLLL(LIZ9, "self_anchor_personal_profile", "show_entrance", "anchor", "user_type");
                } else {
                    String str9 = badge.schemaUrl;
                    if (str9 == null) {
                        return;
                    }
                    C32364Cn2 c32364Cn23 = new C32364Cn2(LIZ(str9));
                    if (!s.LJJJLZIJ(str9, "sec_anchor_id", false)) {
                        User owner = this.LIZJ.getOwner();
                        if (owner != null && (secUid = owner.getSecUid()) != null) {
                            str3 = secUid;
                        }
                        c32364Cn23.LIZJ("sec_anchor_id", str3);
                    }
                    if (!s.LJJJLZIJ(str9, "sec_another_user_id", false)) {
                        c32364Cn23.LIZJ("sec_another_user_id", this.LIZIZ.getSecUid());
                    }
                    c32364Cn23.LIZJ("enter_from_merge", BJM.LJFF());
                    c32364Cn23.LIZJ("enter_method", BJM.LJIIIIZZ());
                    if (!s.LJJJLZIJ(str9, "show_entrance", false)) {
                        c32364Cn23.LIZJ("show_entrance", "personal_profile_badge");
                    }
                    if (this.LIZ.LJ) {
                        if (FollowGuidVoidSetting.INSTANCE.getValue() > 0) {
                            IHybridContainerService iHybridContainerService2 = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
                            Context context2 = this.LIZ.LIZ;
                            String LIZLLL2 = c32364Cn23.LIZLLL();
                            o.LJIIIIZZ(LIZLLL2, "builder.build()");
                            iHybridContainerService2.Vs0(context2, LIZLLL2, new AqS171S0100000_5(this, 909));
                        } else {
                            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LIZ.LIZ, c32364Cn23.LIZLLL());
                        }
                    } else {
                        C73943T0h LIZ10 = C73943T0h.LIZ();
                        StringBuilder LIZ11 = X1D.LIZ();
                        LIZ11.append("subscribe_badge_");
                        LIZ11.append(c32364Cn23.LIZLLL());
                        LIZ10.LIZIZ(new B3N(X1D.LIZIZ(LIZ11)));
                        Long l = (Long) this.LIZ.LJIIIIZZ.kv0(AudienceShowOrientationBeginTime.class);
                        if (l != null) {
                            IDefinitionService iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class);
                            Room room = this.LIZJ;
                            if (room != null && (LIZ = C17280m4.LIZ(room)) != null) {
                                str2 = LIZ;
                            }
                            iDefinitionService.Hu(1, l.longValue(), str2, 0, "click_sub");
                        }
                    }
                }
                this.LIZ.LIZLLL.dismiss();
            } else {
                return;
            }
        } else {
            return;
        }
        if (C29514BiA.LIZ(badge)) {
            C29514BiA.LIZLLL("livesdk_top_active_user_rank_badge_click", "personal_card", this.LIZIZ.getId(), this.LIZ.LJIIIIZZ);
        }
        if (C29514BiA.LIZIZ(badge)) {
            C29514BiA.LJ(this.LIZIZ.getId(), "personal_profile", C29306Beo.LJIIJ(this.LIZ.LJIIIIZZ));
        }
    }

    public C29518BiE(C29484Bhg config, User user) {
        o.LJIIIZ(config, "config");
        this.LIZ = config;
        this.LIZIZ = user;
        this.LIZJ = config.LJFF;
        C29456BhE c29456BhE = config.LIZJ;
        this.LIZLLL = c29456BhE.LIZIZ;
        this.LJ = c29456BhE.LIZ;
    }
}
