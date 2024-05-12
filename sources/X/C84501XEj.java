package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;

/* renamed from: X.XEj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84501XEj implements ICheckChannelListener {
    public final /* synthetic */ InterfaceC84497XEf LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ IFetchCategoryEffectListener LJII;
    public final /* synthetic */ java.util.Map LJIIIIZZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        this.LIZ.LJJIJ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, true, this.LJII, this.LJIIIIZZ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        C84499XEh.LIZ(this.LIZLLL, this.LJ, this.LJFF, this.LJII, this.LIZ, this.LIZIZ, this.LIZJ, this.LJI, this.LJIIIIZZ, !z);
        this.LIZ.LJJIIZ(this.LIZJ);
    }

    public C84501XEj(InterfaceC84497XEf interfaceC84497XEf, String str, String str2, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener, java.util.Map map) {
        this.LIZ = interfaceC84497XEf;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = str3;
        this.LJII = iFetchCategoryEffectListener;
        this.LJIIIIZZ = map;
    }
}
