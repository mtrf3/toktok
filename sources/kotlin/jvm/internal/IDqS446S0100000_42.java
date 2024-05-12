package kotlin.jvm.internal;

import X.AEY;
import X.AI8;
import X.AI9;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C113624d4;
import X.C212428Vi;
import X.C217288fs;
import X.C252709vu;
import X.C25991AHz;
import X.C32151Nz;
import X.C3C5;
import X.C45631qh;
import X.C50674Jug;
import X.C55953Lxd;
import X.C72808Sho;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C78996UzQ;
import X.C8W0;
import X.C93572aT2;
import X.C93586aTG;
import X.C93587aTH;
import X.C93588aTI;
import X.C93744aVo;
import X.C93802aWk;
import X.C93803aWl;
import X.C93934aYs;
import X.C93985aZh;
import X.C94057aar;
import X.C94207adH;
import X.C94283aeV;
import X.C94510aiA;
import X.C94619ajv;
import X.C94714alS;
import X.C94718alW;
import X.C94847anb;
import X.C94848anc;
import X.EnumC93589aTJ;
import X.EnumC93982aZe;
import X.InterfaceC57784Mm4;
import X.InterfaceC88471Ynr;
import X.K55;
import X.O6R;
import X.OSZ;
import X.SYL;
import X.XJL;
import X.XKQ;
import X.XKS;
import X.XKX;
import Y.IDAListenerS84S0100000_42;
import Y.IDRunnableS92S0100000_42;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.PreviewViewModel;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPageFragment;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.MusicDspSheetAssem;
import com.ss.android.ugc.aweme.search.pages.voice.core.ui.VoiceSearchContainerFragment;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.MusicRecognitionFragment;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionDescTextAssem;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionLottieAssem;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionStatusTextAssem;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.ui.VoiceSearchFragment;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.ui.VoiceSearchLanguageCell;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.ui.VoiceSearchLanguageSettingFragment;
import com.ss.android.ugc.aweme.service.ISearchDebugService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes34.dex */
public class IDqS446S0100000_42 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

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
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2);
            case 17:
                return invoke$17(this, obj, obj2);
            case 18:
                return invoke$18(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(XKS xks, int i) {
        super(2);
        this.$t = i;
        this.l0 = xks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(C94207adH c94207adH, int i) {
        super(2);
        this.$t = i;
        this.l0 = c94207adH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(BehaviourPreviewFragment behaviourPreviewFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = behaviourPreviewFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(PrefabPageFragment prefabPageFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = prefabPageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(MainFragment mainFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = mainFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(MusicDspSheetAssem musicDspSheetAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicDspSheetAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(MusicRecognitionFragment musicRecognitionFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicRecognitionFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(MusicRecognitionDescTextAssem musicRecognitionDescTextAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicRecognitionDescTextAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(MusicRecognitionLottieAssem musicRecognitionLottieAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicRecognitionLottieAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(MusicRecognitionStatusTextAssem musicRecognitionStatusTextAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicRecognitionStatusTextAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(VoiceSearchFragment voiceSearchFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = voiceSearchFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(VoiceSearchLanguageCell voiceSearchLanguageCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = voiceSearchLanguageCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS446S0100000_42(VoiceSearchLanguageSettingFragment voiceSearchLanguageSettingFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = voiceSearchLanguageSettingFragment;
    }

    public static final Object invoke$0(IDqS446S0100000_42 iDqS446S0100000_42, Object obj, Object obj2) {
        C8W0 selectSubscribe = (C8W0) obj;
        EnumC93982aZe it = (EnumC93982aZe) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        ActivityC45651qj LIZ = C212428Vi.LIZ(selectSubscribe);
        if (LIZ != null) {
            int i = C93572aT2.LIZ[it.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C73305Spp C3 = ((MusicDspSheetAssem) iDqS446S0100000_42.l0).C3();
                        C73306Spq c73306Spq = new C73306Spq();
                        String string = LIZ.getString(R.string.dte);
                        o.LJIIIIZZ(string, "activity.getString(R.str…g.connection_error_retry)");
                        c73306Spq.LJFF = string;
                        String string2 = LIZ.getString(R.string.cph);
                        o.LJIIIIZZ(string2, "activity.getString(R.string.check_network)");
                        c73306Spq.LJI = string2;
                        c73306Spq.LJIIJ = C217288fs.LIZ;
                        c73306Spq.LJII = new IDqS175S0200000_42((MusicDspSheetAssem) iDqS446S0100000_42.l0, LIZ, 7);
                        C3.setStatus(c73306Spq);
                    }
                } else {
                    ((MusicDspSheetAssem) iDqS446S0100000_42.l0).C3().LJFF();
                    ((MusicDspSheetAssem) iDqS446S0100000_42.l0).C3().setVisibility(0);
                }
            } else {
                ((MusicDspSheetAssem) iDqS446S0100000_42.l0).C3().setVisibility(8);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS446S0100000_42 iDqS446S0100000_42, Object obj, Object obj2) {
        TuxTextView tuxTextView;
        C8W0 selectSubscribe = (C8W0) obj;
        EnumC93589aTJ state = (EnumC93589aTJ) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        int i = C93586aTG.LIZ[state.ordinal()];
        String str = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (tuxTextView = ((MusicRecognitionDescTextAssem) iDqS446S0100000_42.l0).LJLILLLLZI) != null) {
                    Context context = selectSubscribe.getContext();
                    if (context != null) {
                        str = context.getString(R.string.tsk);
                    }
                    tuxTextView.setText(str);
                }
            } else {
                TuxTextView tuxTextView2 = ((MusicRecognitionDescTextAssem) iDqS446S0100000_42.l0).LJLILLLLZI;
                if (tuxTextView2 != null) {
                    Context context2 = selectSubscribe.getContext();
                    if (context2 != null) {
                        str = context2.getString(R.string.tsl);
                    }
                    tuxTextView2.setText(str);
                }
            }
        } else {
            TuxTextView tuxTextView3 = ((MusicRecognitionDescTextAssem) iDqS446S0100000_42.l0).LJLILLLLZI;
            if (tuxTextView3 != null) {
                Context context3 = selectSubscribe.getContext();
                if (context3 != null) {
                    str = context3.getString(R.string.tsm);
                }
                tuxTextView3.setText(str);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS446S0100000_42 iDqS446S0100000_42, Object selectSubscribe, Object obj) {
        OSZ it = (OSZ) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        VoiceSearchFragment voiceSearchFragment = (VoiceSearchFragment) iDqS446S0100000_42.l0;
        String str = (String) it.getFirst();
        if (((Boolean) it.getSecond()).booleanValue()) {
            TuxTextView tuxTextView = voiceSearchFragment.LJLJJLL;
            if (tuxTextView != null) {
                tuxTextView.setTextAlignment(4);
            }
        } else {
            TuxTextView tuxTextView2 = voiceSearchFragment.LJLJJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextAlignment(5);
            }
        }
        TuxTextView tuxTextView3 = voiceSearchFragment.LJLJJLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(str);
        }
        C45631qh c45631qh = voiceSearchFragment.LJLJJL;
        if (c45631qh != null) {
            c45631qh.post(new IDRunnableS92S0100000_42(voiceSearchFragment, 12));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        if (r2 != 4) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.IDqS446S0100000_42 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS446S0100000_42.invoke$11(kotlin.jvm.internal.IDqS446S0100000_42, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$12(IDqS446S0100000_42 iDqS446S0100000_42, Object selectSubscribe, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (intValue != 0) {
            VoiceSearchFragment voiceSearchFragment = (VoiceSearchFragment) iDqS446S0100000_42.l0;
            voiceSearchFragment.getClass();
            C113624d4 LIZ = C93985aZh.LIZ(voiceSearchFragment.wl());
            TuxTextView tuxTextView = voiceSearchFragment.LJLLILLLL;
            if (tuxTextView != null) {
                tuxTextView.setText(LIZ.LIZ);
            }
            ((AssemViewModel) ((VoiceSearchFragment) iDqS446S0100000_42.l0).LJLJJI.getValue()).setState(C94718alW.LJLIL);
            ((VoiceSearchFragment) iDqS446S0100000_42.l0).LJLZ = System.currentTimeMillis();
            ((VoiceSearchFragment) iDqS446S0100000_42.l0).Hl();
            if (((VoiceSearchFragment) iDqS446S0100000_42.l0).isResumed()) {
                ((VoiceSearchFragment) iDqS446S0100000_42.l0).Dl().hv0(((VoiceSearchFragment) iDqS446S0100000_42.l0).vl());
                ((VoiceSearchFragment) iDqS446S0100000_42.l0).LJZ = 1;
            } else {
                ((VoiceSearchFragment) iDqS446S0100000_42.l0).Dl().iv0(3, true, true);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS446S0100000_42 iDqS446S0100000_42, Object path, Object obj) {
        ((Boolean) obj).booleanValue();
        o.LJIIIZ(path, "path");
        if (((XJL) iDqS446S0100000_42.l0).isActive()) {
            XJL xjl = (XJL) iDqS446S0100000_42.l0;
            C3C5.m7constructorimpl(path);
            xjl.resumeWith(path);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS446S0100000_42 iDqS446S0100000_42, Object path, Object obj) {
        ((Boolean) obj).booleanValue();
        o.LJIIIZ(path, "path");
        if (((XJL) iDqS446S0100000_42.l0).isActive()) {
            XJL xjl = (XJL) iDqS446S0100000_42.l0;
            C3C5.m7constructorimpl(path);
            xjl.resumeWith(path);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS446S0100000_42 iDqS446S0100000_42, Object obj, Object obj2) {
        ((MainFragment) iDqS446S0100000_42.l0).getClass();
        MainFragment.Sl(true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS446S0100000_42 iDqS446S0100000_42, Object obj, Object obj2) {
        ((MainFragment) iDqS446S0100000_42.l0).getClass();
        MainFragment.Sl(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(IDqS446S0100000_42 iDqS446S0100000_42, Object selectSubscribe, Object obj) {
        C72808Sho<InterfaceC57784Mm4> state;
        List<C113624d4> it = (List) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        VoiceSearchLanguageSettingFragment voiceSearchLanguageSettingFragment = (VoiceSearchLanguageSettingFragment) iDqS446S0100000_42.l0;
        for (C113624d4 c113624d4 : it) {
            SYL syl = voiceSearchLanguageSettingFragment.LJLJJL;
            if (syl != null && (state = syl.getState()) != null) {
                state.LIZJ(new C94510aiA(c113624d4));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(IDqS446S0100000_42 iDqS446S0100000_42, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C252709vu c252709vu = ((VoiceSearchLanguageSettingFragment) iDqS446S0100000_42.l0).LJLJJI;
        if (c252709vu != null) {
            c252709vu.LJIJ("tag_done", new C94714alS(booleanValue));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS446S0100000_42 iDqS446S0100000_42, Object selectSubscribe, Object obj) {
        EnumC93589aTJ state = (EnumC93589aTJ) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        int i = C93587aTH.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((MusicRecognitionLottieAssem) iDqS446S0100000_42.l0).v3(2);
                }
            } else {
                ((MusicRecognitionLottieAssem) iDqS446S0100000_42.l0).v3(1);
            }
        } else {
            ((MusicRecognitionLottieAssem) iDqS446S0100000_42.l0).v3(0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS446S0100000_42 iDqS446S0100000_42, Object obj, Object obj2) {
        String str;
        String str2;
        TuxTextView tuxTextView;
        C8W0 selectSubscribe = (C8W0) obj;
        EnumC93589aTJ state = (EnumC93589aTJ) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        String str3 = null;
        if (state != EnumC93589aTJ.LISTENING) {
            MusicRecognitionStatusTextAssem musicRecognitionStatusTextAssem = (MusicRecognitionStatusTextAssem) iDqS446S0100000_42.l0;
            XKQ xkq = musicRecognitionStatusTextAssem.LJLJJI;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            musicRecognitionStatusTextAssem.LJLJJI = null;
            musicRecognitionStatusTextAssem.LJLJJL = 0;
        }
        if (state != EnumC93589aTJ.RECOGNIZING) {
            MusicRecognitionStatusTextAssem musicRecognitionStatusTextAssem2 = (MusicRecognitionStatusTextAssem) iDqS446S0100000_42.l0;
            XKQ xkq2 = musicRecognitionStatusTextAssem2.LJLILLLLZI;
            if (xkq2 != null) {
                xkq2.LIZIZ(null);
            }
            musicRecognitionStatusTextAssem2.LJLILLLLZI = null;
            musicRecognitionStatusTextAssem2.LJLJI = 3;
        }
        int i = C93588aTI.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (tuxTextView = ((MusicRecognitionStatusTextAssem) iDqS446S0100000_42.l0).LJLJJLL) != null) {
                    Context context = selectSubscribe.getContext();
                    if (context != null) {
                        str3 = context.getString(R.string.tsq);
                    }
                    tuxTextView.setText(str3);
                }
            } else {
                TuxTextView tuxTextView2 = ((MusicRecognitionStatusTextAssem) iDqS446S0100000_42.l0).LJLJJLL;
                if (tuxTextView2 != null) {
                    Context context2 = selectSubscribe.getContext();
                    if (context2 != null) {
                        str2 = context2.getString(R.string.tsr);
                    } else {
                        str2 = null;
                    }
                    tuxTextView2.setText(str2);
                }
                MusicRecognitionStatusTextAssem musicRecognitionStatusTextAssem3 = (MusicRecognitionStatusTextAssem) iDqS446S0100000_42.l0;
                XKQ xkq3 = musicRecognitionStatusTextAssem3.LJLILLLLZI;
                if (xkq3 != null) {
                    xkq3.LIZIZ(null);
                }
                musicRecognitionStatusTextAssem3.LJLILLLLZI = null;
                musicRecognitionStatusTextAssem3.LJLJI = 3;
                musicRecognitionStatusTextAssem3.LJLILLLLZI = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(musicRecognitionStatusTextAssem3), null, null, new C94847anb(musicRecognitionStatusTextAssem3, null), 3);
            }
        } else {
            TuxTextView tuxTextView3 = ((MusicRecognitionStatusTextAssem) iDqS446S0100000_42.l0).LJLJJLL;
            if (tuxTextView3 != null) {
                Context context3 = selectSubscribe.getContext();
                if (context3 != null) {
                    str = context3.getString(R.string.tso);
                } else {
                    str = null;
                }
                tuxTextView3.setText(str);
            }
            MusicRecognitionStatusTextAssem musicRecognitionStatusTextAssem4 = (MusicRecognitionStatusTextAssem) iDqS446S0100000_42.l0;
            XKQ xkq4 = musicRecognitionStatusTextAssem4.LJLJJI;
            if (xkq4 != null) {
                xkq4.LIZIZ(null);
            }
            musicRecognitionStatusTextAssem4.LJLJJI = null;
            musicRecognitionStatusTextAssem4.LJLJJL = 0;
            musicRecognitionStatusTextAssem4.LJLJJI = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(musicRecognitionStatusTextAssem4), null, null, new C94848anc(musicRecognitionStatusTextAssem4, null), 3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS446S0100000_42 iDqS446S0100000_42, Object selectSubscribe, Object it) {
        AI8 ai8;
        AEY aey;
        C113624d4 c113624d4;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        VoiceSearchLanguageCell voiceSearchLanguageCell = (VoiceSearchLanguageCell) iDqS446S0100000_42.l0;
        View view = voiceSearchLanguageCell.itemView;
        String str = null;
        if ((view instanceof AI8) && (ai8 = (AI8) view) != null) {
            AI9 accessory = ai8.getAccessory();
            if ((accessory instanceof C25991AHz) && (aey = (AEY) accessory) != null) {
                C94510aiA item = voiceSearchLanguageCell.getItem();
                if (item != null && (c113624d4 = item.LJLIL) != null) {
                    str = c113624d4.LIZLLL;
                }
                aey.LJIILIIL(o.LJ(it, str));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS446S0100000_42 iDqS446S0100000_42, Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        PrefabViewModel Al = ((PrefabPageFragment) iDqS446S0100000_42.l0).Al();
        String str = ((PrefabPageFragment) iDqS446S0100000_42.l0).LJLJJI;
        if (str != null) {
            Al.mv0(intValue, str, true);
            return C76800UCe.LIZ;
        }
        o.LJIJI("categoryName");
        throw null;
    }

    public static final Object invoke$6(IDqS446S0100000_42 iDqS446S0100000_42, Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String result = (String) obj2;
        o.LJIIIZ(result, "result");
        C93744aVo.LIZIZ(new C94619ajv(iDqS446S0100000_42, booleanValue, result), 0L);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS446S0100000_42 iDqS446S0100000_42, Object selectSubscribe, Object state) {
        VoiceSearchContainerFragment voiceSearchContainerFragment;
        View view;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        MusicRecognitionFragment musicRecognitionFragment = (MusicRecognitionFragment) iDqS446S0100000_42.l0;
        musicRecognitionFragment.getClass();
        EnumC93589aTJ enumC93589aTJ = EnumC93589aTJ.FAILED;
        if (state == enumC93589aTJ) {
            C78996UzQ.LJJJJL(musicRecognitionFragment.LJLILLLLZI);
        } else {
            C78996UzQ.LJJ(musicRecognitionFragment.LJLILLLLZI);
        }
        if (state == enumC93589aTJ && musicRecognitionFragment.isResumed() && musicRecognitionFragment.isAdded() && (view = musicRecognitionFragment.LJLIL) != null) {
            float left = view.getLeft() + (view.getWidth() / 2.0f);
            float top = view.getTop() + (view.getHeight() / 2.0f);
            C93803aWl c93803aWl = musicRecognitionFragment.LJLJJI;
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(50));
            if (!c93803aWl.LIZLLL) {
                c93803aWl.LIZ = LJJIIZ / 2.0f;
                c93803aWl.LIZIZ = left;
                c93803aWl.LIZJ = top;
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
                ofInt.addUpdateListener(new C93802aWk(c93803aWl, LJJIIZ));
                ofInt.addListener(new IDAListenerS84S0100000_42(c93803aWl, 0));
                ofInt.setDuration(600L);
                ofInt.setInterpolator(C55953Lxd.LJIIIIZZ());
                c93803aWl.LIZLLL = true;
                ofInt.start();
            }
        }
        if (state == EnumC93589aTJ.SUCCESS) {
            C94283aeV state2 = ((MusicRecognitionFragment) iDqS446S0100000_42.l0).vl().getState();
            Fragment parentFragment = ((MusicRecognitionFragment) iDqS446S0100000_42.l0).getParentFragment();
            if ((parentFragment instanceof VoiceSearchContainerFragment) && (voiceSearchContainerFragment = (VoiceSearchContainerFragment) parentFragment) != null) {
                String str = state2.LJLILLLLZI;
                String str2 = state2.LJLJI;
                String str3 = (String) ((HashMap) ((MusicRecognitionFragment) iDqS446S0100000_42.l0).LJLJJLL.getValue()).get("enter_from_second");
                if (str3 == null) {
                    str3 = "";
                }
                C50674Jug c50674Jug = new C50674Jug(str, str2, 2, str3);
                voiceSearchContainerFragment.vl();
                K55 k55 = voiceSearchContainerFragment.LJLJJLL;
                if (k55 != null) {
                    k55.LIZ(c50674Jug);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS446S0100000_42 iDqS446S0100000_42, Object obj, Object obj2) {
        MotionEvent motionEvent = (MotionEvent) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean z = false;
        if (((BehaviourPreviewFragment) iDqS446S0100000_42.l0).Jl().LJLJI && !booleanValue && motionEvent != null && motionEvent.getActionMasked() == 1) {
            PreviewViewModel Jl = ((BehaviourPreviewFragment) iDqS446S0100000_42.l0).Jl();
            if (Jl.LJLJI) {
                Jl.LJLJI = false;
                Jl.jv0(null);
            }
            C94057aar c94057aar = ((BehaviourPreviewFragment) iDqS446S0100000_42.l0).LJLJJLL;
            if (c94057aar != null) {
                c94057aar.notifyDataSetChanged();
                z = true;
            } else {
                o.LJIJI("commandAdapter");
                throw null;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$9(IDqS446S0100000_42 iDqS446S0100000_42, Object selectSubscribe, Object obj) {
        String response = (String) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(response, "response");
        TuxTextView tuxTextView = ((VoiceSearchFragment) iDqS446S0100000_42.l0).LJLLLL;
        if (tuxTextView != null) {
            ((ISearchDebugService) ServiceManager.get().getService(ISearchDebugService.class)).LJI(C93934aYs.LIZ, response);
            tuxTextView.setText("");
        }
        return C76800UCe.LIZ;
    }
}
