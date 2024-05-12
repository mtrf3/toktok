package X;

import com.lynx.tasm.base.TraceEvent;

/* renamed from: X.Jw7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50763Jw7 extends AbstractC50748Jvs implements InterfaceC39939Flv {
    @Override // X.AbstractC50748Jvs
    public final String LJIIIIZZ() {
        return "com.bytedance.lynx.service.trail.LynxTrailService";
    }

    @Override // X.InterfaceC39939Flv
    public final String stringValueForExperimentKey(String str) {
        String str2;
        TraceEvent.LIZIZ("LynxTrailServiceProxy.stringValueForExperimentKey");
        if (LJII()) {
            str2 = ((InterfaceC39939Flv) this.LIZIZ).stringValueForExperimentKey(str);
        } else {
            str2 = null;
        }
        TraceEvent.LJ("LynxTrailServiceProxy.stringValueForExperimentKey");
        return str2;
    }
}
