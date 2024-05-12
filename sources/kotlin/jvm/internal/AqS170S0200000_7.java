package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C00F;
import X.C10K;
import X.C117404jA;
import X.C145995oB;
import X.C16880lQ;
import X.C170666ms;
import X.C212428Vi;
import X.C268713r;
import X.C39163FYp;
import X.C41662GWs;
import X.C41877Gc5;
import X.C43212Gxc;
import X.C43814HHm;
import X.C44172HVg;
import X.C61712OJw;
import X.C61713OJx;
import X.C76800UCe;
import X.C85977Xoj;
import X.C86V;
import X.GWN;
import X.GXR;
import X.H00;
import X.H78;
import X.HG3;
import X.I9T;
import X.IBJ;
import X.IBK;
import X.IC3;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.RBX;
import X.WUK;
import X.X1D;
import Y.ACallableS56S0300000_7;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.question.QuestionDetailFragment;
import com.ss.android.ugc.aweme.question.model.QuestionDetailResponse;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import defpackage.e1;
import defpackage.g0;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AqS170S0200000_7 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            default:
                return null;
        }
    }

    public final void invoke$0(boolean z, String str) {
        String str2 = "";
        AVMusic aVMusic = null;
        if (!z) {
            H78.LJI("illegal draft music checked");
            AwemeDraft awemeDraft = (AwemeDraft) this.l0;
            awemeDraft.LIZLLL = null;
            awemeDraft.LJI = null;
            awemeDraft.LJIILIIL = 0;
            awemeDraft.LJIIIZ = (int) ((WUK.LJIJI / WUK.LJIJJ) * 100);
            awemeDraft.LJJJJI.isDraftMusicIllegal = true;
            ((Keva) C43814HHm.LIZIZ.getValue()).storeBoolean(awemeDraft.LIZ(), false);
            I9T.LJI(null, false, ((AwemeDraft) this.l0).LIZ.musicBuzModel);
            C41662GWs c41662GWs = new C41662GWs();
            c41662GWs.LIZ = "";
            c41662GWs.LIZIZ = "";
            c41662GWs.LIZJ = 0;
            c41662GWs.LJ = false;
            c41662GWs.LJFF = null;
            g0.LJJIL(((DraftViewModel) this.l1).LJLJLJ, c41662GWs);
            return;
        }
        if (C41877Gc5.LIZ.LIZIZ()) {
            H78.LJI("app is running background");
            return;
        }
        AVMusic aVMusic2 = ((AwemeDraft) this.l0).LIZLLL;
        if (aVMusic2 != null) {
            aVMusic = aVMusic2.m156clone();
        }
        o.LJI(aVMusic);
        AVMusic aVMusic3 = new AVMusic();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", "draft_again");
        c145995oB.LJI("music_id", aVMusic3.getMusicId());
        c145995oB.LJ("is_ui_shoot", true);
        GXR.LIZ("shoot", c145995oB.LIZ);
        aVMusic.setMusicPriority(99);
        if (aVMusic.isSpeechToSong()) {
            aVMusic.musicType = 5;
            aVMusic.authorName = C86V.LJFF(R.string.rht);
        }
        I9T.LJI(aVMusic, false, ((AwemeDraft) this.l0).LIZ.musicBuzModel);
        AwemeDraft awemeDraft2 = (AwemeDraft) this.l0;
        String str3 = awemeDraft2.LJI;
        if (str3 != null) {
            str2 = str3;
        }
        int i = awemeDraft2.LJIILIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toVideoRecord() called with: path = [");
        LIZ.append(str2);
        LIZ.append("], context = [], musicModel = [");
        LIZ.append(aVMusic);
        LIZ.append("], start = [");
        C170666ms.LIZIZ(b0.LIZJ(LIZ, i, ']', LIZ));
        try {
            new JSONObject().put("route", "1");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C41662GWs c41662GWs2 = new C41662GWs();
        String musicId = aVMusic.getMusicId();
        o.LJIIIIZZ(musicId, "music.musicId");
        c41662GWs2.LIZ = musicId;
        c41662GWs2.LIZIZ = str2;
        c41662GWs2.LIZJ = i;
        c41662GWs2.LJ = z;
        c41662GWs2.LJFF = aVMusic;
        g0.LJJIL(((DraftViewModel) this.l1).LJLJLJ, c41662GWs2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS170S0200000_7(H00 h00, AbstractImageUploader abstractImageUploader, int i) {
        super(2);
        this.$t = i;
        this.l0 = h00;
        this.l1 = abstractImageUploader;
    }

    public static final Object invoke$0(AqS170S0200000_7 aqS170S0200000_7, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C85977Xoj c85977Xoj = (C85977Xoj) aqS170S0200000_7.l0;
        ActivityC45651qj activity = (ActivityC45651qj) aqS170S0200000_7.l1;
        C43212Gxc config = c85977Xoj.LJIILL();
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(config, "config");
        C61713OJx LIZJ = C61712OJw.LIZJ(activity);
        if (!config.LJLJJI) {
            LIZJ.LIZ(config.LJLILLLLZI);
        }
        if (intValue != -1) {
            LIZJ.LJI(intValue);
        }
        if (booleanValue) {
            LIZJ.LIZIZ.LJIIJ(true);
        } else {
            LIZJ.LIZ(((C85977Xoj) aqS170S0200000_7.l0).LJIILL().LJLILLLLZI);
        }
        LIZJ.LIZJ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS170S0200000_7 aqS170S0200000_7, Object asyncSubscribe, Object obj) {
        QuestionDetailResponse it = (QuestionDetailResponse) obj;
        o.LJIIIZ(asyncSubscribe, "$this$asyncSubscribe");
        o.LJIIIZ(it, "it");
        ((QuestionDetailFragment) aqS170S0200000_7.l0).Nl(it);
        if (QnaService.LIZ().enablePublicQna()) {
            ActivityC45651qj mo49getActivity = ((QuestionDetailFragment) aqS170S0200000_7.l0).mo49getActivity();
            o.LJI(mo49getActivity);
            if (!mo49getActivity.isDestroyed()) {
                ActivityC45651qj mo49getActivity2 = ((QuestionDetailFragment) aqS170S0200000_7.l0).mo49getActivity();
                o.LJI(mo49getActivity2);
                if (!mo49getActivity2.isFinishing()) {
                    QuestionDetailFragment questionDetailFragment = (QuestionDetailFragment) aqS170S0200000_7.l0;
                    View view = (View) aqS170S0200000_7.l1;
                    questionDetailFragment.getClass();
                    ActivityC45651qj LIZ = C212428Vi.LIZ(questionDetailFragment);
                    if (LIZ != null && o.LJ(questionDetailFragment.Al().getEnterMethod(), "ask_question") && o.LJ(questionDetailFragment.Al().getQuestionType(), "textual")) {
                        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                        o.LJIIIIZZ(curUser, "userService().curUser");
                        if (curUser.getDisplayQnaOnProfile() == null) {
                            Keva repo = Keva.getRepo("keva_question_detail_repo");
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("is_first_time_ask_text_question");
                            if (C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ2, LIZ2, repo, true)) {
                                Keva repo2 = Keva.getRepo("keva_question_detail_repo");
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("is_first_time_ask_text_question");
                                LIZ3.append(((RBX) HG3.LJIILL()).getCurUserId());
                                repo2.storeBoolean(X1D.LIZIZ(LIZ3), false);
                                C117404jA c117404jA = new C117404jA(LIZ, view, questionDetailFragment);
                                questionDetailFragment.LLI = c117404jA;
                                new Handler().postDelayed(new ARunnableS37S0100000_1(c117404jA, 101), 200L);
                                new Handler().postDelayed(new ARunnableS37S0100000_1(c117404jA, 102), 3000L);
                            }
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS170S0200000_7 aqS170S0200000_7, Object obj, Object obj2) {
        NLEModel model = (NLEModel) obj;
        long longValue = ((Number) obj2).longValue();
        o.LJIIIZ(model, "model");
        ((UnorderedMapStrStr) aqS170S0200000_7.l0).put("text_sticker_duration", String.valueOf(longValue));
        NLEModelRequestCallback nLEModelRequestCallback = (NLEModelRequestCallback) aqS170S0200000_7.l1;
        if (nLEModelRequestCallback != null) {
            nLEModelRequestCallback.onSuccess(model, (UnorderedMapStrStr) aqS170S0200000_7.l0);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AqS170S0200000_7 aqS170S0200000_7, Object obj, Object obj2) {
        IBJ state = (IBJ) obj;
        o.LJIIIZ(state, "state");
        if (IBK.LIZ[state.ordinal()] == 2 && obj2 != null) {
            DiyPropParser.LJIILIIL((IC3) aqS170S0200000_7.l0, (Effect) aqS170S0200000_7.l1, new Bitmap[]{obj2}, null);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AqS170S0200000_7 aqS170S0200000_7, Object obj, Object obj2) {
        aqS170S0200000_7.invoke$0(((Boolean) obj).booleanValue(), (String) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS170S0200000_7 aqS170S0200000_7, Object obj, Object obj2) {
        ((Number) obj).intValue();
        AbstractImageUploader.ImageUploadInfo info = (AbstractImageUploader.ImageUploadInfo) obj2;
        o.LJIIIZ(info, "info");
        ((AbstractImageUploader) aqS170S0200000_7.l1).LIZJ();
        ((ArrayList) ((H00) aqS170S0200000_7.l0).LJIIIIZZ).remove((AbstractImageUploader) aqS170S0200000_7.l1);
        H00 h00 = (H00) aqS170S0200000_7.l0;
        if (h00.LJIIIZ) {
            if (((ArrayList) h00.LJIIIIZZ).size() == 0) {
                H00 h002 = (H00) aqS170S0200000_7.l0;
                h002.LJII(info, h002.LJI);
            }
        } else {
            h00.LJII(info, h00.LJI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS170S0200000_7 aqS170S0200000_7, Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        InterfaceC65784Pro<C76800UCe> callback = (InterfaceC65784Pro) obj2;
        o.LJIIIZ(callback, "callback");
        if ((C00F.LIZ(31744, 0, "studio_auto_save_when_dismiss_push", true) > 0 && !booleanValue && C44172HVg.LJIJ.isLogin() && !C39163FYp.LIZ.LIZ((Activity) aqS170S0200000_7.l0)) || e1.LIZ(31744, "restore_mock_save_draft", true, false)) {
            C10K.LIZJ(new ACallableS56S0300000_7((GWN) aqS170S0200000_7.l1, (Activity) aqS170S0200000_7.l0, callback, 13));
        } else if (!booleanValue) {
            ((GWN) aqS170S0200000_7.l1).LJIILL((Activity) aqS170S0200000_7.l0, callback);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS170S0200000_7(IC3 ic3, Effect effect, int i) {
        super(2);
        this.$t = i;
        this.l0 = ic3;
        this.l1 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS170S0200000_7(C85977Xoj c85977Xoj, ActivityC45651qj activityC45651qj, int i) {
        super(2);
        this.$t = i;
        this.l0 = c85977Xoj;
        this.l1 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS170S0200000_7(Activity activity, GWN gwn, int i) {
        super(2);
        this.$t = i;
        this.l0 = activity;
        this.l1 = gwn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS170S0200000_7(UnorderedMapStrStr unorderedMapStrStr, NLEModelRequestCallback nLEModelRequestCallback, int i) {
        super(2);
        this.$t = i;
        this.l0 = unorderedMapStrStr;
        this.l1 = nLEModelRequestCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS170S0200000_7(AwemeDraft awemeDraft, DraftViewModel draftViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = awemeDraft;
        this.l1 = draftViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS170S0200000_7(QuestionDetailFragment questionDetailFragment, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = questionDetailFragment;
        this.l1 = view;
    }
}
