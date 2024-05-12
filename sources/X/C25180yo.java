package X;

import com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount;
import com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.0yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25180yo {
    public static final HashMap<String, HashMap<String, C1OX>> LIZ = new HashMap<>();
    public static final HashMap<String, HashMap<String, C1OX>> LIZIZ = new HashMap<>();

    public static HashMap LIZ(String repoName, EnumC10900bm repoType) {
        String currentUid;
        C1OX c1ox;
        o.LJIIIZ(repoName, "repoName");
        o.LJIIIZ(repoType, "repoType");
        HashMap<String, C1OX> hashMap = C10N.LIZ;
        HashMap<String, HashMap<String, C1OX>> hashMap2 = LIZ;
        if (repoType == EnumC10900bm.SP) {
            hashMap = C10N.LIZIZ;
            hashMap2 = LIZIZ;
        }
        if (hashMap.containsKey(repoName)) {
            if (C19460pa.LIZ == null) {
                C19460pa.LIZ = UserAccountImpl.LIZIZ();
            }
            IUserAccount iUserAccount = C19460pa.LIZ;
            if (iUserAccount == null || (currentUid = iUserAccount.getCurrentUid()) == null) {
                currentUid = UserAccountImpl.LIZIZ().getCurrentUid();
            }
            HashMap<String, C1OX> hashMap3 = hashMap2.get(currentUid);
            if (hashMap3 == null) {
                synchronized (hashMap2) {
                    hashMap3 = new HashMap<>();
                    hashMap2.put(currentUid, hashMap3);
                }
            }
            HashMap<String, C1OX> hashMap4 = hashMap3;
            if (!hashMap4.containsKey(repoName) && (c1ox = hashMap.get(repoName)) != null) {
                HashMap<String, C1OX> hashMap5 = hashMap2.get(currentUid);
                if (hashMap5 == null) {
                    hashMap5 = new HashMap<>();
                }
                HashMap<String, String> hashMap6 = c1ox.LJLIL;
                HashMap hashMap7 = new HashMap();
                for (Map.Entry<String, String> entry : hashMap6.entrySet()) {
                    hashMap7.put(entry.getKey(), ujb.o.LJJJJZ(entry.getValue(), "{%uid}", currentUid, false));
                }
                hashMap5.put(repoName, new C1OX(hashMap7));
                hashMap2.put(currentUid, hashMap5);
            }
            return hashMap4;
        }
        return null;
    }
}
