package X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.Qkb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67885Qkb extends AbstractC67874QkQ {
    public final /* synthetic */ AbstractC67863QkF LJI;

    @Override // X.AbstractC67874QkQ
    public final boolean LJFF() {
        this.LJI.LJLLLLLL.LIZ(ConnectionResult.RESULT_SUCCESS);
        return true;
    }

    @Override // X.AbstractC67874QkQ
    public final void LJ(ConnectionResult connectionResult) {
        this.LJI.getClass();
        this.LJI.LJLLLLLL.LIZ(connectionResult);
        this.LJI.LJJIJ(connectionResult);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67885Qkb(AbstractC67863QkF abstractC67863QkF, int i) {
        super(abstractC67863QkF, i, null);
        this.LJI = abstractC67863QkF;
    }
}
