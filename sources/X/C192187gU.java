package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionStateAgent;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.PlaylistCollectionPageData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.7gU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192187gU extends AbstractC186347Ta implements AnonymousClass885 {
    public final FavoriteTabItemV2 LJLILLLLZI;
    public final C192197gV LJLJI;

    @Override // X.AbstractC186347Ta
    public final FavoriteTabItemV2 LIZ() {
        return this.LJLILLLLZI;
    }

    public C192187gU(C213268Yo c213268Yo) {
        PlaylistCollectionPageData playlistCollectionPageData = new PlaylistCollectionPageData();
        String string = c213268Yo.LIZ.getString(R.string.bb5, 0);
        o.LJIIIIZZ(string, "context.getString(pageTitleRes, 0)");
        this.LJLILLLLZI = new FavoriteTabItemV2(playlistCollectionPageData, s.LJJZZIII(" 0", string), "favourite_playlist", "mixes");
        this.LJLJI = new C192197gV(this);
    }

    @Override // X.AbstractC186347Ta
    public final void LIZJ(Lifecycle.Event event) {
        o.LJIIIZ(event, "event");
        int i = C192207gW.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (C52535Kjb.LIZIZ()) {
                PlaylistCollectionStateAgent.LJIIZILJ().LIZJ(this.LJLJI);
                return;
            } else {
                PlaylistCollectionStateAgent.LJIIZILJ().LJIIIIZZ(this);
                return;
            }
        }
        if (C52535Kjb.LIZIZ()) {
            PlaylistCollectionStateAgent.LJIIZILJ().LJFF(this.LJLJI);
        } else {
            PlaylistCollectionStateAgent.LJIIZILJ().LJI(this);
        }
    }

    @Override // X.AnonymousClass885
    public final void id(String id, Object obj, EnumC2063587z source) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(id, "id");
        o.LJIIIZ(source, "source");
        if (source == EnumC2063587z.MUTATION) {
            if (booleanValue) {
                LIZLLL(this.LJLIL);
            } else {
                LIZIZ(this.LJLIL);
            }
        }
    }
}
