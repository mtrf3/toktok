package X;

import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import kotlin.jvm.internal.o;

/* renamed from: X.SYh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72279SYh implements C8BG<Object> {
    public final /* synthetic */ PowerPageSource<Object> LJLIL;

    @Override // X.C8BG
    public final void LIZ(Object obj) {
    }

    @Override // X.C8BG
    public final void LIZIZ(Object obj) {
    }

    @Override // X.C8BG
    public final void LIZJ(SZP type) {
        o.LJIIIZ(type, "type");
    }

    @Override // X.C8BG
    public final void refresh() {
    }

    public C72279SYh(PowerPageSource<Object> powerPageSource) {
        this.LJLIL = powerPageSource;
    }

    @Override // X.C8BG
    public final void LIZLLL(SZP type, A2G<Object> value, boolean z) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(value, "value");
        this.LJLIL.defaultSource = new C208128Eu<>(type, value, z);
    }
}
