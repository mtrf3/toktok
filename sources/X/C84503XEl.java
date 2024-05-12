package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XEl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84503XEl implements IFetchPanelInfoListener {
    public final /* synthetic */ InterfaceC84497XEf LIZ;
    public final /* synthetic */ IFetchPanelInfoListener LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ int LJI;
    public final /* synthetic */ boolean LJII = false;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.LJIILL(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, !this.LJII, this.LIZIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel response) {
        o.LJIIIZ(response, "response");
        this.LIZIZ.onSuccess(response);
    }

    public C84503XEl(int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener, InterfaceC84497XEf interfaceC84497XEf, String str, String str2, boolean z) {
        this.LIZ = interfaceC84497XEf;
        this.LIZIZ = iFetchPanelInfoListener;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = str2;
        this.LJFF = i;
        this.LJI = i2;
    }
}
