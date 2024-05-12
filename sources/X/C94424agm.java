package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.agm, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94424agm implements IFetchEffectListListener {
    public final /* synthetic */ XJL LIZ;

    public C94424agm(XKS xks) {
        this.LIZ = xks;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        XJL xjl = this.LIZ;
        C3C5.m7constructorimpl(null);
        xjl.resumeWith(null);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        List<Effect> response = list;
        o.LJIIIZ(response, "response");
        if (!response.isEmpty()) {
            XJL xjl = this.LIZ;
            String unzipPath = ((com.ss.ugc.effectplatform.model.Effect) ListProtector.get(response, 0)).getUnzipPath();
            C3C5.m7constructorimpl(unzipPath);
            xjl.resumeWith(unzipPath);
            return;
        }
        XJL xjl2 = this.LIZ;
        C3C5.m7constructorimpl(null);
        xjl2.resumeWith(null);
    }
}
