package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import kotlin.jvm.internal.o;

/* renamed from: X.Hgr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44721Hgr extends AbstractC65781Prl implements InterfaceC88472Yns<AutoCutThemeData, Boolean> {
    public static final C44721Hgr LJLIL = new C44721Hgr();

    public C44721Hgr() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(AutoCutThemeData autoCutThemeData) {
        boolean z;
        AutoCutThemeData it = autoCutThemeData;
        o.LJIIIZ(it, "it");
        if (it.isPreset && it.LIZ() == C63A.ACTION_AI) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
