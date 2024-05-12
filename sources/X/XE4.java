package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* loaded from: classes16.dex */
public final class XE4 implements IFetchCategoryEffectListener {
    public final /* synthetic */ IFetchCategoryEffectListener LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ C84467XDb LJII;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LJII.LIZIZ.fetchCategoryEffect(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LIZ);
        C53717L6j.LIZ().LIZJ(this.LIZIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        this.LIZ.onSuccess(categoryPageModel);
    }

    public XE4(C84467XDb c84467XDb, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, int i, int i2, int i3, String str3) {
        this.LJII = c84467XDb;
        this.LIZ = iFetchCategoryEffectListener;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = str3;
    }
}
