package X;

import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.6Io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158146Io {
    public final QaStruct LIZ;
    public final boolean LIZIZ;

    public C158146Io() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C158146Io)) {
            return false;
        }
        C158146Io c158146Io = (C158146Io) obj;
        return o.LJ(this.LIZ, c158146Io.LIZ) && this.LIZIZ == c158146Io.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        QaStruct qaStruct = this.LIZ;
        int hashCode = (qaStruct == null ? 0 : qaStruct.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewRecordQAStickerUISceneStates(qaStruct=");
        LIZ.append(this.LIZ);
        LIZ.append(", stickerModelFlag=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C158146Io(QaStruct qaStruct, boolean z) {
        this.LIZ = qaStruct;
        this.LIZIZ = z;
    }
}
