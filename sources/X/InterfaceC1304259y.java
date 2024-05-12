package X;

import android.graphics.Canvas;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* renamed from: X.59y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1304259y {
    void LIZ(long j, NLETrackSlot nLETrackSlot, long j2, long j3);

    int LIZIZ();

    C5A5 LIZJ(int i, C1303859u c1303859u);

    void LIZLLL();

    boolean LJ();

    void LJFF(OSZ<? extends NLETrackSlot, C1301058s> osz, boolean z);

    long LJI();

    void LJII(Canvas canvas);

    int LJIIIIZZ(int i);

    boolean LJIIIZ();

    int LJIIJ();

    int getItemHeight();

    void onClip(long j, long j2);

    void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z);

    void onMoveFail(NLETrackSlot nLETrackSlot);

    void onScrollChanged();
}
