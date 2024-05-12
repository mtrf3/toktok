package com.ss.android.ugc.aweme.ftc.pages;

import X.ActivityC45651qj;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C157336Fl;
import X.C162696a1;
import X.C16880lQ;
import X.C29S;
import X.C39579Fg7;
import X.C3C5;
import X.C43679HCh;
import X.C46104I7o;
import X.C48841JEv;
import X.C60903NvH;
import X.C65661Ppp;
import X.C65892iH;
import X.C76800UCe;
import X.C78996UzQ;
import X.C79146V4k;
import X.C84488XDw;
import X.C84673XKz;
import X.C8HI;
import X.C90903hW;
import X.DialogC254009y0;
import X.EXT;
import X.G8O;
import X.GI3;
import X.H78;
import X.H7R;
import X.InterfaceC84498XEg;
import X.P5A;
import X.ProgressDialogC164766dM;
import X.X1D;
import X.XKX;
import Y.AgS120S0100000_2;
import Y.IDCListenerS371S0100000_2;
import Y.IDObjectS175S0100000_2;
import Y.IDTListenerS112S0100000_2;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import djb.IDaS67S0100000_2;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import v5.n;

/* loaded from: classes3.dex */
public final class FTCVideoPublishFragment extends Fragment {
    public VideoPublishEditModel LJLIL;
    public ProgressDialogC164766dM LJLILLLLZI;
    public Bitmap LJLJJL;
    public DialogC254009y0 LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final AtomicInteger LJLJI = new AtomicInteger(0);
    public final int LJLJJI = 150;
    public final IDObjectS175S0100000_2 LJLJJLL = new IDObjectS175S0100000_2(this, 3);
    public final IDTListenerS112S0100000_2 LJLJL = new IDTListenerS112S0100000_2(this, 4);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    public FTCVideoPublishFragment() {
        C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
        C48841JEv.LIZ(EXT.LIZ.plus(LJIILIIL).plus(new IDaS67S0100000_2(CoroutineExceptionHandler.LJJJJIZL, this, 0)));
    }

    public final void LJIJ() {
        DialogC254009y0 dialogC254009y0;
        DialogC254009y0 dialogC254009y02 = this.LJLJLJ;
        if (dialogC254009y02 != null && dialogC254009y02.isShowing() && (dialogC254009y0 = this.LJLJLJ) != null) {
            dialogC254009y0.dismiss();
        }
    }

