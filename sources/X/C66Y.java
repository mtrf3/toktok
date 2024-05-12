package X;

import X.C0M9;
import Y.ACListenerS21S0101000_2;
import Y.ACallableS105S0100000_2;
import Y.AObjectS41S0101000_2;
import Y.AObjectS42S0101000_5;
import Y.AObjectS45S0101000_13;
import Y.ARunnableS0S0202000_2;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS38S0100000_2;
import Y.ARunnableS8S0110000_2;
import Y.AgS120S0100000_2;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
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
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
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
import kotlin.jvm.internal.o;

/* renamed from: X.66Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C66Y implements InterfaceC147435qV, C66J {
    public ActivityC45651qj LJLIL;
    public WM7 LJLILLLLZI;
    public C1548265u LJLJI;
    public View LJLJJI;
    public C223338pd LJLJJL;
    public View LJLJJLL;
    public C170466mY LJLJL;
    public ViewOnTouchListenerC82857WfV LJLJLJ;
    public ImageView LJLJLLL;
    public ImageView LJLL;
    public ImageView LJLLI;
    public CutMultiVideoViewModel LJLLILLLL;
    public View LJLLJ;
    public TextView LJLLL;
    public TextView LJLLLL;
    public SeekBar LJLLLLLL;
    public ViewGroup LJLZ;
    public InterfaceC153045zY LJZI;
    public InfoStickerViewModel LJZL;
    public VideoPublishEditModel LL;
    public View LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public List<MediaModel> LLFII;
    public boolean LLFZ;
    public SafeHandler LLI;
    public AnonymousClass655 LLIFFJFJJ;
    public FrameLayout LLII;
    public MutableLiveData<Bitmap> LLIIII;
    public MutableLiveData<Boolean> LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public Rect LLIIIZ;
    public AnonymousClass671 LLIIJLIL;
    public C1548565x LLIILII;
    public C1548765z LLIILZL;
    public C66F LLIIZ;
    public InterfaceC1549166d LLIL;
    public boolean LLILIL;
    public boolean LLILL;
    public C66T LLILLIZIL;
    public WFB LLILLJJLI;
    public final InterfaceC143655kP LLILLL;
    public boolean LLILZ;
    public final CreativeInfo LLILZIL;
    public final C82622Wbi LLILZLL;
    public C1548866a LLIZ;
    public final boolean LLIZLLLIL;
    public int LJZ = 30;
    public int LLIIJI = AnonymousClass668.LIZIZ().LIZ();
    public final ARunnableS38S0100000_2 LLIIL = new ARunnableS38S0100000_2(this, 68);
    public final C1HQ LLILII = new C1HQ();
    public C66H LLJ = null;
    public boolean LLJI = false;
    public final C1548966b LLJIJIL = new C1548966b(this);

    public final void LJ() {
        InterfaceC153045zY interfaceC153045zY;
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        if (!this.LLFFF && (interfaceC153045zY = this.LJZI) != null && this.LJLJLJ != null && this.LL != null) {
            this.LLFFF = true;
            int LLIZLLLIL = interfaceC153045zY.LLIZLLLIL();
            WFB wfb = null;
            this.LJLLILLLL = (CutMultiVideoViewModel) C165706es.LJIIIIZZ(this.LJLILLLLZI, this.LJLIL, null, 4).get(CutMultiVideoViewModel.class);
            this.LJLJLJ.setCanEdit(false);
            this.LJLJLJ.setMinVideoLength(100L);
            this.LJLJLJ.setUseCustomMaxVideoLengthDirectly(true);
            this.LJLJLJ.setMaxVideoLength(LLIZLLLIL);
            this.LJLLILLLL.LJLLILLLL = this.LL.isMvThemeVideoType();
            this.LJLLILLLL.LJLLJ = LLIZLLLIL;
            this.LJLJLJ.setFirstFrameVisibleLiveData(this.LLIIIILZ);
            this.LJLJLJ.setFirstFrameBitmapLiveData(this.LLIIII);
            this.LJLJLJ.setVeEditor(this.LJZI);
            ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJLJLJ;
            if (this.LJZI != null) {
                int frameWidth = viewOnTouchListenerC82857WfV.getFrameWidth();
                int frameHeight = viewOnTouchListenerC82857WfV.getFrameHeight();
                int ceil = (int) Math.ceil((KL2.LJIIJJI(this.LJLIL) - (viewOnTouchListenerC82857WfV.getLeftRightMargin() * 2)) / (frameWidth * 1.0f));
                if (C6WA.LIZ()) {
                    get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
                } else {
                    get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
                }
                VideoPublishEditModel videoPublishEditModel = this.LL;
                if (videoPublishEditModel != null && videoPublishEditModel.isMultiVideoEdit()) {
                    wfb = new WFB(new VEMultiEditVideoCoverGeneratorImpl(this.LJZI, this.LJLIL, ceil, this.LJZI.getDuration(), (int) this.LL.getMultiEditVideoStartTime(), get_frames_flags), frameWidth, frameHeight, ceil);
                } else {
                    wfb = new WFB(new VEVideoCoverGeneratorImpl(this.LJZI, this.LJLILLLLZI, ceil, get_frames_flags, "sticker_select_time"), frameWidth, frameHeight, ceil);
                }
            }
            this.LLILLJJLI = wfb;
            if (this.LL.isCurrentAutoCutMode()) {
                InterfaceC153045zY interfaceC153045zY2 = this.LJZI;
                if (interfaceC153045zY2 instanceof C133765Mu) {
                    this.LLFII = C44701HgX.LJIIJ((C133765Mu) interfaceC153045zY2);
                    ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV2 = this.LJLJLJ;
                    AbstractC42651GoZ LJJIJIIJIL = C86793Y4n.LJJIJIIJIL(this.LJLILLLLZI);
                    ViewModelProvider LJFF = C165706es.LJFF(this.LJLILLLLZI);
                    CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLLILLLL;
                    WFB wfb2 = this.LLILLJJLI;
                    List<MediaModel> list = this.LLFII;
                    boolean LIZ = C6W9.LIZ();
                    viewOnTouchListenerC82857WfV2.LLIILZL = wfb2;
                    viewOnTouchListenerC82857WfV2.LLIIZ = LIZ;
                    viewOnTouchListenerC82857WfV2.LJI(LJJIJIIJIL, LJFF, cutMultiVideoViewModel, list);
                    this.LJLJLJ.setEnableBoundaryText(true);
                    this.LJLJLJ.setPointerType(2);
                }
            }
            this.LLFII = this.LL.getMediaModelList();
            ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV22 = this.LJLJLJ;
            AbstractC42651GoZ LJJIJIIJIL2 = C86793Y4n.LJJIJIIJIL(this.LJLILLLLZI);
            ViewModelProvider LJFF2 = C165706es.LJFF(this.LJLILLLLZI);
            CutMultiVideoViewModel cutMultiVideoViewModel2 = this.LJLLILLLL;
            WFB wfb22 = this.LLILLJJLI;
            List<MediaModel> list2 = this.LLFII;
            boolean LIZ2 = C6W9.LIZ();
            viewOnTouchListenerC82857WfV22.LLIILZL = wfb22;
            viewOnTouchListenerC82857WfV22.LLIIZ = LIZ2;
            viewOnTouchListenerC82857WfV22.LJI(LJJIJIIJIL2, LJFF2, cutMultiVideoViewModel2, list2);
            this.LJLJLJ.setEnableBoundaryText(true);
            this.LJLJLJ.setPointerType(2);
        }
    }

    @Override // X.C66J
    public final boolean LIZ() {
        MutableLiveData<Boolean> mutableLiveData;
        InfoStickerViewModel infoStickerViewModel = this.LJZL;
        if (infoStickerViewModel != null && (mutableLiveData = infoStickerViewModel.LJLJJI) != null && mutableLiveData.getValue() != null) {
            return mutableLiveData.getValue().booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        boolean z;
        int i;
        String str;
        C1548265u c1548265u = this.LJLJI;
        C153065za c153065za = c1548265u.LJLJLJ;
        if (c153065za != null) {
            c153065za.LJIIL();
            c1548265u.invalidate();
        }
        this.LJLJI.LJLLLL = 0;
        if (LJFF()) {
            InterfaceC1549166d interfaceC1549166d = this.LLIL;
            if (interfaceC1549166d instanceof C153075zb) {
                i = ((C153075zb) interfaceC1549166d).LJLLJ;
            } else {
                i = 0;
            }
            C145995oB c145995oB = new C145995oB();
            InterfaceC1549166d interfaceC1549166d2 = this.LLIL;
            if (interfaceC1549166d2 instanceof C153075zb) {
                str = ((C153075zb) interfaceC1549166d2).LJLJI.stickerId;
            } else if (interfaceC1549166d2 instanceof C67P) {
                str = "text_sticker";
            } else {
                str = "";
            }
            c145995oB.LJI("prop_id", str);
            c145995oB.LJI("creation_id", this.LL.getCreationId());
            c145995oB.LJI("content_source", this.LL.getAvetParameter().getContentSource());
            c145995oB.LJI("shoot_entrance", this.LL.mShootWay);
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LIZ(-1, "sticker_type");
            c145995oB.LIZ(i, "is_diy_prop");
            int i2 = this.LL.draftId;
            if (i2 != 0) {
                c145995oB.LIZ(i2, "draft_id");
            }
            if (!TextUtils.isEmpty(this.LL.newDraftId)) {
                c145995oB.LIZLLL("new_draft_id", this.LL.newDraftId);
            }
            GXR.LIZ("prop_timeset_cancel", c145995oB.LIZ);
        } else {
            InterfaceC1549166d interfaceC1549166d3 = this.LLIL;
            if (interfaceC1549166d3 instanceof C67P) {
                TextStickerData data = ((C67P) interfaceC1549166d3).getData();
                if (data != null && data.getHasReadTextAudio()) {
                    z = true;
                } else {
                    z = false;
                }
                VideoPublishEditModel model = this.LL;
                o.LJIIIZ(model, "model");
                FMX.LJIIL("text_timeset_cancel", H8F.LJFF(model, false, z, 2).LIZ);
            } else if (interfaceC1549166d3 instanceof C156086Aq) {
                this.LLIZ.LJ(4);
            } else if (interfaceC1549166d3 instanceof InterfaceC1549466g) {
                this.LLIZ.LJ(6);
            } else if (interfaceC1549166d3 instanceof InterfaceC1549266e) {
                this.LLIZ.LJ(((InterfaceC1549266e) interfaceC1549166d3).getInteractStickerType());
            }
        }
        if (this.LLIZLLLIL) {
            LJIILIIL(false, null);
        } else {
            LJIIL(false, null);
        }
        this.LLIILZL.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ() {
        boolean z;
        InterfaceC153045zY interfaceC153045zY;
        int i;
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = (CutMultiVideoViewModel) C165706es.LJFF(this.LJLILLLLZI).get(CutMultiVideoViewModel.class);
        }
        int i2 = this.LJLLILLLL.LJLLJ;
        C1548265u c1548265u = this.LJLJI;
        C153065za c153065za = c1548265u.LJLJLJ;
        if (c153065za != null) {
            c153065za.LJIIL();
            c1548265u.invalidate();
        }
        this.LJLJI.LJLLLL = 0;
        this.LLILII.clear();
        String str = "";
        if (LJFF()) {
            InterfaceC1549166d interfaceC1549166d = this.LLIL;
            if (interfaceC1549166d instanceof C153075zb) {
                i = ((C153075zb) interfaceC1549166d).LJLLJ;
            } else {
                i = 0;
            }
            C145995oB c145995oB = new C145995oB();
            InterfaceC1549166d interfaceC1549166d2 = this.LLIL;
            if (interfaceC1549166d2 instanceof C153075zb) {
                str = ((C153075zb) interfaceC1549166d2).LJLJI.stickerId;
            } else if (interfaceC1549166d2 instanceof C67P) {
                str = "text_sticker";
            }
            c145995oB.LJI("prop_id", str);
            c145995oB.LJI("creation_id", this.LL.getCreationId());
            c145995oB.LJI("content_source", this.LL.getAvetParameter().getContentSource());
            c145995oB.LJI("shoot_entrance", this.LL.mShootWay);
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LIZ(-1, "sticker_type");
            c145995oB.LIZ(i, "is_diy_prop");
            int i3 = this.LL.draftId;
            if (i3 != 0) {
                c145995oB.LIZ(i3, "draft_id");
            }
            if (!TextUtils.isEmpty(this.LL.newDraftId)) {
                c145995oB.LIZLLL("new_draft_id", this.LL.newDraftId);
            }
            GXR.LIZ("prop_timeset_confirm", c145995oB.LIZ);
        } else {
            InterfaceC1549166d interfaceC1549166d3 = this.LLIL;
            if (interfaceC1549166d3 instanceof C67P) {
                TextStickerData data = ((C67P) interfaceC1549166d3).getData();
                if (data != null) {
                    if (!TextUtils.isEmpty(data.getPlaceholderSlotId()) && (interfaceC153045zY = this.LJZI) != null) {
                        C78841Uwv.LJJIIJZLJL("", interfaceC153045zY, new AObjectS42S0101000_5(5, data, 56));
                    }
                    if (data.getHasReadTextAudio()) {
                        z = true;
                        VideoPublishEditModel model = this.LL;
                        o.LJIIIZ(model, "model");
                        FMX.LJIIL("text_timeset_confirm", H8F.LJFF(model, false, z, 2).LIZ);
                    }
                }
                z = false;
                VideoPublishEditModel model2 = this.LL;
                o.LJIIIZ(model2, "model");
                FMX.LJIIL("text_timeset_confirm", H8F.LJFF(model2, false, z, 2).LIZ);
            } else if (interfaceC1549166d3 instanceof C156086Aq) {
                C1548866a c1548866a = this.LLIZ;
                Integer num = 4;
                c1548866a.getClass();
                if (num != null) {
                    FMX.LJIIL("prop_timeset_confirm", c1548866a.LIZ(num.intValue()).LIZ);
                }
            } else if (interfaceC1549166d3 instanceof InterfaceC1549266e) {
                C1548866a c1548866a2 = this.LLIZ;
                Integer interactStickerType = ((InterfaceC1549266e) interfaceC1549166d3).getInteractStickerType();
                c1548866a2.getClass();
                if (interactStickerType != null) {
                    FMX.LJIIL("prop_timeset_confirm", c1548866a2.LIZ(interactStickerType.intValue()).LIZ);
                }
            }
        }
        if (this.LLIZLLLIL) {
            LJIILIIL(false, null);
        } else {
            LJIIL(false, null);
        }
        int i4 = this.LJLLILLLL.LJLLJ;
        C1548765z c1548765z = this.LLIILZL;
        if (i2 != i4) {
            c1548765z.LIZ.LLJJIJIL().n3().setValue(C76800UCe.LIZ);
        }
        c1548765z.LIZ.LLJJIJIL().kJ().setValue(C76800UCe.LIZ);
        this.LL.creativeModel.editStickerModel.hasUsedTimestampAbility = true;
    }

    public final void LIZLLL() {
        C1548265u c1548265u = this.LJLJI;
        if (c1548265u != null && c1548265u.LJLJLJ != null) {
            c1548265u.LLIIIJ.LJII();
            List<C153075zb> list = this.LJLJI.LJLJLJ.LIZ;
            if (list != null && ((ArrayList) list).size() > 0) {
                Iterator it = ((ArrayList) this.LJLJI.LJLJLJ.LIZ).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    C153075zb c153075zb = (C153075zb) it.next();
                    if (c153075zb.LJLJJL) {
                        c153075zb.LJLJJL = false;
                        z = true;
                    }
                }
                if (z) {
                    C1548265u c1548265u2 = this.LJLJI;
                    c1548265u2.LLIIII = false;
                    c1548265u2.invalidate();
                }
            }
        }
    }

    public final boolean LJFF() {
        InterfaceC1549166d interfaceC1549166d = this.LLIL;
        if (interfaceC1549166d instanceof C153075zb) {
            return true;
        }
        return ((interfaceC1549166d instanceof C67P) || (interfaceC1549166d instanceof C156086Aq) || !(interfaceC1549166d instanceof InterfaceC1549466g)) ? false : false;
    }

    public final void LJII() {
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV;
        if (!this.LLILIL || this.LJZI == null || (viewOnTouchListenerC82857WfV = this.LJLJLJ) == null) {
            return;
        }
        C15070iV<Long, Long> playBoundary = viewOnTouchListenerC82857WfV.getPlayBoundary();
        this.LJZL.DM().setValue(C5MM.LIZIZ(this.LJZI.LLFZ(playBoundary.LIZ.intValue())));
        LJIL(Math.max(playBoundary.LIZ.intValue(), 0), Math.min(playBoundary.LIZIZ.intValue(), this.LJZI.getDuration()), false, true);
        LJI();
    }

    @Override // X.C66J
    public final boolean LJIIIIZZ() {
        MutableLiveData<Boolean> mutableLiveData;
        InfoStickerViewModel infoStickerViewModel = this.LJZL;
        if (infoStickerViewModel != null && (mutableLiveData = infoStickerViewModel.LJLJI) != null && mutableLiveData.getValue() != null) {
            return mutableLiveData.getValue().booleanValue();
        }
        return false;
    }

    public final void LJIIIZ() {
        if (!this.LLILIL || this.LJZI == null || this.LJLJLJ == null) {
            return;
        }
        if (this.LLFZ) {
            LJIJ();
        }
        C15070iV<Long, Long> playBoundary = this.LJLJLJ.getPlayBoundary();
        long LLFZ = this.LJZI.LLFZ(this.LJLJLJ.getPlayBoundary().LIZ.intValue());
        LJIL(Math.max(playBoundary.LIZ.intValue(), 0), Math.min(playBoundary.LIZIZ.intValue(), this.LJZI.getDuration()), true, false);
        this.LJZL.DM().setValue(C5MM.LIZIZ(LLFZ));
    }

    public final void LJIIZILJ() {
        InterfaceC1549166d interfaceC1549166d = this.LLIL;
        if (interfaceC1549166d instanceof C67P) {
            TextStickerData data = ((C67P) interfaceC1549166d).getData();
            if (this.LJLJLJ != null) {
                if (data != null && this.LJZI != null && data.getHasReadTextAudio()) {
                    this.LJLJLJ.LJJIII(data.getAudioTrackDuration(), this.LJZI.LLIZLLLIL());
                    return;
                } else {
                    this.LJLJLJ.LJIIL();
                    return;
                }
            }
            return;
        }
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJLJLJ;
        if (viewOnTouchListenerC82857WfV == null) {
            return;
        }
        viewOnTouchListenerC82857WfV.LJIIL();
    }

    public final void LJIJ() {
        boolean z = !this.LLFZ;
        this.LLFZ = z;
        LJIJI(z);
        LJIJJ();
        C1548765z c1548765z = this.LLIILZL;
        if (c1548765z != null) {
            c1548765z.LIZ(this.LLFZ);
        }
        if (!this.LLFZ) {
            ActivityC45651qj activityC45651qj = this.LJLIL;
            if (activityC45651qj != null) {
                this.LJLLI.setImageDrawable(activityC45651qj.getResources().getDrawable(R.drawable.a9w));
            }
            if (this.LJZI != null) {
                this.LJZL.DM().setValue(C5MM.LIZIZ(this.LJZI.LJZL()));
            }
            this.LJZL.DM().setValue(C5MM.LIZJ());
            this.LLI.removeCallbacks(this.LLIIL);
            InterfaceC1549166d interfaceC1549166d = this.LLIL;
            if (interfaceC1549166d != null) {
                interfaceC1549166d.setAlpha(true);
                InterfaceC1549166d interfaceC1549166d2 = this.LLIL;
                if (interfaceC1549166d2 instanceof C67P) {
                    TextStickerData data = ((C67P) interfaceC1549166d2).getData();
                    if (this.LJLJLJ != null && data != null && this.LJZI != null && data.getHasReadTextAudio()) {
                        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJLJLJ;
                        viewOnTouchListenerC82857WfV.LLIIIZ.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC82860WfY(viewOnTouchListenerC82857WfV, data.getAudioTrackDuration(), this.LJZI.LLIZLLLIL()));
                    }
                }
            }
        } else {
            ActivityC45651qj activityC45651qj2 = this.LJLIL;
            if (activityC45651qj2 != null) {
                this.LJLLI.setImageDrawable(activityC45651qj2.getResources().getDrawable(R.drawable.a9v));
            }
            this.LLI.post(this.LLIIL);
            this.LJZL.DM().setValue(C5MM.LIZ());
            ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV2 = this.LJLJLJ;
            if (viewOnTouchListenerC82857WfV2 != null) {
                viewOnTouchListenerC82857WfV2.LJIIL();
            }
        }
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV3 = this.LJLJLJ;
        if (viewOnTouchListenerC82857WfV3 != null) {
            viewOnTouchListenerC82857WfV3.LJJIIJZLJL(true ^ this.LLFZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJJ() {
        boolean z;
        C170466mY c170466mY;
        if (this.LLFZ && (c170466mY = this.LJLJL) != null) {
            String string = c170466mY.getContext().getResources().getString(R.string.s3l);
            C170466mY c170466mY2 = this.LJLJL;
            if (c170466mY2 != null) {
                c170466mY2.setText(string);
                return;
            }
            return;
        }
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJLJLJ;
        if (viewOnTouchListenerC82857WfV == null) {
            return;
        }
        float selectedTime = viewOnTouchListenerC82857WfV.getSelectedTime();
        if (1000.0f * selectedTime * 0.99f < ((float) this.LJLJLJ.getMinVideoLength())) {
            z = true;
        } else {
            z = false;
        }
        String LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(selectedTime)});
        C170466mY c170466mY3 = this.LJLJL;
        String str = "";
        if (c170466mY3 != null) {
            try {
                str = c170466mY3.getContext().getResources().getString(R.string.hhg, LLLZI);
            } catch (FormatFlagsConversionMismatchException e) {
                String string2 = this.LJLJL.getContext().getResources().getString(R.string.hhf, LLLZI);
                try {
                    C170466mY c170466mY4 = this.LJLJL;
                    if (c170466mY4 != null) {
                        str = c170466mY4.getContext().getResources().getString(R.string.hhg);
                    }
                    C6BK c6bk = new C6BK();
                    c6bk.LIZ.put("exception", J7I.LJII(e));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("normal_str=");
                    LIZ.append(string2);
                    LIZ.append(", error_str=");
                    LIZ.append(str);
                    c6bk.LIZ.put("event", X1D.LIZIZ(LIZ));
                    C43882HKc.LIZIZ("info_sticker_string_format_event", c6bk.LJ());
                } catch (Exception e2) {
                    H7B.LIZJ(e2.getLocalizedMessage());
                }
                str = string2;
            }
        }
        if (z && this.LJLJL != null) {
            SpannableString spannableString = new SpannableString(str);
            C78857UxB.LJJJJJ(spannableString, str.indexOf(LLLZI), LLLZI.length() + str.indexOf(LLLZI), this.LJLJL.getResources().getColor(R.color.c7));
            str = spannableString;
        }
        C170466mY c170466mY5 = this.LJLJL;
        if (c170466mY5 == null) {
            return;
        }
        c170466mY5.setText(str);
    }

    public final void LJI() {
        boolean z;
        if (LJFF()) {
            InterfaceC1549166d interfaceC1549166d = this.LLIL;
            if (interfaceC1549166d instanceof C153075zb) {
                z = ((C153075zb) interfaceC1549166d).LJLLJ;
            } else {
                z = false;
            }
            VideoPublishEditModel model = this.LL;
            o.LJIIIZ(model, "model");
            C145995oB LJFF = H8F.LJFF(model, z, false, 4);
            LJFF.LIZ(-1, "sticker_type");
            FMX.LJIIL("prop_duration_adjust", LJFF.LIZ);
            return;
        }
        InterfaceC1549166d interfaceC1549166d2 = this.LLIL;
        if (interfaceC1549166d2 instanceof C67P) {
            H8F.LJJJJJL(this.LL, this.LJZI);
            return;
        }
        if (interfaceC1549166d2 instanceof InterfaceC1549466g) {
            this.LLIZ.LIZLLL(6);
        } else if (interfaceC1549166d2 instanceof C156086Aq) {
            this.LLIZ.LIZLLL(4);
        } else {
            if (!(interfaceC1549166d2 instanceof InterfaceC1549266e)) {
                return;
            }
            this.LLIZ.LIZLLL(((InterfaceC1549266e) interfaceC1549166d2).getInteractStickerType());
        }
    }

    public final void LJIIJJI(InterfaceC1549166d interfaceC1549166d) {
        String str;
        if (interfaceC1549166d == null || !(interfaceC1549166d instanceof C153075zb)) {
            return;
        }
        boolean z = ((C153075zb) interfaceC1549166d).LJLLJ;
        if (this.LL == null) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("prop_id", ((C153075zb) interfaceC1549166d).LJLJI.stickerId);
        c145995oB.LJI("creation_id", this.LL.getCreationId());
        if (this.LLIL == null) {
            str = "click";
        } else {
            str = "change";
        }
        c145995oB.LJI("method", str);
        c145995oB.LJI("content_type", this.LL.getAvetParameter().getContentType());
        c145995oB.LJI("content_source", this.LL.getAvetParameter().getContentSource());
        c145995oB.LJI("shoot_entrance", this.LL.mShootWay);
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LIZ(-1, "sticker_type");
        c145995oB.LIZ(z ? 1 : 0, "is_diy_prop");
        int i = this.LL.draftId;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        if (!TextUtils.isEmpty(this.LL.newDraftId)) {
            c145995oB.LIZLLL("new_draft_id", this.LL.newDraftId);
        }
        GXR.LIZ("prop_time_set", c145995oB.LIZ);
    }

    public final void LJIILJJIL(InterfaceC1549166d interfaceC1549166d) {
        AnonymousClass667 lT;
        int i = 0;
        if (this.LLIZLLLIL) {
            LJIILLIIL(interfaceC1549166d);
            if (interfaceC1549166d != null) {
                C66H c66h = this.LLJ;
                c66h.getClass();
                InterfaceC139535dl LLJJJ = c66h.LIZ.LLJJJ();
                if (LLJJJ != null && (lT = LLJJJ.lT()) != null) {
                    float LJJII = interfaceC1549166d.LJJII(0);
                    InterfaceC153045zY value = c66h.LIZ.getEditPreviewApi().Kh().getValue();
                    if (value != null) {
                        i = value.getDuration();
                    }
                    lT.LJII(LJJII, interfaceC1549166d.LJJJZ(i));
                    return;
                }
                return;
            }
            LJIIZILJ();
            return;
        }
        LJIILL(interfaceC1549166d, 0);
        LJIIZILJ();
    }

    public final void LJIILLIIL(InterfaceC1549166d interfaceC1549166d) {
        C1548265u c1548265u;
        InterfaceC153045zY interfaceC153045zY;
        SafeHandler safeHandler;
        if (interfaceC1549166d == this.LLIL) {
            return;
        }
        if (interfaceC1549166d != null) {
            if (!this.LLILII.containsKey(interfaceC1549166d)) {
                this.LLILII.put(interfaceC1549166d, interfaceC1549166d.LJIJ());
            }
            interfaceC1549166d.setAlpha(true);
            if ((interfaceC1549166d instanceof C153075zb) && (safeHandler = this.LLI) != null && this.LJZI != null) {
                safeHandler.post(new ARunnableS15S0101000_11(7, this, 9));
            }
            InterfaceC1549166d interfaceC1549166d2 = this.LLIL;
            if (interfaceC1549166d2 != null) {
                interfaceC1549166d2.setAlpha(false);
                if ((this.LLIL instanceof C153075zb) && (interfaceC153045zY = this.LJZI) != null) {
                    interfaceC153045zY.LIZJ();
                }
            }
            LJIIJJI(interfaceC1549166d);
        } else {
            Iterator it = ((C0M9.b) this.LLILII.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                InterfaceC1549166d interfaceC1549166d3 = (InterfaceC1549166d) entry.getKey();
                InterfaceC137125Zs interfaceC137125Zs = (InterfaceC137125Zs) entry.getValue();
                if (interfaceC1549166d3 != null && interfaceC137125Zs != null && (c1548265u = this.LJLJI) != null) {
                    interfaceC1549166d3.LJJJJLI(interfaceC137125Zs, c1548265u.LJLJI, c1548265u.LJLJJI);
                }
            }
            this.LLILII.clear();
        }
        this.LLIL = interfaceC1549166d;
    }

    public final void LJIJI(boolean z) {
        C153065za c153065za;
        C1548265u c1548265u = this.LJLJI;
        if (c1548265u != null && (c153065za = c1548265u.LJLJLJ) != null) {
            if (z) {
                c153065za.LJIIL();
            } else {
                c153065za.LJIILL();
            }
        }
        if (this.LLIL != null && LJFF()) {
            this.LLIL.setAlpha(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC147435qV
    public final boolean Rc(RectF rectF) {
        VideoPublishEditModel videoPublishEditModel = this.LL;
        if (videoPublishEditModel != null && this.LJZI != null && videoPublishEditModel.hasInfoStickers()) {
            VESize LLILZ = this.LJZI.LLILZ();
            C68322mC c68322mC = new C68322mC();
            RectF rectF2 = new RectF();
            for (StickerItemModel stickerItemModel : this.LL.infoStickerModel.stickers) {
                int i = 1;
                if (stickerItemModel.isImageSticker()) {
                    return true;
                }
                try {
                    C78841Uwv.LJJIIJZLJL("", this.LJZI, new C1549066c(stickerItemModel, c68322mC, i));
                    float[] fArr = (float[]) c68322mC.element;
                    if (fArr == null) {
                        return false;
                    }
                    float f = fArr[0];
                    float f2 = LLILZ.width;
                    float f3 = fArr[3];
                    float f4 = LLILZ.height;
                    rectF2.set(f * f2, f3 * f4, fArr[2] * f2, fArr[1] * f4);
                    if (rectF2.top < rectF.top || rectF2.bottom > rectF.bottom) {
                        return true;
                    }
                } catch (VEException unused) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getInfoStickerBoundingBox error, index is ");
                    LIZ.append(stickerItemModel.getId());
                    LIZ.append(" veState is ");
                    LIZ.append(this.LJZI.getState().getValue());
                    H7B.LIZJ(X1D.LIZIZ(LIZ));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(final boolean r9, X.InterfaceC1549166d r10) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66Y.LJIIL(boolean, X.66d):void");
    }

    public final void LJIILIIL(boolean z, InterfaceC1549166d interfaceC1549166d) {
        AnonymousClass667 lT;
        int i;
        this.LJLJI.LIZ();
        this.LJLJI.LJIIIZ(true);
        if (z) {
            this.LJLJI.LJLLLL = 1;
        }
        LJIJI(!z);
        if (interfaceC1549166d != this.LLIL && interfaceC1549166d != null) {
            C66H c66h = this.LLJ;
            c66h.getClass();
            InterfaceC139535dl LLJJJ = c66h.LIZ.LLJJJ();
            if (LLJJJ != null && (lT = LLJJJ.lT()) != null) {
                float LJJII = interfaceC1549166d.LJJII(0);
                InterfaceC153045zY value = c66h.LIZ.getEditPreviewApi().Kh().getValue();
                if (value != null) {
                    i = value.getDuration();
                } else {
                    i = 0;
                }
                lT.LIZJ(LJJII, interfaceC1549166d.LJJJZ(i));
            }
        }
        LJIILLIIL(interfaceC1549166d);
        C1548765z c1548765z = this.LLIILZL;
        if (c1548765z != null) {
            c1548765z.LIZIZ(z, false);
        }
    }

    public final void LJIILL(InterfaceC1549166d interfaceC1549166d, int i) {
        C1548265u c1548265u;
        InterfaceC153045zY interfaceC153045zY;
        InterfaceC153045zY interfaceC153045zY2;
        InterfaceC153045zY interfaceC153045zY3;
        int i2;
        SafeHandler safeHandler;
        TextStickerData data;
        if (interfaceC1549166d == this.LLIL) {
            return;
        }
        if (interfaceC1549166d != null) {
            if ((interfaceC1549166d instanceof C67P) && (data = ((C67P) interfaceC1549166d).getData()) != null && data.getEndTime() != 0 && data.getUiEndTime() == 0) {
                data.setUiEndTime(data.getEndTime());
            }
            if (!this.LLILII.containsKey(interfaceC1549166d)) {
                this.LLILII.put(interfaceC1549166d, interfaceC1549166d.LJIJ());
            }
            interfaceC1549166d.setAlpha(true);
            if ((interfaceC1549166d instanceof C153075zb) && (safeHandler = this.LLI) != null && this.LJZI != null) {
                safeHandler.post(new RunnableC47136Iei(3, this));
            }
            if (this.LLFF && i == 0) {
                int LJJJJI = interfaceC1549166d.LJJJJI();
                InterfaceC153045zY interfaceC153045zY4 = this.LJZI;
                if (interfaceC153045zY4 != null) {
                    i2 = interfaceC1549166d.LJIIZILJ(interfaceC153045zY4.LLIZLLLIL());
                } else {
                    i2 = 0;
                }
                if (LJJJJI >= 0 && i2 >= 0 && !LJIJJLI(LJJJJI, i2, interfaceC1549166d)) {
                    this.LLI.postDelayed(new ARunnableS0S0202000_2(this, LJJJJI, i2, interfaceC1549166d, 2), 300L);
                }
                LJIJJ();
            }
            InterfaceC1549166d interfaceC1549166d2 = this.LLIL;
            if (interfaceC1549166d2 != null) {
                if (i != 0) {
                    if (i == 1 && this.LLF) {
                        interfaceC1549166d2.setAlpha(false);
                    }
                } else if (this.LLFF) {
                    interfaceC1549166d2.setAlpha(false);
                }
                if ((this.LLIL instanceof C153075zb) && (interfaceC153045zY3 = this.LJZI) != null) {
                    interfaceC153045zY3.LIZJ();
                }
            }
            if (i == 0) {
                LJIIJJI(interfaceC1549166d);
            } else if (i == 1 && (interfaceC153045zY2 = this.LJZI) != null) {
                this.LJLLLLLL.setProgress((int) (((this.LJZI.LJZL() - interfaceC1549166d.LJJII(0)) / (interfaceC1549166d.LJJJZ(interfaceC153045zY2.getDuration()) - interfaceC1549166d.LJJII(0))) * 100.0f));
            }
        } else {
            Iterator it = ((C0M9.b) this.LLILII.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                InterfaceC1549166d interfaceC1549166d3 = (InterfaceC1549166d) entry.getKey();
                InterfaceC137125Zs interfaceC137125Zs = (InterfaceC137125Zs) entry.getValue();
                if (interfaceC1549166d3 != null && interfaceC137125Zs != null && (c1548265u = this.LJLJI) != null) {
                    interfaceC1549166d3.LJJJJLI(interfaceC137125Zs, c1548265u.LJLJI, c1548265u.LJLJJI);
                    if (interfaceC137125Zs instanceof TextStickerData) {
                        TextStickerData textStickerData = (TextStickerData) interfaceC137125Zs;
                        if (textStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(textStickerData.getNleUuid()) && (interfaceC153045zY = this.LJZI) != null) {
                            C78841Uwv.LJJIIJZLJL("InfoStickerHelper#setTimeEditSelectedViewA", interfaceC153045zY, new AObjectS45S0101000_13(6, textStickerData, 0));
                        }
                    }
                }
            }
            this.LLILII.clear();
        }
        this.LLIL = interfaceC1549166d;
        LJIIZILJ();
    }

    public final void LJIIJ(final boolean z, C153075zb c153075zb, final boolean z2) {
        this.LLILL = z;
        if (!this.LLF) {
            this.LLF = true;
            this.LJLLLL.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
            this.LJLLL.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
            C16880lQ.LJIJI(this.LJLLL, new ACListenerS21S0101000_2(1, this, 12));
            C16880lQ.LJIJI(this.LJLLLL, new ACListenerS21S0101000_2(2, this, 13));
            LJ();
            this.LJLLLLLL.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.66Z
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    C66Y.this.getClass();
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i, boolean z3) {
                    InterfaceC1549166d interfaceC1549166d;
                    InterfaceC153045zY interfaceC153045zY;
                    long LJIIIIZZ;
                    if (z3) {
                        C66Y c66y = C66Y.this;
                        if (c66y.LLILL && (interfaceC1549166d = c66y.LLIL) != null && (interfaceC153045zY = c66y.LJZI) != null && c66y.LJLJLJ != null) {
                            int i2 = 0;
                            float LJJII = c66y.LLIL.LJJII(0) + (((interfaceC1549166d.LJJJZ(interfaceC153045zY.getDuration()) - c66y.LLIL.LJJII(0)) * i) / 100.0f);
                            MutableLiveData<C5MM> DM = c66y.LJZL.DM();
                            List<VideoSegment> kv0 = c66y.LJLJLJ.getVideoEditViewModel().kv0();
                            float nv0 = c66y.LJLJLJ.getVideoEditViewModel().nv0();
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
                }
            });
        } else {
            InterfaceC153045zY interfaceC153045zY = this.LJZI;
            if (interfaceC153045zY != null && this.LJLJLJ != null) {
                int LLIZLLLIL = interfaceC153045zY.LLIZLLLIL();
                this.LJLJLJ.setMinVideoLength(1000L);
                this.LJLJLJ.setMaxVideoLength(LLIZLLLIL);
                this.LJLJLJ.LJJI(LLIZLLLIL);
                this.LJLJLJ.LJJIJL();
                this.LJLLILLLL.LJLLJ = LLIZLLLIL;
            }
        }
        LJIJI(!z);
        LJIILL(c153075zb, 1);
        View view = this.LJLLJ;
        if (view != null) {
            this.LLIIIL = view.getHeight();
        }
        if (this.LLIIIL == 0) {
            this.LLIIIL = (int) KL2.LIZJ(this.LJLIL, 120.0f);
        }
        if (this.LJZI != null) {
            this.LJLLLLLL.setProgress((int) ((r0.LJZL() * 100.0f) / this.LJZI.getDuration()));
        }
        View view2 = this.LJLLJ;
        C170696mv.LIZJ(view2, z, this.LLIIIL, view2, new InterfaceC15040iS() { // from class: X.66V
            /* JADX WARN: Type inference failed for: r0v13, types: [X.4Xm] */
            @Override // X.InterfaceC15040iS
            public final void accept(Object obj) {
                int i;
                C66T c66t;
                DialogC111064Xm dialogC111064Xm;
                C66Y c66y = C66Y.this;
                boolean z3 = z;
                boolean z4 = z2;
                c66y.getClass();
                boolean z5 = !z3;
                C1548265u c1548265u = c66y.LJLJI;
                if (c1548265u != null) {
                    if (z5) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    c1548265u.setVisibility(i);
                    if (z5) {
                        c66y.LJLJI.LIZ();
                    }
                    if (z3) {
                        c66y.LJLJI.LJLLLL = 1;
                        InterfaceC153045zY interfaceC153045zY2 = c66y.LJZI;
                        if (interfaceC153045zY2 != null) {
                            interfaceC153045zY2.LLJILJIL(true);
                            return;
                        }
                        return;
                    }
                    c66y.LJLJI.LJLLLL = 0;
                    if (z4 && (c66t = c66y.LLILLIZIL) != null) {
                        ActivityC45651qj activityC45651qj = c66y.LJLIL;
                        if (activityC45651qj != null) {
                            if (c66t.LJIIIZ == null) {
                                c66t.LJIIIZ = new Dialog(activityC45651qj) { // from class: X.4Xm
                                    public C8IC LJLIL;

                                    @Override // android.app.Dialog
                                    public final void onBackPressed() {
                                    }

                                    @Override // android.app.Dialog
                                    public final void show() {
                                        C8IC c8ic = this.LJLIL;
                                        if (c8ic != null) {
                                            c8ic.setVisibility(0);
                                        }
                                        if (new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "889746840313483321")).LIZ) {
                                            return;
                                        }
                                        super.show();
                                    }

                                    @Override // android.app.Dialog
                                    public final void onCreate(Bundle bundle) {
                                        super.onCreate(bundle);
                                        setContentView(R.layout.bna);
                                        C8IC c8ic = (C8IC) findViewById(R.id.hq6);
                                        this.LJLIL = c8ic;
                                        if (c8ic != null) {
                                            c8ic.setMessage(R.string.e3n);
                                        }
                                        C8IC c8ic2 = this.LJLIL;
                                        if (c8ic2 != null) {
                                            c8ic2.setVisibility(0);
                                        }
                                        setCanceledOnTouchOutside(false);
                                    }
                                };
                            }
                            DialogC111064Xm dialogC111064Xm2 = c66t.LJIIIZ;
                            if ((dialogC111064Xm2 == null || !dialogC111064Xm2.isShowing()) && (dialogC111064Xm = c66t.LJIIIZ) != null && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/shortvideo/edit/infosticker/StickerPinTUXLoading", "show", dialogC111064Xm, new Object[0], "void", new C65300Pk0(false, "()V", "3734697255619963021")).LIZ) {
                                dialogC111064Xm.show();
                            }
                        }
                        final C66T c66t2 = c66y.LLILLIZIL;
                        c66t2.getClass();
                        AVServiceImpl.LIZ().fetchResourcesNeededByRequirements(new String[]{"objectTracking"}, new IFoundationAVService.IFetchResourcesListener() { // from class: X.66W
                            @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                            public final void onFailed(Exception exc) {
                                C1548265u c1548265u2;
                                C66I c66i = C66T.this.LJI;
                                if (c66i != null && (c1548265u2 = c66i.LIZ.LJLJI) != null) {
                                    c1548265u2.post(new ARunnableS8S0110000_2(c66i, 7));
                                }
                            }

                            @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                            public final void onSuccess(String[] requirements) {
                                o.LJIIIZ(requirements, "requirements");
                                C10K.LIZIZ(new ACallableS105S0100000_2(C66T.this, 35), C10K.LJIIIIZZ, null).LJ(new AgS120S0100000_2(C66T.this, 33), C10K.LJI, null);
                            }
                        });
                        return;
                    }
                    InterfaceC153045zY interfaceC153045zY3 = c66y.LJZI;
                    if (interfaceC153045zY3 != null) {
                        interfaceC153045zY3.LLJILJIL(true);
                    }
                    c66y.LJZL.DM().setValue(C5MM.LIZ());
                }
            }
        });
        C1548765z c1548765z = this.LLIILZL;
        if (c1548765z != null) {
            c1548765z.LIZIZ(z, true);
        }
        if (z) {
            MutableLiveData<C140335f3> gv0 = this.LJZL.gv0();
            int LIZIZ = C78885Uxd.LIZIZ(true, false, false, false);
            int i = this.LLIIIL;
            int LIZIZ2 = (C81184Vtc.LIZIZ(this.LJLIL) - this.LLIIIL) - C81184Vtc.LIZJ(this.LJLIL);
            AnonymousClass668.LIZIZ().LIZ();
            gv0.setValue(C140345f4.LIZIZ(LIZIZ, 0, i, LIZIZ2, true, z2, 512));
            ImageView imageView = this.LJLLI;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(R.drawable.a9w));
            this.LJLLI.setEnabled(true);
            return;
        }
        this.LJLLI.setEnabled(false);
        this.LLI.removeCallbacks(this.LLIIL);
        this.LJZL.DM().setValue(C5MM.LIZJ());
        if (this.LJLJI != null) {
            MutableLiveData<C140335f3> gv02 = this.LJZL.gv0();
            int color = this.LJLJI.getResources().getColor(R.color.b5);
            int LJFF = C81184Vtc.LJFF(this.LJLIL);
            int i2 = this.LLIIIL;
            int LIZIZ3 = (C81184Vtc.LIZIZ(this.LJLIL) - this.LLIIIL) - C81184Vtc.LIZJ(this.LJLIL);
            AnonymousClass668.LIZIZ().LIZ();
            C140335f3 c140335f3 = new C140335f3(0, color);
            c140335f3.LIZ = LJFF;
            c140335f3.LIZIZ = i2;
            c140335f3.LIZJ = LIZIZ3;
            c140335f3.LIZLLL = z2;
            c140335f3.LJ = true;
            gv02.setValue(c140335f3);
        }
        this.LLFZ = false;
    }

    public final boolean LJIJJLI(int i, int i2, InterfaceC1549166d interfaceC1549166d) {
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJLJLJ;
        if (viewOnTouchListenerC82857WfV == null) {
            return false;
        }
        boolean LJJIJLIJ = viewOnTouchListenerC82857WfV.LJJIJLIJ(i, i2, true);
        LJIIZILJ();
        if (LJJIJLIJ && interfaceC1549166d != null) {
            this.LJLLILLLL.LJLJI.setValue(Long.valueOf(interfaceC1549166d.LJJII(0)));
            this.LJZL.DM().setValue(C5MM.LIZLLL(interfaceC1549166d.LJJII(0)));
        }
        return LJJIJLIJ;
    }

    public C66Y(InterfaceC143655kP interfaceC143655kP, CreativeInfo creativeInfo, C82622Wbi c82622Wbi, VideoPublishEditModel videoPublishEditModel) {
        this.LLIZLLLIL = false;
        this.LLILLL = interfaceC143655kP;
        this.LLILZIL = creativeInfo;
        this.LLILZLL = c82622Wbi;
        this.LLIZLLLIL = C42000Ge4.LJIILIIL(videoPublishEditModel);
    }

    public final void LJIL(int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        C1548265u c1548265u;
        LJIJJ();
        if (this.LLIL == null) {
            return;
        }
        InterfaceC153045zY interfaceC153045zY = this.LJZI;
        if (interfaceC153045zY != null) {
            i3 = interfaceC153045zY.LLFZ(i);
            i4 = this.LJZI.LLFZ(i2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if (LJFF() && (c1548265u = this.LJLJI) != null) {
            C153075zb c153075zb = (C153075zb) this.LLIL;
            C153065za c153065za = c1548265u.LJLJLJ;
            if (c153065za != null) {
                c153065za.LJIJI(c153075zb, i3, i4);
                return;
            }
            return;
        }
        InterfaceC1549166d interfaceC1549166d = this.LLIL;
        if (interfaceC1549166d instanceof C67P) {
            TextStickerData data = ((C67P) interfaceC1549166d).getData();
            if (data == null) {
                return;
            }
            data.setStartTime(i3);
            data.setEndTime(i4);
            data.setUiStartTime(i);
            data.setUiEndTime(i2);
            if (z) {
                LJIIZILJ();
            }
            if (!z2 || !data.getHasReadTextAudio() || this.LJZI == null || TextUtils.isEmpty(data.getNleUuid())) {
                return;
            }
            C78841Uwv.LJJIIJZLJL("InfoStickerHelper#updateWhenSelectChangeA", this.LJZI, new AObjectS41S0101000_2(i3, data, 2));
            return;
        }
        if (interfaceC1549166d instanceof C156086Aq) {
            CommentVideoModel data2 = ((C156086Aq) interfaceC1549166d).getData();
            if (data2 == null) {
                return;
            }
            data2.setStartTime(i3);
            data2.setEndTime(i4);
            return;
        }
        if (interfaceC1549166d instanceof InterfaceC1549466g) {
            ((InterfaceC1549466g) interfaceC1549166d).LIZ();
            ((InterfaceC1549466g) this.LLIL).LIZJ();
        } else if (interfaceC1549166d instanceof InterfaceC1549266e) {
            ((InterfaceC1549266e) interfaceC1549166d).setStartTime(i3);
            ((InterfaceC1549266e) this.LLIL).setEndTime(i4);
        } else {
            if (!(interfaceC1549166d instanceof InterfaceC1549366f)) {
                return;
            }
            ((InterfaceC1549366f) interfaceC1549166d).setStartTime(i3);
            ((InterfaceC1549366f) this.LLIL).setEndTime(i4);
        }
    }
}
