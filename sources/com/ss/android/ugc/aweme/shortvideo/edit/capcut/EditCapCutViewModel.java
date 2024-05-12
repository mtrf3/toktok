package com.ss.android.ugc.aweme.shortvideo.edit.capcut;

import X.C137915b9;
import X.C164846dU;
import X.C221108m2;
import X.C38485F8n;
import X.C48841JEv;
import X.C5L5;
import X.C60903NvH;
import X.C62822Ol8;
import X.C64962gm;
import X.C78613UtF;
import X.C78685UuP;
import X.C78688UuS;
import X.C84661XKn;
import X.EXV;
import X.EnumC164816dR;
import X.G8X;
import X.InterfaceC61312at;
import X.MBA;
import X.XKX;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutTTCreativeData;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditCapCutViewModel extends LifecycleAwareViewModel<EditCapCutState> {
    public static final /* synthetic */ int LJLLJ = 0;
    public final C64962gm LJLJL;
    public final C64962gm LJLJLJ;
    public C84661XKn LJLJLLL;
    public String LJLL;
    public VideoPublishEditModel LJLLI;
    public String LJLLILLLL;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0009 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Jv0() {
        /*
            r2 = this;
            java.lang.String r1 = r2.LJLLILLLL
            int r0 = r1.hashCode()
            switch(r0) {
                case -1804349567: goto L3c;
                case -1135080564: goto L30;
                case -1099143885: goto L24;
                case -663599038: goto L18;
                case 1075196024: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r0 = ""
        Lb:
            return r0
        Lc:
            java.lang.String r0 = "infoSticker_addTextTemplate"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L9
        L15:
            java.lang.String r0 = "tiktok_publishpage_infoSticker_addTextTemplate"
            goto Lb
        L18:
            java.lang.String r0 = "video_aiMatting"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L9
        L21:
            java.lang.String r0 = "tiktok_publishpage_video_aiMatting"
            goto Lb
        L24:
            java.lang.String r0 = "video_speed_curve"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2d
            goto L9
        L2d:
            java.lang.String r0 = "tiktok_publishpage_video_speed_curve"
            goto Lb
        L30:
            java.lang.String r0 = "video_anim_root"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L39
            goto L9
        L39:
            java.lang.String r0 = "tiktok_publishpage_video_anim_root"
            goto Lb
        L3c:
            java.lang.String r0 = "video_motionBlur"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L45
            goto L9
        L45:
            java.lang.String r0 = "tiktok_publishpage_video_motionBlur"
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel.Jv0():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new EditCapCutState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public EditCapCutViewModel() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C137915b9.LJLIL);
        this.LJLJL = C48841JEv.LIZ(C78613UtF.LIZJ.plus((MBA) LIZIZ.getValue()));
        this.LJLJLJ = C48841JEv.LIZ(EXV.LIZ.plus((MBA) LIZIZ.getValue()));
        this.LJLLILLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    }

    public static void Kv0(VideoPublishEditModel videoPublishEditModel) {
        String str;
        List<AVTextExtraStruct> list;
        InteractStickerTracksContext interactStickerContext;
        List<InteractStickerStruct> stickerStructsByPage;
        InteractStickerStruct interactStickerStruct;
        Gson LIZ = C60903NvH.LJIIJJI().LIZ();
        o.LJIIIZ(videoPublishEditModel, "<this>");
        C164846dU mainBusinessContext = videoPublishEditModel.getMainBusinessContext();
        QaStruct qaStruct = null;
        if (mainBusinessContext != null && (interactStickerContext = mainBusinessContext.getInteractStickerContext()) != null && (stickerStructsByPage = interactStickerContext.getStickerStructsByPage(EnumC164816dR.TRACK_PAGE_EDIT)) != null) {
            Iterator<InteractStickerStruct> it = stickerStructsByPage.iterator();
            while (true) {
                if (it.hasNext()) {
                    interactStickerStruct = it.next();
                    if (interactStickerStruct.getQaStruct() != null) {
                        break;
                    }
                } else {
                    interactStickerStruct = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
            if (interactStickerStruct2 != null) {
                qaStruct = interactStickerStruct2.getQaStruct();
            }
        }
        C60903NvH.LJIIJJI().getPublishService().LJIIJ();
        boolean LIZ2 = G8X.LIZ(videoPublishEditModel);
        if (LIZ2) {
            str = videoPublishEditModel.creativeModel.postPageModel.captionModel.markupText;
        } else {
            str = videoPublishEditModel.creativeModel.postPageModel.markupCaption;
        }
        if (LIZ2) {
            list = videoPublishEditModel.creativeModel.postPageModel.captionModel.markupExtra;
        } else {
            list = videoPublishEditModel.creativeModel.postPageModel.markupExtra;
        }
        String creationId = videoPublishEditModel.getCreationId();
        o.LJIIIIZZ(creationId, "creationId");
        EditCapCutTTCreativeData.ChallengeData challengeData = new EditCapCutTTCreativeData.ChallengeData(videoPublishEditModel.challenges, videoPublishEditModel.creativeModel.commerceModel.getRecordChallenge(), videoPublishEditModel.getRecordEffectChallenges(), videoPublishEditModel.creativeModel.commerceModel.getMission());
        CommentVideoModel commentVideoModel = videoPublishEditModel.commentVideoModel;
        if (qaStruct == null) {
            qaStruct = videoPublishEditModel.qaStruct;
        }
        String json = GsonProtectorUtils.toJson(LIZ, new EditCapCutTTCreativeData(creationId, challengeData, commentVideoModel, qaStruct, new EditCapCutTTCreativeData.TitleData(videoPublishEditModel.getStructList(), videoPublishEditModel.title, str, list, videoPublishEditModel.getChain(), videoPublishEditModel.isDisableDeleteChain()), MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel)));
        File LJJJIL = C78688UuS.LJJJIL();
        o.LJIIIIZZ(json, "json");
        C38485F8n.LLLII(LJJJIL, json);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Lv0(X.InterfaceC67352kd<? super X.C76800UCe> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C5Z4
            if (r0 == 0) goto L48
            r4 = r6
            X.5Z4 r4 = (X.C5Z4) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L5b
            com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel r2 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L22:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 != 0) goto L4e
        L2a:
            X.5vK r0 = X.C150425vK.LJLIL
            r2.setStateImmediate(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L32:
            X.C141335gf.LIZJ(r3)
            X.XKn r0 = r5.LJLJLLL
            if (r0 == 0) goto L46
            r4.LJLIL = r5
            r4.LJLJJI = r1
            java.lang.Object r3 = r0.LJJIJ(r4)
            if (r3 != r2) goto L44
            return r2
        L44:
            r2 = r5
            goto L22
        L46:
            r2 = r5
            goto L2a
        L48:
            X.5Z4 r4 = new X.5Z4
            r4.<init>(r5, r6)
            goto L12
        L4e:
            kotlin.jvm.internal.AqS168S0100000_2 r1 = new kotlin.jvm.internal.AqS168S0100000_2
            r0 = 144(0x90, float:2.02E-43)
            r1.<init>(r2, r0)
            r2.setStateImmediate(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel.Lv0(X.2kd):java.lang.Object");
    }

    public final void Mv0(boolean z, boolean z2) {
        if (!C78685UuP.LJJJZ(this.LJLL) && z2) {
            XKX.LIZLLL(this.LJLJLJ, null, null, new C5L5(z, this, null), 3);
        }
    }
}
