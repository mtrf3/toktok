package com.ss.android.ugc.aweme.commercialize.media.impl.handler;

import X.H92;
import X.H95;
import X.ORS;
import X.XWJ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceSoundPageHandler implements XWJ {
    @Override // X.XWJ
    public final void Om0() {
        if (CommerceMediaServiceImpl.LIZJ().LIZ()) {
            H92.LJLIL.setInCommercialSoundPage(true);
        }
        H92.LJLIL.getClass();
        ((ArrayList) H92.LJLLILLLL).add(new H95());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            H92.LJLIL.getClass();
            ORS.LJJZ(H92.LJLLILLLL);
            H92.LJFF(null);
            H92.LJI(null);
            H92.LJLLI.LIZIZ(H92.LJLILLLLZI[8], null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (java.lang.Boolean.valueOf(r0).booleanValue() != false) goto L10;
     */
    @Override // X.XWJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nX(int r6, java.lang.Integer r7, java.lang.String r8) {
        /*
            r5 = this;
            X.H92 r4 = X.H92.LJLIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.H92.LJI(r0)
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L5b
            boolean r0 = r4.getInCommercialSoundPage()
            if (r0 == 0) goto L59
            if (r7 != 0) goto L52
        L15:
            r0 = 1
        L16:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5b
        L20:
            X.H92.LJFF(r8)
            if (r7 == 0) goto L46
            int r1 = r7.intValue()
            boolean r0 = r4.getInCommercialSoundPage()
            if (r0 == 0) goto L32
            if (r1 <= 0) goto L32
            r2 = 1
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L46
            int r0 = r7.intValue()
            int r0 = r0 + 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L46:
            X.HCm r2 = X.H92.LJLLI
            X.TBo<java.lang.Object>[] r1 = X.H92.LJLILLLLZI
            r0 = 8
            r0 = r1[r0]
            r2.LIZIZ(r0, r3)
            return
        L52:
            int r0 = r7.intValue()
            if (r0 == 0) goto L59
            goto L15
        L59:
            r0 = 0
            goto L16
        L5b:
            r8 = r3
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.media.impl.handler.CommerceSoundPageHandler.nX(int, java.lang.Integer, java.lang.String):void");
    }
}
