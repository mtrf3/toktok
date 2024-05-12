package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.6F2, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6F2 extends WMH {
    public InterfaceC145495nN LJLIL;

    public void LLJILJIL() {
    }

    public void LLJILJILJ(Runnable runnable, Runnable runnable2) {
    }

    public C82622Wbi LLJJI() {
        return null;
    }

    public abstract InterfaceC150315v9 LLJJIII();

    public void LLJJIJI(Runnable successCallback, boolean z) {
        o.LJIIIZ(successCallback, "successCallback");
    }

    public void LLJJIJIIJIL(Runnable successCallback, boolean z, boolean z2) {
        o.LJIIIZ(successCallback, "successCallback");
    }

    public void LLJJIJIL(Runnable successCallback, Runnable runnable, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(successCallback, "successCallback");
    }

    public void LLJJJ() {
    }

    public void LLJJJIL() {
    }

    public void LLJJJJ() {
    }

    public void LLJJL(Effect effect, CustomStickerInfo info) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(info, "info");
    }

    public void LLJJLIIIJLLLLLLLZ(InterfaceC147475qZ interfaceC147475qZ) {
    }

    public void LLJLIL(C6FD c6fd) {
    }

    public void LLJLILLLLZIIL(C137965bE stickerChallengeManager) {
        o.LJIIIZ(stickerChallengeManager, "stickerChallengeManager");
    }

    public boolean LLJLL() {
        return false;
    }

    public void LLJLLIL() {
    }

    public final InterfaceC145495nN LLJJ() {
        InterfaceC145495nN interfaceC145495nN = this.LJLIL;
        if (interfaceC145495nN != null) {
            return interfaceC145495nN;
        }
        o.LJIJI("musicController");
        throw null;
    }

    public C6F2() {
        disableSceneRestore();
        disableSupportRestore();
    }

    @Override // X.WMH, X.WM7
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
