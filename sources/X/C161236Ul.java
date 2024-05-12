package X;

import Y.ARunnableS21S0200000_2;
import Y.ARunnableS3S0301000_2;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161236Ul extends PagerAdapter {
    public final Activity LJLILLLLZI;
    public final Context LJLJI;
    public final ImageAlbumData LJLJJI;
    public final ImageSynthesisResult[] LJLJJL;
    public final FrameLayout[] LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJI.getImageList().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        FrameLayout frameLayout = this.LJLJJLL[i];
        if (frameLayout != null && frameLayout.getParent() == null) {
            container.addView(frameLayout);
            return frameLayout;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJI), R.layout.j3, container, false);
        ImageView imageView = (ImageView) LLLLIILL.findViewById(R.id.ehp);
        imageView.post(new ARunnableS3S0301000_2(i, this, imageView, LLLLIILL, 1));
        this.LJLJJLL[i] = LLLLIILL;
        container.addView(LLLLIILL);
        return LLLLIILL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return o.LJ(view, object);
    }

    public final void LJJIII(int i, ImageSynthesisResult synthesisResult) {
        o.LJIIIZ(synthesisResult, "synthesisResult");
        this.LJLJJL[i] = synthesisResult;
        FrameLayout frameLayout = this.LJLJJLL[i];
        if (frameLayout != null) {
            ImageView imageView = (ImageView) frameLayout.findViewById(R.id.ehp);
            imageView.post(new ARunnableS21S0200000_2(synthesisResult, imageView, 16));
        }
    }

    public C161236Ul(Activity activity, Context context, ImageAlbumData imageAlbumData) {
        this.LJLILLLLZI = activity;
        this.LJLJI = context;
        this.LJLJJI = imageAlbumData;
        int size = imageAlbumData.getImageList().size();
        ImageSynthesisResult[] imageSynthesisResultArr = new ImageSynthesisResult[size];
        for (int i = 0; i < size; i++) {
            imageSynthesisResultArr[i] = null;
        }
        this.LJLJJL = imageSynthesisResultArr;
        FrameLayout[] frameLayoutArr = new FrameLayout[size];
        for (int i2 = 0; i2 < size; i2++) {
            frameLayoutArr[i2] = null;
        }
        this.LJLJJLL = frameLayoutArr;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        C16880lQ.LJLLL((View) object, container);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object object) {
        View findViewById;
        View findViewById2;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        if (C6XP.LIZ()) {
            int length = this.LJLJJLL.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                if (i3 == i) {
                    FrameLayout frameLayout = this.LJLJJLL[i3];
                    if (frameLayout != null && (findViewById2 = frameLayout.findViewById(R.id.ehp)) != null) {
                        findViewById2.setTransitionName("transition_name_thumbnail");
                    }
                } else {
                    FrameLayout frameLayout2 = this.LJLJJLL[i3];
                    if (frameLayout2 != null && (findViewById = frameLayout2.findViewById(R.id.ehp)) != null) {
                        findViewById.setTransitionName(null);
                    }
                }
                i2++;
                i3 = i4;
            }
        }
    }
}
