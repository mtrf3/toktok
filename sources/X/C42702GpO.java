package X;

import Y.ACallableS110S0100000_7;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import ujb.o;

/* renamed from: X.GpO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42702GpO implements GXX {
    public final C68332mD LIZ;
    public final C68332mD LIZIZ;
    public final C68332mD LIZJ;
    public final java.util.Set<String> LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // X.GXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<java.lang.String> getPrefixAllowList() {
        /*
            r6 = this;
            X.2mD r0 = r6.LIZ
            java.lang.Object r0 = r0.getValue()
            X.GpQ r0 = (X.C42704GpQ) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LIZ
            boolean r0 = r0.get()
            r5 = 0
            if (r0 != 0) goto L2a
            X.2mD r0 = r6.LIZIZ
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            X.2mD r0 = r6.LIZJ
            java.lang.Object r0 = r0.getValue()
            X.GfV r0 = (X.C42089GfV) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LIZ
            boolean r0 = r0.get()
            if (r0 == 0) goto L35
        L2a:
            r0 = 1
        L2b:
            java.lang.String r4 = "mAllowList"
            if (r0 != 0) goto L37
            java.util.Set<java.lang.String> r0 = r6.LIZLLL
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r4)
            return r0
        L35:
            r0 = 0
            goto L2b
        L37:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            X.2mD r0 = r6.LIZ
            java.lang.Object r0 = r0.getValue()
            X.GpQ r0 = (X.C42704GpQ) r0
            java.util.Set<java.lang.String> r1 = r0.LIZIZ
            java.lang.String r0 = "tempAllowList"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.addAll(r1)
            X.2mD r0 = r6.LIZIZ
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.GpZ r0 = r0.LJJIJL()
            X.GpU r0 = r0.getPersistedAllowListManager()
            X.GvI r0 = r0.LIZ()
            r3.addAll(r0)
            X.2mD r0 = r6.LIZJ
            java.lang.Object r1 = r0.getValue()
            X.GfV r1 = (X.C42089GfV) r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.LIZ
            boolean r0 = r0.get()
            if (r0 == 0) goto Ld3
            java.util.Set r1 = r1.LIZ()
        L7e:
            r3.addAll(r1)
            X.HFI<F, T> r0 = X.HFI.LJLIL
            X.PoC r2 = new X.PoC
            r2.<init>(r3, r0)
            X.HFH<F, T> r0 = X.HFH.LJLIL
            X.PoC r1 = new X.PoC
            r1.<init>(r3, r0)
            java.util.Set<java.lang.String> r0 = r6.LIZLLL
            r0.clear()
            java.util.Set<java.lang.String> r0 = r6.LIZLLL
            r0.addAll(r3)
            java.util.Set<java.lang.String> r0 = r6.LIZLLL
            r0.addAll(r2)
            java.util.Set<java.lang.String> r0 = r6.LIZLLL
            r0.addAll(r1)
            java.util.Set<java.lang.String> r2 = r6.LIZLLL
            X.H8C r1 = new X.H8C
            r1.<init>()
            X.HBf r0 = X.EnumC43651HBf.LOCAL_EXTRACT_MUSIC
            java.lang.String r3 = ""
            java.io.File r0 = r1.LIZ(r0, r3, r5)
            java.lang.String r0 = r0.getAbsolutePath()
            r2.add(r0)
            java.util.Set<java.lang.String> r2 = r6.LIZLLL
            X.H8C r1 = new X.H8C
            r1.<init>()
            X.HBf r0 = X.EnumC43651HBf.STYLE_EFFECT
            java.io.File r0 = r1.LIZ(r0, r3, r5)
            java.lang.String r0 = r0.getAbsolutePath()
            r2.add(r0)
            java.util.Set<java.lang.String> r0 = r6.LIZLLL
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r4)
            return r0
        Ld3:
            java.util.Set<java.lang.String> r1 = r1.LIZIZ
            java.lang.String r0 = "{\n            mAllowList\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42702GpO.getPrefixAllowList():java.util.Set");
    }

    public C42702GpO() {
        C221108m2.LIZIZ(C42703GpP.LJLIL);
        this.LIZ = new C68332mD(new C42704GpQ());
        this.LIZIZ = new C68332mD(new C42705GpR());
        this.LIZJ = new C68332mD(new C42089GfV());
        this.LIZLLL = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    @Override // X.GXX
    public final boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        C42704GpQ c42704GpQ = (C42704GpQ) this.LIZ.getValue();
        c42704GpQ.getClass();
        if (o.LJJJJJL(str)) {
            return false;
        }
        boolean add = c42704GpQ.LIZIZ.add(str);
        c42704GpQ.LIZ.set(add);
        return add;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onDeleted(AwemeDraft draft) {
        kotlin.jvm.internal.o.LJIIIZ(draft, "draft");
        if (C00F.LIZ(31744, 0, "creative_tool_open_storage_opt", true) == 1 || C00F.LIZ(31744, 0, "creative_tool_open_storage_opt", true) == 2) {
            C42089GfV c42089GfV = (C42089GfV) this.LIZJ.getValue();
            c42089GfV.LIZ.set(true);
            if (C5OG.LIZ()) {
                C10K.LIZJ(new ACallableS110S0100000_7(c42089GfV, 66));
            } else {
                c42089GfV.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onUpdated(IDraftListener.UpdateParams params) {
        kotlin.jvm.internal.o.LJIIIZ(params, "params");
        C42089GfV c42089GfV = (C42089GfV) this.LIZJ.getValue();
        c42089GfV.LIZ.set(true);
        if (C5OG.LIZ()) {
            C10K.LIZJ(new ACallableS110S0100000_7(c42089GfV, 66));
        } else {
            c42089GfV.LIZ();
        }
    }
}
