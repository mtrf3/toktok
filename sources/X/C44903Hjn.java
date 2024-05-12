package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS189S0100000_7;

/* renamed from: X.Hjn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44903Hjn implements InterfaceC62720OjU {
    public final /* synthetic */ InterfaceC88471Ynr<Activity, C44913Hjx, C76800UCe> LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ C44913Hjx LIZJ;
    public final /* synthetic */ Aweme LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;

    @Override // X.InterfaceC62720OjU
    public final void LIZ() {
        G7G.LIZ(this.LIZLLL.getAid(), this.LIZLLL.getAuthorUid(), this.LJ, this.LJFF, "cancel");
    }

    @Override // X.InterfaceC62720OjU
    public final void LIZIZ() {
        this.LIZ.invoke(this.LIZIZ, this.LIZJ);
        G7G.LIZ(this.LIZLLL.getAid(), this.LIZLLL.getAuthorUid(), this.LJ, this.LJFF, "download");
    }

    public C44903Hjn(AqS189S0100000_7 aqS189S0100000_7, Activity activity, C44913Hjx c44913Hjx, Aweme aweme, String str, String str2) {
        this.LIZ = aqS189S0100000_7;
        this.LIZIZ = activity;
        this.LIZJ = c44913Hjx;
        this.LIZLLL = aweme;
        this.LJ = str;
        this.LJFF = str2;
    }
}
