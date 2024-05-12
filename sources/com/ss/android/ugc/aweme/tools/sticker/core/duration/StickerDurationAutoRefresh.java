package com.ss.android.ugc.aweme.tools.sticker.core.duration;

import X.C36636EZk;
import X.C3C3;
import X.C48841JEv;
import X.C64962gm;
import X.C65172h7;
import X.C65182h8;
import X.C6UE;
import X.C76800UCe;
import X.C78880UxY;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.V1M;
import Y.IDeS153S0200000_15;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StickerDurationAutoRefresh {
    public final InterfaceC65784Pro<Integer> LIZ;
    public final InterfaceC65784Pro<Integer> LIZIZ;
    public boolean LIZJ;
    public C64962gm LIZLLL = C48841JEv.LIZ(C36636EZk.LIZ);

    public final void LIZ(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LIZJ = true;
        C48841JEv.LIZLLL(this.LIZLLL, "");
        this.LIZLLL = C48841JEv.LIZ(C36636EZk.LIZ);
        V1M.LJJIJIIJIL(new IDeS153S0200000_15(new C3C3(new C65172h7(this, null)), new C65182h8(interfaceC88472Yns, this, null), 0), this.LIZLLL);
    }

    public final void LIZIZ(BaseStickerModel baseStickerModel, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        if (!LIZJ(baseStickerModel.getStartTime(), baseStickerModel.getEndTime()) && C78880UxY.LJJLIIIIJ(baseStickerModel)) {
            LIZ(interfaceC88472Yns);
        }
    }

    public final boolean LIZJ(float f, float f2) {
        if (f == 0.0f && f2 == this.LIZIZ.invoke().intValue()) {
            return true;
        }
        return false;
    }

    public StickerDurationAutoRefresh(Lifecycle lifecycle, InterfaceC65784Pro<Integer> interfaceC65784Pro, InterfaceC65784Pro<Integer> interfaceC65784Pro2) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = interfaceC65784Pro2;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (C6UE.LIZ[event.ordinal()] == 1) {
                    C48841JEv.LIZLLL(StickerDurationAutoRefresh.this.LIZLLL, "");
                }
            }
        });
    }
}
