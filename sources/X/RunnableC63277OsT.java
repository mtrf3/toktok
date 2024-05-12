package X;

import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.OsT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC63277OsT implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ C63217OrV LJLJL;

    public final void LIZ() {
        this.LJLJL.LIZJ = C63217OrV.LJIJJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJL, this.LJLIL, this.LJLJJI, this.LJLJJLL);
        C63480Ovk c63480Ovk = new C63480Ovk();
        c63480Ovk.LIZLLL = this.LJLILLLLZI;
        c63480Ovk.LJ = Long.valueOf(this.LJLJI);
        c63480Ovk.LJFF = Integer.valueOf(this.LJLJJI);
        GetConversationInfoV2RequestBody build = c63480Ovk.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJIJ = build;
        this.LJLJL.LJIIJJI(this.LJLIL, c89453Z8v.build(), null, this.LJLILLLLZI, Long.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL));
        ((CopyOnWriteArraySet) C63269OsL.LIZIZ).add(this.LJLILLLLZI);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC63277OsT(C63217OrV c63217OrV, int i, String str, long j, int i2, long j2, int i3) {
        this.LJLJL = c63217OrV;
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = i2;
        this.LJLJJL = j2;
        this.LJLJJLL = i3;
    }
}
