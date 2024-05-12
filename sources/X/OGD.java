package X;

import android.content.Intent;

/* loaded from: classes11.dex */
public final class OGD implements InterfaceC58316Mue {
    public final /* synthetic */ InterfaceC27436Apk LIZ;

    public OGD(InterfaceC27436Apk interfaceC27436Apk) {
        this.LIZ = interfaceC27436Apk;
    }

    @Override // X.InterfaceC58316Mue
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.LIZ.onActivityResult(i, i2, intent);
    }
}
