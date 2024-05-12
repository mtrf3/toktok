package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import kotlin.jvm.internal.o;

/* renamed from: X.5Yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136695Yb {
    public final int LIZ;
    public final AVMusic LIZIZ;
    public final Bundle LIZJ;
    public final InterfaceC143655kP LIZLLL;
    public final C137965bE LJ;
    public final Workspace LJFF;

    public C136695Yb() {
        this(0, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C136695Yb)) {
            return false;
        }
        C136695Yb c136695Yb = (C136695Yb) obj;
        return this.LIZ == c136695Yb.LIZ && o.LJ(this.LIZIZ, c136695Yb.LIZIZ) && o.LJ(this.LIZJ, c136695Yb.LIZJ) && o.LJ(this.LIZLLL, c136695Yb.LIZLLL) && o.LJ(this.LJ, c136695Yb.LJ) && o.LJ(this.LJFF, c136695Yb.LJFF);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        AVMusic aVMusic = this.LIZIZ;
        int hashCode = (i + (aVMusic == null ? 0 : aVMusic.hashCode())) * 31;
        Bundle bundle = this.LIZJ;
        int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        InterfaceC143655kP interfaceC143655kP = this.LIZLLL;
        int hashCode3 = (hashCode2 + (interfaceC143655kP == null ? 0 : interfaceC143655kP.hashCode())) * 31;
        C137965bE c137965bE = this.LJ;
        int hashCode4 = (hashCode3 + (c137965bE == null ? 0 : c137965bE.hashCode())) * 31;
        Workspace workspace = this.LJFF;
        return hashCode4 + (workspace != null ? workspace.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditorProDraftCompat(draftToEditFrom=");
        LIZ.append(this.LIZ);
        LIZ.append(", mOldMusicModel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bundle=");
        LIZ.append(this.LIZJ);
        LIZ.append(", editPreviewApi=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", stickerChallengeManager=");
        LIZ.append(this.LJ);
        LIZ.append(", workspace=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C136695Yb(int i, AVMusic aVMusic, Bundle bundle, InterfaceC143655kP interfaceC143655kP, C137965bE c137965bE, Workspace workspace) {
        this.LIZ = i;
        this.LIZIZ = aVMusic;
        this.LIZJ = bundle;
        this.LIZLLL = interfaceC143655kP;
        this.LJ = c137965bE;
        this.LJFF = workspace;
    }
}
