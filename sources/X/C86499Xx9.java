package X;

import Y.AfS67S0100000_15;
import Y.AgS131S0100000_15;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy;
import com.ss.android.ugc.aweme.innerpush.idl.InnerPushApi;
import com.ss.android.ugc.aweme.innerpush.model.FrequencyStrategiesInfo;
import com.ss.android.ugc.aweme.innerpush.model.FrequencyStrategyPassInfo;
import com.ss.android.ugc.aweme.innerpush.settings.PullSettings;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Xx9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86499Xx9 {
    public static volatile int LIZ;
    public static volatile boolean LIZIZ;
    public static volatile long LIZJ;

    public static void LIZ(EnumC86518XxS type) {
        long j;
        o.LJIIIZ(type, "type");
        int i = C86519XxT.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        j = PullSettings.LIZ().accountSwitchDelaySeconds;
                    }
                    LIZIZ(type);
                }
                j = PullSettings.LIZ().hotStartDelaySeconds;
            } else {
                j = PullSettings.LIZ().warmStartDelaySeconds;
            }
        } else {
            j = PullSettings.LIZ().coldStartDelaySeconds;
        }
        if (j > 0) {
            C10K.LJII(j * 1000).LJ(new AgS131S0100000_15(type, 9), C10K.LJI, null);
            return;
        }
        LIZIZ(type);
    }

    public static void LIZIZ(EnumC86518XxS enumC86518XxS) {
        Object LIZ2;
        long j;
        boolean z = C84763XOl.LJIIJJI;
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        long uptimeMillis = SystemClock.uptimeMillis() - LIZJ;
        boolean z2 = C86500XxA.LJLJJL;
        if (!isLogin || LIZIZ || z || uptimeMillis < PullSettings.LIZ().minReqDurationSeconds * 1000 || z2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("pull blocked(");
            LIZ3.append(enumC86518XxS.getValue());
            LIZ3.append("), isUserLogin=");
            LIZ3.append(isLogin);
            LIZ3.append(", isRequesting=");
            C76965UIn.LIZJ(LIZ3, LIZIZ, ", isAppBackground=", z, ", reqDuration=");
            V1I.LIZJ(LIZ3, uptimeMillis, ", isPureMode=", z2);
            C86478Xwo.LIZIZ("InnerPushPuller", X1D.LIZIZ(LIZ3));
            return;
        }
        LIZIZ = true;
        LIZJ = SystemClock.uptimeMillis();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("pull start(");
        LIZ4.append(enumC86518XxS.getValue());
        LIZ4.append(')');
        C86478Xwo.LIZLLL("InnerPushPuller", X1D.LIZIZ(LIZ4));
        java.util.Map<String, ?> all = C86497Xx7.LJ().getAll();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String key : all.keySet()) {
            o.LJIIIIZZ(key, "key");
            long j2 = 0;
            if (ujb.o.LJJJLIIL(key, "record_ban_strategy", false)) {
                Long LJJIZ = C38350F3i.LJJIZ(key.subSequence(20, key.length()).toString());
                if (LJJIZ != null) {
                    j = LJJIZ.longValue();
                } else {
                    j = 0;
                }
                InnerPushBanStrategy LIZIZ2 = C86497Xx7.LIZIZ(j);
                arrayList2.add(new FrequencyStrategyPassInfo(j, LIZIZ2 != null ? !C86494Xx4.LJIIIZ(LIZIZ2) : true));
            }
            if (ujb.o.LJJJLIIL(key, "record_popup_limit_strategy", false)) {
                Long LJJIZ2 = C38350F3i.LJJIZ(key.subSequence(28, key.length()).toString());
                if (LJJIZ2 != null) {
                    j2 = LJJIZ2.longValue();
                }
                InnerPushPopupLimitStrategy LIZLLL = C86497Xx7.LIZLLL(j2);
                arrayList.add(new FrequencyStrategyPassInfo(j2, LIZLLL != null ? !C86494Xx4.LJIIJ(LIZLLL) : true));
            }
        }
        String LIZLLL2 = JsonParseUtils.LIZLLL(new FrequencyStrategiesInfo(arrayList, arrayList2));
        o.LJIIIIZZ(LIZLLL2, "toJSONString(info)");
        InnerPushApi.Api api = (InnerPushApi.Api) InnerPushApi.LIZIZ.getValue();
        int value = enumC86518XxS.getValue();
        ArrayList arrayList3 = new ArrayList();
        try {
            LinkedHashMap LJFF = C86497Xx7.LJFF();
            long currentTimeMillis = System.currentTimeMillis();
            for (Map.Entry entry : LJFF.entrySet()) {
                Object value2 = entry.getValue();
                o.LJIIIIZZ(value2, "config.value");
                if (((Number) value2).longValue() > currentTimeMillis) {
                    Object key2 = entry.getKey();
                    o.LJIIIIZZ(key2, "config.key");
                    arrayList3.add(key2);
                }
            }
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            C86478Xwo.LIZJ("SettingSyncHandler", "getFilterTypesJson error", m10exceptionOrNullimpl);
        }
        String LIZJ2 = C75792yF.LIZJ(arrayList3);
        o.LJIIIIZZ(LIZJ2, "toJson(filterTypeList)");
        C78999UzT.LJFF(api.getMessages(1, 1, 0L, value, LIZLLL2, LIZJ2).LJJL(T16.LIZ()).LJJIJL(C86504XxE.LJLIL).LJJJLIIL(new AfS67S0100000_15(enumC86518XxS, 60), new AfS67S0100000_15(enumC86518XxS, 61)), (C73318Sq2) InnerPushApi.LIZJ.getValue());
    }
}
