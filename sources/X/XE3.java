package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;

/* loaded from: classes16.dex */
public final class XE3 implements ICheckChannelListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL = 0;
    public final /* synthetic */ int LJ = 0;
    public final /* synthetic */ IFetchPanelInfoListener LJFF;
    public final /* synthetic */ C84467XDb LJI;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        this.LJI.LIZLLL(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        if (z) {
            this.LJI.LIZJ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
            C53717L6j.LIZ().LIZJ(this.LIZ);
        } else {
            this.LJI.LIZLLL(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
        }
    }

    public XE3(C84467XDb c84467XDb, String str, boolean z, String str2, C83746Wtq c83746Wtq) {
        this.LJI = c84467XDb;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LJFF = c83746Wtq;
    }
}
