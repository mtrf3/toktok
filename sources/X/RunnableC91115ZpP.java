package X;

import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectViewModel;

/* renamed from: X.ZpP, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class RunnableC91115ZpP implements Runnable {
    public final /* synthetic */ CollectAssem LJLIL;
    public final /* synthetic */ InterfaceC91296ZsK LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;

    public RunnableC91115ZpP(CollectAssem collectAssem, InterfaceC91296ZsK interfaceC91296ZsK, boolean z, String str) {
        this.LJLIL = collectAssem;
        this.LJLILLLLZI = interfaceC91296ZsK;
        this.LJLJI = z;
        this.LJLJJI = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        int i;
        try {
            CollectViewModel e4 = this.LJLIL.e4();
            InterfaceC91296ZsK interfaceC91296ZsK = this.LJLILLLLZI;
            if (this.LJLJI) {
                i = 1;
            } else {
                i = 2;
            }
            e4.gv0(interfaceC91296ZsK, i, this.LJLJJI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
