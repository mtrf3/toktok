package X;

import com.ss.android.ugc.aweme.music.assem.list.cell.assem.MineMusicCellAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.9d4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C241029d4 extends AbstractC65781Prl implements InterfaceC88473Ynt<MineMusicCellAssem, C240719cZ, EnumC241749eE, C76800UCe> {
    public static final C241029d4 LJLIL = new C241029d4();

    public C241029d4() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(MineMusicCellAssem mineMusicCellAssem, C240719cZ c240719cZ, EnumC241749eE enumC241749eE) {
        String str;
        MusicModel musicModel;
        MineMusicCellAssem selectSubscribe = mineMusicCellAssem;
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
            selectSubscribe.Z3(status);
        } else {
            selectSubscribe.Z3(EnumC241749eE.DEFAULT);
        }
        return C76800UCe.LIZ;
    }
}
