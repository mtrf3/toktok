package X;

import Y.ACallableS110S0100000_7;
import Y.ACallableS34S1100000_7;
import Y.AgS110S0200000_7;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commerce.tools.common.EventCenter;
import com.ss.android.ugc.aweme.commerce.tools.promote.IEventCenter;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.Go6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42622Go6 {
    public static Integer LIZIZ;
    public static String LIZJ;
    public static Integer LIZLLL;
    public static java.util.Map<String, PromoteReplaceMusicRequest> LJ;
    public static boolean LJIIIZ;
    public static boolean LJIILIIL;
    public static boolean LJIILJJIL;
    public static final C42622Go6 LIZ = new C42622Go6();
    public static final java.util.Map<String, C10K<SuggestMusicList>> LJFF = new HashMap();
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C42628GoC.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C42629GoD.LJLIL);
    public static final Keva LJIIIIZZ = Keva.getRepo("promote_replace_music_keva");
    public static PromoteReplaceMusicRequest LJIIJ = new PromoteReplaceMusicRequest();
    public static String LJIIJJI = "";
    public static final QWV LJIIL = new QWV();

    public static java.util.Map LIZIZ() {
        try {
            String string = LJIIIIZZ.getString("promote_replace_music_map_key", null);
            if (!TextUtils.isEmpty(string)) {
                return (java.util.Map) C44172HVg.LIZIZ.LJII(string, new C42626GoA().getType());
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PromoteReplaceMusic getLocalData Exception: ");
            LIZ2.append(e);
            C36922EeM.LJ(X1D.LIZIZ(LIZ2));
            C36922EeM.LJFF(e);
        }
        return null;
    }

    public static final void LJFF() {
        LJIIJ = new PromoteReplaceMusicRequest();
        LJIIIZ = false;
        LJIILIIL = false;
    }

    public static final boolean LJI() {
        if (H92.LJ() && LJIILJJIL) {
            return true;
        }
        return false;
    }

    public static final void LJIILIIL() {
        if (C35154Dqw.LIZ()) {
            C67128QWe.LIZIZ.LJIIJJI(LJIIL);
            return;
        }
        EventBus LIZJ2 = EventBus.LIZJ();
        QWV qwv = LJIIL;
        if (!LIZJ2.LJI(qwv)) {
            return;
        }
        EventBus.LIZJ().LJIJ(qwv);
    }

    public static final C10K<SuggestMusicList> LIZJ(String str) {
        String str2;
        C10K<SuggestMusicList> c10k = (C10K) ((HashMap) LJFF).get(str);
        if (c10k != null && c10k.LJIIJJI() != null) {
            str2 = "Succeed";
        } else {
            str2 = "Failed";
        }
        if (!LJIILIIL) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("status", str2);
            FMX.LJIIL("Promote_prefetch_response_status", c145995oB.LIZ);
            LJIILIIL = true;
        }
        if (c10k == null || c10k.LJIIL() || c10k.LJIILJJIL() || c10k.LJIIJJI() == null) {
            return null;
        }
        return c10k;
    }

    public static final PromoteReplaceMusicRequest LIZLLL(String aid) {
        o.LJIIIZ(aid, "aid");
        java.util.Map<String, PromoteReplaceMusicRequest> map = LJ;
        if (map != null || (map = LIZIZ()) != null) {
            return map.get(aid);
        }
        return null;
    }

    public static final boolean LJ(String str) {
        if (str == null) {
            return false;
        }
        java.util.Map<String, PromoteReplaceMusicRequest> map = LJ;
        if ((map == null && (map = LIZIZ()) == null) || !map.containsKey(str)) {
            return false;
        }
        return true;
    }

    public static final void LJII(boolean z) {
        IEventCenter LIZIZ2 = EventCenter.LIZIZ();
        String jSONObject = C770830u.LIZLLL("status", z ? 1 : 0).toString();
        o.LJIIIIZZ(jSONObject, "JSONObject().apply {\n   …\n            }.toString()");
        LIZIZ2.LIZ("promote_video_visibility_result", jSONObject);
    }

    public static final void LJIIJ(android.net.Uri uri) {
        String queryParameter;
        Integer num;
        int i;
        Integer num2;
        if (uri == null || (queryParameter = UriProtector.getQueryParameter(uri, "item_id")) == null) {
            return;
        }
        Object queryParameter2 = UriProtector.getQueryParameter(uri, "user_account_type");
        if (queryParameter2 instanceof Integer) {
            num = (Integer) queryParameter2;
        } else {
            num = null;
        }
        int i2 = -1;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        Object queryParameter3 = UriProtector.getQueryParameter(uri, "new_user");
        if ((queryParameter3 instanceof Integer) && (num2 = (Integer) queryParameter3) != null) {
            i2 = num2.intValue();
        }
        LJIILJJIL = o.LJ(UriProtector.getQueryParameter(uri, "new_version"), "1");
        LIZIZ = Integer.valueOf(i);
        LIZJ = queryParameter;
        LIZLLL = Integer.valueOf(i2);
    }

    public static final void LJIIJJI(String str) {
        o.LJIIIZ(str, "<set-?>");
        LJIIJJI = str;
    }

    public final void LIZ(String str) {
        java.util.Map LIZIZ2;
        if (!LJ(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Keva keva = LJIIIIZZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("_promote_replace_music_request_sava_time");
        long j = 60;
        if ((((currentTimeMillis - keva.getLong(X1D.LIZIZ(LIZ2), 0L)) / 1000) / j) / j >= ((Number) LJI.getValue()).intValue() && (LIZIZ2 = LIZIZ()) != null) {
            C65777Prh.LIZJ(LIZIZ2).remove(str);
            C10K.LIZJ(new ACallableS34S1100000_7(LIZIZ2, null, 5));
        }
    }

    public static final void LJIIIIZZ(PromoteReplaceMusicRequest model, Context context) {
        o.LJIIIZ(model, "model");
        if (TextUtils.isEmpty(model.getItemID())) {
            return;
        }
        if (LJ == null) {
            LJ = Collections.synchronizedMap(new HashMap());
        }
        java.util.Map<String, PromoteReplaceMusicRequest> map = LJ;
        if (map != null) {
            map.put(model.getItemID(), model);
        }
        java.util.Map<String, PromoteReplaceMusicRequest> map2 = LJ;
        String itemID = model.getItemID();
        if (map2 != null) {
            C10K.LIZJ(new ACallableS34S1100000_7(map2, itemID, 5));
        }
        if (C35154Dqw.LIZ()) {
            C67128QWe c67128QWe = C67128QWe.LIZIZ;
            QWV qwv = LJIIL;
            c67128QWe.LIZJ(20216, 1, qwv);
            c67128QWe.LIZJ(20173, 1, qwv);
        } else {
            EventBus LIZJ2 = EventBus.LIZJ();
            QWV qwv2 = LJIIL;
            if (!LIZJ2.LJI(qwv2)) {
                EventBus.LIZJ().LJIILJJIL(qwv2);
            }
        }
        C10K.LIZJ(new ACallableS110S0100000_7(model, 51)).LJ(new AgS110S0200000_7(model, context, 15), C10K.LJIIIIZZ, null);
    }

    public static final void LJIIIZ(String str, String str2) {
        int i;
        C10K c10k;
        if (str == null || str2 == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = (HashMap) LJFF;
        if (hashMap.get(str) != null && (c10k = (C10K) hashMap.get(str)) != null && c10k.LJIIJJI() != null) {
            i = 1;
        } else {
            C10K<SuggestMusicList> LJIILIIL2 = MusicService.LJJLIIIJJI().LJIILIIL(str, str2);
            o.LJIIIIZZ(LJIILIIL2, "get().getService(IMusicS…usicList(itemId, musicId)");
            hashMap.put(str, LJIILIIL2);
            AbstractC73672Svk.LJIIJ(new C42623Go7(str, currentTimeMillis)).LJJJJZ();
            i = 0;
        }
        FMX.LJIIL("Promote_music_prefetch", GFJ.LIZIZ(i, "have_cache").LIZ);
    }

    public static void LJIIL(long j, boolean z) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(currentTimeMillis - j, "duration");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c145995oB.LIZ(i, "status");
        FMX.LJIIL("Promote_music_prefetch_result", c145995oB.LIZ);
    }
}
