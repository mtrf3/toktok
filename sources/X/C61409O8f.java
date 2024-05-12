package X;

import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import kotlin.jvm.internal.o;

/* renamed from: X.O8f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61409O8f implements InterfaceC38821FLl {
    public final /* synthetic */ AbstractC22770uv LJLIL;

    public C61409O8f(C35191Zr c35191Zr) {
        this.LJLIL = c35191Zr;
    }

    @Override // X.InterfaceC38821FLl
    public final void change(IESSettingsProxy it) {
        o.LJIIIZ(it, "it");
        if (ujb.o.LJJJJIZL(C61408O8e.LIZ, C2YJ.LIZIZ.LIZ.getAdTrackerConfig(), false)) {
            this.LJLIL.LIZ(C61408O8e.LIZIZ());
        }
    }
}
