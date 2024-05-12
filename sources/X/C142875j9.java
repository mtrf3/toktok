package X;

import com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5j9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C142875j9 extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C142875j9(NowsEditRootScene nowsEditRootScene) {
        super(0, nowsEditRootScene, NowsEditRootScene.class, "nextStep", "nextStep()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        NowsEditRootScene nowsEditRootScene = (NowsEditRootScene) this.receiver;
        VideoPublishEditModel videoPublishEditModel = nowsEditRootScene.LJLL;
        if (videoPublishEditModel != null) {
            C152165y8.LJII(videoPublishEditModel, new AqS152S0100000_2(nowsEditRootScene, 132));
            return C76800UCe.LIZ;
        }
        o.LJIJI("model");
        throw null;
    }
}
