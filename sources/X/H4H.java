package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.keva.Keva;
import djb.IDaS68S0100000_7;
import java.util.List;
import kotlin.jvm.internal.AqS23S0010000_7;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes8.dex */
public final class H4H implements InterfaceC43114Gw2 {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(H4L.LJLIL);

    @Override // X.InterfaceC43114Gw2
    public final boolean LIZLLL() {
        int i = new C42141GgL().LIZIZ;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC43114Gw2
    public final String LJ() {
        return new C42141GgL().LIZ();
    }

    @Override // X.InterfaceC43114Gw2
    public final H6S LJII() {
        return (H6S) this.LIZ.getValue();
    }

    @Override // X.InterfaceC43114Gw2
    public final boolean LIZIZ() {
        C41658GWo.LIZLLL().getClass();
        if (C41658GWo.LJ()) {
            return false;
        }
        C42141GgL c42141GgL = new C42141GgL();
        if (!c42141GgL.LIZJ()) {
            return false;
        }
        C39579Fg7.LJIJJLI(c42141GgL.LIZ());
        H4M.LIZIZ().storeBoolean("key_ending_audio_ready", false);
        Keva LIZIZ = H4M.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(-1);
        LIZ.append('-');
        LIZ.append(-1);
        LIZIZ.storeString("key_ending_frame_ready", X1D.LIZIZ(LIZ));
        H4M.LIZJ("", false);
        H4M.LIZJ("", true);
        H4M.LIZLLL("", false);
        H4M.LIZLLL("", true);
        return true;
    }

    @Override // X.InterfaceC43114Gw2
    public final long LJFF() {
        C41658GWo.LIZLLL().getClass();
        if (C41658GWo.LJ()) {
            return 0L;
        }
        C42141GgL c42141GgL = new C42141GgL();
        if (!c42141GgL.LIZJ()) {
            return 0L;
        }
        return C39579Fg7.LJIIIIZZ(c42141GgL.LIZ());
    }

    @Override // X.InterfaceC43114Gw2
    public final Object LIZ(C76940UHo c76940UHo, Context context, H4O h4o, InterfaceC67352kd interfaceC67352kd) {
        return new C43534H6s(c76940UHo, context, h4o).LIZIZ(interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // X.InterfaceC43114Gw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(androidx.lifecycle.LifecycleOwner r16, android.content.Context r17, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r18, X.InterfaceC67352kd<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4H.LJI(androidx.lifecycle.LifecycleOwner, android.content.Context, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC43114Gw2
    public final void LIZJ(List<Integer> videoSize, String str, InterfaceC45930I0w interfaceC45930I0w, InterfaceC88474Ynu<? super Boolean, ? super List<String>, ? super String, ? super String, C76800UCe> interfaceC88474Ynu, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        boolean z;
        o.LJIIIZ(videoSize, "videoSize");
        Application context = C60903NvH.LJ;
        boolean LJ = o.LJ(C77339UWx.LIZJ(), interfaceC45930I0w.getUid());
        C42141GgL c42141GgL = new C42141GgL();
        if (2 == c42141GgL.LIZ || 2 == c42141GgL.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (!c42141GgL.LIZJ()) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(new IllegalStateException("the new ending watermark is not enabled, skip loading ending watermark resources"));
            }
        } else {
            o.LJIIIIZZ(context, "context");
            H6P h6p = new H6P(context, c42141GgL.LIZ(), videoSize, str, interfaceC45930I0w, new AqS23S0010000_7(LJ, 1), z);
            XKX.LIZLLL(C48841JEv.LIZ(h6p.LJII.plus(C78613UtF.LIZJ).plus(new IDaS68S0100000_7(CoroutineExceptionHandler.LJJJJIZL, interfaceC88472Yns, 2))), null, null, new H6Q(h6p, interfaceC88474Ynu, null), 3);
        }
    }
}
