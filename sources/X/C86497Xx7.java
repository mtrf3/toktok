package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy;
import com.ss.android.ugc.aweme.innerpush.settings.InnerPushConfig;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.Xx7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86497Xx7 {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LJ() {
        long j;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("repo_in_app_push_");
        Object value = C57419MgB.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-UserService>(...)");
        String curUserId = ((IAccountUserService) value).getCurUserId();
        o.LJIIIIZZ(curUserId, "UserService.curUserId");
        Long LJJIZ = C38350F3i.LJJIZ(curUserId);
        if (LJJIZ != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        LIZ2.append(j);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(repo, "getRepo(REPO_PREFIX + (U…Id.toLongOrNull() ?: 0L))");
        return repo;
    }

    public static LinkedHashMap LJFF() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) GsonProtectorUtils.fromJson(C75792yF.LIZIZ(), LJ().getString("setting_sync_expire_config", ""), new VKG().getType());
        if (linkedHashMap == null) {
            return new LinkedHashMap();
        }
        return linkedHashMap;
    }

    public static String LIZ(long j) {
        return C61845OOz.LIZ("record_ban_strategy_", j);
    }

    public static InnerPushBanStrategy LIZIZ(long j) {
        Object obj;
        String cacheString = LJ().getString(LIZ(j), "");
        o.LJIIIIZZ(cacheString, "cacheString");
        try {
            obj = JsonParseUtils.LIZJ(InnerPushBanStrategy.class, cacheString);
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            obj = null;
            if (LJFF != null) {
                C86496Xx6.LJIIIIZZ(null, "json_parse_object", LJFF.getMessage());
            }
        }
        return (InnerPushBanStrategy) obj;
    }

    public static String LIZJ(long j) {
        return C61845OOz.LIZ("record_popup_limit_strategy_", j);
    }

    public static InnerPushPopupLimitStrategy LIZLLL(long j) {
        Object obj;
        String cacheString = LJ().getString(LIZJ(j), "");
        o.LJIIIIZZ(cacheString, "cacheString");
        try {
            obj = JsonParseUtils.LIZJ(InnerPushPopupLimitStrategy.class, cacheString);
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            obj = null;
            if (LJFF != null) {
                C86496Xx6.LJIIIIZZ(null, "json_parse_object", LJFF.getMessage());
            }
        }
        return (InnerPushPopupLimitStrategy) obj;
    }

    public static void LJI(InnerPushMessage message) {
        List arrayList;
        o.LJIIIZ(message, "message");
        String valueOf = String.valueOf(message.getId());
        int intValue = ((Number) InnerPushConfig.LJ.getValue()).intValue();
        String string = LJ().getString("record_for_external_displayed_id_list", "");
        if (!TextUtils.isEmpty(string)) {
            arrayList = C75792yF.LIZLLL(Object[].class, string);
        } else {
            arrayList = new ArrayList();
        }
        XLZ xlz = new XLZ(arrayList, intValue);
        xlz.LIZ(valueOf);
        LJ().storeString("record_for_external_displayed_id_list", C75792yF.LIZJ(xlz.LIZIZ));
    }

    public static void LJII(long j, boolean z) {
        List arrayList;
        String string = LJ().getString("wait_status_messages", "");
        if (!TextUtils.isEmpty(string)) {
            arrayList = C75792yF.LIZLLL(Object[].class, string);
        } else {
            arrayList = new ArrayList();
        }
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        copyOnWriteArraySet.addAll(arrayList);
        String valueOf = String.valueOf(j);
        if (z) {
            copyOnWriteArraySet.add(valueOf);
        } else {
            copyOnWriteArraySet.remove(valueOf);
        }
        LJ().storeString("wait_status_messages", C75792yF.LIZJ(ORZ.LLJI(copyOnWriteArraySet)));
    }
}
