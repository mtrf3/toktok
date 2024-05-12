package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ttve.model.VEFrame;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS77S0400000_7;
import kotlin.jvm.internal.AqS96S0300000_7;

/* renamed from: X.HkO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC44940HkO<V> implements Callable {
    public final /* synthetic */ List<IB3> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C68322mC<int[]> LJLJI;
    public final /* synthetic */ C83489Wph LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ List<VEFrame> LJLJJLL;
    public final /* synthetic */ InterfaceC88471Ynr<IBJ, List<? extends VEFrame>, C76800UCe> LJLJL;

    public CallableC44940HkO(List list, boolean z, C68322mC c68322mC, C83489Wph c83489Wph, Context context, List list2, AqS77S0400000_7 aqS77S0400000_7) {
        this.LJLIL = list;
        this.LJLILLLLZI = z;
        this.LJLJI = c68322mC;
        this.LJLJJI = c83489Wph;
        this.LJLJJL = context;
        this.LJLJJLL = list2;
        this.LJLJL = aqS77S0400000_7;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [int[], T] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bitmap LJFF;
        VEFrame createByteBufferFrame;
        try {
            List<IB3> list = this.LJLIL;
            boolean z = this.LJLILLLLZI;
            C68322mC<int[]> c68322mC = this.LJLJI;
            C83489Wph c83489Wph = this.LJLJJI;
            Context context = this.LJLJJL;
            List<VEFrame> list2 = this.LJLJJLL;
            for (IB3 ib3 : list) {
                if (z) {
                    int defaultHeight = c83489Wph.LJ.getPl().getDefaultHeight();
                    int defaultWidth = c83489Wph.LJ.getPl().getDefaultWidth();
                    String str = ib3.LJLILLLLZI;
                    int[] iArr = c68322mC.element;
                    C41944GdA.LIZ(z, defaultHeight, defaultWidth, context, str, iArr);
                    c68322mC.element = iArr;
                }
                String str2 = ib3.LJLILLLLZI;
                int[] iArr2 = c68322mC.element;
                int i = iArr2[0];
                int i2 = iArr2[1];
                if (!C44687HgJ.LIZIZ(str2)) {
                    LJFF = null;
                } else {
                    LJFF = C42307Gj1.LJFF(i, i2, C173926s8.LIZ(str2), 4, str2);
                    if (LJFF != null && (createByteBufferFrame = VEFrame.createByteBufferFrame(LJFF, System.currentTimeMillis())) != null) {
                        list2.add(createByteBufferFrame);
                    }
                }
                C42299Git.LJ(LJFF);
            }
            C43045Guv.LIZLLL(new AqS96S0300000_7((List) this.LJLIL, (List<IB3>) this.LJLJJLL, (List<VEFrame>) this.LJLJL, (InterfaceC88471Ynr<? super IBJ, ? super List<? extends VEFrame>, C76800UCe>) 29), 0L);
        } catch (Exception unused) {
            C43045Guv.LIZLLL(new AqS154S0200000_7(this.LJLJJLL, this.LJLJL, 135), 0L);
        }
        return C76800UCe.LIZ;
    }
}
