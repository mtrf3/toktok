package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.translation.api.ObservableTranslationApi;
import com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86713Y1l extends AbstractC86724Y1w<C69402nw> implements InterfaceC86658Xzi {
    public static final C86713Y1l LIZIZ = new C86713Y1l();
    public static final Y2V LIZJ = Y2V.RT_CAPTIONS;
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C86756Y3c.LJLIL);
    public static final HashMap<String, Y2A> LJ = new HashMap<>();
    public static boolean LJFF;

    @Override // X.AbstractC86724Y1w
    public final Y20<C69402nw> LIZJ() {
        return (Y20) LIZLLL.getValue();
    }

    @Override // X.AbstractC86724Y1w
    public final Y2V LIZLLL() {
        return LIZJ;
    }

    @Override // X.AbstractC86724Y1w
    public final boolean LJIIIIZZ(C69402nw c69402nw) {
        return c69402nw.LJLJJI;
    }

    public static String LJIIJ(Aweme aweme, String targetLang) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(targetLang, "targetLang");
        return ((Y20) LIZLLL.getValue()).LIZIZ(aweme, targetLang);
    }

    @Override // X.InterfaceC86658Xzi
    public final void LIZ(Aweme aweme, TBB newStatus) {
        String str;
        int i;
        Integer num;
        Integer num2;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(newStatus, "newStatus");
        Y01 y01 = Y01.LIZIZ;
        Y2A y2a = LJ.get(LJIIJ(aweme, y01.LJJIIZI()));
        if (y2a != null) {
            TBB tbb = y2a.LJLIL;
            TBB tbb2 = TBB.CLA_REALTIME_STATUS_REQUESTED;
            if (tbb == tbb2 && newStatus != tbb2) {
                C69402nw LJ2 = LIZIZ.LJ(aweme, y01.LJJIIZI());
                if (y2a.LJLJJI == null) {
                    y2a.LJLJJI = Long.valueOf(System.currentTimeMillis() - y2a.LJLILLLLZI);
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("load_status", newStatus.getStatusName());
                c188727au.LJIIIZ("enter_from", y2a.LJLJI);
                c188727au.LJIIIZ("group_id", aweme.getAid());
                CaptionItemModel LJIIIIZZ = C86670Xzu.LJIIIIZZ(aweme);
                if (LJIIIIZZ == null || (str = LJIIIIZZ.getLanguageCode()) == null) {
                    str = "";
                }
                c188727au.LJIIIZ("subtitle_source_lang", str);
                c188727au.LJIIIZ("target_lang", y01.LJJIIZI());
                c188727au.LJFF(y2a.LJLJJI, "load_duration_overall");
                int i2 = -1;
                if (LJ2 != null && (num2 = LJ2.LJLJJL) != null) {
                    i = num2.intValue();
                } else {
                    i = -1;
                }
                c188727au.LIZLLL(i, "ai_lab_duration");
                if (LJ2 != null && (num = LJ2.LJLJJLL) != null) {
                    i2 = num.intValue();
                }
                c188727au.LIZLLL(i2, "check_server_cache_duration");
                FMX.LJIIL("subtitle_translation_status", c188727au.LIZ);
            }
            if (y2a.LJLIL.compareTo(newStatus) < 0) {
                y2a.LJLIL = newStatus;
            }
        }
    }

    @Override // X.InterfaceC86658Xzi
    public final boolean LIZIZ(Aweme aweme, String languageCode) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(languageCode, "languageCode");
        if (languageCode.length() == 0) {
            return false;
        }
        Y2A y2a = LJ.get(LJIIJ(aweme, Y01.LIZIZ.LJJIIZI()));
        if (y2a != null && y2a.LJLIL == TBB.CLA_REALTIME_STATUS_SUCCESS) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC86724Y1w
    public final AbstractC73672Svk<Boolean> LJII(Aweme aweme, InterfaceC86733Y2f interfaceC86733Y2f, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (Y04.LIZLLL(aweme) != null) {
            String LJJIIZI = Y01.LIZIZ.LJJIIZI();
            ((Y20) LIZLLL.getValue()).LIZLLL(aweme, new C69402nw(Y04.LJ(aweme), null, LJJIIZI, false, null, null, null), LJJIIZI);
            return AbstractC73672Svk.LJJIJIL(Boolean.TRUE);
        }
        Y01 y01 = Y01.LIZIZ;
        if (y01.LJIJJLI(aweme, y01.LJJIIZI())) {
            String LJJIIZI2 = y01.LJJIIZI();
            LJFF = true;
            String LJIIJ = LJIIJ(aweme, LJJIIZI2);
            Long LJIIJ2 = C86670Xzu.LJIIJ(aweme);
            if (LJIIJ2 != null) {
                long longValue = LJIIJ2.longValue();
                LIZIZ.getClass();
                return LJIIIZ(longValue, LJJIIZI2, aweme, LJIIJ, enterFrom, interfaceC86733Y2f);
            }
            LJFF(interfaceC86733Y2f, Y2M.NO_SUBTITLE_ID.name());
        } else {
            LJFF(interfaceC86733Y2f, Y2M.RT_TRANSLATION_NOT_SUPPORTED.name());
        }
        return AbstractC73672Svk.LJJIJIL(Boolean.FALSE);
    }

    public static C73454SsE LJIIIZ(long j, String str, Aweme aweme, String key, String enterFrom, InterfaceC86733Y2f interfaceC86733Y2f) {
        AbstractC73672Svk<RealtimeCaptionsTranslationResult> abstractC73672Svk;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(enterFrom, "enterFrom");
        LJ.put(key, new Y2A(enterFrom, 3));
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        try {
            ObservableTranslationApi.ITranslationAPI LIZ = TBA.LIZ();
            if (LIZ == null || (abstractC73672Svk = LIZ.getClaSubtitlesTranslations(j, str, aid, enterFrom)) == null) {
                abstractC73672Svk = C73536StY.LJLIL;
                o.LJIIIIZZ(abstractC73672Svk, "empty()");
            }
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
            abstractC73672Svk = C73536StY.LJLIL;
            o.LJIIIIZZ(abstractC73672Svk, "empty()");
        }
        return abstractC73672Svk.LJJJ(T16.LIZ()).LJJIJL(new TB2(aweme, str)).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new C86720Y1s(aweme, interfaceC86733Y2f, j, str)).LJJJ(T16.LIZ());
    }
}
