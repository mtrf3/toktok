package X;

import android.widget.CompoundButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.share.dislike.ChooseItemViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Om4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62880Om4 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C62879Om3 LJLIL;
    public final /* synthetic */ TuxTextView LJLILLLLZI;

    public C62880Om4(C62879Om3 c62879Om3, TuxTextView tuxTextView) {
        this.LJLIL = c62879Om3;
        this.LJLILLLLZI = tuxTextView;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        o.LJIIIZ(compoundButton, "compoundButton");
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.LJLIL.LIZIZ = z;
        this.LJLILLLLZI.setVisibility(i);
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJLIL.LIZJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
        ChooseItemViewModel chooseItemViewModel = this.LJLIL.LIZLLL;
        chooseItemViewModel.LJLJJI = z;
        int i3 = chooseItemViewModel.LJLIL;
        if (z) {
            i2 = chooseItemViewModel.LJLILLLLZI;
        }
        chooseItemViewModel.gv0(i3 + i2);
    }
}
