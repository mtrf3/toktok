package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CUu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31420CUu extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends EmoteModel>, C76800UCe> {
    public static final C31420CUu LJLIL = new C31420CUu();

    public C31420CUu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends EmoteModel> list) {
        List<? extends EmoteModel> emoteModels = list;
        o.LJIIIZ(emoteModels, "emoteModels");
        for (EmoteModel emoteModel : emoteModels) {
            HashMap<String, EmoteModel> hashMap = C31418CUs.LJFF;
            String str = emoteModel.emoteId;
            o.LJIIIIZZ(str, "it.emoteId");
            hashMap.put(str, emoteModel);
        }
        C31419CUt c31419CUt = C31418CUs.LJIILLIIL;
        HashMap<String, EmoteModel> emoteModelsCacheMap = C31418CUs.LJFF;
        c31419CUt.getClass();
        o.LJIIIZ(emoteModelsCacheMap, "emoteModelsCacheMap");
        Iterator<C31423CUx<String>> it = C31418CUs.LJII.iterator();
        while (it.hasNext()) {
            C31423CUx<String> next = it.next();
            next.LIZLLL(emoteModelsCacheMap, new AqS94S0300000_5((C31423CUx) next, (C31423CUx<String>) c31419CUt, (C31419CUt) emoteModelsCacheMap, (HashMap<String, EmoteModel>) 21), new AqS155S0100000_5(next, (C31423CUx<String>) 432));
        }
        ArrayList<C31423CUx<String>> arrayList = C31418CUs.LJII;
        arrayList.clear();
        ArrayList<C31423CUx<String>> arrayList2 = C31418CUs.LJIIJ;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        C31421CUv c31421CUv = C31418CUs.LJIILL;
        HashMap<String, EmoteModel> emoteModelsCacheMap2 = C31418CUs.LJFF;
        c31421CUv.getClass();
        o.LJIIIZ(emoteModelsCacheMap2, "emoteModelsCacheMap");
        Iterator<C31424CUy<InterfaceC88472Yns<List<? extends SpannableStringBuilder>, C76800UCe>>> it2 = C31418CUs.LJIIIZ.iterator();
        while (it2.hasNext()) {
            C31424CUy<InterfaceC88472Yns<List<? extends SpannableStringBuilder>, C76800UCe>> next2 = it2.next();
            next2.LIZLLL(emoteModelsCacheMap2, new AqS94S0300000_5((C31424CUy) next2, (C31424CUy<InterfaceC88472Yns<List<? extends SpannableStringBuilder>, C76800UCe>>) c31421CUv, (C31421CUv) emoteModelsCacheMap2, (HashMap<String, EmoteModel>) 20), new AqS155S0100000_5(next2, (C31424CUy<InterfaceC88472Yns<java.util.Map<EmoteModel, ? extends Drawable>, C76800UCe>>) 431));
        }
        ArrayList<C31424CUy<InterfaceC88472Yns<List<? extends SpannableStringBuilder>, C76800UCe>>> arrayList3 = C31418CUs.LJIIIZ;
        arrayList3.clear();
        ArrayList<C31424CUy<InterfaceC88472Yns<List<? extends SpannableStringBuilder>, C76800UCe>>> arrayList4 = C31418CUs.LJIIL;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        C31422CUw c31422CUw = C31418CUs.LJIILJJIL;
        HashMap<String, EmoteModel> emoteModelsCacheMap3 = C31418CUs.LJFF;
        c31422CUw.getClass();
        o.LJIIIZ(emoteModelsCacheMap3, "emoteModelsCacheMap");
        Iterator<C31424CUy<InterfaceC88472Yns<java.util.Map<EmoteModel, ? extends Drawable>, C76800UCe>>> it3 = C31418CUs.LJIIIIZZ.iterator();
        while (it3.hasNext()) {
            C31424CUy<InterfaceC88472Yns<java.util.Map<EmoteModel, ? extends Drawable>, C76800UCe>> next3 = it3.next();
            next3.LIZLLL(emoteModelsCacheMap3, new AqS94S0300000_5((C31424CUy) next3, (C31424CUy<InterfaceC88472Yns<java.util.Map<EmoteModel, ? extends Drawable>, C76800UCe>>) c31422CUw, (C31422CUw) emoteModelsCacheMap3, (HashMap<String, EmoteModel>) 19), new AqS155S0100000_5(next3, (C31424CUy<InterfaceC88472Yns<java.util.Map<EmoteModel, ? extends Drawable>, C76800UCe>>) 430));
        }
        ArrayList<C31424CUy<InterfaceC88472Yns<java.util.Map<EmoteModel, ? extends Drawable>, C76800UCe>>> arrayList5 = C31418CUs.LJIIIIZZ;
        arrayList5.clear();
        ArrayList<C31424CUy<InterfaceC88472Yns<java.util.Map<EmoteModel, ? extends Drawable>, C76800UCe>>> arrayList6 = C31418CUs.LJIIJJI;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        return C76800UCe.LIZ;
    }
}
