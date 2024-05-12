package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5d7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139135d7 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final C08630Vn<List<List<ReadTextEffectBean>>> LJFF;
    public final C08630Vn<ReadTextEffectBean> LJI;

    public C139135d7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C139135d7)) {
            return false;
        }
        C139135d7 c139135d7 = (C139135d7) obj;
        return this.LIZ == c139135d7.LIZ && this.LIZIZ == c139135d7.LIZIZ && this.LIZJ == c139135d7.LIZJ && o.LJ(this.LIZLLL, c139135d7.LIZLLL) && this.LJ == c139135d7.LJ && o.LJ(this.LJFF, c139135d7.LJFF) && o.LJ(this.LJI, c139135d7.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTSPanelUISceneStates(showViewAnim=");
        LIZ.append(this.LIZ);
        LIZ.append(", loading=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", playing=");
        LIZ.append(this.LIZJ);
        LIZ.append(", checkBoxText=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isCheckedForCheckBox=");
        LIZ.append(this.LJ);
        LIZ.append(", data=");
        LIZ.append(this.LJFF);
        LIZ.append(", autoMoveBean=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i3 = r02;
        if (r02 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        ?? r03 = this.LIZJ;
        int i5 = r03;
        if (r03 != 0) {
            i5 = 1;
        }
        int LJ = C79062V1e.LJ(this.LIZLLL, (i4 + i5) * 31, 31);
        if (!this.LJ) {
            i = 0;
        }
        int hashCode2 = (this.LJFF.hashCode() + ((LJ + i) * 31)) * 31;
        C08630Vn<ReadTextEffectBean> c08630Vn = this.LJI;
        if (c08630Vn == null) {
            hashCode = 0;
        } else {
            hashCode = c08630Vn.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public /* synthetic */ C139135d7(int i) {
        this(true, true, false, "", false, new C08630Vn(new ArrayList()), null);
    }

    public C139135d7(boolean z, boolean z2, boolean z3, String checkBoxText, boolean z4, C08630Vn<List<List<ReadTextEffectBean>>> data, C08630Vn<ReadTextEffectBean> c08630Vn) {
        o.LJIIIZ(checkBoxText, "checkBoxText");
        o.LJIIIZ(data, "data");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = checkBoxText;
        this.LJ = z4;
        this.LJFF = data;
        this.LJI = c08630Vn;
    }

    public static C139135d7 LIZ(C139135d7 c139135d7, boolean z, boolean z2, boolean z3, String str, boolean z4, C08630Vn c08630Vn, C08630Vn c08630Vn2, int i) {
        C08630Vn c08630Vn3 = c08630Vn2;
        boolean z5 = z2;
        boolean z6 = z;
        boolean z7 = z3;
        String checkBoxText = str;
        boolean z8 = z4;
        C08630Vn data = c08630Vn;
        if ((i & 1) != 0) {
            z6 = c139135d7.LIZ;
        }
        if ((i & 2) != 0) {
            z5 = c139135d7.LIZIZ;
        }
        if ((i & 4) != 0) {
            z7 = c139135d7.LIZJ;
        }
        if ((i & 8) != 0) {
            checkBoxText = c139135d7.LIZLLL;
        }
        if ((i & 16) != 0) {
            z8 = c139135d7.LJ;
        }
        if ((i & 32) != 0) {
            data = c139135d7.LJFF;
        }
        if ((i & 64) != 0) {
            c08630Vn3 = c139135d7.LJI;
        }
        c139135d7.getClass();
        o.LJIIIZ(checkBoxText, "checkBoxText");
        o.LJIIIZ(data, "data");
        return new C139135d7(z6, z5, z7, checkBoxText, z8, data, c08630Vn3);
    }
}
