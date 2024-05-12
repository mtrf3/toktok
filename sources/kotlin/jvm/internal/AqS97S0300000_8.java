package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C26206AQg;
import X.C38350F3i;
import X.C49265JVd;
import X.C49266JVe;
import X.C49670JeU;
import X.C50699Jv5;
import X.C57430MgM;
import X.C76800UCe;
import X.C8RL;
import X.C8YF;
import X.EnumC46469ILp;
import X.InterfaceC212998Xn;
import X.InterfaceC37146Ehy;
import X.InterfaceC49264JVc;
import X.InterfaceC65784Pro;
import X.J21;
import X.JGU;
import X.JIB;
import X.JQT;
import X.JR1;
import X.JRB;
import X.JVP;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.SearchOpenSchemaMethod;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment$initAdapter$layoutManager$1;
import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class AqS97S0300000_8 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS97S0300000_8 aqS97S0300000_8) {
        C49266JVe c49266JVe = InterfaceC49264JVc.LIZ;
        EnumC46469ILp enumC46469ILp = EnumC46469ILp.GENERAL_SEARCH;
        Fragment fragment = (Fragment) aqS97S0300000_8.l0;
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8((GridLayoutManager) aqS97S0300000_8.l2, 126);
        C8YF<InterfaceC212998Xn<?, ?>, C8RL> c8yf = ((C49265JVd) aqS97S0300000_8.l1).LLFF;
        c49266JVe.getClass();
        return C49266JVe.LIZ(enumC46469ILp, fragment, aqS158S0100000_8, c8yf);
    }

    public static final Object invoke$1(AqS97S0300000_8 aqS97S0300000_8) {
        Context activityById;
        Iterator<String> keys;
        ((SearchOpenSchemaMethod) aqS97S0300000_8.l0).LJ((JSONObject) aqS97S0300000_8.l1);
        SearchOpenSchemaMethod searchOpenSchemaMethod = (SearchOpenSchemaMethod) aqS97S0300000_8.l0;
        JSONObject jSONObject = (JSONObject) aqS97S0300000_8.l1;
        InterfaceC37146Ehy interfaceC37146Ehy = (InterfaceC37146Ehy) aqS97S0300000_8.l2;
        searchOpenSchemaMethod.getClass();
        String optString = jSONObject.optString("schema");
        String optString2 = jSONObject.optString("reactId");
        Bundle bundle = new Bundle();
        JSONObject optJSONObject = jSONObject.optJSONObject("bundle_params");
        if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = optJSONObject.opt(next);
                if (opt != null) {
                    if (o.LJ("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", next) && C38350F3i.LJJIL(opt.toString()) != null) {
                        bundle.putInt(next, CastIntegerProtector.parseInt(opt.toString()));
                    } else {
                        bundle.putString(next, opt.toString());
                    }
                }
            }
        }
        if (TextUtils.isEmpty(optString2)) {
            activityById = searchOpenSchemaMethod.getContext();
        } else {
            activityById = searchOpenSchemaMethod.getActivityById(optString2);
        }
        if (optString2 != null && optString2.length() != 0) {
            activityById = searchOpenSchemaMethod.getActivityById(optString2);
        }
        if (TextUtils.isEmpty(optString)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Invalid schema param: ");
            LIZ.append(optString);
            interfaceC37146Ehy.LIZ(-3, X1D.LIZIZ(LIZ));
        } else if (!(activityById instanceof Activity)) {
            interfaceC37146Ehy.LIZ(0, "Context is not valid activity");
        } else if (!TextUtils.isEmpty(optString)) {
            SmartRoute smartRoute = new SmartRoute(activityById);
            smartRoute.withUrl(optString);
            smartRoute.withParam(bundle);
            smartRoute.withCallback(new C49670JeU(interfaceC37146Ehy));
            smartRoute.open();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS97S0300000_8 aqS97S0300000_8) {
        Context activityById;
        Iterator<String> keys;
        String optString;
        int hashCode;
        ((SearchOpenSchemaMethod) aqS97S0300000_8.l0).LJ((JSONObject) aqS97S0300000_8.l1);
        SearchOpenSchemaMethod searchOpenSchemaMethod = (SearchOpenSchemaMethod) aqS97S0300000_8.l0;
        JSONObject jSONObject = (JSONObject) aqS97S0300000_8.l1;
        searchOpenSchemaMethod.getClass();
        String optString2 = jSONObject.optString("schema");
        String optString3 = jSONObject.optString("reactId");
        JSONObject optJSONObject = jSONObject.optJSONObject("log_params");
        if (optJSONObject != null && (optString = optJSONObject.optString("from_card_type")) != null && ((hashCode = optString.hashCode()) == -780512022 ? optString.equals("music_card") : hashCode == -283221688 ? optString.equals("user_video_card") : !(hashCode != 339013380 || !optString.equals("user_card")))) {
            new C50699Jv5(searchOpenSchemaMethod.getContext()).LJI();
        }
        Bundle bundle = new Bundle();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("bundle_params");
        if (optJSONObject2 != null && (keys = optJSONObject2.keys()) != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = optJSONObject2.opt(next);
                if (opt != null) {
                    if (o.LJ("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", next) && C38350F3i.LJJIL(opt.toString()) != null) {
                        bundle.putInt(next, CastIntegerProtector.parseInt(opt.toString()));
                    } else {
                        bundle.putString(next, opt.toString());
                    }
                }
            }
        }
        if (TextUtils.isEmpty(optString3)) {
            activityById = searchOpenSchemaMethod.getContext();
        } else {
            activityById = searchOpenSchemaMethod.getActivityById(optString3);
        }
        if (optString3 != null && optString3.length() != 0) {
            activityById = searchOpenSchemaMethod.getActivityById(optString3);
        }
        if (!TextUtils.isEmpty(optString2) && (activityById instanceof Activity)) {
            SmartRoute smartRoute = new SmartRoute(activityById);
            smartRoute.withUrl(optString2);
            smartRoute.withParam(bundle);
            smartRoute.open();
        }
        ((InterfaceC37146Ehy) aqS97S0300000_8.l2).onSuccess(new JSONObject());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS97S0300000_8 aqS97S0300000_8) {
        ((DVideoPreloadManager) aqS97S0300000_8.l0).LIZLLL.addPreloadItem((SimVideoUrlModel) aqS97S0300000_8.l1, (C26206AQg) aqS97S0300000_8.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS97S0300000_8 aqS97S0300000_8) {
        View view = (View) aqS97S0300000_8.l0;
        JVP jvp = (JVP) aqS97S0300000_8.l1;
        SearchVideoHolder searchVideoHolder = new SearchVideoHolder(view, "", jvp.LJLJI, jvp.LJLLJ, jvp.LLFF, (Fragment) aqS97S0300000_8.l2);
        JVP jvp2 = (JVP) aqS97S0300000_8.l1;
        searchVideoHolder.LL(jvp2.LJLILLLLZI);
        JQT jqt = jvp2.LJLJLLL;
        if (jqt != null && ((Number) J21.LIZ.getValue()).intValue() != 0) {
            searchVideoHolder.LLJILJIL = jqt;
        }
        searchVideoHolder.LLJILJILJ = jvp2.LJLL;
        JQT jqt2 = ((JVP) aqS97S0300000_8.l1).LJLJLLL;
        if (jqt2 != null) {
            jqt2.LJJIJLIJ(searchVideoHolder);
        }
        return searchVideoHolder;
    }

    public static final Object invoke$5(AqS97S0300000_8 aqS97S0300000_8) {
        int i;
        Integer LJJIL;
        String accountType = ((MusNotice) aqS97S0300000_8.l0).getAccountType();
        String str = (String) ((Map) aqS97S0300000_8.l1).get("from");
        if (str != null && (LJJIL = C38350F3i.LJJIL(str)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        return new C57430MgM("notification_page", null, null, null, null, null, null, null, null, null, null, null, accountType, null, null, null, null, 0, 0, null, i, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, (Map) aqS97S0300000_8.l2, null, -2101250, 383);
    }

    public static final Object invoke$6(AqS97S0300000_8 aqS97S0300000_8) {
        return new JR1(((JRB) aqS97S0300000_8.l0).LJIIJJI(), ((JRB) aqS97S0300000_8.l0).LJIIIZ(), (JGU) aqS97S0300000_8.l1, (JIB) aqS97S0300000_8.l2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0300000_8(JRB jrb, JGU jgu, JIB jib, int i) {
        super(0);
        this.$t = i;
        this.l0 = jrb;
        this.l1 = jgu;
        this.l2 = jib;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0300000_8(View view, JVP jvp, Fragment fragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = jvp;
        this.l2 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0300000_8(Fragment fragment, C49265JVd c49265JVd, SearchJediMixFeedFragment$initAdapter$layoutManager$1 searchJediMixFeedFragment$initAdapter$layoutManager$1, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = c49265JVd;
        this.l2 = searchJediMixFeedFragment$initAdapter$layoutManager$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS97S0300000_8(MusNotice musNotice, MusNotice musNotice2, Map<String, String> map, Map<String, String> map2) {
        super(0);
        this.$t = map2;
        this.l0 = musNotice;
        this.l1 = musNotice2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0300000_8(SearchOpenSchemaMethod searchOpenSchemaMethod, JSONObject jSONObject, InterfaceC37146Ehy interfaceC37146Ehy, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchOpenSchemaMethod;
        this.l1 = jSONObject;
        this.l2 = interfaceC37146Ehy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0300000_8(DVideoPreloadManager dVideoPreloadManager, SimVideoUrlModel simVideoUrlModel, C26206AQg c26206AQg, int i) {
        super(0);
        this.$t = i;
        this.l0 = dVideoPreloadManager;
        this.l1 = simVideoUrlModel;
        this.l2 = c26206AQg;
    }
}
