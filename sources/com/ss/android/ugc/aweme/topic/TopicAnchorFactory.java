package com.ss.android.ugc.aweme.topic;

import X.C113554cx;
import X.C39557Ffl;
import X.C47261Igj;
import X.C65352Pkq;
import X.C7S7;
import X.C7S8;
import X.EnumC42934Gt8;
import X.InterfaceC65350Pko;
import X.InterfaceC72202SVi;
import X.OSZ;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicAnchorFactory implements ITopicAnchorFactory {
    public final HashMap<Integer, InterfaceC65350Pko<? extends InterfaceC72202SVi>> LIZ;

    public TopicAnchorFactory() {
        HashMap<Integer, InterfaceC65350Pko<? extends InterfaceC72202SVi>> hashMap = new HashMap<>();
        this.LIZ = hashMap;
        C113554cx.LJJLIIIJJIZ(C47261Igj.LJII(new OSZ(Integer.valueOf(EnumC42934Gt8.ANCHOR_BOOKTOK.getTYPE()), C65352Pkq.LIZ(C7S7.class)), new OSZ(Integer.valueOf(EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE()), C65352Pkq.LIZ(C7S8.class))), hashMap);
    }

    @Override // com.ss.android.ugc.aweme.topic.ITopicAnchorFactory
    public final <T extends InterfaceC72202SVi> T LIZ(int i) {
        T t;
        InterfaceC65350Pko<? extends InterfaceC72202SVi> interfaceC65350Pko = this.LIZ.get(Integer.valueOf(i));
        if (interfaceC65350Pko != null) {
            t = (T) C39557Ffl.LIZ(interfaceC65350Pko).newInstance();
        } else {
            t = null;
        }
        o.LJII(t, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.topic.TopicAnchorFactory.getAnchorBusinessService");
        return t;
    }
}
