package X;

import com.ss.android.ugc.aweme.nows.cache.NowMediaCacheDatabase;

/* renamed from: X.W3w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81680W3w extends C1CG<C81677W3t> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR REPLACE INTO `now_media_cache` (`aid`,`create_time_in_mills`,`photo_front_img_path`,`photo_back_img_path`,`mix_front_cover_path`,`mix_back_cover_path`,`mix_video_path`) VALUES (?,?,?,?,?,?,?)";
    }

    public C81680W3w(NowMediaCacheDatabase nowMediaCacheDatabase) {
        super(nowMediaCacheDatabase);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C81677W3t c81677W3t) {
        C81677W3t c81677W3t2 = c81677W3t;
        String str = c81677W3t2.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        interfaceC37591dj.LJIIIZ(2, c81677W3t2.LIZLLL);
        C81678W3u c81678W3u = c81677W3t2.LIZIZ;
        if (c81678W3u != null) {
            String str2 = c81678W3u.LJLIL;
            if (str2 == null) {
                interfaceC37591dj.LLLLLLJ(3);
            } else {
                interfaceC37591dj.LJJII(3, str2);
            }
            String str3 = c81678W3u.LJLILLLLZI;
            if (str3 == null) {
                interfaceC37591dj.LLLLLLJ(4);
            } else {
                interfaceC37591dj.LJJII(4, str3);
            }
        } else {
            interfaceC37591dj.LLLLLLJ(3);
            interfaceC37591dj.LLLLLLJ(4);
        }
        C81679W3v c81679W3v = c81677W3t2.LIZJ;
        if (c81679W3v != null) {
            String str4 = c81679W3v.LJLIL;
            if (str4 == null) {
                interfaceC37591dj.LLLLLLJ(5);
            } else {
                interfaceC37591dj.LJJII(5, str4);
            }
            String str5 = c81679W3v.LJLILLLLZI;
            if (str5 == null) {
                interfaceC37591dj.LLLLLLJ(6);
            } else {
                interfaceC37591dj.LJJII(6, str5);
            }
            String str6 = c81679W3v.LJLJI;
            if (str6 == null) {
                interfaceC37591dj.LLLLLLJ(7);
                return;
            } else {
                interfaceC37591dj.LJJII(7, str6);
                return;
            }
        }
        interfaceC37591dj.LLLLLLJ(5);
        interfaceC37591dj.LLLLLLJ(6);
        interfaceC37591dj.LLLLLLJ(7);
    }
}
