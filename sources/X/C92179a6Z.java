package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a6Z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92179a6Z extends Y6W {
    public final InterfaceC88471Ynr<String, JSONObject, C76800UCe> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final EnumC92086a54 LJFF;
    public final String LJI;
    public final String LJII;
    public final Boolean LJIIIIZZ;
    public final AbstractC91666ZyI LJIIIZ;
    public final InterfaceC92107a5P LJIIJ;
    public final C91668ZyK LJIIJJI;

    public C92179a6Z() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92179a6Z)) {
            return false;
        }
        C92179a6Z c92179a6Z = (C92179a6Z) obj;
        return o.LJ(this.LIZIZ, c92179a6Z.LIZIZ) && o.LJ(this.LIZJ, c92179a6Z.LIZJ) && o.LJ(this.LIZLLL, c92179a6Z.LIZLLL) && o.LJ(this.LJ, c92179a6Z.LJ) && this.LJFF == c92179a6Z.LJFF && o.LJ(this.LJI, c92179a6Z.LJI) && o.LJ(this.LJII, c92179a6Z.LJII) && o.LJ(this.LJIIIIZZ, c92179a6Z.LJIIIIZZ) && o.LJ(null, null) && o.LJ(this.LJIIIZ, c92179a6Z.LJIIIZ) && o.LJ(null, null) && o.LJ(this.LJIIJ, c92179a6Z.LJIIJ) && o.LJ(this.LJIIJJI, c92179a6Z.LJIIJJI);
    }

    public final int hashCode() {
        int hashCode = ((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJFF.hashCode()) * 31;
        String str2 = this.LJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJII;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LJIIIIZZ;
        int hashCode5 = (((hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31 * 31) + this.LJIIIZ.hashCode()) * 31 * 31;
        InterfaceC92107a5P interfaceC92107a5P = this.LJIIJ;
        int hashCode6 = (hashCode5 + (interfaceC92107a5P == null ? 0 : interfaceC92107a5P.hashCode())) * 31;
        C91668ZyK c91668ZyK = this.LJIIJJI;
        return hashCode6 + (c91668ZyK != null ? c91668ZyK.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentConfiguration(appLog=" + this.LIZIZ + ", language=" + this.LIZJ + ", theme=" + this.LIZLLL + ", pipoHost=" + ((Object) this.LJ) + ", region=" + this.LJFF + ", cameraCertToken=" + ((Object) this.LJI) + ", storageCerToken=" + ((Object) this.LJII) + ", isRTL=" + this.LJIIIIZZ + ", pipoEvents=null, interactionType=" + this.LJIIIZ + ", ocrService=null, webviewProvider=" + this.LJIIJ + ", fonts=" + this.LJIIJJI + ')';
    }

    public C92179a6Z(InterfaceC88471Ynr interfaceC88471Ynr, String str, String str2, EnumC92086a54 region, C92226a7K c92226a7K, C91668ZyK c91668ZyK) {
        C92118a5a interactionType = C92118a5a.LIZ;
        o.LJIIIZ(region, "region");
        o.LJIIIZ(interactionType, "interactionType");
        this.LIZIZ = interfaceC88471Ynr;
        this.LIZJ = str;
        this.LIZLLL = "light";
        this.LJ = str2;
        this.LJFF = region;
        this.LJI = "bpea-pipo_sdk_open_camera";
        this.LJII = "bpea-pipo_sdk_external_storage";
        this.LJIIIIZZ = null;
        this.LJIIIZ = interactionType;
        this.LJIIJ = c92226a7K;
        this.LJIIJJI = c91668ZyK;
    }
}
