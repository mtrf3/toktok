package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165756ex extends AbstractC29891Fh<InterfaceC166716gV> implements InterfaceC166716gV, InterfaceC135635Tz {
    public static final C165766ey LJLJL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLIL;
    public final InterfaceC166716gV LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final C5H3 LJLJJI;
    public C166246fk LJLJJL;
    public final C5H3 LJLJJLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.6ey] */
    static {
        TBT tbt = new TBT(C165756ex.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
        LJLJL = new Object() { // from class: X.6ey
        };
    }

    private final InterfaceC143655kP LJJLI() {
        return (InterfaceC143655kP) this.LJLJJI.getValue();
    }

    private final C165866f8 LJJLIIIIJ() {
        return (C165866f8) this.LJLJJLL.getValue();
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJLJ[0]);
    }

    @Override // X.InterfaceC166716gV
    public void Hy() {
        C141425go.LIZJ(LJJLI(), LLLLIL());
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC166716gV getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C165756ex(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 150));
    }

    @Override // X.InterfaceC166716gV
    public void bu(String voiceChangeTaskId) {
        o.LJIIIZ(voiceChangeTaskId, "voiceChangeTaskId");
        LJJLIIIIJ().LIZIZ(voiceChangeTaskId);
    }

    @Override // X.InterfaceC166716gV
    public void te(C166246fk cacheManager) {
        o.LJIIIZ(cacheManager, "cacheManager");
        if (this.LJLJJL != null) {
            return;
        }
        this.LJLJJL = cacheManager;
    }

    @Override // X.InterfaceC166716gV
    public String Jm(List<C166116fX> models, InterfaceC166046fQ listener) {
        o.LJIIIZ(models, "models");
        o.LJIIIZ(listener, "listener");
        return LJJLIIIIJ().LIZ(models, listener);
    }

    @Override // X.InterfaceC166716gV
    public void Ur(List<C166116fX> models, InterfaceC165816f3 listener) {
        String str;
        o.LJIIIZ(models, "models");
        o.LJIIIZ(listener, "listener");
        C165866f8 LJJLIIIIJ = LJJLIIIIJ();
        LJJLIIIIJ.getClass();
        C165956fH c165956fH = (C165956fH) LJJLIIIIJ.LJII.getValue();
        Context context = LJJLIIIIJ.LIZIZ;
        C165786f0 c165786f0 = new C165786f0(LJJLIIIIJ.LIZJ);
        c165956fH.getClass();
        o.LJIIIZ(context, "context");
        C166396fz c166396fz = new C166396fz(context, models, c165786f0);
        c165956fH.LIZJ = c166396fz;
        c166396fz.LJIIIZ = c165956fH.LIZIZ;
        if (e1.LIZ(31744, "vc_extract_over_upload", true, false)) {
            str = "exportOverUpload";
        } else {
            str = "exportAndUpload";
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C165796f1(listener, LJJLIIIIJ, str, null), 3);
    }

    @Override // X.InterfaceC166716gV
    public void bh0(InterfaceC143655kP editPreviewApi, Effect effect) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        C141425go.LJ(editPreviewApi, effect);
    }

    @Override // X.InterfaceC166716gV
    public void iK(C166116fX model, InterfaceC143655kP editPreviewApi, InterfaceC88471Ynr<? super Effect, ? super AudioEffectParam, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        C141425go.LIZIZ(model, editPreviewApi, interfaceC88471Ynr);
    }
}
