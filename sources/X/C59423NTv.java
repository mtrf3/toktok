package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.NTv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59423NTv {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        return ((Boolean) C37200Eiq.LIZ.getValue()).booleanValue();
    }

    public static void LIZIZ(View view, Aweme aweme) {
        long j;
        o.LJIIIZ(view, "view");
        Activity LJIILL = C78949Uyf.LJIILL(view.getContext());
        if (aweme.isAd() && aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            o.LJI(awemeRawAd);
            if (awemeRawAd.isReportEnable()) {
                a.LJIILLIIL().LIZJ(LJIILL, C26042AJy.LIZJ("creative", aweme));
                return;
            }
        }
        if (aweme.isLive()) {
            C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
            o.LJIIIIZZ(LJJIJIL, "get().getService(ILiveOu…Service::class.java).live");
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData != null) {
                try {
                    String uid = newLiveRoomData.owner.getUid();
                    o.LJIIIIZZ(uid, "struct.owner.uid");
                    j = CastLongProtector.parseLong(uid);
                } catch (NumberFormatException e) {
                    C16880lQ.LLLLIIL(e);
                    j = 0;
                }
                LJJIJIL.LJJJZ(view.getContext(), newLiveRoomData.id, j, j, newLiveRoomData.owner.getSecUid(), aweme.getRequestId());
                return;
            }
            return;
        }
        a.LJIILLIIL().LJ(LJIILL, aweme);
    }
}
