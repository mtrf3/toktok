package com.ss.android.ugc.aweme.audio.copyrightdetect;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetail;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class PreCheckResult extends BaseResponse {
    public static final /* synthetic */ int LJLIL = 0;

    @InterfaceC65349Pkn("match_details")
    public final ArrayList<MatchDetail> matchDetails;

    @InterfaceC65349Pkn("match_details_v1")
    public final ArrayList<MatchDetailsV1> matchDetailsV1;

    @InterfaceC65349Pkn("material_hash")
    public int materialHash;

    @InterfaceC65349Pkn("music_infos")
    public final ArrayList<MusicInfo> musicInfos;

    @InterfaceC65349Pkn("pre_check_id")
    public final String preCheckId;

    @InterfaceC65349Pkn("unavailable_reasons")
    public final ArrayList<UnavailableReason> unavailableReasons;

    @InterfaceC65349Pkn("un_availed_reason")
    public final int unavailableReasonsV1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreCheckResult)) {
            return false;
        }
        PreCheckResult preCheckResult = (PreCheckResult) obj;
        return o.LJ(this.musicInfos, preCheckResult.musicInfos) && o.LJ(this.matchDetails, preCheckResult.matchDetails) && o.LJ(this.matchDetailsV1, preCheckResult.matchDetailsV1) && o.LJ(this.unavailableReasons, preCheckResult.unavailableReasons) && this.unavailableReasonsV1 == preCheckResult.unavailableReasonsV1 && o.LJ(this.preCheckId, preCheckResult.preCheckId) && this.materialHash == preCheckResult.materialHash;
    }

    public final int hashCode() {
        return C79062V1e.LJ(this.preCheckId, (((this.unavailableReasons.hashCode() + ((this.matchDetailsV1.hashCode() + ((this.matchDetails.hashCode() + (this.musicInfos.hashCode() * 31)) * 31)) * 31)) * 31) + this.unavailableReasonsV1) * 31, 31) + this.materialHash;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append("\n {music_infos: ");
        LIZ.append(this.musicInfos);
        LIZ.append("; match_details: ");
        LIZ.append(this.matchDetails);
        LIZ.append("; unavailable_reasons: ");
        LIZ.append(this.unavailableReasons);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public PreCheckResult(ArrayList<MusicInfo> musicInfos, ArrayList<MatchDetail> matchDetails, ArrayList<MatchDetailsV1> matchDetailsV1, ArrayList<UnavailableReason> unavailableReasons, int i, String preCheckId, int i2) {
        o.LJIIIZ(musicInfos, "musicInfos");
        o.LJIIIZ(matchDetails, "matchDetails");
        o.LJIIIZ(matchDetailsV1, "matchDetailsV1");
        o.LJIIIZ(unavailableReasons, "unavailableReasons");
        o.LJIIIZ(preCheckId, "preCheckId");
        this.musicInfos = musicInfos;
        this.matchDetails = matchDetails;
        this.matchDetailsV1 = matchDetailsV1;
        this.unavailableReasons = unavailableReasons;
        this.unavailableReasonsV1 = i;
        this.preCheckId = preCheckId;
        this.materialHash = i2;
    }

    public /* synthetic */ PreCheckResult(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, arrayList2, arrayList3, arrayList4, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? "" : str, (i3 & 64) != 0 ? 0 : i2);
    }
}
