package X;

import com.ss.android.ugc.aweme.profile.popup.AddProfilePhotoAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8E5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8E5 extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C8E5 LJLIL = new C8E5();

    public C8E5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(AddProfilePhotoAssem.class);
        uiContentAssem.LJIIIIZZ = new AddProfilePhotoAssem();
        uiContentAssem.LJI = R.id.cnh;
        return C76800UCe.LIZ;
    }
}
