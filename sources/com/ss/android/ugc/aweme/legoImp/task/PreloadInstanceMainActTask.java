package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C33791DNz;
import X.C34710Djm;
import X.C36093EEn;
import X.C36508EUm;
import X.C37685Eqf;
import X.C38995FSd;
import X.C39532FfM;
import X.C54206LPe;
import X.C55141LkX;
import X.C55661Lsv;
import X.C55888Lwa;
import X.C73340SqO;
import X.C81334Vw2;
import X.C87656Yai;
import X.C87787Ycp;
import X.C88034Ygo;
import X.C88087Yhf;
import X.C88099Yhr;
import X.DNF;
import X.DOI;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.LKE;
import X.LLW;
import X.NQL;
import android.content.Context;
import android.view.Choreographer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.experiment.OptValue;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.sticker.StickerServiceImpl;
import java.util.List;
import yq4.a;

/* loaded from: classes10.dex */
public class PreloadInstanceMainActTask extends PreloadInstanceTask {
    @Override // X.EEY
    public final String key() {
        return "PreloadInstanceMainActTask";
    }

    @Override // X.EEY
    public final void run(Context context) {
        OptValue LIZ;
        Integer num;
        if (((Boolean) C88034Ygo.LIZLLL.getValue()).booleanValue()) {
        }
        if (((Boolean) C88034Ygo.LJFF.getValue()).booleanValue()) {
        }
        if (((Boolean) C88034Ygo.LJI.getValue()).booleanValue()) {
            try {
                C37685Eqf.LIZ(C36508EUm.LIZ(Choreographer.class, "mHandler"));
            } catch (Throwable unused) {
            }
        }
        if (((Boolean) C88034Ygo.LJII.getValue()).booleanValue()) {
        }
        if (((Boolean) C88034Ygo.LJIIIIZZ.getValue()).booleanValue()) {
        }
        if (((Boolean) DOI.LIZIZ.getValue()).booleanValue()) {
            C36093EEn.LIZ.getClass();
            C36093EEn.LJIIIZ().LIZ(new EE1() { // from class: com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceMainActTask.1
                @Override // X.EEY
                public final String key() {
                    return "PreloadInstanceMainActTask$1";
                }

                @Override // X.EEY
                public final /* synthetic */ boolean meetTrigger() {
                    return true;
                }

                @Override // X.EEY
                public final /* synthetic */ String prefix() {
                    return "task_";
                }

                @Override // X.EE1
                public final /* synthetic */ boolean serialExecute() {
                    return false;
                }

                @Override // X.EEY
                public final /* synthetic */ int targetProcess() {
                    return C0RN.LIZ();
                }

                @Override // X.EEY
                public final /* synthetic */ List triggerOtherLegoComponents() {
                    return null;
                }

                @Override // X.EEY
                public final /* synthetic */ EnumC36103EEx triggerType() {
                    return C0RN.LIZIZ(this);
                }

                @Override // X.EEY
                public final EnumC36092EEm scenesType() {
                    return EnumC36092EEm.DEFAULT;
                }

                @Override // X.EE1
                public final EFK type() {
                    return EFK.BOOT_FINISH;
                }

                @Override // X.EEY
                public final void run(Context context2) {
                    PreloadInstanceMainActTask preloadInstanceMainActTask = PreloadInstanceMainActTask.this;
                    C39532FfM.LIZJ(context2);
                    preloadInstanceMainActTask.getClass();
                }
            });
        } else {
            C39532FfM.LIZJ(context);
        }
        C55888Lwa.LIZIZ.LJJIL();
        try {
            if (!((Boolean) C34710Djm.LJIJI.getValue()).booleanValue()) {
                new C54206LPe(context);
                new C81334Vw2(context, null);
                new TuxTextView(context);
                new MainFragment();
                new FeedRecommendFragment();
            }
        } catch (Throwable unused2) {
        }
        C73340SqO.LJJIIZI();
        ((Boolean) C87656Yai.LIZIZ.getValue()).booleanValue();
        ProfileDependentComponentImpl.createIProfileDependentComponentServicebyMonsterPlugin(false);
        StickerServiceImpl.LIZIZ().LIZ();
        new WidgetManager();
        NQL.LJIILL();
        if (((Boolean) C88087Yhf.LJIIIIZZ.getValue()).booleanValue()) {
            SpecActServiceImpl.LJJJIL();
            AVExternalServiceImpl.LIZ().publishService();
        }
        if (((Boolean) C88099Yhr.LIZLLL.getValue()).booleanValue()) {
            C38995FSd.LIZIZ();
        }
        if (((Boolean) C87787Ycp.LIZLLL.getValue()).booleanValue()) {
            C55141LkX.LIZJ.getValue();
        }
        if (((Boolean) DNF.LIZIZ.getValue()).booleanValue()) {
            LKE.LIZIZ.LIZIZ();
        }
        if (((Boolean) C33791DNz.LIZIZ.getValue()).booleanValue()) {
            try {
                LiveOuterService.LJJJLL().LJIIJJI();
                C55661Lsv.LJFF();
            } catch (Throwable unused3) {
            }
        }
        if (((Boolean) C33791DNz.LIZJ.getValue()).booleanValue() && (LIZ = LLW.LIZ()) != null && (num = LIZ.isEnableSlideParamsOpt) != null) {
            num.intValue();
        }
        if (((Boolean) C33791DNz.LIZLLL.getValue()).booleanValue()) {
            a.LJIILIIL().getPrivacyUserSettings();
        }
    }
}
