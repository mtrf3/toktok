package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;

/* loaded from: classes10.dex */
public final class MNX implements InterfaceC56881MUb {
    public final /* synthetic */ C56698MNa LIZ;

    @Override // X.InterfaceC56881MUb
    public final void LIZ() {
    }

    @Override // X.InterfaceC56881MUb
    public final MSP LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC56881MUb
    public final void LIZLLL(int i) {
    }

    @Override // X.InterfaceC56881MUb
    public final InterfaceC56771MPv LIZJ() {
        return C56690MMs.LIZ(this.LIZ.getFragment());
    }

    @Override // X.InterfaceC56881MUb
    public final List<MusNotice> getData() {
        List<MusNotice> list = this.LIZ.N().noticeList;
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC56881MUb
    public final Fragment getFragment() {
        return this.LIZ.getFragment();
    }

    public MNX(C56698MNa c56698MNa) {
        this.LIZ = c56698MNa;
    }
}
