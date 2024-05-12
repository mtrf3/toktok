package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZ6 implements InterfaceC84903XTv {
    public final /* synthetic */ VerticalMusicView LIZ;

    public XZ6(VerticalMusicView verticalMusicView) {
        this.LIZ = verticalMusicView;
    }

    @Override // X.InterfaceC84903XTv
    public final void LIZ(String str, boolean z) {
        this.LIZ.LJJI(str, z);
        VerticalMusicView verticalMusicView = this.LIZ;
        if (str != null) {
            XZQ LJIIL = verticalMusicView.LJIIL();
            if (LJIIL != null) {
                LJIIL.bY(str, z);
            }
        } else {
            verticalMusicView.getClass();
        }
        Iterator<MusicModel> it = this.LIZ.LLIZLLLIL.LIZ.iterator();
        while (it.hasNext()) {
            MusicModel next = it.next();
            if (o.LJ(next.getMusicId(), str)) {
                if (z) {
                    next.setCollectionType(MusicModel.CollectionType.COLLECTED);
                } else {
                    next.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                }
            }
        }
        XZC xzc = this.LIZ.LLJILJILJ;
        if (xzc != null) {
            xzc.notifyDataSetChanged();
        }
    }
}
