package q03;

import X.BZI;
import X.C05900La;
import X.C0JU;
import X.C0PX;
import X.C16880lQ;
import X.C28787BRn;
import X.C47261Igj;
import X.C76800UCe;
import X.C98T;
import X.InterfaceC65784Pro;
import Y.IDRunnableS85S0100000;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.view.View;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IDaS480S0100000 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS480S0100000(C05900La c05900La, int i) {
        super(300L);
        this.$t = i;
        this.l0 = c05900La;
    }

    public static final void LIZ$0(IDaS480S0100000 iDaS480S0100000, View view) {
        Long l;
        String str;
        int i;
        String str2;
        Effect effect;
        if (view != null) {
            C05900La c05900La = (C05900La) iDaS480S0100000.l0;
            c05900La.getClass();
            BZI LIZ = C28787BRn.LIZ("livesdk_live_sticker_info_click");
            LIZ.LJIIZILJ();
            LiveEffect liveEffect = c05900La.LJLILLLLZI;
            String str3 = null;
            if (liveEffect != null) {
                l = Long.valueOf(liveEffect.effectId);
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "sticker_id");
            LiveEffect liveEffect2 = c05900La.LJLILLLLZI;
            if (liveEffect2 != null) {
                str = liveEffect2.getResourceId();
            } else {
                str = null;
            }
            LIZ.LJIJJ(str, "resource_id");
            LiveEffect liveEffect3 = c05900La.LJLILLLLZI;
            if (liveEffect3 != null) {
                str3 = liveEffect3.getName();
            }
            LIZ.LJIJJ(str3, "sticker_name");
            LiveEffect liveEffect4 = c05900La.LJLILLLLZI;
            if (liveEffect4 != null && (effect = liveEffect4.getEffect()) != null) {
                i = effect.getSource();
            } else {
                i = 0;
            }
            LIZ.LJIJJ(Integer.valueOf(i), "source");
            if (c05900La.LJLJJI) {
                str2 = "done";
            } else {
                str2 = "failed";
            }
            LIZ.LJIJJ(str2, "status");
            LIZ.LJJIIJZLJL();
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C05900La) iDaS480S0100000.l0).LJLJI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
    }

    public static final void LIZ$1(IDaS480S0100000 iDaS480S0100000, View view) {
        int intValue;
        KYCCameraActivity kYCCameraActivity = (KYCCameraActivity) iDaS480S0100000.l0;
        final C0PX c0px = kYCCameraActivity.LJLIL;
        if (c0px != null) {
            CameraDevice cameraDevice = c0px.LJIIJJI;
            if (cameraDevice != null) {
                try {
                    CameraCaptureSession cameraCaptureSession = c0px.LJIIL;
                    if (cameraCaptureSession != null) {
                        cameraCaptureSession.stopRepeating();
                    }
                } catch (Exception unused) {
                }
                c0px.LIZLLL();
                try {
                    ImageReader imageReader = c0px.LJIILJJIL;
                    if (imageReader != null) {
                        final CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
                        o.LJIIIIZZ(createCaptureRequest, "cameraDevice.createCaptu…e.TEMPLATE_STILL_CAPTURE)");
                        createCaptureRequest.addTarget(imageReader.getSurface());
                        createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
                        createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, (byte) 15);
                        Object LLILL = C16880lQ.LLILL(C16880lQ.LLLLJ(c0px.LIZ), "camera");
                        o.LJII(LLILL, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                        CameraCharacteristics cameraCharacteristics = ((CameraManager) LLILL).getCameraCharacteristics(cameraDevice.getId());
                        o.LJIIIIZZ(cameraCharacteristics, "manager.getCameraCharact…aDevice.id,\n            )");
                        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf((intValue + c0px.LJIIIIZZ) % 360));
                        cameraDevice.createCaptureSession(C47261Igj.LJJIJ(imageReader.getSurface()), new CameraCaptureSession.StateCallback() { // from class: X.0PZ
                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                            public final void onConfigureFailed(CameraCaptureSession session) {
                                o.LJIIIZ(session, "session");
                                C0PX c0px2 = c0px;
                                c0px2.LJIILLIIL.post(new IDRunnableS85S0100000(c0px2, 76));
                            }

                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                            public final void onConfigured(CameraCaptureSession session) {
                                o.LJIIIZ(session, "session");
                                try {
                                    session.capture(createCaptureRequest.build(), null, c0px.LJIIZILJ);
                                } catch (Exception unused2) {
                                }
                            }
                        }, c0px.LJIIZILJ);
                    }
                } catch (Exception unused2) {
                }
            }
            String LLFII = kYCCameraActivity.LLFII();
            String pageName = kYCCameraActivity.getPageName();
            JSONObject jSONObject = kYCCameraActivity.LJLJJLL;
            BZI LIZIZ = C0JU.LIZIZ("livesdk_kyc_form_camera_shoot", LLFII, "shoot_type", pageName, "page_name");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            LIZIZ.LJJ(jSONObject);
            LIZIZ.LJJIIJZLJL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS480S0100000(KYCCameraActivity kYCCameraActivity, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = kYCCameraActivity;
    }
}
