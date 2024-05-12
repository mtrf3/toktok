package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import java.util.ArrayList;

/* renamed from: X.17r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C279117r implements InterfaceC30734C4k {
    @Override // X.InterfaceC30734C4k
    public int LIZ(String str) {
        return ((IInteractService) CN1.LIZ(IInteractService.class)).MS(str);
    }

    public static InterfaceC29405BgP LIZJ(BZI bzi, DataChannel dataChannel) {
        bzi.LJIILLIIL(dataChannel);
        return B83.LIZ().LIZIZ();
    }

    public static int LIZIZ(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i2;
    }

    public static void LIZLLL(int i, int i2, String str, boolean z, Keva keva, String str2) {
        keva.storeInt(str2, FFL.LJIIJ(i, i2, str, z));
        FFL.LJIIIZ().getClass();
    }
}
