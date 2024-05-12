package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CUv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31421CUv extends QXX {
    public final C31422CUw LJLIL;

    public C31421CUv(C31422CUw c31422CUw) {
        super((Object) null);
        this.LJLIL = c31422CUw;
    }

    public final List<SpannableStringBuilder> LLLLZ(List<? extends EmoteModel> emoteWithIndex, CQW emoteType, InterfaceC88472Yns<? super EmoteModel, C76800UCe> interfaceC88472Yns, LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super List<? extends SpannableStringBuilder>, C76800UCe> interfaceC88472Yns2, HashMap<String, EmoteModel> emoteModelsCacheMap) {
        EmoteModel emoteModel;
        o.LJIIIZ(emoteWithIndex, "emoteWithIndex");
        o.LJIIIZ(emoteType, "emoteType");
        o.LJIIIZ(emoteModelsCacheMap, "emoteModelsCacheMap");
        if (interfaceC88472Yns2 != null && !emoteWithIndex.isEmpty()) {
            for (EmoteModel emoteModel2 : emoteWithIndex) {
                if (!emoteModelsCacheMap.containsKey(emoteModel2.emoteId) || (emoteModel = emoteModelsCacheMap.get(emoteModel2.emoteId)) == null || emoteModel.emoteResource == null) {
                    ArrayList<C31424CUy<InterfaceC88472Yns<List<? extends SpannableStringBuilder>, C76800UCe>>> arrayList = C31418CUs.LJIIIZ;
                    if (!arrayList.isEmpty()) {
                        arrayList = C31418CUs.LJIIL;
                    }
                    arrayList.add(new C31424CUy<>(new WeakReference(interfaceC88472Yns2), emoteType, emoteWithIndex, lifecycleOwner));
                }
            }
        }
        C31425CUz c31425CUz = C31418CUs.LJI;
        int i = c31425CUz.LJLILLLLZI.get(emoteType.ordinal());
        int i2 = c31425CUz.LJLJI.get(emoteType.ordinal());
        ArrayList arrayList2 = new ArrayList();
        java.util.Map<EmoteModel, Drawable> LLLLZ = this.LJLIL.LLLLZ(emoteWithIndex, emoteType, null, lifecycleOwner, emoteModelsCacheMap);
        for (EmoteModel emoteModel3 : emoteWithIndex) {
            Drawable drawable = (Drawable) ((HashMap) LLLLZ).get(emoteModel3);
            if (drawable != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((char) 65532);
                C32206CkU c32206CkU = new C32206CkU(drawable);
                float f = i2;
                c32206CkU.LJLJJLL = f;
                float[] fArr = c32206CkU.LJLJJL;
                Arrays.fill(fArr, 0, fArr.length, f);
                c32206CkU.LJLJI = i;
                c32206CkU.LJLJJI = i;
                c32206CkU.LJLIL = i;
                c32206CkU.LJLILLLLZI = i;
                spannableStringBuilder.setSpan(c32206CkU, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new C31349CSb(drawable, interfaceC88472Yns, emoteModel3), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                arrayList2.add(spannableStringBuilder);
            }
        }
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(arrayList2);
        }
        return arrayList2;
    }
}
