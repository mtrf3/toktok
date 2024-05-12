package com.ss.ttlivestreamer.livestreamv2.filter.ve;

import X.ORS;
import X.P6E;
import android.os.Handler;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm;
import com.ss.ttlivestreamer.livestreamv2.filter.ve.LiveAlgorithmParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS35S0001000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class CameraAlgorithmChain implements CameraAlgorithm.Observer {
    public int algorithmValue;
    public final TECameraCapture capture;
    public final Handler handler;
    public CameraAlgorithm.Observer observer;
    public final List<CameraAlgorithm> processors;

    public final int getAlgorithmValue() {
        return this.algorithmValue;
    }

    public final CameraAlgorithm.Observer getObserver() {
        return this.observer;
    }

    public final JSONObject getStatus(int i) {
        for (CameraAlgorithm cameraAlgorithm : this.processors) {
            if (cameraAlgorithm.getFlag() == i) {
                return cameraAlgorithm.getStatus();
            }
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm.Observer
    public void onStarted(int i) {
        this.algorithmValue |= i;
        CameraAlgorithm.Observer observer = this.observer;
        if (observer != null) {
            observer.onStarted(i);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm.Observer
    public void onStopped(int i) {
        this.algorithmValue &= ~i;
        CameraAlgorithm.Observer observer = this.observer;
        if (observer != null) {
            observer.onStopped(i);
        }
    }

    public final P6E process(P6E p6e) {
        P6E processAlgorithm = this.capture.processAlgorithm(p6e);
        if (processAlgorithm != null) {
            return processAlgorithm;
        }
        return p6e;
    }

    public final void setObserver(CameraAlgorithm.Observer observer) {
        this.observer = observer;
    }

    public final void startCameraAlgorithm(LiveAlgorithmParam param) {
        o.LJIIIZ(param, "param");
        if (param instanceof LiveAlgorithmParam.RhythmicMotion) {
            List<CameraAlgorithm> list = this.processors;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<CameraAlgorithm> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof CameraAlgorithm.RhythmMotion) {
                        break;
                    }
                }
            }
            this.processors.add(new CameraAlgorithm.RhythmMotion(this.capture, this.handler, this));
        } else if (param instanceof LiveAlgorithmParam.OneKeyProcess) {
            List<CameraAlgorithm> list2 = this.processors;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<CameraAlgorithm> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof CameraAlgorithm.OneKeyProcess) {
                        break;
                    }
                }
            }
            this.processors.add(new CameraAlgorithm.OneKeyProcess(this.capture, this.handler, this));
        }
        for (CameraAlgorithm cameraAlgorithm : this.processors) {
            if (cameraAlgorithm.canProcess(param)) {
                cameraAlgorithm.start(param);
            }
        }
    }

    public final void stopCameraAlgorithm(int i) {
        for (CameraAlgorithm cameraAlgorithm : this.processors) {
            if (cameraAlgorithm.getFlag() == i) {
                cameraAlgorithm.stop();
            }
        }
        ORS.LJJLIL(new AqS35S0001000_11(i, 0), this.processors);
    }

    public CameraAlgorithmChain(TECameraCapture capture, Handler handler, CameraAlgorithm.Observer observer) {
        o.LJIIIZ(capture, "capture");
        o.LJIIIZ(handler, "handler");
        this.capture = capture;
        this.handler = handler;
        this.observer = observer;
        this.processors = new ArrayList();
    }
}
