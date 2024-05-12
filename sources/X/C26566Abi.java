package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddressStarling;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Abi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26566Abi {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final Boolean LJIIIZ;
    public final Boolean LJIIJ;
    public final String LJIIJJI;
    public boolean LJIIL;
    public final String LJIILIIL;
    public final AddressStarling LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26566Abi)) {
            return false;
        }
        C26566Abi c26566Abi = (C26566Abi) obj;
        return o.LJ(this.LIZ, c26566Abi.LIZ) && o.LJ(this.LIZIZ, c26566Abi.LIZIZ) && o.LJ(this.LIZJ, c26566Abi.LIZJ) && o.LJ(this.LIZLLL, c26566Abi.LIZLLL) && o.LJ(this.LJ, c26566Abi.LJ) && o.LJ(this.LJFF, c26566Abi.LJFF) && this.LJI == c26566Abi.LJI && o.LJ(this.LJII, c26566Abi.LJII) && o.LJ(this.LJIIIIZZ, c26566Abi.LJIIIIZZ) && o.LJ(this.LJIIIZ, c26566Abi.LJIIIZ) && o.LJ(this.LJIIJ, c26566Abi.LJIIJ) && o.LJ(this.LJIIJJI, c26566Abi.LJIIJJI) && this.LJIIL == c26566Abi.LJIIL && o.LJ(this.LJIILIIL, c26566Abi.LJIILIIL) && o.LJ(this.LJIILJJIL, c26566Abi.LJIILJJIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJFF;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode6 + i) * 31;
        String str7 = this.LJII;
        int hashCode7 = (i2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIIIZZ;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.LJIIIZ;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJIIJ;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str9 = this.LJIIJJI;
        int hashCode11 = (((hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31) + (this.LJIIL ? 1 : 0)) * 31;
        String str10 = this.LJIILIIL;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        AddressStarling addressStarling = this.LJIILJJIL;
        return hashCode12 + (addressStarling != null ? addressStarling.hashCode() : 0);
    }

    public final String toString() {
        return "AddressVO(id=" + this.LIZ + ", name=" + this.LIZIZ + ", phone=" + this.LIZJ + ", region=" + this.LIZLLL + ", addressDetail=" + this.LJ + ", zipcode=" + this.LJFF + ", hasAddress=" + this.LJI + ", email=" + this.LJII + ", invalidHintMessage=" + this.LJIIIIZZ + ", addressReachable=" + this.LJIIIZ + ", addressValid=" + this.LJIIJ + ", addressFull=" + this.LJIIJJI + ", allUnavailable=" + this.LJIIL + ", addressTitle=" + this.LJIILIIL + ", starlingText=" + this.LJIILJJIL + ')';
    }

    public C26566Abi(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, Boolean bool, Boolean bool2, String str9, String str10, AddressStarling addressStarling, int i) {
        String str11 = str9;
        String str12 = str10;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        str11 = (i & 2048) != 0 ? null : str11;
        str12 = (i & FileUtils.BUFFER_SIZE) != 0 ? null : str12;
        AddressStarling addressStarling2 = (i & 16384) == 0 ? addressStarling : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = z;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = bool;
        this.LJIIJ = bool2;
        this.LJIIJJI = str11;
        this.LJIIL = false;
        this.LJIILIIL = str12;
        this.LJIILJJIL = addressStarling2;
    }
}
