package X;

import android.text.SpannableStringBuilder;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CUx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31423CUx<T> extends AbstractC25220ys {
    public final T LJFF;
    public final WeakReference<InterfaceC88472Yns<EmoteModel, C76800UCe>> LJI;
    public final WeakReference<InterfaceC65784Pro<C76800UCe>> LJII;

    @Override // X.AbstractC25220ys
    public final boolean LIZ(HashMap<String, EmoteModel> hashMap) {
        String str;
        List<EmoteWithIndex> list = (List) this.LIZLLL;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (EmoteWithIndex emoteWithIndex : list) {
            EmoteModel emoteModel = emoteWithIndex.emoteModel;
            String str2 = null;
            if (emoteModel != null) {
                str = emoteModel.emoteId;
            } else {
                str = null;
            }
            if (hashMap.containsKey(str)) {
                EmoteModel emoteModel2 = emoteWithIndex.emoteModel;
                if (emoteModel2 != null) {
                    str2 = emoteModel2.emoteId;
                }
                EmoteModel emoteModel3 = hashMap.get(str2);
                if (emoteModel3 != null && emoteModel3.emoteResource != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31423CUx(WeakReference<InterfaceC88472Yns<SpannableStringBuilder, C76800UCe>> weakReference, CQW emoteType, List<? extends EmoteWithIndex> emoteWithIndex, LifecycleOwner lifecycleOwner, T t, WeakReference<InterfaceC88472Yns<EmoteModel, C76800UCe>> weakReference2, WeakReference<InterfaceC65784Pro<C76800UCe>> weakReference3) {
        super(weakReference, emoteType, emoteWithIndex, lifecycleOwner);
        o.LJIIIZ(emoteType, "emoteType");
        o.LJIIIZ(emoteWithIndex, "emoteWithIndex");
        this.LJFF = t;
        this.LJI = weakReference2;
        this.LJII = weakReference3;
    }
}
