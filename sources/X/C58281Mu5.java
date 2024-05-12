package X;

import com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule;
import com.ss.android.ugc.aweme.ad.prerender.PreRenderWebViewManager;

/* renamed from: X.Mu5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58281Mu5 extends AbstractC65781Prl implements InterfaceC65784Pro<IPreRenderLandPageModule> {
    public static final C58281Mu5 INSTANCE = new C58281Mu5();

    public C58281Mu5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IPreRenderLandPageModule invoke() {
        return PreRenderWebViewManager.LIZ();
    }
}
