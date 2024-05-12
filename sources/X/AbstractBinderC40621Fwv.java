package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.play.core.assetpacks.AssetPackExtractionService;
import com.google.android.play.core.assetpacks.w;
import com.google.android.play.core.assetpacks.y;

/* renamed from: X.Fwv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractBinderC40621Fwv extends BinderC40637FxB {
    public AbstractBinderC40621Fwv() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // X.BinderC40637FxB
    public final boolean LJLJI(Parcel parcel, int i) {
        Bundle bundle;
        InterfaceC40622Fww interfaceC40622Fww = null;
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            C36493ETx.LIZ(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                if (queryLocalInterface instanceof InterfaceC40622Fww) {
                    interfaceC40622Fww = (InterfaceC40622Fww) queryLocalInterface;
                } else {
                    interfaceC40622Fww = new C40597FwX(readStrongBinder);
                }
            }
            w wVar = (w) this;
            wVar.LJLIL.LIZJ("clearAssetPackStorage AIDL call", 3, new Object[0]);
            if (!C39776FjI.LIZ(wVar.LJLILLLLZI) || !C39776FjI.LIZIZ(wVar.LJLILLLLZI)) {
                interfaceC40622Fww.f(new Bundle());
            } else {
                y.LJFF(wVar.LJLJJI.LJ());
                interfaceC40622Fww.b(new Bundle());
            }
        } else {
            Bundle bundle2 = (Bundle) C36493ETx.LIZ(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                if (queryLocalInterface2 instanceof InterfaceC40622Fww) {
                    interfaceC40622Fww = (InterfaceC40622Fww) queryLocalInterface2;
                } else {
                    interfaceC40622Fww = new C40597FwX(readStrongBinder2);
                }
            }
            w wVar2 = (w) this;
            wVar2.LJLIL.LIZJ("updateServiceState AIDL call", 3, new Object[0]);
            if (!C39776FjI.LIZ(wVar2.LJLILLLLZI) || !C39776FjI.LIZIZ(wVar2.LJLILLLLZI)) {
                interfaceC40622Fww.f(new Bundle());
                wVar2.LJLJI.LIZ();
            } else {
                AssetPackExtractionService assetPackExtractionService = wVar2.LJLJI;
                synchronized (assetPackExtractionService) {
                    int i2 = bundle2.getInt("action_type");
                    C13T c13t = assetPackExtractionService.LJLIL;
                    Integer valueOf = Integer.valueOf(i2);
                    c13t.LIZJ("updateServiceState: %d", 3, new Object[]{valueOf});
                    if (i2 == 1) {
                        assetPackExtractionService.LIZIZ(bundle2);
                    } else if (i2 != 2) {
                        assetPackExtractionService.LJLIL.LIZJ("Unknown action type received: %d", 6, new Object[]{valueOf});
                    } else {
                        assetPackExtractionService.LIZ();
                    }
                    bundle = new Bundle();
                }
                interfaceC40622Fww.LJZ(bundle, new Bundle());
            }
        }
        return true;
    }
}
