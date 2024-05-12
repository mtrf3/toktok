package X;

import com.ss.android.ugc.aweme.innerpush.settings.PullSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Xxa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86526Xxa extends AbstractC65781Prl implements InterfaceC65784Pro<PullSettings.MetaData> {
    public static final C86526Xxa LJLIL = new C86526Xxa();

    public C86526Xxa() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final PullSettings.MetaData invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PullSettings.MetaData metaData = PullSettings.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "in_app_push_pull_strategy", 31744, PullSettings.MetaData.class, metaData);
        if (LJIJ != 0) {
            metaData = LJIJ;
        }
        o.LJIIIIZZ(metaData, "ABManager.getInstance().…s::class.java) ?: DEFAULT");
        return metaData;
    }
}
