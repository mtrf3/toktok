package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Of0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62442Of0 implements Comparator<InterfaceC62486Ofi> {
    public static final List<String> LJLJI;
    public final int LJLIL = 1000;
    public final List<ShareItemOrderBean> LJLILLLLZI = C62444Of2.LIZ();

    static {
        ArrayList arrayList;
        List LIZ = C62444Of2.LIZ();
        if (LIZ != null) {
            arrayList = new ArrayList(C32I.LJJL(LIZ, 10));
            Iterator it = LIZ.iterator();
            while (it.hasNext()) {
                arrayList.add(((ShareItemOrderBean) it.next()).actionId);
            }
        } else {
            arrayList = new ArrayList();
        }
        LJLJI = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(InterfaceC62486Ofi interfaceC62486Ofi, InterfaceC62486Ofi interfaceC62486Ofi2) {
        InterfaceC62486Ofi interfaceC62486Ofi3 = interfaceC62486Ofi;
        InterfaceC62486Ofi interfaceC62486Ofi4 = interfaceC62486Ofi2;
        if (interfaceC62486Ofi3 == null) {
            return -1;
        }
        if (interfaceC62486Ofi4 == null) {
            return 1;
        }
        List<ShareItemOrderBean> list = this.LJLILLLLZI;
        int i = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        String key = interfaceC62486Ofi3.key();
        List<ShareItemOrderBean> list2 = this.LJLILLLLZI;
        int size = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (TextUtils.equals(((ShareItemOrderBean) ListProtector.get(list2, i2)).actionId, key)) {
                    break;
                }
                i2++;
            } else {
                i2 = this.LJLIL;
                break;
            }
        }
        String key2 = interfaceC62486Ofi4.key();
        List<ShareItemOrderBean> list3 = this.LJLILLLLZI;
        int size2 = list3.size();
        while (true) {
            if (i < size2) {
                if (TextUtils.equals(((ShareItemOrderBean) ListProtector.get(list3, i)).actionId, key2)) {
                    break;
                }
                i++;
            } else {
                i = this.LJLIL;
                break;
            }
        }
        return i2 - i;
    }
}
