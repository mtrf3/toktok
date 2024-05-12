package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C213358Yx;
import X.C2U8;
import X.C50345JpN;
import X.F3T;
import X.InterfaceC37146Ehy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class MusicCollectNoticeMethod extends BaseBridgeMethod {
    public static final JSONObject LJLJI = new JSONObject();
    public final String LJLIL;
    public final C50345JpN LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicCollectNoticeMethod(F3T factory) {
        super(factory);
        o.LJIIIZ(factory, "factory");
        this.LJLIL = "musicCollectNotice";
        this.LJLILLLLZI = new C50345JpN(this.contextProviderFactory, "musicCollectNotice");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        try {
            String it = params.optString("id", "");
            o.LJIIIIZZ(it, "it");
            if (it.length() > 0 && 1 != 0) {
                Integer valueOf = Integer.valueOf(params.optInt("status", -1));
                int intValue = valueOf.intValue();
                if (intValue != 1 && intValue != 0) {
                    iReturn.LIZ(0, "collect status is not valid");
                    return;
                }
                C2U8.LIZ(new C213358Yx(it, valueOf.intValue(), true));
                iReturn.onSuccess(LJLJI);
                return;
            }
            iReturn.LIZ(0, "music id is not valid");
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "unknown exception";
            }
            iReturn.LIZ(0, message);
        }
    }
}
