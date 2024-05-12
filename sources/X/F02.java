package X;

import android.content.Context;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F02 extends O6R {
    public final InterfaceC38012Evw LJLJJI;
    public final /* synthetic */ InterfaceC38012Evw LJLJJL;
    public final /* synthetic */ F09 LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ C60737Nsb LJLJLJ;

    @Override // X.O6R, X.InterfaceC60617Nqf
    public final void LJIJ(Context context) {
        BaseCommonJavaMethod baseCommonJavaMethod;
        o.LJIIIZ(context, "context");
        InterfaceC38012Evw interfaceC38012Evw = this.LJLJJI;
        if ((interfaceC38012Evw instanceof BaseCommonJavaMethod) && (baseCommonJavaMethod = (BaseCommonJavaMethod) interfaceC38012Evw) != null) {
            baseCommonJavaMethod.attach(new WeakReference<>(context));
        }
        C31926Cfy c31926Cfy = (C31926Cfy) this.LJLJLJ.LIZIZ(C31926Cfy.class);
        if (c31926Cfy != null) {
            c31926Cfy.LIZJ(Context.class, context);
        }
    }

    @Override // X.O6R
    public final void LJIL(C37955Ev1 call, String str, C37945Eur c37945Eur) {
        Object LIZ;
        o.LJIIIZ(call, "call");
        F09 f09 = this.LJLJJLL;
        InterfaceC38012Evw interfaceC38012Evw = this.LJLJJL;
        try {
            JSONObject jSONObject = new JSONObject();
            C38048EwW LJIL = F01.LJIL(call);
            String str2 = LJIL.LIZIZ;
            o.LJIIIIZZ(str2, "jsMsg.callback_id");
            f09.LIZJ(str2, c37945Eur);
            interfaceC38012Evw.call(LJIL, jSONObject);
            if (LJIL.LJIIJ) {
                c37945Eur.LIZ(1, "success", jSONObject);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        String str3 = this.LJLJL;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("fail to invoke JSB ", str3, ", error:");
            LIZIZ.append(m10exceptionOrNullimpl.getMessage());
            c37945Eur.LIZ(0, X1D.LIZIZ(LIZIZ), null);
        }
    }

    public F02(InterfaceC38012Evw interfaceC38012Evw, F09 f09, String str, C60737Nsb c60737Nsb) {
        this.LJLJJL = interfaceC38012Evw;
        this.LJLJJLL = f09;
        this.LJLJL = str;
        this.LJLJLJ = c60737Nsb;
        this.LJLJJI = interfaceC38012Evw;
    }
}
