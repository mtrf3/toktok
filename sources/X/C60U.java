package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.property.CreativeToolsEntranceReversalConfig;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.60U, reason: invalid class name */
/* loaded from: classes3.dex */
public class C60U extends WMH implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public final C82622Wbi LJLIL;
    public ConstraintLayout LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82631Wbr LJLJJLL;
    public ViewGroup LJLJL;
    public final java.util.Map<Integer, C1536261e> LJLJLJ;
    public C60V LJLJLLL;
    public C60B LJLL;
    public final C145465nK LJLLI;
    public final C5H3 LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public final C1533460c LJLLLL;
    public final java.util.Map<Integer, Integer> LJLLLLLL;
    public final boolean LJLZ;
    public boolean LJZ;

    static {
        TBT tbt = new TBT(C60U.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C60U.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C60U.class, "editTitleBarApi", "getEditTitleBarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C60U.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0, c65351Pkp), C61845OOz.LIZJ(C60U.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0, c65351Pkp)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:321:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0971  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLILLLLZIIL() {
        /*
            Method dump skipped, instructions count: 2449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60U.LLJLILLLLZIIL():void");
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

    public final InterfaceC153275zv LLJJLIIIJLLLLLLLZ() {
        return (InterfaceC153275zv) this.LJLJI.LIZ(this, LJZI[0]);
    }

    public final VideoPublishEditModel LLJLIL() {
        return (VideoPublishEditModel) this.LJLJJI.LIZ(this, LJZI[1]);
    }

    public List LLJLL() {
        Serializable serializable;
        MvCreateVideoData mvCreateVideoData;
        boolean z;
        boolean z2;
        ArrayList<String> arrayList;
        Bundle bundle;
        int i;
        boolean LJJJJL = H7R.LJJJJL(LLJLIL());
        Integer valueOf = Integer.valueOf(R.raw.icon_camera_enhancephoto_fill);
        Integer valueOf2 = Integer.valueOf(R.string.fiz);
        Integer valueOf3 = Integer.valueOf(R.raw.icon_camera_filter_fill);
        Integer valueOf4 = Integer.valueOf(R.string.gfw);
        Integer num = null;
        if (LJJJJL) {
            if (C44384HbQ.LJLLLLLL(LLJLIL())) {
                return C61878OQg.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList();
            LLJJJJ(arrayList2);
            if (!this.LJLZ) {
                valueOf3 = null;
            }
            arrayList2.add(new C1536461g(5, -1, valueOf4, null, valueOf3, null, false, 104));
            if (!C44384HbQ.LJJIFFI()) {
                Integer valueOf5 = Integer.valueOf(R.string.rfx);
                if (C149055t7.LIZ()) {
                    i = R.raw.icon_control_fill;
                } else {
                    i = R.raw.icon_speaker_2_fill_ltr;
                }
                arrayList2.add(new C1536461g(7, -1, valueOf5, null, Integer.valueOf(i), null, false, 104));
            }
            if (LLJLIL().isAutoEnhanceEnable() && !LLJLIL().isGifMaterialOnly()) {
                if (!this.LJLZ) {
                    valueOf = null;
                }
                arrayList2.add(new C1536461g(9, -1, valueOf2, null, valueOf, null, false, 104));
            }
            LLJJJIL(arrayList2, new AqS152S0100000_2(this, 654));
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        AbstractC42651GoZ LJIJ = C86793Y4n.LJIJ(this);
        if (LJIJ != null && (bundle = LJIJ.mArguments) != null) {
            serializable = bundle.getSerializable("key_mv_theme_data");
        } else {
            serializable = null;
        }
        if (serializable instanceof MvCreateVideoData) {
            mvCreateVideoData = (MvCreateVideoData) serializable;
        } else {
            mvCreateVideoData = null;
        }
        if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null && arrayList.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if ("slideshow".equals(H7R.LJIIIZ(LLJLIL())) && z && C60T.LIZ()) {
            if (!this.LJLZ) {
                valueOf3 = null;
            }
            arrayList3.add(new C1536461g(5, -1, valueOf4, null, valueOf3, null, false, 104));
            if (LLJLIL().isAutoEnhanceEnable()) {
                if (this.LJLZ && LLJLIL().isAutoEnhanceEnable()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList3.add(new C1536461g(9, -1, valueOf2, null, valueOf, null, z2, 40));
            }
            return arrayList3;
        }
        if (C151975xp.LIZ(LLJLIL())) {
            if (!C44384HbQ.LJLLLLLL(LLJLIL())) {
                if (!C151965xo.LIZJ(LLJLIL())) {
                    LLJJJJ(arrayList3);
                    LLJJIJI(arrayList3);
                }
                LLJJJ(arrayList3);
                LLJJJIL(arrayList3, new AqS152S0100000_2(this, 657));
                LLJJ(arrayList3);
                LLJJIJIL(arrayList3);
                LLJJIII(arrayList3);
                LLJILJILJ(arrayList3);
                LLJJI(arrayList3);
                LLJILJIL(arrayList3);
                LLJJIJIIJIL(arrayList3);
                LLJJL(arrayList3);
                LLJJJIL(arrayList3, new AqS152S0100000_2(this, 659));
            }
        } else if (!C44384HbQ.LJLLLLLL(LLJLIL())) {
            if (!C151965xo.LIZJ(LLJLIL())) {
                LLJJJJ(arrayList3);
                LLJJIJI(arrayList3);
            }
            LLJJJ(arrayList3);
            LLJJ(arrayList3);
            if (!LLJLIL().isCurrentAutoCutMode()) {
                VideoPublishEditModel LLJLIL = LLJLIL();
                o.LJIIIZ(LLJLIL, "<this>");
                C78934UyQ.LJLIL.LIZLLL().getClass();
                if (CommonFeedApiService.LIZ().LJJ() && !LLJLIL.isShoutout() && H7R.LJJJ(LLJLIL)) {
                    Integer valueOf6 = Integer.valueOf(R.string.px2);
                    if (this.LJLZ) {
                        num = Integer.valueOf(R.raw.icon_camera_library_fill);
                    }
                    arrayList3.add(new C1536461g(19, -1, valueOf6, null, num, null, false, 104));
                }
            }
            LLJILJILJ(arrayList3);
            LLJJI(arrayList3);
            LLJILJIL(arrayList3);
            LLJJIJIL(arrayList3);
            LLJJL(arrayList3);
            LLJJIJIIJIL(arrayList3);
            LLJJIII(arrayList3);
        }
        return arrayList3;
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLLILLLL.getValue();
    }

    public final boolean LLJLLIL() {
        DMMediaModel dMMediaModel;
        if (!LLJLIL().isEnterFromDM() || (dMMediaModel = LLJLIL().creativeModel.dmMediaModel) == null || !C79043V0l.LJIILIIL(dMMediaModel)) {
            return false;
        }
        return true;
    }

    public final boolean LLJLLL() {
        VideoPublishEditModel LLJLIL = LLJLIL();
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        if (!C78555UsJ.LJJJ(requireActivity, LLJLIL)) {
            VideoPublishEditModel LLJLIL2 = LLJLIL();
            Activity requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            if (!C78555UsJ.LJJIZ(requireActivity2, LLJLIL2)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C60B c60b = this.LJLL;
        if (c60b != null) {
            c60b.LIZ();
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C60U(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJI = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJLJJI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC153185zm.class, null);
        this.LJLJJLL = UCI.LJII(diContainer, InterfaceC136115Vv.class, null);
        this.LJLJLJ = new LinkedHashMap();
        this.LJLLI = new C145465nK(this);
        this.LJLLILLLL = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLLLL = new C1533460c();
        this.LJLLLLLL = new LinkedHashMap();
        this.LJLZ = true;
        this.LJZ = true;
    }

    public final void LLJILJIL(List<C1536461g> list) {
        if (C43865HJl.LIZ()) {
            if ((C43865HJl.LIZJ() == 2 || C43865HJl.LIZJ() == 3) && H7R.LJJIJIIJIL(LLJLIL())) {
                ((ArrayList) list).add(new C1536461g(26, 0, Integer.valueOf(R.string.fa), null, Integer.valueOf(R.raw.icon_caption_ai), null, C60903NvH.LJIIJJI().LJJIL().getAICaptionSwitch(false), 40));
            }
        }
    }

    public final void LLJILJILJ(List<C1536461g> list) {
        if (C79004UzY.LJJIII(LLJLIL().canvasVideoData) || C79004UzY.LJJIL(LLJLIL().canvasVideoData) || LLJLLIL() || !C44384HbQ.LJJIIJZLJL(LLJLIL())) {
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new C1536461g(1100, 0, Integer.valueOf(C6UX.LIZIZ()), null, Integer.valueOf(C6UX.LIZ()), null, false, 106));
    }

    public final void LLJJ(List<C1536461g> list) {
        if (C44384HbQ.LLILII(LLJLIL())) {
            C145885o0 c145885o0 = C145885o0.LIZ;
            VideoPublishEditModel LLJLIL = LLJLIL();
            c145885o0.getClass();
            if (!C145885o0.LIZIZ(LLJLIL)) {
                Activity requireActivity = requireActivity();
                int i = R.string.fjf;
                String string = requireActivity.getString(R.string.fjf);
                o.LJIIIIZZ(string, "requireActivity().getStr…g.edit_page_adjust_clips)");
                if (C145805ns.LIZ() || C132385Hm.LJII(LLJLIL())) {
                    string = C1533360b.LIZ();
                    if (C1534360l.LIZ()) {
                        i = R.string.dzk;
                    } else {
                        i = C1533360b.LIZIZ();
                    }
                }
                ((ArrayList) list).add(new C1536461g(15, -1, Integer.valueOf(i), string, Integer.valueOf(C1534460m.LIZ()), null, false, 96));
            }
        }
    }

    public final void LLJJI(List<C1536461g> list) {
        if (C79004UzY.LJJIII(LLJLIL().canvasVideoData) || C79004UzY.LJJIL(LLJLIL().canvasVideoData) || LLJLLIL() || !C44384HbQ.LJJIII(LLJLIL())) {
            return;
        }
        C62A.LIZ.getClass();
        ((ArrayList) list).add(new C1536461g(20, 0, Integer.valueOf(C62A.LIZ()), null, Integer.valueOf(R.raw.icon_audio_editing_microphone), null, false, 96));
    }

    public final void LLJJIII(List<C1536461g> list) {
        boolean z;
        Integer num;
        boolean z2;
        int i;
        C148585sM.LIZ.getClass();
        if (((CreativeToolsEntranceReversalConfig) C148585sM.LIZJ.getValue()).getHideNoiseReduceOnEditPage() || C79004UzY.LJJIJL(LLJLIL().canvasVideoData) || !C5WT.LIZ() || CommerceToolsMusicService.LIZIZ(false).U40()) {
            return;
        }
        if (LLJLIL().mOrigin == 1) {
            z = C5WS.LIZ();
        } else {
            z = C5WV.LIZ.getBoolean("audio_music_sound", C5WS.LIZ());
        }
        Integer valueOf = Integer.valueOf(R.string.ita);
        if (this.LJLZ) {
            if (C149055t7.LIZ()) {
                i = R.raw.icon_camera_waveform;
            } else {
                i = R.raw.icon_camera_denoise;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        if (this.LJLZ && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        ((ArrayList) list).add(new C1536461g(14, -1, valueOf, null, num, null, z2, 40));
    }

    public final void LLJJIJI(List<C1536461g> list) {
        int i;
        if (C44701HgX.LJIILIIL(LLJLIL())) {
            if (C00F.LIZ(31744, 0, "autocut_edit_entrance_name", true) == 1) {
                i = R.string.e23;
            } else {
                i = R.string.e1v;
            }
            ((ArrayList) list).add(new C1536461g(21, -1, Integer.valueOf(i), null, Integer.valueOf(R.raw.icon_templates_cards), null, false, 104));
        }
    }

    public final void LLJJIJIIJIL(List<C1536461g> list) {
        boolean z;
        C148585sM.LIZ.getClass();
        if (!((CreativeToolsEntranceReversalConfig) C148585sM.LIZJ.getValue()).getHideAutoEnhanceOnEditPage() && LLJLIL().isAutoEnhanceEnable()) {
            Integer valueOf = Integer.valueOf(R.string.fiz);
            Integer valueOf2 = Integer.valueOf(R.raw.icon_camera_enhancephoto_fill);
            if (this.LJLZ && H7R.LJFF(LLJLIL())) {
                z = true;
            } else {
                z = false;
            }
            ((ArrayList) list).add(new C1536461g(9, -1, valueOf, null, valueOf2, null, z, 40));
        }
    }

    public final void LLJJIJIL(List<C1536461g> list) {
        if (C44384HbQ.LJJIJL(LLJLIL())) {
            if ((C44384HbQ.LJLJJI(LLJLIL()) || C44384HbQ.LJJIII(LLJLIL())) && !LLJLIL().isGifMaterialOnly() && !LLJLLIL()) {
                ((ArrayList) list).add(new C1536461g(11, -1, Integer.valueOf(R.string.bwy), null, Integer.valueOf(R.raw.icon_closed_caption_fill), null, false, 104));
            }
        }
    }

    public final void LLJJJ(List<C1536461g> list) {
        Integer num;
        Integer valueOf = Integer.valueOf(R.string.gfw);
        if (this.LJLZ) {
            num = Integer.valueOf(R.raw.icon_camera_filter_fill);
        } else {
            num = null;
        }
        ((ArrayList) list).add(new C1536461g(5, -1, valueOf, null, num, null, false, 104));
    }

    public final void LLJJJJ(List<C1536461g> list) {
        C68322mC c68322mC = new C68322mC();
        boolean LJJIFFI = C60903NvH.LJIIJJI().getPublishService().LJJIFFI();
        if (C00F.LIZ(31744, 0, "studio_add_save_local_layout_type", true) != 0) {
            if ((C00F.LIZ(31744, 0, "studio_add_save_local_layout_type", true) != 1 || !C151965xo.LIZJ(LLJLIL())) && C1533860g.LIZ(LLJLIL())) {
                ArrayList arrayList = (ArrayList) list;
                arrayList.add(new C1536461g(25, R.drawable.b3k, Integer.valueOf(R.string.q9s), null, null, new C1536661i(LJJIFFI, this, c68322mC), false, 88));
                arrayList.add(new C1536461g(24, 0, 0, null, null, null, false, LiveTryModeCountDownThresholdSetting.DEFAULT));
            }
        }
    }

    public final void LLJJL(List<C1536461g> list) {
        if (C79004UzY.LJJIII(LLJLIL().canvasVideoData) || C79004UzY.LJJIL(LLJLIL().canvasVideoData) || LLJLLIL() || C79004UzY.LJJIJL(LLJLIL().canvasVideoData)) {
            return;
        }
        boolean LJJIFFI = C44384HbQ.LJJIFFI();
        int i = R.raw.icon_speaker_2_fill_ltr;
        if (!LJJIFFI) {
            if (!LLJLIL().isDuet() && !C44384HbQ.LJZL(LLJLIL())) {
                ((ArrayList) list).add(new C1536461g(8, R.drawable.b6r, Integer.valueOf(R.string.ed3), null, null, null, false, LiveTryModeCountDownThresholdSetting.DEFAULT));
            }
            Integer valueOf = Integer.valueOf(R.string.rfx);
            if (C149055t7.LIZ()) {
                i = R.raw.icon_control_fill;
            }
            ((ArrayList) list).add(new C1536461g(7, -1, valueOf, null, Integer.valueOf(i), null, false, 104));
            return;
        }
        if (!LLJLIL().isDuet() && !C44384HbQ.LJZL(LLJLIL()) && (!o.LJ(LLJLIL().mShootWay, "duet") || !C43710HDm.LIZ())) {
            return;
        }
        Integer valueOf2 = Integer.valueOf(R.string.rfx);
        if (C149055t7.LIZ()) {
            i = R.raw.icon_control_fill;
        }
        ((ArrayList) list).add(new C1536461g(7, -1, valueOf2, null, Integer.valueOf(i), null, false, 104));
    }

    public final void LLJJJIL(List<C1536461g> list, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        if (interfaceC65784Pro.invoke().booleanValue() && !LLJLIL().isEnterFromDM()) {
            ((ArrayList) list).add(new C1536461g(17, 0, Integer.valueOf(C1535460w.LIZIZ()), null, Integer.valueOf(C1535460w.LIZ()), null, false, 106));
        }
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        LiveEvent<AVMusic> Am;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.fn2);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.layout_tool_container)");
        this.LJLJL = (ViewGroup) requireViewById;
        Integer num = C151105wQ.LJI;
        if (num != null) {
            int intValue = num.intValue();
            ConstraintLayout constraintLayout = this.LJLILLLLZI;
            if (constraintLayout != null) {
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.topMargin = intValue;
                    ConstraintLayout constraintLayout2 = this.LJLILLLLZI;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setLayoutParams(marginLayoutParams);
                    } else {
                        o.LJIJI("titleLayout");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("titleLayout");
                throw null;
            }
        }
        LLJJLIIIJLLLLLLLZ().We(this, new AqS168S0100000_2(this, 377));
        LLJJLIIIJLLLLLLLZ().n2().observe(C86793Y4n.LJJIJIIJIL(this), new AObserverS70S0100000_2(this, 204));
        C82632Wbs c82632Wbs = this.LJLJJL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJZI;
        ((InterfaceC153185zm) c82632Wbs.LIZ(this, interfaceC74236TBoArr[2])).lz(this, new AqS168S0100000_2(this, 379));
        LLJJLIIIJLLLLLLLZ().os(this, new AqS168S0100000_2(this, 381));
        LLJJLIIIJLLLLLLLZ().Hn(this, new AqS168S0100000_2(this, 383));
        LLJJLIIIJLLLLLLLZ().A60(this, new AqS168S0100000_2(this, 385));
        LLJJLIIIJLLLLLLLZ().Ly(this, new AqS168S0100000_2(this, 386));
        getEditPreviewApi().tG().observe(this, new AObserverS70S0100000_2(this, 206));
        InterfaceC145325n6 interfaceC145325n6 = (InterfaceC145325n6) this.LJLLI.LIZ(this, interfaceC74236TBoArr[4]);
        if (interfaceC145325n6 != null && (Am = interfaceC145325n6.Am()) != null) {
            Am.LIZLLL(this, new AObjectS84S0100000_2(this, 226));
        }
        getEditPreviewApi().wf0().observe(this, new AObserverS70S0100000_2(this, 200));
        LLJJLIIIJLLLLLLLZ().uk(this, new AqS168S0100000_2(this, 375));
        VideoLengthChecker.LJ().LIZLLL(LLJLIL(), getEditPreviewApi(), this);
        if (!(!C139895eL.LIZIZ) || C53099Ksh.LIZJ() || LLJLIL().isShouldEditorStartOptimization()) {
            LLJLILLLLZIIL();
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = (ConstraintLayout) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ir, viewGroup, false, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        this.LJLILLLLZI = constraintLayout;
        return constraintLayout;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
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
