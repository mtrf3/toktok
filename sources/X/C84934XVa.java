package X;

import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XVa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84934XVa {
    public final int LIZ;
    public final MusicModel LIZIZ;
    public final List<MusicCollectionItem> LIZJ;
    public final C69590RSw LIZLLL;

    public C84934XVa() {
        this(0, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84934XVa)) {
            return false;
        }
        C84934XVa c84934XVa = (C84934XVa) obj;
        return this.LIZ == c84934XVa.LIZ && o.LJ(this.LIZIZ, c84934XVa.LIZIZ) && o.LJ(this.LIZJ, c84934XVa.LIZJ) && o.LJ(this.LIZLLL, c84934XVa.LIZLLL);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        MusicModel musicModel = this.LIZIZ;
        int hashCode = (i + (musicModel == null ? 0 : musicModel.hashCode())) * 31;
        List<MusicCollectionItem> list = this.LIZJ;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        C69590RSw c69590RSw = this.LIZLLL;
        return hashCode2 + (c69590RSw != null ? c69590RSw.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicItemBean(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", musicModel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", musicCollectionList=");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicBlockTitle=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C84934XVa(int r3, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L5
            r3 = -1
        L5:
            r0 = r5 & 2
            r1 = 0
            if (r0 == 0) goto Lb
            r4 = r1
        Lb:
            r0 = r5 & 4
            if (r0 == 0) goto L15
            X.OQg r0 = X.C61878OQg.INSTANCE
        L11:
            r2.<init>(r3, r4, r0, r1)
            return
        L15:
            r0 = r1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84934XVa.<init>(int, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C84934XVa(int i, MusicModel musicModel, List<? extends MusicCollectionItem> list, C69590RSw c69590RSw) {
        this.LIZ = i;
        this.LIZIZ = musicModel;
        this.LIZJ = list;
        this.LIZLLL = c69590RSw;
    }
}
