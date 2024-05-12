package com.bytedance.forest.chain.fetchers;

import X.C00F;
import X.C06540Nm;
import X.C141335gf;
import X.C39930Flm;
import X.C3C5;
import X.C61026NxG;
import X.C61157NzN;
import X.C61278O3e;
import X.C61279O3f;
import X.C61280O3g;
import X.C61281O3h;
import X.C61287O3n;
import X.C61295O3v;
import X.C61511OCd;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.O4O;
import X.OSZ;
import X.X1D;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.model.Request;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GeckoFetcher extends ResourceFetcher {
    public static final C61281O3h Companion = new C61281O3h();

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeckoFetcher(Forest forest) {
        super(forest);
        o.LJIIJ(forest, "forest");
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(Request request, C61295O3v response) {
        o.LJIIJ(request, "request");
        o.LJIIJ(response, "response");
        C39930Flm.LIZ("GeckoFetcher", "start to fetchSync from gecko");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        fetchAsync(request, response, new AqS176S0100000_10(countDownLatch, 20));
        countDownLatch.await(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
    }

    private final long getChannelVersion(Request request, String str, C61157NzN c61157NzN) {
        request.getGeckoModel();
        return getForest().getGeckoXAdapter().getChannelVersion(c61157NzN.LIZ, str);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(Request request, C61295O3v response, InterfaceC88472Yns<? super C61295O3v, C76800UCe> callback) {
        boolean z;
        o.LJIIJ(request, "request");
        o.LJIIJ(response, "response");
        o.LJIIJ(callback, "callback");
        response.W(null, "gecko_total_start");
        C39930Flm.LIZ("GeckoFetcher", "start to fetchAsync from gecko");
        String str = request.getGeckoModel().LJLILLLLZI;
        String str2 = request.getGeckoModel().LJLJI;
        if (str.length() == 0 || str2.length() == 0) {
            response.LL.LIZIZ(3, "channel is empty for gecko");
            callback.invoke(response);
            return;
        }
        String str3 = request.getGeckoModel().LJLIL;
        if (str3.length() == 0) {
            C39930Flm.LJI("GeckoFetcher", "config accessKey not found, using default", false, 4);
        }
        C61157NzN LIZ = getForest().getConfig().LIZ(str3);
        if (LIZ == null) {
            C61287O3n c61287O3n = response.LL;
            c61287O3n.LIZJ = 9;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("can not find offline root path for access key ");
            LIZ2.append(str3);
            LIZ2.append(". ");
            LIZ2.append("Neither transmit related parameters of GeckoConfig in ForestConfig nor register access key to gecko sdk.");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            o.LJIIJ(LIZIZ, "<set-?>");
            c61287O3n.LJIIIIZZ = LIZIZ;
            callback.invoke(response);
            return;
        }
        String accessKey = LIZ.LIZ;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("accessKey=", accessKey, ", channel=", str, ", bundle=");
        LIZLLL.append(str2);
        C39930Flm.LIZ("GeckoFetcher", X1D.LIZIZ(LIZLLL));
        if (!((ConcurrentHashMap) C61511OCd.LIZ).isEmpty()) {
            response.LL.LJFF = Boolean.valueOf(C61511OCd.LJIIIZ(accessKey, str));
        }
        long channelVersion = getChannelVersion(request, str, LIZ);
        if (channelVersion != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean waitGeckoUpdate = request.getWaitGeckoUpdate();
        boolean disableGeckoUpdate = request.getDisableGeckoUpdate();
        boolean waitLowStorageUpdate = request.getWaitLowStorageUpdate();
        StringBuilder LIZLLL2 = C00F.LIZLLL("offline resource exist:", z, ", waitGeckoUpdate:", waitGeckoUpdate, ", ");
        LIZLLL2.append("disableGeckoUpdate:");
        LIZLLL2.append(disableGeckoUpdate);
        LIZLLL2.append(", waitLowStorageUpdate:");
        LIZLLL2.append(waitLowStorageUpdate);
        C39930Flm.LIZ("GeckoFetcher", X1D.LIZIZ(LIZLLL2));
        if (z) {
            if (disableGeckoUpdate) {
                loadGeckoFile(request, response, str, str2, true, Long.valueOf(channelVersion), callback, LIZ);
                return;
            }
            if (waitLowStorageUpdate) {
                o.LJIIJ(accessKey, "accessKey");
                if (C61280O3g.LIZ.containsKey(new OSZ(accessKey, str))) {
                    pullGeckoPackage$default(this, request, response, str, str2, callback, LIZ, true, false, 128, null);
                    return;
                } else {
                    loadGeckoFile(request, response, str, str2, true, Long.valueOf(channelVersion), callback, LIZ);
                    asyncCheckUpdate(true, str, request, waitGeckoUpdate, str2, false);
                    return;
                }
            }
            loadGeckoFile(request, response, str, str2, true, Long.valueOf(channelVersion), callback, LIZ);
            asyncCheckUpdate$default(this, true, str, request, waitGeckoUpdate, str2, false, 32, null);
            return;
        }
        if (disableGeckoUpdate) {
            C39930Flm.LIZJ("GeckoFetcher", "disable gecko update and no file exists", null, true);
            response.LL.LIZIZ(6, "disable gecko update and no file exists");
            callback.invoke(response);
        } else {
            if (waitGeckoUpdate) {
                if (C61026NxG.LIZ(request.getUrl())) {
                    pullGeckoPackage$default(this, request, response, str, str2, callback, LIZ, false, false, 192, null);
                    return;
                }
                o.LJIIJ(accessKey, "accessKey");
                if (C61280O3g.LIZ.containsKey(new OSZ(accessKey, str))) {
                    pullGeckoPackage$default(this, request, response, str, str2, callback, LIZ, true, false, 128, null);
                    return;
                } else {
                    pullGeckoPackage(request, response, str, str2, callback, LIZ, false, true);
                    return;
                }
            }
            loadGeckoFile(request, response, str, str2, true, Long.valueOf(channelVersion), callback, LIZ);
            asyncCheckUpdate(false, str, request, false, str2, false);
        }
    }

    private final File geckoLoadOfflineFile(String str, String str2, C61295O3v c61295O3v, C61157NzN c61157NzN) {
        String str3 = c61295O3v.LJZI.getGeckoModel().LJLIL;
        String geckoResourcePath = getForest().getGeckoXAdapter().getGeckoResourcePath(c61295O3v, str3, str, str2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("using gecko info [accessKey=");
        LIZ.append(str3);
        LIZ.append(",filePath=");
        LIZ.append(geckoResourcePath);
        LIZ.append(']');
        C39930Flm.LIZ("GeckoFetcher", X1D.LIZIZ(LIZ));
        if (geckoResourcePath == null || geckoResourcePath.length() == 0) {
            return null;
        }
        return new File(geckoResourcePath);
    }

    private final void asyncCheckUpdate(boolean z, String str, Request request, boolean z2, String str2, boolean z3) {
        boolean z4 = z3;
        if (!z) {
            z4 = false;
        }
        GeckoXAdapter.Companion.checkUpdate$default(GeckoXAdapter.Companion, getForest(), z, str, request, new C61279O3f(z2, str2), z4, false, 64, null);
    }

    private final void pullGeckoPackage(Request request, C61295O3v c61295O3v, String str, String str2, InterfaceC88472Yns<? super C61295O3v, C76800UCe> interfaceC88472Yns, C61157NzN c61157NzN, boolean z, boolean z2) {
        c61295O3v.W(null, "gecko_update_start");
        boolean onlyLocal = request.getOnlyLocal();
        if (onlyLocal) {
            c61295O3v.LL.LIZIZ(7, "gecko only local");
            interfaceC88472Yns.invoke(c61295O3v);
        }
        request.setUseInteraction(true);
        GeckoXAdapter.Companion.checkUpdate(getForest(), false, str, request, new C61278O3e(this, c61295O3v, request, str2, onlyLocal, interfaceC88472Yns, c61157NzN), z, z2);
    }

    public final void loadGeckoFile(Request request, C61295O3v c61295O3v, String str, String str2, boolean z, Long l, InterfaceC88472Yns<? super C61295O3v, C76800UCe> interfaceC88472Yns, C61157NzN c61157NzN) {
        long channelVersion;
        c61295O3v.W(null, "gecko_start");
        File geckoLoadOfflineFile = geckoLoadOfflineFile(str, str2, c61295O3v, c61157NzN);
        c61295O3v.W(null, "gecko_finish");
        if (geckoLoadOfflineFile != null && geckoLoadOfflineFile.exists()) {
            if (request.getCheckGeckoFileAvailable()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(geckoLoadOfflineFile);
                    if (fileInputStream.available() == 0) {
                        c61295O3v.LL.LIZIZ(8, "file available size =0");
                        interfaceC88472Yns.invoke(c61295O3v);
                        fileInputStream.close();
                        return;
                    }
                    fileInputStream.close();
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            c61295O3v.W(null, "gecko_total_finish");
            c61295O3v.LJZL = true;
            c61295O3v.X(new O4O(geckoLoadOfflineFile));
            c61295O3v.LLD = "gecko";
            if (c61295O3v.LLFFF == 0) {
                if (l != null) {
                    channelVersion = l.longValue();
                } else {
                    channelVersion = getChannelVersion(request, str, c61157NzN);
                }
                c61295O3v.LLFFF = channelVersion;
            }
            c61295O3v.LLFF = z;
            interfaceC88472Yns.invoke(c61295O3v);
            return;
        }
        if (request.getGeckoModel().LJLIL.length() == 0 && c61295O3v.LL.LJIIIIZZ.length() == 0) {
            c61295O3v.LL.LIZIZ(2, "Gecko accessKey invalid. Neither GeckoConfig in ForestConfig nor accessKey in RequestParams not transmitted and access key not registered to gecko sdk yet.");
        } else {
            C61287O3n c61287O3n = c61295O3v.LL;
            if (c61287O3n.LIZJ == 0) {
                c61287O3n.LIZIZ(6, "gecko File Not Found");
            }
        }
        interfaceC88472Yns.invoke(c61295O3v);
    }

    public static /* synthetic */ void asyncCheckUpdate$default(GeckoFetcher geckoFetcher, boolean z, String str, Request request, boolean z2, String str2, boolean z3, int i, Object obj) {
        if ((i & 32) != 0) {
            z3 = true;
        }
        geckoFetcher.asyncCheckUpdate(z, str, request, z2, str2, z3);
    }

    public static /* synthetic */ void loadGeckoFile$default(GeckoFetcher geckoFetcher, Request request, C61295O3v c61295O3v, String str, String str2, boolean z, Long l, InterfaceC88472Yns interfaceC88472Yns, C61157NzN c61157NzN, int i, Object obj) {
        if ((i & 32) != 0) {
            l = null;
        }
        geckoFetcher.loadGeckoFile(request, c61295O3v, str, str2, z, l, interfaceC88472Yns, c61157NzN);
    }

    public static /* synthetic */ void pullGeckoPackage$default(GeckoFetcher geckoFetcher, Request request, C61295O3v c61295O3v, String str, String str2, InterfaceC88472Yns interfaceC88472Yns, C61157NzN c61157NzN, boolean z, boolean z2, int i, Object obj) {
        if ((i & 64) != 0) {
            z = false;
        }
        if ((i & 128) != 0) {
            z2 = false;
        }
        geckoFetcher.pullGeckoPackage(request, c61295O3v, str, str2, interfaceC88472Yns, c61157NzN, z, z2);
    }
}
