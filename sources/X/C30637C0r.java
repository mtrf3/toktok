package X;

import Y.ACListenerS23S0100100_5;
import android.content.Context;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCustomPollMigrateShortTouchSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.PollShortTouchUrl;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.C0r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30637C0r {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, C04120Ee customPollInfo) {
        PollMessage pollMessage;
        Context context;
        C31220CNc c31220CNc;
        o.LJIIIZ(customPollInfo, "customPollInfo");
        Integer num = C30627C0h.LJLJJI.get(j);
        if ((num == null || num.intValue() != 1) && C30627C0h.LJLZ && (pollMessage = customPollInfo.LJI) != null && (context = C30627C0h.LJLJLJ) != null) {
            long j2 = -1;
            if (customPollInfo.LIZIZ != -1) {
                j2 = customPollInfo.LIZJ;
            }
            IShortTouchService iShortTouchService = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
            if (LiveCustomPollMigrateShortTouchSetting.m64native()) {
                AbstractC77108UOa a40 = iShortTouchService.a40(context, j2, new UOT(EnumC30639C0t.LOTTIE), new ACListenerS23S0100100_5(j, customPollInfo, 0));
                C30627C0h.LJIILLIIL(j, new C30638C0s(a40));
                c31220CNc = a40;
            } else {
                if (!LiveCustomPollMigrateShortTouchSetting.lynx()) {
                    return;
                }
                Context context2 = C30627C0h.LJLJLJ;
                android.net.Uri build = UriProtector.parse(PollShortTouchUrl.INSTANCE.getUrl()).buildUpon().appendQueryParameter("poll_end_time", String.valueOf(j2)).appendQueryParameter("poll_id", String.valueOf(pollMessage.pollId)).build();
                o.LJIIIIZZ(build, "parse(PollShortTouchUrl.…                 .build()");
                c31220CNc = iShortTouchService.FX(context2, build, "shortTouchCustomPoll", false);
            }
            if (c31220CNc != null) {
                C30636C0q c30636C0q = new C30636C0q(c31220CNc, j, customPollInfo);
                if (!customPollInfo.LJIIIZ) {
                    C0NB.LIZIZ("PollShortTouchHelper", "add Touch with preview");
                    iShortTouchService.B10(c30636C0q, new C3A(context));
                    customPollInfo.LJIIIZ = true;
                } else {
                    C0NB.LIZIZ("PollShortTouchHelper", "add Touch without preview");
                    iShortTouchService.B10(c30636C0q, null);
                }
            }
        }
    }
}
