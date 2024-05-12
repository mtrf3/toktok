package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;

/* renamed from: X.XEk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84502XEk implements ICheckChannelListener {
    public final /* synthetic */ InterfaceC84497XEf LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ IFetchCategoryEffectListener LJII;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        InterfaceC84497XEf interfaceC84497XEf = this.LIZ;
        String str = this.LIZIZ;
        String str2 = this.LIZJ;
        C84499XEh.LIZ(this.LIZLLL, this.LJ, this.LJFF, this.LJII, interfaceC84497XEf, str, str2, this.LJI, null, true);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        C84499XEh.LIZ(this.LIZLLL, this.LJ, this.LJFF, this.LJII, this.LIZ, this.LIZIZ, this.LIZJ, this.LJI, null, !z);
        this.LIZ.LJJIIZ(this.LIZIZ);
    }

    public C84502XEk(InterfaceC84497XEf interfaceC84497XEf, String str, String str2, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        this.LIZ = interfaceC84497XEf;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = str3;
        this.LJII = iFetchCategoryEffectListener;
    }
}
