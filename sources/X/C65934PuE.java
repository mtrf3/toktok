package X;

import com.bytedance.helios.api.config.AutoSkipApiConfig;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.PuE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65934PuE extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ double LJLILLLLZI;
    public final /* synthetic */ CopyOnWriteArrayList LJLJI;
    public final /* synthetic */ AutoSkipApiConfig LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65934PuE(int i, double d, CopyOnWriteArrayList copyOnWriteArrayList, AutoSkipApiConfig autoSkipApiConfig) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = d;
        this.LJLJI = copyOnWriteArrayList;
        this.LJLJJI = autoSkipApiConfig;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("statisticsApiCost skip id: ");
        LIZ.append(this.LJLIL);
        LIZ.append(" average: ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" count: ");
        LIZ.append(this.LJLJI.size());
        LIZ.append(" autoSkipApiConfig: ");
        LIZ.append(this.LJLJJI);
        return X1D.LIZIZ(LIZ);
    }
}
