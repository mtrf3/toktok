package X;

import com.ss.android.ugc.aweme.feed.assem.contentclassificationmask.ContentClassificationMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.contentclassificationmask.ContentClassificationMaskVM;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8J0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8J0 extends AbstractC65781Prl implements InterfaceC88473Ynt<ContentClassificationMaskAssem, C206898Ab, VideoMaskInfo, C76800UCe> {
    public static final C8J0 LJLIL = new C8J0();

    public C8J0() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(ContentClassificationMaskAssem contentClassificationMaskAssem, C206898Ab c206898Ab, VideoMaskInfo videoMaskInfo) {
        ContentClassificationMaskAssem selectSubscribe = contentClassificationMaskAssem;
        C206898Ab showMask = c206898Ab;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(showMask, "showMask");
        if (showMask.LIZ) {
            C8YN.LJIJI(selectSubscribe.p4(), new AqS169S0100000_3(selectSubscribe, 191));
            ContentClassificationMaskVM p4 = selectSubscribe.p4();
            p4.getClass();
            p4.setState(new AqS169S0100000_3(p4, 932));
        } else {
            selectSubscribe.Y3().setVisibility(8);
        }
        return C76800UCe.LIZ;
    }
}
