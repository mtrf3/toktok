package com.ss.android.ugc.aweme.im.sdk.relations.viewmodel;

import X.AbstractC84083Rs;
import X.AbstractC92763kW;
import X.C92723kS;
import X.C92753kV;
import X.InterfaceC82613Mb;
import X.InterfaceC84103Ru;
import X.ORZ;
import X.OSZ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RelationViewModel extends ViewModel implements InterfaceC82613Mb<IMContact>, InterfaceC84103Ru {
    public static final /* synthetic */ int LJLJJI = 0;
    public final AbstractC84083Rs LJLIL;
    public final MutableLiveData<AbstractC92763kW<List<IMContact>>> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<AbstractC92763kW<OSZ<List<IMContact>, String>>> LJLJI = new MutableLiveData<>();

    public RelationViewModel(AbstractC84083Rs abstractC84083Rs) {
        this.LJLIL = abstractC84083Rs;
    }

    @Override // X.InterfaceC84103Ru
    public final void F70(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LJLJI.setValue(new C92753kV(t));
    }

    @Override // X.InterfaceC82613Mb
    public final void L8(Throwable th) {
        this.LJLILLLLZI.setValue(new C92753kV(th));
    }

    @Override // X.InterfaceC82613Mb
    public final void Y8(Throwable th) {
        this.LJLILLLLZI.setValue(new C92753kV(th));
    }

    @Override // X.InterfaceC82613Mb
    public final void L20(List<IMContact> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLILLLLZI.setValue(new C92723kS(ORZ.LLJILJILJ(this.LJLIL.LIZIZ())));
    }

    @Override // X.InterfaceC82613Mb
    public final void zr0(List<IMContact> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLILLLLZI.setValue(new C92723kS(list));
    }

    @Override // X.InterfaceC84103Ru
    public final void zs0(String keyword, List list) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(keyword, "keyword");
        this.LJLJI.setValue(new C92723kS(new OSZ(list, keyword)));
    }
}
