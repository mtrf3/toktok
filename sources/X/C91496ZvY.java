package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvY, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91496ZvY implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final UrlModel LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final EnumC91310ZsY LJLJL;
    public final InterfaceC88473Ynt<String, String, Context, C76800UCe> LJLJLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91496ZvY)) {
            return false;
        }
        C91496ZvY c91496ZvY = (C91496ZvY) obj;
        return o.LJ(this.LJLIL, c91496ZvY.LJLIL) && o.LJ(this.LJLILLLLZI, c91496ZvY.LJLILLLLZI) && o.LJ(this.LJLJI, c91496ZvY.LJLJI) && o.LJ(this.LJLJJI, c91496ZvY.LJLJJI) && o.LJ(this.LJLJJL, c91496ZvY.LJLJJL) && o.LJ(this.LJLJJLL, c91496ZvY.LJLJJLL) && this.LJLJL == c91496ZvY.LJLJL && o.LJ(this.LJLJLJ, c91496ZvY.LJLJLJ);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI.hashCode()) * 31) + this.LJLJI.hashCode()) * 31) + this.LJLJJI.hashCode()) * 31) + this.LJLJJL.hashCode()) * 31) + this.LJLJJLL.hashCode()) * 31) + this.LJLJL.hashCode()) * 31;
        InterfaceC88473Ynt<String, String, Context, C76800UCe> interfaceC88473Ynt = this.LJLJLJ;
        return hashCode + (interfaceC88473Ynt == null ? 0 : interfaceC88473Ynt.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MDAudioMusicItem(id=");
        LIZ.append(this.LJLIL);
        LIZ.append(", fullClipId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", pictureUrl=");
        LIZ.append(this.LJLJI);
        LIZ.append(", songName=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", artistName=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", duration=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", playbackState=");
        LIZ.append(this.LJLJL);
        LIZ.append(", clickListener=");
        LIZ.append(this.LJLJLJ);
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
    public C91496ZvY(String id, String fullClipId, UrlModel pictureUrl, String songName, String artistName, String duration, EnumC91310ZsY playbackState, InterfaceC88473Ynt<? super String, ? super String, ? super Context, C76800UCe> interfaceC88473Ynt) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(fullClipId, "fullClipId");
        o.LJIIIZ(pictureUrl, "pictureUrl");
        o.LJIIIZ(songName, "songName");
        o.LJIIIZ(artistName, "artistName");
        o.LJIIIZ(duration, "duration");
        o.LJIIIZ(playbackState, "playbackState");
        this.LJLIL = id;
        this.LJLILLLLZI = fullClipId;
        this.LJLJI = pictureUrl;
        this.LJLJJI = songName;
        this.LJLJJL = artistName;
        this.LJLJJLL = duration;
        this.LJLJL = playbackState;
        this.LJLJLJ = interfaceC88473Ynt;
    }
}
