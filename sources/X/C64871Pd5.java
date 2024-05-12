package X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: X.Pd5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64871Pd5 extends ContentObserver {
    public final /* synthetic */ C64868Pd2 LIZ;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        if (C64868Pd2.LIZ(this.LIZ.LJLILLLLZI)) {
            C64868Pd2 c64868Pd2 = this.LIZ;
            c64868Pd2.openConnection(c64868Pd2.LJLJJL, c64868Pd2.LJLJJLL);
        } else {
            this.LIZ.stopConnection();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64871Pd5(C64868Pd2 c64868Pd2, Handler handler) {
        super(handler);
        this.LIZ = c64868Pd2;
    }
}
