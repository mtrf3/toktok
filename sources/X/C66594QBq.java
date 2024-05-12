package X;

import com.ss.android.storageInit.StorageModuleInitTask;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QBq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66594QBq implements P8J {
    public final /* synthetic */ StorageModuleInitTask LIZ;

    @Override // X.P8J
    public final List<InterfaceC37286EkE> LIZ() {
        if (this.LIZ.LJLJJI.size() == 0) {
            if (((Boolean) C23790wZ.LIZ.getValue()).booleanValue()) {
                this.LIZ.LJLIL = new C59162NJu();
                StorageModuleInitTask storageModuleInitTask = this.LIZ;
                ArrayList<InterfaceC37286EkE> arrayList = storageModuleInitTask.LJLJJI;
                C59162NJu c59162NJu = storageModuleInitTask.LJLIL;
                o.LJI(c59162NJu);
                arrayList.add(c59162NJu);
            }
            this.LIZ.LJLILLLLZI = new C66593QBp();
            StorageModuleInitTask storageModuleInitTask2 = this.LIZ;
            ArrayList<InterfaceC37286EkE> arrayList2 = storageModuleInitTask2.LJLJJI;
            C66593QBp c66593QBp = storageModuleInitTask2.LJLILLLLZI;
            o.LJI(c66593QBp);
            arrayList2.add(c66593QBp);
            this.LIZ.LJLJI = new C66592QBo();
            StorageModuleInitTask storageModuleInitTask3 = this.LIZ;
            ArrayList<InterfaceC37286EkE> arrayList3 = storageModuleInitTask3.LJLJJI;
            C66592QBo c66592QBo = storageModuleInitTask3.LJLJI;
            o.LJI(c66592QBo);
            arrayList3.add(c66592QBo);
            this.LIZ.LJLJJI.add(new C37296EkO());
            new C66595QBr();
            this.LIZ.LJLJJI.add(new C66595QBr());
        }
        return this.LIZ.LJLJJI;
    }

    public C66594QBq(StorageModuleInitTask storageModuleInitTask) {
        this.LIZ = storageModuleInitTask;
    }
}
