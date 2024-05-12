package X;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: X.Zke, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractBinderC90820Zke extends BinderC90358ZdC implements InterfaceC90470Zf0 {
    public AbstractBinderC90820Zke() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // X.BinderC90358ZdC
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            d((Bundle) C90257ZbZ.LIZ(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
