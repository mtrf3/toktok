package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xn1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85871Xn1 {
    public final List<AutoCutThemeData> LIZ;
    public final C08630Vn<Integer> LIZIZ;
    public final boolean LIZJ;
    public final OSZ<Boolean, InterfaceC65784Pro<C76800UCe>> LIZLLL;
    public final C08630Vn<Boolean> LJ;
    public final C08630Vn<Boolean> LJFF;
    public final C08630Vn<Boolean> LJI;
    public final Integer LJII;

    public C85871Xn1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85871Xn1)) {
            return false;
        }
        C85871Xn1 c85871Xn1 = (C85871Xn1) obj;
        return o.LJ(this.LIZ, c85871Xn1.LIZ) && o.LJ(this.LIZIZ, c85871Xn1.LIZIZ) && this.LIZJ == c85871Xn1.LIZJ && o.LJ(this.LIZLLL, c85871Xn1.LIZLLL) && o.LJ(this.LJ, c85871Xn1.LJ) && o.LJ(this.LJFF, c85871Xn1.LJFF) && o.LJ(this.LJI, c85871Xn1.LJI) && o.LJ(this.LJII, c85871Xn1.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        OSZ<Boolean, InterfaceC65784Pro<C76800UCe>> osz = this.LIZLLL;
        int hashCode2 = (this.LJI.hashCode() + ((this.LJFF.hashCode() + ((this.LJ.hashCode() + ((i2 + (osz == null ? 0 : osz.hashCode())) * 31)) * 31)) * 31)) * 31;
        Integer num = this.LJII;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutStates(themeList=");
        LIZ.append(this.LIZ);
        LIZ.append(", selectThemeIndex=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", selectThemeFocused=");
        LIZ.append(this.LIZJ);
        LIZ.append(", showOrHideAnim=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", showOrHidePlayIcon=");
        LIZ.append(this.LJ);
        LIZ.append(", noneBtnEnable=");
        LIZ.append(this.LJFF);
        LIZ.append(", noneBtnVisible=");
        LIZ.append(this.LJI);
        LIZ.append(", guidanceText=");
        return s0.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C85871Xn1(int r11) {
        /*
            r10 = this;
            X.OQg r2 = X.C61878OQg.INSTANCE
            X.0Vn r3 = new X.0Vn
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.<init>(r0)
            r4 = 1
            r5 = 0
            X.0Vn r6 = new X.0Vn
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.<init>(r1)
            X.0Vn r7 = new X.0Vn
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.<init>(r0)
            X.0Vn r8 = new X.0Vn
            r8.<init>(r1)
            r1 = r10
            r9 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85871Xn1.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C85871Xn1(List<AutoCutThemeData> themeList, C08630Vn<Integer> selectThemeIndex, boolean z, OSZ<Boolean, ? extends InterfaceC65784Pro<C76800UCe>> osz, C08630Vn<Boolean> showOrHidePlayIcon, C08630Vn<Boolean> noneBtnEnable, C08630Vn<Boolean> noneBtnVisible, Integer num) {
        o.LJIIIZ(themeList, "themeList");
        o.LJIIIZ(selectThemeIndex, "selectThemeIndex");
        o.LJIIIZ(showOrHidePlayIcon, "showOrHidePlayIcon");
        o.LJIIIZ(noneBtnEnable, "noneBtnEnable");
        o.LJIIIZ(noneBtnVisible, "noneBtnVisible");
        this.LIZ = themeList;
        this.LIZIZ = selectThemeIndex;
        this.LIZJ = z;
        this.LIZLLL = osz;
        this.LJ = showOrHidePlayIcon;
        this.LJFF = noneBtnEnable;
        this.LJI = noneBtnVisible;
        this.LJII = num;
    }

    public static C85871Xn1 LIZ(C85871Xn1 c85871Xn1, List list, C08630Vn c08630Vn, boolean z, OSZ osz, C08630Vn c08630Vn2, C08630Vn c08630Vn3, C08630Vn c08630Vn4, Integer num, int i) {
        Integer num2 = num;
        C08630Vn noneBtnVisible = c08630Vn4;
        C08630Vn selectThemeIndex = c08630Vn;
        List themeList = list;
        boolean z2 = z;
        OSZ osz2 = osz;
        C08630Vn showOrHidePlayIcon = c08630Vn2;
        C08630Vn noneBtnEnable = c08630Vn3;
        if ((i & 1) != 0) {
            themeList = c85871Xn1.LIZ;
        }
        if ((i & 2) != 0) {
            selectThemeIndex = c85871Xn1.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c85871Xn1.LIZJ;
        }
        if ((i & 8) != 0) {
            osz2 = c85871Xn1.LIZLLL;
        }
        if ((i & 16) != 0) {
            showOrHidePlayIcon = c85871Xn1.LJ;
        }
        if ((i & 32) != 0) {
            noneBtnEnable = c85871Xn1.LJFF;
        }
        if ((i & 64) != 0) {
            noneBtnVisible = c85871Xn1.LJI;
        }
        if ((i & 128) != 0) {
            num2 = c85871Xn1.LJII;
        }
        c85871Xn1.getClass();
        o.LJIIIZ(themeList, "themeList");
        o.LJIIIZ(selectThemeIndex, "selectThemeIndex");
        o.LJIIIZ(showOrHidePlayIcon, "showOrHidePlayIcon");
        o.LJIIIZ(noneBtnEnable, "noneBtnEnable");
        o.LJIIIZ(noneBtnVisible, "noneBtnVisible");
        return new C85871Xn1(themeList, selectThemeIndex, z2, osz2, showOrHidePlayIcon, noneBtnEnable, noneBtnVisible, num2);
    }
}
