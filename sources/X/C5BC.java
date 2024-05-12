package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* renamed from: X.5BC, reason: invalid class name */
/* loaded from: classes3.dex */
public interface C5BC {
    void LIZIZ(int i);

    void LIZJ(Canvas canvas);

    boolean LIZLLL();

    int getBgColor();

    RectF getClipRectF();

    float getClipStart();

    boolean getDrawDivider();

    void setBgColor(int i);

    void setBgRadius(int i);

    void setClipLength(float f);

    void setClipRectF(RectF rectF);

    void setClipStart(float f);

    void setClipping(boolean z);

    void setDrawDivider(boolean z);

    void setItemSelected(boolean z);

    void setSegment(NLETrackSlot nLETrackSlot);

    void setTimelineScale(float f);
}
