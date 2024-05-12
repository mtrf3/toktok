package X;

import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QX8<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ List<C66619QCp> LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public QX8(String str, int i, String str2, List<? extends C66619QCp> list) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = str2;
        this.LJLJJI = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C68542QvC.LIZ.getClass();
        QQC qqc = C68542QvC.LIZJ;
        o.LJI(qqc);
        return ((NetworkProxyAccount) qqc).LJIIIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, AvatarUri.class, "data", this.LJLJJI);
    }
}
