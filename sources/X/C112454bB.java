package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4bB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112454bB {
    public final int LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final UrlModel LJ;
    public final String LJFF;
    public final UrlModel LJI;
    public final UrlModel LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final CharSequence LJIIJ;
    public final CharSequence LJIIJJI;
    public final String LJIIL;
    public final Long LJIILIIL;
    public final Integer LJIILJJIL;
    public final List<String> LJIILL;
    public final String LJIILLIIL;
    public final java.util.Set<IMContact> LJIIZILJ;
    public final Integer LJIJ;
    public final C109544Rq LJIJI;
    public final List<C771931f> LJIJJ;
    public final String LJIJJLI;
    public final String LJIL;
    public final String LJJ;
    public final long LJJI;

    public C112454bB() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112454bB)) {
            return false;
        }
        C112454bB c112454bB = (C112454bB) obj;
        return this.LIZ == c112454bB.LIZ && this.LIZIZ == c112454bB.LIZIZ && o.LJ(this.LIZJ, c112454bB.LIZJ) && o.LJ(this.LIZLLL, c112454bB.LIZLLL) && o.LJ(this.LJ, c112454bB.LJ) && o.LJ(this.LJFF, c112454bB.LJFF) && o.LJ(this.LJI, c112454bB.LJI) && o.LJ(this.LJII, c112454bB.LJII) && o.LJ(this.LJIIIIZZ, c112454bB.LJIIIIZZ) && o.LJ(this.LJIIIZ, c112454bB.LJIIIZ) && o.LJ(this.LJIIJ, c112454bB.LJIIJ) && o.LJ(this.LJIIJJI, c112454bB.LJIIJJI) && o.LJ(this.LJIIL, c112454bB.LJIIL) && o.LJ(this.LJIILIIL, c112454bB.LJIILIIL) && o.LJ(this.LJIILJJIL, c112454bB.LJIILJJIL) && o.LJ(this.LJIILL, c112454bB.LJIILL) && o.LJ(this.LJIILLIIL, c112454bB.LJIILLIIL) && o.LJ(this.LJIIZILJ, c112454bB.LJIIZILJ) && o.LJ(this.LJIJ, c112454bB.LJIJ) && o.LJ(this.LJIJI, c112454bB.LJIJI) && o.LJ(this.LJIJJ, c112454bB.LJIJJ) && o.LJ(this.LJIJJLI, c112454bB.LJIJJLI) && o.LJ(this.LJIL, c112454bB.LJIL) && o.LJ(this.LJJ, c112454bB.LJJ) && this.LJJI == c112454bB.LJJI;
    }

    public final String toString() {
        return "NotificationContent(type=" + this.LIZ + ", notificationType=" + this.LIZIZ + ", conversationType=" + this.LIZJ + ", conversationId=" + this.LIZLLL + ", avatar=" + this.LJ + ", avatarUrl=" + this.LJFF + ", assembleAvatar1=" + this.LJI + ", assembleAvatar2=" + this.LJII + ", name=" + this.LJIIIIZZ + ", secondName=" + this.LJIIIZ + ", description=" + ((Object) this.LJIIJ) + ", firstDescription=" + ((Object) this.LJIIJJI) + ", schema=" + this.LJIIL + ", anchorId=" + this.LJIILIIL + ", anchorType=" + this.LJIILJJIL + ", pushAssembleAvatarUrl=" + this.LJIILL + ", pushType=" + this.LJIILLIIL + ", userSet=" + this.LJIIZILJ + ", msgNumber=" + this.LJIJ + ", message=" + this.LJIJI + ", unitList=" + this.LJIJJ + ", fromUserId=" + this.LJIJJLI + ", uidForReactionLauncher=" + this.LJIL + ", messageScene=" + this.LJJ + ", dequeueTimeConsumption=" + this.LJJI + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str = this.LIZLLL;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        UrlModel urlModel = this.LJ;
        if (urlModel == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = urlModel.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        String str2 = this.LJFF;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        UrlModel urlModel2 = this.LJI;
        if (urlModel2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = urlModel2.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        UrlModel urlModel3 = this.LJII;
        if (urlModel3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = urlModel3.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        String str3 = this.LJIIIIZZ;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        String str4 = this.LJIIIZ;
        if (str4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str4.hashCode();
        }
        int i10 = (i9 + hashCode8) * 31;
        CharSequence charSequence = this.LJIIJ;
        if (charSequence == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = charSequence.hashCode();
        }
        int i11 = (i10 + hashCode9) * 31;
        CharSequence charSequence2 = this.LJIIJJI;
        if (charSequence2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = charSequence2.hashCode();
        }
        int i12 = (i11 + hashCode10) * 31;
        String str5 = this.LJIIL;
        if (str5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str5.hashCode();
        }
        int i13 = (i12 + hashCode11) * 31;
        Long l = this.LJIILIIL;
        if (l == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = l.hashCode();
        }
        int i14 = (i13 + hashCode12) * 31;
        Integer num2 = this.LJIILJJIL;
        if (num2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num2.hashCode();
        }
        int i15 = (i14 + hashCode13) * 31;
        List<String> list = this.LJIILL;
        if (list == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = list.hashCode();
        }
        int i16 = (i15 + hashCode14) * 31;
        String str6 = this.LJIILLIIL;
        if (str6 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str6.hashCode();
        }
        int LIZ = HXX.LIZ(this.LJIIZILJ, (i16 + hashCode15) * 31, 31);
        Integer num3 = this.LJIJ;
        if (num3 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num3.hashCode();
        }
        int i17 = (LIZ + hashCode16) * 31;
        C109544Rq c109544Rq = this.LJIJI;
        if (c109544Rq == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = c109544Rq.hashCode();
        }
        int i18 = (i17 + hashCode17) * 31;
        List<C771931f> list2 = this.LJIJJ;
        if (list2 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = list2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJIL, C79062V1e.LJ(this.LJIJJLI, (i18 + hashCode18) * 31, 31), 31);
        String str7 = this.LJJ;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJJI) + ((LJ + i2) * 31);
    }

    public C112454bB(int i, int i2, Integer num, String str, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str2, CharSequence charSequence, java.util.Set set, Integer num2, C109544Rq c109544Rq, List list, String str3, String str4, String str5, long j, int i3) {
        int i4 = i2;
        String str6 = str;
        Integer num3 = num;
        UrlModel urlModel4 = urlModel2;
        UrlModel urlModel5 = urlModel;
        String str7 = str2;
        UrlModel urlModel6 = urlModel3;
        java.util.Set userSet = set;
        CharSequence charSequence2 = charSequence;
        Integer num4 = num2;
        C109544Rq c109544Rq2 = c109544Rq;
        String str8 = str5;
        String fromUserId = str3;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        i4 = (i3 & 2) != 0 ? 0 : i4;
        num3 = (i3 & 4) != 0 ? null : num3;
        str6 = (i3 & 8) != 0 ? null : str6;
        urlModel5 = (i3 & 16) != 0 ? null : urlModel5;
        urlModel4 = (i3 & 64) != 0 ? null : urlModel4;
        urlModel6 = (i3 & 128) != 0 ? null : urlModel6;
        str7 = (i3 & 256) != 0 ? null : str7;
        charSequence2 = (i3 & 1024) != 0 ? null : charSequence2;
        userSet = (131072 & i3) != 0 ? OQY.INSTANCE : userSet;
        num4 = (262144 & i3) != 0 ? 0 : num4;
        c109544Rq2 = (524288 & i3) != 0 ? null : c109544Rq2;
        fromUserId = (2097152 & i3) != 0 ? "" : fromUserId;
        String uidForReactionLauncher = (i3 & 4194304) == 0 ? str4 : "";
        str8 = (i3 & 8388608) != 0 ? null : str8;
        o.LJIIIZ(userSet, "userSet");
        o.LJIIIZ(fromUserId, "fromUserId");
        o.LJIIIZ(uidForReactionLauncher, "uidForReactionLauncher");
        this.LIZ = i5;
        this.LIZIZ = i4;
        this.LIZJ = num3;
        this.LIZLLL = str6;
        this.LJ = urlModel5;
        this.LJFF = null;
        this.LJI = urlModel4;
        this.LJII = urlModel6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = null;
        this.LJIIJ = charSequence2;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
        this.LJIIZILJ = userSet;
        this.LJIJ = num4;
        this.LJIJI = c109544Rq2;
        this.LJIJJ = list;
        this.LJIJJLI = fromUserId;
        this.LJIL = uidForReactionLauncher;
        this.LJJ = str8;
        this.LJJI = j;
    }
}
