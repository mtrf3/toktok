package X;

import android.content.Context;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDislikeVersion;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Can, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31605Can implements IHostLongPressCallback {
    public final /* synthetic */ LongPressWidget LIZ;

    @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
    public final void onDislikePressed() {
        Aweme aweme;
        C86343Xud LJLZ = this.LIZ.LJLZ();
        String str = null;
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        if (aweme != null && aweme.isAd()) {
            C59050NFm c59050NFm = C59050NFm.LIZIZ;
            Context context = this.LIZ.context;
            o.LJIIIIZZ(context, "context");
            c59050NFm.LIZ(context, aweme, "live_ad", new AqS152S0200000_5(this.LIZ, aweme, 12), new AqS152S0200000_5(this.LIZ, aweme, 13));
            return;
        }
        if (LiveDislikeVersion.INSTANCE.getValue() > 1 && !this.LIZ.LJLJJI) {
            return;
        }
        C30868C9o.LIZJ(R.string.mg9);
        C86343Xud LJLZ2 = this.LIZ.LJLZ();
        if (LJLZ2 != null) {
            str = LJLZ2.LIZLLL;
        }
        C2U8.LIZ(new C55045Liz(aweme, str));
    }

    @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
    public final void onReportPressed() {
        Aweme aweme;
        LongPressWidget longPressWidget;
        C86343Xud LJLZ;
        LiveRoomStruct liveRoomStruct;
        C86343Xud LJLZ2 = this.LIZ.LJLZ();
        String str = null;
        if (LJLZ2 != null) {
            aweme = LJLZ2.LIZ;
            if (aweme != null && !aweme.isAd()) {
                C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
                if (LJJIJIL != null && (LJLZ = (longPressWidget = this.LIZ).LJLZ()) != null && (liveRoomStruct = LJLZ.LIZIZ) != null) {
                    long j = liveRoomStruct.id;
                    String uid = liveRoomStruct.owner.getUid();
                    o.LJIIIIZZ(uid, "struct.owner.uid");
                    long parseLong = CastLongProtector.parseLong(uid);
                    String uid2 = liveRoomStruct.owner.getUid();
                    o.LJIIIIZZ(uid2, "struct.owner.uid");
                    long parseLong2 = CastLongProtector.parseLong(uid2);
                    String secUid = liveRoomStruct.owner.getSecUid();
                    C86343Xud LJLZ3 = longPressWidget.LJLZ();
                    if (LJLZ3 != null) {
                        str = LJLZ3.LIZLLL;
                    }
                    String requestId = aweme.getRequestId();
                    if (requestId == null) {
                        requestId = "";
                    }
                    C28555BIp c28555BIp = new C28555BIp(j, parseLong, parseLong2, secUid, "long_press", str, "live_cell", "click", "report_anchor", requestId, (C28837BTl) null);
                    c28555BIp.LIZ = "full_screen";
                    LJJIJIL.LJLJLJ(longPressWidget.context, c28555BIp);
                    return;
                }
                return;
            }
        } else {
            aweme = null;
        }
        C59050NFm c59050NFm = C59050NFm.LIZIZ;
        Context context = this.LIZ.context;
        o.LJIIIIZZ(context, "context");
        c59050NFm.LJIIJ(context, aweme, "live_ad");
    }

    public C31605Can(LongPressWidget longPressWidget) {
        this.LIZ = longPressWidget;
    }
}
