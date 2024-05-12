package X;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.FwA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40574FwA extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ Collection LJLILLLLZI;
    public final /* synthetic */ Collection LJLJI;
    public final /* synthetic */ C40579FwF LJLJJI;
    public final /* synthetic */ C40571Fw7 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40574FwA(C40571Fw7 c40571Fw7, C40579FwF c40579FwF, Collection collection, Collection collection2, C40579FwF c40579FwF2) {
        super(c40579FwF);
        this.LJLJJL = c40571Fw7;
        this.LJLILLLLZI = collection;
        this.LJLJI = collection2;
        this.LJLJJI = c40579FwF2;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        Collection<String> collection = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        Collection<String> collection2 = this.LJLJI;
        ArrayList arrayList2 = new ArrayList(collection2.size());
        for (String str2 : collection2) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("language", str2);
            arrayList2.add(bundle2);
        }
        arrayList.addAll(arrayList2);
        try {
            C40571Fw7 c40571Fw7 = this.LJLJJL;
            InterfaceC40576FwC interfaceC40576FwC = c40571Fw7.LIZIZ.LJIIJ;
            String str3 = c40571Fw7.LIZ;
            Bundle bundle3 = new Bundle();
            bundle3.putInt("playcore_version_code", 10900);
            interfaceC40576FwC.f0(str3, arrayList, bundle3, new BinderC40584FwK(this.LJLJJL, this.LJLJJI));
        } catch (RemoteException e) {
            C40571Fw7.LIZJ.getClass();
            this.LJLJJI.LIZIZ(new RuntimeException(e));
        }
    }
}
