package X;

import android.content.Context;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfBrightenFilter;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final /* synthetic */ class P3B implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ Object LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                Object obj = this.LJLILLLLZI;
                C78368UpI c78368UpI = (C78368UpI) this.LJLJI;
                List list = (List) this.LJLJJI;
                InterfaceC78395Upj interfaceC78395Upj = (InterfaceC78395Upj) this.LJLJJL;
                obj.getClass();
                C78392Upg.LIZLLL(c78368UpI, interfaceC78395Upj, list);
                return;
            default:
                FilterManager.LJIILL((FilterManager) this.LJLILLLLZI, (Context) this.LJLJI, (JSONObject) this.LJLJJI, (BmfBrightenFilter.Listener) this.LJLJJL);
                return;
        }
    }

    public /* synthetic */ P3B(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
        this.LJLJJL = obj4;
    }
}
