package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.17m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C278617m implements InterfaceC48038ItG {
    public final /* synthetic */ int LJLIL;

    public /* synthetic */ C278617m(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.LJLIL) {
            case 0:
                return Integer.valueOf(obj.hashCode());
            default:
                return ((IEffectService) CN1.LIZ(IEffectService.class)).convertStickerBean((Effect) obj);
        }
    }
}
