package X;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Qsh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C68387Qsh implements InterfaceC67935QlP {
    public final Object LJLIL;
    public final Object LJLILLLLZI;

    public /* synthetic */ C68387Qsh(C67801QjF c67801QjF, RetrieveBytesRequest retrieveBytesRequest) {
        this.LJLIL = c67801QjF;
        this.LJLILLLLZI = retrieveBytesRequest;
    }

    public /* synthetic */ C68387Qsh() {
        this.LJLIL = new HashMap();
        this.LJLILLLLZI = new C68393Qsn();
        LIZJ(new C68389Qsj());
        LIZJ(new C68386Qsg());
        LIZJ(new C68382Qsc());
        LIZJ(new C68390Qsk());
        LIZJ(new C68384Qse());
        LIZJ(new C68388Qsi());
        LIZJ(new C68383Qsd());
    }

    public final void LIZJ(AbstractC68391Qsl abstractC68391Qsl) {
        Iterator it = ((ArrayList) abstractC68391Qsl.LIZ).iterator();
        while (it.hasNext()) {
            ((java.util.Map) this.LJLIL).put(((EnumC68385Qsf) it.next()).zzb().toString(), abstractC68391Qsl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67935QlP
    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
        RetrieveBytesRequest retrieveBytesRequest = (RetrieveBytesRequest) this.LJLILLLLZI;
        BinderC68407Qt1 binderC68407Qt1 = new BinderC68407Qt1((C67649Qgn) obj);
        C67908Qky c67908Qky = (C67908Qky) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(c67908Qky.LJLILLLLZI);
        obtain.writeStrongBinder(binderC68407Qt1);
        if (retrieveBytesRequest == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            retrieveBytesRequest.writeToParcel(obtain, 0);
        }
        c67908Qky.LJLJI(obtain, 12);
    }

    public final InterfaceC68379QsZ LIZIZ(C68377QsX c68377QsX, InterfaceC68379QsZ interfaceC68379QsZ) {
        AbstractC68391Qsl abstractC68391Qsl;
        C68368QsO.LIZJ(c68377QsX);
        if (interfaceC68379QsZ instanceof C68392Qsm) {
            C68392Qsm c68392Qsm = (C68392Qsm) interfaceC68379QsZ;
            ArrayList arrayList = c68392Qsm.LJLILLLLZI;
            String str = c68392Qsm.LJLIL;
            if (((java.util.Map) this.LJLIL).containsKey(str)) {
                abstractC68391Qsl = (AbstractC68391Qsl) ((java.util.Map) this.LJLIL).get(str);
            } else {
                abstractC68391Qsl = (AbstractC68391Qsl) this.LJLILLLLZI;
            }
            return abstractC68391Qsl.LIZ(str, c68377QsX, arrayList);
        }
        return interfaceC68379QsZ;
    }
}
