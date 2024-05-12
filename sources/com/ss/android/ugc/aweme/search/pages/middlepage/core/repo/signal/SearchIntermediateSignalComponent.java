package com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal;

import X.C212428Vi;
import X.C221108m2;
import X.C221138m5;
import X.C221178m9;
import X.C51781KTx;
import X.C5H3;
import X.C62822Ol8;
import X.EnumC221088m0;
import X.IDP;
import X.InterfaceC221168m8;
import X.JAK;
import X.KU4;
import X.QD3;
import X.Z9N;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class SearchIntermediateSignalComponent extends BasePanelComponent {
    public final C5H3 LJLIL;
    public boolean LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchIntermediateSignalComponent() {
        C62822Ol8 c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS153S0100000_3((KU4) this, 854), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS60S0110000_3(false, (KU4) this, 2));
        }
        this.LJLIL = c62822Ol8;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        this.LJLILLLLZI = false;
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        this.LJLILLLLZI = true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KU4
    public final void onPagePause(int i) {
        super.onPagePause(i);
        this.LJLILLLLZI = false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KU4
    public final void onPageResume(int i) {
        super.onPageResume(i);
        this.LJLILLLLZI = true;
    }

    @QD3
    public final void onSearchSuggestSignalEvent(C221178m9 event) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        IDP playerController;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility2;
        Aweme currentAweme;
        long currentTimeMillis;
        long j;
        int i;
        o.LJIIIZ(event, "event");
        if (!this.LJLILLLLZI || (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLIL.getValue()) == null || (playerController = iFeedPanelPlatformAbility.getPlayerController()) == null || (iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LJLIL.getValue()) == null || (currentAweme = iFeedPanelPlatformAbility2.getCurrentAweme()) == null) {
            return;
        }
        String aid = currentAweme.getAid();
        if (TextUtils.isEmpty(aid)) {
            return;
        }
        long LJJJJI = playerController.LJJJJI(aid);
        if (LJJJJI <= 0) {
            return;
        }
        Z9N z9n = Z9N.LIZIZ;
        InterfaceC221168m8 LJLLLLLL = z9n.LJLLLLLL();
        if (z9n.LJJIJLIJ(playerController.LJLJI)) {
            j = (System.currentTimeMillis() - LJLLLLLL.LIZLLL()) + LJLLLLLL.LIZ();
            currentTimeMillis = LJLLLLLL.LJ();
        } else {
            currentTimeMillis = System.currentTimeMillis() - LJJJJI;
            j = 0;
        }
        if (currentAweme.getVideo() != null) {
            i = currentAweme.getVideo().getDuration();
        } else {
            i = 0;
        }
        z9n.LLJJIII(C212428Vi.LIZ(this), playerController.LJLJI, currentAweme.getGroupId(), LJJJJI, j, currentTimeMillis, Integer.valueOf(i));
    }
}
