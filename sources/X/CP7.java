package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CP7 implements InterfaceC28597BKf {
    public final List<CPD> LIZ;
    public final List<CPE> LIZIZ;
    public final C62822Ol8 LIZJ;

    public final Stack<EnterRoomConfig> LIZLLL() {
        return (Stack) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC28597BKf
    public final EnterRoomConfig LIZ() {
        Stack<EnterRoomConfig> LIZLLL = LIZLLL();
        if (!(!LIZLLL.isEmpty())) {
            return null;
        }
        return LIZLLL.pop();
    }

    @Override // X.InterfaceC28597BKf
    public final EnterRoomConfig LIZIZ() {
        Stack<EnterRoomConfig> LIZLLL = LIZLLL();
        if (!(!LIZLLL.isEmpty())) {
            return null;
        }
        return LIZLLL.peek();
    }

    @Override // X.InterfaceC28597BKf
    public final void clear() {
        LIZLLL().clear();
    }

    @Override // X.InterfaceC28597BKf
    public final int size() {
        return LIZLLL().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CP7(List<? extends CPD> filters, List<? extends CPE> transforms) {
        o.LJIIIZ(filters, "filters");
        o.LJIIIZ(transforms, "transforms");
        this.LIZ = filters;
        this.LIZIZ = transforms;
        this.LIZJ = C221108m2.LIZIZ(CP9.LJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // X.InterfaceC28597BKf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.livesdkapi.session.EnterRoomConfig r7, com.bytedance.android.livesdkapi.session.EnterRoomConfig r8, com.bytedance.android.livesdk.watch.chatroom.StackContext r9) {
        /*
            r6 = this;
            if (r7 == 0) goto L1a
            java.util.List<X.CPD> r0 = r6.LIZ
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r1.next()
            X.CPD r0 = (X.CPD) r0
            boolean r0 = r0.LIZ(r7, r8, r9)
            if (r0 == 0) goto L8
        L1a:
            r7 = 0
        L1b:
            java.lang.String r4 = "LiveBackRoomStack"
            if (r7 != 0) goto L35
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "abort push to stack, filtered by at least one of "
            r1.append(r0)
            java.util.List<X.CPD> r0 = r6.LIZ
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C0NB.LJIIIZ(r4, r0)
        L34:
            return
        L35:
            java.util.List<X.CPE> r0 = r6.LIZIZ
            java.util.Iterator r1 = r0.iterator()
        L3b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r1.next()
            X.CPE r0 = (X.CPE) r0
            r0.LIZ(r7, r9)
            goto L3b
        L4b:
            java.lang.String r1 = X.V0N.LJIJ(r8)
            X.Ol8 r0 = X.C31006CEw.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r0 = X.ORZ.LJLJJI(r1, r0)
            r5 = 0
            if (r0 == 0) goto L9d
            java.util.Stack r0 = r6.LIZLLL()
            r0.clear()
            java.util.Stack r0 = r6.LIZLLL()
            r0.push(r7)
        L6d:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "pushToStack: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", success: "
            r1.append(r0)
            java.util.Stack r0 = r6.LIZLLL()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L99
            java.util.Stack r0 = r6.LIZLLL()
            java.lang.Object r0 = r0.peek()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)
            if (r0 == 0) goto L99
            r5 = 1
        L99:
            X.FT5.LJ(r1, r5, r1, r4)
            goto L34
        L9d:
            java.lang.String r3 = X.V0N.LJIJ(r8)
            X.Ol8 r2 = X.C31006CEw.LIZIZ
            java.lang.Object r1 = r2.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = "jump_source_all"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lbd
            java.lang.Object r0 = r2.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r0 = X.ORZ.LJLJJI(r3, r0)
            if (r0 == 0) goto L6d
        Lbd:
            java.util.Stack r0 = r6.LIZLLL()
            r0.push(r7)
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CP7.LIZJ(com.bytedance.android.livesdkapi.session.EnterRoomConfig, com.bytedance.android.livesdkapi.session.EnterRoomConfig, com.bytedance.android.livesdk.watch.chatroom.StackContext):void");
    }
}
