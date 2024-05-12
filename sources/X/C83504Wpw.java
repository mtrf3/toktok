package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import kotlin.jvm.internal.AqS164S0100000_14;

/* renamed from: X.Wpw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83504Wpw implements InterfaceC144185lG {
    public final /* synthetic */ AqS164S0100000_14 LJLIL;

    public C83504Wpw(AqS164S0100000_14 aqS164S0100000_14) {
        this.LJLIL = aqS164S0100000_14;
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return ((DiyPropVideoStickerHandler) this.LJLIL.l0).LJIILIIL(i, i2, intent, new C83503Wpv(((DiyPropVideoStickerHandler) this.LJLIL.l0).LJZL));
    }
}
