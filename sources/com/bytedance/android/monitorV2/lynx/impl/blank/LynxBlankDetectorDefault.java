package com.bytedance.android.monitorV2.lynx.impl.blank;

import X.C141335gf;
import X.C38192Eyq;
import X.C3C5;
import X.C76800UCe;
import X.C77117UOj;
import X.C79611VMh;
import X.C79612VMi;
import X.C79648VNs;
import X.C79678VOw;
import X.InterfaceC79629VMz;
import X.VJI;
import X.VMA;
import android.graphics.Rect;
import android.view.View;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxBlankDetectorDefault implements VMA {
    @Override // X.VMA
    public void detect(View view, InterfaceC79629VMz listener) {
        Object LIZ;
        o.LJIIJ(listener, "listener");
        if (view == null) {
            listener.LIZ(new C79611VMh(0));
            return;
        }
        VJI vji = new VJI(view.getWidth(), view.getHeight());
        long currentTimeMillis = System.currentTimeMillis();
        C79678VOw c79678VOw = C79678VOw.LIZJ;
        c79678VOw.getClass();
        try {
            Rect LIZLLL = C79678VOw.LIZLLL(view);
            C79678VOw.LIZJ(view, LIZLLL, new HashSet(), new C79648VNs(c79678VOw, LIZLLL, view, vji));
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            vji.LIZ(0, 0, view.getWidth(), view.getHeight(), 1);
            C77117UOj.LJIIZILJ(m10exceptionOrNullimpl);
        }
        C38192Eyq.LIZIZ(new C79612VMi(vji, listener, System.currentTimeMillis() - currentTimeMillis));
    }
}
