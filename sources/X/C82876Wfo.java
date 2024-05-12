package X;

import android.os.Handler;
import android.os.IBinder;
import com.bytedance.ies.cutsame.resourcefetcher.NetworkFileFetcher;
import defpackage.i0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wfo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82876Wfo extends NetworkFileFetcher implements FL7 {
    public final C82869Wfh LJLIL;
    public final Handler LJLILLLLZI;
    public final java.util.Map<String, List<InterfaceC82877Wfp>> LJLJI;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "not implemented"));
    }

    public C82876Wfo(C82869Wfh c82869Wfh) {
        this.LJLIL = c82869Wfh;
        c82869Wfh.LJI = this;
        this.LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
        this.LJLJI = new LinkedHashMap();
    }

    @Override // X.FL7
    public final void LJFF(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            onError(-1, str);
            return;
        }
        List list = (List) ((LinkedHashMap) this.LJLJI).get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC82877Wfp) it.next()).notifySuccess(str2);
            }
        }
        this.LJLJI.remove(str);
    }

    @Override // X.FL7
    public final void onError(int i, String str) {
        if (str == null || i == 0) {
            return;
        }
        List list = (List) ((LinkedHashMap) this.LJLJI).get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC82877Wfp) it.next()).notifyError(i, "download error");
            }
        }
        this.LJLJI.remove(str);
    }

    @Override // com.bytedance.ies.cutsame.resourcefetcher.NetworkFileFetcher
    public final void LJLJI(String url, String md5, C172936qX c172936qX) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(md5, "md5");
        this.LJLILLLLZI.post(new RunnableC82878Wfq(this, url, c172936qX, md5, 2));
    }
}
