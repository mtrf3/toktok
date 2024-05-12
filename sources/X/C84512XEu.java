package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XEu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84512XEu implements IFetchCategoryEffectListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC84517XEz<ResourceItem> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        Exception exc;
        int i;
        InterfaceC84517XEz<ResourceItem> interfaceC84517XEz = this.LIZIZ;
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
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        List<Effect> arrayList;
        CategoryEffectModel category_effects;
        CategoryPageModel categoryPageModel2 = categoryPageModel;
        if (categoryPageModel2 == null || (category_effects = categoryPageModel2.getCategory_effects()) == null || (arrayList = category_effects.getCategory_effects()) == null) {
            arrayList = new ArrayList<>();
        }
        String panel = this.LIZ;
        o.LJIIIZ(panel, "panel");
        ((ConcurrentHashMap) C84286X6c.LIZ).put(panel, arrayList);
        InterfaceC84517XEz<ResourceItem> interfaceC84517XEz = this.LIZIZ;
        if (interfaceC84517XEz != null) {
            interfaceC84517XEz.onSuccess(C1296657a.LIZIZ(arrayList));
        }
    }

    public C84512XEu(String str, AnonymousClass575 anonymousClass575) {
        this.LIZ = str;
        this.LIZIZ = anonymousClass575;
    }
}
