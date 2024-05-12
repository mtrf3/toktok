package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C8E {
    public static final C62822Ol8 LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C62822Ol8 LJ;
    public static final C62822Ol8 LJFF;
    public static final C62822Ol8 LJI;
    public static final C62822Ol8 LJII;

    static {
        C221108m2.LIZIZ(C8U.LJLIL);
        LIZ = C221108m2.LIZIZ(C8R.LJLIL);
        C221108m2.LIZIZ(C8S.LJLIL);
        C221108m2.LIZIZ(C8Q.LJLIL);
        LIZIZ = C221108m2.LIZIZ(C8P.LJLIL);
        C221108m2.LIZIZ(C8T.LJLIL);
        C221108m2.LIZIZ(C8I.LJLIL);
        C221108m2.LIZIZ(C8X.LJLIL);
        LIZJ = C221108m2.LIZIZ(C29236Bdg.LJLIL);
        C221108m2.LIZIZ(C8F.LJLIL);
        LIZLLL = C221108m2.LIZIZ(C8H.LJLIL);
        LJ = C221108m2.LIZIZ(C8O.LJLIL);
        C221108m2.LIZIZ(C82.LJLIL);
        C221108m2.LIZIZ(C8M.LJLIL);
        C221108m2.LIZIZ(C89.LJLIL);
        C221108m2.LIZIZ(C84.LJLIL);
        C221108m2.LIZIZ(C81.LJLIL);
        C221108m2.LIZIZ(C8D.LJLIL);
        C221108m2.LIZIZ(C88.LJLIL);
        C221108m2.LIZIZ(C8C.LJLIL);
        C221108m2.LIZIZ(C83.LJLIL);
        C221108m2.LIZIZ(C8G.LJLIL);
        C221108m2.LIZIZ(C8L.LJLIL);
        C221108m2.LIZIZ(C8J.LJLIL);
        C221108m2.LIZIZ(C8N.LJLIL);
        C221108m2.LIZIZ(C85.LJLIL);
        LJFF = C221108m2.LIZIZ(C8V.LJLIL);
        C221108m2.LIZIZ(C8W.LJLIL);
        C221108m2.LIZIZ(C8K.LJLIL);
        C221108m2.LIZIZ(C86.LJLIL);
        C221108m2.LIZIZ(C87.LJLIL);
        C221108m2.LIZIZ(C30828C8a.LJLIL);
        C221108m2.LIZIZ(C30829C8b.LJLIL);
        LJI = C221108m2.LIZIZ(C8Z.LJLIL);
        LJII = C221108m2.LIZIZ(C8Y.LJLIL);
    }

    public static final IHostAction LIZ() {
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-hostAction>(...)");
        return (IHostAction) value;
    }

    public static final IHostAppContext LIZIZ() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-hostContext>(...)");
        return (IHostAppContext) value;
    }

    public static final IInteractService LIZJ() {
        Object value = LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-interactService>(...)");
        return (IInteractService) value;
    }

    public static final IMultiHostService LIZLLL() {
        Object value = LJII.getValue();
        o.LJIIIIZZ(value, "<get-multiCoHostService>(...)");
        return (IMultiHostService) value;
    }

    public static final IMultiGuestV3InternalServiceV2 LJ() {
        Object value = LJI.getValue();
        o.LJIIIIZZ(value, "<get-multiGuestV3InternalServiceV2>(...)");
        return (IMultiGuestV3InternalServiceV2) value;
    }
}
