package X;

import android.content.DialogInterface;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes13.dex */
public final class TIS implements DialogInterface.OnCancelListener {
    public final /* synthetic */ TIR LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;

    public TIS(TIR tir, Effect effect) {
        this.LJLIL = tir;
        this.LJLILLLLZI = effect;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.LJLIL.LIZJ(this.LJLILLLLZI);
    }
}
