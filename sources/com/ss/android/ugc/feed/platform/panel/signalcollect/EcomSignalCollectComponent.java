package com.ss.android.ugc.feed.platform.panel.signalcollect;

import X.C221108m2;
import X.C221138m5;
import X.C51781KTx;
import X.C5H3;
import X.C62822Ol8;
import X.C8MM;
import X.EnumC221088m0;
import X.JAK;
import X.KU4;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcomSignalCollectComponent extends BasePanelComponent {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 413));
    public final C5H3 LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public EcomSignalCollectComponent() {
        C62822Ol8 c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 414), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 14));
        }
        this.LJLILLLLZI = c62822Ol8;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        o.LJIIIZ(c8mm, "<this>");
        c8mm.LIZ("event_on_play_pause", new AqS174S0100000_8(this, 153));
    }
}
