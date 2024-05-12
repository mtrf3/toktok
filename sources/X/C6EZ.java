package X;

import com.ss.android.ugc.aweme.anchor.service.AnchorListServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.6EZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6EZ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ == null || !LJ.LJIIIZ() || !e1.LIZ(31744, "enable_sub_only_video", true, false)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (LIZ() && !C78983UzD.LJJJJJL(model) && !AnchorListServiceImpl.LIZLLL().LIZJ(EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE())) {
            return true;
        }
        return false;
    }
}
