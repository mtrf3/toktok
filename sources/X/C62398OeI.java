package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OeI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62398OeI {
    public final String LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final UrlModel LJI;
    public final UrlModel LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final C62273OcH LJIIJ;
    public final C62273OcH LJIIJJI;
    public final C62273OcH LJIIL;
    public final C62273OcH LJIILIIL;
    public final C62273OcH LJIILJJIL;
    public final Bundle LJIILL;
    public final boolean LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final List<String> LJIJI;
    public final List<String> LJIJJ;
    public final int LJIJJLI;
    public final List<String> LJIL;
    public final List<String> LJJ;
    public final List<String> LJJI;
    public final List<String> LJJIFFI;

    public C62398OeI() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62398OeI)) {
            return false;
        }
        C62398OeI c62398OeI = (C62398OeI) obj;
        return o.LJ(this.LIZ, c62398OeI.LIZ) && o.LJ(this.LIZIZ, c62398OeI.LIZIZ) && o.LJ(this.LIZJ, c62398OeI.LIZJ) && o.LJ(this.LIZLLL, c62398OeI.LIZLLL) && o.LJ(this.LJ, c62398OeI.LJ) && o.LJ(this.LJFF, c62398OeI.LJFF) && o.LJ(this.LJI, c62398OeI.LJI) && o.LJ(this.LJII, c62398OeI.LJII) && o.LJ(this.LJIIIIZZ, c62398OeI.LJIIIIZZ) && o.LJ(this.LJIIIZ, c62398OeI.LJIIIZ) && o.LJ(this.LJIIJ, c62398OeI.LJIIJ) && o.LJ(this.LJIIJJI, c62398OeI.LJIIJJI) && o.LJ(this.LJIIL, c62398OeI.LJIIL) && o.LJ(this.LJIILIIL, c62398OeI.LJIILIIL) && o.LJ(this.LJIILJJIL, c62398OeI.LJIILJJIL) && o.LJ(this.LJIILL, c62398OeI.LJIILL) && this.LJIILLIIL == c62398OeI.LJIILLIIL && o.LJ(this.LJIIZILJ, c62398OeI.LJIIZILJ) && o.LJ(this.LJIJ, c62398OeI.LJIJ) && o.LJ(this.LJIJI, c62398OeI.LJIJI) && o.LJ(this.LJIJJ, c62398OeI.LJIJJ) && this.LJIJJLI == c62398OeI.LJIJJLI && o.LJ(this.LJIL, c62398OeI.LJIL) && o.LJ(this.LJJ, c62398OeI.LJJ) && o.LJ(this.LJJI, c62398OeI.LJJI) && o.LJ(this.LJJIFFI, c62398OeI.LJJIFFI);
    }

    public final String toString() {
        return "PhotoShareParams(itemType=" + this.LIZ + ", aweme=" + this.LIZIZ + ", id=" + this.LIZJ + ", enterFrom=" + this.LIZLLL + ", enterMethod=" + this.LJ + ", panelSource=" + this.LJFF + ", coverThumb=" + this.LJI + ", externalCoverThumb=" + this.LJII + ", shareUrl=" + this.LJIIIIZZ + ", deeplink=" + this.LJIIIZ + ", title=" + this.LJIIJ + ", subTitle=" + this.LJIIJJI + ", sender=" + this.LJIIL + ", receiver=" + this.LJIILIIL + ", quote=" + this.LJIILJJIL + ", extras=" + this.LJIILL + ", isShowAction=" + this.LJIILLIIL + ", externalTitle=" + this.LJIIZILJ + ", externalDesc=" + this.LJIJ + ", inviteCardImageUrls=" + this.LJIJI + ", titleArgs=" + this.LJIJJ + ", deeplinkType=" + this.LJIJJLI + ", subTitleArgs=" + this.LJIL + ", senderTextArgs=" + this.LJJ + ", receiverTextArgs=" + this.LJJI + ", quoteTextArgs=" + this.LJJIFFI + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        int hashCode11 = this.LIZ.hashCode() * 31;
        Aweme aweme = this.LIZIZ;
        int i = 0;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, (hashCode11 + hashCode) * 31, 31), 31), 31), 31);
        UrlModel urlModel = this.LJI;
        if (urlModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = urlModel.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        UrlModel urlModel2 = this.LJII;
        if (urlModel2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = urlModel2.hashCode();
        }
        int hashCode12 = (this.LJIILL.hashCode() + ((this.LJIILJJIL.hashCode() + ((this.LJIILIIL.hashCode() + ((this.LJIIL.hashCode() + ((this.LJIIJJI.hashCode() + ((this.LJIIJ.hashCode() + C79062V1e.LJ(this.LJIIIZ, C79062V1e.LJ(this.LJIIIIZZ, (i2 + hashCode3) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z = this.LJIILLIIL;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (hashCode12 + i3) * 31;
        String str = this.LJIIZILJ;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str2 = this.LJIJ;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        List<String> list = this.LJIJI;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        List<String> list2 = this.LJIJJ;
        if (list2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list2.hashCode();
        }
        int i8 = (((i7 + hashCode7) * 31) + this.LJIJJLI) * 31;
        List<String> list3 = this.LJIL;
        if (list3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list3.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        List<String> list4 = this.LJJ;
        if (list4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list4.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        List<String> list5 = this.LJJI;
        if (list5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list5.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        List<String> list6 = this.LJJIFFI;
        if (list6 != null) {
            i = list6.hashCode();
        }
        return i11 + i;
    }

    public C62398OeI(String str, Aweme aweme, String id, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, String str5, String deeplink, C62273OcH c62273OcH, C62273OcH c62273OcH2, C62273OcH c62273OcH3, C62273OcH c62273OcH4, C62273OcH c62273OcH5, boolean z, String str6, String str7, List list, List list2, int i, List list3, List list4, List list5, List list6, int i2) {
        Bundle extras;
        String enterFrom = str2;
        String enterMethod = str3;
        List list7 = list5;
        List list8 = list;
        boolean z2 = z;
        List list9 = list4;
        List list10 = list2;
        int i3 = i;
        List list11 = list3;
        Aweme aweme2 = (i2 & 2) != 0 ? null : aweme;
        enterFrom = (i2 & 8) != 0 ? "" : enterFrom;
        enterMethod = (i2 & 16) != 0 ? "" : enterMethod;
        String panelSource = (i2 & 32) == 0 ? str4 : "";
        if ((i2 & 32768) != 0) {
            extras = new Bundle();
        } else {
            extras = null;
        }
        z2 = (i2 & 65536) != 0 ? true : z2;
        list8 = (i2 & 524288) != 0 ? null : list8;
        list10 = (i2 & 1048576) != 0 ? null : list10;
        i3 = (i2 & 2097152) != 0 ? 0 : i3;
        list11 = (i2 & 4194304) != 0 ? null : list11;
        list9 = (i2 & 8388608) != 0 ? null : list9;
        list7 = (i2 & 16777216) != 0 ? null : list7;
        List list12 = (i2 & 33554432) == 0 ? list6 : null;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(panelSource, "panelSource");
        o.LJIIIZ(deeplink, "deeplink");
        o.LJIIIZ(extras, "extras");
        this.LIZ = str;
        this.LIZIZ = aweme2;
        this.LIZJ = id;
        this.LIZLLL = enterFrom;
        this.LJ = enterMethod;
        this.LJFF = panelSource;
        this.LJI = urlModel;
        this.LJII = urlModel2;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = deeplink;
        this.LJIIJ = c62273OcH;
        this.LJIIJJI = c62273OcH2;
        this.LJIIL = c62273OcH3;
        this.LJIILIIL = c62273OcH4;
        this.LJIILJJIL = c62273OcH5;
        this.LJIILL = extras;
        this.LJIILLIIL = z2;
        this.LJIIZILJ = str6;
        this.LJIJ = str7;
        this.LJIJI = list8;
        this.LJIJJ = list10;
        this.LJIJJLI = i3;
        this.LJIL = list11;
        this.LJJ = list9;
        this.LJJI = list7;
        this.LJJIFFI = list12;
    }
}
