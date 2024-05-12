package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Zvp, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91513Zvp implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final UrlModel LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final boolean LJLJJL;
    public final InterfaceC88471Ynr<String, Context, C76800UCe> LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91513Zvp)) {
            return false;
        }
        C91513Zvp c91513Zvp = (C91513Zvp) obj;
        return o.LJ(this.LJLIL, c91513Zvp.LJLIL) && o.LJ(this.LJLILLLLZI, c91513Zvp.LJLILLLLZI) && o.LJ(this.LJLJI, c91513Zvp.LJLJI) && o.LJ(this.LJLJJI, c91513Zvp.LJLJJI) && this.LJLJJL == c91513Zvp.LJLJJL && o.LJ(this.LJLJJLL, c91513Zvp.LJLJJLL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI.hashCode()) * 31) + this.LJLJI.hashCode()) * 31) + this.LJLJJI.hashCode()) * 31;
        boolean z = this.LJLJJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        InterfaceC88471Ynr<String, Context, C76800UCe> interfaceC88471Ynr = this.LJLJJLL;
        return i2 + (interfaceC88471Ynr == null ? 0 : interfaceC88471Ynr.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MDQueueNextMusicItem(id=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pictureUrl=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", songName=");
        LIZ.append(this.LJLJI);
        LIZ.append(", artistName=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isExpired=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", clickListener=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91513Zvp(String id, UrlModel pictureUrl, String songName, String artistName, boolean z, InterfaceC88471Ynr<? super String, ? super Context, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(pictureUrl, "pictureUrl");
        o.LJIIIZ(songName, "songName");
        o.LJIIIZ(artistName, "artistName");
        this.LJLIL = id;
        this.LJLILLLLZI = pictureUrl;
        this.LJLJI = songName;
        this.LJLJJI = artistName;
        this.LJLJJL = z;
        this.LJLJJLL = interfaceC88471Ynr;
    }
}
