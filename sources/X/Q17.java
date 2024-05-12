package X;

import com.google.gson.m;
import kotlin.jvm.internal.AqS161S0100000_11;

/* loaded from: classes12.dex */
public final class Q17 implements InterfaceC66332Q1o {
    public final InterfaceC65784Pro<m> LIZ;

    @Override // X.InterfaceC66332Q1o
    public final String name() {
        return "SettingsStrategy";
    }

    @Override // X.InterfaceC66332Q1o
    public final int priority() {
        return 1;
    }

    @Override // X.InterfaceC66332Q1o
    public final m LIZ() {
        try {
            return this.LIZ.invoke();
        } catch (Throwable unused) {
            return null;
        }
    }

    public Q17(AqS161S0100000_11 aqS161S0100000_11) {
        this.LIZ = aqS161S0100000_11;
    }
}
