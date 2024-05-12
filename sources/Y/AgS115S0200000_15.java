package Y;

import X.C10I;
import X.C10K;
import X.C188727au;
import X.C43115Gw3;
import X.C44384HbQ;
import X.C44426Hc6;
import X.C44428Hc8;
import X.C76800UCe;
import X.C82544WaS;
import X.C84936XVc;
import X.C84939XVf;
import X.C84941XVh;
import X.C85631Xj9;
import X.C86219Xsd;
import X.EnumC85784Xlc;
import X.HG3;
import X.IMX;
import X.InterfaceC51052K1w;
import X.InterfaceC65784Pro;
import X.WM7;
import X.XVW;
import android.app.Dialog;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.choosemusic.model.MusicCollectionFeed;
import com.ss.android.ugc.aweme.choosemusic.model.MusicCollectionFeedResponse;
import com.ss.android.ugc.aweme.fe.method.upload.PickPhotoUploadFeature;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.api.UnbindValidateResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes16.dex */
public class AgS115S0200000_15 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C10I
    public final Object then(C10K<JSONArray> c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS115S0200000_15 agS115S0200000_15, C10K c10k) {
        if (!((PickPhotoUploadFeature) agS115S0200000_15.l0).isCancelUpload) {
            if (c10k.LJIIJJI() != null) {
                ((PickPhotoUploadFeature) agS115S0200000_15.l0).onFileSelected.LIZJ((JSONArray) c10k.LJIIJJI());
            } else {
                ((PickPhotoUploadFeature) agS115S0200000_15.l0).onFileSelected.LIZ(0, "uploadFailed");
            }
            if (((C86219Xsd) agS115S0200000_15.l1) == null) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((PickPhotoUploadFeature) agS115S0200000_15.l0).mOnUploadFinishedListener;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                C43115Gw3.LIZJ(((PickPhotoUploadFeature) agS115S0200000_15.l0).mImageWidth);
                return null;
            }
            return null;
        }
        return null;
    }

    public static final Object then$1(AgS115S0200000_15 agS115S0200000_15, C10K unbindResponse) {
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) agS115S0200000_15.l0;
        o.LJIIIIZZ(unbindResponse, "unbindResponse");
        C85631Xj9.LJII(baseAccountFlowFragment, unbindResponse, false);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) agS115S0200000_15.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            return null;
        }
        return null;
    }

    public static final Object then$2(AgS115S0200000_15 agS115S0200000_15, C10K unbindResponse) {
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) agS115S0200000_15.l0;
        o.LJIIIIZZ(unbindResponse, "unbindResponse");
        C85631Xj9.LJII(baseAccountFlowFragment, unbindResponse, true);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) agS115S0200000_15.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            return null;
        }
        return null;
    }

    public static final Object then$3(AgS115S0200000_15 agS115S0200000_15, C10K c10k) {
        XVW xvw = (XVW) agS115S0200000_15.l0;
        C44428Hc8 c44428Hc8 = (C44428Hc8) agS115S0200000_15.l1;
        xvw.LJFF = false;
        if (c10k.LJIIL()) {
            return null;
        }
        long LIZIZ = c44428Hc8.LIZIZ(TimeUnit.MILLISECONDS);
        if (c10k.LJIILJJIL()) {
            xvw.LIZIZ.jv0(1, "collection_feed_status");
            IAVMobService iAVMobService = xvw.LIZLLL;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("api_type", "music_list");
            c188727au.LJ(LIZIZ, "duration");
            c188727au.LJIIIZ(WM7.SCENE_SERVICE, "discover");
            c188727au.LIZLLL(1, "status");
            c188727au.LJIIIZ("error_domain", InterfaceC51052K1w.LIZ);
            c188727au.LJIIIZ("error_code", c10k.LJIIJ().getMessage());
            c188727au.LIZLLL(0, "count");
            iAVMobService.onEventV3("tool_performance_api", c188727au.LIZ);
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        MusicCollectionFeedResponse musicCollectionFeedResponse = (MusicCollectionFeedResponse) c10k.LJIIJJI();
        xvw.LIZIZ.jv0(Integer.valueOf(musicCollectionFeedResponse.cursor), "collection_feed_cursor");
        xvw.LIZIZ.jv0(Integer.valueOf(musicCollectionFeedResponse.hasMore), "collection_feed_has_more");
        List list = (List) xvw.LIZIZ.get("list");
        if (list == null) {
            xvw.LIZIZ.jv0(1, "collection_feed_status");
            return null;
        }
        List<MusicCollectionFeed> list2 = musicCollectionFeedResponse.musicCollectionFeedList;
        for (MusicCollectionFeed musicCollectionFeed : list2) {
            list.add(new C84936XVc(C44426Hc6.LIZIZ(musicCollectionFeed.musicList, musicCollectionFeedResponse.extra), musicCollectionFeed.collection, 2));
        }
        xvw.LIZIZ.jv0(list, "list");
        xvw.LIZIZ.jv0(0, "collection_feed_status");
        IAVMobService iAVMobService2 = xvw.LIZLLL;
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("api_type", "music_list");
        c188727au2.LJ(LIZIZ, "duration");
        c188727au2.LJIIIZ(WM7.SCENE_SERVICE, "discover");
        c188727au2.LIZLLL(0, "status");
        c188727au2.LIZLLL(list2.size(), "count");
        iAVMobService2.onEventV3("tool_performance_api", c188727au2.LIZ);
        return null;
    }

    public static final Object then$4(AgS115S0200000_15 agS115S0200000_15, C10K c10k) {
        XVW xvw = (XVW) agS115S0200000_15.l0;
        C44428Hc8 c44428Hc8 = (C44428Hc8) agS115S0200000_15.l1;
        xvw.getClass();
        if (c10k.LJIIL()) {
            return null;
        }
        long LIZIZ = c44428Hc8.LIZIZ(TimeUnit.MILLISECONDS);
        if (c10k.LJIILJJIL()) {
            xvw.LIZIZ.jv0(1, "collection_feed_status");
            xvw.LIZIZ.jv0(1, "more_tab_collection_feed_refresh_status");
            IAVMobService iAVMobService = xvw.LIZLLL;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("api_type", "music_list");
            c188727au.LJ(LIZIZ, "duration");
            c188727au.LJIIIZ(WM7.SCENE_SERVICE, "discover");
            c188727au.LIZLLL(1, "status");
            c188727au.LJIIIZ("error_domain", InterfaceC51052K1w.LIZ);
            c188727au.LJIIIZ("error_code", c10k.LJIIJ().getMessage());
            c188727au.LIZLLL(0, "count");
            iAVMobService.onEventV3("tool_performance_api", c188727au.LIZ);
            int intValue = ((Integer) xvw.LIZIZ.get("more_tab_music_sheet_refresh_status", 2)).intValue();
            if (intValue == 1) {
                xvw.LIZIZ.jv0(1, "more_tab_refresh_status");
                return null;
            }
            if (intValue != 0) {
                return null;
            }
            xvw.LIZIZ.jv0(xvw.LIZIZ.get("more_tab_music_sheet"), "list");
            xvw.LIZIZ.jv0(0, "more_tab_refresh_status");
            xvw.LIZIZ.jv0(Boolean.TRUE, "more_tab_has_fetched");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        xvw.LIZIZ.jv0(0, "more_tab_collection_feed_refresh_status");
        xvw.LIZIZ.jv0(0, "collection_feed_status");
        ArrayList arrayList = new ArrayList();
        MusicCollectionFeedResponse musicCollectionFeedResponse = (MusicCollectionFeedResponse) c10k.LJIIJJI();
        List<MusicCollectionFeed> list = musicCollectionFeedResponse.musicCollectionFeedList;
        for (MusicCollectionFeed musicCollectionFeed : list) {
            arrayList.add(new C84936XVc(C44426Hc6.LIZIZ(musicCollectionFeed.musicList, musicCollectionFeedResponse.extra), musicCollectionFeed.collection, 2));
        }
        IAVMobService iAVMobService2 = xvw.LIZLLL;
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("api_type", "music_list");
        c188727au2.LJ(LIZIZ, "duration");
        c188727au2.LJIIIZ(WM7.SCENE_SERVICE, "discover");
        c188727au2.LIZLLL(0, "status");
        c188727au2.LIZLLL(list.size(), "count");
        iAVMobService2.onEventV3("tool_performance_api", c188727au2.LIZ);
        List list2 = (List) xvw.LIZIZ.get("more_tab_music_sheet");
        if (list2 == null) {
            if (((Integer) xvw.LIZIZ.get("more_tab_music_sheet_refresh_status", 2)).intValue() == 2) {
                xvw.LIZIZ.jv0(arrayList, "more_tab_collection_feed");
                return null;
            }
            xvw.LIZIZ.jv0(1, "more_tab_refresh_status");
            return null;
        }
        list2.addAll(arrayList);
        xvw.LIZIZ.jv0(list2, "list");
        xvw.LIZIZ.jv0(0, "more_tab_refresh_status");
        xvw.LIZIZ.jv0(Boolean.TRUE, "more_tab_has_fetched");
        return null;
    }

    public static final Object then$5(AgS115S0200000_15 agS115S0200000_15, C10K c10k) {
        IMX imx;
        ((Dialog) agS115S0200000_15.l0).dismiss();
        if (!C82544WaS.LJ(c10k) || ((UnbindValidateResponse) c10k.LJIIJJI()).data == null) {
            ((I18nSettingManageMyAccountActivity) agS115S0200000_15.l1).LLJILJILJ();
            ((I18nSettingManageMyAccountActivity) agS115S0200000_15.l1).LLIL(true, EnumC85784Xlc.UNLINK, null);
        } else {
            UnbindValidateResponse.Data data = ((UnbindValidateResponse) c10k.LJIIJJI()).data;
            int i = data.errorCode;
            I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) agS115S0200000_15.l1;
            EnumC85784Xlc enumC85784Xlc = EnumC85784Xlc.UNLINK;
            i18nSettingManageMyAccountActivity.getClass();
            if (i != 0) {
                if (i != 2031) {
                    if (i != 2050) {
                        imx = IMX.UNKNOWN;
                    } else {
                        imx = IMX.DIGITAL_3;
                    }
                } else {
                    imx = IMX.DIGITAL_2;
                }
            } else {
                imx = IMX.DIGITAL_1;
            }
            i18nSettingManageMyAccountActivity.LLIL(true, enumC85784Xlc, imx);
            if (i == 0) {
                ((I18nSettingManageMyAccountActivity) agS115S0200000_15.l1).LJLJI = true;
                IBindService LJFF = HG3.LJFF();
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity2 = (I18nSettingManageMyAccountActivity) agS115S0200000_15.l1;
                LJFF.unbindPhone(i18nSettingManageMyAccountActivity2, data.extraEligibleLoginMethod, i18nSettingManageMyAccountActivity2.LLIIIZ);
            } else {
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity3 = (I18nSettingManageMyAccountActivity) agS115S0200000_15.l1;
                i18nSettingManageMyAccountActivity3.showToast(i18nSettingManageMyAccountActivity3.LLIIIZ(data.errorCode, true));
            }
        }
        return null;
    }

    public static final Object then$6(AgS115S0200000_15 agS115S0200000_15, C10K c10k) {
        C84939XVf c84939XVf = (C84939XVf) agS115S0200000_15.l0;
        C44428Hc8 c44428Hc8 = (C44428Hc8) agS115S0200000_15.l1;
        c84939XVf.LIZJ = false;
        if (c10k.LJIIL()) {
            return null;
        }
        c44428Hc8.LIZIZ(TimeUnit.MILLISECONDS);
        if (c10k.LJIILJJIL()) {
            c84939XVf.LIZIZ.jv0(1, "collection_feed_status");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        com.ss.android.ugc.aweme.kids.choosemusic.model.MusicCollectionFeedResponse musicCollectionFeedResponse = (com.ss.android.ugc.aweme.kids.choosemusic.model.MusicCollectionFeedResponse) c10k.LJIIJJI();
        c84939XVf.LIZIZ.jv0(Integer.valueOf(musicCollectionFeedResponse.cursor), "collection_feed_cursor");
        c84939XVf.LIZIZ.jv0(Integer.valueOf(musicCollectionFeedResponse.hasMore), "collection_feed_has_more");
        List list = (List) c84939XVf.LIZIZ.get("list");
        if (list == null) {
            c84939XVf.LIZIZ.jv0(1, "collection_feed_status");
            return null;
        }
        for (com.ss.android.ugc.aweme.kids.choosemusic.model.MusicCollectionFeed musicCollectionFeed : ((com.ss.android.ugc.aweme.kids.choosemusic.model.MusicCollectionFeedResponse) c10k.LJIIJJI()).musicCollectionFeedList) {
            list.add(new C84941XVh(C44384HbQ.LJIJJLI(musicCollectionFeed.musicList), musicCollectionFeed.collection));
        }
        c84939XVf.LIZIZ.jv0(list, "list");
        c84939XVf.LIZIZ.jv0(0, "collection_feed_status");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS115S0200000_15(Object obj, BaseAccountFlowFragment baseAccountFlowFragment, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.l1 = baseAccountFlowFragment;
    }
}
