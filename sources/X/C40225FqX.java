package X;

import X.C141335gf;
import X.C38048EwW;
import X.C3C5;
import X.C61328O5c;
import X.C76800UCe;
import X.EnumC38014Evy;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC38012Evw;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.bullet.utils.BulletMethodAdapter$javaMethodToBullet$1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FqX */
/* loaded from: classes7.dex */
public final class C40225FqX {
    public static final /* synthetic */ int LIZ = 0;

    public static /* synthetic */ BulletMethodAdapter$javaMethodToBullet$1 LIZIZ(F3T f3t, String str, InterfaceC38012Evw interfaceC38012Evw) {
        return LIZ(EnumC38014Evy.PRIVATE, f3t, interfaceC38012Evw, str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.bullet.utils.BulletMethodAdapter$javaMethodToBullet$1] */
    public static BulletMethodAdapter$javaMethodToBullet$1 LIZ(EnumC38014Evy methodAccess, F3T contextProviderFactory, InterfaceC38012Evw interfaceC38012Evw, String methodName) {
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        o.LJIIIZ(methodName, "methodName");
        o.LJIIIZ(methodAccess, "methodAccess");
        return new BaseBridgeMethod(methodAccess, contextProviderFactory, interfaceC38012Evw, methodName) { // from class: com.ss.android.ugc.aweme.bullet.utils.BulletMethodAdapter$javaMethodToBullet$1
            public final String LJLIL;
            public EnumC38014Evy LJLILLLLZI;
            public boolean LJLJI;
            public final /* synthetic */ F3T LJLJJI;
            public final /* synthetic */ InterfaceC38012Evw LJLJJL;

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

            @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
            public final boolean getNeedCallback() {
                return this.LJLJI;
            }

            @Override // X.AbstractC37121EhZ
            public final void setAccess(EnumC38014Evy enumC38014Evy) {
                o.LJIIIZ(enumC38014Evy, "<set-?>");
                this.LJLILLLLZI = enumC38014Evy;
            }

            @Override // X.AbstractC37121EhZ
            public final void setNeedCallback(boolean z) {
                this.LJLJI = z;
            }

            @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
            public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
                Object LIZ2;
                o.LJIIIZ(params, "params");
                o.LJIIIZ(iReturn, "iReturn");
                JSONObject optJSONObject = params.optJSONObject("res");
                C38048EwW webJsMsg = getWebJsMsg(params);
                if (this.LJLJJI.LIZIZ == null) {
                    this.LJLJJL.call(webJsMsg, optJSONObject);
                    this.LJLJI = webJsMsg.LJIIJ;
                    return;
                }
                try {
                    this.LJLJJL.call(webJsMsg, optJSONObject);
                    boolean z = webJsMsg.LJIIJ;
                    this.LJLJI = z;
                    if (z) {
                        iReturn.LIZIZ(optJSONObject);
                    }
                    LIZ2 = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
                if (m10exceptionOrNullimpl == null) {
                    return;
                }
                m10exceptionOrNullimpl.getMessage();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("fail to invoke JSB ");
                iReturn.LIZ(0, C61328O5c.LIZLLL(LIZ3, webJsMsg.LIZJ, ", error:", m10exceptionOrNullimpl, LIZ3));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(contextProviderFactory);
                this.LJLJJI = contextProviderFactory;
                this.LJLJJL = interfaceC38012Evw;
                this.LJLIL = methodName;
                this.LJLILLLLZI = methodAccess;
                this.LJLJI = true;
            }
        };
    }
}
