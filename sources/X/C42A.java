package X;

import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.42A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42A implements C3EU {
    public final /* synthetic */ AnonymousClass429 LIZ;
    public final /* synthetic */ User LIZIZ;

    @Override // X.C3EU
    public final void LIZ(IMUser result) {
        o.LJIIIZ(result, "result");
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        LIZ.append(result.getUniqueId());
        arrayList.add(X1D.LIZIZ(LIZ));
        AnonymousClass429 anonymousClass429 = this.LIZ;
        int followingCount = result.getFollowingCount();
        int followerCount = result.getFollowerCount();
        anonymousClass429.getClass();
        arrayList.add(AnonymousClass429.o0(followingCount, followerCount));
        if (!this.LIZ.LLI || this.LIZIZ.getNickname() == null) {
            return;
        }
        AnonymousClass429 anonymousClass4292 = this.LIZ;
        String nickname = this.LIZIZ.getNickname();
        o.LJIIIIZZ(nickname, "user.nickname");
        AnonymousClass429 anonymousClass4293 = this.LIZ;
        TuxTextView tuxTextView = anonymousClass4293.LLIIIJ;
        LinearLayout linearLayout = anonymousClass4293.LLIIIL;
        anonymousClass4292.getClass();
        C1033743x.LIZIZ(nickname, arrayList, tuxTextView, linearLayout);
    }

    @Override // X.C3EU
    public final void LIZIZ(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    public C42A(AnonymousClass429 anonymousClass429, User user) {
        this.LIZ = anonymousClass429;
        this.LIZIZ = user;
    }
}