    public final void wl() {
        boolean z;
        int i;
        VideoPublishEditModel videoPublishEditModel = this.LJLIL;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.isMvThemeVideoType()) {
                VideoPublishEditModel videoPublishEditModel2 = this.LJLIL;
                if (videoPublishEditModel2 != null) {
                    String str = videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath;
                    if (C39579Fg7.LIZIZ(str)) {
                        XKX.LIZLLL(C48841JEv.LIZ(EXT.LIZ), null, null, new C65892iH(this, str, null), 3);
                        return;
                    }
                    return;
                }
                o.LJIJI("mModel");
                throw null;
            }
            VideoPublishEditModel videoPublishEditModel3 = this.LJLIL;
            if (videoPublishEditModel3 != null) {
                if (videoPublishEditModel3.isMultiVideoEdit()) {
                    VideoPublishEditModel videoPublishEditModel4 = this.LJLIL;
                    if (videoPublishEditModel4 != null) {
                        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel4.getCurMultiEditVideoRecordData();
                        o.LJIIIIZZ(curMultiEditVideoRecordData, "mModel.curMultiEditVideoRecordData");
                        VERecordData LJIIJJI = C46104I7o.LJIIJJI(curMultiEditVideoRecordData);
                        VideoPublishEditModel videoPublishEditModel5 = this.LJLIL;
                        if (videoPublishEditModel5 != null) {
                            Pair<Integer, Integer> playInOutTime = videoPublishEditModel5.getCurMultiEditVideoRecordData().getPlayInOutTime();
                            LJIIJJI.setTimeRange(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
                            VideoPublishEditModel videoPublishEditModel6 = this.LJLIL;
                            if (videoPublishEditModel6 != null) {
                                int i2 = (int) (videoPublishEditModel6.mVideoCoverStartTm * 1000);
                                if (videoPublishEditModel6.isUseTimeReverseEffect()) {
                                    int intValue = ((Number) playInOutTime.second).intValue();
                                    Object obj = playInOutTime.first;
                                    o.LJIIIIZZ(obj, "playPair.first");
                                    i = (intValue - ((Number) obj).intValue()) - i2;
                                } else {
                                    i = i2;
                                }
                                VideoPublishEditModel videoPublishEditModel7 = this.LJLIL;
                                if (videoPublishEditModel7 != null) {
                                    int videoWidth = videoPublishEditModel7.videoWidth();
                                    VideoPublishEditModel videoPublishEditModel8 = this.LJLIL;
                                    if (videoPublishEditModel8 != null) {
                                        VEUtils.getVideoThumb(LJIIJJI, i, videoWidth, videoPublishEditModel8.videoHeight(), false, new P5A() { // from class: X.6Yz
                                            @Override // X.P5A
                                            public final boolean processFrame(ByteBuffer frame, int i3, int i4, int i5) {
                                                o.LJIIIZ(frame, "frame");
                                                Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                                                createBitmap.copyPixelsFromBuffer(frame.position(0));
                                                VideoPublishEditModel videoPublishEditModel9 = FTCVideoPublishFragment.this.LJLIL;
                                                if (videoPublishEditModel9 != null) {
                                                    Bitmap LIZJ = OUR.LIZJ(videoPublishEditModel9, createBitmap);
                                                    C1M5 c1m5 = new C1M5(FTCVideoPublishFragment.this.getResources(), LIZJ);
                                                    c1m5.LIZJ(KL2.LIZJ(FTCVideoPublishFragment.this.getContext(), 4.0f));
                                                    ((ImageView) FTCVideoPublishFragment.this._$_findCachedViewById(R.id.ew8)).setImageDrawable(c1m5);
                                                    VideoPublishEditModel videoPublishEditModel10 = FTCVideoPublishFragment.this.LJLIL;
                                                    if (videoPublishEditModel10 != null) {
                                                        if (TextUtils.isEmpty(videoPublishEditModel10.multiEditVideoRecordData.coverImagePath)) {
                                                            VideoPublishEditModel videoPublishEditModel11 = FTCVideoPublishFragment.this.LJLIL;
                                                            if (videoPublishEditModel11 != null) {
                                                                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel11.multiEditVideoRecordData;
                                                                CreativeInfo creativeInfo = videoPublishEditModel11.creativeInfo;
                                                                o.LJIIIIZZ(creativeInfo, "mModel.creativeInfo");
                                                                multiEditVideoStatusRecordData.coverImagePath = C6BI.LIZJ(creativeInfo);
                                                            } else {
                                                                o.LJIJI("mModel");
                                                                throw null;
                                                            }
                                                        }
                                                        VideoPublishEditModel videoPublishEditModel12 = FTCVideoPublishFragment.this.LJLIL;
                                                        if (videoPublishEditModel12 != null) {
                                                            String str2 = videoPublishEditModel12.multiEditVideoRecordData.coverImagePath;
                                                            o.LJIIIIZZ(str2, "mModel.multiEditVideoRecordData.coverImagePath");
                                                            C6BI.LIZLLL(LIZJ, str2, null);
                                                            return false;
                                                        }
                                                        o.LJIJI("mModel");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mModel");
                                                    throw null;
                                                }
                                                o.LJIJI("mModel");
                                                throw null;
                                            }
                                        });
                                        return;
                                    } else {
                                        o.LJIJI("mModel");
                                        throw null;
                                    }
                                }
                                o.LJIJI("mModel");
                                throw null;
                            }
                            o.LJIJI("mModel");
                            throw null;
                        }
                        o.LJIJI("mModel");
                        throw null;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                ArrayList arrayList = new ArrayList();
                VideoPublishEditModel videoPublishEditModel9 = this.LJLIL;
                if (videoPublishEditModel9 != null) {
                    if (videoPublishEditModel9.getEffectList() != null) {
                        VideoPublishEditModel videoPublishEditModel10 = this.LJLIL;
                        if (videoPublishEditModel10 != null) {
                            arrayList.addAll(videoPublishEditModel10.getEffectList());
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    }
                    VideoPublishEditModel videoPublishEditModel11 = this.LJLIL;
                    if (videoPublishEditModel11 != null) {
                        EffectPointModel timeEffect = videoPublishEditModel11.getTimeEffect();
                        if (timeEffect != null) {
                            arrayList.add(timeEffect);
                            z = o.LJ(timeEffect.getKey(), "1");
                        } else {
                            z = false;
                        }
                        VideoPublishEditModel videoPublishEditModel12 = this.LJLIL;
                        if (videoPublishEditModel12 != null) {
                            String filterFolder = H7R.LIZLLL(videoPublishEditModel12, C60903NvH.LJIIJJI().LJIILL().LJI()).getFilterFolder();
                            VideoPublishEditModel videoPublishEditModel13 = this.LJLIL;
                            if (videoPublishEditModel13 != null) {
                                float f = videoPublishEditModel13.mSelectedFilterIntensity;
                                int i3 = (int) (videoPublishEditModel13.mVideoCoverStartTm * 1000);
                                EditPreviewInfo previewInfo = videoPublishEditModel13.getPreviewInfo();
                                VideoPublishEditModel videoPublishEditModel14 = this.LJLIL;
                                if (videoPublishEditModel14 != null) {
                                    C43679HCh.LIZ(arrayList, filterFolder, f, i3, z, previewInfo, videoPublishEditModel14.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() { // from class: X.6Z0
                                        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                                        public final void onGetVideoCoverFailed(int i4) {
                                            C5S1 c5s1 = new C5S1(C44172HVg.LIZ);
                                            c5s1.LIZJ(R.string.jei);
                                            c5s1.LJ();
                                        }

                                        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                                        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                                            o.LJIIIZ(bitmap, "bitmap");
                                            if (FTCVideoPublishFragment.this._$_findCachedViewById(R.id.ew8) != null && FTCVideoPublishFragment.this.getContext() != null) {
                                                VideoPublishEditModel videoPublishEditModel15 = FTCVideoPublishFragment.this.LJLIL;
                                                if (videoPublishEditModel15 != null) {
                                                    Bitmap LIZJ = OUR.LIZJ(videoPublishEditModel15, bitmap);
                                                    C1M5 c1m5 = new C1M5(FTCVideoPublishFragment.this.getResources(), LIZJ);
                                                    c1m5.LIZJ(KL2.LIZJ(C44172HVg.LIZ, 4.0f));
                                                    ((ImageView) FTCVideoPublishFragment.this._$_findCachedViewById(R.id.ew8)).setImageDrawable(c1m5);
                                                    FTCVideoPublishFragment fTCVideoPublishFragment = FTCVideoPublishFragment.this;
                                                    fTCVideoPublishFragment.LJLJJL = LIZJ;
                                                    VideoPublishEditModel videoPublishEditModel16 = fTCVideoPublishFragment.LJLIL;
                                                    if (videoPublishEditModel16 != null) {
                                                        C43679HCh.LIZIZ(LIZJ, null, videoPublishEditModel16.getVideoCoverPath());
                                                        return;
                                                    } else {
                                                        o.LJIJI("mModel");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("mModel");
                                                throw null;
                                            }
                                        }
                                    });
                                    return;
                                } else {
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                            }
                            o.LJIJI("mModel");
                            throw null;
                        }
                        o.LJIJI("mModel");
                        throw null;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        vl(null, getView());
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    public static void vl(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view) {
        if (!(view instanceof EditText)) {
            o.LJI(view);
            view.setOnTouchListener(iDTListenerS112S0100000_2);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                vl(iDTListenerS112S0100000_2, viewGroup.getChildAt(i));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        VideoPublishEditModel videoPublishEditModel;
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getWindow().setSharedElementReenterTransition(new AutoTransition());
        requireActivity().getWindow().setSharedElementExitTransition(new AutoTransition());
        vl(this.LJLJL, view);
        Bundle arguments = getArguments();
        if (arguments == null || (videoPublishEditModel = (VideoPublishEditModel) arguments.getSerializable("args")) == null) {
            return;
        }
        this.LJLIL = videoPublishEditModel;
        if (!videoPublishEditModel.isPreviewInfoValid()) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                GI3.LJII(new G8O(mo49getActivity, null));
            }
            H78.LIZJ("VideoPublishPage finish because of null EditPreviewInfo");
            return;
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LJLIL;
        if (videoPublishEditModel2 != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                z = arguments2.getBoolean("fromDraft", false);
            } else {
                z = false;
            }
            videoPublishEditModel2.mIsFromDraft = z;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.getInt("extra_stick_point_type", 0);
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                arguments4.getBoolean("enter_record_from_other_platform", false);
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                arguments5.getBoolean("edit_publish_session_end_together", false);
            }
            Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
            if (LIZLLL != null) {
                ((TextView) _$_findCachedViewById(R.id.lvp)).setTypeface(LIZLLL);
            }
            VideoPublishEditModel videoPublishEditModel3 = this.LJLIL;
            if (videoPublishEditModel3 != null) {
                String str = videoPublishEditModel3.title;
                if (str != null && str.length() != 0) {
                    ((TextView) _$_findCachedViewById(R.id.czk)).setText(str);
                }
                _$_findCachedViewById(R.id.czk).setOnFocusChangeListener(new IDCListenerS371S0100000_2(this, 0));
                TextView textView = (TextView) _$_findCachedViewById(R.id.czk);
                final int i = this.LJLJJI;
                textView.setFilters(new C157336Fl[]{new InputFilter(i) { // from class: X.6Fl
                    public final int LJLIL;

                    {
                        this.LJLIL = i;
                    }

                    @Override // android.text.InputFilter
                    public final CharSequence filter(CharSequence source, int i2, int i3, Spanned dest, int i4, int i5) {
                        o.LJIIIZ(source, "source");
                        o.LJIIIZ(dest, "dest");
                        int length = this.LJLIL - (dest.length() - (i5 - i4));
                        if (length <= 0) {
                            if (TextUtils.isEmpty(source)) {
                                return "";
                            }
                            String string = C60903NvH.LJ.getResources().getString(R.string.qim, Integer.valueOf(this.LJLIL));
                            o.LJIIIIZZ(string, "getApplication().resourc…sage_overflow, maxLength)");
                            C5S1 c5s1 = new C5S1(C60903NvH.LJ);
                            c5s1.LIZLLL(string);
                            c5s1.LJ();
                            return "";
                        }
                        if (length >= i3 - i2) {
                            return null;
                        }
                        int i6 = length + i2;
                        String string2 = C60903NvH.LJ.getResources().getString(R.string.qim, Integer.valueOf(this.LJLIL));
                        o.LJIIIIZZ(string2, "getApplication().resourc…sage_overflow, maxLength)");
                        int i7 = i6 - 1;
                        if (Character.isHighSurrogate(source.charAt(i7))) {
                            if (i7 == i2) {
                                C5S1 c5s12 = new C5S1(C60903NvH.LJ);
                                c5s12.LIZLLL(string2);
                                c5s12.LJ();
                                return "";
                            }
                            i6 = i7;
                        }
                        C5S1 c5s13 = new C5S1(C60903NvH.LJ);
                        c5s13.LIZLLL(string2);
                        c5s13.LJ();
                        return source.subSequence(i2, i6);
                    }
                }});
                ((TextView) _$_findCachedViewById(R.id.czk)).removeTextChangedListener(this.LJLJJLL);
                ((TextView) _$_findCachedViewById(R.id.czk)).addTextChangedListener(this.LJLJJLL);
                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.lvu), new IDlS62S0100000_2(this, 40));
                ((ImageView) _$_findCachedViewById(R.id.ew8)).setScaleType(ImageView.ScaleType.CENTER_CROP);
                VideoPublishEditModel videoPublishEditModel4 = this.LJLIL;
                if (videoPublishEditModel4 != null) {
                    if (videoPublishEditModel4.mIsFromDraft && videoPublishEditModel4.getVideoCoverPath() != null) {
                        VideoPublishEditModel videoPublishEditModel5 = this.LJLIL;
                        if (videoPublishEditModel5 != null) {
                            C39579Fg7.LJIL(videoPublishEditModel5.getVideoCoverPath());
                            VideoPublishEditModel videoPublishEditModel6 = this.LJLIL;
                            if (videoPublishEditModel6 != null) {
                                videoPublishEditModel6.generateVideoCoverPath();
                            } else {
                                o.LJIJI("mModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    }
                    wl();
                    C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.ew8), new IDlS62S0100000_2(this, 41));
                    C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.aue), new IDlS62S0100000_2(this, 39));
                    VideoPublishEditModel videoPublishEditModel7 = this.LJLIL;
                    if (videoPublishEditModel7 != null) {
                        if (videoPublishEditModel7.mIsFromDraft) {
                            final n nVar = new n();
                            ActivityC45651qj mo49getActivity2 = mo49getActivity();
                            if (mo49getActivity2 != null) {
                                this.LJLJI.incrementAndGet();
                                if (this.LJLILLLLZI == null && !mo49getActivity2.isFinishing()) {
                                    this.LJLILLLLZI = ProgressDialogC164766dM.LIZLLL(mo49getActivity2, getString(R.string.q5d));
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("FTCVideoPublish prepareEffectPlatformImpl:");
                                    LIZ.append(this.LJLILLLLZI);
                                    H78.LJI(X1D.LIZIZ(LIZ));
                                }
                            }
                            C60903NvH.LJIIJJI().LJIJ();
                            VideoPublishEditModel videoPublishEditModel8 = this.LJLIL;
                            if (videoPublishEditModel8 != null) {
                                ArrayList<EffectPointModel> effectList = videoPublishEditModel8.getEffectList();
                                if (effectList == null || effectList.isEmpty()) {
                                    H78.LJI("ignore fetch specialfilter because of empty effects");
                                    nVar.LJ(null);
                                } else {
                                    HashSet hashSet = new HashSet();
                                    VideoPublishEditModel videoPublishEditModel9 = this.LJLIL;
                                    if (videoPublishEditModel9 != null) {
                                        Iterator<EffectPointModel> it = videoPublishEditModel9.getEffectList().iterator();
                                        while (it.hasNext()) {
                                            EffectPointModel next = it.next();
                                            if (!C39579Fg7.LIZIZ(next.getResDir())) {
                                                hashSet.add(next.getKey());
                                            }
                                        }
                                        if (!hashSet.isEmpty()) {
                                            ActivityC45651qj requireActivity = requireActivity();
                                            o.LJIIIIZZ(requireActivity, "requireActivity()");
                                            InterfaceC84498XEg LIZ2 = C84488XDw.LIZ(requireActivity, null);
                                            LIZ2.G8(this);
                                            LIZ2.LJ(new ArrayList(hashSet), true, null, new IFetchEffectListListener() { // from class: X.6Z1
                                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                                                public final void onFail(ExceptionResult e) {
                                                    o.LJIIIZ(e, "e");
                                                    StringBuilder LIZ3 = X1D.LIZ();
                                                    LIZ3.append("uniformFetchList fail : ");
                                                    LIZ3.append(e);
                                                    H78.LIZJ(X1D.LIZIZ(LIZ3));
                                                    nVar.LJ(null);
                                                }

                                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                                public final void onSuccess(List<Effect> response) {
                                                    o.LJIIIZ(response, "response");
                                                    H78.LJI("uniformFetchList onSuccess");
                                                    nVar.LJ(null);
                                                }
                                            });
                                        } else {
                                            H78.LJI("All effects needn't download");
                                            nVar.LJ(null);
                                        }
                                    } else {
                                        o.LJIJI("mModel");
                                        throw null;
                                    }
                                }
                                C10K LJIIIZ = C10K.LJIIIZ(null);
                                n nVar2 = new n();
                                nVar2.LJ(null);
                                C10K.LJIJJ(C65661Ppp.LIZIZ(LJIIIZ, nVar.LIZ, nVar2.LIZ)).LJ(new AgS120S0100000_2(this, 18), C10K.LJIIIIZZ, null);
                            } else {
                                o.LJIJI("mModel");
                                throw null;
                            }
                        }
                        C162696a1.LIZ(mo49getActivity());
                        return;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        VideoPublishEditModel videoPublishEditModel;
        super.onActivityResult(i, i2, intent);
        if (i == 4 && i2 == -1 && intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT");
            if ((serializableExtra instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) serializableExtra) != null) {
                videoPublishEditModel.creativeModel = C78996UzQ.LJIILL(intent);
                this.LJLIL = videoPublishEditModel;
                wl();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awk, viewGroup, false);
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
