package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollDetailResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TAf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74201TAf implements InterfaceC116954iR<PollDetailResponse> {
    public final /* synthetic */ C74199TAd LJLIL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    public C74201TAf(C74199TAd c74199TAd) {
        this.LJLIL = c74199TAd;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LIZ.cb0(new Exception(e));
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(PollDetailResponse pollDetailResponse) {
        ArrayList arrayList;
        PollDetailResponse t = pollDetailResponse;
        o.LJIIIZ(t, "t");
        C74199TAd c74199TAd = this.LJLIL;
        C74206TAk c74206TAk = new C74206TAk(t.getOffset(), t.getHasMore());
        c74199TAd.getClass();
        c74199TAd.LJFF = c74206TAk;
        if (C79004UzY.LJJIFFI(t.getUsers())) {
            this.LJLIL.LIZ.Ne();
            return;
        }
        this.LJLIL.LIZ.J5(t.getUsers(), t.getHasMore());
        C74199TAd c74199TAd2 = this.LJLIL;
        if (t.getUsers() == null) {
            arrayList = new ArrayList();
        } else {
            List<User> users = t.getUsers();
            o.LJI(users);
            arrayList = new ArrayList(users);
        }
        c74199TAd2.LIZ(arrayList, this.LJLIL.LJFF, false);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        this.LJLIL.LJ.LIZ(d);
        this.LJLIL.LIZ.LJII();
    }
}
