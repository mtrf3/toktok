package com.bytedance.ies.xelement;

import X.C012403c;
import X.C025908h;
import X.C162476Zf;
import X.C16880lQ;
import X.C49615Jdb;
import X.C79944VZc;
import X.C79947VZf;
import X.C79959VZr;
import X.C79960VZs;
import X.EWS;
import X.EnumC48641J7d;
import X.EnumC79942VZa;
import X.EnumC79950VZi;
import X.EnumC79958VZq;
import X.InterfaceC79946VZe;
import X.InterfaceC79949VZh;
import X.InterfaceC79962VZu;
import X.InterfaceC81172VtQ;
import X.J7Z;
import X.JBR;
import X.VNL;
import X.VNU;
import X.VPD;
import X.VZY;
import X.VZZ;
import X.X1D;
import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxAudio extends UISimpleView<VZZ> implements InterfaceC79962VZu, InterfaceC79946VZe, InterfaceC81172VtQ {
    public static final String LJLJI = C16880lQ.LJLLJ(LynxAudio.class);
    public InterfaceC79949VZh LJLIL;
    public Long LJLILLLLZI;

    @Override // X.InterfaceC81172VtQ
    public final void onAppBackground() {
    }

    @Override // X.InterfaceC81172VtQ
    public final void onAppForeground() {
    }

    @Override // X.InterfaceC79946VZe
    public final void onAttachedToWindow() {
    }

    @Override // X.InterfaceC79946VZe
    public final void onDetachedFromWindow() {
    }

    @Override // X.InterfaceC79962VZu
    public final void LJIIIIZZ() {
        VNL vnl;
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            vnl.LIZIZ(new C49615Jdb(getSign(), "listchange"));
        }
    }

    public LynxAudio(VNU vnu) {
        super(vnu);
        this.LJLILLLLZI = 0L;
    }

    @Override // X.InterfaceC79962VZu
    public final void LJFF(EnumC48641J7d loadingState) {
        VNL vnl;
        o.LJIIJ(loadingState, "loadingState");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLJI);
        LIZ.append("- onLoadStateChanged, state:");
        LIZ.append(loadingState);
        System.out.println((Object) X1D.LIZIZ(LIZ));
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "loadstatechanged");
            c49615Jdb.LIZJ(loadingState.name(), "loadState");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    @Override // X.InterfaceC79962VZu
    public final void LJIIJJI(String str) {
        VNL vnl;
        String str2 = LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCurrentSrcChanged -> ");
        LIZ.append(str);
        J7Z.LIZIZ(str2, X1D.LIZIZ(LIZ));
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "srcchange");
            c49615Jdb.LIZJ(str, "currentSrcID");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    @Override // X.InterfaceC79962VZu
    public final void LJIILL(EnumC79958VZq playbackState) {
        String str;
        VNL vnl;
        String str2;
        VZY player;
        String LJII;
        VZY player2;
        o.LJIIJ(playbackState, "playbackState");
        String str3 = LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlaybackStateChanged -> ");
        LIZ.append(playbackState.name());
        J7Z.LIZIZ(str3, X1D.LIZIZ(LIZ));
        switch (C79959VZr.LIZ[playbackState.ordinal()]) {
            case 1:
            case 2:
                str = "play";
                break;
            case 3:
                str = "pause";
                break;
            case 4:
                str = "error";
                break;
            case 5:
                str = "stop";
                break;
            case 6:
                str = "ended";
                break;
            default:
                throw new C162476Zf();
        }
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), str);
            VZZ vzz = (VZZ) this.mView;
            String str4 = "";
            if (vzz == null || (player2 = vzz.getPlayer()) == null || (str2 = player2.LJII()) == null) {
                str2 = "";
            }
            c49615Jdb.LIZJ(str2, "currentSrcID");
            c49615Jdb.LIZJ(playbackState.getDesc(), "status");
            vnl.LIZIZ(c49615Jdb);
            C49615Jdb c49615Jdb2 = new C49615Jdb(getSign(), "statuschange");
            VZZ vzz2 = (VZZ) this.mView;
            if (vzz2 != null && (player = vzz2.getPlayer()) != null && (LJII = player.LJII()) != null) {
                str4 = LJII;
            }
            c49615Jdb2.LIZJ(str4, "currentSrcID");
            c49615Jdb2.LIZJ(playbackState.getDesc(), "status");
            vnl.LIZIZ(c49615Jdb2);
        }
    }

    @Override // X.InterfaceC79962VZu
    public final void LJIJ(int i) {
        VNL vnl;
        String str;
        VZY player;
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "seek");
            VZZ vzz = (VZZ) this.mView;
            if (vzz == null || (player = vzz.getPlayer()) == null || (str = player.LJII()) == null) {
                str = "";
            }
            c49615Jdb.LIZJ(str, "currentSrcID");
            c49615Jdb.LIZJ(Integer.valueOf(i), "currentTime");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    @Override // X.InterfaceC79962VZu
    public final void LJIJI(int i) {
        VNL vnl;
        String str;
        Long l;
        VZY player;
        String LJII;
        VZY player2;
        VZY player3;
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "timeupdate");
            VZZ vzz = (VZZ) this.mView;
            String str2 = "";
            if (vzz == null || (player3 = vzz.getPlayer()) == null || (str = player3.LJII()) == null) {
                str = "";
            }
            c49615Jdb.LIZJ(str, "currentSrcID");
            c49615Jdb.LIZJ(Integer.valueOf(i), "currentTime");
            vnl.LIZIZ(c49615Jdb);
            VZZ vzz2 = (VZZ) this.mView;
            if (vzz2 != null && (player2 = vzz2.getPlayer()) != null) {
                l = Long.valueOf(player2.LJIIJ());
            } else {
                l = null;
            }
            if (!o.LJ(l, this.LJLILLLLZI)) {
                this.LJLILLLLZI = l;
                C49615Jdb c49615Jdb2 = new C49615Jdb(getSign(), "cachetimeupdate");
                VZZ vzz3 = (VZZ) this.mView;
                if (vzz3 != null && (player = vzz3.getPlayer()) != null && (LJII = player.LJII()) != null) {
                    str2 = LJII;
                }
                c49615Jdb2.LIZJ(str2, "currentSrcID");
                c49615Jdb2.LIZJ(l, "cacheTime");
                vnl.LIZIZ(c49615Jdb2);
            }
        }
    }

    @EWS
    public final void cacheTime(Callback callback) {
        Long l;
        VZY player;
        StringBuilder LIZ = X1D.LIZ();
        System.out.println((Object) JBR.LJFF(LIZ, LJLJI, " Getter method: cacheTime", LIZ));
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            VZZ vzz = (VZZ) this.mView;
            if (vzz != null && (player = vzz.getPlayer()) != null) {
                l = Long.valueOf(player.LJIIJ());
            } else {
                l = null;
            }
            javaOnlyMap.put("cacheTime", l);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        C79944VZc LIZ = C79947VZf.LIZ.LIZ(context);
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJFF(LLLLL, "context.applicationContext");
        VNU lynxContext = this.mContext;
        o.LJFF(lynxContext, "lynxContext");
        C79960VZs c79960VZs = new C79960VZs(LLLLL, lynxContext, getSign());
        c79960VZs.LIZ = this;
        InterfaceC79949VZh interfaceC79949VZh = this.LJLIL;
        if (interfaceC79949VZh != null) {
            c79960VZs.LJIIZILJ(interfaceC79949VZh);
        }
        LIZ.setPlayer(c79960VZs);
        LIZ.setLifecycle(this);
        return LIZ;
    }

    @EWS
    public final void currentSrcID(Callback callback) {
        String str;
        VZY player;
        J7Z.LIZIZ(LJLJI, "Getter method: -> currentSrcID");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            VZZ vzz = (VZZ) this.mView;
            if (vzz != null && (player = vzz.getPlayer()) != null) {
                str = player.LJII();
            } else {
                str = null;
            }
            javaOnlyMap.put("currentSrcID", str);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @EWS
    public final void currentTime(Callback callback) {
        Integer num;
        VZY player;
        J7Z.LIZIZ(LJLJI, "Getter method: -> currentTime");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            VZZ vzz = (VZZ) this.mView;
            if (vzz != null && (player = vzz.getPlayer()) != null) {
                num = Integer.valueOf(player.getCurrentPlaybackTime());
            } else {
                num = null;
            }
            javaOnlyMap.put("currentTime", num);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @EWS
    public final void duration(Callback callback) {
        Integer num;
        VZY player;
        J7Z.LIZIZ(LJLJI, "Getter method: -> duration");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            VZZ vzz = (VZZ) this.mView;
            if (vzz != null && (player = vzz.getPlayer()) != null) {
                num = Integer.valueOf(player.getDuration());
            } else {
                num = null;
            }
            javaOnlyMap.put("duration", num);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @VPD(name = "autoplay")
    public final void isAutoPlay(boolean z) {
        VZY player;
        String str = LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isAutoPlay -> ");
        LIZ.append(z);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        VZZ vzz = (VZZ) this.mView;
        if (vzz != null && (player = vzz.getPlayer()) != null) {
            player.LJIIJJI(z);
        }
    }

    @EWS
    public final void pause(Callback callback) {
        VZY player;
        J7Z.LIZIZ(LJLJI, "Control method: --> pause()");
        VZZ vzz = (VZZ) this.mView;
        if (vzz != null && (player = vzz.getPlayer()) != null) {
            player.pause();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @EWS
    public final void play(Callback callback) {
        VZY player;
        J7Z.LIZIZ(LJLJI, "Control method: --> play()");
        VZZ vzz = (VZZ) this.mView;
        if (vzz != null && (player = vzz.getPlayer()) != null) {
            player.play();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @EWS
    public final void playBitrate(Callback callback) {
        Long l;
        VZY player;
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            VZZ vzz = (VZZ) this.mView;
            if (vzz != null && (player = vzz.getPlayer()) != null) {
                l = Long.valueOf(player.LJFF());
            } else {
                l = null;
            }
            javaOnlyMap.put("playBitrate", l);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @VPD(name = "list")
    public final void setList(String str) {
        VZY player;
        if (str != null) {
            StringBuilder LIZ = X1D.LIZ();
            System.out.println((Object) C025908h.LIZIZ(LIZ, LJLJI, "- list -> ", str, LIZ));
            VZZ vzz = (VZZ) this.mView;
            if (vzz != null && (player = vzz.getPlayer()) != null) {
                player.LJI(str);
            }
        }
    }

    @VPD(name = "loop")
    public final void setLoop(String mode) {
        VZY player;
        o.LJIIJ(mode, "mode");
        String str = LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLoop -> ");
        LIZ.append(mode);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        VZZ vzz = (VZZ) this.mView;
        if (vzz != null && (player = vzz.getPlayer()) != null) {
            EnumC79942VZa enumC79942VZa = EnumC79942VZa.SINGLE;
            if (!o.LJ(mode, enumC79942VZa.getDesc())) {
                enumC79942VZa = EnumC79942VZa.LIST;
                if (!o.LJ(mode, enumC79942VZa.getDesc())) {
                    enumC79942VZa = EnumC79942VZa.ORDER;
                }
            }
            player.LJIILL(enumC79942VZa);
        }
    }

    @VPD(name = "nativeplugins")
    public final void setNativePlugins(String plugins) {
        VZY player;
        o.LJIIJ(plugins, "plugins");
        String str = LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setNativePlugins -> ");
        LIZ.append(plugins);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        System.out.println((Object) JBR.LJFF(LIZ2, "- nativeplugins -> ", plugins, LIZ2));
        VZZ vzz = (VZZ) this.mView;
        if (vzz != null && (player = vzz.getPlayer()) != null) {
            player.LJIIL(plugins);
        }
    }

    @VPD(name = "playerType")
    public final void setPlayerType(String mode) {
        VZY player;
        o.LJIIJ(mode, "mode");
        String str = LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPlayerType -> ");
        LIZ.append(mode);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        VZZ vzz = (VZZ) this.mView;
        if (vzz != null && (player = vzz.getPlayer()) != null) {
            EnumC79950VZi enumC79950VZi = EnumC79950VZi.DEFAULT;
            if (!o.LJ(mode, enumC79950VZi.getDesc()) && (o.LJ(mode, EnumC79950VZi.SHORT.getDesc()) || o.LJ(mode, EnumC79950VZi.LIGHT.getDesc()))) {
                enumC79950VZi = EnumC79950VZi.LIGHT;
            }
            player.LJIILJJIL(enumC79950VZi);
        }
    }

    @VPD(name = "src")
    public final void setSrc(String str) {
        VZZ vzz;
        VZY player;
        String str2 = LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSrc -> ");
        LIZ.append(str);
        J7Z.LIZIZ(str2, X1D.LIZIZ(LIZ));
        if (str != null && str.length() > 0 && (vzz = (VZZ) this.mView) != null && (player = vzz.getPlayer()) != null) {
            player.LJIILIIL(str);
        }
    }

    @VPD(name = "focusable")
    public final void setSupportFocusable(boolean z) {
        VZY player;
        String str = LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSupportFocusable -> ");
        LIZ.append(z);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        VZZ vzz = (VZZ) this.mView;
        if (vzz != null && (player = vzz.getPlayer()) != null) {
            player.LJIIIZ(z);
        }
    }

    @VPD(name = "nativecontrol")
    public final void setSupportNativeControl(boolean z) {
        VZY player;
        String str = LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSupportNativeControl -> ");
        LIZ.append(z);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        VZZ vzz = (VZZ) this.mView;
        if (vzz != null && (player = vzz.getPlayer()) != null) {
            player.LJIILLIIL(z);
        }
    }

    @EWS
    public final void status(Callback callback) {
        String str;
        VZY player;
        EnumC79958VZq LJ;
        J7Z.LIZIZ(LJLJI, "Getter method: -> status");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            VZZ vzz = (VZZ) this.mView;
            if (vzz != null && (player = vzz.getPlayer()) != null && (LJ = player.LJ()) != null) {
                str = LJ.getDesc();
            } else {
                str = null;
            }
            javaOnlyMap.put("status", str);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @EWS
    public final void stop(Callback callback) {
        VZY player;
        J7Z.LIZIZ(LJLJI, "Control method: --> stop()");
        VZZ vzz = (VZZ) this.mView;
        if (vzz != null && (player = vzz.getPlayer()) != null) {
            player.stop();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @Override // X.InterfaceC79962VZu
    public final void onError(int i, String str) {
        VNL vnl;
        String str2;
        VZY player;
        J7Z.LIZ(LJLJI, C012403c.LIZLLL("onError -> ", i, ", ", str));
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "error");
            VZZ vzz = (VZZ) this.mView;
            if (vzz == null || (player = vzz.getPlayer()) == null || (str2 = player.LJII()) == null) {
                str2 = "";
            }
            c49615Jdb.LIZJ(str2, "currentSrcID");
            c49615Jdb.LIZJ(Integer.valueOf(i), "code");
            if (str == null) {
                str = "";
            }
            c49615Jdb.LIZJ(str, "msg");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    @EWS
    public final void seek(ReadableMap params, Callback callback) {
        VZY player;
        o.LJIIJ(params, "params");
        int i = params.getInt("currentTime", 0);
        String str = LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Control method: --> seek(), param is: ");
        LIZ.append(i);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        VZZ vzz = (VZZ) this.mView;
        if (vzz != null && (player = vzz.getPlayer()) != null) {
            player.LIZ(i);
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }
}
