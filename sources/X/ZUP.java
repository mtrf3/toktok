package X;

/* loaded from: classes19.dex */
public final class ZUP implements InterfaceC89997ZTt<Boolean, Void> {
    public final /* synthetic */ Runnable LIZ;
    public final /* synthetic */ Runnable LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC89997ZTt
    public final void LIZ(C89999ZTv c89999ZTv) {
        TResult tresult;
        if (c89999ZTv.LIZJ()) {
            synchronized (c89999ZTv.LIZJ) {
                tresult = c89999ZTv.LIZ;
            }
            boolean booleanValue = ((Boolean) tresult).booleanValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkTestResource result ");
            LIZ.append(booleanValue);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILJJIL("BytebenchV2");
            if (booleanValue) {
                Runnable runnable = this.LIZ;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            Runnable runnable2 = this.LIZIZ;
            if (runnable2 == null) {
                return;
            }
            runnable2.run();
        }
    }

    public ZUP(Runnable runnable, Runnable runnable2) {
        this.LIZ = runnable;
        this.LIZIZ = runnable2;
    }
}
