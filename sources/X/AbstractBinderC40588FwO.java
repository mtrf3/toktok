package X;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: X.FwO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractBinderC40588FwO extends BinderC40637FxB implements InterfaceC40590FwQ {
    public AbstractBinderC40588FwO() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // X.BinderC40637FxB
    public final boolean LJLJI(Parcel parcel, int i) {
        if (i == 2) {
            LJJJJLL((Bundle) C36493ETx.LIZ(parcel, Bundle.CREATOR));
            return true;
        }
        if (i != 3) {
            return false;
        }
        LJJJJJL((Bundle) C36493ETx.LIZ(parcel, Bundle.CREATOR));
        return true;
    }
}
