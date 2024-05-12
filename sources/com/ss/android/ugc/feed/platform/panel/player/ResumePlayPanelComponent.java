package com.ss.android.ugc.feed.platform.panel.player;

import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C51781KTx;
import X.C5H3;
import X.C62822Ol8;
import X.EnumC221088m0;
import X.InterfaceC46330IGg;
import X.InterfaceC55102Lju;
import X.JAK;
import X.JAP;
import X.KU4;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;

/* loaded from: classes9.dex */
public final class ResumePlayPanelComponent extends BasePanelComponent implements IResumePlayPanelComponent, InterfaceC55102Lju {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final C5H3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C5H3 LJLJJI;
    public long LJLJJL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -827329592) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IResumePlayPanelComponent
    public final boolean Pw() {
        if (this.LJLJJL > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResumePlayPanelComponent() {
        C62822Ol8 c62822Ol8;
        C62822Ol8 c62822Ol82;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 410), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 12));
        }
        this.LJLIL = c62822Ol8;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 409));
        this.LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 412));
        if (JAK.LIZ()) {
            C221138m5 c221138m52 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 411), null);
            C51781KTx.LIZJ(this, c221138m52);
            c62822Ol82 = c221138m52;
        } else {
            c62822Ol82 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 13));
        }
        this.LJLJJI = c62822Ol82;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJJL = 0L;
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLJI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.De0(new JAP(this));
        }
    }

    @Override // X.C8W0
    public final void onPause() {
        long j;
        InterfaceC46330IGg playerManager;
        super.onPause();
        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LJLILLLLZI.getValue();
        if (iPlayerComponentAbility != null && (playerManager = iPlayerComponentAbility.getPlayerManager()) != null) {
            j = playerManager.getCurrentPosition();
        } else {
            j = 0;
        }
        this.LJLJJL = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    @Override // com.ss.android.ugc.feed.platform.panel.player.IResumePlayPanelComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Na(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.player.ResumePlayPanelComponent.Na(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KU4
    public final void onPagePause(int i) {
        long j;
        InterfaceC46330IGg playerManager;
        super.onPagePause(i);
        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LJLILLLLZI.getValue();
        if (iPlayerComponentAbility != null && (playerManager = iPlayerComponentAbility.getPlayerManager()) != null) {
            j = playerManager.getCurrentPosition();
        } else {
            j = 0;
        }
        this.LJLJJL = j;
    }
}
