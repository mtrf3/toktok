package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import X.AbstractC55114Lk6;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C145995oB;
import X.C162656Zx;
import X.C16880lQ;
import X.C170576mj;
import X.C170736mz;
import X.C221108m2;
import X.C29S;
import X.C2U8;
import X.C3C5;
import X.C43198GxO;
import X.C43201GxR;
import X.C43203GxT;
import X.C43205GxV;
import X.C43206GxW;
import X.C43213Gxd;
import X.C43221Gxl;
import X.C43222Gxm;
import X.C44423Hc3;
import X.C47261Igj;
import X.C5S1;
import X.C60903NvH;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C68452mP;
import X.C73098SmU;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C780334l;
import X.C80795VnL;
import X.C90903hW;
import X.FMX;
import X.GPO;
import X.HandlerC43202GxS;
import X.InterfaceC43207GxX;
import X.KUP;
import X.QD3;
import X.XKX;
import Y.ACListenerS27S0100000_7;
import Y.AObserverS75S0100000_7;
import Y.IDiS269S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftOptionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes8.dex */
public final class KidsDraftVideoFeedFragment extends Fragment implements InterfaceC43207GxX {
    public static AwemeDraft LJLLILLLL;
    public VideoPublishEditModel LJLIL;
    public AwemeDraft LJLILLLLZI;
    public C43213Gxd LJLJJL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public int LJLJI = 1;
    public boolean LJLJJI = true;
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 328));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(GPO.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 721));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 326));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 327));

    @Override // X.InterfaceC43207GxX
    public final void LJLIIIL() {
        xl(false);
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC43207GxX
    public final void p0() {
        String str;
        C43213Gxd c43213Gxd = this.LJLJJL;
        String str2 = null;
        if (c43213Gxd != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            VideoPublishEditModel videoPublishEditModel = this.LJLIL;
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            C162656Zx previewSurface = (C162656Zx) _$_findCachedViewById(R.id.i1m);
            o.LJIIIIZZ(previewSurface, "previewSurface");
            c43213Gxd.LIZIZ(mo49getActivity, videoPublishEditModel, viewLifecycleOwner, previewSurface);
            C145995oB c145995oB = new C145995oB();
            C44423Hc3 LJ = C73098SmU.LJ();
            if (LJ != null) {
                str = LJ.getUid();
            } else {
                str = null;
            }
            c145995oB.LJI("author_id", str);
            AwemeDraft awemeDraft = this.LJLILLLLZI;
            if (awemeDraft != null) {
                str2 = awemeDraft.LIZ();
            }
            c145995oB.LJI("group_id", str2);
            FMX.LJIIL("download_retry", c145995oB.LIZ);
            return;
        }
        o.LJIJI("downloadHelper");
        throw null;
    }

    public final C43221Gxl vl() {
        return (C43221Gxl) this.LJLJJLL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C43221Gxl vl = vl();
        for (Map.Entry entry : ((LinkedHashMap) vl.LJLJL).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            entry.getValue();
            C43222Gxm c43222Gxm = (C43222Gxm) ((LinkedHashMap) vl.LJLJL).get(Integer.valueOf(intValue));
            if (c43222Gxm != null) {
                c43222Gxm.LIZ().LIZIZ();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C43201GxR.LIZ();
        C2U8.LIZ(new C43205GxV());
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
        C43198GxO.LJLL.remove(this);
        C43213Gxd.LIZLLL = true;
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C43222Gxm LJJIII = vl().LJJIII(this.LJLJI - 1);
        if (LJJIII != null) {
            LJJIII.LIZJ(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C43222Gxm LJJIII = vl().LJJIII(this.LJLJI - 1);
        if (LJJIII != null) {
            LJJIII.LIZJ(true);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void handleDownloadVideoStatus(C43203GxT event) {
        boolean z;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        o.LJIIIZ(event, "event");
        C43206GxW c43206GxW = event.LJLIL;
        if (c43206GxW != null && C43206GxW.LIZIZ == 3) {
            z = true;
        } else {
            z = false;
        }
        xl(!z);
        String str7 = null;
        if (c43206GxW != null) {
            num = Integer.valueOf(C43206GxW.LIZIZ);
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                C43198GxO c43198GxO = (C43198GxO) _$_findCachedViewById(R.id.cg_);
                c43198GxO.getClass();
                HandlerC43202GxS handlerC43202GxS = C43198GxO.LJLLI;
                if (handlerC43202GxS.hasMessages(1)) {
                    handlerC43202GxS.removeMessages(1);
                }
                if (handlerC43202GxS.hasMessages(2)) {
                    handlerC43202GxS.removeMessages(2);
                }
                c43198GxO.LIZJ();
                C43198GxO.LJLLILLLL = 0;
                ImageView imageView = c43198GxO.LJLILLLLZI;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    TextView textView = c43198GxO.LJLJI;
                    if (textView != null) {
                        textView.setVisibility(8);
                        c43198GxO.getMDownloadFailedTextView().setVisibility(8);
                        c43198GxO.getMDownloadProgressViewRoot().setBackgroundColor(ColorProtector.parseColor("#383838"));
                        c43198GxO.getMDownloadProgressViewRoot().setVisibility(0);
                        TextView textView2 = c43198GxO.LJLJJI;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            TextView textView3 = c43198GxO.LJLJJL;
                            if (textView3 != null) {
                                textView3.setVisibility(0);
                                TextView textView4 = c43198GxO.LJLJL;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                    c43198GxO.getMDownloadProgressViewRoot().requestLayout();
                                    c43206GxW.getClass();
                                    VideoPublishEditModel videoPublishEditModel = C43206GxW.LIZLLL;
                                    if (videoPublishEditModel != null) {
                                        str2 = videoPublishEditModel.getCreationId();
                                    } else {
                                        str2 = null;
                                    }
                                    VideoPublishEditModel videoPublishEditModel2 = this.LJLIL;
                                    if (videoPublishEditModel2 != null) {
                                        str7 = videoPublishEditModel2.getCreationId();
                                    }
                                    xl(o.LJ(str2, str7));
                                    C145995oB c145995oB = new C145995oB();
                                    c145995oB.LIZIZ(System.currentTimeMillis(), "start_download");
                                    FMX.LJIIL("download_start", c145995oB.LIZ);
                                    return;
                                }
                                o.LJIJI("mDownloadVideoCancelView");
                                throw null;
                            }
                            o.LJIJI("mDownloadingStatusTextView");
                            throw null;
                        }
                        o.LJIJI("mDownloadProgressView");
                        throw null;
                    }
                    o.LJIJI("mDownloadSuccessTextView");
                    throw null;
                }
                o.LJIJI("mDownloadSuccessImageView");
                throw null;
            }
            if (num.intValue() == 2) {
                c43206GxW.getClass();
                VideoPublishEditModel videoPublishEditModel3 = C43206GxW.LIZLLL;
                if (videoPublishEditModel3 != null) {
                    str = videoPublishEditModel3.getCreationId();
                } else {
                    str = null;
                }
                VideoPublishEditModel videoPublishEditModel4 = this.LJLIL;
                if (videoPublishEditModel4 != null) {
                    str7 = videoPublishEditModel4.getCreationId();
                }
                if (o.LJ(str, str7)) {
                    ((C43198GxO) _$_findCachedViewById(R.id.cg_)).LIZLLL(C43206GxW.LIZJ);
                    return;
                } else {
                    xl(false);
                    return;
                }
            }
            if (num.intValue() == 3) {
                C43213Gxd c43213Gxd = this.LJLJJL;
                if (c43213Gxd != null) {
                    c43213Gxd.LIZ = true;
                    return;
                } else {
                    o.LJIJI("downloadHelper");
                    throw null;
                }
            }
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 4) {
            c43206GxW.getClass();
            VideoPublishEditModel videoPublishEditModel5 = C43206GxW.LIZLLL;
            if (videoPublishEditModel5 != null) {
                str4 = videoPublishEditModel5.getCreationId();
            } else {
                str4 = null;
            }
            VideoPublishEditModel videoPublishEditModel6 = this.LJLIL;
            if (videoPublishEditModel6 != null) {
                str5 = videoPublishEditModel6.getCreationId();
            } else {
                str5 = null;
            }
            if (o.LJ(str4, str5)) {
                ((C43198GxO) _$_findCachedViewById(R.id.cg_)).LIZIZ();
                xl(true);
            } else {
                xl(false);
                C5S1 c5s1 = new C5S1(getContext());
                c5s1.LIZJ(R.string.ho1);
                c5s1.LIZ(R.raw.icon_tick_fill_small);
                c5s1.LIZIZ(R.attr.e8);
                c5s1.LJ();
            }
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LIZIZ(System.currentTimeMillis(), "end_download");
            C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
            if (currentUser != null) {
                str6 = currentUser.getUid();
            } else {
                str6 = null;
            }
            c145995oB2.LJI("author_id", str6);
            if (videoPublishEditModel5 != null) {
                str7 = videoPublishEditModel5.getCreationId();
            }
            c145995oB2.LJI("group_id", str7);
            c145995oB2.LIZ(1, "is_self_video");
            FMX.LJIIL("download_end", c145995oB2.LIZ);
            return;
        }
        if (num.intValue() != 5) {
            return;
        }
        ((C43198GxO) _$_findCachedViewById(R.id.cg_)).LIZ();
        xl(true);
        C145995oB c145995oB3 = new C145995oB();
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            str3 = LJ.getUid();
        } else {
            str3 = null;
        }
        c145995oB3.LJI("author_id", str3);
        AwemeDraft awemeDraft = this.LJLILLLLZI;
        if (awemeDraft != null) {
            str7 = awemeDraft.LIZ();
        }
        c145995oB3.LJI("group_id", str7);
        FMX.LJIIL("download_fail", c145995oB3.LIZ);
    }

    public final void xl(boolean z) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        if (_$_findCachedViewById(R.id.cg_) != null) {
            if (z) {
                _$_findCachedViewById(R.id.cg_).setVisibility(0);
                if (_$_findCachedViewById(R.id.d7c) != null) {
                    _$_findCachedViewById(R.id.d7c).setVisibility(0);
                    C43222Gxm LJJIII = vl().LJJIII(this.LJLJI - 1);
                    if (LJJIII != null && (frameLayout2 = LJJIII.LJIJJ) != null) {
                        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = (int) C170576mj.LIZ(getContext(), 37.0f);
                        }
                        if (frameLayout2 == null) {
                            return;
                        }
                        frameLayout2.setLayoutParams(layoutParams);
                        frameLayout2.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            _$_findCachedViewById(R.id.cg_).setVisibility(8);
            if (_$_findCachedViewById(R.id.d7c) == null) {
                return;
            }
            _$_findCachedViewById(R.id.d7c).setVisibility(8);
            C43222Gxm LJJIII2 = vl().LJJIII(this.LJLJI - 1);
            if (LJJIII2 == null || (frameLayout = LJJIII2.LJIJJ) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = 0;
            }
            if (frameLayout == null) {
                return;
            }
            frameLayout.setLayoutParams(layoutParams2);
            frameLayout.requestLayout();
        }
    }

    public static int wl(VideoPublishEditModel videoPublishEditModel, List list) {
        if (videoPublishEditModel == null) {
            return 0;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (o.LJ(videoPublishEditModel.getCreationId(), ((BaseShortVideoContext) obj).getCreationId())) {
                    return i;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((C73305Spp) _$_findCachedViewById(R.id.g84)).setStatus(new C73306Spq());
        ((C73305Spp) _$_findCachedViewById(R.id.g84)).LJFF();
        C16880lQ.LJJJZ((C170736mz) _$_findCachedViewById(R.id.aej), new ACListenerS27S0100000_7(this, 61));
        C43198GxO.LJLL.add(this);
        ((C43198GxO) _$_findCachedViewById(R.id.cg_)).setVideoDownloadClickListener(this);
        ((C80795VnL) _$_findCachedViewById(R.id.d71)).setAdapter(vl());
        _$_findCachedViewById(R.id.d71).setVisibility(8);
        ((AbstractC55114Lk6) _$_findCachedViewById(R.id.d71)).LJI(new IDiS269S0100000_7(this, 3));
        KUP kup = (KUP) _$_findCachedViewById(R.id.g99);
        kup.LJLILLLLZI = (C80795VnL) _$_findCachedViewById(R.id.d71);
        kup.LJLJI = null;
        KidsDraftFeedViewModel kidsDraftFeedViewModel = (KidsDraftFeedViewModel) this.LJLJLJ.getValue();
        kidsDraftFeedViewModel.getClass();
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C68452mP(kidsDraftFeedViewModel, null), 3);
        kidsDraftFeedViewModel.getClass();
        ((KidsDraftOptionViewModel) this.LJLJLLL.getValue()).LJLIL.observe(getViewLifecycleOwner(), new AObserverS75S0100000_7(this, 1));
        ((KidsDraftFeedViewModel) this.LJLJLJ.getValue()).LJLILLLLZI.observe(getViewLifecycleOwner(), new AObserverS75S0100000_7(this, 2));
        ((KidsDraftFeedViewModel) this.LJLJLJ.getValue()).LJLJI.observe(getViewLifecycleOwner(), new AObserverS75S0100000_7(this, 3));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LJI(R.color.b5);
        LIZIZ.LIZIZ.LJIIJ(false);
        LIZIZ.LIZJ();
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
        C43213Gxd.LIZLLL = false;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bgj, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
