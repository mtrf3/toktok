package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.effectcreatormobile.camera.CameraPreview;
import com.bytedance.ies.effectcreator.swig.DataEvent;
import com.bytedance.ies.effectcreator.swig.DataEventReceiver;
import com.bytedance.ies.effectcreator.swig.DataEventType;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import kotlin.jvm.internal.IDqS179S0200000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aet, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94307aet extends DataEventReceiver {
    public final /* synthetic */ CameraPreview LIZ;

    public C94307aet(CameraPreview cameraPreview) {
        this.LIZ = cameraPreview;
    }

    @Override // com.bytedance.ies.effectcreator.swig.DataEventReceiver
    public final void onDataEventReceived(DataEvent dataEvent) {
        DataEventType type;
        if (dataEvent == null || (type = dataEvent.getType()) == null) {
            return;
        }
        int i = C93879aXz.LIZIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = this.LIZ.getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94885aoD(null), 3);
            return;
        }
        CKEffectEditorContext.LIZLLL(new IDqS179S0200000_42(this, dataEvent, 12));
    }
}
