package X;

import com.bytedance.android.livesdk.like.LikeHelper;

/* renamed from: X.Bpj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29983Bpj implements InterfaceC29986Bpm {
    public final /* synthetic */ LikeHelper LJLIL;

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "LikeHelper";
    }

    @Override // X.InterfaceC29986Bpm
    public final /* synthetic */ void dc(LikeHelper likeHelper, String str) {
    }

    public C29983Bpj(LikeHelper likeHelper) {
        this.LJLIL = likeHelper;
    }

    @Override // X.InterfaceC29986Bpm
    public final void t3(LikeHelper likeHelper, int i) {
        LikeHelper likeHelper2 = this.LJLIL;
        int i2 = i % likeHelper2.LJLJLLL;
        if (i2 != 0) {
            likeHelper2.LJJIIZI(i2);
            LikeHelper likeHelper3 = this.LJLIL;
            likeHelper3.LJJIJ(i2, likeHelper3.LJLJI.getOwnerUserId(), false);
        }
    }

    @Override // X.InterfaceC29986Bpm
    public final void g4(LikeHelper likeHelper, int i, int i2, float f, float f2, float f3, float f4) {
        LikeHelper likeHelper2 = this.LJLIL;
        int i3 = likeHelper2.LJLJLLL;
        if (i2 % i3 == 0) {
            likeHelper2.LJJIIZI(i3);
            LikeHelper likeHelper3 = this.LJLIL;
            likeHelper3.LJJIJ(likeHelper3.LJLJLLL, likeHelper3.LJLJI.getOwnerUserId(), false);
        }
    }
}
