package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.4In, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107174In extends AbstractC65781Prl implements InterfaceC88472Yns<Keva, C76800UCe> {
    public static final C107174In LJLIL = new C107174In();

    public C107174In() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Keva keva) {
        Keva editKeva = keva;
        o.LJIIIZ(editKeva, "$this$editKeva");
        editKeva.storeInt("keva_key_display_album_tns_flag_new", C43988HOe.LIZIZ().getInt("keva_key_display_album_tns_flag_new", 0) + 1);
        return C76800UCe.LIZ;
    }
}
