package X;

import Y.ARunnableS32S0200000_13;
import android.graphics.drawable.Animatable;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Uw8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78792Uw8 implements W4Z<InterfaceC81599W0t> {
    public final ImageModel LIZ;

    @Override // X.W4Z
    public final void LIZIZ(String str, Throwable th) {
    }

    @Override // X.W4Z
    public final void LIZJ(String str) {
    }

    @Override // X.W4Z
    public final void LJ(String str, Throwable th) {
    }

    @Override // X.W4Z
    public final void LJI(Object obj, String str) {
    }

    public C78792Uw8(ImageModel imageModel) {
        this.LIZ = imageModel;
    }

    @Override // X.W4Z
    public final /* bridge */ /* synthetic */ void LIZLLL(Object obj, String str) {
    }

    @Override // X.W4Z
    public final void LJFF(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t2 = interfaceC81599W0t;
        C78793Uw9 c78793Uw9 = C78793Uw9.LIZLLL;
        ImageModel imageModel = this.LIZ;
        c78793Uw9.getClass();
        if (imageModel != null && !C32151Nz.LJJIIJZLJL(imageModel.getUrls())) {
            synchronized (c78793Uw9.LIZJ) {
                Iterator<String> it = imageModel.getUrls().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((LinkedList) c78793Uw9.LIZIZ).contains(it.next())) {
                        break;
                    }
                }
            }
        }
        if (interfaceC81599W0t2 != null) {
            interfaceC81599W0t2.getWidth();
            interfaceC81599W0t2.getHeight();
        }
        ImageModel imageModel2 = this.LIZ;
        if (imageModel2 != null) {
            C78793Uw9 c78793Uw92 = C78793Uw9.LIZLLL;
            c78793Uw92.getClass();
            List<String> urls = imageModel2.getUrls();
            if (urls != null && !urls.isEmpty()) {
                c78793Uw92.LIZ.execute(new ARunnableS32S0200000_13(urls, c78793Uw92, 46));
            }
            this.LIZ.setLoaded(true);
        }
    }
}
