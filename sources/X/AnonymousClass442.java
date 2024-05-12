package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.442, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass442 implements InterfaceC1029942l {
    public final RecyclerView LJLIL;
    public final InterfaceC88472Yns<C109544Rq, C76800UCe> LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public InterfaceC88472Yns<? super InterfaceC1029942l, C76800UCe> LJLJJI;
    public TAZ LJLJJL;

    @Override // X.InterfaceC1029942l
    public final void Hp() {
    }

    @Override // X.InterfaceC1029942l
    public final void Og() {
    }

    @Override // X.InterfaceC1029942l
    public final void Ah(AbstractC89473fD event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.InterfaceC1029942l
    public final void IP(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void QG(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void Vj(final List<? extends C109544Rq> list) {
        o.LJIIIZ(list, "list");
        this.LJLIL.post(new Runnable() { // from class: X.443
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
            
                if (((java.lang.Boolean) r7.invoke(r3)).booleanValue() != true) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
            
                r8.LJLIL.LJLILLLLZI.invoke(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
            
                if (r3 == null) goto L11;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v0, types: [X.Yns, X.TAZ] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r8 = this;
                    X.442 r0 = X.AnonymousClass442.this
                    androidx.recyclerview.widget.RecyclerView r0 = r0.LJLIL
                    android.view.ViewParent r0 = r0.getParent()
                    if (r0 != 0) goto Lb
                    return
                Lb:
                    boolean r0 = com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment.LIZIZ()
                    r6 = 1
                    r5 = 1809(0x711, float:2.535E-42)
                    r4 = 8
                    if (r0 == 0) goto L81
                    X.442 r0 = X.AnonymousClass442.this
                    androidx.recyclerview.widget.RecyclerView r1 = r0.LJLIL
                    java.util.List<X.4Rq> r0 = r2
                    java.util.List r3 = X.ORZ.LLJILJILJ(r0)
                    X.442 r0 = X.AnonymousClass442.this
                    X.TAZ r7 = r0.LJLJJL
                    java.lang.String r0 = "mRecyclerView"
                    kotlin.jvm.internal.o.LJIIIZ(r1, r0)
                    X.0A2 r2 = r1.getLayoutManager()
                    boolean r0 = r2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager
                    if (r0 == 0) goto L35
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager r2 = (com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager) r2
                    if (r2 != 0) goto L46
                L35:
                    X.442 r0 = X.AnonymousClass442.this
                    X.Pro<X.UCe> r0 = r0.LJLJI
                    r0.invoke()
                L3c:
                    X.442 r1 = X.AnonymousClass442.this
                    X.Yns<? super X.42l, X.UCe> r0 = r1.LJLJJI
                    if (r0 == 0) goto L45
                    r0.invoke(r1)
                L45:
                    return
                L46:
                    int r1 = r2.LLJJL()
                    int r0 = r2.LLJJJJLIIL()
                    if (r1 < 0) goto L35
                    if (r0 >= 0) goto L53
                    goto L35
                L53:
                    int r0 = r0 + 1
                    java.util.ArrayList r3 = (java.util.ArrayList) r3
                    java.util.List r0 = r3.subList(r1, r0)
                    java.util.Iterator r2 = r0.iterator()
                L5f:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L35
                    java.lang.Object r3 = r2.next()
                    r1 = r3
                    X.4Rq r1 = (X.C109544Rq) r1
                    boolean r0 = r1.isSelf()
                    if (r0 != 0) goto L5f
                    int r0 = r1.getMsgType()
                    if (r0 == r4) goto L7e
                    int r0 = r1.getMsgType()
                    if (r0 != r5) goto L5f
                L7e:
                    if (r3 != 0) goto Lb5
                    goto L35
                L81:
                    boolean r0 = com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment.LIZJ()
                    if (r0 == 0) goto L35
                    java.util.List<X.4Rq> r0 = r2
                    java.util.List r0 = X.ORZ.LLJILJILJ(r0)
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    java.util.Iterator r2 = r0.iterator()
                L93:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L35
                    java.lang.Object r3 = r2.next()
                    r1 = r3
                    X.4Rq r1 = (X.C109544Rq) r1
                    boolean r0 = r1.isSelf()
                    if (r0 != 0) goto L93
                    int r0 = r1.getMsgType()
                    if (r0 == r4) goto Lb2
                    int r0 = r1.getMsgType()
                    if (r0 != r5) goto L93
                Lb2:
                    if (r3 != 0) goto Lc3
                    goto L35
                Lb5:
                    if (r7 == 0) goto L35
                    java.lang.Object r0 = r7.invoke(r3)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != r6) goto L35
                Lc3:
                    X.442 r0 = X.AnonymousClass442.this
                    X.Yns<X.4Rq, X.UCe> r0 = r0.LJLILLLLZI
                    r0.invoke(r3)
                    goto L3c
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass443.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC1029942l
    public final void ik0(List<? extends C109544Rq> list) {
        o.LJIIIZ(list, "list");
    }

    @Override // X.InterfaceC1029942l
    public final void rD(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void zG(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // X.InterfaceC1029942l
    public final void s50(AbstractC1041546x holder, C109544Rq c109544Rq) {
        o.LJIIIZ(holder, "holder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass442(RecyclerView mRecyclerView, InterfaceC88472Yns<? super C109544Rq, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(mRecyclerView, "mRecyclerView");
        this.LJLIL = mRecyclerView;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = interfaceC65784Pro;
    }
}
