package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MixInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.To5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75745To5 {
    public final boolean LIZ;
    public final MixInfo LIZIZ;
    public final InterfaceC76645U6f LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final InterfaceC65784Pro<String> LJI;
    public final boolean LJII;
    public final InterfaceC65784Pro<Boolean> LJIIIIZZ;
    public final InterfaceC65784Pro<Boolean> LJIIIZ;
    public String LJIIJ;

    public C75745To5() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75745To5)) {
            return false;
        }
        C75745To5 c75745To5 = (C75745To5) obj;
        return this.LIZ == c75745To5.LIZ && o.LJ(this.LIZIZ, c75745To5.LIZIZ) && o.LJ(this.LIZJ, c75745To5.LIZJ) && this.LIZLLL == c75745To5.LIZLLL && this.LJ == c75745To5.LJ && o.LJ(this.LJFF, c75745To5.LJFF) && o.LJ(this.LJI, c75745To5.LJI) && this.LJII == c75745To5.LJII && o.LJ(this.LJIIIIZZ, c75745To5.LJIIIIZZ) && o.LJ(this.LJIIIZ, c75745To5.LJIIIZ) && o.LJ(this.LJIIJ, c75745To5.LJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        MixInfo mixInfo = this.LIZIZ;
        int i3 = 0;
        if (mixInfo == null) {
            hashCode = 0;
        } else {
            hashCode = mixInfo.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        InterfaceC76645U6f interfaceC76645U6f = this.LIZJ;
        if (interfaceC76645U6f == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC76645U6f.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        ?? r02 = this.LIZLLL;
        int i6 = r02;
        if (r02 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r03 = this.LJ;
        int i8 = r03;
        if (r03 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        String str = this.LJFF;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int LIZLLL = C1JX.LIZLLL(this.LJI, (i9 + hashCode3) * 31, 31);
        if (!this.LJII) {
            i = 0;
        }
        int LIZLLL2 = C1JX.LIZLLL(this.LJIIIIZZ, (LIZLLL + i) * 31, 31);
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJIIIZ;
        if (interfaceC65784Pro == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = interfaceC65784Pro.hashCode();
        }
        int i10 = (LIZLLL2 + hashCode4) * 31;
        String str2 = this.LJIIJ;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i10 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveConfig(shouldMixStream=");
        sb.append(this.LIZ);
        sb.append(", mixerInfo=");
        sb.append(this.LIZIZ);
        sb.append(", client=");
        sb.append(this.LIZJ);
        sb.append(", pushAdvance=");
        sb.append(this.LIZLLL);
        sb.append(", initInBackground=");
        sb.append(this.LJ);
        sb.append(", background=");
        sb.append(this.LJFF);
        sb.append(", generateRTCParamByRole=");
        sb.append(this.LJI);
        sb.append(", businessSideEnableIndependentMixStreamParams=");
        sb.append(this.LJII);
        sb.append(", preJoinChannel=");
        sb.append(this.LJIIIIZZ);
        sb.append(", canInitRtcAdavance=");
        sb.append(this.LJIIIZ);
        sb.append(", sharedBgUrl=");
        return C07670Rv.LIZIZ(sb, this.LJIIJ, ')');
    }

    public C75745To5(boolean z, MixInfo mixInfo, InterfaceC76645U6f interfaceC76645U6f, boolean z2, boolean z3, String str, InterfaceC65784Pro generateRTCParamByRole, boolean z4, TS3 ts3, C74616TQe c74616TQe, int i) {
        z2 = (i & 8) != 0 ? true : z2;
        z3 = (i & 16) != 0 ? false : z3;
        str = (i & 32) != 0 ? null : str;
        generateRTCParamByRole = (i & 64) != 0 ? C75746To6.LJLIL : generateRTCParamByRole;
        z4 = (i & 128) != 0 ? false : z4;
        InterfaceC65784Pro preJoinChannel = ts3;
        preJoinChannel = (i & 256) != 0 ? C34425DfB.LJLIL : preJoinChannel;
        c74616TQe = (i & 512) != 0 ? null : c74616TQe;
        o.LJIIIZ(generateRTCParamByRole, "generateRTCParamByRole");
        o.LJIIIZ(preJoinChannel, "preJoinChannel");
        this.LIZ = z;
        this.LIZIZ = mixInfo;
        this.LIZJ = interfaceC76645U6f;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = str;
        this.LJI = generateRTCParamByRole;
        this.LJII = z4;
        this.LJIIIIZZ = preJoinChannel;
        this.LJIIIZ = c74616TQe;
        this.LJIIJ = null;
    }
}
