package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3S1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3S1 implements InterfaceC101153y3, InterfaceC82613Mb<IMContact>, InterfaceC84103Ru {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final C3R2 LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final MutableLiveData<String> LJLJJI;
    public final MutableLiveData<List<IMContact>> LJLJJL;
    public final MutableLiveData<List<IMContact>> LJLJJLL;
    public final MutableLiveData<C3S2> LJLJL;

    @Override // X.InterfaceC82613Mb
    public final void L8(Throwable th) {
    }

    @Override // X.InterfaceC101153y3
    public final void LIZ() {
        this.LJLIL.LJFF(this);
        C3R2 c3r2 = this.LJLIL;
        c3r2.getClass();
        c3r2.LJLLILLLL = this;
    }

    @Override // X.InterfaceC101153y3
    public final void onCleared() {
        C3R2 c3r2 = this.LJLIL;
        C34B.LJI(c3r2.LJLILLLLZI, "unSubscribe");
        c3r2.LJLJI = null;
        C3R2 c3r22 = this.LJLIL;
        c3r22.LJLLILLLL = null;
        ((C73318Sq2) c3r22.LJLLJ.getValue()).LIZLLL();
    }

    @Override // X.InterfaceC101153y3
    public final void refresh() {
        this.LJLJL.setValue(C3S2.LOADING);
        List<IMContact> LLJILJILJ = ORZ.LLJILJILJ(this.LJLIL.LIZIZ());
        if (!((ArrayList) LLJILJILJ).isEmpty()) {
            zr0(LLJILJILJ, this.LJLIL.LJ().LIZ());
        } else {
            this.LJLIL.LIZLLL();
        }
    }

    @Override // X.InterfaceC101153y3
    public final /* bridge */ /* synthetic */ MutableLiveData LIZIZ() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC101153y3
    public final /* bridge */ /* synthetic */ MutableLiveData LIZJ() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC101153y3
    public final /* bridge */ /* synthetic */ MutableLiveData LIZLLL() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC101153y3
    public final /* bridge */ /* synthetic */ LiveData getState() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC84103Ru
    public final void F70(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LJLJJLL.postValue(new ArrayList());
        C34B.LIZLLL("ShareContactsRepository", "onSearchError", t);
    }

    @Override // X.InterfaceC101153y3
    public final void LLIIIL(String str) {
        this.LJLJJI.setValue(str);
        if (str.length() == 0) {
            this.LJLJJL.setValue(C61878OQg.INSTANCE);
        } else {
            this.LJLIL.LJIIIIZZ(str);
        }
    }

    @Override // X.InterfaceC82613Mb
    public final void Y8(Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadError: ");
        LIZ.append(th.getMessage());
        C34B.LJI("ShareContactsRepository", X1D.LIZIZ(LIZ));
        this.LJLJL.setValue(C3S2.ERROR);
    }

    @Override // X.InterfaceC82613Mb
    public final void L20(List<IMContact> list, boolean z) {
        o.LJIIIZ(list, "list");
    }

    @Override // X.InterfaceC82613Mb
    public final void zr0(List<IMContact> list, boolean z) {
        List<IMContact> list2;
        o.LJIIIZ(list, "list");
        if (this.LJLILLLLZI) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((IMContact) ListProtector.get(list, i)).getType() == 0 || ((IMContact) ListProtector.get(list, i)).getType() == 3) {
                    arrayList3.add(ListProtector.get(list, i));
                } else if (((IMContact) ListProtector.get(list, i)).getType() == 16 || ((IMContact) ListProtector.get(list, i)).getType() == 17) {
                    arrayList.add(ListProtector.get(list, i));
                } else {
                    arrayList2.add(ListProtector.get(list, i));
                }
            }
            list = ORZ.LJLJJL(arrayList2);
            if (arrayList.size() >= 1) {
                if (arrayList2.size() == 0) {
                    ((IMContact) ListProtector.get(arrayList, 0)).setType(16);
                    list2 = arrayList;
                } else {
                    list2 = ORZ.LLIIIZ(arrayList, list);
                }
                list = list2;
            } else if (!this.LJLJI) {
                list = ORZ.LLIIIZ(arrayList3, list);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadSuccess: ");
        LIZ.append(list.size());
        LIZ.append(", ");
        LIZ.append(z);
        LIZ.append(" ,");
        LIZ.append(this.LJLILLLLZI);
        C34B.LJI("ShareContactsRepository", X1D.LIZIZ(LIZ));
        this.LJLJL.setValue(C3S2.LOADED);
        this.LJLJJLL.setValue(list);
    }

    @Override // X.InterfaceC84103Ru
    public final void zs0(String keyword, List list) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(keyword, "keyword");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSearchResult: ");
        LIZ.append(list.size());
        C34B.LIZIZ("ShareContactsRepository", X1D.LIZIZ(LIZ));
        this.LJLJJL.setValue(list);
    }

    public C3S1(C3R2 relationModel, boolean z, boolean z2) {
        o.LJIIIZ(relationModel, "relationModel");
        this.LJLIL = relationModel;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = new MutableLiveData<>();
        this.LJLJJL = new MutableLiveData<>();
        this.LJLJJLL = new MutableLiveData<>();
        this.LJLJL = new MutableLiveData<>(C3S2.INIT);
    }
}
