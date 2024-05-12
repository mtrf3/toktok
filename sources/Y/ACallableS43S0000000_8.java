package Y;

import X.C1A7;
import X.C36519EUx;
import X.C51568KLs;
import X.C51572KLw;
import X.EF7;
import X.InterfaceC789838c;
import X.YXH;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.challenge.data.LocalHashTag;
import com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase;
import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public class ACallableS43S0000000_8 implements Callable {
    public final int $t;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public ACallableS43S0000000_8(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS43S0000000_8 aCallableS43S0000000_8) {
        CommonFeedServiceImpl.LJJIJLIJ().LIZLLL();
        return null;
    }

    public static final Object call$1(ACallableS43S0000000_8 aCallableS43S0000000_8) {
        String str;
        ChallengeList challengeList = new ChallengeList();
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(C1A7.LJIIZILJ().LIZIZ("hash_tag_history_version", ""), "")) {
            C1A7.LJIIZILJ().LJFF("hash_tag_history_version", "v2");
            if (!AccountService.LJIJ().LJFF().isLogin()) {
                try {
                    LocalHashTagDataBase localHashTagDataBase = (LocalHashTagDataBase) C51572KLw.LIZ.LIZJ();
                    if (localHashTagDataBase != null) {
                        List<YXH> LIZ = localHashTagDataBase.LJIJ().LIZ();
                        if (LIZ != null && LIZ.size() > 0) {
                            C51568KLs LIZJ = C51568KLs.LIZJ();
                            LIZJ.getClass();
                            if (LIZ.size() > 0) {
                                for (YXH yxh : LIZ) {
                                    List<LocalHashTag> list = LIZJ.LJLJJLL;
                                    if (yxh == null) {
                                        str = "";
                                    } else {
                                        str = yxh.LIZ;
                                    }
                                    ((ArrayList) list).add(new LocalHashTag(str, Boolean.TRUE));
                                }
                                LIZJ.LIZLLL();
                            }
                            for (YXH yxh2 : LIZ) {
                                Challenge challenge = new Challenge();
                                challenge.setChallengeName(yxh2.LIZ);
                                arrayList.add(challenge);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            List<LocalHashTag> list2 = C51568KLs.LIZJ().LJLJJLL;
            if (list2 != null) {
                ArrayList arrayList2 = (ArrayList) list2;
                if (arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        LocalHashTag localHashTag = (LocalHashTag) it.next();
                        Challenge challenge2 = new Challenge();
                        challenge2.setChallengeName(localHashTag.name);
                        arrayList.add(challenge2);
                    }
                }
            }
        }
        challengeList.items = arrayList;
        return challengeList;
    }

    public static final Object call$2(ACallableS43S0000000_8 aCallableS43S0000000_8) {
        Field field;
        try {
            SearchApiNew.LIZ();
            InterfaceC789838c interfaceC789838c = SearchApiNew.LIZIZ;
            try {
                field = interfaceC789838c.getClass().getDeclaredField("retrofit");
                field.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                field = null;
            }
            Object obj = field.get(interfaceC789838c);
            Object LIZ = C36519EUx.LIZ(obj, C36519EUx.LIZIZ(obj.getClass(), "getRetrofit"), new Object[0]);
            C36519EUx.LIZ(LIZ, C36519EUx.LIZIZ(LIZ.getClass(), "loadServiceMethod"), new Object[]{C36519EUx.LIZIZ(SearchApiNew.RealApi.class, "searchMTMixFeedList")});
        } catch (Exception e) {
            if ("local_test".equals(EF7.LJIILIIL)) {
                throw e;
            }
        }
        return null;
    }
}
