package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollDetailResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TAe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74200TAe implements InterfaceC116954iR<PollDetailResponse> {
    public final /* synthetic */ C74199TAd LJLIL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    public C74200TAe(C74199TAd c74199TAd) {
        this.LJLIL = c74199TAd;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LIZ.nc(new Exception(e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC116954iR
    public final void onNext(PollDetailResponse pollDetailResponse) {
        C74203TAh LIZ;
        List<User> list;
        ArrayList arrayList;
        ArrayList arrayList2;
        C61878OQg c61878OQg;
        C74203TAh LIZ2;
        PollDetailResponse t = pollDetailResponse;
        o.LJIIIZ(t, "t");
        C74199TAd c74199TAd = this.LJLIL;
        C74206TAk c74206TAk = new C74206TAk(t.getOffset(), t.getHasMore());
        c74199TAd.getClass();
        c74199TAd.LJFF = c74206TAk;
        C74199TAd c74199TAd2 = this.LJLIL;
        List<User> users = t.getUsers();
        int i = c74199TAd2.LIZJ;
        InterfaceC74204TAi interfaceC74204TAi = c74199TAd2.LIZIZ;
        if (i == 0) {
            if (interfaceC74204TAi != null && (LIZ2 = interfaceC74204TAi.LIZ()) != null) {
                list = LIZ2.LIZ;
            }
            list = null;
        } else {
            if (interfaceC74204TAi != null && (LIZ = interfaceC74204TAi.LIZ()) != null) {
                list = LIZ.LIZJ;
            }
            list = null;
        }
        List<User> list2 = users;
        if (!C79004UzY.LJJIFFI(list)) {
            boolean LJJIFFI = C79004UzY.LJJIFFI(users);
            list2 = users;
            if (!LJJIFFI) {
                if (users != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (User user : users) {
                        User user2 = user;
                        if (list != null) {
                            Iterator<User> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    User next = it.next();
                                    if (TextUtils.equals(user2.getUid(), next.getUid())) {
                                        if (next != null) {
                                            arrayList3.add(user);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList2 = new ArrayList(users);
                    c61878OQg = arrayList3;
                } else {
                    arrayList2 = null;
                    c61878OQg = C61878OQg.INSTANCE;
                }
                list2 = arrayList2;
                list2 = arrayList2;
                if (!C79004UzY.LJJIFFI(c61878OQg) && arrayList2 != null) {
                    arrayList2.removeAll(c61878OQg);
                    list2 = arrayList2;
                }
            }
        }
        this.LJLIL.LIZ.j0(list2, t.getHasMore());
        C74199TAd c74199TAd3 = this.LJLIL;
        if (list2 == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list2);
        }
        c74199TAd3.LIZ(arrayList, this.LJLIL.LJFF, true);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        this.LJLIL.LJ.LIZ(d);
        this.LJLIL.LIZ.showLoadMoreLoading();
    }
}
