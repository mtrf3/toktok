package com.ss.android.ugc.aweme.dsp.v2;

import X.ActivityC45651qj;
import X.C91359ZtL;
import X.InterfaceC91177ZqP;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class TTDspViewModelV2 extends ViewModel {
    public static final /* synthetic */ int LJLJJL = 0;
    public InterfaceC91177ZqP LJLIL;
    public final List<InterfaceC91177ZqP> LJLILLLLZI;
    public boolean LJLJI;
    public final C91359ZtL LJLJJI;

    public TTDspViewModelV2(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        ArrayList arrayList = new ArrayList();
        this.LJLILLLLZI = arrayList;
        this.LJLJI = true;
        this.LJLJJI = new C91359ZtL();
        arrayList.addAll(C91359ZtL.LIZIZ(activity));
    }
}
