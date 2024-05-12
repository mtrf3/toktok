package q03;

import X.ASQ;
import X.ASY;
import X.AbstractC220518l5;
import X.ActivityC45651qj;
import X.C00F;
import X.C0JU;
import X.C116414hZ;
import X.C132805Jc;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C190537dp;
import X.C190907eQ;
import X.C191187es;
import X.C192487gy;
import X.C193277iF;
import X.C196157mt;
import X.C198017pt;
import X.C198667qw;
import X.C1DG;
import X.C1EU;
import X.C201037ul;
import X.C212428Vi;
import X.C219208iy;
import X.C219368jE;
import X.C219568jY;
import X.C219618jd;
import X.C219648jg;
import X.C219658jh;
import X.C219668ji;
import X.C220488l2;
import X.C222588oQ;
import X.C228648yC;
import X.C245319jz;
import X.C252659vp;
import X.C252669vq;
import X.C26045AKb;
import X.C29822Bn8;
import X.C3C5;
import X.C43001GuD;
import X.C44847Hit;
import X.C45804HyK;
import X.C51029K0z;
import X.C51556KLg;
import X.C55096Ljo;
import X.C55230Lly;
import X.C61996OUu;
import X.C68322mC;
import X.C73411SrX;
import X.C73969T1h;
import X.C76800UCe;
import X.C78253UnR;
import X.C78598Ut0;
import X.C7UO;
import X.C84G;
import X.C8S2;
import X.C98T;
import X.EnumC198697qz;
import X.FMX;
import X.InterfaceC191657fd;
import X.InterfaceC192297gf;
import X.InterfaceC192787hS;
import X.InterfaceC57784Mm4;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.M89;
import X.M8L;
import X.MH9;
import X.O6R;
import X.ORZ;
import X.OZ1;
import X.SY4;
import X.SYL;
import X.T16;
import X.UC0;
import X.XKQ;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS23S0100000_3;
import Y.AfS53S0100000_1;
import Y.AfS55S0100000_3;
import Y.IDComparatorS29S0000000_1;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.prefab.ShootAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.AddVideoAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentManageAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListStateAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.ss.android.ugc.aweme.nows.feed.ui.guide.NowInviteAndQRCell;
import com.ss.android.ugc.aweme.nows.feed.ui.guide.NowWeakVersionShareCell;
import com.ss.android.ugc.aweme.nows.widget.guide.NowWidgetGuideCell;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailReserveTableAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingProviderInfo;
import com.ss.android.ugc.aweme.poi.map.LocationDetailMobParam;
import com.ss.android.ugc.aweme.poi.map.PoiLocationDetailFragment;
import com.ss.android.ugc.aweme.poi.map.assem.LocationDetailInfoAssem;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveQuitComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryShareComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryUserAvatarComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryViewerEntranceComponent;
import com.ss.android.ugc.aweme.topic.review.panel.TopicRatingBarAssem;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursDetailScaffoldAssem;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.PadAdaptionFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0100100_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IDaS483S0100000_3 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZ$11(this, view);
                return;
            case 12:
                LIZ$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LIZ$13(this, view);
                return;
            case 14:
                LIZ$14(this, view);
                return;
            case 15:
                LIZ$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LIZ$16(this, view);
                return;
            case 17:
                LIZ$17(this, view);
                return;
            case 18:
                LIZ$18(this, view);
                return;
            case 19:
                LIZ$19(this, view);
                return;
            case 20:
                LIZ$20(this, view);
                return;
            case 21:
                LIZ$21(this, view);
                return;
            case 22:
                LIZ$22(this, view);
                return;
            case 23:
                LIZ$23(this, view);
                return;
            case 24:
                LIZ$24(this, view);
                return;
            case 25:
                LIZ$25(this, view);
                return;
            case 26:
                LIZ$26(this, view);
                return;
            case 27:
                LIZ$27(this, view);
                return;
            case 28:
                LIZ$28(this, view);
                return;
            case 29:
                LIZ$29(this, view);
                return;
            case 30:
                LIZ$30(this, view);
                return;
            case 31:
                LIZ$31(this, view);
                return;
            case 32:
                LIZ$32(this, view);
                return;
            case 33:
                LIZ$33(this, view);
                return;
            case 34:
                LIZ$34(this, view);
                return;
            case 35:
                LIZ$35(this, view);
                return;
            case 36:
                LIZ$36(this, view);
                return;
            case 37:
                LIZ$37(this, view);
                return;
            case 38:
                LIZ$38(this, view);
                return;
            case 39:
                LIZ$39(this, view);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                LIZ$40(this, view);
                return;
            case 41:
                LIZ$41(this, view);
                return;
            case 42:
                LIZ$42(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS483S0100000_3(Object obj, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        Fragment LIZLLL;
        ShootAbility shootAbility;
        if (view != null && (LIZLLL = C212428Vi.LIZLLL((ShootAssem) iDaS483S0100000_3.l0)) != null && (shootAbility = (ShootAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), ShootAbility.class, null)) != null) {
            shootAbility.te0();
        }
    }

    public static final void LIZ$1(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        Fragment LIZLLL;
        ShootAbility shootAbility;
        if (view != null && (LIZLLL = C212428Vi.LIZLLL((ShootAssem) iDaS483S0100000_3.l0)) != null && (shootAbility = (ShootAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), ShootAbility.class, null)) != null) {
            shootAbility.ZJ();
        }
    }

    public static final void LIZ$10(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        String str;
        Aweme aweme;
        if (view != null) {
            Object[] objArr = new Object[2];
            objArr[0] = "feed";
            VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL((VideoFavoriteAssem) iDaS483S0100000_3.l0);
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            objArr[1] = String.valueOf(str);
            String LLLZ = C16880lQ.LLLZ("click favorite button in %s, aid is %s", Arrays.copyOf(objArr, 2));
            o.LJIIIIZZ(LLLZ, "format(this, *args)");
            M8L.LIZ(LLLZ);
            ((VideoFavoriteAssem) iDaS483S0100000_3.l0).q4().mv0();
        }
    }

    public static final void LIZ$11(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        ActivityC45651qj LJ;
        if (view != null && (LJ = C1DG.LJ(((NowInviteAndQRCell) iDaS483S0100000_3.l0).itemView, "itemView.context")) != null) {
            C198667qw.LIZIZ(LJ, EnumC198697qz.FFP);
        }
    }

    public static final void LIZ$12(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        ActivityC45651qj LJ;
        if (view != null && (LJ = C1DG.LJ(((NowInviteAndQRCell) iDaS483S0100000_3.l0).itemView, "itemView.context")) != null) {
            C198667qw.LIZJ(LJ, EnumC198697qz.FFP, "top_button");
        }
    }

    public static final void LIZ$13(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        ActivityC45651qj LJ;
        if (view != null && (LJ = C1DG.LJ(((NowWeakVersionShareCell) iDaS483S0100000_3.l0).itemView, "itemView.context")) != null) {
            C198667qw.LIZIZ(LJ, EnumC198697qz.HOMEPAGE_NOW_TOP);
        }
    }

    public static final void LIZ$14(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null && !C198017pt.LIZ().getBoolean("is_widget_installed", false)) {
            C196157mt.LJFF("fix", "try_widget");
            View itemView = ((NowWidgetGuideCell) iDaS483S0100000_3.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIIZZ(R.string.y6);
            c26045AKb.LJIIJ();
            IAppWidgetService LJIJI = AppWidgetServiceImpl.LJIJI();
            Context context = ((NowWidgetGuideCell) iDaS483S0100000_3.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            LJIJI.LJIILL(context);
        }
    }

    public static final void LIZ$15(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            if (((NowWidgetGuideCell) iDaS483S0100000_3.l0).getItem() != null) {
                ((NowWidgetGuideCell) iDaS483S0100000_3.l0).getClass();
            }
            C198017pt.LIZ().storeLong("card_last_closed_time", System.currentTimeMillis());
            C198017pt.LIZ().storeInt("card_total_closed_count", C198017pt.LIZ().getInt("card_total_closed_count", 0) + 1);
            C196157mt.LJFF("fix", "close");
        }
    }

    public static final void LIZ$16(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        C190537dp c190537dp;
        PoiBookingInfo poiBookingInfo;
        List<PoiBookingProviderInfo> providers;
        C191187es c191187es;
        PoiBookingProviderInfo poiBookingProviderInfo;
        String url;
        C191187es c191187es2;
        Object LIZ;
        String str;
        String str2;
        String str3;
        String ttTypeCode;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = "";
        if (view != null && (c190537dp = (C190537dp) ((PoiDetailReserveTableAssem) iDaS483S0100000_3.l0).LJLJLLL.getValue()) != null && (poiBookingInfo = c190537dp.LJLIL) != null && (providers = poiBookingInfo.getProviders()) != null) {
            Iterator<PoiBookingProviderInfo> it = providers.iterator();
            while (true) {
                c191187es = null;
                if (it.hasNext()) {
                    poiBookingProviderInfo = it.next();
                    Integer provider = poiBookingProviderInfo.getProvider();
                    if (provider != null && provider.intValue() == 1) {
                        break;
                    }
                } else {
                    poiBookingProviderInfo = null;
                    break;
                }
            }
            PoiBookingProviderInfo poiBookingProviderInfo2 = poiBookingProviderInfo;
            if (poiBookingProviderInfo2 != null && (url = poiBookingProviderInfo2.getUrl()) != null) {
                Uri.Builder LIZIZ = C1EU.LIZIZ("aweme://poi_third_party", "url", url);
                C190537dp c190537dp2 = (C190537dp) ((PoiDetailReserveTableAssem) iDaS483S0100000_3.l0).LJLJLLL.getValue();
                if (c190537dp2 != null) {
                    c191187es2 = c190537dp2.LJLILLLLZI;
                } else {
                    c191187es2 = null;
                }
                try {
                    if (c191187es2 == null || (str4 = c191187es2.getCollectInfo()) == null) {
                        str4 = "";
                    }
                    JSONObject jSONObject = new JSONObject(str4);
                    jSONObject.putOpt("enter_from", "poi_detail");
                    jSONObject.putOpt("enter_method", "click_reserve_button");
                    jSONObject.putOpt("page_name", "reserve");
                    if (c191187es2 != null) {
                        str5 = c191187es2.getProvider();
                    } else {
                        str5 = null;
                    }
                    jSONObject.putOpt("provider", str5);
                    if (c191187es2 == null) {
                        str6 = null;
                    } else {
                        str6 = c191187es2.getPoiId();
                    }
                    jSONObject.putOpt("poi_id", str6);
                    if (c191187es2 == null) {
                        str7 = null;
                    } else {
                        str7 = c191187es2.getPoiCity();
                    }
                    jSONObject.putOpt("poi_city", str7);
                    LIZ = jSONObject.toString();
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = "";
                }
                String builder = LIZIZ.appendQueryParameter("mob_extra", (String) LIZ).toString();
                o.LJIIIIZZ(builder, "parse(HOST_THIRD_PARTY).…              .toString()");
                C51556KLg.LIZ.getClass();
                IPoiService LIZ2 = C51556KLg.LIZ();
                Context context = view.getContext();
                o.LJIIIIZZ(context, "v.context");
                LIZ2.LJIIIIZZ(context, builder);
                C190537dp c190537dp3 = (C190537dp) ((PoiDetailReserveTableAssem) iDaS483S0100000_3.l0).LJLJLLL.getValue();
                if (c190537dp3 != null) {
                    c191187es = c190537dp3.LJLILLLLZI;
                }
                if (c191187es == null || (str = c191187es.getPoiId()) == null) {
                    str = "";
                }
                if (c191187es == null || (str2 = c191187es.getPoiRegionCode()) == null) {
                    str2 = "";
                }
                if (c191187es == null || (str3 = c191187es.getPoiCity()) == null) {
                    str3 = "";
                }
                if (c191187es != null && (ttTypeCode = c191187es.getTtTypeCode()) != null) {
                    str8 = ttTypeCode;
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "poi_detail");
                c188727au.LJIIIZ("enter_method", "click_button");
                c188727au.LJIIIZ("poi_id", str);
                c188727au.LJIIIZ("poi_city", str3);
                c188727au.LJIIIZ("poi_region_code", str2);
                c188727au.LJIIIZ("tt_type_code", str8);
                FMX.LJIIL("click_reserve_button", c188727au.LIZ);
            }
        }
    }

    public static final void LIZ$17(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        LocationDetailInfoAssem locationDetailInfoAssem;
        Context context;
        FragmentManager supportFragmentManager;
        PoiListApi.PoiDetailResponse v3;
        String str;
        String str2;
        if (view == null || (context = (locationDetailInfoAssem = (LocationDetailInfoAssem) iDaS483S0100000_3.l0).getContext()) == null) {
            return;
        }
        LocationDetailMobParam locationDetailMobParam = ((C190907eQ) locationDetailInfoAssem.LJLIL.getValue()).LJLILLLLZI;
        if (locationDetailMobParam != null) {
            String str3 = ((C190907eQ) locationDetailInfoAssem.LJLIL.getValue()).LJLIL;
            String groupId = locationDetailMobParam.getGroupId();
            String authorId = locationDetailMobParam.getAuthorId();
            PoiAnchorData data = locationDetailMobParam.getData();
            String str4 = null;
            if (data != null) {
                str = data.getPoiCityCode();
            } else {
                str = null;
            }
            PoiAnchorData data2 = locationDetailMobParam.getData();
            if (data2 != null) {
                str2 = data2.getPoiRegionCode();
            } else {
                str2 = null;
            }
            String logPb = locationDetailMobParam.getLogPb();
            PoiListApi.PoiDetailResponse v32 = locationDetailInfoAssem.v3();
            if (v32 != null) {
                str4 = v32.collectInfo;
            }
            LinkedHashMap LIZ = C0JU.LIZ("enter_from", "poi_map");
            if (str3 != null) {
                LIZ.put("poi_id", str3);
            }
            if (groupId != null) {
                LIZ.put("group_id", groupId);
            }
            if (authorId != null) {
                LIZ.put("author_id", authorId);
            }
            C132805Jc.LJFF(LIZ, "poi_info_source", "google", 0, "poi_device_samecity");
            if (str != null) {
                LIZ.put("poi_city", str);
            }
            if (str2 != null) {
                LIZ.put("poi_region_code", str2);
            }
            if (logPb != null) {
                LIZ.put("log_pb", logPb);
            }
            C43001GuD.LIZJ(str4, LIZ);
            FMX.LJIIL("open_navigation", LIZ);
        }
        ArrayList arrayList = new ArrayList();
        C51556KLg.LIZ.getClass();
        if (C51556KLg.LIZ().LIZLLL(context) && (v3 = locationDetailInfoAssem.v3()) != null) {
            C252659vp c252659vp = new C252659vp();
            c252659vp.LIZ = C29822Bn8.LIZ(context, R.string.p01, "context.resources.getStr…ilinfovertwo_popup_cta_a)");
            c252659vp.LIZJ(R.raw.icon_arrow_up_right_ltr);
            c252659vp.LIZJ = 0;
            c252659vp.LJ = new ACListenerS21S0100000_1(new AqS107S0300000_3(context, v3, locationDetailInfoAssem, 32), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            arrayList.add(c252659vp);
        }
        C252659vp c252659vp2 = new C252659vp();
        c252659vp2.LIZ = C29822Bn8.LIZ(context, R.string.ozf, "context.resources.getStr…ring.poi_detail_map_copy)");
        c252659vp2.LIZJ(R.raw.icon_doc_on_doc);
        c252659vp2.LIZJ = 0;
        c252659vp2.LJ = new ACListenerS21S0100000_1(new AqS134S0200000_3(locationDetailInfoAssem, context, 270), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        arrayList.add(c252659vp2);
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(locationDetailInfoAssem);
        if (LIZ2 == null || (supportFragmentManager = LIZ2.getSupportFragmentManager()) == null) {
            return;
        }
        C245319jz c245319jz = new C245319jz();
        c245319jz.LIZ.LJLLILLLL = C29822Bn8.LIZ(context, R.string.ozh, "context.resources.getStr…ing.poi_detail_map_title)");
        c245319jz.LJ(arrayList);
        c245319jz.LIZJ().show(supportFragmentManager, "map");
    }

    public static final void LIZ$18(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        ActivityC45651qj LJIIIIZZ;
        String str;
        BaseFeedPageParams baseFeedPageParams;
        M89 m89;
        if (view != null && (LJIIIIZZ = C55096Ljo.LJIIIIZZ((StoryImmersiveQuitComponent) iDaS483S0100000_3.l0)) != null) {
            LJIIIIZZ.finish();
            C222588oQ c222588oQ = ((StoryImmersiveQuitComponent) iDaS483S0100000_3.l0).a1().LIZLLL;
            if (c222588oQ != null && (baseFeedPageParams = c222588oQ.LJ) != null && (m89 = baseFeedPageParams.param) != null) {
                str = m89.getFrom();
            } else {
                str = null;
            }
            if (o.LJ("STORY_ENTRANCE_GUIDE_CARD", str)) {
                C201037ul.LIZ(1, LJIIIIZZ, false);
            }
        }
    }

    public static final void LIZ$19(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        DataCenter dataCenter;
        if (view != null && (dataCenter = ((VideoItemParams) C51029K0z.LJIILLIIL((StoryShareComponent) iDaS483S0100000_3.l0)).dataCenter) != null) {
            dataCenter.jv0(null, "video_share_click");
        }
    }

    public static final void LIZ$2(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        C73411SrX c73411SrX;
        if (view != null) {
            M8L.LIZ("click change/save collection name save button");
            EditText editText = ((InputNameSheetFragment) iDaS483S0100000_3.l0).LJLILLLLZI;
            if (editText != null) {
                String collectionName = editText.getEditableText().toString();
                InputNameSheetFragment inputNameSheetFragment = (InputNameSheetFragment) iDaS483S0100000_3.l0;
                AqS57S1100000_3 aqS57S1100000_3 = new AqS57S1100000_3(inputNameSheetFragment, collectionName, 8);
                SY4 sy4 = inputNameSheetFragment.LJLJJL;
                if (sy4 != null) {
                    sy4.setEnabled(false);
                    ImageView imageView = inputNameSheetFragment.LJLJI;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                        TextView textView = inputNameSheetFragment.LJLJJI;
                        if (textView != null) {
                            textView.setVisibility(4);
                            C116414hZ c116414hZ = inputNameSheetFragment.LJLIL;
                            if (c116414hZ != null) {
                                c116414hZ.setVisibility(0);
                                C73411SrX c73411SrX2 = inputNameSheetFragment.LJLJJLL;
                                if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = inputNameSheetFragment.LJLJJLL) != null) {
                                    c73411SrX.dispose();
                                }
                                C193277iF c193277iF = new C192487gy().LIZJ;
                                c193277iF.getClass();
                                o.LJIIIZ(collectionName, "collectionName");
                                inputNameSheetFragment.LJLJJLL = (C73411SrX) c193277iF.LJLIL.LIZ.collectionNameCheck(1, collectionName).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iC
                                    @Override // X.InterfaceC64592gB
                                    public final void accept(Object obj) {
                                        ((AbstractC36908Ee8) obj).checkValid();
                                    }
                                }).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iE
                                    @Override // X.InterfaceC64592gB
                                    public final void accept(Object obj) {
                                        M8L.LIZJ("/tiktok/collection/item_archive/check/v1", "net", (BaseResponse) obj);
                                    }
                                }).LJIJJ(new InterfaceC64592gB() { // from class: X.7iD
                                    @Override // X.InterfaceC64592gB
                                    public final void accept(Object obj) {
                                        M8L.LIZIZ("/tiktok/collection/item_archive/check/v1", (Throwable) obj);
                                    }
                                }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new AfS55S0100000_3(inputNameSheetFragment, 21)).LJJJLIIL(new AfS53S0100000_1(aqS57S1100000_3, 24), new AfS55S0100000_3(inputNameSheetFragment, 22));
                                return;
                            }
                            o.LJIJI("loading");
                            throw null;
                        }
                        o.LJIJI("tvEditHint");
                        throw null;
                    }
                    o.LJIJI("ivClearAll");
                    throw null;
                }
                o.LJIJI("submit");
                throw null;
            }
            o.LJIJI("etInput");
            throw null;
        }
    }

    public static final void LIZ$20(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        DataCenter dataCenter;
        if (view != null && (dataCenter = ((VideoItemParams) C51029K0z.LJIILLIIL((StoryUserAvatarComponent) iDaS483S0100000_3.l0)).dataCenter) != null) {
            dataCenter.jv0(null, "to_profile");
        }
    }

    public static final void LIZ$21(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            StoryViewerEntranceComponent storyViewerEntranceComponent = (StoryViewerEntranceComponent) iDaS483S0100000_3.l0;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "v.context");
            storyViewerEntranceComponent.dd0(context, "click_bottom_bar");
        }
    }

    public static final void LIZ$22(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        Fragment LIZLLL;
        FragmentManager fragmentManager;
        C84G c84g = ((TopicRatingBarAssem) iDaS483S0100000_3.l0).LJLL;
        if (c84g != null) {
            float ratingValue = c84g.getRatingValue();
            if (ratingValue == 0.0f || (LIZLLL = C212428Vi.LIZLLL((TopicRatingBarAssem) iDaS483S0100000_3.l0)) == null || (fragmentManager = LIZLLL.getFragmentManager()) == null) {
                return;
            }
            ((TopicReviewVM) ((TopicRatingBarAssem) iDaS483S0100000_3.l0).LJLJLLL.getValue()).LJLJI.put("enter_method", "click_topic_rate");
            C7UO.LIZ(fragmentManager, Integer.valueOf(O6R.LJJIIZ(ratingValue)), null, false, new AqS153S0100000_3((TopicRatingBarAssem) iDaS483S0100000_3.l0, 1110), 12);
            return;
        }
        o.LJIJI("ratingBar");
        throw null;
    }

    public static final void LIZ$23(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            OZ1 oz1 = OZ1.LIZIZ;
            Context context = ((TuxIconView) iDaS483S0100000_3.l0).getContext();
            o.LJIIIIZZ(context, "context");
            oz1.LIZIZ(context, -1, false);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "homepage_friends");
            c188727au.LJIIIZ("action_type", "click");
            FMX.LJIIL("qr_code_scan_enter", C44847Hit.LIZIZ("scan_icon", c188727au.LIZ, "enter_from", "homepage_friends").LIZ);
        }
    }

    public static final void LIZ$24(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        AbstractC220518l5 LJIIIZ;
        if (view != null) {
            C220488l2 c220488l2 = C220488l2.LIZIZ;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            AddYoursTopic addYoursTopic = ((C219368jE) C51029K0z.LJIILLIIL((AddYoursCollectionCellAssem) iDaS483S0100000_3.l0)).LJLILLLLZI;
            Aweme aweme = ((C219368jE) C51029K0z.LJIILLIIL((AddYoursCollectionCellAssem) iDaS483S0100000_3.l0)).LJLJJLL;
            List<AddYoursAvatar> list = ((C219368jE) C51029K0z.LJIILLIIL((AddYoursCollectionCellAssem) iDaS483S0100000_3.l0)).LJLJL;
            Aweme aweme2 = ((C219368jE) C51029K0z.LJIILLIIL((AddYoursCollectionCellAssem) iDaS483S0100000_3.l0)).LJLJJLL;
            boolean z = false;
            if (aweme2 != null && (LJIIIZ = C78598Ut0.LJIIIZ(aweme2)) != null && LJIIIZ.LIZIZ != 1) {
                z = true;
            }
            C219648jg.LIZ(c220488l2, context, addYoursTopic, aweme, null, list, z, "personal_homepage", "favourite", 2, null, 520);
        }
    }

    public static final void LIZ$25(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        Context context;
        ActivityC45651qj LJJIFFI;
        AbstractC220518l5 abstractC220518l5;
        if (view == null || (context = ((AddYoursCollectionCellAssem) iDaS483S0100000_3.l0).getContext()) == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return;
        }
        AssemViewModel value = ((AddYoursCollectionCellAssem) iDaS483S0100000_3.l0).LLIFFJFJJ.getValue();
        C219368jE collectionItem = (C219368jE) C51029K0z.LJIILLIIL((AddYoursCollectionCellAssem) iDaS483S0100000_3.l0);
        AqS166S0200000_3 aqS166S0200000_3 = new AqS166S0200000_3((AddYoursCollectionCellAssem) iDaS483S0100000_3.l0, LJJIFFI, 19);
        o.LJIIIZ(collectionItem, "collectionItem");
        Aweme aweme = collectionItem.LJLJJLL;
        if (aweme != null) {
            abstractC220518l5 = C78598Ut0.LJIIIZ(aweme);
        } else {
            abstractC220518l5 = null;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(value), null, null, new C219658jh(abstractC220518l5, collectionItem, aqS166S0200000_3, null), 3);
    }

    public static final void LIZ$26(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        ActivityC45651qj LJ;
        AbstractC220518l5 abstractC220518l5;
        if (view == null || (LJ = C1DG.LJ(view, "it.context")) == null) {
            return;
        }
        AddYoursHubItemCellAssem addYoursHubItemCellAssem = (AddYoursHubItemCellAssem) iDaS483S0100000_3.l0;
        ViewModel viewModel = (ViewModel) addYoursHubItemCellAssem.LLFZ.LIZ(addYoursHubItemCellAssem, AddYoursHubItemCellAssem.LLIIII[0]);
        AddYoursTopic addYoursTopic = ((C219618jd) C51029K0z.LJIILLIIL((AddYoursHubItemCellAssem) iDaS483S0100000_3.l0)).LJLILLLLZI;
        AqS166S0200000_3 aqS166S0200000_3 = new AqS166S0200000_3(LJ, (AddYoursHubItemCellAssem) iDaS483S0100000_3.l0, 20);
        viewModel.getClass();
        o.LJIIIZ(addYoursTopic, "addYoursTopic");
        Aweme video = addYoursTopic.getVideo();
        if (video != null) {
            abstractC220518l5 = C78598Ut0.LJIIIZ(video);
        } else {
            abstractC220518l5 = null;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(viewModel), null, null, new C219668ji(abstractC220518l5, addYoursTopic, aqS166S0200000_3, null), 3);
    }

    public static final void LIZ$27(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        Fragment LJIIIZ;
        if (view != null && (LJIIIZ = C55096Ljo.LJIIIZ((AddYoursDetailScaffoldAssem) iDaS483S0100000_3.l0)) != null) {
            ASQ.LJ(LJIIIZ, ASY.LIZ);
        }
    }

    public static final void LIZ$28(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            AddYoursInviteFriendsAssem addYoursInviteFriendsAssem = (AddYoursInviteFriendsAssem) iDaS483S0100000_3.l0;
            ((SY4) addYoursInviteFriendsAssem._$_findCachedViewById(R.id.awu)).setLoading(true);
            addYoursInviteFriendsAssem.withState((AssemViewModel) addYoursInviteFriendsAssem.LJLJI.getValue(), new AqS169S0100000_3(addYoursInviteFriendsAssem, 980));
        }
    }

    public static final void LIZ$29(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            ((PadAdaptionFragment) iDaS483S0100000_3.l0).dismissAllowingStateLoss();
        }
    }

    public static final void LIZ$3(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            M8L.LIZ("click add video to collection button");
            ((InterfaceC191657fd) ((AddVideoAssem) iDaS483S0100000_3.l0).LJLILLLLZI.getValue()).I0();
        }
    }

    public static final void LIZ$30(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            ((InterfaceC192787hS) ((CollectionListMainUIAssem) iDaS483S0100000_3.l0).LJLILLLLZI.getValue()).LLZLLLL();
        }
    }

    public static final void LIZ$31(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        C219568jY c219568jY;
        Aweme aweme;
        MH9 mh9;
        if (view != null && (aweme = (c219568jY = (C219568jY) iDaS483S0100000_3.l0).LJLIL) != null && (mh9 = c219568jY.LJLJLJ) != null) {
            mh9.LLLILZ(c219568jY.itemView, aweme, "click_invite");
        }
    }

    public static final void LIZ$32(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        C219568jY c219568jY;
        Aweme aweme;
        MH9 mh9;
        if (view != null && (aweme = (c219568jY = (C219568jY) iDaS483S0100000_3.l0).LJLIL) != null && (mh9 = c219568jY.LJLJLJ) != null) {
            mh9.LLLILZ(c219568jY.itemView, aweme, "click_invite");
        }
    }

    public static final void LIZ$33(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            AddYoursHubItemCellAssem.m4((AddYoursHubItemCellAssem) iDaS483S0100000_3.l0);
        }
    }

    public static final void LIZ$34(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            AddYoursHubItemCellAssem.m4((AddYoursHubItemCellAssem) iDaS483S0100000_3.l0);
        }
    }

    public static final void LIZ$35(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        Long topicId;
        if (view != null && (topicId = ((C219618jd) C51029K0z.LJIILLIIL((AddYoursHubItemCellAssem) iDaS483S0100000_3.l0)).LJLILLLLZI.getTopicId()) != null) {
            long longValue = topicId.longValue();
            C219208iy c219208iy = C219208iy.LIZIZ;
            c219208iy.LIZJ(view.getContext(), c219208iy.LIZIZ(), new AqS28S0100100_3(longValue, (AddYoursHubItemCellAssem) iDaS483S0100000_3.l0, 4));
        }
    }

    public static final void LIZ$36(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            ((C8S2) iDaS483S0100000_3.l0).LIZJ.invoke();
            C8S2 c8s2 = (C8S2) iDaS483S0100000_3.l0;
            XKQ xkq = c8s2.LJFF;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            c8s2.LJFF = null;
            c8s2.LIZ();
        }
    }

    public static final void LIZ$37(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            C8S2 c8s2 = (C8S2) iDaS483S0100000_3.l0;
            XKQ xkq = c8s2.LJFF;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            c8s2.LJFF = null;
            c8s2.LIZ();
        }
    }

    public static final void LIZ$38(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            PoiLocationDetailFragment poiLocationDetailFragment = (PoiLocationDetailFragment) iDaS483S0100000_3.l0;
            poiLocationDetailFragment.getClass();
            ArrayList arrayList = new ArrayList();
            C252669vq c252669vq = new C252669vq();
            String string = poiLocationDetailFragment.getResources().getString(R.string.ozp);
            o.LJIIIIZZ(string, "resources.getString(R.st…ng.poi_map_legal_notices)");
            c252669vq.LIZ = string;
            c252669vq.LIZJ = 0;
            c252669vq.LJ = new ACListenerS23S0100000_3(poiLocationDetailFragment, 286);
            arrayList.add(c252669vq);
            FragmentManager fragmentManager = poiLocationDetailFragment.getFragmentManager();
            if (fragmentManager != null) {
                C245319jz c245319jz = new C245319jz();
                c245319jz.LIZLLL(R.string.cg_);
                c245319jz.LJFF(arrayList);
                c245319jz.LIZJ().show(fragmentManager, "private_settings");
            }
        }
    }

    public static final void LIZ$39(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            ((AddYoursDetailScaffoldAssem) iDaS483S0100000_3.l0).C3(true);
        }
    }

    public static final void LIZ$4(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            ((ActivityC45651qj) iDaS483S0100000_3.l0).finish();
        }
    }

    public static final void LIZ$40(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            ((AddYoursDetailScaffoldAssem) iDaS483S0100000_3.l0).C3(false);
        }
    }

    public static final void LIZ$41(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        ActivityC45651qj LJIIIIZZ;
        if (view == null || (LJIIIIZZ = C55096Ljo.LJIIIIZZ((AddYoursDetailScaffoldAssem) iDaS483S0100000_3.l0)) == null) {
            return;
        }
        C61996OUu c61996OUu = (C61996OUu) ((AddYoursDetailScaffoldAssem) iDaS483S0100000_3.l0).LJLJI.getValue();
        if (c61996OUu != null) {
            c61996OUu.LIZ(0);
        }
        C78253UnR.LIZIZ(LJIIIIZZ, new AqS153S0100000_3((AddYoursDetailScaffoldAssem) iDaS483S0100000_3.l0, 1709));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, java.util.ArrayList] */
    public static final void LIZ$42(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        MixCreateViewModel vl;
        FragmentManager supportFragmentManager;
        if (view != null && ((AddMultiVideoFragment) iDaS483S0100000_3.l0)._$_findCachedViewById(R.id.h0u).isEnabled() && !((SY4) ((AddMultiVideoFragment) iDaS483S0100000_3.l0)._$_findCachedViewById(R.id.h0u)).LLI) {
            ((SY4) ((AddMultiVideoFragment) iDaS483S0100000_3.l0)._$_findCachedViewById(R.id.h0u)).setLoading(true);
            if (((AddMultiVideoFragment) iDaS483S0100000_3.l0).mo49getActivity() instanceof MixFeedManagerActivity) {
                MixVideosManageViewModel wl = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).wl();
                AddMultiVideoFragment addMultiVideoFragment = (AddMultiVideoFragment) iDaS483S0100000_3.l0;
                addMultiVideoFragment.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) ((SYL) addMultiVideoFragment._$_findCachedViewById(R.id.igw)).getState().LJII()).iterator();
                while (it.hasNext()) {
                    InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) it.next();
                    Iterator it2 = ((ArrayList) addMultiVideoFragment.xl().LJLJI).iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (interfaceC57784Mm4 instanceof C228648yC) {
                            C228648yC c228648yC = (C228648yC) interfaceC57784Mm4;
                            if (o.LJ(c228648yC.LJLJJL, next) && !c228648yC.LJLJJLL) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
                List<Aweme> totalSelectedVideos = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).xl().LJLJI;
                wl.getClass();
                o.LJIIIZ(totalSelectedVideos, "totalSelectedVideos");
                List<Aweme> list = wl.getVmDispatcher().getState().LJLIL;
                C68322mC c68322mC = new C68322mC();
                ?? arrayList2 = new ArrayList();
                c68322mC.element = arrayList2;
                if (list != null) {
                    UC0.LIZLLL(arrayList2, ORZ.LLJI(list));
                    if (C00F.LIZ(31744, 0, "playlist_reverse_order", true) == 1) {
                        if (!wl.LJLJJL) {
                            ((ArrayList) c68322mC.element).addAll(arrayList);
                        }
                    } else {
                        ((ArrayList) c68322mC.element).addAll(0, arrayList);
                    }
                }
                wl.setState(new AqS134S0200000_3(totalSelectedVideos, c68322mC, 292));
                wl.setState(new AqS134S0200000_3(wl, (MixVideosManageViewModel) arrayList, (List<? extends Aweme>) 293));
            }
            MixCreateViewModel vl2 = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).vl();
            List date = ORZ.LLILII(new IDComparatorS29S0000000_1(29), ((AddMultiVideoFragment) iDaS483S0100000_3.l0).xl().LJLJI);
            vl2.getClass();
            o.LJIIIZ(date, "date");
            vl2.setState(new AqS167S0100000_1(date, (List<VoucherInfoNew>) 415));
            if (((AddMultiVideoFragment) iDaS483S0100000_3.l0).mo49getActivity() instanceof MixFeedManagerActivity) {
                ActivityC45651qj mo49getActivity = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).mo49getActivity();
                if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
                    MixVideosManageViewModel wl2 = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).wl();
                    wl2.getClass();
                    wl2.setState(new AqS8S0010000_3(true, 59));
                    supportFragmentManager.LJJLIIIJJI();
                }
                String str = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).wl().LJLILLLLZI;
                String str2 = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).wl().LJLIL;
                Integer value = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).xl().LJLJLJ.getValue();
                if (value == null) {
                    value = 0;
                }
                o.LJIIIIZZ(value, "viewModel.manageSelected…                     ?: 0");
                int intValue = value.intValue();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str2);
                c188727au.LJIIIZ("enter_method", "manage_video");
                c188727au.LIZLLL(intValue, "add_cnt");
                c188727au.LJIIIZ("playlist_id", str);
                FMX.LJIIL("add_multiple_playlist_video", c188727au.LIZ);
                Resources resources = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).getResources();
                Integer value2 = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).xl().LJLJLJ.getValue();
                if (value2 == null) {
                    value2 = 0;
                }
                o.LJIIIIZZ(value2, "viewModel.manageSelected…                     ?: 0");
                String quantityString = resources.getQuantityString(R.plurals.b5, value2.intValue(), ((AddMultiVideoFragment) iDaS483S0100000_3.l0).xl().LJLJLJ.getValue());
                o.LJIIIIZZ(quantityString, "resources.getQuantityStr….manageSelectedNum.value)");
                C26045AKb c26045AKb = new C26045AKb((AddMultiVideoFragment) iDaS483S0100000_3.l0);
                c26045AKb.LJIIIZ(quantityString);
                c26045AKb.LJIIJ();
                return;
            }
            if (!((AddMultiVideoFragment) iDaS483S0100000_3.l0).vl().getVmDispatcher().getState().LJLLI && ((vl = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).vl()) == null || !vl.LJLJJL)) {
                return;
            }
            MixCreateViewModel vl3 = ((AddMultiVideoFragment) iDaS483S0100000_3.l0).vl();
            vl3.getClass();
            vl3.withState(new AqS169S0100000_3(vl3, 874));
        }
    }

    public static final void LIZ$5(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            M8L.LIZ("click manage button");
            VideoCollectionContentViewModel v3 = ((CollectionContentManageAssem) iDaS483S0100000_3.l0).v3();
            v3.getClass();
            v3.setState(new AqS8S0010000_3(true, 42));
        }
    }

    public static final void LIZ$6(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            VideoCollectionContentViewModel v3 = ((CollectionContentManageAssem) iDaS483S0100000_3.l0).v3();
            v3.getClass();
            v3.setState(new AqS8S0010000_3(false, 42));
        }
    }

    public static final void LIZ$7(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            ((InterfaceC192297gf) ((CollectionContentManageAssem) iDaS483S0100000_3.l0).LJLJJI.getValue()).A2();
        }
    }

    public static final void LIZ$8(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            ((InterfaceC192297gf) ((CollectionContentManageAssem) iDaS483S0100000_3.l0).LJLJJI.getValue()).Ae();
        }
    }

    public static final void LIZ$9(IDaS483S0100000_3 iDaS483S0100000_3, View view) {
        if (view != null) {
            ((InterfaceC192787hS) ((CollectionListStateAssem) iDaS483S0100000_3.l0).LJLJI.getValue()).LLZLLLL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS483S0100000_3(Object obj, int i, int i2) {
        super(500L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS483S0100000_3(Object obj, int i, int i2, int i3) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
