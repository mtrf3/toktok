package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JWY implements InterfaceC49224JTo {
    public final RecyclerView LJLIL;
    public final InterfaceC49293JWf LJLILLLLZI;
    public final C49290JWc LJLJI;
    public final InterfaceC65784Pro<List<InterfaceC49295JWh>> LJLJJI;
    public final /* synthetic */ JU8 LJLJJL = new JU8();
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 641));

    @Override // X.InterfaceC49224JTo
    public final void LLLLLILLIL() {
        this.LJLJJL.LJLIL = null;
    }

    public final void LIZIZ(C50420Jqa c50420Jqa) {
        JWZ jwz;
        Aweme aweme;
        Object obj;
        AbstractC49300JWm config;
        JWX LIZJ;
        JWV LIZ;
        C49288JWa c49288JWa;
        Context context = this.LJLIL.getContext();
        boolean LJI = C50989Jzl.LJI(context);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handleByVideoEvent: ");
        LIZ2.append(c50420Jqa);
        LIZ2.append(",and current context is ");
        LIZ2.append(context);
        LIZ2.append(" visible:");
        LIZ2.append(LJI);
        X1D.LIZIZ(LIZ2);
        if (c50420Jqa == null || !LJI) {
            return;
        }
        this.LJLJJL.LIZ();
        C49290JWc c49290JWc = this.LJLJI;
        AbstractC49294JWg abstractC49294JWg = null;
        if (c49290JWc != null) {
            Object obj2 = c50420Jqa.LJLILLLLZI;
            if (!(obj2 instanceof Aweme) || (aweme = (Aweme) obj2) == null || ((List) c49290JWc.LIZJ.getValue()).isEmpty()) {
                abstractC49294JWg = C49296JWi.LIZ;
            } else {
                int intValue = C17N.LJJJJJL(c49290JWc.LIZIZ).If().LIZJ().LJLL.invoke().intValue();
                Iterator<T> it = c49290JWc.LIZ.invoke().iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            SearchMixFeed searchMixFeed = (SearchMixFeed) next;
                            Iterator it2 = ((List) c49290JWc.LIZJ.getValue()).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj = it2.next();
                                    ISearchCardProtocol iSearchCardProtocol = (ISearchCardProtocol) obj;
                                    if (iSearchCardProtocol.LLLIZZ().LIZ(searchMixFeed) && iSearchCardProtocol.LJJLIL(searchMixFeed)) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            ISearchCardProtocol iSearchCardProtocol2 = (ISearchCardProtocol) obj;
                            if (iSearchCardProtocol2 != null && (config = iSearchCardProtocol2.getConfig()) != null && (LIZJ = config.LIZJ()) != null && (LIZ = LIZJ.LIZ(searchMixFeed, aweme)) != null) {
                                if (LIZ instanceof JWW) {
                                    c49288JWa = new C49288JWa(i + intValue, null);
                                } else if (LIZ instanceof C49288JWa) {
                                    c49288JWa = new C49288JWa(i + intValue, (C49288JWa) LIZ);
                                } else {
                                    throw new C162476Zf();
                                }
                                abstractC49294JWg = new JWZ(c49288JWa.LIZ, aweme, c49288JWa);
                            } else {
                                i = i2;
                            }
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    } else {
                        abstractC49294JWg = C49296JWi.LIZ;
                        break;
                    }
                }
            }
        }
        if (abstractC49294JWg instanceof JWZ) {
            jwz = (JWZ) abstractC49294JWg;
            if (jwz == null) {
                return;
            }
        } else {
            for (InterfaceC49295JWh interfaceC49295JWh : (List) this.LJLJJLL.getValue()) {
                AbstractC49294JWg LJ = interfaceC49295JWh.LJ(c50420Jqa);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("finder is : ");
                LIZ3.append(interfaceC49295JWh);
                LIZ3.append(" and result is [");
                LIZ3.append(LJ);
                LIZ3.append(']');
                X1D.LIZIZ(LIZ3);
                if (!(LJ instanceof JWZ) || (jwz = (JWZ) LJ) == null) {
                }
            }
            return;
        }
        int i3 = jwz.LIZ;
        Aweme aweme2 = jwz.LIZIZ;
        JWV jwv = jwz.LIZJ;
        new StringBuilder("position is : ").append(jwz.LIZ);
        if (i3 >= 0) {
            InterfaceC49293JWf interfaceC49293JWf = this.LJLILLLLZI;
            if (interfaceC49293JWf != null) {
                C49298JWk LIZ4 = interfaceC49293JWf.LIZ(i3);
                this.LJLILLLLZI.LIZIZ(LIZ4, c50420Jqa, aweme2);
                RecyclerView recyclerView = this.LJLIL;
                if (C16330kX.LIZJ(recyclerView) && !recyclerView.isLayoutRequested()) {
                    LIZJ(aweme2, Integer.valueOf(LIZ4.LIZ), jwv);
                    return;
                } else {
                    recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC49289JWb(this, aweme2, LIZ4, jwv));
                    return;
                }
            }
            this.LJLIL.LJLI(i3);
            RecyclerView recyclerView2 = this.LJLIL;
            if (C16330kX.LIZJ(recyclerView2) && !recyclerView2.isLayoutRequested()) {
                LIZJ(aweme2, Integer.valueOf(i3), jwv);
                return;
            } else {
                recyclerView2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC49291JWd(this, aweme2, i3, jwv));
                return;
            }
        }
        new StringBuilder("position is not legal : ").append(i3);
    }

    @Override // X.InterfaceC49224JTo
    public final void LLIIJI(JU3 eventDispatcher) {
        o.LJIIIZ(eventDispatcher, "eventDispatcher");
        JU8 ju8 = this.LJLJJL;
        ju8.getClass();
        ju8.LJLIL = eventDispatcher;
    }

    public final void LIZ(int i, C50420Jqa event, Aweme aweme) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleByAwemeAndPosition ");
        LIZ.append(i);
        LIZ.append(" for ");
        LIZ.append(aweme);
        X1D.LIZIZ(LIZ);
        this.LJLJJL.LIZ();
        if (i >= 0) {
            InterfaceC49293JWf interfaceC49293JWf = this.LJLILLLLZI;
            if (interfaceC49293JWf != null && aweme != null) {
                this.LJLILLLLZI.LIZIZ(interfaceC49293JWf.LIZ(i), event, aweme);
            } else {
                this.LJLIL.LJLI(i);
            }
            RecyclerView recyclerView = this.LJLIL;
            if (C16330kX.LIZJ(recyclerView) && !recyclerView.isLayoutRequested()) {
                LIZJ(aweme, Integer.valueOf(i), null);
            } else {
                recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC49292JWe(this, aweme, i));
            }
        }
    }

    public final void LIZJ(Aweme aweme, Integer num, JWV jwv) {
        InterfaceC49148JQq interfaceC49148JQq;
        C49288JWa c49288JWa;
        SearchCardViewHolder searchCardViewHolder;
        InterfaceC55235Lm3 LJIJ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        if (num != null) {
            num.intValue();
            Object LJJIZ = this.LJLIL.LJJIZ(num.intValue());
            if (LJJIZ == null || !(LJJIZ instanceof InterfaceC49148JQq) || (interfaceC49148JQq = (InterfaceC49148JQq) LJJIZ) == null) {
                return;
            }
            if (interfaceC49148JQq instanceof JSO) {
                JSO jso = (JSO) interfaceC49148JQq;
                if (jso.LLLLLLL() && aweme != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("target is INestCard : ");
                    LIZ.append(interfaceC49148JQq);
                    X1D.LIZIZ(LIZ);
                    jso.LJIJJLI(aweme, new C49196JSm(this, jso));
                    return;
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("target is normal just play : ");
            LIZ2.append(interfaceC49148JQq);
            LIZ2.append(", ");
            LIZ2.append(jwv);
            X1D.LIZIZ(LIZ2);
            if ((jwv instanceof C49288JWa) && (c49288JWa = ((C49288JWa) jwv).LIZIZ) != null) {
                if (this.LJLJI == null) {
                    return;
                }
                AqS155S0200000_8 aqS155S0200000_8 = new AqS155S0200000_8(interfaceC49148JQq, this, 42);
                if (!(LJJIZ instanceof SearchCardViewHolder) || (searchCardViewHolder = (SearchCardViewHolder) LJJIZ) == null || (LJIJ = C55096Ljo.LJIJ(searchCardViewHolder)) == null || (searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C55096Ljo.LIZ(LJIJ, SearchServiceCenter$AutoPlayAbility.class, null)) == null) {
                    return;
                }
                searchServiceCenter$AutoPlayAbility.tO(c49288JWa, aqS155S0200000_8);
                return;
            }
            if (!interfaceC49148JQq.LLIIII()) {
                return;
            }
            this.LJLJJL.LIZJ(interfaceC49148JQq);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JWY(RecyclerView recyclerView, InterfaceC49293JWf interfaceC49293JWf, C49290JWc c49290JWc, InterfaceC65784Pro<? extends List<? extends InterfaceC49295JWh>> interfaceC65784Pro) {
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = interfaceC49293JWf;
        this.LJLJI = c49290JWc;
        this.LJLJJI = interfaceC65784Pro;
    }
}
