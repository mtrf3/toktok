package X;

import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.IgL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47237IgL<T> {
    public final String LIZ;
    public final T LIZIZ;
    public final Type LIZJ;
    public final boolean LIZLLL;

    public final T LIZ() {
        String str = this.LIZ;
        IXJ ixj = new IXJ() { // from class: X.IgN
            @Override // X.IXJ
            public final /* synthetic */ Object LIZ() {
                return null;
            }

            @Override // X.IXJ
            public final Object get() {
                C47237IgL c47237IgL = C47237IgL.this;
                return C47240IgO.LIZ(c47237IgL.LIZ, c47237IgL.LIZJ);
            }
        };
        IXJ ixj2 = new IXJ() { // from class: X.IgM
            @Override // X.IXJ
            public final /* synthetic */ Object LIZ() {
                return null;
            }

            @Override // X.IXJ
            public final Object get() {
                C47237IgL c47237IgL = C47237IgL.this;
                c47237IgL.getClass();
                return PlayerSettingService.getInstance().get(c47237IgL.LIZ, c47237IgL.LIZJ, c47237IgL.LIZIZ, true, c47237IgL.LIZLLL);
            }
        };
        ((ConcurrentHashMap) C47240IgO.LIZLLL).put(str, ixj);
        ((ConcurrentHashMap) C47240IgO.LJ).put(str, ixj2);
        T t = (T) C47240IgO.LIZ(this.LIZ, this.LIZJ);
        if (t != null) {
            PlayerSettingService.isDebug();
            return t;
        }
        if (PlayerSettingService.getInstance() != null) {
            T t2 = (T) PlayerSettingService.getInstance().get(this.LIZ, this.LIZJ, this.LIZIZ, true, this.LIZLLL);
            PlayerSettingService.isDebug();
            return t2;
        }
        if (!PlayerSettingService.isDebug()) {
            return this.LIZIZ;
        }
        throw new RuntimeException("Call getValue before PlayerSettingService init");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C47237IgL(String str, boolean z, Object obj) {
        Class<?> cls = obj.getClass();
        this.LIZ = str;
        this.LIZIZ = obj;
        this.LIZJ = cls;
        this.LIZLLL = z;
    }
}
