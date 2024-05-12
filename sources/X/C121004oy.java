package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121004oy implements InterfaceC1289354f {
    public final Context LIZ;
    public NLETrackSlot LIZIZ;
    public C59L LIZJ;

    @Override // X.InterfaceC1289354f
    public final void LJ() {
        this.LIZIZ = null;
        this.LIZJ = null;
    }

    @Override // X.InterfaceC1289354f
    public final C59L LIZ() {
        C59L c59l = new C59L(this.LIZ);
        c59l.setEnable_Long_click(false);
        this.LIZJ = c59l;
        return c59l;
    }

    @Override // X.InterfaceC1289354f
    public final C59L LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1289354f
    public final NLETrackSlot LIZLLL() {
        return this.LIZIZ;
    }

    public C121004oy(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    @Override // X.InterfaceC1289354f
    public final NLETrackSlot LIZIZ(long j, long j2) {
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setStartTime(j);
        nLETrackSlot.setEndTime(j + j2);
        nLETrackSlot.setExtra("is_black_frame", "true");
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        nLESegmentVideo.LJIJJLI(0L);
        nLESegmentVideo.LJIJJ(j2);
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setDuration(j2);
        nLEResourceAV.LJIIIZ("");
        nLESegmentVideo.LJIILL(nLEResourceAV);
        nLETrackSlot.LJIIL(nLESegmentVideo);
        this.LIZIZ = nLETrackSlot;
        return nLETrackSlot;
    }
}
