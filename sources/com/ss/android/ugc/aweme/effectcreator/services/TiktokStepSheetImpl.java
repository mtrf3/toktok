package com.ss.android.ugc.aweme.effectcreator.services;

import X.A1Z;
import X.ASL;
import X.C26224AQy;
import X.C32I;
import X.C93481aRZ;
import X.C93482aRa;
import X.DialogInterfaceOnDismissListenerC93562aSs;
import X.InterfaceC93654aUM;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IStepIntroSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS1S0001000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS9S1000000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokStepSheetImpl implements IStepIntroSheet {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IStepIntroSheet, X.InterfaceC93655aUN
    public void show(FragmentManager fragmentManager, C93481aRZ info, InterfaceC93654aUM interfaceC93654aUM) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(info, "info");
        C26224AQy c26224AQy = new C26224AQy();
        Integer num = info.LIZ;
        if (num != null) {
            c26224AQy.LIZJ = new IDqS1S0001000_42(num.intValue(), 0);
        }
        String str = info.LIZIZ;
        if (str != null) {
            c26224AQy.LIZJ = new IDqS9S1000000_42(str, 0);
        }
        c26224AQy.LIZLLL = 1;
        String str2 = info.LIZJ;
        if (str2 != null) {
            c26224AQy.LJ = str2;
        }
        String str3 = info.LIZLLL;
        if (str3 != null) {
            c26224AQy.LJFF = str3;
        }
        c26224AQy.LJIILIIL = info.LJI;
        ArrayList arrayList = new ArrayList();
        String str4 = info.LJ;
        if (str4 != null) {
            arrayList.add(str4);
        }
        List<C93482aRa> list = info.LJFF;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
        for (C93482aRa c93482aRa : list) {
            arrayList2.add(new A1Z(0, c93482aRa.LIZ, c93482aRa.LIZIZ));
        }
        arrayList.addAll(arrayList2);
        c26224AQy.LIZJ(arrayList);
        String str5 = info.LJII;
        if (str5 != null) {
            IDqS419S0100000_42 iDqS419S0100000_42 = new IDqS419S0100000_42(interfaceC93654aUM, 20);
            c26224AQy.LJII = str5;
            c26224AQy.LJIIIZ = iDqS419S0100000_42;
        }
        String str6 = info.LJIIIIZZ;
        if (str6 != null) {
            if (info.LJII == null) {
                IDqS419S0100000_42 iDqS419S0100000_422 = new IDqS419S0100000_42(interfaceC93654aUM, 21);
                c26224AQy.LJII = str6;
                c26224AQy.LJIIIZ = iDqS419S0100000_422;
            } else {
                IDqS419S0100000_42 iDqS419S0100000_423 = new IDqS419S0100000_42(interfaceC93654aUM, 22);
                c26224AQy.LJIIIIZZ = str6;
                c26224AQy.LJIIJ = iDqS419S0100000_423;
            }
        }
        ASL LIZ = c26224AQy.LIZ();
        DialogInterfaceOnDismissListenerC93562aSs dialogInterfaceOnDismissListenerC93562aSs = new DialogInterfaceOnDismissListenerC93562aSs(interfaceC93654aUM);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLILLLLZI = dialogInterfaceOnDismissListenerC93562aSs;
        tuxSheet.show(fragmentManager, "stepSheet");
    }
}
