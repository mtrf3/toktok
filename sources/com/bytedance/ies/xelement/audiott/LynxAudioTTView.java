package com.bytedance.ies.xelement.audiott;

import X.C16880lQ;
import X.C49615Jdb;
import X.C53782L8w;
import X.C79970Va2;
import X.C79971Va3;
import X.C79972Va4;
import X.CYW;
import X.EWS;
import X.InterfaceC79641VNl;
import X.InterfaceC79973Va5;
import X.VNL;
import X.VNU;
import X.VPD;
import X.X1D;
import Y.ARunnableS11S1100000_10;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.s;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxAudioTTView extends UISimpleView<C53782L8w> implements InterfaceC79973Va5, InterfaceC79641VNl {
    public C79971Va3 LJLIL;
    public CYW LJLILLLLZI;
    public boolean LJLJI;
    public final C79970Va2 LJLJJI;

    @Override // X.InterfaceC79641VNl
    public final void LJIILJJIL() {
    }

    @Override // X.InterfaceC79641VNl
    public final void LJIJJ() {
        C79971Va3 c79971Va3;
        if (this.LJLJI && (c79971Va3 = this.LJLIL) != null) {
            c79971Va3.LJLLJ = 2;
            TTVideoEngine tTVideoEngine = c79971Va3.LJLJI;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJJL();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null) {
            c79971Va3.LJLLJ = 4;
            TTVideoEngine tTVideoEngine = c79971Va3.LJLJI;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJJLIIIJILLIZJL();
            }
            TTVideoEngine tTVideoEngine2 = c79971Va3.LJLJI;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.LLJJI(null);
            }
            TTVideoEngine tTVideoEngine3 = c79971Va3.LJLJI;
            if (tTVideoEngine3 != null) {
                tTVideoEngine3.LJZI(null);
            }
            c79971Va3.LJLJI = null;
            HandlerThread handlerThread = c79971Va3.LJLZ;
            if (handlerThread != null) {
                handlerThread.quit();
            }
        }
        C79971Va3 c79971Va32 = this.LJLIL;
        if (c79971Va32 != null) {
            c79971Va32.LJLJJI = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxAudioTTView(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLJJI = new C79970Va2(this);
    }

    @Override // X.InterfaceC79973Va5
    public final void LIZLLL(boolean z) {
        VNL vnl;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", onfinished");
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "finished");
            C79971Va3 c79971Va3 = this.LJLIL;
            if (c79971Va3 != null) {
                str = c79971Va3.LIZ();
            } else {
                str = null;
            }
            c49615Jdb.LIZJ(str, "currentSrcID");
            c49615Jdb.LIZJ(Boolean.valueOf(z), "loop");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    @Override // X.InterfaceC79973Va5
    public final void LJII(int i) {
        VNL vnl;
        String str;
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            String str2 = "init";
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        str2 = "stalled";
                    }
                } else {
                    str2 = "playable";
                }
            }
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "loadingstatechanged");
            C79971Va3 c79971Va3 = this.LJLIL;
            if (c79971Va3 != null) {
                str = c79971Va3.LIZ();
            } else {
                str = null;
            }
            c49615Jdb.LIZJ(str, "currentSrcID");
            c49615Jdb.LIZJ(Integer.valueOf(i), "code");
            c49615Jdb.LIZJ(str2, "msg");
            c49615Jdb.LIZJ(str2, "type");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    @Override // X.InterfaceC79973Va5
    public final void LJIIIZ(int i) {
        VNL vnl;
        String str;
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            String str2 = "loading";
            if (i != 0 && i == 1) {
                str2 = "success";
            }
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "srcloadingstatechanged");
            C79971Va3 c79971Va3 = this.LJLIL;
            if (c79971Va3 != null) {
                str = c79971Va3.LIZIZ();
            } else {
                str = null;
            }
            c49615Jdb.LIZJ(str, "currentSrcID");
            c49615Jdb.LIZJ(Integer.valueOf(i), "code");
            c49615Jdb.LIZJ(str2, "msg");
            c49615Jdb.LIZJ(str2, "type");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    @Override // X.InterfaceC79973Va5
    public final void LJIIZILJ(int i) {
        VNL vnl;
        String str;
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            String str2 = "stopped";
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                str2 = "prepared";
                            }
                        } else {
                            str2 = "error";
                        }
                    } else {
                        str2 = "paused";
                    }
                } else {
                    str2 = "playing";
                }
            }
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "playbackstatechanged");
            C79971Va3 c79971Va3 = this.LJLIL;
            if (c79971Va3 != null) {
                str = c79971Va3.LIZ();
            } else {
                str = null;
            }
            c49615Jdb.LIZJ(str, "currentSrcID");
            c49615Jdb.LIZJ(Integer.valueOf(i), "code");
            c49615Jdb.LIZJ(str2, "msg");
            c49615Jdb.LIZJ(str2, "type");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIJ(context, "context");
        VNU mContext = this.mContext;
        o.LJFF(mContext, "mContext");
        C79971Va3 c79971Va3 = new C79971Va3(context, mContext.LJZI);
        this.LJLIL = c79971Va3;
        c79971Va3.LJLJJI = this;
        this.LJLILLLLZI = new CYW(context);
        return new C53782L8w(context);
    }

    @VPD(name = "autoplay")
    public final void isAutoPlay(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", isAutoPlay -> ");
        LIZ.append(z);
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null && c79971Va3.LJLL != z) {
            c79971Va3.LJLL = z;
            if (z && c79971Va3.LJLJL != null && c79971Va3.LJLLL != 1) {
                c79971Va3.LJ();
            }
        }
    }

    @Override // X.InterfaceC79973Va5
    public final void onPlaybackTimeChanged(long j) {
        VNL vnl;
        String str;
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "timeupdate");
            C79971Va3 c79971Va3 = this.LJLIL;
            if (c79971Va3 != null) {
                str = c79971Va3.LIZ();
            } else {
                str = null;
            }
            c49615Jdb.LIZJ(str, "currentSrcID");
            c49615Jdb.LIZJ(Long.valueOf(j), "currentTime");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    @EWS
    public final void pause(Callback callback) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", Control method: --> pause()");
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null) {
            c79971Va3.LJLLJ = 2;
            TTVideoEngine tTVideoEngine = c79971Va3.LJLJI;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJJL();
            }
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C79971Va3 c79971Va32 = this.LJLIL;
            if (c79971Va32 != null) {
                str = c79971Va32.LIZ();
            } else {
                str = null;
            }
            javaOnlyMap.put("currentSrcID", str);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @EWS
    public final void play(Callback callback) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", Control method: --> play()");
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null) {
            c79971Va3.LJLLJ = 3;
            TTVideoEngine tTVideoEngine = c79971Va3.LJLJI;
            if (tTVideoEngine != null) {
                tTVideoEngine.LLJJJJJIL();
            }
        }
        C79971Va3 c79971Va32 = this.LJLIL;
        if (c79971Va32 != null) {
            c79971Va32.LJ();
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C79971Va3 c79971Va33 = this.LJLIL;
            String str2 = null;
            if (c79971Va33 != null) {
                str = c79971Va33.LIZ();
            } else {
                str = null;
            }
            javaOnlyMap.put("currentSrcID", str);
            C79971Va3 c79971Va34 = this.LJLIL;
            if (c79971Va34 != null) {
                str2 = c79971Va34.LIZIZ();
            }
            javaOnlyMap.put("loadingSrcID", str2);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @EWS
    public final void playerInfo(Callback callback) {
        String str;
        Integer num;
        Integer num2;
        Long l;
        Integer num3;
        long j;
        int i;
        int i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", Getter method: -> playerInfo");
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        if (callback != null) {
            Object[] objArr = new Object[2];
            int i3 = 0;
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C79971Va3 c79971Va3 = this.LJLIL;
            Long l2 = null;
            if (c79971Va3 != null) {
                str = c79971Va3.LIZ();
            } else {
                str = null;
            }
            javaOnlyMap.put("currentSrcID", str);
            C79971Va3 c79971Va32 = this.LJLIL;
            if (c79971Va32 != null) {
                TTVideoEngine tTVideoEngine = c79971Va32.LJLJI;
                if (tTVideoEngine != null) {
                    i2 = tTVideoEngine.LJIL();
                } else {
                    i2 = 0;
                }
                num = Integer.valueOf(i2);
            } else {
                num = null;
            }
            javaOnlyMap.put("duration", num);
            C79971Va3 c79971Va33 = this.LJLIL;
            if (c79971Va33 != null) {
                TTVideoEngine tTVideoEngine2 = c79971Va33.LJLJI;
                if (tTVideoEngine2 != null) {
                    i = tTVideoEngine2.LJJIJIIJIL();
                } else {
                    i = -1;
                }
                num2 = Integer.valueOf(i);
            } else {
                num2 = null;
            }
            javaOnlyMap.put("playbackstate", num2);
            C79971Va3 c79971Va34 = this.LJLIL;
            long j2 = 0;
            if (c79971Va34 != null) {
                TTVideoEngine tTVideoEngine3 = c79971Va34.LJLJI;
                if (tTVideoEngine3 != null) {
                    j = tTVideoEngine3.LJJIIJZLJL(60);
                } else {
                    j = 0;
                }
                l = Long.valueOf(j);
            } else {
                l = null;
            }
            javaOnlyMap.put("playBitrate", l);
            C79971Va3 c79971Va35 = this.LJLIL;
            if (c79971Va35 != null) {
                TTVideoEngine tTVideoEngine4 = c79971Va35.LJLJI;
                if (tTVideoEngine4 != null) {
                    i3 = tTVideoEngine4.LJIJ();
                }
                num3 = Integer.valueOf(i3);
            } else {
                num3 = null;
            }
            javaOnlyMap.put("currentTime", num3);
            C79971Va3 c79971Va36 = this.LJLIL;
            if (c79971Va36 != null) {
                TTVideoEngine tTVideoEngine5 = c79971Va36.LJLJI;
                if (tTVideoEngine5 != null) {
                    j2 = tTVideoEngine5.LJJIIJZLJL(61);
                }
                l2 = Long.valueOf(j2);
            }
            javaOnlyMap.put("cacheTime", l2);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @EWS
    public final void releaseFocus(Callback callback) {
        Integer num;
        int abandonAudioFocus;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", Control method: --> releaseFocus()");
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        CYW cyw = this.LJLILLLLZI;
        if (cyw != null) {
            C79970Va2 listener = this.LJLJJI;
            o.LJIIJ(listener, "listener");
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = (AudioFocusRequest) cyw.LIZIZ;
                if (audioFocusRequest != null) {
                    abandonAudioFocus = ((AudioManager) cyw.LIZ).abandonAudioFocusRequest(audioFocusRequest);
                } else {
                    abandonAudioFocus = -1;
                }
            } else {
                abandonAudioFocus = ((AudioManager) cyw.LIZ).abandonAudioFocus(listener);
            }
            num = Integer.valueOf(abandonAudioFocus);
        } else {
            num = null;
        }
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("code", num);
            callback.invoke(0, javaOnlyMap);
        }
    }

    @EWS
    public final void requestFocus(Callback callback) {
        int LLJJJJLIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", Control method: --> requestFocus()");
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        CYW cyw = this.LJLILLLLZI;
        Integer num = null;
        if (cyw != null) {
            C79970Va2 listener = this.LJLJJI;
            o.LJIIJ(listener, "listener");
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest build = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(listener).build();
                cyw.LIZIZ = build;
                AudioManager audioManager = (AudioManager) cyw.LIZ;
                if (build != null) {
                    LLJJJJLIIL = C16880lQ.LLJJJJJIL(audioManager, build);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                LLJJJJLIIL = C16880lQ.LLJJJJLIIL((AudioManager) cyw.LIZ, listener, 3, 1);
            }
            num = Integer.valueOf(LLJJJJLIIL);
        }
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("code", num);
            callback.invoke(0, javaOnlyMap);
        }
    }

    @EWS
    public final void resume(Callback callback) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", Control method: --> resume()");
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null) {
            c79971Va3.LJ();
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C79971Va3 c79971Va32 = this.LJLIL;
            String str2 = null;
            if (c79971Va32 != null) {
                str = c79971Va32.LIZ();
            } else {
                str = null;
            }
            javaOnlyMap.put("currentSrcID", str);
            C79971Va3 c79971Va33 = this.LJLIL;
            if (c79971Va33 != null) {
                str2 = c79971Va33.LIZIZ();
            }
            javaOnlyMap.put("loadingSrcID", str2);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @VPD(name = "enableasync")
    public final void setEnableAsync(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", setEnableAsync -> ");
        LIZ.append(z);
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null) {
            c79971Va3.LJLLLLLL = z;
        }
    }

    @VPD(name = "headers")
    public final void setHeaders(String str) {
        C79971Va3 c79971Va3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", headers -> ");
        LIZ.append(str);
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        if (str != null && str.length() > 0 && (c79971Va3 = this.LJLIL) != null) {
            try {
                Map<String, String> map = (Map) GsonProtectorUtils.fromJson((Gson) c79971Va3.LJLJLJ.getValue(), str, (Type) Map.class);
                c79971Va3.LJLLILLLL = map;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        TTVideoEngine tTVideoEngine = c79971Va3.LJLJI;
                        if (tTVideoEngine != null) {
                            tTVideoEngine.LJLIIIL(key, value);
                        }
                    }
                }
            } catch (s unused) {
            }
        }
    }

    @VPD(name = "loop")
    public final void setLoop(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", setLoop -> ");
        LIZ.append(z);
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setLoop: ");
            LIZ2.append(z);
            LLog.LIZLLL(2, "AudioEnginePlayer", X1D.LIZIZ(LIZ2));
            if (c79971Va3.LJLLI != z) {
                c79971Va3.LJLLI = z;
                TTVideoEngine tTVideoEngine = c79971Va3.LJLJI;
                if (tTVideoEngine != null) {
                    tTVideoEngine.LLFII(z);
                }
            }
        }
    }

    @VPD(name = "pause-on-hide")
    public final void setPauseOnHide(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", pauseOnHide -> ");
        LIZ.append(z);
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        this.LJLJI = z;
    }

    @VPD(name = "playertype")
    public final void setPlayerType(String mode) {
        o.LJIIJ(mode, "mode");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", setPlayerType -> ");
        LIZ.append(mode);
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setPlayerType: ");
            LIZ2.append(mode);
            LLog.LIZLLL(2, "AudioEnginePlayer", X1D.LIZIZ(LIZ2));
            c79971Va3.LJLILLLLZI = mode;
        }
    }

    @VPD(name = "src")
    public final void setSrc(String str) {
        C79971Va3 c79971Va3;
        Looper looper;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", setSrc -> ");
        LIZ.append(str);
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        if (str != null && str.length() > 0 && (c79971Va3 = this.LJLIL) != null) {
            HandlerThread handlerThread = c79971Va3.LJLZ;
            if (handlerThread != null && (looper = handlerThread.getLooper()) != null) {
                new Handler(looper).post(new ARunnableS11S1100000_10(c79971Va3, str, 0));
            } else {
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS11S1100000_10(c79971Va3, str, 1));
            }
        }
    }

    @VPD(name = "interval")
    public final void setUpdateInterval(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", update interval -> ");
        LIZ.append(i);
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null) {
            c79971Va3.LJLLLL = i;
        }
    }

    @EWS
    public final void stop(Callback callback) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", Control method: --> stop()");
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null) {
            c79971Va3.LJLLJ = 3;
            TTVideoEngine tTVideoEngine = c79971Va3.LJLJI;
            if (tTVideoEngine != null) {
                tTVideoEngine.LLJJJJJIL();
            }
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C79971Va3 c79971Va32 = this.LJLIL;
            if (c79971Va32 != null) {
                str = c79971Va32.LIZ();
            } else {
                str = null;
            }
            javaOnlyMap.put("currentSrcID", str);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @EWS
    public final void mute(ReadableMap params, Callback callback) {
        String str;
        TTVideoEngine tTVideoEngine;
        o.LJIIJ(params, "params");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", Control method: --> mute()");
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        boolean z = params.getBoolean("mute", false);
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null && (tTVideoEngine = c79971Va3.LJLJI) != null) {
            tTVideoEngine.LJLZ(z);
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C79971Va3 c79971Va32 = this.LJLIL;
            if (c79971Va32 != null) {
                str = c79971Va32.LIZ();
            } else {
                str = null;
            }
            javaOnlyMap.put("currentSrcID", str);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @EWS
    public final void seek(ReadableMap params, Callback callback) {
        String str;
        o.LJIIJ(params, "params");
        int i = params.getInt("currentTime", 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", Control method: --> seek(), param is: ");
        LIZ.append(i);
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        C79971Va3 c79971Va3 = this.LJLIL;
        if (c79971Va3 != null) {
            AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(this, 40);
            TTVideoEngine tTVideoEngine = c79971Va3.LJLJI;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJJLIIIJLJLI(i, new C79972Va4(aqS180S0100000_14));
            }
        }
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C79971Va3 c79971Va32 = this.LJLIL;
            String str2 = null;
            if (c79971Va32 != null) {
                str = c79971Va32.LIZ();
            } else {
                str = null;
            }
            javaOnlyMap.put("currentSrcID", str);
            C79971Va3 c79971Va33 = this.LJLIL;
            if (c79971Va33 != null) {
                str2 = c79971Va33.LIZIZ();
            }
            javaOnlyMap.put("loadingSrcID", str2);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @Override // X.InterfaceC79973Va5
    public final void onError(String str, int i, String str2) {
        VNL vnl;
        String str3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sign: ");
        LIZ.append(String.valueOf(getSign()));
        LIZ.append(", onError -> code=");
        LIZ.append(i);
        LIZ.append(", errMsg=");
        LIZ.append(str2);
        LLog.LIZLLL(2, "LynxAudioTTView", X1D.LIZIZ(LIZ));
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "error");
            C79971Va3 c79971Va3 = this.LJLIL;
            if (c79971Va3 != null) {
                str3 = c79971Va3.LIZ();
            } else {
                str3 = "";
            }
            c49615Jdb.LIZJ(str3, "currentSrcID");
            c49615Jdb.LIZJ(Integer.valueOf(i), "code");
            c49615Jdb.LIZJ(str2, "msg");
            vnl.LIZIZ(c49615Jdb);
        }
    }
}
