package Y;

import X.AnonymousClass668;
import X.AnonymousClass699;
import X.C121744qA;
import X.C123244sa;
import X.C133665Mk;
import X.C133765Mu;
import X.C136935Yz;
import X.C141315gd;
import X.C143965ku;
import X.C148915st;
import X.C150825vy;
import X.C151055wL;
import X.C151225wc;
import X.C151285wi;
import X.C151325wm;
import X.C152915zL;
import X.C152935zN;
import X.C161516Vn;
import X.C162276Yl;
import X.C162496Zh;
import X.C162556Zn;
import X.C163186ao;
import X.C169126kO;
import X.C169136kP;
import X.C169696lJ;
import X.C169946li;
import X.C17N;
import X.C1DG;
import X.C32I;
import X.C37203Eit;
import X.C39214FaE;
import X.C39579Fg7;
import X.C41363GLf;
import X.C41930Gcw;
import X.C43117Gw5;
import X.C43659HBn;
import X.C44172HVg;
import X.C45771Hxn;
import X.C47918IrK;
import X.C5KA;
import X.C5KD;
import X.C60903NvH;
import X.C62819Ol5;
import X.C62822Ol8;
import X.C62850Ola;
import X.C66T;
import X.C67P;
import X.C6IE;
import X.C73411SrX;
import X.C73426Srm;
import X.C73849Syb;
import X.C73870Syw;
import X.C76800UCe;
import X.C78685UuP;
import X.C78934UyQ;
import X.C81184Vtc;
import X.C86793Y4n;
import X.GLI;
import X.H78;
import X.H7C;
import X.InterfaceC115714gR;
import X.InterfaceC133865Ne;
import X.InterfaceC142865j8;
import X.InterfaceC153045zY;
import X.InterfaceC159596Od;
import X.InterfaceC169156kR;
import X.InterfaceC170196m7;
import X.InterfaceC41417GNh;
import X.InterfaceC43072GvM;
import X.InterfaceC65784Pro;
import X.NDG;
import X.OR7;
import X.V1B;
import X.X1D;
import X.XBM;
import Y.ARunnableS1S1200000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.qasticker.permission.QuestionAndAnswerApi;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.video2sticker.Video2StickerEditRootScene;
import com.ss.android.ugc.aweme.shoutouts.network.RealShoutoutOutApi;
import com.ss.android.ugc.aweme.shoutouts.network.ShoutoutOrderListApi;
import com.ss.android.ugc.aweme.shoutouts.network.ShoutoutsGetListResponse;
import com.ss.android.ugc.aweme.tools.draft.music.DraftSoundEffectProcessor;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckApi;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckResponse;
import com.ss.android.ugc.aweme.tools.draft.music.PermissionCheckResultBean;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUtils;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACallableS105S0100000_2 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            case 17:
                return call$17(this);
            case 18:
                return call$18(this);
            case 19:
                return call$19(this);
            case 20:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            case 23:
                return call$23(this);
            case 24:
                return call$24(this);
            case 25:
                return call$25(this);
            case 26:
                return call$26(this);
            case 27:
                return call$27(this);
            case 28:
                return call$28(this);
            case 29:
                return call$29(this);
            case 30:
                return call$30(this);
            case 31:
                return call$31(this);
            case 32:
                return call$32(this);
            case 33:
                return call$33(this);
            case 34:
                return call$34(this);
            case 35:
                return call$35(this);
            case 36:
                return call$36(this);
            case 37:
                return call$37(this);
            case 38:
                return call$38(this);
            case 39:
                return call$39(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return call$40(this);
            case 41:
                return call$41(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        return VEUtils.getVideoFileInfo(((MyMediaModel) aCallableS105S0100000_2.l0).fileLocalUriPath);
    }

    public static final Object call$1(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        List<MediaModel> list = (List) aCallableS105S0100000_2.l0;
        o.LJI(list);
        for (MediaModel mediaModel : list) {
            C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
            String str = mediaModel.fileLocalUriPath;
            c43117Gw5.getClass();
            if (!C43117Gw5.LJIIIZ(str)) {
                if (mediaModel.width <= 0 || mediaModel.height <= 0) {
                    int[] iArr = new int[10];
                    String str2 = mediaModel.fileLocalUriPath;
                    o.LJIIIIZZ(str2, "mediaModel.fileLocalUriPath");
                    if (C62819Ol5.LJIJI(str2, iArr) == 0) {
                        mediaModel.width = iArr[0];
                        mediaModel.height = iArr[1];
                    }
                }
                int i = mediaModel.width;
                int i2 = mediaModel.height;
                if (i > i2) {
                    i = i2;
                }
                if (i > 1100) {
                    return mediaModel.fileLocalUriPath;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$10(Y.ACallableS105S0100000_2 r10) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS105S0100000_2.call$10(Y.ACallableS105S0100000_2):java.lang.Object");
    }

    public static final Object call$11(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        ((Runnable) aCallableS105S0100000_2.l0).run();
        return C76800UCe.LIZ;
    }

    public static final Object call$12(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        ((Runnable) aCallableS105S0100000_2.l0).run();
        return C76800UCe.LIZ;
    }

    public static final Object call$13(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        ((Runnable) aCallableS105S0100000_2.l0).run();
        return C76800UCe.LIZ;
    }

    public static final Object call$14(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        C45771Hxn.LJII((AVMusic) aCallableS105S0100000_2.l0);
        return C76800UCe.LIZ;
    }

    public static final Object call$15(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        ((C143965ku) aCallableS105S0100000_2.l0).LLLZ();
        return C76800UCe.LIZ;
    }

    public static final Object call$16(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        C148915st c148915st = (C148915st) aCallableS105S0100000_2.l0;
        InterfaceC41417GNh LJFF = C1DG.LJFF();
        CreativeInfo creativeInfo = ((C148915st) aCallableS105S0100000_2.l0).LLLLIL().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "publishEditModel.creativeInfo");
        c148915st.LJLLLL = LJFF.LJ(new C41363GLf(creativeInfo, false));
        return C76800UCe.LIZ;
    }

    public static final Object call$17(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        DraftDBSaveResult LIZ = C60903NvH.LJIIJJI().LJJJI().LJFF().LIZ(new NDG((AwemeDraft) aCallableS105S0100000_2.l0, new GLI("EditAutoSaveDraftComponent", 20)));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("EditAutoSaveDraftComponent recoverDraft ");
        LIZ2.append(LIZ);
        H78.LJI(X1D.LIZIZ(LIZ2));
        return C76800UCe.LIZ;
    }

    public static final Object call$18(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        return Boolean.valueOf(((InterfaceC142865j8) aCallableS105S0100000_2.l0).LIZ(5000L));
    }

    public static final Object call$19(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        MediaPlayerModule mediaPlayerModule = (MediaPlayerModule) aCallableS105S0100000_2.l0;
        String str = mediaPlayerModule.LJLIL;
        int i = 0;
        if (!mediaPlayerModule.LJLJJL) {
            if (!TextUtils.isEmpty(str)) {
                C169946li c169946li = (C169946li) mediaPlayerModule.LJLILLLLZI;
                c169946li.getClass();
                C5KA.LIZ(new C5KD(new String[]{str}), C17N.LJJI(c169946li.LIZ).LJIIJ);
                c169946li.LIZ.prepare();
                mediaPlayerModule.LJLJJLL.getClass();
                long j = mediaPlayerModule.LJLJJLL.LIZLLL;
                if (j - 0 > 0) {
                    ((C169946li) mediaPlayerModule.LJLILLLLZI).LIZ(0L, j);
                }
                ((C169946li) mediaPlayerModule.LJLILLLLZI).LIZ.LLJILJIL(mediaPlayerModule.LJLJJLL.LIZJ);
                InterfaceC170196m7 interfaceC170196m7 = mediaPlayerModule.LJLILLLLZI;
                double d = mediaPlayerModule.LJLJJLL.LIZ;
                C169946li c169946li2 = (C169946li) interfaceC170196m7;
                c169946li2.LIZLLL = d;
                C133765Mu c133765Mu = c169946li2.LIZ;
                float f = (float) d;
                c133765Mu.getClass();
                C133665Mk nleEditor = c133765Mu.LIZJ;
                o.LJIIIZ(nleEditor, "nleEditor");
                if (f > 3.0f) {
                    f = 3.0f;
                }
                NLEModel LJ = nleEditor.LJ();
                o.LJIIIIZZ(LJ, "nleEditor.model");
                VecNLETrackSPtr tracks = LJ.getTracks();
                if (tracks != null) {
                    Iterator<NLETrack> it = tracks.iterator();
                    while (it.hasNext()) {
                        NLETrack it2 = it.next();
                        o.LJIIIIZZ(it2, "it");
                        it2.setSpeed(f);
                    }
                }
                nleEditor.LIZIZ();
                C17N.LJJI(((C169946li) mediaPlayerModule.LJLILLLLZI).LIZ).LJFF().LIZJ(new C121744qA(mediaPlayerModule.LJLJJLL.LIZIZ));
            } else {
                i = -1;
            }
        }
        return Integer.valueOf(i);
    }

    public static final Object call$2(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        long longValue;
        InterfaceC142865j8 interfaceC142865j8 = (InterfaceC142865j8) aCallableS105S0100000_2.l0;
        C62822Ol8 c62822Ol8 = C162276Yl.LIZ;
        if (((Number) c62822Ol8.getValue()).longValue() < 0) {
            longValue = 60000;
        } else {
            longValue = ((Number) c62822Ol8.getValue()).longValue();
        }
        return Boolean.valueOf(interfaceC142865j8.LIZ(longValue));
    }

    public static final Object call$20(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        ((InterfaceC153045zY) aCallableS105S0100000_2.l0).destroy();
        return C76800UCe.LIZ;
    }

    public static final Object call$21(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        return VEUtils.getVideoFileInfo(((MyMediaModel) aCallableS105S0100000_2.l0).fileLocalUriPath);
    }

    public static final Object call$22(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        return Boolean.valueOf(FileUtils.INSTANCE.removeFile(((VideoPublishEditModel) aCallableS105S0100000_2.l0).getVideoCoverPath()));
    }

    public static final Object call$23(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        return C44172HVg.LJJ.LJJJI().LJFF().LIZ(new NDG((AwemeDraft) aCallableS105S0100000_2.l0, new GLI("DraftEditHelper", 7)));
    }

    public static final Object call$24(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        RecommendHashtagResponse recommendHashtagResponse;
        List<RecommendHashtag> list;
        if (C162496Zh.LIZ || (recommendHashtagResponse = C162496Zh.LJFF) == null || (list = recommendHashtagResponse.items) == null || list.isEmpty()) {
            C162496Zh.LJFF = null;
            C78934UyQ.LJLIL.getMusicService().LJIILJJIL();
            C41930Gcw c41930Gcw = C41930Gcw.LIZ;
            String LJ = C41930Gcw.LJ();
            if (C78685UuP.LJJJZ(LJ)) {
                int i = C162496Zh.LIZIZ + 1;
                C162496Zh.LIZIZ = i;
                C162496Zh.LIZ(LJ, i, (EditInfo) aCallableS105S0100000_2.l0);
            } else {
                C78934UyQ.LJLIL.getMusicService().LJIILJJIL();
                C73426Srm LJFF = c41930Gcw.LJFF();
                if (LJFF != null) {
                    C73870Syw LJJLIIIJJIZ = LJFF.LJJLIIIJJIZ(2L, TimeUnit.SECONDS, new InterfaceC115714gR() { // from class: X.6Zm
                        @Override // X.InterfaceC115714gR
                        public final void LIZ(InterfaceC116954iR<? super String> it) {
                            o.LJIIIZ(it, "it");
                            it.onError(new RuntimeException("time out"));
                        }
                    });
                    EditInfo editInfo = (EditInfo) aCallableS105S0100000_2.l0;
                    C162496Zh.LIZJ = (C73411SrX) LJJLIIIJJIZ.LJJJLIIL(new AfS54S0100000_2(editInfo, 22), new AfS54S0100000_2(editInfo, 23));
                } else {
                    int i2 = C162496Zh.LIZIZ + 1;
                    C162496Zh.LIZIZ = i2;
                    C162496Zh.LIZ(null, i2, (EditInfo) aCallableS105S0100000_2.l0);
                }
            }
        } else if (!((EditInfo) aCallableS105S0100000_2.l0).isEqualWith(C162496Zh.LJ)) {
            C78934UyQ.LJLIL.getMusicService().LJIILJJIL();
            String LJ2 = C41930Gcw.LJ();
            int i3 = C162496Zh.LIZIZ + 1;
            C162496Zh.LIZIZ = i3;
            C162496Zh.LIZ(LJ2, i3, (EditInfo) aCallableS105S0100000_2.l0);
        } else {
            C73849Syb<RecommendHashtagResponse> c73849Syb = C162496Zh.LJIIIZ;
            if (c73849Syb != null) {
                c73849Syb.onError(new C162556Zn(1007L, "The request condition is not met"));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$25(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        AnonymousClass699.LIZ().LJI(AnonymousClass699.LIZIZ().LIZ, false, (IFetchEffectChannelListener) aCallableS105S0100000_2.l0);
        return null;
    }

    public static final Object call$26(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        DraftSoundEffectProcessor draftSoundEffectProcessor = (DraftSoundEffectProcessor) aCallableS105S0100000_2.l0;
        InterfaceC169156kR interfaceC169156kR = draftSoundEffectProcessor.LJLILLLLZI;
        if (interfaceC169156kR != null) {
            interfaceC169156kR.LIZ(draftSoundEffectProcessor.LJLJJI);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object call$27(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        boolean z;
        ((DraftSoundEffectProcessor) aCallableS105S0100000_2.l0).getClass();
        int i = 0;
        if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode() && C47918IrK.LIZ(C60903NvH.LJ)) {
            DraftSoundEffectProcessor draftSoundEffectProcessor = (DraftSoundEffectProcessor) aCallableS105S0100000_2.l0;
            List<SoundEffect> list = draftSoundEffectProcessor.LJLJI;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (hashSet.add(V1B.LJJLIIIJLLLLLLLZ((SoundEffect) next))) {
                    arrayList.add(next);
                }
            }
            C169126kO c169126kO = new C169126kO();
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                SoundEffect soundEffect = (SoundEffect) it2.next();
                PermissionCheckApi.PermissionCheckEntity permissionCheckEntity = new PermissionCheckApi.PermissionCheckEntity();
                permissionCheckEntity.setIdType(4);
                permissionCheckEntity.setId(V1B.LJJLIIIJLLLLLLLZ(soundEffect));
                permissionCheckEntity.setCheckType(4);
                arrayList2.add(permissionCheckEntity);
            }
            c169126kO.LIZ = arrayList2;
            PermissionCheckResponse LIZ = C169136kP.LIZ(c169126kO);
            if (LIZ == null) {
                H7C.LJI(3, "SoundEffect", "checkSoundEffectPermission", "response is null");
                List<SoundEffect> list2 = draftSoundEffectProcessor.LJLJI;
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(list2, 10));
                Iterator it3 = ((ArrayList) list2).iterator();
                while (it3.hasNext()) {
                    arrayList3.add(V1B.LJJLIIIJLLLLLLLZ((SoundEffect) it3.next()));
                }
                DraftSoundEffectProcessor.LIZ(0, "response is null", arrayList3);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("response: ");
                LIZ2.append(LIZ.result);
                H7C.LJI(3, "SoundEffect", "checkSoundEffectPermission", X1D.LIZIZ(LIZ2));
                List<PermissionCheckResultBean> list3 = LIZ.result;
                if (list3 == null || list3.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (PermissionCheckResultBean permissionCheckResultBean : list3) {
                        List<C123244sa> list4 = draftSoundEffectProcessor.LJLJJI;
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = ((ArrayList) list4).iterator();
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            if (o.LJ(((C123244sa) next2).LJLIL, permissionCheckResultBean.id)) {
                                arrayList4.add(next2);
                            }
                        }
                        Iterator it5 = arrayList4.iterator();
                        while (it5.hasNext()) {
                            C123244sa c123244sa = (C123244sa) it5.next();
                            c123244sa.LJLILLLLZI = permissionCheckResultBean.allowCurrent;
                            String str = permissionCheckResultBean.reason;
                            o.LJIIIZ(str, "<set-?>");
                            c123244sa.LJLJJI = str;
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (PermissionCheckResultBean permissionCheckResultBean2 : list3) {
                        if (!permissionCheckResultBean2.allowCurrent) {
                            arrayList5.add(permissionCheckResultBean2);
                        }
                    }
                    if (!arrayList5.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        for (PermissionCheckResultBean permissionCheckResultBean3 : list3) {
                            if (!permissionCheckResultBean3.allowCurrent) {
                                arrayList6.add(permissionCheckResultBean3);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList(C32I.LJJL(arrayList6, 10));
                        Iterator it6 = arrayList6.iterator();
                        while (it6.hasNext()) {
                            arrayList7.add(((PermissionCheckResultBean) it6.next()).id);
                        }
                        DraftSoundEffectProcessor.LIZ(2, "", arrayList7);
                    } else {
                        List<SoundEffect> list5 = draftSoundEffectProcessor.LJLJI;
                        ArrayList arrayList8 = new ArrayList(C32I.LJJL(list5, 10));
                        Iterator it7 = ((ArrayList) list5).iterator();
                        while (it7.hasNext()) {
                            arrayList8.add(V1B.LJJLIIIJLLLLLLLZ((SoundEffect) it7.next()));
                        }
                        DraftSoundEffectProcessor.LIZ(1, "", arrayList8);
                    }
                } else {
                    List<SoundEffect> list6 = draftSoundEffectProcessor.LJLJI;
                    ArrayList arrayList9 = new ArrayList(C32I.LJJL(list6, 10));
                    Iterator it8 = ((ArrayList) list6).iterator();
                    while (it8.hasNext()) {
                        arrayList9.add(V1B.LJJLIIIJLLLLLLLZ((SoundEffect) it8.next()));
                    }
                    DraftSoundEffectProcessor.LIZ(1, "", arrayList9);
                }
            }
        }
        DraftSoundEffectProcessor draftSoundEffectProcessor2 = (DraftSoundEffectProcessor) aCallableS105S0100000_2.l0;
        Iterator it9 = ((ArrayList) draftSoundEffectProcessor2.LJLJI).iterator();
        while (it9.hasNext()) {
            int i2 = i + 1;
            SoundEffect soundEffect2 = (SoundEffect) it9.next();
            if (draftSoundEffectProcessor2.LJLIL.LIZ.ugcTemplateData.isUgcTemplateFromAnchor) {
                ((C123244sa) ListProtector.get(draftSoundEffectProcessor2.LJLJJI, i)).LJLJI = C39579Fg7.LIZIZ(soundEffect2.fileLocalPath);
            } else {
                C123244sa c123244sa2 = (C123244sa) ListProtector.get(draftSoundEffectProcessor2.LJLJJI, i);
                o.LJIIIZ(soundEffect2, "soundEffect");
                c123244sa2.LJLJI = C86793Y4n.LJIILL(C141315gd.LIZ(soundEffect2));
            }
            i = i2;
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$28(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        Iterator<String> it = ((C136935Yz) aCallableS105S0100000_2.l0).LIZ.iterator();
        while (it.hasNext()) {
            XBM.LJ(it.next());
        }
        ((C136935Yz) aCallableS105S0100000_2.l0).LIZ.clear();
        return C76800UCe.LIZ;
    }

    public static final Object call$29(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        return new C152935zN((VideoPublishEditModel) aCallableS105S0100000_2.l0);
    }

    public static final Object call$3(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        return Integer.valueOf(((InterfaceC153045zY) ((InterfaceC65784Pro) aCallableS105S0100000_2.l0).invoke()).pause());
    }

    public static final Object call$30(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        C67P c67p = new C67P(C60903NvH.LJ, C150825vy.LIZ, (TextStickerData) aCallableS105S0100000_2.l0, false, new C43659HBn(), Boolean.FALSE);
        int layoutWidth = (int) ((TextStickerData) aCallableS105S0100000_2.l0).getLayoutWidth();
        int layoutHeight = (int) ((TextStickerData) aCallableS105S0100000_2.l0).getLayoutHeight();
        Bitmap createBitmap = Bitmap.createBitmap(layoutWidth, layoutHeight, Bitmap.Config.ARGB_8888);
        createBitmap.setDensity(C60903NvH.LJ.getResources().getDisplayMetrics().densityDpi);
        Canvas canvas = new Canvas(createBitmap);
        c67p.measure(View.MeasureSpec.makeMeasureSpec(layoutWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutHeight, 1073741824));
        c67p.layout(0, 0, layoutWidth, layoutHeight);
        C37203Eit.LIZJ.getClass();
        C39214FaE.LIZ(c67p, canvas);
        return createBitmap;
    }

    public static final Object call$31(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        String productId = ((C163186ao) aCallableS105S0100000_2.l0).LLJJ().getProductId();
        o.LJI(productId);
        ShoutoutsGetListResponse shoutoutsGetListResponse = ((ShoutoutOrderListApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, ShoutoutOrderListApi.Api.class)).get(6, productId, 1).execute().LIZIZ;
        o.LJIIIIZZ(shoutoutsGetListResponse, "api.get(6, pid, 1).execute().body()");
        return shoutoutsGetListResponse;
    }

    public static final Object call$32(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        o.LJI(((C163186ao) aCallableS105S0100000_2.l0).LLJJ().getProductId());
        BaseResponse baseResponse = ((RealShoutoutOutApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, RealShoutoutOutApi.Api.class)).get().execute().LIZIZ;
        o.LJIIIIZZ(baseResponse, "api.get().execute().body()");
        return baseResponse;
    }

    public static final Object call$33(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        return ((InterfaceC159596Od) aCallableS105S0100000_2.l0).LIZJ();
    }

    public static final Object call$34(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        C66T c66t = (C66T) aCallableS105S0100000_2.l0;
        c66t.LJII = false;
        c66t.LIZJ.Rq().setValue(Boolean.FALSE);
        final C66T c66t2 = (C66T) aCallableS105S0100000_2.l0;
        c66t2.LIZIZ.LLJJJJJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, new InterfaceC133865Ne() { // from class: X.66U
            @Override // X.InterfaceC133865Ne
            public final void LIZ(int i) {
                C66T c66t3 = C66T.this;
                VEEditorAutoStartStopArbiter value = c66t3.LIZJ.wz().getValue();
                if (value != null && value.LJLLI) {
                    c66t3.LIZIZ.play();
                }
                int i2 = 1;
                ByteBuffer[] byteBufferArr = new ByteBuffer[1];
                C122034qd LJJI = C17N.LJJI(C66T.this.LIZIZ);
                if (LJJI != null) {
                    LJJI.LJIIIIZZ().LIZ().LIZJ(C66T.this.LIZLLL, byteBufferArr);
                    V1M.LJJJZ(C66T.this.LJ, byteBufferArr[0]);
                    C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(C66T.this.LIZLLL);
                    if (LJJJJLI instanceof C121514pn) {
                        ((C121514pn) LJJJJLI).LJIJ = C66T.this.LJ;
                        LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                    } else if (LJJJJLI instanceof C121594pv) {
                        ((C121594pv) LJJJJLI).LJIIJJI = C66T.this.LJ;
                        LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                    }
                    C66T c66t4 = C66T.this;
                    C66I c66i = c66t4.LJI;
                    if (c66i != null) {
                        String str = c66t4.LJ;
                        C153075zb c153075zb = c66t4.LJFF;
                        C1548265u c1548265u = c66i.LIZ.LJLJI;
                        if (c1548265u != null) {
                            c1548265u.post(new RunnableC09750Zv(i2, c66i, c153075zb, str));
                        }
                    }
                    C66T c66t5 = C66T.this;
                    c66t5.LIZIZ.LLFF(c66t5.LJIIJ);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object call$35(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        C66T c66t = (C66T) aCallableS105S0100000_2.l0;
        c66t.LJII = true;
        c66t.LIZJ.Rq().setValue(Boolean.TRUE);
        return C76800UCe.LIZ;
    }

    public static final Object call$36(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        return C152915zL.LIZ((VideoPublishEditModel) aCallableS105S0100000_2.l0);
    }

    public static final Object call$37(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        return ((QuestionAndAnswerApi) C60903NvH.LJIIJJI().getNetworkService().createDefaultRetrofit(QuestionAndAnswerApi.class)).getAllowUserToQuestion().LIZLLL(new AgS120S0100000_2((C6IE) aCallableS105S0100000_2.l0, 36));
    }

    public static final Object call$38(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        ((InterfaceC65784Pro) aCallableS105S0100000_2.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$39(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        int LIZJ = C81184Vtc.LIZJ((Context) aCallableS105S0100000_2.l0);
        if (LIZJ != AnonymousClass668.LIZIZ().LIZLLL()) {
            AnonymousClass668.LIZIZ().LIZJ(LIZJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        return Integer.valueOf(((InterfaceC153045zY) ((InterfaceC65784Pro) aCallableS105S0100000_2.l0).invoke()).play());
    }

    public static final Object call$40(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        C161516Vn c161516Vn = (C161516Vn) aCallableS105S0100000_2.l0;
        c161516Vn.LJI = false;
        c161516Vn.LIZJ.Rq().setValue(Boolean.FALSE);
        final C161516Vn c161516Vn2 = (C161516Vn) aCallableS105S0100000_2.l0;
        c161516Vn2.LIZIZ.LLJJJJJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, new InterfaceC133865Ne() { // from class: X.6Vm
            @Override // X.InterfaceC133865Ne
            public final void LIZ(int i) {
                C161516Vn.this.LIZIZ.play();
                ByteBuffer[] byteBufferArr = new ByteBuffer[1];
                C122034qd LJJI = C17N.LJJI(C161516Vn.this.LIZIZ);
                if (LJJI != null) {
                    LJJI.LJIIIIZZ().LIZ().LIZJ(C161516Vn.this.LIZLLL, byteBufferArr);
                    V1M.LJJJZ(C161516Vn.this.LJ, byteBufferArr[0]);
                    C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(C161516Vn.this.LIZLLL);
                    if (LJJJJLI instanceof C121514pn) {
                        ((C121514pn) LJJJJLI).LJIJ = C161516Vn.this.LJ;
                        LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                    } else if (LJJJJLI instanceof C121594pv) {
                        ((C121594pv) LJJJJLI).LJIIJJI = C161516Vn.this.LJ;
                        LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                    }
                    C161516Vn c161516Vn3 = C161516Vn.this;
                    C6W7 c6w7 = c161516Vn3.LJFF;
                    if (c6w7 != null) {
                        c6w7.LIZ.LJLJI.post(new ARunnableS1S1200000_2(c6w7, null, c161516Vn3.LJ, 2));
                    }
                    C161516Vn c161516Vn4 = C161516Vn.this;
                    c161516Vn4.LIZIZ.LLFF(c161516Vn4.LJIIIZ);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object call$41(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        C161516Vn c161516Vn = (C161516Vn) aCallableS105S0100000_2.l0;
        c161516Vn.LJI = true;
        c161516Vn.LIZJ.Rq().setValue(Boolean.TRUE);
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        VideoPublishEditModel videoPublishEditModel = ((Video2StickerEditRootScene) aCallableS105S0100000_2.l0).LJLJJL;
        if (videoPublishEditModel != null) {
            CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
            OR7.LLLIIL(new File(LJ.LIZIZ(creativeInfo)));
            InterfaceC43072GvM LJ2 = C62850Ola.LJ();
            VideoPublishEditModel videoPublishEditModel2 = ((Video2StickerEditRootScene) aCallableS105S0100000_2.l0).LJLJJL;
            if (videoPublishEditModel2 != null) {
                CreativeInfo creativeInfo2 = videoPublishEditModel2.creativeInfo;
                o.LJIIIIZZ(creativeInfo2, "model.creativeInfo");
                return Boolean.valueOf(OR7.LLLIIL(new File(LJ2.LIZLLL(creativeInfo2))));
            }
            o.LJIJI("model");
            throw null;
        }
        o.LJIJI("model");
        throw null;
    }

    public static final Object call$6(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        ((Runnable) aCallableS105S0100000_2.l0).run();
        return C76800UCe.LIZ;
    }

    public static final Object call$7(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        ((Runnable) aCallableS105S0100000_2.l0).run();
        return C76800UCe.LIZ;
    }

    public static final Object call$8(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        ((C151055wL) aCallableS105S0100000_2.l0).LLJJJIL(false);
        return C76800UCe.LIZ;
    }

    public static final Object call$9(ACallableS105S0100000_2 aCallableS105S0100000_2) {
        C151325wm c151325wm;
        C151055wL c151055wL = (C151055wL) aCallableS105S0100000_2.l0;
        C151225wc c151225wc = c151055wL.LJLLL;
        if (c151225wc == null || (c151325wm = c151225wc.LIZ) == null) {
            return null;
        }
        TEImageInterface tEImageInterface = c151325wm.LJII;
        if (tEImageInterface != null) {
            tEImageInterface.executeConfirmRender();
        }
        if (c151055wL.LJLIL.getEditImageInfo().getScaleAfterCrop() != null) {
            float f = c151055wL.LJLLLL;
            float f2 = c151055wL.LJLLLLLL - c151055wL.LLJJ().getEditRect().bottom;
            float f3 = c151055wL.LJLLLLLL - c151055wL.LLJJ().getEditRect().top;
            TEImageInterface tEImageInterface2 = c151325wm.LJII;
            if (tEImageInterface2 != null) {
                tEImageInterface2.cutoutImage("scissor", 0.0f, f, f3, f2);
            }
        }
        C151285wi c151285wi = c151055wL.LJLJLJ;
        if (c151285wi != null) {
            Bitmap LJI = c151325wm.LJI();
            boolean autoEnhanceOn = c151055wL.LJLILLLLZI.getAutoEnhanceOn();
            Bitmap bitmap = c151285wi.LJFF;
            if (bitmap != null) {
                bitmap.recycle();
            }
            c151285wi.LJFF = LJI;
            c151285wi.LJI = autoEnhanceOn;
            c151285wi.LJIIJ = true;
            return c151325wm;
        }
        o.LJIJI("imageViewManager");
        throw null;
    }

    public ACallableS105S0100000_2(AwemeDraft awemeDraft, int i) {
        this.$t = i;
        switch (i) {
            case 17:
                this.l0 = awemeDraft;
                return;
            default:
                this.l0 = awemeDraft;
                return;
        }
    }

    public ACallableS105S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
