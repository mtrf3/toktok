package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XEx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84515XEx implements IFetchPanelInfoListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C84513XEv LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        Exception exc;
        int i;
        InterfaceC84517XEz<C1288653y> interfaceC84517XEz = this.LIZIZ.LIZJ;
        if (interfaceC84517XEz != null) {
            if (exceptionResult != null) {
                exc = exceptionResult.getException();
                i = exceptionResult.getErrorCode();
            } else {
                exc = null;
                i = -1;
            }
            interfaceC84517XEz.LIZ(new C57M(exc, i));
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel panelInfoModel) {
        List<EffectCategoryModel> arrayList;
        PanelInfoModel panelInfoModel2 = panelInfoModel;
        if (panelInfoModel2 == null || (arrayList = panelInfoModel2.getCategory_list()) == null) {
            arrayList = new ArrayList<>();
        }
        String panel = this.LIZ;
        o.LJIIIZ(panel, "panel");
        ((ConcurrentHashMap) C84286X6c.LIZIZ).put(panel, arrayList);
        InterfaceC84517XEz<C1288653y> interfaceC84517XEz = this.LIZIZ.LIZJ;
        if (interfaceC84517XEz != null) {
            interfaceC84517XEz.onSuccess(C1296657a.LIZ(arrayList));
        }
    }

    public C84515XEx(String str, C84513XEv c84513XEv) {
        this.LIZ = str;
        this.LIZIZ = c84513XEv;
    }
}
