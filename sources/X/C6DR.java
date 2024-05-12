package X;

import Y.ACallableS43S0201000_2;
import Y.ACallableS80S0200000_2;
import Y.IDObjectS384S0100000_2;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6DR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DR implements IFetchEffectChannelListener {
    public final /* synthetic */ IEffectPlatformBaseListener LIZ;
    public final /* synthetic */ C1554568f LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prefetch fail err: ");
        LIZ.append(exceptionResult.getMsg());
        H7B.LIZJ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        if (C52510KjC.LIZ()) {
            C10K.LIZJ(new ACallableS80S0200000_2(this, effectChannelResponse2, 11));
        } else {
            Iterator<Effect> it = effectChannelResponse2.getAllCategoryEffects().iterator();
            while (it.hasNext()) {
                C10K.LIZJ(new ACallableS43S0201000_2(1, this, it.next(), 0));
            }
        }
        C1554568f c1554568f = this.LIZIZ;
        c1554568f.getClass();
        if (!((Boolean) C45458Hsk.LIZ.getValue()).booleanValue()) {
            Iterator it2 = ((ConcurrentHashMap) c1554568f.LIZ).keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str = (String) it2.next();
                if (((ConcurrentHashMap) c1554568f.LIZIZ).get(str) == null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("text font ");
                    LIZ.append(str);
                    LIZ.append(" is null");
                    H7B.LJ(X1D.LIZIZ(LIZ));
                    if (c1554568f.LIZJ == null) {
                        c1554568f.LIZJ = AVServiceImpl.LIZ().effectService().createFontEffectPlatform(C60903NvH.LJ);
                    }
                    c1554568f.LIZJ.LJI("textfont", true, new IDObjectS384S0100000_2(c1554568f, 7));
                }
            }
        }
        IEffectPlatformBaseListener iEffectPlatformBaseListener = this.LIZ;
        if (iEffectPlatformBaseListener != null) {
            iEffectPlatformBaseListener.onSuccess(null);
        }
    }

    public C6DR(C1554568f c1554568f, IEffectPlatformBaseListener iEffectPlatformBaseListener) {
        this.LIZIZ = c1554568f;
        this.LIZ = iEffectPlatformBaseListener;
    }
}
