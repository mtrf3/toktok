package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.category.CardItemCell;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xd2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85252Xd2 extends C222898ov {
    public final /* synthetic */ CardItemCell LJLIL;

    public C85252Xd2(CardItemCell cardItemCell) {
        this.LJLIL = cardItemCell;
    }

    @Override // X.C222898ov, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        String str2;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Boolean bool;
        String str10;
        String str11;
        String str12;
        String str13;
        Boolean bool2;
        String str14;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        Boolean bool3;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility2;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("videoPlay - onPlayCompleted, item: ");
        PoiDiscoveryApi.PoiDiscoveryCard item = this.LJLIL.getItem();
        String str15 = null;
        if (item != null) {
            str2 = item.LJLILLLLZI;
        } else {
            str2 = null;
        }
        LIZ.append(CardItemCell.L(this.LJLIL.getBindingAdapterPosition(), str2));
        C188447aS.LIZ(X1D.LIZIZ(LIZ));
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        Fragment fragment = this.LJLIL.LJLJLLL;
        if (fragment != null && (iPoiDetailInfoVAbility3 = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), IPoiDetailInfoVAbility.class, null)) != null) {
            poiDetailResponse = iPoiDetailInfoVAbility3.EO();
        } else {
            poiDetailResponse = null;
        }
        Fragment fragment2 = this.LJLIL.LJLJLLL;
        if (fragment2 != null && (iPoiDetailInfoVAbility2 = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment2, null), IPoiDetailInfoVAbility.class, null)) != null) {
            str3 = iPoiDetailInfoVAbility2.vu0();
        } else {
            str3 = null;
        }
        String str16 = "";
        if (str3 == null) {
            str3 = "";
        }
        PoiDiscoveryApi.PoiDiscoveryCard item2 = this.LJLIL.getItem();
        if (item2 != null) {
            str4 = item2.poiDistanceForShow;
        } else {
            str4 = null;
        }
        boolean z2 = false;
        if (str4 != null) {
            z = true;
        } else {
            z = false;
        }
        String LJJ = C43001GuD.LJJ(Boolean.valueOf(z));
        if (LJJ == null) {
            LJJ = "";
        }
        PoiDiscoveryApi.PoiDiscoveryCard item3 = this.LJLIL.getItem();
        if (item3 == null || (str5 = item3.LJLILLLLZI) == null) {
            str5 = "";
        }
        PoiDiscoveryApi.PoiDiscoveryCard item4 = this.LJLIL.getItem();
        if (item4 == null || (str6 = item4.poiId) == null) {
            str6 = "";
        }
        PoiDiscoveryApi.PoiDiscoveryCard item5 = this.LJLIL.getItem();
        if (item5 == null || (str7 = item5.cityCode) == null) {
            str7 = "";
        }
        C189987cw c189987cw = EnumC189997cx.Companion;
        PoiDiscoveryApi.PoiDiscoveryCard item6 = this.LJLIL.getItem();
        if (item6 != null) {
            str8 = item6.typeLevel;
        } else {
            str8 = null;
        }
        PoiDiscoveryApi.PoiDiscoveryCard item7 = this.LJLIL.getItem();
        if (item7 != null && (bool3 = item7.isClaimed) != null) {
            z2 = bool3.booleanValue();
        }
        c189987cw.getClass();
        String poiDetailType = C189987cw.LIZ(str8, z2).getTypeName();
        PoiDiscoveryApi.PoiDiscoveryCard item8 = this.LJLIL.getItem();
        if (item8 == null || (str9 = item8.regionCode) == null) {
            str9 = "";
        }
        PoiDiscoveryApi.PoiDiscoveryCard item9 = this.LJLIL.getItem();
        if (item9 != null) {
            bool = item9.isClaimed;
        } else {
            bool = null;
        }
        String LJJ2 = C43001GuD.LJJ(bool);
        if (LJJ2 == null) {
            LJJ2 = "";
        }
        PoiDiscoveryApi.PoiDiscoveryCard item10 = this.LJLIL.getItem();
        if (item10 != null) {
            str15 = item10.collectInfo;
        }
        String LJJ3 = C43001GuD.LJJ(Boolean.valueOf(LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION")));
        if (LJJ3 == null) {
            LJJ3 = "";
        }
        Context context = this.LJLIL.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        String LJJ4 = C43001GuD.LJJ(Boolean.valueOf(iLocationBaseServiceForMT.isSystemPrecise(context)));
        if (LJJ4 == null) {
            LJJ4 = "";
        }
        String LJJ5 = C43001GuD.LJJ(Boolean.valueOf(iLocationBaseServiceForMT.isInAppPrecise()));
        if (LJJ5 == null) {
            LJJ5 = "";
        }
        Fragment fragment3 = this.LJLIL.LJLJLLL;
        if (fragment3 == null || (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment3, null), IPoiDetailInfoVAbility.class, null)) == null || (str10 = iPoiDetailInfoVAbility.G20()) == null) {
            str10 = "";
        }
        if (poiDetailResponse == null || (str11 = poiDetailResponse.cityCode) == null) {
            str11 = "";
        }
        if (poiDetailResponse == null || (str12 = poiDetailResponse.LJIIJJI()) == null) {
            str12 = "";
        }
        if (poiDetailResponse == null || (str13 = poiDetailResponse.regionCode) == null) {
            str13 = "";
        }
        if (poiDetailResponse != null) {
            bool2 = Boolean.valueOf(poiDetailResponse.LJIIIIZZ());
        } else {
            bool2 = null;
        }
        String LJJ6 = C43001GuD.LJJ(bool2);
        if (LJJ6 != null) {
            str16 = LJJ6;
        }
        if (poiDetailResponse != null) {
            str14 = poiDetailResponse.collectInfo;
        } else {
            str14 = null;
        }
        o.LJIIIZ(poiDetailType, "poiDetailType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "poi_detail");
        linkedHashMap.put("enter_method", "card_list");
        linkedHashMap.put("previous_page", str3);
        linkedHashMap.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("is_display_distance", LJJ);
        linkedHashMap.put("tab_code", str5);
        linkedHashMap.put("enable_location", LJJ3);
        linkedHashMap.put("system_is_precise", LJJ4);
        linkedHashMap.put("inapp_is_precise", LJJ5);
        linkedHashMap.put("poi_id", str6);
        linkedHashMap.put("poi_city", str7);
        linkedHashMap.put("poi_detail_type", poiDetailType);
        linkedHashMap.put("poi_region_code", str9);
        linkedHashMap.put("is_claimed", LJJ2);
        C43001GuD.LIZJ(str15, linkedHashMap);
        linkedHashMap.put("page_poi_id", str10);
        linkedHashMap.put("page_poi_city", str11);
        linkedHashMap.put("page_poi_detail_type", str12);
        linkedHashMap.put("page_poi_region_code", str13);
        linkedHashMap.put("page_is_claimed", str16);
        C43001GuD.LIZLLL(str14, linkedHashMap);
        FMX.LJIIL("video_play_finish", linkedHashMap);
        this.LJLIL.N();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        this.LJLIL.P();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        boolean z;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility2;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility3;
        String str6;
        C85254Xd4 c85254Xd4;
        PoiDiscoveryApi.PoiDiscoveryCard item = this.LJLIL.getItem();
        if (item == null) {
            return;
        }
        C85254Xd4 c85254Xd42 = item.LJLJJI;
        boolean z2 = true;
        if (c85254Xd42 != null) {
            c85254Xd42.LIZ = true;
        }
        CardItemCell cardItemCell = this.LJLIL;
        PoiDiscoveryApi.PoiDiscoveryCard item2 = cardItemCell.getItem();
        boolean z3 = false;
        if (item2 != null && (c85254Xd4 = item2.LJLJJI) != null && c85254Xd4.LIZ) {
            z = true;
        } else {
            z = false;
        }
        String str7 = null;
        if (z) {
            C62846OlW c62846OlW = cardItemCell.LJLJI;
            if (c62846OlW != null) {
                if (c62846OlW.getVisibility() == 0) {
                    cardItemCell.getItem();
                    JON jon = cardItemCell.LJLJJI;
                    if (jon != null) {
                        jon.setVisibility(0);
                        C62846OlW c62846OlW2 = cardItemCell.LJLJI;
                        if (c62846OlW2 != null) {
                            c62846OlW2.setVisibility(4);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("hideCover,");
                            PoiDiscoveryApi.PoiDiscoveryCard item3 = cardItemCell.getItem();
                            if (item3 != null) {
                                str6 = item3.poiId;
                            } else {
                                str6 = null;
                            }
                            LIZ.append(str6);
                            C188447aS.LIZ(X1D.LIZIZ(LIZ));
                        } else {
                            o.LJIJI("ivCover");
                            throw null;
                        }
                    } else {
                        o.LJIJI("soundIcon");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("ivCover");
                throw null;
            }
        }
        C85254Xd4 c85254Xd43 = item.LJLJJI;
        if (c85254Xd43 != null) {
            c85254Xd43.LIZIZ = Long.valueOf(System.currentTimeMillis());
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        Fragment fragment = this.LJLIL.LJLJLLL;
        if (fragment != null && (iPoiDetailInfoVAbility3 = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), IPoiDetailInfoVAbility.class, null)) != null) {
            poiDetailResponse = iPoiDetailInfoVAbility3.EO();
        } else {
            poiDetailResponse = null;
        }
        Fragment fragment2 = this.LJLIL.LJLJLLL;
        if (fragment2 != null && (iPoiDetailInfoVAbility2 = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment2, null), IPoiDetailInfoVAbility.class, null)) != null) {
            str7 = iPoiDetailInfoVAbility2.vu0();
        }
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        if (item.poiDistanceForShow == null) {
            z2 = false;
        }
        String LJJ = C43001GuD.LJJ(Boolean.valueOf(z2));
        if (LJJ == null) {
            LJJ = "";
        }
        String str9 = item.LJLILLLLZI;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = item.poiId;
        if (str10 == null) {
            str10 = "";
        }
        String str11 = item.cityCode;
        if (str11 == null) {
            str11 = "";
        }
        C189987cw c189987cw = EnumC189997cx.Companion;
        String str12 = item.typeLevel;
        Boolean bool2 = item.isClaimed;
        if (bool2 != null) {
            z3 = bool2.booleanValue();
        }
        c189987cw.getClass();
        String poiDetailType = C189987cw.LIZ(str12, z3).getTypeName();
        String str13 = item.regionCode;
        if (str13 == null) {
            str13 = "";
        }
        String LJJ2 = C43001GuD.LJJ(item.isClaimed);
        if (LJJ2 == null) {
            LJJ2 = "";
        }
        String str14 = item.collectInfo;
        String LJJ3 = C43001GuD.LJJ(Boolean.valueOf(LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION")));
        if (LJJ3 == null) {
            LJJ3 = "";
        }
        Context context = this.LJLIL.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        String LJJ4 = C43001GuD.LJJ(Boolean.valueOf(iLocationBaseServiceForMT.isSystemPrecise(context)));
        if (LJJ4 == null) {
            LJJ4 = "";
        }
        String LJJ5 = C43001GuD.LJJ(Boolean.valueOf(iLocationBaseServiceForMT.isInAppPrecise()));
        if (LJJ5 == null) {
            LJJ5 = "";
        }
        Fragment fragment3 = this.LJLIL.LJLJLLL;
        if (fragment3 == null || (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment3, null), IPoiDetailInfoVAbility.class, null)) == null || (str = iPoiDetailInfoVAbility.G20()) == null) {
            str = "";
        }
        if (poiDetailResponse == null || (str2 = poiDetailResponse.cityCode) == null) {
            str2 = "";
        }
        if (poiDetailResponse == null || (str3 = poiDetailResponse.LJIIJJI()) == null) {
            str3 = "";
        }
        if (poiDetailResponse == null || (str4 = poiDetailResponse.regionCode) == null) {
            str4 = "";
        }
        if (poiDetailResponse != null) {
            bool = Boolean.valueOf(poiDetailResponse.LJIIIIZZ());
        } else {
            bool = null;
        }
        String LJJ6 = C43001GuD.LJJ(bool);
        if (LJJ6 != null) {
            str8 = LJJ6;
        }
        if (poiDetailResponse != null) {
            str5 = poiDetailResponse.collectInfo;
        } else {
            str5 = null;
        }
        o.LJIIIZ(poiDetailType, "poiDetailType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "poi_detail");
        linkedHashMap.put("enter_method", "card_list");
        linkedHashMap.put("previous_page", str7);
        linkedHashMap.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("is_display_distance", LJJ);
        linkedHashMap.put("tab_code", str9);
        linkedHashMap.put("enable_location", LJJ3);
        linkedHashMap.put("system_is_precise", LJJ4);
        linkedHashMap.put("inapp_is_precise", LJJ5);
        linkedHashMap.put("poi_id", str10);
        linkedHashMap.put("poi_city", str11);
        linkedHashMap.put("poi_detail_type", poiDetailType);
        linkedHashMap.put("poi_region_code", str13);
        linkedHashMap.put("is_claimed", LJJ2);
        C43001GuD.LIZJ(str14, linkedHashMap);
        linkedHashMap.put("page_poi_id", str);
        linkedHashMap.put("page_poi_city", str2);
        linkedHashMap.put("page_poi_detail_type", str3);
        linkedHashMap.put("page_poi_region_code", str4);
        linkedHashMap.put("page_is_claimed", str8);
        C43001GuD.LIZLLL(str5, linkedHashMap);
        FMX.LJIIL("video_play", linkedHashMap);
    }
}
