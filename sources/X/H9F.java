package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* loaded from: classes8.dex */
public final class H9F implements IFetchEffectListListener {
    public final /* synthetic */ H9E LIZ;

    public H9F(H9E h9e) {
        this.LIZ = h9e;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        H9E h9e = this.LIZ;
        h9e.LJLJI[0] = false;
        C135115Rz.LIZ(h9e.LJLJJI[0]);
        C44018HPi.LJII(1503, false);
        if (exceptionResult == null) {
            return;
        }
        C16880lQ.LLLLIIL(exceptionResult.getException());
        this.LIZ.LJLJJL.LIZLLL(exceptionResult.getException());
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        List<Effect> list2 = list;
        H9E h9e = this.LIZ;
        h9e.LJLJI[0] = false;
        C135115Rz.LIZ(h9e.LJLJJI[0]);
        C44018HPi.LJII(1503, false);
        if (list2 != null && list2.size() > 0 && ListProtector.get(list2, 0) != null) {
            com.ss.ugc.effectplatform.model.Effect effect = (com.ss.ugc.effectplatform.model.Effect) ListProtector.get(list2, 0);
            this.LIZ.LJLJJLL.putParcelable("first_sticker", effect);
            if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
                String LIZIZ = H9H.LIZIZ((String) ListProtector.get(effect.getMusic(), 0));
                if (!TextUtils.isEmpty(LIZIZ)) {
                    this.LIZ.LJLJJLL.putString("path", LIZIZ);
                }
            }
            H9E h9e2 = this.LIZ;
            h9e2.LJLJJL.LJ(h9e2.LJLJJLL);
        }
    }
}
