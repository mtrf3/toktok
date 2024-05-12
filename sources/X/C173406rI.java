package X;

import Y.ACallableS28S0301000_2;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.6rI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173406rI implements InterfaceC173506rS {
    public final /* synthetic */ C173396rH LJLIL;

    public C173406rI(C173396rH c173396rH) {
        this.LJLIL = c173396rH;
    }

    @Override // X.InterfaceC173506rS
    public final void LIZ(final int i, View view) {
        CategoryPageModel categoryPageModel;
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        final Effect effect;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AVETParameter avetParameter;
        AVETParameter avetParameter2;
        AVETParameter avetParameter3;
        AVETParameter avetParameter4;
        o.LJIIIZ(view, "view");
        if (-1 == i) {
            return;
        }
        final C173396rH c173396rH = this.LJLIL;
        c173396rH.LJLJJLL = true;
        if (i == 0) {
            c173396rH.LJZ(i);
            c173396rH.LJLJJL.MK(C135285Sq.LIZIZ());
            C149905uU.LIZLLL(c173396rH.LJLJI);
            return;
        }
        if (i <= 0 || (categoryPageModel = c173396rH.LJLJLJ) == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null || (effects = categoryEffects.getEffects()) == null || (effect = (Effect) ListProtector.get(effects, i - 1)) == null) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("effect_name", effect.getName());
        c145995oB.LJI("effect_id", effect.getEffectId());
        VideoPublishEditModel videoPublishEditModel = c173396rH.LJLJI;
        String str6 = "";
        if (videoPublishEditModel == null || (avetParameter4 = videoPublishEditModel.getAvetParameter()) == null || (str = avetParameter4.getShootWay()) == null) {
            str = "";
        }
        c145995oB.LJI("shoot_way", str);
        VideoPublishEditModel videoPublishEditModel2 = c173396rH.LJLJI;
        if (videoPublishEditModel2 == null || (str2 = videoPublishEditModel2.getCreationId()) == null) {
            str2 = "";
        }
        c145995oB.LJI("creation_id", str2);
        VideoPublishEditModel videoPublishEditModel3 = c173396rH.LJLJI;
        if (videoPublishEditModel3 == null || (avetParameter3 = videoPublishEditModel3.getAvetParameter()) == null || (str3 = avetParameter3.getContentSource()) == null) {
            str3 = "";
        }
        c145995oB.LJI("content_source", str3);
        VideoPublishEditModel videoPublishEditModel4 = c173396rH.LJLJI;
        if (videoPublishEditModel4 == null || (avetParameter2 = videoPublishEditModel4.getAvetParameter()) == null || (str4 = avetParameter2.getStoryShootEntrance()) == null) {
            str4 = "";
        }
        c145995oB.LJI("shoot_entrance", str4);
        VideoPublishEditModel videoPublishEditModel5 = c173396rH.LJLJI;
        if (videoPublishEditModel5 == null || (avetParameter = videoPublishEditModel5.getAvetParameter()) == null || (str5 = avetParameter.getContentType()) == null) {
            str5 = "";
        }
        c145995oB.LJI("content_type", str5);
        c145995oB.LIZIZ(System.currentTimeMillis(), "local_time_ms");
        FMX.LJIIL("select_voice_effect", c145995oB.LIZ);
        String unzipPath = effect.getUnzipPath();
        if (unzipPath == null) {
            unzipPath = "";
        }
        C166696gT.LIZ().getClass();
        if (C169416kr.LIZ(effect)) {
            String effectId = effect.getEffectId();
            if (effectId != null) {
                str6 = effectId;
            }
            c173396rH.LJLLLLLL(effect, str6, C78949Uyf.LJIILLIIL(effect), unzipPath);
            c173396rH.LJZ(i);
            C173416rJ c173416rJ = c173396rH.LJLLILLLL;
            if (c173416rJ == null) {
                return;
            }
            c173416rJ.LLJILJILJ(effect);
            return;
        }
        c173396rH.LJLZ(i, 2);
        C169416kr LIZ = C166696gT.LIZ();
        InterfaceC166016fN interfaceC166016fN = new InterfaceC166016fN() { // from class: X.6rM
            @Override // X.InterfaceC166016fN
            public final void onSuccess(Effect effect2) {
                String str7;
                String LJIILLIIL;
                String str8 = null;
                if (effect2 != null) {
                    str7 = effect2.getEffectId();
                } else {
                    str7 = null;
                }
                if (TextUtils.equals(str7, Effect.this.getEffectId())) {
                    C10K.LIZIZ(new ACallableS28S0301000_2(i, effect2, Effect.this, c173396rH, 1), C10K.LJIIIIZZ, null);
                    C173396rH c173396rH2 = c173396rH;
                    c173396rH2.getClass();
                    String str9 = "";
                    if (effect2 == null) {
                        LJIILLIIL = null;
                    } else {
                        String effectId2 = effect2.getEffectId();
                        if (effectId2 != null) {
                            str9 = effectId2;
                        }
                        LJIILLIIL = C78949Uyf.LJIILLIIL(effect2);
                        str8 = effect2.getUnzipPath();
                    }
                    c173396rH2.LJLLLLLL(effect2, str9, LJIILLIIL, str8);
                }
            }

            @Override // X.InterfaceC166016fN
            public final void onFail(Effect effect2, ExceptionResult e) {
                String str7;
                o.LJIIIZ(e, "e");
                if (effect2 != null) {
                    str7 = effect2.getEffectId();
                } else {
                    str7 = null;
                }
                if (TextUtils.equals(str7, Effect.this.getEffectId())) {
                    final C173396rH c173396rH2 = c173396rH;
                    final int i2 = i;
                    C10K.LIZIZ(new Callable() { // from class: X.6rL
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            if (C146685pI.LIZ()) {
                                C26052AKi c26052AKi = C26052AKi.LIZ;
                                Activity requireActivity = C173396rH.this.LJLIL.requireActivity();
                                o.LJIIIIZZ(requireActivity, "rootScene.requireActivity()");
                                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                                creativeToastBuilder.messageRes(R.string.bzl);
                                ((C26051AKh) c26052AKi.createToast(requireActivity, 1001, creativeToastBuilder)).show();
                            } else {
                                C5S1 c5s1 = new C5S1(C173396rH.this.LJLIL.mActivity);
                                c5s1.LIZJ(R.string.bzl);
                                c5s1.LJ();
                            }
                            C173396rH.this.LJLZ(i2, 3);
                            return C76800UCe.LIZ;
                        }
                    }, C10K.LJIIIIZZ, null);
                }
            }
        };
        LIZ.getClass();
        InterfaceC84498XEg LIZIZ = C166696gT.LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        LIZIZ.fetchEffect(effect, new C44364Hb6(new C44366Hb8("effect", new C166006fM(interfaceC166016fN), false, null)));
    }
}
