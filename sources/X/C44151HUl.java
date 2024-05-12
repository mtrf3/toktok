package X;

import com.ss.android.ugc.aweme.services.external.IAnchorService;
import kotlin.jvm.internal.o;

/* renamed from: X.HUl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44151HUl extends AbstractC65781Prl implements InterfaceC65784Pro<C62J> {
    public static final C44151HUl LJLIL = new C44151HUl();

    public C44151HUl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.62J] */
    @Override // X.InterfaceC65784Pro
    public final C62J invoke() {
        return new IAnchorService() { // from class: X.62J
            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean isEditorProCaptionEnabled() {
                if (C00F.LIZ(31744, 0, "studio_new_asr_captions_and_editor_pro_config", true) != 3 || !C6AI.LIZ()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean isEditorProEffectEnabled() {
                return C1292855o.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean isEditorProEnabled() {
                return C145805ns.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean newRoundCornerUXOptimization() {
                return C58B.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final String getRealTitleString(String titleStr) {
                o.LJIIIZ(titleStr, "titleStr");
                C1292755n.LIZ.getClass();
                return C1292755n.LIZ(titleStr);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final boolean isFunctionEnabled(Integer num) {
                int value = EnumC1289754j.GENERAL.getValue();
                if (num == null || num.intValue() != value) {
                    int value2 = EnumC1289754j.EFFECT.getValue();
                    if (num == null || num.intValue() != value2) {
                        int value3 = EnumC1289754j.CAPTION.getValue();
                        if (num == null || num.intValue() != value3) {
                            return false;
                        }
                        return isEditorProCaptionEnabled();
                    }
                    return C1292855o.LIZ();
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAnchorService
            public final int downloadIntroVideoIfNeed(String func, String url) {
                o.LJIIIZ(func, "func");
                o.LJIIIZ(url, "url");
                return C82800Wea.LIZ(func, url, C62L.LJLIL, C62K.LJLIL);
            }
        };
    }
}
