package X;

import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.51U, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C51U extends AbstractC65781Prl implements InterfaceC88473Ynt<Long, java.util.Map<String, ? extends View>, NLEModel, C76800UCe> {
    public static final C51U LJLIL = new C51U();

    public C51U() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Long l, java.util.Map<String, ? extends View> map, NLEModel nLEModel) {
        long longValue = l.longValue();
        java.util.Map<String, ? extends View> viewMap = map;
        o.LJIIIZ(viewMap, "viewMap");
        for (NLETrackSlot nLETrackSlot : C5FC.LJFF(nLEModel)) {
            View view = viewMap.get(nLETrackSlot.getUUID());
            if (nLETrackSlot.getStartTime() < longValue && nLETrackSlot.getEndTime() > longValue) {
                if (view != null) {
                    view.setVisibility(0);
                }
            } else if (view != null) {
                view.setVisibility(8);
            }
        }
        return C76800UCe.LIZ;
    }
}
