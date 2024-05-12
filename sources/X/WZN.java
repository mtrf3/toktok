package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WZN {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C08630Vn<C76800UCe> LJI;
    public final C08630Vn<C76800UCe> LJII;
    public final List<AbstractC77373UYf> LJIIIIZZ;
    public final AbstractC77373UYf LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;

    public WZN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WZN)) {
            return false;
        }
        WZN wzn = (WZN) obj;
        return o.LJ(this.LIZ, wzn.LIZ) && o.LJ(this.LIZIZ, wzn.LIZIZ) && this.LIZJ == wzn.LIZJ && this.LIZLLL == wzn.LIZLLL && this.LJ == wzn.LJ && this.LJFF == wzn.LJFF && o.LJ(this.LJI, wzn.LJI) && o.LJ(this.LJII, wzn.LJII) && o.LJ(this.LJIIIIZZ, wzn.LJIIIIZZ) && o.LJ(this.LJIIIZ, wzn.LJIIIZ) && o.LJ(this.LJIIJ, wzn.LJIIJ) && this.LJIIJJI == wzn.LJIIJJI && o.LJ(this.LJIIL, wzn.LJIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        boolean z2 = this.LIZLLL;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.LJ;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        if (!this.LJFF) {
            i = 0;
        }
        int i8 = (i7 + i) * 31;
        C08630Vn<C76800UCe> c08630Vn = this.LJI;
        int i9 = 0;
        if (c08630Vn == null) {
            hashCode = 0;
        } else {
            hashCode = c08630Vn.hashCode();
        }
        int i10 = (i8 + hashCode) * 31;
        C08630Vn<C76800UCe> c08630Vn2 = this.LJII;
        if (c08630Vn2 != null) {
            i9 = c08630Vn2.hashCode();
        }
        return this.LJIIL.hashCode() + ((C79062V1e.LJ(this.LJIIJ, (this.LJIIIZ.hashCode() + AnonymousClass391.LIZIZ(this.LJIIIIZZ, (i10 + i9) * 31, 31)) * 31, 31) + this.LJIIJJI) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SVCBottomAndPanelUISlotSceneStates(setVadTipsText=");
        sb.append(this.LIZ);
        sb.append(", errorToast=");
        sb.append(this.LIZIZ);
        sb.append(", showVADTipsWave=");
        sb.append(this.LIZJ);
        sb.append(", showVADTipsLayout=");
        sb.append(this.LIZLLL);
        sb.append(", showSpeakTips=");
        sb.append(this.LJ);
        sb.append(", showPreviewTips=");
        sb.append(this.LJFF);
        sb.append(", switchPanel=");
        sb.append(this.LJI);
        sb.append(", switchBottom=");
        sb.append(this.LJII);
        sb.append(", updateSourceEffectList=");
        sb.append(this.LJIIIIZZ);
        sb.append(", updateCurrentChooseEffect=");
        sb.append(this.LJIIIZ);
        sb.append(", updateCurrentSpeakStateIcon=");
        sb.append(this.LJIIJ);
        sb.append(", updateDownloadProgress=");
        sb.append(this.LJIIJJI);
        sb.append(", updateCurrentVADSpeakStateIcon=");
        return C07670Rv.LIZIZ(sb, this.LJIIL, ')');
    }

    public WZN(int i) {
        this("vadTipsText", "vadTipsText", false, false, false, false, null, null, C61878OQg.INSTANCE, C77375UYh.LIZ, "STATE_PREVIEW_EMPTY", -1, "STATE_VAD_PREVIEW_EMPTY");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WZN(String setVadTipsText, String errorToast, boolean z, boolean z2, boolean z3, boolean z4, C08630Vn<C76800UCe> c08630Vn, C08630Vn<C76800UCe> c08630Vn2, List<? extends AbstractC77373UYf> updateSourceEffectList, AbstractC77373UYf updateCurrentChooseEffect, String updateCurrentSpeakStateIcon, int i, String updateCurrentVADSpeakStateIcon) {
        o.LJIIIZ(setVadTipsText, "setVadTipsText");
        o.LJIIIZ(errorToast, "errorToast");
        o.LJIIIZ(updateSourceEffectList, "updateSourceEffectList");
        o.LJIIIZ(updateCurrentChooseEffect, "updateCurrentChooseEffect");
        o.LJIIIZ(updateCurrentSpeakStateIcon, "updateCurrentSpeakStateIcon");
        o.LJIIIZ(updateCurrentVADSpeakStateIcon, "updateCurrentVADSpeakStateIcon");
        this.LIZ = setVadTipsText;
        this.LIZIZ = errorToast;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = c08630Vn;
        this.LJII = c08630Vn2;
        this.LJIIIIZZ = updateSourceEffectList;
        this.LJIIIZ = updateCurrentChooseEffect;
        this.LJIIJ = updateCurrentSpeakStateIcon;
        this.LJIIJJI = i;
        this.LJIIL = updateCurrentVADSpeakStateIcon;
    }

    public static WZN LIZ(WZN wzn, String str, boolean z, boolean z2, boolean z3, boolean z4, C08630Vn c08630Vn, C08630Vn c08630Vn2, List list, AbstractC77373UYf abstractC77373UYf, String str2, int i, int i2) {
        String errorToast;
        String updateCurrentSpeakStateIcon = str2;
        AbstractC77373UYf updateCurrentChooseEffect = abstractC77373UYf;
        List updateSourceEffectList = list;
        C08630Vn c08630Vn3 = c08630Vn2;
        boolean z5 = z;
        int i3 = i;
        String setVadTipsText = str;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        C08630Vn c08630Vn4 = c08630Vn;
        if ((i2 & 1) != 0) {
            setVadTipsText = wzn.LIZ;
        }
        String updateCurrentVADSpeakStateIcon = null;
        if ((i2 & 2) != 0) {
            errorToast = wzn.LIZIZ;
        } else {
            errorToast = null;
        }
        if ((i2 & 4) != 0) {
            z5 = wzn.LIZJ;
        }
        if ((i2 & 8) != 0) {
            z6 = wzn.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            z7 = wzn.LJ;
        }
        if ((i2 & 32) != 0) {
            z8 = wzn.LJFF;
        }
        if ((i2 & 64) != 0) {
            c08630Vn4 = wzn.LJI;
        }
        if ((i2 & 128) != 0) {
            c08630Vn3 = wzn.LJII;
        }
        if ((i2 & 256) != 0) {
            updateSourceEffectList = wzn.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            updateCurrentChooseEffect = wzn.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            updateCurrentSpeakStateIcon = wzn.LJIIJ;
        }
        if ((i2 & 2048) != 0) {
            i3 = wzn.LJIIJJI;
        }
        if ((i2 & 4096) != 0) {
            updateCurrentVADSpeakStateIcon = wzn.LJIIL;
        }
        wzn.getClass();
        o.LJIIIZ(setVadTipsText, "setVadTipsText");
        o.LJIIIZ(errorToast, "errorToast");
        o.LJIIIZ(updateSourceEffectList, "updateSourceEffectList");
        o.LJIIIZ(updateCurrentChooseEffect, "updateCurrentChooseEffect");
        o.LJIIIZ(updateCurrentSpeakStateIcon, "updateCurrentSpeakStateIcon");
        o.LJIIIZ(updateCurrentVADSpeakStateIcon, "updateCurrentVADSpeakStateIcon");
        return new WZN(setVadTipsText, errorToast, z5, z6, z7, z8, c08630Vn4, c08630Vn3, updateSourceEffectList, updateCurrentChooseEffect, updateCurrentSpeakStateIcon, i3, updateCurrentVADSpeakStateIcon);
    }
}
