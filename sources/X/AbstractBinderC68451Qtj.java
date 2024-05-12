package X;

import android.os.Parcel;

/* renamed from: X.Qtj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68451Qtj extends BinderC67896Qkm implements InterfaceC68455Qtn {
    public static final /* synthetic */ int LJLIL = 0;

    public AbstractBinderC68451Qtj() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // X.BinderC67896Qkm
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int i2 = ((AbstractBinderC68448Qtg) this).LJLILLLLZI;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        } else {
            InterfaceC68163Qp5 LIZLLL = ((AbstractBinderC68448Qtg) this).LIZLLL();
            parcel2.writeNoException();
            C67609Qg9.LIZIZ(parcel2, LIZLLL);
        }
        return true;
    }
}
