package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;

/* renamed from: X.XEi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84500XEi implements ICheckChannelListener {
    public final /* synthetic */ InterfaceC84497XEf LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ IFetchPanelInfoListener LJI;
    public final /* synthetic */ boolean LJII;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        this.LIZ.LJJJJJ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, true, this.LJII, this.LJI);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        InterfaceC84497XEf interfaceC84497XEf = this.LIZ;
        String str = this.LIZIZ;
        boolean z2 = this.LIZJ;
        C84499XEh.LJIIIIZZ(this.LJ, this.LJFF, this.LJI, interfaceC84497XEf, str, this.LIZLLL, z2, !z, this.LJII);
        this.LIZ.LJJIIZ(this.LIZIZ);
    }

    public C84500XEi(int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener, InterfaceC84497XEf interfaceC84497XEf, String str, String str2, boolean z, boolean z2) {
        this.LIZ = interfaceC84497XEf;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = iFetchPanelInfoListener;
        this.LJII = z2;
    }
}
