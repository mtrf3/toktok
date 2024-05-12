package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.ASL;
import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C04330Ez;
import X.C16880lQ;
import X.C188727au;
import X.C26227ARb;
import X.C32I;
import X.C40328FsC;
import X.C45813HyT;
import X.C45814HyU;
import X.C45819HyZ;
import X.C45821Hyb;
import X.C47261Igj;
import X.C61098NyQ;
import X.C61099NyR;
import X.C61898ORa;
import X.C63056Oou;
import X.C65300Pk0;
import X.C65777Prh;
import X.C77331UWp;
import X.C780334l;
import X.C78613UtF;
import X.C78963Uyt;
import X.C84934XVa;
import X.C84964XWe;
import X.C84985XWz;
import X.C8HS;
import X.EnumC84975XWp;
import X.FMX;
import X.HWG;
import X.HWH;
import X.HWK;
import X.InterfaceC191547fS;
import X.InterfaceC58763N4l;
import X.InterfaceC84984XWy;
import X.KO4;
import X.OGG;
import X.ORY;
import X.ORZ;
import X.UC0;
import X.UX3;
import X.XKQ;
import X.XKX;
import X.XRT;
import X.XVF;
import X.XVG;
import X.XVH;
import X.XVI;
import X.XWQ;
import X.XWR;
import X.XWT;
import X.XWU;
import X.XX7;
import X.XY4;
import X.XYM;
import X.XYV;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS56S0201000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LocalMusicTabFragment extends BaseMusicListFragment<C84934XVa> implements XYV<C84934XVa>, InterfaceC191547fS, OGG, InterfaceC58763N4l {
    public static final /* synthetic */ int LLFF = 0;
    public boolean LJLLL;
    public boolean LJLLLL;
    public XY4 LJLLLLLL;
    public XKQ LJZI;
    public HWH LJZL;
    public final Gson LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();
    public long LJLZ = -1;
    public final ArrayList<MusicModel> LJZ = new ArrayList<>();
    public final Keva LL = Keva.getRepo("local_music_repo");

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int Al() {
        return 6;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String Dl() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean Gl() {
        return false;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC84974XWo
    public final String LLJJJ() {
        return "local_music_list_data";
    }

    @Override // X.InterfaceC84974XWo
    public final String V() {
        return "local_music_list_status";
    }

    @Override // X.InterfaceC84974XWo
    public final String b() {
        return "local_music_list_load_more_status";
    }

    @Override // X.XYV
    public final void pk() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int wl() {
        return R.layout.awx;
    }

    public LocalMusicTabFragment() {
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "get().gson");
        this.LLD = LIZ;
    }

    @Override // X.OGG
    public final View LJIJJ() {
        Object obj = this.LJLJLJ;
        if (obj == null) {
            return null;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView<*>");
        return ((XWR) obj).LIZIZ;
    }

    public final MusicModel[] Ml() {
        String string = this.LL.getString("imported_device_sounds", "");
        o.LJIIIIZZ(string, "keva.getString(IMPORTED_DEVICE_SOUNDS, \"\")");
        try {
            Object LJI = this.LLD.LJI(string, MusicModel[].class);
            o.LJIIIIZZ(LJI, "{\n            gson.fromJ…l>::class.java)\n        }");
            return (MusicModel[]) LJI;
        } catch (Throwable unused) {
            return new MusicModel[0];
        }
    }

    @Override // X.XYV
    public final void LJI() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.onBackPressed();
        }
    }

    public final boolean Ll() {
        String str;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            str = "android.permission.READ_MEDIA_AUDIO";
        } else {
            str = "android.permission.WRITE_EXTERNAL_STORAGE";
        }
        if (C04330Ez.LIZ(mo49getActivity, str) != 0) {
            return false;
        }
        return true;
    }

    public final void Sl() {
        AbstractC029409q xl = xl();
        o.LJII(xl, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter");
        ((XX7) xl).LJZ();
        XY4 xy4 = this.LJLLLLLL;
        if (xy4 != null) {
            xy4.k2(null);
        }
        ImportDeviceSoundsFragment importDeviceSoundsFragment = new ImportDeviceSoundsFragment();
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = importDeviceSoundsFragment;
        asl.LJI(4);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        tuxSheet.show(childFragmentManager, "start AudioChoose Page");
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC84974XWo
    public final void initData() {
        String str;
        boolean z;
        super.initData();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            str = "android.permission.READ_MEDIA_AUDIO";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        if (C04330Ez.LIZ(mo49getActivity, str) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLLL = z;
        Object obj = this.LJLJJLL.get("local_music_list_data");
        if (obj != null) {
            this.LJLJJLL.jv0(obj, "local_music_list_data");
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLF).clear();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (Ll() != this.LJLLLL) {
            Nl(getContext(), null);
        }
    }

    @Override // X.XYV
    public final void refreshData() {
        Nl(getContext(), null);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    /* renamed from: Il */
    public final void onInternalEvent(XYM xym) {
        String str;
        String str2;
        TokenCert with;
        String str3;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (str = xym.LIZIZ) != null) {
            boolean z = false;
            String str4 = "off";
            switch (str.hashCode()) {
                case -1657672896:
                    if (!str.equals("allow_access_button_click")) {
                        return;
                    }
                    C188727au c188727au = new C188727au();
                    C78963Uyt.LIZJ(c188727au);
                    FMX.LJIIL("click_upload_music_access_allow", c188727au.LIZ);
                    C77331UWp c77331UWp = new C77331UWp(this);
                    C61098NyQ c61098NyQ = C61099NyR.LIZIZ;
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 33) {
                        with = TokenCert.Companion.with("bpea-tools_request_storage_permission_local_music_tab_allow_access_target33");
                    } else {
                        with = TokenCert.Companion.with("bpea-tools_request_storage_permission_local_music_tab_allow_access");
                    }
                    C61099NyR LIZIZ = c61098NyQ.LIZIZ(mo49getActivity, with);
                    String[] strArr = new String[1];
                    if (i >= 33) {
                        str3 = "android.permission.READ_MEDIA_AUDIO";
                    } else {
                        str3 = "android.permission.READ_EXTERNAL_STORAGE";
                    }
                    strArr[0] = str3;
                    LIZIZ.LIZ(strArr).LIZJ(c77331UWp);
                    return;
                case -751140062:
                    if (!str.equals("local_music_delete_click")) {
                        return;
                    }
                    MusicModel musicModel = xym.LIZ;
                    o.LJIIIIZZ(musicModel, "event.musicModel");
                    int i2 = xym.LIZLLL;
                    if (!C45813HyT.LIZ() && musicModel.getMusicType() != MusicModel.MusicType.VIDEO_EXTRACT) {
                        C40328FsC.LIZLLL(mo49getActivity, R.string.bme);
                        return;
                    }
                    AbstractC029409q xl = xl();
                    o.LJII(xl, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter");
                    ((XX7) xl).LJZ();
                    XY4 xy4 = this.LJLLLLLL;
                    if (xy4 != null) {
                        xy4.k2(null);
                    }
                    int i3 = i2 - 2;
                    if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL_SCAN) {
                        AbstractC029409q xl2 = xl();
                        o.LJII(xl2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter");
                        Boolean valueOf = Boolean.valueOf(((HashSet) ((XX7) xl2).LLD).contains(musicModel.getLocalPath()));
                        o.LJIIIIZZ(valueOf, "musicAdapter as MusicAda…ted(musicModel.localPath)");
                        if (valueOf.booleanValue() && C45813HyT.LIZ()) {
                            Pl(i3, musicModel, Ql(i3), false);
                            return;
                        }
                    }
                    C26227ARb c26227ARb = new C26227ARb(mo49getActivity);
                    c26227ARb.LJ(R.string.bcb);
                    c26227ARb.LIZIZ(mo49getActivity.getString(R.string.bc_));
                    UC0.LIZJ(c26227ARb, new AqS56S0201000_7(this, i3, musicModel, 4));
                    c26227ARb.LJI().LIZLLL();
                    return;
                case -552821657:
                    if (!str.equals("local_edit_click")) {
                        return;
                    }
                    AbstractC029409q xl3 = xl();
                    o.LJII(xl3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter");
                    XX7 xx7 = (XX7) xl3;
                    xx7.LJZL = !xx7.LJZL;
                    xx7.notifyDataSetChanged();
                    xx7.LJZ();
                    XY4 xy42 = this.LJLLLLLL;
                    if (xy42 != null) {
                        xy42.k2(null);
                    }
                    C188727au c188727au2 = new C188727au();
                    C78963Uyt.LIZJ(c188727au2);
                    FMX.LJIIL("click_upload_music_manage", c188727au2.LIZ);
                    return;
                case -233745933:
                    if (!str.equals("import_sounds_from_device_click")) {
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean Ll = Ll();
                    C188727au c188727au3 = new C188727au();
                    C78963Uyt.LIZJ(c188727au3);
                    if (Ll) {
                        str4 = "on";
                    }
                    c188727au3.LJI("system_music_authorization_status", str4);
                    FMX.LJIIL("click_import_sound_from_device_entrance", c188727au3.LIZ);
                    if (Ll) {
                        Sl();
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        boolean z2 = this.LL.getBoolean("device_sounds_import_page_entered_first_time", true);
                        C188727au c188727au4 = new C188727au();
                        C78963Uyt.LIZJ(c188727au4);
                        c188727au4.LJI("system_music_authorization_status", "on");
                        c188727au4.LJ(currentTimeMillis2, "duration");
                        c188727au4.LIZLLL(z2 ? 1 : 0, "is_first_time");
                        FMX.LJIIL("enter_upload_local_music_page", c188727au4.LIZ);
                        this.LL.storeBoolean("device_sounds_import_page_entered_first_time", false);
                        return;
                    }
                    Rl("import_sounds_from_device_click");
                    return;
                case 1477711545:
                    if (!str.equals("import_sound_from_video_click")) {
                        return;
                    }
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (currentTimeMillis3 - this.LJLZ < 1000) {
                        return;
                    }
                    this.LJLZ = currentTimeMillis3;
                    ActivityC45651qj mo49getActivity2 = mo49getActivity();
                    if (mo49getActivity2 != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            str2 = "android.permission.READ_MEDIA_VIDEO";
                        } else {
                            str2 = "android.permission.WRITE_EXTERNAL_STORAGE";
                        }
                        if (C04330Ez.LIZ(mo49getActivity2, str2) == 0) {
                            z = true;
                        }
                    }
                    C188727au c188727au5 = new C188727au();
                    C78963Uyt.LIZJ(c188727au5);
                    if (z) {
                        str4 = "on";
                    }
                    c188727au5.LJI("system_photo_authorization_status", str4);
                    FMX.LJIIL("click_import_sound_from_video_entrance", c188727au5.LIZ);
                    if (z) {
                        System.currentTimeMillis();
                        AVExternalServiceImpl.LIZ().asyncService(mo49getActivity, "extract music", new C63056Oou(mo49getActivity));
                        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                        C188727au c188727au6 = new C188727au();
                        C78963Uyt.LIZJ(c188727au6);
                        c188727au6.LJI("system_photo_authorization_status", "on");
                        c188727au6.LJ(currentTimeMillis4, "duration");
                        FMX.LJIIL("enter_upload_video_music_page", c188727au6.LIZ);
                        return;
                    }
                    Rl("import_sound_from_video_click");
                    return;
                default:
                    return;
            }
        }
    }

    public final void Ol(boolean z) {
        ArrayList LJII;
        XRT xrt = new XRT();
        if (z) {
            ArrayList<MusicModel> musicModelList = this.LJZ;
            o.LJIIIZ(musicModelList, "musicModelList");
            ArrayList arrayList = new ArrayList();
            if (KO4.LIZ()) {
                if (C45813HyT.LIZ()) {
                    arrayList.add(new C84934XVa(866, null, 12));
                } else {
                    arrayList.add(new C84934XVa(863, null, 12));
                }
                if (musicModelList.isEmpty()) {
                    arrayList.add(new C84934XVa(865, null, 12));
                } else {
                    arrayList.add(new C84934XVa(862, null, 12));
                }
            } else {
                arrayList.add(new C84934XVa(861, null, 12));
            }
            arrayList.addAll(C45814HyU.LIZJ(musicModelList));
            xrt.LIZIZ("list_data", arrayList);
        } else {
            if (C45813HyT.LIZ()) {
                LJII = C47261Igj.LJII(new C84934XVa(866, null, 14), new C84934XVa(865, null, 14));
            } else {
                LJII = C47261Igj.LJII(new C84934XVa(863, null, 14), new C84934XVa(864, null, 14));
            }
            xrt.LIZIZ("list_data", LJII);
        }
        xrt.LIZ.put("list_hasmore", Boolean.FALSE);
        xrt.LIZIZ("action_type", 1);
        this.LJLJJLL.jv0(xrt, "local_music_list_data");
    }

    @Override // X.InterfaceC58763N4l
    public final void P4(ArrayList<MusicModel> selectedSoundsList) {
        o.LJIIIZ(selectedSoundsList, "selectedSoundsList");
        Context context = getContext();
        if (selectedSoundsList.isEmpty() || context == null) {
            return;
        }
        HWH hwh = new HWH(context, HWK.GONE, 0);
        HWG.LIZ(context, hwh);
        hwh.setMessage(context.getString(R.string.bmr));
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new XWU(this, selectedSoundsList, hwh, null), 2);
        ArrayList arrayList = new ArrayList(C32I.LJJL(selectedSoundsList, 10));
        Iterator<MusicModel> it = selectedSoundsList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getMusicId());
        }
        String LLD = ORZ.LLD(arrayList, ", ", null, null, null, 62);
        C188727au c188727au = new C188727au();
        C78963Uyt.LIZJ(c188727au);
        c188727au.LJI("fake_music_id", LLD);
        c188727au.LIZLLL(1, "is_selected_uploadable_content");
        FMX.LJIIL("upload_sound_from_device", c188727au.LIZ);
    }

    public final boolean Ql(int i) {
        MusicModel[] Ml = Ml();
        if (i < 0 || i >= Ml.length) {
            return false;
        }
        Tl(ORY.LJJZZIII(C61898ORa.LJJIII(C61898ORa.LJIL(0, i, Ml), C61898ORa.LJIL(i + 1, Ml.length, Ml))));
        return true;
    }

    public final void Rl(String str) {
        TokenCert with;
        String str2;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        UX3 ux3 = new UX3(str, this, mo49getActivity);
        if (o.LJ(str, "import_sound_from_video_click")) {
            C188727au c188727au = new C188727au();
            C78963Uyt.LIZJ(c188727au);
            FMX.LJIIL("upload_video_music_authorization_popup_show", c188727au.LIZ);
        } else if (o.LJ(str, "import_sounds_from_device_click")) {
            C188727au c188727au2 = new C188727au();
            C78963Uyt.LIZJ(c188727au2);
            FMX.LJIIL("upload_music_authorization_popup_show", c188727au2.LIZ);
        }
        C61098NyQ c61098NyQ = C61099NyR.LIZIZ;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            with = TokenCert.Companion.with("bpea-tools_request_storage_permission_local_music_tab_target33");
        } else {
            with = TokenCert.Companion.with("bpea-tools_request_storage_permission_local_music_tab");
        }
        C61099NyR LIZIZ = c61098NyQ.LIZIZ(mo49getActivity, with);
        String[] strArr = new String[1];
        if (i >= 33) {
            if (o.LJ(str, "import_sound_from_video_click")) {
                str2 = "android.permission.READ_MEDIA_VIDEO";
            } else {
                str2 = "android.permission.READ_MEDIA_AUDIO";
            }
        } else {
            str2 = "android.permission.READ_EXTERNAL_STORAGE";
        }
        strArr[0] = str2;
        LIZIZ.LIZ(strArr).LIZJ(ux3);
    }

    public final void Tl(List<? extends MusicModel> list) {
        String str;
        try {
            str = this.LLD.LJIILL(list);
        } catch (Throwable unused) {
            str = "";
        }
        this.LL.storeString("imported_device_sounds", str);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.C72H
    public final /* bridge */ /* synthetic */ void onInternalEvent(XYM xym) {
        onInternalEvent(xym);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        RecyclerView recyclerView;
        Integer num;
        List LIZIZ;
        MusicModel musicModel;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-6980788326988477132");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/LocalMusicTabFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/LocalMusicTabFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z && (LJIJJ() instanceof RecyclerView) && (recyclerView = (RecyclerView) LJIJJ()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            Integer num2 = null;
            if (linearLayoutManager != null) {
                num = Integer.valueOf(linearLayoutManager.LLILL());
                num2 = Integer.valueOf(linearLayoutManager.LLILLJJLI());
            } else {
                num = null;
            }
            C8HS LJJLIIIJJIZ = this.LJLJLJ.LJJLIIIJJIZ();
            if (LJJLIIIJJIZ != null && (LIZIZ = C65777Prh.LIZIZ(LJJLIIIJJIZ.getData())) != null && num != null && num2 != null) {
                int intValue = num2.intValue() + 1;
                for (int intValue2 = num.intValue(); intValue2 < intValue; intValue2++) {
                    if (intValue2 >= 0 && intValue2 < LIZIZ.size() && (musicModel = ((C84934XVa) ListProtector.get(LIZIZ, intValue2)).LIZIZ) != null) {
                        Boolean isRealMusicItem = musicModel.isRealMusicItem();
                        o.LJIIIIZZ(isRealMusicItem, "music.isRealMusicItem");
                        if (isRealMusicItem.booleanValue()) {
                            ((XX7) LJJLIIIJJIZ).LJZI(((C84934XVa) ListProtector.get(LIZIZ, intValue2)).LIZIZ, intValue2);
                        }
                    }
                }
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/LocalMusicTabFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC84984XWy<C84934XVa> vl(View view) {
        XWQ xwq = new XWQ(getContext(), view, this, R.string.iqx, this, this, this.LJLLJ, EnumC84975XWp.LOCAL_MUSIC, this.LJLLILLLL);
        xwq.LIZ.setVisibility(8);
        xwq.LJIIIIZZ(this.LJLLLLLL);
        xwq.LJII(this);
        xwq.LJIIL = C84964XWe.LIZ(this);
        xwq.LJIIJ(new Pair<>(Long.valueOf(this.LJLL), Long.valueOf(this.LJLLI)));
        XVG xvg = new XVG("change_music_page", "upload", "", XVF.LIZ);
        xvg.LJIILIIL = "your_sounds";
        xwq.LJIIIZ(xvg);
        return xwq;
    }

    @Override // X.XYV
    public final /* bridge */ /* synthetic */ void LLLF(Object obj) {
    }

    public final void Nl(Context context, C84985XWz c84985XWz) {
        if (context == null) {
            if (c84985XWz != null) {
                c84985XWz.onFailed(0);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean Ll = Ll();
        this.LJLLLL = Ll;
        if (Ll) {
            this.LJZ.clear();
            Ol(true);
            if (this.LJZL == null) {
                this.LJZL = HWG.LIZIZ(context, HWK.VISIBLE_AFTER_5S, new C45821Hyb(this, c84985XWz, currentTimeMillis));
            }
            if (C45813HyT.LIZ()) {
                this.LJZI = XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new XWT(this, context, null), 2);
                return;
            } else {
                this.LJZI = C45814HyU.LJ(context, new C45819HyZ(this, c84985XWz, currentTimeMillis), true, 0, 50);
                return;
            }
        }
        this.LJZ.clear();
        Ol(false);
        if (c84985XWz != null) {
            c84985XWz.onSuccess(new ArrayList());
        }
    }

    public final void Vl(Collection musicList, boolean z) {
        o.LJIIIZ(musicList, "musicList");
        if (z) {
            this.LJLJJLL.jv0(0, "local_music_list_status");
            this.LJZ.clear();
            this.LJZ.addAll(musicList);
            Ol(true);
            return;
        }
        this.LJLJJLL.jv0(1, "local_music_list_status");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String LLJJIJIIJIL;
        super.onActivityResult(i, i2, intent);
        if (i2 != 101 || intent == null || (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extract_music_path")) == null || LLJJIJIIJIL.length() == 0) {
            return;
        }
        File file = new File(LLJJIJIIJIL);
        if (!file.exists()) {
            return;
        }
        MusicModel LIZ = C45814HyU.LIZ(file);
        if (C45813HyT.LIZ()) {
            List<? extends MusicModel> LJLIIIL = ORY.LJLIIIL(Ml());
            ListProtector.add(LJLIIIL, 0, LIZ);
            Tl(LJLIIIL);
        }
        ListProtector.add(this.LJZ, 0, LIZ);
        Ol(this.LJLLLL);
    }

    public final void Pl(int i, MusicModel musicModel, boolean z, boolean z2) {
        String str;
        ChooseMusicSelectView chooseMusicSelectView;
        MusicModel value;
        if (z) {
            if (i >= 0 && i < this.LJZ.size()) {
                ListProtector.remove(this.LJZ, i);
            }
            if (this.LJZ.isEmpty()) {
                AbstractC029409q xl = xl();
                o.LJII(xl, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter");
                XX7 xx7 = (XX7) xl;
                xx7.LJZL = !xx7.LJZL;
                xx7.notifyDataSetChanged();
            }
            Ol(this.LJLLLL);
            xl().notifyDataSetChanged();
            String musicId = musicModel.getMusicId();
            o.LJIIIIZZ(musicId, "musicModel.musicId");
            C188727au c188727au = new C188727au();
            C78963Uyt.LIZJ(c188727au);
            c188727au.LJIIIZ("fake_music_id", musicId);
            c188727au.LIZLLL(z2 ? 1 : 0, "is_available_music");
            FMX.LJIIL("delete_upload_music", c188727au.LIZ);
        }
        SelectedMusicViewModel selectedMusicViewModel = XVI.LIZIZ;
        if (selectedMusicViewModel != null) {
            MutableLiveData<MusicModel> hv0 = selectedMusicViewModel.hv0();
            if (hv0 != null && (value = hv0.getValue()) != null) {
                str = value.getMusicId();
            } else {
                str = null;
            }
            if (o.LJ(str, musicModel.getMusicId()) && (chooseMusicSelectView = XVI.LIZ) != null) {
                SelectedMusicViewModel selectedMusicViewModel2 = chooseMusicSelectView.LJLLLL;
                if (selectedMusicViewModel2 != null) {
                    selectedMusicViewModel2.jv0().postValue(Boolean.FALSE);
                    XVH xvh = chooseMusicSelectView.LJLLJ;
                    if (xvh != null) {
                        xvh.LIZ(musicModel);
                        return;
                    }
                    return;
                }
                o.LJIJI("mSelectedMusicViewModel");
                throw null;
            }
        }
    }
}
