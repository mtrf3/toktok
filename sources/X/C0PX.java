package X;

import Y.ARunnableS41S0100000_5;
import Y.IDaS211S0100000;
import Y.IDeS400S0100000;
import Y.IDfS124S0200000;
import Y.IDfS292S0100000;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.android.live.wallet.data.api.IKYCApi;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.zhiliaoapp.musically.R;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0PX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PX {
    public final Activity LIZ;
    public final TextureView LIZIZ;
    public final C0PT LIZJ;
    public final boolean LIZLLL;
    public final JSONObject LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public final C30851Iz LJIIIZ;
    public String LJIIJ;
    public CameraDevice LJIIJJI;
    public CameraCaptureSession LJIIL;
    public Size LJIILIIL;
    public ImageReader LJIILJJIL;
    public final C0PY LJIILL;
    public final Handler LJIILLIIL;
    public Handler LJIIZILJ;
    public HandlerThread LJIJ;
    public final DialogC31813Ce9 LJIJI;
    public final DialogC06970Pd LJIJJ;

    public final void LIZ() {
        try {
            CameraCaptureSession cameraCaptureSession = this.LJIIL;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
            }
            CameraCaptureSession cameraCaptureSession2 = this.LJIIL;
            if (cameraCaptureSession2 != null) {
                cameraCaptureSession2.abortCaptures();
            }
        } catch (Exception unused) {
        }
        C30851Iz c30851Iz = this.LJIIIZ;
        if (c30851Iz != null) {
            C15610jN.LIZIZ(new ARunnableS41S0100000_5(new AqS165S0100000_15(c30851Iz, 844), 256));
        }
        CameraDevice cameraDevice = this.LJIIJJI;
        if (cameraDevice != null) {
            P72.LIZ(cameraDevice, C78857UxB.LJJIIJ(1476788225, "bpea-bpea-kyc_4_open_camera"));
        }
        this.LJIIJJI = null;
        ImageReader imageReader = this.LJIILJJIL;
        if (imageReader != null) {
            imageReader.close();
        }
        this.LJIILJJIL = null;
        this.LJIJJ.dismiss();
        this.LJIJI.dismiss();
    }

    public final void LIZIZ() {
        try {
            SurfaceTexture surfaceTexture = this.LIZIZ.getSurfaceTexture();
            if (surfaceTexture == null) {
                return;
            }
            Size size = this.LJIILIIL;
            if (size != null) {
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
            }
            final Surface surface = new Surface(surfaceTexture);
            CameraDevice cameraDevice = this.LJIIJJI;
            if (cameraDevice != null) {
                cameraDevice.createCaptureSession(C47261Igj.LJJIJ(surface), new CameraCaptureSession.StateCallback() { // from class: X.0PV
                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        o.LJIIIZ(cameraCaptureSession, "cameraCaptureSession");
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        o.LJIIIZ(cameraCaptureSession, "cameraCaptureSession");
                        CameraDevice cameraDevice2 = C0PX.this.LJIIJJI;
                        if (cameraDevice2 == null) {
                            return;
                        }
                        try {
                            CaptureRequest.Builder createCaptureRequest = cameraDevice2.createCaptureRequest(1);
                            o.LJIIIIZZ(createCaptureRequest, "cameraDevice.createCaptu…aDevice.TEMPLATE_PREVIEW)");
                            createCaptureRequest.addTarget(surface);
                            createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
                            C0PX.this.LJIIL = cameraCaptureSession;
                            cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), null, C0PX.this.LJIIZILJ);
                        } catch (CameraAccessException unused) {
                        }
                    }
                }, this.LJIIZILJ);
            }
        } catch (CameraAccessException unused) {
        }
    }

    public final void LIZJ() {
        Size size;
        Size[] outputSizes;
        if (!this.LJI || this.LJII) {
            return;
        }
        this.LJII = true;
        Object LLILIL = C16880lQ.LLILIL(this.LIZ, "camera");
        o.LJII(LLILIL, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) LLILIL;
        String[] cameraIdList = cameraManager.getCameraIdList();
        o.LJIIIIZZ(cameraIdList, "manager.cameraIdList");
        for (String str : cameraIdList) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            o.LJIIIIZZ(cameraCharacteristics, "manager.getCameraCharacteristics(cameraID)");
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 1) {
                this.LJIIJ = str;
            }
        }
        String str2 = this.LJIIJ;
        if (str2 == null) {
            return;
        }
        try {
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str2);
            o.LJIIIIZZ(cameraCharacteristics2, "manager.getCameraCharacteristics(it)");
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null) {
                size = outputSizes[0];
            } else {
                size = null;
            }
            this.LJIILIIL = size;
            P72.LIZIZ(new CameraDevice.StateCallback() { // from class: X.0PW
                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onDisconnected(CameraDevice camera) {
                    o.LJIIIZ(camera, "camera");
                    P72.LIZ(camera, C78857UxB.LJJIIJ(1476788225, "bpea-bpea-kyc_4_open_camera"));
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onOpened(CameraDevice camera) {
                    int i;
                    int i2;
                    Size[] outputSizes2;
                    if (new C03880Dg(2).LIZJ(100200, "com/bytedance/android/live/kyc/KYCCameraManager$openCamera$1$1", "onOpened", this, new Object[]{camera}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;)V", "-3722666036645381890")).LIZ) {
                        return;
                    }
                    o.LJIIIZ(camera, "camera");
                    if (o.LJ(camera.getId(), C0PX.this.LJIIJ)) {
                        C0PX c0px = C0PX.this;
                        c0px.LJIIJJI = camera;
                        Object LLILL = C16880lQ.LLILL(C16880lQ.LLLLJ(c0px.LIZ), "camera");
                        o.LJII(LLILL, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                        CameraCharacteristics cameraCharacteristics3 = ((CameraManager) LLILL).getCameraCharacteristics(camera.getId());
                        o.LJIIIIZZ(cameraCharacteristics3, "manager.getCameraCharact…ameraDevice.id,\n        )");
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics3.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap2 == null || (outputSizes2 = streamConfigurationMap2.getOutputSizes(256)) == null || outputSizes2.length == 0) {
                            i = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
                            i2 = 480;
                        } else {
                            i = outputSizes2[0].getWidth();
                            i2 = outputSizes2[0].getHeight();
                        }
                        ImageReader newInstance = ImageReader.newInstance(i, i2, 256, 1);
                        c0px.LJIILJJIL = newInstance;
                        if (newInstance != null) {
                            newInstance.setOnImageAvailableListener(c0px.LJIILL, c0px.LJIIZILJ);
                        }
                        C0PX.this.LIZIZ();
                    }
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onError(CameraDevice camera, int i) {
                    if (new C03880Dg(2).LIZJ(100207, "com/bytedance/android/live/kyc/KYCCameraManager$openCamera$1$1", "onError", this, new Object[]{camera, Integer.valueOf(i)}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;I)V", "-3722666036645381890")).LIZ) {
                        return;
                    }
                    o.LJIIIZ(camera, "camera");
                    P72.LIZ(camera, C78857UxB.LJJIIJ(1476788225, "bpea-bpea-kyc_4_open_camera"));
                }
            }, cameraManager, this.LJIILLIIL, C78857UxB.LJJIIJ(1476788225, "bpea-bpea-kyc_4_open_camera"), str2);
        } catch (CameraAccessException unused) {
        }
    }

    public final void LIZLLL() {
        DialogC31813Ce9 dialogC31813Ce9 = this.LJIJI;
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveLoadingDialog", "show", dialogC31813Ce9, new Object[0], "void", new C65300Pk0(false, "()V", "-3722666036645381890")).LIZ) {
            return;
        }
        dialogC31813Ce9.show();
    }

    public final void LJ() {
        String str;
        String str2;
        String str3;
        DialogC06970Pd dialogC06970Pd = this.LJIJJ;
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/kyc/KYCNotQualifiedDialog", "show", dialogC06970Pd, new Object[0], "void", new C65300Pk0(false, "()V", "-3722666036645381890")).LIZ) {
            dialogC06970Pd.show();
        }
        String str4 = "double_side";
        if (this.LIZLLL) {
            str = "double_side";
        } else {
            str = "single_side";
        }
        C0U3.LJ(str, "iqa_failed", this.LJ);
        if (!this.LIZLLL) {
            str4 = "single_side";
        }
        if (this.LJFF) {
            str2 = "profile_image_side";
            str3 = "profile_image";
        } else {
            str2 = "back_image_side";
            str3 = "back_image";
        }
        JSONObject jSONObject = this.LJ;
        BZI LIZIZ = C0JU.LIZIZ("livesdk_kyc_form_iqa_failed", str4, "shoot_type", str2, "page_name");
        LIZIZ.LJIJJ(str3, "photo_type");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZIZ.LJJ(jSONObject);
        LIZIZ.LJJIIJZLJL();
    }

    public final void LJFF(byte[] bArr) {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kycFiles");
        LIZ.append(System.currentTimeMillis());
        multipartTypedOutput.addPart("file", new TypedByteArray("multipart/form-data", bArr, X1D.LIZIZ(LIZ)));
        C65814PsI.LIZ().getClass();
        ((IKYCApi) ((INetworkService) CN1.LIZ(INetworkService.class)).Mk(IKYCApi.class)).iqaIdPhotoVerify(multipartTypedOutput).LJJLIIIJJI(10L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIILLIIL(new IDaS211S0100000(this, 0)).LJJJLIIL(new IDfS124S0200000(this, bArr, 3), new IDfS292S0100000(this, 14));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0PY] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Iz] */
    public C0PX(Activity activity, C31482CXe c31482CXe, C0PT c0pt, boolean z, JSONObject jSONObject) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = c31482CXe;
        this.LIZJ = c0pt;
        this.LIZLLL = z;
        this.LJ = jSONObject;
        this.LJFF = true;
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: X.0Pa
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
                o.LJIIIZ(surface, "surface");
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
                o.LJIIIZ(surface, "surface");
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
                o.LJIIIZ(surface, "surface");
                C0PX.this.LIZ();
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
                o.LJIIIZ(surface, "surface");
                C0PX.this.LIZJ();
            }
        };
        ?? r3 = new YNS() { // from class: X.1Iz
            @Override // X.YNS
            public final void LIZ(int i) {
                C0PX.this.LJIIIIZZ = i;
            }
        };
        this.LJIIIZ = r3;
        C61099NyR.LIZIZ.LIZIZ(activity, C78857UxB.LJJIIJ(1476788225, "bpea-kyc_4_camera")).LIZ("android.permission.CAMERA").LIZJ(new IDeS400S0100000(this, 1));
        c31482CXe.setSurfaceTextureListener(surfaceTextureListener);
        C15610jN.LIZIZ(new ARunnableS41S0100000_5(new AqS165S0100000_15((C30851Iz) r3, 843), 256));
        this.LJIILL = new ImageReader.OnImageAvailableListener() { // from class: X.0PY
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                Image image = null;
                try {
                    image = imageReader.acquireLatestImage();
                    ByteBuffer buffer = image.getPlanes()[0].getBuffer();
                    o.LJIIIIZZ(buffer, "image.planes[0].buffer");
                    byte[] bArr = new byte[buffer.remaining()];
                    buffer.get(bArr);
                    C0PX.this.LJFF(bArr);
                } catch (Exception unused) {
                    if (image == null) {
                        return;
                    }
                } catch (Throwable th) {
                    if (image != null) {
                        image.close();
                    }
                    throw th;
                }
                image.close();
            }
        };
        this.LJIILLIIL = new Handler(C16880lQ.LLJJJJ());
        C31767CdP c31767CdP = new C31767CdP(activity);
        c31767CdP.LIZIZ = activity.getString(R.string.m5n);
        c31767CdP.LIZJ = false;
        this.LJIJI = c31767CdP.LIZ();
        this.LJIJJ = new DialogC06970Pd(activity, jSONObject, z);
    }
}
