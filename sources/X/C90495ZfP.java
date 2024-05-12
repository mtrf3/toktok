package X;

import Y.IDRunnableS86S0100000_24;
import android.os.Bundle;
import android.os.Message;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.ble.BleUtils;
import com.byted.cast.common.utils.DLNAOptionUtils;

/* renamed from: X.ZfP, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90495ZfP {
    public final ContextManager.CastContext LIZ;
    public final C90777Zjx LIZIZ;
    public final C90467Zex LIZJ;
    public final C90498ZfS LIZLLL;
    public final C90414Ze6 LJ;
    public final C90416Ze8 LJFF;

    public final void LIZIZ() {
        if (!this.LJ.LJI && DLNAOptionUtils.isEnableDeviceOffline(this.LIZ)) {
            C90414Ze6 c90414Ze6 = this.LJ;
            c90414Ze6.LJ = new C90492ZfM(this);
            c90414Ze6.LJFF = new C90493ZfN(this);
            c90414Ze6.LIZLLL.i("BDLinkServiceDetector", "startDetect");
            if (c90414Ze6.LJI) {
                c90414Ze6.LIZLLL.w("BDLinkServiceDetector", "has started");
            } else {
                c90414Ze6.LJI = true;
                long bdlinkDeviceOfflineDetectInterval = DLNAOptionUtils.getBdlinkDeviceOfflineDetectInterval(c90414Ze6.LIZJ);
                c90414Ze6.LIZIZ.removeMessages(1);
                c90414Ze6.LIZIZ.sendEmptyMessageDelayed(1, bdlinkDeviceOfflineDetectInterval);
            }
        }
        if (!this.LJFF.LJIIIIZZ && DLNAOptionUtils.isEnableBdlinkDiskCache(this.LIZ)) {
            this.LJFF.LJI = new C90494ZfO(this);
            C90831Zkp c90831Zkp = new C90831Zkp(this);
            this.LIZIZ.LJIILL = c90831Zkp;
            this.LIZJ.getClass();
            ICastSource iCastSource = this.LIZLLL.LIZJ;
            if (iCastSource != null) {
                iCastSource.setSsdpWriteCacheListener(c90831Zkp);
            }
            C90416Ze8 c90416Ze8 = this.LJFF;
            if (c90416Ze8.LJIIIIZZ) {
                c90416Ze8.LIZJ.w("BDLinkServiceDiskCacheHelper", "hasReadCache");
            } else {
                c90416Ze8.LIZJ.i("BDLinkServiceDiskCacheHelper", "readCache");
                c90416Ze8.LJIIIIZZ = true;
                c90416Ze8.LJFF.removeMessages(1);
                c90416Ze8.LJFF.sendEmptyMessage(1);
            }
        }
        C90416Ze8 c90416Ze82 = this.LJFF;
        c90416Ze82.LIZJ.i("BDLinkServiceDiskCacheHelper", "startCheck");
        long currentTimeMillis = System.currentTimeMillis() - c90416Ze82.LJIIIZ;
        if (currentTimeMillis < C90416Ze8.LJIIL) {
            CastLogger castLogger = c90416Ze82.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ignore this detect, because detect interval is ");
            LIZ.append(currentTimeMillis);
            LIZ.append(", less than ");
            LIZ.append(C90416Ze8.LJIIL);
            castLogger.i("BDLinkServiceDiskCacheHelper", X1D.LIZIZ(LIZ));
        } else {
            c90416Ze82.LJIIIZ = System.currentTimeMillis();
            c90416Ze82.LJFF.removeMessages(2);
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putLong("msg.key.start_check_time", c90416Ze82.LJIIIZ);
            obtain.setData(bundle);
            c90416Ze82.LJFF.sendMessage(obtain);
        }
        C90777Zjx c90777Zjx = this.LIZIZ;
        if (c90777Zjx != null) {
            c90777Zjx.LJFF();
        }
        C90467Zex c90467Zex = this.LIZJ;
        if (c90467Zex != null) {
            synchronized (c90467Zex) {
                c90467Zex.LJIIJJI.i("BleClient", "start ble scan");
                if (!c90467Zex.LIZ()) {
                    c90467Zex.LJIIJJI.w("BleClient", "can not browse");
                    ContextManager.CastContext castContext = c90467Zex.LJIIIZ;
                    if (castContext == null) {
                        BleUtils.setBleBrowse(false);
                    } else {
                        castContext.setBleBrowse(false);
                    }
                } else if (c90467Zex.LJ) {
                    c90467Zex.LJIIJJI.w("BleClient", "is scanning");
                } else if (!BleUtils.isBleDynamicPermissionsGranted(c90467Zex.LJI)) {
                    c90467Zex.LJIIJJI.w("BleClient", "ble dynamic permission is not granted");
                } else {
                    c90467Zex.LJ = true;
                    ContextManager.CastContext castContext2 = c90467Zex.LJIIIZ;
                    if (castContext2 == null) {
                        BleUtils.setBleBrowse(true);
                    } else {
                        castContext2.setBleBrowse(true);
                    }
                    c90467Zex.LJFF = c90467Zex.LIZLLL.getBluetoothLeScanner();
                    c90467Zex.LJI();
                }
            }
        }
        C90498ZfS c90498ZfS = this.LIZLLL;
        if (!DLNAOptionUtils.isEnableSsdpSearch(c90498ZfS.LIZ)) {
            c90498ZfS.LIZIZ.d(C90498ZfS.LJ, "startBrowse ssdp search is not open");
            return;
        }
        ICastSource iCastSource2 = c90498ZfS.LIZJ;
        if (iCastSource2 == null) {
            return;
        }
        iCastSource2.startSsdpBrowse();
    }

    public final void LIZJ() {
        C90777Zjx c90777Zjx = this.LIZIZ;
        if (c90777Zjx != null) {
            c90777Zjx.LJI();
        }
        C90467Zex c90467Zex = this.LIZJ;
        if (c90467Zex != null) {
            synchronized (c90467Zex) {
                c90467Zex.LJIIJJI.i("BleClient", "stopBrowse");
                c90467Zex.LJII = true;
                c90467Zex.LJIIIIZZ = true;
                if (!c90467Zex.LIZ()) {
                    c90467Zex.LJIIJJI.w("BleClient", "can not browse");
                } else {
                    if (!c90467Zex.LJ) {
                        c90467Zex.LJIIJJI.w("BleClient", "is not scanning");
                    }
                    c90467Zex.LIZ.postDelayed(new IDRunnableS86S0100000_24(c90467Zex, 26), 0);
                }
            }
        }
        C90498ZfS c90498ZfS = this.LIZLLL;
        if (!DLNAOptionUtils.isEnableSsdpSearch(c90498ZfS.LIZ)) {
            c90498ZfS.LIZIZ.d(C90498ZfS.LJ, "stopBrowse ssdp search is not open");
            return;
        }
        ICastSource iCastSource = c90498ZfS.LIZJ;
        if (iCastSource == null) {
            return;
        }
        iCastSource.stopSsdpBrowse();
    }

    public final void LIZ(int i, Object... objArr) {
        C90777Zjx c90777Zjx = this.LIZIZ;
        if (c90777Zjx != null) {
            c90777Zjx.LJ(i, objArr);
        }
        C90467Zex c90467Zex = this.LIZJ;
        if (c90467Zex != null) {
            c90467Zex.LJFF(i, objArr);
        }
        this.LIZLLL.getClass();
    }

    public C90495ZfP(ContextManager.CastContext castContext, ICastSource iCastSource, ICastSource iCastSource2) {
        this.LIZ = castContext;
        this.LJFF = new C90416Ze8(castContext, iCastSource);
        this.LJ = new C90414Ze6(castContext, iCastSource);
        this.LIZIZ = new C90777Zjx(castContext, iCastSource, iCastSource2);
        this.LIZJ = new C90467Zex(castContext, iCastSource, iCastSource2);
        this.LIZLLL = new C90498ZfS(castContext, iCastSource, iCastSource2);
    }
}
