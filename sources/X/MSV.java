package X;

import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MSV implements InterfaceC56881MUb {
    public final /* synthetic */ MSU LIZ;

    @Override // X.InterfaceC56881MUb
    public final void LIZ() {
        CreatorNoticeResultVM creatorNoticeResultVM = this.LIZ.LJLILLLLZI;
        if (creatorNoticeResultVM != null) {
            creatorNoticeResultVM.iv0(EnumC56840MSm.USER_CLICK);
        }
    }

    @Override // X.InterfaceC56881MUb
    public final MSP LIZIZ() {
        MSP msp = this.LIZ.LJLJJL;
        if (msp != null) {
            return msp;
        }
        o.LJIJI("turnOnQAListener");
        throw null;
    }

    @Override // X.InterfaceC56881MUb
    public final InterfaceC56771MPv LIZJ() {
        return this.LIZ.LJLILLLLZI;
    }

    @Override // X.InterfaceC56881MUb
    public final List<MusNotice> getData() {
        return this.LIZ.getData();
    }

    @Override // X.InterfaceC56881MUb
    public final Fragment getFragment() {
        return this.LIZ.LJLIL;
    }

    public MSV(MSU msu) {
        this.LIZ = msu;
    }

    @Override // X.InterfaceC56881MUb
    public final void LIZLLL(int i) {
        if (C52485Kin.LIZ) {
            i--;
        }
        if (i >= 0 && i < getData().size()) {
            this.LIZ.LJLJI.e3((MusNotice) ListProtector.get(getData(), i));
        }
    }
}
