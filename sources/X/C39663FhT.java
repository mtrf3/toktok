package X;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.FhT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39663FhT implements InterfaceC39665FhV {
    public final Context LIZ;
    public final C39649FhF LIZIZ;
    public final C39667FhX LIZJ;
    public final Executor LIZLLL;

    public C39663FhT(Context context, Executor executor, C39667FhX c39667FhX, C39649FhF c39649FhF) {
        this.LIZ = context;
        this.LIZIZ = c39649FhF;
        this.LIZJ = c39667FhX;
        this.LIZLLL = executor;
    }

    @Override // X.InterfaceC39665FhV
    public final void LIZ(List<Intent> list, InterfaceC39666FhW interfaceC39666FhW) {
        if (C39647FhD.LIZLLL.get() != null) {
            this.LIZLLL.execute(new RunnableC39664FhU(this, list, interfaceC39666FhW));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
