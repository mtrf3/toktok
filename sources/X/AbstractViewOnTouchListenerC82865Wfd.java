package X;

import Y.ARunnableS18S0101000_14;
import Y.AUListenerS40S0110000_14;
import Y.IDrS52S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.SpeedyLinearLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wfd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractViewOnTouchListenerC82865Wfd extends I50 implements View.OnTouchListener {
    public static final /* synthetic */ int LLJJJ = 0;
    public final DecelerateInterpolator LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public ImageView LJLJL;
    public WFS LJLJLJ;
    public WFS LJLJLLL;
    public C81186Vte LJLL;
    public C72843SiN LJLLI;
    public C72843SiN LJLLILLLL;
    public C57592Nv LJLLJ;
    public int LJLLL;
    public final float LJLLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public ActivityC45651qj LJZ;
    public LifecycleOwner LJZI;
    public VideoEditViewModel LJZL;
    public CutMultiVideoViewModel LL;
    public boolean LLD;
    public boolean LLF;
    public C82868Wfg LLFF;
    public C42342Gja LLFFF;
    public C42342Gja LLFII;
    public SpeedyLinearLayoutManager LLFZ;
    public SpeedyLinearLayoutManager LLI;
    public float LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public I5B LLIIIILZ;
    public boolean LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public int LLIILII;
    public final int LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public int LLILII;
    public int LLILIL;
    public int LLILL;
    public final int LLILLIZIL;
    public long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public long LLJIJIL;
    public Boolean LLJILJIL;
    public float LLJILJILJ;
    public long LLJILLL;
    public VEMediaParserProviderV2 LLJJ;
    public InterfaceC82871Wfj LLJJI;
    public final IDrS52S0100000_14 LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;

    public void LJIIL() {
        VideoEditViewModel videoEditViewModel;
        this.LLIIII = 0;
        View inflate = View.inflate(this.LJZ, R.layout.drt, this);
        this.LJLJL = (ImageView) inflate.findViewById(R.id.c0v);
        this.LJLL = (C81186Vte) inflate.findViewById(R.id.c0w);
        this.LJLLI = (C72843SiN) inflate.findViewById(R.id.dn6);
        this.LJLLILLLL = (C72843SiN) inflate.findViewById(R.id.k0r);
        this.LJLLJ = (C57592Nv) inflate.findViewById(R.id.ish);
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LJZL.kv0(), this.LLIIII);
        if (this.LLII != 1) {
            H7B.LIZ("init EditState");
            this.LLIIIILZ = new I5B((VideoSegment) ListProtector.get(this.LJZL.kv0(), 0));
            this.LLILLJJLI = ((float) r7.duration) / r7.LJIIIIZZ();
        } else {
            this.LLILLJJLI = C82868Wfg.LIZ(this.LJZL.kv0(), this.LJZL.nv0());
        }
        this.LLILZIL = LJIIJJI(this.LLILLJJLI, true);
        float f = this.LLIFFJFJJ;
        C82868Wfg c82868Wfg = new C82868Wfg(f);
        this.LLFF = c82868Wfg;
        c82868Wfg.LIZLLL = this.LJLZ;
        long j = this.LLILZIL;
        c82868Wfg.LIZIZ = j;
        this.LLILLL = 0L;
        this.LLILZ = j + 0;
        this.LJZL.pv0(f);
        if (this.LLII == 1) {
            C82868Wfg c82868Wfg2 = this.LLFF;
            long j2 = this.LLILLJJLI;
            this.LJZL.nv0();
            c82868Wfg2.LIZJ(j2);
        } else {
            this.LLFF.LIZLLL(videoSegment.LJIIIIZZ(), videoSegment.duration);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LJLLILLLL.getLayoutParams();
        layoutParams.topMargin = this.LLIL;
        this.LJLLILLLL.setLayoutParams(layoutParams);
        C72843SiN c72843SiN = this.LJLLILLLL;
        int i = this.LLILLIZIL;
        int i2 = C44689HgL.LIZJ;
        int i3 = i + i2;
        c72843SiN.setPadding(i3, 0, i3, 0);
        C42342Gja c42342Gja = new C42342Gja(this.LJZ, new int[]{this.LLIIL, this.LLIILII}, this.LLFF.LIZ, this.LLJJ, 0);
        this.LLFII = c42342Gja;
        c42342Gja.LJLILLLLZI.LJLIL = this.LLIZLLLIL;
        this.LJLLILLLL.setAdapter(c42342Gja);
        SpeedyLinearLayoutManager speedyLinearLayoutManager = new SpeedyLinearLayoutManager(this.LJZ);
        this.LLI = speedyLinearLayoutManager;
        this.LJLLILLLL.setLayoutManager(speedyLinearLayoutManager);
        this.LJLLILLLL.LJIIJJI(this.LLJJIII);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LJLLI.getLayoutParams();
        layoutParams2.topMargin = this.LLIL;
        this.LJLLI.setLayoutParams(layoutParams2);
        C72843SiN c72843SiN2 = this.LJLLI;
        int i4 = this.LLILLIZIL + i2;
        c72843SiN2.setPadding(i4, 0, i4, 0);
        C42342Gja c42342Gja2 = new C42342Gja(this.LJZ, new int[]{this.LLIIL, this.LLIILII}, this.LLFF.LIZ, this.LLJJ, 1);
        this.LLFFF = c42342Gja2;
        c42342Gja2.LJLILLLLZI.LJLIL = this.LLIZLLLIL;
        this.LJLLI.setAdapter(c42342Gja2);
        SpeedyLinearLayoutManager speedyLinearLayoutManager2 = new SpeedyLinearLayoutManager(this.LJZ);
        this.LLFZ = speedyLinearLayoutManager2;
        this.LJLLI.setLayoutManager(speedyLinearLayoutManager2);
        this.LJLLI.LJIIJJI(this.LLJJIII);
        if (this.LLII == 0) {
            this.LJLLILLLL.setVisibility(0);
            this.LJLLI.setVisibility(8);
        } else {
            this.LJLLILLLL.setVisibility(8);
            this.LJLLI.setVisibility(0);
        }
        if (this.LLIIIJ && (videoEditViewModel = this.LJZL) != null) {
            if (this.LLII == 0) {
                C42342Gja c42342Gja3 = this.LLFII;
                if (c42342Gja3 != null) {
                    List<VideoSegment> data = videoEditViewModel.kv0();
                    o.LJIIIZ(data, "data");
                    c42342Gja3.LJLJJLL = new ArrayList(data);
                    c42342Gja3.LJLJLLL = c42342Gja3.LJLZ(0.0f);
                    c42342Gja3.LJLILLLLZI.LIZ();
                    c42342Gja3.notifyDataSetChanged();
                }
            } else {
                C42342Gja c42342Gja4 = this.LLFFF;
                if (c42342Gja4 != null) {
                    List<VideoSegment> data2 = videoEditViewModel.kv0();
                    o.LJIIIZ(data2, "data");
                    c42342Gja4.LJLJJLL = new ArrayList(data2);
                    c42342Gja4.LJLJLLL = c42342Gja4.LJLZ(0.0f);
                    c42342Gja4.LJLILLLLZI.LIZ();
                    c42342Gja4.notifyDataSetChanged();
                }
            }
        }
        LJIILIIL();
        this.LJLJLLL.bringToFront();
        this.LJLJLJ.bringToFront();
        this.LJLL.bringToFront();
    }

    @Override // X.I50, X.InterfaceC46045I5h
    public abstract /* synthetic */ int getCurrentRotate();

    @Override // X.I50, X.InterfaceC46045I5h
    public abstract /* synthetic */ float getCurrentSpeed();

    @Override // X.I50
    public abstract /* synthetic */ int getEditState();

    @Override // X.I50, X.InterfaceC46045I5h
    public abstract /* synthetic */ long getLeftSeekingValue();

    @Override // X.I50, X.InterfaceC46045I5h
    public abstract /* synthetic */ long getMaxCutDuration();

    @Override // X.I50
    public abstract /* synthetic */ long getMultiPlayingPosition();

    @Override // X.I50, X.InterfaceC46045I5h
    public abstract /* synthetic */ long getMultiSeekTime();

    @Override // X.I50, X.InterfaceC46045I5h
    public abstract /* synthetic */ C15070iV<Long, Long> getPlayBoundary();

    @Override // X.I50
    public abstract /* synthetic */ long getPlayingPosition();

    @Override // X.I50, X.InterfaceC46045I5h
    public abstract /* synthetic */ long getRightSeekingValue();

    @Override // X.I50, X.InterfaceC46045I5h
    public abstract /* synthetic */ float getSelectedTime();

    @Override // X.I50
    public abstract /* synthetic */ long getSinglePlayingPosition();

    @Override // X.I50, X.InterfaceC46045I5h
    public abstract /* synthetic */ long getSingleSeekTime();

    @Override // X.I50
    public abstract /* synthetic */ C15070iV<Float, Float> getSlideX();

    @Override // X.I50
    public abstract /* synthetic */ void setCanEdit(boolean z);

    @Override // X.I50
    public abstract /* synthetic */ void setCurrentRotate(int i);

    @Override // X.I50
    public abstract /* synthetic */ void setDefaultMode(boolean z);

    @Override // X.I50
    public abstract /* synthetic */ void setExtractFramesInRoughMode(boolean z);

    @Override // X.I50
    public abstract /* synthetic */ void setLoadThumbnailDirectly(boolean z);

    @Override // X.I50
    public abstract /* synthetic */ void setMaxVideoLength(long j);

    @Override // X.I50
    public abstract /* synthetic */ void setMinVideoLength(long j);

    @Override // X.I50
    public abstract /* synthetic */ void setMultiEditEnableForStickPointMode(boolean z);

    @Override // X.I50
    public abstract /* synthetic */ void setUseCustomMaxVideoLengthDirectly(boolean z);

    private long getSelectedTimeV2() {
        return Math.round(((this.LJLJLJ.getStartX() - this.LJLJLLL.getStartX()) - C44689HgL.LIZJ) * this.LLFF.LIZ);
    }

    @Override // X.InterfaceC46045I5h
    public final void LJII() {
        int i;
        I5B i5b = this.LLIIIILZ;
        if (i5b != null && (i = this.LLII) != 1) {
            float f = (float) this.LLILLL;
            float f2 = i5b.LIZLLL;
            i5b.LIZ = f * f2;
            i5b.LIZIZ = ((float) this.LLILZ) * f2;
            if (i == 0) {
                this.LJZL.rv0(i5b, this.LLIIII);
            }
        }
    }

    public final void LJIIJ() {
        this.LJLL.setOnTouchListener(this);
        getRecyclerView().LJLJJLL();
        if (this.LLII == 1) {
            long j = this.LLILZIL;
            C82868Wfg c82868Wfg = this.LLFF;
            if (j != c82868Wfg.LIZIZ) {
                c82868Wfg.LIZIZ = j;
                long j2 = this.LLILLJJLI;
                this.LJZL.nv0();
                c82868Wfg.LIZJ(j2);
                this.LLFFF.LJLLLLLL(this.LLFF.LIZ, 0.0f);
            }
        } else {
            long j3 = this.LLILZIL;
            C82868Wfg c82868Wfg2 = this.LLFF;
            if (j3 != c82868Wfg2.LIZIZ) {
                c82868Wfg2.LIZIZ = j3;
                long min = Math.min(Math.min(j3, this.LLILLJJLI), c82868Wfg2.LIZLLL);
                c82868Wfg2.LIZIZ = min;
                c82868Wfg2.LIZ = ((float) min) / c82868Wfg2.LIZJ;
                this.LLFII.LJLLLLLL(this.LLFF.LIZ, this.LLIIIILZ.LIZLLL);
            }
        }
        LJJI();
        LJJ(this.LJLJLJ, (this.LJLLL - this.LLILLIZIL) - C44689HgL.LIZJ, false);
        LJJ(this.LJLJLLL, this.LLILLIZIL, true);
    }

    public final void LJIILIIL() {
        int i;
        WFS wfs = new WFS(this.LJZ);
        this.LJLJLLL = wfs;
        wfs.setScaleType(ImageView.ScaleType.FIT_XY);
        WFS wfs2 = this.LJLJLLL;
        int i2 = C44689HgL.LIZJ;
        int i3 = i2 / 2;
        wfs2.setPadding(i3, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, this.LLIIZ);
        layoutParams.topMargin = this.LLILII;
        this.LJLJLLL.setLayoutParams(layoutParams);
        this.LJLJLLL.setOnTouchListener(this);
        this.LJLJLLL.setTag("startSlide");
        this.LJLJLLL.setStartX(this.LLILLIZIL);
        WFS wfs3 = new WFS(this.LJZ);
        this.LJLJLJ = wfs3;
        wfs3.setScaleType(ImageView.ScaleType.FIT_XY);
        this.LJLJLJ.setPadding(0, 0, i3, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, this.LLIIZ);
        layoutParams2.topMargin = this.LLILII;
        this.LJLJLJ.setLayoutParams(layoutParams2);
        this.LJLJLJ.setOnTouchListener(this);
        this.LJLJLJ.setTag("endSlide");
        this.LJLJLJ.setStartX((this.LJLLL - this.LLILLIZIL) - i2);
        if (C58B.LIZ()) {
            this.LJLJLLL.setImageResource(R.drawable.dej);
            this.LJLJLJ.setImageResource(R.drawable.deh);
        } else {
            this.LJLJLLL.setImageResource(R.drawable.dei);
            this.LJLJLJ.setImageResource(R.drawable.deg);
        }
        this.LJLJI = new View(this.LJZ);
        this.LJLJJI = new View(this.LJZ);
        if (C58B.LIZ()) {
            i = R.attr.dj;
        } else {
            i = R.attr.eb;
        }
        setBorderColor(AnonymousClass636.LJIIIIZZ(i, getContext()));
        addView(this.LJLJI);
        addView(this.LJLJJI);
        LJIL((int) this.LJLJLLL.getStartX(), (int) this.LJLJLJ.getStartX());
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.LJLL.getLayoutParams();
        layoutParams3.leftMargin = this.LLILLIZIL + i2;
        layoutParams3.height = this.LLIIIZ;
        layoutParams3.topMargin = this.LLIIJLIL;
        this.LJLL.setLayoutParams(layoutParams3);
        this.LJLL.setTag("curPoint");
        this.LJLL.setOnTouchListener(this);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.LJLJL.getLayoutParams();
        layoutParams4.width = this.LLIIIL;
        this.LJLJL.setLayoutParams(layoutParams4);
        this.LJLJL.setImageDrawable(null);
        int LJI = SFS.LJI(0.5d);
        C163526bM.LIZ(this.LJLJL, -1, SFS.LJI(this.LLIIIL / 2.0f), AnonymousClass636.LJIIIIZZ(R.attr.ei, getContext()), LJI, LJI, 0);
        this.LJLJJL = new View(this.LJZ);
        this.LJLJJLL = new View(this.LJZ);
        int LIZIZ = C78885Uxd.LIZIZ(false, false, true, false);
        this.LJLJJL.setBackgroundColor(LIZIZ);
        this.LJLJJLL.setBackgroundColor(LIZIZ);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(0, this.LLIILII);
        layoutParams5.topMargin = this.LLIL;
        this.LJLJJL.setLayoutParams(layoutParams5);
        int startX = (int) (this.LJLJLJ.getStartX() + i3);
        int i4 = ((int) (((float) (this.LLILLJJLI - this.LLILZ)) / this.LLFF.LIZ)) - i3;
        int i5 = this.LJLLL - startX;
        if (i4 > i5) {
            i4 = i5;
        }
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(i4 + 2, this.LLIILII);
        layoutParams6.topMargin = this.LLIL;
        this.LJLJJLL.setX(startX);
        this.LJLJJLL.setLayoutParams(layoutParams6);
        addView(this.LJLJJL);
        addView(this.LJLJJLL);
        addView(this.LJLJLLL);
        addView(this.LJLJLJ);
    }

    public final void LJIILJJIL() {
        this.LJLL.setOnTouchListener(this);
        if (this.LLJILJIL.booleanValue()) {
            long j = this.LLJILLL;
            if (j < 0) {
                long j2 = this.LLILLL + j;
                this.LLILLL = j2;
                if (j2 <= 0) {
                    this.LLILLL = 0L;
                }
                this.LLILZ = this.LLILLL + this.LLJIJIL;
            } else {
                long j3 = this.LLILZ + j;
                this.LLILZ = j3;
                long j4 = this.LLILLJJLI;
                if (j3 >= j4) {
                    this.LLILZ = j4;
                }
                this.LLILLL = this.LLILZ - this.LLJIJIL;
            }
            this.LJZL.LJLLILLLL.setValue(null);
            return;
        }
        getRecyclerView().LJLJJLL();
        if (this.LLII == 1) {
            long j5 = this.LLILZIL;
            C82868Wfg c82868Wfg = this.LLFF;
            if (j5 != c82868Wfg.LIZIZ) {
                c82868Wfg.LIZIZ = j5;
                long j6 = this.LLILLJJLI;
                this.LJZL.nv0();
                c82868Wfg.LIZJ(j6);
                this.LLFFF.LJLLLLLL(this.LLFF.LIZ, 0.0f);
            }
        } else {
            long j7 = this.LLILZIL;
            C82868Wfg c82868Wfg2 = this.LLFF;
            if (j7 != c82868Wfg2.LIZIZ) {
                c82868Wfg2.LIZIZ = j7;
                long min = Math.min(Math.min(j7, this.LLILLJJLI), c82868Wfg2.LIZLLL);
                c82868Wfg2.LIZIZ = min;
                c82868Wfg2.LIZ = ((float) min) / c82868Wfg2.LIZJ;
                this.LLFII.LJLLLLLL(this.LLFF.LIZ, this.LLIIIILZ.LIZLLL);
            }
        }
        LJJI();
        LJJ(this.LJLJLJ, (this.LJLLL - this.LLILLIZIL) - C44689HgL.LIZJ, false);
        LJJ(this.LJLJLLL, this.LLILLIZIL, true);
    }

    public final void LJIJI() {
        postDelayed(new ARunnableS18S0101000_14(4, this, 16), 100L);
    }

    public final void LJIJJ() {
        int i;
        int i2;
        View view = this.LJLJJLL;
        if (view == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        float startX = (C44689HgL.LIZJ / 2.0f) + this.LJLJLJ.getStartX();
        if (!this.LLF) {
            startX -= this.LJLLLL;
        }
        View LJJIJIL = getLayoutManager().LJJIJIL(getLayoutManager().LJJJJZ() - 1);
        if (LJJIJIL != null) {
            i = (int) ((LJJIJIL.getX() + LJJIJIL.getWidth()) - startX);
        } else {
            i = (int) (this.LJLLL - startX);
        }
        if (i <= 0) {
            i2 = 0;
        } else {
            i2 = i + 1;
        }
        this.LJLJJLL.setX(startX);
        layoutParams.width = i2;
        layoutParams.height = this.LLIILII;
        layoutParams.topMargin = this.LLIL;
        this.LJLJJLL.setLayoutParams(layoutParams);
    }

    public final void LJIJJLI() {
        int i;
        View view = this.LJLJJL;
        if (view == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        float startX = (C44689HgL.LIZJ / 2.0f) + this.LJLJLLL.getStartX();
        if (!this.LLF) {
            startX += this.LJLLLL;
        }
        int i2 = 0;
        View LJJIJIL = getLayoutManager().LJJIJIL(0);
        if (LJJIJIL != null) {
            i = (int) (startX - LJJIJIL.getX());
        } else {
            i = (int) startX;
        }
        if (i > 0) {
            i2 = i + 1;
        }
        this.LJLJJL.setX(startX - i2);
        layoutParams.width = i2;
        layoutParams.height = this.LLIILII;
        layoutParams.topMargin = this.LLIL;
        this.LJLJJL.setLayoutParams(layoutParams);
    }

    public final void LJJI() {
        if (this.LLILZIL == 0 || (this.LJLJLJ.getStartX() - this.LJLJLLL.getStartX()) - C44689HgL.LIZJ == this.LLIFFJFJJ) {
            return;
        }
        long j = this.LLILZIL / 6;
        if (this.LLII == 1) {
            OSZ<Integer, Float> LIZIZ = C82868Wfg.LIZIZ(this.LLILLL, (float) j, this.LLIIL, this.LJZL.kv0());
            this.LJLLI.LJLJJL(LIZIZ.getFirst().intValue(), -Math.round(LIZIZ.getSecond().floatValue()));
        } else {
            long j2 = this.LLILLL;
            int i = (int) (j2 / j);
            this.LJLLILLLL.LJLJJL(i, -Math.round((((float) (j2 - (i * j))) / ((float) j)) * this.LLIIL));
        }
        LJIJI();
    }

    public final void LJJII() {
        long j = this.LLILZIL;
        if (j == 0) {
            return;
        }
        long j2 = j / 6;
        if (this.LLII == 1) {
            OSZ<Integer, Float> LIZIZ = C82868Wfg.LIZIZ(this.LLILLL, (float) j2, this.LLIIL, this.LJZL.kv0());
            this.LJLLI.LJLJJL(LIZIZ.getFirst().intValue(), -Math.round(LIZIZ.getSecond().floatValue()));
        } else {
            long j3 = this.LLILLL;
            int i = (int) (j3 / j2);
            this.LJLLILLLL.LJLJJL(i, -Math.round((((float) (j3 - (i * j2))) / ((float) j2)) * this.LLIIL));
        }
        if (this.LLJILJIL.booleanValue() && this.LLII == 0 && this.LLJIJIL < 1000) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LJZL.kv0(), this.LLIIII);
            long j4 = this.LLILLL;
            long j5 = videoSegment.duration - this.LLILZIL;
            if (j4 > j5) {
                float f = ((float) (j4 - j5)) / this.LLFF.LIZ;
                WFS wfs = this.LJLJLLL;
                wfs.setStartX(wfs.getStartX() + f);
                WFS wfs2 = this.LJLJLJ;
                wfs2.setStartX(wfs2.getStartX() + f);
                LJIL((int) this.LJLJLLL.getStartX(), (int) this.LJLJLJ.getStartX());
            }
        }
        LJIJI();
    }

    public C42342Gja getFrameAdapter() {
        if (this.LLII == 1) {
            return this.LLFFF;
        }
        return this.LLFII;
    }

    public SpeedyLinearLayoutManager getLayoutManager() {
        if (this.LLII == 1) {
            return this.LLFZ;
        }
        return this.LLI;
    }

    public C72843SiN getRecyclerView() {
        if (this.LLII == 1) {
            return this.LJLLI;
        }
        return this.LJLLILLLL;
    }

    @Override // X.I50
    public View getEndSlide() {
        return this.LJLJLJ;
    }

    @Override // X.I50
    public View getStartSlide() {
        return this.LJLJLLL;
    }

    public final void LJIILL(int i) {
        if (this.LLILL != 0) {
            if (i < 0) {
                WFS wfs = this.LJLJLJ;
                wfs.setStartX(wfs.getStartX() - i);
            } else {
                WFS wfs2 = this.LJLJLLL;
                wfs2.setStartX(wfs2.getStartX() - i);
            }
            LJIJJLI();
            LJIJJ();
            LJIL((int) this.LJLJLLL.getStartX(), (int) this.LJLJLJ.getStartX());
            long selectedTimeV2 = getSelectedTimeV2();
            this.LLILZIL = selectedTimeV2;
            int i2 = this.LLILL;
            if (i2 != 1) {
                if (i2 == 2) {
                    long j = this.LLILLL + selectedTimeV2;
                    this.LLILZ = j;
                    long j2 = this.LLILLJJLI;
                    if (j >= j2) {
                        this.LLILZ = j2;
                    }
                }
            } else {
                long j3 = this.LLILZ - selectedTimeV2;
                this.LLILLL = j3;
                if (j3 <= 0) {
                    this.LLILLL = 0L;
                }
            }
            long j4 = this.LLILZ - this.LLILLL;
            this.LLILZIL = j4;
            long j5 = this.LJLZ;
            if (j4 > j5) {
                this.LLILZIL = j5;
                LJJIIJ(true);
                getRecyclerView().LJLJJLL();
            }
        } else {
            if (i > 0) {
                long abs = (Math.abs(i) * this.LLFF.LIZ) + ((float) this.LLILZ);
                this.LLILZ = abs;
                long j6 = this.LLILLJJLI;
                if (abs >= j6) {
                    this.LLILZ = j6;
                }
                this.LLILLL = this.LLILZ - this.LLILZIL;
            } else {
                long abs2 = ((float) this.LLILLL) - (Math.abs(i) * this.LLFF.LIZ);
                this.LLILLL = abs2;
                if (abs2 <= 0) {
                    this.LLILLL = 0L;
                }
                this.LLILZ = this.LLILLL + this.LLILZIL;
            }
            LJIJJLI();
            LJIJJ();
        }
        LJII();
    }

    public final void LJIIZILJ(float f) {
        if (this.LLILZIL < this.LJLLLLLL) {
            LJJIIJ(false);
            long j = this.LJLLLLLL;
            this.LLILZIL = j;
            this.LLILZ = this.LLILLL + j;
        } else {
            LJJIII(f, false);
        }
        LJII();
        if (this.LLILL == 2) {
            this.LJZL.LJLJJL.setValue(null);
        }
    }

    public final void LJIJ(float f) {
        if (this.LLILZIL < this.LJLLLLLL) {
            LJJIIJ(false);
            long j = this.LJLLLLLL;
            this.LLILZIL = j;
            this.LLILLL = this.LLILZ - j;
        } else {
            LJJIII(f, true);
        }
        LJII();
        if (this.LLILL == 1) {
            this.LJZL.LJLJJLL.setValue(null);
        }
    }

    public final void LJJIFFI(float f) {
        float f2 = this.LLJJIJIIJIL;
        if (f2 == 0.0f) {
            this.LLJJIJIIJIL = f;
        } else {
            if (Math.abs(f2 - f) <= 3.0f) {
                return;
            }
            this.LLJJIJIIJIL = f;
            this.LJZL.LJLLI.setValue(null);
        }
    }

    public final void LJJIIJ(boolean z) {
        String string;
        if (this.LLD) {
            return;
        }
        this.LLD = true;
        ActivityC45651qj context = this.LJZ;
        o.LJIIIZ(context, "context");
        Object LLILL = C16880lQ.LLILL(context, "vibrator");
        o.LJII(LLILL, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) LLILL).vibrate(10L);
        if (z) {
            if (this.LJLIL && H7G.LIZIZ()) {
                Context context2 = C16880lQ.LLLLL(getContext());
                o.LJIIIZ(context2, "context");
                string = context2.getResources().getString(R.string.hyt, Long.valueOf(C152345yQ.LIZ() / 60000));
                o.LJIIIIZZ(string, "context.resources.getStr…reshold() / (60 * 1000L))");
            } else {
                string = getResources().getString(R.string.hrv, Float.valueOf(((float) this.LJLZ) / 1000.0f));
            }
        } else {
            string = getResources().getString(R.string.th8, Float.valueOf(((float) this.LJLLLLLL) / 1000.0f));
        }
        C5S1 c5s1 = new C5S1(this.LJZ);
        c5s1.LIZLLL(string);
        c5s1.LJ();
    }

    public void setBorderColor(int i) {
        this.LJLJI.setBackgroundColor(i);
        this.LJLJJI.setBackgroundColor(i);
    }

    @Override // X.I50
    public void setEditViewHeight(boolean z) {
        if (z) {
            this.LLIIIZ = this.LLIIJI;
            this.LLIILII = C44689HgL.LIZ;
            this.LLIIJLIL = 0;
        } else {
            this.LLIIIZ = (int) KL2.LIZJ(getContext(), 44.0f);
            this.LLIILII = this.LLIILZL;
            this.LLIIJLIL = (int) KL2.LIZJ(getContext(), 2.0f);
        }
        int i = this.LLIILII;
        this.LLIIZ = (this.LLILIL * 2) + i;
        C42342Gja c42342Gja = this.LLFFF;
        c42342Gja.LJLJLJ = i;
        c42342Gja.LJLILLLLZI.LJLJLLL = i;
        C42342Gja c42342Gja2 = this.LLFII;
        c42342Gja2.LJLJLJ = i;
        c42342Gja2.LJLILLLLZI.LJLJLLL = i;
        C16880lQ.LLI(this, this.LJLJLLL);
        C16880lQ.LLI(this, this.LJLJLJ);
        C16880lQ.LLI(this, this.LJLJI);
        C16880lQ.LLI(this, this.LJLJJI);
        C16880lQ.LLI(this, this.LJLJJL);
        C16880lQ.LLI(this, this.LJLJJLL);
        LJIILIIL();
        this.LJLJLLL.bringToFront();
        this.LJLJLJ.bringToFront();
        this.LJLL.bringToFront();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.LJLLJ.setIntercept(!z);
        if (z) {
            this.LJLJLLL.setEnabled(true);
            this.LJLJLJ.setEnabled(true);
            this.LJLL.setEnabled(true);
        } else {
            if (this.LLILL != 0) {
                return;
            }
            this.LJLJLLL.setEnabled(false);
            this.LJLJLJ.setEnabled(false);
            this.LJLL.setEnabled(false);
        }
    }

    public void setFocusOnMode(boolean z) {
        this.LJZL.LJZ.setValue(Boolean.valueOf(z));
    }

    public void setSelfAdaptiontoastAnimListener(InterfaceC82871Wfj interfaceC82871Wfj) {
        this.LLJJI = interfaceC82871Wfj;
    }

    public AbstractViewOnTouchListenerC82865Wfd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = new DecelerateInterpolator();
        this.LJLLL = 0;
        this.LJLLLL = C170576mj.LIZ(getContext(), 12.0f);
        this.LJLLLLLL = C44529Hdl.LIZIZ();
        C60903NvH.LJIIJJI().getBridgeService().getClass();
        this.LJLZ = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        this.LLF = true;
        this.LLIIIJ = true;
        this.LLIILII = C44689HgL.LIZ;
        this.LLIILZL = SFS.LJI(32.0d);
        this.LLILL = 0;
        int i = C44689HgL.LIZLLL;
        this.LLILLIZIL = i;
        this.LLILLJJLI = 0L;
        this.LLILLL = 0L;
        this.LLILZ = 0L;
        this.LLILZIL = 0L;
        this.LLILZLL = 0L;
        this.LLIZ = 0L;
        this.LLJ = false;
        this.LLJI = false;
        this.LLJIJIL = 0L;
        this.LLJILJIL = Boolean.FALSE;
        this.LLJILJILJ = 0.0f;
        this.LLJJIII = new IDrS52S0100000_14((C82866Wfe) this, 6);
        this.LLJJIJIIJIL = 0.0f;
        this.LJLLL = C60996Nwm.LJIIIIZZ(context);
        this.LLILIL = (int) KL2.LIZJ(context, 2.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a87, R.attr.a8q, R.attr.a8r, R.attr.aet, R.attr.aev, R.attr.anz, R.attr.b0v, R.attr.b0w, R.attr.b24, R.attr.b4z, R.attr.bah, R.attr.bbm, R.attr.bee});
            this.LLIIIL = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
            int round = Math.round(obtainStyledAttributes.getDimension(1, 0.0f));
            this.LLIIJI = round;
            this.LLIIIZ = round;
            this.LLIIZ = (this.LLILIL * 2) + this.LLIILII;
            float f = (this.LJLLL - (C44689HgL.LIZJ * 2)) - (i * 2);
            this.LLIFFJFJJ = f;
            this.LLIIL = Math.round(f / 6.0f);
            int i2 = this.LLIIIZ;
            this.LLILII = (i2 - C44689HgL.LIZIZ) / 2;
            this.LLIL = (i2 - this.LLIILII) / 2;
            obtainStyledAttributes.recycle();
        }
        setLoadThumbnailDirectly(true);
    }

    public final long LJIIJJI(long j, boolean z) {
        long min = Math.min(j, this.LJLZ);
        if (z) {
            CutMultiVideoViewModel cutMultiVideoViewModel = this.LL;
            if (cutMultiVideoViewModel != null) {
                long j2 = cutMultiVideoViewModel.LJLLLL;
                if (j2 > 0) {
                    min = Math.min(min, j2);
                }
            }
            if (H7G.LIZIZ()) {
                return Math.min(min, HEL.LIZ());
            }
            return min;
        }
        return min;
    }

    public final void LJIILLIIL(float f, boolean z) {
        float startX = this.LJLJLLL.getStartX();
        float f2 = C44689HgL.LIZJ;
        if (f < startX + f2) {
            f = this.LJLJLLL.getStartX() + f2;
        }
        if (f > this.LJLJLJ.getStartX() - this.LJLJL.getWidth()) {
            f = this.LJLJLJ.getStartX() - this.LJLJL.getWidth();
        }
        this.LJLL.setStartX(f);
        if (z) {
            if (this.LLII == 2) {
                this.LJZL.LJLJJI.setValue(Long.valueOf(getSinglePlayingPosition()));
            } else {
                this.LJZL.LJLJJI.setValue(Long.valueOf(getMultiPlayingPosition()));
            }
        }
    }

    public final void LJIL(int i, int i2) {
        View view = this.LJLJI;
        if (view == null || this.LJLJJI == null || i > i2) {
            return;
        }
        int i3 = C44689HgL.LIZJ;
        int i4 = i + i3;
        int i5 = ((i2 - i) - i3) + 1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = i5;
        layoutParams.height = this.LLILIL;
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = this.LLILII;
        this.LJLJI.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LJLJJI.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams2.width = i5;
        int i6 = this.LLILIL;
        layoutParams2.height = i6;
        layoutParams2.leftMargin = i4;
        layoutParams2.topMargin = (this.LLILII + this.LLIIZ) - i6;
        this.LJLJJI.setLayoutParams(layoutParams2);
    }

    public final void LJJIII(float f, boolean z) {
        if (z) {
            this.LJLJLLL.setStartX(f);
        } else {
            this.LJLJLJ.setStartX(f);
        }
        LJIL((int) this.LJLJLLL.getStartX(), (int) this.LJLJLJ.getStartX());
        if (z) {
            LJIJJLI();
        } else {
            LJIJJ();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractViewOnTouchListenerC82865Wfd.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void LJJ(WFS wfs, float f, boolean z) {
        if (wfs == null || Math.abs(wfs.getStartX() - f) <= 1.0f) {
            return;
        }
        if (z) {
            float startX = wfs.getStartX();
            int i = C44689HgL.LIZJ;
            if (startX < (-i)) {
                wfs.setStartX(-i);
            }
        } else {
            float startX2 = wfs.getStartX();
            int i2 = this.LJLLL;
            if (startX2 > i2 + 1) {
                wfs.setStartX(i2 + 1);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(wfs.getStartX(), f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(this.LJLILLLLZI);
        ofFloat.addUpdateListener(new AUListenerS40S0110000_14(this, z, 0));
        ofFloat.start();
    }

    @Override // X.InterfaceC46045I5h
    public final boolean LJFF(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        this.LL = cutMultiVideoViewModel;
        MediaModel LIZ = C44689HgL.LIZ(str, cutMultiVideoViewModel);
        if (LIZ == null) {
            return false;
        }
        LJI(lifecycleOwner, viewModelProvider, cutMultiVideoViewModel, Collections.singletonList(LIZ));
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

    @Override // X.InterfaceC46045I5h
    public final void LIZJ(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List list, int i) {
        this.LJZI = lifecycleOwner;
        if (lifecycleOwner instanceof ActivityC45651qj) {
            this.LJZ = (ActivityC45651qj) lifecycleOwner;
        } else if (lifecycleOwner instanceof WM7) {
            this.LJZ = (ActivityC45651qj) ((WM7) lifecycleOwner).mActivity;
        }
        this.LL = cutMultiVideoViewModel;
        if (videoEditViewModel == null) {
            this.LJZL = (VideoEditViewModel) viewModelProvider.get(VideoEditViewModel.class);
        } else {
            this.LJZL = videoEditViewModel;
        }
        this.LLII = i;
        this.LLJJ = new VEMediaParserProviderV2(this.LJZ, lifecycleOwner.getLifecycle());
        if (cutMultiVideoViewModel.LJLLILLLL) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VideoSegment videoSegment = (VideoSegment) it.next();
                videoSegment.duration = cutMultiVideoViewModel.LJLLJ;
                videoSegment.width = 720;
                videoSegment.height = 1280;
            }
        }
        VideoEditViewModel videoEditViewModel2 = this.LJZL;
        if (videoEditViewModel2 != null) {
            videoEditViewModel2.tv0(list);
        }
        LJIIL();
    }
}
