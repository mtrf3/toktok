package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.J0f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48461J0f extends C48462J0g {
    public static final C48461J0f LIZIZ = new C48461J0f();
    public static final HashMap<String, Object> LIZJ = new HashMap<>();

    @Override // X.C48462J0g
    public final Keva LIZIZ(String str) {
        Keva repoFromSp = KevaImpl.getRepoFromSp(C78598Ut0.LJIIJ(), "live_sdk_core", 1);
        o.LJIIIIZZ(repoFromSp, "getRepoFromSp(getContext…tants.MODE_MULTI_PROCESS)");
        return repoFromSp;
    }

    @Override // X.C48462J0g
    public final <T> T LIZLLL(C48458J0c<T> key) {
        boolean z;
        o.LJIIIZ(key, "key");
        try {
            HashMap<String, Object> hashMap = LIZJ;
            if (hashMap.containsKey(key.LIZJ)) {
                T t = (T) hashMap.get(key.LIZJ);
                if (t == null) {
                    return null;
                }
                return t;
            }
            T t2 = (T) super.LIZLLL(key);
            if (t2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                hashMap.remove(key.LIZJ);
                return key.LJFF;
            }
            String str = key.LIZJ;
            o.LJIIIIZZ(str, "key.name");
            o.LJII(t2, "null cannot be cast to non-null type kotlin.Any");
            hashMap.put(str, t2);
            return t2;
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getValue() failed! The key name is ");
            C1EW.LIZLLL(LIZ, key.LIZJ, LIZ, "PluginPropertyKeva");
            LIZJ.remove(key.LIZJ);
            return key.LJFF;
        }
    }

    @Override // X.C48462J0g
    public final <T> void LJ(C48458J0c<T> key, T t) {
        boolean z;
        o.LJIIIZ(key, "key");
        if (t == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZJ.remove(key.LIZJ);
            String str = key.LIZJ;
            o.LJIIIIZZ(str, "key.name");
            LIZIZ("live_sdk_core").erase(str);
            return;
        }
        HashMap<String, Object> hashMap = LIZJ;
        String str2 = key.LIZJ;
        o.LJIIIIZZ(str2, "key.name");
        o.LJII(t, "null cannot be cast to non-null type kotlin.Any");
        hashMap.put(str2, t);
        super.LJ(key, t);
    }
}
