package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionPage;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionStateAgent;
import kotlin.jvm.internal.o;

/* renamed from: X.7gH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192057gH extends C7VQ implements AnonymousClass885 {
    public final C213218Yj LJLJJI;
    public final C192077gJ LJLJJL;

    @Override // X.C7VQ, X.AbstractC186377Td
    public final C213218Yj LIZ() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC186377Td
    public final void LIZJ(Lifecycle.Event event) {
        o.LJIIIZ(event, "event");
        int i = C186907Ve.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (C52535Kjb.LIZIZ()) {
                PlaylistCollectionStateAgent.LJIIZILJ().LIZJ(this.LJLJJL);
                return;
            } else {
                PlaylistCollectionStateAgent.LJIIZILJ().LJIIIIZZ(this);
                return;
            }
        }
        if (C52535Kjb.LIZIZ()) {
            PlaylistCollectionStateAgent.LJIIZILJ().LJFF(this.LJLJJL);
        } else {
            PlaylistCollectionStateAgent.LJIIZILJ().LJI(this);
        }
    }

    public C192057gH(PlaylistCollectionPage playlistCollectionPage, C213218Yj c213218Yj) {
        super(playlistCollectionPage, c213218Yj);
        this.LJLJJI = c213218Yj;
        this.LJLJJL = new C192077gJ(this);
    }

    @Override // X.AnonymousClass885
    public final void id(String id, Object obj, EnumC2063587z source) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(id, "id");
        o.LJIIIZ(source, "source");
        if (source == EnumC2063587z.MUTATION) {
            if (booleanValue) {
                LJFF(this.LJLIL);
            } else {
                LIZIZ(this.LJLIL);
            }
        }
    }
}
