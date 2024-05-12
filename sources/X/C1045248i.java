package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.48i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1045248i {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final Integer LJI;
    public final int LJII;
    public final Integer LJIIIIZZ;
    public final int LJIIIZ;
    public final C4KA LJIIJ;
    public final C4KA LJIIJJI;
    public final C2UE LJIIL;
    public final C1049049u LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1045248i)) {
            return false;
        }
        C1045248i c1045248i = (C1045248i) obj;
        return this.LIZ == c1045248i.LIZ && this.LIZIZ == c1045248i.LIZIZ && this.LIZJ == c1045248i.LIZJ && this.LIZLLL == c1045248i.LIZLLL && this.LJ == c1045248i.LJ && this.LJFF == c1045248i.LJFF && o.LJ(this.LJI, c1045248i.LJI) && this.LJII == c1045248i.LJII && o.LJ(this.LJIIIIZZ, c1045248i.LJIIIIZZ) && this.LJIIIZ == c1045248i.LJIIIZ && o.LJ(this.LJIIJ, c1045248i.LJIIJ) && o.LJ(this.LJIIJJI, c1045248i.LJIIJJI) && o.LJ(this.LJIIL, c1045248i.LJIIL) && o.LJ(this.LJIILIIL, c1045248i.LJIILIIL);
    }

    public final int hashCode() {
        int i = ((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31;
        Integer num = this.LJI;
        int hashCode = (((i + (num == null ? 0 : num.hashCode())) * 31) + this.LJII) * 31;
        Integer num2 = this.LJIIIIZZ;
        return this.LJIILIIL.hashCode() + ((hashCode() + ((this.LJIIJJI.hashCode() + ((this.LJIIJ.hashCode() + ((((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LJIIIZ) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChatPageUIConfig(textSendBubbleColor=" + this.LIZ + ", textSendColor=" + this.LIZIZ + ", textReceiveBubbleColor=" + this.LIZJ + ", chatRoomBackgroundColor=" + this.LIZLLL + ", emojiTabLayout=" + this.LJ + ", emojiContentPanelColor=" + this.LJFF + ", backgroundBehindPlaceholder=" + this.LJI + ", backgroundSendButton=" + this.LJII + ", cardStrokeWidth=" + this.LJIIIIZZ + ", chatInputTailColor=" + this.LJIIIZ + ", textReceiveStroke=" + this.LJIIJ + ", infoCardStroke=" + this.LJIIJJI + ", likeLayoutConfig=" + this.LJIIL + ", messageCardConfig=" + this.LJIILIIL + ')';
    }

    public static int LIZ(C1045248i c1045248i) {
        boolean LIZ = C90193gN.LIZ();
        c1045248i.getClass();
        if (LIZ) {
            return R.drawable.bgg;
        }
        return R.drawable.bgf;
    }

    public C1045248i(Integer num, C2UE c2ue, C1049049u c1049049u) {
        C1042447g c1042447g = C1042447g.LJLIL;
        this.LIZ = R.attr.lf;
        this.LIZIZ = R.attr.dj;
        this.LIZJ = R.attr.cr;
        this.LIZLLL = R.attr.la;
        this.LJ = R.attr.la;
        this.LJFF = R.attr.la;
        this.LJI = null;
        this.LJII = R.attr.ds;
        this.LJIIIIZZ = num;
        this.LJIIIZ = R.attr.cr;
        this.LJIIJ = c1042447g;
        this.LJIIJJI = c1042447g;
        this.LJIIL = c2ue;
        this.LJIILIIL = c1049049u;
    }
}
