package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import kotlin.jvm.internal.o;

/* renamed from: X.Hgt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44723Hgt extends AbstractC65781Prl implements InterfaceC88472Yns<AutoCutThemeData, Boolean> {
    public static final C44723Hgt LJLIL = new C44723Hgt();

    public C44723Hgt() {
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
