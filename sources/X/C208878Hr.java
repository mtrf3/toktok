package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8Hr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208878Hr {
    public static final void LIZ(Aweme aweme, Context context, String str, String eventType, boolean z, boolean z2) {
        String toastMessage;
        String str2 = str;
        o.LJIIIZ(aweme, "<this>");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(eventType, "eventType");
        if (MSAdaptionService.LJIIL().LJI(context)) {
            C30869C9p.LIZIZ(context, "Camera is only available in the single screen mod");
            return;
        }
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        if (!C220858ld.LIZ(aweme)) {
            EnumC44070HRi LIZIZ = C220858ld.LIZIZ(aweme);
            IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.LIZ().configService().shortVideoConfig();
            if (LIZIZ == EnumC44070HRi.VIDEO_LENGTH_RESTRICT) {
                toastMessage = shortVideoConfig.getErrorHintWhenDisableDuetOrStitch(1);
            } else {
                toastMessage = context.getString(R.string.f0q);
            }
            o.LJIIIIZZ(toastMessage, "toastMessage");
            if (toastMessage.length() > 0) {
                C30869C9p.LIZIZ(context, toastMessage);
                return;
            }
            return;
        }
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ != null) {
            ShareDependService.LIZ.getClass();
            ShareDependService LIZ2 = C44498HdG.LIZ();
            OSZ[] oszArr = new OSZ[5];
            oszArr[0] = new OSZ("group_id", aweme.getAid());
            String authorUid = aweme.getAuthorUid();
            if (authorUid == null) {
                authorUid = "";
            }
            oszArr[1] = new OSZ("author_id", authorUid);
            oszArr[2] = new OSZ("enter_from", eventType);
            if (str2 == null) {
                str2 = "";
            }
            oszArr[3] = new OSZ("panel_source", str2);
            oszArr[4] = new OSZ("enter_method", "click_duet_button");
            LIZ2.LJJIJIL(LIZ, aweme, LJJLIIIJ, eventType, C113554cx.LJJL(oszArr), z, z2);
        }
    }
}
