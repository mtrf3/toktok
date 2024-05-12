package X;

import Y.ACListenerS33S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogC76479Tzv extends DialogC38611fN {
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public EnumC76319TxL LJLJI;

    public DialogC76479Tzv(Context context) {
        super(context, R.style.abu);
        this.LJLJI = EnumC76319TxL.PK_ICON;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cxy);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        if (!C8E.LIZLLL().LLIFFJFJJ()) {
            HashMap hashMap = new HashMap();
            C75457TjR.LIZLLL(hashMap);
            C75457TjR.LJJI("livesdk_pk_guide_popup_show", hashMap);
        }
        C47061t0 c47061t0 = (C47061t0) findViewById(R.id.f4h);
        ViewGroup.LayoutParams layoutParams = c47061t0.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = C15380j0.LIZ(311.5f);
        marginLayoutParams.height = C15380j0.LIZ(132.0f);
        C15490jB.LJ(c47061t0, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_ic_interact_pk_guide_2.png");
        c47061t0.setLayoutParams(marginLayoutParams);
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 219), findViewById(R.id.f0h));
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 220), findViewById(R.id.b04));
    }
}
