package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.share.improve.action.whythisvid.WhyThisVideoModel;

/* renamed from: X.Ood, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63039Ood extends AbstractC65781Prl implements InterfaceC65784Pro<WhyThisVideoModel> {
    public static final C63039Ood LJLIL = new C63039Ood();

    public C63039Ood() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.share.improve.action.whythisvid.WhyThisVideoModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final WhyThisVideoModel invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("why_this_video_default_content", WhyThisVideoModel.class, null);
    }
}
