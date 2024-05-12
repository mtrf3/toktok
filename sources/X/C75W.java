package X;

import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.75W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C75W {
    public static final Keva LIZ;
    public static final Gson LIZIZ;
    public static String LIZJ;
    public static C35979EAd<String, Long> LIZLLL;

    static {
        Keva repo = Keva.getRepo("comment_personalized_emoji");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
        LIZIZ = GsonHolder.LIZLLL().LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("used_emojis_");
        LIZ2.append(AccountService.LJIJ().LJFF().getCurUserId());
        LIZJ = X1D.LIZIZ(LIZ2);
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(new LEA() { // from class: X.75X
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    C75W.LIZLLL = null;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("used_emojis_");
                    LIZ3.append(AccountService.LJIJ().LJFF().getCurUserId());
                    C75W.LIZJ = X1D.LIZIZ(LIZ3);
                }
            }
        });
    }

    public static C35979EAd LIZJ() {
        if (LIZLLL == null) {
            LIZLLL = new C35979EAd<>(16);
            try {
                List<C75K> list = (List) LIZIZ.LJII(LIZ.getString(LIZJ, null), new TypeToken<List<? extends C75K>>() { // from class: X.75Y
                }.getType());
                o.LJIIIIZZ(list, "list");
                for (C75K c75k : list) {
                    C35979EAd<String, Long> c35979EAd = LIZLLL;
                    if (c35979EAd != null) {
                        c35979EAd.LIZLLL(c75k.LJLILLLLZI, Long.valueOf(c75k.LJLIL));
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return LIZLLL;
    }

    public static void LIZ(String emoji) {
        o.LJIIIZ(emoji, "emoji");
        C35979EAd LIZJ2 = LIZJ();
        if (LIZJ2 != null) {
            LIZJ2.LIZLLL(emoji, Long.valueOf(System.currentTimeMillis() + 2592000000L));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75W.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):java.util.List");
    }
}
