package com.ss.android.ugc.aweme.ecommerce.core.jsb;

import X.C78983UzD;
import X.C82954Wh4;
import X.EnumC38014Evy;
import X.F3T;
import X.InterfaceC37146Ehy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class GetInfoByOCRMethodBullet extends BaseBridgeMethod {
    public final String LJLIL;
    public EnumC38014Evy LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInfoByOCRMethodBullet(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "pipo.getInfoByOcr";
        this.LJLILLLLZI = EnumC38014Evy.PRIVATE;
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLILLLLZI = enumC38014Evy;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        try {
            GetInfoByOCRMethod.LJLJI.getClass();
            C82954Wh4.LIZ(iReturn, null, params);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            iReturn.LIZ(-1, e.toString());
        }
    }
}
