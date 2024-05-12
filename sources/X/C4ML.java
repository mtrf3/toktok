package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.4ML, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ML extends AbstractC65781Prl implements InterfaceC88472Yns<Keva, C76800UCe> {
    public static final C4ML LJLIL = new C4ML();

    public C4ML() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Keva keva) {
        Keva editKeva = keva;
        o.LJIIIZ(editKeva, "$this$editKeva");
        editKeva.storeInt("keva_key_display_shooting_tns_flag_new", C43988HOe.LIZIZ().getInt("keva_key_display_shooting_tns_flag_new", 0) + 1);
        return C76800UCe.LIZ;
    }
}
