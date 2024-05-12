package X;

import android.os.Parcel;
import com.byted.cast.common.CastLogger;

/* renamed from: X.ZhU, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class BinderC90624ZhU extends BinderC90358ZdC {
    public final C90505ZfZ LJLIL;

    public BinderC90624ZhU(C90505ZfZ c90505ZfZ) {
        super("com.google.android.gms.cast.framework.ICastStateListener");
        this.LJLIL = c90505ZfZ;
    }

    @Override // X.BinderC90358ZdC
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            }
            int readInt = parcel.readInt();
            C90506Zfa c90506Zfa = this.LJLIL.LIZ;
            CastLogger castLogger = c90506Zfa.LJIJJLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onCastStateChanged, status: ");
            LIZ.append(readInt);
            castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
            if (readInt == 2) {
                c90506Zfa.LJI();
            }
            parcel2.writeNoException();
            return true;
        }
        BinderC68153Qov binderC68153Qov = new BinderC68153Qov(this.LJLIL);
        parcel2.writeNoException();
        C90257ZbZ.LIZJ(parcel2, binderC68153Qov);
        return true;
    }
}
