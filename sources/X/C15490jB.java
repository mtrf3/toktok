package X;

import Y.AfS0S0211000_5;
import Y.IDhS0S1000000_1;
import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipInputStream;
import ujb.o;

/* renamed from: X.0jB */
/* loaded from: classes.dex */
public final class C15490jB {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LJI(C15540jG c15540jG) {
        if (c15540jG == null) {
            return;
        }
        c15540jG.LIZIZ();
    }

    public static void LJIJI(String str) {
        if (C15380j0.LIZLLL() == null || TextUtils.isEmpty(str) || !o.LJJJLIIL(str, "http", false)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("preLoadImageFromUrl,load resource error,url:");
            LIZ2.append(str);
            C0NB.LJ("Gecko_Resource_Loader", X1D.LIZIZ(LIZ2));
            return;
        }
        W5I.LIZ().LJIIL(W5O.LIZIZ(str), C15380j0.LIZLLL());
    }

    public static final void LJIJJ(String str) {
        if (TextUtils.isEmpty("tiktok_live_gift_send_sound") || TextUtils.isEmpty(str)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("preload file,load resource error,channel:");
            LIZ2.append("tiktok_live_gift_send_sound");
            LIZ2.append(",fileName:");
            LIZ2.append(str);
            C0NB.LJ("Gecko_Resource_Loader", X1D.LIZIZ(LIZ2));
            return;
        }
        IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
        boolean Br0 = iHostResource.Br0("tiktok_live_gift_send_sound");
        if (!Br0) {
            iHostResource.K00("tiktok_live_gift_send_sound");
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("fileExist = ");
        LIZ3.append(Br0);
        C0NB.LJ("jenson first load ", X1D.LIZIZ(LIZ3));
    }

    public static final Drawable LIZ(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getGeckoDrawable,load resource error,channel:");
            LIZ2.append(str);
            LIZ2.append(",fileName:");
            LIZ2.append(str2);
            C0NB.LJ("Gecko_Resource_Loader", X1D.LIZIZ(LIZ2));
            return null;
        }
        String str10 = "";
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        try {
        } catch (Exception e) {
            StringBuilder LIZLLL = C06540Nm.LIZLLL("getGeckoDrawable,load resource error,channel:", str, ",fileName:", str2, ",exception:");
            LIZLLL.append(e);
            C0NB.LJ("Gecko_Resource_Loader", X1D.LIZIZ(LIZLLL));
        }
        if (!TextUtils.isEmpty(C15510jD.LIZ(str3, str4))) {
            if (str == null) {
                str8 = "";
            } else {
                str8 = str;
            }
            if (str2 == null) {
                str9 = "";
            } else {
                str9 = str2;
            }
            InputStream LIZJ = C15510jD.LIZJ(str8, str9);
            if (str2 != null) {
                str10 = str2;
            }
            return Drawable.createFromStream(LIZJ, str10);
        }
        if (str == null) {
            str5 = "";
        } else {
            str5 = str;
        }
        if (str2 == null) {
            str6 = "";
        } else {
            str6 = str2;
        }
        String LJIIJJI = C15510jD.LJIIJJI(str5, str6);
        if (!TextUtils.isEmpty(LJIIJJI)) {
            return Drawable.createFromPath(LJIIJJI);
        }
        if (str == null) {
            str7 = "";
        } else {
            str7 = str;
        }
        if (str2 != null) {
            str10 = str2;
        }
        List<String> LJ = C15510jD.LJ(str7, str10);
        if (!LJ.isEmpty()) {
            return Drawable.createFromStream(new java.net.URL((String) ListProtector.get(LJ, 0)).openStream(), str2);
        }
        return null;
    }

