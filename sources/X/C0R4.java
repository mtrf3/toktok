package X;

import android.media.MediaPlayer;
import android.text.TextUtils;
import com.google.android.play.core.assetpacks.r2;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0R4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0R4 {
    public final Object LIZ;

    public /* synthetic */ C0R4(InterfaceC68835Qzv interfaceC68835Qzv) {
        this.LIZ = interfaceC68835Qzv;
    }

    public final void LIZJ() {
        XT2 xt2;
        XT8 xt8 = (XT8) this.LIZ;
        if (xt8 != null && (xt2 = xt8.LIZ) != null) {
            xt2.LIZLLL();
        }
    }

    public C0R4(int i) {
        if (i != 3) {
            this.LIZ = new Object();
            return;
        }
        XT8 xt8 = new XT8();
        this.LIZ = xt8;
        xt8.LIZ = new XT2(C66589QBl.LIZIZ().LIZJ);
        ICacheService iCacheService = (ICacheService) C66589QBl.LIZIZ().LIZIZ.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(iCacheService.musicDir());
        LIZ.append("cache/");
        String LIZIZ = X1D.LIZIZ(LIZ);
        String LIZ2 = C66589QBl.LIZIZ().LIZ();
        if (!r2.LJ(LIZIZ)) {
            r2.LJFF(LIZIZ);
        }
        if (!r2.LJ(LIZ2)) {
            r2.LJFF(LIZ2);
        }
    }

    public final void LIZ(InterfaceC88472Yns interfaceC88472Yns) {
        Iterator it = ((List) this.LIZ).iterator();
        while (it.hasNext()) {
            interfaceC88472Yns.invoke(it.next());
        }
    }

    public /* synthetic */ C0R4(ShortVideoContext context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    public final void LIZLLL(C84881XSz c84881XSz, boolean z) {
        XT8 xt8;
        XT2 xt2;
        if (c84881XSz.LIZJ == 4 && (xt8 = (XT8) this.LIZ) != null && (xt2 = xt8.LIZ) != null) {
            if (xt2.LJLJL == null) {
                xt2.LJLJL = new MediaPlayer();
            }
            LinkedList linkedList = new LinkedList();
            if (!TextUtils.isEmpty(c84881XSz.LIZ)) {
                String str = c84881XSz.LIZ;
                o.LJI(str);
                linkedList.add(str);
            } else {
                if (C79004UzY.LJJIFFI(c84881XSz.LIZIZ)) {
                    return;
                }
                List<String> list = c84881XSz.LIZIZ;
                o.LJI(list);
                linkedList.addAll(list);
            }
            xt2.LJI();
            xt2.LJLJI = false;
            MediaPlayer mediaPlayer = xt2.LJLJL;
            if (mediaPlayer != null) {
                mediaPlayer.setOnErrorListener(new XT4(linkedList, xt2, c84881XSz, z));
            }
            xt2.LJ(c84881XSz, linkedList, z);
        }
    }

    public static I2E LIZIZ(C0R4 c0r4, long j, long j2) {
        c0r4.getClass();
        if (j2 != 0) {
            long min = Math.min(j, j2);
            if (min == j2 && min < j) {
                return I2E.MUSIC;
            }
            return I2E.NONE;
        }
        return I2E.NONE;
    }
}
