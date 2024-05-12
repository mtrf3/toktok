package com.bytedance.ies.xelement;

import X.AbstractC79989VaL;
import X.C38559FBj;
import X.EWS;
import X.F5B;
import X.FBH;
import X.InterfaceC88472Yns;
import X.KMP;
import X.Q7L;
import X.VNU;
import X.VPD;
import X.VQ3;
import X.VQQ;
import X.VT9;
import X.X1D;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import defpackage.i0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS433S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes15.dex */
public class LynxVideoManager extends UISimpleView<AbstractC79989VaL> {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        ((AbstractC79989VaL) this.mView).LIZIZ();
        super.onPropsUpdated();
        System.out.println((Object) "LynxVideoManager- onPropsUpdated");
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        ((AbstractC79989VaL) this.mView).LIZ();
    }

    public LynxVideoManager(VNU vnu) {
        super(vnu);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    /* renamed from: LJIJJLI, reason: merged with bridge method [inline-methods] */
    public AbstractC79989VaL createView(Context context) {
        FBH fbh = ((C38559FBj) C38559FBj.LIZIZ.getValue()).LIZ;
        if (fbh != null) {
            InterfaceC88472Yns<Context, AbstractC79989VaL> interfaceC88472Yns = fbh.LIZ;
            if (interfaceC88472Yns != null) {
                if (context != null) {
                    AbstractC79989VaL invoke = interfaceC88472Yns.invoke(context);
                    invoke.setStateChangeReporter(new IDqS433S0100000_8(this, 2));
                    return invoke;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIJI("localConfig");
        throw null;
    }

    @EWS
    public final void getDuration(Callback callback) {
        int duration = ((AbstractC79989VaL) this.mView).getDuration();
        if (callback != null) {
            callback.invoke(0, Integer.valueOf(duration));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onBorderRadiusUpdated(int i) {
        VQQ LIZIZ;
        super.onBorderRadiusUpdated(i);
        VQ3 vq3 = this.mLynxBackground;
        float[] fArr = null;
        if (vq3 != null && (LIZIZ = vq3.LIZIZ()) != null) {
            T mView = this.mView;
            o.LJFF(mView, "mView");
            int paddingLeft = mView.getPaddingLeft();
            T mView2 = this.mView;
            o.LJFF(mView2, "mView");
            int paddingRight = mView2.getPaddingRight();
            T mView3 = this.mView;
            o.LJFF(mView3, "mView");
            int paddingTop = mView3.getPaddingTop();
            T mView4 = this.mView;
            o.LJFF(mView4, "mView");
            int paddingBottom = mView4.getPaddingBottom();
            T mView5 = this.mView;
            o.LJFF(mView5, "mView");
            float width = mView5.getWidth() + paddingLeft + paddingRight;
            T mView6 = this.mView;
            o.LJFF(mView6, "mView");
            LIZIZ.LJ(width, mView6.getHeight() + paddingTop + paddingBottom);
            float[] LIZ = LIZIZ.LIZ();
            if (LIZ != null) {
                int i2 = 0;
                if (LIZ.length == 8) {
                    float f = paddingLeft;
                    float f2 = paddingTop;
                    float f3 = paddingRight;
                    float f4 = paddingBottom;
                    float[] fArr2 = {f, f2, f3, f2, f3, f4, f, f4};
                    do {
                        LIZ[i2] = Math.max(0.0f, LIZ[i2] - fArr2[i2]);
                        i2++;
                    } while (i2 < 8);
                    fArr = LIZ;
                }
            }
        }
        ((AbstractC79989VaL) this.mView).setBorderRadius(fArr);
    }

    @VPD(name = "autolifecycle")
    public final void setAutoLifecycle(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManager- autolifecycle -> ", z));
        ((AbstractC79989VaL) this.mView).setAutoLifecycle(z);
    }

    @VPD(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManager- autoplay -> ", z));
        ((AbstractC79989VaL) this.mView).setAutoPlay(z);
    }

    @VPD(name = "__control")
    public final void setControl(String str) {
        boolean z;
        AbstractC79989VaL abstractC79989VaL;
        JSONObject jSONObject;
        AbstractC79989VaL abstractC79989VaL2;
        System.out.println((Object) i0.LJFF("LynxVideoManager- __control -> ", str));
        if (str != null) {
            boolean z2 = true;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && s.LJLJJL(str, new String[]{"_*_"}, 0, 6).size() == 3 && 1 != 0) {
                List LJLJJL = s.LJLJJL(str, new String[]{"_*_"}, 0, 6);
                String str2 = (String) ListProtector.get(LJLJJL, 0);
                switch (str2.hashCode()) {
                    case -1879513255:
                        if (!str2.equals("exitfullscreen")) {
                            return;
                        }
                        ((AbstractC79989VaL) this.mView).LIZLLL();
                        return;
                    case -619198582:
                        if (!str2.equals("requestfullscreen")) {
                            return;
                        }
                        ((AbstractC79989VaL) this.mView).LIZJ();
                        return;
                    case 3443508:
                        if (!str2.equals("play") || (abstractC79989VaL2 = (AbstractC79989VaL) this.mView) == null) {
                            return;
                        }
                        abstractC79989VaL2.LJ(null);
                        return;
                    case 3526264:
                        if (!str2.equals("seek")) {
                            return;
                        }
                        try {
                            jSONObject = new JSONObject((String) ListProtector.get(LJLJJL, 1));
                        } catch (Exception unused) {
                            jSONObject = new JSONObject();
                        }
                        AbstractC79989VaL abstractC79989VaL3 = (AbstractC79989VaL) this.mView;
                        if (abstractC79989VaL3 == null) {
                            return;
                        }
                        int optInt = jSONObject.optInt("position", 0);
                        if (jSONObject.optInt("play") != 1) {
                            z2 = false;
                        }
                        abstractC79989VaL3.LJFF(optInt, z2);
                        return;
                    case 106440182:
                        if (!str2.equals("pause") || (abstractC79989VaL = (AbstractC79989VaL) this.mView) == null) {
                            return;
                        }
                        abstractC79989VaL.pause();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @VPD(name = "devicechangeaware")
    public final void setDeviceChangeAware(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManager- devicechangeaware -> ", z));
        ((AbstractC79989VaL) this.mView).setDeviceChangeAware(z);
    }

    @VPD(name = "inittime")
    public final void setInitTime(int i) {
        System.out.println((Object) KMP.LJ("LynxVideoManager- inittime -> ", i));
        ((AbstractC79989VaL) this.mView).setInitTime(i);
    }

    @VPD(name = "log-extra")
    public final void setLogExtra(ReadableMap readableMap) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxVideoManager- log-extra -> ");
        LIZ.append(readableMap);
        System.out.println((Object) X1D.LIZIZ(LIZ));
        if (readableMap != null) {
            AbstractC79989VaL abstractC79989VaL = (AbstractC79989VaL) this.mView;
            HashMap<String, Object> asHashMap = readableMap.asHashMap();
            o.LJFF(asHashMap, "it.asHashMap()");
            abstractC79989VaL.setLogExtra(asHashMap);
        }
    }

    @VPD(name = "loop")
    public final void setLoop(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManager- loop -> ", z));
        ((AbstractC79989VaL) this.mView).setLoop(z);
    }

    @VPD(name = "muted")
    public final void setMuted(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManager- muted -> ", z));
        ((AbstractC79989VaL) this.mView).setMuted(z);
    }

    @VPD(name = "objectfit")
    public final void setObjectFit(String objectFit) {
        o.LJIIJ(objectFit, "objectFit");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxVideoManager- objectfit -> ");
        LIZ.append(objectFit);
        System.out.println((Object) X1D.LIZIZ(LIZ));
        ((AbstractC79989VaL) this.mView).setObjectFit(objectFit);
    }

    @VPD(name = "performanceLog")
    public final void setPerformanceLog(String str) {
        System.out.println((Object) i0.LJFF("LynxVideoManager- performanceLog -> ", str));
        if (str != null) {
            ((AbstractC79989VaL) this.mView).setPerformanceLog(str);
        }
    }

    @VPD(name = "poster")
    public final void setPoster(F5B poster) {
        o.LJIIJ(poster, "poster");
        ReadableType type = poster.getType();
        if (type == null || VT9.LIZIZ[type.ordinal()] != 1) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxVideoManager- poster -> ");
        LIZ.append(poster.asString());
        System.out.println((Object) X1D.LIZIZ(LIZ));
        String asString = poster.asString();
        o.LJFF(asString, "poster.asString()");
        if (asString.length() <= 0) {
            return;
        }
        AbstractC79989VaL abstractC79989VaL = (AbstractC79989VaL) this.mView;
        String asString2 = poster.asString();
        o.LJFF(asString2, "poster.asString()");
        abstractC79989VaL.setPoster(asString2);
    }

    @VPD(name = "preload")
    public final void setPreload(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManager- preload -> ", z));
        ((AbstractC79989VaL) this.mView).setPreload(z);
    }

    @VPD(name = "rate")
    public final void setRate(int i) {
        System.out.println((Object) KMP.LJ("LynxVideoManager- rate -> ", i));
        ((AbstractC79989VaL) this.mView).setRate(i);
    }

    @VPD(name = "singleplayer")
    public final void setSinglePlayer(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManager- singleplayer -> ", z));
        ((AbstractC79989VaL) this.mView).setSinglePlayer(z);
    }

    @VPD(name = "singleplayerscene")
    public final void setSinglePlayerScene(String singlePlayerScene) {
        o.LJIIJ(singlePlayerScene, "singlePlayerScene");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxVideoManager- singleplayerscene -> ");
        LIZ.append(singlePlayerScene);
        System.out.println((Object) X1D.LIZIZ(LIZ));
        ((AbstractC79989VaL) this.mView).setSinglePlayerScene(singlePlayerScene);
    }

    @VPD(name = "src")
    public final void setSrc(F5B awemeStr) {
        o.LJIIJ(awemeStr, "awemeStr");
        ReadableType type = awemeStr.getType();
        if (type == null || VT9.LIZ[type.ordinal()] != 1) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxVideoManager- src -> ");
        LIZ.append(awemeStr.asString());
        System.out.println((Object) X1D.LIZIZ(LIZ));
        String asString = awemeStr.asString();
        o.LJFF(asString, "awemeStr.asString()");
        if (asString.length() <= 0) {
            return;
        }
        AbstractC79989VaL abstractC79989VaL = (AbstractC79989VaL) this.mView;
        String asString2 = awemeStr.asString();
        o.LJFF(asString2, "awemeStr.asString()");
        abstractC79989VaL.setSrc(asString2);
    }

    @VPD(name = "videoheight")
    public final void setVideoHeight(int i) {
        System.out.println((Object) KMP.LJ("LynxVideoManager- videoheight -> ", i));
        ((AbstractC79989VaL) this.mView).setVideoHeight(i);
    }

    @VPD(name = "videowidth")
    public final void setVideoWidth(int i) {
        System.out.println((Object) KMP.LJ("LynxVideoManager- videowidth -> ", i));
        ((AbstractC79989VaL) this.mView).setVideoWidth(i);
    }

    @VPD(name = "volume")
    public final void setVolume(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxVideoManager- preload -> ");
        LIZ.append(f);
        System.out.println((Object) X1D.LIZIZ(LIZ));
        ((AbstractC79989VaL) this.mView).setVolume(f);
    }
}
