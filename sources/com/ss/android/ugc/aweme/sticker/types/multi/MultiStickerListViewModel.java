package com.ss.android.ugc.aweme.sticker.types.multi;

import X.C47261Igj;
import X.C61878OQg;
import X.C78866UxK;
import X.T46;
import X.TE8;
import X.TEN;
import X.TEZ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MultiStickerListViewModel extends StickerListViewModel implements T46 {
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, X.T4I
    public final void do0(String categoryKey) {
        o.LJIIIZ(categoryKey, "categoryKey");
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.T46
    public final void CJ(Effect effect) {
        o.LJIIIZ(effect, "effect");
        List<String> children = effect.getChildren();
        if (children == null || children.isEmpty()) {
            this.LJLJJL.setValue(TEN.EMPTY);
            this.LJLILLLLZI.setValue(C61878OQg.INSTANCE);
            return;
        }
        this.LJLJJL.setValue(TEN.NONE);
        Map<String, Effect> LJIIIZ = this.LJLJLLL.LJJJJLL().LIZ().LJIIIZ();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = children.iterator();
        while (it.hasNext()) {
            Effect effect2 = LJIIIZ.get(it.next());
            if (effect2 != null) {
                arrayList.add(effect2);
            }
        }
        kv0(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final List gv0(TE8 request, int i) {
        C61878OQg c61878OQg;
        o.LJIIIZ(request, "request");
        int i2 = 0;
        if (i == 1) {
            List<Effect> value = this.LJLILLLLZI.getValue();
            Object obj = null;
            if (value != null) {
                TEZ findChildFirstNotDownload = this.LJLJLLL;
                int i3 = request.LJLILLLLZI;
                o.LJIIIZ(findChildFirstNotDownload, "$this$findChildFirstNotDownload");
                if (value.size() >= i3) {
                    if (i3 >= 0) {
                        i2 = i3;
                    }
                    int i4 = i2 + 1;
                    int size = value.size();
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        if (C78866UxK.LJJL(findChildFirstNotDownload, (Effect) ListProtector.get(value, i4))) {
                            obj = ListProtector.get(value, i4);
                            break;
                        }
                        i4++;
                    }
                }
            }
            return C47261Igj.LJJIJ(obj);
        }
        List<Effect> value2 = this.LJLILLLLZI.getValue();
        if (value2 != null) {
            TEZ findChildNextNCountNotDownload = this.LJLJLLL;
            int i5 = request.LJLILLLLZI;
            o.LJIIIZ(findChildNextNCountNotDownload, "$this$findChildNextNCountNotDownload");
            if (value2.size() < i5) {
                c61878OQg = C61878OQg.INSTANCE;
            } else if (i <= 0) {
                c61878OQg = C61878OQg.INSTANCE;
            } else {
                ArrayList arrayList = new ArrayList();
                if (i5 >= 0) {
                    i2 = i5;
                }
                int size2 = value2.size();
                for (int i6 = i2 + 1; i6 < size2; i6++) {
                    if (C78866UxK.LJJL(findChildNextNCountNotDownload, (Effect) ListProtector.get(value2, i6))) {
                        arrayList.add(ListProtector.get(value2, i6));
                        if (arrayList.size() == i) {
                            return arrayList;
                        }
                    }
                }
                return arrayList;
            }
            if (c61878OQg != null) {
                return c61878OQg;
            }
        }
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final boolean hv0(Effect effect, boolean z) {
        o.LJIIIZ(effect, "effect");
        if (!z) {
            return C78866UxK.LJJJJZI(this.LJLJLLL, effect);
        }
        return C78866UxK.LJJJJZ(this.LJLJLLL, effect);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiStickerListViewModel(androidx.lifecycle.LifecycleOwner r9, X.TEZ r10, X.InterfaceC46204IBk r11, X.THA r12) {
        /*
            r8 = this;
            X.Sqo r5 = new X.Sqo
            r2 = r10
            X.THp r0 = r2.LJJJJLL()
            X.SrB r1 = r0.LJ()
            r0 = 0
            r5.<init>(r1, r0)
            java.lang.String r0 = "lifecycleOwner"
            r1 = r9
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r6 = 0
            r7 = 32
            r0 = r8
            r4 = r12
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.types.multi.MultiStickerListViewModel.<init>(androidx.lifecycle.LifecycleOwner, X.TEZ, X.IBk, X.THA):void");
    }
}
