package X;

import android.graphics.Canvas;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* renamed from: X.5A5, reason: invalid class name */
/* loaded from: classes3.dex */
public interface C5A5 {
    public static final C5BD LJJJJZ = C5BD.LIZ;

    void LIZIZ(int i);

    void LIZJ(int i);

    void LIZLLL(boolean z);

    void LJFF(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6);

    void LJI(int i);

    int LJII();

    void destroy();

    View getView();

    void setClipping(boolean z);

    void setDrawDivider(boolean z);

    void setItemSelected(boolean z);

    void setSegment(NLETrackSlot nLETrackSlot);

    void setTimelineScale(float f);
}
