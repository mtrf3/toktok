package com.bytedance.android.livesdk.impl.revenue.subscription.dialog;

import X.C15380j0;
import X.C15490jB;
import X.C15510jD;
import X.C16880lQ;
import X.C23010vJ;
import X.C29399BgJ;
import X.C29400BgK;
import X.C2A7;
import X.C76800UCe;
import X.C79045V0n;
import X.InterfaceC65784Pro;
import Y.ACListenerS25S0100000_5;
import Y.IDCSpanS31S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class SubscribeGiftSubHintDialog extends LiveBaseSheetDialog {
    public final InterfaceC65784Pro<C76800UCe> LL;

    public SubscribeGiftSubHintDialog() {
        throw null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeGiftSubHintDialog(Context context) {
        super(context);
        C29399BgJ initFun = C29399BgJ.LJLIL;
        C29400BgK confirmClickFun = C29400BgK.LJLIL;
        o.LJIIIZ(initFun, "initFun");
        o.LJIIIZ(confirmClickFun, "confirmClickFun");
        this.LL = confirmClickFun;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View rootView;
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.cxm);
        View findViewById = findViewById(R.id.bst);
        if (findViewById != null && (rootView = findViewById.getRootView()) != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.aqp, context);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            rootView.setBackgroundColor(i);
        }
        C2A7 c2a7 = (C2A7) findViewById(R.id.dvf);
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 168));
        }
        View findViewById2 = findViewById(R.id.dve);
        if (findViewById2 != null) {
            C15490jB.LIZJ(findViewById2, C15510jD.LJIIIZ("tiktok_live_broadcast_normal_1", "gift_sub_hint_dialog_image.png"));
        }
        TextView textView = (TextView) findViewById(R.id.dvb);
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lpm);
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.lpn);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i0.LJFF(LJIILJJIL, LJIILJJIL2));
        int length = LJIILJJIL.length() + LJIILJJIL2.length();
        int length2 = (length - LJIILJJIL2.length()) - 1;
        C23010vJ.LIZJ(getContext(), spannableStringBuilder, length2, length, 33, 3, 600);
        spannableStringBuilder.setSpan(new IDCSpanS31S0100000_5(this, 1), length2, length, 33);
        if (textView == null) {
            return;
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }
}
