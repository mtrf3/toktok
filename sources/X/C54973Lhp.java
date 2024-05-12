package X;

import Y.ACallableS109S0100000_6;
import android.os.Handler;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lhp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C54973Lhp implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C54980Lhw c54980Lhw;
        switch (this.LJLIL) {
            case 0:
                Handler handler = (Handler) this.LJLILLLLZI;
                if (handler != null) {
                    handler.sendMessage(handler.obtainMessage(32));
                    return;
                }
                return;
            case 1:
                PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) this.LJLILLLLZI;
                portraitAudienceInteractionFragment.getClass();
                obj.getClass();
                portraitAudienceInteractionFragment.Cn("long_press_button");
                portraitAudienceInteractionFragment.xn("long_press_button", true);
                DataChannelGlobal.LJLJJI.sv0(ScreenClearEvent.class, Boolean.TRUE);
                return;
            default:
                FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) this.LJLILLLLZI;
                feedRecommendFragment.getClass();
                if (((Boolean) obj).booleanValue() && (c54980Lhw = feedRecommendFragment.LLIIIJ) != null) {
                    AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) c54980Lhw.LJLIL;
                    C54972Lho c54972Lho = feedRecommendFragment.LJLLI;
                    if (C36872EdY.LIZIZ || C36872EdY.LIZ || abstractC51036K1g == null || c54972Lho == null || !e1.LIZ(31744, "reuse_feed_for_cold_boot", true, false) || !C84763XOl.LJIIJJI) {
                        return;
                    }
                    C36872EdY.LIZ = true;
                    FeedItemList feedItemList = (FeedItemList) abstractC51036K1g.getData();
                    List items = abstractC51036K1g.getItems();
                    int i = c54972Lho.LIZIZ + 1;
                    if (items != null && i < items.size()) {
                        if (i < items.size()) {
                            items.subList(0, i).clear();
                        }
                        if (!items.isEmpty() && items.size() > 2) {
                            items.subList(2, items.size()).clear();
                        }
                        o.LJIIIIZZ(feedItemList, "feedItemList");
                        C10K.LIZJ(new ACallableS109S0100000_6(feedItemList, 27));
                        return;
                    }
                    C36872EdY.LIZ = false;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ C54973Lhp(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
