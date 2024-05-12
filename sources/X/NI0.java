package X;

import android.util.SparseArray;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;

/* loaded from: classes11.dex */
public final class NI0 extends AbstractC65781Prl implements InterfaceC65784Pro<SparseArray<InterfaceC1803976d>> {
    public static final NI0 LJLIL = new NI0();

    public NI0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SparseArray<InterfaceC1803976d> invoke() {
        SparseArray<InterfaceC1803976d> sparseArray = new SparseArray<>();
        sparseArray.put(4, new C59130NIo());
        sparseArray.put(5, new AdCommentDependImpl());
        sparseArray.put(17, new NOW());
        sparseArray.put(19, new NI1());
        return sparseArray;
    }
}
