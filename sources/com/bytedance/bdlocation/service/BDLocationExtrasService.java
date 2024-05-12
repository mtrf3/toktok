package com.bytedance.bdlocation.service;

import X.X1D;
import android.content.Context;
import com.bytedance.bdlocation.api.IBPEALocal;
import com.bytedance.bdlocation.api.ICollectManager;
import com.bytedance.bdlocation.api.ILocate;
import com.bytedance.bdlocation.api.ILocationH3Core;
import com.bytedance.bdlocation.api.IManager;
import com.bytedance.bdlocation.api.IRegionDataCore;
import com.bytedance.bdlocation.api.ITraceRouteManager;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.provider.DefaultBpeaProvider;
import com.bytedance.bdlocation.provider.DefaultCollectProvider;
import com.bytedance.bdlocation.provider.DefaultLocationH3Core;
import com.bytedance.bdlocation.provider.DefaultRegionDataCore;
import com.bytedance.bdlocation.provider.DefaultTraceRouteProvider;

/* loaded from: classes16.dex */
public class BDLocationExtrasService {
    public static ILocate sAmapLocate;
    public static IBPEALocal sBPEAManager;
    public static ILocate sByteLocate;
    public static ICollectManager sCollectManager;
    public static ILocate sGmapLocate;
    public static ILocationH3Core sILocationH3Core;
    public static IRegionDataCore sIRegionDataCore;
    public static ILocate sMockLocate;
    public static ILocate sSysLocate;
    public static ITraceRouteManager sTraceRouteManager;

    public static synchronized IBPEALocal getBPEAManager() {
        IBPEALocal iBPEALocal;
        synchronized (BDLocationExtrasService.class) {
            if (sBPEAManager == null) {
                sBPEAManager = (IBPEALocal) getLocalManager(BDLocationConfig.getContext(), "com.bytedance.location_bpea.BPEAManager");
            }
            if (sBPEAManager == null) {
                sBPEAManager = (IBPEALocal) getLocalManager(BDLocationConfig.getContext(), "com.bytedance.syslocation.SysLocationManager");
            }
            if (sBPEAManager == null) {
                sBPEAManager = new DefaultBpeaProvider();
            }
            iBPEALocal = sBPEAManager;
        }
        return iBPEALocal;
    }

    public static synchronized ICollectManager getCollectManager() {
        ICollectManager iCollectManager;
        synchronized (BDLocationExtrasService.class) {
            if (sCollectManager == null) {
                sCollectManager = (ICollectManager) getLocalManager(BDLocationConfig.getContext(), "com.bytedance.location_collect.DataCollectManager");
            }
            if (sCollectManager == null) {
                sCollectManager = new DefaultCollectProvider();
            }
            iCollectManager = sCollectManager;
        }
        return iCollectManager;
    }

    public static synchronized ILocationH3Core getLocationH3Core() {
        ILocationH3Core iLocationH3Core;
        synchronized (BDLocationExtrasService.class) {
            if (sILocationH3Core == null) {
                sILocationH3Core = (ILocationH3Core) getLocalManager(BDLocationConfig.getContext(), "com.uber.h3core.BDLocationH3Core");
            }
            if (sILocationH3Core == null) {
                sILocationH3Core = new DefaultLocationH3Core();
            }
            iLocationH3Core = sILocationH3Core;
        }
        return iLocationH3Core;
    }

    public static synchronized IRegionDataCore getRegionDataCore() {
        IRegionDataCore iRegionDataCore;
        synchronized (BDLocationExtrasService.class) {
            if (sIRegionDataCore == null) {
                sIRegionDataCore = (IRegionDataCore) getLocalManager(BDLocationConfig.getContext(), "com.bytedance.region_data.RegionDataCore");
            }
            if (sIRegionDataCore == null) {
                sIRegionDataCore = new DefaultRegionDataCore();
            }
            iRegionDataCore = sIRegionDataCore;
        }
        return iRegionDataCore;
    }

