package X;

import com.google.gson.j;

/* renamed from: X.274, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass274 extends AbstractC65781Prl implements InterfaceC88471Ynr<Integer, j, Boolean> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass274(int i, int i2) {
        super(2);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Integer num, j jVar) {
        boolean z;
        int intValue = num.intValue();
        if (this.LJLIL <= intValue && intValue < this.LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
