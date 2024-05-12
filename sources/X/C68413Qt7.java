package X;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.Feature;
import kotlin.jvm.internal.o;

/* renamed from: X.Qt7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68413Qt7<TResult> implements InterfaceC67677QhF {
    public final /* synthetic */ C68421QtF LJLIL;
    public final /* synthetic */ C68416QtA LJLILLLLZI;
    public final /* synthetic */ OSZ<String, Integer> LJLJI;
    public final /* synthetic */ InterfaceC68422QtG LJLJJI;

    public C68413Qt7(C68421QtF c68421QtF, C68416QtA c68416QtA, OSZ<String, Integer> osz, InterfaceC68422QtG interfaceC68422QtG) {
        this.LJLIL = c68421QtF;
        this.LJLILLLLZI = c68416QtA;
        this.LJLJI = osz;
        this.LJLJJI = interfaceC68422QtG;
    }

    @Override // X.InterfaceC67677QhF
    public final void onSuccess(Object obj) {
        Boolean isE2EEAvailable = (Boolean) obj;
        o.LJIIIIZZ(isE2EEAvailable, "isE2EEAvailable");
        if (isE2EEAvailable.booleanValue()) {
            this.LJLIL.LIZIZ = true;
        }
        final C67801QjF c67801QjF = this.LJLILLLLZI.LIZ;
        C68421QtF c68421QtF = this.LJLIL;
        c68421QtF.getClass();
        final StoreBytesData storeBytesData = new StoreBytesData("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY", c68421QtF.LIZ, c68421QtF.LIZIZ);
        c67801QjF.getClass();
        C67887Qkd c67887Qkd = new C67887Qkd();
        c67887Qkd.LIZJ = new Feature[]{C67947Qlb.LIZ, C67947Qlb.LIZJ};
        c67887Qkd.LIZ = new InterfaceC67935QlP(c67801QjF, storeBytesData) { // from class: X.Qt6
            public final /* synthetic */ StoreBytesData LJLIL;

            {
                this.LJLIL = storeBytesData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC67935QlP
            public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj2) {
                StoreBytesData storeBytesData2 = this.LJLIL;
                BinderC68419QtD binderC68419QtD = new BinderC68419QtD((C67649Qgn) obj2);
                C67908Qky c67908Qky = (C67908Qky) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(c67908Qky.LJLILLLLZI);
                obtain.writeStrongBinder(binderC68419QtD);
                if (storeBytesData2 == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    storeBytesData2.writeToParcel(obtain, 0);
                }
                c67908Qky.LJLJI(obtain, 10);
            }
        };
        c67887Qkd.LIZLLL = 1645;
        c67887Qkd.LIZIZ = false;
        C67646Qgk LIZLLL = c67801QjF.LIZLLL(1, c67887Qkd.LIZ());
        C68415Qt9 c68415Qt9 = new C68415Qt9(this.LJLJI, this.LJLJJI);
        LIZLLL.getClass();
        LIZLLL.LJFF(C67641Qgf.LIZ, c68415Qt9);
        LIZLLL.LJIILLIIL(new C68418QtC(this.LJLJJI));
    }
}
