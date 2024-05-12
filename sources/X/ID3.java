package X;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ID3 {
    public final boolean LIZ;
    public InterfaceC65784Pro<Boolean> LIZIZ;
    public InterfaceC88472Yns<? super String, String> LIZJ;
    public C5NP LIZLLL;
    public InterfaceC88471Ynr<? super Effect, ? super Boolean, C76800UCe> LJ;
    public C74385THh LJFF;
    public InterfaceC65784Pro<? extends InterfaceC74384THg> LJI;
    public final Handler LJII;
    public final YB3 LJIIIIZZ;
    public boolean LJIIIZ;
    public final WXM LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final InterfaceC65784Pro<Boolean> LJIILIIL;

    public ID3() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ID3)) {
            return false;
        }
        ID3 id3 = (ID3) obj;
        return this.LIZ == id3.LIZ && o.LJ(this.LIZIZ, id3.LIZIZ) && o.LJ(this.LIZJ, id3.LIZJ) && o.LJ(this.LIZLLL, id3.LIZLLL) && o.LJ(this.LJ, id3.LJ) && o.LJ(this.LJFF, id3.LJFF) && o.LJ(this.LJI, id3.LJI) && o.LJ(this.LJII, id3.LJII) && o.LJ(this.LJIIIIZZ, id3.LJIIIIZZ) && this.LJIIIZ == id3.LJIIIZ && o.LJ(this.LJIIJ, id3.LJIIJ) && this.LJIIJJI == id3.LJIIJJI && this.LJIIL == id3.LJIIL && o.LJ(this.LJIILIIL, id3.LJIILIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LIZIZ;
        int hashCode = (i + (interfaceC65784Pro != null ? interfaceC65784Pro.hashCode() : 0)) * 31;
        InterfaceC88472Yns<? super String, String> interfaceC88472Yns = this.LIZJ;
        int hashCode2 = (hashCode + (interfaceC88472Yns != null ? interfaceC88472Yns.hashCode() : 0)) * 31;
        C5NP c5np = this.LIZLLL;
        int hashCode3 = (hashCode2 + (c5np != null ? c5np.hashCode() : 0)) * 31;
        InterfaceC88471Ynr<? super Effect, ? super Boolean, C76800UCe> interfaceC88471Ynr = this.LJ;
        int hashCode4 = (hashCode3 + (interfaceC88471Ynr != null ? interfaceC88471Ynr.hashCode() : 0)) * 31;
        C74385THh c74385THh = this.LJFF;
        int hashCode5 = (hashCode4 + (c74385THh != null ? c74385THh.hashCode() : 0)) * 31;
        InterfaceC65784Pro<? extends InterfaceC74384THg> interfaceC65784Pro2 = this.LJI;
        int hashCode6 = (hashCode5 + (interfaceC65784Pro2 != null ? interfaceC65784Pro2.hashCode() : 0)) * 31;
        Handler handler = this.LJII;
        int hashCode7 = (hashCode6 + (handler != null ? handler.hashCode() : 0)) * 31;
        YB3 yb3 = this.LJIIIIZZ;
        int hashCode8 = (hashCode7 + (yb3 != null ? yb3.hashCode() : 0)) * 31;
        ?? r02 = this.LJIIIZ;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode8 + i2) * 31;
        WXM wxm = this.LJIIJ;
        int hashCode9 = (i3 + (wxm != null ? wxm.hashCode() : 0)) * 31;
        ?? r03 = this.LJIIJJI;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        int i5 = (((hashCode9 + i4) * 31) + (this.LJIIL ? 1 : 0)) * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro3 = this.LJIILIIL;
        return i5 + (interfaceC65784Pro3 != null ? interfaceC65784Pro3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(showToolViewRemoteImage=");
        LIZ.append(this.LIZ);
        LIZ.append(", autoShowPanelInterceptor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", beatMusicPathGenerator=");
        LIZ.append(this.LIZJ);
        LIZ.append(", toolsLogger=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", onFavoriteChanged=");
        LIZ.append(this.LJ);
        LIZ.append(", stickerManagerConfigure=");
        LIZ.append(this.LJFF);
        LIZ.append(", stickerDataManagerFactory=");
        LIZ.append(this.LJI);
        LIZ.append(", sensorHandler=");
        LIZ.append(this.LJII);
        LIZ.append(", processor=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", unRegisteredSensorWhenCancelSticker=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", privacyCertConfiguration=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", ifApplyDefaultSticker=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", updateStickerInfoWhenStopRecord=");
        LIZ.append(this.LJIIL);
        LIZ.append(", enableVeApiNormalization=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public ID3(Object obj) {
        C74385THh c74385THh = new C74385THh("default", false, false, 0, null, null, 131068);
        C83663WsV c83663WsV = C83663WsV.LJIIJ;
        C34346Ddu enableVeApiNormalization = C34346Ddu.LJLIL;
        o.LJIIIZ(enableVeApiNormalization, "enableVeApiNormalization");
        this.LIZ = true;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = c74385THh;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = false;
        this.LJIIJ = c83663WsV;
        this.LJIIJJI = true;
        this.LJIIL = false;
        this.LJIILIIL = enableVeApiNormalization;
    }
}
