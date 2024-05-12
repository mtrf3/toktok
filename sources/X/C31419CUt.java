package X;

import Y.IDComparatorS33S0000000_5;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.CUt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31419CUt extends QXX {
    public final C31421CUv LJLIL;

    public C31419CUt(C31421CUv c31421CUv) {
        super((Object) null);
        this.LJLIL = c31421CUv;
    }

    public final SpannableStringBuilder LLLLZ(List<? extends EmoteWithIndex> list, CQW emoteType, String content, InterfaceC88472Yns<? super EmoteModel, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super SpannableStringBuilder, C76800UCe> interfaceC88472Yns2, boolean z, LifecycleOwner lifecycleOwner, HashMap<String, EmoteModel> emoteModelsCacheMap, boolean z2) {
        int i;
        char c;
        String str;
        ArrayList<C31423CUx<String>> arrayList;
        o.LJIIIZ(emoteType, "emoteType");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(emoteModelsCacheMap, "emoteModelsCacheMap");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(content);
        if (list != null && !list.isEmpty()) {
            if (interfaceC88472Yns2 != null && !list.isEmpty()) {
                for (EmoteWithIndex emoteWithIndex : list) {
                    EmoteModel emoteModel = emoteWithIndex.emoteModel;
                    String str2 = null;
                    if (emoteModel != null) {
                        str = emoteModel.emoteId;
                    } else {
                        str = null;
                    }
                    if (emoteModelsCacheMap.containsKey(str)) {
                        EmoteModel emoteModel2 = emoteWithIndex.emoteModel;
                        if (emoteModel2 != null) {
                            str2 = emoteModel2.emoteId;
                        }
                        EmoteModel emoteModel3 = emoteModelsCacheMap.get(str2);
                        if (emoteModel3 != null && emoteModel3.emoteResource != null) {
                        }
                    }
                    if (!z) {
                        arrayList = C31418CUs.LJII;
                    } else {
                        arrayList = C31418CUs.LJIIJ;
                    }
                    arrayList.add(new C31423CUx<>(new WeakReference(interfaceC88472Yns2), emoteType, list, lifecycleOwner, content, new WeakReference(interfaceC88472Yns), new WeakReference(interfaceC65784Pro)));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (EmoteWithIndex emoteWithIndex2 : list) {
                if (emoteWithIndex2.emoteModel != null) {
                    arrayList2.add(emoteWithIndex2);
                }
            }
            List<EmoteWithIndex> LLILII = ORZ.LLILII(new IDComparatorS33S0000000_5(12), arrayList2);
            C31421CUv c31421CUv = this.LJLIL;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = LLILII.iterator();
            while (it.hasNext()) {
                EmoteModel emoteModel4 = ((EmoteWithIndex) it.next()).emoteModel;
                if (emoteModel4 != null) {
                    arrayList3.add(emoteModel4);
                }
            }
            List<SpannableStringBuilder> LLLLZ = c31421CUv.LLLLZ(arrayList3, emoteType, interfaceC88472Yns, lifecycleOwner, null, emoteModelsCacheMap);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            o.LJIIIIZZ(characterInstance, "getCharacterInstance()");
            characterInstance.setText(content);
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (EmoteWithIndex emoteWithIndex3 : LLILII) {
                int next = characterInstance.next((emoteWithIndex3.index - i2) - i3);
                if (next == -1) {
                    break;
                }
                linkedHashMap.put(emoteWithIndex3, Integer.valueOf(next + i4));
                i2 = emoteWithIndex3.index;
                i3 = 1;
                i4++;
            }
            int i5 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((Number) entry.getValue()).intValue() >= 0 && ((Number) entry.getValue()).intValue() <= spannableStringBuilder.length()) {
                    spannableStringBuilder.insert(((Number) entry.getValue()).intValue(), (CharSequence) ListProtector.get(LLLLZ, i5));
                    i5++;
                }
            }
        }
        if (spannableStringBuilder.length() > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (C31418CUs.LIZIZ) {
                c = 8207;
            } else {
                c = 8206;
            }
            spannableStringBuilder2.append(c);
            i = 0;
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        } else {
            i = 0;
        }
        if (interfaceC65784Pro != null) {
            spannableStringBuilder.setSpan(new CV0(interfaceC65784Pro), i, spannableStringBuilder.length(), 33);
        }
        if (z2 && interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }
}
