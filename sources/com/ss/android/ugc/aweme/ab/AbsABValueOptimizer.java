package com.ss.android.ugc.aweme.ab;

import X.C141335gf;
import X.C16880lQ;
import X.C1NE;
import X.C221108m2;
import X.C34668Dj6;
import X.C38666FFm;
import X.C38995FSd;
import X.C3C5;
import X.C62822Ol8;
import X.C75792yF;
import X.C76800UCe;
import X.EF7;
import X.InterfaceC65349Pkn;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.X1D;
import Y.ARunnableS42S0100000_6;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.p;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class AbsABValueOptimizer {
    public boolean LIZ;
    public final HashSet<ABInfo> LIZIZ = new HashSet<>();
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 16));
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final AtomicBoolean LJ = new AtomicBoolean(false);

    /* loaded from: classes7.dex */
    public static final class ABInfo {
        public static final /* synthetic */ int LIZ = 0;

        @InterfaceC65349Pkn("default_value")
        public final j defaultValue;

        @InterfaceC65349Pkn("key")
        public final String key;

        @InterfaceC65349Pkn("type")
        public final int type;

        public final String toString() {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ABInfo(key=");
            LIZ2.append(this.key);
            LIZ2.append(", type=");
            LIZ2.append(this.type);
            LIZ2.append(", defaultValue=");
            LIZ2.append(this.defaultValue);
            LIZ2.append(')');
            return X1D.LIZIZ(LIZ2);
        }

        public final int hashCode() {
            return this.key.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ABInfo) {
                return o.LJ(((ABInfo) obj).key, this.key);
            }
            return false;
        }

        public ABInfo(String key, int i, j jVar) {
            o.LJIIIZ(key, "key");
            this.key = key;
            this.type = i;
            this.defaultValue = jVar;
        }
    }

    public abstract String LIZIZ();

    public abstract boolean LIZJ();

    /* loaded from: classes7.dex */
    public static final class ABCacheInfo {

        @InterfaceC65349Pkn("ab_info_list")
        public final List<ABInfo> abInfoList;

        @InterfaceC65349Pkn("version_code")
        public final long versionCode;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ABCacheInfo)) {
                return false;
            }
            ABCacheInfo aBCacheInfo = (ABCacheInfo) obj;
            return this.versionCode == aBCacheInfo.versionCode && o.LJ(this.abInfoList, aBCacheInfo.abInfoList);
        }

        public final int hashCode() {
            return this.abInfoList.hashCode() + (C16880lQ.LLJIJIL(this.versionCode) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ABCacheInfo(versionCode=");
            LIZ.append(this.versionCode);
            LIZ.append(", abInfoList=");
            return C1NE.LIZIZ(LIZ, this.abInfoList, ')', LIZ);
        }

        public ABCacheInfo(long j, List<ABInfo> abInfoList) {
            o.LJIIIZ(abInfoList, "abInfoList");
            this.versionCode = j;
            this.abInfoList = abInfoList;
        }
    }

    public static long LIZ() {
        Object LIZ;
        try {
            LIZ = Long.valueOf(EF7.LJI());
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            LIZ = -1L;
        }
        return ((Number) LIZ).longValue();
    }

    public static void LIZLLL(InterfaceC65784Pro interfaceC65784Pro) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            if (((Boolean) C34668Dj6.LJI.getValue()).booleanValue()) {
                C38995FSd.LIZLLL().execute(new ARunnableS42S0100000_6(interfaceC65784Pro, 27));
                return;
            } else {
                C38995FSd.LJFF().execute(new ARunnableS42S0100000_6(interfaceC65784Pro, 27));
                return;
            }
        }
        interfaceC65784Pro.invoke();
    }

    public final void LJ(int i) {
        Object LIZ;
        Object LIZ2;
        try {
            LIZ = ORZ.LLJI(this.LIZIZ);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        List list = (List) LIZ;
        if (list == null) {
            if (i == 2) {
                return;
            }
            Thread.sleep(1L);
            LJ(i + 1);
            return;
        }
        try {
            this.LIZIZ.clear();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
        try {
            long LIZ3 = LIZ();
            if (LIZ3 != -1) {
                Keva.getRepo((String) this.LIZJ.getValue()).storeString("ab_cache_info", C75792yF.LIZJ(new ABCacheInfo(LIZ3, list)));
            }
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th3) {
            LIZ2 = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ2);
        }
        C3C5.m13isSuccessimpl(LIZ2);
        C3C5.m10exceptionOrNullimpl(LIZ2);
    }

    public final void LJFF(Object obj, Object obj2, String key, boolean z) {
        j pVar;
        o.LJIIIZ(key, "key");
        if (!this.LIZ || !z || this.LIZLLL.get()) {
            return;
        }
        int LIZ = C38666FFm.LIZ(obj);
        if (LIZ == 0 && (LIZ = C38666FFm.LIZ(obj2)) == 0) {
            return;
        }
        if (obj == null) {
            pVar = l.LJLIL;
            if (pVar == null) {
                return;
            }
        } else if (obj instanceof Boolean) {
            pVar = new p((Boolean) obj);
        } else if (obj instanceof Integer) {
            pVar = new p((Number) obj);
        } else if (obj instanceof Long) {
            pVar = new p((Number) obj);
        } else if (obj instanceof Float) {
            pVar = new p((Number) obj);
        } else if (obj instanceof Double) {
            pVar = new p((Number) obj);
        } else if (!(obj instanceof String)) {
            return;
        } else {
            pVar = new p((String) obj);
        }
        this.LIZIZ.add(new ABInfo(key, LIZ, pVar));
    }
}
