package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.52U, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52U extends AbstractC65781Prl implements InterfaceC88477Ynx<NLEModel, FrameLayout, java.util.Map<String, View>, Long, Float, Float, Float, C76800UCe> {
    public final /* synthetic */ C51W LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52U(C51W c51w) {
        super(7);
        this.LJLIL = c51w;
    }

    @Override // X.InterfaceC88477Ynx
    public final C76800UCe LJJIL(NLEModel nLEModel, FrameLayout frameLayout, java.util.Map<String, View> map, Long l, Float f, Float f2, Float f3) {
        FrameLayout frameLayout2 = frameLayout;
        java.util.Map<String, View> viewMap = map;
        long longValue = l.longValue();
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        float floatValue3 = f3.floatValue();
        o.LJIIIZ(frameLayout2, "frameLayout");
        o.LJIIIZ(viewMap, "viewMap");
        List<NLETrackSlot> LJFF = C5FC.LJFF(nLEModel);
        C51W c51w = this.LJLIL;
        for (NLETrackSlot slot : LJFF) {
            C1551667c LIZJ = C5FC.LIZJ(c51w.getActivity());
            if (LIZJ != null) {
                int editPageTextLayoutWidth = c51w.LJLIL.getEditPageTextLayoutWidth();
                c51w.LJLIL.getEditPageTextLayoutWidth();
                o.LJIIIZ(slot, "slot");
                C6QQ.LIZ(new C132015Gb(LIZJ, longValue, slot, floatValue3, floatValue, editPageTextLayoutWidth, floatValue2));
                String uuid = slot.getUUID();
                o.LJIIIIZZ(uuid, "it.uuid");
                viewMap.put(uuid, LIZJ);
                frameLayout2.addView(LIZJ);
            }
        }
        return C76800UCe.LIZ;
    }
}
