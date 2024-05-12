package X;

import com.ss.android.ugc.aweme.tag.api.MentionCheckResponse;
import com.ss.android.ugc.aweme.tag.api.TagUpdateResponse;
import com.ss.android.ugc.aweme.tag.api.VideoTagNetworkApi;

/* renamed from: X.9mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247069mo implements InterfaceC214228aw<InterfaceC246829mQ> {
    public final C247059mn LIZ = new InterfaceC246829mQ() { // from class: X.9mn
        @Override // X.InterfaceC246829mQ
        public final AbstractC73672Svk<MentionCheckResponse> mentionAwemeCheck(long j) {
            return VideoTagNetworkApi.LIZJ.mentionAwemeCheck(j);
        }

        @Override // X.InterfaceC246829mQ
        public final AbstractC73672Svk<TagUpdateResponse> tagUpdate(String str, String str2, long j) {
            return VideoTagNetworkApi.LIZJ.tagUpdate(str, str2, j);
        }

        @Override // X.InterfaceC246829mQ
        public final AbstractC73672Svk<MentionCheckResponse> mentionCheck(String str, String str2, boolean z, long j) {
            return VideoTagNetworkApi.LIZJ.mentionCheck(str, str2, z, j);
        }
    };

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ InterfaceC246829mQ getOperator() {
        return this.LIZ;
    }
}
