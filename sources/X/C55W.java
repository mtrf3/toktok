package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import kotlin.jvm.internal.o;

/* renamed from: X.55W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55W {
    public final int LIZ;
    public final Integer LIZIZ;
    public final NLEModel LIZJ;
    public final String LIZLLL;
    public final InfoStickerModel LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55W)) {
            return false;
        }
        C55W c55w = (C55W) obj;
        return this.LIZ == c55w.LIZ && o.LJ(this.LIZIZ, c55w.LIZIZ) && o.LJ(this.LIZJ, c55w.LIZJ) && o.LJ(this.LIZLLL, c55w.LIZLLL) && o.LJ(this.LJ, c55w.LJ) && this.LJFF == c55w.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = this.LIZ * 31;
        Integer num = this.LIZIZ;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZLLL, (this.LIZJ.hashCode() + ((i + hashCode) * 31)) * 31, 31);
        InfoStickerModel infoStickerModel = this.LJ;
        if (infoStickerModel != null) {
            i2 = infoStickerModel.hashCode();
        }
        int i3 = (LJ + i2) * 31;
        boolean z = this.LJFF;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return i3 + i4;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReshootStoreData(retakeIndex=");
        LIZ.append(this.LIZ);
        LIZ.append(", oriAudioIndex=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nleModel=");
        LIZ.append(this.LIZJ);
        LIZ.append(", retakeCommitId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", infoStickerModel=");
        LIZ.append(this.LJ);
        LIZ.append(", isReplace=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C55W(int i, Integer num, NLEModel nLEModel, String str, InfoStickerModel infoStickerModel, boolean z) {
        this.LIZ = i;
        this.LIZIZ = num;
        this.LIZJ = nLEModel;
        this.LIZLLL = str;
        this.LJ = infoStickerModel;
        this.LJFF = z;
    }
}
