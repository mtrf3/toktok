package X;

import android.view.View;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import kotlin.jvm.internal.o;

/* renamed from: X.MUj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56889MUj {
    public final GeneralTemplateNotice LIZ;
    public final View LIZIZ;
    public final String LIZJ;
    public final MWI LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final MVZ LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56889MUj)) {
            return false;
        }
        C56889MUj c56889MUj = (C56889MUj) obj;
        return o.LJ(this.LIZ, c56889MUj.LIZ) && o.LJ(this.LIZIZ, c56889MUj.LIZIZ) && o.LJ(this.LIZJ, c56889MUj.LIZJ) && this.LIZLLL == c56889MUj.LIZLLL && this.LJ == c56889MUj.LJ && o.LJ(this.LJFF, c56889MUj.LJFF) && o.LJ(this.LJI, c56889MUj.LJI) && o.LJ(this.LJII, c56889MUj.LJII) && this.LJIIIIZZ == c56889MUj.LJIIIIZZ && o.LJ(this.LJIIIZ, c56889MUj.LJIIIZ) && o.LJ(this.LJIIJ, c56889MUj.LJIIJ);
    }

    public final String toString() {
        return "NoticeTemplateClickData(notice=" + this.LIZ + ", view=" + this.LIZIZ + ", schema=" + this.LIZJ + ", position=" + this.LIZLLL + ", clientOrder=" + this.LJ + ", timelineType=" + this.LJFF + ", tabName=" + this.LJI + ", enterFrom=" + this.LJII + ", isSecondPage=" + this.LJIIIIZZ + ", accountType=" + this.LJIIIZ + ", holder=" + this.LJIIJ + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.LIZ.hashCode() * 31;
        View view = this.LIZIZ;
        int i = 0;
        if (view == null) {
            hashCode = 0;
        } else {
            hashCode = view.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str = this.LIZJ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJFF, (((this.LIZLLL.hashCode() + ((i2 + hashCode2) * 31)) * 31) + this.LJ) * 31, 31);
        String str2 = this.LJI;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJII, (LJ + hashCode3) * 31, 31);
        boolean z = this.LJIIIIZZ;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LJ2 + i3) * 31;
        String str3 = this.LJIIIZ;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        MVZ mvz = this.LJIIJ;
        if (mvz != null) {
            i = mvz.hashCode();
        }
        return i5 + i;
    }

    public C56889MUj(GeneralTemplateNotice generalTemplateNotice, View view, String str, MWI position, int i, String timelineType, String str2, String str3, boolean z, String str4, MVZ mvz) {
        o.LJIIIZ(position, "position");
        o.LJIIIZ(timelineType, "timelineType");
        this.LIZ = generalTemplateNotice;
        this.LIZIZ = view;
        this.LIZJ = str;
        this.LIZLLL = position;
        this.LJ = i;
        this.LJFF = timelineType;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str4;
        this.LJIIJ = mvz;
    }
}
