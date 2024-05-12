package X;

import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.LqY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55514LqY implements InterfaceC55510LqU {
    public final /* synthetic */ TalentAdRevenueShareServiceImpl LIZ;

    public C55514LqY(TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl) {
        this.LIZ = talentAdRevenueShareServiceImpl;
    }

    @Override // X.InterfaceC55510LqU
    public final void LIZ(String tag, String label, String creativeId, JSONObject extraJson) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(label, "label");
        o.LJIIIZ(creativeId, "creativeId");
        o.LJIIIZ(extraJson, "extraJson");
        this.LIZ.LJ(creativeId, extraJson);
    }
}
