package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.AnonymousClass114;
import X.C221108m2;
import X.C279017q;
import X.C36821Ecj;
import X.C45804HyK;
import X.C50345JpN;
import X.C62822Ol8;
import X.C62905OmT;
import X.EnumC50341JpJ;
import X.F2Y;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class FollowPACheckMethod extends BaseBridgeMethod {
    public final C62822Ol8 LJLIL;
    public final String LJLILLLLZI;
    public final C50345JpN LJLJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowPACheckMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(contextProviderFactory, 174));
        this.LJLILLLLZI = "followPACheckMethod";
        this.LJLJI = new C50345JpN(contextProviderFactory, "followPACheckMethod", EnumC50341JpJ.STABLE);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        F2Y f2y;
        Context context;
        Activity LJIJJ;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (!this.LJLJI.LIZ(params, iReturn) && (f2y = (F2Y) this.LJLIL.getValue()) != null && (context = (Context) f2y.LIZIZ()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            C36821Ecj<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
            Integer followCount = privacyAccountFollowCount.LIZ();
            if (followCount == null || followCount.intValue() != 0) {
                o.LJIIIIZZ(followCount, "followCount");
                if (followCount.intValue() >= 1 && followCount.intValue() < 4) {
                    AnonymousClass114.LIZ(LJIJJ, R.string.pao);
                }
            } else {
                C62905OmT c62905OmT = new C62905OmT(LJIJJ);
                c62905OmT.LIZ(R.string.pan);
                c62905OmT.LJIIJ(R.string.h3a, null);
                C279017q.LIZLLL(c62905OmT);
            }
            privacyAccountFollowCount.LIZLLL(Integer.valueOf(followCount.intValue() + 1));
        }
    }
}
