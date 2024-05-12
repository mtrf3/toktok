package X;

import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5M0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5M0 extends AbstractC65781Prl implements InterfaceC88472Yns<C5M2, C76800UCe> {
    public final /* synthetic */ C5OO LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5M0(C5OO c5oo) {
        super(1);
        this.LJLIL = c5oo;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C5M2 c5m2) {
        String key;
        C5CP second;
        C5CP second2;
        C5M2 it = c5m2;
        o.LJIIIZ(it, "it");
        EffectCategoryResponse effectCategoryResponse = it.LIZIZ;
        if (effectCategoryResponse != null && (key = effectCategoryResponse.getKey()) != null) {
            C5O8 c5o8 = this.LJLIL.LLFZ;
            if (c5o8 != null) {
                if (c5o8.LJLLJ || C164996dj.LIZJ(key)) {
                    boolean LIZJ = C164996dj.LIZJ(key);
                    c5o8.LJLLJ = LIZJ;
                    if (LIZJ) {
                        Iterator it2 = ((LinkedHashMap) c5o8.LJLJJL).values().iterator();
                        while (it2.hasNext()) {
                            ((View) it2.next()).setVisibility(8);
                        }
                        OSZ<? extends NLETrackSlot, C5CP> osz = c5o8.LJLJJLL;
                        if (osz != null && (second2 = osz.getSecond()) != null) {
                            second2.setVisibility(0);
                        }
                    } else {
                        Iterator it3 = ((LinkedHashMap) c5o8.LJLJJL).values().iterator();
                        while (it3.hasNext()) {
                            ((View) it3.next()).setVisibility(0);
                        }
                        OSZ<? extends NLETrackSlot, C5CP> osz2 = c5o8.LJLJJLL;
                        if (osz2 != null && (second = osz2.getSecond()) != null) {
                            second.setVisibility(8);
                        }
                    }
                    C5OE c5oe = c5o8.LJLILLLLZI;
                    if (c5oe != null) {
                        c5oe.LIZLLL(null);
                    }
                    c5o8.requestLayout();
                }
            } else {
                o.LJIJI("singleTrackView");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
