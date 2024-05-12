package X;

import Y.IDRunnableS86S0100000_24;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.api.IResultListener;
import com.byted.cast.common.api.MediaAssetBean;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.bean.chromecast.MessageBean;
import com.byted.cast.common.source.ISinkDeviceInfoListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.utils.GsonUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Zfa, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90506Zfa {
    public static volatile java.util.Map<String, ZY4> LJJIJIIJI = new ConcurrentHashMap();
    public InterfaceC90501ZfV LIZ;
    public InterfaceC90502ZfW LIZIZ;
    public volatile boolean LIZJ;
    public ZY4 LIZLLL;
    public Context LJFF;
    public InterfaceC90503ZfX LJI;
    public ZYJ LJII;
    public C90613ZhJ LJIIIIZZ;
    public C90639Zhj LJIIIZ;
    public ZY5 LJIIJ;
    public C90836Zku LJIIJJI;
    public C90838Zkw LJIIL;
    public C90837Zkv LJIILIIL;
    public C90101ZXt LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public C90835Zkt LJIJ;
    public C90505ZfZ LJIJI;
    public final ContextManager.CastContext LJIJJ;
    public final CastLogger LJIJJLI;
    public final CastMonitor LJIL;
    public final TeaEventTrack LJJ;
    public volatile String[] LJJIFFI;
    public DramaBean[] LJJII;
    public ServiceInfo LJJIII;
    public JSONObject LJJIIJ;
    public String LJJIIJZLJL;
    public ISinkDeviceInfoListener LJJIIZ;
    public String LJJIIZI;
    public final java.util.Map<String, ZY4> LJ = new ConcurrentHashMap();
    public volatile boolean LJIIZILJ = true;
    public volatile int LJJI = 3;
    public volatile boolean LJJIJ = false;

    public final void LIZJ() {
        this.LJIJJLI.i("ChromeCastSourceImpl", "disConnect");
        if (!this.LJIIZILJ) {
            this.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
        } else {
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(this, 32));
        }
    }

    public final void LJII() {
        this.LJIJJLI.i("ChromeCastSourceImpl", "setupCastListener");
        Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(this, 28));
        C90505ZfZ c90505ZfZ = new C90505ZfZ(this);
        this.LJIJI = c90505ZfZ;
        ZYJ zyj = this.LJII;
        zyj.getClass();
        QH7.LJ("Must be called from the main thread.");
        ZYS zys = zyj.LIZJ;
        zys.getClass();
        try {
            zys.LIZ.LLJ(new BinderC90624ZhU(c90505ZfZ));
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = ZYS.LIZJ;
            C16880lQ.LJLLJ(InterfaceC90111ZYd.class);
            c90469Zez.getClass();
        }
        this.LJIJ = new C90835Zkt(this);
        this.LJII.LIZ().LIZ(this.LJIJ, C90613ZhJ.class);
        this.LJIIL = new C90838Zkw(this);
        this.LJIILIIL = new C90837Zkv(this);
    }

    public final void LJI() {
        Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(this, 27));
    }

    public C90506Zfa(ContextManager.CastContext castContext) {
        this.LJIJJ = castContext;
        this.LJIJJLI = ContextManager.getLogger(castContext);
        this.LJIL = ContextManager.getMonitor(castContext);
        this.LJJ = ContextManager.getTeaEventTrack(castContext);
    }

    public final int LIZLLL(String str) {
        String[] strArr = this.LJJIFFI;
        if (strArr != null && strArr.length != 0) {
            for (int i = 0; i < strArr.length; i++) {
                if (TextUtils.equals(str, strArr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final C90639Zhj LJ(IResultListener iResultListener) {
        this.LJIJJLI.i("ChromeCastSourceImpl", "getRemoteMediaClient.");
        if (this.LJIIIIZZ == null) {
            this.LJIJJLI.w("ChromeCastSourceImpl", "mCastSession is null.");
            if (iResultListener != null) {
                iResultListener.onFail(26300001, "no connection");
            }
            return null;
        }
        if (this.LJIIIZ == null) {
            this.LJIJJLI.i("ChromeCastSourceImpl", "set up remoteMediaClient.");
            C90639Zhj LJIIIIZZ = this.LJIIIIZZ.LJIIIIZZ();
            this.LJIIIZ = LJIIIIZZ;
            if (LJIIIIZZ == null) {
                this.LJIJJLI.w("ChromeCastSourceImpl", "mRemoteMediaClient is null.");
                return null;
            }
            C90838Zkw c90838Zkw = this.LJIIL;
            QH7.LJ("Must be called from the main thread.");
            if (c90838Zkw != null) {
                ((CopyOnWriteArrayList) LJIIIIZZ.LJII).add(c90838Zkw);
            }
            this.LJIIIZ.LIZIZ(this.LJIILIIL, 1000L);
        }
        if (iResultListener != null && this.LJIIIZ == null) {
            iResultListener.onFail(26300002, "no remote media client");
        }
        return this.LJIIIZ;
    }

    public final void LJIIIIZZ(final boolean z) {
        int i;
        this.LJIJJLI.i("ChromeCastSourceImpl", "swapDeviceInfo");
        final MessageBean messageBean = new MessageBean();
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        messageBean.type = i;
        String uuid = UUID.randomUUID().toString();
        this.LJJIIZI = uuid;
        messageBean.id = uuid;
        messageBean.content = GsonUtils.toJsonIgnoreException(ContextManager.getDeviceInfoManager(this.LJIJJ).getLocalDeviceInfo());
        Dispatcher.getInstance().runOnMainThread(new Runnable() { // from class: X.ZfY
            @Override // java.lang.Runnable
            public final void run() {
                String jsonIgnoreException;
                final C90506Zfa c90506Zfa = C90506Zfa.this;
                MessageBean messageBean2 = messageBean;
                boolean z2 = z;
                CastLogger castLogger = c90506Zfa.LJIJJLI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sendMessage messageBean:");
                LIZ.append(messageBean2);
                castLogger.i("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
                BasePendingResult basePendingResult = null;
                basePendingResult = null;
                if (c90506Zfa.LJIIIIZZ != null && (jsonIgnoreException = GsonUtils.toJsonIgnoreException(messageBean2)) != null) {
                    C90613ZhJ c90613ZhJ = c90506Zfa.LJIIIIZZ;
                    c90613ZhJ.getClass();
                    QH7.LJ("Must be called from the main thread.");
                    C90880Zlc c90880Zlc = c90613ZhJ.LJII;
                    if (c90880Zlc == null) {
                        Status status = new Status(17, null, null);
                        C67742QiI c67742QiI = new C67742QiI(C16880lQ.LLJJJJ());
                        c67742QiI.LIZ(status);
                        basePendingResult = c67742QiI;
                    } else {
                        C67646Qgk LJIIJJI = c90880Zlc.LJIIJJI("urn:x-cast:com.byted.cast.private.channel", jsonIgnoreException);
                        final C90892Zlo c90892Zlo = new C90892Zlo();
                        LJIIJJI.LJ(new InterfaceC67677QhF() { // from class: X.Zic
                            @Override // X.InterfaceC67677QhF
                            public final void onSuccess(Object obj) {
                                C90892Zlo.this.LIZ(new Status(0, null, null));
                            }
                        });
                        LJIIJJI.LJIILLIIL(new InterfaceC67679QhH() { // from class: X.ZiX
                            @Override // X.InterfaceC67679QhH
                            public final void onFailure(Exception exc) {
                                C90892Zlo c90892Zlo2 = C90892Zlo.this;
                                Status status2 = new Status(8, "unknown error");
                                if (exc instanceof ETK) {
                                    ETK etk = (ETK) exc;
                                    status2 = new Status(etk.getStatusCode(), etk.getMessage());
                                }
                                c90892Zlo2.LIZ(status2);
                            }
                        });
                        basePendingResult = c90892Zlo;
                    }
                }
                if (z2 && basePendingResult != null) {
                    InterfaceC67740QiG<? super R> interfaceC67740QiG = new InterfaceC67740QiG() { // from class: X.Zks
                        @Override // X.InterfaceC67740QiG
                        public final void LIZ(InterfaceC67754QiU interfaceC67754QiU) {
                            C90506Zfa c90506Zfa2 = C90506Zfa.this;
                            Status status2 = (Status) interfaceC67754QiU;
                            c90506Zfa2.getClass();
                            status2.getClass();
                            if (status2.zzc != Status.RESULT_SUCCESS.zzc && c90506Zfa2.LJJIIZ != null) {
                                CastLogger castLogger2 = c90506Zfa2.LJIJJLI;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("swapDeviceInfo setResultCallback :");
                                LIZ2.append(status2);
                                castLogger2.w("ChromeCastSourceImpl", X1D.LIZIZ(LIZ2));
                                c90506Zfa2.LJJIIZ.onFail(1702000002, "Network Communication Error");
                            }
                        }
                    };
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    synchronized (basePendingResult.LIZ) {
                        QH7.LJIIJ("Result has already been consumed.", !basePendingResult.LJIIIZ);
                        if (!basePendingResult.LJI()) {
                            if (basePendingResult.LJII()) {
                                basePendingResult.LIZIZ.LIZ(interfaceC67740QiG, basePendingResult.LJIIIZ());
                            } else {
                                basePendingResult.LJFF = interfaceC67740QiG;
                                Handler handler = basePendingResult.LIZIZ;
                                handler.sendMessageDelayed(handler.obtainMessage(2, basePendingResult), timeUnit.toMillis(5L));
                            }
                        }
                    }
                }
            }
        });
    }

    public static MediaInfo LIZ(MediaAssetBean mediaAssetBean, String str, int i) {
        int i2 = 3;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
            } else {
                i2 = 4;
            }
        }
        MediaMetadata mediaMetadata = new MediaMetadata(i2);
        if (mediaAssetBean != null) {
            String title = mediaAssetBean.getTitle();
            MediaMetadata.LJJJJZI(1, "com.google.android.gms.cast.metadata.TITLE");
            mediaMetadata.LJLIL.putString("com.google.android.gms.cast.metadata.TITLE", title);
            int width = mediaAssetBean.getWidth();
            MediaMetadata.LJJJJZI(2, "com.google.android.gms.cast.metadata.WIDTH");
            mediaMetadata.LJLIL.putInt("com.google.android.gms.cast.metadata.WIDTH", width);
            int height = mediaAssetBean.getHeight();
            MediaMetadata.LJJJJZI(2, "com.google.android.gms.cast.metadata.HEIGHT");
            mediaMetadata.LJLIL.putInt("com.google.android.gms.cast.metadata.HEIGHT", height);
            String artist = mediaAssetBean.getArtist();
            MediaMetadata.LJJJJZI(1, "com.google.android.gms.cast.metadata.ARTIST");
            mediaMetadata.LJLIL.putString("com.google.android.gms.cast.metadata.ARTIST", artist);
            String album = mediaAssetBean.getAlbum();
            MediaMetadata.LJJJJZI(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE");
            mediaMetadata.LJLIL.putString("com.google.android.gms.cast.metadata.ALBUM_TITLE", album);
            if (mediaAssetBean.getAlbumArtURI() != null) {
                mediaMetadata.zzd.add(new WebImage(UriProtector.parse(mediaAssetBean.getAlbumArtURI()), 0, 0));
            }
        }
        MediaInfo mediaInfo = new C90206Zak(str).LIZ;
        mediaInfo.zzt.LIZ.zzf = mediaMetadata;
        return mediaInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MediaQueueItem[] LIZIZ(DramaBean[] dramaBeanArr, int i, int i2) {
        try {
            this.LJIJJLI.i("ChromeCastSourceImpl", "buildMediaQueueItems.");
            if (dramaBeanArr == null || dramaBeanArr.length == 0) {
                this.LJIJJLI.w("ChromeCastSourceImpl", "dramaBeans is null.");
                return new MediaQueueItem[0];
            }
            this.LJJI = i;
            ArrayList arrayList = new ArrayList();
            String[] strArr = new String[dramaBeanArr.length];
            for (int i3 = 0; i3 < dramaBeanArr.length; i3++) {
                DramaBean dramaBean = dramaBeanArr[i3];
                if (dramaBean != null && dramaBean.getUrlBean() != null && dramaBean.getMediaAssetBean() != null && !TextUtils.isEmpty(dramaBean.getUrlBean().getUrl())) {
                    String dramaId = dramaBean.getDramaId();
                    strArr[i3] = dramaId;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("dramaId", dramaId);
                    jSONObject.put("connectId", this.LJJIIJZLJL);
                    jSONObject.put("urlBean", GsonUtils.toJsonIgnoreException(dramaBean.getUrlBean()));
                    jSONObject.put("dramaMediaAssetBean", GsonUtils.toJsonIgnoreException(dramaBean.getMediaAssetBean()));
                    MediaAssetBean mediaAssetBean = new MediaAssetBean();
                    mediaAssetBean.setTitle(dramaBean.getMediaAssetBean().getTitle());
                    mediaAssetBean.setAlbumArtURI(dramaBean.getMediaAssetBean().getAlbumArtURI());
                    mediaAssetBean.setArtist(dramaBean.getMediaAssetBean().getArtist());
                    mediaAssetBean.setAlbum(dramaBean.getMediaAssetBean().getAlbum());
                    mediaAssetBean.setHeight(dramaBean.getUrlBean().getHeight());
                    mediaAssetBean.setWidth(dramaBean.getUrlBean().getWidth());
                    C90212Zaq c90212Zaq = new C90212Zaq(LIZ(mediaAssetBean, dramaBean.getUrlBean().getUrl(), dramaBean.getMediaAssetBean().getMimeType()));
                    C90213Zar c90213Zar = c90212Zaq.LIZ.zzj;
                    c90213Zar.LIZ.zzd = true;
                    if (!Double.isNaN(20.0d)) {
                        c90213Zar.LIZ.zzg = 20.0d;
                        c90212Zaq.LIZ.zzj.LIZ.zzi = jSONObject;
                        arrayList.add(c90212Zaq.LIZ());
                    } else {
                        throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
                    }
                }
            }
            MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[arrayList.size()];
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                mediaQueueItemArr[i4] = ListProtector.get(arrayList, i4);
            }
            if (i2 < 0 || this.LJJIFFI == null) {
                this.LJJIFFI = strArr;
                this.LJJII = dramaBeanArr;
            } else if (i2 == 0) {
                LJIIIZ(this.LJJIFFI.length, strArr, dramaBeanArr);
            } else {
                LJIIIZ(i2 - 1, strArr, dramaBeanArr);
            }
            CastLogger castLogger = this.LJIJJLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("array: ");
            LIZ.append(Arrays.toString(mediaQueueItemArr));
            castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
            return mediaQueueItemArr;
        } catch (JSONException e) {
            this.LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            return new MediaQueueItem[0];
        }
    }

    public final void LJIIIZ(int i, String[] strArr, DramaBean[] dramaBeanArr) {
        CastLogger castLogger = this.LJIJJLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateDramaList before: ");
        LIZ.append(Arrays.toString(this.LJJIFFI));
        castLogger.i("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        String[] strArr2 = new String[this.LJJIFFI.length + strArr.length];
        System.arraycopy(this.LJJIFFI, 0, strArr2, 0, i);
        System.arraycopy(strArr, 0, strArr2, i, strArr.length);
        System.arraycopy(this.LJJIFFI, i, strArr2, strArr.length + i, this.LJJIFFI.length - i);
        this.LJJIFFI = strArr2;
        CastLogger castLogger2 = this.LJIJJLI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateDramaList after: ");
        LIZ2.append(Arrays.toString(this.LJJIFFI));
        castLogger2.i("ChromeCastSourceImpl", X1D.LIZIZ(LIZ2));
        DramaBean[] dramaBeanArr2 = this.LJJII;
        DramaBean[] dramaBeanArr3 = new DramaBean[dramaBeanArr2.length + dramaBeanArr.length];
        System.arraycopy(dramaBeanArr2, 0, dramaBeanArr3, 0, i);
        System.arraycopy(dramaBeanArr, 0, dramaBeanArr3, i, dramaBeanArr.length);
        DramaBean[] dramaBeanArr4 = this.LJJII;
        System.arraycopy(dramaBeanArr4, i, dramaBeanArr3, dramaBeanArr.length + i, dramaBeanArr4.length - i);
        this.LJJII = dramaBeanArr3;
    }

    public final void LJFF(long j, MediaAssetBean mediaAssetBean, String str, int i) {
        C90639Zhj LJ = LJ(null);
        if (LJ == null) {
            return;
        }
        this.LJJI = i;
        C90208Zam c90208Zam = new C90208Zam();
        c90208Zam.LIZ = LIZ(mediaAssetBean, str, i);
        c90208Zam.LIZJ = Boolean.TRUE;
        c90208Zam.LJI = this.LJJIIJ;
        c90208Zam.LIZLLL = j;
        MediaLoadRequestData LIZ = c90208Zam.LIZ();
        QH7.LJ("Must be called from the main thread.");
        if (!LJ.LJJIII()) {
            C90639Zhj.LJIJJLI();
        } else {
            C90639Zhj.LJJIIJ(new C90927ZmN(LJ, LIZ));
        }
    }
}
