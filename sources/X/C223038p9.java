package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.8p9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223038p9 implements InterfaceC86704Y1c {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final C224238r5 LIZJ;
    public final OcrLocation LIZLLL;
    public final ViewGroup LJ;
    public final CellAdaptionComponentAbility LJFF;

    @Override // X.InterfaceC86704Y1c
    public final C223048pA LIZ() {
        C223048pA I60;
        Aweme aweme = this.LIZIZ;
        if (aweme == null || aweme.getVideo() == null) {
            return new C223048pA(0, 0);
        }
        CellAdaptionComponentAbility cellAdaptionComponentAbility = this.LJFF;
        if (cellAdaptionComponentAbility == null || (I60 = cellAdaptionComponentAbility.I60(this.LIZ, this.LIZIZ, this.LIZLLL, this.LJ)) == null) {
            return this.LIZJ.LIZIZ(this.LIZ, this.LIZIZ, this.LJ);
        }
        return I60;
    }

    public C223038p9(Context context, Aweme aweme, C224238r5 feedAllScreenHelper, OcrLocation ocrLocation, ViewGroup viewGroup, CellAdaptionComponentAbility cellAdaptionComponentAbility) {
        o.LJIIIZ(feedAllScreenHelper, "feedAllScreenHelper");
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = feedAllScreenHelper;
        this.LIZLLL = ocrLocation;
        this.LJ = viewGroup;
        this.LJFF = cellAdaptionComponentAbility;
    }
}
