package com.bytedance.lighten.loader;

import X.C16880lQ;
import X.C58096Mr6;
import X.C61094NyM;
import X.C64345PNd;
import X.C66699QFr;
import X.C66702QFu;
import X.C77876UhM;
import X.C78605Ut7;
import X.C78886Uxe;
import X.C79083V1z;
import X.C81713W5d;
import X.C81738W6c;
import X.C81743W6h;
import X.C81804W8q;
import X.C81806W8s;
import X.C81814W9a;
import X.C81830W9q;
import X.C81856WAq;
import X.C81859WAt;
import X.C81864WAy;
import X.InterfaceC81739W6d;
import X.InterfaceC81754W6s;
import X.InterfaceC81819W9f;
import X.InterfaceC81862WAw;
import X.PGN;
import X.PMK;
import X.QGG;
import X.QGN;
import X.QGQ;
import X.QGS;
import X.SIQ;
import X.SIR;
import X.W4P;
import X.W5I;
import X.W5N;
import X.W6B;
import X.W6O;
import X.W87;
import X.W8B;
import X.W8E;
import X.W8K;
import X.W8L;
import X.W8P;
import X.W9G;
import X.W9H;
import X.W9J;
import X.W9K;
import X.W9L;
import X.W9M;
import X.W9O;
import X.W9P;
import X.W9Q;
import X.W9R;
import X.W9T;
import X.W9Z;
import X.WAS;
import X.WAT;
import X.WB6;
import X.WE7;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.fresco.heif.HeifDecoder;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.fackbook.imagepipeline.IImagePipelineOutService;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes15.dex */
public class ImagePipelineConfigFactory implements IImagePipelineOutService {
    public final C81814W9a LIZ;

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final void LIZIZ() {
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final void LJIJJ() {
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final void LJJ() {
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final void LJJI() {
    }

    public static IImagePipelineOutService LJJIJIIJIL() {
        Object LIZ = C58096Mr6.LIZ(IImagePipelineOutService.class, false);
        if (LIZ != null) {
            return (IImagePipelineOutService) LIZ;
        }
        if (C58096Mr6.LJJIIZ == null) {
            synchronized (IImagePipelineOutService.class) {
                if (C58096Mr6.LJJIIZ == null) {
                    C58096Mr6.LJJIIZ = new ImagePipelineConfigFactory();
                }
            }
        }
        return C58096Mr6.LJJIIZ;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Bitmap.Config LIZ() {
        return this.LIZ.LJ();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W8B LIZJ() {
        return new W9R();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W9L LIZLLL() {
        return LJJIJ(this.LIZ);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC81739W6d LJ() {
        return new C81743W6h();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W8K LJFF() {
        if (this.LIZ.LJIIL()) {
            WAT wat = new WAT();
            wat.LIZ = PGN.LIZ;
            wat.LIZIZ = ((Number) this.LIZ.LIZIZ.LJJIJLIJ.LIZ()).intValue();
            return new W8K(new W8L(wat));
        }
        return null;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final HashMap<String, W9L> LJI() {
        return LJJIIZ(this.LIZ);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W8E LJII() {
        if (W9G.LIZJ == null) {
            W9G.LIZJ = new W9G();
        }
        return new W8E(W9G.LIZJ);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final WB6 LJIIIIZZ() {
        if (this.LIZ.LJIIL()) {
            return PGN.LIZ;
        }
        return C81859WAt.LIZIZ();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W4P<Boolean> LJIIIZ() {
        return new W4P() { // from class: X.WAr
            @Override // X.W4P
            public final Object get() {
                return Boolean.TRUE;
            }
        };
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final QGQ<? extends QGS> LJIIJ() {
        if (this.LIZ.LJIIIZ() != null) {
            return new C66702QFu(this.LIZ.LJIIIZ());
        }
        return new C66699QFr();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Set<InterfaceC81754W6s> LJIIJJI() {
        C81814W9a c81814W9a = this.LIZ;
        if (c81814W9a.LIZIZ.LJIILLIIL.LIZ() != null && ((Boolean) c81814W9a.LIZIZ.LJIILLIIL.LIZ()).booleanValue()) {
            HashSet hashSet = new HashSet();
            QGN qgn = new QGN();
            C78886Uxe.LJLJI = qgn;
            hashSet.add(qgn);
            LJJIIZI(this.LIZ);
            return hashSet;
        }
        return null;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W9O LJIIL() {
        W9J w9j = new W9J();
        w9j.LIZ(W9T.LIZ, new W9T(), new C81804W8q());
        w9j.LIZ(HeifDecoder.HEIF_FORMAT, new C81806W8s(), new HeifDecoder.HeifFormatDecoder(new W8K(new W8L(new WAT())).LIZIZ(0)));
        return new W9O(w9j);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC81862WAw LJIILJJIL() {
        return new W9M(new C78605Ut7());
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W9Q LJIILL() {
        WAS was = new WAS(null);
        C81814W9a c81814W9a = this.LIZ;
        if (c81814W9a.LIZIZ.LJJI.LIZ() != null && ((Boolean) c81814W9a.LIZIZ.LJJI.LIZ()).booleanValue()) {
            was.LIZ = true;
        }
        return new W9Q(was);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Integer LJIIZILJ() {
        return 30000;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W4P<C81738W6c> LJIJ() {
        long longValue;
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(this.LIZ.LJI(), "activity");
        C81814W9a c81814W9a = this.LIZ;
        if (c81814W9a.LIZIZ.LJFF.LIZ() == null) {
            longValue = 0;
        } else {
            longValue = ((Long) c81814W9a.LIZIZ.LJFF.LIZ()).longValue();
        }
        return new W6B(activityManager, (int) longValue);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final InterfaceC81819W9f LJIJJLI() {
        C81864WAy c81864WAy;
        C81814W9a c81814W9a = this.LIZ;
        if (c81814W9a.LIZIZ.LJIILJJIL.LIZ() != null && ((Boolean) c81814W9a.LIZIZ.LJIILJJIL.LIZ()).booleanValue()) {
            return C81856WAq.LJIILIIL();
        }
        synchronized (C81864WAy.class) {
            if (C81864WAy.LIZ == null) {
                C81864WAy.LIZ = new C81864WAy();
            }
            c81864WAy = C81864WAy.LIZ;
        }
        return c81864WAy;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W9L LJIL() {
        return LJJIJIIJI(this.LIZ);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W4P<C81738W6c> LJJIFFI() {
        long longValue;
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(this.LIZ.LJI(), "activity");
        C81814W9a c81814W9a = this.LIZ;
        if (c81814W9a.LIZIZ.LJI.LIZ() == null) {
            longValue = 0;
        } else {
            longValue = ((Long) c81814W9a.LIZIZ.LJI.LIZ()).longValue();
        }
        return new W6B(activityManager, (int) longValue);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJJIII() {
        return Boolean.valueOf(((Boolean) this.LIZ.LIZIZ.LJJIJL.LIZ()).booleanValue());
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W87 LJJIIJZLJL() {
        if (W9G.LIZJ == null) {
            W9G.LIZJ = new W9G();
        }
        return new C64345PNd(W9G.LIZJ.LJI().LIZ.LIZJ.LIZLLL);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Context getContext() {
        return this.LIZ.LJI();
    }

    public ImagePipelineConfigFactory() {
        C81814W9a LJIIJ = C81814W9a.LJIIJ();
        this.LIZ = LJIIJ;
        if (LJIIJ.LJ() == null) {
            return;
        }
        if (LJIIJ.LJIIJJI() >= 0) {
            W8P.LIZ = LJIIJ.LJIIJJI();
        }
        if (LJIIJ.LIZIZ.LJIIJJI.LIZ() != null && ((Boolean) LJIIJ.LIZIZ.LJIIJJI.LIZ()).booleanValue()) {
            W5N LJI = W5N.LJI();
            String[] strArr = (String[]) LJIIJ.LIZIZ.LJIILIIL.LIZ();
            LJI.LIZ = true;
            LJI.LIZJ = strArr;
        }
        if (LJIIJ.LIZIZ.LJIIL.LIZ() != null && ((Boolean) LJIIJ.LIZIZ.LJIIL.LIZ()).booleanValue()) {
            W5N.LJI().LIZIZ = true;
        }
        AnimatedDrawable2.LLD = new C81830W9q(LJIIJ);
        if (LJIIJ.LIZIZ.LJJ.LIZ() == null) {
            return;
        }
        C81713W5d.LIZIZ = new W9Z(LJIIJ);
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Integer LJIILIIL() {
        LJIILL();
        return 0;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final W6O LJJII() {
        return W5N.LJI();
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJIILLIIL() {
        return Boolean.TRUE;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJIJI() {
        return Boolean.TRUE;
    }

    @Override // com.fackbook.imagepipeline.IImagePipelineOutService
    public final Boolean LJJIIJ() {
        return Boolean.TRUE;
    }

    public static HashMap<String, W9L> LJJIIZ(C81814W9a c81814W9a) {
        long j;
        HashMap<String, W9L> hashMap = new HashMap<>();
        Map map = (Map) c81814W9a.LIZIZ.LJJIFFI.LIZ();
        if (map != null) {
            for (String str : map.keySet()) {
                if (str != null) {
                    if (map.get(str) != null) {
                        j = ((Long) map.get(str)).longValue();
                    } else {
                        j = 0;
                    }
                    W9K w9k = new W9K(c81814W9a.LJI());
                    w9k.LIZIZ = new C61094NyM(new File(c81814W9a.LJIIIIZZ(), "fresco_custom_cache"));
                    w9k.LIZ = str;
                    if (j > 0) {
                        w9k.LIZJ = ((Long) map.get(str)).longValue();
                    }
                    w9k.LJFF = C77876UhM.LJI();
                    if (c81814W9a.LJFF() != null) {
                        w9k.LJ = new WE7(c81814W9a.LJFF());
                    }
                    hashMap.put(str, w9k.LIZ());
                }
            }
        }
        return hashMap;
    }

    public static void LJJIIZI(C81814W9a c81814W9a) {
        QGG.LJFF = c81814W9a.LJI();
        ((ArrayList) QGG.LIZ).add(new SIQ((SIR) c81814W9a.LIZIZ.LJIJI.LIZ()));
        boolean z = false;
        QGG.LIZJ = false;
        QGG.LIZLLL = true;
        if (c81814W9a.LIZIZ.LJIIZILJ.LIZ() != null && ((Boolean) c81814W9a.LIZIZ.LJIIZILJ.LIZ()).booleanValue()) {
            z = true;
        }
        QGG.LJ = z;
    }

    public static W9L LJJIJ(C81814W9a c81814W9a) {
        W9K w9k = new W9K(c81814W9a.LJI());
        w9k.LIZIZ = new C61094NyM(c81814W9a.LJIIIIZZ());
        w9k.LIZ = "fresco_cache";
        long j = 0;
        if (c81814W9a.LIZIZ.LJII.LIZ() != null && ((Long) c81814W9a.LIZIZ.LJII.LIZ()).longValue() > 0) {
            if (c81814W9a.LIZIZ.LJII.LIZ() != null) {
                j = ((Long) c81814W9a.LIZIZ.LJII.LIZ()).longValue();
            }
            w9k.LIZJ = j;
        }
        w9k.LJFF = C77876UhM.LJI();
        if (c81814W9a.LJFF() != null) {
            w9k.LJ = new WE7(c81814W9a.LJFF());
        }
        return w9k.LIZ();
    }

    public static W9L LJJIJIIJI(C81814W9a c81814W9a) {
        W9K w9k = new W9K(c81814W9a.LJI());
        w9k.LIZIZ = new C61094NyM(c81814W9a.LJIIIIZZ());
        w9k.LIZ = "fresco_small_cache";
        long j = 0;
        if (c81814W9a.LIZIZ.LJIIIIZZ.LIZ() != null && ((Long) c81814W9a.LIZIZ.LJIIIIZZ.LIZ()).longValue() > 0) {
            if (c81814W9a.LIZIZ.LJIIIIZZ.LIZ() != null) {
                j = ((Long) c81814W9a.LIZIZ.LJIIIIZZ.LIZ()).longValue();
            }
            w9k.LIZJ = j;
        }
        w9k.LJFF = C77876UhM.LJI();
        if (c81814W9a.LJFF() != null) {
            w9k.LJ = new WE7(c81814W9a.LJFF());
        }
        return w9k.LIZ();
    }

    public static W9G LJJIJIL(C81814W9a c81814W9a) {
        long longValue;
        if (W5I.LIZLLL) {
            C79083V1z.LIZIZ(0, "ImagePipelineConfigFactory", "getImagePipelineConfig", "Fresco has been initialized, lighten will override the fresco config!!!");
        }
        if (c81814W9a.LJIIJJI() >= 0) {
            W8P.LIZ = c81814W9a.LJIIJJI();
        }
        W9H LJII = W9G.LJII(c81814W9a.LJI());
        LJII.LJII = LJJIJ(c81814W9a);
        LJII.LJIIL = LJJIJIIJI(c81814W9a);
        LJII.LJIILIIL = LJJIIZ(c81814W9a);
        LJII.LIZ = c81814W9a.LJ();
        LJII.LIZLLL = true;
        LJII.LJIILL.LIZIZ = c81814W9a.LIZ;
        if (c81814W9a.LJIIL()) {
            PMK pmk = PGN.LIZ;
            LJII.LJIIIIZZ = pmk;
            WAT wat = new WAT();
            wat.LIZ = pmk;
            LJII.LJIIJ = new W8K(new W8L(wat));
        }
        if (c81814W9a.LJIIIZ() != null) {
            LJII.LJIIIZ = new C66702QFu(c81814W9a.LJIIIZ());
        } else {
            try {
                LJII.LJIIIZ = new C66699QFr();
            } catch (Throwable unused) {
            }
        }
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(c81814W9a.LJI(), "activity");
        long j = 0;
        if (c81814W9a.LIZIZ.LJFF.LIZ() == null) {
            longValue = 0;
        } else {
            longValue = ((Long) c81814W9a.LIZIZ.LJFF.LIZ()).longValue();
        }
        LJII.LIZIZ = new W6B(activityManager, (int) longValue);
        if (c81814W9a.LIZIZ.LJI.LIZ() != null) {
            j = ((Long) c81814W9a.LIZIZ.LJI.LIZ()).longValue();
        }
        LJII.LJ = new W9P((int) j);
        if (c81814W9a.LIZIZ.LJIILJJIL.LIZ() != null && ((Boolean) c81814W9a.LIZIZ.LJIILJJIL.LIZ()).booleanValue()) {
            if (C81856WAq.LIZ == null) {
                synchronized (C81856WAq.class) {
                    if (C81856WAq.LIZ == null) {
                        C81856WAq.LIZ = new C81856WAq();
                    }
                }
            }
            LJII.LJI = C81856WAq.LIZ;
        }
        if (c81814W9a.LIZIZ.LJIIJJI.LIZ() != null && ((Boolean) c81814W9a.LIZIZ.LJIIJJI.LIZ()).booleanValue()) {
            W5N LJI = W5N.LJI();
            String[] strArr = (String[]) c81814W9a.LIZIZ.LJIILIIL.LIZ();
            LJI.LIZ = true;
            LJI.LIZJ = strArr;
        }
        if (c81814W9a.LIZIZ.LJIIL.LIZ() != null && ((Boolean) c81814W9a.LIZIZ.LJIIL.LIZ()).booleanValue()) {
            W5N.LJI().LIZIZ = true;
        }
        W9J w9j = new W9J();
        w9j.LIZ(W9T.LIZ, new W9T(), new C81804W8q());
        w9j.LIZ(HeifDecoder.HEIF_FORMAT, new C81806W8s(), new HeifDecoder.HeifFormatDecoder(new W8K(new W8L(new WAT())).LIZIZ(0)));
        LJII.LJIILJJIL = new W9O(w9j);
        if (c81814W9a.LIZIZ.LJIILLIIL.LIZ() != null && ((Boolean) c81814W9a.LIZIZ.LJIILLIIL.LIZ()).booleanValue()) {
            HashSet hashSet = new HashSet();
            QGN qgn = new QGN();
            C78886Uxe.LJLJI = qgn;
            hashSet.add(qgn);
            LJII.LJIIJJI = hashSet;
            LJJIIZI(c81814W9a);
        }
        AnimatedDrawable2.LLD = new C81830W9q(c81814W9a);
        if (c81814W9a.LIZIZ.LJJ.LIZ() != null) {
            C81713W5d.LIZIZ = new W9Z(c81814W9a);
        }
        if (c81814W9a.LIZIZ.LJJI.LIZ() != null && ((Boolean) c81814W9a.LIZIZ.LJJI.LIZ()).booleanValue()) {
            LJII.LJIILL.LIZ = true;
        }
        return new W9G(LJII);
    }
}
