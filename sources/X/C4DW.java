package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.NaviStatusCode;
import com.ss.android.ugc.aweme.emoji.navi.NaviCreationSignal;
import kotlin.jvm.internal.o;

/* renamed from: X.4DW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4DW extends QXX {
    public final NaviStatusCode LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final NaviCreationSignal.SingleLiveData LJLJI;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
    
        if (r2 != 4) goto L13;
     */
    @Override // X.QXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LLIIZ(android.view.ViewGroup r13) {
        /*
            r12 = this;
            java.lang.String r1 = "container"
            r0 = 2131560432(0x7f0d07f0, float:1.8746236E38)
            r5 = 0
            android.view.View r4 = X.C06490Nh.LIZIZ(r13, r1, r0, r13, r5)
            r9 = 2131376658(0x7f0a3a12, float:1.8373498E38)
            android.view.View r2 = r4.findViewById(r9)
            X.05v r2 = (X.AbstractC019505v) r2
            r11 = 2
            int[] r1 = new int[r11]
            r7 = 2131365150(0x7f0a0d1e, float:1.8350157E38)
            android.view.View r0 = r4.findViewById(r7)
            int r0 = r0.getId()
            r1[r5] = r0
            r0 = 2131368423(0x7f0a19e7, float:1.8356796E38)
            android.view.View r0 = r4.findViewById(r0)
            int r0 = r0.getId()
            r10 = 1
            r1[r10] = r0
            r2.setReferencedIds(r1)
            r6 = 2131370913(0x7f0a23a1, float:1.8361846E38)
            android.view.View r2 = r4.findViewById(r6)
            X.05v r2 = (X.AbstractC019505v) r2
            int[] r1 = new int[r11]
            r8 = 2131370910(0x7f0a239e, float:1.836184E38)
            android.view.View r0 = r4.findViewById(r8)
            int r0 = r0.getId()
            r1[r5] = r0
            r0 = 2131370918(0x7f0a23a6, float:1.8361856E38)
            android.view.View r0 = r4.findViewById(r0)
            int r0 = r0.getId()
            r1[r10] = r0
            r2.setReferencedIds(r1)
            com.ss.android.ugc.aweme.emoji.emojichoose.model.NaviStatusCode r0 = r12.LJLIL
            r3 = -1
            if (r0 != 0) goto Lbe
            r2 = -1
        L62:
            r1 = 8
            if (r2 == r3) goto L8d
            if (r2 == r10) goto L71
            if (r2 == r11) goto L71
            r0 = 3
            if (r2 == r0) goto L71
            r0 = 4
            if (r2 == r0) goto L8d
        L70:
            return r4
        L71:
            android.view.View r0 = r4.findViewById(r9)
            X.1AH r0 = (X.C1AH) r0
            r0.setVisibility(r1)
            android.view.View r0 = r4.findViewById(r6)
            X.1AH r0 = (X.C1AH) r0
            r0.setVisibility(r5)
            android.view.View r0 = r4.findViewById(r8)
            X.8pd r0 = (X.C223338pd) r0
            r0.LIZIZ()
            goto L70
        L8d:
            android.view.View r0 = r4.findViewById(r9)
            X.1AH r0 = (X.C1AH) r0
            r0.setVisibility(r5)
            android.view.View r0 = r4.findViewById(r6)
            X.1AH r0 = (X.C1AH) r0
            r0.setVisibility(r1)
            android.view.View r2 = r4.findViewById(r7)
            X.SY4 r2 = (X.SY4) r2
            Y.ACListenerS21S0100000_1 r1 = new Y.ACListenerS21S0100000_1
            r0 = 231(0xe7, float:3.24E-43)
            r1.<init>(r12, r0)
            X.C16880lQ.LJJIZ(r2, r1)
            com.ss.android.ugc.aweme.emoji.navi.NaviCreationSignal$SingleLiveData r3 = r12.LJLJI
            androidx.lifecycle.LifecycleOwner r2 = r12.LJLILLLLZI
            Y.AObserverS65S0200000_1 r1 = new Y.AObserverS65S0200000_1
            r0 = 17
            r1.<init>(r4, r12, r0)
            r3.observe(r2, r1)
            goto L70
        Lbe:
            int[] r1 = X.C4DX.LIZ
            int r0 = r0.ordinal()
            r2 = r1[r0]
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4DW.LLIIZ(android.view.ViewGroup):android.view.View");
    }

    public C4DW(NaviStatusCode naviStatusCode, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = naviStatusCode;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = NaviCreationSignal.LIZ;
    }
}
