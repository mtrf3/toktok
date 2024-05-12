package Y;

import X.AbstractC73672Svk;
import X.C35794E3a;
import X.C35936E8m;
import X.C36241EKf;
import X.C36956Eeu;
import X.C36966Ef4;
import X.C61878OQg;
import X.C68322mC;
import X.C68972R5c;
import X.C73810Sxy;
import X.C74219TAx;
import X.C78685UuP;
import X.C85579XiJ;
import X.E3Y;
import X.FMX;
import X.G2M;
import X.InterfaceC48038ItG;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.GetTokenResponse;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerCategoryListViewModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDhS99S0100000_6 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case 9:
                return apply$9(this, obj);
            case 10:
                return apply$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return apply$11(this, obj);
            case 12:
                return apply$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return apply$13(this, obj);
            default:
                return null;
        }
    }

    public IDhS99S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        ITpcConsentService tpcConsentService = (ITpcConsentService) obj;
        o.LJIIIZ(tpcConsentService, "tpcConsentService");
        return AbstractC73672Svk.LJJIJIL(new G2M(tpcConsentService, new WeakReference(((AbstractSelectInterestFragment) iDhS99S0100000_6.l0).requireActivity())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        InterfaceC88472Yns<Effect, Boolean> interfaceC88472Yns = ((InfoStickerCategoryListViewModel) iDhS99S0100000_6.l0).LJLJLJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : it) {
            if (((Boolean) interfaceC88472Yns.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final Object apply$10(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        int i;
        C35794E3a it = (C35794E3a) obj;
        o.LJIIIZ(it, "it");
        InfoStickerListModel infoStickerListModel = (InfoStickerListModel) it.LIZ();
        boolean z = false;
        if (infoStickerListModel == null) {
            return new OSZ(new E3Y(((E3Y) iDhS99S0100000_6.l0).LJLIL, false), new OSZ(C61878OQg.INSTANCE, null));
        }
        if (infoStickerListModel.getSticker_list() != null) {
            List<InfoStickerEffect> sticker_list = infoStickerListModel.getSticker_list();
            o.LJI(sticker_list);
            if (!sticker_list.isEmpty()) {
                Integer cursor = infoStickerListModel.getCursor();
                if (cursor != null) {
                    i = cursor.intValue();
                } else {
                    i = 0;
                }
                Boolean has_more = infoStickerListModel.getHas_more();
                if (has_more != null) {
                    z = has_more.booleanValue();
                }
                E3Y e3y = new E3Y(i, z);
                List<InfoStickerEffect> sticker_list2 = infoStickerListModel.getSticker_list();
                if (sticker_list2 == null) {
                    sticker_list2 = C61878OQg.INSTANCE;
                }
                return new OSZ(e3y, new OSZ(sticker_list2, infoStickerListModel));
            }
        }
        return new OSZ(new E3Y(((E3Y) iDhS99S0100000_6.l0).LJLIL, false), new OSZ(C61878OQg.INSTANCE, infoStickerListModel));
    }

    public static final Object apply$11(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        OSZ<? extends List<? extends Aweme>, Integer> it = (OSZ) obj;
        o.LJIIIZ(it, "it");
        return ((KidsFeedViewModel) iDhS99S0100000_6.l0).gv0(it);
    }

    public static final Object apply$12(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        OSZ<? extends List<? extends Aweme>, Integer> it = (OSZ) obj;
        o.LJIIIZ(it, "it");
        return ((KidsFeedViewModel) iDhS99S0100000_6.l0).gv0(it);
    }

    public static final Object apply$13(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        OSZ<? extends List<? extends Aweme>, Integer> it = (OSZ) obj;
        o.LJIIIZ(it, "it");
        return ((KidsFeedViewModel) iDhS99S0100000_6.l0).gv0(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$2(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        InterfaceC88472Yns<Effect, Boolean> interfaceC88472Yns = ((InfoStickerCategoryListViewModel) iDhS99S0100000_6.l0).LJLJLJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : it) {
            if (((Boolean) interfaceC88472Yns.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    public static final Object apply$3(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        ?? r0;
        String str;
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        o.LJIIIZ(getTokenResponse, "getTokenResponse");
        C68322mC c68322mC = (C68322mC) iDhS99S0100000_6.l0;
        GetTokenResponse.Data data = getTokenResponse.data;
        if (data != null) {
            r0 = data.token;
        } else {
            r0 = 0;
        }
        c68322mC.element = r0;
        boolean LJJJZ = C78685UuP.LJJJZ(r0);
        C68972R5c.LIZ.put("authorize_request_result", Long.valueOf(System.currentTimeMillis()));
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("mode", "si");
        if (LJJJZ) {
            str = "success";
        } else {
            str = "fail";
        }
        c35936E8m.LIZLLL("request_status", str);
        c35936E8m.LIZLLL("carrier", C85579XiJ.LIZ());
        c35936E8m.LIZ(C68972R5c.LIZLLL("phone_instant_login_click"), "stay_time");
        FMX.LJIIL("authorize_request_result", c35936E8m.LIZ);
        CharSequence charSequence = (CharSequence) ((C68322mC) iDhS99S0100000_6.l0).element;
        if (charSequence == null || charSequence.length() == 0) {
            throw new C36241EKf(getTokenResponse.code, getTokenResponse.message, "get token error");
        }
        return ((C68322mC) iDhS99S0100000_6.l0).element;
    }

    public static final Object apply$4(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        C74219TAx c74219TAx = (C74219TAx) iDhS99S0100000_6.l0;
        int i = c74219TAx.LJLIL;
        c74219TAx.LJLIL = i + 1;
        if (i < 3) {
            return AbstractC73672Svk.LJJLIIIJLJLI(1500L, TimeUnit.MILLISECONDS);
        }
        return AbstractC73672Svk.LJJI(throwable);
    }

    public static final Object apply$5(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        OSZ<? extends List<? extends Aweme>, Integer> it = (OSZ) obj;
        o.LJIIIZ(it, "it");
        return ((KidsAwemeGridViewModel) iDhS99S0100000_6.l0).gv0(it);
    }

    public static final Object apply$6(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        OSZ<? extends List<? extends Aweme>, Integer> it = (OSZ) obj;
        o.LJIIIZ(it, "it");
        return ((KidsAwemeGridViewModel) iDhS99S0100000_6.l0).gv0(it);
    }

    public static final Object apply$7(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        String url = (String) obj;
        o.LJIIIZ(url, "url");
        return new C73810Sxy(url, (Map) iDhS99S0100000_6.l0);
    }

    public static final Object apply$8(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        C36956Eeu c36956Eeu = (C36956Eeu) iDhS99S0100000_6.l0;
        int i = c36956Eeu.LJLIL;
        c36956Eeu.LJLIL = i + 1;
        if (i < 3) {
            return AbstractC73672Svk.LJJLIIIJLJLI(0L, TimeUnit.MILLISECONDS);
        }
        return AbstractC73672Svk.LJJI(throwable);
    }

    public static final Object apply$9(IDhS99S0100000_6 iDhS99S0100000_6, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        C36966Ef4 c36966Ef4 = (C36966Ef4) iDhS99S0100000_6.l0;
        int i = c36966Ef4.LJLJI;
        int i2 = i + 1;
        c36966Ef4.LJLJI = i2;
        if (i < c36966Ef4.LJLIL) {
            return AbstractC73672Svk.LJJLIIIJLJLI(c36966Ef4.LJLILLLLZI * i2, TimeUnit.MILLISECONDS);
        }
        return AbstractC73672Svk.LJJI(throwable);
    }
}
