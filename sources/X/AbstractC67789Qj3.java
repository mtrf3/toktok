package X;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;

/* renamed from: X.Qj3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67789Qj3<T extends IInterface> extends AbstractC67863QkF<T> implements InterfaceC67836Qjo, InterfaceC67787Qj1 {
    public final C67736QiC LLIIII;
    public final java.util.Set<Scope> LLIIIILZ;
    public final Account LLIIIJ;

    @Override // X.AbstractC67863QkF
    public final Account LJIL() {
        return this.LLIIIJ;
    }

    @Override // X.AbstractC67863QkF
    public final void LJJI() {
    }

    @Override // X.AbstractC67863QkF
    public final java.util.Set<Scope> LJJIII() {
        return this.LLIIIILZ;
    }

    @Override // X.InterfaceC67836Qjo
    public final java.util.Set<Scope> LIZJ() {
        if (LIZIZ()) {
            return this.LLIIIILZ;
        }
        return Collections.emptySet();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC67789Qj3(android.content.Context r13, android.os.Looper r14, int r15, X.C67736QiC r16, X.InterfaceC67784Qiy r17, X.InterfaceC67712Qho r18) {
        /*
            r12 = this;
            r4 = r13
            X.QkK r6 = X.AbstractC67866QkI.LIZ(r4)
            com.google.android.gms.common.GoogleApiAvailability r7 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r1 = r17
            X.QH7.LJIIIIZZ(r1)
            r0 = r18
            X.QH7.LJIIIIZZ(r0)
            X.Qiz r9 = new X.Qiz
            r9.<init>(r1)
            X.Qj4 r10 = new X.Qj4
            r10.<init>(r0)
            r1 = r16
            java.lang.String r11 = r1.LJI
            r3 = r12
            r5 = r14
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r3.LLIIII = r1
            android.accounts.Account r0 = r1.LIZ
            r3.LLIIIJ = r0
            java.util.Set<com.google.android.gms.common.api.Scope> r2 = r1.LIZJ
            java.util.Iterator r1 = r2.iterator()
        L33:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L44
            goto L33
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expanding scopes is not permitted, use implied scopes instead"
            r1.<init>(r0)
            throw r1
        L4c:
            r3.LLIIIILZ = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC67789Qj3.<init>(android.content.Context, android.os.Looper, int, X.QiC, X.Qiy, X.Qho):void");
    }
}
