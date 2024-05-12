package X;

import Y.AObserverS61S0101000_7;
import Y.AObserverS64S0101000_14;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wfe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82866Wfe extends AbstractViewOnTouchListenerC82865Wfd {
    public static final /* synthetic */ int LLJJL = 0;
    public long LLJJJIL;
    public long LLJJJJ;
    public boolean LLJJJJJIL;
    public java.util.Map<String, Boolean> LLJJJJLIIL;

    public final void LJJIJL() {
        setEditViewHeight(false);
        this.LJLLILLLL.setVisibility(8);
        if (this.LLJILJIL.booleanValue()) {
            this.LJLLI.setVisibility(this.LLJJJJJIL ? 0 : 8);
        } else {
            this.LJLLI.setVisibility(0);
        }
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public void setCanEdit(boolean z) {
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public void setUseCustomMaxVideoLengthDirectly(boolean z) {
    }

    private java.util.Map<String, Boolean> getSingleEditFirstMap() {
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = new HashMap(8);
        }
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC46045I5h
    public final boolean LIZIZ() {
        return this.LLJILJIL.booleanValue();
    }

    @Override // X.InterfaceC46045I5h
    public final void LJ() {
        int i;
        if (this.LJZL == null) {
            return;
        }
        if (this.LLJILJIL.booleanValue()) {
            C72843SiN c72843SiN = this.LJLLI;
            if (this.LLJJJJJIL) {
                i = 0;
            } else {
                i = 8;
            }
            c72843SiN.setVisibility(i);
            long LIZ = C82868Wfg.LIZ(this.LJZL.kv0(), this.LJZL.nv0());
            this.LLILLJJLI = LIZ;
            long LJIIJJI = LJIIJJI(Math.min(LIZ, HEL.LIZ()), false);
            this.LLILZIL = LJIIJJI;
            this.LLILLL = 0L;
            this.LLILZ = LJIIJJI;
            this.LJLLILLLL.setVisibility(8);
            C82868Wfg c82868Wfg = this.LLFF;
            c82868Wfg.LIZIZ = this.LLILZIL;
            long j = this.LLILLJJLI;
            this.LJZL.nv0();
            c82868Wfg.LIZJ(j);
        } else {
            if (this.LLII != 1) {
                this.LLIIIILZ = new I5B((VideoSegment) ListProtector.get(this.LJZL.kv0(), 0));
                this.LLILLJJLI = ((float) r3.duration) / r3.LJIIIIZZ();
            } else {
                this.LLILLJJLI = C82868Wfg.LIZ(this.LJZL.kv0(), this.LJZL.nv0());
            }
            this.LLILLL = this.LLJJJJ;
            long LJIIJJI2 = LJIIJJI(Math.min(this.LLILLJJLI, HEL.LIZ()), false);
            long j2 = this.LLJJJIL;
            if (j2 == 0) {
                this.LLILZIL = LJIIJJI2;
            } else {
                this.LLILZIL = Math.min(j2, LJIIJJI2);
            }
            long j3 = this.LLILLL;
            long j4 = this.LLILZIL;
            this.LLILZ = j3 + j4;
            this.LLFF.LIZIZ = j4;
            if (this.LLII == 1) {
                this.LJLLILLLL.setVisibility(8);
                this.LJLLI.setVisibility(0);
                C82868Wfg c82868Wfg2 = this.LLFF;
                long j5 = this.LLILLJJLI;
                this.LJZL.nv0();
                c82868Wfg2.LIZJ(j5);
            } else {
                this.LJLLILLLL.setVisibility(0);
                this.LJLLI.setVisibility(8);
                this.LLFF.LIZLLL(this.LLIIIILZ.LIZLLL, ((VideoSegment) ListProtector.get(this.LJZL.kv0(), 0)).duration);
            }
        }
        this.LJLJLLL.setStartX(this.LLILLIZIL);
        WFS wfs = this.LJLJLJ;
        int i2 = this.LJLLL - this.LLILLIZIL;
        int i3 = C44689HgL.LIZJ;
        wfs.setStartX(i2 - i3);
        LJIILLIIL(this.LJLJLLL.getStartX() + i3, false);
        LJIL((int) this.LJLJLLL.getStartX(), (int) this.LJLJLJ.getStartX());
        if (this.LLII == 1) {
            ArrayList arrayList = new ArrayList();
            for (VideoSegment videoSegment : this.LJZL.kv0()) {
                if (!videoSegment.isDeleted) {
                    arrayList.add(videoSegment);
                }
            }
            C42342Gja c42342Gja = this.LLFFF;
            float f = this.LLFF.LIZ;
            c42342Gja.getClass();
            c42342Gja.LJLJJLL = new ArrayList(arrayList);
            c42342Gja.LJLLLLLL(f, 0.0f);
        } else {
            this.LLFII.LJLLLLLL(this.LLFF.LIZ, this.LLIIIILZ.LIZLLL);
        }
        LJJII();
    }

    @Override // X.InterfaceC46045I5h
    public final void LJIIIIZZ() {
        if (this.LLFF == null) {
            return;
        }
        long LJIIJJI = LJIIJJI(Math.min(this.LLILLJJLI, HEL.LIZ()), false);
        this.LLILZIL = LJIIJJI;
        this.LLFF.LIZIZ = LJIIJJI;
        this.LLILLL = 0L;
        this.LLILZ = LJIIJJI + 0;
        if (this.LLJILJIL.booleanValue()) {
            this.LLJJJJ = 0L;
            this.LLJJJIL = 0L;
        }
        C82868Wfg c82868Wfg = this.LLFF;
        long j = this.LLILLJJLI;
        this.LJZL.nv0();
        c82868Wfg.LIZJ(j);
        this.LJLLI.LJLI(0);
        this.LJZL.pv0(this.LLIFFJFJJ);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.LJZL.kv0()) {
            if (!videoSegment.isDeleted) {
                arrayList.add(videoSegment);
            }
        }
        C42342Gja c42342Gja = this.LLFFF;
        float f = this.LLFF.LIZ;
        c42342Gja.getClass();
        c42342Gja.LJLJJLL = new ArrayList(arrayList);
        c42342Gja.LJLLLLLL(f, 0.0f);
        LJIIJ();
        LJIJI();
    }

    public final void LJJIJIL() {
        this.LJLJLLL.setOnTouchListener(null);
        this.LJLJLJ.setOnTouchListener(null);
        this.LJLL.setOnTouchListener(this);
        this.LLF = false;
        this.LJLJLLL.setImageDrawable(LJJIIJZLJL(Boolean.TRUE));
        this.LJLJLJ.setImageDrawable(LJJIIJZLJL(Boolean.FALSE));
        LJIJI();
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50, X.InterfaceC46045I5h
    public int getCurrentRotate() {
        I5B i5b;
        int i = this.LLII;
        if ((i != 2 && i != 0) || (i5b = this.LLIIIILZ) == null) {
            return 0;
        }
        return i5b.LIZJ;
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50, X.InterfaceC46045I5h
    public float getCurrentSpeed() {
        int i = this.LLII;
        if (i == 2 || i == 0) {
            I5B i5b = this.LLIIIILZ;
            if (i5b == null) {
                return 1.0f;
            }
            return i5b.LIZLLL;
        }
        VideoEditViewModel videoEditViewModel = this.LJZL;
        if (videoEditViewModel == null) {
            return 1.0f;
        }
        return videoEditViewModel.nv0();
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50, X.InterfaceC46045I5h
    public long getMaxCutDuration() {
        float f;
        if (this.LLII == 1) {
            return LJJIIZ(this.LJLZ);
        }
        I5B i5b = this.LLIIIILZ;
        if (i5b == null) {
            f = 1.0f;
        } else {
            f = i5b.LIZLLL;
        }
        return ((float) this.LJLZ) * f;
    }

    public C15070iV<Long, Long> getMultiVideoPlayDur() {
        return new C15070iV<>(Long.valueOf(LJJIIZ(this.LLILLL)), Long.valueOf(LJJIIZ(this.LLILZ)));
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50, X.InterfaceC46045I5h
    public C15070iV<Long, Long> getPlayBoundary() {
        if (this.LLII == 1) {
            return getMultiVideoPlayDur();
        }
        return getSingleVideoPlayDur();
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public long getPlayingPosition() {
        return (((this.LJLL.getStartX() - this.LJLJLLL.getStartX()) - C44689HgL.LIZJ) * this.LLFF.LIZ) + ((float) this.LLILLL);
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50, X.InterfaceC46045I5h
    public float getSelectedTime() {
        long j = this.LLILZIL;
        long j2 = this.LJLZ;
        if (j > j2) {
            j = j2;
        }
        return ((float) j) / 1000.0f;
    }

    public C15070iV<Long, Long> getSingleVideoPlayDur() {
        float f;
        I5B i5b = this.LLIIIILZ;
        if (i5b != null) {
            f = i5b.LIZLLL;
        } else {
            f = 1.0f;
        }
        return new C15070iV<>(Long.valueOf(((float) this.LLILLL) * f), Long.valueOf(((float) this.LLILZ) * f));
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public C15070iV<Float, Float> getSlideX() {
        return new C15070iV<>(Float.valueOf(this.LJLJLLL.getStartX()), Float.valueOf(this.LJLJLJ.getStartX()));
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd
    public final void LJIIL() {
        super.LJIIL();
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LL;
        if (cutMultiVideoViewModel != null) {
            cutMultiVideoViewModel.LJLJJI.observe(this.LJZI, new AObserverS64S0101000_14(0, this, 10));
            this.LL.LJLJJL.observe(this.LJZI, new C82867Wff(1, this));
            this.LL.LJLJJLL.observe(this.LJZI, new AObserverS64S0101000_14(1, this, 0));
            this.LL.LJLJL.observe(this.LJZI, new AObserverS64S0101000_14(2, this, 1));
            this.LL.LJLJLJ.observe(this.LJZI, new AObserverS61S0101000_7(1, this, 2));
            this.LL.LJLJLLL.observe(this.LJZI, new AObserverS64S0101000_14(1, this, 4));
            this.LL.LJLL.observe(this.LJZI, new AObserverS64S0101000_14(1, this, 5));
        }
        this.LLJJJJ = this.LLILLL;
    }

    public final void LJJIJIIJI() {
        if (C58B.LIZ()) {
            this.LJLJLLL.setImageResource(R.drawable.dej);
            this.LJLJLJ.setImageResource(R.drawable.deh);
        } else {
            this.LJLJLLL.setImageResource(R.drawable.dei);
            this.LJLJLJ.setImageResource(R.drawable.deg);
        }
        this.LJLJLLL.setOnTouchListener(this);
        this.LJLJLLL.setTag("startSlide");
        this.LJLJLJ.setOnTouchListener(this);
        this.LJLJLJ.setTag("endSlide");
        this.LJLL.setOnTouchListener(this);
        this.LJLL.setTag("curPoint");
        this.LLF = true;
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public int getEditState() {
        return this.LLII;
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50, X.InterfaceC46045I5h
    public long getLeftSeekingValue() {
        return this.LLILLL;
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50, X.InterfaceC46045I5h
    public long getMultiSeekTime() {
        return this.LLILLL;
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50, X.InterfaceC46045I5h
    public long getRightSeekingValue() {
        return this.LLILZ;
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50, X.InterfaceC46045I5h
    public long getSingleSeekTime() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC46045I5h
    public final void LIZLLL(List<VideoSegment> videoSegmentList) {
        VideoEditViewModel videoEditViewModel = this.LJZL;
        if (videoEditViewModel == null) {
            return;
        }
        this.LLII = 1;
        videoEditViewModel.gv0(videoSegmentList);
        this.LJLLLLLL = C44529Hdl.LIZIZ();
        this.LLILLJJLI = C82868Wfg.LIZ(this.LJZL.kv0(), this.LJZL.nv0());
        long LJIIJJI = LJIIJJI(Math.min(this.LLILLJJLI, HEL.LIZ()), false);
        this.LLILZIL = LJIIJJI;
        C82868Wfg c82868Wfg = this.LLFF;
        c82868Wfg.LIZIZ = LJIIJJI;
        long j = this.LLILLJJLI;
        this.LJZL.nv0();
        c82868Wfg.LIZJ(j);
        this.LLILLL = 0L;
        this.LLILZ = this.LLILZIL + 0;
        this.LJLLILLLL.setVisibility(8);
        this.LJLLI.setVisibility(0);
        this.LJLLI.LJLI(0);
        C42342Gja c42342Gja = this.LLFFF;
        float f = this.LLFF.LIZ;
        c42342Gja.getClass();
        o.LJIIIZ(videoSegmentList, "videoSegmentList");
        if (!C32151Nz.LJJIIJZLJL(videoSegmentList)) {
            ((ArrayList) c42342Gja.LJLJJLL).addAll(videoSegmentList);
            c42342Gja.LJLLLLLL(f, 0.0f);
        }
        this.LJZL.pv0(0.0f);
        if (this.LLJILJIL.booleanValue()) {
            this.LLJJJJ = 0L;
            this.LLJJJIL = 0L;
        }
        LJIJI();
    }

    @Override // X.InterfaceC46045I5h
    public final void LJIIIZ(boolean z) {
        if (this.LLJILJIL.booleanValue() == z) {
            return;
        }
        if (!this.LLJILJIL.booleanValue()) {
            this.LLJJJIL = this.LLILZIL;
            this.LLJJJJ = this.LLILLL;
            if (getRecyclerView().LLLF) {
                LJIIJ();
            }
        }
        this.LLJILJIL = Boolean.valueOf(z);
        if (z) {
            LJJIJIL();
        } else {
            LJJIJIIJI();
        }
        setFocusOnMode(false);
    }

    public final Drawable LJJIIJZLJL(Boolean bool) {
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, this.LJZ);
        float LIZ = C170576mj.LIZ(this.LJZ, 2.0f);
        boolean booleanValue = bool.booleanValue();
        if (getLayoutDirection() != 0 && C173636rf.LIZIZ(this.LJZ)) {
            booleanValue = !booleanValue;
        }
        if (booleanValue) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{C78127UlP.LIZLLL(LJIIIIZZ, LJIIIIZZ, new float[]{LIZ, LIZ, 0.0f, 0.0f, 0.0f, 0.0f, LIZ, LIZ})});
            layerDrawable.setLayerInset(0, (int) this.LJLLLL, 0, 0, 0);
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{C78127UlP.LIZLLL(LJIIIIZZ, LJIIIIZZ, new float[]{0.0f, 0.0f, LIZ, LIZ, LIZ, LIZ, 0.0f, 0.0f})});
        layerDrawable2.setLayerInset(0, 0, 0, (int) this.LJLLLL, 0);
        return layerDrawable2;
    }

    public final long LJJIIZ(long j) {
        VideoEditViewModel videoEditViewModel = this.LJZL;
        long j2 = 0;
        if (videoEditViewModel != null && videoEditViewModel.kv0() != null && !this.LJZL.kv0().isEmpty()) {
            for (VideoSegment videoSegment : this.LJZL.kv0()) {
                if (!videoSegment.isDeleted) {
                    float LJ = ((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / videoSegment.LJIIIIZZ();
                    float f = (float) j;
                    if (f < LJ) {
                        return (videoSegment.LJIIIIZZ() * f) + ((float) j2);
                    }
                    j = f - LJ;
                    j2 = (videoSegment.LJ() - videoSegment.LJIIIZ()) + j2;
                }
            }
        }
        return j2;
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public void setCurrentRotate(int i) {
        I5B i5b;
        int i2 = this.LLII;
        if ((i2 == 2 || i2 == 0) && (i5b = this.LLIIIILZ) != null) {
            i5b.LIZJ = i;
        }
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public void setDefaultMode(boolean z) {
        this.LLJILJIL = Boolean.valueOf(z);
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public void setEditViewHeight(boolean z) {
        super.setEditViewHeight(z);
        if (this.LLJILJIL.booleanValue()) {
            LJJIJIL();
        } else {
            LJJIJIIJI();
        }
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public void setExtractFramesInRoughMode(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public void setLoadThumbnailDirectly(boolean z) {
        this.LLIIIJ = z;
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public void setMaxVideoLength(long j) {
        this.LJLZ = j;
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public void setMinVideoLength(long j) {
        this.LJLLLLLL = j;
    }

    @Override // X.AbstractViewOnTouchListenerC82865Wfd, X.I50
    public void setMultiEditEnableForStickPointMode(boolean z) {
        this.LLJJJJJIL = z;
    }

    public C82866Wfe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIIZI(C82866Wfe c82866Wfe, C15070iV c15070iV) {
        long LJ;
        VideoEditViewModel videoEditViewModel = c82866Wfe.LJZL;
        if (videoEditViewModel == null) {
            return;
        }
        c82866Wfe.LLII = 2;
        videoEditViewModel.uv0(2);
        c82866Wfe.LLIIII = ((Integer) c15070iV.LIZIZ).intValue();
        c82866Wfe.LJLLLLLL = 500L;
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(c82866Wfe.LJZL.kv0(), c82866Wfe.LLIIII);
        I5B i5b = c82866Wfe.LLIIIILZ;
        if (i5b == null) {
            c82866Wfe.LLIIIILZ = new I5B(videoSegment);
        } else {
            i5b.LIZ(videoSegment);
        }
        c82866Wfe.LLILZLL = c82866Wfe.LLILLL;
        c82866Wfe.LLIZ = c82866Wfe.LLILZ;
        c82866Wfe.LLILLJJLI = ((float) videoSegment.duration) / videoSegment.LJIIIIZZ();
        c82866Wfe.setEditViewHeight(true);
        if (c82866Wfe.LLJILJIL.booleanValue()) {
            c82866Wfe.LLJIJIL = videoSegment.LJ() - videoSegment.LJIIIZ();
            long LJ2 = videoSegment.LJ() - videoSegment.LJIIIZ();
            c82866Wfe.LLILZIL = LJ2;
            if (LJ2 < 1000) {
                c82866Wfe.LLILZIL = 1000L;
            }
            c82866Wfe.LJLJLLL.setStartX(c82866Wfe.LLILLIZIL);
            c82866Wfe.LJLJLJ.setStartX((c82866Wfe.LJLLL - c82866Wfe.LLILLIZIL) - C44689HgL.LIZJ);
            c82866Wfe.LJIL((int) c82866Wfe.LJLJLLL.getStartX(), (int) c82866Wfe.LJLJLJ.getStartX());
            C82868Wfg c82868Wfg = c82866Wfe.LLFF;
            c82868Wfg.LIZIZ = c82866Wfe.LLILZIL;
            c82868Wfg.LIZLLL(videoSegment.LJIIIIZZ(), videoSegment.duration);
            long LJIIIZ = ((float) videoSegment.LJIIIZ()) / videoSegment.LJIIIIZZ();
            c82866Wfe.LLILLL = LJIIIZ;
            c82866Wfe.LLILZ = LJIIIZ + c82866Wfe.LLILZIL;
        } else {
            int i = c82866Wfe.LLIIII;
            VideoEditViewModel videoEditViewModel2 = c82866Wfe.LJZL;
            if (videoEditViewModel2 == null) {
                LJ = -1;
            } else {
                VideoSegment videoSegment2 = (VideoSegment) ListProtector.get(videoEditViewModel2.kv0(), i);
                LJ = ((float) (videoSegment2.LJ() - videoSegment2.LJIIIZ())) / videoSegment2.LJIIIIZZ();
                java.util.Map<String, Boolean> singleEditFirstMap = c82866Wfe.getSingleEditFirstMap();
                String LJII = videoSegment2.LJII(false);
                LJII.toString();
                Boolean bool = singleEditFirstMap.get(LJII);
                if (bool == null || !bool.booleanValue()) {
                    LJ = Math.min(LJ, HEL.LIZ());
                }
            }
            long LJIIJJI = c82866Wfe.LJIIJJI(LJ, false);
            c82866Wfe.LLILZIL = LJIIJJI;
            C82868Wfg c82868Wfg2 = c82866Wfe.LLFF;
            c82868Wfg2.LIZIZ = LJIIJJI;
            c82868Wfg2.LIZLLL(videoSegment.LJIIIIZZ(), videoSegment.duration);
            long LJIIIZ2 = ((float) videoSegment.LJIIIZ()) / videoSegment.LJIIIIZZ();
            c82866Wfe.LLILLL = LJIIIZ2;
            c82866Wfe.LLILZ = LJIIIZ2 + c82866Wfe.LLILZIL;
        }
        c82866Wfe.LJII();
        c82866Wfe.LJLLI.setVisibility(8);
        c82866Wfe.LJLLILLLL.setVisibility(0);
        c82866Wfe.LJLLILLLL.LJLI(0);
        C42342Gja c42342Gja = c82866Wfe.LLFII;
        float f = c82866Wfe.LLFF.LIZ;
        c42342Gja.getClass();
        ((ArrayList) c42342Gja.LJLJJLL).clear();
        ((ArrayList) c42342Gja.LJLJJLL).add(videoSegment);
        c42342Gja.LJLLLLLL(f, 0.0f);
        c82866Wfe.LJJII();
        c82866Wfe.LJZL.LJLLL.setValue(c15070iV);
    }

    @Override // X.InterfaceC46045I5h
    public final void LIZ(C15070iV<Float, Float> c15070iV, List<VideoSegment> list) {
        long j;
        Float f;
        Float f2;
        VideoEditViewModel videoEditViewModel;
        if (list != null && (videoEditViewModel = this.LJZL) != null) {
            videoEditViewModel.tv0(list);
        }
        if (!this.LLJILJIL.booleanValue()) {
            long j2 = 0;
            if (c15070iV == null || (f2 = c15070iV.LIZ) == null) {
                j = 0;
            } else {
                j = f2.longValue();
            }
            this.LLJJJJ = j;
            if (c15070iV != null && (f = c15070iV.LIZIZ) != null) {
                j2 = f.longValue();
            }
            this.LLJJJIL = j2;
        }
        LJ();
    }

    public final void LJJIJ(VideoSegment videoSegment, boolean z) {
        if (this.LLJILJIL.booleanValue() || this.LLII != 2) {
            return;
        }
        if (z) {
            java.util.Map<String, Boolean> singleEditFirstMap = getSingleEditFirstMap();
            String LJII = videoSegment.LJII(false);
            LJII.toString();
            singleEditFirstMap.put(LJII, Boolean.TRUE);
            return;
        }
        java.util.Map<String, Boolean> singleEditFirstMap2 = getSingleEditFirstMap();
        String LJII2 = videoSegment.LJII(false);
        LJII2.toString();
        singleEditFirstMap2.remove(LJII2);
    }

    public final void LJJIJIIJIL(float f, int i) {
        I5B i5b = this.LLIIIILZ;
        if (i5b == null) {
            return;
        }
        float f2 = i5b.LIZLLL;
        i5b.LIZLLL = f;
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LJZL.kv0(), i);
        this.LLILLJJLI = ((float) videoSegment.duration) / f;
        long LJIIJJI = LJIIJJI(Math.max((((float) this.LLILZIL) * f2) / f, this.LJLLLLLL), false);
        this.LLILZIL = LJIIJJI;
        C82868Wfg c82868Wfg = this.LLFF;
        c82868Wfg.LIZIZ = LJIIJJI;
        c82868Wfg.LIZLLL(this.LLIIIILZ.LIZLLL, videoSegment.duration);
        this.LLFII.LJLLLLLL(this.LLFF.LIZ, f);
        LJJI();
        long j = ((float) this.LLIIIILZ.LIZ) / f;
        this.LLILLL = j;
        this.LLILZ = j + this.LLILZIL;
    }
}
