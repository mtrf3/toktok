package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.C173796rv;
import X.C29S;
import X.C5NP;
import X.C5SL;
import X.ERS;
import X.ESP;
import X.ID0;
import X.InterfaceC81397Vx3;
import X.InterfaceC82937Wgn;
import X.RunnableC82936Wgm;
import X.T4Q;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class SavePhotoStickerHandler extends ESP implements GenericLifecycleObserver, InterfaceC81397Vx3 {
    public final SafeHandler LJLILLLLZI;
    public Effect LJLJI;
    public final C29S LJLJJI;
    public final InterfaceC82937Wgn LJLJJL;
    public final C5NP LJLJJLL;

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJI = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return ID0.LJIJI(session.LIZ);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        String extra;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        this.LJLJI = effect;
        if (effect != null && (extra = effect.getExtra()) != null) {
            try {
                if (!TextUtils.isEmpty(new JSONObject(extra).optString("hint_for_saving_captured_image"))) {
                    this.LJLJJL.LIZIZ(this.LJLJJI, this.LJLJI);
                }
            } catch (Exception e) {
                this.LJLJJLL.LIZIZ(e);
            }
        }
    }

    public SavePhotoStickerHandler(C29S activity, C173796rv c173796rv, LifecycleOwner lifecycleOwner) {
        C5SL c5sl = C5SL.LIZ;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJJI = activity;
        this.LJLJJL = c173796rv;
        this.LJLJJLL = c5sl;
        this.LJLILLLLZI = new SafeHandler(lifecycleOwner);
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (!ID0.LJIJI(this.LJLJI) || i3 != 0) {
            return;
        }
        this.LJLILLLLZI.post(new RunnableC82936Wgm(this, i, i2, str));
    }
}
