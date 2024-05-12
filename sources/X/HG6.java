package X;

import Y.AObjectS52S0101000_7;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class HG6<V> implements Callable {
    public final /* synthetic */ OSZ<Integer, String> LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC43755HFf LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    public HG6(OSZ osz, VideoPublishEditModel videoPublishEditModel, C41778GaU c41778GaU, boolean z, AObjectS52S0101000_7 aObjectS52S0101000_7) {
        this.LJLIL = osz;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = c41778GaU;
        this.LJLJJI = z;
        this.LJLJJL = aObjectS52S0101000_7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int intValue;
        String str;
        OSZ<Integer, String> osz = this.LJLIL;
        if (osz != null && (intValue = osz.getFirst().intValue()) != -1) {
            Object obj = this.LJLILLLLZI;
            InterfaceC43755HFf interfaceC43755HFf = this.LJLJI;
            boolean z = this.LJLJJI;
            OSZ<Integer, String> osz2 = this.LJLIL;
            if (osz2 == null || (str = osz2.getSecond()) == null) {
                str = "";
            }
            C43753HFd.LJ(obj, interfaceC43755HFf, z, intValue, str, true);
        }
        this.LJLJJL.invoke();
        return C76800UCe.LIZ;
    }
}
