package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.CUw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31422CUw extends QXX {
    public final C78866UxK LJLIL;

    public C31422CUw(C78866UxK c78866UxK) {
        super((Object) null);
        this.LJLIL = c78866UxK;
    }

    public final java.util.Map<EmoteModel, Drawable> LLLLZ(List<? extends EmoteModel> emoteModels, CQW emoteType, InterfaceC88472Yns<? super java.util.Map<EmoteModel, ? extends Drawable>, C76800UCe> interfaceC88472Yns, LifecycleOwner lifecycleOwner, HashMap<String, EmoteModel> emoteModelsCacheMap) {
        Drawable newDrawable;
        EmoteModel emoteModel;
        o.LJIIIZ(emoteModels, "emoteModels");
        o.LJIIIZ(emoteType, "emoteType");
        o.LJIIIZ(emoteModelsCacheMap, "emoteModelsCacheMap");
        if (interfaceC88472Yns != null && !emoteModels.isEmpty()) {
            for (EmoteModel emoteModel2 : emoteModels) {
                if (!emoteModelsCacheMap.containsKey(emoteModel2.emoteId) || (emoteModel = emoteModelsCacheMap.get(emoteModel2.emoteId)) == null || emoteModel.emoteResource == null) {
                    ArrayList<C31424CUy<InterfaceC88472Yns<java.util.Map<EmoteModel, ? extends Drawable>, C76800UCe>>> arrayList = C31418CUs.LJIIIIZZ;
                    if (!arrayList.isEmpty()) {
                        arrayList = C31418CUs.LJIIJJI;
                    }
                    arrayList.add(new C31424CUy<>(new WeakReference(interfaceC88472Yns), emoteType, emoteModels, lifecycleOwner));
                }
            }
        }
        int i = C31418CUs.LJI.LJLIL.get(emoteType.ordinal());
        HashMap hashMap = new HashMap();
        this.LJLIL.getClass();
        for (Map.Entry entry : C78866UxK.LJJLI(emoteModels, emoteType, emoteModelsCacheMap, false).entrySet()) {
            Drawable.ConstantState constantState = ((Drawable) entry.getValue()).mutate().getConstantState();
            if (constantState != null && (newDrawable = constantState.newDrawable()) != null) {
                newDrawable.setBounds(0, 0, i, i);
                hashMap.put(entry.getKey(), newDrawable);
                if (entry.getValue() instanceof GradientDrawable) {
                    C31418CUs.LJ.put(emoteType, newDrawable);
                }
            }
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(hashMap);
        }
        return hashMap;
    }
}
