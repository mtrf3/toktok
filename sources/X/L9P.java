package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public final class L9P extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ ECAsyncInflaterV2 LJLIL;
    public final /* synthetic */ L90 LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ LayoutInflater LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L9P(ECAsyncInflaterV2 eCAsyncInflaterV2, L90 l90, C76732zl c76732zl, LayoutInflater layoutInflater) {
        super(0);
        this.LJLIL = eCAsyncInflaterV2;
        this.LJLILLLLZI = l90;
        this.LJLJI = c76732zl;
        this.LJLJJI = layoutInflater;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (!this.LJLIL.LJLIL.isFinishing()) {
            try {
                this.LJLILLLLZI.LIZ(new L9Q(this.LJLJI, this.LJLIL, this.LJLJJI));
                if (L9O.LIZIZ()) {
                    Iterator<Map.Entry<Integer, LinkedList<SoftReference<View>>>> it = this.LJLIL.LJLILLLLZI.entrySet().iterator();
                    while (it.hasNext()) {
                        LinkedList<SoftReference<View>> value = it.next().getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : value) {
                            if (((SoftReference) obj).get() != null) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList.size();
                    }
                }
                ECAsyncInflaterV2 eCAsyncInflaterV2 = this.LJLIL;
                L90 l90 = this.LJLILLLLZI;
                ConcurrentHashMap<Context, ECAsyncInflaterV2> concurrentHashMap = ECAsyncInflaterV2.LJLJJLL;
                ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>> concurrentHashMap2 = eCAsyncInflaterV2.LJLILLLLZI;
                L9R l9r = eCAsyncInflaterV2.LJLJJL;
                if (l9r != null) {
                    C37190Eig.LIZ.removeCallbacks(l9r);
                }
                L9R l9r2 = new L9R(l90, eCAsyncInflaterV2.LJLIL, concurrentHashMap, concurrentHashMap2);
                eCAsyncInflaterV2.LJLJJL = l9r2;
                C37190Eig.LIZ.postDelayed(l9r2, 30000L);
            } catch (Exception e) {
                if (this.LJLJI.element != 0) {
                    String resourceName = this.LJLIL.LJLIL.getResources().getResourceName(this.LJLJI.element);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("ECAsyncInflaterV2 inflate ");
                    LIZ.append(resourceName);
                    LIZ.append(" failed");
                    C78983UzD.LJIJ(e, X1D.LIZIZ(LIZ));
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
