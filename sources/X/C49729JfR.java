package X;

import androidx.lifecycle.MutableLiveData;

/* renamed from: X.JfR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49729JfR extends AbstractC49223JTn {
    public AbstractC65781Prl LJLILLLLZI;

    @Override // X.InterfaceC49220JTk
    public final MutableLiveData<Integer> LIZ() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Pro, X.Prl] */
    @Override // X.AbstractC49223JTn, X.InterfaceC49220JTk
    public final boolean isEnable() {
        boolean z;
        ?? r0 = this.LJLILLLLZI;
        if (r0 != 0 && ((Boolean) r0.invoke()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
