package Y;

import X.AnonymousClass078;
import X.C022406y;
import X.C03660Ck;
import X.C03880Dg;
import X.C0R4;
import X.C16880lQ;
import X.C1JD;
import X.C2NU;
import X.C33081Ro;
import X.C39519Ff9;
import X.C39579Fg7;
import X.C5S1;
import X.C65300Pk0;
import X.C66589QBl;
import X.C78496UrM;
import X.C84729XNd;
import X.C84747XNv;
import X.C84751XNz;
import X.C84879XSx;
import X.C84880XSy;
import X.C84881XSz;
import X.EF7;
import X.InterfaceC84871XSp;
import X.J7Z;
import X.KL2;
import X.SS0;
import X.ViewOnTouchListenerC86817Y5l;
import X.X1D;
import X.XNV;
import X.XO0;
import X.XO6;
import X.XO7;
import X.XO8;
import X.XOC;
import X.XOD;
import X.XOR;
import X.XT7;
import X.YS2;
import X.YSF;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.assetpacks.r2;
import com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDHandlerS25S0100000_15 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            case 2:
                handleMessage$2(this, message);
                return;
            case 3:
                handleMessage$3(this, message);
                return;
            case 4:
                handleMessage$4(this, message);
                return;
            case 5:
                handleMessage$5(this, message);
                return;
            case 6:
                handleMessage$6(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public static final void handleMessage$0(IDHandlerS25S0100000_15 iDHandlerS25S0100000_15, Message message) {
        FollowLiveVideoViewHolder followLiveVideoViewHolder = (FollowLiveVideoViewHolder) iDHandlerS25S0100000_15.l0;
        if (followLiveVideoViewHolder.a && message.what == 100 && followLiveVideoViewHolder.LLZZZZ && followLiveVideoViewHolder.LLLLLLLZIL()) {
            ((FollowLiveVideoViewHolder) iDHandlerS25S0100000_15.l0).LLLLLZ();
        }
    }

    public static final void handleMessage$1(IDHandlerS25S0100000_15 iDHandlerS25S0100000_15, Message message) {
        super.handleMessage(message);
        if (((ViewOnTouchListenerC86817Y5l) iDHandlerS25S0100000_15.l0).LJLJJI.LIZIZ()) {
            ((ViewOnTouchListenerC86817Y5l) iDHandlerS25S0100000_15.l0).LJLJJI.LIZ.LLILLIZIL();
        }
    }

    public static final void handleMessage$2(IDHandlerS25S0100000_15 iDHandlerS25S0100000_15, Message msg) {
        boolean z;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            ((XO0) iDHandlerS25S0100000_15.l0).LIZJ();
            return;
        }
        if (((XO0) iDHandlerS25S0100000_15.l0).LIZIZ().LIZ) {
            XO0 xo0 = (XO0) iDHandlerS25S0100000_15.l0;
            XO8 xo8 = xo0.LJIIIIZZ;
            C84729XNd params = xo0.LJIIIZ;
            xo8.getClass();
            o.LJIIIZ(params, "params");
            try {
                Context context = xo8.LIZ;
                if (xo8.LIZLLL == -1) {
                    return;
                }
                C022406y c022406y = new C022406y(context, "X_AUDIO_DEFAULT_PLAY_SERVICE");
                c022406y.LIZLLL(false);
                c022406y.LJJIIJ.icon = xo8.LIZLLL;
                c022406y.LJIIIZ(null);
                c022406y.LJIIJJI = false;
                ((XOR) xo8.LJI.getValue()).LIZ();
                c022406y.LJJ = 1;
                c022406y.LJI = xo8.LJFF();
                String str = params.LIZIZ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                c022406y.LJFF(str);
                String str3 = params.LIZJ;
                if (str3 == null) {
                    str3 = "";
                }
                c022406y.LJ(str3);
                String str4 = params.LIZLLL;
                if (str4 != null) {
                    str2 = str4;
                }
                c022406y.LJIILIIL = C022406y.LIZJ(str2);
                c022406y.LJII(2, o.LJ(params.LIZ, Boolean.TRUE));
                c022406y.LJJIIJ.deleteIntent = xo8.LJ();
                c022406y.LJIIZILJ = "x_audio_default_player_service";
                Bitmap bitmap = params.LJ;
                if (bitmap != null && bitmap.isRecycled()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("coverBitmap(");
                    LIZ.append(params.LJ);
                    LIZ.append(") already recycled.");
                    J7Z.LIZJ("NotificationFactory", X1D.LIZIZ(LIZ));
                } else {
                    c022406y.LJIIIIZZ(params.LJ);
                }
                xo8.LIZ(c022406y);
                Boolean bool = params.LIZ;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                xo8.LIZJ(c022406y, z);
                xo8.LIZIZ(c022406y);
                C33081Ro c33081Ro = new C33081Ro();
                c33081Ro.LJ = new int[]{0, 1, 2};
                c33081Ro.LJFF = xo8.LIZIZ;
                xo8.LIZLLL();
                c022406y.LJIIJ(c33081Ro);
                Notification LIZIZ = c022406y.LIZIZ();
                if (LIZIZ == null) {
                    return;
                }
                if (o.LJ(xo0.LJIIIZ.LIZ, Boolean.TRUE)) {
                    XOC xoc = xo0.LJIIJJI;
                    if (xoc != null) {
                        try {
                            C16880lQ.LLLILZJ(xoc.LJLIL, ((Number) xo0.LJIIJ.getValue()).intValue(), LIZIZ);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    NotificationManager notificationManager = xo0.LJII;
                    int intValue = ((Number) xo0.LJIIJ.getValue()).intValue();
                    o.LJIIIZ(notificationManager, "notificationManager");
                    if (Build.VERSION.SDK_INT < 33 || new AnonymousClass078(EF7.LIZIZ()).LIZIZ()) {
                        notificationManager.notify(intValue, LIZIZ);
                    }
                }
                xo0.LIZIZ().LIZIZ = true;
                return;
            } catch (Exception e) {
                J7Z.LIZ("NotificationFactory", e.getMessage());
                return;
            }
        }
        ((XO0) iDHandlerS25S0100000_15.l0).LIZJ();
    }

    public static final void handleMessage$3(IDHandlerS25S0100000_15 iDHandlerS25S0100000_15, Message message) {
        super.handleMessage(message);
        YS2 ys2 = (YS2) iDHandlerS25S0100000_15.l0;
        YSF ysf = ys2.LJLJI;
        if (ysf != null && KL2.LJIILJJIL(ysf.getView())) {
            KL2.LJIILLIIL(8, ys2.LJLJI.getView());
        }
    }

    public static final void handleMessage$4(IDHandlerS25S0100000_15 iDHandlerS25S0100000_15, Message msg) {
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            ((C84751XNz) iDHandlerS25S0100000_15.l0).LIZLLL();
            return;
        }
        if (((C84751XNz) iDHandlerS25S0100000_15.l0).LIZJ().LIZ) {
            C84751XNz c84751XNz = (C84751XNz) iDHandlerS25S0100000_15.l0;
            XO7 xo7 = c84751XNz.LJIIIIZZ;
            XNV params = c84751XNz.LJIIIZ;
            xo7.getClass();
            o.LJIIIZ(params, "params");
            try {
                Context context = xo7.LIZ;
                if (xo7.LIZLLL == -1) {
                    return;
                }
                C022406y c022406y = new C022406y(context, "X_AUDIO_DEFAULT_PLAY_SERVICE");
                c022406y.LIZLLL(false);
                c022406y.LJJIIJ.icon = xo7.LIZLLL;
                c022406y.LJIIIZ(null);
                c022406y.LJIIJJI = false;
                ((XOR) xo7.LJI.getValue()).LIZ();
                c022406y.LJJ = 1;
                c022406y.LJI = xo7.LJFF();
                String str = params.LIZLLL;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                c022406y.LJFF(str);
                String str3 = params.LJ;
                if (str3 == null) {
                    str3 = "";
                }
                c022406y.LJ(str3);
                String str4 = params.LJFF;
                if (str4 != null) {
                    str2 = str4;
                }
                c022406y.LJIILIIL = C022406y.LIZJ(str2);
                c022406y.LJII(2, o.LJ(params.LIZ, Boolean.TRUE));
                c022406y.LJJIIJ.deleteIntent = xo7.LJ();
                c022406y.LJIIZILJ = "x_audio_default_player_service";
                Bitmap bitmap = params.LJI;
                if (bitmap != null && bitmap.isRecycled()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("coverBitmap(");
                    LIZ.append(params.LJI);
                    LIZ.append(") already recycled.");
                    J7Z.LIZJ("NotificationFactory", X1D.LIZIZ(LIZ));
                } else {
                    c022406y.LJIIIIZZ(params.LJI);
                }
                Boolean bool = params.LIZIZ;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                xo7.LIZJ(c022406y, z);
                Boolean bool2 = params.LIZ;
                if (bool2 != null) {
                    z2 = bool2.booleanValue();
                } else {
                    z2 = false;
                }
                xo7.LIZIZ(c022406y, z2);
                Boolean bool3 = params.LIZJ;
                if (bool3 != null) {
                    z3 = bool3.booleanValue();
                } else {
                    z3 = false;
                }
                xo7.LIZ(c022406y, z3);
                C33081Ro c33081Ro = new C33081Ro();
                c33081Ro.LJ = new int[]{0, 1, 2};
                c33081Ro.LJFF = xo7.LIZIZ;
                xo7.LIZLLL();
                c022406y.LJIIJ(c33081Ro);
                Notification LIZIZ = c022406y.LIZIZ();
                if (LIZIZ == null) {
                    return;
                }
                if (o.LJ(c84751XNz.LJIIIZ.LIZ, Boolean.TRUE)) {
                    XOD xod = c84751XNz.LJIIL;
                    if (xod != null) {
                        try {
                            C16880lQ.LLLILZJ(xod.LJLIL, ((Number) c84751XNz.LJIILIIL.getValue()).intValue(), LIZIZ);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    NotificationManager notificationManager = c84751XNz.LJII;
                    int intValue = ((Number) c84751XNz.LJIILIIL.getValue()).intValue();
                    o.LJIIIZ(notificationManager, "notificationManager");
                    if (Build.VERSION.SDK_INT < 33 || new AnonymousClass078(EF7.LIZIZ()).LIZIZ()) {
                        notificationManager.notify(intValue, LIZIZ);
                    }
                }
                c84751XNz.LIZJ().LIZIZ = true;
                return;
            } catch (Exception e) {
                J7Z.LIZ("NotificationFactory", e.getMessage());
                return;
            }
        }
        ((C84751XNz) iDHandlerS25S0100000_15.l0).LIZLLL();
    }

    public static final void handleMessage$5(IDHandlerS25S0100000_15 iDHandlerS25S0100000_15, Message message) {
        InterfaceC84871XSp interfaceC84871XSp;
        Activity LJJIZ;
        String cookie;
        int i = message.what;
        if (i == 2) {
            C0R4 c0r4 = ((C84880XSy) iDHandlerS25S0100000_15.l0).LIZLLL;
            if (c0r4 != null) {
                c0r4.LIZJ();
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        C84879XSx c84879XSx = (C84879XSx) message.obj;
        C84880XSy c84880XSy = (C84880XSy) iDHandlerS25S0100000_15.l0;
        MusicModel musicModel = c84879XSx.LIZ;
        boolean z = c84879XSx.LIZJ;
        c84880XSy.getClass();
        SystemClock.elapsedRealtime();
        if (musicModel == null || (interfaceC84871XSp = c84880XSy.LIZ) == null || (LJJIZ = interfaceC84871XSp.LJJIZ()) == null) {
            return;
        }
        if (C2NU.LIZ.LIZIZ()) {
            if (!SS0.LIZIZ(musicModel, LJJIZ, true)) {
                return;
            }
            C1JD.LJJIZ(musicModel);
            c84880XSy.LJII = musicModel;
            c84880XSy.LIZLLL.LIZJ();
            String localPath = musicModel.getLocalPath();
            C84881XSz c84881XSz = new C84881XSz();
            musicModel.getMusicId();
            if (musicModel.getMusicType() != MusicModel.MusicType.ONLINE) {
                return;
            }
            c84881XSz.LIZJ = 4;
            C66589QBl LIZIZ = C66589QBl.LIZIZ();
            LIZIZ.getClass();
            StringBuilder LIZ = X1D.LIZ();
            ICacheService iCacheService = (ICacheService) LIZIZ.LIZ.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(iCacheService.musicDir());
            LIZ2.append("download/");
            LIZ.append(X1D.LIZIZ(LIZ2));
            LIZ.append(r2.LJIIIZ(localPath));
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            musicModel.getRealAuditionDuration();
            if (!TextUtils.isEmpty(LIZIZ2) && C39579Fg7.LIZIZ(LIZIZ2) && C78496UrM.LIZ(LIZIZ2) > 0) {
                c84881XSz.LIZ = LIZIZ2;
                c84880XSy.LIZLLL.LIZLLL(c84881XSz, z);
                XT7 xt7 = c84880XSy.LJFF;
                if (xt7 == null) {
                    return;
                }
                xt7.LIZ();
                return;
            }
            if (musicModel.isNeedSetCookie()) {
                String str = (String) ListProtector.get(musicModel.getUrl().getUrlList(), 0);
                CookieManager cookieManager = CookieManager.getInstance();
                C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "3075499546837003097"));
                if (LIZJ.LIZ) {
                    cookie = (String) LIZJ.LIZIZ;
                } else {
                    cookie = cookieManager.getCookie(str);
                }
                c84881XSz.LIZLLL = C03660Ck.LIZJ("cookie", cookie);
            }
            c84881XSz.LIZIZ = musicModel.getUrl().getUrlList();
            c84880XSy.LIZLLL.LIZLLL(c84881XSz, z);
            XT7 xt72 = c84880XSy.LJFF;
            if (xt72 == null) {
                return;
            }
            xt72.LIZ();
            return;
        }
        C5S1 c5s1 = new C5S1(LJJIZ);
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    public static final void handleMessage$6(IDHandlerS25S0100000_15 iDHandlerS25S0100000_15, Message message) {
        Integer valueOf;
        super.handleMessage(message);
        Object obj = null;
        if (message == null || (valueOf = Integer.valueOf(message.what)) == null) {
            return;
        }
        if (valueOf.intValue() == 1) {
            Object obj2 = message.obj;
            if (obj2 instanceof C84747XNv) {
                obj = obj2;
            }
            C84747XNv c84747XNv = (C84747XNv) obj;
            if (c84747XNv == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (!new AnonymousClass078(((XO6) ((AqS165S0100000_15) iDHandlerS25S0100000_15.l0).l0).LJIIIIZZ).LIZIZ()) {
                    return;
                }
                ((XO6) ((AqS165S0100000_15) iDHandlerS25S0100000_15.l0).l0).LJI(c84747XNv);
                return;
            }
            ((XO6) ((AqS165S0100000_15) iDHandlerS25S0100000_15.l0).l0).LJI(c84747XNv);
            return;
        }
        if (valueOf.intValue() != 2) {
            return;
        }
        ((XO6) ((AqS165S0100000_15) iDHandlerS25S0100000_15.l0).l0).LIZLLL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS25S0100000_15(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
