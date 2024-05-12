package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.shoot.ui.CreationIntentionMusicShootReusedAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.97V, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C97V extends AbstractC65781Prl implements InterfaceC88471Ynr<CreationIntentionMusicShootReusedAssem, C43I<? extends C2VN>, C76800UCe> {
    public static final C97V LJLIL = new C97V();

    public C97V() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(CreationIntentionMusicShootReusedAssem creationIntentionMusicShootReusedAssem, C43I<? extends C2VN> c43i) {
        C2VN c2vn;
        CreationIntentionMusicShootReusedAssem selectSubscribe = creationIntentionMusicShootReusedAssem;
        C43I<? extends C2VN> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c2vn = (C2VN) c43i2.LIZ) != null && ujb.o.LJJJJIZL(c2vn.LIZJ, ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid(), false)) {
            VideoMusicBaseVM.mv0((VideoMusicBaseVM) selectSubscribe.LJLLJ.LIZ(selectSubscribe, CreationIntentionMusicShootReusedAssem.LJLLLLLL[0]), c2vn.LIZ, c2vn.LIZIZ, false, null, false, 28);
        }
        return C76800UCe.LIZ;
    }
}
