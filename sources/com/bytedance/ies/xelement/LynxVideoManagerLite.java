package com.bytedance.ies.xelement;

import X.AbstractC79988VaK;
import X.C61259O2l;
import X.C79990VaM;
import X.EWS;
import X.F5B;
import X.InterfaceC88472Yns;
import X.J0G;
import X.KMP;
import X.Q7L;
import X.VNU;
import X.VPD;
import X.VQ3;
import X.VQQ;
import X.VTA;
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
public final class LynxVideoManagerLite extends UISimpleView<AbstractC79988VaK> {
    public static final C79990VaM Companion = new C79990VaM();

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        ((AbstractC79988VaK) this.mView).onPropsUpdateOnce();
        super.onPropsUpdated();
        System.out.println((Object) "LynxVideoManagerLite- onPropsUpdated");
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        ((AbstractC79988VaK) this.mView).destroy();
    }

    public LynxVideoManagerLite(VNU vnu) {
        super(vnu);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public AbstractC79988VaK createView(Context context) {
        XElementInitializerLite.Companion.getClass();
        InterfaceC88472Yns<Context, AbstractC79988VaK> declarativeVideoPlayBoxViewProvider = ((XElementInitializerLite) XElementInitializerLite.instance$delegate.getValue()).getConfig().getDeclarativeVideoPlayBoxViewProvider();
        if (declarativeVideoPlayBoxViewProvider != null) {
            if (context != null) {
                AbstractC79988VaK invoke = declarativeVideoPlayBoxViewProvider.invoke(context);
                invoke.setStateChangeReporter(new IDqS433S0100000_8(this, 3));
                return invoke;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    @EWS
    public final void getDuration(Callback callback) {
        int duration = ((AbstractC79988VaK) this.mView).getDuration();
        if (callback != null) {
            callback.invoke(0, Integer.valueOf(duration));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onBorderRadiusUpdated(int i) {
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
        ((AbstractC79988VaK) this.mView).setBorderRadius(fArr);
    }

    @VPD(name = "autolifecycle")
    public final void setAutoLifecycle(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManagerLite- autolifecycle -> ", z));
        ((AbstractC79988VaK) this.mView).setAutoLifecycle(z);
    }

    @VPD(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManagerLite- autoplay -> ", z));
        ((AbstractC79988VaK) this.mView).setAutoPlay(z);
    }

    @VPD(name = "__control")
    public final void setControl(String str) {
        boolean z;
        AbstractC79988VaK abstractC79988VaK;
        JSONObject jSONObject;
        AbstractC79988VaK abstractC79988VaK2;
        System.out.println((Object) i0.LJFF("LynxVideoManagerLite- __control -> ", str));
        if (str != null) {
            Companion.getClass();
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
                        ((AbstractC79988VaK) this.mView).performZoomOut();
                        return;
                    case -619198582:
                        if (!str2.equals("requestfullscreen")) {
                            return;
                        }
                        ((AbstractC79988VaK) this.mView).performZoom();
                        return;
                    case 3443508:
                        if (!str2.equals("play") || (abstractC79988VaK2 = (AbstractC79988VaK) this.mView) == null) {
                            return;
                        }
                        AbstractC79988VaK.playReal$default(abstractC79988VaK2, null, 1, null);
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
                        AbstractC79988VaK abstractC79988VaK3 = (AbstractC79988VaK) this.mView;
                        if (abstractC79988VaK3 == null) {
                            return;
                        }
                        int optInt = jSONObject.optInt("position", 0);
                        if (jSONObject.optInt("play") != 1) {
                            z2 = false;
                        }
                        abstractC79988VaK3.seek(optInt, z2);
                        return;
                    case 106440182:
                        if (!str2.equals("pause") || (abstractC79988VaK = (AbstractC79988VaK) this.mView) == null) {
                            return;
                        }
                        abstractC79988VaK.pause();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @VPD(name = "devicechangeaware")
    public final void setDeviceChangeAware(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManagerLite- devicechangeaware -> ", z));
        ((AbstractC79988VaK) this.mView).setDeviceChangeAware(z);
    }

    @VPD(name = "enableplaylistener")
    public final void setEnablePlayListener(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManagerLite- enableplaylistener -> ", z));
        ((AbstractC79988VaK) this.mView).setEnablePlayListener(z);
    }

    @VPD(name = "inittime")
    public final void setInitTime(int i) {
        System.out.println((Object) KMP.LJ("LynxVideoManagerLite- inittime -> ", i));
        ((AbstractC79988VaK) this.mView).setInitTime(i);
    }

    @VPD(name = "log-extra")
    public final void setLogExtra(ReadableMap readableMap) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxVideoManagerLite- log-extra -> ");
        LIZ.append(readableMap);
        System.out.println((Object) X1D.LIZIZ(LIZ));
        if (readableMap != null) {
            AbstractC79988VaK abstractC79988VaK = (AbstractC79988VaK) this.mView;
            HashMap<String, Object> asHashMap = readableMap.asHashMap();
            o.LJFF(asHashMap, "it.asHashMap()");
            abstractC79988VaK.setLogExtra(asHashMap);
        }
    }

    @VPD(name = "loop")
    public final void setLoop(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManagerLite- loop -> ", z));
        ((AbstractC79988VaK) this.mView).setLoop(z);
    }

    @VPD(name = "muted")
    public final void setMuted(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManagerLite- muted -> ", z));
        ((AbstractC79988VaK) this.mView).setMuted(z);
    }

    @VPD(name = "objectfit")
    public final void setObjectFit(String objectFit) {
        o.LJIIJ(objectFit, "objectFit");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxVideoManagerLite- objectfit -> ");
        LIZ.append(objectFit);
        System.out.println((Object) X1D.LIZIZ(LIZ));
        ((AbstractC79988VaK) this.mView).setObjectFit(objectFit);
    }

    @VPD(name = "performanceLog")
    public final void setPerformanceLog(String str) {
        System.out.println((Object) i0.LJFF("LynxVideoManagerLite- performanceLog -> ", str));
        if (str != null) {
            ((AbstractC79988VaK) this.mView).setPerformanceLog(str);
        }
    }

    @VPD(name = "poster")
    public final void setPoster(F5B poster) {
        o.LJIIJ(poster, "poster");
        ReadableType type = poster.getType();
        if (type == null || VTA.LIZIZ[type.ordinal()] != 1) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxVideoManagerLite- poster -> ");
        LIZ.append(poster.asString());
        System.out.println((Object) X1D.LIZIZ(LIZ));
        String asString = poster.asString();
        o.LJFF(asString, "poster.asString()");
        if (asString.length() <= 0) {
            return;
        }
        AbstractC79988VaK abstractC79988VaK = (AbstractC79988VaK) this.mView;
        String asString2 = poster.asString();
        o.LJFF(asString2, "poster.asString()");
        abstractC79988VaK.setPoster(asString2);
    }

    @VPD(name = "preload")
    public final void setPreload(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManagerLite- preload -> ", z));
        ((AbstractC79988VaK) this.mView).setPreload(z);
    }

    @VPD(name = "rate")
    public final void setRate(int i) {
        System.out.println((Object) KMP.LJ("LynxVideoManagerLite- rate -> ", i));
        ((AbstractC79988VaK) this.mView).setRate(i);
    }

    public final void setResourceLoader(J0G<C61259O2l> loader) {
        o.LJIIJ(loader, "loader");
        System.out.println((Object) "LynxVideoManagerLite- setResourceLoader");
        ((AbstractC79988VaK) this.mView).setResourceLoader(loader);
    }

    @VPD(name = "singleplayer")
    public final void setSinglePlayer(boolean z) {
        System.out.println((Object) Q7L.LIZJ("LynxVideoManagerLite- singleplayer -> ", z));
        ((AbstractC79988VaK) this.mView).setSinglePlayer(z);
    }

    @VPD(name = "src")
    public final void setSrc(F5B awemeStr) {
        o.LJIIJ(awemeStr, "awemeStr");
        ReadableType type = awemeStr.getType();
        if (type == null || VTA.LIZ[type.ordinal()] != 1) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxVideoManagerLite- src -> ");
        LIZ.append(awemeStr.asString());
        System.out.println((Object) X1D.LIZIZ(LIZ));
        String asString = awemeStr.asString();
        o.LJFF(asString, "awemeStr.asString()");
        if (asString.length() <= 0) {
            return;
        }
        AbstractC79988VaK abstractC79988VaK = (AbstractC79988VaK) this.mView;
        String asString2 = awemeStr.asString();
        o.LJFF(asString2, "awemeStr.asString()");
        abstractC79988VaK.setSrc(asString2);
    }

    @VPD(name = "video-tag")
    public final void setVideoTag(String str) {
        ((AbstractC79988VaK) this.mView).setVideoTag(str);
    }

    @VPD(name = "volume")
    public final void setVolume(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxVideoManagerLite- preload -> ");
        LIZ.append(f);
        System.out.println((Object) X1D.LIZIZ(LIZ));
        ((AbstractC79988VaK) this.mView).setVolume(f);
    }
}
