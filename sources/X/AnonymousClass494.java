package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* renamed from: X.494, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass494 implements C3WY {
    public final Context LJLIL;
    public final /* synthetic */ C3WQ LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public C73318Sq2 LJLJJI;
    public TuxSheet LJLJJL;

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLILLLLZI.LLIIJLIL(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLILLLLZI.LLJILLL(c3wr);
    }

    public final boolean LIZ() {
        if (!C92363js.LIZ() || !C53181Ku1.LIZ()) {
            return false;
        }
        Keva keva = (Keva) this.LJLJI.getValue();
        o.LJIIIIZZ(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID(), "get().getService(IUserSe…class.java).currentUserID");
        if (!(!keva.getBoolean(r1, false)) || C78897Uxp.LJJIJIIJIL()) {
            return false;
        }
        return true;
    }

    public AnonymousClass494(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = new C3WQ();
        this.LJLJI = C221108m2.LIZIZ(AnonymousClass495.LJLIL);
        this.LJLJJI = new C73318Sq2();
    }
}
