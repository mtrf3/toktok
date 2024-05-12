package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class G81<V> implements Callable {
    public final /* synthetic */ H8E LJLIL;
    public final /* synthetic */ C145995oB LJLILLLLZI;
    public final /* synthetic */ VideoPublishEditModel LJLJI;
    public final /* synthetic */ G6F LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<C145995oB, C76800UCe> LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    public G81(H8E h8e, C145995oB c145995oB, VideoPublishEditModel videoPublishEditModel, G6F g6f, boolean z, boolean z2, InterfaceC88472Yns<? super C145995oB, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = h8e;
        this.LJLILLLLZI = c145995oB;
        this.LJLJI = videoPublishEditModel;
        this.LJLJJI = g6f;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = interfaceC88472Yns;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        H8E h8e = this.LJLIL;
        C145995oB c145995oB = this.LJLILLLLZI;
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        G6F g6f = this.LJLJJI;
        boolean z = this.LJLJJL;
        boolean z2 = this.LJLJJLL;
        InterfaceC88472Yns<C145995oB, C76800UCe> interfaceC88472Yns = this.LJLJL;
        h8e.getClass();
        H8E.LJIIIZ(c145995oB, videoPublishEditModel, g6f, z, z2, interfaceC88472Yns);
        return C76800UCe.LIZ;
    }
}
