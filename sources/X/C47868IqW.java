package X;

import android.database.ContentObserver;

/* renamed from: X.IqW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47868IqW extends ContentObserver {
    public final /* synthetic */ C47786IpC LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47868IqW(C47786IpC c47786IpC) {
        super(null);
        this.LIZ = c47786IpC;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        this.LIZ.LIZ();
    }
}
