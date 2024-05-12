package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SwitchInputItemViewHolder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.Aa8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26468Aa8 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AI2 LJLIL;
    public final /* synthetic */ C27021Aj3 LJLILLLLZI;
    public final /* synthetic */ SwitchInputItemViewHolder LJLJI;

    public C26468Aa8(AI2 ai2, C27021Aj3 c27021Aj3, SwitchInputItemViewHolder switchInputItemViewHolder) {
        this.LJLIL = ai2;
        this.LJLILLLLZI = c27021Aj3;
        this.LJLJI = switchInputItemViewHolder;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        this.LJLIL.LJIILIIL(z);
        C27021Aj3 c27021Aj3 = this.LJLILLLLZI;
        if (this.LJLIL.LJIIL()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c27021Aj3.LIZIZ = str;
        this.LJLJI.getViewModel().LJLLJ = true;
    }
}
