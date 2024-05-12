package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6EE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6EE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C6EJ c6ej, VideoPublishEditModel videoPublishEditModel, int i) {
        boolean z;
        String str;
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        if (c6ej == null) {
            return;
        }
        IECommerceAnchorService LJJJJI = ECommerceAnchorService.LJJJJI();
        if (c6ej.LIZ() == EnumC139485dg.ECOMMERCE.getScene()) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        String creationId = videoPublishEditModel.getCreationId();
        String str2 = videoPublishEditModel.mShootWay;
        int i2 = videoPublishEditModel.draftId;
        if (i2 > 0) {
            str = String.valueOf(i2);
        } else {
            str = null;
        }
        LJJJJI.LJJIIJ(valueOf, creationId, str2, str, H7R.LJIIIZ(videoPublishEditModel), H7R.LJIIIIZZ(videoPublishEditModel), videoPublishEditModel.getMusicId(), Integer.valueOf(i));
    }

    public static void LIZIZ(C6EJ c6ej, VideoPublishEditModel videoPublishEditModel, Boolean bool, Boolean bool2) {
        String str;
        boolean z;
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        Boolean bool3 = Boolean.TRUE;
        String str2 = null;
        if (o.LJ(bool, bool3)) {
            str = "1";
        } else if (!o.LJ(bool2, bool3)) {
            return;
        } else {
            str = "2";
        }
        if (c6ej == null) {
            return;
        }
        IECommerceAnchorService LJJJJI = ECommerceAnchorService.LJJJJI();
        if (c6ej.LIZ() == EnumC139485dg.ECOMMERCE.getScene()) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        String creationId = videoPublishEditModel.getCreationId();
        String str3 = videoPublishEditModel.enterFrom;
        String str4 = videoPublishEditModel.mShootWay;
        int i = videoPublishEditModel.draftId;
        if (i > 0) {
            str2 = String.valueOf(i);
        }
        LJJJJI.LJIIZILJ(valueOf, creationId, str3, str4, str2, H7R.LJIIIZ(videoPublishEditModel), H7R.LJIIIIZZ(videoPublishEditModel), videoPublishEditModel.getMusicId(), str, str);
    }
}
