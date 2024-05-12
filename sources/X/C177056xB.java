package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.o;

/* renamed from: X.6xB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177056xB {
    public final View LIZ;
    public final C224748ru LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final TextView LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final EnumC177736yH LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C177056xB)) {
            return false;
        }
        C177056xB c177056xB = (C177056xB) obj;
        return o.LJ(this.LIZ, c177056xB.LIZ) && o.LJ(this.LIZIZ, c177056xB.LIZIZ) && o.LJ(this.LIZJ, c177056xB.LIZJ) && o.LJ(this.LIZLLL, c177056xB.LIZLLL) && o.LJ(this.LJ, c177056xB.LJ) && o.LJ(this.LJFF, c177056xB.LJFF) && o.LJ(this.LJI, c177056xB.LJI) && o.LJ(this.LJII, c177056xB.LJII) && this.LJIIIIZZ == c177056xB.LJIIIIZZ && this.LJIIIZ == c177056xB.LJIIIZ && o.LJ(this.LJIIJ, c177056xB.LJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        View view = this.LIZ;
        int hashCode = (view == null ? 0 : view.hashCode()) * 31;
        C224748ru c224748ru = this.LIZIZ;
        int hashCode2 = (hashCode + (c224748ru == null ? 0 : c224748ru.hashCode())) * 31;
        View view2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.LJ;
        int hashCode5 = (hashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        TextView textView = this.LJFF;
        int hashCode6 = (hashCode5 + (textView == null ? 0 : textView.hashCode())) * 31;
        String str = this.LJI;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJII;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.LJIIIIZZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode9 = (this.LJIIIZ.hashCode() + ((hashCode8 + i) * 31)) * 31;
        String str3 = this.LJIIJ;
        return hashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentInputManagerViewBindModel(commentInputLayout=");
        sb.append(this.LIZ);
        sb.append(", editText=");
        sb.append(this.LIZIZ);
        sb.append(", atView=");
        sb.append(this.LIZJ);
        sb.append(", emojiView=");
        sb.append(this.LIZLLL);
        sb.append(", giftView=");
        sb.append(this.LJ);
        sb.append(", bannedHint=");
        sb.append(this.LJFF);
        sb.append(", awemeId=");
        sb.append(this.LJI);
        sb.append(", enterFrom=");
        sb.append(this.LJII);
        sb.append(", requireGrayBackground=");
        sb.append(this.LJIIIIZZ);
        sb.append(", programmaticOrigin=");
        sb.append(this.LJIIIZ);
        sb.append(", authorId=");
        return C07670Rv.LIZIZ(sb, this.LJIIJ, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C177056xB(android.view.View r13, X.C224748ru r14, com.bytedance.tux.icon.TuxIconView r15, com.bytedance.tux.icon.TuxIconView r16, com.bytedance.tux.icon.TuxIconView r17, android.widget.TextView r18, java.lang.String r19, java.lang.String r20, X.EnumC177736yH r21, java.lang.String r22, int r23) {
        /*
            r12 = this;
            r1 = r23
            r10 = r21
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L23
            r9 = 1
        L9:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto Lf
            X.6yH r10 = X.EnumC177736yH.DEFAULT
        Lf:
            r5 = r17
            r4 = r16
            r3 = r15
            r2 = r14
            r0 = r12
            r1 = r13
            r8 = r20
            r11 = r22
            r7 = r19
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L23:
            r9 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177056xB.<init>(android.view.View, X.8ru, com.bytedance.tux.icon.TuxIconView, com.bytedance.tux.icon.TuxIconView, com.bytedance.tux.icon.TuxIconView, android.widget.TextView, java.lang.String, java.lang.String, X.6yH, java.lang.String, int):void");
    }

    public C177056xB(View view, C224748ru c224748ru, TuxIconView tuxIconView, TuxIconView tuxIconView2, TuxIconView tuxIconView3, TextView textView, String str, String str2, boolean z, EnumC177736yH programmaticOrigin, String str3) {
        o.LJIIIZ(programmaticOrigin, "programmaticOrigin");
        this.LIZ = view;
        this.LIZIZ = c224748ru;
        this.LIZJ = tuxIconView;
        this.LIZLLL = tuxIconView2;
        this.LJ = tuxIconView3;
        this.LJFF = textView;
        this.LJI = str;
        this.LJII = str2;
        this.LJIIIIZZ = z;
        this.LJIIIZ = programmaticOrigin;
        this.LJIIJ = str3;
    }
}
