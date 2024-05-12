package Y;

import X.AnonymousClass584;
import X.C1294856i;
import X.C1300058i;
import X.C1300758p;
import X.C1302459g;
import X.C1303759t;
import X.C130995Cd;
import X.C131015Cf;
import X.C133315Lb;
import X.C134385Pe;
import X.C140325f2;
import X.C140575fR;
import X.C141485gu;
import X.C141805hQ;
import X.C162476Zf;
import X.C163306b0;
import X.C264612c;
import X.C45737HxF;
import X.C52T;
import X.C52V;
import X.C54F;
import X.C58D;
import X.C58E;
import X.C59H;
import X.C59I;
import X.C59L;
import X.C59Q;
import X.C5AE;
import X.C5BZ;
import X.C5MM;
import X.C5UU;
import X.C61447O9r;
import X.C62Q;
import X.C6KO;
import X.C6KT;
import X.C6KU;
import X.C6KV;
import X.C6KY;
import X.C6KZ;
import X.C6LO;
import X.C6LQ;
import X.C72434Sbm;
import X.C83728WtY;
import X.EnumC158826Le;
import X.EnumC83730Wta;
import X.InterfaceC134405Pg;
import X.InterfaceC153045zY;
import X.OSZ;
import X.ProgressDialogC173706rm;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordScene;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AUListenerS91S0100000_2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                return;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                return;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                return;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                return;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                return;
            case 9:
                onAnimationUpdate$9(this, valueAnimator);
                return;
            case 10:
                onAnimationUpdate$10(this, valueAnimator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                return;
            case 12:
                onAnimationUpdate$12(this, valueAnimator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                return;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                return;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationUpdate$16(this, valueAnimator);
                return;
            case 17:
                onAnimationUpdate$17(this, valueAnimator);
                return;
            case 18:
                onAnimationUpdate$18(this, valueAnimator);
                return;
            case 19:
                onAnimationUpdate$19(this, valueAnimator);
                return;
            case 20:
                onAnimationUpdate$20(this, valueAnimator);
                return;
            case 21:
                onAnimationUpdate$21(this, valueAnimator);
                return;
            case 22:
                onAnimationUpdate$22(this, valueAnimator);
                return;
            case 23:
                onAnimationUpdate$23(this, valueAnimator);
                return;
            case 24:
                onAnimationUpdate$24(this, valueAnimator);
                return;
            case 25:
                onAnimationUpdate$25(this, valueAnimator);
                return;
            case 26:
                onAnimationUpdate$26(this, valueAnimator);
                return;
            case 27:
                onAnimationUpdate$27(this, valueAnimator);
                return;
            case 28:
                onAnimationUpdate$28(this, valueAnimator);
                return;
            case 29:
                onAnimationUpdate$29(this, valueAnimator);
                return;
            case 30:
                onAnimationUpdate$30(this, valueAnimator);
                return;
            case 31:
                onAnimationUpdate$31(this, valueAnimator);
                return;
            case 32:
                onAnimationUpdate$32(this, valueAnimator);
                return;
            case 33:
                onAnimationUpdate$33(this, valueAnimator);
                return;
            case 34:
                onAnimationUpdate$34(this, valueAnimator);
                return;
            case 35:
                onAnimationUpdate$35(this, valueAnimator);
                return;
            case 36:
                onAnimationUpdate$36(this, valueAnimator);
                return;
            case 37:
                onAnimationUpdate$37(this, valueAnimator);
                return;
            case 38:
                onAnimationUpdate$38(this, valueAnimator);
                return;
            case 39:
                onAnimationUpdate$39(this, valueAnimator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onAnimationUpdate$40(this, valueAnimator);
                return;
            case 41:
                onAnimationUpdate$41(this, valueAnimator);
                return;
            case 42:
                onAnimationUpdate$42(this, valueAnimator);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onAnimationUpdate$43(this, valueAnimator);
                return;
            case 44:
                onAnimationUpdate$44(this, valueAnimator);
                return;
            case 45:
                onAnimationUpdate$45(this, valueAnimator);
                return;
            case 46:
                onAnimationUpdate$46(this, valueAnimator);
                return;
            case 47:
                onAnimationUpdate$47(this, valueAnimator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                onAnimationUpdate$48(this, valueAnimator);
                return;
            case C61447O9r.LJIIJ:
                onAnimationUpdate$49(this, valueAnimator);
                return;
            case 50:
                onAnimationUpdate$50(this, valueAnimator);
                return;
            case 51:
                onAnimationUpdate$51(this, valueAnimator);
                return;
            case 52:
                onAnimationUpdate$52(this, valueAnimator);
                return;
            case 53:
                onAnimationUpdate$53(this, valueAnimator);
                return;
            case 54:
                onAnimationUpdate$54(this, valueAnimator);
                return;
            case 55:
                onAnimationUpdate$55(this, valueAnimator);
                return;
            case 56:
                onAnimationUpdate$56(this, valueAnimator);
                return;
            case 57:
                onAnimationUpdate$57(this, valueAnimator);
                return;
            case 58:
                onAnimationUpdate$58(this, valueAnimator);
                return;
            case 59:
                onAnimationUpdate$59(this, valueAnimator);
                return;
            case 60:
                onAnimationUpdate$60(this, valueAnimator);
                return;
            case 61:
                onAnimationUpdate$61(this, valueAnimator);
                return;
            case BaseNotice.CREATOR /* 62 */:
                onAnimationUpdate$62(this, valueAnimator);
                return;
            case 63:
                onAnimationUpdate$63(this, valueAnimator);
                return;
            case 64:
                onAnimationUpdate$64(this, valueAnimator);
                return;
            case 65:
                onAnimationUpdate$65(this, valueAnimator);
                return;
            case 66:
                onAnimationUpdate$66(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public AUListenerS91S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C6LO) aUListenerS91S0100000_2.l0).LJLIL.setScaleX(floatValue);
        ((C6LO) aUListenerS91S0100000_2.l0).LJLIL.setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$1(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C6LO) aUListenerS91S0100000_2.l0).LJLIL.setScaleX(floatValue);
        ((C6LO) aUListenerS91S0100000_2.l0).LJLIL.setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$10(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ImageView imageView = ((C6KY) aUListenerS91S0100000_2.l0).LJLIL;
        if (imageView != null) {
            imageView.setScaleX(floatValue);
            ImageView imageView2 = ((C6KY) aUListenerS91S0100000_2.l0).LJLIL;
            if (imageView2 != null) {
                imageView2.setScaleY(floatValue);
                return;
            } else {
                o.LJIJI("bgView");
                throw null;
            }
        }
        o.LJIJI("bgView");
        throw null;
    }

    public static final void onAnimationUpdate$11(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        long currentTimeMillis = System.currentTimeMillis();
        C62Q c62q = (C62Q) aUListenerS91S0100000_2.l0;
        if (currentTimeMillis - c62q.LJLJLJ > 64) {
            c62q.LJLJLJ = System.currentTimeMillis();
            C72434Sbm c72434Sbm = ((C62Q) aUListenerS91S0100000_2.l0).LJLILLLLZI;
            if (c72434Sbm != null) {
                Object animatedValue = animation.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                c72434Sbm.setRotation(((Float) animatedValue).floatValue());
                return;
            }
            o.LJIJI("musicCover");
            throw null;
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C6KT c6kt = (C6KT) aUListenerS91S0100000_2.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c6kt.LJLILLLLZI = ((Float) animatedValue).floatValue();
        ((C6KT) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$13(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C6KT c6kt = (C6KT) aUListenerS91S0100000_2.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c6kt.LJLILLLLZI = ((Float) animatedValue).floatValue();
        ((C6KT) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$14(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        EditAudioRecordScene editAudioRecordScene = (EditAudioRecordScene) aUListenerS91S0100000_2.l0;
        InterfaceC153045zY interfaceC153045zY = editAudioRecordScene.mVEEditor;
        if (interfaceC153045zY == null) {
            return;
        }
        editAudioRecordScene.getProcessTimeLiveData().setValue(Long.valueOf(interfaceC153045zY.LJZL()));
        float LJZL = interfaceC153045zY.LJZL() / interfaceC153045zY.getDuration();
        C6KO c6ko = ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
        if (c6ko != null) {
            c6ko.LJJIIJ(LJZL);
            if (((EditAudioRecordScene) aUListenerS91S0100000_2.l0).isRecording()) {
                C6KO c6ko2 = ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
                if (c6ko2 != null) {
                    int LIZ = c6ko2.LIZ(interfaceC153045zY.LJZL(), ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).curPoint);
                    C6KO c6ko3 = ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
                    if (c6ko3 != null) {
                        c6ko3.LIZIZ();
                        if (LIZ == -1) {
                            Point point = ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).curPoint;
                            if (point != null) {
                                point.setY(interfaceC153045zY.LJZL());
                            }
                            C6KO c6ko4 = ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
                            if (c6ko4 != null) {
                                c6ko4.LIZIZ();
                            } else {
                                o.LJIJI("audioRecordSeekBar");
                                throw null;
                            }
                        } else {
                            Point point2 = ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).curPoint;
                            if (point2 != null) {
                                point2.setY(LIZ);
                            }
                            C6KO c6ko5 = ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
                            if (c6ko5 != null) {
                                c6ko5.LIZIZ();
                                ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).pause(false, LIZ, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_RECORD_BTN_ANIM_END, EnumC158826Le.USER_OPERATION));
                            } else {
                                o.LJIJI("audioRecordSeekBar");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("audioRecordSeekBar");
                        throw null;
                    }
                } else {
                    o.LJIJI("audioRecordSeekBar");
                    throw null;
                }
            } else {
                ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).curPoint = null;
            }
            int LJZL2 = interfaceC153045zY.LJZL();
            EditAudioRecordScene editAudioRecordScene2 = (EditAudioRecordScene) aUListenerS91S0100000_2.l0;
            if (LJZL2 >= editAudioRecordScene2.duration) {
                if (editAudioRecordScene2.isRecording()) {
                    EditAudioRecordScene.pause$default((EditAudioRecordScene) aUListenerS91S0100000_2.l0, true, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_DURATION_END, EnumC158826Le.USER_OPERATION), 2, null);
                    return;
                }
                ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).progressGetter.cancel();
                ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).onSeekChangeListener.LIZ(0.0f, true);
                C6KO c6ko6 = ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
                if (c6ko6 != null) {
                    c6ko6.LJJIIJ(0.0f);
                    EditAudioRecordScene editAudioRecordScene3 = (EditAudioRecordScene) aUListenerS91S0100000_2.l0;
                    AudioRecorderParam audioRecorderParam = editAudioRecordScene3.audioRecorderParam;
                    C6KO c6ko7 = editAudioRecordScene3.audioRecordSeekBar;
                    if (c6ko7 != null) {
                        audioRecorderParam.setMStack(c6ko7.getStack());
                        if (((EditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecorderParam.getMStack().isEmpty()) {
                            View view = ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).backView;
                            if (view != null) {
                                view.setVisibility(8);
                                return;
                            } else {
                                o.LJIJI("backView");
                                throw null;
                            }
                        }
                        View view2 = ((EditAudioRecordScene) aUListenerS91S0100000_2.l0).backView;
                        if (view2 != null) {
                            view2.setVisibility(0);
                            return;
                        } else {
                            o.LJIJI("backView");
                            throw null;
                        }
                    }
                    o.LJIJI("audioRecordSeekBar");
                    throw null;
                }
                o.LJIJI("audioRecordSeekBar");
                throw null;
            }
            return;
        }
        o.LJIJI("audioRecordSeekBar");
        throw null;
    }

    public static final void onAnimationUpdate$15(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ImageView imageView = ((C6KU) aUListenerS91S0100000_2.l0).LJLIL;
        if (imageView != null) {
            imageView.setScaleX(floatValue);
            ImageView imageView2 = ((C6KU) aUListenerS91S0100000_2.l0).LJLIL;
            if (imageView2 != null) {
                imageView2.setScaleY(floatValue);
                return;
            } else {
                o.LJIJI("bgView");
                throw null;
            }
        }
        o.LJIJI("bgView");
        throw null;
    }

    public static final void onAnimationUpdate$16(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ImageView imageView = ((C6KU) aUListenerS91S0100000_2.l0).LJLIL;
        if (imageView != null) {
            imageView.setScaleX(floatValue);
            ImageView imageView2 = ((C6KU) aUListenerS91S0100000_2.l0).LJLIL;
            if (imageView2 != null) {
                imageView2.setScaleY(floatValue);
                return;
            } else {
                o.LJIJI("bgView");
                throw null;
            }
        }
        o.LJIJI("bgView");
        throw null;
    }

    public static final void onAnimationUpdate$17(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (((C133315Lb) aUListenerS91S0100000_2.l0).LIZJ.getState() == VEEditor.VEState.STARTED) {
            ((C133315Lb) aUListenerS91S0100000_2.l0).LIZLLL.invoke();
        }
        OSZ<Long, Long> osz = ((C133315Lb) aUListenerS91S0100000_2.l0).LJI;
        if (osz != null) {
            long longValue = osz.getSecond().longValue();
            C133315Lb c133315Lb = (C133315Lb) aUListenerS91S0100000_2.l0;
            if (longValue - c133315Lb.LIZJ.LJZL() < 30) {
                c133315Lb.LJI = null;
                c133315Lb.LJFF.setValue(new C5MM(3, longValue, null));
                c133315Lb.LJ.invoke();
            }
        }
    }

    public static final void onAnimationUpdate$18(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        ((VEVideoPublishPreviewScene) aUListenerS91S0100000_2.l0).LJLLILLLL.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$19(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        C140325f2 c140325f2 = (C140325f2) aUListenerS91S0100000_2.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c140325f2.LJI = ((Float) animatedValue).floatValue();
    }

    public static final void onAnimationUpdate$2(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C6LQ c6lq = (C6LQ) aUListenerS91S0100000_2.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c6lq.LJLILLLLZI = ((Float) animatedValue).floatValue();
        ((C6LQ) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$20(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        NowsEditRootScene nowsEditRootScene = (NowsEditRootScene) aUListenerS91S0100000_2.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        nowsEditRootScene.LLJZIJLIL(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$21(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        NowsEditRootScene nowsEditRootScene = (NowsEditRootScene) aUListenerS91S0100000_2.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        nowsEditRootScene.LLJZIJLIL(((Integer) animatedValue).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r3 > 64) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationUpdate$22(Y.AUListenerS91S0100000_2 r7, android.animation.ValueAnimator r8) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.Object r1 = r8.getAnimatedValue()
            boolean r0 = r1 instanceof java.lang.Float
            r6 = 0
            if (r0 == 0) goto L30
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L30
            float r4 = r1.floatValue()
        L16:
            long r2 = r8.getDuration()
            float r1 = (float) r2
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment r0 = (com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment) r0
            float r0 = r0.LLD
            float r0 = r4 - r0
            float r0 = r0 * r1
            int r5 = X.O6R.LJJIIZ(r0)
            long r1 = r8.getDuration()
            int r0 = (int) r1
            if (r5 != r0) goto L32
            return
        L30:
            r4 = 0
            goto L16
        L32:
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment r0 = (com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment) r0
            r0.LLD = r4
            X.5Ap r0 = r0.LLF
            java.lang.String r4 = "audioTrack"
            if (r0 == 0) goto L80
            int r2 = r0.getCurTimePosition()
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment r0 = (com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment) r0
            X.56D r0 = r0.pm()
            int r1 = r0.LJZL()
            int r3 = r1 - r2
            r0 = 32
            if (r3 <= r0) goto L73
            r1 = 1067030938(0x3f99999a, float:1.2)
        L57:
            float r0 = (float) r5
            float r0 = r0 * r1
            int r5 = (int) r0
            r0 = 64
            if (r3 <= r0) goto L7a
        L5e:
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment r0 = (com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment) r0
            X.5Ap r2 = r0.LLF
            if (r2 == 0) goto L7c
            float r1 = (float) r3
            float r0 = r2.LJLJJI
            float r1 = r1 * r0
            int r1 = X.O6R.LJJIIZ(r1)
            r0 = 0
            r2.scrollBy(r1, r0)
            return
        L73:
            int r2 = r2 - r1
            if (r2 <= r0) goto L7a
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            goto L57
        L7a:
            r3 = r5
            goto L5e
        L7c:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r6
        L80:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS91S0100000_2.onAnimationUpdate$22(Y.AUListenerS91S0100000_2, android.animation.ValueAnimator):void");
    }

    public static final void onAnimationUpdate$23(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        float f;
        Float f2;
        o.LJIIIZ(it, "it");
        C1294856i cursor$tools_camera_edit_release = ((C54F) aUListenerS91S0100000_2.l0).getCursor$tools_camera_edit_release();
        if (cursor$tools_camera_edit_release == null) {
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = 1.0f;
        }
        cursor$tools_camera_edit_release.setAlpha(f);
    }

    public static final void onAnimationUpdate$24(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        float f;
        Float f2;
        o.LJIIIZ(it, "it");
        View LIZ = ((C54F) aUListenerS91S0100000_2.l0).LIZ();
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = 1.0f;
        }
        LIZ.setAlpha(f);
    }

    public static final void onAnimationUpdate$25(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Paint paint = ((C130995Cd) aUListenerS91S0100000_2.l0).LJLJJI;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        paint.setAlpha((int) (((Float) animatedValue).floatValue() * 255));
        ((C130995Cd) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$26(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((C131015Cf) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$27(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C58D c58d = (C58D) aUListenerS91S0100000_2.l0;
        View frameScroller = c58d._$_findCachedViewById(R.id.dmw);
        o.LJIIIIZZ(frameScroller, "frameScroller");
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c58d.changeTopMargin(frameScroller, ((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$28(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator animValue) {
        o.LJIIIZ(animValue, "animValue");
        for (C1300058i c1300058i : ((C58E) aUListenerS91S0100000_2.l0).LJLIL.getDropList()) {
            Object animatedValue = animValue.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C5BZ LIZ = c1300058i.LIZ();
            LIZ.setScaleX(floatValue);
            LIZ.setScaleY(floatValue);
        }
    }

    public static final void onAnimationUpdate$29(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup viewGroup = (ViewGroup) aUListenerS91S0100000_2.l0;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            marginLayoutParams.topMargin = ((Integer) animatedValue).intValue();
            viewGroup.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void onAnimationUpdate$3(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C6LQ c6lq = (C6LQ) aUListenerS91S0100000_2.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c6lq.LJLILLLLZI = ((Float) animatedValue).floatValue();
        ((C6LQ) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$30(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ProgressDialogC173706rm progressDialogC173706rm = (ProgressDialogC173706rm) aUListenerS91S0100000_2.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressDialogC173706rm.setProgress(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$31(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C163306b0 c163306b0 = (C163306b0) aUListenerS91S0100000_2.l0;
        c163306b0.LJLLL = (-c163306b0.LJLJJLL) * floatValue;
        c163306b0.invalidate();
    }

    public static final void onAnimationUpdate$32(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        View _$_findCachedViewById = ((FTCVideoPublishPreviewActivity) aUListenerS91S0100000_2.l0)._$_findCachedViewById(R.id.ewm);
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        _$_findCachedViewById.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$33(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            View view = (View) aUListenerS91S0100000_2.l0;
            if (view == null) {
                return;
            }
            view.setAlpha(floatValue);
        }
    }

    public static final void onAnimationUpdate$34(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((View) aUListenerS91S0100000_2.l0).setAlpha(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$35(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        View findViewById = ((View) aUListenerS91S0100000_2.l0).findViewById(R.id.m7l);
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        findViewById.setTranslationX(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$36(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        float f2;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f = (Float) animatedValue;
        } else {
            f = null;
        }
        View view = (View) aUListenerS91S0100000_2.l0;
        float f3 = 0.6f;
        if (view != null) {
            if (f != null) {
                f2 = f.floatValue();
            } else {
                f2 = 0.6f;
            }
            view.setScaleX(f2);
        }
        View view2 = (View) aUListenerS91S0100000_2.l0;
        if (view2 != null) {
            if (f != null) {
                f3 = f.floatValue();
            }
            view2.setScaleY(f3);
        }
        View view3 = (View) aUListenerS91S0100000_2.l0;
        if (view3 != null) {
            view3.requestLayout();
        }
    }

    public static final void onAnimationUpdate$37(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        float f2;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f = (Float) animatedValue;
        } else {
            f = null;
        }
        View view = (View) aUListenerS91S0100000_2.l0;
        float f3 = 0.6f;
        if (view != null) {
            if (f != null) {
                f2 = f.floatValue();
            } else {
                f2 = 0.6f;
            }
            view.setScaleX(f2);
        }
        View view2 = (View) aUListenerS91S0100000_2.l0;
        if (view2 != null) {
            if (f != null) {
                f3 = f.floatValue();
            }
            view2.setScaleY(f3);
        }
        View view3 = (View) aUListenerS91S0100000_2.l0;
        if (view3 != null) {
            view3.requestLayout();
        }
    }

    public static final void onAnimationUpdate$38(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        float f2;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f = (Float) animatedValue;
        } else {
            f = null;
        }
        View view = (View) aUListenerS91S0100000_2.l0;
        float f3 = 1.0f;
        if (view != null) {
            if (f != null) {
                f2 = f.floatValue();
            } else {
                f2 = 1.0f;
            }
            view.setScaleX(f2);
        }
        View view2 = (View) aUListenerS91S0100000_2.l0;
        if (view2 != null) {
            if (f != null) {
                f3 = f.floatValue();
            }
            view2.setScaleY(f3);
        }
        View view3 = (View) aUListenerS91S0100000_2.l0;
        if (view3 != null) {
            view3.requestLayout();
        }
    }

    public static final void onAnimationUpdate$39(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        C45737HxF c45737HxF = (C45737HxF) aUListenerS91S0100000_2.l0;
        c45737HxF.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = c45737HxF.LJLJLJ;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) floatValue;
        view.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$4(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        int i;
        int i2;
        o.LJIIIZ(it, "it");
        C59L c59l = (C59L) aUListenerS91S0100000_2.l0;
        if (c59l.LLILZ == C5AE.NULL) {
            return;
        }
        int i3 = C59Q.LIZ[c59l.LLILLJJLI.ordinal()];
        if (i3 != 1) {
            float f = 0.0f;
            if (i3 != 2) {
                if (i3 == 3) {
                    float f2 = C1300758p.LJII;
                    C59L c59l2 = (C59L) aUListenerS91S0100000_2.l0;
                    i = (int) (f2 * c59l2.LLF);
                    if (!c59l2.LJFF()) {
                        i2 = ((C59L) aUListenerS91S0100000_2.l0).LLIIIILZ;
                        f = i2;
                    }
                } else {
                    throw new C162476Zf();
                }
            } else {
                float f3 = -C1300758p.LJII;
                C59L c59l3 = (C59L) aUListenerS91S0100000_2.l0;
                i = (int) (f3 * c59l3.LLF);
                if (c59l3.LJFF()) {
                    i2 = ((C59L) aUListenerS91S0100000_2.l0).LLIIIILZ;
                    f = i2;
                }
            }
            C59L c59l4 = (C59L) aUListenerS91S0100000_2.l0;
            c59l4.LIZJ(c59l4.LLILZ, i, f);
            C59L c59l5 = (C59L) aUListenerS91S0100000_2.l0;
            C59H c59h = c59l5.LLILZIL;
            if (c59h != null) {
                if (c59l5.LJFF()) {
                    i = -i;
                }
                C59I.LIZ(c59h, i, 0, false, true, 16);
            }
        }
    }

    public static final void onAnimationUpdate$40(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        InterfaceC134405Pg interfaceC134405Pg = ((C134385Pe) aUListenerS91S0100000_2.l0).LLII;
        if (interfaceC134405Pg != null) {
            interfaceC134405Pg.LIZJ();
        }
        Rect deltaLeftTopRightBottom = ((C134385Pe) aUListenerS91S0100000_2.l0).getDeltaLeftTopRightBottom();
        int i = deltaLeftTopRightBottom.left;
        int i2 = deltaLeftTopRightBottom.top;
        int i3 = deltaLeftTopRightBottom.right;
        int i4 = deltaLeftTopRightBottom.bottom;
        C134385Pe c134385Pe = (C134385Pe) aUListenerS91S0100000_2.l0;
        Rect rect = c134385Pe.LJLJLJ;
        Rect rect2 = c134385Pe.LJLLI;
        rect.top = rect2.top - ((int) (i2 * animatedFraction));
        rect.bottom = rect2.bottom + ((int) (i4 * animatedFraction));
        rect.left = rect2.left - ((int) (i * animatedFraction));
        rect.right = rect2.right + ((int) (i3 * animatedFraction));
        if (animatedFraction >= 1.0f) {
            c134385Pe.LLFZ = true;
            InterfaceC134405Pg interfaceC134405Pg2 = c134385Pe.LLII;
            if (interfaceC134405Pg2 != null) {
                interfaceC134405Pg2.LIZLLL();
            }
        }
        ((C134385Pe) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$41(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        float f;
        Float f2;
        o.LJIIIZ(it, "it");
        View LIZ = ((C54F) aUListenerS91S0100000_2.l0).LIZ();
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = 1.0f;
        }
        LIZ.setAlpha(f);
    }

    public static final void onAnimationUpdate$42(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        C5AE c5ae;
        float f;
        float f2;
        float f3;
        float f4;
        o.LJIIIZ(it, "it");
        C1303759t c1303759t = (C1303759t) aUListenerS91S0100000_2.l0;
        C5AE c5ae2 = c1303759t.LJJIIJ;
        C5AE c5ae3 = C5AE.NULL;
        if (c5ae2 == c5ae3 || (c5ae = c1303759t.LJIJJLI) == c5ae3) {
            return;
        }
        C5AE c5ae4 = C5AE.START;
        if (c5ae == c5ae4) {
            f = -C1300758p.LJII;
            f2 = c1303759t.LJJIJLIJ;
        } else {
            f = C1300758p.LJII;
            f2 = c1303759t.LJJIJLIJ;
        }
        float f5 = f * f2;
        if (c5ae2 == c5ae4) {
            if (c1303759t.LIZLLL) {
                f4 = c1303759t.LJJII.left - f5;
            } else {
                f4 = c1303759t.LJJII.right + f5;
            }
            c1303759t.LJIIIIZZ(f4, true);
        } else {
            if (c1303759t.LIZLLL) {
                f3 = c1303759t.LJJIII.right - f5;
            } else {
                f3 = c1303759t.LJJIII.left + f5;
            }
            c1303759t.LJII(f3, true);
        }
        ((C1303759t) aUListenerS91S0100000_2.l0).LIZ.invalidate();
        ((C1303759t) aUListenerS91S0100000_2.l0).LJI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r6 > (-r2)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r6 < r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        if (r6 < r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        if ((r2 + r6) > 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationUpdate$43(Y.AUListenerS91S0100000_2 r8, android.animation.ValueAnimator r9) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS91S0100000_2.onAnimationUpdate$43(Y.AUListenerS91S0100000_2, android.animation.ValueAnimator):void");
    }

    public static final void onAnimationUpdate$44(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        View findViewById;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            ((AnonymousClass584) aUListenerS91S0100000_2.l0).LIZ.setAlpha(floatValue);
            ((AnonymousClass584) aUListenerS91S0100000_2.l0).LIZJ.setAlpha(floatValue);
            C58D c58d = ((AnonymousClass584) aUListenerS91S0100000_2.l0).LIZLLL;
            if (c58d == null || (findViewById = c58d.findViewById(R.id.evq)) == null) {
                return;
            }
            findViewById.setAlpha(floatValue);
        }
    }

    public static final void onAnimationUpdate$45(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        View findViewById;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            C58D c58d = ((AnonymousClass584) aUListenerS91S0100000_2.l0).LIZLLL;
            if (c58d != null && (findViewById = c58d.findViewById(R.id.dmw)) != null) {
                findViewById.setAlpha(floatValue);
            }
            AnonymousClass584 anonymousClass584 = (AnonymousClass584) aUListenerS91S0100000_2.l0;
            C52T c52t = anonymousClass584.LIZIZ;
            if (c52t != null) {
                c52t.H80(C52V.PLAY, floatValue);
                c52t.H80(C52V.FULL_SCREEN, floatValue);
                c52t.H80(C52V.UNDO, anonymousClass584.LJFF * floatValue);
                c52t.H80(C52V.REDO, anonymousClass584.LJI * floatValue);
            }
        }
    }

    public static final void onAnimationUpdate$46(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        View findViewById;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            C58D c58d = ((AnonymousClass584) aUListenerS91S0100000_2.l0).LIZLLL;
            if (c58d != null && (findViewById = c58d.findViewById(R.id.dmw)) != null) {
                findViewById.setAlpha(floatValue);
            }
            AnonymousClass584 anonymousClass584 = (AnonymousClass584) aUListenerS91S0100000_2.l0;
            C52T c52t = anonymousClass584.LIZIZ;
            if (c52t != null) {
                c52t.H80(C52V.PLAY, floatValue);
                c52t.H80(C52V.FULL_SCREEN, floatValue);
                c52t.H80(C52V.UNDO, anonymousClass584.LJFF * floatValue);
                c52t.H80(C52V.REDO, floatValue * 0.34f);
            }
        }
    }

    public static final void onAnimationUpdate$47(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        View findViewById;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            ((AnonymousClass584) aUListenerS91S0100000_2.l0).LIZ.setAlpha(floatValue);
            ((AnonymousClass584) aUListenerS91S0100000_2.l0).LIZJ.setAlpha(floatValue);
            C58D c58d = ((AnonymousClass584) aUListenerS91S0100000_2.l0).LIZLLL;
            if (c58d == null || (findViewById = c58d.findViewById(R.id.evq)) == null) {
                return;
            }
            findViewById.setAlpha(floatValue);
        }
    }

    public static final void onAnimationUpdate$48(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C5UU) aUListenerS91S0100000_2.l0).setRecordButtonRadius(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$49(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C5UU) aUListenerS91S0100000_2.l0).setRecordButtonWidth(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        ((C140575fR) aUListenerS91S0100000_2.l0).LJLJJI.setTranslate(0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        ((C140575fR) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$50(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C5UU) aUListenerS91S0100000_2.l0).setRecordButtonRadius(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$51(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C5UU) aUListenerS91S0100000_2.l0).setRecordButtonWidth(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$52(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        boolean z;
        C1302459g c1302459g;
        int i;
        o.LJIIIZ(it, "it");
        float LJIILIIL = ((C1302459g) aUListenerS91S0100000_2.l0).LJIILIIL() * (1000.0f / ((Number) ((C1302459g) aUListenerS91S0100000_2.l0).LJJIJIIJI.getValue()).intValue());
        C1302459g c1302459g2 = (C1302459g) aUListenerS91S0100000_2.l0;
        float LJIILIIL2 = c1302459g2.LJIILIIL() * ((float) c1302459g2.LJIILIIL);
        if (((Number) ((C1302459g) aUListenerS91S0100000_2.l0).LJJIJIIJI.getValue()).intValue() <= 60) {
            z = true;
        } else {
            z = false;
        }
        C1302459g c1302459g3 = (C1302459g) aUListenerS91S0100000_2.l0;
        float f = c1302459g3.LJIIJJI;
        float f2 = c1302459g3.LJIIL;
        float f3 = f - f2;
        float f4 = 2 * LJIILIIL;
        if (f3 > f4) {
            if (z && f3 > 6 * LJIILIIL) {
                c1302459g3.LJIIL = f;
            } else {
                c1302459g3.LJIIL = f2 + f4;
            }
        } else {
            float f5 = f2 - f;
            if (f5 > f4) {
                if (z && f5 > 6 * LJIILIIL) {
                    return;
                } else {
                    c1302459g3.LJIIL = (LJIILIIL * 0.5f) + f2;
                }
            } else {
                c1302459g3.LJIIL = f2 + LJIILIIL;
            }
        }
        if (c1302459g3.LJIILJJIL()) {
            c1302459g = (C1302459g) aUListenerS91S0100000_2.l0;
            i = -((int) (c1302459g.LJIIL + LJIILIIL2));
        } else {
            c1302459g = (C1302459g) aUListenerS91S0100000_2.l0;
            i = (int) (c1302459g.LJIIL + LJIILIIL2);
        }
        C59I.LIZ(((C1302459g) aUListenerS91S0100000_2.l0).LIZIZ, i - c1302459g.LJIIL(), 0, true, false, 24);
    }

    public static final void onAnimationUpdate$53(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        ((ImageView) aUListenerS91S0100000_2.l0).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$54(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        ((ImageView) aUListenerS91S0100000_2.l0).setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$55(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        ((ImageView) aUListenerS91S0100000_2.l0).setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$56(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((ImageView) aUListenerS91S0100000_2.l0).setScaleX(floatValue);
        ((ImageView) aUListenerS91S0100000_2.l0).setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$57(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        ((ImageView) aUListenerS91S0100000_2.l0).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$58(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((ImageView) aUListenerS91S0100000_2.l0).setScaleX(floatValue);
        ((ImageView) aUListenerS91S0100000_2.l0).setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$59(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        ((ImageView) aUListenerS91S0100000_2.l0).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$6(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C6KZ c6kz = (C6KZ) aUListenerS91S0100000_2.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c6kz.LJLILLLLZI = ((Float) animatedValue).floatValue();
        ((C6KZ) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$60(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        ((ImageView) aUListenerS91S0100000_2.l0).setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$61(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        ((ImageView) aUListenerS91S0100000_2.l0).setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$62(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((ImageView) aUListenerS91S0100000_2.l0).setScaleX(floatValue);
        ((ImageView) aUListenerS91S0100000_2.l0).setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$63(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((ImageView) aUListenerS91S0100000_2.l0).setScaleX(floatValue);
        ((ImageView) aUListenerS91S0100000_2.l0).setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$64(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        Integer num;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((View) aUListenerS91S0100000_2.l0).getLayoutParams().height = num.intValue();
            ((View) aUListenerS91S0100000_2.l0).requestLayout();
        }
    }

    public static final void onAnimationUpdate$65(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((C141805hQ) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$66(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        C141485gu c141485gu = (C141485gu) aUListenerS91S0100000_2.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c141485gu.LJLJJLL = ((Float) animatedValue).floatValue();
        ((C141485gu) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$7(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C6KZ c6kz = (C6KZ) aUListenerS91S0100000_2.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c6kz.LJLILLLLZI = ((Float) animatedValue).floatValue();
        ((C6KZ) aUListenerS91S0100000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$8(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator it) {
        int i;
        int i2;
        o.LJIIIZ(it, "it");
        FTCEditAudioRecordScene fTCEditAudioRecordScene = (FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0;
        InterfaceC153045zY interfaceC153045zY = fTCEditAudioRecordScene.mVEEditor;
        if (interfaceC153045zY == null) {
            return;
        }
        fTCEditAudioRecordScene.getProcessTimeLiveData().setValue(Long.valueOf(interfaceC153045zY.LJZL()));
        float LJZL = interfaceC153045zY.LJZL() / interfaceC153045zY.getDuration();
        C6KV c6kv = ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
        if (c6kv != null) {
            c6kv.post(new ARunnableS0S0100001_2(c6kv, LJZL, 0));
            if (((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).isRecording()) {
                C6KV c6kv2 = ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
                if (c6kv2 != null) {
                    int LJZL2 = interfaceC153045zY.LJZL();
                    Point point = ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).curPoint;
                    if (point != null) {
                        i = point.getX();
                    } else {
                        i = LJZL2;
                    }
                    Iterator<T> it2 = c6kv2.LJLILLLLZI.getMStack().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Point point2 = (Point) it2.next();
                            int x = point2.getX();
                            if (i <= x && x <= LJZL2 && LJZL2 <= point2.getY() && !o.LJ(point2, point)) {
                                i2 = point2.getX();
                                break;
                            }
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    C6KV c6kv3 = ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
                    if (c6kv3 != null) {
                        c6kv3.LIZLLL();
                        if (i2 == -1) {
                            Point point3 = ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).curPoint;
                            if (point3 != null) {
                                point3.setY(interfaceC153045zY.LJZL());
                            }
                            C6KV c6kv4 = ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
                            if (c6kv4 != null) {
                                c6kv4.LIZLLL();
                            } else {
                                o.LJIJI("audioRecordSeekBar");
                                throw null;
                            }
                        } else {
                            Point point4 = ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).curPoint;
                            if (point4 != null) {
                                point4.setY(i2);
                            }
                            C6KV c6kv5 = ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
                            if (c6kv5 != null) {
                                c6kv5.LIZLLL();
                                ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).pause(false, i2, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_FTC_RECORD_BTN_ANIM_END, EnumC158826Le.USER_OPERATION));
                            } else {
                                o.LJIJI("audioRecordSeekBar");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("audioRecordSeekBar");
                        throw null;
                    }
                } else {
                    o.LJIJI("audioRecordSeekBar");
                    throw null;
                }
            } else {
                ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).curPoint = null;
            }
            int LJZL3 = interfaceC153045zY.LJZL();
            FTCEditAudioRecordScene fTCEditAudioRecordScene2 = (FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0;
            if (LJZL3 >= fTCEditAudioRecordScene2.duration) {
                if (fTCEditAudioRecordScene2.isRecording()) {
                    FTCEditAudioRecordScene.pause$default((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0, true, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_FTC_DURATION_END, EnumC158826Le.USER_OPERATION), 2, null);
                    return;
                }
                ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).progressGetter.cancel();
                ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).onSeekChangeListener.LIZ(0.0f, true);
                C6KV c6kv6 = ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecordSeekBar;
                if (c6kv6 != null) {
                    c6kv6.post(new ARunnableS0S0100001_2(c6kv6, 0.0f, 0));
                    FTCEditAudioRecordScene fTCEditAudioRecordScene3 = (FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0;
                    AudioRecorderParam audioRecorderParam = fTCEditAudioRecordScene3.audioRecorderParam;
                    C6KV c6kv7 = fTCEditAudioRecordScene3.audioRecordSeekBar;
                    if (c6kv7 != null) {
                        audioRecorderParam.setMStack(c6kv7.getStack());
                        if (((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).audioRecorderParam.getMStack().isEmpty()) {
                            View view = ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).backView;
                            if (view != null) {
                                view.setVisibility(8);
                                return;
                            } else {
                                o.LJIJI("backView");
                                throw null;
                            }
                        }
                        View view2 = ((FTCEditAudioRecordScene) aUListenerS91S0100000_2.l0).backView;
                        if (view2 != null) {
                            view2.setVisibility(0);
                            return;
                        } else {
                            o.LJIJI("backView");
                            throw null;
                        }
                    }
                    o.LJIJI("audioRecordSeekBar");
                    throw null;
                }
                o.LJIJI("audioRecordSeekBar");
                throw null;
            }
            return;
        }
        o.LJIJI("audioRecordSeekBar");
        throw null;
    }

    public static final void onAnimationUpdate$9(AUListenerS91S0100000_2 aUListenerS91S0100000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ImageView imageView = ((C6KY) aUListenerS91S0100000_2.l0).LJLIL;
        if (imageView != null) {
            imageView.setScaleX(floatValue);
            ImageView imageView2 = ((C6KY) aUListenerS91S0100000_2.l0).LJLIL;
            if (imageView2 != null) {
                imageView2.setScaleY(floatValue);
                return;
            } else {
                o.LJIJI("bgView");
                throw null;
            }
        }
        o.LJIJI("bgView");
        throw null;
    }
}
