package X;

import Y.ARunnableS14S0100100_6;
import com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;

/* renamed from: X.Ewf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38057Ewf implements F67 {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ JsBridge2InitTask LJLILLLLZI;

    @Override // X.F67
    public final void onChanged() {
        C38995FSd.LIZJ().execute(new ARunnableS14S0100100_6(this.LJLIL, this, 2));
    }

    public C38057Ewf(JsBridge2InitTask jsBridge2InitTask, long j) {
        this.LJLILLLLZI = jsBridge2InitTask;
        this.LJLIL = j;
    }
}
