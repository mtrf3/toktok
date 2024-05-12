package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7fT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191557fT implements S1U {
    public static final boolean LJLLJ;
    public Aweme LJLIL;
    public PoiAnchorData LJLILLLLZI;
    public C190787eE LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public final AqS169S0100000_3 LJLLILLLL = new AqS169S0100000_3(this, 790);

    @Override // X.S1U
    public final boolean enable() {
        return true;
    }

    static {
        Keva keva = C190757eB.LIZ;
        boolean z = keva.getBoolean("clickPoiAnchorIsFirstLaunch", true);
        if (z) {
            keva.storeBoolean("clickPoiAnchorIsFirstLaunch", false);
        }
        LJLLJ = z;
    }

    @Override // X.S1U
    public final String LIZJ() {
        String str;
        String poiCity;
        String str2;
        String str3;
        PoiAnchorData poiAnchorData;
        PoiAnchorInfo videoAnchor;
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct == null || (videoAnchor = poiDataStruct.getVideoAnchor()) == null || (str = videoAnchor.getSuffix()) == null) {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                PoiAnchorData poiAnchorData2 = this.LJLILLLLZI;
                if (poiAnchorData2 == null || (poiCity = poiAnchorData2.getPoiCity()) == null || poiCity.length() == 0) {
                    return null;
                }
                PoiAnchorData poiAnchorData3 = this.LJLILLLLZI;
                if (poiAnchorData3 != null) {
                    str2 = poiAnchorData3.getPoiCity();
                } else {
                    str2 = null;
                }
                PoiAnchorData poiAnchorData4 = this.LJLILLLLZI;
                if (poiAnchorData4 != null) {
                    str3 = poiAnchorData4.getPoiName();
                } else {
                    str3 = null;
                }
                if (o.LJ(str2, str3) || (poiAnchorData = this.LJLILLLLZI) == null) {
                    return null;
                }
                return poiAnchorData.getPoiCity();
            }
            return str;
        }
        o.LJIJI("aweme");
        throw null;
    }

    public final String LIZ(int i) {
        long j;
        String string;
        Long videoCount;
        Long videoCount2;
        PoiAnchorData poiAnchorData = this.LJLILLLLZI;
        long j2 = 0;
        if (poiAnchorData != null && (videoCount2 = poiAnchorData.getVideoCount()) != null) {
            j = videoCount2.longValue();
        } else {
            j = 0;
        }
        if (j >= i) {
            Resources LIZJ = FKM.LIZJ();
            if (LIZJ == null || (string = LIZJ.getString(R.string.drb)) == null) {
                return null;
            }
            Object[] objArr = new Object[1];
            PoiAnchorData poiAnchorData2 = this.LJLILLLLZI;
            if (poiAnchorData2 != null && (videoCount = poiAnchorData2.getVideoCount()) != null) {
                j2 = videoCount.longValue();
            }
            objArr[0] = C77123UOp.LJJIIJ(j2);
            return Q8U.LIZIZ(objArr, 1, string, "format(this, *args)");
        }
        PoiAnchorData poiAnchorData3 = this.LJLILLLLZI;
        if (poiAnchorData3 == null) {
            return null;
        }
        return poiAnchorData3.getDescription();
    }

    @Override // X.S1U
    public final void LJJI(Aweme aweme) {
        AnchorCommonStruct anchorCommonStruct;
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
        PoiAnchorData.Companion.getClass();
        this.LJLILLLLZI = C190827eI.LIZLLL(aweme);
        C190787eE.Companion.getClass();
        this.LJLJI = C190797eF.LIZIZ(aweme);
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        String str = null;
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorCommonStruct = it.next();
                    if (anchorCommonStruct.getType() == 45) {
                        break;
                    }
                } else {
                    anchorCommonStruct = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (anchorCommonStruct2 != null) {
                str = anchorCommonStruct2.getSchema();
            }
        }
        this.LJLJJI = str;
    }

    @Override // X.S1U
    public final void LJJIJ(Aweme aweme, String enterMethod, String enterFrom, boolean z, String trackInfo, C188727au c188727au) {
        java.util.Map<String, String> map;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLLI = z;
        PoiAnchorData poiAnchorData = this.LJLILLLLZI;
        C190787eE c190787eE = this.LJLJI;
        AqS169S0100000_3 aqS169S0100000_3 = this.LJLLILLLL;
        C190797eF c190797eF = C190787eE.Companion;
        C190827eI c190827eI = PoiAnchorData.Companion;
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", enterFrom);
        c188727au2.LJIIIZ("enter_method", enterMethod);
        c188727au2.LJIIIIZZ(C78966Uyw.LJJJLZIJ(trackInfo));
        c190827eI.getClass();
        C190827eI.LIZ(c188727au2, poiAnchorData);
        c190797eF.getClass();
        C190797eF.LIZ(c188727au2, c190787eE);
        C190847eK.LIZ(c188727au2, aweme);
        if (c188727au != null) {
            map = c188727au.LIZ;
        } else {
            map = null;
        }
        c188727au2.LJIIIIZZ(map);
        if (aqS169S0100000_3 != null) {
            aqS169S0100000_3.invoke(c188727au2);
        }
        c188727au2.LJIIIIZZ(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("multi_anchor_entrance_show", c188727au2.LIZ);
        C211648Si.LIZ(c188727au2, aweme, enterFrom, true);
        C51556KLg.LIZ.getClass();
        C191457fJ.LIZ(C51556KLg.LIZ(), "VIDEO_ANCHOR", true, 4);
    }

    @Override // X.S1U
    public final void LJJJJZI(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LJLJJL = i;
        this.LJLJJLL = i2;
        this.LJLJL = i3;
        this.LJLJLJ = i4;
        this.LJLJLLL = i5;
        this.LJLL = i6;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recordTextLayoutParams (");
        LIZ.append(i);
        LIZ.append(',');
        LIZ.append(i2);
        LIZ.append(',');
        LIZ.append(i3);
        LIZ.append(',');
        LIZ.append(i4);
        LIZ.append(',');
        LIZ.append(i5);
        LIZ.append(',');
        LIZ.append(i6);
        LIZ.append("); awemeId=");
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            LIZ.append(aweme.getAid());
            X1D.LIZIZ(LIZ);
        } else {
            o.LJIJI("aweme");
            throw null;
        }
    }

    @Override // X.S1U
    public final void LJIJI(Aweme aweme, String enterMethod, String enterFrom, boolean z, boolean z2, String trackInfo, C188727au c188727au) {
        java.util.Map map;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        PoiAnchorData poiAnchorData = this.LJLILLLLZI;
        C190787eE c190787eE = this.LJLJI;
        AqS169S0100000_3 aqS169S0100000_3 = this.LJLLILLLL;
        C190797eF c190797eF = C190787eE.Companion;
        C190827eI c190827eI = PoiAnchorData.Companion;
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_method", enterMethod);
        c188727au2.LJIIIZ("enter_from", enterFrom);
        c188727au2.LIZLLL(z2 ? 1 : 0, "expand");
        c188727au2.LJIIIIZZ(C78966Uyw.LJJJLZIJ(trackInfo));
        c190827eI.getClass();
        C190827eI.LIZ(c188727au2, poiAnchorData);
        c190797eF.getClass();
        C190797eF.LIZ(c188727au2, c190787eE);
        C190847eK.LIZ(c188727au2, aweme);
        if (c188727au != null) {
            map = c188727au.LIZ;
        } else {
            map = null;
        }
        c188727au2.LJIIIIZZ(map);
        if (aqS169S0100000_3 != null) {
            aqS169S0100000_3.invoke(c188727au2);
        }
        c188727au2.LJIIIIZZ(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        C211648Si.LIZ(c188727au2, aweme, enterFrom, false);
        FMX.LJIIL("multi_anchor_entrance_click", c188727au2.LIZ);
    }

    @Override // X.S1U
    public final void LJJL(Context context, Aweme aweme, String enterMethod, String enterFrom, C188727au c188727au, boolean z, String trackInfo) {
        java.util.Map<String, String> map;
        String str;
        Integer LJJIL;
        String str2;
        AnchorCommonStruct anchorCommonStruct;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        PoiAnchorData poiAnchorData = this.LJLILLLLZI;
        C190787eE c190787eE = this.LJLJI;
        C190797eF c190797eF = C190787eE.Companion;
        C190827eI c190827eI = PoiAnchorData.Companion;
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("click_type", "app_page");
        c188727au2.LJIIIZ("enter_from", enterFrom);
        c188727au2.LJIIIZ("enter_method", enterMethod);
        c190827eI.getClass();
        C190827eI.LIZ(c188727au2, poiAnchorData);
        c190797eF.getClass();
        C190797eF.LIZ(c188727au2, c190787eE);
        C190847eK.LIZ(c188727au2, aweme);
        String str3 = null;
        if (c188727au != null) {
            map = c188727au.LIZ;
        } else {
            map = null;
        }
        c188727au2.LJIIIIZZ(map);
        c188727au2.LJIIIIZZ(C78966Uyw.LJJJLZIJ(trackInfo));
        FMX.LJIIL("enter_multi_anchor_detail", c188727au2.LIZ);
        PoiAnchorData LIZLLL = C190827eI.LIZLLL(aweme);
        if (LIZLLL == null) {
            return;
        }
        String str4 = this.LJLJJI;
        if (str4 == null) {
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors != null) {
                Iterator<AnchorCommonStruct> it = anchors.iterator();
                while (true) {
                    if (it.hasNext()) {
                        anchorCommonStruct = it.next();
                        if (anchorCommonStruct.getType() == 45) {
                            break;
                        }
                    } else {
                        anchorCommonStruct = null;
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                if (anchorCommonStruct2 != null) {
                    str3 = anchorCommonStruct2.getSchema();
                }
            }
        } else {
            str3 = str4;
        }
        this.LJLJJI = str3;
        if (!(context instanceof ActivityC45651qj)) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, str3);
        if (c188727au != null) {
            java.util.Map<String, String> map2 = c188727au.LIZ;
            if (map2 != null && (str2 = (String) ((HashMap) map2).get("from_page")) != null) {
                buildRoute.withParam("from_page", str2);
            }
            java.util.Map<String, String> map3 = c188727au.LIZ;
            if (map3 != null && (str = (String) ((HashMap) map3).get("has_title")) != null && (LJJIL = C38350F3i.LJJIL(str)) != null) {
                buildRoute.withParam("has_title", LJJIL.intValue());
            }
        }
        buildRoute.withParam("poi_id", LIZLLL.getPoiId());
        buildRoute.withParam("enter_from", enterFrom);
        buildRoute.withParam("enter_method", enterMethod);
        buildRoute.withParam("poi_data", LIZLLL);
        buildRoute.withParam("is_expand", z);
        buildRoute.withParam("track_info", trackInfo);
        buildRoute.withParam("from_other_poi", !o.LJ(C190317dT.LIZ(aweme.getAid()), LIZLLL.getPoiId()) ? 1 : 0);
        C190787eE.Companion.getClass();
        buildRoute.withParam("poi_mob", C190797eF.LIZIZ(aweme));
        buildRoute.withParam("from_group_id", aweme.getGroupId());
        buildRoute.open();
    }
}
