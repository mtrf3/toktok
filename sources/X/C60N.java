package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.60N, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60N extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZ;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C82631Wbr LJLJJI;
    public FrameLayout LJLJJL;
    public RelativeLayout LJLJJLL;
    public View LJLJL;
    public LinearLayout LJLJLJ;
    public C5TJ LJLJLLL;
    public final java.util.Map<Integer, View> LJLL;
    public C60B LJLLI;
    public final C145465nK LJLLILLLL;
    public int LJLLJ;
    public final C82632Wbs LJLLL;
    public final C82632Wbs LJLLLL;
    public final C82631Wbr LJLLLLLL;
    public final boolean LJLZ;

    static {
        TBT tbt = new TBT(C60N.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C60N.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0, c65351Pkp), C61845OOz.LIZJ(C60N.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C60N.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C60N.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C60N.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final void LLJILJIL() {
        ((InterfaceC143655kP) this.LJLJI.getValue()).lN();
        if (LLJJIII()) {
            Activity activity = this.mActivity;
            if (activity == null || activity.isFinishing()) {
                return;
            }
            C26227ARb c26227ARb = new C26227ARb(activity);
            c26227ARb.LJ(R.string.rut);
            String string = getResources().getString(R.string.rus);
            o.LJIIIIZZ(string, "getResources().getString….submit_video_modal_body)");
            String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{AVExternalServiceImpl.LIZ().shoutOutsService().getShoutOutSettingsModel().LIZIZ()}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c26227ARb.LIZIZ(LLLZ);
            UC0.LIZJ(c26227ARb, new AqS168S0100000_2(this, 384));
            c26227ARb.LJI().LIZLLL();
            C145995oB c145995oB = new C145995oB();
            if (LLJILJILJ().isShoutout()) {
                c145995oB.LIZLLL("enter_from", "video_edit_page");
                c145995oB.LIZ(LLJILJILJ().mShoutOutsData.getReviewed(), "reviewed");
                if (!TextUtils.isEmpty(LLJILJILJ().mShoutOutsData.getOrderId())) {
                    c145995oB.LIZLLL(ShoutOutsData.MOD_ORDER_ID, LLJILJILJ().mShoutOutsData.getOrderId());
                }
            }
            FMX.LJIIL("show_submitting_thanks_pop_up", c145995oB.LIZ);
            return;
        }
        InterfaceC143385jy interfaceC143385jy = (InterfaceC143385jy) this.LJLLLLLL.LIZ(this, LJZ[5]);
        if (interfaceC143385jy != null && C143475k7.LIZ(interfaceC143385jy, "click_edit_page_next", !LLJILJILJ().creativeModel.audioCopyrightDetectModel.getContinueSelected(), new AqS152S0100000_2(this, 653), 8)) {
            return;
        }
        H7B.LIZ("VEVideoPublishEditActivity nextStep OnClick");
        ((InterfaceC143655kP) this.LJLJI.getValue()).Ru();
    }

    public final VideoPublishEditModel LLJILJILJ() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LJZ[0]);
    }

    public final InterfaceC153275zv LLJJ() {
        return (InterfaceC153275zv) this.LJLLL.LIZ(this, LJZ[3]);
    }

    public final boolean LLJJIII() {
        if (LLJILJILJ().mShoutOutsData != null && o.LJ(ShoutOutsData.MODE_SEND, LLJILJILJ().mShoutOutsData.getShoutOutsMode())) {
            return true;
        }
        return false;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C60B c60b = this.LJLLI;
        if (c60b != null) {
            c60b.LIZ();
        }
        C5TJ c5tj = this.LJLJLLL;
        if (c5tj != null) {
            c5tj.LJLJJL.cancel();
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
    }

    public C60N(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJI = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJJI = UCI.LJII(diContainer, InterfaceC136115Vv.class, null);
        this.LJLL = new LinkedHashMap();
        this.LJLLILLLL = new C145465nK(this);
        this.LJLLL = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJLLLL = UCI.LJI(diContainer, InterfaceC153185zm.class, null);
        this.LJLLLLLL = UCI.LJII(diContainer, InterfaceC143385jy.class, null);
        this.LJLZ = true;
    }

    public final void LLJJI(List<C1536461g> list) {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        HashMap<String, Integer> extraShareOptions;
        HashMap<String, Integer> extraShareOptions2;
        Integer num;
        LinearLayout linearLayout = this.LJLJLJ;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ((LinkedHashMap) this.LJLL).clear();
            this.LJLLJ = 0;
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                final C1536461g c1536461g = (C1536461g) it.next();
                Activity activity = this.mActivity;
                o.LJI(activity);
                final C1536261e LIZ = C1536361f.LIZ(activity, c1536461g);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart((int) KL2.LIZJ(getApplicationContext(), 4.0f));
                LinearLayout linearLayout2 = this.LJLJLJ;
                if (linearLayout2 != null) {
                    linearLayout2.addView(LIZ, layoutParams);
                    this.LJLLJ = LIZ.getTextWidth$tools_camera_edit_release() + layoutParams.getMarginStart() + this.LJLLJ;
                    LIZ.LIZIZ(0);
                    this.LJLL.put(Integer.valueOf(c1536461g.LIZ), LIZ);
                    LIZ.setOnClickListener(new ViewOnClickListenerC13880ga(new AbstractViewOnClickListenerC55470Lpq() { // from class: X.60O
                        @Override // X.AbstractViewOnClickListenerC55470Lpq
                        public final void LIZ(View view) {
                            if (C1536261e.this.findViewById(R.id.isy).getVisibility() == 0) {
                                this.LLJJ().u60(true);
                                C1536261e.this.findViewById(R.id.isy).setVisibility(4);
                            } else {
                                this.LLJJ().u60(false);
                            }
                            C1536261e.this.LIZIZ(1);
                            this.LLJJ().A7(c1536461g.LIZ);
                        }
                    }));
                    if (c1536461g.LIZ == 1 && (extraShareOptions = LLJILJILJ().creativeFlowData.getExtraShareOptions()) != null && extraShareOptions.containsKey("tiktok_videokit_disable_music_selection") && (extraShareOptions2 = LLJILJILJ().creativeFlowData.getExtraShareOptions()) != null && (num = extraShareOptions2.get("tiktok_videokit_disable_music_selection")) != null && num.intValue() == 1) {
                        CharSequence text = getResources().getText(R.string.qb_);
                        o.LJIIIIZZ(text, "resources.getText(R.stri…sicselection_unavailable)");
                        LIZ.LIZ(text);
                    }
                } else {
                    o.LJIJI("bottomBarContainer");
                    throw null;
                }
            }
            C60B c60b = this.LJLLI;
            if (c60b != null) {
                c60b.LIZ();
            }
            Activity activity2 = this.mActivity;
            o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            VideoPublishEditModel LLJILJILJ = LLJILJILJ();
            WM7 wm7 = this.mParentScene;
            o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            final C60B c60b2 = new C60B((ActivityC45651qj) activity2, LLJILJILJ, (WMH) wm7, (InterfaceC145325n6) this.LJLLILLLL.LIZ(this, LJZ[2]), LLJJ());
            c60b2.LJFF(this.LJLL);
            c60b2.LIZLLL(this.LJLL);
            c60b2.LJ(this.LJLL);
            java.util.Map<Integer, View> map = this.LJLL;
            o.LJIIIZ(map, "map");
            if (C44384HbQ.LJJIFFI()) {
                if (LLJJ().vq() != null) {
                    C60903NvH.LJIIJJI().LJJIL().getCombinedShootModeTipShown(true);
                }
                c60b2.LIZIZ((View) ((LinkedHashMap) this.LJLL).get(1));
            }
            View view = (View) ((LinkedHashMap) this.LJLL).get(1);
            if (view != null) {
                c60b2.LIZJ(this, (C1536261e) view);
            }
            View view2 = (View) ((LinkedHashMap) this.LJLL).get(2);
            if (view2 != null) {
                final C1536261e c1536261e = (C1536261e) view2;
                final InterfaceC143655kP editPreviewApi = (InterfaceC143655kP) this.LJLJI.getValue();
                o.LJIIIZ(editPreviewApi, "editPreviewApi");
                InterfaceC153045zY value = editPreviewApi.Kh().getValue();
                if (value != null && (LJJI = C17N.LJJI(value)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
                    nLEEditor.addConsumer(new NLEEditorListener() { // from class: X.60C
                        @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
                        public final void onChanged() {
                            if (C148665sU.LIZ) {
                                InterfaceC143655kP interfaceC143655kP = editPreviewApi;
                                o.LJII(interfaceC143655kP, "null cannot be cast to non-null type com.ss.android.ugc.gamora.editor.preview.TiktokEditPreviewApi");
                                if (((InterfaceC142545ic) interfaceC143655kP).Jg0()) {
                                    if (c60b2.LJIIIZ) {
                                        c1536261e.setSelected(true);
                                        return;
                                    } else {
                                        c1536261e.setIcon(R.drawable.aq3);
                                        return;
                                    }
                                }
                                if (c60b2.LJIIIZ) {
                                    c1536261e.setSelected(false);
                                } else {
                                    c1536261e.setIcon(R.drawable.azu);
                                }
                            }
                        }
                    });
                }
            }
            this.LJLLI = c60b2;
            Integer num2 = C151105wQ.LJII;
            if (num2 != null) {
                LLJJIJI(num2.intValue());
                return;
            }
            return;
        }
        o.LJIJI("bottomBarContainer");
        throw null;
    }

    public final void LLJJIJI(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        RelativeLayout relativeLayout = this.LJLJJLL;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.height = i;
                RelativeLayout relativeLayout2 = this.LJLJJLL;
                if (relativeLayout2 != null) {
                    relativeLayout2.setLayoutParams(marginLayoutParams);
                    return;
                } else {
                    o.LJIJI("bottomLayout");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("bottomLayout");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v32, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v34 */
    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        int i;
        boolean z;
        Serializable serializable;
        boolean z2;
        int i2;
        Integer num;
        boolean z3;
        int i3;
        ?? r4;
        MvCreateVideoData mvCreateVideoData;
        ArrayList<String> arrayList;
        Bundle bundle2;
        int i4;
        super.onActivityCreated(bundle);
        C82632Wbs c82632Wbs = this.LJLLLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJZ;
        ((InterfaceC153185zm) c82632Wbs.LIZ(this, interfaceC74236TBoArr[4])).I6().observe(C86793Y4n.LJJIJIIJIL(this), new AObserverS70S0100000_2(this, 202));
        ((InterfaceC153185zm) this.LJLLLL.LIZ(this, interfaceC74236TBoArr[4])).zk(this, new AqS168S0100000_2(this, 376));
        ((InterfaceC153185zm) this.LJLLLL.LIZ(this, interfaceC74236TBoArr[4])).n2().observe(this, new AObserverS70S0100000_2(this, 203));
        LLJJ().Hn(this, new AqS168S0100000_2(this, 378));
        LLJJ().A60(this, new AqS168S0100000_2(this, 380));
        VideoLengthChecker.LJ().LIZLLL(LLJILJILJ(), (InterfaceC143655kP) this.LJLJI.getValue(), this);
        boolean LJJJJL = H7R.LJJJJL(LLJILJILJ());
        Integer valueOf = Integer.valueOf(R.raw.icon_camera_sticker_round_fill);
        Integer valueOf2 = Integer.valueOf(R.string.rnc);
        Integer valueOf3 = Integer.valueOf(R.raw.icon_text_latin);
        Integer valueOf4 = Integer.valueOf(R.string.txp);
        Integer valueOf5 = Integer.valueOf(R.raw.icon_music_note_s_alt);
        Integer valueOf6 = Integer.valueOf(R.string.iip);
        if (LJJJJL) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C1536461g(1, 0, valueOf6, null, valueOf5, null, false, 104));
            arrayList2.add(new C1536461g(16, R.drawable.b88, Integer.valueOf(R.string.pde), null, null, null, false, LiveTryModeCountDownThresholdSetting.DEFAULT));
            z = false;
            arrayList2.add(new C1536461g(3, -1, valueOf4, null, valueOf3, null, false, 104));
            r4 = 1;
            arrayList2.add(new C1536461g(4, -1, valueOf2, null, valueOf, null, false, 104));
            LLJJI(arrayList2);
            i = R.string.iip;
        } else {
            i = R.string.iip;
            ArrayList arrayList3 = new ArrayList();
            if (!C79004UzY.LJJIL(LLJILJILJ().canvasVideoData)) {
                arrayList3.add(new C1536461g(1, 0, valueOf6, null, valueOf5, null, false, 104));
            }
            z = false;
            arrayList3.add(new C1536461g(3, -1, valueOf4, null, valueOf3, null, false, 104));
            arrayList3.add(new C1536461g(4, -1, valueOf2, null, valueOf, null, false, 104));
            LLJJI(arrayList3);
            AbstractC42651GoZ LJIJ = C86793Y4n.LJIJ(this);
            if (LJIJ != null && (bundle2 = LJIJ.mArguments) != null) {
                serializable = bundle2.getSerializable("key_mv_theme_data");
            } else {
                serializable = null;
            }
            if ((serializable instanceof MvCreateVideoData) && (mvCreateVideoData = (MvCreateVideoData) serializable) != null && (arrayList = mvCreateVideoData.selectMediaList) != null && arrayList.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!"slideshow".equals(H7R.LJIIIZ(LLJILJILJ())) || !z2 || !C60T.LIZ()) {
                if (o.LJ(LLJILJILJ().mShootWay, "editing_effect_page") || o.LJ(LLJILJILJ().mShootWay, "editing_effect_template")) {
                    i2 = R.drawable.aq3;
                } else if (C149015t3.LIZ()) {
                    i2 = R.drawable.azu;
                } else {
                    i2 = R.drawable.b6u;
                }
                Integer valueOf7 = Integer.valueOf(R.string.fr1);
                if (this.LJLZ) {
                    if (C149055t7.LIZ()) {
                        i3 = R.raw.icon_effect_rectangle_fill;
                    } else {
                        i3 = R.raw.icon_effect_rectangle_alt_fill;
                    }
                    num = Integer.valueOf(i3);
                } else {
                    num = null;
                }
                if (o.LJ(LLJILJILJ().mShootWay, "editing_effect_page") || o.LJ(LLJILJILJ().mShootWay, "editing_effect_template")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                arrayList3.add(new C1536461g(2, i2, valueOf7, null, num, null, z3, 40));
                LLJJI(arrayList3);
            }
            r4 = 1;
        }
        if (LLJILJILJ().isDuet() || C44384HbQ.LJZL(LLJILJILJ())) {
            LLJJ().b2(r4, z);
        }
        if (LLJILJILJ().isStickPointMode) {
            LLJJ().fg0(r4, z);
        }
        InterfaceC153275zv LLJJ = LLJJ();
        String string = requireActivity().getString(i);
        o.LJIIIIZZ(string, "requireActivity().getStr…ent.getChooseMusicText())");
        LLJJ.HH(string);
        LLJJ().gv(R.raw.icon_music_note_s_alt);
        if (LLJILJILJ().isDuet()) {
            C1536161d.LIZLLL(-1, "music");
        } else if (MusicBeanUtilKt.extractAVMusic(LLJILJILJ().creativeModel.musicBuzModel) != null || (LLJILJILJ().isMvThemeVideoType() && !C77413UZt.LJIILL(LLJILJILJ().mvCreateVideoData.musicIds))) {
            C1536161d.LIZLLL(-1, "music");
            if (e1.LIZ(31744, "tool_globally_launch_new_music_selecting_panel", r4, z)) {
                C1536161d.LIZLLL(C1536161d.LIZJ, "music");
            }
        } else {
            C1536161d.LIZLLL(C1536161d.LIZJ, "music");
        }
        C1536161d.LIZLLL(C1536161d.LJFF, "effect");
        if (C78923UyF.LJIILIIL() && !C1536161d.LIZIZ().contains("countdown_sticker")) {
            C1536161d.LIZLLL(C1536161d.LIZIZ, "countdown_sticker");
        } else if (C1536161d.LIZIZ().contains("sticker")) {
            C1536161d.LIZLLL(-1, "sticker");
        } else {
            C1536161d.LIZLLL(C1536161d.LJ, "sticker");
        }
        if (C1536161d.LIZIZ().contains("text")) {
            C1536161d.LIZLLL(-1, "text");
        } else {
            C1536161d.LIZLLL(C1536161d.LIZLLL, "text");
        }
        if (e1.LIZ(31744, "info_sticker_support_uploading_pictures", r4, z) && !C1DG.LJIIIIZZ() && !C1536161d.LIZIZ().contains("custom_sticker")) {
            if (C1536161d.LIZIZ().contains("custom_sticker")) {
                C1536161d.LIZLLL(-1, "custom_sticker");
            } else {
                C1536161d.LIZLLL(C1536161d.LIZ, "custom_sticker");
            }
        }
        Activity activity = this.mActivity;
        if (activity != null && !C60P.LIZ(activity)) {
            int LIZIZ = C7MY.LIZIZ(12);
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i4 = displayMetrics.widthPixels;
            } else {
                i4 = 0;
            }
            RelativeLayout relativeLayout = this.LJLJJLL;
            if (relativeLayout != null) {
                int paddingStart = i4 - relativeLayout.getPaddingStart();
                RelativeLayout relativeLayout2 = this.LJLJJLL;
                if (relativeLayout2 != null) {
                    int paddingEnd = ((paddingStart - relativeLayout2.getPaddingEnd()) - LIZIZ) - this.LJLLJ;
                    View view = this.LJLJL;
                    if (view != null) {
                        if (paddingEnd < view.getMinimumWidth()) {
                            View view2 = this.LJLJL;
                            if (view2 != null) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                layoutParams.width = paddingEnd;
                                View view3 = this.LJLJL;
                                if (view3 != null) {
                                    view3.setLayoutParams(layoutParams);
                                    return;
                                } else {
                                    o.LJIJI("nextStep");
                                    throw null;
                                }
                            }
                            o.LJIJI("nextStep");
                            throw null;
                        }
                        return;
                    }
                    o.LJIJI("nextStep");
                    throw null;
                }
                o.LJIJI("bottomLayout");
                throw null;
            }
            o.LJIJI("bottomLayout");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        LiveEvent<C76800UCe> Ix;
        Activity activity;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.jbb);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.scene_edit_bottom_bar)");
        this.LJLJJL = (FrameLayout) requireViewById;
        View requireViewById2 = requireViewById(R.id.fh6);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.layout_bottom_tool)");
        this.LJLJJLL = (RelativeLayout) requireViewById2;
        View requireViewById3 = requireViewById(R.id.aov);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.bottom_bar_container)");
        this.LJLJLJ = (LinearLayout) requireViewById3;
        View requireViewById4 = requireViewById(R.id.h12);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.next_step)");
        this.LJLJL = requireViewById4;
        C5TJ c5tj = (C5TJ) requireViewById(R.id.iac);
        this.LJLJLLL = c5tj;
        o.LJI(c5tj);
        c5tj.setVisibility(8);
        if (C58B.LIZ()) {
            View view2 = this.LJLJL;
            if (view2 != null) {
                view2.setBackgroundResource(R.drawable.rs);
            } else {
                o.LJIJI("nextStep");
                throw null;
            }
        }
        View view3 = this.LJLJL;
        if (view3 != null) {
            C16880lQ.LJIIJ(new IDlS62S0100000_2(this, 33, 42), view3);
            Activity activity2 = this.mActivity;
            if (activity2 != null && C60P.LIZ(activity2)) {
                Activity activity3 = this.mActivity;
                o.LJI(activity3);
                if (C173636rf.LIZIZ(activity3)) {
                    View view4 = this.LJLJL;
                    if (view4 != null) {
                        view4.setBackground(C04270Et.LIZIZ(activity3, R.drawable.rp));
                    } else {
                        o.LJIJI("nextStep");
                        throw null;
                    }
                } else {
                    View view5 = this.LJLJL;
                    if (view5 != null) {
                        view5.setBackground(C04270Et.LIZIZ(activity3, R.drawable.ro));
                    } else {
                        o.LJIJI("nextStep");
                        throw null;
                    }
                }
            }
            if (LLJJIII() && (activity = this.mActivity) != null && !C60P.LIZ(activity)) {
                View view6 = this.LJLJL;
                if (view6 != null) {
                    ((TextView) view6).setText(R.string.ras);
                } else {
                    o.LJIJI("nextStep");
                    throw null;
                }
            }
            InterfaceC136115Vv interfaceC136115Vv = (InterfaceC136115Vv) this.LJLJJI.LIZ(this, LJZ[1]);
            if (interfaceC136115Vv != null && (Ix = interfaceC136115Vv.Ix()) != null) {
                Ix.LIZLLL(this, new AObjectS84S0100000_2(this, 223));
                return;
            }
            return;
        }
        o.LJIJI("nextStep");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        Activity activity = this.mActivity;
        if (activity != null) {
            o.LJI(activity);
            if (C60P.LIZ(activity)) {
                View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cc_, container, false);
                o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…_small, container, false)");
                return LLLLIILL;
            }
        }
        View LLLLIILL2 = C16880lQ.LLLLIILL(inflater, R.layout.cc9, container, false);
        o.LJIIIIZZ(LLLLIILL2, "inflater.inflate(R.layou…om_bar, container, false)");
        return LLLLIILL2;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
