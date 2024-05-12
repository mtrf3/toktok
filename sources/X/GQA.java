package X;

import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import ujb.o;

/* loaded from: classes8.dex */
public final class GQA extends GQ9 {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<CharSequence, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GQA(LiveIconView liveIconView, InterfaceC88472Yns interfaceC88472Yns) {
        super(0);
        this.LJLIL = liveIconView;
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        View view = this.LJLIL;
        int i4 = 0;
        if (charSequence == null || o.LJJJJJL(charSequence)) {
            i4 = 8;
        }
        view.setVisibility(i4);
        InterfaceC88472Yns<CharSequence, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(charSequence);
        }
    }
}
