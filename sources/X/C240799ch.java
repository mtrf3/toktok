package X;

import com.ss.android.ugc.aweme.music.search.cell.SearchMusicCellAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.9ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240799ch extends AbstractC65781Prl implements InterfaceC88473Ynt<SearchMusicCellAssem, C240719cZ, EnumC241749eE, C76800UCe> {
    public static final C240799ch LJLIL = new C240799ch();

    public C240799ch() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(SearchMusicCellAssem searchMusicCellAssem, C240719cZ c240719cZ, EnumC241749eE enumC241749eE) {
        String str;
        MusicModel musicModel;
        SearchMusicCellAssem selectSubscribe = searchMusicCellAssem;
        C240719cZ c240719cZ2 = c240719cZ;
        EnumC241749eE status = enumC241749eE;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(status, "status");
        if (c240719cZ2 != null && (musicModel = c240719cZ2.LJLIL) != null) {
            str = musicModel.getMusicId();
        } else {
            str = null;
        }
        if (o.LJ(str, ((C240719cZ) C51029K0z.LJIILLIIL(selectSubscribe)).LJLIL.getMusicId())) {
            selectSubscribe.m4(status);
        } else {
            selectSubscribe.m4(EnumC241749eE.DEFAULT);
        }
        return C76800UCe.LIZ;
    }
}
