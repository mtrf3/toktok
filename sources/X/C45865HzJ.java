package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import kotlin.jvm.internal.o;

/* renamed from: X.HzJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45865HzJ implements IEffectPlatformBaseListener<C76800UCe> {
    public final /* synthetic */ C45864HzI LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(C76800UCe c76800UCe) {
        Object value = this.LIZ.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        ((Keva) value).storeLong("text_font_last_prefetch", this.LIZIZ);
    }

    public C45865HzJ(C45864HzI c45864HzI, long j) {
        this.LIZ = c45864HzI;
        this.LIZIZ = j;
    }
}
