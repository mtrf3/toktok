package X;

import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* renamed from: X.4vI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC124924vI {
    InterfaceC125004vQ getEditor();

    InterfaceC124914vH getEditorClientChannel();

    InterfaceC126604y0 getEnvVariables();

    boolean getHasInitialized();

    InterfaceC124684uu getKeyframeEditor();

    NLETrack getMainTrack();

    NLEMediaConfig getNleMediaConfig();

    InterfaceC126684y8 getNleSession();

    InterfaceC127784zu getPlayer();

    boolean getReuseVEEngine();

    void getSelectedSlotTimeRange(long[] jArr);

    NLETrack getSelectedTrack();

    NLETrackSlot getSelectedTrackSlot();

    SurfaceView getSurfaceView();

    C52R getUndoRedoManager();

    boolean isPreload();

    void setLastSelectSlotStartTime(long j);
}
