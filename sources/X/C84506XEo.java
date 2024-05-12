package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* renamed from: X.XEo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84506XEo implements IFetchCategoryEffectListener {
    public final /* synthetic */ InterfaceC84497XEf LIZ;
    public final /* synthetic */ IFetchCategoryEffectListener LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ int LJI;
    public final /* synthetic */ String LJII;
    public final /* synthetic */ boolean LJIIIIZZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.fetchCategoryEffect(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, !this.LJIIIIZZ, this.LIZIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        this.LIZIZ.onSuccess(categoryPageModel);
    }

    public C84506XEo(InterfaceC84497XEf interfaceC84497XEf, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, int i, int i2, int i3, String str3, boolean z) {
        this.LIZ = interfaceC84497XEf;
        this.LIZIZ = iFetchCategoryEffectListener;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = str3;
        this.LJIIIIZZ = z;
    }
}
