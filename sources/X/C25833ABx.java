package X;

import com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment;
import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.captionsheet.LandscapeCaptionPanelFragment;
import com.ss.android.ugc.aweme.captionsheet.TranscriptPanelFragment;
import com.ss.android.ugc.aweme.captionsheet.TranslationPanelFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.ABx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25833ABx {
    public final C25832ABw LIZ;

    public C25833ABx(C25832ABw sheetContext) {
        o.LJIIIZ(sheetContext, "sheetContext");
        this.LIZ = sheetContext;
    }

    public final BaseCaptionSheetFragment LIZ(EnumC25835ABz type) {
        BaseCaptionSheetFragment landscapeCaptionPanelFragment;
        o.LJIIIZ(type, "type");
        int i = C25834ABy.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        landscapeCaptionPanelFragment = new TranscriptPanelFragment(0);
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    landscapeCaptionPanelFragment = new TranslationPanelFragment(0);
                }
            } else {
                landscapeCaptionPanelFragment = new CaptionsPanelFragment(0);
            }
        } else {
            landscapeCaptionPanelFragment = new LandscapeCaptionPanelFragment(0);
        }
        C25832ABw c25832ABw = this.LIZ;
        o.LJIIIZ(c25832ABw, "<set-?>");
        landscapeCaptionPanelFragment.LJLIL = c25832ABw;
        return landscapeCaptionPanelFragment;
    }
}
