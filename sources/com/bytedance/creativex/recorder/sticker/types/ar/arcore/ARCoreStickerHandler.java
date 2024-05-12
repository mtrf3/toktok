package com.bytedance.creativex.recorder.sticker.types.ar.arcore;

import X.C16880lQ;
import X.C29S;
import X.C78862UxG;
import X.C81396Vx2;
import X.C83627Wrv;
import X.C83728WtY;
import X.ERS;
import X.ESP;
import X.EnumC83729WtZ;
import X.H78;
import X.ID0;
import X.InterfaceC81397Vx3;
import X.InterfaceC82086WJm;
import X.T4Q;
import X.VK3;
import X.VK4;
import X.VK5;
import X.VK6;
import X.VK7;
import X.VK8;
import X.VK9;
import X.WRQ;
import Y.ARunnableS33S0200000_14;
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class ARCoreStickerHandler extends ESP implements GenericLifecycleObserver, InterfaceC81397Vx3 {
    public final Activity LJLILLLLZI;
    public final InterfaceC82086WJm LJLJI;

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        C83627Wrv Bc = this.LJLJI.Bc();
        VK8 vk8 = new VK8();
        C78862UxG LIZIZ = C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_PROP_CANCEL, null);
        Bc.getClass();
        C83627Wrv.LIZIZ(Bc, "action_name_switch_ar_mode", LIZIZ, new C81396Vx2(vk8, false));
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        if (!ID0.LIZLLL(effect)) {
            return false;
        }
        return effect.getTypes().contains("ARCore");
    }

    public ARCoreStickerHandler(C29S activity, C29S lifecycleOwner, WRQ cameraApiComponent) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LJLILLLLZI = activity;
        this.LJLJI = cameraApiComponent;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 80) {
            H78.LJI("ARCoreStickerHandler received msg");
            if (TextUtils.isEmpty(str)) {
                H78.LJI("ARCoreStickerHandler arg3 is empty");
                return;
            }
            try {
                VK8 vk8 = new VK8();
                JSONObject jSONObject = new JSONObject(str);
                vk8.LIZ = VK7.values()[jSONObject.optInt("augmentedFaceMode", 0)];
                vk8.LIZIZ = VK4.values()[jSONObject.optInt("cloudAnchorMode", 0)];
                vk8.LIZJ = VK5.values()[jSONObject.optInt("depthMode", 0)];
                vk8.LIZLLL = VK3.values()[jSONObject.optInt("focusMode", 0)];
                vk8.LJ = VK6.values()[jSONObject.optInt("lightEstimationMode", 0)];
                vk8.LJFF = VK9.values()[jSONObject.optInt("planeFindingMode", 0)];
                this.LJLILLLLZI.runOnUiThread(new ARunnableS33S0200000_14(vk8, this, 5));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
