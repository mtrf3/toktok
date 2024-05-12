package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3b8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86943b8 extends AbstractC75682y4<List<? extends C63120Opw>> {
    public final MutableLiveData<List<IMConversation>> LIZ;
    public final AbstractC75682y4<List<C63120Opw>> LIZIZ;
    public boolean LIZJ;
    public final List<IMConversation> LIZLLL;
    public InterfaceC67352kd<? super A2G<Long>> LJ;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (((X.XJL) r1).isActive() != false) goto L12;
     */
    @Override // X.InterfaceC86963bA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C63623Oy3 r4) {
        /*
            r3 = this;
            boolean r0 = r3.LIZJ
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "GroupListViewModel"
            X.C34B.LIZJ(r0, r1)
            boolean r0 = X.C4VT.LIZIZ()
            if (r0 != 0) goto L1d
            android.content.Context r2 = X.EF7.LIZIZ()
            r1 = 4
            r0 = 0
            X.C85163Vw.LIZLLL(r2, r4, r0, r1)
        L1d:
            X.2kd<? super X.A2G<java.lang.Long>> r1 = r3.LJ
            boolean r0 = r1 instanceof X.XJL
            if (r0 == 0) goto L30
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<com.bytedance.ies.powerlist.page.PageValue<kotlin.Long>>"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.XJL r1 = (X.XJL) r1
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L40
        L30:
            X.2kd<? super X.A2G<java.lang.Long>> r1 = r3.LJ
            if (r1 == 0) goto L40
            X.A2F r0 = X.A2G.LIZ
            X.A2H r0 = X.A2F.LIZIZ(r0)
            X.C3C5.m7constructorimpl(r0)
            r1.resumeWith(r0)
        L40:
            X.2y4<java.util.List<X.Opw>> r0 = r3.LIZIZ
            if (r0 == 0) goto L47
            r0.LIZIZ(r4)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86943b8.LIZIZ(X.Oy3):void");
    }

    public C86943b8(MutableLiveData<List<IMConversation>> liveData, AbstractC75682y4<List<C63120Opw>> abstractC75682y4) {
        o.LJIIIZ(liveData, "liveData");
        this.LIZ = liveData;
        this.LIZIZ = abstractC75682y4;
        this.LIZJ = true;
        this.LIZLLL = new ArrayList();
    }

    @Override // X.AbstractC75682y4
    public final void LIZJ(long j, Object obj, boolean z) {
        Integer num;
        List list = (List) obj;
        if (!this.LIZJ) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResult, result size ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", nextCursor: ");
        LIZ.append(j);
        LIZ.append(", hasMore: ");
        LIZ.append(z);
        C34B.LJI("GroupListViewModel", X1D.LIZIZ(LIZ));
        if (list == null || list.isEmpty()) {
            this.LIZ.postValue(C61878OQg.INSTANCE);
            InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd = this.LJ;
            if (interfaceC67352kd == null) {
                return;
            }
            A2H LIZIZ = A2F.LIZIZ(A2G.LIZ);
            C3C5.m7constructorimpl(LIZIZ);
            interfaceC67352kd.resumeWith(LIZIZ);
            return;
        }
        List LJLL = ORZ.LJLL(list);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJLL, 10));
        Iterator it = ((ArrayList) LJLL).iterator();
        while (it.hasNext()) {
            arrayList.add(C3K0.LIZIZ((C63120Opw) it.next()));
        }
        if (z) {
            InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd2 = this.LJ;
            if (interfaceC67352kd2 != null) {
                A2V LJ = A2F.LJ(A2G.LIZ, null, Long.valueOf(j), null, 5);
                C3C5.m7constructorimpl(LJ);
                interfaceC67352kd2.resumeWith(LJ);
            }
        } else {
            InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd3 = this.LJ;
            if (interfaceC67352kd3 != null) {
                A2H LIZIZ2 = A2F.LIZIZ(A2G.LIZ);
                C3C5.m7constructorimpl(LIZIZ2);
                interfaceC67352kd3.resumeWith(LIZIZ2);
            }
        }
        ORS.LJJLIIIJILLIZJL(arrayList, this.LIZLLL);
        this.LIZ.postValue(this.LIZLLL);
    }
}
