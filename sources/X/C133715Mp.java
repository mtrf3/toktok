package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectReuseDetails;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.effectplatform.model.Effect;
import dmt.av.video.ReplayLiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.5Mp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133715Mp extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ C5V0 LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ List<EditEffectAnchorInfo> LJLJI;
    public final /* synthetic */ C122034qd LJLJJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJL;
    public final /* synthetic */ ReplayLiveData<C5RT> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C133715Mp(C5V0 c5v0, Activity activity, List<EditEffectAnchorInfo> list, C122034qd c122034qd, VideoPublishEditModel videoPublishEditModel, ReplayLiveData<C5RT> replayLiveData) {
        super(1);
        this.LJLIL = c5v0;
        this.LJLILLLLZI = activity;
        this.LJLJI = list;
        this.LJLJJI = c122034qd;
        this.LJLJJL = videoPublishEditModel;
        this.LJLJJLL = replayLiveData;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String it) {
        long endTime;
        String str;
        String str2;
        o.LJIIIZ(it, "it");
        C5V0 c5v0 = this.LJLIL;
        Activity activity = this.LJLILLLLZI;
        List<EditEffectAnchorInfo> list = this.LJLJI;
        NLEModel LJ = this.LJLJJI.LJIIJ.LJ();
        o.LJIIIIZZ(LJ, "editorPro.editor.model");
        VideoPublishEditModel videoPublishEditModel = this.LJLJJL;
        int duration = this.LJLJJI.LJII().getDuration();
        C5LU LIZLLL = this.LJLJJI.LIZLLL();
        ReplayLiveData<C5RT> replayLiveData = this.LJLJJLL;
        c5v0.getClass();
        int i = 0;
        for (EditEffectAnchorInfo editEffectAnchorInfo : list) {
            int i2 = i + 1;
            if (i >= 0) {
                EditEffectAnchorInfo editEffectAnchorInfo2 = editEffectAnchorInfo;
                List<EditEffectReuseDetails> details = editEffectAnchorInfo2.getDetails();
                ArrayList arrayList = new ArrayList();
                for (EditEffectReuseDetails editEffectReuseDetails : details) {
                    if (editEffectReuseDetails.getStartTime() <= duration) {
                        arrayList.add(editEffectReuseDetails);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    EditEffectReuseDetails editEffectReuseDetails2 = (EditEffectReuseDetails) it2.next();
                    Effect effect = editEffectAnchorInfo2.getEffect();
                    if (effect != null) {
                        C122334r7 c122334r7 = new C122334r7();
                        c122334r7.LIZIZ = editEffectReuseDetails2.getStartTime();
                        long j = duration;
                        if (editEffectReuseDetails2.getEndTime() > j) {
                            endTime = j;
                        } else {
                            endTime = editEffectReuseDetails2.getEndTime();
                        }
                        c122334r7.LIZJ = endTime;
                        c122334r7.LIZLLL = effect.getUnzipPath();
                        c122334r7.LJFF = effect.getEffect_id();
                        c122334r7.LJII = effect.getName();
                        int[] iArr = c5v0.LIZIZ;
                        c122334r7.LJIIIIZZ = iArr[i % iArr.length];
                        c122334r7.LJIIIZ = 1;
                        c122334r7.LJIIJ = "";
                        c122334r7.LJ = effect.getExtra();
                        List<String> challenge = effect.getChallenge();
                        if (challenge != null) {
                            str = ORZ.LLD(challenge, ",", null, null, null, 62);
                        } else {
                            str = null;
                        }
                        c122334r7.LJIILL = String.valueOf(str);
                        c122334r7.LJIIJJI = C122364rA.LIZ(LJ) + 1;
                        String resource_id = effect.getResource_id();
                        o.LJIIIZ(resource_id, "<set-?>");
                        c122334r7.LJIIL = resource_id;
                        C122334r7 c122334r72 = c122334r7;
                        if (C78685UuP.LJJJZ(effect.getExtra())) {
                            c122334r72 = c122334r7;
                            if (new JSONObject(effect.getExtra()).optBoolean("if_capcut")) {
                                C122314r5 c122314r5 = new C122314r5();
                                String LIZ = C36146EGo.LIZ(effect.getSdk_extra());
                                c122334r72 = c122314r5;
                                if (LIZ != null) {
                                    c122314r5.LJIJJ = new JSONObject(LIZ);
                                    c122314r5.LIZIZ = editEffectReuseDetails2.getStartTime();
                                    if (editEffectReuseDetails2.getEndTime() <= j) {
                                        j = editEffectReuseDetails2.getEndTime();
                                    }
                                    c122314r5.LIZJ = j;
                                    c122314r5.LIZLLL = effect.getUnzipPath();
                                    c122314r5.LJFF = effect.getEffect_id();
                                    c122314r5.LJII = effect.getName();
                                    int[] iArr2 = c5v0.LIZIZ;
                                    c122314r5.LJIIIIZZ = iArr2[i % iArr2.length];
                                    c122314r5.LJIIIZ = 1;
                                    c122314r5.LJIIJ = "";
                                    List<String> challenge2 = effect.getChallenge();
                                    if (challenge2 != null) {
                                        str2 = ORZ.LLD(challenge2, ",", null, null, null, 62);
                                    } else {
                                        str2 = null;
                                    }
                                    c122314r5.LJIILL = String.valueOf(str2);
                                    c122314r5.LJ = effect.getExtra();
                                    c122314r5.LJIIJJI = C122364rA.LIZ(LJ) + 1;
                                    String resource_id2 = effect.getResource_id();
                                    o.LJIIIZ(resource_id2, "<set-?>");
                                    c122314r5.LJIIL = resource_id2;
                                    c122334r72 = c122314r5;
                                }
                            }
                        }
                        EffectPointModel LIZ2 = C5LQ.LIZ(c122334r72, false, duration);
                        c5v0.LIZLLL = System.currentTimeMillis();
                        LIZ2.setUuid(LIZLLL.LJJIJIIJI(c122334r72));
                        LIZ2.setSelectFrom(videoPublishEditModel.mShootWay);
                        LIZ2.setIndex(-1);
                        videoPublishEditModel.getEditEffectModel().effectList.add(LIZ2);
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Effect with that effect id - ");
                        LIZ3.append(editEffectAnchorInfo2.getEffectId());
                        LIZ3.append(" cannot be found");
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("TikTokEditApplyHandler", X1D.LIZIZ(LIZ3));
                        C5V0.LIZ(activity);
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C2ND.LIZIZ(new AqS149S0200000_2(videoPublishEditModel, (VideoPublishEditModel) replayLiveData, (ReplayLiveData<C5RT>) 35), 0L);
        return C76800UCe.LIZ;
    }
}
