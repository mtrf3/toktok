package X;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetViewAssem;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.a8i, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92312a8i implements OnActivityResultCallback {
    public final /* synthetic */ PinSetViewAssem LJLIL;
    public final /* synthetic */ UIAssem LJLILLLLZI;

    public C92312a8i(PinSetViewAssem pinSetViewAssem, UIAssem uIAssem) {
        this.LJLIL = pinSetViewAssem;
        this.LJLILLLLZI = uIAssem;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC88472Yns<? super EnumC92073a4r, C76800UCe> interfaceC88472Yns;
        View view;
        View view2;
        View view3;
        if (i2 == 102) {
            Serializable serializableExtra = intent.getSerializableExtra("KEY_PIN_CONFIRM_RESULT");
            o.LJII(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinConfirmResult");
            C92069a4n c92069a4n = (C92069a4n) serializableExtra;
            PinSetViewAssem pinSetViewAssem = this.LJLIL;
            UIAssem uIAssem = this.LJLILLLLZI;
            if (c92069a4n.getStatus() == EnumC92073a4r.ERROR) {
                if (C78685UuP.LJJJZ(c92069a4n.getErrorCode()) && o.LJ(c92069a4n.getErrorCode(), "PIN_DUPLICATED")) {
                    String LJFF = C86V.LJFF(R.string.jsj);
                    o.LJIIIIZZ(LJFF, "getString(R.string.pipo_wallet_set_pin_same)");
                    String LJFF2 = C86V.LJFF(R.string.jsk);
                    o.LJIIIIZZ(LJFF2, "getString(R.string.pipo_…let_set_pin_same_message)");
                    pinSetViewAssem.C3(LJFF, LJFF2, c92069a4n.getErrorCode());
                    return;
                }
                String errorContent = c92069a4n.getErrorContent();
                if (errorContent == null || errorContent.length() == 0) {
                    return;
                }
                View containerView = uIAssem.getContainerView();
                View view4 = null;
                if (containerView != null) {
                    view = containerView.findViewById(R.id.fq);
                } else {
                    view = null;
                }
                ((TextView) view).setText(c92069a4n.getErrorContent());
                View containerView2 = uIAssem.getContainerView();
                if (containerView2 != null) {
                    view2 = containerView2.findViewById(R.id.fq);
                } else {
                    view2 = null;
                }
                view2.setVisibility(0);
                View containerView3 = uIAssem.getContainerView();
                if (containerView3 != null) {
                    view3 = containerView3.findViewById(R.id.gb);
                } else {
                    view3 = null;
                }
                ((C92630aDq) view3).LJLJJLL = true;
                View containerView4 = uIAssem.getContainerView();
                if (containerView4 != null) {
                    view4 = containerView4.findViewById(R.id.gb);
                }
                ((TextView) view4).setText("");
                return;
            }
            EnumC92073a4r status = c92069a4n.getStatus();
            if (status != null && (interfaceC88472Yns = C92031a4B.LIZIZ) != null) {
                interfaceC88472Yns.invoke(status);
            }
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(uIAssem);
            if (LJIIIIZZ == null) {
                return;
            }
            LJIIIIZZ.finish();
        }
    }
}
