package X;

import Y.ARunnableS39S0100000_3;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.82L, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C82L extends C82J<C82N> {
    public final C83G LJLJI;
    public final C82Y LJLJJI;
    public final C6U6 LJLJJL;
    public final C82S LJLJJLL;
    public final ViewGroup LJLJL;
    public final InterfaceC2048082a LJLJLJ;
    public final C81I LJLJLLL;
    public final InterfaceC201357vH LJLL;
    public final List<C82N> LJLLI;
    public final ArrayList<PhotoModeImageUrlModel> LJLLILLLL;
    public C82N LJLLJ;
    public C82N LJLLL;
    public int LJLLLL;
    public AnonymousClass818 LJLLLLLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object object) {
        o.LJIIIZ(object, "object");
        return -2;
    }

    @Override // X.C82J
    public final int LJJIII() {
        if (C78963Uyt.LJJIJ(this.LJLJJLL.Ig())) {
            return this.LJLLILLLL.size() + 1;
        }
        return this.LJLLILLLL.size();
    }

    public final void LJJIIJZLJL(int i) {
        C82N c82n = this.LJLLL;
        if (c82n != null) {
            c82n.LIZLLL.removeCallbacks(c82n.LJIILLIIL);
        }
        C82N LJJIIZ = LJJIIZ(i);
        if (LJJIIZ != null) {
            LJJIIZ.LIZLLL.removeCallbacks(LJJIIZ.LJIILLIIL);
            ARunnableS39S0100000_3 aRunnableS39S0100000_3 = new ARunnableS39S0100000_3(LJJIIZ, 221);
            LJJIIZ.LJIILLIIL = aRunnableS39S0100000_3;
            LJJIIZ.LIZLLL.postDelayed(aRunnableS39S0100000_3, 850L);
        }
        this.LJLLL = LJJIIZ;
        this.LJLLLL = i;
    }

    public final C82N LJJIIZ(int i) {
        C82N c82n;
        Iterator<C82N> it = this.LJLLI.iterator();
        while (true) {
            if (it.hasNext()) {
                c82n = it.next();
                if (c82n.LIZJ == i) {
                    break;
                }
            } else {
                c82n = null;
                break;
            }
        }
        return c82n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        if (r2 != null) goto L18;
     */
    @Override // X.C82J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C82N LJJIIJ(int r12, android.view.ViewGroup r13) {
        /*
            r11 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            r3 = 0
            r0 = 1
            if (r12 != r0) goto L3f
            android.content.Context r0 = r13.getContext()
            android.view.LayoutInflater r2 = X.C16880lQ.LLZIL(r0)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            android.content.Context r0 = r13.getContext()
            r1.<init>(r0)
            r0 = 2131559779(0x7f0d0563, float:1.8744912E38)
            android.view.View r2 = X.C16880lQ.LLLLIILL(r2, r0, r1, r3)
            java.lang.String r0 = "from(parent.context).inf… false,\n                )"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            X.82M r1 = new X.82M
            X.82Y r3 = r11.LJLJJI
            X.6U6 r4 = r11.LJLJJL
            X.82S r5 = r11.LJLJJLL
            android.view.ViewGroup r6 = r11.LJLJL
            X.81I r7 = r11.LJLJLLL
            X.7vH r8 = r11.LJLL
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L37:
            java.util.List<X.82N> r0 = r11.LJLLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            return r1
        L3f:
            android.content.Context r1 = r13.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.1qj r2 = X.C45804HyK.LJJIFFI(r1)
            X.82S r0 = r11.LJLJJLL
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r0.Ig()
            if (r0 == 0) goto Ld4
            int r5 = r0.currentPosition
        L56:
            java.lang.ref.SoftReference<X.L9e> r0 = X.C82Z.LIZJ
            r1 = 0
            if (r0 == 0) goto L65
            java.lang.Object r0 = r0.get()
            X.KNs r0 = (X.AbstractC51620KNs) r0
            if (r0 == 0) goto L65
            android.app.Activity r1 = r0.LIZ
        L65:
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r1)
            r4 = 2131562130(0x7f0d0e92, float:1.874968E38)
            if (r0 != 0) goto L92
        L6e:
            android.content.Context r1 = r13.getContext()
            r0 = -1
            android.view.View r2 = X.C16950lX.LIZ(r1, r4, r13, r3, r0)
            java.lang.String r0 = "getView(\n               …     false,\n            )"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        L7c:
            X.82T r1 = new X.82T
            X.83G r3 = r11.LJLJI
            X.82Y r4 = r11.LJLJJI
            X.6U6 r5 = r11.LJLJJL
            X.82S r6 = r11.LJLJJLL
            android.view.ViewGroup r7 = r11.LJLJL
            X.82a r8 = r11.LJLJLJ
            X.81I r9 = r11.LJLJLLL
            X.7vH r10 = r11.LJLL
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L37
        L92:
            boolean r0 = X.C82Z.LIZ
            if (r0 == 0) goto Lbf
            int r1 = X.C82Z.LIZIZ
            r0 = 3
            if (r1 >= r0) goto Lbf
            java.lang.ref.SoftReference<X.L9e> r0 = X.C82Z.LIZJ
            if (r0 == 0) goto Ld2
            java.lang.Object r0 = r0.get()
            X.L9Y r0 = (X.L9Y) r0
            if (r0 == 0) goto Ld2
            boolean r2 = r0.LIZIZ(r4)
            if (r2 == 0) goto Lb3
            int r0 = X.C82Z.LIZIZ
            int r0 = r0 + 1
            X.C82Z.LIZIZ = r0
        Lb3:
            java.util.concurrent.ExecutorService r1 = X.C38995FSd.LIZJ()
            X.2VZ r0 = new X.2VZ
            r0.<init>()
            r1.execute(r0)
        Lbf:
            java.lang.ref.SoftReference<X.L9e> r0 = X.C82Z.LIZJ
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r0.get()
            X.L9Y r0 = (X.L9Y) r0
            if (r0 == 0) goto L6e
            android.view.View r2 = r0.LIZ(r4)
            if (r2 != 0) goto L7c
            goto L6e
        Ld2:
            r2 = 0
            goto Lb3
        Ld4:
            r5 = 0
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82L.LJJIIJ(int, android.view.ViewGroup):X.82N");
    }

    public final void LJJIIZI(List<PhotoModeImageUrlModel> imagesList, AnonymousClass818 anonymousClass818) {
        o.LJIIIZ(imagesList, "imagesList");
        this.LJLLILLLL.clear();
        this.LJLLILLLL.addAll(imagesList);
        notifyDataSetChanged();
        this.LJLLLLLL = anonymousClass818;
    }

    public C82L(C83G touchInterceptor, C82Y multiFingerCallBack, C6U6 stickerClickListener, PhotoViewModelV2 feedPhotoParams, ViewGroup viewGroup, InterfaceC2048082a interfaceC2048082a, C81I c81i, InterfaceC201357vH photosSharedProvider) {
        o.LJIIIZ(touchInterceptor, "touchInterceptor");
        o.LJIIIZ(multiFingerCallBack, "multiFingerCallBack");
        o.LJIIIZ(stickerClickListener, "stickerClickListener");
        o.LJIIIZ(feedPhotoParams, "feedPhotoParams");
        o.LJIIIZ(photosSharedProvider, "photosSharedProvider");
        this.LJLJI = touchInterceptor;
        this.LJLJJI = multiFingerCallBack;
        this.LJLJJL = stickerClickListener;
        this.LJLJJLL = feedPhotoParams;
        this.LJLJL = viewGroup;
        this.LJLJLJ = interfaceC2048082a;
        this.LJLJLLL = c81i;
        this.LJLL = photosSharedProvider;
        this.LJLLI = new ArrayList();
        this.LJLLILLLL = new ArrayList<>();
    }
}
