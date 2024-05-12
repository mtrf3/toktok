package com.bytedance.android.livesdk.broadcast.interaction.widget.task_animation;

import X.AbstractC81613W1h;
import X.C0GY;
import X.C16880lQ;
import X.C19670pv;
import X.C29701Eo;
import X.C31883CfH;
import X.C73318Sq2;
import X.C73943T0h;
import X.C77126UOs;
import X.C81614W1i;
import X.C81615W1j;
import X.InterfaceC81617W1l;
import X.KL2;
import X.PO7;
import Y.ARunnableS50S0100000_14;
import Y.AfS57S0100000_5;
import Y.IDAListenerS81S0100000_14;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes15.dex */
public class TaskFinishAnimationWidget extends LiveRecyclableWidget implements WeakHandler.IHandler {
    public C29701Eo LJLIL;
    public TextView LJLILLLLZI;
    public AlphaAnimation LJLJI;
    public ARunnableS50S0100000_14 LJLJJI;
    public AlphaAnimation LJLJJL;
    public final WeakHandler LJLJJLL = new WeakHandler(C16880lQ.LLJJJJ(), this);
    public final C73318Sq2 LJLJL = new C73318Sq2();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.cub;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C73318Sq2 c73318Sq2 = this.LJLJL;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZLLL();
        }
        AlphaAnimation alphaAnimation = this.LJLJJL;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
            this.LJLJJL = null;
        }
        AlphaAnimation alphaAnimation2 = this.LJLJI;
        if (alphaAnimation2 != null) {
            alphaAnimation2.cancel();
            this.LJLJI = null;
        }
        if (this.LJLJJI != null) {
            this.LJLJJI = null;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        InterfaceC81617W1l interfaceC81617W1l;
        if (message != null && message.what == 100) {
            Object obj = message.obj;
            if (obj instanceof C31883CfH) {
                C31883CfH c31883CfH = (C31883CfH) obj;
                C29701Eo c29701Eo = this.LJLIL;
                AbstractC81613W1h abstractC81613W1h = null;
                if (c31883CfH == null || c31883CfH.LIZ == null || c31883CfH.LIZIZ == null || c29701Eo == null) {
                    return;
                }
                KL2.LJIILLIIL(0, c29701Eo);
                c29701Eo.cancelAnimation();
                c29701Eo.setProgress(0.0f);
                HashMap<String, Bitmap> hashMap = c31883CfH.LIZLLL;
                if (hashMap != null) {
                    c29701Eo.setImageAssetDelegate(new PO7(hashMap));
                }
                C0GY c0gy = (C0GY) ((WeakHashMap) C77126UOs.LIZ).get(c31883CfH.LIZ);
                try {
                    if (c0gy == null) {
                        Map<Class, InterfaceC81617W1l<?>> map = C81615W1j.LIZ;
                        if (map != null && ((HashMap) map).containsKey(AbstractC81613W1h.class) && (interfaceC81617W1l = (InterfaceC81617W1l) ((HashMap) C81615W1j.LIZ).get(AbstractC81613W1h.class)) != null) {
                            abstractC81613W1h = interfaceC81617W1l.LIZ();
                        }
                        c29701Eo.getContext();
                        abstractC81613W1h.LIZ(c31883CfH.LIZJ, new C81614W1i(c31883CfH, c29701Eo));
                        return;
                    }
                    c29701Eo.setComposition(c0gy);
                    c29701Eo.playAnimation();
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLILLLLZI = (TextView) findViewById(R.id.ln6);
        this.LJLIL = (C29701Eo) findViewById(R.id.ln5);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.LJLJL.LIZ(C73943T0h.LIZ().LJ(C19670pv.class).LJJJJZI(new AfS57S0100000_5(this, 45)));
        this.LJLIL.addAnimatorListener(new IDAListenerS81S0100000_14(this, 0));
    }
}
