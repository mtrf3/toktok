package X;

import Y.AgS50S0201000_15;
import Y.AgS5S1210000_15;
import android.content.Context;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: X.XVf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84939XVf {
    public final ChooseMusicApi.API LIZ = ChooseMusicApi.LIZ;
    public final DataCenter LIZIZ;
    public boolean LIZJ;
    public final Context LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;

    public final void LIZJ() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        ChooseMusicApi.LIZ.userCollectedMusicList(0, 20, "").LJ(new AgS50S0201000_15(0, this, C44428Hc8.LIZ(), 2), C10K.LJIIIIZZ, null);
    }

    public C84939XVf(Context context, DataCenter dataCenter) {
        this.LIZIZ = dataCenter;
        this.LIZLLL = context;
    }

    public final void LIZIZ(boolean z, String str, Music music) {
        ChooseMusicApi.LIZ.musicPick((Integer) this.LIZIZ.get("radio_cursor", 0), str, Boolean.FALSE).LJ(new TAX(music), C10K.LJI, null).LJ(new AgS5S1210000_15(this, z, str, music, 1), C10K.LJIIIIZZ, null);
    }

    public final void LIZ(final MusicModel musicModel, String str, final int i, final int i2, final int i3) {
        this.LIZ.collectMusic(str, i).LJ(new C10I() { // from class: X.XWl
            @Override // X.C10I
            public final Object then(C10K c10k) {
                MusicModel.CollectionType collectionType;
                MusicModel.CollectionType collectionType2;
                C84939XVf c84939XVf = C84939XVf.this;
                MusicModel musicModel2 = musicModel;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                c84939XVf.getClass();
                if (c10k.LJIIL()) {
                    return null;
                }
                if (c10k.LJIILJJIL()) {
                    if (i4 == 1) {
                        collectionType2 = MusicModel.CollectionType.NOT_COLLECTED;
                    } else {
                        collectionType2 = MusicModel.CollectionType.COLLECTED;
                    }
                    musicModel2.setCollectionType(collectionType2);
                    c84939XVf.LIZIZ.jv0(new XYD(1, i4, i5, i6, musicModel2), "music_collect_status");
                    return null;
                }
                if (!c10k.LJIILIIL()) {
                    return null;
                }
                if (i4 == 1) {
                    collectionType = MusicModel.CollectionType.COLLECTED;
                } else {
                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                }
                musicModel2.setCollectionType(collectionType);
                c84939XVf.LIZIZ.jv0(new XYD(0, i4, i5, i6, musicModel2), "music_collect_status");
                return null;
            }
        }, C10K.LJIIIIZZ, null);
    }
}
