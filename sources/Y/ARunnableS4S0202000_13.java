package Y;

import X.BQO;
import X.C15650jR;
import X.C29306Beo;
import X.C47261Igj;
import X.C53200KuK;
import X.C76860UEm;
import X.C78720Uuy;
import X.C78765Uvh;
import X.EnumC78722Uv0;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multilive.model.BannerContentMultiGuest;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.widget.CoverWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.pause.LivePreviewPausedWidget;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ARunnableS4S0202000_13 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        float f = (this.i2 * 1.0f) / this.i3;
        if (C53200KuK.LIZ()) {
            C78720Uuy LJIIIIZZ = C15650jR.LIZ().LJIIIIZZ("preview", ((UrlModel) this.l0).getUrlList());
            LJIIIIZZ.LJIILL = f;
            LJIIIIZZ.LJIILLIIL = 5;
            LJIIIIZZ.LJIJJ = true;
            LJIIIIZZ.LJIIJJI(((CoverWidget) this.l1).LJLILLLLZI);
            return;
        }
        C78765Uvh.LJI(((CoverWidget) this.l1).LJLILLLLZI, (UrlModel) this.l0, this.i2, this.i3, C47261Igj.LJIILIIL(f));
    }

    public final void LIZ$1() {
        List<String> list;
        float f = (this.i2 * 1.0f) / this.i3;
        if (C53200KuK.LIZ()) {
            BQO LIZ = C15650jR.LIZ();
            UrlModel urlModel = (UrlModel) this.l0;
            if (urlModel != null) {
                list = urlModel.getUrlList();
            } else {
                list = null;
            }
            C78720Uuy LJIIIIZZ = LIZ.LJIIIIZZ("preview", list);
            LJIIIIZZ.LJIILL = f;
            LJIIIIZZ.LJIILLIIL = 5;
            LJIIIIZZ.LJIJJ = true;
            LJIIIIZZ.LJIIJJI(((LivePreviewPausedWidget) this.l1).LJZ());
            return;
        }
        C78765Uvh.LJI(((LivePreviewPausedWidget) this.l1).LJZ(), (UrlModel) this.l0, this.i2, this.i3, C47261Igj.LJIILIIL(f));
    }

    public final void LIZ$2() {
        boolean z;
        String str;
        int max = Math.max(((C76860UEm) this.l0).M().getHeight(), ((C76860UEm) this.l0).P().getHeight() + ((C76860UEm) this.l0).N().getHeight());
        ImageModel imageModel = ((BannerContentMultiGuest) this.l1).coreImage;
        if (imageModel != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && imageModel != null && (str = imageModel.mUri) != null && str.length() > 0) {
            Object value = ((C76860UEm) this.l0).LJLJJLL.getValue();
            o.LJIIIIZZ(value, "<get-bannerImageView>(...)");
            C29306Beo.LJJLIIIJJIZ(this.i2, max, (View) value);
            C78720Uuy LJIIIZ = ((BQO) ((C76860UEm) this.l0).LJLJLLL.getValue()).LJIIIZ(((BannerContentMultiGuest) this.l1).coreImage);
            LJIIIZ.LJIJJLI = true;
            LJIIIZ.LIZLLL(ImageView.ScaleType.MATRIX);
            LJIIIZ.LJIILJJIL = EnumC78722Uv0.LEFT;
            LJIIIZ.LJ = this.i2;
            LJIIIZ.LJFF = max;
            Object value2 = ((C76860UEm) this.l0).LJLJJLL.getValue();
            o.LJIIIIZZ(value2, "<get-bannerImageView>(...)");
            LJIIIZ.LJIIJJI((View) value2);
        } else {
            Object value3 = ((C76860UEm) this.l0).LJLJJLL.getValue();
            o.LJIIIIZZ(value3, "<get-bannerImageView>(...)");
            C29306Beo.LJJLIIIJJIZ(0, 0, (View) value3);
        }
        if (((BannerContentMultiGuest) this.l1).backgroundImage != null) {
            Object value4 = ((C76860UEm) this.l0).LJLJL.getValue();
            o.LJIIIIZZ(value4, "<get-bannerBg>(...)");
            C29306Beo.LJJLIIIJJIZ(this.i3, max, (View) value4);
            C78720Uuy LJIIIZ2 = ((BQO) ((C76860UEm) this.l0).LJLL.getValue()).LJIIIZ(((BannerContentMultiGuest) this.l1).backgroundImage);
            LJIIIZ2.LJIJJLI = true;
            LJIIIZ2.LIZLLL(ImageView.ScaleType.CENTER_CROP);
            LJIIIZ2.LJ = this.i3;
            LJIIIZ2.LJFF = max;
            Object value5 = ((C76860UEm) this.l0).LJLJL.getValue();
            o.LJIIIIZZ(value5, "<get-bannerBg>(...)");
            LJIIIZ2.LJIIJJI((View) value5);
        }
    }

    public static final void run$0(ARunnableS4S0202000_13 aRunnableS4S0202000_13) {
        boolean LIZ;
        try {
            C78765Uvh.LJI(((CoverWidget) aRunnableS4S0202000_13.l0).LJLILLLLZI, (UrlModel) aRunnableS4S0202000_13.l1, aRunnableS4S0202000_13.i2, aRunnableS4S0202000_13.i3, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S0202000_13 aRunnableS4S0202000_13) {
        boolean LIZ;
        try {
            aRunnableS4S0202000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS4S0202000_13 aRunnableS4S0202000_13) {
        boolean LIZ;
        try {
            aRunnableS4S0202000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS4S0202000_13 aRunnableS4S0202000_13) {
        boolean LIZ;
        try {
            aRunnableS4S0202000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS4S0202000_13 aRunnableS4S0202000_13) {
        boolean LIZ;
        try {
            C78765Uvh.LJI(((CoverWidget) aRunnableS4S0202000_13.l0).LJLJI, (UrlModel) aRunnableS4S0202000_13.l1, aRunnableS4S0202000_13.i2, aRunnableS4S0202000_13.i3, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS4S0202000_13 aRunnableS4S0202000_13) {
        boolean LIZ;
        try {
            int i = aRunnableS4S0202000_13.i2;
            int i2 = aRunnableS4S0202000_13.i3;
            C78765Uvh.LJI(((CoverWidget) aRunnableS4S0202000_13.l0).LJLJI, (UrlModel) aRunnableS4S0202000_13.l1, i, i2, C47261Igj.LJIILIIL((i * 1.0f) / i2));
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS4S0202000_13(int r2, int r3, com.ss.android.ugc.aweme.base.model.UrlModel r4, com.ss.android.ugc.aweme.feed.adapter.widget.CoverWidget r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 0: goto L12;
                case 1: goto L1c;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.i2 = r2
            r0.i3 = r3
            r0.l0 = r5
            r0.l1 = r4
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.i2 = r2
            r0.i3 = r3
            goto Le
        L1c:
            r0 = r1
            r0.i2 = r2
            r0.i3 = r3
            r0.l0 = r4
            r0.l1 = r5
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS4S0202000_13.<init>(int, int, com.ss.android.ugc.aweme.base.model.UrlModel, com.ss.android.ugc.aweme.feed.adapter.widget.CoverWidget, int):void");
    }

    public ARunnableS4S0202000_13(int i, int i2, Object obj, Object obj2, int i3) {
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
