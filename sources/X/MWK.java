package X;

import com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment;

/* loaded from: classes10.dex */
public final class MWK extends AbstractC65781Prl implements InterfaceC65784Pro<CommentPreloadExperiment.Meta> {
    public static final MWK LJLIL = new MWK();

    public MWK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment$Meta, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final CommentPreloadExperiment.Meta invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        CommentPreloadExperiment.Meta meta = CommentPreloadExperiment.LIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "inbox_comment_preload", 31744, CommentPreloadExperiment.Meta.class, meta);
        if (LJIJ == 0) {
            return meta;
        }
        return LJIJ;
    }
}
