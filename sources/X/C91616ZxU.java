package X;

import com.ss.android.ugc.aweme.dsp.playpage.viewpager.DspViewPagerAssem;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;

/* renamed from: X.ZxU, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final /* synthetic */ class C91616ZxU extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C91616ZxU(Object obj) {
        super(0, obj, DspViewPagerAssem.class, "notifyXTabClose", "notifyXTabClose()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C8W0 c8w0 = (C8W0) this.receiver;
        c8w0.getClass();
        IXTabPanelAbility LJFF = C91264Zro.LJFF(c8w0);
        if (LJFF != null) {
            LJFF.MG();
        }
        return C76800UCe.LIZ;
    }
}
