package X;

import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.profile.model.TcmImage;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QX4<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ List<C66619QCp> LJLJJL;

    public QX4(int i, String str, String str2, String str3, List list) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C68542QvC.LIZ.getClass();
        QQC qqc = C68542QvC.LIZJ;
        o.LJI(qqc);
        return ((NetworkProxyAccount) qqc).LJIIIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, TcmImage.class, this.LJLJJI, this.LJLJJL);
    }
}
