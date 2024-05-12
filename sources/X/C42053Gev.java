package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.api.IMentionVideoApi;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.service.MentionVideoService;
import kotlin.jvm.internal.o;

/* renamed from: X.Gev, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42053Gev implements IMentionVideoApi {
    public static final C42053Gev LIZIZ = new C42053Gev();
    public final /* synthetic */ IMentionVideoApi LIZ;

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LIZ(int i) {
        return this.LIZ.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LIZIZ(int i) {
        return this.LIZ.LIZIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LIZLLL(int i) {
        return this.LIZ.LIZLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LJ(TextExtraStruct struct) {
        o.LJIIIZ(struct, "struct");
        return this.LIZ.LJ(struct);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LJFF(TextExtraStruct textExtraStruct) {
        return this.LIZ.LJFF(textExtraStruct);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJI() {
        this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LJII(String musicId, String musicTitle) {
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(musicTitle, "musicTitle");
        return this.LIZ.LJII(musicId, musicTitle);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIIIIZZ(Activity activity, String str) {
        this.LIZ.LJIIIIZZ(activity, str);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final String LJIIIZ(int i) {
        return this.LIZ.LJIIIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIIJ(Fragment fragment) {
        this.LIZ.LJIIJ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIIJJI(String str) {
        this.LIZ.LJIIJJI(str);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIIL(String groupId) {
        o.LJIIIZ(groupId, "groupId");
        this.LIZ.LJIIL(groupId);
    }

    public C42053Gev() {
        IMentionVideoApi iMentionVideoApi;
        Object LIZ = C58096Mr6.LIZ(IMentionVideoApi.class, false);
        if (LIZ != null) {
            iMentionVideoApi = (IMentionVideoApi) LIZ;
        } else {
            if (C58096Mr6.X4 == null) {
                synchronized (IMentionVideoApi.class) {
                    if (C58096Mr6.X4 == null) {
                        C58096Mr6.X4 = new MentionVideoService();
                    }
                }
            }
            iMentionVideoApi = C58096Mr6.X4;
        }
        this.LIZ = iMentionVideoApi;
    }
}
