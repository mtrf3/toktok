package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.JIe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48928JIe implements JIB {
    public final /* synthetic */ C48929JIf LIZ;
    public final /* synthetic */ Context LIZIZ;

    @Override // X.JIB
    public final /* synthetic */ Fragment LIZ() {
        return null;
    }

    @Override // X.JIB
    public final /* synthetic */ InterfaceC47667InH LIZJ() {
        return null;
    }

    @Override // X.JIB
    public final boolean LIZIZ() {
        return this.LIZ.isAttachedToWindow();
    }

    @Override // X.JIB
    public final boolean isActive() {
        return this.LIZ.isAttachedToWindow();
    }

    @Override // X.JIB
    public final String getIdentifier() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchLiveForLynx_");
        LIZ.append(this.LIZIZ.hashCode());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.JIB
    public final Context getContext() {
        return this.LIZIZ;
    }

    public C48928JIe(C48929JIf c48929JIf, Context context) {
        this.LIZ = c48929JIf;
        this.LIZIZ = context;
    }
}
