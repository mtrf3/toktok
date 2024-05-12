package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uuy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78720Uuy implements BQO {
    public AbstractC59922Wu LIZJ;
    public C81250Vug<InterfaceC81253Vuj> LIZLLL;
    public InterfaceC78716Uuu LJIIIZ;
    public Drawable LJIIJ;
    public InterfaceC75158Tec LJIIJJI;
    public Boolean LJIIL;
    public EnumC78722Uv0 LJIILJJIL;
    public boolean LJIJ;
    public Boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public final int LIZ = 5;
    public final int LIZIZ = 19;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public float LJIILIIL = -1.0f;
    public float LJIILL = -1.0f;
    public int LJIILLIIL = -1;
    public ImageView.ScaleType LJIIZILJ = ImageView.ScaleType.CENTER_CROP;

    public final C78740UvI LJIILJJIL() {
        if (this.LJIILL >= 0.0f && this.LJIILLIIL >= 0) {
            return new C78740UvI(this.LJIILLIIL, this.LJIILL);
        }
        return null;
    }

    public final void LJIILLIIL() {
        int i;
        C79238V7y c79238V7y;
        boolean z;
        if (this.LJIL || (i = this.LJI) <= 0) {
            c79238V7y = null;
        } else {
            c79238V7y = new C79238V7y(i, this.LJII);
        }
        Boolean bool = this.LJIJI;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        W5O w5o = (W5O) ORY.LJJJ(LJIILIIL(c79238V7y, LJIILJJIL(), z, false));
        if (w5o != null) {
            W8E.LJII().LJI().LJIIL(w5o, null);
        }
    }

    public final void LJIILL() {
        W5O w5o = (W5O) ORY.LJJJ(LJIILIIL(null, LJIILJJIL(), false, false));
        if (w5o != null) {
            W8E.LJII().LJI().LJIILIIL(w5o);
        }
    }

    public static AbstractC78707Uul LJIIL(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            switch (C78721Uuz.LIZIZ[scaleType.ordinal()]) {
                case 1:
                    C78715Uut CENTER = InterfaceC78716Uuu.LJJLIIIIJ;
                    o.LJIIIIZZ(CENTER, "CENTER");
                    return CENTER;
                case 2:
                    C78714Uus CENTER_CROP = InterfaceC78716Uuu.LJJLIIIJILLIZJL;
                    o.LJIIIIZZ(CENTER_CROP, "CENTER_CROP");
                    return CENTER_CROP;
                case 3:
                    C78712Uuq CENTER_INSIDE = InterfaceC78716Uuu.LJJLIIIJ;
                    o.LJIIIIZZ(CENTER_INSIDE, "CENTER_INSIDE");
                    return CENTER_INSIDE;
                case 4:
                    C78713Uur FIT_CENTER = InterfaceC78716Uuu.LJJL;
                    o.LJIIIIZZ(FIT_CENTER, "FIT_CENTER");
                    return FIT_CENTER;
                case 5:
                    C78711Uup FIT_START = InterfaceC78716Uuu.LJJJZ;
                    o.LJIIIIZZ(FIT_START, "FIT_START");
                    return FIT_START;
                case 6:
                    C78708Uum FIT_END = InterfaceC78716Uuu.LJJLI;
                    o.LJIIIIZZ(FIT_END, "FIT_END");
                    return FIT_END;
                case 7:
                    C78709Uun FIT_XY = InterfaceC78716Uuu.LJJJLZIJ;
                    o.LJIIIIZZ(FIT_XY, "FIT_XY");
                    return FIT_XY;
                case 8:
                    C78717Uuv FOCUS_CROP = InterfaceC78716Uuu.LJJLIIIJJI;
                    o.LJIIIIZZ(FOCUS_CROP, "FOCUS_CROP");
                    return FOCUS_CROP;
            }
        }
        C78714Uus DEFAULT_ACTUAL_IMAGE_SCALE_TYPE = C79077V1t.LJIIZILJ;
        o.LJIIIIZZ(DEFAULT_ACTUAL_IMAGE_SCALE_TYPE, "DEFAULT_ACTUAL_IMAGE_SCALE_TYPE");
        return DEFAULT_ACTUAL_IMAGE_SCALE_TYPE;
    }

    @Override // X.BQO
    public final C78720Uuy LIZ(List list) {
        this.LIZJ = new C59912Wt(list);
        return this;
    }

    @Override // X.BQO
    public final C78720Uuy LIZIZ(float f) {
        this.LJIILL = f;
        this.LJIILLIIL = this.LIZ;
        return this;
    }

    @Override // X.BQO
    public final C78720Uuy LIZJ(Boolean bool) {
        this.LJIJI = bool;
        return this;
    }

    @Override // X.BQO
    public final C78720Uuy LIZLLL(ImageView.ScaleType scaleType) {
        o.LJIIIZ(scaleType, "scaleType");
        this.LJIIZILJ = scaleType;
        return this;
    }

    @Override // X.BQO
    public final C78720Uuy LJ(InterfaceC75158Tec interfaceC75158Tec) {
        this.LJIIJJI = interfaceC75158Tec;
        return this;
    }

    @Override // X.BQO
    public final C78720Uuy LJFF(final int i) {
        this.LIZJ = new AbstractC59922Wu(i) { // from class: X.3ro
            public final int LIZ;

            @Override // X.AbstractC59922Wu
            public final List<android.net.Uri> LIZ() {
                return C47261Igj.LJJIJ(C0F1.LIZ("res").path(String.valueOf(this.LIZ)).build());
            }

            {
                this.LIZ = i;
            }
        };
        return this;
    }

    @Override // X.BQO
    public final C78720Uuy LJII(int i) {
        this.LJIIIIZZ = i;
        return this;
    }

    @Override // X.BQO
    public final C78720Uuy LJIIIZ(ImageModel imageModel) {
        List<String> list;
        if (imageModel == null || (list = imageModel.getUrls()) == null) {
            list = C61878OQg.INSTANCE;
        }
        this.LIZJ = new C59912Wt(list);
        return this;
    }

    @Override // X.BQO
    public final C78720Uuy LJIIJ(final File file) {
        this.LIZJ = new AbstractC59922Wu(file) { // from class: X.2g7
            public final File LIZ;

            @Override // X.AbstractC59922Wu
            public final List<android.net.Uri> LIZ() {
                File file2 = this.LIZ;
                if (file2 == null) {
                    return C61878OQg.INSTANCE;
                }
                return C47261Igj.LJJIJ(android.net.Uri.fromFile(file2));
            }

            {
                this.LIZ = file;
            }
        };
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    @Override // X.BQO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(android.view.View r15) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78720Uuy.LJIIJJI(android.view.View):void");
    }

    public final C78720Uuy LJIIZILJ(Float f) {
        float f2;
        if (f != null) {
            f2 = f.floatValue();
        } else {
            f2 = -1.0f;
        }
        this.LJIILIIL = f2;
        return this;
    }

    public final C78720Uuy LJIJ(ImageView.ScaleType scaleType) {
        o.LJIIIZ(scaleType, "scaleType");
        this.LJIIIZ = LJIIL(scaleType);
        return this;
    }

    @Override // X.BQO
    public final C78720Uuy setUrl(String str) {
        List LJJIJ;
        if (str == null) {
            LJJIJ = C61878OQg.INSTANCE;
        } else {
            LJJIJ = C47261Igj.LJJIJ(str);
        }
        this.LIZJ = new C59912Wt(LJJIJ);
        return this;
    }

    @Override // X.BQO
    public final C78720Uuy LJI(int i, int i2) {
        this.LJ = i;
        this.LJFF = i2;
        return this;
    }

    @Override // X.BQO
    public final C78720Uuy LJIIIIZZ(String str, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String url = (String) it.next();
                o.LJIIIZ(url, "url");
                EZQ ezq = new EZQ(url);
                ezq.LIZJ("biz_tag", str);
                String LIZLLL = ezq.LIZLLL();
                o.LJIIIIZZ(LIZLLL, "UrlBuilder(url).apply {\n… scene)\n        }.build()");
                arrayList.add(LIZLLL);
            }
        }
        this.LIZJ = new C59912Wt(ORZ.LLJI(arrayList));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final W5O[] LJIILIIL(C79238V7y c79238V7y, C78740UvI c78740UvI, boolean z, boolean z2) {
        List<android.net.Uri> list;
        AbstractC59922Wu abstractC59922Wu = this.LIZJ;
        if (abstractC59922Wu == null || (list = abstractC59922Wu.LIZ()) == null) {
            list = C61878OQg.INSTANCE;
        }
        if (list.isEmpty()) {
            return new W5O[0];
        }
        ArrayList arrayList = new ArrayList();
        C65318PkI c65318PkI = new C65318PkI();
        Iterator<android.net.Uri> it = list.iterator();
        while (it.hasNext()) {
            W5P LIZLLL = W5P.LIZLLL(it.next());
            if (z2) {
                LIZLLL.LJIILIIL = false;
            }
            if (c78740UvI != null) {
                LIZLLL.LJIIJ = c78740UvI;
            }
            if (c79238V7y != null) {
                LIZLLL.LIZJ = c79238V7y;
            }
            if (z) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                LIZLLL.LJ = new C81810W8w(imageDecodeOptionsBuilder);
            }
            LIZLLL.LJIILJJIL = c65318PkI;
            arrayList.add(LIZLLL.LIZ());
        }
        if (arrayList.size() == 0) {
            return new W5O[0];
        }
        Object obj = ListProtector.get(arrayList, 0);
        o.LJIIIIZZ(obj, "imageRequests[0]");
        return new W5O[]{obj};
    }
}
