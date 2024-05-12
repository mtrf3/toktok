package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.SeH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72589SeH implements InterfaceC72696Sg0 {
    public final String LIZ;
    public String LIZIZ;
    public final InterfaceC72580Se8 LIZJ;
    public final Effect LIZLLL;
    public final String LJ;

    @Override // X.InterfaceC72575Se3
    public final InterfaceC72580Se8 LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC72575Se3
    public final String LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC72696Sg0
    public final Effect LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC72575Se3
    public final String getKey() {
        return this.LIZ;
    }

    @Override // X.InterfaceC72696Sg0
    public final String getPath() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC72696Sg0
    public final void setPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LIZIZ = str;
    }

    public C72589SeH(String str, String str2, InterfaceC72580Se8 interfaceC72580Se8, Effect effect, String str3) {
        HH1.LIZ(str, "key", str2, "path", str3, "thumbnail");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = interfaceC72580Se8;
        this.LIZLLL = effect;
        this.LJ = str3;
    }
}
