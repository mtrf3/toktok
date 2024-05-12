package X;

import com.ss.android.ugc.aweme.api.MentionVideoApi;

/* renamed from: X.MfC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57358MfC implements InterfaceC72530SdK {
    public final /* synthetic */ C57359MfD LJLIL;

    public C57358MfC(C57359MfD c57359MfD) {
        this.LJLIL = c57359MfD;
    }

    @Override // X.InterfaceC72530SdK
    public final AbstractC73672Svk LJJIJL(long j, int i) {
        return MentionVideoApi.LIZIZ.getFavoriteVideo(j, i);
    }

    @Override // X.InterfaceC72530SdK
    public final AbstractC73672Svk LJJJZ(int i, long j, String str) {
        String str2;
        MentionVideoApi mentionVideoApi = MentionVideoApi.LIZIZ;
        this.LJLIL.getClass();
        int[] LIZ = J7H.LIZ(101);
        String str3 = null;
        if (LIZ != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ[0]);
            LIZ2.append('_');
            LIZ2.append(LIZ[1]);
            str2 = X1D.LIZIZ(LIZ2);
        } else {
            str2 = null;
        }
        this.LJLIL.getClass();
        int[] LIZ3 = J7H.LIZ(200);
        if (LIZ3 != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LIZ3[0]);
            LIZ4.append('_');
            LIZ4.append(LIZ3[1]);
            str3 = X1D.LIZIZ(LIZ4);
        }
        return mentionVideoApi.getPostedVideos(0, str2, str3, 1, j, str, i);
    }

    @Override // X.InterfaceC72530SdK
    public final Object LJJIIJ(int i, long j, String str, InterfaceC67352kd interfaceC67352kd) {
        return MentionVideoApi.LIZIZ.queryMusicAwemeList(str, j, i, 0);
    }

    @Override // X.InterfaceC72530SdK
    public final AbstractC73672Svk getLikeVideos(int i, int i2, long j, String str, int i3) {
        return MentionVideoApi.LIZIZ.getLikeVideos(i, i2, j, str, i3);
    }
}
