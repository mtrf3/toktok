package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C221108m2;
import X.C48880JGi;
import X.C48881JGj;
import X.C48887JGp;
import X.C48892JGu;
import X.C48994JKs;
import X.C5UN;
import X.C62822Ol8;
import X.InterfaceC48979JKd;
import X.InterfaceC49279JVr;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class InternalPlayerSyncAbilityImpl implements InternalPlayerSyncAbility, InterfaceC49279JVr {
    public final List<InterfaceC48979JKd> LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C48994JKs.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    public InternalPlayerSyncAbilityImpl(List<? extends InterfaceC48979JKd> list) {
        this.LJLIL = list;
    }

    @Override // X.InterfaceC49279JVr
    public final void LIZ(Aweme aweme) {
        Object obj;
        C48887JGp c48887JGp;
        C48881JGj dataProvider;
        Aweme aweme2;
        o.LJIIIZ(aweme, "aweme");
        Iterator<Object> it = C5UN.LJJLJ((HashMap) this.LJLILLLLZI.getValue()).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Map.Entry entry = (Map.Entry) next;
            if (((Boolean) ((InterfaceC88472Yns) entry.getValue()).invoke(aweme)).booleanValue()) {
                C48881JGj dataProvider2 = ((C48887JGp) entry.getKey()).getDataProvider();
                if (dataProvider2 != null && (aweme2 = dataProvider2.LIZJ) != null) {
                    obj = aweme2.getAid();
                }
                if (o.LJ(obj, aweme.getAid())) {
                    obj = next;
                    break;
                }
            }
        }
        Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 != null && (c48887JGp = (C48887JGp) entry2.getKey()) != null && (dataProvider = c48887JGp.getDataProvider()) != null) {
            C48892JGu.LIZ(dataProvider, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.InternalPlayerSyncAbility
    public final void UD(C48887JGp c48887JGp) {
        ((HashMap) this.LJLILLLLZI.getValue()).remove(c48887JGp);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.InternalPlayerSyncAbility
    public final void Ws0(C48887JGp c48887JGp, AqS174S0100000_8 matcher) {
        o.LJIIIZ(matcher, "matcher");
        ((HashMap) this.LJLILLLLZI.getValue()).put(c48887JGp, matcher);
    }

    @Override // X.InterfaceC49279JVr
    public final boolean LIZIZ(Aweme aweme, boolean z, long j, long j2) {
        InterfaceC48979JKd interfaceC48979JKd;
        String identifier;
        List<InterfaceC48979JKd> list = this.LJLIL;
        if (list != null) {
            Iterator<InterfaceC48979JKd> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    interfaceC48979JKd = it.next();
                    if (interfaceC48979JKd.LIZ().invoke(aweme).booleanValue()) {
                        break;
                    }
                } else {
                    interfaceC48979JKd = null;
                    break;
                }
            }
            InterfaceC48979JKd interfaceC48979JKd2 = interfaceC48979JKd;
            if (interfaceC48979JKd2 != null && (identifier = interfaceC48979JKd2.getIdentifier()) != null) {
                String LIZ = C48880JGi.LIZ(identifier, aweme.getAid());
                o.LJIIIIZZ(LIZ, "buildShareId(it, aweme.aid)");
                C48892JGu.LIZIZ(aweme, z, LIZ, j, j2);
                return true;
            }
            return false;
        }
        return false;
    }
}
