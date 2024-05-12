package Y;

import X.AbstractC42152GgW;
import X.C164106cI;
import X.C16880lQ;
import X.C188727au;
import X.C40984G6q;
import X.C41457GOv;
import X.C42150GgU;
import X.C42437Gl7;
import X.C42926Gt0;
import X.C44296Ha0;
import X.C45804HyK;
import X.C45927I0t;
import X.C46127I8l;
import X.C46132I8q;
import X.C46193IAz;
import X.C50605JtZ;
import X.C60903NvH;
import X.C74310TEk;
import X.C74413TIj;
import X.C78915Uy7;
import X.C78983UzD;
import X.C79004UzY;
import X.C79061V1d;
import X.FMX;
import X.G5D;
import X.G5F;
import X.G5K;
import X.G5Q;
import X.G63;
import X.G6D;
import X.GWJ;
import X.H7R;
import X.I0N;
import X.InterfaceC74309TEj;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.model.DuetSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.StitchSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObserverS71S0200000_7 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS71S0200000_7 aObserverS71S0200000_7, Object obj) {
        C41457GOv it = (C41457GOv) obj;
        CommerceToolsTcmServiceImpl commerceToolsTcmServiceImpl = (CommerceToolsTcmServiceImpl) aObserverS71S0200000_7.l0;
        CommerceToolsTcmModel commerceToolsTcmModel = (CommerceToolsTcmModel) aObserverS71S0200000_7.l1;
        o.LJIIIIZZ(it, "it");
        commerceToolsTcmServiceImpl.LJIILLIIL(commerceToolsTcmModel, it);
    }

    public static final void onChanged$1(AObserverS71S0200000_7 aObserverS71S0200000_7, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String uniqueId;
        String uniqueId2;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObserverS71S0200000_7.l0;
        ExtensionDataRepo extensionDataRepo = (ExtensionDataRepo) aObserverS71S0200000_7.l1;
        G6D g6d = (G6D) obj;
        videoPublishContainerScene.getClass();
        if (g6d == null) {
            return;
        }
        int permission = g6d.getPermission();
        boolean z5 = false;
        if (extensionDataRepo.getUpdateAnchor().getValue() != null) {
            extensionDataRepo.setIPermissionAction(new G5F(videoPublishContainerScene, permission, extensionDataRepo, g6d));
            if (extensionDataRepo.getShowPermissionAction() != null && !extensionDataRepo.getShowPermissionAction().invoke(Integer.valueOf(permission)).booleanValue()) {
                if (permission != 1) {
                    extensionDataRepo.getI18nPrivacy().setValue(Boolean.TRUE);
                } else {
                    extensionDataRepo.getI18nPrivacy().setValue(Boolean.FALSE);
                }
                G5K g5k = videoPublishContainerScene.LLIIIILZ;
                if (g5k != null) {
                    g5k.LIZIZ(g6d.getExcludeUserList(), permission, 0, videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIJIIJI);
                }
            }
        } else {
            if (permission != 1) {
                extensionDataRepo.getI18nPrivacy().setValue(Boolean.TRUE);
            } else {
                extensionDataRepo.getI18nPrivacy().setValue(Boolean.FALSE);
            }
            videoPublishContainerScene.LLIIIILZ.LIZIZ(g6d.getExcludeUserList(), permission, g6d.getAllowRecommend(), videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIJIIJI);
        }
        if (videoPublishContainerScene.LLI != null) {
            g6d.getExcludeUserList();
        }
        if (IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).needShowAddOrRemoveButton()) {
            if (permission == 0 && !C78983UzD.LJJJJJL(videoPublishContainerScene.LLILZLL)) {
                videoPublishContainerScene.LJZI._alpha.setValue(Float.valueOf(1.0f));
                videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJJJ = true;
            } else {
                videoPublishContainerScene.LJZI._alpha.setValue(Float.valueOf(0.3f));
                G5D g5d = videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel;
                g5d.LJJJJ = false;
                g5d.LJJJIL = "";
                g5d.LJJJJI = "";
                videoPublishContainerScene.LJZI._nameText.setValue("");
            }
        }
        VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
        int i = 2;
        if (videoPublishEditModel != null && !C79004UzY.LJJIFFI(videoPublishEditModel.tagUserList)) {
            C60903NvH.LJIIJJI().getRegionService();
            boolean booleanValue = C44296Ha0.LIZIZ().booleanValue();
            ArrayList arrayList = new ArrayList();
            if (permission == 1 || permission == 4) {
                Iterator<InteractionTagUserInfo> it = videoPublishContainerScene.LLILZLL.tagUserList.iterator();
                while (it.hasNext()) {
                    InteractionTagUserInfo next = it.next();
                    if (booleanValue) {
                        uniqueId = next.getNickname();
                    } else {
                        uniqueId = next.getUniqueId();
                    }
                    arrayList.add(uniqueId);
                }
                videoPublishContainerScene.LLILZLL.tagUserList.clear();
            } else if (permission == 2) {
                Iterator<InteractionTagUserInfo> it2 = videoPublishContainerScene.LLILZLL.tagUserList.iterator();
                while (it2.hasNext()) {
                    InteractionTagUserInfo next2 = it2.next();
                    if (next2.getFollowStatus() != 2) {
                        if (booleanValue) {
                            uniqueId2 = next2.getNickname();
                        } else {
                            uniqueId2 = next2.getUniqueId();
                        }
                        arrayList.add(uniqueId2);
                        it2.remove();
                    }
                }
            }
            if (!C79004UzY.LJJIFFI(arrayList) && arrayList.toString().length() >= 2) {
                String LLLZ = C16880lQ.LLLZ(videoPublishContainerScene.getString(R.string.s2b), new Object[]{C79061V1d.LJ(arrayList.toString(), 1, 1)});
                Activity requireActivity = videoPublishContainerScene.requireActivity();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(LLLZ);
                C78915Uy7.LJJIIZI(requireActivity, 2002, creativeToastBuilder);
            }
            videoPublishContainerScene.LLLII();
        }
        if (permission == 4) {
            videoPublishContainerScene.LLLLLIL(true);
        } else if (videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJIILLIIL == 4 && videoPublishContainerScene.LJZL.LIZIZ().isEmpty()) {
            DuetSettingItemStatus duetSettingItemStatus = videoPublishContainerScene.LJLLLLLL;
            C40984G6q c40984G6q = videoPublishContainerScene.LLILZ;
            G5Q g5q = c40984G6q.LJIJI;
            if (g5q != null && g5q.LIZIZ) {
                z = true;
            } else {
                z = false;
            }
            duetSettingItemStatus._isDisabled = z;
            StitchSettingItemStatus stitchSettingItemStatus = videoPublishContainerScene.LJLZ;
            G5Q g5q2 = c40984G6q.LJIJJ;
            if (g5q2 != null && g5q2.LIZIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            stitchSettingItemStatus._isDisabled = z2;
            if (!duetSettingItemStatus._isDisabled && !GWJ.LIZIZ(videoPublishContainerScene.LLILZLL.getVideoLength()) && !H7R.LJJJJL(videoPublishContainerScene.LLILZLL)) {
                videoPublishContainerScene.LJLLLLLL._alpha.setValue(Float.valueOf(1.0f));
            }
            MutableLiveData<Boolean> mutableLiveData = videoPublishContainerScene.LJLLLLLL._checked;
            if (C60903NvH.LJIIJJI().LJJIL().getReactDuetSettingCurrent(2) == 1 && !videoPublishContainerScene.LJLLLLLL._isDisabled) {
                z3 = true;
            } else {
                z3 = false;
            }
            mutableLiveData.setValue(Boolean.valueOf(z3));
            if (!videoPublishContainerScene.LJLZ._isDisabled && !GWJ.LIZIZ(videoPublishContainerScene.LLILZLL.getVideoLength()) && !H7R.LJJJJL(videoPublishContainerScene.LLILZLL)) {
                videoPublishContainerScene.LJLZ._alpha.setValue(Float.valueOf(1.0f));
            }
            MutableLiveData<Boolean> mutableLiveData2 = videoPublishContainerScene.LJLZ._checked;
            if (C60903NvH.LJIIJJI().LJJIL().getStitchSettingCurrent(0) == 0 && !videoPublishContainerScene.LJLZ._isDisabled) {
                z4 = true;
            } else {
                z4 = false;
            }
            mutableLiveData2.setValue(Boolean.valueOf(z4));
            Iterator it3 = ((ArrayList) videoPublishContainerScene.LLJJ).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                G63 g63 = (G63) it3.next();
                if (g63.LIZ == 5) {
                    g63.LJIIL = videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJIIZILJ;
                    int allowCreateStickerCurrent = C60903NvH.LJIIJJI().LJJIL().getAllowCreateStickerCurrent(2);
                    CreativeModel creativeModel = videoPublishContainerScene.LLILZLL.creativeModel;
                    if (!creativeModel.transientPostPageModel.LJIIZILJ) {
                        i = allowCreateStickerCurrent;
                        if (allowCreateStickerCurrent == 1) {
                            z5 = true;
                        }
                    }
                    g63.LJ = z5;
                    creativeModel.privacySettingModel.allowCreateSticker = i;
                }
            }
        }
        videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJIILLIIL = permission;
    }

    public static final void onChanged$2(AObserverS71S0200000_7 aObserverS71S0200000_7, Object obj) {
        C46132I8q c46132I8q = (C46132I8q) ((C45927I0t) obj).LIZIZ();
        if (c46132I8q == null) {
            return;
        }
        C46127I8l c46127I8l = (C46127I8l) aObserverS71S0200000_7.l0;
        c46127I8l.LJLJL = true;
        Effect effect = c46132I8q.LJLILLLLZI;
        c46127I8l.LJLL = c46132I8q.LJLJI;
        c46127I8l.LJLJLLL = effect.getEffectId();
        C46127I8l c46127I8l2 = (C46127I8l) aObserverS71S0200000_7.l0;
        c46127I8l2.LJLJJLL = effect;
        if (c46132I8q.LJLIL) {
            I0N i0n = c46127I8l2.LJLIL;
            if (i0n == null) {
                return;
            }
            i0n.Sl(true, false);
            return;
        }
        c46127I8l2.LIZ((C164106cI) aObserverS71S0200000_7.l1, effect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$3(AObserverS71S0200000_7 aObserverS71S0200000_7, Object obj) {
        PanelInfoModelTemplate panelInfoModelTemplate;
        String categoryKey;
        C74413TIj c74413TIj = (C74413TIj) obj;
        if (c74413TIj != null && (panelInfoModelTemplate = (PanelInfoModelTemplate) c74413TIj.LIZ) != null) {
            InterfaceC74309TEj interfaceC74309TEj = (InterfaceC74309TEj) aObserverS71S0200000_7.l0;
            C46193IAz c46193IAz = (C46193IAz) aObserverS71S0200000_7.l1;
            CategoryEffectModel categoryEffectModel = panelInfoModelTemplate.getCategoryEffectModel();
            if (categoryEffectModel == null || (categoryKey = categoryEffectModel.getCategoryKey()) == null || categoryKey.length() == 0 || categoryEffectModel == null) {
                return;
            }
            C74310TEk.LIZIZ(interfaceC74309TEj, false, 15).removeObserver(aObserverS71S0200000_7);
            LiveData LIZ = C74310TEk.LIZ(interfaceC74309TEj, categoryEffectModel.getCategoryKey(), false, 14);
            c46193IAz.getLifecycleOwner();
            LIZ.observe(c46193IAz, new AObserverS67S0300000_7(c46193IAz, categoryEffectModel, interfaceC74309TEj, 2));
        }
    }

    public static final void onChanged$4(AObserverS71S0200000_7 aObserverS71S0200000_7, Object obj) {
        View view = (View) aObserverS71S0200000_7.l0;
        String str = null;
        if (view != null && view.getParent() != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C42437Gl7 c42437Gl7 = (C42437Gl7) aObserverS71S0200000_7.l1;
            if (currentTimeMillis - c42437Gl7.LJLJJLL > 2500) {
                String aid = c42437Gl7.LJLILLLLZI.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                Music music = ((C42437Gl7) aObserverS71S0200000_7.l1).LJLILLLLZI.getMusic();
                if (music != null) {
                    str = music.getIdStr();
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "personal_homepage");
                c188727au.LJIIIZ("group_id", aid);
                c188727au.LJIIIZ("music_id", str);
                FMX.LJIIL("snackbar_show", c188727au.LIZ);
                ((C42437Gl7) aObserverS71S0200000_7.l1).LJLJJLL = System.currentTimeMillis();
            }
        }
    }

    public static final void onChanged$5(AObserverS71S0200000_7 aObserverS71S0200000_7, Object obj) {
        float f;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) aObserverS71S0200000_7.l0;
            C42926Gt0 c42926Gt0 = (C42926Gt0) aObserverS71S0200000_7.l1;
            boolean booleanValue = bool.booleanValue();
            if (!anchorPublishStruct.extensionMisc.isImageMode()) {
                ConstraintLayout constraintLayout = c42926Gt0.LJLJJI;
                if (booleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                constraintLayout.setAlpha(f);
            }
        }
    }

    public static final void onChanged$6(AObserverS71S0200000_7 aObserverS71S0200000_7, Object obj) {
        Integer num = (Integer) obj;
        int LJIIJJI = C50605JtZ.LJIIJJI();
        if (num == null || num.intValue() != LJIIJJI) {
            IAVPublishService iAVPublishService = (IAVPublishService) aObserverS71S0200000_7.l0;
            Context context = ((View) aObserverS71S0200000_7.l1).getContext();
            o.LJIIIIZZ(context, "view.context");
            iAVPublishService.hideProgress(C45804HyK.LJJIFFI(context));
            return;
        }
        IAVPublishService iAVPublishService2 = (IAVPublishService) aObserverS71S0200000_7.l0;
        Context context2 = ((View) aObserverS71S0200000_7.l1).getContext();
        o.LJIIIIZZ(context2, "view.context");
        iAVPublishService2.showProgress(C45804HyK.LJJIFFI(context2), false);
    }

    public static final void onChanged$7(AObserverS71S0200000_7 aObserverS71S0200000_7, Object obj) {
        if (o.LJ(obj, Boolean.TRUE)) {
            ((AbstractC42152GgW) aObserverS71S0200000_7.l0).LIZIZ();
            ((AbstractC42152GgW) aObserverS71S0200000_7.l0).LIZ((C42150GgU) aObserverS71S0200000_7.l1);
            ((AbstractC42152GgW) aObserverS71S0200000_7.l0).LJLJI.removeObserver(aObserverS71S0200000_7);
        }
    }

    public AObserverS71S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
