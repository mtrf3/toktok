package X;

import Y.ARunnableS11S0201000_8;
import Y.ARunnableS7S0301000_6;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes15.dex */
public final class W5L implements InterfaceC47046IdG<File> {
    public final /* synthetic */ W5K LIZ;

    public W5L(W5K w5k) {
        this.LIZ = w5k;
    }

    @Override // X.InterfaceC47046IdG
    public final void onResult(File file) {
        File file2 = file;
        C79083V1z.LIZ(this.LIZ.LIZIZ.LIZ.hashCode(), "FrescoImageLoaderImpl", "download", C0F0.LIZJ("onCompleted image path=", file2));
        if (file2 != null) {
            W5J w5j = this.LIZ.LIZIZ;
            w5j.LIZJ.getCallbackExecutor(w5j.LIZ).execute(new ARunnableS11S0201000_8(0, this.LIZ.LIZ, file2, 13));
            return;
        }
        W5J w5j2 = this.LIZ.LIZIZ;
        C245519kJ LIZ = W5N.LJI().LIZ(FrescoImageLoaderImpl.buildImageRequest(w5j2.LIZ, w5j2.LIZIZ), null);
        W5V w5v = C81730W5u.LIZ;
        W5K w5k = this.LIZ;
        W5J w5j3 = w5k.LIZIZ;
        W5Z w5z = new W5Z(w5j3.LIZJ, w5j3.LIZ, w5k.LIZ);
        w5v.getClass();
        if (((LinkedList) w5v.LIZIZ).remove(LIZ)) {
            C38995FSd.LIZLLL().execute(new ARunnableS7S0301000_6(0, w5v, LIZ, w5z, 2));
            return;
        }
        List<SoftReference<FYV>> list = w5v.LIZ.get(LIZ);
        if (list == null) {
            list = new LinkedList<>();
            w5v.LIZ.put(LIZ, list);
        }
        list.add(new SoftReference<>(w5z));
    }
}
