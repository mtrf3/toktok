package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes10.dex */
public final class L9Q extends AbstractC65781Prl implements InterfaceC88471Ynr<Integer, Integer, C76800UCe> {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ ECAsyncInflaterV2 LJLILLLLZI;
    public final /* synthetic */ LayoutInflater LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L9Q(C76732zl c76732zl, ECAsyncInflaterV2 eCAsyncInflaterV2, LayoutInflater layoutInflater) {
        super(2);
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = eCAsyncInflaterV2;
        this.LJLJI = layoutInflater;
    }

    public final void invoke(int i, int i2) {
        int intValue;
        LinkedList<SoftReference<View>> linkedList;
        Integer num;
        View view;
        this.LJLIL.element = i;
        Integer num2 = this.LJLILLLLZI.LJLJI.get(Integer.valueOf(i));
        if (num2 == null || (intValue = num2.intValue()) <= 0) {
            return;
        }
        ECAsyncInflaterV2 eCAsyncInflaterV2 = this.LJLILLLLZI;
        if (eCAsyncInflaterV2.LJLJJI) {
            return;
        }
        LinkedList<SoftReference<View>> linkedList2 = eCAsyncInflaterV2.LJLILLLLZI.get(Integer.valueOf(i));
        if (linkedList2 == null) {
            linkedList = new LinkedList<>();
            this.LJLILLLLZI.LJLILLLLZI.put(Integer.valueOf(i), linkedList);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : linkedList2) {
                if (((SoftReference) obj).get() != null) {
                    arrayList.add(obj);
                }
            }
            linkedList = new LinkedList<>(arrayList);
            this.LJLILLLLZI.LJLILLLLZI.put(Integer.valueOf(i), linkedList);
        }
        int size = linkedList.size();
        while (size < intValue) {
            ECAsyncInflaterV2 eCAsyncInflaterV22 = this.LJLILLLLZI;
            if (eCAsyncInflaterV22.LJLJJI || (num = eCAsyncInflaterV22.LJLJI.get(Integer.valueOf(i))) == null || (intValue = num.intValue()) <= 0) {
                return;
            }
            System.currentTimeMillis();
            try {
                view = C16880lQ.LLLLIILL(this.LJLJI, i, new FrameLayout(this.LJLILLLLZI.LJLIL), false);
            } catch (Exception unused) {
                C78983UzD.LJIILL("ECAsyncInflaterV2 inflate crash");
                view = null;
            }
            if (L9O.LIZIZ()) {
                this.LJLILLLLZI.LJLIL.getResources().getResourceName(i);
            }
            synchronized (linkedList) {
                if (view != null) {
                    linkedList.offer(new SoftReference<>(view));
                }
                size++;
            }
        }
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return C76800UCe.LIZ;
    }
}
