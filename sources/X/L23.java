package X;

import com.ss.android.ugc.aweme.story.experiment.PreloadConfig;

/* loaded from: classes10.dex */
public final class L23 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final L23 LJLIL = new L23();

    public L23() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (!((PreloadConfig) L26.LIZIZ.getValue()).coldStartOpt ? ((Number) C53196KuG.LIZ.getValue()).intValue() == 1 : C55723Ltv.LIZIZ.LJ().LIZ().getInt("story_bring_back_avatar_exp", ((Number) C53196KuG.LIZ.getValue()).intValue()) == 1) {
            C53578L1a.LIZ.getClass();
            if (C53578L1a.LIZ()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
