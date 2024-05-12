package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import kotlin.jvm.internal.o;

/* renamed from: X.Hgp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44719Hgp extends AbstractC65781Prl implements InterfaceC88472Yns<AutoCutThemeData, Boolean> {
    public static final C44719Hgp LJLIL = new C44719Hgp();

    public C44719Hgp() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(AutoCutThemeData autoCutThemeData) {
        boolean z;
        AutoCutThemeData it = autoCutThemeData;
        o.LJIIIZ(it, "it");
        if (it.LIZ() == C63A.SOUND_SYNC) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
