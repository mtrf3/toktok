package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.61Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61Y extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<Integer, ? extends MutableLiveData<ImageUrlModel>>> {
    public static final C61Y LJLIL = new C61Y();

    public C61Y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<Integer, ? extends MutableLiveData<ImageUrlModel>> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> it = C1536461g.LJII.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Integer.valueOf(it.next().intValue()), new MutableLiveData());
        }
        return C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap);
    }
}
