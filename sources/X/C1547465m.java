package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.65m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1547465m extends WM7 implements AnonymousClass655, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJI;
    public final C82622Wbi LJLIL;
    public C1547365l LJLILLLLZI;
    public final C82631Wbr LJLJI;

    static {
        TBT tbt = new TBT(C1547465m.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AnonymousClass655
    public final void LJJJJJ() {
        C1547365l c1547365l = this.LJLILLLLZI;
        if (c1547365l != null) {
            c1547365l.LJJJJJ();
        } else {
            o.LJIJI("deleteView");
            throw null;
        }
    }

    @Override // X.AnonymousClass655
    public final void hide() {
        C1547365l c1547365l = this.LJLILLLLZI;
        if (c1547365l != null) {
            c1547365l.hide();
        } else {
            o.LJIJI("deleteView");
            throw null;
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C1547465m(C82622Wbi c82622Wbi) {
        this.LJLIL = c82622Wbi;
        this.LJLJI = UCI.LJII(c82622Wbi, InterfaceC147865rC.class, null);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        InterfaceC147865rC interfaceC147865rC = (InterfaceC147865rC) this.LJLJI.LIZ(this, LJLJJI[0]);
        if (interfaceC147865rC == null) {
            return;
        }
        interfaceC147865rC.QE(new AqS152S0100000_2(this, 418));
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        C1547365l c1547365l;
        int i;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        Context requireSceneContext = requireSceneContext();
        if (requireSceneContext == null) {
            c1547365l = null;
        } else {
            c1547365l = new C1547365l(requireSceneContext);
            int LIZIZ = (int) C74275TDb.LIZIZ(requireSceneContext, 72.0f);
            if (C1544664k.LIZ()) {
                LIZIZ = (int) C74275TDb.LIZIZ(requireSceneContext, 104.0f);
                i = (int) C74275TDb.LIZIZ(requireSceneContext, 72.0f);
            } else {
                i = LIZIZ;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LIZIZ, i);
            layoutParams.topMargin = C81184Vtc.LJFF(requireSceneContext);
            c1547365l.setLayoutParams(layoutParams);
            layoutParams.gravity = 49;
            c1547365l.setLayoutParams(layoutParams);
        }
        o.LJIIIIZZ(c1547365l, "create(requireSceneContext())");
        this.LJLILLLLZI = c1547365l;
        return c1547365l;
    }

    @Override // X.AnonymousClass655
    public final int LJLILLLLZI(int i, int i2, boolean z, boolean z2) {
        C1547365l c1547365l = this.LJLILLLLZI;
        if (c1547365l != null) {
            return c1547365l.LJLILLLLZI(i, i2, z, z2);
        }
        o.LJIJI("deleteView");
        throw null;
    }
}
