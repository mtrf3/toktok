package X;

import android.view.View;
import com.ss.android.ugc.aweme.sticker.model.EffectAttribution;

/* renamed from: X.GtJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnLongClickListenerC42945GtJ implements View.OnLongClickListener {
    public final /* synthetic */ C42943GtH LJLIL;
    public final /* synthetic */ EffectAttribution LJLILLLLZI;

    public ViewOnLongClickListenerC42945GtJ(C42943GtH c42943GtH, EffectAttribution effectAttribution) {
        this.LJLIL = c42943GtH;
        this.LJLILLLLZI = effectAttribution;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return this.LJLIL.LJLIL.invoke(this.LJLILLLLZI).booleanValue();
    }
}
