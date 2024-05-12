package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C26045AKb;
import X.C62100OYu;
import X.C62374Odu;
import X.C76800UCe;
import X.InterfaceC62225ObV;
import X.InterfaceC65784Pro;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PoiSharePackage extends LinkDefaultSharePackage {
    public static final int $stable = 0;
    public static final C62100OYu Companion = new C62100OYu();

    public PoiSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJI(Context context, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        if (interfaceC62225ObV != null) {
            if (this.url.length() == 0) {
                if (view != null) {
                    C26045AKb c26045AKb = new C26045AKb(view);
                    c26045AKb.LJIIIZ(context.getResources().getString(R.string.rk_));
                    c26045AKb.LJIIJ();
                    return;
                }
                return;
            }
            super.LJI(context, interfaceC62225ObV, view, interfaceC65784Pro);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        super.LJI(context, interfaceC62225ObV, view, interfaceC65784Pro);
    }
}
