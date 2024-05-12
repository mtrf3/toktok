package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.assem.VideoSelectionListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7L2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7L2 extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7L2 LJLIL = new C7L2();

    public C7L2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(VideoSelectionListAssem.class);
        uiContentAssem.LJIIIIZZ = new VideoSelectionListAssem();
        uiContentAssem.LJI = R.id.kkk;
        return C76800UCe.LIZ;
    }
}
