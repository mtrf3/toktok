package Y;

import X.ASQ;
import X.ASX;
import X.C05L;
import X.C134485Po;
import X.C134535Pt;
import X.C136305Wo;
import X.C142405iO;
import X.C149945uY;
import X.C1536461g;
import X.C1556068u;
import X.C1556168v;
import X.C161686We;
import X.C170416mT;
import X.C170436mV;
import X.C171246no;
import X.C171266nq;
import X.C24540xm;
import X.C29701Eo;
import X.C30461Hm;
import X.C45804HyK;
import X.C48168IvM;
import X.C5PL;
import X.C60U;
import X.C6IH;
import X.C6IK;
import X.C6IL;
import X.C6LY;
import X.C6NJ;
import X.C6NK;
import X.C6NN;
import X.C6QE;
import X.C6QG;
import X.C6QL;
import X.C76800UCe;
import X.C82949Wgz;
import X.InterfaceC134575Px;
import X.InterfaceC1556368x;
import X.InterfaceC161676Wd;
import X.InterfaceC170526me;
import X.InterfaceC65784Pro;
import X.InterfaceC82683Wch;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.ViewOnClickListenerC161696Wf;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.EditTTSPanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACListenerS37S0200000_2 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            case 15:
                onClick$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onClick$16(this, view);
                return;
            case 17:
                onClick$17(this, view);
                return;
            case 18:
                onClick$18(this, view);
                return;
            case 19:
                onClick$19(this, view);
                return;
            case 20:
                onClick$20(this, view);
                return;
            case 21:
                onClick$21(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        boolean z;
        C134485Po c134485Po = (C134485Po) aCListenerS37S0200000_2.l0;
        C5PL c5pl = c134485Po.LJLJJI;
        C5PL c5pl2 = ((C134535Pt) aCListenerS37S0200000_2.l1).LIZIZ;
        if (c5pl != c5pl2) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC134575Px interfaceC134575Px = c134485Po.LJLJI;
        if (interfaceC134575Px != null && interfaceC134575Px.LIZ(c5pl2, z)) {
            C134485Po c134485Po2 = (C134485Po) aCListenerS37S0200000_2.l0;
            C5PL cropMode = ((C134535Pt) aCListenerS37S0200000_2.l1).LIZIZ;
            c134485Po2.getClass();
            o.LJIIIZ(cropMode, "cropMode");
            c134485Po2.LJLJJI = cropMode;
            c134485Po2.notifyDataSetChanged();
        }
    }

    public static final void onClick$1(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        C171266nq c171266nq = (C171266nq) aCListenerS37S0200000_2.l0;
        View view2 = (View) aCListenerS37S0200000_2.l1;
        int adapterPosition = c171266nq.getAdapterPosition();
        if (-1 == adapterPosition) {
            return;
        }
        C171246no c171246no = c171266nq.LJLJL;
        if (!c171246no.LJLJJL) {
            Activity LJIJJ = C45804HyK.LJIJJ(view2.getContext());
            if (LJIJJ == null) {
                return;
            }
            C24540xm.LIZ(R.string.i_p, LJIJJ, 1010);
            return;
        }
        c171266nq.LJLJL.LJLJJI.LIZ(5, adapterPosition, (EffectModel) ListProtector.get(c171246no.LJLILLLLZI, adapterPosition));
    }

    public static final void onClick$10(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        C6IL c6il = (C6IL) aCListenerS37S0200000_2.l0;
        final C6IK c6ik = (C6IK) aCListenerS37S0200000_2.l1;
        c6il.getClass();
        if (c6ik.getFontData() != null) {
            c6il.LJLJJI = c6ik.getFontData().fileName;
        }
        TextFontStyleData textFontStyleData = c6ik.LJLJJL;
        if (textFontStyleData == null) {
            return;
        }
        int i = textFontStyleData.LIZIZ;
        if (i == 1) {
            c6il.LIZIZ(c6ik.getFontData());
            return;
        }
        if (i == 3) {
            c6ik.LIZIZ();
            return;
        }
        if (!C48168IvM.LIZ(c6ik.getContext())) {
            C05L.LIZLLL(c6ik.getContext(), R.string.e8f);
            return;
        }
        final C6IH LJ = C6IH.LJ();
        Context context = c6ik.getContext();
        TextFontStyleData textFontStyleData2 = c6ik.LJLJJL;
        if (context == null) {
            LJ.getClass();
        } else {
            LJ.LJ.LJJIIZI(textFontStyleData2.LIZJ, new IFetchEffectListener() { // from class: X.6II
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect) {
                    TextFontStyleData LJI = C6IH.this.LJI(effect);
                    C6IJ c6ij = c6ik;
                    if (c6ij != null) {
                        if (LJI != null) {
                            c6ij.LIZ(LJI, true);
                        } else {
                            c6ij.onError();
                        }
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    try {
                        TextFontStyleData textFontStyleData3 = (TextFontStyleData) C6YJ.LIZ.LJI(effect.getExtra(), TextFontStyleData.class);
                        if (C6IH.this.LIZ.get(textFontStyleData3.fileName) != null) {
                            C6IH.this.LIZ.get(textFontStyleData3.fileName).LIZIZ = 2;
                        }
                        exceptionResult.getException();
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    C6IJ c6ij = c6ik;
                    if (c6ij != null) {
                        c6ij.onError();
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("textFontDownload err: ");
                    LIZ.append(exceptionResult.getMsg());
                    H7B.LIZJ(X1D.LIZIZ(LIZ));
                }
            });
        }
        c6ik.LJLJJL.LIZIZ = 3;
        c6ik.LIZIZ();
    }

    public static final void onClick$11(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        C1556068u c1556068u = (C1556068u) aCListenerS37S0200000_2.l0;
        C1556168v c1556168v = (C1556168v) aCListenerS37S0200000_2.l1;
        c1556068u.LIZIZ();
        C1556068u.LJ(1.1666666f, view, false);
        ((C1556168v) view).LJLJJL = true;
        InterfaceC1556368x interfaceC1556368x = c1556068u.LJLJJI;
        if (interfaceC1556368x != null) {
            interfaceC1556368x.LIZ(((Integer) view.getTag()).intValue());
        }
        c1556068u.LJLJL.LIZ(c1556168v);
    }

    public static final void onClick$12(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        if (!((C136305Wo) aCListenerS37S0200000_2.l0).LJLJLJ) {
            return;
        }
        ((C142405iO) aCListenerS37S0200000_2.l1).LIZJ.LIZJ();
        ((C136305Wo) aCListenerS37S0200000_2.l0).LJLJL.invoke();
        C142405iO c142405iO = (C142405iO) aCListenerS37S0200000_2.l1;
        c142405iO.LJIIIIZZ = true;
        InterfaceC82683Wch interfaceC82683Wch = c142405iO.LJII;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    public static final void onClick$13(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        boolean z;
        int i;
        EffectModel effectModel;
        InterfaceC170526me interfaceC170526me = ((C170416mT) aCListenerS37S0200000_2.l0).LJLJI;
        if (interfaceC170526me != null) {
            int LIZ = interfaceC170526me.LIZ(((C170436mV) aCListenerS37S0200000_2.l1).getAbsoluteAdapterPosition());
            EffectModel effectModel2 = ((C170436mV) aCListenerS37S0200000_2.l1).LJLJJLL;
            if (-1 == LIZ || effectModel2 == null) {
                return;
            }
            List<EffectModel> data = ((C170416mT) aCListenerS37S0200000_2.l0).getData();
            boolean z2 = false;
            if (data != null && (effectModel = (EffectModel) ORZ.LJLLLLLL(LIZ, data)) != null) {
                z = effectModel.isEnabled;
            } else {
                z = false;
            }
            C170416mT c170416mT = (C170416mT) aCListenerS37S0200000_2.l0;
            InterfaceC170526me interfaceC170526me2 = c170416mT.LJLJI;
            if (interfaceC170526me2 != null) {
                if (c170416mT.LJLILLLLZI.LJIIJ) {
                    i = LIZ;
                } else {
                    i = LIZ + 1;
                }
                if (interfaceC170526me2.LIZIZ(i, LIZ, z)) {
                    z2 = true;
                }
            }
            if (!z || !z2) {
                return;
            }
            C170416mT c170416mT2 = (C170416mT) aCListenerS37S0200000_2.l0;
            c170416mT2.LJLJJI = LIZ;
            c170416mT2.notifyDataSetChanged();
        }
    }

    public static final void onClick$14(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        ((C6QE) aCListenerS37S0200000_2.l0).LIZ();
        C6QG c6qg = ((C6QE) aCListenerS37S0200000_2.l0).LJ;
        if (c6qg != null) {
            c6qg.LIZ(((C6NN) aCListenerS37S0200000_2.l1).LIZ, 0);
        }
    }

    public static final void onClick$15(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        ((C6QE) aCListenerS37S0200000_2.l0).LIZ();
        C6QG c6qg = ((C6QE) aCListenerS37S0200000_2.l0).LJ;
        if (c6qg != null) {
            c6qg.LIZ(((C6NN) aCListenerS37S0200000_2.l1).LIZ, 0);
        }
    }

    public static final void onClick$16(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        C29701Eo c29701Eo = (C29701Eo) ((View) aCListenerS37S0200000_2.l0).findViewById(R.id.fa6);
        c29701Eo.setSpeed(1.5f);
        c29701Eo.cancelAnimation();
        c29701Eo.playAnimation();
        ((C6QL) aCListenerS37S0200000_2.l1).LJ.LIZ(0);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C6QL) aCListenerS37S0200000_2.l1).LIZLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onClick$17(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        SmartRouter.buildRoute((Context) aCListenerS37S0200000_2.l0, "sslocal://webcast_rank_setting").open();
        View tipView = (View) aCListenerS37S0200000_2.l1;
        o.LJIIIIZZ(tipView, "tipView");
        ASQ.LIZLLL(tipView, ASX.LIZ);
    }

    public static final void onClick$18(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        long j;
        long j2;
        View view2 = (View) aCListenerS37S0200000_2.l0;
        long currentTimeMillis = System.currentTimeMillis();
        if (view2.getTag(1123460103) != null) {
            Object tag = view2.getTag(1123460103);
            o.LJII(tag, "null cannot be cast to non-null type kotlin.Long");
            j = ((Long) tag).longValue();
        } else {
            j = -601;
        }
        long j3 = currentTimeMillis - j;
        if (view2.getTag(1123461123) != null) {
            Object tag2 = view2.getTag(1123461123);
            o.LJII(tag2, "null cannot be cast to non-null type kotlin.Long");
            j2 = ((Long) tag2).longValue();
        } else {
            j2 = 600;
        }
        if (j3 >= j2) {
            view2.setTag(1123460103, Long.valueOf(currentTimeMillis));
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCListenerS37S0200000_2.l1;
            o.LJII(view, "null cannot be cast to non-null type T of com.ss.ugc.android.editor.core.utils.ViewUtilsKt.clickWithTrigger");
            interfaceC88472Yns.invoke(view);
        }
    }

    public static final void onClick$19(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View btn) {
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aCListenerS37S0200000_2.l0;
        if (interfaceC88471Ynr != null) {
            o.LJIIIIZZ(btn, "btn");
            View root = (View) aCListenerS37S0200000_2.l1;
            o.LJIIIIZZ(root, "root");
            interfaceC88471Ynr.invoke(btn, root);
        }
    }

    public static final void onClick$2(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        ((C82949Wgz) aCListenerS37S0200000_2.l0).LIZJ(new C30461Hm());
        ((EditCaptionScene) aCListenerS37S0200000_2.l1).cancel();
        ((EditCaptionScene) aCListenerS37S0200000_2.l1).LLLILZLLLI();
    }

    public static final void onClick$20(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View btn) {
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aCListenerS37S0200000_2.l0;
        if (interfaceC88471Ynr != null) {
            o.LJIIIIZZ(btn, "btn");
            View root = (View) aCListenerS37S0200000_2.l1;
            o.LJIIIIZZ(root, "root");
            interfaceC88471Ynr.invoke(btn, root);
        }
    }

    public static final void onClick$21(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        ((C6NJ) aCListenerS37S0200000_2.l0).LIZJ.LIZ(((C6NK) aCListenerS37S0200000_2.l1).LIZIZ);
        ((C6NK) aCListenerS37S0200000_2.l1).LJI.invoke();
        C6NJ c6nj = (C6NJ) aCListenerS37S0200000_2.l0;
        c6nj.LJIIIZ = true;
        InterfaceC82683Wch interfaceC82683Wch = c6nj.LJIIIIZZ;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    public static final void onClick$3(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        ((InterfaceC65784Pro) aCListenerS37S0200000_2.l0).invoke();
        ASQ.LIZLLL((View) aCListenerS37S0200000_2.l1, ASX.LIZ);
    }

    public static final void onClick$4(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        ((InterfaceC65784Pro) aCListenerS37S0200000_2.l0).invoke();
        ASQ.LIZLLL((View) aCListenerS37S0200000_2.l1, ASX.LIZ);
    }

    public static final void onClick$5(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        Integer valueOf = Integer.valueOf(((C161686We) aCListenerS37S0200000_2.l0).getBindingAdapterPosition());
        if (valueOf.intValue() != -1) {
            ViewOnClickListenerC161696Wf viewOnClickListenerC161696Wf = (ViewOnClickListenerC161696Wf) aCListenerS37S0200000_2.l1;
            int intValue = valueOf.intValue();
            InterfaceC161676Wd interfaceC161676Wd = viewOnClickListenerC161696Wf.LJLJI;
            if (interfaceC161676Wd != null) {
                interfaceC161676Wd.onItemClick(intValue);
            }
        }
    }

    public static final void onClick$6(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        C6LY c6ly = ((EditTTSPanelFragment) aCListenerS37S0200000_2.l0).LJLJI;
        if (c6ly != null) {
            c6ly.LLFZ((ReadTextEffectBean) aCListenerS37S0200000_2.l1);
        }
    }

    public static final void onClick$7(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View it) {
        ((C149945uY) aCListenerS37S0200000_2.l0).getRetryAnim().start();
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCListenerS37S0200000_2.l1;
        o.LJIIIIZZ(it, "it");
        interfaceC88472Yns.invoke(it);
    }

    public static final void onClick$8(ACListenerS37S0200000_2 aCListenerS37S0200000_2, View view) {
        ((C60U) aCListenerS37S0200000_2.l0).LLJJLIIIJLLLLLLLZ().A7(((C1536461g) aCListenerS37S0200000_2.l1).LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[Catch: Q0C -> 0x0059, TryCatch #0 {Q0C -> 0x0059, blocks: (B:12:0x0031, B:14:0x0035, B:16:0x0049, B:17:0x0050, B:19:0x0054), top: B:11:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$9(Y.ACListenerS37S0200000_2 r4, android.view.View r5) {
        /*
            java.lang.Object r2 = r4.l0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r2
            java.lang.String r1 = com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene.LLJJJJ
            java.lang.String r0 = "FROM_SERIES"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.C162236Yh.LIZJ(r2, r1)
            java.lang.Object r5 = r4.l1
            com.ss.android.ugc.aweme.paidcontent.assem.SeriesPostUIAssem r5 = (com.ss.android.ugc.aweme.paidcontent.assem.SeriesPostUIAssem) r5
            X.A22 r0 = r5.x3()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r0.LJLIL
            if (r4 != 0) goto L1b
        L1a:
            return
        L1b:
            boolean r0 = X.C78886Uxe.LJII(r4)
            if (r0 == 0) goto L29
            X.4uX r0 = X.C124454uX.LJI
            r0.getClass()
            X.C124454uX.LIZLLL()
        L29:
            X.6cH r1 = r5.LJLJJI
            if (r1 == 0) goto L31
            r0 = 1
            r1.buildDrawingCache(r0)
        L31:
            X.6cH r3 = r5.LJLJJI     // Catch: X.Q0C -> L59
            if (r3 == 0) goto L57
            X.FaE r2 = X.C37203Eit.LIZJ     // Catch: X.Q0C -> L59
            java.lang.String r1 = "bpea-get_video_cover"
            r0 = 1476435971(0x5800a003, float:5.6569893E14)
            X.UxG r0 = X.C78857UxB.LJJIIJ(r0, r1)     // Catch: X.Q0C -> L59
            r2.getClass()     // Catch: X.Q0C -> L59
            android.graphics.Bitmap r2 = X.C39214FaE.LIZIZ(r3, r0)     // Catch: X.Q0C -> L59
            if (r2 == 0) goto L57
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch: X.Q0C -> L59
            r0 = 0
            android.graphics.Bitmap r1 = r2.copy(r1, r0)     // Catch: X.Q0C -> L59
        L50:
            com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder r0 = r5.LJLL     // Catch: X.Q0C -> L59
            if (r0 == 0) goto L59
            com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder.LJLIL = r1     // Catch: X.Q0C -> L59
            goto L59
        L57:
            r1 = 0
            goto L50
        L59:
            X.6cH r0 = r5.LJLJJI
            if (r0 == 0) goto L60
            r0.destroyDrawingCache()
        L60:
            X.6dV r1 = new X.6dV
            r1.<init>(r5, r4)
            X.1qj r0 = X.C212428Vi.LIZ(r5)
            if (r0 == 0) goto L1a
            r1.invoke(r0)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS37S0200000_2.onClick$9(Y.ACListenerS37S0200000_2, android.view.View):void");
    }

    public ACListenerS37S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
