package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import kotlin.jvm.internal.o;

/* renamed from: X.OmD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62889OmD {
    public static final Keva LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final Keva LIZJ;
    public static final MutableLiveData<Boolean> LIZLLL;
    public static final MutableLiveData LJ;
    public static final MutableLiveData<Boolean> LJFF;
    public static final MutableLiveData LJI;

    static {
        Keva repo = Keva.getRepo("feeds_personalization");
        o.LJIIIIZZ(repo, "getRepo(FEEDS_PERSONALIZATION)");
        LIZ = repo;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C58230MtG.LJLIL);
        LIZIZ = LIZIZ2;
        Keva repo2 = Keva.getRepo("search_personalization");
        o.LJIIIIZZ(repo2, "getRepo(SEARCH_PERSONALIZATION)");
        LIZJ = repo2;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(LIZ()));
        LIZLLL = mutableLiveData;
        LJ = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(Boolean.valueOf(LIZIZ()));
        LJFF = mutableLiveData2;
        LJI = mutableLiveData2;
        ((IAccountService) LIZIZ2.getValue()).LJIILJJIL(C62890OmE.LJLIL);
    }

    public static boolean LIZ() {
        if (!C35971E9v.LIZ() || !LIZ.getBoolean("non_personalized_feeds_state_".concat(((IAccountService) LIZIZ.getValue()).LJFF().getCurUserId()), false)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ() {
        if (!C52949KqH.LIZ()) {
            return false;
        }
        Keva keva = LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("non_personalized_search_state_");
        LIZ2.append(((IAccountService) LIZIZ.getValue()).LJFF().getCurUserId());
        if (!keva.getBoolean(X1D.LIZIZ(LIZ2), false)) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        MutableLiveData<Boolean> mutableLiveData = LIZLLL;
        if (!o.LJ(valueOf, mutableLiveData.getValue())) {
            Keva keva = LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("non_personalized_feeds_state_");
            LIZ2.append(((IAccountService) LIZIZ.getValue()).LJFF().getCurUserId());
            keva.storeBoolean(X1D.LIZIZ(LIZ2), z);
            mutableLiveData.setValue(Boolean.valueOf(z));
            if (C35971E9v.LIZ()) {
                C10K.LIZJ(new CallableC40536FvY(z));
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        MutableLiveData<Boolean> mutableLiveData = LJFF;
        if (!o.LJ(valueOf, mutableLiveData.getValue())) {
            Keva keva = LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("non_personalized_search_state_");
            LIZ2.append(((IAccountService) LIZIZ.getValue()).LJFF().getCurUserId());
            keva.storeBoolean(X1D.LIZIZ(LIZ2), z);
            mutableLiveData.setValue(Boolean.valueOf(z));
            return true;
        }
        return false;
    }
}
