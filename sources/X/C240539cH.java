package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.9cH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240539cH {
    public final EnumC240519cF LIZ;
    public final boolean LIZIZ;
    public final Music LIZJ;
    public final MusicGroup LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C240539cH)) {
            return false;
        }
        C240539cH c240539cH = (C240539cH) obj;
        return this.LIZ == c240539cH.LIZ && this.LIZIZ == c240539cH.LIZIZ && o.LJ(this.LIZJ, c240539cH.LIZJ) && o.LJ(this.LIZLLL, c240539cH.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Music music = this.LIZJ;
        int hashCode2 = (i2 + (music == null ? 0 : music.hashCode())) * 31;
        MusicGroup musicGroup = this.LIZLLL;
        return hashCode2 + (musicGroup != null ? musicGroup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighlightEvent(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", isHighlighted=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", music=");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicGroup=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C240539cH(EnumC240519cF status, Music music, MusicGroup musicGroup) {
        o.LJIIIZ(status, "status");
        this.LIZ = status;
        this.LIZIZ = true;
        this.LIZJ = music;
        this.LIZLLL = musicGroup;
    }
}
