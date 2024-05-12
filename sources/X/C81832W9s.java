package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.W9s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81832W9s implements WBI {
    public static final InterfaceC81845WAf LIZJ;
    public static final InterfaceC81845WAf LIZLLL;
    public static final InterfaceC81845WAf LJ;
    public final InterfaceC81846WAg LIZ;
    public final AbstractC78853Ux7 LIZIZ;

    static {
        InterfaceC81845WAf interfaceC81845WAf;
        InterfaceC81845WAf interfaceC81845WAf2;
        InterfaceC81845WAf interfaceC81845WAf3 = null;
        try {
            interfaceC81845WAf = (InterfaceC81845WAf) Class.forName("com.facebook.animated.gif.GifImage").newInstance();
        } catch (Throwable unused) {
            interfaceC81845WAf = null;
        }
        LIZJ = interfaceC81845WAf;
        try {
            interfaceC81845WAf2 = (InterfaceC81845WAf) Class.forName("com.facebook.animated.webp.WebPImage").newInstance();
        } catch (Throwable unused2) {
            interfaceC81845WAf2 = null;
        }
        LIZLLL = interfaceC81845WAf2;
        try {
            interfaceC81845WAf3 = (InterfaceC81845WAf) Class.forName("com.bytedance.fresco.animatedheif.HeifImage").newInstance();
        } catch (Throwable unused3) {
        }
        LJ = interfaceC81845WAf3;
    }

    public C81832W9s(WAD wad, AbstractC78853Ux7 abstractC78853Ux7) {
        this.LIZ = wad;
        this.LIZIZ = abstractC78853Ux7;
    }

    public final List<C81392Vwy<Bitmap>> LIZJ(WA7 wa7, Bitmap.Config config) {
        WA1 LIZ = this.LIZ.LIZ(new C81836W9w(wa7), null);
        ArrayList arrayList = new ArrayList(LIZ.getFrameCount());
        WAW waw = new WAW(LIZ, new WAB(arrayList));
        for (int i = 0; i < LIZ.getFrameCount(); i++) {
            C81392Vwy<Bitmap> LIZ2 = LIZ(LIZ.getWidth(), LIZ.getHeight(), config);
            waw.LIZLLL(i, LIZ2.LJI());
            arrayList.add(LIZ2);
        }
        return arrayList;
    }

    public final C81392Vwy<Bitmap> LIZ(int i, int i2, Bitmap.Config config) {
        C81392Vwy<Bitmap> LJ2 = this.LIZIZ.LJ(i, i2, config);
        LJ2.LJI().eraseColor(0);
        LJ2.LJI().setHasAlpha(true);
        return LJ2;
    }

    public final C81392Vwy<Bitmap> LIZIZ(WA7 wa7, Bitmap.Config config, int i) {
        C81392Vwy<Bitmap> LIZ = LIZ(wa7.getWidth(), wa7.getHeight(), config);
        new WAW(this.LIZ.LIZ(new C81836W9w(wa7), null), new WAI()).LIZLLL(i, LIZ.LJI());
        return LIZ;
    }

    public final List<C81392Vwy<Bitmap>> LIZLLL(WA7 wa7, Bitmap.Config config, int i) {
        WA1 LIZ = this.LIZ.LIZ(new C81836W9w(wa7), null);
        int frameCount = LIZ.getFrameCount();
        if (i > frameCount) {
            i = frameCount;
        }
        LIZ.LJIIIIZZ = 1;
        ArrayList arrayList = new ArrayList(i);
        WAW waw = new WAW(LIZ, new WAC(arrayList));
        for (int i2 = 0; i2 < i; i2++) {
            C81392Vwy<Bitmap> LIZ2 = LIZ(LIZ.getWidth(), LIZ.getHeight(), config);
            try {
                waw.LIZLLL(i2, LIZ2.LJI());
                arrayList.add(LIZ2);
            } catch (IllegalStateException e) {
                Object[] objArr = new Object[0];
                if (W58.LIZ.LJIIIIZZ(5)) {
                    W58.LIZ.w("AnimatedImageFactoryImp", C16880lQ.LLLZI(null, "preview decode failed", objArr), e);
                }
            }
        }
        return arrayList;
    }

    public final W5A LJ(C81810W8w c81810W8w, WA7 wa7, C81828W9o c81828W9o) {
        List<C81392Vwy<Bitmap>> list;
        int i;
        C81392Vwy<Bitmap> c81392Vwy = null;
        try {
            if (c81810W8w.LIZLLL) {
                i = wa7.getFrameCount() - 1;
            } else {
                i = 0;
            }
            if (c81810W8w.LJFF) {
                return new W5C(LIZIZ(wa7, c81810W8w.LJII, i), W8A.LIZLLL, 0);
            }
            try {
                if (!C81796W8i.LIZIZ(c81828W9o)) {
                    if (c81810W8w.LJ) {
                        list = LIZJ(wa7, c81810W8w.LJII);
                        ArrayList arrayList = (ArrayList) list;
                        if (arrayList.size() > i) {
                            c81392Vwy = C81392Vwy.LIZJ((C81392Vwy) arrayList.get(i));
                        }
                    } else {
                        int i2 = c81810W8w.LIZJ;
                        if (i2 > 0) {
                            list = LIZLLL(wa7, c81810W8w.LJII, i2);
                            ArrayList arrayList2 = (ArrayList) list;
                            if (arrayList2.size() > i) {
                                c81392Vwy = C81392Vwy.LIZJ((C81392Vwy) arrayList2.get(i));
                            }
                        } else {
                            list = null;
                        }
                    }
                    if (c81810W8w.LIZIZ && c81392Vwy == null) {
                        c81392Vwy = LIZIZ(wa7, c81810W8w.LJII, i);
                    }
                } else {
                    list = null;
                }
                WA9 wa9 = new WA9(wa7);
                wa9.LIZIZ = C81392Vwy.LIZJ(c81392Vwy);
                wa9.LIZLLL = i;
                wa9.LIZJ = C81392Vwy.LIZLLL(list);
                C81831W9r c81831W9r = new C81831W9r(wa9.LIZ(), c81810W8w, c81828W9o);
                C81392Vwy.LJ(c81392Vwy);
                C81392Vwy.LJFF(list);
                return c81831W9r;
            } catch (Throwable th) {
                th = th;
                C81392Vwy.LJ(c81392Vwy);
                C81392Vwy.LJFF(list);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            list = null;
        }
    }
}
