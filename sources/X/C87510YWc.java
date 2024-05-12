package X;

import android.database.Cursor;
import com.ss.android.ugc.aweme.nows.cache.NowMediaCacheDatabase;

/* renamed from: X.YWc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87510YWc implements InterfaceC81671W3n {
    public final AbstractC03300Ba LIZ;
    public final C81680W3w LIZIZ;
    public final C81681W3x LIZJ;

    @Override // X.InterfaceC81671W3n
    public final int getCount() {
        int i = 0;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT COUNT(aid) FROM now_media_cache");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            if (LIZIZ.moveToFirst()) {
                i = LIZIZ.getInt(0);
            }
            return i;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    public C87510YWc(NowMediaCacheDatabase nowMediaCacheDatabase) {
        this.LIZ = nowMediaCacheDatabase;
        this.LIZIZ = new C81680W3w(nowMediaCacheDatabase);
        this.LIZJ = new C81681W3x(nowMediaCacheDatabase);
    }

    @Override // X.InterfaceC81671W3n
    public final C81677W3t LIZ(String str) {
        String string;
        String string2;
        String string3;
        C81678W3u c81678W3u;
        String string4;
        String string5;
        C81679W3v c81679W3v;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM now_media_cache WHERE aid = ?");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "aid");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "create_time_in_mills");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "photo_front_img_path");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "photo_back_img_path");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "mix_front_cover_path");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "mix_back_cover_path");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "mix_video_path");
            C81677W3t c81677W3t = null;
            String string6 = null;
            if (LIZIZ.moveToFirst()) {
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j = LIZIZ.getLong(LIZIZ3);
                if (!LIZIZ.isNull(LIZIZ4) || !LIZIZ.isNull(LIZIZ5)) {
                    if (LIZIZ.isNull(LIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ4);
                    }
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(LIZIZ5);
                    }
                    c81678W3u = new C81678W3u(string2, string3);
                } else {
                    c81678W3u = null;
                }
                if (!LIZIZ.isNull(LIZIZ6) || !LIZIZ.isNull(LIZIZ7) || !LIZIZ.isNull(LIZIZ8)) {
                    if (LIZIZ.isNull(LIZIZ6)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(LIZIZ6);
                    }
                    if (LIZIZ.isNull(LIZIZ7)) {
                        string5 = null;
                    } else {
                        string5 = LIZIZ.getString(LIZIZ7);
                    }
                    if (!LIZIZ.isNull(LIZIZ8)) {
                        string6 = LIZIZ.getString(LIZIZ8);
                    }
                    c81679W3v = new C81679W3v(string4, string5, string6);
                } else {
                    c81679W3v = null;
                }
                c81677W3t = new C81677W3t(string, c81678W3u, c81679W3v, j);
            }
            return c81677W3t;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC81671W3n
    public final void LIZIZ(C81677W3t... c81677W3tArr) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            C81681W3x c81681W3x = this.LIZJ;
            InterfaceC37591dj LIZ = c81681W3x.LIZ();
            try {
                for (C81677W3t c81677W3t : c81677W3tArr) {
                    c81681W3x.LIZLLL(LIZ, c81677W3t);
                    LIZ.LJIJJLI();
                }
                c81681W3x.LIZJ(LIZ);
                this.LIZ.LJIILLIIL();
            } catch (Throwable th) {
                c81681W3x.LIZJ(LIZ);
                throw th;
            }
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC81671W3n
    public final void LIZJ(C81677W3t... c81677W3tArr) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            C81680W3w c81680W3w = this.LIZIZ;
            InterfaceC37591dj LIZ = c81680W3w.LIZ();
            try {
                for (C81677W3t c81677W3t : c81677W3tArr) {
                    c81680W3w.LIZLLL(LIZ, c81677W3t);
                    LIZ.LJIILJJIL();
                }
                c81680W3w.LIZJ(LIZ);
                this.LIZ.LJIILLIIL();
            } catch (Throwable th) {
                c81680W3w.LIZJ(LIZ);
                throw th;
            }
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC81671W3n
    public final C81677W3t[] LIZLLL(int i) {
        String string;
        String string2;
        String string3;
        C81678W3u c81678W3u;
        String string4;
        String string5;
        String string6;
        C81679W3v c81679W3v;
        C1CD LIZJ = C1CD.LIZJ(1, "\n        SELECT *\n        FROM now_media_cache\n        ORDER BY create_time_in_mills\n        LIMIT ?\n        ");
        LIZJ.LJIIIZ(1, i);
        this.LIZ.LIZIZ();
        int i2 = 0;
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "aid");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "create_time_in_mills");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "photo_front_img_path");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "photo_back_img_path");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "mix_front_cover_path");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "mix_back_cover_path");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "mix_video_path");
            C81677W3t[] c81677W3tArr = new C81677W3t[LIZIZ.getCount()];
            while (LIZIZ.moveToNext()) {
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j = LIZIZ.getLong(LIZIZ3);
                if (!LIZIZ.isNull(LIZIZ4) || !LIZIZ.isNull(LIZIZ5)) {
                    if (LIZIZ.isNull(LIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ4);
                    }
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(LIZIZ5);
                    }
                    c81678W3u = new C81678W3u(string2, string3);
                } else {
                    c81678W3u = null;
                }
                if (!LIZIZ.isNull(LIZIZ6) || !LIZIZ.isNull(LIZIZ7) || !LIZIZ.isNull(LIZIZ8)) {
                    if (LIZIZ.isNull(LIZIZ6)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(LIZIZ6);
                    }
                    if (LIZIZ.isNull(LIZIZ7)) {
                        string5 = null;
                    } else {
                        string5 = LIZIZ.getString(LIZIZ7);
                    }
                    if (LIZIZ.isNull(LIZIZ8)) {
                        string6 = null;
                    } else {
                        string6 = LIZIZ.getString(LIZIZ8);
                    }
                    c81679W3v = new C81679W3v(string4, string5, string6);
                } else {
                    c81679W3v = null;
                }
                c81677W3tArr[i2] = new C81677W3t(string, c81678W3u, c81679W3v, j);
                i2++;
            }
            return c81677W3tArr;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }
}
