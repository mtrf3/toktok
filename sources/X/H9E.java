package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import java.util.ArrayList;
import v5.n;

/* loaded from: classes8.dex */
public final class H9E implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ java.util.Map LJLILLLLZI;
    public final /* synthetic */ boolean[] LJLJI;
    public final /* synthetic */ ProgressDialogC43239Gy3[] LJLJJI;
    public final /* synthetic */ n LJLJJL;
    public final /* synthetic */ Bundle LJLJJLL;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        InterfaceC84498XEg interfaceC84498XEg2 = interfaceC84498XEg;
        if (interfaceC84498XEg2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.LJLIL);
            interfaceC84498XEg2.LJ(arrayList, false, this.LJLILLLLZI, new H9F(this));
        }
    }

    public H9E(String str, java.util.Map map, boolean[] zArr, ProgressDialogC43239Gy3[] progressDialogC43239Gy3Arr, n nVar, Bundle bundle) {
        this.LJLIL = str;
        this.LJLILLLLZI = map;
        this.LJLJI = zArr;
        this.LJLJJI = progressDialogC43239Gy3Arr;
        this.LJLJJL = nVar;
        this.LJLJJLL = bundle;
    }
}
