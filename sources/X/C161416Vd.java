package X;

import X.C0M9;
import Y.ACListenerS21S0101000_2;
import Y.ACListenerS30S0101000_13;
import Y.ACallableS105S0100000_2;
import Y.AObserverS58S0101000_2;
import Y.AObserverS64S0101000_14;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS0S0202000_2;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS38S0100000_2;
import Y.ARunnableS8S0110000_2;
import Y.AgS120S0100000_2;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCInfoStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.6Vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161416Vd implements InterfaceC147435qV, C66J {
    public C29S LJLIL;
    public AbstractC42651GoZ LJLILLLLZI;
    public C161436Vf LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public C170466mY LJLJJLL;
    public ViewOnTouchListenerC82857WfV LJLJL;
    public ImageView LJLJLJ;
    public ImageView LJLJLLL;
    public ImageView LJLL;
    public CutMultiVideoViewModel LJLLI;
    public View LJLLILLLL;
    public TextView LJLLJ;
    public TextView LJLLL;
    public SeekBar LJLLLL;
    public ViewGroup LJLLLLLL;
    public InterfaceC153045zY LJLZ;
    public FTCInfoStickerViewModel LJZ;
    public VideoPublishEditModel LJZI;
    public View LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public List<MediaModel> LLFF;
    public boolean LLFFF;
    public SafeHandler LLFII;
    public AnonymousClass655 LLFZ;
    public FrameLayout LLI;
    public MutableLiveData<Bitmap> LLIFFJFJJ;
    public MutableLiveData<Boolean> LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public AnonymousClass671 LLIIIJ;
    public C68R LLIIIZ;
    public InterfaceC1549166d LLIIJI;
    public boolean LLIIL;
    public boolean LLIILII;
    public C161516Vn LLIILZL;
    public WFB LLIIZ;
    public FTCEditCornerViewModel LLIL;
    public final InterfaceC143655kP LLILII;
    public final CreativeInfo LLILIL;
    public boolean LLILL;
    public final ARunnableS38S0100000_2 LLIIIL = new ARunnableS38S0100000_2(this, 31);
    public final C1HQ LLIIJLIL = new C1HQ();

    public final void LIZJ() {
        InterfaceC153045zY interfaceC153045zY;
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        WFB wfb;
        if (!this.LLF && (interfaceC153045zY = this.LJLZ) != null) {
            this.LLF = true;
            int duration = interfaceC153045zY.getDuration();
            this.LJLLI = (CutMultiVideoViewModel) C165706es.LIZLLL(this.LJLJL).get(CutMultiVideoViewModel.class);
            this.LJLJL.setCanEdit(false);
            this.LJLJL.setMinVideoLength(100L);
            this.LJLJL.setMaxVideoLength(duration);
            this.LJLLI.LJLLILLLL = this.LJZI.isMvThemeVideoType();
            this.LJLLI.LJLLJ = duration;
            this.LJLJL.setFirstFrameVisibleLiveData(this.LLII);
            this.LJLJL.setFirstFrameBitmapLiveData(this.LLIFFJFJJ);
            this.LJLJL.setVeEditor(this.LJLZ);
            int frameWidth = this.LJLJL.getFrameWidth();
            int frameHeight = this.LJLJL.getFrameHeight();
            int ceil = (int) Math.ceil((KL2.LJIIJJI(this.LJLIL) - (this.LJLJL.getLeftRightMargin() * 2)) / (frameWidth * 1.0f));
            if (C6WA.LIZ()) {
                get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
            } else {
                get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
            }
            if (this.LJZI.isMultiVideoEdit()) {
                wfb = new WFB(new VEMultiEditVideoCoverGeneratorImpl(this.LJLZ, this.LJLIL, ceil, this.LJLZ.getDuration(), (int) this.LJZI.getMultiEditVideoStartTime(), get_frames_flags), frameWidth, frameHeight, ceil);
            } else {
                wfb = new WFB(new VEVideoCoverGeneratorImpl(this.LJLZ, this.LJLILLLLZI, ceil, get_frames_flags, "sticker_select_time"), frameWidth, frameHeight, ceil);
            }
            this.LLIIZ = wfb;
            ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJLJL;
            AbstractC42651GoZ abstractC42651GoZ = this.LJLILLLLZI;
            ViewModelProvider LJFF = C165706es.LJFF(abstractC42651GoZ);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLLI;
            WFB wfb2 = this.LLIIZ;
            List<MediaModel> list = this.LLFF;
            boolean LIZ = C6W9.LIZ();
            viewOnTouchListenerC82857WfV.LLIILZL = wfb2;
            viewOnTouchListenerC82857WfV.LLIIZ = LIZ;
            viewOnTouchListenerC82857WfV.LJI(abstractC42651GoZ, LJFF, cutMultiVideoViewModel, list);
            this.LJLJL.setEnableBoundaryText(true);
            this.LJLJL.setPointerType(2);
        }
    }

    @Override // X.C66J
    public final boolean LIZ() {
        MutableLiveData<Boolean> mutableLiveData = this.LJZ.LJLJJI;
        if (mutableLiveData != null && mutableLiveData.getValue() != null) {
            return mutableLiveData.getValue().booleanValue();
        }
        return false;
    }

    public final void LIZIZ() {
        C161486Vk c161486Vk;
        List<C153155zj> list;
        this.LJLJI.LLD.LJII();
        C161436Vf c161436Vf = this.LJLJI;
        if (c161436Vf != null && (c161486Vk = c161436Vf.LJLJJL) != null && (list = c161486Vk.LIZ) != null && ((ArrayList) list).size() > 0) {
            Iterator it = ((ArrayList) this.LJLJI.LJLJJL.LIZ).iterator();
            boolean z = false;
            while (it.hasNext()) {
                C153155zj c153155zj = (C153155zj) it.next();
                if (c153155zj.LJLIL) {
                    c153155zj.LJLIL = false;
                    z = true;
                }
            }
            if (z) {
                C161436Vf c161436Vf2 = this.LJLJI;
                c161436Vf2.LJZL = false;
                c161436Vf2.invalidate();
            }
        }
    }

    public final boolean LIZLLL() {
        InterfaceC1549166d interfaceC1549166d = this.LLIIJI;
        if (interfaceC1549166d instanceof C153155zj) {
            return true;
        }
        if ((interfaceC1549166d instanceof C67P) || (interfaceC1549166d instanceof C156086Aq) || (interfaceC1549166d instanceof InterfaceC1549466g)) {
            return false;
        }
        C5L7.LIZIZ();
        return false;
    }

    public final void LJ() {
        if (!this.LLIIL) {
            return;
        }
        C15070iV<Long, Long> playBoundary = this.LJLJL.getPlayBoundary();
        InterfaceC153045zY interfaceC153045zY = this.LJLZ;
        Objects.requireNonNull(playBoundary.LIZ);
        this.LJZ.DM().setValue(C5MM.LIZIZ(interfaceC153045zY.LLFZ(r0.intValue())));
        int max = Math.max(playBoundary.LIZ.intValue(), 0);
        Long l = playBoundary.LIZIZ;
        Objects.requireNonNull(l);
        LJIILJJIL(max, Math.min(l.intValue(), this.LJLZ.getDuration()));
    }

    public final void LJFF() {
        if (!this.LLIIL || this.LJLZ == null) {
            return;
        }
        if (this.LLFFF) {
            LJIIJ();
        }
        LJIILJJIL(0, this.LJLZ.getDuration());
        InterfaceC153045zY interfaceC153045zY = this.LJLZ;
        Objects.requireNonNull(this.LJLJL.getPlayBoundary().LIZ);
        this.LJZ.DM().setValue(C5MM.LIZIZ(interfaceC153045zY.LLFZ(r0.intValue())));
    }

    @Override // X.C66J
    public final boolean LJIIIIZZ() {
        MutableLiveData<Boolean> mutableLiveData = this.LJZ.LJLJI;
        if (mutableLiveData != null && mutableLiveData.getValue() != null) {
            return mutableLiveData.getValue().booleanValue();
        }
        return false;
    }

    public final void LJIIJ() {
        C67P c67p;
        boolean z = !this.LLFFF;
        this.LLFFF = z;
        LJIIJJI(z);
        LJIIL();
        C68R c68r = this.LLIIIZ;
        if (c68r != null) {
            boolean z2 = this.LLFFF;
            ((FTCEditTextStickerViewModel) c68r.LIZ.LJLJL.getValue()).lp0(C161426Ve.LLJILJIL(z2), false);
            if (!z2) {
                InterfaceC1549166d interfaceC1549166d = c68r.LIZ.LLJJ().LLIIJI;
                if ((interfaceC1549166d instanceof C67P) && (c67p = (C67P) interfaceC1549166d) != null) {
                    c67p.LJJ(C161426Ve.LLJILJIL(true), false);
                }
            }
        }
        if (!this.LLFFF) {
            this.LJLL.setImageDrawable(this.LJLIL.getResources().getDrawable(R.drawable.a9w));
            this.LJZ.DM().setValue(C5MM.LIZIZ(this.LJLZ.LJZL()));
            this.LJZ.DM().setValue(C5MM.LIZJ());
            this.LLFII.removeCallbacks(this.LLIIIL);
            InterfaceC1549166d interfaceC1549166d2 = this.LLIIJI;
            if (interfaceC1549166d2 != null) {
                interfaceC1549166d2.setAlpha(true);
            }
        } else {
            this.LJLL.setImageDrawable(this.LJLIL.getResources().getDrawable(R.drawable.a9v));
            this.LLFII.post(this.LLIIIL);
            this.LJZ.DM().setValue(C5MM.LIZ());
        }
        this.LJLJL.LJJIIJZLJL(true ^ this.LLFFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    public final void LJIIL() {
        boolean z;
        String str;
        String str2;
        if (this.LLFFF) {
            str2 = this.LJLJJLL.getContext().getResources().getString(R.string.s3l);
        } else {
            float selectedTime = this.LJLJL.getSelectedTime();
            ?? r5 = 0;
            if (1000.0f * selectedTime * 0.99f < ((float) this.LJLJL.getMinVideoLength())) {
                z = true;
            } else {
                z = false;
            }
            String LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(selectedTime)});
            try {
                r5 = this.LJLJJLL.getContext().getResources().getString(R.string.hhg, LLLZI);
                str = r5;
            } catch (FormatFlagsConversionMismatchException e) {
                Resources resources = this.LJLJJLL.getContext().getResources();
                Object[] objArr = new Object[1];
                objArr[r5] = LLLZI;
                String string = resources.getString(R.string.hhf, objArr);
                try {
                    C6BK c6bk = new C6BK();
                    c6bk.LIZ.put("exception", J7I.LJII(e));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("normal_str=");
                    LIZ.append(string);
                    LIZ.append(", error_str=");
                    LIZ.append(this.LJLJJLL.getContext().getResources().getString(R.string.hhg));
                    c6bk.LIZ.put("event", X1D.LIZIZ(LIZ));
                    C43882HKc.LIZIZ("info_sticker_string_format_event", c6bk.LJ());
                    str = string;
                } catch (Exception e2) {
                    H7B.LIZJ(e2.getLocalizedMessage());
                    str = string;
                }
            }
            if (z) {
                ?? spannableString = new SpannableString(str);
                C78857UxB.LJJJJJ(spannableString, str.indexOf(LLLZI), LLLZI.length() + str.indexOf(LLLZI), this.LJLJJLL.getResources().getColor(R.color.c7));
                str2 = spannableString;
            } else {
                str2 = str;
            }
        }
        this.LJLJJLL.setText(str2);
    }

    public final void LJIIJJI(boolean z) {
        C161486Vk c161486Vk = this.LJLJI.LJLJJL;
        if (c161486Vk != null) {
            if (z) {
                Iterator it = ((ArrayList) c161486Vk.LIZ).iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    C17N.LJJI(c161486Vk.LIZJ).LJIIIIZZ();
                    next.getClass();
                    throw null;
                }
            } else {
                Iterator it2 = ((ArrayList) c161486Vk.LIZ).iterator();
                if (it2.hasNext()) {
                    Object next2 = it2.next();
                    C17N.LJJI(c161486Vk.LIZJ).LJIIIIZZ();
                    next2.getClass();
                    throw null;
                }
            }
        }
        if (this.LLIIJI != null && LIZLLL()) {
            this.LLIIJI.setAlpha(true);
        }
    }

    @Override // X.InterfaceC147435qV
    public final boolean Rc(RectF rectF) {
        InterfaceC153045zY interfaceC153045zY;
        VideoPublishEditModel videoPublishEditModel = this.LJZI;
        if (videoPublishEditModel != null && videoPublishEditModel.hasInfoStickers() && (interfaceC153045zY = this.LJLZ) != null) {
            VESize LLILZ = interfaceC153045zY.LLILZ();
            RectF rectF2 = new RectF();
            for (StickerItemModel stickerItemModel : this.LJZI.infoStickerModel.stickers) {
                if (stickerItemModel.isImageSticker()) {
                    return true;
                }
                try {
                    float[] LJIIIZ = C17N.LJJI(this.LJLZ).LJIIIIZZ().LIZ().LJIIIZ(stickerItemModel.uuid);
                    float f = LJIIIZ[0];
                    float f2 = LLILZ.width;
                    float f3 = LJIIIZ[3];
                    float f4 = LLILZ.height;
                    rectF2.set(f * f2, f3 * f4, LJIIIZ[2] * f2, LJIIIZ[1] * f4);
                    if (rectF2.top < rectF.top || rectF2.bottom > rectF.bottom) {
                        return true;
                    }
                } catch (VEException unused) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getInfoStickerBoundingBox error, index is ");
                    LIZ.append(stickerItemModel.getId());
                    LIZ.append(" veState is ");
                    VEEditor.VEState state = this.LJLZ.getState();
                    Objects.requireNonNull(state);
                    LIZ.append(state.getValue());
                    H7B.LIZJ(X1D.LIZIZ(LIZ));
                }
            }
        }
        return false;
    }

    public C161416Vd(InterfaceC143655kP interfaceC143655kP, CreativeInfo creativeInfo) {
        this.LLILII = interfaceC143655kP;
        this.LLILIL = creativeInfo;
    }

    public final void LJII(final boolean z, InterfaceC1549166d interfaceC1549166d) {
        this.LLIIL = z;
        if (z && this.LLILL && this.LLF) {
            this.LLILL = false;
            this.LLFF = this.LJZI.getMediaModelList();
            WFB wfb = this.LLIIZ;
            if (wfb != null) {
                wfb.LIZIZ();
            }
            this.LJLJL.LIZ(null, C43547H7f.LIZ(this.LLFF, true, null, 12));
        }
        boolean z2 = !z;
        FTCEditCornerViewModel fTCEditCornerViewModel = this.LLIL;
        if (fTCEditCornerViewModel != null) {
            fTCEditCornerViewModel.GT(z2);
        }
        if (!this.LLD) {
            this.LLD = true;
            C16880lQ.LJIILLIIL(this.LJLJLJ, new ACListenerS21S0101000_2(2, this, 10));
            C16880lQ.LJIILLIIL(this.LJLJLLL, new ACListenerS30S0101000_13(1, this, 6));
            C16880lQ.LJIILLIIL(this.LJLL, new ACListenerS30S0101000_13(0, this, 9));
            LIZJ();
            VideoEditViewModel videoEditViewModel = this.LJLJL.getVideoEditViewModel();
            videoEditViewModel.LJLILLLLZI.observe(this.LJLILLLLZI, new AObserverS64S0101000_14(1, this, 9));
            videoEditViewModel.LJLJJL.observe(this.LJLILLLLZI, new AObserverS64S0101000_14(1, this, 2));
            videoEditViewModel.LJLL.observe(this.LJLILLLLZI, new AObserverS58S0101000_2(0, this, 20));
            videoEditViewModel.LJLJLJ.observe(this.LJLILLLLZI, new AObserverS58S0101000_2(0, this, 21));
            videoEditViewModel.LJLJLLL.observe(this.LJLILLLLZI, new AObserverS58S0101000_2(0, this, 22));
            videoEditViewModel.LJLJJLL.observe(this.LJLILLLLZI, new AObserverS70S0100000_2(this, 333));
            videoEditViewModel.LJLJL.observe(this.LJLILLLLZI, new AObserverS58S0101000_2(1, this, 18));
            videoEditViewModel.LJLJJI.observe(this.LJLILLLLZI, new AObserverS64S0101000_14(1, this, 8));
        }
        LJIIJJI(z2);
        LJIIIZ(interfaceC1549166d, 0);
        int height = this.LJLJJL.getHeight();
        this.LLIIIILZ = height;
        if (height == 0) {
            this.LLIIIILZ = (int) KL2.LIZJ(this.LJLIL, 208.0f);
        }
        int LIZJ = this.LLIIIILZ + ((int) KL2.LIZJ(this.LJLIL, 16.0f));
        this.LLIIIILZ = LIZJ;
        View view = this.LJLJJL;
        C170696mv.LIZJ(view, z, LIZJ, view, new InterfaceC15040iS() { // from class: X.6Vp
            @Override // X.InterfaceC15040iS
            public final void accept(Object obj) {
                int i;
                C161416Vd c161416Vd = C161416Vd.this;
                boolean z3 = z;
                c161416Vd.getClass();
                boolean z4 = !z3;
                C161436Vf c161436Vf = c161416Vd.LJLJI;
                if (z4) {
                    i = 0;
                } else {
                    i = 4;
                }
                c161436Vf.setVisibility(i);
                if (z4) {
                    c161416Vd.LJLJI.LIZ();
                }
                if (z3) {
                    c161416Vd.LJLJI.LJLJLJ = 1;
                    c161416Vd.LJLZ.LLJILJIL(true);
                } else {
                    c161416Vd.LJLJI.LJLJLJ = 0;
                    c161416Vd.LJZ.DM().setValue(C5MM.LIZLLL(0L));
                    c161416Vd.LJLZ.LLJILJIL(true);
                    c161416Vd.LJZ.DM().setValue(C5MM.LIZ());
                }
            }
        });
        C68R c68r = this.LLIIIZ;
        if (c68r != null) {
            c68r.LIZ(z);
        }
        if (z) {
            this.LJZ.gv0().setValue(C140335f3.LIZ(C78885Uxd.LIZIZ(true, false, false, false), C81184Vtc.LJFF(this.LJLIL), this.LLIIIILZ, ((C81184Vtc.LIZIZ(this.LJLIL) - this.LLIIIILZ) - C81184Vtc.LJFF(this.LJLIL)) - C81184Vtc.LIZJ(this.LJLIL), AnonymousClass668.LIZIZ().LIZ()));
            ImageView imageView = this.LJLL;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(R.drawable.a9w));
            this.LJLL.setEnabled(true);
            this.LJLJL.setEnabled(true);
            this.LJLJL.LJJIIJZLJL(true);
            this.LJZ.DM().setValue(C5MM.LIZLLL(0L));
            return;
        }
        this.LJLL.setEnabled(false);
        this.LJLJL.setEnabled(false);
        this.LLFII.removeCallbacks(this.LLIIIL);
        this.LJZ.DM().setValue(C5MM.LIZJ());
        MutableLiveData<C140335f3> gv0 = this.LJZ.gv0();
        int color = this.LJLJI.getResources().getColor(R.color.b5);
        int LJFF = C81184Vtc.LJFF(this.LJLIL);
        int i = this.LLIIIILZ;
        int LIZIZ = ((C81184Vtc.LIZIZ(this.LJLIL) - this.LLIIIILZ) - C81184Vtc.LJFF(this.LJLIL)) - C81184Vtc.LIZJ(this.LJLIL);
        AnonymousClass668.LIZIZ().LIZ();
        gv0.setValue(C140345f4.LIZ(color, LJFF, i, LIZIZ));
        this.LLFFF = false;
    }

    public final void LJIIIZ(InterfaceC1549166d interfaceC1549166d, int i) {
        InterfaceC153045zY interfaceC153045zY;
        InterfaceC153045zY interfaceC153045zY2;
        if (interfaceC1549166d == this.LLIIJI) {
            return;
        }
        if (interfaceC1549166d != null) {
            if (!this.LLIIJLIL.containsKey(interfaceC1549166d)) {
                this.LLIIJLIL.put(interfaceC1549166d, interfaceC1549166d.LJIJ());
            }
            interfaceC1549166d.setAlpha(true);
            if (interfaceC1549166d instanceof C153155zj) {
                this.LLFII.post(new ARunnableS12S0101000_8(3, this, 3));
            }
            if (this.LLD && i == 0 && this.LJLZ != null) {
                int LJJJJI = interfaceC1549166d.LJJJJI();
                int LJIIZILJ = interfaceC1549166d.LJIIZILJ(this.LJLZ.LLIZLLLIL());
                if (LJJJJI >= 0 && LJIIZILJ >= 0 && !LJIILIIL(LJJJJI, LJIIZILJ, interfaceC1549166d)) {
                    this.LLFII.postDelayed(new ARunnableS0S0202000_2(this, LJJJJI, LJIIZILJ, interfaceC1549166d, 3), 300L);
                }
                LJIIL();
            }
            InterfaceC1549166d interfaceC1549166d2 = this.LLIIJI;
            if (interfaceC1549166d2 != null) {
                if (i != 0) {
                    if (i == 1 && this.LL) {
                        interfaceC1549166d2.setAlpha(false);
                    }
                } else if (this.LLD) {
                    interfaceC1549166d2.setAlpha(false);
                }
                if ((this.LLIIJI instanceof C153155zj) && (interfaceC153045zY2 = this.LJLZ) != null) {
                    interfaceC153045zY2.LIZJ();
                }
            }
            if (i == 1 && (interfaceC153045zY = this.LJLZ) != null) {
                this.LJLLLL.setProgress((int) (((this.LJLZ.LJZL() - interfaceC1549166d.LJJII(0)) / (interfaceC1549166d.LJJJZ(interfaceC153045zY.getDuration()) - interfaceC1549166d.LJJII(0))) * 100.0f));
            }
        } else {
            Iterator it = ((C0M9.b) this.LLIIJLIL.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                InterfaceC1549166d interfaceC1549166d3 = (InterfaceC1549166d) entry.getKey();
                InterfaceC137125Zs interfaceC137125Zs = (InterfaceC137125Zs) entry.getValue();
                if (interfaceC1549166d3 != null && interfaceC137125Zs != null) {
                    C161436Vf c161436Vf = this.LJLJI;
                    interfaceC1549166d3.LJJJJLI(interfaceC137125Zs, c161436Vf.LJLIL, c161436Vf.LJLILLLLZI);
                }
            }
            this.LLIIJLIL.clear();
        }
        this.LLIIJI = interfaceC1549166d;
    }

    public final void LJIILJJIL(int i, int i2) {
        InterfaceC153045zY interfaceC153045zY;
        LJIIL();
        if (this.LLIIJI == null || (interfaceC153045zY = this.LJLZ) == null) {
            return;
        }
        int LLFZ = interfaceC153045zY.LLFZ(i);
        int LLFZ2 = this.LJLZ.LLFZ(i2);
        if (LIZLLL()) {
            C161436Vf c161436Vf = this.LJLJI;
            InterfaceC1549166d interfaceC1549166d = this.LLIIJI;
            if (c161436Vf.LJLJJL == null || interfaceC1549166d == null) {
                return;
            } else {
                throw null;
            }
        }
        InterfaceC1549166d interfaceC1549166d2 = this.LLIIJI;
        if (interfaceC1549166d2 instanceof C67P) {
            TextStickerData data = ((C67P) interfaceC1549166d2).getData();
            if (data == null) {
                return;
            }
            data.setStartTime(LLFZ);
            data.setEndTime(LLFZ2);
            data.setUiStartTime(i);
            data.setUiEndTime(i2);
            return;
        }
        if (interfaceC1549166d2 instanceof C156086Aq) {
            CommentVideoModel data2 = ((C156086Aq) interfaceC1549166d2).getData();
            if (data2 == null) {
                return;
            }
            data2.setStartTime(LLFZ);
            data2.setEndTime(LLFZ2);
            return;
        }
        if (!(interfaceC1549166d2 instanceof InterfaceC1549466g)) {
            return;
        }
        ((InterfaceC1549466g) interfaceC1549166d2).LIZ();
        ((InterfaceC1549466g) this.LLIIJI).LIZJ();
    }

    public final void LJI(final boolean z, C153075zb c153075zb, final boolean z2) {
        this.LLIILII = z;
        boolean z3 = !z;
        FTCEditCornerViewModel fTCEditCornerViewModel = this.LLIL;
        if (fTCEditCornerViewModel != null) {
            fTCEditCornerViewModel.GT(z3);
        }
        if (!this.LL) {
            this.LL = true;
            this.LJLLL.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
            this.LJLLJ.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
            C16880lQ.LJIJI(this.LJLLJ, new ACListenerS21S0101000_2(2, this, 7));
            C16880lQ.LJIJI(this.LJLLL, new ACListenerS21S0101000_2(1, this, 0));
            LIZJ();
            this.LJLLLL.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.6Vi
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i, boolean z4) {
                    InterfaceC1549166d interfaceC1549166d;
                    InterfaceC153045zY interfaceC153045zY;
                    long LJIIIIZZ;
                    if (z4) {
                        C161416Vd c161416Vd = C161416Vd.this;
                        if (!c161416Vd.LLIILII || (interfaceC1549166d = c161416Vd.LLIIJI) == null || (interfaceC153045zY = c161416Vd.LJLZ) == null) {
                            return;
                        }
                        int i2 = 0;
                        float LJJII = c161416Vd.LLIIJI.LJJII(0) + (((interfaceC1549166d.LJJJZ(interfaceC153045zY.getDuration()) - c161416Vd.LLIIJI.LJJII(0)) * i) / 100.0f);
                        MutableLiveData<C5MM> DM = c161416Vd.LJZ.DM();
                        List<VideoSegment> kv0 = c161416Vd.LJLJL.getVideoEditViewModel().kv0();
                        float nv0 = c161416Vd.LJLJL.getVideoEditViewModel().nv0();
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < kv0.size(); i3++) {
                            if (!((VideoSegment) ListProtector.get(kv0, i3)).isDeleted) {
                                arrayList.add(ListProtector.get(kv0, i3));
                            }
                        }
                        long j = 0;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList.size()) {
                                break;
                            }
                            VideoSegment videoSegment = (VideoSegment) ListProtector.get(arrayList, i4);
                            j += videoSegment.duration;
                            if (LJJII <= ((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / (videoSegment.LJIIIIZZ() * nv0)) {
                                i2 = i4;
                                break;
                            } else {
                                LJJII -= ((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / (videoSegment.LJIIIIZZ() * nv0);
                                i4++;
                            }
                        }
                        if (i4 == arrayList.size()) {
                            LJIIIIZZ = ((VideoSegment) ListProtector.get(arrayList, i2)).LJ() + (j - ((VideoSegment) ListProtector.get(arrayList, i2)).duration);
                        } else {
                            LJIIIIZZ = (((VideoSegment) ListProtector.get(arrayList, i2)).LJIIIIZZ() * LJJII * nv0) + ((float) (((VideoSegment) ListProtector.get(arrayList, i2)).LJIIIZ() + (j - ((VideoSegment) ListProtector.get(arrayList, i2)).duration)));
                        }
                        DM.setValue(C5MM.LIZIZ(LJIIIIZZ));
                    }
                }
            });
        }
        LJIIJJI(z3);
        LJIIIZ(c153075zb, 1);
        int height = this.LJLLILLLL.getHeight();
        this.LLIIIILZ = height;
        if (height == 0) {
            this.LLIIIILZ = (int) KL2.LIZJ(this.LJLIL, 120.0f);
        }
        this.LJLLLL.setProgress((int) ((this.LJLZ.LJZL() * 100.0f) / this.LJLZ.getDuration()));
        View view = this.LJLLILLLL;
        C170696mv.LIZJ(view, z, this.LLIIIILZ, view, new InterfaceC15040iS() { // from class: X.6Vh
            @Override // X.InterfaceC15040iS
            public final void accept(Object obj) {
                int i;
                C5V3 c5v3;
                C161416Vd c161416Vd = C161416Vd.this;
                boolean z4 = z;
                boolean z5 = z2;
                c161416Vd.getClass();
                boolean z6 = !z4;
                C161436Vf c161436Vf = c161416Vd.LJLJI;
                if (z6) {
                    i = 0;
                } else {
                    i = 4;
                }
                c161436Vf.setVisibility(i);
                if (z6) {
                    c161416Vd.LJLJI.LIZ();
                }
                if (z4) {
                    c161416Vd.LJLJI.LJLJLJ = 1;
                    c161416Vd.LJLZ.LLJILJIL(true);
                    return;
                }
                c161416Vd.LJLJI.LJLJLJ = 0;
                if (z5) {
                    C161516Vn c161516Vn = c161416Vd.LLIILZL;
                    C29S c29s = c161416Vd.LJLIL;
                    if (c29s == null) {
                        c161516Vn.getClass();
                    } else {
                        if (c161516Vn.LJIIIIZZ == null) {
                            c161516Vn.LJIIIIZZ = new C5V3(c29s);
                        }
                        C5V3 c5v32 = c161516Vn.LJIIIIZZ;
                        if ((c5v32 == null || !c5v32.isShowing()) && (c5v3 = c161516Vn.LJIIIIZZ) != null && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/shortvideo/edit/infosticker/StickerPinLoadingDialog", "show", c5v3, new Object[0], "void", new C65300Pk0(false, "()V", "1564366552903123538")).LIZ) {
                            c5v3.show();
                        }
                    }
                    final C161516Vn c161516Vn2 = c161416Vd.LLIILZL;
                    c161516Vn2.getClass();
                    AVServiceImpl.LIZ().fetchResourcesNeededByRequirements(new String[]{"objectTracking"}, new IFoundationAVService.IFetchResourcesListener() { // from class: X.6Vo
                        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                        public final void onFailed(Exception exc) {
                            C6W7 c6w7 = C161516Vn.this.LJFF;
                            if (c6w7 != null) {
                                c6w7.LIZ.LJLJI.post(new ARunnableS8S0110000_2(c6w7, 9));
                            }
                        }

                        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                        public final void onSuccess(String[] requirements) {
                            o.LJIIIZ(requirements, "requirements");
                            C10K.LIZIZ(new ACallableS105S0100000_2(C161516Vn.this, 41), C10K.LJIIIIZZ, null).LJ(new AgS120S0100000_2(C161516Vn.this, 39), C10K.LJI, null);
                        }
                    });
                    return;
                }
                c161416Vd.LJLZ.LLJILJIL(true);
                c161416Vd.LJZ.DM().setValue(C5MM.LIZ());
            }
        });
        C68R c68r = this.LLIIIZ;
        if (c68r != null) {
            c68r.LIZ(z);
        }
        if (z) {
            MutableLiveData<C140335f3> gv0 = this.LJZ.gv0();
            int LIZIZ = C78885Uxd.LIZIZ(true, false, false, false);
            int i = this.LLIIIILZ;
            int LIZIZ2 = (C81184Vtc.LIZIZ(this.LJLIL) - this.LLIIIILZ) - C81184Vtc.LIZJ(this.LJLIL);
            AnonymousClass668.LIZIZ().LIZ();
            gv0.setValue(C140345f4.LIZIZ(LIZIZ, 0, i, LIZIZ2, true, z2, 512));
            ImageView imageView = this.LJLL;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(R.drawable.a9w));
            this.LJLL.setEnabled(true);
            return;
        }
        this.LJLL.setEnabled(false);
        this.LLFII.removeCallbacks(this.LLIIIL);
        this.LJZ.DM().setValue(C5MM.LIZJ());
        MutableLiveData<C140335f3> gv02 = this.LJZ.gv0();
        int color = this.LJLJI.getResources().getColor(R.color.b5);
        int LJFF = C81184Vtc.LJFF(this.LJLIL);
        int i2 = this.LLIIIILZ;
        int LIZIZ3 = (C81184Vtc.LIZIZ(this.LJLIL) - this.LLIIIILZ) - C81184Vtc.LIZJ(this.LJLIL);
        AnonymousClass668.LIZIZ().LIZ();
        C140335f3 c140335f3 = new C140335f3(0, color);
        c140335f3.LIZ = LJFF;
        c140335f3.LIZIZ = i2;
        c140335f3.LIZJ = LIZIZ3;
        c140335f3.LIZLLL = z2;
        c140335f3.LJ = true;
        gv02.setValue(c140335f3);
        this.LLFFF = false;
    }

    public final boolean LJIILIIL(int i, int i2, InterfaceC1549166d interfaceC1549166d) {
        boolean LJJIJLIJ = this.LJLJL.LJJIJLIJ(i, i2, true);
        if (LJJIJLIJ && interfaceC1549166d != null) {
            this.LJLLI.LJLJI.setValue(Long.valueOf(interfaceC1549166d.LJJII(0)));
            this.LJZ.DM().setValue(C5MM.LIZLLL(interfaceC1549166d.LJJII(0)));
        }
        return LJJIJLIJ;
    }
}
