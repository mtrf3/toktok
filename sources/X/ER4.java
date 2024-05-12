package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.effectlogic.AnnotationEffectExportLogic", f = "AnnotationEffectExportLogic.kt", l = {105, 107}, m = "saveIcon")
/* loaded from: classes7.dex */
public final class ER4 extends C3CS {
    public ER5 LJLIL;
    public Effect LJLILLLLZI;
    public UploadableMobileEffect2 LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ ER5 LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ER4(ER5 er5, InterfaceC67352kd<? super ER4> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = er5;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZIZ(null, null, this);
    }
}
