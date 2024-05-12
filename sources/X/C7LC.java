package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems.MessageRequestEmptyAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7LC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7LC extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7LC LJLIL = new C7LC();

    public C7LC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(MessageRequestEmptyAssem.class);
        uiContentAssem.LJIIIIZZ = new MessageRequestEmptyAssem();
        uiContentAssem.LJI = R.id.kyu;
        return C76800UCe.LIZ;
    }
}
