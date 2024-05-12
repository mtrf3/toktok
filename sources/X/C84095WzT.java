package X;

import Y.ARunnableS18S0101000_14;
import android.util.Pair;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WzT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84095WzT implements X0P {
    public final /* synthetic */ C84092WzQ LIZ;

    public C84095WzT(C84092WzQ c84092WzQ) {
        this.LIZ = c84092WzQ;
    }

    @Override // X.X0P
    public final void LIZ(int i, int i2, float f, String str) {
        Pair pair;
        X0V x0v;
        List<P6O> LIZJ;
        InterfaceC84100WzY interfaceC84100WzY;
        P6Q p6q;
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Callback:: type: 0x");
        LIZ.append(Integer.toHexString(i));
        LIZ.append("; msg: ");
        LIZ.append(str);
        P4Q.LIZ("TERecorder", X1D.LIZIZ(LIZ));
        this.LIZ.LJI(i, i2, f, str);
        if (i == VEInfo.TE_RECORD_INFO_RECORD_STOPPED) {
            this.LIZ.LJJJIL.post(new ARunnableS18S0101000_14(i2, this, 12));
            TEMonitorInvoker.nativeMonitorPerfWithType(0);
        } else if (i == VEInfo.TE_RECORD_INFO_START_RECORD) {
            C84092WzQ c84092WzQ = this.LIZ;
            c84092WzQ.LJJIIZ = 0;
            c84092WzQ.LJJJIL.post(new ARunnableS18S0101000_14(i2, this, 13));
        } else if (i == VEInfo.TE_RECORD_INFO_PREPLAY_STOPPED) {
            InterfaceC84052Wym interfaceC84052Wym = this.LIZ.LJIJI;
            if (interfaceC84052Wym != null) {
                interfaceC84052Wym.LIZ(i2);
            }
        } else if (i == 1051) {
            C78866UxK.LJIJ("TECamera-start");
            C84092WzQ c84092WzQ2 = this.LIZ;
            if (c84092WzQ2.LIZJ != null && (p6q = c84092WzQ2.LJII) != null && i2 == 0) {
                c84092WzQ2.LIZIZ(p6q, false);
            } else if (i2 == 1 && (interfaceC84100WzY = c84092WzQ2.LJI) != null) {
                c84092WzQ2.LIZIZ(interfaceC84100WzY, false);
            }
            C78866UxK.LJJIIJ();
        } else if (i == 1000) {
            C84092WzQ c84092WzQ3 = this.LIZ;
            if (c84092WzQ3.mIsBindingViewMode && c84092WzQ3.LJI != null) {
                ((ReentrantLock) c84092WzQ3.LJJJLIIL).lock();
                while (true) {
                    this.LIZ.getClass();
                    try {
                        this.LIZ.LJJJLL.await();
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        } else if (i == VEInfo.TE_RECORD_INFO_ENGINE_INIT) {
            C84092WzQ c84092WzQ4 = this.LIZ;
            if (c84092WzQ4.mIsBindingViewMode) {
                ((ReentrantLock) c84092WzQ4.LJJL).lock();
                C84092WzQ c84092WzQ5 = this.LIZ;
                c84092WzQ5.LJJLIIIIJ = true;
                c84092WzQ5.LJJLI.signalAll();
                ((ReentrantLock) this.LIZ.LJJL).unlock();
                C84092WzQ c84092WzQ6 = this.LIZ;
                VEDisplaySettings vEDisplaySettings = c84092WzQ6.LJJJJJL;
                if (vEDisplaySettings != null) {
                    c84092WzQ6.setDisplaySettings(vEDisplaySettings);
                }
            }
        } else if (i == VEInfo.TE_INFO_COUNT_OF_LAST_FRAG_FRAMES) {
            this.LIZ.LJJIIZ = i2;
        } else if (i == VEInfo.TE_INFO_RECORD_NEED_MIC) {
            this.LIZ.LJIILL();
        } else if (i != VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
            if (i == VEInfo.TE_INFO_PREVIEW_RENDER_FPS) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("preview render fps = ");
                LIZ2.append(f);
                P4Q.LIZ("TERecorder", X1D.LIZIZ(LIZ2));
                this.LIZ.previewRenderFps = f;
            } else if (i == VEInfo.TE_INFO_PREVIEW_SUB_RENDER_FPS) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("preview sub render fps = ");
                LIZ3.append(f);
                P4Q.LIZ("TERecorder", X1D.LIZIZ(LIZ3));
                this.LIZ.previewSubRenderFps = f;
            } else if (i == VEInfo.TE_INFO_CAMERA_OPEN_PREVIEW_FIRST_N_FRAME_INTERVALS_AVERAGE) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("camera open preview first n frame intervals average = ");
                LIZ4.append(f);
                P4Q.LIZ("TERecorder", X1D.LIZIZ(LIZ4));
                this.LIZ.cameraOpenpreviewFirstNFrameIntervalsAverageMS = f;
            } else if (i == VEInfo.TE_INFO_PREVIEW_FIRST_N_FRAME_INTERVALS_AVERAGE) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("preview first n frame intervals average = ");
                LIZ5.append(f);
                P4Q.LIZ("TERecorder", X1D.LIZIZ(LIZ5));
                this.LIZ.previewFirstNFrameIntervalsAverageMS = f;
            } else if (i == VEInfo.TE_INFO_RECORD_FIRST_N_FRAME_INTERVALS_AVERAGE) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("encode first n frame intervals average = ");
                LIZ6.append(f);
                P4Q.LIZ("TERecorder", X1D.LIZIZ(LIZ6));
                this.LIZ.recordFirstNFrameIntervalsAverageMS = f;
            } else if (i == VEInfo.TE_INFO_RECORD_RENDER_FPS) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("record render fps = ");
                LIZ7.append(f);
                P4Q.LIZ("TERecorder", X1D.LIZIZ(LIZ7));
                this.LIZ.recordRenderFps = f;
            } else if (i == VEInfo.TE_INFO_RECORD_WRITE_FPS) {
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("record write fps = ");
                LIZ8.append(f);
                P4Q.LIZ("TERecorder", X1D.LIZIZ(LIZ8));
                this.LIZ.recordWriteFps = f;
            } else if (i == VEInfo.TE_INFO_PREVIEW_FRAME_SCREEN) {
                VERecorder.OnFrameAvailableListenerExt onFrameAvailableListenerExt = this.LIZ.mOnFrameAvailableListenerExt;
                if (onFrameAvailableListenerExt != null) {
                    onFrameAvailableListenerExt.OnFrameAvailable(null);
                }
            } else if (i == 1093) {
                C84092WzQ c84092WzQ7 = this.LIZ;
                if (c84092WzQ7.LJII != null) {
                    if (i2 == 1) {
                        if (c84092WzQ7.LJJZZIII.LIZJ().size() != 2) {
                            this.LIZ.LJJZZIII.LIZIZ();
                            C169706lK<P6O> capturePipelines = this.LIZ.LIZJ.getCapturePipelines();
                            if (capturePipelines.LIZJ().size() == 1) {
                                P4Q.LJFF("TERecorder", "switchSingleOrDualCamera, use the single camera pipeline as the first pipeline of dual-camera.");
                                LIZJ = capturePipelines.LIZJ();
                            } else {
                                C84092WzQ c84092WzQ8 = this.LIZ;
                                LIZJ = c84092WzQ8.LIZJ.createCapturePipeline(c84092WzQ8.LJII, false).LIZJ();
                            }
                            C84092WzQ c84092WzQ9 = this.LIZ;
                            List<P6O> LIZJ2 = c84092WzQ9.LJJZZI.createCapturePipeline(c84092WzQ9.LJII, false).LIZJ();
                            Iterator<P6O> it = LIZJ.iterator();
                            while (it.hasNext()) {
                                this.LIZ.LJJZZIII.LIZ(it.next());
                            }
                            for (P6O p6o : LIZJ2) {
                                p6o.LJFF = false;
                                this.LIZ.LJJZZIII.LIZ(p6o);
                            }
                        }
                        C84092WzQ c84092WzQ10 = this.LIZ;
                        P6Q p6q2 = c84092WzQ10.LJII;
                        if (p6q2 instanceof C84133X0f) {
                            C169706lK<P6O> c169706lK = c84092WzQ10.LJJZZIII;
                            ((C84133X0f) p6q2).LJLL = c169706lK;
                            StringBuilder LIZ9 = X1D.LIZ();
                            LIZ9.append("addCapturePipelines, pipelines = ");
                            LIZ9.append(c169706lK.LIZJ());
                            P4Q.LJFF("VECameraCapture", X1D.LIZIZ(LIZ9));
                            P4Q.LJFF("TERecorder", "switchSingleOrDualCamera, add dual-camera capture pipelines.");
                        }
                    } else if (i2 == 0) {
                        C169706lK<P6O> capturePipelines2 = c84092WzQ7.LIZJ.getCapturePipelines();
                        if ((this.LIZ.LJII instanceof C84133X0f) && capturePipelines2.LIZJ().size() == 1) {
                            ((C84133X0f) this.LIZ.LJII).LJLL = capturePipelines2;
                            StringBuilder LIZ10 = X1D.LIZ();
                            LIZ10.append("addCapturePipelines, pipelines = ");
                            LIZ10.append(capturePipelines2.LIZJ());
                            P4Q.LJFF("VECameraCapture", X1D.LIZIZ(LIZ10));
                            P4Q.LJFF("TERecorder", "switchSingleOrDualCamera, add single camera capture pipeline.");
                        }
                    }
                }
            } else if (i == VEInfo.TE_RECORD_INFO_PERFORMANCE_DYNAMIC_CONTROL) {
                P4Q.LJFF("TERecorder", "performance callback");
            } else if (i == VEInfo.TE_INFO_RECORD_RENDER_BLUR_END && (pair = (Pair) ((HashMap) this.LIZ.LJJIIJ).get(31)) != null && (x0v = ((VEBaseFilterParam) pair.first).callback) != null) {
                x0v.LIZ();
                P4Q.LIZ("TERecorder", "first blur frame render end");
            }
        }
        if (i != VEInfo.TE_RECORD_INFO_ENGINE_START || i2 != -124) {
            this.LIZ.LJIIL(i, i2, f, str);
        }
        this.LIZ.getClass();
        if (i == VEInfo.TE_INFO_PREVIEW_RENDER_FPS) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", i2);
            jSONObject.put("recordType", i);
            if (i == VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
                long currentTimeMillis = System.currentTimeMillis();
                if (i2 != 0) {
                    if (i2 == 1) {
                        j = currentTimeMillis - C78685UuP.LJLJI;
                        jSONObject.put("duration", j);
                        StringBuilder LIZ11 = X1D.LIZ();
                        LIZ11.append("First frame of switchCamera, te_preview_switch_camera_screen_time = ");
                        LIZ11.append(currentTimeMillis - C78685UuP.LJLJI);
                        LIZ11.append("ms, facing = ");
                        LIZ11.append(str);
                        P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ11));
                    } else {
                        j = 0;
                    }
                } else {
                    j = currentTimeMillis - C78685UuP.LJLILLLLZI;
                    jSONObject.put("duration", j);
                    StringBuilder LIZ12 = X1D.LIZ();
                    LIZ12.append("First frame of openCamera, te_preview_first_frame_screen_time = ");
                    LIZ12.append(currentTimeMillis - C78685UuP.LJLILLLLZI);
                    LIZ12.append("ms, facing = ");
                    LIZ12.append(str);
                    P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ12));
                }
                StringBuilder LIZ13 = X1D.LIZ();
                LIZ13.append("first frame screen cost ");
                LIZ13.append(j);
                LIZ13.append("ms, ret = ");
                LIZ13.append(i2);
                P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ13));
            }
            c.LIZ("vesdk_event_record_performance", "performance", jSONObject);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
