package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81603Ie extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, List<? extends C63120Opw>, C76800UCe> {
    public final /* synthetic */ List<C63120Opw> LJLIL;
    public final /* synthetic */ InterfaceC81953Jn LJLILLLLZI;
    public final /* synthetic */ java.util.Set<String> LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C81983Jq LJLJJL;
    public final /* synthetic */ C34K LJLJJLL;
    public final /* synthetic */ C82253Kr LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81603Ie(List<C63120Opw> list, InterfaceC81953Jn interfaceC81953Jn, java.util.Set<String> set, boolean z, C81983Jq c81983Jq, C34K c34k, C82253Kr c82253Kr) {
        super(2);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC81953Jn;
        this.LJLJI = set;
        this.LJLJJI = z;
        this.LJLJJL = c81983Jq;
        this.LJLJJLL = c34k;
        this.LJLJL = c82253Kr;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, List<? extends C63120Opw> list) {
        long j;
        C63120Opw c63120Opw;
        String str;
        Object LJ;
        boolean booleanValue = bool.booleanValue();
        List<? extends C63120Opw> chunk = list;
        o.LJIIIZ(chunk, "chunk");
        if (this.LJLIL.size() >= this.LJLILLLLZI.LJ()) {
            this.LJLILLLLZI.LIZLLL(true);
            InterfaceC81953Jn interfaceC81953Jn = this.LJLILLLLZI;
            Iterator<C63120Opw> it = this.LJLIL.iterator();
            if (it.hasNext()) {
                long sortOrder = it.next().getSortOrder();
                while (it.hasNext()) {
                    long sortOrder2 = it.next().getSortOrder();
                    if (sortOrder > sortOrder2) {
                        sortOrder = sortOrder2;
                    }
                }
                interfaceC81953Jn.LJIIIZ(sortOrder);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            C81563Ia c81563Ia = null;
            if (booleanValue && C3KQ.LIZ().batchConvertSize > 0) {
                LJ = XKX.LJ(MBB.INSTANCE, new C37B(this.LJLJL, chunk, null));
                Iterable iterable = (Iterable) LJ;
                int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(iterable, 10));
                if (LJJIIZ < 16) {
                    LJJIIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
                for (Object obj : iterable) {
                    linkedHashMap.put(((IMUser) obj).getUid(), obj);
                }
                c81563Ia = new C81563Ia(linkedHashMap, this.LJLJI);
            }
            Iterator<? extends C63120Opw> it2 = chunk.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C63120Opw next = it2.next();
                try {
                } catch (Exception e) {
                    if (this.LJLJJI) {
                        this.LJLILLLLZI.getDebugInfo().LIZJ++;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("insertOrUpdateSessionMap faulted for conversation ");
                    LIZ.append(next.getConversationId());
                    LIZ.append(": ");
                    C34B.LIZLLL("SessionListManagerV2", X1D.LIZIZ(LIZ), e);
                }
                if (this.LJLIL.size() >= this.LJLILLLLZI.LJ()) {
                    this.LJLILLLLZI.LIZLLL(true);
                    InterfaceC81953Jn interfaceC81953Jn2 = this.LJLILLLLZI;
                    Iterator<C63120Opw> it3 = this.LJLIL.iterator();
                    if (it3.hasNext()) {
                        long sortOrder3 = it3.next().getSortOrder();
                        while (it3.hasNext()) {
                            long sortOrder4 = it3.next().getSortOrder();
                            if (sortOrder3 > sortOrder4) {
                                sortOrder3 = sortOrder4;
                            }
                        }
                        interfaceC81953Jn2.LJIIIZ(sortOrder3);
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    C3L5 LJI = this.LJLILLLLZI.LJI(next, c81563Ia);
                    if (LJI == null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("insertOrUpdateSessionMap: session is null, conversationId=");
                        LIZ2.append(next.getConversationId());
                        LIZ2.append(", conversationType=");
                        LIZ2.append(next.getConversationType());
                        C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ2));
                        if (this.LJLJJI) {
                            this.LJLILLLLZI.getDebugInfo().LIZJ++;
                        }
                    } else if (!this.LJLJJL.LIZLLL.invoke(LJI).booleanValue()) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("session not in page ");
                        LIZ3.append(this.LJLJJL);
                        String msg = X1D.LIZIZ(LIZ3);
                        o.LJIIIZ(msg, "msg");
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(LJI.LJ());
                        LIZ4.append(": ");
                        LIZ4.append(LJI.LLIIII);
                        String msg2 = X1D.LIZIZ(LIZ4);
                        o.LJIIIZ(msg2, "msg");
                        if (this.LJLILLLLZI.LJII().remove(LJI.LJFF()) != null) {
                            InterfaceC81953Jn interfaceC81953Jn3 = this.LJLILLLLZI;
                            C34K c34k = this.LJLJJLL;
                            interfaceC81953Jn3.getDebugInfo().LIZ++;
                            c34k.element = true;
                        }
                        if (this.LJLJJI) {
                            this.LJLILLLLZI.getDebugInfo().LIZIZ++;
                        }
                    } else {
                        this.LJLJJLL.element = true;
                        java.util.Map<String, C3L4> LJII = this.LJLILLLLZI.LJII();
                        String LJFF = LJI.LJFF();
                        o.LJIIIIZZ(LJFF, "session.sessionID");
                        LJII.put(LJFF, LJI);
                        this.LJLIL.add(next);
                        this.LJLJL.getClass();
                        OSZ LJIILJJIL = C82253Kr.LJIILJJIL(next);
                        if (LJIILJJIL != null && (str = (String) LJIILJJIL.getFirst()) != null && str.length() > 0 && this.LJLJI.contains(LJIILJJIL.getFirst())) {
                            this.LJLJI.remove(LJIILJJIL.getFirst());
                            C80533Eb.LJIIJ((String) LJIILJJIL.getFirst(), (String) LJIILJJIL.getSecond());
                        }
                        if (next.isFiltered()) {
                            C82253Kr c82253Kr = this.LJLJL;
                            long updatedTime = next.getUpdatedTime();
                            C63120Opw c63120Opw2 = this.LJLJL.LJLLI;
                            if (c63120Opw2 != null) {
                                j = c63120Opw2.getUpdatedTime();
                            } else {
                                j = 0;
                            }
                            if (updatedTime > j) {
                                c63120Opw = next;
                            } else {
                                c63120Opw = this.LJLJL.LJLLI;
                            }
                            c82253Kr.LJLLI = c63120Opw;
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
