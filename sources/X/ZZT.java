package X;

import android.content.Context;
import android.media.projection.MediaProjection;
import android.view.Surface;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.api.IConnectListener;
import com.byted.cast.common.api.IGetDeviceInfoListener;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.IPlayerListener;
import com.byted.cast.common.api.IRegisterResultListener;
import com.byted.cast.common.api.IResultListener;
import com.byted.cast.common.api.ISendResultListener;
import com.byted.cast.common.api.IServerListener;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.api.IWriteCacheListener;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.bean.DanmakuSetting;
import com.byted.cast.common.bean.DeviceInfo;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.bean.Resolution;
import com.byted.cast.common.bean.Speed;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.config.IMediaInfoListener;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ISinkDeviceInfoListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import java.util.List;

/* loaded from: classes29.dex */
public final /* synthetic */ class ZZT {
    public static void LIZ(ICastSource iCastSource, DramaBean[] dramaBeanArr, String str, IResultListener iResultListener) {
    }

    public static void LIZIZ(ICastSource iCastSource, Surface surface) {
    }

    public static void LIZJ(ICastSource iCastSource) {
    }

    public static void LIZLLL(ICastSource iCastSource, int i) {
    }

    public static void LJ(ICastSource iCastSource, DanmakuSetting danmakuSetting) {
    }

    public static void LJFF(ICastSource iCastSource, Resolution resolution) {
    }

    public static void LJI(ICastSource iCastSource, Speed speed) {
    }

    public static void LJII(ICastSource iCastSource) {
    }

    public static void LJIIIIZZ(ICastSource iCastSource, ServiceInfo serviceInfo) {
    }

    public static void LJIIIZ(ICastSource iCastSource) {
    }

    public static boolean LJIIJ(ICastSource iCastSource, ServiceInfo serviceInfo, int i, int i2) {
        return false;
    }

    public static boolean LJIIJJI(ICastSource iCastSource, ServiceInfo serviceInfo) {
        return false;
    }

    public static void LJIIL(ICastSource iCastSource) {
    }

    public static void LJIILIIL(ICastSource iCastSource, boolean z) {
    }

    public static void LJIILJJIL(ICastSource iCastSource, boolean z) {
    }

    public static void LJIILL(ICastSource iCastSource) {
    }

    public static ServiceInfo LJIILLIIL(ICastSource iCastSource) {
        return null;
    }

    public static void LJIIZILJ(ICastSource iCastSource, ServiceInfo serviceInfo, IGetDeviceInfoListener iGetDeviceInfoListener) {
    }

    public static String LJIJ(ICastSource iCastSource) {
        return null;
    }

    public static String LJIJI(ICastSource iCastSource) {
        return null;
    }

    public static String LJIJJ(ICastSource iCastSource) {
        return null;
    }

    public static String LJIJJLI(ICastSource iCastSource, String str, String str2) {
        return null;
    }

    public static void LJIL(ICastSource iCastSource, ServiceInfo serviceInfo) {
    }

    public static void LJJ(ICastSource iCastSource, ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener) {
    }

    public static Object LJJI(ICastSource iCastSource, int i, Object... objArr) {
        return null;
    }

    public static String LJJIFFI(ICastSource iCastSource) {
        return null;
    }

    public static ServiceInfo LJJII(ICastSource iCastSource) {
        return null;
    }

    public static void LJJIIJ(ICastSource iCastSource, ServiceInfo serviceInfo, ISinkDeviceInfoListener iSinkDeviceInfoListener) {
    }

    public static List LJJIIJZLJL(ICastSource iCastSource) {
        return null;
    }

    public static void LJJIIZI(ICastSource iCastSource, Context context, Config config, IInitListener iInitListener) {
    }

    public static void LJJIJ(ICastSource iCastSource, ServiceInfo serviceInfo) {
    }

    public static void LJJIJIIJI(ICastSource iCastSource) {
    }

    public static void LJJIJIIJIL(ICastSource iCastSource, ServiceInfo serviceInfo) {
    }

    public static void LJJIJIL(ICastSource iCastSource) {
    }

    public static boolean LJJIJL(ICastSource iCastSource, String str, int i) {
        return false;
    }

    public static void LJJIJLIJ(ICastSource iCastSource, PlayerInfo playerInfo) {
    }

    public static void LJJIL(ICastSource iCastSource, ServiceInfo serviceInfo, android.net.Uri uri, int i) {
    }

    public static void LJJIZ(ICastSource iCastSource, String str) {
    }

    public static void LJJJ(ICastSource iCastSource) {
    }

    public static void LJJJI(ICastSource iCastSource) {
    }

    public static void LJJJIL(ICastSource iCastSource, ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener) {
    }

    public static void LJJJJ(ICastSource iCastSource, Surface surface) {
    }

    public static void LJJJJI(ICastSource iCastSource) {
    }

    public static void LJJJJIZL(ICastSource iCastSource, long j, int i) {
    }

    public static void LJJJJJ(ICastSource iCastSource, ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener) {
    }

    public static void LJJJJJL(ICastSource iCastSource, int i, byte[] bArr, long j, long j2, long j3, long j4) {
    }

    public static String LJJJJL(ICastSource iCastSource, ServiceInfo serviceInfo, String str) {
        return "";
    }

    public static void LJJJJLI(ICastSource iCastSource, int i) {
    }

    public static void LJJJJLL(ICastSource iCastSource, int i) {
    }

    public static void LJJJJZ(ICastSource iCastSource, IConnectListener iConnectListener) {
    }

    public static void LJJJJZI(ICastSource iCastSource, ISurfaceListener iSurfaceListener) {
    }

    public static void LJJJLIIL(ICastSource iCastSource, ILibraryLoader iLibraryLoader) {
    }

    public static void LJJJLL(ICastSource iCastSource, ILogger iLogger) {
    }

    public static void LJJJLZIJ(ICastSource iCastSource, IMediaInfoListener iMediaInfoListener) {
    }

    public static void LJJJZ(ICastSource iCastSource, MediaProjection mediaProjection) {
    }

    public static void LJJL(ICastSource iCastSource, IMessageListener iMessageListener) {
    }

    public static void LJJLI(ICastSource iCastSource, MirrorInfo mirrorInfo) {
    }

    public static void LJJLIIIIJ(ICastSource iCastSource, IMirrorListener iMirrorListener) {
    }

    public static void LJJLIIIJ(ICastSource iCastSource, int i, Object... objArr) {
    }

    public static void LJJLIIIJILLIZJL(ICastSource iCastSource, IPlayerListener iPlayerListener) {
    }

    public static void LJJLIIIJJI(ICastSource iCastSource, com.byted.cast.common.source.IPlayerListener iPlayerListener) {
    }

    public static void LJJLIIIJJIZ(ICastSource iCastSource, String str) {
    }

    public static void LJJLIIIJL(ICastSource iCastSource, int i, IResultListener iResultListener) {
    }

    public static void LJJLIIIJLJLI(ICastSource iCastSource, PlayerInfo playerInfo) {
    }

    public static void LJJLIIIJLLLLLLLZ(ICastSource iCastSource, IServerListener iServerListener) {
    }

    public static void LJJLIIJ(ICastSource iCastSource, IBrowseListener iBrowseListener) {
    }

    public static void LJJLIL(ICastSource iCastSource, String str) {
    }

    public static void LJJLJ(ICastSource iCastSource, IWriteCacheListener iWriteCacheListener) {
    }

    public static void LJJLJLI(ICastSource iCastSource, int i) {
    }

    public static void LJJLL(ICastSource iCastSource, int i) {
    }

    public static void LJJZ(ICastSource iCastSource, MirrorInfo mirrorInfo) {
    }

    public static void LJJZZI(ICastSource iCastSource) {
    }

    public static void LJJZZIII(ICastSource iCastSource, String str) {
    }

    public static void LJL(ICastSource iCastSource) {
    }

    public static void LJLI(ICastSource iCastSource) {
    }

    public static void LJLIIIL(ICastSource iCastSource) {
    }

    public static void LJLIIL(ICastSource iCastSource) {
    }

    public static void LJLIL(ICastSource iCastSource) {
    }

    public static void LJLILLLLZI(ICastSource iCastSource) {
    }

    public static void LJLJI(ICastSource iCastSource) {
    }

    public static void LJLJJI(ICastSource iCastSource, ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener) {
    }

    public static Statistics LJJIIZ(ICastSource iCastSource) {
        return new Statistics();
    }

    public static DeviceInfo LJJIII(ICastSource iCastSource, String str, int i) {
        return new DeviceInfo();
    }
}
