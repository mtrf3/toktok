package com.lynx.animax;

import X.C16880lQ;
import X.C60740Nse;
import X.C74032vP;
import X.C77125UOr;
import X.FC1;
import X.InterfaceC79401VEf;
import X.PPN;
import X.PPQ;
import X.VEZ;
import X.VNU;
import X.VPD;
import X.VTE;
import X.VTG;
import X.VTH;
import X.X1D;
import Y.ARunnableS13S0201000_10;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class UIAnimaX extends LynxUI<PPN> {
    public boolean LJLIL;
    public final VNU LJLILLLLZI;
    public final Handler LJLJI;
    public final AnimaXElement LJLJJI;
    public String LJLJJL;

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        boolean z;
        super.destroy();
        String str = this.LJLJJL;
        VNU vnu = this.LJLILLLLZI;
        FC1 LJ = this.LJLJJI.LJ();
        if (LJ == null || vnu == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("report failed, metrics is null:");
            boolean z2 = false;
            if (LJ == null) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            LIZ.append(", context is null:");
            if (vnu == null) {
                z2 = true;
            }
            LIZ.append(z2);
            C77125UOr.LJIILJJIL("AnimaXMonitor", X1D.LIZIZ(LIZ));
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("src_url", C74032vP.LIZ(str));
                jSONObject.put("page_url", C74032vP.LIZ(vnu.LJLLJ));
                JSONObject LIZ2 = LJ.LIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("report performance: metrics: ");
                LIZ3.append(LIZ2.toString());
                LIZ3.append(", category: ");
                LIZ3.append(jSONObject.toString());
                C77125UOr.LJIJI("AnimaXMonitor", X1D.LIZIZ(LIZ3));
                InterfaceC79401VEf interfaceC79401VEf = (InterfaceC79401VEf) VEZ.LIZIZ().LIZ(InterfaceC79401VEf.class);
                if (interfaceC79401VEf != null) {
                    interfaceC79401VEf.formatEventReporter(vnu.LJI(), "animax_performance", new JSONObject(), LIZ2, jSONObject);
                } else {
                    C77125UOr.LJIILJJIL("AnimaXMonitor", "report failed, monitorService is null");
                }
            } catch (Exception e) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("report failed, error: ");
                LIZ4.append(e.toString());
                C77125UOr.LJIJI("AnimaXMonitor", X1D.LIZIZ(LIZ4));
            }
        }
        T t = this.mView;
        if (t != 0) {
            PPN ppn = (PPN) t;
            if (!ppn.LJLJLJ) {
                ppn.LJLJLJ = true;
                Surface surface = ppn.LJLJI;
                if (surface != null) {
                    surface.release();
                    ppn.LJLJI = null;
                }
            }
        }
        AnimaXElement animaXElement = this.LJLJJI;
        if (animaXElement != null) {
            animaXElement.LIZIZ();
        }
    }

    public UIAnimaX(VNU vnu) {
        super(vnu);
        long j;
        PPQ ppq;
        this.LJLIL = true;
        this.LJLILLLLZI = vnu;
        this.LJLJI = new Handler(C16880lQ.LLJJJJ());
        C60740Nse LIZLLL = vnu.LIZLLL();
        if (LIZLLL != null && (ppq = LIZLLL.LIZ) != null) {
            j = ppq.newNativeCanvasAppWeakPtr();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Cannot get canvasAppWeakPtr, krypton helper:");
            LIZ.append(LIZLLL);
            C77125UOr.LJIILJJIL("UIAnimaX", X1D.LIZIZ(LIZ));
            j = 0;
        }
        AnimaXElement animaXElement = new AnimaXElement(this, j, vnu.getResources().getDisplayMetrics().density);
        this.LJLJJI = animaXElement;
        ((PPN) this.mView).LJLILLLLZI = animaXElement;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final PPN createView(Context context) {
        PPN ppn = new PPN(context, this);
        ppn.setOpaque(false);
        return ppn;
    }

    @VPD(defaultBoolean = true, name = "autoplay")
    public void setAutoPlay(boolean z) {
        this.LJLJJI.LJIIL(z);
    }

    @VPD(defaultInt = -1, name = "end-frame")
    public void setEndFrame(int i) {
        this.LJLJJI.LJIILJJIL(i);
    }

    @VPD(name = "fps-event-interval")
    public void setFpsEventInterval(int i) {
        this.LJLJJI.LJIILL(i);
    }

    @VPD(defaultBoolean = false, name = "ignore-attach-status")
    public void setIgnoreAttachStatus(boolean z) {
        ((PPN) this.mView).setIgnoreAttachStatus(z);
    }

    @VPD(name = "json")
    public void setJson(String str) {
        this.LJLJJI.LJIILLIIL(str);
    }

    @VPD(defaultBoolean = true, name = "keeplastframe")
    public void setKeepLastFrame(boolean z) {
        this.LJLJJI.LJIIZILJ(z);
    }

    @VPD(defaultBoolean = false, name = "loop")
    public void setLoop(boolean z) {
        this.LJLJJI.LJIJ(z);
    }

    @VPD(defaultInt = 1, name = "loop-count")
    public void setLoopCount(int i) {
        this.LJLJJI.LJIJI(i);
    }

    @VPD(name = "objectfit")
    public void setObjectFit(String str) {
        this.LJLJJI.LJIJJ(str);
    }

    @VPD(name = "progress")
    public void setProgress(float f) {
        this.LJLJJI.LJIJJLI(f);
    }

    @VPD(defaultBoolean = false, name = "auto-reverse")
    public void setReverseMode(boolean z) {
        this.LJLJJI.LJIILIIL(z);
    }

    @VPD(name = "speed")
    public void setSpeed(float f) {
        this.LJLJJI.LJIL(f);
    }

    @VPD(name = "src")
    public void setSrc(String str) {
        this.LJLJJL = str;
        this.LJLJJI.LJJ(str);
    }

    @VPD(name = "src-format")
    public void setSrcFormat(String str) {
        this.LJLJJI.LJJ(str);
    }

    @VPD(name = "src-polyfill")
    public void setSrcPolyfill(ReadableMap readableMap) {
        if (readableMap instanceof JavaOnlyMap) {
            this.LJLJJI.LJJI((JavaOnlyMap) readableMap);
        }
    }

    @VPD(defaultInt = 0, name = "start-frame")
    public void setStartFrame(int i) {
        this.LJLJJI.LJJIFFI(i);
    }

    public final void LJIJJLI(int i, Map<String, Object> map) {
        String str;
        switch (VTG.LIZ[VTH.values()[i].ordinal()]) {
            case 1:
                str = "completion";
                break;
            case 2:
                str = "start";
                break;
            case 3:
                str = "repeat";
                break;
            case 4:
                str = "cancel";
                break;
            case 5:
                str = "ready";
                break;
            case 6:
                str = "update";
                break;
            case 7:
                str = "error";
                break;
            case 8:
                str = "fps";
                break;
            default:
                return;
        }
        if ("update".equals(str) && !this.LJLIL) {
            return;
        }
        this.LJLILLLLZI.LJLJJL.LIZIZ(new VTE(getSign(), str, map));
    }

    public void getCurrentFrame(ReadableMap readableMap, Callback callback) {
        if (callback != null) {
            callback.invoke(0, Double.valueOf(this.LJLJJI.LIZJ()));
        }
    }

    public void getDuration(ReadableMap readableMap, Callback callback) {
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putDouble("data", this.LJLJJI.LIZLLL());
            callback.invoke(0, javaOnlyMap);
        }
    }

    public void isAnimating(ReadableMap readableMap, Callback callback) {
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putBoolean("data", this.LJLJJI.LJFF());
            callback.invoke(0, javaOnlyMap);
        }
    }

    public void listenAnimationUpdate(ReadableMap readableMap, Callback callback) {
        if (readableMap != null) {
            this.LJLIL = readableMap.getBoolean("isListen");
        }
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putBoolean("data", this.LJLIL);
            callback.invoke(0, javaOnlyMap);
        }
    }

    public void pause(ReadableMap readableMap, Callback callback) {
        this.LJLJJI.LJIIIIZZ();
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void play(ReadableMap readableMap, Callback callback) {
        this.LJLJJI.LJIIIZ();
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void resume(ReadableMap readableMap, Callback callback) {
        this.LJLJJI.LJIIJ();
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void seek(ReadableMap readableMap, Callback callback) {
        this.LJLJJI.LJIIJJI(readableMap.getInt("frame"));
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void sendEvent(int i, Map<String, Object> map) {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            LJIJJLI(i, map);
        } else {
            this.LJLJI.post(new ARunnableS13S0201000_10(i, map, this, 0));
        }
    }

    public void stop(ReadableMap readableMap, Callback callback) {
        this.LJLJJI.LJJII();
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void subscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        this.LJLJJI.LJJIII(readableMap.getInt("frame"));
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public void unsubscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        this.LJLJJI.LJJIIJ(readableMap.getInt("frame"));
        if (callback != null) {
            callback.invoke(0);
        }
    }
}
