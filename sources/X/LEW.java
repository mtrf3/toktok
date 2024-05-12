package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.tablet.impl.settings.TabletCommentSplitSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LEW extends AbstractC65781Prl implements InterfaceC65784Pro<TabletCommentSplitSettings.TabletCommentSplitConfig> {
    public static final LEW LJLIL = new LEW();

    public LEW() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final TabletCommentSplitSettings.TabletCommentSplitConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        TabletCommentSplitSettings.TabletCommentSplitConfig tabletCommentSplitConfig = TabletCommentSplitSettings.LIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("tablet_comment_split", TabletCommentSplitSettings.TabletCommentSplitConfig.class, tabletCommentSplitConfig);
        if (LJIIIIZZ != 0) {
            tabletCommentSplitConfig = LJIIIIZZ;
        }
        o.LJIIIIZZ(tabletCommentSplitConfig, "SettingsManager.getInsta…java,\n        ) ?: config");
        return tabletCommentSplitConfig;
    }
}
