package X;

import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.BizAddress;
import com.ss.android.ugc.aweme.commerce.BizContactInfo;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9LA, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9LA extends AbstractC65781Prl implements InterfaceC88471Ynr<ProfileComponents, User, C76800UCe> {
    public static final C9LA LJLIL = new C9LA();

    public C9LA() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(ProfileComponents profileComponents, User user) {
        List<? extends ProfileComponents> list;
        List<? extends ProfileComponents> list2;
        BizAccountInfo bizAccountInfo;
        String androidDownloadAppLink;
        m mVar;
        BizAccountInfo bizAccountInfo2;
        BizContactInfo bizContactInfo;
        BizAddress bizAddress;
        m mVar2;
        List<CouponInfo> couponInfo;
        BizContactInfo bizContactInfo2;
        BizContactInfo bizContactInfo3;
        String bizPhone;
        ProfileComponents first = profileComponents;
        User user2 = user;
        o.LJIIIZ(first, "first");
        o.LJIIIZ(user2, "user");
        if (first.components == null && user2.getSignature() != null) {
            ProfileComponents profileComponents2 = new ProfileComponents();
            profileComponents2.componentName = "bio_signature";
            first.components = C47261Igj.LJJIJIL(profileComponents2);
        }
        List<? extends ProfileComponents> list3 = first.components;
        if (list3 != null) {
            for (ProfileComponents profileComponents3 : list3) {
                C244699iz.LIZIZ = profileComponents3.bizData;
                String str = profileComponents3.componentName;
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1857239291) {
                        if (hashCode != -1710478581) {
                            if (hashCode == -328374719 && str.equals("bio_signature")) {
                                m mVar3 = new m();
                                mVar3.LJJIIZ("text", user2.getSignature());
                                m mVar4 = profileComponents3.bizData;
                                if (mVar4 != null) {
                                    mVar4.LJJJ("describe");
                                }
                                m mVar5 = profileComponents3.bizData;
                                if (mVar5 != null) {
                                    mVar5.LJJII("describe", mVar3);
                                }
                            }
                        } else if (str.equals("bio_mail_link") && (list = profileComponents3.components) != null) {
                            for (ProfileComponents profileComponents4 : list) {
                                String str2 = profileComponents4.componentName;
                                if (o.LJ(str2, "bio_email")) {
                                    String bioEmail = user2.getBioEmail();
                                    if (bioEmail != null) {
                                        C244699iz.LJ(bioEmail, profileComponents4, "bio_email");
                                    }
                                } else if (o.LJ(str2, "bio_link")) {
                                    String bioUrl = user2.getBioUrl();
                                    if (bioUrl != null) {
                                        C244699iz.LJ(bioUrl, profileComponents3, "bio_url");
                                    }
                                    String bioSecureUrl = user2.getBioSecureUrl();
                                    if (bioSecureUrl != null) {
                                        C244699iz.LJ(bioSecureUrl, profileComponents4, "bio_secure_url");
                                    }
                                }
                            }
                        }
                    } else if (str.equals("bio_business_account") && (list2 = profileComponents3.components) != null) {
                        for (ProfileComponents profileComponents5 : list2) {
                            String str3 = profileComponents5.componentName;
                            if (str3 != null) {
                                switch (str3.hashCode()) {
                                    case -2031990816:
                                        if (str3.equals("bio_business_account_app_download") && (bizAccountInfo = user2.getBizAccountInfo()) != null && (androidDownloadAppLink = bizAccountInfo.getAndroidDownloadAppLink()) != null) {
                                            C244699iz.LJ(androidDownloadAppLink, profileComponents5, "android_download_app_link");
                                            break;
                                        }
                                        break;
                                    case -451726150:
                                        if (str3.equals("bio_business_account_address") && (mVar = profileComponents5.bizData) != null && (bizAccountInfo2 = user2.getBizAccountInfo()) != null && (bizContactInfo = bizAccountInfo2.getBizContactInfo()) != null && (bizAddress = bizContactInfo.getBizAddress()) != null) {
                                            String latitude = bizAddress.getLatitude();
                                            if (latitude != null) {
                                                C244699iz.LJFF(latitude, "latitude", mVar);
                                            }
                                            String longitude = bizAddress.getLongitude();
                                            if (longitude != null) {
                                                C244699iz.LJFF(longitude, "longitude", mVar);
                                            }
                                            String formattedAddressText = bizAddress.getFormattedAddressText();
                                            if (formattedAddressText != null) {
                                                C244699iz.LJFF(formattedAddressText, "formatted_address_text", mVar);
                                            }
                                            String simplifiedAddressText = bizAddress.getSimplifiedAddressText();
                                            if (simplifiedAddressText != null) {
                                                C244699iz.LJFF(simplifiedAddressText, "simplified_address_text", mVar);
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                        break;
                                    case 53350048:
                                        if (str3.equals("bio_business_account_coupon") && (mVar2 = profileComponents5.bizData) != null) {
                                            g gVar = new g();
                                            BizAccountInfo bizAccountInfo3 = user2.getBizAccountInfo();
                                            if (bizAccountInfo3 != null && (couponInfo = bizAccountInfo3.getCouponInfo()) != null) {
                                                for (CouponInfo couponInfo2 : couponInfo) {
                                                    m mVar6 = new m();
                                                    mVar6.LJJIIJ("coupon_id", couponInfo2.getCouponId());
                                                    mVar6.LJJIIZ("coupon_code", couponInfo2.getCouponCode());
                                                    mVar6.LJJIIJ("discount_rate", couponInfo2.getDiscountRate());
                                                    mVar6.LJJIIZ("description", couponInfo2.getDescription());
                                                    mVar6.LJJIIJ("start_time", couponInfo2.getStartTime());
                                                    mVar6.LJJIIJ("expire_time", couponInfo2.getExpireTime());
                                                    mVar6.LJJIIZ("website", couponInfo2.getWebsite());
                                                    mVar6.LJJIIZ("website_secure", couponInfo2.getWebsiteSecure());
                                                    gVar.LJJII(mVar6);
                                                }
                                            }
                                            mVar2.LJJJ("coupon_list");
                                            mVar2.LJJII("coupon_list", gVar);
                                            break;
                                        }
                                        break;
                                    case 290607028:
                                        if (str3.equals("bio_business_account_phone")) {
                                            BizAccountInfo bizAccountInfo4 = user2.getBizAccountInfo();
                                            if (bizAccountInfo4 != null && (bizContactInfo3 = bizAccountInfo4.getBizContactInfo()) != null && (bizPhone = bizContactInfo3.getBizPhone()) != null) {
                                                C244699iz.LJ(bizPhone, profileComponents5, "biz_phone");
                                            }
                                            BizAccountInfo bizAccountInfo5 = user2.getBizAccountInfo();
                                            if (bizAccountInfo5 != null && (bizContactInfo2 = bizAccountInfo5.getBizContactInfo()) != null) {
                                                Boolean call = bizContactInfo2.getCall();
                                                if (call != null) {
                                                    boolean booleanValue = call.booleanValue();
                                                    m mVar7 = profileComponents5.bizData;
                                                    if (mVar7 != null) {
                                                        mVar7.LJJJ("biz_phone_enable_call");
                                                    }
                                                    m mVar8 = profileComponents5.bizData;
                                                    if (mVar8 != null) {
                                                        mVar8.LJJIII(Boolean.valueOf(booleanValue), "biz_phone_enable_call");
                                                    }
                                                }
                                                Boolean text = bizContactInfo2.getText();
                                                if (text != null) {
                                                    boolean booleanValue2 = text.booleanValue();
                                                    m mVar9 = profileComponents5.bizData;
                                                    if (mVar9 != null) {
                                                        mVar9.LJJJ("biz_phone_enable_text");
                                                    }
                                                    m mVar10 = profileComponents5.bizData;
                                                    if (mVar10 != null) {
                                                        mVar10.LJJIII(Boolean.valueOf(booleanValue2), "biz_phone_enable_text");
                                                    }
                                                }
                                                String type = bizContactInfo2.getType();
                                                if (type == null) {
                                                    break;
                                                } else {
                                                    m mVar11 = profileComponents5.bizData;
                                                    if (mVar11 != null) {
                                                        mVar11.LJJJ("biz_phone_show_pattern");
                                                    }
                                                    m mVar12 = profileComponents5.bizData;
                                                    if (mVar12 != null) {
                                                        mVar12.LJJIIZ("biz_phone_show_pattern", type);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
