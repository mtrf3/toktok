package X;

import android.widget.FrameLayout;
import com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService;

/* renamed from: X.Y4l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86791Y4l extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C86789Y4j LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86791Y4l(C86789Y4j c86789Y4j, int i, String str) {
        super(0);
        this.LJLIL = c86789Y4j;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C86789Y4j c86789Y4j = this.LJLIL;
        c86789Y4j.LJLJL = this.LJLILLLLZI;
        ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = c86789Y4j.LJLIL;
        if (iLiveGiftDelegatePlayerService != null) {
            iLiveGiftDelegatePlayerService.start(c86789Y4j.LJLILLLLZI, this.LJLJI, 0L);
        }
        C86789Y4j c86789Y4j2 = this.LJLIL;
        FrameLayout frameLayout = c86789Y4j2.LJLJJL;
        if (frameLayout != null) {
            frameLayout.postDelayed(c86789Y4j2.LJLL, 20000L);
        }
        return C76800UCe.LIZ;
    }
}
