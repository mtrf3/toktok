package X;

import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bwp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30423Bwp implements InterfaceC08050Th<LiveEffect> {
    public final /* synthetic */ TryModeBroadcastFragment LIZ;

    public C30423Bwp(TryModeBroadcastFragment tryModeBroadcastFragment) {
        this.LIZ = tryModeBroadcastFragment;
    }

    @Override // X.InterfaceC08050Th
    public final void LIZIZ(int i) {
        C1MZ liveFilterHelper;
        String str;
        VideoWidget videoWidget = this.LIZ.LLD;
        if (videoWidget == null || (liveFilterHelper = videoWidget.getLiveFilterHelper()) == null) {
            return;
        }
        liveFilterHelper.LJI(i);
        List LIZ = ((InterfaceC08070Tj) this.LIZ.LLFII.getValue()).LIZ();
        if (i >= LIZ.size() || (str = ((LiveEffect) ListProtector.get(LIZ, i)).getFilterId()) == null) {
            str = "";
        }
        if (str.length() > 0 && !o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
            this.LIZ.LJIIL().pv0(EffectRedDotStatusChangeEvent.class);
            C29702BlC LIZLLL = C18230nb.LIZLLL("ttlive_click_change_filter");
            LIZLLL.LJ("broadcast");
            LIZLLL.LIZLLL("select_filter_id", str);
            LIZLLL.LIZ(Integer.valueOf(i), "select_filter_position");
            LIZLLL.LJIIIZ();
        }
        C30355Bvj.LJII().LIZ(this.LIZ.getRoomId());
    }

    @Override // X.InterfaceC08050Th
    public final void LIZ(float f, FilterModel filterModel) {
        VideoWidget videoWidget = this.LIZ.LLD;
        if (videoWidget != null) {
            videoWidget.onFilterValueChange(filterModel, f);
        }
    }
}
