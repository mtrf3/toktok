package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.C221108m2;
import X.C62822Ol8;
import X.C66952jz;
import X.C66962k0;
import X.InterfaceC49871Jhj;
import X.MBB;
import X.XKQ;
import X.XKX;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchCardContainerSharedVM extends ViewModel {
    public static final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C66962k0.LJLIL);
    public final ArrayList<ISearchCardProtocol<InterfaceC49871Jhj>> LJLIL = new ArrayList<>();
    public final ConcurrentHashMap<Integer, ISearchCardProtocol<InterfaceC49871Jhj>> LJLILLLLZI = new ConcurrentHashMap<>();
    public XKQ LJLJI;

    public final ISearchCardProtocol<InterfaceC49871Jhj> gv0(InterfaceC49871Jhj interfaceC49871Jhj) {
        ISearchCardProtocol<InterfaceC49871Jhj> iSearchCardProtocol;
        Iterator<ISearchCardProtocol<InterfaceC49871Jhj>> it = this.LJLIL.iterator();
        while (true) {
            if (it.hasNext()) {
                iSearchCardProtocol = it.next();
                ISearchCardProtocol<InterfaceC49871Jhj> iSearchCardProtocol2 = iSearchCardProtocol;
                if (iSearchCardProtocol2.LLLIZZ().LIZ(interfaceC49871Jhj) && iSearchCardProtocol2.LJJLIL(interfaceC49871Jhj)) {
                    break;
                }
            } else {
                iSearchCardProtocol = null;
                break;
            }
        }
        ISearchCardProtocol<InterfaceC49871Jhj> iSearchCardProtocol3 = iSearchCardProtocol;
        if (iSearchCardProtocol3 == null) {
            return NonMatching.LJLIL;
        }
        return iSearchCardProtocol3;
    }

    public final ISearchCardProtocol<InterfaceC49871Jhj> hv0(InterfaceC49871Jhj searchCardMetaData) {
        ISearchCardProtocol<InterfaceC49871Jhj> putIfAbsent;
        o.LJIIIZ(searchCardMetaData, "searchCardMetaData");
        XKX.LJ(MBB.INSTANCE, new C66952jz(this, null));
        if (this.LJLIL.isEmpty()) {
            return null;
        }
        ConcurrentHashMap<Integer, ISearchCardProtocol<InterfaceC49871Jhj>> concurrentHashMap = this.LJLILLLLZI;
        Integer valueOf = Integer.valueOf(System.identityHashCode(searchCardMetaData));
        ISearchCardProtocol<InterfaceC49871Jhj> iSearchCardProtocol = concurrentHashMap.get(valueOf);
        if (iSearchCardProtocol == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (iSearchCardProtocol = gv0(searchCardMetaData)))) != null) {
            iSearchCardProtocol = putIfAbsent;
        }
        ISearchCardProtocol<InterfaceC49871Jhj> iSearchCardProtocol2 = iSearchCardProtocol;
        if (o.LJ(iSearchCardProtocol2, NonMatching.LJLIL)) {
            return null;
        }
        return iSearchCardProtocol2;
    }
}
