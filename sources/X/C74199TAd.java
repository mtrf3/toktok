package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.PollDetailApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TAd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74199TAd {
    public final InterfaceC223218pR<User> LIZ;
    public final InterfaceC74204TAi LIZIZ;
    public final int LIZJ;
    public final PollDetailApi LIZLLL;
    public final C73318Sq2 LJ;
    public C74206TAk LJFF;

    public C74199TAd(InterfaceC223218pR<User> view, InterfaceC74204TAi interfaceC74204TAi, int i) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZIZ = interfaceC74204TAi;
        this.LIZJ = i;
        PollDetailApi.LIZ.getClass();
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(PollDetailApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…ollDetailApi::class.java)");
        this.LIZLLL = (PollDetailApi) create;
        this.LJ = new C73318Sq2();
        this.LJFF = new C74206TAk(0, false);
    }

    public final void LIZ(List<User> list, C74206TAk c74206TAk, boolean z) {
        C74203TAh c74203TAh;
        C74203TAh c74203TAh2;
        if (z) {
            if (C79004UzY.LJJIFFI(list)) {
                return;
            }
            InterfaceC74204TAi interfaceC74204TAi = this.LIZIZ;
            if (interfaceC74204TAi == null || (c74203TAh2 = interfaceC74204TAi.LIZ()) == null) {
                c74203TAh2 = new C74203TAh(0);
            }
            if (this.LIZJ == 0) {
                if (c74203TAh2.LIZ == null) {
                    c74203TAh2.LIZ = new ArrayList();
                }
                List<User> list2 = c74203TAh2.LIZ;
                if (list2 != null) {
                    list2.addAll(list);
                }
                o.LJIIIZ(c74206TAk, "<set-?>");
                c74203TAh2.LIZIZ = c74206TAk;
            } else {
                if (c74203TAh2.LIZJ == null) {
                    c74203TAh2.LIZJ = new ArrayList();
                }
                List<User> list3 = c74203TAh2.LIZJ;
                if (list3 != null) {
                    list3.addAll(list);
                }
                o.LJIIIZ(c74206TAk, "<set-?>");
                c74203TAh2.LIZLLL = c74206TAk;
            }
            InterfaceC74204TAi interfaceC74204TAi2 = this.LIZIZ;
            if (interfaceC74204TAi2 != null) {
                interfaceC74204TAi2.LIZLLL(c74203TAh2);
                return;
            }
            return;
        }
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        InterfaceC74204TAi interfaceC74204TAi3 = this.LIZIZ;
        if (interfaceC74204TAi3 == null || (c74203TAh = interfaceC74204TAi3.LIZ()) == null) {
            c74203TAh = new C74203TAh(0);
        }
        if (this.LIZJ == 0) {
            c74203TAh.LIZ = list;
            o.LJIIIZ(c74206TAk, "<set-?>");
            c74203TAh.LIZIZ = c74206TAk;
        } else {
            c74203TAh.LIZJ = list;
            o.LJIIIZ(c74206TAk, "<set-?>");
            c74203TAh.LIZLLL = c74206TAk;
        }
        InterfaceC74204TAi interfaceC74204TAi4 = this.LIZIZ;
        if (interfaceC74204TAi4 != null) {
            interfaceC74204TAi4.LIZLLL(c74203TAh);
        }
    }
}
