package X;

import Y.IDCListenerS283S0100000_7;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogService;
import kotlin.jvm.internal.AqS31S0301000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GiZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42279GiZ implements CreativeLoadingDialogService {
    public static final C42279GiZ LIZ = new C42279GiZ();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C42285Gif.LJLIL);
    public static final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());

    public static long LIZ() {
        return ((Number) LIZIZ.getValue()).longValue();
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogService
    public final CreativeLoadingDialog createLoadingDialog(Context context, int i, CreativeLoadingDialogBuilder builder) {
        EnumC42282Gic enumC42282Gic;
        EnumC42283Gid enumC42283Gid;
        String message;
        String message2;
        String message3;
        String message4;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(builder, "builder");
        int i2 = C42287Gih.LIZ[builder.getConfig().getCancelViewVisibleType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        enumC42282Gic = EnumC42282Gic.OTHER;
                    } else {
                        enumC42282Gic = EnumC42282Gic.CLOSE_GONE;
                    }
                } else {
                    enumC42282Gic = EnumC42282Gic.CLOSE_VISIBLE_15S;
                }
            } else {
                enumC42282Gic = EnumC42282Gic.CLOSE_VISIBLE_5S;
            }
        } else {
            enumC42282Gic = EnumC42282Gic.CLOSE_VISIBLE;
        }
        if (builder.getConfig().isShowProgress() && ((message4 = builder.getConfig().getMessage()) == null || message4.length() == 0)) {
            enumC42283Gid = EnumC42283Gid.PROGRESS;
        } else if (!builder.getConfig().isShowProgress() || (message3 = builder.getConfig().getMessage()) == null || message3.length() == 0) {
            if (!builder.getConfig().isShowProgress() && ((message2 = builder.getConfig().getMessage()) == null || message2.length() == 0)) {
                enumC42283Gid = EnumC42283Gid.DUAL_BALL;
            } else if (builder.getConfig().isShowProgress() || (message = builder.getConfig().getMessage()) == null || message.length() == 0) {
                enumC42283Gid = EnumC42283Gid.OTHER;
            } else {
                enumC42283Gid = EnumC42283Gid.DUAL_BALL_WITH_MESSAGE;
            }
        } else {
            enumC42283Gid = EnumC42283Gid.PROGRESS_WITH_MESSAGE;
        }
        C42278GiY c42278GiY = new C42278GiY(context, builder);
        DialogInterfaceOnShowListenerC42281Gib dialogInterfaceOnShowListenerC42281Gib = new DialogInterfaceOnShowListenerC42281Gib(i, enumC42283Gid, enumC42282Gic, builder);
        DialogC25753A8v dialogC25753A8v = c42278GiY.LIZJ;
        if (dialogC25753A8v != null) {
            dialogC25753A8v.setOnShowListener(dialogInterfaceOnShowListenerC42281Gib);
        }
        A90 a90 = c42278GiY.LIZLLL;
        if (a90 != null) {
            a90.setOnShowListener(dialogInterfaceOnShowListenerC42281Gib);
        }
        DialogC25756A8y dialogC25756A8y = c42278GiY.LJ;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.setOnShowListener(dialogInterfaceOnShowListenerC42281Gib);
        }
        DialogInterfaceOnDismissListenerC42280Gia dialogInterfaceOnDismissListenerC42280Gia = new DialogInterfaceOnDismissListenerC42280Gia(i, enumC42283Gid, enumC42282Gic, builder);
        DialogC25753A8v dialogC25753A8v2 = c42278GiY.LIZJ;
        if (dialogC25753A8v2 != null) {
            dialogC25753A8v2.setOnDismissListener(dialogInterfaceOnDismissListenerC42280Gia);
        }
        A90 a902 = c42278GiY.LIZLLL;
        if (a902 != null) {
            a902.setOnDismissListener(dialogInterfaceOnDismissListenerC42280Gia);
        }
        DialogC25756A8y dialogC25756A8y2 = c42278GiY.LJ;
        if (dialogC25756A8y2 != null) {
            dialogC25756A8y2.setOnDismissListener(dialogInterfaceOnDismissListenerC42280Gia);
        }
        IDCListenerS283S0100000_7 iDCListenerS283S0100000_7 = new IDCListenerS283S0100000_7(builder, 4);
        DialogC25753A8v dialogC25753A8v3 = c42278GiY.LIZJ;
        if (dialogC25753A8v3 != null) {
            dialogC25753A8v3.setOnCancelListener(iDCListenerS283S0100000_7);
        }
        A90 a903 = c42278GiY.LIZLLL;
        if (a903 != null) {
            a903.setOnCancelListener(iDCListenerS283S0100000_7);
        }
        DialogC25756A8y dialogC25756A8y3 = c42278GiY.LJ;
        if (dialogC25756A8y3 != null) {
            dialogC25756A8y3.setOnCancelListener(iDCListenerS283S0100000_7);
        }
        AqS31S0301000_7 aqS31S0301000_7 = new AqS31S0301000_7(i, enumC42283Gid, enumC42282Gic, builder, 0);
        A90 a904 = c42278GiY.LIZLLL;
        if (a904 != null) {
            a904.LJLJJLL = new C42284Gie(aqS31S0301000_7);
        }
        DialogC25756A8y dialogC25756A8y4 = c42278GiY.LJ;
        if (dialogC25756A8y4 != null) {
            dialogC25756A8y4.LJLJJLL = new C41440GOe(aqS31S0301000_7);
        }
        return c42278GiY;
    }
}
