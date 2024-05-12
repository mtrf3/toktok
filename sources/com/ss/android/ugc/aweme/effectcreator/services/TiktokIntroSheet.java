package com.ss.android.ugc.aweme.effectcreator.services;

import X.C26224AQy;
import X.C93480aRY;
import X.C93560aSq;
import X.InterfaceC93654aUM;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IMessageIntroSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokIntroSheet implements IMessageIntroSheet {
    public static final C93560aSq Companion = new C93560aSq();

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IMessageIntroSheet, X.InterfaceC93655aUN
    public void show(FragmentManager fragmentManager, C93480aRY info, InterfaceC93654aUM interfaceC93654aUM) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(info, "info");
        C26224AQy c26224AQy = new C26224AQy();
        c26224AQy.LIZJ = new IDqS419S0100000_42(info, 18);
        c26224AQy.LIZLLL = 0;
        c26224AQy.LJ = String.valueOf(info.LIZJ);
        c26224AQy.LIZIZ(String.valueOf(info.LJ));
        c26224AQy.LJIILIIL = false;
        String valueOf = String.valueOf(info.LJII);
        IDqS419S0100000_42 iDqS419S0100000_42 = new IDqS419S0100000_42(interfaceC93654aUM, 19);
        c26224AQy.LJII = valueOf;
        c26224AQy.LJIIIZ = iDqS419S0100000_42;
        TuxSheet tuxSheet = c26224AQy.LIZ().LIZ;
        tuxSheet.LL = true;
        tuxSheet.LJLJI = false;
        tuxSheet.show(fragmentManager, "CkeMessageIntroSheet");
    }
}
