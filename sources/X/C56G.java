package X;

import android.widget.HorizontalScrollView;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.List;

/* renamed from: X.56G, reason: invalid class name */
/* loaded from: classes3.dex */
public interface C56G {
    int getCurTimePosition();

    HorizontalScrollView getHorizontalScrollView();

    Integer getSelectedBeat();

    void setAudioNLETrackSlot(NLETrackSlot nLETrackSlot);

    void setAudioTrackPaint(C5BJ c5bj);

    void setBeats(List<Integer> list);

    void setListener(InterfaceC130805Bk interfaceC130805Bk);
}
