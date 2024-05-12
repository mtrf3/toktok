package X;

import Y.ACListenerS15S1300000_7;
import Y.ACListenerS42S0200000_7;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.trending.TrendingUploadModel;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.StitchSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokPublishGroupSceneFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.utils.Au2S4S0400000_7;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS184S0100000_2;
import ujb.o;
import yq4.a;

/* renamed from: X.G6q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40984G6q {
    public static final /* synthetic */ int LJIJJLI = 0;
    public final AbstractC42651GoZ LIZ;
    public final Fragment LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final CommerceToolsTcmModel LJ;
    public Context LJFF;
    public boolean LJI;
    public G7M LJII;
    public View LJIIIIZZ;
    public boolean LJIIIZ;
    public C81556Vzc LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public AI8 LJIILJJIL;
    public final boolean LJIILL;
    public List<G63> LJIILLIIL;
    public VideoPublishEditModel LJIIZILJ;
    public String LJIJ;
    public G5Q LJIJI;
    public G5Q LJIJJ;

    public final void LJ() {
        AI9 ai9;
        String str;
        AIF aif;
        AIF aif2;
        CharSequence LJIIJJI;
        AI8 ai8 = this.LJIILJJIL;
        AI9 ai92 = null;
        if (ai8 != null) {
            ai9 = ai8.getAccessory();
        } else {
            ai9 = null;
        }
        if ((ai9 instanceof AIF) && (aif2 = (AIF) ai9) != null && (LJIIJJI = aif2.LJIIJJI()) != null) {
            str = LJIIJJI.toString();
        } else {
            str = null;
        }
        if (!o.LJJJJIZL(str, this.LJIJ, false)) {
            AI8 ai82 = this.LJIILJJIL;
            if (ai82 != null) {
                ai92 = ai82.getAccessory();
            }
            if (!(ai92 instanceof AIF) || (aif = (AIF) ai92) == null) {
                return;
            }
            aif.LJIILIIL(this.LJIJ);
        }
    }

    public final boolean LJIIL() {
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel;
        VideoPublishEditModel videoPublishEditModel = this.LJIIZILJ;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (extractAVMusic != null && extractAVMusic.isPreventDownload()) {
            return true;
        }
        return false;
    }

    public final void LJIILLIIL() {
        String str;
        int i;
        AI8 ai8;
        int i2;
        if (this.LJIIJJI && CommerceToolsTcmServiceImpl.LJIJJ().LJIJ()) {
            this.LJIIL = true;
            Context context = this.LJFF;
            if (context != null) {
                if (CommerceToolsTcmServiceImpl.LJIJJ().LJIIJ()) {
                    i2 = R.string.s4s;
                } else {
                    i2 = R.string.piu;
                }
                str = context.getString(i2);
            } else {
                kotlin.jvm.internal.o.LJIJI("mContext");
                throw null;
            }
        } else if (CommerceToolsTcmServiceImpl.LJIJJ().LJIJ()) {
            this.LJIIL = true;
            Context context2 = this.LJFF;
            if (context2 != null) {
                if (CommerceToolsTcmServiceImpl.LJIJJ().LJIIJ()) {
                    i = R.string.s4t;
                } else {
                    i = R.string.piv;
                }
                str = context2.getString(i);
            } else {
                kotlin.jvm.internal.o.LJIJI("mContext");
                throw null;
            }
        } else {
            str = "";
        }
        kotlin.jvm.internal.o.LJIIIIZZ(str, "if (isHDHintShow && Serv…  )\n            } else \"\"");
        if (str.length() > 0 && (ai8 = this.LJIILJJIL) != null) {
            ai8.setSubtitle(str);
        }
        if (C40981G6n.LIZ() && !this.LJIIJJI && !this.LJIIL) {
            LJIJ();
        }
    }

    public final void LJIJ() {
        AI8 ai8 = this.LJIILJJIL;
        if (ai8 != null) {
            Context context = this.LJFF;
            if (context != null) {
                ai8.setSubtitle(context.getString(R.string.p7m));
            } else {
                kotlin.jvm.internal.o.LJIJI("mContext");
                throw null;
            }
        }
        this.LJIIJJI = false;
        this.LJIIL = false;
        C78685UuP.LJJZZI();
    }

    public static int LJI(CommonSettingItemStatus allowAutoCaptionSettingItem) {
        kotlin.jvm.internal.o.LJIIIZ(allowAutoCaptionSettingItem, "allowAutoCaptionSettingItem");
        if (!CrossLanguageUserExperiment.LIZJ().LIZIZ()) {
            return 0;
        }
        if (kotlin.jvm.internal.o.LJ(allowAutoCaptionSettingItem._checked.getValue(), Boolean.TRUE)) {
            return 1;
        }
        return -1;
    }

    public static void LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
        c145995oB.LJI("enter_from", "video_post_page");
        c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
        c145995oB.LJI("content_source", H7R.LJJIFFI(videoPublishEditModel));
        c145995oB.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        FMX.LJIIL("click_advanced_settings_entrance", c145995oB.LIZ);
    }

    public final void LIZIZ(LinearLayout linearLayout) {
        AI8 ai8;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(linearLayout.getContext()), R.layout.blm, linearLayout, false);
        this.LJIIIIZZ = LLLLIILL.findViewById(R.id.e5g);
        this.LJIILJJIL = (AI8) LLLLIILL.findViewById(R.id.ifd);
        if (C40981G6n.LIZ()) {
            C26012AIu.LIZ(R.raw.icon_ellipsis_horizontal, this.LJIILJJIL);
            String string = linearLayout.getContext().getString(R.string.qv);
            kotlin.jvm.internal.o.LJIIIIZZ(string, "parent.context.getString(R.string.Publish_setting)");
            C26012AIu.LIZIZ(this.LJIILJJIL, string);
        }
        C26338AVi.LJIIIZ(LLLLIILL, 0, 0, 0, 0, 16);
        linearLayout.addView(LLLLIILL);
        if (!this.LIZLLL || Keva.getRepo("sponsored_video_keva").getBoolean("sponsored", false) || (ai8 = this.LJIILJJIL) == null) {
            return;
        }
        ai8.setShowAlertBadge(true);
    }

    public final void LJIIIIZZ(int i) {
        AIF aif;
        AI8 ai8 = this.LJIILJJIL;
        kotlin.jvm.internal.o.LJI(ai8);
        ai8.setAlpha(1.0f);
        VideoPublishEditModel videoPublishEditModel = this.LJIIZILJ;
        if (videoPublishEditModel != null) {
            H7R.LJJJJLL(videoPublishEditModel);
        }
        String LIZJ = SaveLocalHelper.LIZJ(i);
        if (this.LJII != null) {
            List<G63> list = this.LJIILLIIL;
            if (list != null) {
                for (G63 g63 : list) {
                    if (g63.LIZ == 102) {
                        g63.LJI = LIZJ;
                        G7M g7m = this.LJII;
                        if (g7m != null) {
                            g7m.LLJILJIL();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        AI8 ai82 = this.LJIILJJIL;
        AI9 ai9 = null;
        if (ai82 != null) {
            ai9 = ai82.getAccessory();
        }
        if ((ai9 instanceof AIF) && (aif = (AIF) ai9) != null) {
            aif.LJIILIIL(LIZJ);
        }
        LJIJI(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(boolean r9) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40984G6q.LJIIIZ(boolean):void");
    }

    public final void LJIIZILJ(NavigationScene navigationScene) {
        View currentFocus;
        C81556Vzc c81556Vzc = this.LJIIJ;
        if (c81556Vzc != null) {
            c81556Vzc.LLJJIJI(this.LIZ);
            return;
        }
        Context context = this.LJFF;
        IBinder iBinder = null;
        if (context != null) {
            Object LLILL = C16880lQ.LLILL(context, "input_method");
            kotlin.jvm.internal.o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) LLILL;
            View view = this.LIZIZ.getView();
            if (view != null) {
                iBinder = view.getWindowToken();
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 2);
            ActivityC45651qj mo49getActivity = this.LIZIZ.mo49getActivity();
            if (mo49getActivity != null && (currentFocus = mo49getActivity.getCurrentFocus()) != null) {
                currentFocus.clearFocus();
            }
            G7M g7m = this.LJII;
            if (g7m != null) {
                g7m.LLJILJILJ(navigationScene);
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.LJIJI("mContext");
        throw null;
    }

    public final void LJIJI(int i) {
        AI9 ai9;
        AIF aif;
        String string;
        AI8 ai8 = this.LJIILJJIL;
        if (ai8 != null) {
            ai9 = ai8.getAccessory();
        } else {
            ai9 = null;
        }
        if (!(ai9 instanceof AIF) || (aif = (AIF) ai9) == null) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                Context context = this.LJFF;
                if (context != null) {
                    string = context.getString(R.string.j8d);
                } else {
                    kotlin.jvm.internal.o.LJIJI("mContext");
                    throw null;
                }
            } else {
                Context context2 = this.LJFF;
                if (context2 != null) {
                    string = context2.getString(R.string.chr);
                } else {
                    kotlin.jvm.internal.o.LJIJI("mContext");
                    throw null;
                }
            }
        } else {
            Context context3 = this.LJFF;
            if (context3 != null) {
                string = context3.getString(R.string.chs);
            } else {
                kotlin.jvm.internal.o.LJIJI("mContext");
                throw null;
            }
        }
        aif.LJIILIIL(string);
    }

    public static String LJFF(CommonSettingItemStatus item, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(item, "item");
        Boolean value = item._checked.getValue();
        Integer value2 = item._visibility.getValue();
        if (GAE.LIZ()) {
            return "not_display";
        }
        if (z) {
            return "gray";
        }
        if (value2 != null && value2.intValue() == 8) {
            return "not_display";
        }
        if (kotlin.jvm.internal.o.LJ(value, Boolean.TRUE)) {
            return "on";
        }
        return "off";
    }

    public static boolean LJIILL(VideoPublishEditModel videoPublishEditModel, List list) {
        int i;
        if (H7R.LJJJJL(videoPublishEditModel) || list == null || ((ArrayList) list).isEmpty()) {
            return false;
        }
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() >= 2) {
            return true;
        }
        if ((!C44739Hh9.LIZIZ() || IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getSaveAtPost() || !G6L.LIZIZ()) && arrayList.size() == 1) {
            if (videoPublishEditModel.hasSubtitle() && !H7R.LJJIIZ(videoPublishEditModel)) {
                i = 102;
            } else {
                i = 1;
            }
            if (((G63) ListProtector.get(arrayList, 0)).LIZ == i) {
                return false;
            }
        }
        return true;
    }

    public final void LJIILJJIL(Fragment fragment, VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        kotlin.jvm.internal.o.LJIIIZ(fragment, "fragment");
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            if (videoPublishEditModel != null) {
                z = H7R.LJJJJLL(videoPublishEditModel);
            } else {
                z = false;
            }
            int LIZIZ = SaveLocalHelper.LIZIZ(z);
            boolean LIZ = G8M.LIZ(videoPublishEditModel);
            boolean z2 = this.LJIIIZ;
            SelectSaveLocalOptionActivity.LJLJJL = videoPublishEditModel;
            Intent intent = new Intent(mo49getActivity, (Class<?>) SelectSaveLocalOptionActivity.class);
            intent.putExtra("extra_save_option", LIZIZ);
            intent.putExtra("mute_download", LIZ);
            intent.putExtra("download_gray_tag", z2);
            C16880lQ.LJFF(mo49getActivity, 7, intent);
            if (!C44674Hg6.LIZ()) {
                mo49getActivity.overridePendingTransition(R.anim.o, R.anim.n);
            }
        }
    }

    public static void LJIIJJI(LinearLayout parent, List publishSettingList, VideoPublishEditModel source) {
        Object obj;
        AEY aey;
        kotlin.jvm.internal.o.LJIIIZ(parent, "parent");
        kotlin.jvm.internal.o.LJIIIZ(publishSettingList, "publishSettingList");
        kotlin.jvm.internal.o.LJIIIZ(source, "source");
        if (LJIILL(source, publishSettingList) || !C40983G6p.LIZ()) {
            return;
        }
        Iterator it = ((ArrayList) publishSettingList).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            } else {
                obj = it.next();
            }
        } while (((G63) obj).LIZ != 11);
        G63 g63 = (G63) obj;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.bly, parent, false);
        kotlin.jvm.internal.o.LJII(LLLLIILL, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
        AI8 ai8 = (AI8) LLLLIILL;
        if (g63 != null) {
            if (C40981G6n.LIZ()) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = g63.LIZLLL;
                c2068389v.LJ = Integer.valueOf(R.attr.go);
                ai8.setIcon(c2068389v);
                T5R t5r = new T5R(g63.LIZIZ);
                t5r.LIZ(42);
                ai8.setTitle(t5r);
            }
            ai8.setSubtitle(g63.LIZJ);
            AI9 accessory = ai8.getAccessory();
            if ((accessory instanceof AI2) && (aey = (AEY) accessory) != null) {
                aey.LJIILIIL(g63.LJ);
                aey.LJIILJJIL(new AqS154S0200000_7(ai8, g63, 88));
            }
        }
        parent.addView(ai8, new LinearLayout.LayoutParams(-1, -2));
    }

    public C40984G6q(AbstractC42651GoZ rootScene, TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment, boolean z, CommerceToolsTcmModel tcmModel) {
        kotlin.jvm.internal.o.LJIIIZ(rootScene, "rootScene");
        kotlin.jvm.internal.o.LJIIIZ(tcmModel, "tcmModel");
        this.LIZ = rootScene;
        this.LIZIZ = tikTokPublishGroupSceneFragment;
        this.LIZJ = 5;
        this.LIZLLL = z;
        this.LJ = tcmModel;
        C60903NvH.LJIIJJI().LJJIL().getReactDuetSettingCurrent(2);
        C60903NvH.LJIIJJI().LJJIL().getStitchSettingCurrent(0);
        this.LJI = true;
        this.LJIIIZ = true;
        this.LJIILL = G6L.LIZ();
        this.LJIJ = "";
    }

    public static G7M LJII(boolean z, VideoPublishEditModel videoPublishEditModel, VideoPublishViewModel publishViewModel, CommerceToolsTcmModel commerceToolsTcmModel) {
        AVMusic extractAVMusic;
        boolean z2;
        int i;
        VideoTrendingTopic videoTrendingTopic;
        TrendingUploadModel trendingUploadModel;
        CreativeModel creativeModel;
        TrendingUploadModel trendingUploadModel2;
        Bundle LIZ = C01R.LIZ("key_enable_sponsor", z);
        LIZ.putBoolean("key_general_music", G6L.LIZJ(videoPublishEditModel));
        boolean z3 = false;
        if (videoPublishEditModel == null || (extractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel)) == null || !extractAVMusic.isCommerceMusic()) {
            z2 = false;
        } else {
            z2 = true;
        }
        LIZ.putBoolean("key_commerce_music", z2);
        if (videoPublishEditModel != null) {
            i = H7R.LJI(videoPublishEditModel);
        } else {
            i = -1;
        }
        LIZ.getInt("key_aweme_type", i);
        LIZ.putParcelable("key_tcm_model", commerceToolsTcmModel);
        String str = null;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (trendingUploadModel2 = creativeModel.trendingUploadModel) != null) {
            videoTrendingTopic = trendingUploadModel2.trendingTopic;
        } else {
            videoTrendingTopic = null;
        }
        LIZ.putSerializable("key_trending_topic", videoTrendingTopic);
        if (videoPublishEditModel != null) {
            CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
            if (creativeModel2 != null && (trendingUploadModel = creativeModel2.trendingUploadModel) != null) {
                LIZ.putInt("key_trending_topic_status", trendingUploadModel.trendingTopicStatus);
            }
            z3 = H7R.LJJJJLL(videoPublishEditModel);
        }
        LIZ.putBoolean("key_multi_photo_mode", z3);
        if (videoPublishEditModel != null) {
            str = H7R.LJIIIZ(videoPublishEditModel);
        }
        LIZ.putString("content_type", str);
        kotlin.jvm.internal.o.LJIIIZ(publishViewModel, "publishViewModel");
        G7M g7m = new G7M(publishViewModel);
        g7m.mArguments = LIZ;
        return g7m;
    }

    public final void LJIIJ(LinearLayout linearLayout, List<G63> list, VideoPublishEditModel videoPublishEditModel, VideoPublishViewModel videoPublishViewModel) {
        int i;
        AIF aif;
        LIZIZ(linearLayout);
        if (videoPublishEditModel.hasSubtitle() && !H7R.LJJIIZ(videoPublishEditModel)) {
            i = 102;
        } else {
            i = 1;
        }
        AI9 ai9 = null;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((G63) next).LIZ == i) {
                    if (next != null) {
                        arrayList.remove(next);
                    }
                }
            }
        }
        AI8 ai8 = this.LJIILJJIL;
        if (ai8 != null) {
            ai9 = ai8.getAccessory();
        }
        if ((ai9 instanceof AIF) && (aif = (AIF) ai9) != null) {
            aif.LJIILJJIL(new Au2S4S0400000_7(this, videoPublishEditModel, videoPublishViewModel, linearLayout, 0));
        }
        boolean LJJJJL = H7R.LJJJJL(videoPublishEditModel);
        H7R.LJJLIIIJL(videoPublishEditModel);
        LJIIIZ(LJJJJL);
    }

    public static C40992G6y LIZ(C29S activity, VideoPublishEditModel model, CommonSettingItemStatus allowAutoCaptionSettingItem, int i, G6O bubbleViewManager) {
        Boolean valueOf;
        boolean z;
        kotlin.jvm.internal.o.LJIIIZ(activity, "activity");
        kotlin.jvm.internal.o.LJIIIZ(model, "model");
        kotlin.jvm.internal.o.LJIIIZ(allowAutoCaptionSettingItem, "allowAutoCaptionSettingItem");
        kotlin.jvm.internal.o.LJIIIZ(bubbleViewManager, "bubbleViewManager");
        if (C44172HVg.LJIJ.isChildrenMode()) {
            allowAutoCaptionSettingItem._visibility.setValue(8);
            return null;
        }
        if (H7R.LJJJJL(model)) {
            allowAutoCaptionSettingItem._visibility.setValue(8);
            return null;
        }
        if (model.hasSubtitle()) {
            allowAutoCaptionSettingItem._visibility.setValue(8);
            return null;
        }
        if (!CrossLanguageUserExperiment.LIZJ().LIZIZ()) {
            allowAutoCaptionSettingItem._visibility.setValue(8);
            return null;
        }
        C40992G6y c40992G6y = new C40992G6y(activity, allowAutoCaptionSettingItem, model, bubbleViewManager, G6M.LJLIL);
        VideoPublishEditModel videoPublishEditModel = c40992G6y.LIZJ;
        if (videoPublishEditModel.mIsFromDraft) {
            MutableLiveData<Boolean> mutableLiveData = c40992G6y.LIZIZ._checked;
            if (videoPublishEditModel.allowAutoCaptionSetting > 0) {
                z = true;
            } else {
                z = false;
            }
            mutableLiveData.setValue(Boolean.valueOf(z));
        } else {
            MutableLiveData<Boolean> mutableLiveData2 = c40992G6y.LIZIZ._checked;
            if (GAE.LIZ()) {
                valueOf = Boolean.TRUE;
            } else {
                valueOf = Boolean.valueOf(C40987G6t.LIZ.getBoolean("key_auto_caption_manual_operation", C52250Kf0.LIZIZ()));
            }
            mutableLiveData2.setValue(valueOf);
        }
        c40992G6y.LJ(i, kotlin.jvm.internal.o.LJ(c40992G6y.LIZIZ._checked.getValue(), Boolean.TRUE), true);
        if (GAE.LIZ()) {
            allowAutoCaptionSettingItem._visibility.setValue(8);
        }
        return c40992G6y;
    }

    public final void LIZJ(LinearLayout viewContainer, VideoPublishEditModel model, HashMap hashMap, String str, StitchSettingItemStatus stitchSettingItem) {
        boolean z;
        boolean z2;
        Integer M;
        boolean booleanValue;
        kotlin.jvm.internal.o.LJIIIZ(viewContainer, "viewContainer");
        kotlin.jvm.internal.o.LJIIIZ(model, "model");
        kotlin.jvm.internal.o.LJIIIZ(stitchSettingItem, "stitchSettingItem");
        if (C44172HVg.LJIJ.isChildrenMode()) {
            return;
        }
        G5Q g5q = new G5Q(stitchSettingItem, new WeakReference(viewContainer.getContext()));
        this.LJIJJ = g5q;
        kotlin.jvm.internal.o.LJIIIIZZ(viewContainer.getContext(), "viewContainer.context");
        CommonSettingItemStatus commonSettingItemStatus = g5q.LIZ;
        CreativeModel creativeModel = model.creativeModel;
        boolean z3 = true;
        if (creativeModel.postPageModel.publishSettingApplied && !creativeModel.draftInfoModel.isDraft) {
            C60903NvH.LJIIJJI().LJJIL().setStitchSettingChanged(true);
            C60903NvH.LJIIJJI().LJJIL().setStitchSettingCurrent(model.stitchSetting);
        }
        boolean stitchSettingChanged = C60903NvH.LJIIJJI().LJJIL().getStitchSettingChanged(false);
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (stitchSettingChanged) {
            if (C60903NvH.LJIIJJI().LJJIL().getStitchSettingCurrent(0) == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        G5P g5p = new G5P("stitch");
        if (e1.LIZ(31744, "studio_enable_stitch", true, false) && (!H7R.LJJJJL(model) ? !((!model.isShoutout() || !ShoutOutsData.MODE_POST.equals(model.mShoutOutsData.getShoutOutsMode())) && model.getVideoLength() <= 0) : C41491GQd.LIZIZ(model))) {
            z2 = true;
        } else {
            z2 = false;
        }
        g5p.LIZIZ = z2;
        g5p.LIZJ = z;
        boolean LJJJJL = H7R.LJJJJL(model);
        g5p.LJIIIIZZ = LJJJJL;
        if (LJJJJL) {
            g5p.LJIIIZ = R.string.p6d;
        }
        if (commonSettingItemStatus instanceof StitchSettingItemStatus) {
            Boolean value = ((StitchSettingItemStatus) commonSettingItemStatus)._commerceActive.getValue();
            if (value == null) {
                booleanValue = false;
            } else {
                booleanValue = value.booleanValue();
            }
            g5p.LJII = booleanValue;
        }
        g5p.LIZLLL = model.getVideoLength();
        g5p.LJ = R.string.h1c;
        g5p.LJFF = R.string.tnl;
        g5p.LJI = R.string.rpp;
        g5p.LJIIJ = new ACListenerS15S1300000_7(model, commonSettingItemStatus, str, hashMap, 2);
        PrivacyUserSettingsV2 privacyUserSettings = a.LJIILIIL().getPrivacyUserSettings();
        if (privacyUserSettings == null || (M = privacyUserSettings.M("stitch")) == null || M.intValue() != 3) {
            z3 = false;
        }
        g5p.LJIIJJI = z3;
        g5p.LJIIL = C78983UzD.LJJJJJL(model);
        g5q.LIZ(g5p);
    }

    public final void LIZLLL(LinearLayout parent, List<G63> publishSettingList, VideoPublishEditModel source, VideoPublishViewModel publishViewModel, G6F g6f) {
        boolean z;
        AI9 ai9;
        AI9 ai92;
        AEY aey;
        AEY aey2;
        int LIZJ;
        AI8 ai8;
        AIF aif;
        Object obj;
        String str;
        AIF aif2;
        G6A g6a;
        kotlin.jvm.internal.o.LJIIIZ(parent, "parent");
        kotlin.jvm.internal.o.LJIIIZ(publishSettingList, "publishSettingList");
        kotlin.jvm.internal.o.LJIIIZ(source, "source");
        kotlin.jvm.internal.o.LJIIIZ(publishViewModel, "publishViewModel");
        this.LJIIZILJ = source;
        boolean LJIILL = LJIILL(source, publishSettingList);
        this.LJIILLIIL = publishSettingList;
        Context context = parent.getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(context, "parent.context");
        this.LJFF = context;
        if (C44739Hh9.LIZIZ()) {
            boolean z2 = false;
            int LIZIZ = 0;
            z2 = false;
            if (!IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getSaveAtPost()) {
                if (!G6L.LIZIZ()) {
                    if (LJIILL) {
                        LJIIJ(parent, publishSettingList, source, publishViewModel);
                        return;
                    }
                    return;
                }
                if (g6f != null && (g6a = g6f.LIZ) != null) {
                    ((C40990G6w) g6a).LIZ.setSaveLocalEnabled(false);
                }
                AI9 ai93 = null;
                if (LJIILL) {
                    Iterator it = ((ArrayList) publishSettingList).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((G63) obj).LIZ == 1) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    G63 g63 = (G63) obj;
                    if (g63 != null) {
                        String string = parent.getContext().getString(R.string.q9l);
                        kotlin.jvm.internal.o.LJIIIIZZ(string, "parent.context.getString(R.string.save_to_album)");
                        g63.LIZIZ = string;
                        if (C40985G6r.LIZ()) {
                            str = parent.getContext().getString(R.string.tvs);
                            kotlin.jvm.internal.o.LJIIIIZZ(str, "{\n            parent.con…hare_copy_save)\n        }");
                        } else {
                            str = "";
                        }
                        g63.LIZJ = str;
                    }
                    if (LJIIL() && g63 != null) {
                        g63.LJ = false;
                        if (g63.LJIIIZ == null && g63 != null) {
                            g63.LJIIIZ = new AqS184S0100000_2(parent, 64);
                        }
                    }
                    LIZIZ(parent);
                    AI8 ai82 = this.LJIILJJIL;
                    if (ai82 != null) {
                        ai93 = ai82.getAccessory();
                    }
                    if ((ai93 instanceof AIF) && (aif2 = (AIF) ai93) != null) {
                        aif2.LJIILJJIL(new Au2S4S0400000_7(this, source, publishViewModel, parent, 1));
                    }
                    LJIIIZ(H7R.LJJJJL(source));
                    return;
                }
                if (source.hasSubtitle()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.bj5, parent, false);
                    kotlin.jvm.internal.o.LJII(LLLLIILL, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
                    AI8 ai83 = (AI8) LLLLIILL;
                    this.LJIILJJIL = ai83;
                    if (LJIIL() || G8M.LIZ(source)) {
                        AI8 ai84 = this.LJIILJJIL;
                        kotlin.jvm.internal.o.LJI(ai84);
                        ai84.setAlpha(0.34f);
                    }
                    if (!LJIIL()) {
                        LIZIZ = SaveLocalHelper.LIZIZ(H7R.LJJJJLL(source));
                    }
                    LJIJI(LIZIZ);
                    AI9 accessory = ai83.getAccessory();
                    if ((accessory instanceof AIF) && (aif = (AIF) accessory) != null) {
                        aif.LJIILJJIL(new ACListenerS42S0200000_7(this, source, 27));
                    }
                } else {
                    View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.bj6, parent, false);
                    kotlin.jvm.internal.o.LJII(LLLLIILL2, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
                    this.LJIILJJIL = (AI8) LLLLIILL2;
                    if (LJIIL() || G8M.LIZ(source)) {
                        AI8 ai85 = this.LJIILJJIL;
                        kotlin.jvm.internal.o.LJI(ai85);
                        ai85.setAlpha(0.34f);
                    }
                    AI8 ai86 = this.LJIILJJIL;
                    if (ai86 != null) {
                        ai9 = ai86.getAccessory();
                    } else {
                        ai9 = null;
                    }
                    if ((ai9 instanceof AI2) && (aey2 = (AEY) ai9) != null) {
                        if (!LJIIL() && SaveLocalHelper.LIZ(H7R.LJJJJLL(source))) {
                            z2 = true;
                        }
                        aey2.LJIILIIL(z2);
                    }
                    AI8 ai87 = this.LJIILJJIL;
                    if (ai87 != null) {
                        ai92 = ai87.getAccessory();
                    } else {
                        ai92 = null;
                    }
                    if ((ai92 instanceof AI2) && (aey = (AEY) ai92) != null) {
                        aey.LJIILJJIL(new AqS154S0200000_7(this, source, 92));
                    }
                }
                if (C40981G6n.LIZ()) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_arrow_to_down;
                    c2068389v.LJ = Integer.valueOf(R.attr.go);
                    AI8 ai88 = this.LJIILJJIL;
                    if (ai88 != null) {
                        ai88.setIcon(c2068389v);
                    }
                    AI8 ai89 = this.LJIILJJIL;
                    if (ai89 != null) {
                        Context context2 = this.LJFF;
                        if (context2 != null) {
                            T5R t5r = new T5R(context2.getString(R.string.q9l));
                            t5r.LIZ(42);
                            ai89.setTitle(t5r);
                        } else {
                            kotlin.jvm.internal.o.LJIJI("mContext");
                            throw null;
                        }
                    }
                }
                if (C40985G6r.LIZ() && (ai8 = this.LJIILJJIL) != null) {
                    ai8.setSubtitle(parent.getResources().getString(R.string.tvs));
                }
                if (C40985G6r.LIZ()) {
                    LIZJ = -2;
                } else {
                    LIZJ = (int) KL2.LIZJ(this.LIZIZ.getContext(), 52.0f);
                }
                parent.addView(this.LJIILJJIL, new LinearLayout.LayoutParams(-1, LIZJ));
                return;
            }
        }
        if (LJIILL) {
            LJIIJ(parent, publishSettingList, source, publishViewModel);
        }
    }
}
