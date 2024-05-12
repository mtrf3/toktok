package com.ss.android.ugc.aweme.fe.method;

import X.C12460eI;
import X.C141335gf;
import X.C38049EwX;
import X.C3C5;
import X.C57422MgE;
import X.C61200O0e;
import X.C84763XOl;
import X.F0E;
import X.InterfaceC36488ETs;
import X.InterfaceC60761Nsz;
import X.Z9N;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.ab.ECommerceArchServiceImpl;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes7.dex */
public final class OpenSchemaMethod extends BaseCommonJavaMethod {
    public OpenSchemaMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenSchemaMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str;
        JSONObject jSONObject2;
        Context context;
        Activity activity;
        ContextWrapper contextWrapper;
        String str2;
        String optString;
        int hashCode;
        LifecycleOwner lifecycleOwner;
        Object LIZ;
        Object LIZ2;
        F0E f0e;
        InterfaceC60761Nsz interfaceC60761Nsz;
        View LIZJ;
        if (jSONObject != null) {
            str = jSONObject.optString("schema");
            jSONObject2 = jSONObject.optJSONObject("log_params");
        } else {
            str = null;
            jSONObject2 = null;
        }
        if (ECommerceArchServiceImpl.LIZIZ().LIZ()) {
            Uri parse = UriProtector.parse(str);
            try {
                LIZ = UriProtector.getQueryParameter(parse, "btm_c_code");
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            String str3 = (String) LIZ;
            try {
                LIZ2 = UriProtector.getQueryParameter(parse, "btm_d_code");
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th2) {
                LIZ2 = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (C3C5.m12isFailureimpl(LIZ2)) {
                LIZ2 = null;
            }
            String str4 = (String) LIZ2;
            WeakReference<F0E> weakReference = this.LJLIL;
            if (weakReference != null && (f0e = weakReference.get()) != null && (interfaceC60761Nsz = (InterfaceC60761Nsz) f0e.LIZ(InterfaceC60761Nsz.class)) != null && (LIZJ = interfaceC60761Nsz.LIZJ()) != null) {
                if (str3 == null) {
                    if (str4 != null) {
                        str3 = "c0";
                    }
                }
                if (str4 == null) {
                    str4 = "d0";
                }
                C12460eI.LJIILJJIL(LIZJ, str3, str4, null, null);
            }
        }
        if (jSONObject2 != null && (optString = jSONObject2.optString("from_card_type")) != null && ((hashCode = optString.hashCode()) == -157761233 ? optString.equals("music_card_shot") : hashCode == 745819626 ? optString.equals("trending_card") : !(hashCode != 1563961651 || !optString.equals("related_search_card")))) {
            ComponentCallbacks2 LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if ((LJIIIIZZ instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) LJIIIIZZ) != null) {
                Z9N.LIZIZ.LLILLIZIL(lifecycleOwner);
            }
        }
        if (this.LJLILLLLZI != null) {
            if (this.mContextRef.get() != null) {
                Context context2 = this.mContextRef.get();
                if (!(context2 instanceof Activity) || (activity = (Activity) context2) == null) {
                    if ((context2 instanceof MutableContextWrapper) && (contextWrapper = (ContextWrapper) context2) != null) {
                        context = contextWrapper.getBaseContext();
                    } else {
                        context = null;
                    }
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        activity = null;
                    }
                }
                Boolean liveHandled = LiveOuterService.LJJJLL().LJJIIJ().LIZIZ(activity, str);
                o.LJIIIIZZ(liveHandled, "liveHandled");
                if (liveHandled.booleanValue() || C61200O0e.LIZLLL().LJI(activity, str)) {
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    o.LJI(str);
                    if (s.LJJJLZIJ(str, "shoutouts/publish", false)) {
                        str2 = ujb.o.LJJJJZI(str, "aweme", "sslocal", false);
                        C57422MgE.LIZIZ(this.mContextRef.get(), str2, null, false);
                        return;
                    }
                }
                if (str != null) {
                    str2 = ujb.o.LJJJJZ(str, "aweme", "sslocal", false);
                } else {
                    str2 = null;
                }
                C57422MgE.LIZIZ(this.mContextRef.get(), str2, null, false);
                return;
            }
            C61200O0e.LIZLLL().LJII(str);
        }
    }
}
