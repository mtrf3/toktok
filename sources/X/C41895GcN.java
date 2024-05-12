package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.GcN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41895GcN extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ ArrayList<C41897GcP> LJLIL;
    public final /* synthetic */ C41897GcP LJLILLLLZI;
    public final /* synthetic */ AtomicInteger LJLJI;
    public final /* synthetic */ C41896GcO LJLJJI;
    public final /* synthetic */ CreativeInfo LJLJJL;
    public final /* synthetic */ List<C41897GcP> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41895GcN(ArrayList<C41897GcP> arrayList, C41897GcP c41897GcP, AtomicInteger atomicInteger, C41896GcO c41896GcO, CreativeInfo creativeInfo, List<C41897GcP> list) {
        super(1);
        this.LJLIL = arrayList;
        this.LJLILLLLZI = c41897GcP;
        this.LJLJI = atomicInteger;
        this.LJLJJI = c41896GcO;
        this.LJLJJL = creativeInfo;
        this.LJLJJLL = list;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.LJLIL.add(this.LJLILLLLZI);
            this.LJLJI.incrementAndGet();
            this.LJLJJI.LIZIZ(this.LJLJJL, this.LJLJJLL, this.LJLJI, this.LJLIL);
        } else {
            C41896GcO c41896GcO = this.LJLJJI;
            CreativeInfo creativeInfo = this.LJLJJL;
            ArrayList<C41897GcP> arrayList = this.LJLIL;
            c41896GcO.getClass();
            if (!arrayList.isEmpty()) {
                C173786ru.LIZLLL(creativeInfo);
            }
            c41896GcO.LIZIZ.LIZ(arrayList);
        }
        return C76800UCe.LIZ;
    }
}
