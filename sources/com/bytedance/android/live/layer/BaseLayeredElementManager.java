package com.bytedance.android.live.layer;

import X.AbstractC73672Svk;
import X.C3EO;
import X.C47661ty;
import X.C47671tz;
import X.C62705OjF;
import X.C73943T0h;
import X.CN1;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredElementConfig;
import com.bytedance.ies.sdk.widgets.LayeredElementConfigSetting;
import com.bytedance.ies.sdk.widgets.LayeredElementConfiguration;
import com.bytedance.ies.sdk.widgets.LayeredElementManager;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class BaseLayeredElementManager extends LayeredElementManager {
    public final Fragment LJLIL;

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final <V> C3EO<V, V> createRxTransformer() {
        return new C62705OjF();
    }

    static {
        boolean z;
        LayeredElementConfig value = LayeredElementConfigSetting.getValue();
        LayeredElementConfiguration layeredElementConfiguration = LayeredElementConfiguration.INSTANCE;
        layeredElementConfiguration.setGuidelineIndicatorEnabled(value.isGuidelineIndicatorEnabled());
        layeredElementConfiguration.setAnimationDuration(value.getAnimationDuration());
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            z = iHostAppContext.isLocalTest();
        } else {
            z = false;
        }
        layeredElementConfiguration.setDebug(z);
        layeredElementConfiguration.setSladarReporter(C47661ty.LJLIL);
        layeredElementConfiguration.setUseAlphaOpt(C47671tz.LJLIL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final <V> AbstractC73672Svk<V> createRxObservable(Class<V> cls) {
        return C73943T0h.LIZ().LJ(cls);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLayeredElementManager(Context context, Fragment fragment, LayeredConstraintLayout layeredConstraintLayout, DataChannel dataChannel) {
        super(context, fragment, layeredConstraintLayout, dataChannel);
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
    }
}
