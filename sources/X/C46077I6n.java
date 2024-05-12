package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.I6n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46077I6n implements InterfaceC45790Hy6 {
    public final /* synthetic */ C46066I6c LIZ;

    @Override // X.InterfaceC45790Hy6
    public final void LJFF() {
    }

    @Override // X.InterfaceC45790Hy6
    public final void LJI() {
    }

    public C46077I6n(C46066I6c c46066I6c) {
        this.LIZ = c46066I6c;
    }

    @Override // X.InterfaceC45790Hy6
    public final void LIZ(AVMusic aVMusic) {
        this.LIZ.LJJLIIJ().Nv0(-1);
    }

    @Override // X.InterfaceC45790Hy6
    public final void LIZIZ(Exception exc) {
        this.LIZ.LJJLIIJ().Nv0(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC45790Hy6
    public final void LIZJ(List<? extends AVMusic> list) {
        Cut2EditTransferModel cut2EditTransferModel;
        List<AVMusic> musicList;
        H78.LIZ("request music list success when force apply music sync");
        if (list != null && !list.isEmpty() && (cut2EditTransferModel = this.LIZ.LJJLJLI().LJ) != null && (musicList = cut2EditTransferModel.getMusicList()) != 0) {
            musicList.clear();
            musicList.add(ListProtector.get(list, 0));
        }
    }

    @Override // X.InterfaceC45790Hy6
    public final void LIZLLL(AVMusic aVMusic) {
        String LJ;
        H78.LIZ("request music model success when force apply music sync");
        if (aVMusic == null) {
            this.LIZ.LJJLIIJ().Nv0(-1);
            return;
        }
        this.LIZ.LJJLIIJ().Nv0(1);
        if (this.LIZ.LJJLIIJ().Ov0().getCurrentTabIndex() == 0 && (LJ = C45771Hxn.LJ(aVMusic)) != null) {
            C46066I6c.LLZLL(this.LIZ, LJ, aVMusic, false, 4, null);
            C46072I6i c46072I6i = this.LIZ.LLJILJIL;
            if (c46072I6i != null) {
                C46072I6i.LJIILIIL(c46072I6i, aVMusic, 0, 62);
            } else {
                o.LJIJI("musicSyncController");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC45790Hy6
    public final void LJ(Exception exc) {
        this.LIZ.LJJLIIJ().Nv0(-1);
    }

    @Override // X.InterfaceC45790Hy6
    public final void LJII(AVMusic aVMusic) {
        this.LIZ.LJJLIIJ().Nv0(-1);
    }
}
