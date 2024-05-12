package defpackage;

import X.InterfaceC139745e6;
import X.InterfaceC84498XEg;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;

/* loaded from: classes8.dex */
public final class x1 {
    public static InterfaceC84498XEg LIZ;
    public static final a LIZIZ = new a();

    /* loaded from: classes8.dex */
    public static final class a implements InterfaceC139745e6<IEffectService> {
        public EffectService LJLIL;

        @Override // X.InterfaceC139745e6
        public final IEffectService get() {
            if (this.LJLIL == null) {
                this.LJLIL = EffectService.Companion.getInstance();
            }
            return this.LJLIL;
        }
    }
}
