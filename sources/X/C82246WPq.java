package X;

import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;

/* renamed from: X.WPq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82246WPq implements IIsTagNeedUpdatedListener {
    public final /* synthetic */ THN LJLIL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
    public final void onTagNeedNotUpdate() {
        this.LJLIL.LIZ(false);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
    public final void onTagNeedUpdate() {
        this.LJLIL.LIZ(true);
    }

    public C82246WPq(THN thn) {
        this.LJLIL = thn;
    }
}
