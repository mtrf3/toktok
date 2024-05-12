package X;

import android.content.Context;
import com.fcm.FcmPushAdapter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.QRi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67002QRi implements InterfaceC67661Qgz<String> {
    public final /* synthetic */ Context LJLIL;

    public C67002QRi(Context context) {
        this.LJLIL = context;
    }

    @Override // X.InterfaceC67661Qgz
    public final void onComplete(AbstractC67638Qgc<String> abstractC67638Qgc) {
        if (abstractC67638Qgc != null && abstractC67638Qgc.LJIILIIL() && abstractC67638Qgc.LJIIIZ() != null) {
            C32151Nz.LJJIJLIJ(this.LJLIL, abstractC67638Qgc.LJIIIZ());
        } else {
            QRM.LJFF().LJIILL(FcmPushAdapter.getFcmPush(), 102, CardStruct.IStatusCode.DEFAULT, "token is empty");
        }
    }
}
