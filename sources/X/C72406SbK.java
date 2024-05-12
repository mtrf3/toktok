package X;

import android.app.Dialog;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.SbK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72406SbK implements A91 {
    public final /* synthetic */ C68322mC<InterfaceC79150V4o> LJLIL;
    public final /* synthetic */ AIGCPictureHandler LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.A91
    public final void LIZ(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
        InterfaceC79150V4o interfaceC79150V4o = this.LJLIL.element;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(new CancellationException("User click cancel button"));
        }
        C72164STw.LIZ(EnumC72154STm.TOTAL, EnumC72156STo.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - this.LJLJI), this.LJLILLLLZI.getAigcType(), null, "User click cancel", 16);
    }

    public C72406SbK(C68322mC<InterfaceC79150V4o> c68322mC, AIGCPictureHandler aIGCPictureHandler, long j) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = aIGCPictureHandler;
        this.LJLJI = j;
    }
}
