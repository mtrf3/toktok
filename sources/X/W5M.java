package X;

import Y.ARunnableS10S0101000_6;
import Y.ARunnableS25S0300000_14;
import Y.ARunnableS8S0301000_7;
import android.graphics.Bitmap;
import android.os.Looper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public final class W5M implements InterfaceC70869Rrd {
    public static void LJIIJ(String str) {
        C81814W9a LJIIJ = C81814W9a.LJIIJ();
        if (LJIIJ.LIZIZ.LJJII.LIZ() == null || !((Boolean) LJIIJ.LIZIZ.LJJII.LIZ()).booleanValue() || C16880lQ.LLJJJJ() != Looper.myLooper()) {
        } else {
            throw new RuntimeException(i0.LJFF(str, ".   Any question please contact @weixin.gary"));
        }
    }

    @Override // X.InterfaceC70869Rrd
    public final boolean LIZ(android.net.Uri uri) {
        LJIIJ("hasCachedFile may cause ANR,use hasCachedFileAsync or you should call it in Non-UI Thread");
        C245519kJ LIZ = W5N.LJI().LIZ(W5O.LIZ(uri), null);
        if (W8E.LJII().LJIIIZ().LJII(LIZ) || W8E.LJII().LJIILIIL().LJII(LIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC70869Rrd
    public final Bitmap LIZIZ(C62562cu c62562cu) {
        C81392Vwy LJFF;
        Bitmap underlyingBitmap;
        LJIIJ("getCachedBitmapByModel may cause ANR,use getCachedBitmapByModelAsync or you should call it in Non-UI Thread");
        if (c62562cu != null && !c62562cu.LIZ()) {
            Iterator it = ((ArrayList) c62562cu.LIZ).iterator();
            while (it.hasNext()) {
                android.net.Uri parse = UriProtector.parse((String) it.next());
                LJIIJ("getCachedBitmapByUri may cause ANR,use getCachedBitmapByUriAsync or you should call it in Non-UI Thread");
                W5O LIZ = W5O.LIZ(parse);
                if (LIZ != null) {
                    W6U[] w6uArr = {null};
                    W8E.LJII().LIZJ().LJ(new C81724W5o(UriProtector.parse(W5N.LJI().LIZIZ(LIZ, null).LIZ), w6uArr));
                    if (w6uArr[0] != null && (LJFF = W8E.LJII().LIZJ().LJFF(w6uArr[0])) != null && (underlyingBitmap = ((W5B) LJFF.LJI()).getUnderlyingBitmap()) != null) {
                        return underlyingBitmap;
                    }
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC70869Rrd
    public final File LIZLLL(android.net.Uri uri) {
        File file;
        HashMap<String, InterfaceC81714W5e> LJ;
        LJIIJ("getCachedFile may cause ANR,use getCachedFileAsync or you should call it in Non-UI Thread");
        C245519kJ LIZ = W5N.LJI().LIZ(W5O.LIZ(uri), null);
        WEK LJ2 = W8E.LJII().LJIIIZ().LJ(LIZ);
        if (LJ2 == null && (LJ2 = W8E.LJII().LJIILIIL().LJ(LIZ)) == null && (LJ = W8E.LJII().LJ()) != null) {
            Iterator<Map.Entry<String, InterfaceC81714W5e>> it = LJ.entrySet().iterator();
            while (it.hasNext() && (LJ2 = it.next().getValue().LJ(LIZ)) == null) {
            }
        }
        if (!(LJ2 instanceof WEK) || (file = LJ2.LIZ) == null || !file.exists()) {
            return null;
        }
        return file;
    }

    @Override // X.InterfaceC70869Rrd
    public final Bitmap LJ(android.net.Uri uri) {
        LJIIJ("getCachedBitmap may cause ANR,use getCachedBitmapAsync or you should call it in Non-UI Thread");
        C81392Vwy LJFF = W8E.LJII().LIZJ().LJFF(new V91(uri.toString(), null, V85.LIZJ, C81810W8w.LJIILIIL, null, null, null));
        if (LJFF == null) {
            return null;
        }
        return ((W5B) LJFF.LJI()).getUnderlyingBitmap();
    }

    @Override // X.InterfaceC70869Rrd
    public final Bitmap LJFF(ImageUrlModel imageUrlModel) {
        LJIIJ("getCachedBitmapByObject may cause ANR,use getCachedBitmapByObjectAsync or you should call it in Non-UI Thread");
        return LIZIZ(W5U.LIZLLL().LJII().LIZ().LIZ(imageUrlModel, new W5F(imageUrlModel)));
    }

    @Override // X.InterfaceC70869Rrd
    public final void LJI(android.net.Uri uri) {
        C38995FSd.LIZLLL().execute(new ARunnableS10S0101000_6(0, uri, 14));
    }

    @Override // X.InterfaceC70869Rrd
    public final boolean LJII(android.net.Uri uri) {
        LJIIJ("isInMemoryCache may cause ANR,use isInMemoryCacheAsync or you should call it in Non-UI Thread");
        W5O LIZ = W5O.LIZ(uri);
        if (LIZ == null) {
            return false;
        }
        C81722W5m c81722W5m = new C81722W5m(UriProtector.parse(W5N.LJI().LIZIZ(LIZ, null).LIZ));
        if (!W8E.LJII().LIZJ().LJ(c81722W5m) && !W8E.LJII().LJFF().LJ(c81722W5m)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC70869Rrd
    public final void LIZJ(android.net.Uri uri, InterfaceC47046IdG<Boolean> interfaceC47046IdG) {
        C38995FSd.LIZLLL().execute(new ARunnableS25S0300000_14(interfaceC47046IdG, this, uri, 36));
    }

    @Override // X.InterfaceC70869Rrd
    public final void LJIIIIZZ(android.net.Uri uri, InterfaceC47046IdG<File> interfaceC47046IdG) {
        C38995FSd.LIZLLL().execute(new ARunnableS25S0300000_14(interfaceC47046IdG, this, uri, 37));
    }

    @Override // X.InterfaceC70869Rrd
    public final void LJIIIZ(Bitmap bitmap, android.net.Uri uri) {
        C38995FSd.LIZLLL().execute(new ARunnableS8S0301000_7(0, this, uri, bitmap, 2));
    }
}
