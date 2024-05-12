package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CUy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31424CUy<T> extends AbstractC25220ys {
    @Override // X.AbstractC25220ys
    public final boolean LIZ(HashMap<String, EmoteModel> hashMap) {
        EmoteModel emoteModel;
        List<EmoteModel> list = (List) this.LIZLLL;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (EmoteModel emoteModel2 : list) {
            if (hashMap.containsKey(emoteModel2.emoteId) && (emoteModel = hashMap.get(emoteModel2.emoteId)) != null && emoteModel.emoteResource != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31424CUy(WeakReference<T> weakReference, CQW emoteType, List<? extends EmoteModel> emoteModelList, LifecycleOwner lifecycleOwner) {
        super(weakReference, emoteType, emoteModelList, lifecycleOwner);
        o.LJIIIZ(emoteType, "emoteType");
        o.LJIIIZ(emoteModelList, "emoteModelList");
    }
}
