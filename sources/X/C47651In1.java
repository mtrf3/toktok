package X;

import Y.ACallableS0S1000000_1;
import Y.ACallableS111S0100000_8;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS63S1200000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.In1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47651In1 {
    public long LIZJ;
    public final HashMap<String, LocalVideoUrlModel> LIZ = new HashMap<>();
    public final List<String> LIZIZ = new ArrayList();
    public final List<LocalVideoUrlModel> LIZLLL = new ArrayList();

    public static int LIZJ() {
        try {
            return C2YJ.LIZIZ.LIZ.getLocalVideoCacheMaxLength().intValue() * 1024 * 1024;
        } catch (C158056If unused) {
            return 157286400;
        }
    }

    public static boolean LIZLLL(LocalVideoUrlModel localVideoUrlModel) {
        int i;
        if (localVideoUrlModel != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - localVideoUrlModel.getCreateTime();
            try {
                i = C2YJ.LIZIZ.LIZ.getLocalVideoCacheMaxAge().intValue() * 60 * 1000;
            } catch (C158056If unused) {
                i = 259200000;
            }
            if (elapsedRealtime <= i && !TextUtils.isEmpty(localVideoUrlModel.localPath) && new File(localVideoUrlModel.localPath).exists()) {
                return false;
            }
        }
        return true;
    }

    public final LocalVideoUrlModel LIZIZ(String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        if (TextUtils.isEmpty(sourceId)) {
            return null;
        }
        return this.LIZ.get(sourceId);
    }

    public final void LJ(LocalVideoUrlModel model) {
        o.LJIIIZ(model, "model");
        if (model.getSourceId() == null) {
            return;
        }
        AqS155S0200000_8 aqS155S0200000_8 = new AqS155S0200000_8(this, model, 15);
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            aqS155S0200000_8.invoke();
        } else {
            C10K.LIZIZ(new ACallableS111S0100000_8(aqS155S0200000_8, 7), C10K.LJIIIIZZ, null);
        }
    }

    public final void LJFF(Collection<? extends LocalVideoUrlModel> cacheList) {
        o.LJIIIZ(cacheList, "cacheList");
        Iterator it = ORZ.LLILII(C47648Imy.LJLIL, cacheList).iterator();
        while (it.hasNext()) {
            LJ((LocalVideoUrlModel) it.next());
        }
    }

    public final void LJI(String sourceId) {
        LocalVideoUrlModel localVideoUrlModel;
        o.LJIIIZ(sourceId, "sourceId");
        if (!TextUtils.isEmpty(sourceId) && (localVideoUrlModel = this.LIZ.get(sourceId)) != null) {
            String sourceId2 = localVideoUrlModel.getSourceId();
            o.LJIIIIZZ(sourceId2, "model.sourceId");
            this.LIZJ -= LIZ(new AqS63S1200000_8(this, sourceId, localVideoUrlModel, 0), sourceId2, localVideoUrlModel.localPath);
        }
    }

    public final boolean LJII(long j) {
        long j2;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        int i = 0;
        while (j3 < j && i < ((ArrayList) this.LIZLLL).size()) {
            int i2 = i + 1;
            LocalVideoUrlModel localVideoUrlModel = (LocalVideoUrlModel) ListProtector.get(this.LIZLLL, i);
            File file = new File(localVideoUrlModel.localPath);
            if (file.exists()) {
                j2 = file.length();
            } else {
                j2 = 0;
            }
            arrayList.add(localVideoUrlModel);
            j3 += j2;
            this.LIZJ -= j2;
            i = i2;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LocalVideoUrlModel localVideoUrlModel2 = (LocalVideoUrlModel) it.next();
            String sourceId = localVideoUrlModel2.getSourceId();
            o.LJIIIIZZ(sourceId, "model.sourceId");
            LIZ(new AqS155S0200000_8(this, localVideoUrlModel2, 16), sourceId, localVideoUrlModel2.localPath);
        }
        if (this.LIZJ <= j) {
            return false;
        }
        return true;
    }

    public final long LIZ(InterfaceC65784Pro interfaceC65784Pro, String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || ((ArrayList) this.LIZIZ).contains(str)) {
            return 0L;
        }
        File file = new File(str2);
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        ((ArrayList) this.LIZIZ).add(str);
        C10K.LIZIZ(new ACallableS0S1000000_1(str2, 2), C38995FSd.LIZLLL(), null).LJ(new C36813Ecb(this, str, interfaceC65784Pro, str2), C10K.LJIIIIZZ, null);
        return length;
    }
}
