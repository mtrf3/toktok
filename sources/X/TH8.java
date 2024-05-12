package X;

import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;

/* loaded from: classes13.dex */
public final class TH8 implements IIsTagNeedUpdatedListener {
    public final /* synthetic */ THN LJLIL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
    public final void onTagNeedNotUpdate() {
        this.LJLIL.LIZ(false);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
    public final void onTagNeedUpdate() {
        this.LJLIL.LIZ(true);
    }

    public TH8(THN thn) {
        this.LJLIL = thn;
    }
}
