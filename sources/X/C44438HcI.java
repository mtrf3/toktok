package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HcI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44438HcI implements IFetchEffectListByIdsListener {
    public final /* synthetic */ C44436HcG LIZ;
    public final /* synthetic */ java.util.Map<String, String> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult e) {
        int i;
        o.LJIIIZ(e, "e");
        switch (e.getErrorCode()) {
            case 2002:
            case 2004:
                i = R.string.fyi;
                break;
            case 2003:
                i = R.string.eh_;
                break;
            case 2005:
            default:
                i = R.string.g85;
                break;
            case 2006:
                i = R.string.tg4;
                break;
        }
        C29S c29s = this.LIZ.LIZIZ;
        if (c29s != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(i);
            C78915Uy7.LJJIIZI(c29s, 3060, creativeToastBuilder);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        C44440HcK c44440HcK;
        EffectListResponse response = effectListResponse;
        o.LJIIIZ(response, "response");
        this.LIZ.LIZJ.Lv().LIZIZ(response.getUrlPrefix());
        List<Effect> data = response.getData();
        if (C32151Nz.LJJIIJZLJL(data)) {
            return;
        }
        Effect effect = (Effect) ListProtector.get(data, 0);
        C44436HcG c44436HcG = this.LIZ;
        I0N i0n = c44436HcG.LIZJ;
        boolean z = c44436HcG.LIZLLL.putPresetStickerAtFirst;
        if (ID0.LJIIZILJ(effect)) {
            c44440HcK = null;
        } else {
            c44440HcK = new C44440HcK(this.LIZ);
        }
        C82398WVm.LJ(i0n, data, z, true, c44440HcK, false, null, 0, 16352);
        this.LIZ.LJIIL(effect);
    }

    public C44438HcI(C44436HcG c44436HcG, java.util.Map<String, String> map) {
        this.LIZ = c44436HcG;
        this.LIZIZ = map;
    }
}
