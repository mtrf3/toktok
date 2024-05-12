package X;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.BizAddress;
import com.ss.android.ugc.aweme.commerce.BizContactInfo;
import com.ss.android.ugc.aweme.commerce.RBAUserInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginalMusician;
import com.ss.android.ugc.aweme.profile.model.AccountLabelInfo;
import com.ss.android.ugc.aweme.profile.model.AccountLabelType;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.BATab;
import com.ss.android.ugc.aweme.profile.model.CreatorFundBannerSetting;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.PaidContentBannerCampaign;
import com.ss.android.ugc.aweme.profile.model.PaidContentBannerSetting;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.RepostTab;
import com.ss.android.ugc.aweme.profile.model.ShopTab;
import com.ss.android.ugc.aweme.profile.model.StickerTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserNowPackStruct;
import com.ss.android.ugc.profile.platform.base.data.Avatar;
import com.ss.android.ugc.profile.platform.base.data.Legacy;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.data.UserStaticsInfo;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data.SupportingData;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioAddressData;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioContactData;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioDownloadData;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioEmailData;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.AddFriendsData;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialConnect;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialEntranceData;
import com.ss.android.ugc.profile.platform.business.popup.CreatorFundAccountNoticeData;
import com.ss.android.ugc.profile.platform.business.popup.PaidContentBannerData;
import com.ss.android.ugc.profile.platform.business.popup.PaidContentBannerInfo;
import com.ss.android.ugc.profile.platform.business.popup.PaidContentBannerSingleCampaign;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9iz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244699iz {
    public static m LIZ;
    public static m LIZIZ;
    public static final C9LA LIZJ = C9LA.LJLIL;
    public static final C243859hd LIZLLL = C243859hd.LJLIL;
    public static final C9K3 LJ = C9K3.LJLIL;

    public static void LJIIJJI(m mVar) {
        AddFriendsData addFriendsData;
        int i;
        Integer mafRedCount;
        LIZ = mVar;
        if (mVar == null) {
            addFriendsData = null;
        } else {
            addFriendsData = (AddFriendsData) C237429Tm.LIZ(mVar.toString(), AddFriendsData.class);
        }
        User curUser = AccountService.LJIJ().LJFF().getCurUser();
        if (addFriendsData != null && (mafRedCount = addFriendsData.getMafRedCount()) != null) {
            i = mafRedCount.intValue();
        } else {
            i = 2;
        }
        curUser.mafRedCount = i;
    }

    public static User LJJIIJ(ProfileUser profileUser) {
        List<? extends ProfileComponents> list;
        long currentTimeMillis = System.currentTimeMillis();
        if (profileUser == null) {
            return ((RBX) HG3.LJIILL()).getCurUser();
        }
        ProfileCommonInfo profileCommonInfo = profileUser.common;
        if (profileCommonInfo == null) {
            return ((RBX) HG3.LJIILL()).getCurUser();
        }
        User curUser = AccountService.LJIJ().LJFF().getCurUser();
        LJIJJLI(profileCommonInfo, curUser);
        LJJIFFI(profileUser.navBarComponents, curUser, true);
        LJIL(profileUser.headerComponents, curUser, true);
        LJJIII(curUser, profileUser, true);
        ProfileComponents profileComponents = profileUser.popUpComponents;
        if (profileComponents != null && (list = profileComponents.components) != null) {
            for (ProfileComponents profileComponents2 : list) {
                String str = profileComponents2.componentId;
                if (o.LJ(str, "pop_up_creator_fund_account_notice")) {
                    m mVar = profileComponents2.bizData;
                    LIZ = mVar;
                    CreatorFundBannerSetting creatorFundBannerSetting = ((CreatorFundAccountNoticeData) C237429Tm.LIZ(String.valueOf(mVar), CreatorFundAccountNoticeData.class)).getCreatorFundBannerSetting();
                    if (creatorFundBannerSetting != null) {
                        curUser.setBannerSetting(creatorFundBannerSetting);
                    }
                } else if (o.LJ(str, "pop_up_paid_content_banner")) {
                    m mVar2 = profileComponents2.bizData;
                    LIZ = mVar2;
                    PaidContentBannerInfo paidContentBannerInfo = ((PaidContentBannerData) C237429Tm.LIZ(String.valueOf(mVar2), PaidContentBannerData.class)).getPaidContentBannerInfo();
                    if (paidContentBannerInfo != null) {
                        ArrayList arrayList = new ArrayList();
                        List<PaidContentBannerSingleCampaign> campaignList = paidContentBannerInfo.getCampaignList();
                        if (campaignList != null) {
                            for (PaidContentBannerSingleCampaign paidContentBannerSingleCampaign : campaignList) {
                                arrayList.add(new PaidContentBannerCampaign(paidContentBannerSingleCampaign.getCampaignId(), paidContentBannerSingleCampaign.getMessageText(), paidContentBannerSingleCampaign.getCtaText(), paidContentBannerSingleCampaign.getSchema(), paidContentBannerSingleCampaign.getDuration()));
                            }
                        }
                        curUser.setPaidContentBannerSetting(new PaidContentBannerSetting(arrayList));
                    }
                }
            }
        }
        LJJI(profileUser.legacy, curUser);
        C237259Sv.LIZJ(System.currentTimeMillis() - currentTimeMillis, "convert_data_new_2_old");
        return curUser;
    }

    public static boolean LIZIZ(Field field, Field field2) {
        if (o.LJ(field.getType(), Integer.class) && o.LJ(C16880lQ.LJLLJ(field2.getType()), "int")) {
            return true;
        }
        if ((o.LJ(field.getType(), Character.class) && o.LJ(C16880lQ.LJLLJ(field2.getType()), "char")) || o.LJ(field2.getType(), field.getType()) || ujb.o.LJJJJIZL(C16880lQ.LJLLJ(field2.getType()), C16880lQ.LJLLJ(field.getType()), true)) {
            return true;
        }
        return false;
    }

    public static void LIZJ(m mVar, User user) {
        LIZ = mVar;
        if (mVar != null) {
            if (user.getTabSetting() == null) {
                user.setTabSetting(new TabSetting());
            }
            if (user.getTabSetting().shopTab == null) {
                user.getTabSetting().shopTab = new ShopTab();
            }
            LIZ(mVar, "shop_schema", String.class, new AqS170S0100000_4(user, 1153));
            LIZ(mVar, "shop_schema_v2", String.class, new AqS170S0100000_4(user, 1154));
            LIZ(mVar, "show_red_dot", Boolean.TYPE, new AqS170S0100000_4(user, 1155));
        }
    }

    public static void LJIIIIZZ(m mVar, String str) {
        LIZIZ = mVar;
        if (str != null) {
            m mVar2 = new m();
            mVar2.LJJIIZ("text", str);
            LJIJJ(mVar, "describe", mVar2, false);
        }
    }

    public static void LJIIJ(User user, List list) {
        m mVar;
        BizAccountInfo bizAccountInfo;
        String str;
        m mVar2;
        m mVar3;
        m mVar4;
        m mVar5;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProfileComponents profileComponents = (ProfileComponents) it.next();
            String str2 = profileComponents.componentName;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1941259690:
                        if (!str2.equals("user_account_base_info")) {
                            break;
                        } else {
                            LJIIJ(user, profileComponents.components);
                            break;
                        }
                    case -1505731634:
                        if (!str2.equals("user_account_state_control_media")) {
                            break;
                        } else {
                            LJI(AccountLabelType.SCM.getValue(), user, profileComponents);
                            break;
                        }
                    case -694448925:
                        if (str2.equals("relation_info_following") && (mVar5 = profileComponents.bizData) != null) {
                            LIZIZ = mVar5;
                            GeneralPermission generalPermission = user.getGeneralPermission();
                            if (generalPermission != null) {
                                LJIJJ(mVar5, "follow_toast_type", Integer.valueOf(generalPermission.getFollowToastType()), true);
                            }
                            LJIJJ(mVar5, "following_count", Integer.valueOf(user.getFollowingCount()), true);
                            LJIJJ(mVar5, "formatted_number", C77123UOp.LJJIIJ(user.getFollowingCount()), true);
                            break;
                        }
                        break;
                    case -598667483:
                        if (str2.equals("relation_info_posts") && (mVar4 = profileComponents.bizData) != null) {
                            LJIJJ(mVar4, "formatted_number", C77123UOp.LJJIIJ(user.visibleVideosCount), true);
                            break;
                        }
                        break;
                    case -19437051:
                        if (str2.equals("relation_info_like") && (mVar3 = profileComponents.bizData) != null) {
                            LJIJJ(mVar3, "formatted_number", C77123UOp.LJJIIJ(user.getTotalFavorited()), true);
                            LJIJJ(mVar3, "like_count", Long.valueOf(user.getTotalFavorited()), true);
                            break;
                        }
                        break;
                    case 26984349:
                        if (!str2.equals("user_relation_info")) {
                            break;
                        } else {
                            LJIIJ(user, profileComponents.components);
                            break;
                        }
                    case 214824825:
                        if (str2.equals("user_account_user_name") && (mVar2 = profileComponents.bizData) != null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append('@');
                            LIZ2.append(user.getUniqueId());
                            LJIIIIZZ(mVar2, X1D.LIZIZ(LIZ2));
                            break;
                        }
                        break;
                    case 339204258:
                        if (!str2.equals("user_info")) {
                            break;
                        } else {
                            LJIIJ(user, profileComponents.components);
                            break;
                        }
                    case 1111303396:
                        if (!str2.equals("user_account_ags_warning")) {
                            break;
                        } else {
                            LJI(AccountLabelType.AGS_WARNING.getValue(), user, profileComponents);
                            break;
                        }
                    case 1122989245:
                        if (!str2.equals("user_account_rba_identifier")) {
                            break;
                        } else {
                            m mVar6 = profileComponents.bizData;
                            LIZIZ = mVar6;
                            if (mVar6 != null && (bizAccountInfo = user.getBizAccountInfo()) != null) {
                                if (C9N6.LIZ()) {
                                    RBAUserInfo registeredBusiness = bizAccountInfo.getRegisteredBusiness();
                                    if (registeredBusiness != null) {
                                        str = registeredBusiness.getCompanyName();
                                    } else {
                                        str = null;
                                    }
                                } else if (bizAccountInfo.enableShowCategory()) {
                                    str = user.getCategory();
                                } else {
                                    str = "";
                                }
                                LJIIIIZZ(mVar6, str);
                                break;
                            }
                        }
                        break;
                    case 1640166284:
                        if (str2.equals("relation_info_follower") && (mVar = profileComponents.bizData) != null) {
                            LIZIZ = mVar;
                            GeneralPermission generalPermission2 = user.getGeneralPermission();
                            if (generalPermission2 != null) {
                                LJIJJ(mVar, "follow_toast_type", Integer.valueOf(generalPermission2.getFollowToastType()), true);
                            }
                            LJIJJ(mVar, "follower_count", Integer.valueOf(user.getFollowerCount()), true);
                            LJIJJ(mVar, "friend_count", Integer.valueOf(user.getFriendCount()), true);
                            LJIJJ(mVar, "new_follower_count", Integer.valueOf(user.getNewFollowerCount()), true);
                            LJIJJ(mVar, "formatted_number", C77123UOp.LJJIIJ(user.getFollowerCount()), true);
                            break;
                        }
                        break;
                }
            }
        }
    }

    public static void LJIIL(m mVar, User user) {
        SupportingData supportingData;
        LIZ = mVar;
        ProfileNgoStruct profileNgoStruct = null;
        if (mVar != null && (supportingData = (SupportingData) C237429Tm.LIZ(mVar.toString(), SupportingData.class)) != null) {
            profileNgoStruct = supportingData.getSupportedNonprofit();
        }
        user.setProfileNgoStruct(profileNgoStruct);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(com.google.gson.m r4, com.ss.android.ugc.aweme.profile.model.User r5) {
        /*
            X.C244699iz.LIZ = r4
            r3 = 0
            if (r4 != 0) goto L46
            r0 = r3
        L6:
            r1 = r3
        L7:
            r5.setUserNowPackStruct(r1)
            if (r0 == 0) goto L43
            java.lang.Long r1 = r0.getRoomId()
            if (r1 == 0) goto L43
            long r1 = r1.longValue()
        L16:
            r5.roomId = r1
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r0.getShareInfo()
        L1e:
            r5.setShareInfo(r1)
            if (r0 == 0) goto L3a
            java.lang.Integer r1 = r0.getStoryStatus()
            if (r1 == 0) goto L3a
            int r1 = r1.intValue()
        L2d:
            r5.setStoryStatus(r1)
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r3 = r0.getProfileBadgeStruct()
        L36:
            r5.setProfileBadgeStruct(r3)
            return
        L3a:
            X.9j0 r1 = X.EnumC244709j0.NULL
            int r1 = r1.getStatus()
            goto L2d
        L41:
            r1 = r3
            goto L1e
        L43:
            r1 = 0
            goto L16
        L46:
            java.lang.String r1 = r4.toString()
            java.lang.Class<com.ss.android.ugc.profile.platform.business.header.business.avatar.business.data.AvatarNormalData> r0 = com.ss.android.ugc.profile.platform.business.header.business.avatar.business.data.AvatarNormalData.class
            java.lang.Object r0 = X.C237429Tm.LIZ(r1, r0)
            com.ss.android.ugc.profile.platform.business.header.business.avatar.business.data.AvatarNormalData r0 = (com.ss.android.ugc.profile.platform.business.header.business.avatar.business.data.AvatarNormalData) r0
            if (r0 == 0) goto L6
            com.ss.android.ugc.aweme.profile.model.UserNowPackStruct r1 = r0.getUserNowPackStruct()
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244699iz.LJIILIIL(com.google.gson.m, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public static void LJIILJJIL(m mVar, User user) {
        BioAddressData bioAddressData;
        BizContactInfo bizContactInfo;
        BizAddress bizAddress;
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (mVar == null) {
            bioAddressData = null;
        } else {
            bioAddressData = (BioAddressData) C237429Tm.LIZ(mVar.toString(), BioAddressData.class);
        }
        BizAccountInfo bizAccountInfo = user.getBizAccountInfo();
        if (bizAccountInfo != null && (bizContactInfo = bizAccountInfo.getBizContactInfo()) != null && (bizAddress = bizContactInfo.getBizAddress()) != null) {
            if (bioAddressData != null) {
                str = bioAddressData.getLatitude();
            } else {
                str = null;
            }
            bizAddress.setLatitude(str);
            if (bioAddressData != null) {
                str2 = bioAddressData.getLongitude();
            } else {
                str2 = null;
            }
            bizAddress.setLongitude(str2);
            if (bioAddressData != null) {
                str3 = bioAddressData.getFormattedAddressText();
            } else {
                str3 = null;
            }
            bizAddress.setFormattedAddressText(str3);
            if (bioAddressData != null) {
                str4 = bioAddressData.getSimplifiedAddressText();
            }
            bizAddress.setSimplifiedAddressText(str4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 != null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(com.google.gson.m r2, com.ss.android.ugc.aweme.profile.model.User r3) {
        /*
            if (r2 != 0) goto L8
            r1 = 1
            r0 = 0
            if (r1 != 0) goto L15
            if (r2 == 0) goto L15
        L8:
        L9:
            java.lang.String r1 = r2.toString()
            java.lang.Class<com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioCouponData> r0 = com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioCouponData.class
            java.lang.Object r0 = X.C237429Tm.LIZ(r1, r0)
            com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioCouponData r0 = (com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioCouponData) r0
        L15:
            com.ss.android.ugc.aweme.commerce.BizAccountInfo r3 = r3.getBizAccountInfo()
            if (r3 != 0) goto L1c
        L1b:
            return
        L1c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r0 == 0) goto L3b
            java.util.List r0 = r0.getCouponList()
            if (r0 == 0) goto L3b
            java.util.Iterator r1 = r0.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L2d
        L3b:
            r3.setCouponInfo(r2)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244699iz.LJIILL(com.google.gson.m, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public static void LJIILLIIL(m mVar, User user) {
        BioDownloadData bioDownloadData;
        String str = null;
        if (mVar == null) {
            bioDownloadData = null;
        } else {
            bioDownloadData = (BioDownloadData) C237429Tm.LIZ(mVar.toString(), BioDownloadData.class);
        }
        BizAccountInfo bizAccountInfo = user.getBizAccountInfo();
        if (bizAccountInfo == null) {
            return;
        }
        if (bioDownloadData != null) {
            str = bioDownloadData.getAndroidDownloadAppLink();
        }
        bizAccountInfo.setAndroidDownloadAppLink(str);
    }

    public static void LJIIZILJ(m mVar, User user) {
        BioContactData bioContactData;
        BizContactInfo bizContactInfo;
        Boolean bool;
        Boolean bool2;
        BizContactInfo bizContactInfo2;
        String str;
        BizContactInfo bizContactInfo3;
        String str2;
        String str3 = null;
        if (mVar == null) {
            bioContactData = null;
        } else {
            bioContactData = (BioContactData) C237429Tm.LIZ(mVar.toString(), BioContactData.class);
        }
        BizAccountInfo bizAccountInfo = user.getBizAccountInfo();
        if (bizAccountInfo != null && (bizContactInfo3 = bizAccountInfo.getBizContactInfo()) != null) {
            if (bioContactData != null) {
                str2 = bioContactData.getBizPhone();
            } else {
                str2 = null;
            }
            bizContactInfo3.setBizPhone(str2);
        }
        BizAccountInfo bizAccountInfo2 = user.getBizAccountInfo();
        if (bizAccountInfo2 != null && (bizContactInfo2 = bizAccountInfo2.getBizContactInfo()) != null) {
            if (bioContactData != null) {
                str = bioContactData.getBizPhone();
            } else {
                str = null;
            }
            bizContactInfo2.setBizPhone(str);
        }
        BizAccountInfo bizAccountInfo3 = user.getBizAccountInfo();
        if (bizAccountInfo3 != null && (bizContactInfo = bizAccountInfo3.getBizContactInfo()) != null) {
            if (bioContactData != null) {
                bool = bioContactData.getBizPhoneEnableCall();
            } else {
                bool = null;
            }
            bizContactInfo.setCall(bool);
            if (bioContactData != null) {
                bool2 = bioContactData.getBizPhoneEnableText();
            } else {
                bool2 = null;
            }
            bizContactInfo.setText(bool2);
            if (bioContactData != null) {
                str3 = bioContactData.getType();
            }
            bizContactInfo.setType(str3);
        }
    }

    public static void LJIJ(m mVar, User user) {
        BioEmailData bioEmailData;
        String str = null;
        if (mVar != null && (bioEmailData = (BioEmailData) C237429Tm.LIZ(mVar.toString(), BioEmailData.class)) != null) {
            str = bioEmailData.getBioEmail();
        }
        user.setBioEmail(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(com.google.gson.m r3, com.ss.android.ugc.aweme.profile.model.User r4) {
        /*
            r2 = 0
            if (r3 != 0) goto L28
            r0 = r2
        L4:
            r1 = r2
        L5:
            r4.setBioUrl(r1)
            if (r0 == 0) goto Le
            java.lang.String r2 = r0.getBioSecureUrl()
        Le:
            r4.setBioSecureUrl(r2)
            com.ss.android.ugc.aweme.profile.model.ProfileUserExperiments r1 = r4.profileUserExperiments
            if (r1 != 0) goto L16
        L15:
            return
        L16:
            if (r0 == 0) goto L26
            java.lang.Integer r0 = r0.getBlockLinkJump()
            if (r0 == 0) goto L26
            int r0 = r0.intValue()
        L22:
            r1.setCanShowEntrance(r0)
            goto L15
        L26:
            r0 = 0
            goto L22
        L28:
            java.lang.String r1 = r3.toString()
            java.lang.Class<com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioLinkData> r0 = com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioLinkData.class
            java.lang.Object r0 = X.C237429Tm.LIZ(r1, r0)
            com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioLinkData r0 = (com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioLinkData) r0
            if (r0 == 0) goto L4
            java.lang.String r1 = r0.getBioUrl()
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244699iz.LJIJI(com.google.gson.m, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public static void LJIJJLI(ProfileCommonInfo profileCommonInfo, User user) {
        Boolean isGeoBlocked;
        Boolean isBlocking;
        Boolean isBlocked;
        Integer followerStatus;
        Integer followStatus;
        Integer visibleVideosCount;
        Avatar avatar;
        AvatarMetaInfo avatarMetaInfo;
        Integer awemeCount;
        Long registerTime;
        Boolean isSecret;
        List<String> boldFields;
        Avatar avatar2;
        String naviId;
        Avatar avatar3;
        UrlModel avatarVideoUri;
        Avatar avatar4;
        UrlModel avatarMedium;
        Avatar avatar5;
        UrlModel avatarThumb;
        Avatar avatar6;
        UrlModel avatarLarger;
        Integer banStatus;
        Integer accountType;
        String username;
        String nickname;
        String secUid;
        String uid;
        if (profileCommonInfo != null) {
            UserProfileInfo userProfileInfo = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo != null && (uid = userProfileInfo.getUid()) != null) {
                user.setUid(uid);
            }
            UserProfileInfo userProfileInfo2 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo2 != null && (secUid = userProfileInfo2.getSecUid()) != null) {
                user.setSecUid(secUid);
            }
            UserProfileInfo userProfileInfo3 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo3 != null && (nickname = userProfileInfo3.getNickname()) != null) {
                user.setNickname(nickname);
            }
            UserProfileInfo userProfileInfo4 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo4 != null && (username = userProfileInfo4.getUsername()) != null) {
                user.setUniqueId(username);
            }
        }
        user.setShortId(CardStruct.IStatusCode.DEFAULT);
        if (profileCommonInfo != null) {
            UserAccountInfo userAccountInfo = profileCommonInfo.getUserAccountInfo();
            if (userAccountInfo != null && (accountType = userAccountInfo.getAccountType()) != null) {
                user.setAccountType(accountType.intValue());
            }
            UserAccountInfo userAccountInfo2 = profileCommonInfo.getUserAccountInfo();
            if (userAccountInfo2 != null && (banStatus = userAccountInfo2.getBanStatus()) != null) {
                int intValue = banStatus.intValue();
                if (user.getGeneralPermission() == null) {
                    user.setGeneralPermission(new GeneralPermission());
                }
                user.getGeneralPermission().setFollowToastType(intValue);
            }
            UserProfileInfo userProfileInfo5 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo5 != null && (avatar6 = userProfileInfo5.getAvatar()) != null && (avatarLarger = avatar6.getAvatarLarger()) != null) {
                user.setAvatarLarger(avatarLarger);
            }
            UserProfileInfo userProfileInfo6 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo6 != null && (avatar5 = userProfileInfo6.getAvatar()) != null && (avatarThumb = avatar5.getAvatarThumb()) != null) {
                user.setAvatarThumb(avatarThumb);
            }
            UserProfileInfo userProfileInfo7 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo7 != null && (avatar4 = userProfileInfo7.getAvatar()) != null && (avatarMedium = avatar4.getAvatarMedium()) != null) {
                user.setAvatarMedium(avatarMedium);
            }
            UserProfileInfo userProfileInfo8 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo8 != null && (avatar3 = userProfileInfo8.getAvatar()) != null && (avatarVideoUri = avatar3.getAvatarVideoUri()) != null) {
                user.setAvatarVideoUri(avatarVideoUri);
            }
            UserProfileInfo userProfileInfo9 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo9 != null && (avatar2 = userProfileInfo9.getAvatar()) != null && (naviId = avatar2.getNaviId()) != null) {
                user.naviId = naviId;
            }
            UserProfileInfo userProfileInfo10 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo10 != null && (boldFields = userProfileInfo10.getBoldFields()) != null) {
                user.boldFields = boldFields;
            }
            UserAccountInfo userAccountInfo3 = profileCommonInfo.getUserAccountInfo();
            if (userAccountInfo3 != null && (isSecret = userAccountInfo3.isSecret()) != null) {
                boolean booleanValue = isSecret.booleanValue();
                user.setSecret(booleanValue);
                user.setPrivateAccount(booleanValue);
            }
            UserProfileInfo userProfileInfo11 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo11 != null && (registerTime = userProfileInfo11.getRegisterTime()) != null) {
                user.setRegisterTime(registerTime.longValue());
            }
            UserStaticsInfo userStaticsInfo = profileCommonInfo.getUserStaticsInfo();
            if (userStaticsInfo != null && (awemeCount = userStaticsInfo.getAwemeCount()) != null) {
                user.setAwemeCount(awemeCount.intValue());
            }
            UserProfileInfo userProfileInfo12 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo12 != null && (avatar = userProfileInfo12.getAvatar()) != null && (avatarMetaInfo = avatar.getAvatarMetaInfo()) != null) {
                user.setAvatarMeta(avatarMetaInfo);
            }
            UserStaticsInfo userStaticsInfo2 = profileCommonInfo.getUserStaticsInfo();
            if (userStaticsInfo2 != null && (visibleVideosCount = userStaticsInfo2.getVisibleVideosCount()) != null) {
                user.visibleVideosCount = visibleVideosCount.intValue();
            }
            UserRelationInfo userRelationInfo = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo != null && (followStatus = userRelationInfo.getFollowStatus()) != null) {
                user.setFollowStatus(followStatus.intValue());
            }
            UserRelationInfo userRelationInfo2 = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo2 != null && (followerStatus = userRelationInfo2.getFollowerStatus()) != null) {
                user.setFollowerStatus(followerStatus.intValue());
            }
            UserRelationInfo userRelationInfo3 = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo3 != null && (isBlocked = userRelationInfo3.isBlocked()) != null) {
                user.setBlocked(isBlocked.booleanValue());
            }
            UserRelationInfo userRelationInfo4 = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo4 != null && (isBlocking = userRelationInfo4.isBlocking()) != null) {
                user.isBlock = isBlocking.booleanValue();
            }
            UserRelationInfo userRelationInfo5 = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo5 != null && (isGeoBlocked = userRelationInfo5.isGeoBlocked()) != null) {
                user.setGeoBlocked(isGeoBlocked.booleanValue());
            }
        }
    }

    public static void LJJI(Legacy legacy, User user) {
        if (legacy == null) {
            return;
        }
        try {
            Field[] declaredFields = Legacy.class.getDeclaredFields();
            o.LJIIIIZZ(declaredFields, "legacy::class.java.declaredFields");
            for (Field field : declaredFields) {
                Field[] declaredFields2 = user.getClass().getDeclaredFields();
                o.LJIIIIZZ(declaredFields2, "user::class.java.declaredFields");
                for (Field field2 : declaredFields2) {
                    if (o.LJ(field.getName(), field2.getName()) && LIZIZ(field, field2)) {
                        field2.setAccessible(true);
                        field.setAccessible(true);
                        field2.set(user, field.get(legacy));
                    }
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("after adapter User: ");
            LIZ2.append(C237429Tm.LIZIZ(user));
            C221018lt.LIZ("ProfilePlatformView", X1D.LIZIZ(LIZ2));
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "updateLegacyInfo exception";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("profile_attributes", C237259Sv.LJIIIIZZ);
            c188727au.LJIIIZ("report_scene", "profile_legacy_to_user_error");
            c188727au.LJIIIZ("error_msg", message);
            FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
        }
    }

    public static void LJJII(m mVar, User user) {
        SocialEntranceData socialEntranceData;
        String str;
        String str2;
        String str3;
        String str4;
        SocialConnect socialConnect;
        String twitterName;
        SocialConnect socialConnect2;
        SocialConnect socialConnect3;
        SocialConnect socialConnect4;
        SocialConnect socialConnect5;
        LIZ = mVar;
        if (mVar == null) {
            socialEntranceData = null;
        } else {
            socialEntranceData = (SocialEntranceData) C237429Tm.LIZ(mVar.toString(), SocialEntranceData.class);
        }
        String str5 = "";
        if (socialEntranceData == null || (socialConnect5 = socialEntranceData.getSocialConnect()) == null || (str = socialConnect5.getInsId()) == null) {
            str = "";
        }
        user.setInsId(str);
        if (socialEntranceData == null || (socialConnect4 = socialEntranceData.getSocialConnect()) == null || (str2 = socialConnect4.getYoutubeChannelId()) == null) {
            str2 = "";
        }
        user.setYoutubeChannelId(str2);
        if (socialEntranceData == null || (socialConnect3 = socialEntranceData.getSocialConnect()) == null || (str3 = socialConnect3.getYoutubeChannelTitle()) == null) {
            str3 = "";
        }
        user.setYoutubeChannelTitle(str3);
        if (socialEntranceData == null || (socialConnect2 = socialEntranceData.getSocialConnect()) == null || (str4 = socialConnect2.getTwitterId()) == null) {
            str4 = "";
        }
        user.setTwitterId(str4);
        if (socialEntranceData != null && (socialConnect = socialEntranceData.getSocialConnect()) != null && (twitterName = socialConnect.getTwitterName()) != null) {
            str5 = twitterName;
        }
        user.setTwitterName(str5);
    }

    public static void LJ(String str, ProfileComponents profileComponents, String str2) {
        if (C78685UuP.LJJJZ(str) && str != null) {
            m mVar = profileComponents.bizData;
            if (mVar != null) {
                mVar.LJJJ(str2);
            }
            m mVar2 = profileComponents.bizData;
            if (mVar2 != null) {
                mVar2.LJJIIZ(str2, str);
            }
        }
    }

    public static void LJFF(String str, String str2, m mVar) {
        if (C78685UuP.LJJJZ(str) && str != null) {
            mVar.LJJJ(str2);
            mVar.LJJIIZ(str2, str);
        }
    }

    public static void LJI(int i, User user, ProfileComponents profileComponents) {
        List<AccountLabelInfo> accountLabelInfos;
        m mVar = profileComponents.bizData;
        if (mVar != null && user.getAccountLabelInfos() != null && (accountLabelInfos = user.getAccountLabelInfos()) != null) {
            for (AccountLabelInfo accountLabelInfo : accountLabelInfos) {
                if (accountLabelInfo.getLabelType() == i) {
                    LJIIIIZZ(mVar, accountLabelInfo.getContent());
                    LJIJJ(mVar, "learn_more_url", accountLabelInfo.getLearnMoreUrl(), true);
                    return;
                }
            }
        }
    }

    public static void LJII(int i, User user, ProfileComponents profileComponents) {
        AccountLabelInfo accountLabelInfo;
        m mVar = profileComponents.bizData;
        if (mVar != null) {
            List<AccountLabelInfo> accountLabelInfos = user.getAccountLabelInfos();
            if (accountLabelInfos != null) {
                Iterator<AccountLabelInfo> it = accountLabelInfos.iterator();
                while (it.hasNext()) {
                    accountLabelInfo = it.next();
                    if (accountLabelInfo.getLabelType() == i) {
                        break;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            accountLabelInfo = new AccountLabelInfo(0, null, null, 7, null);
            accountLabelInfo.setLabelType(i);
            arrayList.add(accountLabelInfo);
            user.setAccountLabelInfos(arrayList);
            LIZ(mVar, "learn_more_url", String.class, new AqS170S0100000_4(accountLabelInfo, 1188));
            LIZ(mVar, "describe", m.class, new AqS170S0100000_4(accountLabelInfo, 1194));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00d8, code lost:
    
        if (r5 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0025, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(com.ss.android.ugc.profile.platform.base.data.ProfileComponents r13, com.ss.android.ugc.aweme.profile.model.User r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244699iz.LJIL(com.ss.android.ugc.profile.platform.base.data.ProfileComponents, com.ss.android.ugc.aweme.profile.model.User, boolean):void");
    }

    public static void LJJ(User user, List list, boolean z) {
        m mVar;
        m mVar2;
        m mVar3;
        m mVar4;
        m mVar5;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProfileComponents profileComponents = (ProfileComponents) it.next();
                LIZ = profileComponents.bizData;
                String str = profileComponents.componentName;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1941259690:
                            if (!str.equals("user_account_base_info")) {
                                break;
                            } else {
                                LJJ(user, profileComponents.components, z);
                                break;
                            }
                        case -1505731634:
                            if (!str.equals("user_account_state_control_media")) {
                                break;
                            } else {
                                LJII(AccountLabelType.SCM.getValue(), user, profileComponents);
                                break;
                            }
                        case -694448925:
                            if (str.equals("relation_info_following") && (mVar5 = profileComponents.bizData) != null) {
                                Class cls = Integer.TYPE;
                                LIZ(mVar5, "following_count", cls, new AqS170S0100000_4(user, 1182));
                                LIZ(mVar5, "follow_toast_type", cls, new AqS170S0100000_4(user, 1185));
                                break;
                            }
                            break;
                        case -598667483:
                            if (str.equals("relation_info_posts") && (mVar4 = profileComponents.bizData) != null) {
                                LIZ(mVar4, "aweme_count", Integer.TYPE, new AqS170S0100000_4(user, 1165));
                                break;
                            }
                            break;
                        case -19437051:
                            if (str.equals("relation_info_like") && (mVar3 = profileComponents.bizData) != null) {
                                LIZ(mVar3, "like_count", Long.TYPE, new AqS167S0100000_1(user, 399));
                                break;
                            }
                            break;
                        case 26984349:
                            if (!str.equals("user_relation_info")) {
                                break;
                            } else {
                                LJJ(user, profileComponents.components, z);
                                break;
                            }
                        case 339204258:
                            if (!str.equals("user_info")) {
                                break;
                            } else {
                                LJJ(user, profileComponents.components, z);
                                break;
                            }
                        case 1111303396:
                            if (str.equals("user_account_ags_warning") && z) {
                                LJII(AccountLabelType.AGS_WARNING.getValue(), user, profileComponents);
                                break;
                            }
                            break;
                        case 1122989245:
                            if (str.equals("user_account_rba_identifier") && (mVar2 = profileComponents.bizData) != null) {
                                BizAccountInfo bizAccountInfo = user.getBizAccountInfo();
                                if (bizAccountInfo == null) {
                                    bizAccountInfo = new BizAccountInfo();
                                }
                                LIZ(mVar2, "ba_category", String.class, new AqS170S0100000_4(user, 1168));
                                user.setBizAccountInfo(bizAccountInfo);
                                if (C9N6.LIZ()) {
                                    LIZ(mVar2, "describe", m.class, new AqS170S0100000_4(bizAccountInfo, 1174));
                                    break;
                                } else {
                                    LIZ(mVar2, "describe", m.class, new AqS170S0100000_4(user, 1180));
                                    break;
                                }
                            }
                            break;
                        case 1640166284:
                            if (str.equals("relation_info_follower") && (mVar = profileComponents.bizData) != null) {
                                Class cls2 = Integer.TYPE;
                                LIZ(mVar, "follower_count", cls2, new AqS170S0100000_4(user, 1173));
                                if (z) {
                                    LIZ(mVar, "new_follower_count", cls2, new AqS170S0100000_4(user, 1176));
                                }
                                LIZ(mVar, "follow_toast_type", cls2, new AqS170S0100000_4(user, 1179));
                                break;
                            }
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x000a, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIFFI(com.ss.android.ugc.profile.platform.base.data.ProfileComponents r11, com.ss.android.ugc.aweme.profile.model.User r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244699iz.LJJIFFI(com.ss.android.ugc.profile.platform.base.data.ProfileComponents, com.ss.android.ugc.aweme.profile.model.User, boolean):void");
    }

    public static void LJJIII(User user, ProfileUser profileUser, boolean z) {
        m mVar;
        List<? extends ProfileComponents> list;
        m mVar2;
        m mVar3;
        if (profileUser != null) {
            ProfileComponents profileComponents = profileUser.tabsComponents;
            if (profileComponents != null && (list = profileComponents.components) != null) {
                for (ProfileComponents profileComponents2 : list) {
                    String str = profileComponents2.componentName;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -1893890292:
                                if (str.equals("profile_tab_ecommerce_showcase")) {
                                    LIZJ(profileComponents2.bizData, user);
                                    break;
                                } else {
                                    break;
                                }
                            case -1648586267:
                                if (str.equals("profile_tab_music")) {
                                    if (z) {
                                        m mVar4 = profileComponents2.bizData;
                                        LIZ = mVar4;
                                        if (mVar4 == null) {
                                            break;
                                        } else {
                                            if (user.getMusicTabInfo() == null) {
                                                user.setMusicTabInfo(new MusicTabInfo(false, null, 3, null));
                                            }
                                            MusicTabInfo musicTabInfo = user.getMusicTabInfo();
                                            if (musicTabInfo != null) {
                                                musicTabInfo.setMusicTabClaimInfo(new MusicTabClaimInfo(0, null, null, null, null, 31, null));
                                            }
                                            user.setShowArtistPlaylist(0);
                                            Class cls = Boolean.TYPE;
                                            LIZ(mVar4, "show_ghost_music_tab", cls, new AqS170S0100000_4(user, 1175));
                                            LIZ(mVar4, "claim_info", m.class, new AqS170S0100000_4(user, 1193));
                                            LIZ(mVar4, "show_artist_playlist", cls, new AqS170S0100000_4(user, 1195));
                                            if (user.getGeneralPermission() == null) {
                                                user.setGeneralPermission(new GeneralPermission());
                                            }
                                            Class cls2 = Integer.TYPE;
                                            LIZ(mVar4, "original_list", cls2, new AqS170S0100000_4(user, 1197));
                                            if (user.getOriginalMusician() == null) {
                                                user.setOriginalMusician(new OriginalMusician());
                                            }
                                            LIZ(mVar4, "new_release_clip_ids", g.class, new AqS170S0100000_4(user, 1199));
                                            LIZ(mVar4, "highlight_music_id", Long.TYPE, new AqS170S0100000_4(user, 1201));
                                            LIZ(mVar4, "main_artist_new_release_count", cls2, new AqS170S0100000_4(user, 1203));
                                            break;
                                        }
                                    } else {
                                        m mVar5 = profileComponents2.bizData;
                                        LIZ = mVar5;
                                        if (mVar5 == null) {
                                            break;
                                        } else {
                                            if (user.getOriginalMusician() == null) {
                                                user.setOriginalMusician(new OriginalMusician());
                                            }
                                            LIZ(mVar5, "new_release_clip_ids", g.class, new AqS170S0100000_4(user, 1205));
                                            LIZ(mVar5, "highlight_music_id", Long.TYPE, new AqS170S0100000_4(user, 1207));
                                            LIZ(mVar5, "show_artist_playlist", Boolean.TYPE, new AqS170S0100000_4(user, 1209));
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            case -745958441:
                                if (str.equals("profile_tab_like") && !z && (mVar3 = profileComponents2.bizData) != null) {
                                    LIZ(mVar3, "show_like_list", Boolean.TYPE, new AqS170S0100000_4(user, 1172));
                                    break;
                                }
                                break;
                            case -53914142:
                                if (str.equals("profile_tab_ecommerce_store")) {
                                    LIZJ(profileComponents2.bizData, user);
                                    break;
                                } else {
                                    break;
                                }
                            case 190156241:
                                if (str.equals("profile_tab_effect") && profileComponents2.bizData != null) {
                                    user.setShowEffectList(true);
                                    break;
                                }
                                break;
                            case 561719699:
                                if (str.equals("profile_tab_repost")) {
                                    m mVar6 = profileComponents2.bizData;
                                    LIZ = mVar6;
                                    if (mVar6 == null) {
                                        break;
                                    } else {
                                        if (user.getTabSetting() == null) {
                                            user.setTabSetting(new TabSetting());
                                        }
                                        if (user.getTabSetting().repostTab == null) {
                                            user.getTabSetting().repostTab = new RepostTab(0, 0, false, 7, null);
                                        }
                                        if (z) {
                                            user.getTabSetting().repostTab.setShowRepostSelf(1);
                                            break;
                                        } else {
                                            user.getTabSetting().repostTab.setShowRepostOther(1);
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            case 600411254:
                                if (str.equals("profile_tab_public_post") && z) {
                                    m mVar7 = profileComponents2.bizData;
                                    LIZ = mVar7;
                                    if (mVar7 != null) {
                                        LIZ(mVar7, "user_profile_guide", g.class, new AqS170S0100000_4(user, 1211));
                                        if (user.getUserNowPackStruct() == null) {
                                            user.setUserNowPackStruct(new UserNowPackStruct(0, null, 3, null));
                                        }
                                        LIZ(mVar7, "user_now_pack_info", m.class, new AqS135S0200000_4(mVar7, user, 219));
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                break;
                            case 772937582:
                                if (str.equals("profile_tab_business_page") && (mVar2 = profileComponents2.bizData) != null) {
                                    if (z) {
                                        if (user.getTabSetting() == null) {
                                            user.setTabSetting(new TabSetting());
                                        }
                                        if (user.getTabSetting().baTab == null) {
                                            user.getTabSetting().baTab = new BATab(null, 1, null);
                                        }
                                        Class cls3 = Boolean.TYPE;
                                        LIZ(mVar2, "show_biz_page_tab", cls3, new AqS170S0100000_4(user, 1160));
                                        LIZ(mVar2, "show_biz_page_tab", cls3, new AqS170S0100000_4(user, 1163));
                                        break;
                                    } else {
                                        LIZ(mVar2, "bio_url", String.class, new AqS170S0100000_4(user, 1166));
                                        LIZ(mVar2, "bio_secure_url", String.class, new AqS170S0100000_4(user, 1169));
                                        break;
                                    }
                                }
                                break;
                            case 1605609247:
                                if (str.equals("profile_tab_sticker_store")) {
                                    m mVar8 = profileComponents2.bizData;
                                    LIZ = mVar8;
                                    if (mVar8 == null) {
                                        break;
                                    } else {
                                        if (user.getTabSetting() == null) {
                                            user.setTabSetting(new TabSetting());
                                        }
                                        if (user.getTabSetting().stickerTab == null) {
                                            user.getTabSetting().stickerTab = new StickerTab(null, null, null, null, null, 31, null);
                                        }
                                        TabSetting tabSetting = user.getTabSetting();
                                        StickerTab stickerTab = user.getTabSetting().stickerTab;
                                        o.LJIIIIZZ(stickerTab, "user.tabSetting.stickerTab");
                                        tabSetting.stickerTab = StickerTab.copy$default(stickerTab, Boolean.TRUE, null, null, null, null, 30, null);
                                        Class cls4 = Boolean.TYPE;
                                        LIZ(mVar8, "show_sticker_set_sticker", cls4, new AqS170S0100000_4(user, 1216));
                                        LIZ(mVar8, "show_video_sticker", cls4, new AqS170S0100000_4(user, 1218));
                                        Class cls5 = Integer.TYPE;
                                        LIZ(mVar8, "sticker_set_count", cls5, new AqS170S0100000_4(user, 1156));
                                        LIZ(mVar8, "video_sticker_count", cls5, new AqS170S0100000_4(user, 1158));
                                        break;
                                    }
                                } else {
                                    break;
                                }
                        }
                    }
                }
            }
            ProfileComponents profileComponents3 = profileUser.tabsComponents;
            if (profileComponents3 != null && (mVar = profileComponents3.bizData) != null) {
                LIZ(mVar, "default_landing_tab_id", Integer.TYPE, new AqS170S0100000_4(user, 1196));
            }
        }
    }

    public static void LIZ(m mVar, String str, Class cls, InterfaceC88472Yns interfaceC88472Yns) {
        j LJJIJ = mVar.LJJIJ(str);
        if (LJJIJ == null) {
            return;
        }
        if (o.LJ(cls, Boolean.TYPE)) {
            interfaceC88472Yns.invoke(Boolean.valueOf(LJJIJ.LJFF()));
            return;
        }
        if (o.LJ(cls, String.class)) {
            interfaceC88472Yns.invoke(LJJIJ.LJJIFFI());
            return;
        }
        if (o.LJ(cls, Integer.TYPE)) {
            interfaceC88472Yns.invoke(Integer.valueOf(LJJIJ.LJIILJJIL()));
            return;
        }
        if (o.LJ(cls, Long.TYPE)) {
            interfaceC88472Yns.invoke(Long.valueOf(LJJIJ.LJIJJLI()));
            return;
        }
        if (o.LJ(cls, Float.TYPE)) {
            interfaceC88472Yns.invoke(Float.valueOf(LJJIJ.LJIIJ()));
            return;
        }
        if (o.LJ(cls, Double.TYPE)) {
            interfaceC88472Yns.invoke(Double.valueOf(LJJIJ.LJIIIZ()));
        } else if (o.LJ(cls, m.class)) {
            interfaceC88472Yns.invoke(LJJIJ.LJIIZILJ());
        } else {
            if (!o.LJ(cls, g.class)) {
                return;
            }
            interfaceC88472Yns.invoke(LJJIJ.LJIILLIIL());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:247:0x0183, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.ss.android.ugc.aweme.profile.model.User r23, com.ss.android.ugc.profile.platform.base.data.ProfileUser r24, boolean r25, X.InterfaceC65784Pro r26) {
        /*
            Method dump skipped, instructions count: 2318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244699iz.LIZLLL(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.profile.platform.base.data.ProfileUser, boolean, X.Pro):void");
    }

    public static ProfileUser LJIIIZ(User user, ProfileUser profileUser, boolean z, InterfaceC65784Pro invoke) {
        ProfileUser profileUser2 = profileUser;
        o.LJIIIZ(invoke, "invoke");
        if (user == null) {
            return null;
        }
        if (profileUser2 == null) {
            profileUser2 = new ProfileUser();
        }
        if (C77357UXp.LJJIIJZLJL()) {
            LIZLLL(user, profileUser2, z, invoke);
            return profileUser2;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C9N4(user, profileUser2, z, invoke, null), 3);
        return profileUser2;
    }

    public static void LJIJJ(m mVar, String str, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        mVar.LJJJ(str);
        if (!z) {
            mVar.LJJII(str, (j) obj);
            return;
        }
        if (obj instanceof Boolean) {
            mVar.LJJIII((Boolean) obj, str);
            return;
        }
        if (obj instanceof String) {
            mVar.LJJIIZ(str, (String) obj);
        } else if (obj instanceof Character) {
            mVar.LJJII(str, new p(obj));
        } else if (obj instanceof Number) {
            mVar.LJJIIJ(str, (Number) obj);
        }
    }
}
