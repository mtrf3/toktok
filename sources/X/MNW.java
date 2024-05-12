package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceExposedInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import java.util.List;

/* loaded from: classes10.dex */
public final class MNW implements InterfaceC56881MUb {
    public final /* synthetic */ C56721MNx LIZ;

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
        NoticeItems notices;
        List<MusNotice> items;
        InboxEntranceExposedInfo exposedInfo = this.LIZ.N().entranceCell.getExposedInfo();
        if (exposedInfo == null || (notices = exposedInfo.getNotices()) == null || (items = notices.getItems()) == null) {
            return C61878OQg.INSTANCE;
        }
        return items;
    }

    @Override // X.InterfaceC56881MUb
    public final Fragment getFragment() {
        return this.LIZ.getFragment();
    }

    public MNW(C56721MNx c56721MNx) {
        this.LIZ = c56721MNx;
    }
}
