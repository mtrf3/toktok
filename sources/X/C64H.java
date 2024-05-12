package X;

import android.content.Context;
import android.graphics.PointF;
import com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.BaseStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.64H, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64H implements C64U {
    public final Context LJLIL;
    public final C6DJ LJLILLLLZI;
    public WHL LJLJI = WHL.TOP;
    public InterfaceC82683Wch LJLJJI;
    public final float LJLJJL;
    public final float LJLJJLL;
    public final float LJLJL;
    public int LJLJLJ;
    public PointF LJLJLLL;
    public final C64962gm LJLL;
    public XKQ LJLLI;

    @Override // X.C64U
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.C64U
    public final void LJFF() {
    }

    @Override // X.C64U
    public final void LJII(C64N c64n, float f, float f2) {
    }

    public C64H(Context context) {
        this.LJLIL = context;
        this.LJLILLLLZI = new C6DJ(context);
        this.LJLJJL = C74275TDb.LIZIZ(context, 41.0f);
        this.LJLJJLL = C74275TDb.LIZIZ(context, 12.0f);
        this.LJLJL = C74275TDb.LIZIZ(context, 60.0f);
        this.LJLJLJ = C81184Vtc.LJFF(context);
        C81184Vtc.LIZLLL(context);
        C81184Vtc.LIZJ(context);
        this.LJLJLLL = new PointF();
        this.LJLL = C48841JEv.LIZIZ();
    }

    @Override // X.C64U
    public final void LJI(C64N c64n) {
        PointF pointF;
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJJI;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
        if (c64n.LIZJ) {
            return;
        }
        PointF[] fourPointsWithRotationAndScale$default = BaseStickerModel.getFourPointsWithRotationAndScale$default(c64n.LIZIZ(), 0.0f, 1, null);
        PointF pointF2 = fourPointsWithRotationAndScale$default[0];
        float f = pointF2.x;
        PointF pointF3 = fourPointsWithRotationAndScale$default[1];
        float f2 = pointF3.x;
        float f3 = 2;
        float f4 = ((f - f2) / f3) + f2;
        float f5 = pointF2.y;
        float f6 = pointF3.y;
        PointF pointF4 = new PointF(f4, C1I0.LIZ(f5, f6, f3, f6));
        PointF pointF5 = fourPointsWithRotationAndScale$default[2];
        float f7 = pointF5.x;
        PointF pointF6 = fourPointsWithRotationAndScale$default[3];
        float f8 = pointF6.x;
        float LIZ = C1I0.LIZ(f7, f8, f3, f8);
        float f9 = pointF5.y;
        float f10 = pointF6.y;
        PointF pointF7 = new PointF(LIZ, C1I0.LIZ(f9, f10, f3, f10));
        if (pointF4.y < pointF7.y) {
            pointF = pointF4;
            pointF4 = pointF7;
        } else {
            pointF = pointF7;
        }
        if (pointF.y - (((this.LJLJJL * ((ArrayList) c64n.LIZ).size()) + this.LJLJJLL) + this.LJLJL) < this.LJLJLJ) {
            this.LJLJI = WHL.BOTTOM;
            this.LJLJLLL = pointF4;
        } else {
            this.LJLJI = WHL.TOP;
            this.LJLJLLL = pointF;
        }
        if (!((ArrayList) c64n.LIZ).isEmpty()) {
            C6DJ c6dj = this.LJLILLLLZI;
            c6dj.LJIIIIZZ(AnonymousClass636.LJIIIIZZ(R.attr.gy, this.LJLIL));
            c6dj.LJI(this.LJLJI);
            List<C6DO> actions = c64n.LIZ;
            o.LJIIIZ(actions, "actions");
            c6dj.LIZJ = actions;
            PointF pointF8 = this.LJLJLLL;
            c6dj.LIZ((int) pointF8.x, ((int) pointF8.y) + this.LJLJLJ);
            c6dj.LIZ.LJII = -1001L;
            InterfaceC82683Wch LIZJ = this.LJLILLLLZI.LIZJ();
            this.LJLJJI = LIZJ;
            LIZJ.show();
        }
        this.LJLLI = XKX.LIZLLL(this.LJLL, null, null, new C63002dc(this, null), 3);
    }

    @Override // X.C64U
    public final boolean LIZIZ(C64N c64n, float f) {
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJJI;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
        XKQ xkq = this.LJLLI;
        if (xkq != null) {
            xkq.LIZIZ(null);
            return false;
        }
        return false;
    }

    @Override // X.C64U
    public final boolean LJ(C64N c64n, float f) {
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJJI;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
        XKQ xkq = this.LJLLI;
        if (xkq != null) {
            xkq.LIZIZ(null);
            return false;
        }
        return false;
    }

    @Override // X.C64U
    public final void LIZ(C64N c64n, float f, float f2) {
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJJI;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
        XKQ xkq = this.LJLLI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    @Override // X.C64U
    public final boolean LIZJ(C64N c64n, float f, float f2) {
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJJI;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
        XKQ xkq = this.LJLLI;
        if (xkq != null) {
            xkq.LIZIZ(null);
            return false;
        }
        return false;
    }
}
