package X;

import com.ss.android.ugc.aweme.record.ExteriorRecordPageFactoryImpl;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorRecordPageFactory;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.OptionalComponents;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import v5.n;

/* renamed from: X.Pt1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C65859Pt1 implements InterfaceC44312HaG, HGQ, VideoCapturer.BeforeOnFrameCallback {
    public final /* synthetic */ Object LJLIL;

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.BeforeOnFrameCallback
    public final void beforeNativeOnFrame() {
        ((LiveStream) this.LJLIL).lambda$creatVideoTrack$6();
    }

    public /* synthetic */ C65859Pt1(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC44312HaG
    public final void LIZ(WMH wmh) {
        ExteriorRecordPageFactory exteriorRecordPageFactory;
        OptionalComponents optionalComponents = (OptionalComponents) this.LJLIL;
        Object LIZ = C58096Mr6.LIZ(ExteriorRecordPageFactory.class, false);
        if (LIZ != null) {
            exteriorRecordPageFactory = (ExteriorRecordPageFactory) LIZ;
        } else {
            if (C58096Mr6.q4 == null) {
                synchronized (ExteriorRecordPageFactory.class) {
                    if (C58096Mr6.q4 == null) {
                        C58096Mr6.q4 = new ExteriorRecordPageFactoryImpl();
                    }
                }
            }
            exteriorRecordPageFactory = C58096Mr6.q4;
        }
        exteriorRecordPageFactory.LIZ(wmh, optionalComponents);
    }

    @Override // X.HGQ
    public final void onFinish(boolean z) {
        ((n) this.LJLIL).LIZJ(null);
    }
}
