package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.CtK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32754CtK extends AbstractC32678Cs6 {
    public final View LLFII;
    public final String LLFZ;

    @Override // X.AbstractC32678Cs6
    public final String Q() {
        return this.LLFZ;
    }

    public C32754CtK(View view) {
        super(view);
        this.LLFII = view;
        this.LLFZ = "LiveGiftDummyViewHolderV2";
    }

    @Override // X.AbstractC32678Cs6
    public final void N(AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ, DataChannel dataChannel, int i) {
        this.LLFII.setVisibility(8);
    }
}
