package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.PronounsAPI;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.model.PronounResponse;

/* renamed from: X.9TF, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9TF implements InterfaceC214228aw<C9GV> {
    public final C9TE LIZ = new C9GV() { // from class: X.9TE
        @Override // X.C9GV
        public final AbstractC73672Svk<PronounResponse> updatePronouns(String str) {
            PronounsAPI.LIZ.getClass();
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String str2 = EFJ.LIZJ;
            return ((PronounsAPI) C770830u.LIZJ(str2, "API_URL_PREFIX_SI", LIZLLL, str2).LIZ.LIZ(PronounsAPI.class)).updatePronouns(str);
        }
    };

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ C9GV getOperator() {
        return this.LIZ;
    }
}
