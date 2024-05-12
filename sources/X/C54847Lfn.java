package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Lfn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54847Lfn implements InterfaceC54855Lfv {
    public final /* synthetic */ C54849Lfp LJLIL;

    public C54847Lfn(C54849Lfp c54849Lfp) {
        this.LJLIL = c54849Lfp;
    }

    @Override // X.InterfaceC54855Lfv
    public final void LJIIIZ(int i, View view, RecyclerView recyclerView) {
        C54849Lfp c54849Lfp = this.LJLIL;
        c54849Lfp.LJLJJI = Math.max(c54849Lfp.LJLJJI, i + 1);
        if (i != 0) {
            this.LJLIL.setHasUserInteract(true);
            LJ6.LIZ.storeBoolean(C53525KzZ.LIZIZ("nearby_encourage_publish_card_user_operated"), true);
        }
    }
}
