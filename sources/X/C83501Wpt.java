package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import kotlin.jvm.internal.AqS164S0100000_14;

/* renamed from: X.Wpt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83501Wpt implements InterfaceC144185lG {
    public final /* synthetic */ AqS164S0100000_14 LJLIL;

    public C83501Wpt(AqS164S0100000_14 aqS164S0100000_14) {
        this.LJLIL = aqS164S0100000_14;
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i == 10002) {
            ((BackgroundVideoStickerPresenter) this.LJLIL.l0).LJIILL(i, i2, intent, new C83502Wpu(((BackgroundVideoStickerPresenter) this.LJLIL.l0).LJZL));
            return true;
        }
        return false;
    }
}
