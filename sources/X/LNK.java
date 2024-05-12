package X;

import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFFeedAssem;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes10.dex */
public final class LNK extends LK4 {
    public final /* synthetic */ MFFeedAssem LJLIL;

    public LNK(MFFeedAssem mFFeedAssem) {
        this.LJLIL = mFFeedAssem;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        String str;
        C2U8.LIZ(new IEvent() { // from class: X.2JC
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C2U8.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C2U8.LIZIZ(this);
                return this;
            }
        });
        HomeViewPagerAbility v3 = this.LJLIL.v3();
        if (v3 == null || (str = v3.n7(i)) == null) {
            str = "";
        }
        C2U8.LIZ(new LNM(str));
    }
}
