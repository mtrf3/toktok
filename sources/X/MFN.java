package X;

/* loaded from: classes10.dex */
public final class MFN extends C8BR<C3I2, MFO> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        if (this.LJLILLLLZI != 0 && this.LJLIL != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onItemDelete ");
            C1FJ.LJFF(LIZ, (String) this.LJLIL.getData(), LIZ, 6, "DeleteAweme");
            ((MFO) this.LJLILLLLZI).onItemDeleteSuccess((String) this.LJLIL.getData());
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((MFO) k).onItemDeleteFailed(exc);
        }
    }
}
