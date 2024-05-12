package X;

/* renamed from: X.ODc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61536ODc<IN, OUT> extends AbstractC61551ODr<IN, OUT> {
    public IN LJI;
    public boolean LJII = true;

    public abstract OUT LIZJ();

    @Override // X.AbstractC61551ODr
    public final void LIZ(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            this.LJII = ((Boolean) objArr[0]).booleanValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC61551ODr
    public final Object LIZIZ(C61548ODo c61548ODo, Object obj) {
        this.LJI = obj;
        try {
            return c61548ODo.LJ(LIZJ());
        } catch (OEX e) {
            return LIZLLL(c61548ODo, e.getCause());
        } catch (Throwable th) {
            return LIZLLL(c61548ODo, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C61548ODo r4, java.lang.Throwable r5) {
        /*
            r3 = this;
        L0:
            r2 = r3
            X.ODl r2 = (X.C61545ODl) r2
            boolean r0 = r5 instanceof X.C61564OEe
            if (r0 != 0) goto L23
            boolean r0 = r5 instanceof X.C61565OEf
            if (r0 != 0) goto L23
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L42
            boolean r0 = r3.LJII
            if (r0 == 0) goto L42
            java.lang.Object r0 = r3.LIZJ()     // Catch: java.lang.Throwable -> L1b X.OEX -> L1d
            java.lang.Object r0 = r4.LJ(r0)     // Catch: java.lang.Throwable -> L1b X.OEX -> L1d
            goto L41
        L1b:
            r5 = move-exception
            goto L0
        L1d:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()
            goto L0
        L23:
            java.lang.String r1 = "gecko-debug-tag"
            java.lang.String r0 = "download failed"
            X.OC6.LJ(r1, r0, r5)
            IN r0 = r2.LJI
            com.bytedance.geckox.model.UpdatePackage r0 = (com.bytedance.geckox.model.UpdatePackage) r0
            com.bytedance.geckox.model.UpdatePackage$Package r0 = r0.getPackage()
            java.util.List r0 = r0.getUrlList()
            int r1 = r2.LJIIIIZZ
            int r0 = r0.size()
            if (r1 < r0) goto L3f
            goto Lb
        L3f:
            r0 = 1
            goto Lc
        L41:
            return r0
        L42:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61536ODc.LIZLLL(X.ODo, java.lang.Throwable):java.lang.Object");
    }
}
