package X;

import com.google.android.play.core.assetpacks.f0;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import defpackage.e1;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.HbK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44378HbK implements InterfaceC153055zZ {
    public final Object LJLIL;

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        return new f0(C40666Fxe.LIZIZ((InterfaceC153055zZ) this.LJLIL));
    }

    public final boolean LIZ() {
        String str;
        if (V16.LJJJZ((ShortVideoContext) this.LJLIL)) {
            return false;
        }
        if (!((ShortVideoContext) this.LJLIL).LJJIJIIJI() && e1.LIZ(31744, "mv_theme_mode_switch", true, false) && !HJD.LIZ() && !((ShortVideoContext) this.LJLIL).LJJJI()) {
            ShortVideoContext shortVideoContext = (ShortVideoContext) this.LJLIL;
            if (shortVideoContext.enterMvThemeEffect != null || ((str = shortVideoContext.enterCutsameId) != null && str.length() > 0)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ C44378HbK(OutputStream outputStream) {
        this.LJLIL = new BufferedOutputStream(outputStream, 1024);
    }

    public /* synthetic */ C44378HbK(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLIL = shortVideoContext;
    }

    public /* synthetic */ C44378HbK(Object obj) {
        this.LJLIL = obj;
    }
}
