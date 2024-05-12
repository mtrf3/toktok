package X;

import android.view.KeyEvent;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.jvm.internal.AqS164S0100000_14;

/* renamed from: X.WOv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82225WOv implements C5HC {
    public final /* synthetic */ AqS164S0100000_14 LJLIL;

    public C82225WOv(AqS164S0100000_14 aqS164S0100000_14) {
        this.LJLIL = aqS164S0100000_14;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NavigationScene LJIL;
        if (i == 4 && (LJIL = C78897Uxp.LJIL((C82226WOw) this.LJLIL.l0)) != null && C79057V0z.LJIIZILJ(LJIL, C82226WOw.class)) {
            InterfaceC82227WOx interfaceC82227WOx = ((C82226WOw) this.LJLIL.l0).LJLL;
            if (interfaceC82227WOx != null) {
                interfaceC82227WOx.hide();
            }
            return true;
        }
        return false;
    }
}
