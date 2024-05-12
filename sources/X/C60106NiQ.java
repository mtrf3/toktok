package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commerce.BizAccount;
import com.ss.android.ugc.aweme.commerce.BrandedContent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NiQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60106NiQ {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(String str) {
        BrandedContent brandedContent;
        List<String> list = null;
        try {
            BizAccount bizAccount = (BizAccount) SettingsManager.LIZLLL().LJIIIIZZ("biz_account", BizAccount.class, null);
            if (bizAccount != null && (brandedContent = bizAccount.getBrandedContent()) != null) {
                list = brandedContent.getEnterFroms();
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final String LIZIZ(long j) {
        if (1000 <= j && j < 10000) {
            BigDecimal divide = new BigDecimal(j).divide(new BigDecimal(1000), 1, RoundingMode.HALF_UP);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(divide.toString());
            LIZ2.append('K');
            return X1D.LIZIZ(LIZ2);
        }
        return C77123UOp.LJJIIJ(j);
    }

    public static void LIZLLL(String str) {
        m mVar;
        j jVar;
        Boolean bool;
        if (str == null || str.length() == 0) {
            return;
        }
        j parse = GsonProtectorUtils.parse(new o(), str);
        if (parse != null) {
            mVar = parse.LJIIZILJ();
        } else {
            mVar = null;
        }
        Gson gson = new Gson();
        if (mVar != null) {
            jVar = mVar.LJJIJ("gecko_channel");
        } else {
            jVar = null;
        }
        List list = (List) GsonProtectorUtils.fromJson(gson, jVar, new TypeToken<List<? extends String>>() { // from class: X.7qV
        }.getType());
        if (list == null || list.isEmpty()) {
            return;
        }
        String accessKey = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAccessKey();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("gecko_channel", (String) ListProtector.get(list, i));
            C58909NAb.LIZ.getClass();
            if (NH3.LIZIZ() != null) {
                bool = Boolean.valueOf(O3U.LIZ(accessKey, (String) ListProtector.get(list, i)));
            } else {
                bool = null;
            }
            c188727au.LJFF(bool, "exists");
            FMX.LJIIL("gecko_resource_exists", c188727au.LIZ);
        }
    }

    public static void LJ(Context context) {
        String str;
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        Activity LJFF = LJFF(context);
        if (LJFF != null) {
            C26045AKb c26045AKb = new C26045AKb(LJFF);
            Resources resources = context.getResources();
            if (resources != null) {
                str = resources.getString(R.string.im9);
            } else {
                str = null;
            }
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
    }

    public static Activity LJFF(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                Context baseContext = contextWrapper.getBaseContext();
                kotlin.jvm.internal.o.LJII(baseContext, "null cannot be cast to non-null type android.app.Activity");
                return (Activity) baseContext;
            }
        }
        return C84763XOl.LJIIIIZZ();
    }

    public static void LIZJ(Aweme aweme, boolean z) {
        String str;
        String str2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "video_play");
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("item_id", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("remove_success", str2);
        FMX.LJIIL("ttelite_BA_bctool_video_remove_tag", c188727au.LIZ);
    }

    public static void LJI(Aweme aweme, String str, String str2, String anchorId, String anchorType, String enterFrom) {
        String str3;
        kotlin.jvm.internal.o.LJIIIZ(anchorId, "anchorId");
        kotlin.jvm.internal.o.LJIIIZ(anchorType, "anchorType");
        kotlin.jvm.internal.o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "tcm_comment");
        c188727au.LJIIIZ("enter_from", enterFrom);
        String str4 = null;
        if (aweme != null) {
            str3 = aweme.getGroupId();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("group_id", str3);
        if (aweme != null) {
            str4 = aweme.getAuthorUid();
        }
        c188727au.LJIIIZ("author_id", str4);
        c188727au.LJIIIZ("is_ad_signal", str2);
        c188727au.LJIIIZ("anchor_id", anchorId);
        c188727au.LJIIIZ("anchor_type", anchorType);
        C211648Si.LIZ(c188727au, aweme, enterFrom, ujb.o.LJJJJIZL("multi_anchor_entrance_show", str, true));
        FMX.LJIIL(str, c188727au.LIZ);
    }
}
