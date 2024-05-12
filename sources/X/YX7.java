package X;

import Y.IDd0S18S0000000_15;
import Y.IDd0S19S0000000_16;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.nows.cache.NowSelfAwemeDatabase;
import java.util.List;

/* loaded from: classes16.dex */
public final class YX7 implements InterfaceC195027l4 {
    public final AbstractC03300Ba LIZ;
    public final C197737pR LIZIZ;
    public final C79012Uzg LIZJ = new C79012Uzg();
    public final IDd0S18S0000000_15 LIZLLL;
    public final IDd0S19S0000000_16 LJ;
    public final IDd0S19S0000000_16 LJFF;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.7pR] */
    public YX7(final NowSelfAwemeDatabase nowSelfAwemeDatabase) {
        this.LIZ = nowSelfAwemeDatabase;
        this.LIZIZ = new C1CG<C197727pQ>(nowSelfAwemeDatabase) { // from class: X.7pR
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR REPLACE INTO `now_self_aweme_cache` (`aid`,`uid`,`aweme_type`,`author_name`,`like_count`,`comment_count`,`front_image_thumbnail`,`back_image`,`video_cover`,`create_time_at_sec`,`last_pushed_at_sec`,`expired_time_at_sec`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C197727pQ c197727pQ) {
                C197727pQ c197727pQ2 = c197727pQ;
                String str = c197727pQ2.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                String str2 = c197727pQ2.LIZIZ;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJJII(2, str2);
                }
                interfaceC37591dj.LJIIIZ(3, c197727pQ2.LIZJ);
                String str3 = c197727pQ2.LIZLLL;
                if (str3 == null) {
                    interfaceC37591dj.LLLLLLJ(4);
                } else {
                    interfaceC37591dj.LJJII(4, str3);
                }
                interfaceC37591dj.LJIIIZ(5, c197727pQ2.LJ);
                interfaceC37591dj.LJIIIZ(6, c197727pQ2.LJFF);
                C79012Uzg c79012Uzg = YX7.this.LIZJ;
                UrlModel urlModel = c197727pQ2.LJI;
                c79012Uzg.getClass();
                String LIZJ = C75792yF.LIZJ(urlModel);
                if (LIZJ == null) {
                    interfaceC37591dj.LLLLLLJ(7);
                } else {
                    interfaceC37591dj.LJJII(7, LIZJ);
                }
                C79012Uzg c79012Uzg2 = YX7.this.LIZJ;
                UrlModel urlModel2 = c197727pQ2.LJII;
                c79012Uzg2.getClass();
                String LIZJ2 = C75792yF.LIZJ(urlModel2);
                if (LIZJ2 == null) {
                    interfaceC37591dj.LLLLLLJ(8);
                } else {
                    interfaceC37591dj.LJJII(8, LIZJ2);
                }
                C79012Uzg c79012Uzg3 = YX7.this.LIZJ;
                UrlModel urlModel3 = c197727pQ2.LJIIIIZZ;
                c79012Uzg3.getClass();
                String LIZJ3 = C75792yF.LIZJ(urlModel3);
                if (LIZJ3 == null) {
                    interfaceC37591dj.LLLLLLJ(9);
                } else {
                    interfaceC37591dj.LJJII(9, LIZJ3);
                }
                interfaceC37591dj.LJIIIZ(10, c197727pQ2.LJIIIZ);
                interfaceC37591dj.LJIIIZ(11, c197727pQ2.LJIIJ);
                interfaceC37591dj.LJIIIZ(12, c197727pQ2.LJIIJJI);
            }
        };
        this.LIZLLL = new IDd0S18S0000000_15(nowSelfAwemeDatabase, 16);
        this.LJ = new IDd0S19S0000000_16(nowSelfAwemeDatabase, 0);
        this.LJFF = new IDd0S19S0000000_16(nowSelfAwemeDatabase, 1);
    }

    @Override // X.InterfaceC195027l4
    public final void LIZ(List<C197727pQ> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC195027l4
    public final void LIZJ(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZLLL.LIZ();
        if (str == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str);
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZLLL.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC195027l4
    public final void LIZLLL(C197727pQ c197727pQ) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJFF(c197727pQ);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC195027l4
    public final void LJ(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJFF.LIZ();
        if (str == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str);
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LJFF.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC195027l4
    public final void LIZIZ(long j, String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJ.LIZ();
        if (str == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str);
        }
        LIZ.LJIIIZ(2, j);
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LJ.LIZJ(LIZ);
        }
    }
}
