package Y;

import X.C146485oy;
import X.C1555068k;
import X.C158706Ks;
import X.C162696a1;
import X.C1NS;
import X.C47959Irz;
import X.C5TK;
import X.C66Y;
import X.C6KO;
import X.C6KU;
import X.C6KV;
import X.C6KY;
import X.C6LO;
import X.C6SQ;
import X.C6SS;
import X.C6SU;
import X.C6WM;
import X.C6XL;
import X.C6XP;
import X.C6XQ;
import X.C6XR;
import X.C6Y4;
import X.C6Y8;
import X.C76800UCe;
import X.C78840Uwu;
import X.C78857UxB;
import X.C83728WtY;
import X.EnumC158826Le;
import X.EnumC83730Wta;
import X.InterfaceC139655dx;
import X.InterfaceC88472Yns;
import X.J9K;
import X.KL2;
import X.OSZ;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordScene;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.gamora.editorpro.sticker.text.ColorPickerFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDTListenerS112S0100000_2 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case 9:
                return onTouch$9(this, view, motionEvent);
            case 10:
                return onTouch$10(this, view, motionEvent);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case 12:
                return onTouch$12(this, view, motionEvent);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return onTouch$16(this, view, motionEvent);
            case 17:
                return onTouch$17(this, view, motionEvent);
            case 18:
                return onTouch$18(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS112S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((LiveData) ((CanvasGestureGuideWidget) iDTListenerS112S0100000_2.l0).LIZLLL.getValue()).setValue(Boolean.FALSE);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            float abs = Math.abs(((C1555068k) iDTListenerS112S0100000_2.l0).LLJJIJIL - y);
            C1555068k c1555068k = (C1555068k) iDTListenerS112S0100000_2.l0;
            if (abs >= c1555068k.LLJJJ) {
                return false;
            }
            float abs2 = Math.abs(c1555068k.LLJJIJIIJIL - x);
            C1555068k c1555068k2 = (C1555068k) iDTListenerS112S0100000_2.l0;
            if (abs2 >= c1555068k2.LLJJJ) {
                return false;
            }
            c1555068k2.LJIILIIL();
            return false;
        }
        C1555068k c1555068k3 = (C1555068k) iDTListenerS112S0100000_2.l0;
        c1555068k3.LLJJIJIIJIL = x;
        c1555068k3.LLJJIJIL = y;
        return false;
    }

    public static final boolean onTouch$10(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && C47959Irz.LIZ(motionEvent, ((C6XR) iDTListenerS112S0100000_2.l0).LJZI) < ViewConfiguration.get(((C6XR) iDTListenerS112S0100000_2.l0).requireSceneContext()).getScaledTouchSlop()) {
                C6XR c6xr = (C6XR) iDTListenerS112S0100000_2.l0;
                boolean z = c6xr.LJLLLL;
                if (!z) {
                    VideoPublishEditModel videoPublishEditModel = c6xr.LJLJJLL;
                    if (videoPublishEditModel != null) {
                        String str = c6xr.LJLLJ;
                        if (str == null) {
                            str = "";
                        }
                        C6XQ.LIZJ(videoPublishEditModel, str, z);
                        ((C6XR) iDTListenerS112S0100000_2.l0).LLJJIII(true);
                    } else {
                        o.LJIJI("model");
                        throw null;
                    }
                } else if (!c6xr.LJLZ) {
                    TuxIconView tuxIconView = c6xr.LJLLILLLL;
                    if (tuxIconView != null) {
                        tuxIconView.setVisibility(0);
                        J9K j9k = c6xr.LJLJLLL;
                        if (j9k != null) {
                            j9k.LIZIZ();
                        }
                        ((C6XL) c6xr.LJZL.getValue()).ka(false);
                        c6xr.LJLZ = true;
                    } else {
                        o.LJIJI("pauseButton");
                        throw null;
                    }
                } else {
                    c6xr.LLJILJIL();
                }
            }
        } else {
            ((C6XR) iDTListenerS112S0100000_2.l0).LJZI = motionEvent.getX();
        }
        return false;
    }

    public static final boolean onTouch$11(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                C6WM c6wm = (C6WM) iDTListenerS112S0100000_2.l0;
                c6wm.LJLLLLLL = false;
                c6wm.getUiActions().LJII.invoke(Boolean.TRUE, null);
            }
        } else {
            ((C6WM) iDTListenerS112S0100000_2.l0).LJLLLLLL = true;
        }
        return false;
    }

    public static final boolean onTouch$12(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    ColorPickerFragment colorPickerFragment = (ColorPickerFragment) iDTListenerS112S0100000_2.l0;
                    OSZ<Float, Float> vl = colorPickerFragment.vl(motionEvent);
                    colorPickerFragment.Dl(vl.getFirst().floatValue(), vl.getSecond().floatValue());
                }
            } else {
                OSZ<Float, Float> vl2 = ((ColorPickerFragment) iDTListenerS112S0100000_2.l0).vl(motionEvent);
                ((ColorPickerFragment) iDTListenerS112S0100000_2.l0).Hl(vl2.getFirst().floatValue(), vl2.getSecond().floatValue());
            }
        } else {
            ColorPickerFragment colorPickerFragment2 = (ColorPickerFragment) iDTListenerS112S0100000_2.l0;
            OSZ<Float, Float> vl3 = colorPickerFragment2.vl(motionEvent);
            colorPickerFragment2.Dl(vl3.getFirst().floatValue(), vl3.getSecond().floatValue());
        }
        return true;
    }

    public static final boolean onTouch$13(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        ((C6Y8) iDTListenerS112S0100000_2.l0).LJLJJLL.onNext(motionEvent);
        return true;
    }

    public static final boolean onTouch$14(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        view.setVisibility(8);
        return !C78840Uwu.LJIIIZ((int) motionEvent.getX(), (int) motionEvent.getY(), (View) iDTListenerS112S0100000_2.l0);
    }

    public static final boolean onTouch$15(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        C66Y c66y = (C66Y) iDTListenerS112S0100000_2.l0;
        if (c66y.LJLLLLLL != null) {
            Rect rect = new Rect();
            c66y.LJLLLLLL.getHitRect(rect);
            if (motionEvent.getY() >= rect.top - KL2.LIZJ(c66y.LJLIL, 20.0f)) {
                if (motionEvent.getY() <= KL2.LIZJ(c66y.LJLIL, 20.0f) + rect.bottom) {
                    float height = (rect.height() / 2) + rect.top;
                    float x = motionEvent.getX() - rect.left;
                    if (x < 0.0f) {
                        x = 0.0f;
                    } else if (x > rect.width()) {
                        x = rect.width();
                    }
                    return c66y.LJLLLLLL.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x, height, motionEvent.getMetaState()));
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$16(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        ((C6Y4) iDTListenerS112S0100000_2.l0).LJLJLJ.onNext(motionEvent);
        return true;
    }

    public static final boolean onTouch$17(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C6SQ c6sq = (C6SQ) iDTListenerS112S0100000_2.l0;
            if (c6sq.LLFF && C6SQ.LLIFFJFJJ) {
                c6sq.LLFF = false;
                C1NS<AddYoursStickerModel> c1ns = c6sq.LJLJL;
                if (c1ns != null) {
                    c1ns.LJ(C6SU.LJLIL);
                    ((C6SQ) iDTListenerS112S0100000_2.l0).setInputMode(C6SS.MANUAL);
                } else {
                    o.LJIJI("stateContainer");
                    throw null;
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$18(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        View view2 = ((C146485oy) iDTListenerS112S0100000_2.l0).mView;
        o.LJIIIIZZ(view2, "view");
        C146485oy.LLJILJIL(view2, false);
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        if (motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            FTCEditAudioRecordScene fTCEditAudioRecordScene = (FTCEditAudioRecordScene) iDTListenerS112S0100000_2.l0;
            if (fTCEditAudioRecordScene.audioRecordStartButtonLongClicking) {
                fTCEditAudioRecordScene.audioRecordStartButtonLongClicking = false;
                C6KY c6ky = fTCEditAudioRecordScene.audioRecordStartButton;
                if (c6ky != null) {
                    c6ky.LJLJI.end();
                    c6ky.LJLJJI.start();
                    FTCEditAudioRecordScene.pause$default((FTCEditAudioRecordScene) iDTListenerS112S0100000_2.l0, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_FTC_TOUCH_DOWN_RECORD, EnumC158826Le.USER_OPERATION), 3, null);
                    ((FTCEditAudioRecordScene) iDTListenerS112S0100000_2.l0).recordDubEnd("long_press");
                } else {
                    o.LJIJI("audioRecordStartButton");
                    throw null;
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View v, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    C6KV c6kv = (C6KV) iDTListenerS112S0100000_2.l0;
                    o.LJIIIIZZ(v, "v");
                    c6kv.LIZIZ(motionEvent.getRawX(), v, true);
                }
            } else {
                C6KV c6kv2 = (C6KV) iDTListenerS112S0100000_2.l0;
                o.LJIIIIZZ(v, "v");
                c6kv2.LIZIZ(motionEvent.getRawX(), v, false);
            }
        } else {
            C6KV c6kv3 = (C6KV) iDTListenerS112S0100000_2.l0;
            o.LJIIIIZZ(v, "v");
            c6kv3.LIZIZ(motionEvent.getRawX(), v, true);
        }
        return true;
    }

    public static final boolean onTouch$4(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        C162696a1.LIZ(((FTCVideoPublishFragment) iDTListenerS112S0100000_2.l0).mo49getActivity());
        return false;
    }

    public static final boolean onTouch$5(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        if (motionEvent != null && ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && ((C158706Ks) iDTListenerS112S0100000_2.l0).getUiStates().LJ.LJLJI)) {
            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = ((C158706Ks) iDTListenerS112S0100000_2.l0).getUiActions().LJIIIIZZ;
            Boolean bool = Boolean.FALSE;
            interfaceC88472Yns.invoke(bool);
            C6LO c6lo = ((C158706Ks) iDTListenerS112S0100000_2.l0).LJLZ;
            if (c6lo != null) {
                c6lo.LJLJI.end();
                c6lo.LJLJJI.start();
                ((C158706Ks) iDTListenerS112S0100000_2.l0).getUiActions().LIZJ.invoke(bool, -1, C78857UxB.LJJIIJ(1476788483, "bpea-pause_when_touch_up"));
                ((C158706Ks) iDTListenerS112S0100000_2.l0).LJLILLLLZI.jY("long_press");
            } else {
                o.LJIJI("audioRecordStartButton");
                throw null;
            }
        }
        return false;
    }

    public static final boolean onTouch$6(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        if (motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            C5TK c5tk = (C5TK) iDTListenerS112S0100000_2.l0;
            if (!c5tk.LJLLJ && c5tk.LJLJJLL && c5tk.LJLL) {
                c5tk.LJLL = false;
                C5TK.LLJJI(c5tk, "long_press", false, 6);
                C5TK c5tk2 = (C5TK) iDTListenerS112S0100000_2.l0;
                InterfaceC139655dx interfaceC139655dx = c5tk2.LJLJJI;
                if (interfaceC139655dx != null) {
                    interfaceC139655dx.LJLLLLLL(c5tk2.LJLJJLL);
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$7(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        if (motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            EditAudioRecordScene editAudioRecordScene = (EditAudioRecordScene) iDTListenerS112S0100000_2.l0;
            if (editAudioRecordScene.audioRecordStartButtonLongClicking) {
                editAudioRecordScene.setAudioRecordStartButtonLongClicking(false);
                C6KU c6ku = ((EditAudioRecordScene) iDTListenerS112S0100000_2.l0).audioRecordStartButton;
                if (c6ku != null) {
                    c6ku.LJLJI.end();
                    c6ku.LJLJJI.start();
                    EditAudioRecordScene.pause$default((EditAudioRecordScene) iDTListenerS112S0100000_2.l0, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_TOUCH_DOWN_RECORD, EnumC158826Le.USER_OPERATION), 3, null);
                    ((EditAudioRecordScene) iDTListenerS112S0100000_2.l0).recordDubEnd("long_press");
                } else {
                    o.LJIJI("audioRecordStartButton");
                    throw null;
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$8(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    ((C6KO) iDTListenerS112S0100000_2.l0).LJII(event.getRawX(), v, true);
                }
            } else {
                ((C6KO) iDTListenerS112S0100000_2.l0).LJII(event.getRawX(), v, false);
            }
        } else {
            ((C6KO) iDTListenerS112S0100000_2.l0).LJII(event.getRawX(), v, true);
        }
        return true;
    }

    public static final boolean onTouch$9(IDTListenerS112S0100000_2 iDTListenerS112S0100000_2, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 || C47959Irz.LIZ(motionEvent, ((ImagePublishPreviewScene) iDTListenerS112S0100000_2.l0).LLIILII) >= ViewConfiguration.get(((ImagePublishPreviewScene) iDTListenerS112S0100000_2.l0).requireSceneContext()).getScaledTouchSlop()) {
                return false;
            }
            ImagePublishPreviewScene imagePublishPreviewScene = (ImagePublishPreviewScene) iDTListenerS112S0100000_2.l0;
            boolean z = imagePublishPreviewScene.LLIIIZ;
            if (!z) {
                VideoPublishEditModel videoPublishEditModel = imagePublishPreviewScene.LJLLI;
                String str = imagePublishPreviewScene.LJLLLL;
                if (str == null) {
                    str = "";
                }
                C6XQ.LIZJ(videoPublishEditModel, str, z);
                if (!C6XP.LIZ() || C6XP.LIZIZ()) {
                    ((ImagePublishPreviewScene) iDTListenerS112S0100000_2.l0).LLLILZLLLI(true);
                    return false;
                }
                ((ImagePublishPreviewScene) iDTListenerS112S0100000_2.l0).LLLIIII();
                return false;
            }
            imagePublishPreviewScene.LLLIIII();
            return false;
        }
        ((ImagePublishPreviewScene) iDTListenerS112S0100000_2.l0).LLIILII = motionEvent.getX();
        return false;
    }
}
