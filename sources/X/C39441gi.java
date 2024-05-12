package X;

import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.livesdk.feed.tab.FeedUrlService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.util.List;

/* renamed from: X.1gi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C39441gi implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.LJLIL) {
            case 0:
                CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) this.LJLILLLLZI;
                copyrightViolationHelper.LJLJJL = false;
                copyrightViolationHelper.LJ(1);
                return;
            default:
                ((FeedUrlService) this.LJLILLLLZI).LJLIL = true;
                boolean LJI = BOX.LJI((List) obj);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("successfully, showLiveIconEntrance：");
                LIZ.append(LJI);
                C0NB.LJIIIZ("LiveIconGeneratorLog", X1D.LIZIZ(LIZ));
                ((IHostAction) CN1.LIZ(IHostAction.class)).notifyShowLiveIconEntrance(LJI);
                return;
        }
    }

    public /* synthetic */ C39441gi(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
