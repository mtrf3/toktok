package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import java.util.ArrayList;
import java.util.List;
import v5.n;

/* loaded from: classes8.dex */
public final class HN6 implements IAVProcessService.IProcessCallback<String> {
    public final /* synthetic */ ArrayList<String> LIZ;
    public final /* synthetic */ List<String> LIZIZ;
    public final /* synthetic */ n<List<String>> LIZJ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
    public final void finish(String str) {
        this.LIZ.add(str);
        if (this.LIZ.size() == this.LIZIZ.size()) {
            this.LIZJ.LJ(this.LIZ);
        }
    }

    public HN6(ArrayList<String> arrayList, List<String> list, n<List<String>> nVar) {
        this.LIZ = arrayList;
        this.LIZIZ = list;
        this.LIZJ = nVar;
    }
}
