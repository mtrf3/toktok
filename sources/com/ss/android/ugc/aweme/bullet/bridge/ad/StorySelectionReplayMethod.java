package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C2U8;
import X.C40492Fuq;
import X.C40493Fur;
import X.C59207NLn;
import X.C60193Njp;
import X.F2Y;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.lang.reflect.GenericDeclaration;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class StorySelectionReplayMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZJ() {
        GenericDeclaration genericDeclaration;
        int i;
        if (C59207NLn.LIZ()) {
            genericDeclaration = SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.class;
        } else {
            genericDeclaration = C60193Njp.class;
        }
        F2Y LIZ = this.contextProviderFactory.LIZ(genericDeclaration);
        if (LIZ != null) {
            Object LIZIZ = LIZ.LIZIZ();
            if (LIZIZ != null) {
                i = LIZIZ.hashCode();
            } else {
                i = 0;
            }
            C2U8.LIZ(new C40492Fuq(i));
        }
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorySelectionReplayMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "storySelectionReplay";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        Object opt = params.opt("index");
        if (o.LJ(opt, 1)) {
            LIZJ();
            return;
        }
        if (o.LJ(opt, 2)) {
            C2U8.LIZ(new C40493Fur(2));
        } else if (o.LJ(opt, 3)) {
            C2U8.LIZ(new C40493Fur(3));
        } else {
            LIZJ();
        }
    }
}
