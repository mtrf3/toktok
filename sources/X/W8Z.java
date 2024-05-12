package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public abstract class W8Z extends W90<W8X, C81392Vwy<W5A>> {
    public final InterfaceC81770W7i LIZJ;
    public final InterfaceC81754W6s LIZLLL;
    public final C81810W8w LJ;
    public boolean LJFF;
    public final AtomicBoolean LJI;
    public final C81795W8h LJII;
    public final /* synthetic */ C81785W7x LJIIIIZZ;

    public abstract int LJIIL(W8X w8x);

    public abstract InterfaceC45733HxB LJIILIIL();

    public final void LJIILJJIL() {
        LJIILL(true);
        this.LIZIZ.LIZJ();
    }

    public abstract boolean LJIILLIIL(W8X w8x, int i);

    @Override // X.W90, X.AbstractC81756W6u
    public final void LJFF() {
        LJIILJJIL();
    }

    @Override // X.W90, X.AbstractC81756W6u
    public final void LJI(Throwable th) {
        LJIILL(true);
        this.LIZIZ.onFailure(th);
    }

    @Override // X.W90, X.AbstractC81756W6u
    public final void LJIIIIZZ(float f) {
        super.LJIIIIZZ(f * 0.99f);
    }

    public final void LJIILL(boolean z) {
        synchronized (this) {
            if (z) {
                if (!this.LJFF) {
                    this.LIZIZ.LIZ(1.0f);
                    this.LJFF = true;
                    this.LJII.LIZ();
                }
            }
        }
    }

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        W8X w8x = (W8X) obj;
        try {
            C81939WDv.LIZIZ();
            boolean LIZLLL = AbstractC81756W6u.LIZLLL(i);
            if (LIZLLL && !W8X.LJIIJJI(w8x)) {
                C79492VHs c79492VHs = new C79492VHs("Encoded image is not valid.");
                LJIILL(true);
                this.LIZIZ.onFailure(c79492VHs);
            } else if (LJIILLIIL(w8x, i)) {
                boolean LJIIJ = AbstractC81756W6u.LJIIJ(i, 4);
                if (LIZLLL || LJIIJ || this.LIZJ.LIZJ()) {
                    this.LJII.LJFF();
                }
            }
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W8Z(C81785W7x c81785W7x, W7F<C81392Vwy<W5A>> w7f, InterfaceC81770W7i interfaceC81770W7i, boolean z, int i) {
        super(w7f);
        this.LJIIIIZZ = c81785W7x;
        this.LJI = new AtomicBoolean(true);
        this.LIZJ = interfaceC81770W7i;
        this.LIZLLL = interfaceC81770W7i.LIZ();
        C81810W8w c81810W8w = interfaceC81770W7i.LJ().LJII;
        this.LJ = c81810W8w;
        this.LJFF = false;
        this.LJII = new C81795W8h(c81785W7x.LIZIZ, new W8Y(this, interfaceC81770W7i.getPriority(), interfaceC81770W7i, i), c81810W8w.LIZ);
        interfaceC81770W7i.LIZLLL(new W94(this, z));
    }

    public final C65618Pp8 LJIIJJI(W5A w5a, long j, InterfaceC45733HxB interfaceC45733HxB, boolean z, String str, String str2, String str3, String str4, boolean z2, Rect rect, boolean z3, int i) {
        String valueOf;
        Object obj;
        String name;
        String str5;
        if (!this.LIZLLL.LJIIIZ(this.LIZJ.getId())) {
            return null;
        }
        String valueOf2 = String.valueOf(j);
        String valueOf3 = String.valueOf(((W8A) interfaceC45733HxB).LIZIZ);
        String valueOf4 = String.valueOf(z);
        String str6 = "1";
        if (w5a instanceof W5C) {
            Bitmap underlyingBitmap = ((W5B) w5a).getUnderlyingBitmap();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(underlyingBitmap.getWidth());
            LIZ.append("x");
            LIZ.append(underlyingBitmap.getHeight());
            String LIZIZ = X1D.LIZIZ(LIZ);
            HashMap hashMap = new HashMap(13);
            hashMap.put("bitmapSize", LIZIZ);
            hashMap.put("queueTime", valueOf2);
            hashMap.put("hasGoodQuality", valueOf3);
            hashMap.put("isFinal", valueOf4);
            hashMap.put("encodedImageSize", str2);
            hashMap.put("imageFormat", str);
            hashMap.put("requestedImageSize", str3);
            hashMap.put("sampleSize", str4);
            hashMap.put("bitmapRamSize", String.valueOf(W6I.LIZJ(underlyingBitmap)));
            if (z2) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("isCrop", obj);
            Bitmap.Config config = underlyingBitmap.getConfig();
            if (config == null) {
                name = "unknown";
            } else {
                name = config.name();
            }
            hashMap.put("extra_bitmap_config", name);
            if (!z3) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            C116484hg.LIZIZ(hashMap, "heic_sys_first", str6, i, "heic_custom_decoder");
            if (rect != null) {
                hashMap.put("regionToDecode", rect.flattenToString());
            }
            hashMap.put("imageCount", String.valueOf(w5a.getImageCount()));
            int width = underlyingBitmap.getWidth();
            int height = underlyingBitmap.getHeight();
            ArrayList arrayList = new ArrayList();
            Random random = new Random();
            Random random2 = new Random();
            C81939WDv.LIZIZ();
            int i2 = 0;
            do {
                arrayList.add(Integer.valueOf(underlyingBitmap.getPixel(random.nextInt(width), random2.nextInt(height))));
                i2++;
            } while (i2 < 30);
            C81939WDv.LIZIZ();
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Integer) it.next()).intValue() != -1) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((Integer) it2.next()).intValue() != -16777216) {
                                    Iterator it3 = arrayList.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (((Integer) it3.next()).intValue() != 0) {
                                                str5 = "normal";
                                                break;
                                            }
                                        } else {
                                            str5 = "transparent_suspected";
                                            break;
                                        }
                                    }
                                }
                            } else {
                                str5 = "black_suspected";
                                break;
                            }
                        }
                    }
                } else {
                    str5 = "white_suspected";
                    break;
                }
            }
            hashMap.put("imageQuality", str5);
            return C65618Pp8.copyOf((java.util.Map) hashMap);
        }
        HashMap hashMap2 = new HashMap(11);
        hashMap2.put("queueTime", valueOf2);
        hashMap2.put("hasGoodQuality", valueOf3);
        hashMap2.put("isFinal", valueOf4);
        hashMap2.put("encodedImageSize", str2);
        hashMap2.put("imageFormat", str);
        hashMap2.put("requestedImageSize", str3);
        hashMap2.put("sampleSize", str4);
        if (!z2) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap2.put("isCrop", str6);
        if (rect != null) {
            hashMap2.put("regionToDecode", rect.flattenToString());
        }
        if (w5a == null) {
            valueOf = "-1";
        } else {
            valueOf = String.valueOf(w5a.getImageCount());
        }
        hashMap2.put("imageCount", valueOf);
        hashMap2.put("imageQuality", "not_static_image");
        return C65618Pp8.copyOf((java.util.Map) hashMap2);
    }
}
