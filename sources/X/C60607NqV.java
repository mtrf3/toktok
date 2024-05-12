package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NqV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60607NqV implements InterfaceC60710NsA {
    public static final /* synthetic */ InterfaceC74236TBo[] LJIILL;
    public C60413NnN LIZIZ;
    public C60404NnE LIZJ;
    public InterfaceC60455No3 LIZLLL;
    public List<OSZ<Class<? extends AbstractC60629Nqr<?>>, InterfaceC88472Yns<AbstractC60629Nqr<?>, C76800UCe>>> LJFF;
    public Boolean LJI;
    public Integer LJII;
    public InterfaceC60012Ngu LJIIJ;
    public HybridSchemaParam LJIIJJI;
    public Boolean LJIIL;
    public Boolean LJIILIIL;
    public final android.net.Uri LJIILJJIL;
    public final EnumC39924Flg LIZ = EnumC39924Flg.WEB;
    public final C15T LJ = new C15T();
    public final C5H3 LJIIIIZZ = C221108m2.LIZ(EnumC221088m0.NONE, new AqS160S0100000_10(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
    public final java.util.Map<String, String> LJIIIZ = new LinkedHashMap();

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C60607NqV.class), "globalProps", "getGlobalProps()Ljava/util/Map;");
        C65352Pkq.LIZ.getClass();
        LJIILL = new InterfaceC74236TBo[]{tbt};
    }

    public final java.util.Map<String, Object> LJI() {
        return (java.util.Map) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC60710NsA
    public final boolean LIZJ() {
        HybridSchemaParam hybridSchemaParam = this.LJIIJJI;
        if (hybridSchemaParam != null) {
            return hybridSchemaParam.getUseForest();
        }
        return false;
    }

    public final int hashCode() {
        android.net.Uri uri = this.LJIILJJIL;
        if (uri != null) {
            return uri.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC60710NsA
    public final java.util.Map<String, Object> LJ() {
        return LJI();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WebKitInitParams(loadUri=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC60710NsA
    public final android.net.Uri LIZIZ() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC60710NsA
    public final HybridSchemaParam LIZLLL() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC60710NsA
    public final EnumC39924Flg getType() {
        return this.LIZ;
    }

    public C60607NqV(android.net.Uri uri) {
        this.LJIILJJIL = uri;
        C39836FkG.LJII.getClass();
        C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
        if (c39858Fkc != null) {
            LJI().putAll(c39858Fkc);
        }
    }

    @Override // X.InterfaceC60710NsA
    public final void LIZ(java.util.Map<String, ? extends Object> map) {
        if (map != null) {
            LJI().putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof C60607NqV) && o.LJ(this.LJIILJJIL, ((C60607NqV) obj).LJIILJJIL)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void LJFF(Class<? extends AbstractC60629Nqr<?>> cls, InterfaceC88472Yns<? super AbstractC60629Nqr<?>, C76800UCe> accept) {
        o.LJIIJ(accept, "accept");
        if (this.LJFF == null) {
            this.LJFF = new ArrayList();
        }
        List<OSZ<Class<? extends AbstractC60629Nqr<?>>, InterfaceC88472Yns<AbstractC60629Nqr<?>, C76800UCe>>> list = this.LJFF;
        if (list != null) {
            ((ArrayList) list).add(new OSZ(cls, accept));
        }
    }
}
