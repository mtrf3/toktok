package q03;

import X.C225248si;
import X.C45243HpH;
import X.C65352Pkq;
import X.C79536VJk;
import X.C85192Xc4;
import X.C85242Xcs;
import X.C85278XdS;
import X.C85316Xe4;
import X.C85317Xe5;
import X.C8CH;
import X.C98T;
import X.EnumC85314Xe2;
import X.InterfaceC85240Xcq;
import X.XMW;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiDetails;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.experiment.PoiSearchConfig;
import com.ss.android.ugc.aweme.poi.search.PoiSearchCell;
import com.ss.android.ugc.aweme.poi.search.PoiSearchCellV1;
import com.ss.android.ugc.aweme.poi.search.PoiSearchCellV2;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.relation.friendlist.cell.StretchCell;
import com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class IDaS205S0200000_15 extends C98T {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$0(IDaS205S0200000_15 iDaS205S0200000_15, View view) {
        PoiMobParam poiMobParam;
        PoiData poiData;
        String str;
        C85317Xe5 c85317Xe5;
        String str2;
        C85317Xe5 c85317Xe52;
        PoiData poiData2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        String str9;
        String str10;
        String str11;
        Long l;
        Integer num;
        Boolean bool;
        String str12;
        C85317Xe5 c85317Xe53;
        C85317Xe5 c85317Xe54;
        C85317Xe5 c85317Xe55;
        String str13;
        C85317Xe5 c85317Xe56;
        C85317Xe5 c85317Xe57;
        String str14;
        if (view != null) {
            C85316Xe4 item = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
            String str15 = "default_search_poi";
            PoiData poiData3 = null;
            r2 = null;
            String str16 = null;
            PoiMobParam poiMobParam2 = null;
            poiData3 = null;
            if (item != null && (poiData2 = item.LJLIL) != null) {
                PoiDetails poiDetails = poiData2.getPoiDetails();
                if (poiDetails != null) {
                    str3 = poiDetails.getCityCode();
                } else {
                    str3 = null;
                }
                PoiDetails poiDetails2 = poiData2.getPoiDetails();
                if (poiDetails2 != null) {
                    str4 = poiDetails2.getCountryCode();
                } else {
                    str4 = null;
                }
                PoiMobParam poiMobParam3 = ((PoiSearchCell) iDaS205S0200000_15.l0).M().LJLLILLLL;
                String str17 = "";
                if (poiMobParam3 == null || (str5 = poiMobParam3.getEnterFrom()) == null) {
                    str5 = "";
                }
                String poiId = poiData2.getPoiId();
                if (poiId == null) {
                    poiId = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (str4 == null) {
                    str4 = "";
                }
                PoiMobParam poiMobParam4 = ((PoiSearchCell) iDaS205S0200000_15.l0).M().LJLLILLLL;
                if (poiMobParam4 != null) {
                    str6 = poiMobParam4.getCreationId();
                } else {
                    str6 = null;
                }
                PoiMobParam poiMobParam5 = ((PoiSearchCell) iDaS205S0200000_15.l0).M().LJLLILLLL;
                if (poiMobParam5 != null) {
                    str7 = poiMobParam5.getContentType();
                } else {
                    str7 = null;
                }
                PoiMobParam poiMobParam6 = ((PoiSearchCell) iDaS205S0200000_15.l0).M().LJLLILLLL;
                if (poiMobParam6 == null || (str8 = poiMobParam6.getShootWay()) == null) {
                    str8 = "";
                }
                boolean LIZJ = C45243HpH.LIZJ((View) iDaS205S0200000_15.l1, "context");
                String valueOf = String.valueOf(((PoiSearchCell) iDaS205S0200000_15.l0).L());
                C85316Xe4 item2 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
                if (item2 != null && (c85317Xe57 = item2.LJLJJI) != null && (str14 = c85317Xe57.LIZJ) != null) {
                    str17 = str14;
                }
                C85316Xe4 item3 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
                if (item3 != null && (c85317Xe56 = item3.LJLJJI) != null) {
                    i = c85317Xe56.LIZ;
                } else {
                    i = 0;
                }
                C85316Xe4 item4 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
                if (item4 == null || (c85317Xe55 = item4.LJLJJI) == null || (str13 = c85317Xe55.LIZJ) == null || str13.length() == 0) {
                    str9 = "default_search_poi";
                } else {
                    str9 = "search_poi";
                }
                C85316Xe4 item5 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
                if (item5 != null) {
                    str10 = item5.LJLJI;
                } else {
                    str10 = null;
                }
                C85316Xe4 item6 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
                if (item6 != null && (c85317Xe54 = item6.LJLJJI) != null) {
                    str11 = c85317Xe54.LIZIZ;
                } else {
                    str11 = null;
                }
                C85316Xe4 item7 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
                if (item7 != null && (c85317Xe53 = item7.LJLJJI) != null) {
                    l = Long.valueOf(c85317Xe53.LIZLLL);
                } else {
                    l = null;
                }
                PoiMobParam poiMobParam7 = ((PoiSearchCell) iDaS205S0200000_15.l0).M().LJLLILLLL;
                if (poiMobParam7 != null) {
                    num = poiMobParam7.getAwemeType();
                } else {
                    num = null;
                }
                ((PoiSearchCell) iDaS205S0200000_15.l0).getClass();
                C85316Xe4 item8 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
                if (item8 != null) {
                    bool = item8.LJLJJL;
                } else {
                    bool = null;
                }
                C225248si.LJII(str5, poiId, str3, str4, str6, str7, str8, LIZJ ? 1 : 0, valueOf, str17, i, str9, str10, poiData2, str11, l, num, CardStruct.IStatusCode.DEFAULT, bool);
                C85278XdS c85278XdS = C85242Xcs.LIZ;
                if (c85278XdS != null) {
                    EnumC85314Xe2 enumC85314Xe2 = EnumC85314Xe2.SELECT_POI_FROM_LIST;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("poi_id", poiData2.getPoiId());
                    C85316Xe4 item9 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
                    if (item9 != null) {
                        str12 = item9.LJLJI;
                    } else {
                        str12 = null;
                    }
                    jSONObject.put("log_id", str12);
                    jSONObject.put("session_id", ((PoiSearchCell) iDaS205S0200000_15.l0).M().LJLZ);
                    ((List) c85278XdS.LIZJ).add(new C79536VJk(enumC85314Xe2, jSONObject.toString()));
                }
            }
            PoiSearchVM M = ((PoiSearchCell) iDaS205S0200000_15.l0).M();
            PoiMobParam poiMobParam8 = ((PoiSearchCell) iDaS205S0200000_15.l0).M().LJLLILLLL;
            if (poiMobParam8 != null) {
                C85316Xe4 item10 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
                if (item10 != null && (c85317Xe52 = item10.LJLJJI) != null) {
                    str2 = c85317Xe52.LIZIZ;
                } else {
                    str2 = null;
                }
                poiMobParam = PoiMobParam.copy$default(poiMobParam8, null, null, null, null, null, null, str2, 63, null);
            } else {
                poiMobParam = null;
            }
            M.LJLLILLLL = poiMobParam;
            InterfaceC85240Xcq interfaceC85240Xcq = (InterfaceC85240Xcq) C8CH.LIZIZ((PoiSearchCell) iDaS205S0200000_15.l0, C65352Pkq.LIZ(InterfaceC85240Xcq.class));
            C85316Xe4 item11 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
            if (item11 != null && (poiData = item11.LJLIL) != null) {
                C85316Xe4 item12 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
                if (item12 != null) {
                    str = item12.LJLJI;
                } else {
                    str = null;
                }
                PoiMobParam poiMobParam9 = ((PoiSearchCell) iDaS205S0200000_15.l0).M().LJLLILLLL;
                if (poiMobParam9 != null) {
                    C85316Xe4 item13 = ((PoiSearchCell) iDaS205S0200000_15.l0).getItem();
                    if (item13 != null && (c85317Xe5 = item13.LJLJJI) != null) {
                        str16 = c85317Xe5.LIZIZ;
                    }
                    String str18 = ((C85192Xc4) ((PoiSearchCell) iDaS205S0200000_15.l0).M().getState()).LJLIL;
                    if (str18 != null && str18.length() != 0) {
                        str15 = "search_poi";
                    }
                    poiMobParam2 = PoiMobParam.copy$default(poiMobParam9, null, null, null, str15, null, null, str16, 55, null);
                }
                poiData3 = PoiData.copy$default(poiData, null, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, null, null, null, null, null, null, null, null, poiMobParam2, str, null, null, null, 950271, null);
            }
            interfaceC85240Xcq.Gd(poiData3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$1(IDaS205S0200000_15 iDaS205S0200000_15, View view) {
        PoiMobParam poiMobParam;
        PoiData poiData;
        String str;
        C85317Xe5 c85317Xe5;
        String str2;
        C85317Xe5 c85317Xe52;
        PoiData poiData2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        String str9;
        String str10;
        String str11;
        Long l;
        Integer num;
        Boolean bool;
        String str12;
        C85317Xe5 c85317Xe53;
        C85317Xe5 c85317Xe54;
        C85317Xe5 c85317Xe55;
        String str13;
        C85317Xe5 c85317Xe56;
        C85317Xe5 c85317Xe57;
        String str14;
        if (view != null) {
            C85316Xe4 item = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
            String str15 = "default_search_poi";
            PoiData poiData3 = null;
            r2 = null;
            String str16 = null;
            PoiMobParam poiMobParam2 = null;
            poiData3 = null;
            if (item != null && (poiData2 = item.LJLIL) != null) {
                PoiDetails poiDetails = poiData2.getPoiDetails();
                if (poiDetails != null) {
                    str3 = poiDetails.getCityCode();
                } else {
                    str3 = null;
                }
                PoiDetails poiDetails2 = poiData2.getPoiDetails();
                if (poiDetails2 != null) {
                    str4 = poiDetails2.getCountryCode();
                } else {
                    str4 = null;
                }
                PoiMobParam poiMobParam3 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).N().LJLLILLLL;
                String str17 = "";
                if (poiMobParam3 == null || (str5 = poiMobParam3.getEnterFrom()) == null) {
                    str5 = "";
                }
                String poiId = poiData2.getPoiId();
                if (poiId == null) {
                    poiId = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (str4 == null) {
                    str4 = "";
                }
                PoiMobParam poiMobParam4 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).N().LJLLILLLL;
                if (poiMobParam4 != null) {
                    str6 = poiMobParam4.getCreationId();
                } else {
                    str6 = null;
                }
                PoiMobParam poiMobParam5 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).N().LJLLILLLL;
                if (poiMobParam5 != null) {
                    str7 = poiMobParam5.getContentType();
                } else {
                    str7 = null;
                }
                PoiMobParam poiMobParam6 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).N().LJLLILLLL;
                if (poiMobParam6 == null || (str8 = poiMobParam6.getShootWay()) == null) {
                    str8 = "";
                }
                boolean LIZJ = C45243HpH.LIZJ((View) iDaS205S0200000_15.l1, "context");
                String valueOf = String.valueOf(((PoiSearchCellV1) iDaS205S0200000_15.l0).M());
                C85316Xe4 item2 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
                if (item2 != null && (c85317Xe57 = item2.LJLJJI) != null && (str14 = c85317Xe57.LIZJ) != null) {
                    str17 = str14;
                }
                C85316Xe4 item3 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
                if (item3 != null && (c85317Xe56 = item3.LJLJJI) != null) {
                    i = c85317Xe56.LIZ;
                } else {
                    i = 0;
                }
                C85316Xe4 item4 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
                if (item4 == null || (c85317Xe55 = item4.LJLJJI) == null || (str13 = c85317Xe55.LIZJ) == null || str13.length() == 0) {
                    str9 = "default_search_poi";
                } else {
                    str9 = "search_poi";
                }
                C85316Xe4 item5 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
                if (item5 != null) {
                    str10 = item5.LJLJI;
                } else {
                    str10 = null;
                }
                C85316Xe4 item6 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
                if (item6 != null && (c85317Xe54 = item6.LJLJJI) != null) {
                    str11 = c85317Xe54.LIZIZ;
                } else {
                    str11 = null;
                }
                C85316Xe4 item7 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
                if (item7 != null && (c85317Xe53 = item7.LJLJJI) != null) {
                    l = Long.valueOf(c85317Xe53.LIZLLL);
                } else {
                    l = null;
                }
                PoiMobParam poiMobParam7 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).N().LJLLILLLL;
                if (poiMobParam7 != null) {
                    num = poiMobParam7.getAwemeType();
                } else {
                    num = null;
                }
                String L = ((PoiSearchCellV1) iDaS205S0200000_15.l0).L();
                C85316Xe4 item8 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
                if (item8 != null) {
                    bool = item8.LJLJJL;
                } else {
                    bool = null;
                }
                C225248si.LJII(str5, poiId, str3, str4, str6, str7, str8, LIZJ ? 1 : 0, valueOf, str17, i, str9, str10, poiData2, str11, l, num, L, bool);
                C85278XdS c85278XdS = C85242Xcs.LIZ;
                if (c85278XdS != null) {
                    EnumC85314Xe2 enumC85314Xe2 = EnumC85314Xe2.SELECT_POI_FROM_LIST;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("poi_id", poiData2.getPoiId());
                    C85316Xe4 item9 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
                    if (item9 != null) {
                        str12 = item9.LJLJI;
                    } else {
                        str12 = null;
                    }
                    jSONObject.put("log_id", str12);
                    jSONObject.put("session_id", ((PoiSearchCellV1) iDaS205S0200000_15.l0).N().LJLZ);
                    ((List) c85278XdS.LIZJ).add(new C79536VJk(enumC85314Xe2, jSONObject.toString()));
                }
            }
            PoiSearchVM N = ((PoiSearchCellV1) iDaS205S0200000_15.l0).N();
            PoiMobParam poiMobParam8 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).N().LJLLILLLL;
            if (poiMobParam8 != null) {
                C85316Xe4 item10 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
                if (item10 != null && (c85317Xe52 = item10.LJLJJI) != null) {
                    str2 = c85317Xe52.LIZIZ;
                } else {
                    str2 = null;
                }
                poiMobParam = PoiMobParam.copy$default(poiMobParam8, null, null, null, null, null, null, str2, 63, null);
            } else {
                poiMobParam = null;
            }
            N.LJLLILLLL = poiMobParam;
            InterfaceC85240Xcq interfaceC85240Xcq = (InterfaceC85240Xcq) C8CH.LIZIZ((PoiSearchCellV1) iDaS205S0200000_15.l0, C65352Pkq.LIZ(InterfaceC85240Xcq.class));
            C85316Xe4 item11 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
            if (item11 != null && (poiData = item11.LJLIL) != null) {
                C85316Xe4 item12 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
                if (item12 != null) {
                    str = item12.LJLJI;
                } else {
                    str = null;
                }
                PoiMobParam poiMobParam9 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).N().LJLLILLLL;
                if (poiMobParam9 != null) {
                    C85316Xe4 item13 = ((PoiSearchCellV1) iDaS205S0200000_15.l0).getItem();
                    if (item13 != null && (c85317Xe5 = item13.LJLJJI) != null) {
                        str16 = c85317Xe5.LIZIZ;
                    }
                    String str18 = ((C85192Xc4) ((PoiSearchCellV1) iDaS205S0200000_15.l0).N().getState()).LJLIL;
                    if (str18 != null && str18.length() != 0) {
                        str15 = "search_poi";
                    }
                    poiMobParam2 = PoiMobParam.copy$default(poiMobParam9, null, null, null, str15, null, null, str16, 55, null);
                }
                poiData3 = PoiData.copy$default(poiData, null, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, null, null, null, null, null, null, null, null, poiMobParam2, str, null, null, null, 950271, null);
            }
            interfaceC85240Xcq.Gd(poiData3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$2(IDaS205S0200000_15 iDaS205S0200000_15, View view) {
        PoiMobParam poiMobParam;
        PoiData poiData;
        String str;
        C85317Xe5 c85317Xe5;
        String str2;
        C85317Xe5 c85317Xe52;
        PoiData poiData2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        String str9;
        String str10;
        String str11;
        Long l;
        Integer num;
        String str12;
        Boolean bool;
        String str13;
        C85317Xe5 c85317Xe53;
        C85317Xe5 c85317Xe54;
        C85317Xe5 c85317Xe55;
        String str14;
        C85317Xe5 c85317Xe56;
        C85317Xe5 c85317Xe57;
        String str15;
        if (view != null) {
            C85316Xe4 item = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
            String str16 = "default_search_poi";
            PoiData poiData3 = null;
            r2 = null;
            String str17 = null;
            PoiMobParam poiMobParam2 = null;
            poiData3 = null;
            if (item != null && (poiData2 = item.LJLIL) != null) {
                PoiDetails poiDetails = poiData2.getPoiDetails();
                if (poiDetails != null) {
                    str3 = poiDetails.getCityCode();
                } else {
                    str3 = null;
                }
                PoiDetails poiDetails2 = poiData2.getPoiDetails();
                if (poiDetails2 != null) {
                    str4 = poiDetails2.getCountryCode();
                } else {
                    str4 = null;
                }
                PoiMobParam poiMobParam3 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).M().LJLLILLLL;
                String str18 = "";
                if (poiMobParam3 == null || (str5 = poiMobParam3.getEnterFrom()) == null) {
                    str5 = "";
                }
                String poiId = poiData2.getPoiId();
                if (poiId == null) {
                    poiId = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (str4 == null) {
                    str4 = "";
                }
                PoiMobParam poiMobParam4 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).M().LJLLILLLL;
                if (poiMobParam4 != null) {
                    str6 = poiMobParam4.getCreationId();
                } else {
                    str6 = null;
                }
                PoiMobParam poiMobParam5 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).M().LJLLILLLL;
                if (poiMobParam5 != null) {
                    str7 = poiMobParam5.getContentType();
                } else {
                    str7 = null;
                }
                PoiMobParam poiMobParam6 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).M().LJLLILLLL;
                if (poiMobParam6 == null || (str8 = poiMobParam6.getShootWay()) == null) {
                    str8 = "";
                }
                boolean LIZJ = C45243HpH.LIZJ((View) iDaS205S0200000_15.l1, "context");
                String valueOf = String.valueOf(((PoiSearchCellV2) iDaS205S0200000_15.l0).L());
                C85316Xe4 item2 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
                if (item2 != null && (c85317Xe57 = item2.LJLJJI) != null && (str15 = c85317Xe57.LIZJ) != null) {
                    str18 = str15;
                }
                C85316Xe4 item3 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
                if (item3 != null && (c85317Xe56 = item3.LJLJJI) != null) {
                    i = c85317Xe56.LIZ;
                } else {
                    i = 0;
                }
                C85316Xe4 item4 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
                if (item4 == null || (c85317Xe55 = item4.LJLJJI) == null || (str14 = c85317Xe55.LIZJ) == null || str14.length() == 0) {
                    str9 = "default_search_poi";
                } else {
                    str9 = "search_poi";
                }
                C85316Xe4 item5 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
                if (item5 != null) {
                    str10 = item5.LJLJI;
                } else {
                    str10 = null;
                }
                C85316Xe4 item6 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
                if (item6 != null && (c85317Xe54 = item6.LJLJJI) != null) {
                    str11 = c85317Xe54.LIZIZ;
                } else {
                    str11 = null;
                }
                C85316Xe4 item7 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
                if (item7 != null && (c85317Xe53 = item7.LJLJJI) != null) {
                    l = Long.valueOf(c85317Xe53.LIZLLL);
                } else {
                    l = null;
                }
                PoiMobParam poiMobParam7 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).M().LJLLILLLL;
                if (poiMobParam7 != null) {
                    num = poiMobParam7.getAwemeType();
                } else {
                    num = null;
                }
                PoiSearchCellV2 poiSearchCellV2 = (PoiSearchCellV2) iDaS205S0200000_15.l0;
                poiSearchCellV2.getClass();
                Integer num2 = PoiSearchConfig.LIZ().showCategoryStyle;
                if (num2 == null || num2.intValue() == 0 || !poiSearchCellV2.LJLJLLL) {
                    str12 = CardStruct.IStatusCode.DEFAULT;
                } else {
                    str12 = "1";
                }
                C85316Xe4 item8 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
                if (item8 != null) {
                    bool = item8.LJLJJL;
                } else {
                    bool = null;
                }
                C225248si.LJII(str5, poiId, str3, str4, str6, str7, str8, LIZJ ? 1 : 0, valueOf, str18, i, str9, str10, poiData2, str11, l, num, str12, bool);
                C85278XdS c85278XdS = C85242Xcs.LIZ;
                if (c85278XdS != null) {
                    EnumC85314Xe2 enumC85314Xe2 = EnumC85314Xe2.SELECT_POI_FROM_LIST;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("poi_id", poiData2.getPoiId());
                    C85316Xe4 item9 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
                    if (item9 != null) {
                        str13 = item9.LJLJI;
                    } else {
                        str13 = null;
                    }
                    jSONObject.put("log_id", str13);
                    jSONObject.put("session_id", ((PoiSearchCellV2) iDaS205S0200000_15.l0).M().LJLZ);
                    ((List) c85278XdS.LIZJ).add(new C79536VJk(enumC85314Xe2, jSONObject.toString()));
                }
            }
            PoiSearchVM M = ((PoiSearchCellV2) iDaS205S0200000_15.l0).M();
            PoiMobParam poiMobParam8 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).M().LJLLILLLL;
            if (poiMobParam8 != null) {
                C85316Xe4 item10 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
                if (item10 != null && (c85317Xe52 = item10.LJLJJI) != null) {
                    str2 = c85317Xe52.LIZIZ;
                } else {
                    str2 = null;
                }
                poiMobParam = PoiMobParam.copy$default(poiMobParam8, null, null, null, null, null, null, str2, 63, null);
            } else {
                poiMobParam = null;
            }
            M.LJLLILLLL = poiMobParam;
            InterfaceC85240Xcq interfaceC85240Xcq = (InterfaceC85240Xcq) C8CH.LIZIZ((PoiSearchCellV2) iDaS205S0200000_15.l0, C65352Pkq.LIZ(InterfaceC85240Xcq.class));
            C85316Xe4 item11 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
            if (item11 != null && (poiData = item11.LJLIL) != null) {
                C85316Xe4 item12 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
                if (item12 != null) {
                    str = item12.LJLJI;
                } else {
                    str = null;
                }
                PoiMobParam poiMobParam9 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).M().LJLLILLLL;
                if (poiMobParam9 != null) {
                    C85316Xe4 item13 = ((PoiSearchCellV2) iDaS205S0200000_15.l0).getItem();
                    if (item13 != null && (c85317Xe5 = item13.LJLJJI) != null) {
                        str17 = c85317Xe5.LIZIZ;
                    }
                    String str19 = ((C85192Xc4) ((PoiSearchCellV2) iDaS205S0200000_15.l0).M().getState()).LJLIL;
                    if (str19 != null && str19.length() != 0) {
                        str16 = "search_poi";
                    }
                    poiMobParam2 = PoiMobParam.copy$default(poiMobParam9, null, null, null, str16, null, null, str17, 55, null);
                }
                poiData3 = PoiData.copy$default(poiData, null, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, null, null, null, null, null, null, null, null, poiMobParam2, str, null, null, null, 950271, null);
            }
            interfaceC85240Xcq.Gd(poiData3);
        }
    }

    public static final void LIZ$3(IDaS205S0200000_15 iDaS205S0200000_15, View view) {
        if (view == null) {
            return;
        }
        FriendListVM friendListVM = (FriendListVM) ((StretchCell) iDaS205S0200000_15.l0).LJLIL.getValue();
        XMW item = (XMW) iDaS205S0200000_15.l1;
        o.LJIIIZ(item, "item");
        friendListVM.LJLIL.getValue().getClass();
        item.LJLIL.getClass();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS205S0200000_15(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
