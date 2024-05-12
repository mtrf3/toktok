package X;

import Y.ARunnableS11S0101000_7;
import Y.ARunnableS18S0201000_15;
import Y.ARunnableS51S0100000_15;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.services.editeffect.IEffectAnchorService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import v5.n;

/* renamed from: X.XVi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84942XVi {
    public boolean LIZ;
    public InterfaceC84498XEg LIZIZ;
    public boolean LIZJ;
    public ArrayList<String> LIZLLL;
    public Dialog LJII;
    public HWH LJIIIIZZ;
    public final Context LJIIJ;
    public Music LJIIL;
    public final String LJIILIIL;
    public String LJIILJJIL;
    public final String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public boolean LJIL;
    public InterfaceC74183T9n LJJ;
    public InterfaceC74184T9o LJJI;
    public Effect LJJIIZ;
    public long LJJIJ;
    public long LJJIJIIJI;
    public C34821Yg LJJIJIIJIL;
    public C84915XUh LJJIJIL;
    public String LJJIJL;
    public String LJJJI;
    public String LJ = "";
    public final ShootExtraData LJFF = new ShootExtraData();
    public int LJI = 0;
    public boolean LJIIIZ = false;
    public String LJIIJJI = "";
    public final IAVEffectService LJJIFFI = AVExternalServiceImpl.LIZ().abilityService().effectService();
    public final IEffectAnchorService LJJII = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false);
    public String LJJIII = "";
    public String LJJIIJ = "";
    public String LJJIIJZLJL = "";
    public boolean LJJIIZI = true;
    public int LJJIJLIJ = 0;
    public Effect LJJIL = null;
    public LibraryMaterialInfoSv LJJIZ = null;
    public boolean LJJJ = false;
    public boolean LJJJIL = false;
    public int LJJJJ = 0;
    public boolean LJJJJI = false;
    public boolean LJJJJIZL = false;
    public final XV0 LJJJJJ = new XV0(this);
    public final C84931XUx LJJJJJL = new C84931XUx(this);
    public final C84930XUw LJJJJL = new C84930XUw(this);
    public final C84943XVj LJJJJLI = new C84943XVj(this);
    public int LJJJJLL = 0;
    public boolean LJJJJZ = false;
    public boolean LJJJJZI = false;

    public final java.util.Map<String, String> LJ() {
        HashMap hashMap = new HashMap();
        hashMap.put(WM7.SCENE_SERVICE, this.LJJIIJ);
        if (!TextUtils.isEmpty(this.LJJIIJZLJL)) {
            hashMap.put("grade_key", this.LJJIIJZLJL);
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (java.lang.Boolean.valueOf(r0).booleanValue() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C34821Yg LJFF() {
        /*
            r11 = this;
            X.1Yg r0 = r11.LJJIJIIJIL
            if (r0 != 0) goto L5c
            X.1Yg r2 = new X.1Yg
            X.XUh r0 = r11.LJJIJIL
            if (r0 != 0) goto L55
            r6 = 31744(0x7c00, float:4.4483E-41)
            r4 = 0
            java.lang.String r5 = "studio_weak_network_props_shoot_music_download_downgrade"
            r3 = 1
            int r0 = X.C00F.LIZ(r6, r4, r5, r3)
            if (r0 != r3) goto L2a
            int r1 = X.IJV.LIZIZ()
            if (r1 == 0) goto L66
            r0 = 4
            if (r1 >= r0) goto L66
            r0 = 1
        L20:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L31
        L2a:
            int r1 = X.C00F.LIZ(r6, r4, r5, r3)
            r0 = 2
            if (r1 != r0) goto L64
        L31:
            r11.LJJJJI = r3
            java.lang.String r9 = r11.LJIILLIIL
            if (r9 != 0) goto L3d
            java.lang.String r9 = r11.LJIILIIL
            if (r9 != 0) goto L3d
            java.lang.String r9 = ""
        L3d:
            X.XUh r5 = new X.XUh
            android.content.Context r6 = r11.LJIIJ
            java.util.ArrayList<java.lang.String> r0 = r11.LIZLLL
            java.lang.Object r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            java.lang.String r7 = (java.lang.String) r7
            com.ss.android.ugc.aweme.music.model.Music r0 = r11.LJIIL
            if (r0 != 0) goto L5f
            r8 = 0
        L4e:
            boolean r10 = r11.LJJJJI
            r5.<init>(r6, r7, r8, r9, r10)
            r11.LJJIJIL = r5
        L55:
            X.XUh r0 = r11.LJJIJIL
            r2.<init>(r0)
            r11.LJJIJIIJIL = r2
        L5c:
            X.1Yg r0 = r11.LJJIJIIJIL
            return r0
        L5f:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r8 = r0.convertToMusicModel()
            goto L4e
        L64:
            r3 = 0
            goto L31
        L66:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84942XVi.LJFF():X.1Yg");
    }

    public static boolean LJII(Effect effect) {
        if (effect == null || TextUtils.isEmpty(effect.getExtra())) {
            return false;
        }
        try {
            if (!"true".equals(new JSONObject(effect.getExtra()).optString("no_apply_sound_in_effect_reuse"))) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public final void LIZIZ(int i) {
        Context context;
        if (this.LJII == null || (context = this.LJIIJ) == null || i > 100 || !(context instanceof Activity) || C45804HyK.LJIJJ(context).isFinishing() || !this.LJII.isShowing()) {
            return;
        }
        LJIIIZ(this.LJII, i);
    }

    public final void LJIIJ(Music music) {
        if (!CommerceMediaServiceImpl.LIZJ().LJIILLIIL(music)) {
            this.LJIIL = music;
        }
    }

    public final void LJIIL(A90 a90) {
        a90.LJ(false);
        ComponentCallbacks2 LJIJJ = C45804HyK.LJIJJ(this.LJIIJ);
        if (LJIJJ == null) {
            return;
        }
        new SafeHandler((LifecycleOwner) LJIJJ).postDelayed(new ARunnableS51S0100000_15(a90, 109), 5000L);
        a90.LJLJJLL = new C84950XVq(this);
    }

    public C84942XVi(Context context, String str) {
        this.LJIILL = "";
        this.LJIIJ = context;
        this.LJIILIIL = str;
        this.LJIILL = "";
    }

    public static void LJIIIZ(Dialog dialog, int i) {
        if (dialog == null) {
            return;
        }
        if (dialog instanceof ProgressDialogC43241Gy5) {
            ((ProgressDialogC43241Gy5) dialog).setProgress(i);
        } else {
            if (!(dialog instanceof A90)) {
                return;
            }
            ((A90) dialog).LIZLLL(i);
        }
    }

    public final void LIZJ(Effect effect, String str) {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            new C84944XVk(this, effect, str).onSuccess();
            return;
        }
        J9P.LIZIZ(C45804HyK.LJIJJ(this.LJIIJ), "prop_page", "prop_page", null, null);
        OUJ.LIZ.add(new C84945XVl(this, effect, str));
    }

    public final void LJIIJJI(Dialog dialog, int i) {
        if (i >= 20 || this.LJJJJZ) {
            return;
        }
        ExecutorC142245i8.LJLILLLLZI.LIZ(500L, new ARunnableS18S0201000_15(i, dialog, this, 4));
    }

    public static void LIZ(String str, Map.Entry entry, HashMap hashMap) {
        if (str.equals(entry.getKey())) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
    }

    public final void LJI(Effect effect, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        EditEffectAnchorManager data;
        MusicModel musicModel = null;
        if (this.LJJIFFI.isEffectControlGame(effect)) {
            this.LJIIL = null;
        }
        V0N.LJLIL = this.LJJIII;
        C84946XVm c84946XVm = new C84946XVm(this);
        int i = this.LJJJJ;
        if (!C38354F3m.LJ(this.LJIJJLI) && effect != null && (data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(this.LJIJJLI)) != null) {
            data.setEffect(effect);
        }
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay(this.LJIILIIL);
        builder.enterMethod(this.LJIIZILJ);
        builder.creationId(str);
        builder.startRecordTime(this.LJJIJ);
        builder.effectDownloadDuration(System.currentTimeMillis() - this.LJJIJ);
        builder.translationType(i);
        builder.stickers(this.LIZLLL);
        builder.giphyGifIds(this.LJ);
        builder.shootExtraData(this.LJFF);
        builder.prepareFilter(true);
        builder.firstSticker(effect);
        builder.stickerMusic(this.LJIIL);
        builder.stickerWithMusicFilePath(this.LJJIJL);
        builder.isThroughAnchor(this.LJJJ);
        builder.stickerParams(LJ());
        builder.videoLength(Integer.valueOf(this.LJJIJLIJ));
        builder.extraEventParams(c84946XVm);
        builder.recordFromFeed(this.LJJJIL);
        if (!TextUtils.isEmpty(this.LJIJJLI)) {
            builder.editEffectUID(this.LJIJJLI);
        }
        String str5 = this.LJIILLIIL;
        if (TextUtils.isEmpty(str5)) {
            Context context = this.LJIIJ;
            if (context instanceof StickerPropDetailActicity) {
                str5 = C16880lQ.LLJJIJIIJIL(((ActivityC86117Xqz) context).getIntent(), "extra_previous_page");
                if (TextUtils.isEmpty(str5)) {
                    str5 = C16880lQ.LLJJIJIIJIL(((ActivityC86117Xqz) this.LJIIJ).getIntent(), "enter_from");
                }
            }
        }
        if (TextUtils.equals("search_result", str5) || TextUtils.equals("general_search", str5) || TextUtils.equals("search_result", this.LJIJ) || TextUtils.equals("general_search", this.LJIJ)) {
            HashMap<String, String> hashMap = new HashMap<>();
            java.util.Map<String, String> LLJLLIL = Z9N.LIZIZ.LLJLLIL(str5, this.LJIJ);
            if (LLJLLIL.isEmpty()) {
                String str6 = this.LJIJI;
                C50653JuL.LJLILLLLZI.getClass();
                LLJLLIL = C50654JuM.LIZ(str6);
            }
            for (Map.Entry<String, String> entry : LLJLLIL.entrySet()) {
                LIZ("search_type", entry, hashMap);
                LIZ("search_id", entry, hashMap);
                LIZ("enter_position", entry, hashMap);
                LIZ("process_id", entry, hashMap);
                LIZ("prop_id", entry, hashMap);
                LIZ("is_from_video", entry, hashMap);
                LIZ("search_enter_position", entry, hashMap);
                LIZ("search_entrance", entry, hashMap);
                LIZ("search_keyword", entry, hashMap);
                LIZ("search_result_id", entry, hashMap);
                LIZ("list_item_id", entry, hashMap);
            }
            hashMap.put("shoot_from_search", "prop_page");
            hashMap.put("enter_method", "click_prop_publish");
            if (!hashMap.containsKey("process_id")) {
                hashMap.put("process_id", str);
            }
            if (!hashMap.containsKey("prop_id") && effect != null) {
                hashMap.put("prop_id", effect.getEffectId());
            }
            builder.extraLogParams(hashMap);
        }
        String str7 = this.LJIILLIIL;
        if (str7 != null) {
            builder.enterFrom(str7);
        }
        LibraryMaterialInfoSv libraryMaterialInfoSv = this.LJJIZ;
        if (libraryMaterialInfoSv != null) {
            builder.libraryMaterialInfo(libraryMaterialInfoSv);
        }
        if (this.LJIIL != null && !LJII(effect)) {
            if (MusicService.LJJLIIIJJI().LJJIL(this.LJIIL.convertToMusicModel(), this.LJIIJ, false)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LJIIL.getId());
                LIZ.append("");
                builder.autoUseMusic(X1D.LIZIZ(LIZ));
            }
        }
        if (z) {
            if (effect != null) {
                str3 = effect.getEffectId();
            } else {
                str3 = null;
            }
            if (this.LJIIL != null && !LJII(effect)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.LJIIL.getId());
                LIZ2.append("");
                str4 = X1D.LIZIZ(LIZ2);
            } else {
                str4 = null;
            }
            Music music = this.LJIIL;
            if (music != null) {
                musicModel = music.convertToMusicModel();
            }
            builder.recordPresetResource(new RecordPresetResource(str3, effect, str4, musicModel));
        }
        if (this.LJJJJI && this.LJJIJL == null) {
            builder.doNotLoadMusic(true);
        }
        if (this.LJIILJJIL != null && !LJII(effect)) {
            builder.musicOrigin(this.LJIILJJIL);
        }
        if (this.LJIILIIL.equals("friends_effect") && (str2 = this.LJIJJ) != null) {
            builder.enterMethod(str2);
        }
        String str8 = this.LJIJJLI;
        if (str8 != null && !str8.isEmpty() && (!this.LJJII.getData(this.LJIJJLI).isEditProp() || (C140395f9.LIZ && this.LJJII.getData(this.LJIJJLI).isEditProp()))) {
            AVExternalServiceImpl.LIZ().asyncService(this.LJIILIIL, new IDLCallbackS16S0200000_7(builder, this, 18));
            return;
        }
        String str9 = "reuse_sticker";
        if (this.LJIILIIL.equals("prop_page") || this.LJIILIIL.equals("scan")) {
            IExternalService LIZ3 = AVExternalServiceImpl.LIZ();
            if (!TextUtils.isEmpty(this.LJIILIIL)) {
                str9 = this.LJIILIIL;
            }
            LIZ3.asyncService(str9, new IDLCallbackS16S0200000_7(builder, this, 19));
            return;
        }
        IExternalService LIZ4 = AVExternalServiceImpl.LIZ();
        if (!TextUtils.isEmpty(this.LJIILIIL)) {
            str9 = this.LJIILIIL;
        }
        LIZ4.asyncServiceWithOutPanel(str9, new IDLCallbackS16S0200000_7(builder, this, 20));
    }

    public final void LIZLLL(boolean z, ArrayList arrayList, boolean z2, boolean z3) {
        this.LJIL = z2;
        this.LJJIJ = System.currentTimeMillis();
        AVExternalServiceImpl.LIZ().provideAVPerformance().start("av_video_record_init", "clickReuseSticker");
        this.LIZLLL = arrayList;
        if (!C39579Fg7.LJIILL()) {
            C5S1 c5s1 = new C5S1(this.LJIIJ);
            c5s1.LIZJ(R.string.qb6);
            c5s1.LJ();
        } else if (C39579Fg7.LJIILIIL() < 20971520) {
            C5S1 c5s12 = new C5S1(this.LJIIJ);
            c5s12.LIZJ(R.string.qb7);
            c5s12.LJ();
        } else {
            EF7.LIZIZ();
            try {
                if (C2NU.LIZ.LIZIZ() && this.LJJIIZI) {
                    if (z && !z3) {
                        if (this.LJIIJ instanceof LifecycleOwner) {
                            this.LJIIIZ = true;
                            new SafeHandler((LifecycleOwner) this.LJIIJ).postDelayed(new ARunnableS11S0101000_7(7, this, 11), 300L);
                        }
                    } else if (this.LJII == null) {
                        if (C52265KfF.LIZ) {
                            A90 a90 = new A90(this.LJIIJ);
                            this.LJII = a90;
                            a90.LIZJ(this.LJIIJ.getResources().getString(R.string.f0g));
                            ((A90) this.LJII).LIZ(false);
                            ((A90) this.LJII).LJ(false);
                            C16880lQ.LIZ(this.LJII);
                            LJIIIZ(this.LJII, 1);
                            LJIIJJI(this.LJII, 1);
                            LJIIL((A90) this.LJII);
                        } else {
                            Context context = this.LJIIJ;
                            ProgressDialogC43241Gy5 LIZIZ = ProgressDialogC43241Gy5.LIZIZ(context, context.getResources().getString(R.string.f0g));
                            this.LJII = LIZIZ;
                            LIZIZ.setIndeterminate(false);
                            LJIIIZ(this.LJII, 1);
                        }
                    } else {
                        Activity LJIJJ = C45804HyK.LJIJJ(this.LJIIJ);
                        if (LJIJJ != null && !LJIJJ.isFinishing()) {
                            LJIIIZ(this.LJII, 1);
                            if (!this.LJII.isShowing()) {
                                C16880lQ.LIZ(this.LJII);
                            }
                            if (C52265KfF.LIZ) {
                                LJIIJJI(this.LJII, 1);
                                Dialog dialog = this.LJII;
                                if (dialog instanceof A90) {
                                    LJIIL((A90) dialog);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        ArrayList<String> arrayList2 = this.LIZLLL;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.LIZJ = false;
            XV0 xv0 = this.LJJJJJ;
            C84932XUy c84932XUy = new C84932XUy(this, z3, z);
            xv0.getClass();
            n nVar = new n();
            C84942XVi c84942XVi = xv0.LIZ;
            InterfaceC84498XEg interfaceC84498XEg = c84942XVi.LIZIZ;
            if (interfaceC84498XEg == null) {
                c84942XVi.LJJIFFI.buildEffectPlatform(c84942XVi.LJIIJ, "prop_page".equals(c84942XVi.LJJIII), new C84933XUz(xv0, nVar, c84932XUy), C43941HMj.LIZ());
            } else {
                nVar.LJ(interfaceC84498XEg);
                nVar.LIZ.LIZLLL(c84932XUy);
            }
        }
    }

    public final void LJIIIIZZ(ArrayList arrayList, String str, String str2, boolean z, int i, boolean z2) {
        this.LJJIII = str;
        this.LJJIIJ = str2;
        this.LJJIJLIJ = i;
        this.LJJIIZI = !z;
        LIZLLL(z2, arrayList, false, z);
    }
}
