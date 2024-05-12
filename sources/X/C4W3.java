package X;

import Y.IDbS398S0100000_1;
import Y.IDcS133S0200000_1;
import Y.IDcS406S0100000_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4W3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W3 extends AbstractC108324My implements C4W9 {
    public final EnumC97443s4 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public boolean LJLJL;
    public final XIC LJLJLJ;
    public final AbstractC78621UtN LJLJLLL;
    public final C64962gm LJLL;
    public Boolean LJLLI;

    public final EnumC97443s4 LJIILIIL() {
        if (o.LJ(this.LJLLI, Boolean.TRUE)) {
            return EnumC97443s4.FILTERED;
        }
        if (o.LJ(this.LJLLI, Boolean.FALSE)) {
            return EnumC97443s4.REGULAR;
        }
        return this.LJLJJI;
    }

    public final ConcurrentHashMap<String, C63120Opw> LJIILJJIL() {
        return (ConcurrentHashMap) this.LJLJJLL.getValue();
    }

    public final C4W7 LJIILL() {
        return (C4W7) this.LJLJJL.getValue();
    }

    @Override // X.C4W9
    public final void vq0() {
        C4W6 c4w6 = this.LJLILLLLZI;
        if (c4w6 != null) {
            c4w6.vq0();
        }
    }

    @Override // X.C4W9
    public final void Gy() {
        LJIILJJIL().clear();
        C4W6 c4w6 = this.LJLILLLLZI;
        if (c4w6 != null) {
            c4w6.Gy();
        }
    }

    @Override // X.AbstractC108304Mw
    public final void LIZLLL() {
        C115394fv LJII = C115394fv.LJII();
        EnumC97443s4 LJIILIIL = LJIILIIL();
        LJII.getClass();
        C63322OtC.LJFF("StrangerManager deleteAllConversation");
        RunnableC63345OtZ.LJ(new IDcS133S0200000_1(LJII, LJIILIIL, 3), null, false);
    }

    @Override // X.AbstractC108304Mw
    public final boolean LJ() {
        return LJIILL().LIZJ;
    }

    @Override // X.AbstractC108304Mw
    public final void LJFF() {
        final C4W7 LJIILL = LJIILL();
        LJIILL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerListModel loadMore, mFirstPageFetched:");
        LIZ.append(LJIILL.LIZLLL);
        LIZ.append(", mHasMore:");
        LIZ.append(LJIILL.LJ);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (!LJIILL.LIZLLL) {
            C63322OtC.LJFF("StrangerListModel loadMore un refresh");
            return;
        }
        if (LJIILL.LIZJ) {
            C63322OtC.LJFF("StrangerListModel loadMore loading now");
            return;
        }
        LJIILL.LIZJ = true;
        if (!LJIILL.LJ) {
            LJIILL.LIZLLL();
        } else if (C63308Osy.LJI().LIZLLL().LJLJJL) {
            C63322OtC.LJFF("StrangerListModel get, skip API request when inbox 3 is enabled");
        } else {
            new C63529OwX(new AbstractC75682y4<List<C63120Opw>>() { // from class: X.4W8
                @Override // X.InterfaceC86963bA
                public final void LIZIZ(C63623Oy3 c63623Oy3) {
                    C63322OtC.LIZLLL("StrangerListModel loadMore onFailure");
                    C4W7.this.LIZLLL();
                }

                @Override // X.AbstractC75682y4
                public final void LIZJ(long j, Object obj, boolean z) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("StrangerListModel loadMore onSuccess, nextCursor:");
                    LIZ2.append(j);
                    LIZ2.append(", hasMore:");
                    LIZ2.append(z);
                    C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
                    C4W7.this.LJFF = j;
                    C4W7.this.LJ = z;
                    C4W7.this.LIZLLL();
                }
            }).LJIILIIL(LJIILL.LJFF, C4W7.LJIIIIZZ);
        }
    }

    @Override // X.AbstractC108304Mw
    public final void LJI() {
        C4W7 LJIILL = LJIILL();
        LJIILL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerListModel refresh: isLoading ");
        LIZ.append(LJIILL.LIZJ);
        LIZ.append(", type ");
        LIZ.append(LJIILL.LJI);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (LJIILL.LIZJ) {
            C63322OtC.LJFF("StrangerListModel refresh loading now");
            return;
        }
        LJIILL.LIZJ = true;
        RunnableC63345OtZ.LJ(new IDcS406S0100000_1(LJIILL, 5), new IDbS398S0100000_1(LJIILL, 6), false);
        if (C63308Osy.LJI().LIZLLL().LJLJJL) {
            C63322OtC.LJFF("StrangerListModel get, skip API request when inbox 3 is enabled");
        } else {
            new C63529OwX(new C4W5(LJIILL)).LJIILIIL(0L, C4W7.LJIIIIZZ);
        }
    }

    @Override // X.AbstractC108304Mw
    public final void LJII() {
        super.LJII();
        C4W7 LJIILL = LJIILL();
        LJIILL.LIZIZ = null;
        ((HashSet) C115394fv.LJII().LIZ).remove(LJIILL);
    }

    @Override // X.AbstractC108324My
    public final List<C63120Opw> LJIIIZ() {
        Collection<C63120Opw> values = LJIILJJIL().values();
        o.LJIIIIZZ(values, "strangerConversationMap.values");
        return ORZ.LLJI(values);
    }

    @Override // X.AbstractC108304Mw
    public final void LIZ(List<? extends C63120Opw> list) {
        C115394fv.LJII().LIZ(list, LJIILIIL());
    }

    @Override // X.AbstractC108304Mw
    public final void LIZIZ(List<? extends C63120Opw> list) {
        C115394fv.LJII().LIZIZ(list, LJIILIIL());
    }

    @Override // X.AbstractC108304Mw
    public final void LIZJ(C4W9... observers) {
        o.LJIIIZ(observers, "observers");
        C63322OtC.LJI("StrangerListModelImpl", "bind observer", null);
        super.LIZJ((C4W9[]) Arrays.copyOf(observers, observers.length));
        C4W7 LJIILL = LJIILL();
        LJIILL.LIZIZ = this;
        ((HashSet) C115394fv.LJII().LIZ).add(LJIILL);
    }

    @Override // X.AbstractC108324My
    public final List LJIIJ(AqS167S0100000_1 aqS167S0100000_1) {
        if (aqS167S0100000_1 == null) {
            return LJIIL(LJIILL().LIZIZ());
        }
        XKX.LIZLLL(C48841JEv.LIZ(this.LJLJLJ), null, null, new C4W4(this, aqS167S0100000_1, null), 3);
        return null;
    }

    public final void LJIIJJI(List<? extends C63120Opw> list) {
        if (list == null) {
            return;
        }
        XKX.LIZLLL(this.LJLL, null, null, new C4W2(this, list, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C63120Opw> LJIIL(List<? extends C63120Opw> list) {
        int i = C108234Mp.LIZ[LJIILIIL().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return C61878OQg.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((C63120Opw) obj).isFiltered()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (!((C63120Opw) obj2).isFiltered()) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        return list;
    }

    @Override // X.C4W9
    public final void ZS(C63623Oy3 c63623Oy3) {
        C4W6 c4w6 = this.LJLILLLLZI;
        if (c4w6 != null) {
            c4w6.ri(c63623Oy3);
        }
    }

    @Override // X.C4W9
    public final void f3(C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        LJIILJJIL().remove(conversation.getConversationId());
        C4W6 c4w6 = this.LJLILLLLZI;
        if (c4w6 != null) {
            c4w6.f3(conversation);
        }
    }

    @Override // X.C4W9
    public final void nS(List<? extends C63120Opw> list) {
        o.LJIIIZ(list, "list");
        LJIILJJIL().clear();
        LJIIJJI(list);
    }

    @Override // X.C4W9
    public final void ri(C63623Oy3 error) {
        o.LJIIIZ(error, "error");
        C4W6 c4w6 = this.LJLILLLLZI;
        if (c4w6 != null) {
            c4w6.ri(error);
        }
    }

    public C4W3(int i, EnumC97443s4 type) {
        o.LJIIIZ(type, "type");
        this.LJLJJI = type;
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 983));
        this.LJLJJLL = C221108m2.LIZIZ(C4WA.LJLIL);
        this.LJLJL = true;
        XIC xic = C78613UtF.LIZ;
        this.LJLJLJ = xic;
        this.LJLJLLL = C36636EZk.LIZ;
        this.LJLL = C48841JEv.LIZ(xic);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerListModel setConversationPageCount:");
        LIZ.append(i);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        C4W7.LJIIIIZZ = i;
    }

    @Override // X.C4W9
    public final void FA(List<? extends C63120Opw> list, boolean z) {
        o.LJIIIZ(list, "list");
        LJIIJJI(list);
        this.LJLJL = z;
    }

    @Override // X.AbstractC108324My
    public final void LJIIIIZZ(C4W9 observer, boolean z) {
        o.LJIIIZ(observer, "observer");
        this.LJLLI = Boolean.valueOf(z);
        C4W6 c4w6 = this.LJLILLLLZI;
        if (c4w6 != null) {
            ((ArrayList) c4w6.LJLIL).add(observer);
        }
    }

    @Override // X.C4W9
    public final void kc(List<? extends C63120Opw> list, boolean z) {
        o.LJIIIZ(list, "list");
        LJIILJJIL().clear();
        LJIIJJI(list);
        this.LJLJL = z;
    }

    @Override // X.C4W9
    public final void y9(int i, C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        ConcurrentHashMap<String, C63120Opw> LJIILJJIL = LJIILJJIL();
        String conversationId = conversation.getConversationId();
        o.LJIIIIZZ(conversationId, "conversation.conversationId");
        LJIILJJIL.put(conversationId, conversation);
        C4W6 c4w6 = this.LJLILLLLZI;
        if (c4w6 != null) {
            c4w6.y9(i, conversation);
        }
    }
}