    public static synchronized ITraceRouteManager getTraceRouteManager() {
        ITraceRouteManager iTraceRouteManager;
        synchronized (BDLocationExtrasService.class) {
            if (sTraceRouteManager == null) {
                sTraceRouteManager = (ITraceRouteManager) getLocalManager(BDLocationConfig.getContext(), "com.bytedance.bdlocation.traceroute.TraceRouterCore");
            }
            if (sTraceRouteManager == null) {
                sTraceRouteManager = new DefaultTraceRouteProvider();
            }
            iTraceRouteManager = sTraceRouteManager;
        }
        return iTraceRouteManager;
    }

    public static synchronized ILocate getAmapLocate(Context context) {
        ILocate iLocate;
        synchronized (BDLocationExtrasService.class) {
            if (sAmapLocate == null) {
                sAmapLocate = (ILocate) getLocalManager(context, "com.bytedance.bdlocation.amap.AMapLocationImpl");
            }
            iLocate = sAmapLocate;
        }
        return iLocate;
    }

    public static synchronized ILocate getByteLocate(Context context) {
        ILocate iLocate;
        synchronized (BDLocationExtrasService.class) {
            if (sByteLocate == null) {
                sByteLocate = (ILocate) getLocalManager(context, "com.bytedance.bdlocation.bytelocation.ByteLocationImpl");
            }
            iLocate = sByteLocate;
        }
        return iLocate;
    }

    public static synchronized ILocate getGmapLocate(Context context) {
        ILocate iLocate;
        synchronized (BDLocationExtrasService.class) {
            if (sGmapLocate == null) {
                sGmapLocate = (ILocate) getLocalManager(context, "com.bytedance.bdlocation.glocation.GoogleLocationImpl");
            }
            iLocate = sGmapLocate;
        }
        return iLocate;
    }

    public static synchronized ILocate getMockLocate(Context context) {
        ILocate iLocate;
        synchronized (BDLocationExtrasService.class) {
            if (sMockLocate == null) {
                sMockLocate = (ILocate) getLocalManager(context, "com.bytedance.bdlocation.locationmock.MockLocationImpl");
            }
            iLocate = sMockLocate;
        }
        return iLocate;
    }

    public static synchronized ILocate getSysLocate(Context context) {
        ILocate iLocate;
        synchronized (BDLocationExtrasService.class) {
            if (sSysLocate == null) {
                sSysLocate = (ILocate) getLocalManager(context, "com.bytedance.bdlocation.service.SystemBaseLocationImpl");
            }
            iLocate = sSysLocate;
        }
        return iLocate;
    }

    public static void setAmapLocate(ILocate iLocate) {
        sAmapLocate = iLocate;
    }

    public static void setBPEAManager(IBPEALocal iBPEALocal) {
        sBPEAManager = iBPEALocal;
    }

    public static void setByteLocate(ILocate iLocate) {
        sByteLocate = iLocate;
    }

    public static void setGmapLocate(ILocate iLocate) {
        sGmapLocate = iLocate;
    }

    public static IManager getLocalManager(Context context, String str) {
        IManager iManager;
        IManager iManager2 = null;
        try {
            iManager = (IManager) Class.forName(str).getConstructor(Context.class).newInstance(context);
        } catch (Throwable th) {
            th = th;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getLocalManager:");
            LIZ.append(str);
            Logger.d(X1D.LIZIZ(LIZ));
            return iManager;
        } catch (Throwable th2) {
            th = th2;
            iManager2 = iManager;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("BDLocationExtrasService getLocalManager error：");
            LIZ2.append(th.toString());
            Logger.i(X1D.LIZIZ(LIZ2));
            return iManager2;
        }
    }

    public static synchronized ILocate getLocate(Context context, int i) {
        ILocate sysLocate;
        synchronized (BDLocationExtrasService.class) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                sysLocate = null;
                            } else {
                                sysLocate = getMockLocate(context);
                            }
                        } else {
                            sysLocate = getByteLocate(context);
                        }
                    } else {
                        sysLocate = getGmapLocate(context);
                    }
                } else {
                    sysLocate = getAmapLocate(context);
                }
            } else {
                sysLocate = getSysLocate(context);
            }
        }
        return sysLocate;
    }
}
