package X;

import Y.AObserverS58S0101000_2;
import Y.AObserverS64S0101000_14;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS20S0110000_14;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.model.ScrollInterceptedLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVLinearLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.WfV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewOnTouchListenerC82857WfV extends I50 implements View.OnTouchListener {
    public static final /* synthetic */ int LLLFZ = 0;
    public int LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;
    public final Context LJLJJLL;
    public LifecycleOwner LJLJL;
    public VideoEditViewModel LJLJLJ;
    public CutMultiVideoViewModel LJLJLLL;
    public WFS LJLL;
    public WFS LJLLI;
    public C8HN LJLLILLLL;
    public C8HN LJLLJ;
    public FrameLayout.LayoutParams LJLLL;
    public FrameLayout.LayoutParams LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public View LJZI;
    public View LJZL;
    public C81186Vte LL;
    public ImageView LLD;
    public boolean LLF;
    public boolean LLFF;
    public float LLFFF;
    public float LLFII;
    public float LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public C170136m1 LLII;
    public C82849WfN LLIIII;
    public FrameLayout LLIIIILZ;
    public C80190Vda LLIIIJ;
    public C80190Vda LLIIIL;
    public UIS LLIIIZ;
    public View LLIIJI;
    public View LLIIJLIL;
    public WF7 LLIIL;
    public WF7 LLIILII;
    public WFB LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public float LLILII;
    public float LLILIL;
    public int LLILL;
    public long LLILLIZIL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public C82864Wfc LLILZLL;
    public I5B LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public InterfaceC153045zY LLJJ;
    public MutableLiveData<Bitmap> LLJJI;
    public MutableLiveData<Boolean> LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public boolean LLJZIJLIL;
    public long LLL;
    public float LLLF;
    public final C82859WfX LLLFF;
    public boolean LLLFFI;

    @Override // X.InterfaceC46045I5h
    public void LIZLLL(List<VideoSegment> list) {
    }

    @Override // X.InterfaceC46045I5h
    public void LJ() {
    }

    @Override // X.InterfaceC46045I5h
    public void LJIIIZ(boolean z) {
    }

    public void LJJIJ() {
        this.LLILLJJLI = 1;
        this.LJLJLJ.uv0(1);
        I5B i5b = this.LLIZ;
        if (i5b != null) {
            i5b.LIZIZ();
        }
        this.LLIIII.LIZIZ(this.LJLJLJ.kv0(), this.LJLJLJ.nv0());
        C82864Wfc c82864Wfc = this.LLILZLL;
        LJIJJ(c82864Wfc.LIZJ, c82864Wfc.LIZ, c82864Wfc.LIZIZ, true);
        LJJIIZI(1, null);
    }

    public void LJJIJIIJI() {
        this.LLILLJJLI = 1;
        this.LJLJLJ.uv0(1);
        LJJIFFI();
        C82864Wfc c82864Wfc = this.LLILZLL;
        if (c82864Wfc != null) {
            c82864Wfc.LIZ = 0.0f;
            c82864Wfc.LIZIZ = 0.0f;
            c82864Wfc.LIZJ = 0;
        }
        this.LLIIII.LIZIZ(this.LJLJLJ.kv0(), this.LJLJLJ.nv0());
        LJIJJ(0, this.LLJZ, (this.LJLILLLLZI - r0) - C82848WfM.LIZJ, true);
        LJJIIZI(2, null);
    }

    @Override // X.I50, X.InterfaceC46045I5h
    public long getLeftSeekingValue() {
        return 0L;
    }

    @Override // X.I50
    public long getPlayingPosition() {
        return 0L;
    }

    @Override // X.I50, X.InterfaceC46045I5h
    public long getRightSeekingValue() {
        return 0L;
    }

    @Override // X.I50
    public void setDefaultMode(boolean z) {
    }

    @Override // X.I50
    public void setMultiEditEnableForStickPointMode(boolean z) {
    }

    @Override // X.InterfaceC46045I5h
    public final void LJII() {
        this.LLILIL = (this.LJLL.getStartX() - this.LJLLI.getStartX()) - C82848WfM.LIZJ;
        this.LLILII = (this.LJLLI.getStartX() + (this.LLILL - r1)) - this.LLJZ;
        if (1 != this.LLILLJJLI && this.LLIZ != null) {
            C15070iV<Long, Long> singleVideoPlayBoundary = getSingleVideoPlayBoundary();
            this.LLIZ.LIZ = singleVideoPlayBoundary.LIZ.longValue();
            this.LLIZ.LIZIZ = singleVideoPlayBoundary.LIZIZ.longValue();
            if (this.LLJ != 2 && this.LLILLJJLI == 0) {
                this.LJLJLJ.rv0(this.LLIZ, 0);
            }
        }
        LJIILL();
        if (!this.LLJJIJI) {
            return;
        }
        C15070iV<Long, Long> playBoundary = getPlayBoundary();
        Long l = playBoundary.LIZ;
        Long l2 = playBoundary.LIZIZ;
        if (l != null && l2 != null) {
            String LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) Math.max(0L, l.longValue())) / 1000.0f)});
            String LLLZI2 = C16880lQ.LLLZI(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) l2.longValue()) / 1000.0f)});
            C162696a1.LIZIZ(this.LJLLJ, LLLZI);
            C162696a1.LIZIZ(this.LJLLILLLL, LLLZI2);
        }
        LJIL();
    }

    @Override // X.InterfaceC46045I5h
    public final void LJIIIIZZ() {
        this.LLIIII.LIZIZ(this.LJLJLJ.kv0(), this.LJLJLJ.nv0());
        LJIJJ(0, this.LLJZ, (this.LJLILLLLZI - r0) - C82848WfM.LIZJ, true);
        this.LLIIIJ.LJLI(0);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.LJLJLJ.kv0()) {
            if (!videoSegment.isDeleted) {
                arrayList.add(videoSegment);
            }
        }
        WF7 wf7 = this.LLIIL;
        wf7.getClass();
        wf7.LJLJJLL = new ArrayList(arrayList);
        wf7.LL();
        wf7.LJLLLLLL();
    }

    public void LJIIJ() {
        this.LJLJLLL.LJLJI.observe(this.LJLJL, new AObserverS64S0101000_14(1, this, 7));
        if (this.LLJZIJLIL) {
            this.LJLJLLL.LJLJJL.observe(this.LJLJL, new AObserverS82S0100000_14(this, 67));
            this.LJLJLLL.LJLJJLL.observe(this.LJLJL, new AObserverS64S0101000_14(2, this, 9));
            this.LJLJLLL.LJLJL.observe(this.LJLJL, new AObserverS64S0101000_14(2, this, 2));
            this.LJLJLLL.LJLJLJ.observe(this.LJLJL, new AObserverS58S0101000_2(1, this, 20));
            this.LJLJLLL.LJLJLLL.observe(this.LJLJL, new AObserverS58S0101000_2(1, this, 21));
            this.LJLJLLL.LJLL.observe(this.LJLJL, new AObserverS58S0101000_2(1, this, 22));
        }
    }

    public final void LJIIL() {
        View view = this.LLIIJI;
        if (view != null) {
            view.setVisibility(4);
        }
        UIS uis = this.LLIIIZ;
        if (uis != null) {
            uis.setVisibility(4);
        }
    }

    public final void LJIILIIL() {
        int i;
        int i2;
        int i3;
        int i4;
        WFS wfs = new WFS(this.LJLJJLL);
        this.LJLLI = wfs;
        wfs.setScaleType(ImageView.ScaleType.FIT_XY);
        int i5 = C82848WfM.LIZJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, this.LLJL);
        this.LJLLL = layoutParams;
        layoutParams.topMargin = this.LLJLL;
        int i6 = this.LLJZ;
        layoutParams.leftMargin = i6;
        layoutParams.setMarginStart(i6);
        this.LJLLI.setLayoutParams(this.LJLLL);
        if (C79255V8p.LIZ(this.LJLJJLL)) {
            this.LJLLI.setLeft(this.LJLILLLLZI - this.LLJZ);
            C16310kV.LJIIIZ(this.LJLLI, 1);
        } else {
            this.LJLLI.setLeft(this.LJLLL.leftMargin);
        }
        if (!this.LLF) {
            this.LJLLI.setOnTouchListener(null);
        } else {
            this.LJLLI.setOnTouchListener(this);
        }
        this.LJLLI.setTag("startSlide");
        this.LJLLJ = LJIIJJI(this.LJLJJLL);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams3 = this.LJLLL;
        layoutParams2.topMargin = (int) (C74275TDb.LIZIZ(this.LJLJJLL, 4.0f) + layoutParams3.topMargin + layoutParams3.height);
        int i7 = this.LLJZ;
        layoutParams2.leftMargin = i7;
        layoutParams2.setMarginStart(i7);
        this.LJLLJ.setLayoutParams(layoutParams2);
        this.LJLLJ.setTag("startSlideTime");
        this.LLIIIILZ.addView(this.LJLLJ);
        this.LJLLJ.addTextChangedListener(new C79915VXz(this));
        WFS wfs2 = new WFS(this.LJLJJLL);
        this.LJLL = wfs2;
        wfs2.setScaleType(ImageView.ScaleType.FIT_XY);
        int i8 = C82848WfM.LJFF;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i5 + i8, this.LLJL);
        this.LJLLLL = layoutParams4;
        layoutParams4.topMargin = this.LLJLL;
        int i9 = (this.LJLILLLLZI - this.LLJZ) - i5;
        layoutParams4.leftMargin = i9;
        layoutParams4.setMarginStart(i9);
        this.LJLL.setLayoutParams(this.LJLLLL);
        if (C79255V8p.LIZ(this.LJLJJLL)) {
            this.LJLL.setLeft(this.LLJZ);
            C16310kV.LJIIIZ(this.LJLL, 1);
        } else {
            this.LJLL.setLeft(this.LJLLLL.leftMargin);
        }
        if (!this.LLF) {
            this.LJLL.setOnTouchListener(null);
        } else {
            this.LJLL.setOnTouchListener(this);
        }
        this.LJLL.setPadding(0, 0, i8, 0);
        this.LJLL.setPaddingRelative(0, 0, i8, 0);
        this.LJLL.setTag("endSlide");
        this.LJLLILLLL = LJIIJJI(this.LJLJJLL);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams6 = this.LJLLLL;
        layoutParams5.topMargin = (int) (C74275TDb.LIZIZ(this.LJLJJLL, 4.0f) + layoutParams6.topMargin + layoutParams6.height);
        int i10 = this.LJLILLLLZI;
        int i11 = this.LLJZ;
        layoutParams5.leftMargin = (i10 - i11) - i5;
        layoutParams5.setMarginStart(i11);
        this.LJLLILLLL.setLayoutParams(layoutParams5);
        this.LJLLILLLL.setTag("endSlideTime");
        this.LLIIIILZ.addView(this.LJLLILLLL);
        this.LJLLILLLL.addTextChangedListener(new VY0(this));
        LJJII();
        this.LJLLLLLL = new View(this.LJLJJLL);
        this.LJLZ = new View(this.LJLJJLL);
        if (C82852WfQ.LIZ().LJIIJ.invoke().booleanValue()) {
            i = R.color.wi;
        } else {
            i = R.color.x5;
        }
        setBorderColor(i);
        this.LLIIIILZ.addView(this.LJLLLLLL);
        this.LLIIIILZ.addView(this.LJLZ);
        int i12 = this.LLJZ;
        LJJ(i12, (this.LJLILLLLZI - i12) - i5);
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) this.LL.getLayoutParams();
        int i13 = this.LLJZ + i5;
        layoutParams7.leftMargin = i13;
        layoutParams7.height = this.LLJJJ;
        layoutParams7.topMargin = this.LLJJJJ;
        layoutParams7.setMarginStart(i13);
        this.LL.setLayoutParams(layoutParams7);
        this.LL.setTag("curPoint");
        this.LL.setOnTouchListener(this);
        C81186Vte c81186Vte = this.LL;
        if (c81186Vte != null) {
            C16880lQ.LJLLLL(c81186Vte, this.LLIIIILZ);
            this.LLIIIILZ.addView(this.LL);
        }
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) this.LLD.getLayoutParams();
        layoutParams8.width = this.LLJJIJIL;
        this.LLD.setLayoutParams(layoutParams8);
        if (this.LLJJIJI) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C8HN c8hn = this.LJLLJ;
        if (c8hn != null) {
            c8hn.setVisibility(i2);
        }
        C8HN c8hn2 = this.LJLLILLLL;
        if (c8hn2 != null) {
            c8hn2.setVisibility(i2);
        }
        this.LJZ = new View(this.LJLJJLL);
        this.LJZI = new View(this.LJLJJLL);
        this.LJZ.setBackgroundColor(this.LLJIJIL);
        this.LJZI.setBackgroundColor(this.LLJIJIL);
        int max = Math.max(this.LLILL - i5, 0);
        if (max == 0.0f) {
            i3 = max;
        } else {
            i3 = max + 20;
        }
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(i3, this.LLJJJJLIIL);
        layoutParams9.topMargin = (int) C74275TDb.LIZIZ(this.LJLJJLL, 7.0f);
        layoutParams9.gravity = 8388611;
        int i14 = this.LLJZ - max;
        layoutParams9.leftMargin = i14;
        layoutParams9.setMarginStart(i14);
        this.LJZ.setLayoutParams(layoutParams9);
        C82849WfN c82849WfN = this.LLIIII;
        int max2 = Math.max((int) ((((((float) c82849WfN.LJFF) / c82849WfN.LJ) - this.LLILL) - this.LLILIL) - i5), 0);
        int i15 = this.LLJZ;
        int min = Math.min(max2, i15);
        if (min == 0) {
            i4 = 0;
        } else {
            i4 = min + 20;
        }
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(i4, this.LLJJJJLIIL);
        layoutParams10.topMargin = (int) C74275TDb.LIZIZ(this.LJLJJLL, 7.0f);
        int i16 = i15 - min;
        layoutParams10.rightMargin = i16;
        layoutParams10.setMarginEnd(i16);
        layoutParams10.gravity = 8388613;
        this.LJZI.setLayoutParams(layoutParams10);
        View view = new View(this.LJLJJLL);
        this.LJZL = view;
        view.setTag("block");
        this.LJZL.setOnTouchListener(this);
        this.LJZL.setBackgroundColor(this.LLJI);
        this.LJZL.setVisibility(4);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams((int) this.LLILIL, this.LLJJJJLIIL);
        layoutParams11.topMargin = (int) C74275TDb.LIZIZ(this.LJLJJLL, 7.0f);
        int i17 = this.LLJZ + i5;
        layoutParams11.leftMargin = i17;
        layoutParams11.setMarginStart(i17);
        this.LJZL.setLayoutParams(layoutParams11);
        this.LLIIIILZ.addView(this.LJZL);
        this.LL.bringToFront();
        this.LLIIIILZ.addView(this.LJZ);
        this.LLIIIILZ.addView(this.LJZI);
        this.LLIIIILZ.addView(this.LJLLI);
        this.LLIIIILZ.addView(this.LJLL);
        LJIJ();
    }

    public void LJIJ() {
        int i;
        if (this.LJZI == null) {
            return;
        }
        float startX = this.LJLL.getStartX();
        C82849WfN c82849WfN = this.LLIIII;
        float f = (((float) c82849WfN.LJFF) / c82849WfN.LJ) - this.LLILII;
        int i2 = C82848WfM.LIZJ;
        int i3 = (int) ((this.LJLILLLLZI - startX) - i2);
        int max = Math.max(Math.min((int) ((f - (i2 * 2)) - this.LLILIL), i3), 0);
        if (max == 0) {
            i = 0;
        } else {
            i = max + 20;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, this.LLJJJJLIIL);
        int i4 = i3 - max;
        layoutParams.rightMargin = i4;
        layoutParams.setMarginEnd(i4);
        layoutParams.topMargin = this.LLJLILLLLZIIL;
        layoutParams.gravity = 8388613;
        this.LJZI.setLayoutParams(layoutParams);
    }

    public final void LJIJI() {
        if (this.LJZL == null) {
            return;
        }
        int startX = (int) (this.LJLLI.getStartX() + C82848WfM.LIZJ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Double.valueOf(Math.ceil(this.LLILIL)).intValue(), this.LLJJJJLIIL);
        layoutParams.topMargin = this.LLJLILLLLZIIL;
        layoutParams.leftMargin = startX;
        layoutParams.setMarginStart(startX);
        this.LJZL.setLayoutParams(layoutParams);
    }

    public void LJIJJLI() {
        if (this.LJZ == null) {
            return;
        }
        float startX = this.LJLLI.getStartX();
        int max = Math.max((this.LLJZ + C82848WfM.LIZJ) - this.LLILL, 0);
        int max2 = Math.max((int) (startX - max), 0);
        if (max2 != 0.0f) {
            max2 += 20;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(max2, this.LLJJJJLIIL);
        layoutParams.topMargin = this.LLJLILLLLZIIL;
        layoutParams.leftMargin = max;
        layoutParams.setMarginStart(max);
        layoutParams.gravity = 8388611;
        this.LJZ.setLayoutParams(layoutParams);
    }

    public final void LJIL() {
        if (!this.LLJJIJI) {
            return;
        }
        this.LJLLJ.setX((((r0.getMeasuredWidth() - r0.getPaddingRight()) / 2.0f) + this.LJLLI.getX()) - (r3.getMeasuredWidth() / 2.0f));
        this.LJLLILLLL.setX((((r0.getMeasuredWidth() - r0.getPaddingRight()) / 2.0f) + this.LJLL.getX()) - (r3.getMeasuredWidth() / 2.0f));
        float f = 0.0f;
        if (Math.abs(this.LJLLJ.getX() - this.LJLLILLLL.getX()) - ((this.LJLLILLLL.getWidth() + this.LJLLJ.getWidth()) / 2.0f) > 0.0f) {
            f = 1.0f;
        }
        if (this.LJLLJ.getAlpha() != f) {
            this.LJLLJ.animate().alpha(f).setDuration(150L).start();
            this.LJLLILLLL.animate().alpha(f).setDuration(150L).start();
        }
    }

    public void LJJIFFI() {
        this.LJLJLJ.rv0(this.LLIZ, this.LLILLL);
        this.LJLJLJ.sv0(this.LLILLL, getOverXScroll());
        C82849WfN c82849WfN = this.LLIIII;
        c82849WfN.LIZ.put(((VideoSegment) ListProtector.get(this.LJLJLJ.kv0(), this.LLILLL)).LJII(true), Float.valueOf(this.LLIZ.LIZLLL));
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LJLJLJ.kv0(), this.LLILLL);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLJLLL;
        cutMultiVideoViewModel.LJLILLLLZI.put(videoSegment.LJII(true), 1);
    }

    public void LJJII() {
        if (this.LJLLI == null || this.LJLL == null) {
            return;
        }
        if (C82852WfQ.LIZ().LJIIJ.invoke().booleanValue()) {
            this.LJLLI.setImageResource(R.drawable.dej);
            this.LJLL.setImageResource(R.drawable.deh);
        } else {
            this.LJLLI.setImageResource(R.drawable.dei);
            this.LJLL.setImageResource(R.drawable.deg);
        }
    }

    public final void LJJIJL() {
        VideoEditViewModel videoEditViewModel;
        if (this.LLIIII == null || (videoEditViewModel = this.LJLJLJ) == null || C77413UZt.LJIILL(videoEditViewModel.kv0())) {
            return;
        }
        if (this.LLILLJJLI == 1) {
            this.LLIIII.LIZIZ(this.LJLJLJ.kv0(), this.LJLJLJ.nv0());
            return;
        }
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LJLJLJ.kv0(), 0);
        this.LLIIII.LIZJ(this.LLILLJJLI, videoSegment.LJII(true), videoSegment.LJIIIIZZ(), videoSegment.duration);
    }

    public final void LJJIL() {
        if (this.LLI) {
            return;
        }
        this.LLI = true;
        C82848WfM.LJ(this.LJLJJLL);
    }

    public float getAudioStartTranslationX() {
        WFS wfs = this.LJLLI;
        if (wfs != null) {
            return wfs.getTranslationX();
        }
        return 0.0f;
    }

    public RecyclerView getCurrentFrameRecyclerView() {
        if (this.LLILLJJLI == 0) {
            return this.LLIIIL;
        }
        return this.LLIIIJ;
    }

    @Override // X.I50, X.InterfaceC46045I5h
    public int getCurrentRotate() {
        int i = this.LLILLJJLI;
        if (i == 2 || i == 0) {
            return this.LLIZ.LIZJ;
        }
        return 0;
    }

    @Override // X.I50, X.InterfaceC46045I5h
    public float getCurrentSpeed() {
        int i = this.LLILLJJLI;
        if (i == 2 || i == 0) {
            return this.LLIZ.LIZLLL;
        }
        return this.LJLJLJ.nv0();
    }

    public float getEndSlideX() {
        return this.LJLL.getStartX();
    }

    @Override // X.I50, X.InterfaceC46045I5h
    public long getMaxCutDuration() {
        return this.LLIIII.LJFF;
    }

    @Override // X.I50
    public long getMultiPlayingPosition() {
        C82849WfN c82849WfN = this.LLIIII;
        List<VideoSegment> kv0 = this.LJLJLJ.kv0();
        float startX = ((this.LL.getStartX() + this.LLILII) - this.LJLLI.getStartX()) * this.LLIIII.LJ;
        float nv0 = this.LJLJLJ.nv0();
        c82849WfN.getClass();
        return C82849WfN.LIZ(kv0, startX, nv0);
    }

    @Override // X.I50, X.InterfaceC46045I5h
    public long getMultiSeekTime() {
        C82849WfN c82849WfN = this.LLIIII;
        List<VideoSegment> kv0 = this.LJLJLJ.kv0();
        float f = (this.LLILII + C82848WfM.LIZJ) * this.LLIIII.LJ;
        float nv0 = this.LJLJLJ.nv0();
        c82849WfN.getClass();
        return C82849WfN.LIZ(kv0, f, nv0);
    }

    public C15070iV<Long, Long> getMultiVideoPlayBoundary() {
        C82849WfN c82849WfN = this.LLIIII;
        List<VideoSegment> kv0 = this.LJLJLJ.kv0();
        float f = this.LLILII;
        float f2 = C82848WfM.LIZJ;
        float f3 = (f + f2) * this.LLIIII.LJ;
        float nv0 = this.LJLJLJ.nv0();
        c82849WfN.getClass();
        long LIZ = C82849WfN.LIZ(kv0, f3, nv0);
        C82849WfN c82849WfN2 = this.LLIIII;
        List<VideoSegment> kv02 = this.LJLJLJ.kv0();
        float f4 = (this.LLILII + f2 + this.LLILIL) * this.LLIIII.LJ;
        float nv02 = this.LJLJLJ.nv0();
        c82849WfN2.getClass();
        return new C15070iV<>(Long.valueOf(LIZ), Long.valueOf(C82849WfN.LIZ(kv02, f4, nv02)));
    }

    @Override // X.I50, X.InterfaceC46045I5h
    public C15070iV<Long, Long> getPlayBoundary() {
        if (this.LLILLJJLI == 1) {
            return getMultiVideoPlayBoundary();
        }
        return getSingleVideoPlayBoundary();
    }

    public long getSeekTime() {
        if (this.LLILLJJLI == 1) {
            return getMultiSeekTime();
        }
        return getSingleSeekTime();
    }

    @Override // X.I50, X.InterfaceC46045I5h
    public float getSelectedTime() {
        return (this.LLILIL * this.LLIIII.LJ) / 1000.0f;
    }

    public float getSelectedTimeInMillis() {
        return this.LLILIL * this.LLIIII.LJ;
    }

    @Override // X.I50
    public long getSinglePlayingPosition() {
        return ((this.LL.getStartX() + this.LLILII) - this.LJLLI.getStartX()) * this.LLIIII.LJ;
    }

    @Override // X.I50, X.InterfaceC46045I5h
    public long getSingleSeekTime() {
        return (this.LLILII + C82848WfM.LIZJ) * this.LLIIII.LJ;
    }

    public C15070iV<Long, Long> getSingleVideoPlayBoundary() {
        float f = this.LLILII;
        int i = C82848WfM.LIZJ;
        float f2 = this.LLIIII.LJ;
        return new C15070iV<>(Long.valueOf((i + f) * f2), Long.valueOf((f + i + this.LLILIL) * f2));
    }

    @Override // X.I50
    public C15070iV<Float, Float> getSlideX() {
        return new C15070iV<>(Float.valueOf(getStartSlideX()), Float.valueOf(getEndSlideX()));
    }

    public float getStartSlideX() {
        return this.LJLLI.getStartX();
    }

    public final void LJIILL() {
        String str;
        String LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf((this.LLILIL * this.LLIIII.LJ) / 1000.0f)});
        String str2 = "";
        if (this.LL == null || this.LJLLI == null || this.LJLJLLL.LJLJI.getValue() == null) {
            str = "";
        } else {
            str = C16880lQ.LLLZI(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) this.LJLJLLL.LJLJI.getValue().longValue()) / 1000.0f)});
        }
        if (this.LJLJLLL.LJLIL.getValue() != null) {
            str2 = this.LJLJLLL.LJLIL.getValue().toString();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getResources().getString(R.string.ia4, LLLZI));
        LIZ.append(";curPointer:");
        LIZ.append(str);
        LIZ.append("s;Totalspeed:");
        LIZ.append(this.LJLJLJ.nv0());
        LIZ.append(";mOneWidthDur:");
        LIZ.append(this.LLIIII.LJ);
        LIZ.append("\npair:");
        LIZ.append(str2);
        LIZ.append(";curOriginIndex:");
        LIZ.append(this.LLILLL);
        LIZ.append(";curEditIndex:");
        LIZ.append(this.LLILZ);
        LIZ.append("\n");
        X1D.LIZIZ(LIZ);
    }

    public void LJJIIJ() {
        if (System.currentTimeMillis() - this.LLL < 2000) {
            return;
        }
        if (this.LLILLJJLI == 2) {
            String string = getResources().getString(R.string.th8, Float.valueOf(0.5f));
            Context context = this.LJLJJLL;
            C82890Wg2.LJFF.getClass();
            new C82890Wg2(context, string, 0, 2).LIZ();
            this.LLL = System.currentTimeMillis();
            return;
        }
        String string2 = getResources().getString(R.string.th8, Float.valueOf(((float) getMinVideoLength()) / 1000.0f));
        Context context2 = this.LJLJJLL;
        C82890Wg2.LJFF.getClass();
        new C82890Wg2(context2, string2, 0, 2).LIZ();
        this.LLL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC46045I5h
    public boolean LIZIZ() {
        return this.LLIFFJFJJ;
    }

    @Override // X.I50
    public int getEditState() {
        return this.LLILLJJLI;
    }

    @Override // X.I50
    public View getEndSlide() {
        return this.LJLL;
    }

    public int getFrameHeight() {
        return this.LLJJJJLIIL;
    }

    public int getFrameWidth() {
        return this.LLJJJJJIL;
    }

    public int getLeftRightMargin() {
        return this.LLJLIL;
    }

    public long getMaxVideoLength() {
        return this.LJLJJI;
    }

    public long getMinVideoLength() {
        return this.LJLJI;
    }

    public int getOverXScroll() {
        return this.LLILL;
    }

    @Override // X.I50
    public View getStartSlide() {
        return this.LJLLI;
    }

    public InterfaceC153045zY getVeEditor() {
        return this.LLJJ;
    }

    public VideoEditViewModel getVideoEditViewModel() {
        return this.LJLJLJ;
    }

    public C170136m1 getViewConfig() {
        return this.LLII;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    private void setVideoSegmentData(List<VideoSegment> list) {
        this.LJLJLJ.tv0(list);
    }

    public final C8HN LJIIJJI(Context context) {
        C8HN c8hn = new C8HN(context);
        c8hn.setTextColor(context.getResources().getColor(R.color.v1));
        c8hn.setTextSize(12.0f);
        c8hn.setClickable(true);
        c8hn.setTypeface(C78882Uxa.LIZ(EnumC49617Jdd.MEDIUM.getFONT_NAME()), 0);
        c8hn.setOnTouchListener(this);
        return c8hn;
    }

    public boolean LJIILJJIL(String str) {
        if (!str.equals("curPoint") && ((int) ((this.LJLL.getStartX() - this.LJLLI.getStartX()) - C82848WfM.LIZJ)) < ((int) this.LLIIII.LJI) - 2) {
            LJJIIJ();
            C82848WfM.LJ(this.LJLJJLL);
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIZILJ(float f) {
        Iterator it = ((ArrayList) this.LLII.LIZ).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC82863Wfb interfaceC82863Wfb = (InterfaceC82863Wfb) it.next();
            C170636mp LIZ = interfaceC82863Wfb.LIZ(f, this.LJLLI.getStartX(), this.LLIIII.LJ, C82848WfM.LIZJ);
            int i = LIZ.LIZ;
            if (i == 0) {
                return;
            }
            if (i != 2) {
                if (i == 1) {
                    f = ((Float) LIZ.LIZIZ).floatValue();
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("illegal intercept result, result = ");
                    LIZ2.append(LIZ.toString());
                    LIZ2.append(", interceptor = ");
                    LIZ2.append(interfaceC82863Wfb.getName());
                    throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                }
            }
        }
        int i2 = this.LJLILLLLZI - this.LLJZ;
        int i3 = C82848WfM.LIZJ;
        float f2 = i2 - i3;
        if (f > f2) {
            if (this.LJLLI.getStartX() == this.LLJZ) {
                LJJIL();
            }
            f = f2;
        }
        float f3 = i3;
        if ((f - this.LJLLI.getStartX()) - f3 < this.LLIIII.LJI) {
            LJJIIJ();
            LJJIL();
            f = this.LJLLI.getStartX() + this.LLIIII.LJI + f3;
        }
        this.LJLL.setStartX(f);
        setCurPointerContainerStartX(this.LJLL.getStartX() - this.LLD.getWidth());
        LJJ((int) this.LJLLI.getStartX(), (int) this.LJLL.getStartX());
        LJII();
        this.LJLJLJ.LJLJJL.setValue(null);
        LJIJ();
        LJIJI();
    }

    public final void LJJI(int i) {
        if (!this.LLJILJILJ) {
            return;
        }
        long j = i;
        setMaxVideoLength(j);
        List<VideoSegment> kv0 = this.LJLJLJ.kv0();
        C82849WfN c82849WfN = this.LLIIII;
        boolean z = this.LJLJJL;
        c82849WfN.LJII = j;
        c82849WfN.LJIIJ = z;
        if (this.LLILLJJLI == 1) {
            c82849WfN.LIZIZ(this.LJLJLJ.kv0(), this.LJLJLJ.nv0());
            return;
        }
        if (C78886Uxe.LJJIJ(kv0)) {
            return;
        }
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(kv0, 0);
        videoSegment.duration = j;
        videoSegment.LJIIJJI(j);
        this.LLIIII.LIZJ(this.LLILLJJLI, videoSegment.LJII(true), videoSegment.LJIIIIZZ(), videoSegment.duration);
    }

    public final void LJJIIJZLJL(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        WFS wfs = this.LJLLI;
        int i9 = 4;
        if (wfs != null) {
            if (z) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            wfs.setVisibility(i8);
        }
        C8HN c8hn = this.LJLLJ;
        if (c8hn != null && this.LLJJIJI) {
            if (z) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            c8hn.setVisibility(i7);
        }
        WFS wfs2 = this.LJLL;
        if (wfs2 != null) {
            if (z) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            wfs2.setVisibility(i6);
        }
        C8HN c8hn2 = this.LJLLILLLL;
        if (c8hn2 != null && this.LLJJIJI) {
            if (z) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            c8hn2.setVisibility(i5);
        }
        View view = this.LJLLLLLL;
        if (view != null) {
            if (z) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            view.setVisibility(i4);
        }
        View view2 = this.LJLZ;
        if (view2 != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view2.setVisibility(i3);
        }
        View view3 = this.LJZ;
        if (view3 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
        View view4 = this.LJZI;
        if (view4 != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view4.setVisibility(i);
        }
        View view5 = this.LJZL;
        if (view5 != null) {
            if (z) {
                i9 = 0;
            }
            view5.setVisibility(i9);
        }
    }

    public void LJJIJIIJIL(VideoSegment videoSegment) {
        this.LLILLJJLI = 1;
        this.LJLJLJ.uv0(1);
        I5B i5b = this.LLIZ;
        if (i5b != null) {
            i5b.LIZIZ();
        }
        C82864Wfc c82864Wfc = this.LLILZLL;
        if (c82864Wfc != null) {
            c82864Wfc.LIZ = 0.0f;
            c82864Wfc.LIZIZ = 0.0f;
            c82864Wfc.LIZJ = 0;
        }
        this.LJLJLJ.iv0(videoSegment.LJII(true));
        this.LLIIII.LIZIZ(this.LJLJLJ.kv0(), this.LJLJLJ.nv0());
        LJIJJ(0, this.LLJZ, (this.LJLILLLLZI - r0) - C82848WfM.LIZJ, true);
        LJJIIZI(3, videoSegment);
    }

    public void LJJIJIL(C15070iV<Integer, Integer> c15070iV) {
        this.LLILLJJLI = 2;
        this.LJLJLJ.uv0(2);
        this.LLILZ = c15070iV.LIZ.intValue();
        this.LLILLL = c15070iV.LIZIZ.intValue();
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LJLJLJ.kv0(), this.LLILLL);
        I5B i5b = this.LLIZ;
        if (i5b == null) {
            this.LLIZ = new I5B(videoSegment);
        } else {
            i5b.LIZ(videoSegment);
        }
        this.LLIIII.LIZJ(this.LLILLJJLI, videoSegment.LJII(true), this.LJLJLJ.mv0(this.LLILLL).LJIIIIZZ(), videoSegment.duration);
        this.LLIIIJ.setVisibility(8);
        this.LLIIL.LJZI();
        this.LLIIIL.setVisibility(0);
        this.LLIIIL.LJLI(0);
        this.LLIILII.LJZ(this.LLIIII.LIZIZ, videoSegment);
        this.LLIIIL.LJLIIIL(this.LJLJLJ.lv0(this.LLILLL), 0);
        C82864Wfc c82864Wfc = this.LLILZLL;
        float startSlideX = getStartSlideX();
        float endSlideX = getEndSlideX();
        int overXScroll = getOverXScroll();
        c82864Wfc.LIZ = startSlideX;
        c82864Wfc.LIZIZ = endSlideX;
        c82864Wfc.LIZJ = overXScroll;
        C82849WfN c82849WfN = this.LLIIII;
        VideoSegment mv0 = this.LJLJLJ.mv0(this.LLILLL);
        float LJIIIZ = (((((float) mv0.LJIIIZ()) * 1.0f) / (mv0.LJIIIIZZ() * c82849WfN.LJ)) + this.LLJZ) - this.LJLJLJ.lv0(this.LLILLL);
        LJIJJ(0, LJIIIZ, C82848WfM.LIZ(this.LJLJJLL, this.LLIIII, LJIIIZ, this.LJLJLJ.mv0(this.LLILLL), this.LLJZ), true);
        this.LJLJLJ.LJLLL.setValue(c15070iV);
    }

    public void setBorderColor(int i) {
        this.LJLLLLLL.setBackgroundColor(this.LJLJJLL.getResources().getColor(i));
        this.LJLZ.setBackgroundColor(this.LJLJJLL.getResources().getColor(i));
    }

    @Override // X.I50
    public void setCanEdit(boolean z) {
        this.LLJZIJLIL = z;
    }

    public void setCurPointerContainerStartX(float f) {
        float f2;
        C81186Vte c81186Vte = this.LL;
        if (c81186Vte != null) {
            int i = this.LLJZ;
            int i2 = C82848WfM.LIZJ;
            int i3 = i + i2;
            if (f <= i3) {
                f2 = i3 - C82848WfM.LJ;
            } else {
                int i4 = ((this.LJLILLLLZI - i) - i2) - C82848WfM.LIZLLL;
                if (f >= i4) {
                    f2 = i4 + C82848WfM.LJ;
                } else {
                    f2 = f + ((((2.0f * f) / r3) - 1.0f) * C82848WfM.LJ);
                }
            }
            c81186Vte.setStartX(f2);
        }
    }

    @Override // X.I50
    public void setCurrentRotate(int i) {
        int i2 = this.LLILLJJLI;
        if (i2 == 2 || i2 == 0) {
            this.LLIZ.LIZJ = i;
        }
    }

    @Override // X.I50
    public void setEditViewHeight(boolean z) {
        if (z) {
            this.LLJJJ = this.LLJJJIL;
            this.LLJJJJLIIL = this.LLJJL;
            this.LLJJJJ = 0;
        } else {
            this.LLJJJ = (int) C74275TDb.LIZIZ(getContext(), 44.0f);
            this.LLJJJJLIIL = this.LLJJLIIIJLLLLLLLZ;
            this.LLJJJJ = (int) C74275TDb.LIZIZ(getContext(), 2.0f);
        }
        int i = this.LLJJJJLIIL;
        this.LLJL = (this.LLJLLIL * 2) + i;
        WF7 wf7 = this.LLIIL;
        wf7.LJLLI = i;
        wf7.LJLJJL.LIZIZ(i);
        WF7 wf72 = this.LLIILII;
        int i2 = this.LLJJJJLIIL;
        wf72.LJLLI = i2;
        wf72.LJLJJL.LIZIZ(i2);
        C16880lQ.LJLLLL(this.LJLLI, this.LLIIIILZ);
        C16880lQ.LJLLLL(this.LJLLJ, this.LLIIIILZ);
        C16880lQ.LJLLLL(this.LJLL, this.LLIIIILZ);
        C16880lQ.LJLLLL(this.LJLLILLLL, this.LLIIIILZ);
        C16880lQ.LJLLLL(this.LJLLLLLL, this.LLIIIILZ);
        C16880lQ.LJLLLL(this.LJLZ, this.LLIIIILZ);
        C16880lQ.LJLLLL(this.LL, this.LLIIIILZ);
        C16880lQ.LJLLLL(this.LJZ, this.LLIIIILZ);
        C16880lQ.LJLLLL(this.LJZI, this.LLIIIILZ);
        C16880lQ.LJLLLL(this.LJZL, this.LLIIIILZ);
        LJIILIIL();
    }

    public void setEnableBoundaryText(boolean z) {
        int i;
        if (z != this.LLJJIJI) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C8HN c8hn = this.LJLLJ;
            if (c8hn != null) {
                c8hn.setVisibility(i);
            }
            C8HN c8hn2 = this.LJLLILLLL;
            if (c8hn2 != null) {
                c8hn2.setVisibility(i);
            }
        }
        this.LLJJIJI = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.LLJILJIL = z;
        if (this.LLIIIJ.getLayoutManager() instanceof ScrollInterceptedLayoutManager) {
            ((ScrollInterceptedLayoutManager) this.LLIIIJ.getLayoutManager()).LLIIIJ = z;
        }
    }

    public void setEndCoverColor(int i) {
        View view = this.LJZI;
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i);
    }

    @Override // X.I50
    public void setExtractFramesInRoughMode(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public void setFirstFrameBitmapLiveData(MutableLiveData<Bitmap> mutableLiveData) {
        this.LLJJI = mutableLiveData;
    }

    public void setFirstFrameVisibleLiveData(MutableLiveData<Boolean> mutableLiveData) {
        this.LLJJIII = mutableLiveData;
    }

    @Override // X.I50
    public void setLoadThumbnailDirectly(boolean z) {
        this.LLJILLL = z;
    }

    @Override // X.I50
    public void setMaxVideoLength(long j) {
        this.LJLJJI = j;
    }

    @Override // X.I50
    public void setMinVideoLength(long j) {
        this.LJLJI = j;
    }

    public void setMvThemeVideoType(boolean z) {
        this.LLIZLLLIL = z;
    }

    public void setOptimizeEffect(boolean z) {
        this.LLIL = z;
    }

    public void setPointerType(int i) {
        this.LLJ = i;
    }

    @Override // X.I50
    public void setUseCustomMaxVideoLengthDirectly(boolean z) {
        this.LJLJJL = z;
    }

    public void setVeEditor(InterfaceC153045zY interfaceC153045zY) {
        this.LLJJ = interfaceC153045zY;
    }

    public void setViewConfig(C170136m1 c170136m1) {
        this.LLII = c170136m1;
    }

    public ViewOnTouchListenerC82857WfV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r5 <= 0.0f) goto L14;
     */
    @Override // X.InterfaceC46045I5h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C15070iV<java.lang.Float, java.lang.Float> r9, java.util.List<com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC82857WfV.LIZ(X.0iV, java.util.List):void");
    }

    public final void LJIILLIIL(float f, boolean z) {
        if (this.LL.getVisibility() != 0) {
            this.LL.setVisibility(0);
        }
        C82891Wg3.LIZLLL().d(C16880lQ.LLLZI(Locale.getDefault(), "VEEffectSeekLayout->processCurPointSlide0: targetX: %f, isTouch: %b", new Object[]{Float.valueOf(f), Boolean.valueOf(z)}));
        if (this.LLJ == 2) {
            int i = this.LLJZ;
            int i2 = C82848WfM.LIZJ;
            f = Math.min(Math.max(i + i2, f), ((this.LJLILLLLZI - this.LLJZ) - i2) - C82848WfM.LIZLLL);
        } else {
            float startX = this.LJLLI.getStartX();
            float f2 = C82848WfM.LIZJ;
            if (f < startX + f2) {
                f = this.LJLLI.getStartX() + f2;
            }
            if (f > this.LJLL.getStartX() - this.LLD.getWidth()) {
                f = this.LJLL.getStartX() - this.LLD.getWidth();
            }
        }
        C82891Wg3.LIZLLL().d(C16880lQ.LLLZI(Locale.getDefault(), "VEEffectSeekLayout->processCurPointSlide1: targetX: %f", new Object[]{Float.valueOf(f)}));
        setCurPointerContainerStartX(f);
        this.LJLJLJ.pv0(this.LLILIL);
        if (z) {
            if (this.LLILLJJLI == 2) {
                this.LJLJLJ.LJLJJI.setValue(Long.valueOf(getSinglePlayingPosition()));
            } else {
                this.LJLJLJ.LJLJJI.setValue(Long.valueOf(getMultiPlayingPosition()));
            }
        }
    }

    public final void LJJ(int i, int i2) {
        if (this.LJLLLLLL == null || this.LJLZ == null) {
            return;
        }
        int i3 = C82848WfM.LIZJ;
        int i4 = i + i3;
        int LIZIZ = ((i2 - i) - i3) + ((int) C74275TDb.LIZIZ(this.LJLJJLL, 1.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LIZIZ, this.LLJLLIL);
        layoutParams.leftMargin = i4;
        layoutParams.setMarginStart(i4);
        layoutParams.topMargin = this.LLJLL;
        this.LJLLLLLL.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(LIZIZ, this.LLJLLIL);
        layoutParams2.leftMargin = i4;
        layoutParams2.setMarginStart(i4);
        layoutParams2.topMargin = (this.LLJLL + this.LLJL) - this.LLJLLIL;
        this.LJLZ.setLayoutParams(layoutParams2);
    }

    public final void LJJIII(int i, int i2) {
        float f;
        this.LLIIJI.setVisibility(0);
        this.LLIIIZ.setVisibility(0);
        UIS uis = this.LLIIIZ;
        float audioStartTranslationX = getAudioStartTranslationX();
        float f2 = i;
        float f3 = i2;
        if (f2 >= f3) {
            f = f3 / this.LLIIII.LJ;
        } else {
            f = f2 / this.LLIIII.LJ;
        }
        uis.getViewTreeObserver().addOnGlobalLayoutListener(new UIT(uis, i, f, audioStartTranslationX));
    }

    public void LJJIIZI(int i, VideoSegment videoSegment) {
        this.LLIIIJ.setVisibility(0);
        this.LLIIIL.setVisibility(8);
        this.LLIILII.LJZI();
        if (i == 2) {
            this.LLIIIJ.LJLI(0);
            this.LLIIL.LJZL(this.LLIIII.LIZIZ);
            this.LJLJLJ.LJLLLLLL.setValue(null);
        } else {
            if (i == 3) {
                this.LLIIIJ.LJLI(0);
                WF7 wf7 = this.LLIIL;
                HashMap<String, Float> hashMap = this.LLIIII.LIZIZ;
                if (!C78886Uxe.LJJIJ(wf7.LJLJJLL)) {
                    ((ArrayList) wf7.LJLJJLL).remove(videoSegment);
                    wf7.LJZL(hashMap);
                }
                this.LJLJLJ.LJLZ.setValue(videoSegment);
                return;
            }
            if (i != 1) {
                return;
            }
            this.LJLJLJ.LJLLLL.setValue(null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02e7, code lost:
    
        if (r11.equals("endSlide") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x031d, code lost:
    
        r15.LJLJLJ.LJLL.setValue(null);
        r15.LJLJLJ.LJZI.setValue(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0311, code lost:
    
        if (r11.equals("startSlideTime") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0336, code lost:
    
        r15.LJLJLJ.LJLJL.setValue(null);
        r15.LJLJLJ.LJZI.setValue(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0319, code lost:
    
        if (r11.equals("endSlideTime") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0332, code lost:
    
        if (r11.equals("startSlide") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x035e, code lost:
    
        if (r11.equals("endSlide") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03a5, code lost:
    
        r15.LLFII = r15.LJLL.getLeftX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0399, code lost:
    
        if (r11.equals("startSlideTime") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03b7, code lost:
    
        r15.LLFII = r15.LJLLI.getLeftX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03a1, code lost:
    
        if (r11.equals("endSlideTime") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03b3, code lost:
    
        if (r11.equals("startSlide") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r0 != 5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
    
        if (r9 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0110, code lost:
    
        if (r4 >= r15.LLJZ) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0112, code lost:
    
        LJJIL();
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC82857WfV.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public ViewOnTouchListenerC82857WfV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLF = true;
        this.LLII = new C170136m1();
        this.LLIIZ = false;
        this.LLIL = false;
        this.LLILZIL = true;
        this.LLJ = 1;
        this.LLJILJIL = true;
        this.LLJILJILJ = false;
        this.LLJILLL = true;
        this.LLJJIJI = false;
        int i2 = C82848WfM.LIZIZ;
        this.LLJJJJJIL = i2;
        int i3 = C82848WfM.LIZ;
        this.LLJJJJLIIL = i3;
        this.LLJJLIIIJLLLLLLLZ = (int) C74275TDb.LIZIZ(getContext(), 32.0f);
        this.LLJZ = (int) C74275TDb.LIZIZ(getContext(), 36.0f);
        this.LLJZIJLIL = true;
        this.LLLF = -1.0f;
        this.LLLFF = new C82859WfX(this);
        this.LLLFFI = true;
        this.LJLJJLL = context;
        this.LLJLLIL = (int) C74275TDb.LIZIZ(context, 2.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a87, R.attr.a8q, R.attr.a8r, R.attr.aet, R.attr.aev, R.attr.anz, R.attr.b0v, R.attr.b0w, R.attr.b24, R.attr.b4z, R.attr.bah, R.attr.bbm, R.attr.bee});
            if (C82852WfQ.LIZ().LJIIJ.invoke().booleanValue()) {
                this.LLJI = C07290Qj.LJIIL(0, 0);
            } else {
                this.LLJI = obtainStyledAttributes.getColor(6, 0);
                this.LLJI = C07290Qj.LJIIL(this.LLJI, (int) (obtainStyledAttributes.getFloat(7, 1.0f) * 255.0f));
            }
            this.LLJIJIL = obtainStyledAttributes.getColor(12, getResources().getColor(R.color.xt));
            this.LLJ = obtainStyledAttributes.getInt(9, 1);
            this.LLJJJJJIL = Math.round(obtainStyledAttributes.getDimension(4, i2));
            int round = Math.round(obtainStyledAttributes.getDimension(3, i3));
            this.LLJJL = round;
            this.LLJJJJLIIL = round;
            this.LLJJIJIL = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
            int round2 = Math.round(obtainStyledAttributes.getDimension(1, 0.0f));
            this.LLJJJIL = round2;
            this.LLJJJ = round2;
            this.LLJLIL = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
            this.LLJLLL = obtainStyledAttributes.getBoolean(10, false);
            this.LLJL = (this.LLJLLIL * 2) + this.LLJJJJLIIL;
            this.LLJZ = Math.round(obtainStyledAttributes.getDimension(11, this.LLJLIL - C82848WfM.LIZJ));
            int i4 = this.LLJJJ;
            this.LLJLL = (i4 - this.LLJL) / 2;
            this.LLJLILLLLZIIL = (i4 - this.LLJJJJLIIL) / 2;
            this.LLILZIL = obtainStyledAttributes.getBoolean(8, true);
            obtainStyledAttributes.recycle();
        }
    }

    public final void LJJIIZ(final boolean z, boolean z2, final InterfaceC15040iS<Void> interfaceC15040iS) {
        AlphaAnimation alphaAnimation;
        if (z2) {
            if (z) {
                alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            } else {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.6mw
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    if (!z) {
                        ViewOnTouchListenerC82857WfV.this.LJJIIJZLJL(false);
                    }
                    InterfaceC15040iS interfaceC15040iS2 = interfaceC15040iS;
                    if (interfaceC15040iS2 != null) {
                        interfaceC15040iS2.accept(null);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    if (z) {
                        ViewOnTouchListenerC82857WfV.this.LJJIIJZLJL(true);
                    }
                }
            });
            WFS wfs = this.LJLLI;
            if (wfs != null) {
                wfs.startAnimation(alphaAnimation);
            }
            WFS wfs2 = this.LJLL;
            if (wfs2 != null) {
                wfs2.startAnimation(alphaAnimation);
            }
            View view = this.LJLLLLLL;
            if (view != null) {
                view.startAnimation(alphaAnimation);
            }
            View view2 = this.LJLZ;
            if (view2 != null) {
                view2.startAnimation(alphaAnimation);
            }
            View view3 = this.LJZL;
            if (view3 != null) {
                view3.startAnimation(alphaAnimation);
                return;
            }
            return;
        }
        LJJIIJZLJL(z);
    }

    public final boolean LJJIJLIJ(int i, int i2, boolean z) {
        float f;
        WFS wfs = this.LJLLI;
        if (wfs == null || !wfs.isLaidOut() || this.LJLLI.getLeft() == 0) {
            return false;
        }
        if (this.LLILLJJLI == 1) {
            this.LLIIIJ.LJLI(0);
            this.LLIIIJ.LJLIIIL(0, 0);
        } else {
            this.LJLJLJ.sv0(this.LLILLL, 0);
            this.LLIIIL.LJLI(0);
            this.LLIIIL.LJLIIIL(0, 0);
        }
        C82849WfN c82849WfN = this.LLIIII;
        float f2 = c82849WfN.LJ;
        float f3 = (((i * 1.0f) / f2) + this.LLJZ) - 0;
        if (i2 >= c82849WfN.LJFF) {
            int LJ = C81184Vtc.LJ(this.LJLJJLL);
            int i3 = this.LLJZ;
            int i4 = C82848WfM.LIZJ;
            f = (LJ - i3) - i4;
            f3 = Math.max((f - i4) - ((i2 - i) / this.LLIIII.LJ), i3);
        } else {
            f = ((i2 - i) / f2) + C82848WfM.LIZJ + f3;
        }
        LJIJJ(0, f3, f, z);
        if (z) {
            setCurPointerContainerStartX(this.LLJZ + C82848WfM.LIZJ);
        }
        return true;
    }

    @Override // X.InterfaceC46045I5h
    public final boolean LJFF(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        MediaModel mediaModel;
        this.LJLJLLL = cutMultiVideoViewModel;
        if (cutMultiVideoViewModel.LJLLILLLL) {
            mediaModel = new MediaModel(-1L);
            mediaModel.fileLocalUriPath = str;
            mediaModel.width = 720;
            mediaModel.height = 1280;
            mediaModel.duration = cutMultiVideoViewModel.LJLLJ;
        } else {
            VEUtils.VEVideoFileInfo LIZIZ = H8A.LIZIZ(str);
            if (LIZIZ != null) {
                mediaModel = new MediaModel(-1L);
                mediaModel.fileLocalUriPath = str;
                mediaModel.width = LIZIZ.width;
                mediaModel.height = LIZIZ.height;
                mediaModel.duration = LIZIZ.duration;
            } else {
                return false;
            }
        }
        LJI(lifecycleOwner, viewModelProvider, cutMultiVideoViewModel, Collections.singletonList(mediaModel));
        return true;
    }

    @Override // X.InterfaceC46045I5h
    public final void LJI(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, List list) {
        int i;
        if (list.size() > 1) {
            i = 1;
        } else {
            i = 0;
        }
        LIZJ(lifecycleOwner, viewModelProvider, cutMultiVideoViewModel, null, C43547H7f.LIZ(list, false, null, 14), i);
    }

    public final void LJIJJ(int i, float f, float f2, boolean z) {
        this.LJLLI.setStartX(f);
        UIS uis = this.LLIIIZ;
        uis.LJLJL = (int) getAudioStartTranslationX();
        uis.invalidate();
        this.LJLL.setStartX(f2);
        LJJ((int) this.LJLLI.getStartX(), (int) this.LJLL.getStartX());
        this.LLILL = i;
        LJII();
        post(new ARunnableS20S0110000_14(this, z, 6));
    }

    @Override // X.InterfaceC46045I5h
    public final void LIZJ(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List list, int i) {
        int i2;
        VideoEditViewModel videoEditViewModel2;
        this.LLILLJJLI = i;
        this.LJLJL = lifecycleOwner;
        this.LJLJLLL = cutMultiVideoViewModel;
        if (videoEditViewModel == null) {
            this.LJLJLJ = (VideoEditViewModel) viewModelProvider.get(VideoEditViewModel.class);
        } else {
            this.LJLJLJ = videoEditViewModel;
        }
        if (cutMultiVideoViewModel.LJLLILLLL) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VideoSegment videoSegment = (VideoSegment) it.next();
                videoSegment.duration = cutMultiVideoViewModel.LJLLJ;
                videoSegment.width = 720;
                videoSegment.height = 1280;
            }
        }
        this.LJLJLJ.tv0(list);
        this.LJLILLLLZI = C81184Vtc.LJ(this.LJLJJLL);
        this.LLILZ = 0;
        this.LLILLL = 0;
        List<VideoSegment> kv0 = this.LJLJLJ.kv0();
        int LJ = C81184Vtc.LJ(this.LJLJJLL) - (this.LLJZ * 2);
        int i3 = C82848WfM.LIZJ;
        int i4 = i3 * 2;
        C82849WfN c82849WfN = new C82849WfN(kv0, LJ - i4);
        this.LLIIII = c82849WfN;
        long j = this.LJLJJI;
        boolean z = this.LJLJJL;
        c82849WfN.LJII = j;
        c82849WfN.LJIIJ = z;
        c82849WfN.LJIIIIZZ = this.LJLJI;
        View inflate = View.inflate(this.LJLJJLL, R.layout.drs, this);
        this.LL = (C81186Vte) inflate.findViewById(R.id.c0w);
        this.LLD = (ImageView) inflate.findViewById(R.id.c0v);
        this.LLIIIILZ = (FrameLayout) inflate.findViewById(R.id.dmz);
        this.LLIIIJ = (C80190Vda) inflate.findViewById(R.id.dn6);
        this.LLIIIL = (C80190Vda) inflate.findViewById(R.id.k0r);
        this.LLIIIZ = (UIS) inflate.findViewById(R.id.a_f);
        this.LLIIJI = inflate.findViewById(R.id.jsd);
        this.LLIIJLIL = inflate.findViewById(R.id.btt);
        if (this.LLILLJJLI == 1) {
            this.LLILZLL = new C82864Wfc();
            this.LLIIII.LIZIZ(this.LJLJLJ.kv0(), this.LJLJLJ.nv0());
        } else {
            VideoSegment videoSegment2 = (VideoSegment) ListProtector.get(this.LJLJLJ.kv0(), 0);
            this.LLIZ = new I5B(videoSegment2);
            this.LLIIII.LIZJ(this.LLILLJJLI, videoSegment2.LJII(true), videoSegment2.LJIIIIZZ(), videoSegment2.duration);
        }
        this.LLILIL = (this.LJLILLLLZI - (this.LLJZ * 2)) - i4;
        this.LLILII = -i3;
        View view = this.LLIIJLIL;
        if (this.LLJLLL) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        int i5 = this.LLJZ + i3;
        this.LLIIJLIL.setBackground(C78127UlP.LIZJ(getResources().getColor(R.color.y1), 0, (int) C74275TDb.LIZIZ(getContext(), 1.0f), 0));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LLIIJLIL.getLayoutParams();
        layoutParams.topMargin = this.LLJLILLLLZIIL;
        layoutParams.setMarginStart(i5);
        layoutParams.setMarginEnd(i5);
        this.LLIIJLIL.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LLIIIL.getLayoutParams();
        layoutParams2.topMargin = this.LLJLILLLLZIIL;
        this.LLIIIL.setLayoutParams(layoutParams2);
        C80190Vda c80190Vda = this.LLIIIL;
        int i6 = this.LLJZ + i3;
        c80190Vda.setPadding(i6, 0, i6, 0);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.LLIIIJ.getLayoutParams();
        layoutParams3.topMargin = this.LLJLILLLLZIIL;
        this.LLIIIJ.setLayoutParams(layoutParams3);
        C80190Vda c80190Vda2 = this.LLIIIJ;
        int i7 = this.LLJZ + i3;
        c80190Vda2.setPadding(i7, 0, i7, 0);
        int LJ2 = C74275TDb.LJ(getContext()) - ((this.LLJZ + i3) * 2);
        C82862Wfa c82862Wfa = new C82862Wfa();
        c82862Wfa.LIZ = new int[]{this.LLJJJJJIL, this.LLJJJJLIIL, LJ2};
        List<VideoSegment> kv02 = this.LJLJLJ.kv0();
        c82862Wfa.LIZIZ = kv02;
        HashMap<String, Float> hashMap = this.LLIIII.LIZIZ;
        WFB wfb = this.LLIILZL;
        boolean z2 = this.LLIIZ;
        c82862Wfa.LIZJ = z2;
        this.LLIILII = new WF7(this.LJLJJLL, new WF8(c82862Wfa.LIZ, kv02, hashMap, 2, wfb, z2));
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.LLIIIZ.getLayoutParams();
        layoutParams4.height = this.LLJJJJLIIL;
        layoutParams4.topMargin = this.LLJLILLLLZIIL;
        this.LLIIIZ.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.LLIIJI.getLayoutParams();
        layoutParams5.height = this.LLJJJJLIIL;
        layoutParams5.topMargin = this.LLJLILLLLZIIL;
        this.LLIIJI.setLayoutParams(layoutParams5);
        View view2 = this.LLIIJI;
        int i8 = this.LLJZ + i3;
        view2.setPadding(i8, 0, i8, 0);
        if (this.LLIILZL != null) {
            WF7 wf7 = this.LLIILII;
            boolean z3 = this.LLII.LIZIZ;
            WF6 wf6 = wf7.LJLJJL;
            if (wf6 instanceof WFA) {
                ((WFA) wf6).LJLILLLLZI = z3;
            }
        }
        WF7 wf72 = this.LLIILII;
        boolean z4 = this.LLJJIJIIJIL;
        WF6 wf62 = wf72.LJLJJL;
        if (wf62 instanceof VEMediaParserFrameProviderImpl) {
            ((VEMediaParserFrameProviderImpl) wf62).LJLIL = z4;
        }
        this.LLIIIL.setAdapter(wf72);
        this.LLIIIL.setLayoutManager(new MVLinearLayoutManager());
        this.LLIIIL.LJIIJJI(this.LLLFF);
        this.LLIIIL.setflingScale(0.12d);
        C82862Wfa c82862Wfa2 = new C82862Wfa();
        c82862Wfa2.LIZ = new int[]{this.LLJJJJJIL, this.LLJJJJLIIL, LJ2};
        List<VideoSegment> kv03 = this.LJLJLJ.kv0();
        c82862Wfa2.LIZIZ = kv03;
        WF7 wf73 = new WF7(this.LJLJJLL, new WF8(c82862Wfa2.LIZ, kv03, this.LLIIII.LIZIZ, 1, this.LLIILZL, c82862Wfa2.LIZJ));
        this.LLIIL = wf73;
        if (this.LLIILZL != null) {
            boolean z5 = this.LLII.LIZIZ;
            WF6 wf63 = wf73.LJLJJL;
            if (wf63 instanceof WFA) {
                ((WFA) wf63).LJLILLLLZI = z5;
            }
        }
        boolean z6 = this.LLJJIJIIJIL;
        WF6 wf64 = wf73.LJLJJL;
        if (wf64 instanceof VEMediaParserFrameProviderImpl) {
            ((VEMediaParserFrameProviderImpl) wf64).LJLIL = z6;
        }
        this.LLIIIJ.setAdapter(wf73);
        this.LLIIIJ.setLayoutManager(new ScrollInterceptedLayoutManager());
        this.LLIIIJ.setflingScale(0.12d);
        this.LLIIIJ.LJIIJJI(this.LLLFF);
        if (this.LLILLJJLI == 0 || this.LLIZLLLIL) {
            this.LLIIIL.setVisibility(0);
            this.LLIIIJ.setVisibility(8);
            if (this.LJLJLLL.LJLLILLLL) {
                WF7 wf74 = this.LLIILII;
                wf74.LJLZ = true;
                wf74.LJZ = this.LLJJ;
            }
            WF7 wf75 = this.LLIILII;
            wf75.LJLJLLL = this.LLJJIII;
            wf75.LJLJLJ = this.LLJJI;
        } else {
            this.LLIIIL.setVisibility(8);
            this.LLIIIJ.setVisibility(0);
        }
        if (this.LLJILLL && (videoEditViewModel2 = this.LJLJLJ) != null) {
            if (this.LLILLJJLI == 0) {
                if (this.LLIILII != null) {
                    MutableLiveData<Boolean> mutableLiveData = this.LLJJIII;
                    if (mutableLiveData != null) {
                        mutableLiveData.setValue(Boolean.TRUE);
                    }
                    WF7 wf76 = this.LLIILII;
                    wf76.LJLJJLL = new ArrayList(wf76.LJLJL);
                    wf76.LL();
                    wf76.LJLLLLLL();
                }
            } else {
                WF7 wf77 = this.LLIIL;
                if (wf77 != null) {
                    wf77.LJLJJLL = new ArrayList(videoEditViewModel2.kv0());
                    wf77.LL();
                    wf77.LJLLLLLL();
                }
            }
        }
        this.LLD.setImageDrawable(C78127UlP.LIZJ(0, -1, 1, this.LLJJIJIL / 2));
        LJIILIIL();
        if (this.LLIL) {
            this.LLD.setVisibility(4);
            this.LLIIIL.setVisibility(0);
            this.LLIIIJ.setVisibility(8);
            LJJIIJZLJL(false);
            setVisibility(0);
        }
        LJIIJ();
        this.LLJILJILJ = true;
    }
}
