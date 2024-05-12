package com.ss.android.ugc.aweme.effectcreator.services;

import X.C139825eE;
import X.C82682Wcg;
import X.InterfaceC93656aUO;
import X.WHL;
import android.content.Context;
import android.view.View;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.ISingleLineTips;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TikTokSingleLineTips implements ISingleLineTips {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.ISingleLineTips, X.InterfaceC93657aUP
    public void show(Context context, View anchorView, String info, InterfaceC93656aUO interfaceC93656aUO) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(anchorView, "anchorView");
        o.LJIIIZ(info, "info");
        Context context2 = anchorView.getContext();
        o.LJIIIIZZ(context2, "anchorView.context");
        C139825eE c139825eE = new C139825eE(context2);
        c139825eE.LIZJ = info;
        C82682Wcg c82682Wcg = c139825eE.LIZ;
        c82682Wcg.LJII = -1001L;
        c82682Wcg.LIZIZ = anchorView;
        c139825eE.LJI(WHL.TOP);
        c139825eE.LIZ.LJIIIZ = true;
        c139825eE.LIZJ().show();
    }
}
