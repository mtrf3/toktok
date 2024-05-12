package com.ss.android.ugc.feed.platform.panel.earphone;

import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C62822Ol8;
import X.C8MM;
import X.InterfaceC55102Lju;
import X.JD7;
import X.JDP;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EarphonePlayerControlComponent extends BasePanelComponent implements IEarphonePlayerControlComponent, InterfaceC55102Lju {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 394));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(JDP.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 393));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 392));

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1143713310) {
            return null;
        }
        return this;
    }

    public final IEarphonePlayerControlService v3() {
        return (IEarphonePlayerControlService) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.earphone.IEarphonePlayerControlComponent
    public final void QQ() {
        v3().LJ("common_feed", true);
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        if (v3().LIZIZ()) {
            JD7 jd7 = new JD7(this);
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                v3().LJI(LIZLLL, jd7);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        o.LJIIIZ(c8mm, "<this>");
        if (v3().LIZIZ()) {
            c8mm.LIZ("event_on_playing", new AqS174S0100000_8(this, 146));
        }
    }
}