    public static final int LIZIZ(SoundPool soundPool, String str) {
        String LIZ2;
        kotlin.jvm.internal.o.LJIIIZ(soundPool, "soundPool");
        if (TextUtils.isEmpty("tiktok_live_gift_send_sound") || TextUtils.isEmpty(str)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getGeckoMp3,load gecko mp3 error,channel:");
            LIZ3.append("tiktok_live_gift_send_sound");
            LIZ3.append(",fileName:");
            LIZ3.append(str);
            C0NB.LJ("Gecko_Resource_Loader", X1D.LIZIZ(LIZ3));
            return 0;
        }
        try {
            LIZ2 = C15510jD.LIZ("tiktok_live_gift_send_sound", str);
        } catch (Exception e) {
            StringBuilder LIZLLL = C06540Nm.LIZLLL("getGeckoMp3,load gecko mp3 error,channel:", "tiktok_live_gift_send_sound", ",fileName:", str, ",exception:");
            LIZLLL.append(e);
            C0NB.LJ("Gecko_Resource_Loader", X1D.LIZIZ(LIZLLL));
        }
        if (!TextUtils.isEmpty(LIZ2)) {
            AssetFileDescriptor openFd = C15380j0.LIZLLL().getAssets().openFd(LIZ2);
            kotlin.jvm.internal.o.LJIIIIZZ(openFd, "getContext().assets.openFd(assetPath)");
            return soundPool.load(openFd, 1);
        }
        String LJIIJJI = C15510jD.LJIIJJI("tiktok_live_gift_send_sound", str);
        if (!TextUtils.isEmpty(LJIIJJI)) {
            return soundPool.load(LJIIJJI, 1);
        }
        LJIJJ(str);
        return 0;
    }

    public static final void LIZJ(View view, String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        LJII(view, C47261Igj.LJJIJ(str), ImageView.ScaleType.CENTER_CROP, null);
    }

