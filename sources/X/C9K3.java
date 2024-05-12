package X;

import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.LeadsGenModel;
import com.ss.android.ugc.aweme.profile.model.AdvancedFeatureInfo;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9K3, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9K3 extends AbstractC65781Prl implements InterfaceC88471Ynr<ProfileComponents, User, C76800UCe> {
    public static final C9K3 LJLIL = new C9K3();

    public C9K3() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(ProfileComponents profileComponents, User user) {
        LeadsGenModel leadsGenModel;
        LeadsGenModel leadsGenModel2;
        String schema;
        LeadsGenModel leadsGenModel3;
        String businessData;
        LeadsGenModel leadsGenModel4;
        String actionName;
        LeadsGenModel leadsGenModel5;
        String LJJIIZ;
        String LJJIIJZLJL;
        AdvancedFeatureInfo[] advancedFeatureInfoArr;
        String name;
        String iconUrl;
        String donationLink;
        ProfileComponents first = profileComponents;
        User user2 = user;
        o.LJIIIZ(first, "first");
        o.LJIIIZ(user2, "user");
        List<? extends ProfileComponents> list = first.components;
        if (list != null) {
            for (ProfileComponents profileComponents2 : list) {
                C244699iz.LIZIZ = profileComponents2.bizData;
                String str = profileComponents2.componentName;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1806700862:
                            if (str.equals("advanced_feature_leads_gen")) {
                                m mVar = new m();
                                BizAccountInfo bizAccountInfo = user2.getBizAccountInfo();
                                if (bizAccountInfo != null && (leadsGenModel5 = bizAccountInfo.getLeadsGenModel()) != null) {
                                    boolean hasLeadsGen = leadsGenModel5.getHasLeadsGen();
                                    mVar.LJJJ("has_leads_gen");
                                    mVar.LJJIII(Boolean.valueOf(hasLeadsGen), "has_leads_gen");
                                }
                                BizAccountInfo bizAccountInfo2 = user2.getBizAccountInfo();
                                if (bizAccountInfo2 != null && (leadsGenModel4 = bizAccountInfo2.getLeadsGenModel()) != null && (actionName = leadsGenModel4.getActionName()) != null) {
                                    C244699iz.LJFF(actionName, "action_name", mVar);
                                }
                                BizAccountInfo bizAccountInfo3 = user2.getBizAccountInfo();
                                if (bizAccountInfo3 != null && (leadsGenModel3 = bizAccountInfo3.getLeadsGenModel()) != null && (businessData = leadsGenModel3.getBusinessData()) != null) {
                                    C244699iz.LJFF(businessData, "business_data", mVar);
                                }
                                BizAccountInfo bizAccountInfo4 = user2.getBizAccountInfo();
                                if (bizAccountInfo4 != null && (leadsGenModel2 = bizAccountInfo4.getLeadsGenModel()) != null && (schema = leadsGenModel2.getSchema()) != null) {
                                    C244699iz.LJFF(schema, "schema_url", mVar);
                                }
                                BizAccountInfo bizAccountInfo5 = user2.getBizAccountInfo();
                                if (bizAccountInfo5 != null && (leadsGenModel = bizAccountInfo5.getLeadsGenModel()) != null) {
                                    long pageId = leadsGenModel.getPageId();
                                    mVar.LJJJ("page_id");
                                    mVar.LJJIIJ("page_id", Long.valueOf(pageId));
                                }
                                BizAccountInfo bizAccountInfo6 = user2.getBizAccountInfo();
                                if (bizAccountInfo6 != null && bizAccountInfo6.getLeadsGenModel() != null) {
                                    m mVar2 = profileComponents2.bizData;
                                    if (mVar2 != null) {
                                        mVar2.LJJJ("leads_gen");
                                    }
                                    m mVar3 = profileComponents2.bizData;
                                    if (mVar3 != null) {
                                        mVar3.LJJII("leads_gen", mVar);
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case -1403896493:
                            if (str.equals("advanced_feature_showcase") && (LJJIIZ = C46104I7o.LJJIIZ(user2)) != null) {
                                C244699iz.LJ(LJJIIZ, profileComponents2, "showcase_schema");
                                break;
                            }
                            break;
                        case -431469668:
                            if (str.equals("advanced_feature_shop") && (LJJIIJZLJL = C46104I7o.LJJIIJZLJL(user2)) != null) {
                                C244699iz.LJ(LJJIIJZLJL, profileComponents2, "shop_schema");
                                break;
                            }
                            break;
                        case -352749300:
                            if (str.equals("advanced_feature_order_center") && (advancedFeatureInfoArr = user2.advancedFeatureInfo) != null) {
                                int length = advancedFeatureInfoArr.length;
                                int i = 0;
                                while (true) {
                                    if (i < length) {
                                        AdvancedFeatureInfo advancedFeatureInfo = advancedFeatureInfoArr[i];
                                        if (advancedFeatureInfo.getFeatureId() == 81) {
                                            String orderCenterSchema = advancedFeatureInfo.getOrderCenterSchema();
                                            if (orderCenterSchema != null) {
                                                C244699iz.LJ(orderCenterSchema, profileComponents2, "order_center_schema");
                                            }
                                            String orderCenterTitle = advancedFeatureInfo.getOrderCenterTitle();
                                            if (orderCenterTitle != null) {
                                                C244699iz.LJ(orderCenterTitle, profileComponents2, "order_center_title");
                                            }
                                            String entryName = advancedFeatureInfo.getEntryName();
                                            if (entryName != null) {
                                                C244699iz.LJ(entryName, profileComponents2, "order_center_title_en");
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            }
                            break;
                        case 197604454:
                            if (str.equals("advanced_feature_live_events")) {
                                g gVar = new g();
                                List<LiveEventStruct> liveEventStructList = user2.getLiveEventStructList();
                                if (liveEventStructList != null) {
                                    for (LiveEventStruct liveEventStruct : liveEventStructList) {
                                        m mVar4 = new m();
                                        if (liveEventStruct != null) {
                                            String id = liveEventStruct.getId();
                                            if (id != null) {
                                                mVar4.LJJIIZ("id", id);
                                            }
                                            mVar4.LJJIII(Boolean.valueOf(liveEventStruct.isPaidEvent()), "is_paid_event");
                                            mVar4.LJJIIJ("start_time", Long.valueOf(liveEventStruct.getStartTime()));
                                            String title = liveEventStruct.getTitle();
                                            if (title != null) {
                                                C244699iz.LJFF(title, "title", mVar4);
                                            }
                                        }
                                        gVar.LJJII(mVar4);
                                    }
                                }
                                m mVar5 = profileComponents2.bizData;
                                if (mVar5 != null) {
                                    mVar5.LJJJ("events");
                                }
                                m mVar6 = profileComponents2.bizData;
                                if (mVar6 != null) {
                                    mVar6.LJJII("events", gVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 1932635609:
                            if (str.equals("advanced_feature_supporting")) {
                                m mVar7 = new m();
                                ProfileNgoStruct profileNgoStruct = user2.getProfileNgoStruct();
                                if (profileNgoStruct != null && (donationLink = profileNgoStruct.getDonationLink()) != null) {
                                    C244699iz.LJFF(donationLink, "ngo_donation_link", mVar7);
                                }
                                ProfileNgoStruct profileNgoStruct2 = user2.getProfileNgoStruct();
                                if (profileNgoStruct2 != null && (iconUrl = profileNgoStruct2.getIconUrl()) != null) {
                                    C244699iz.LJFF(iconUrl, "ngo_icon_url", mVar7);
                                }
                                ProfileNgoStruct profileNgoStruct3 = user2.getProfileNgoStruct();
                                if (profileNgoStruct3 != null && (name = profileNgoStruct3.getName()) != null) {
                                    C244699iz.LJFF(name, "ngo_name", mVar7);
                                }
                                ProfileNgoStruct profileNgoStruct4 = user2.getProfileNgoStruct();
                                if (profileNgoStruct4 != null) {
                                    int id2 = profileNgoStruct4.getId();
                                    mVar7.LJJJ("ngo_id");
                                    mVar7.LJJIIJ("ngo_id", Integer.valueOf(id2));
                                }
                                m mVar8 = profileComponents2.bizData;
                                if (mVar8 != null) {
                                    mVar8.LJJJ("supporting_ngo");
                                }
                                m mVar9 = profileComponents2.bizData;
                                if (mVar9 != null) {
                                    mVar9.LJJII("supporting_ngo", mVar7);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
