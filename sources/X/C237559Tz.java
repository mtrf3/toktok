package X;

import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.9Tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237559Tz extends C9U4 {
    public int LIZJ;

    public C237559Tz() {
        super(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (r9.equals("from_uid_id") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        if (r9.equals("is_ad") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fa, code lost:
    
        r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) LJ().get(com.ss.android.ugc.aweme.feed.model.Aweme.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:
    
        if (r0.isAd() != true) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010e, code lost:
    
        if (r3 == 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0110, code lost:
    
        return "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x020e, code lost:
    
        return com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0114, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b3, code lost:
    
        if (r9.equals("user_id") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bc, code lost:
    
        if (r9.equals("from_user_id") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f8, code lost:
    
        if (r9.equals("is_ads") != false) goto L60;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
    @Override // X.C9U4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C237559Tz.LIZLLL(java.lang.String):java.lang.Object");
    }

    public final void LJIIJ(int i) {
        LIZIZ("action_type", Integer.valueOf(i));
        LJII("ttelite_interaction_with_switch_to_PA_sheet", new String[0]);
    }

    public final void LJIILLIIL(String str) {
        LJI("ttelite_ba_contact_ba_editprofile_address_click", new OSZ<>("is_success", str), new OSZ<>("enter_from", "profile"));
    }

    public final void LJIIZILJ(int i) {
        LIZIZ("result", Integer.valueOf(i));
        LJI("ttelite_ba_lead_ba_video_click_getleads", new OSZ<>("author_id", LIZLLL("from_uid_id")));
    }

    public final void LJIJJ(String str) {
        LJI("ttelite_ba_contact_ba_editprofile_phone_number_click", new OSZ<>("enter_from", "Profile"), new OSZ<>("is_success", str));
    }

    public final void LJIL(int i) {
        LJI("ttelite_ba_video_product_publish_addlink_click", new OSZ<>("link_status", Integer.valueOf(i)));
    }

    public final void LJJ(String str) {
        switch (str.hashCode()) {
            case 3237038:
                if (!str.equals("info")) {
                    return;
                }
                LJI("ttelite_ba_profile_bizinfo_actionbutton_click", new OSZ<>("enter_from", "profile"));
                return;
            case 1224335515:
                if (!str.equals("website")) {
                    return;
                }
                LJI("ttelite_ba_profile_bizinfo_websitelink_click", new OSZ<>("enter_from", "profile"));
                return;
            case 1575275090:
                if (!str.equals("leads_from")) {
                    return;
                }
                LJI("ttelite_ba_profile_bizinfo_leadsform_click", new OSZ<>("enter_from", "profile"));
                return;
            case 1671764162:
                if (!str.equals("display")) {
                    return;
                }
                LJI("ttelite_ba_profile_bizinfo_display_click", new OSZ<>("enter_from", "profile"));
                return;
            default:
                return;
        }
    }

    public final void LJJI(String str) {
        switch (str.hashCode()) {
            case 3237038:
                if (!str.equals("info")) {
                    return;
                }
                LJI("ttelite_ba_profile_bizinfo_actionbutton_show", new OSZ<>("enter_from", "profile"));
                return;
            case 1224335515:
                if (!str.equals("website")) {
                    return;
                }
                LJI("ttelite_ba_profile_bizinfo_websitelink_show", new OSZ<>("enter_from", "profile"));
                return;
            case 1575275090:
                if (!str.equals("leads_from")) {
                    return;
                }
                LJI("ttelite_ba_profile_bizinfo_leadsform_show", new OSZ<>("enter_from", "profile"));
                return;
            case 1671764162:
                if (!str.equals("display")) {
                    return;
                }
                LJI("ttelite_ba_profile_bizinfo_display_show", new OSZ<>("enter_from", "profile"));
                return;
            default:
                return;
        }
    }

    public final void LJIIL(Aweme aweme, User user) {
        LJIIIZ(user, aweme);
        LJII("ttelite_ba_contact_click_address", "to_user_id", "from_user_id", "is_ads", "item_id");
    }

    public final void LJIJJLI(int i, String str) {
        LJI("ttelite_ba_contact_tt_click_contact_option", new OSZ<>("result", Integer.valueOf(i)), new OSZ<>("to_user_id", str), new OSZ<>("from_user_id", LIZLLL("from_user_id")));
    }

    public final void LJJIII(User user, String str) {
        LJIIIZ(user);
        LIZJ("enter_from", str);
        LJII("ttelite_BA_download_link_show", "from_user_id", "to_user_id", "link_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r6.equals("chat") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r6.equals("live") != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r6.equals("homepage_hot") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (r6.equals("homepage_follow") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r4, com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6) {
        /*
            r3 = this;
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 0
            r1[r0] = r5
            r3.LJIIIZ(r1)
            java.lang.String r1 = "is_success"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.LIZIZ(r1, r0)
            java.lang.String r0 = "to_user_id"
            r3.LIZJ(r0, r4)
            if (r6 == 0) goto L20
            int r0 = r6.hashCode()
            switch(r0) {
                case -1271119582: goto L35;
                case 3052376: goto L3e;
                case 3322092: goto L47;
                case 1691937916: goto L50;
                default: goto L20;
            }
        L20:
            java.lang.String r6 = "others"
        L22:
            java.lang.String r0 = "enter_from"
            r3.LIZJ(r0, r6)
            java.lang.String r1 = "from_user_id"
            java.lang.String r0 = "item_id"
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}
            java.lang.String r0 = "ttelite_BA_profile_show"
            r3.LJII(r0, r1)
            return
        L35:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L22
            goto L20
        L3e:
            java.lang.String r0 = "chat"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L22
            goto L20
        L47:
            java.lang.String r0 = "live"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L20
            goto L22
        L50:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L22
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C237559Tz.LJIIJJI(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    public final void LJIILJJIL(User user, Aweme aweme, CouponInfo couponInfo) {
        long j;
        this.LIZJ = 0;
        LJIIIZ(user, aweme);
        String couponCode = couponInfo.getCouponCode();
        if (couponCode == null) {
            couponCode = "";
        }
        LIZJ("code", couponCode);
        Long couponId = couponInfo.getCouponId();
        if (couponId != null) {
            j = couponId.longValue();
        } else {
            j = 0;
        }
        LIZIZ("coupon_id", Long.valueOf(j));
        LJII("ttelite_user_click_coupon", "enter_from", "is_ads", "to_user_id", "from_user_id", "item_id");
    }

    public final void LJIJ(User user, Aweme aweme, int i) {
        this.LIZJ = i;
        LJIIIZ(user, aweme);
        LJII("ttelite_ba_lead_tt_click_cta", "enter_from", "from_uid_id", "to_user_id", "is_ad", "item_id");
    }

    public final void LJJIIJ(User user, Aweme aweme, int i) {
        this.LIZJ = i;
        LJIIIZ(user, aweme);
        LJII("ttelite_ba_lead_tt_show_cta", "enter_from", "from_uid_id", "to_user_id", "is_ad");
    }

    public final void LJIILIIL(User user, Aweme aweme, String str, String str2) {
        LJIIIZ(user, aweme);
        LIZJ("url", str);
        LIZJ("enter_from", str2);
        LJII("ttelite_BA_profile_website_link_clicked", "to_user_id", "user_id", "item_id");
    }

    public final void LJIJI(Aweme aweme, String str, boolean z, String str2) {
        int i = 1;
        LJIIIZ(aweme);
        OSZ<String, ? extends Object>[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ<>("enter_from", str2);
        oszArr[1] = new OSZ<>("to_user_id", str);
        oszArr[2] = new OSZ<>("from_user_id", LIZLLL("from_user_id"));
        oszArr[3] = new OSZ<>("is_ads", LIZLLL("is_ads"));
        oszArr[4] = new OSZ<>("item_id", LIZLLL("item_id"));
        if (z) {
            i = 2;
        }
        oszArr[5] = new OSZ<>("version", Integer.valueOf(i));
        LJI("ttelite_ba_contact_tt_click_call", oszArr);
    }

    public final void LJJIFFI(User user, Aweme aweme, int i, int i2) {
        this.LIZJ = i;
        LJIIIZ(user, aweme);
        LIZIZ("result", Integer.valueOf(i2));
        LJII("ttelite_ba_lead_tt_enter_instantform", "enter_from", "is_ad");
    }

    public final void LJJII(Aweme aweme, Object obj, String str, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        LJIIIZ(aweme);
        LIZJ("enter_method", enterFrom);
        LIZ(LIZLLL("item_id"), "ba_item_id");
        LIZ(LIZLLL("author_id"), "author_id");
        LIZ(LIZLLL("from_user_id"), "from_user_id");
        int hashCode = str.hashCode();
        if (hashCode != -954756863) {
            if (hashCode != 738647295) {
                if (hashCode == 826937729 && str.equals("ttelite_ba_video_product_anchor_action_sheet_click")) {
                    if (obj == null) {
                        obj = 0;
                    }
                    LIZ(obj, "action_type");
                }
            } else if (str.equals("ttelite_ba_product_link_anchor_click")) {
                LIZJ("is_organic", "1");
            }
        } else if (str.equals("ttelite_ba_video_product_anchor_9_stay")) {
            if (obj == null) {
                obj = 0;
            }
            LIZ(obj, "duration");
        }
        LJII(str, "ba_cta", "ba_url", "ba_pixel_id", "multi_anchor", "anchor_type");
    }

    public final void LJIILL(User user, Aweme aweme, String str, String str2, String str3) {
        LJIIIZ(user, aweme);
        LIZJ("enter_from", str);
        LIZJ("is_success", str2);
        LIZJ("download_url", str3);
        LJII("ttelite_BA_download_link_clicked", "from_user_id", "to_user_id", "link_type", "item_id");
    }
}