    public static void LJIJ(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("preLoadImage,load resource error,channel:");
            LIZ2.append(str);
            LIZ2.append(",fileName:");
            LIZ2.append(str2);
            C0NB.LJ("Gecko_Resource_Loader", X1D.LIZIZ(LIZ2));
            return;
        }
        C38995FSd.LIZIZ().submit(new Runnable() { // from class: X.0j8
            public final void LIZ() {
                String str3 = str;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = str2;
                if (str5 == null) {
                    str5 = "";
                }
                File LJFF = C15510jD.LJFF(str3, str5);
                if (LJFF != null && LJFF.exists()) {
                    if (C15380j0.LIZLLL() == null || !LJFF.exists()) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("preLoadImageFromFile,load resource error,filePath:");
                        LIZ3.append(LJFF.getAbsolutePath());
                        C0NB.LJ("Gecko_Resource_Loader", X1D.LIZIZ(LIZ3));
                        return;
                    }
                    W5I.LIZ().LJIIL(W5O.LIZ(android.net.Uri.fromFile(LJFF)), C15380j0.LIZLLL());
                    return;
                }
                String str6 = str;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = str2;
                if (str7 != null) {
                    str4 = str7;
                }
                C15490jB.LJIJI(C15510jD.LIZLLL(str6, str4));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ3;
                try {
                    LIZ();
                } finally {
                    if (LIZ3) {
                    }
                }
            }
        });
    }

    public static final void LIZLLL(View view, String str, EnumC78722Uv0 enumC78722Uv0) {
        if (view == null || TextUtils.isEmpty(str) || TextUtils.isEmpty("ttlive_bg_anchor_linkmic.png")) {
            return;
        }
        String LJIIJJI = C15510jD.LJIIJJI(str, "ttlive_bg_anchor_linkmic.png");
        if (!TextUtils.isEmpty(LJIIJJI)) {
            File file = new File(LJIIJJI);
            if (file.exists()) {
                C78720Uuy LJIIJ = C15650jR.LIZ().LJIIJ(file);
                LJIIJ.LJIJ = true;
                LJIIJ.LJIILJJIL = enumC78722Uv0;
                LJIIJ.LJIIJJI = null;
                LJIIJ.LJIIJJI(view);
                if ((view instanceof C41081jM) || !CCJ.LIZ(view.getContext())) {
                }
                view.setScaleX(-1.0f);
                return;
            }
        }
        String LIZIZ = C15510jD.LIZIZ(str, "ttlive_bg_anchor_linkmic.png");
        if (!TextUtils.isEmpty(LIZIZ)) {
            C78720Uuy url = C15650jR.LIZ().setUrl(LIZIZ);
            url.LJIJ = true;
            url.LJIILJJIL = enumC78722Uv0;
            url.LJIIJJI(view);
        } else {
            List<String> LJ = C15510jD.LJ(str, "ttlive_bg_anchor_linkmic.png");
            if (LJ == null || LJ.isEmpty()) {
                return;
            }
            C78720Uuy LIZ2 = C15650jR.LIZ().LIZ(LJ);
            LIZ2.LJIJ = true;
            LIZ2.LJIILJJIL = enumC78722Uv0;
            LIZ2.LJIIJJI(view);
        }
        if (view instanceof C41081jM) {
        }
    }

    public static final void LJ(View view, String str, String str2) {
        LJFF(view, str, str2, ImageView.ScaleType.CENTER_CROP, null);
    }

    public static final void LJIIIIZZ(C29701Eo c29701Eo, String channel, String fileName) {
        kotlin.jvm.internal.o.LJIIIZ(channel, "channel");
        kotlin.jvm.internal.o.LJIIIZ(fileName, "fileName");
        LJIIL(c29701Eo, channel, fileName, "images", false, null, null, 96);
    }

    public static final void LJII(View view, List<String> list, ImageView.ScaleType scaleType, final InterfaceC75158Tec interfaceC75158Tec) {
        long nanoTime = System.nanoTime();
        if (list == null || list.isEmpty()) {
            if (interfaceC75158Tec != null) {
                interfaceC75158Tec.LJIILL(new IllegalArgumentException("loadGeckoImage，url is null"), "");
            }
            C15440j6.LIZJ(nanoTime, null, "loadGeckoImage，url is null", false);
            return;
        }
        if (view == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("loadGeckoImage，imageView is null,url:");
            LIZ2.append(list);
            LIZ2.append("[0]");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            if (interfaceC75158Tec != null) {
                interfaceC75158Tec.LJIILL(new IllegalArgumentException(LIZIZ), "");
            }
            C15440j6.LIZJ(nanoTime, "", LIZIZ, false);
            return;
        }
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        C78720Uuy LIZ3 = C15650jR.LIZ().LIZ(list);
        LIZ3.LJIJ = true;
        LIZ3.LJIJI = Boolean.FALSE;
        LIZ3.LIZLLL(scaleType);
        final long nanoTime2 = System.nanoTime();
        LIZ3.LJIIJJI = new InterfaceC75158Tec() { // from class: X.1UI
            @Override // X.InterfaceC75158Tec
            public final void LJ() {
                InterfaceC75158Tec interfaceC75158Tec2 = InterfaceC75158Tec.this;
                if (interfaceC75158Tec2 != null) {
                    interfaceC75158Tec2.LJ();
                }
            }

            @Override // X.InterfaceC75158Tec
            public final void LJFF(Animatable animatable) {
                kotlin.jvm.internal.o.LJIIIZ(animatable, "animatable");
                InterfaceC75158Tec interfaceC75158Tec2 = InterfaceC75158Tec.this;
                if (interfaceC75158Tec2 != null) {
                    interfaceC75158Tec2.LJFF(animatable);
                }
            }

            @Override // X.InterfaceC75158Tec
            public final void LJIILL(Exception exc, String str) {
                InterfaceC75158Tec interfaceC75158Tec2 = InterfaceC75158Tec.this;
                if (interfaceC75158Tec2 != null) {
                    interfaceC75158Tec2.LJIILL(exc, str);
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onLoadFailed,imageUrl:");
                LIZ4.append(str);
                LIZ4.append(",exception:");
                LIZ4.append(exc);
                C15440j6.LIZJ(nanoTime2, str, X1D.LIZIZ(LIZ4), false);
            }

            @Override // X.InterfaceC75158Tec
            public final void LJIILJJIL(int i, int i2, String str) {
                InterfaceC75158Tec interfaceC75158Tec2 = InterfaceC75158Tec.this;
                if (interfaceC75158Tec2 != null) {
                    interfaceC75158Tec2.LJIILJJIL(i, i2, str);
                }
                StringBuilder LJ = AnonymousClass028.LJ("onLoadSuccess,imageUrl:", str, ",width:", i, ",height:");
                LJ.append(i2);
                C15440j6.LIZJ(nanoTime2, str, X1D.LIZIZ(LJ), true);
            }
        };
        LIZ3.LJIIJJI(view);
        if ((view instanceof C41081jM) && CCJ.LIZ(view.getContext())) {
            view.setScaleX(-1.0f);
        }
    }

    public static final void LJIIJ(C29701Eo c29701Eo, String channel, String fileName, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(channel, "channel");
        kotlin.jvm.internal.o.LJIIIZ(fileName, "fileName");
        LJIIL(c29701Eo, channel, fileName, "images", z, null, null, 96);
    }

    public static final boolean LJIILIIL(final C29701Eo c29701Eo, final String assetPath, final boolean z, final InterfaceC88472Yns<? super C0GY, C76800UCe> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(assetPath, "assetPath");
        final long nanoTime = System.nanoTime();
        if (c29701Eo == null) {
            C15440j6.LIZJ(nanoTime, assetPath, i0.LJFF("loadGeckoLottieAsset,animView is null,assetPath:", assetPath), false);
            return false;
        }
        if (TextUtils.isEmpty(assetPath)) {
            C15440j6.LIZJ(nanoTime, assetPath, "loadGeckoLottieAsset,assetPath is null", false);
            return false;
        }
        final C34K c34k = new C34K();
        c34k.element = true;
        try {
            C0GU<C0GY> LIZ2 = C04650Gf.LIZ(null, new CallableC04720Gm(new ZipInputStream(C15380j0.LIZLLL().getAssets().open(assetPath))));
            LIZ2.LIZIZ(new InterfaceC04760Gq() { // from class: X.1UJ
                @Override // X.InterfaceC04760Gq
                public final void onResult(Object obj) {
                    C0GY c0gy = (C0GY) obj;
                    if (c0gy != null) {
                        InterfaceC88472Yns<C0GY, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(c0gy);
                        }
                        c29701Eo.setComposition(c0gy);
                        if (z) {
                            c29701Eo.playAnimation();
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("loadGeckoLottieAsset success,assetPath:");
                        LIZ3.append(assetPath);
                        String LIZIZ = X1D.LIZIZ(LIZ3);
                        C15440j6.LIZJ(nanoTime, assetPath, LIZIZ, true);
                    }
                }
            });
            LIZ2.LIZ(new InterfaceC04760Gq() { // from class: X.1UK
                @Override // X.InterfaceC04760Gq
                public final void onResult(Object obj) {
                    C34K.this.element = false;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("loadGeckoLottieZipUrl fail,assetPath:");
                    LIZ3.append(assetPath);
                    LIZ3.append(",e:");
                    LIZ3.append(obj);
                    String LIZIZ = X1D.LIZIZ(LIZ3);
                    C15440j6.LIZJ(nanoTime, assetPath, LIZIZ, false);
                }
            });
        } catch (Exception unused) {
            c34k.element = false;
            C15440j6.LIZJ(nanoTime, assetPath, i0.LJFF("loadGeckoLottieAsset exception,assetPath:", assetPath), false);
        }
        return c34k.element;
    }

    public static final boolean LJIILJJIL(final C29701Eo c29701Eo, final File file, final boolean z, final InterfaceC88472Yns<? super C0GY, C76800UCe> interfaceC88472Yns) {
        final long nanoTime = System.nanoTime();
        if (c29701Eo == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("animView is null,path:");
            LIZ2.append(file.getAbsolutePath());
            C15440j6.LIZJ(nanoTime, file.getAbsolutePath(), X1D.LIZIZ(LIZ2), false);
            return false;
        }
        if (!file.exists()) {
            C15440j6.LIZJ(nanoTime, file.getAbsolutePath(), "animView load file is not exists", false);
            return false;
        }
        final C34K c34k = new C34K();
        c34k.element = true;
        try {
            C0GU<C0GY> LIZ3 = C04650Gf.LIZ(null, new CallableC04720Gm(new ZipInputStream(new FileInputStream(file))));
            LIZ3.LIZIZ(new InterfaceC04760Gq() { // from class: X.1UL
                @Override // X.InterfaceC04760Gq
                public final void onResult(Object obj) {
                    C0GY c0gy = (C0GY) obj;
                    if (c0gy != null) {
                        InterfaceC88472Yns<C0GY, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(c0gy);
                        }
                        c29701Eo.setComposition(c0gy);
                        if (z) {
                            c29701Eo.playAnimation();
                        }
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("load lottie success,path:");
                        LIZ4.append(file.getAbsolutePath());
                        String LIZIZ = X1D.LIZIZ(LIZ4);
                        C15440j6.LIZJ(nanoTime, file.getAbsolutePath(), LIZIZ, true);
                    }
                }
            });
            LIZ3.LIZ(new InterfaceC04760Gq() { // from class: X.1UM
                @Override // X.InterfaceC04760Gq
                public final void onResult(Object obj) {
                    C34K.this.element = false;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("loadGeckoLottieZipUrl fail,path:");
                    LIZ4.append(file.getAbsolutePath());
                    LIZ4.append(",e:");
                    LIZ4.append(obj);
                    String LIZIZ = X1D.LIZIZ(LIZ4);
                    C15440j6.LIZJ(nanoTime, file.getAbsolutePath(), LIZIZ, false);
                }
            });
        } catch (Exception e) {
            c34k.element = false;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("load lottie exception,path:");
            LIZ4.append(file.getAbsolutePath());
            LIZ4.append(",e:");
            LIZ4.append(e);
            C15440j6.LIZJ(nanoTime, file.getAbsolutePath(), X1D.LIZIZ(LIZ4), true);
        }
        return c34k.element;
    }

    public static final boolean LJIILL(final C29701Eo c29701Eo, final List<String> lottieZipUrls, final boolean z, final InterfaceC88472Yns<? super C0GY, C76800UCe> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(lottieZipUrls, "lottieZipUrls");
        final long nanoTime = System.nanoTime();
        if (lottieZipUrls.isEmpty()) {
            C15440j6.LIZJ(nanoTime, null, "loadGeckoLottieZipUrl,url is null", false);
            return false;
        }
        if (c29701Eo == null || c29701Eo.getContext() == null) {
            C15440j6.LIZJ(nanoTime, (String) ListProtector.get(lottieZipUrls, 0), "loadGeckoLottieZipUrl,animView is null", false);
            return false;
        }
        try {
            C0GU<C0GY> LJIIIZ = C04650Gf.LJIIIZ(c29701Eo.getContext(), (String) ListProtector.get(lottieZipUrls, 0));
            LJIIIZ.LIZIZ(new InterfaceC04760Gq() { // from class: X.1UN
                @Override // X.InterfaceC04760Gq
                public final void onResult(Object obj) {
                    C0GY c0gy = (C0GY) obj;
                    if (c0gy != null) {
                        InterfaceC88472Yns<C0GY, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(c0gy);
                        }
                        c29701Eo.setComposition(c0gy);
                        if (z) {
                            c29701Eo.playAnimation();
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("loadGeckoLottieZipUrl success,url:");
                        LIZ2.append(lottieZipUrls);
                        LIZ2.append("[0]");
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        C15440j6.LIZJ(nanoTime, (String) ListProtector.get(lottieZipUrls, 0), LIZIZ, true);
                    }
                }
            });
            LJIIIZ.LIZ(new InterfaceC04760Gq() { // from class: X.1UO
                @Override // X.InterfaceC04760Gq
                public final void onResult(Object obj) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("loadGeckoLottieZipUrl fail,url:");
                    LIZ2.append((String) ListProtector.get(lottieZipUrls, 0));
                    LIZ2.append(",e:");
                    LIZ2.append(obj);
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    C15440j6.LIZJ(nanoTime, (String) ListProtector.get(lottieZipUrls, 0), LIZIZ, false);
                }
            });
            return true;
        } catch (Exception unused) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("loadGeckoLottieZipUrl exception,lottieZipUrl:");
            LIZ2.append((String) ListProtector.get(lottieZipUrls, 0));
            C15440j6.LIZJ(nanoTime, (String) ListProtector.get(lottieZipUrls, 0), X1D.LIZIZ(LIZ2), false);
            return false;
        }
    }

    public static final void LJIILLIIL(View view, String str, String str2, Runnable runnable) {
        LJIIZILJ(view, str, str2, false, 0, runnable);
    }

    public static final void LJFF(View view, String str, String str2, ImageView.ScaleType scaleType, InterfaceC75158Tec interfaceC75158Tec) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        LJII(view, C15510jD.LJIIJ(str, str2), scaleType, interfaceC75158Tec);
    }

    public static final void LJIIJJI(C29701Eo c29701Eo, String channel, String fileName, boolean z, InterfaceC15710jX interfaceC15710jX) {
        kotlin.jvm.internal.o.LJIIIZ(channel, "channel");
        kotlin.jvm.internal.o.LJIIIZ(fileName, "fileName");
        LJIIL(c29701Eo, channel, fileName, "images", z, interfaceC15710jX, null, 64);
    }

    public static final void LJIIZILJ(View view, String str, String str2, boolean z, int i, Runnable runnable) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z2 = z;
        long nanoTime = System.nanoTime();
        if (view == null) {
            C15440j6.LIZJ(nanoTime, "", C0ON.LIZJ("loadGeckoNinePatchImage，view is null,channel:", str, ",fileName:", str2), false);
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C15440j6.LIZJ(nanoTime, "", UPJ.LIZIZ("loadGeckoNinePatchImage，channel:", str, ",fileName:", str2, ",can not get resource url"), false);
            return;
        }
        if ((view instanceof C41081jM) && CCJ.LIZ(view.getContext())) {
            z2 = true;
        }
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if (!TextUtils.isEmpty(C15510jD.LIZ(str3, str4))) {
            AbstractC73672Svk.LJJIJIL(0).LJJL(T16.LIZ()).LJJIJL(new C31676Cbw(str, str2)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S0211000_5(view, z2, runnable, 2), new InterfaceC64592gB() { // from class: X.3CW
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    C0NB.LJIIJ(6, "NinePatchUtil", ((Throwable) obj).getStackTrace());
                }
            });
            return;
        }
        if (str == null) {
            str5 = "";
        } else {
            str5 = str;
        }
        if (str2 == null) {
            str6 = "";
        } else {
            str6 = str2;
        }
        String LJIIJJI = C15510jD.LJIIJJI(str5, str6);
        if (!TextUtils.isEmpty(LJIIJJI) && C1B6.LIZIZ(LJIIJJI)) {
            AbstractC73672Svk.LJJIJIL(0).LJJL(T16.LIZ()).LJJIJL(new IDhS0S1000000_1(LJIIJJI, 0)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S0211000_5(view, z2, i, runnable, 1), new InterfaceC64592gB() { // from class: X.3CV
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    C0NB.LJIIJ(6, "NinePatchUtil", ((Throwable) obj).getStackTrace());
                }
            });
            return;
        }
        if (str == null) {
            str7 = "";
        } else {
            str7 = str;
        }
        if (str2 == null) {
            str8 = "";
        } else {
            str8 = str2;
        }
        List<String> LJ = C15510jD.LJ(str7, str8);
        if (LJ == null || LJ.isEmpty()) {
            C15440j6.LIZJ(nanoTime, "", UPJ.LIZIZ("loadGeckoNinePatchImage，channel:", str, ",fileName:", str2, ",url is null,can url error"), false);
            return;
        }
        ImageModel imageModel = new ImageModel();
        imageModel.mUrls = LJ;
        C31674Cbu.LIZIZ(imageModel, view, z2, i, runnable);
    }

    public static final void LJIIIZ(C29701Eo c29701Eo, String channel, String fileName, String str, boolean z, InterfaceC15710jX interfaceC15710jX, InterfaceC88472Yns<? super C0GY, C76800UCe> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(channel, "channel");
        kotlin.jvm.internal.o.LJIIIZ(fileName, "fileName");
        long nanoTime = System.nanoTime();
        if (c29701Eo == null) {
            if (interfaceC15710jX != null) {
                interfaceC15710jX.onFinish(false);
            }
            C15440j6.LIZJ(nanoTime, "", C0ON.LIZJ("loadGeckoLottie,animView is null,channel:", channel, ",fileName:", fileName), false);
            return;
        }
        if (TextUtils.isEmpty(channel)) {
            if (interfaceC15710jX != null) {
                interfaceC15710jX.onFinish(false);
            }
            C15440j6.LIZJ(nanoTime, "", C0ON.LIZJ("loadGeckoLottie,channel is null,channel:", channel, ",fileName:", fileName), false);
            return;
        }
        if (TextUtils.isEmpty(fileName)) {
            if (interfaceC15710jX != null) {
                interfaceC15710jX.onFinish(false);
            }
            C15440j6.LIZJ(nanoTime, "", C0ON.LIZJ("loadGeckoLottie,fileName is null,channel:", channel, ",fileName:", fileName), false);
            return;
        }
        try {
            c29701Eo.setImageAssetsFolder(str);
            String LIZ2 = C15510jD.LIZ(channel, fileName);
            if (!TextUtils.isEmpty(LIZ2) && LJIILIIL(c29701Eo, LIZ2, z, interfaceC88472Yns)) {
                if (interfaceC15710jX != null) {
                    interfaceC15710jX.onFinish(true);
                    return;
                }
                return;
            }
            File LJFF = C15510jD.LJFF(channel, fileName);
            if (LJFF != null && LJFF.exists() && LJIILJJIL(c29701Eo, LJFF, z, interfaceC88472Yns)) {
                if (interfaceC15710jX != null) {
                    interfaceC15710jX.onFinish(true);
                }
            } else {
                boolean LJIILL = LJIILL(c29701Eo, C15510jD.LJ(channel, fileName), z, interfaceC88472Yns);
                if (interfaceC15710jX != null) {
                    interfaceC15710jX.onFinish(LJIILL);
                }
            }
        } catch (Exception e) {
            if (interfaceC15710jX != null) {
                interfaceC15710jX.onFinish(false);
            }
            StringBuilder LIZLLL = C06540Nm.LIZLLL("loadGeckoLottie,fileName is null,channel:", channel, ",fileName:", fileName, ",exception:");
            LIZLLL.append(e);
            C15440j6.LIZJ(nanoTime, "", X1D.LIZIZ(LIZLLL), false);
        }
    }

    public static /* synthetic */ void LJIIL(C29701Eo c29701Eo, String str, String str2, String str3, boolean z, InterfaceC15710jX interfaceC15710jX, InterfaceC88472Yns interfaceC88472Yns, int i) {
        InterfaceC15710jX interfaceC15710jX2 = interfaceC15710jX;
        InterfaceC88472Yns interfaceC88472Yns2 = null;
        if ((i & 32) != 0) {
            interfaceC15710jX2 = null;
        }
        if ((i & 64) == 0) {
            interfaceC88472Yns2 = interfaceC88472Yns;
        }
        LJIIIZ(c29701Eo, str, str2, str3, z, interfaceC15710jX2, interfaceC88472Yns2);
    }
}
