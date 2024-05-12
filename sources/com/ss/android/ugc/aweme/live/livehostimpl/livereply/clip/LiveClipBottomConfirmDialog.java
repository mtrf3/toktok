package com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip;

import X.C15490jB;
import X.C15510jD;
import X.C16880lQ;
import X.C76800UCe;
import X.C79045V0n;
import X.InterfaceC65784Pro;
import X.SY4;
import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class LiveClipBottomConfirmDialog extends LiveBaseSheetDialog {
    public final InterfaceC65784Pro<C76800UCe> LL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View rootView;
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.bp0);
        View findViewById = findViewById(R.id.bst);
        if (findViewById != null && (rootView = findViewById.getRootView()) != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.cr, context);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            rootView.setBackgroundColor(i);
        }
        SY4 sy4 = (SY4) findViewById(R.id.fy8);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS25S0100000_5(this, 259));
        }
        View findViewById2 = findViewById(R.id.fwi);
        if (findViewById2 != null) {
            C15490jB.LIZJ(findViewById2, C15510jD.LJIIIZ("tiktok_live_broadcast_demand_1", "live_edit_guide_instruction.png"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveClipBottomConfirmDialog(Context context, AqS155S0100000_5 aqS155S0100000_5, AqS155S0100000_5 aqS155S0100000_52) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LL = aqS155S0100000_52;
        aqS155S0100000_5.invoke();
    }
}
