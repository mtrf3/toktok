package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5M1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5M1 {
    public final Boolean LIZ;
    public final boolean LIZIZ;
    public final OSZ<Boolean, Boolean> LIZJ;
    public final C08630Vn<Boolean> LIZLLL;
    public final boolean LJ;
    public final OSZ<Integer, Integer> LJFF;
    public final boolean LJI;
    public final C133355Lf LJII;
    public final int LJIIIIZZ;
    public final C08630Vn<C76800UCe> LJIIIZ;
    public final C08630Vn<NLETrackSlot> LJIIJ;
    public final C08630Vn<C76800UCe> LJIIJJI;
    public final Integer LJIIL;
    public final C08630Vn<OSZ<String, String>> LJIILIIL;
    public final C08630Vn<String> LJIILJJIL;
    public final C08630Vn<OSZ<Boolean, List<NLETrackSlot>>> LJIILL;
    public final NLETrackSlot LJIILLIIL;
    public final OSZ<Boolean, Boolean> LJIIZILJ;
    public final C5M2 LJIJ;
    public final boolean LJIJI;
    public final C08630Vn<Boolean> LJIJJ;

    public C5M1() {
        this(0, 2097151);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5M1)) {
            return false;
        }
        C5M1 c5m1 = (C5M1) obj;
        return o.LJ(this.LIZ, c5m1.LIZ) && this.LIZIZ == c5m1.LIZIZ && o.LJ(this.LIZJ, c5m1.LIZJ) && o.LJ(this.LIZLLL, c5m1.LIZLLL) && this.LJ == c5m1.LJ && o.LJ(this.LJFF, c5m1.LJFF) && this.LJI == c5m1.LJI && o.LJ(this.LJII, c5m1.LJII) && this.LJIIIIZZ == c5m1.LJIIIIZZ && o.LJ(this.LJIIIZ, c5m1.LJIIIZ) && o.LJ(this.LJIIJ, c5m1.LJIIJ) && o.LJ(this.LJIIJJI, c5m1.LJIIJJI) && o.LJ(this.LJIIL, c5m1.LJIIL) && o.LJ(this.LJIILIIL, c5m1.LJIILIIL) && o.LJ(this.LJIILJJIL, c5m1.LJIILJJIL) && o.LJ(this.LJIILL, c5m1.LJIILL) && o.LJ(this.LJIILLIIL, c5m1.LJIILLIIL) && o.LJ(this.LJIIZILJ, c5m1.LJIIZILJ) && o.LJ(this.LJIJ, c5m1.LJIJ) && this.LJIJI == c5m1.LJIJI && o.LJ(this.LJIJJ, c5m1.LJIJJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Boolean bool = this.LIZ;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (this.LIZJ.hashCode() + ((hashCode + i) * 31)) * 31;
        C08630Vn<Boolean> c08630Vn = this.LIZLLL;
        int hashCode3 = (hashCode2 + (c08630Vn == null ? 0 : c08630Vn.hashCode())) * 31;
        boolean z2 = this.LJ;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode3 + i2) * 31;
        OSZ<Integer, Integer> osz = this.LJFF;
        int hashCode4 = (i3 + (osz == null ? 0 : osz.hashCode())) * 31;
        boolean z3 = this.LJI;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode4 + i4) * 31;
        C133355Lf c133355Lf = this.LJII;
        int hashCode5 = (((i5 + (c133355Lf == null ? 0 : c133355Lf.hashCode())) * 31) + this.LJIIIIZZ) * 31;
        C08630Vn<C76800UCe> c08630Vn2 = this.LJIIIZ;
        int hashCode6 = (hashCode5 + (c08630Vn2 == null ? 0 : c08630Vn2.hashCode())) * 31;
        C08630Vn<NLETrackSlot> c08630Vn3 = this.LJIIJ;
        int hashCode7 = (hashCode6 + (c08630Vn3 == null ? 0 : c08630Vn3.hashCode())) * 31;
        C08630Vn<C76800UCe> c08630Vn4 = this.LJIIJJI;
        int hashCode8 = (hashCode7 + (c08630Vn4 == null ? 0 : c08630Vn4.hashCode())) * 31;
        Integer num = this.LJIIL;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        C08630Vn<OSZ<String, String>> c08630Vn5 = this.LJIILIIL;
        int hashCode10 = (hashCode9 + (c08630Vn5 == null ? 0 : c08630Vn5.hashCode())) * 31;
        C08630Vn<String> c08630Vn6 = this.LJIILJJIL;
        int hashCode11 = (hashCode10 + (c08630Vn6 == null ? 0 : c08630Vn6.hashCode())) * 31;
        C08630Vn<OSZ<Boolean, List<NLETrackSlot>>> c08630Vn7 = this.LJIILL;
        int hashCode12 = (hashCode11 + (c08630Vn7 == null ? 0 : c08630Vn7.hashCode())) * 31;
        NLETrackSlot nLETrackSlot = this.LJIILLIIL;
        int hashCode13 = (((this.LJIJ.hashCode() + ((this.LJIIZILJ.hashCode() + ((hashCode12 + (nLETrackSlot == null ? 0 : nLETrackSlot.hashCode())) * 31)) * 31)) * 31) + (this.LJIJI ? 1 : 0)) * 31;
        C08630Vn<Boolean> c08630Vn8 = this.LJIJJ;
        return hashCode13 + (c08630Vn8 != null ? c08630Vn8.hashCode() : 0);
    }

    public final String toString() {
        return "EditEffectStates(showEffect=" + this.LIZ + ", playBtnVisible=" + this.LIZIZ + ", undoRedoHighLight=" + this.LIZJ + ", streamEditLoading=" + this.LIZLLL + ", trackVisible=" + this.LJ + ", previewSize=" + this.LJFF + ", cursorVisible=" + this.LJI + ", cursorPosChanged=" + this.LJII + ", videoLength=" + this.LJIIIIZZ + ", refreshCoverEvent=" + this.LJIIIZ + ", effectSlotSelected=" + this.LJIIJ + ", effectSlotUnSelected=" + this.LJIIJJI + ", timeEffectSelected=" + this.LJIIL + ", panelSelectedEffectId=" + this.LJIILIIL + ", scrollToSelectedEffect=" + this.LJIILJJIL + ", onNormalEffectChanged=" + this.LJIILL + ", onTimeEffectChanged=" + this.LJIILLIIL + ", replaceEffectState=" + this.LJIIZILJ + ", tabSelected=" + this.LJIJ + ", showTimeTab=" + this.LJIJI + ", refreshPanelData=" + this.LJIJJ + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5M1(int r27, int r28) {
        /*
            r26 = this;
            r13 = r27
            r3 = r28
            r5 = 0
            r0 = r3 & 2
            r4 = 0
            if (r0 == 0) goto L66
            r6 = 1
        Lb:
            r0 = r3 & 4
            if (r0 == 0) goto L64
            X.OSZ r7 = new X.OSZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.<init>(r0, r0)
        L16:
            r0 = r3 & 64
            if (r0 == 0) goto L62
            r11 = 1
        L1b:
            r0 = r3 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L20
            r13 = 0
        L20:
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.OSZ r2 = new X.OSZ
            r2.<init>(r5, r0)
        L2c:
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L5e
            X.5M2 r1 = new X.5M2
            r1.<init>(r4)
        L36:
            r0 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 & r0
            if (r3 == 0) goto L5b
            r24 = 1
        L3d:
            r9 = 0
            r4 = r26
            r8 = r5
            r10 = r5
            r12 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            r17 = r5
            r18 = r5
            r19 = r5
            r20 = r5
            r21 = r5
            r22 = r2
            r23 = r1
            r25 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        L5b:
            r24 = 0
            goto L3d
        L5e:
            r1 = r5
            goto L36
        L60:
            r2 = r5
            goto L2c
        L62:
            r11 = 0
            goto L1b
        L64:
            r7 = r5
            goto L16
        L66:
            r6 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5M1.<init>(int, int):void");
    }

    public C5M1(Boolean bool, boolean z, OSZ<Boolean, Boolean> undoRedoHighLight, C08630Vn<Boolean> c08630Vn, boolean z2, OSZ<Integer, Integer> osz, boolean z3, C133355Lf c133355Lf, int i, C08630Vn<C76800UCe> c08630Vn2, C08630Vn<NLETrackSlot> c08630Vn3, C08630Vn<C76800UCe> c08630Vn4, Integer num, C08630Vn<OSZ<String, String>> c08630Vn5, C08630Vn<String> c08630Vn6, C08630Vn<OSZ<Boolean, List<NLETrackSlot>>> c08630Vn7, NLETrackSlot nLETrackSlot, OSZ<Boolean, Boolean> replaceEffectState, C5M2 tabSelected, boolean z4, C08630Vn<Boolean> c08630Vn8) {
        o.LJIIIZ(undoRedoHighLight, "undoRedoHighLight");
        o.LJIIIZ(replaceEffectState, "replaceEffectState");
        o.LJIIIZ(tabSelected, "tabSelected");
        this.LIZ = bool;
        this.LIZIZ = z;
        this.LIZJ = undoRedoHighLight;
        this.LIZLLL = c08630Vn;
        this.LJ = z2;
        this.LJFF = osz;
        this.LJI = z3;
        this.LJII = c133355Lf;
        this.LJIIIIZZ = i;
        this.LJIIIZ = c08630Vn2;
        this.LJIIJ = c08630Vn3;
        this.LJIIJJI = c08630Vn4;
        this.LJIIL = num;
        this.LJIILIIL = c08630Vn5;
        this.LJIILJJIL = c08630Vn6;
        this.LJIILL = c08630Vn7;
        this.LJIILLIIL = nLETrackSlot;
        this.LJIIZILJ = replaceEffectState;
        this.LJIJ = tabSelected;
        this.LJIJI = z4;
        this.LJIJJ = c08630Vn8;
    }

    public static C5M1 LIZ(C5M1 c5m1, Boolean bool, boolean z, OSZ osz, C08630Vn c08630Vn, boolean z2, OSZ osz2, boolean z3, C133355Lf c133355Lf, int i, C08630Vn c08630Vn2, C08630Vn c08630Vn3, C08630Vn c08630Vn4, Integer num, C08630Vn c08630Vn5, C08630Vn c08630Vn6, C08630Vn c08630Vn7, NLETrackSlot nLETrackSlot, OSZ osz3, C5M2 c5m2, boolean z4, C08630Vn c08630Vn8, int i2) {
        C08630Vn c08630Vn9 = c08630Vn8;
        C5M2 tabSelected = c5m2;
        OSZ replaceEffectState = osz3;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        OSZ osz4 = osz2;
        boolean z5 = z4;
        C08630Vn c08630Vn10 = c08630Vn7;
        boolean z6 = z2;
        C08630Vn c08630Vn11 = c08630Vn;
        OSZ undoRedoHighLight = osz;
        Boolean bool2 = bool;
        boolean z7 = z;
        C08630Vn c08630Vn12 = c08630Vn6;
        boolean z8 = z3;
        C133355Lf c133355Lf2 = c133355Lf;
        C08630Vn c08630Vn13 = c08630Vn2;
        int i3 = i;
        C08630Vn c08630Vn14 = c08630Vn4;
        C08630Vn c08630Vn15 = c08630Vn3;
        Integer num2 = num;
        C08630Vn c08630Vn16 = c08630Vn5;
        if ((i2 & 1) != 0) {
            bool2 = c5m1.LIZ;
        }
        if ((i2 & 2) != 0) {
            z7 = c5m1.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            undoRedoHighLight = c5m1.LIZJ;
        }
        if ((i2 & 8) != 0) {
            c08630Vn11 = c5m1.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            z6 = c5m1.LJ;
        }
        if ((i2 & 32) != 0) {
            osz4 = c5m1.LJFF;
        }
        if ((i2 & 64) != 0) {
            z8 = c5m1.LJI;
        }
        if ((i2 & 128) != 0) {
            c133355Lf2 = c5m1.LJII;
        }
        if ((i2 & 256) != 0) {
            i3 = c5m1.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            c08630Vn13 = c5m1.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            c08630Vn15 = c5m1.LJIIJ;
        }
        if ((i2 & 2048) != 0) {
            c08630Vn14 = c5m1.LJIIJJI;
        }
        if ((i2 & 4096) != 0) {
            num2 = c5m1.LJIIL;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            c08630Vn16 = c5m1.LJIILIIL;
        }
        if ((i2 & 16384) != 0) {
            c08630Vn12 = c5m1.LJIILJJIL;
        }
        if ((32768 & i2) != 0) {
            c08630Vn10 = c5m1.LJIILL;
        }
        if ((65536 & i2) != 0) {
            nLETrackSlot2 = c5m1.LJIILLIIL;
        }
        if ((131072 & i2) != 0) {
            replaceEffectState = c5m1.LJIIZILJ;
        }
        if ((262144 & i2) != 0) {
            tabSelected = c5m1.LJIJ;
        }
        if ((524288 & i2) != 0) {
            z5 = c5m1.LJIJI;
        }
        if ((i2 & 1048576) != 0) {
            c08630Vn9 = c5m1.LJIJJ;
        }
        c5m1.getClass();
        o.LJIIIZ(undoRedoHighLight, "undoRedoHighLight");
        o.LJIIIZ(replaceEffectState, "replaceEffectState");
        o.LJIIIZ(tabSelected, "tabSelected");
        boolean z9 = z8;
        C133355Lf c133355Lf3 = c133355Lf2;
        int i4 = i3;
        return new C5M1(bool2, z7, undoRedoHighLight, c08630Vn11, z6, osz4, z9, c133355Lf3, i4, c08630Vn13, c08630Vn15, c08630Vn14, num2, c08630Vn16, c08630Vn12, c08630Vn10, nLETrackSlot2, replaceEffectState, tabSelected, z5, c08630Vn9);
    }
}
