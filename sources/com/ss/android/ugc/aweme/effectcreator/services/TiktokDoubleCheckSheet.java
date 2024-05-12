package com.ss.android.ugc.aweme.effectcreator.services;

import X.C245319jz;
import X.C252669vq;
import X.C76800UCe;
import X.C93478aRW;
import X.C93558aSo;
import X.InterfaceC88472Yns;
import X.InterfaceC93654aUM;
import Y.ACListenerS21S0100000_1;
import Y.IDCListenerS290S0100000_42;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IDoubleCheckSheet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokDoubleCheckSheet implements IDoubleCheckSheet {
    public static final C93558aSo Companion = new C93558aSo();

    /* renamed from: show, reason: avoid collision after fix types in other method */
    public void show2(FragmentManager fragmentManager, List<C93478aRW> info, InterfaceC93654aUM interfaceC93654aUM) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(info, "info");
        ArrayList arrayList = new ArrayList();
        Iterator<C93478aRW> it = info.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                C93478aRW next = it.next();
                C252669vq c252669vq = new C252669vq();
                c252669vq.LIZIZ(next.LIZ);
                if (next.LIZIZ != 0) {
                    i = 1;
                }
                c252669vq.LIZJ = i;
                c252669vq.LJ = new ACListenerS21S0100000_1(new IDqS175S0200000_42(next, interfaceC93654aUM, 5), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                arrayList.add(c252669vq);
            } else {
                C245319jz c245319jz = new C245319jz();
                C252669vq[] c252669vqArr = (C252669vq[]) arrayList.toArray(new C252669vq[0]);
                c245319jz.LIZIZ((C252669vq[]) Arrays.copyOf(c252669vqArr, c252669vqArr.length));
                c245319jz.LIZ.LJLIL = new IDCListenerS290S0100000_42(interfaceC93654aUM, 0);
                c245319jz.LIZJ().show(fragmentManager, "DoubleCheckSheet");
                return;
            }
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IDoubleCheckSheet, X.InterfaceC93655aUN
    public /* bridge */ /* synthetic */ void show(FragmentManager fragmentManager, List<? extends C93478aRW> list, InterfaceC93654aUM interfaceC93654aUM) {
        show2(fragmentManager, (List<C93478aRW>) list, interfaceC93654aUM);
    }
}
