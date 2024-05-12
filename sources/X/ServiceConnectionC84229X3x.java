package X;

import Y.ARunnableS34S0200000_15;
import Y.ARunnableS51S0100000_15;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;

/* renamed from: X.X3x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ServiceConnectionC84229X3x implements X3Y, ServiceConnection {
    public static boolean LJLJLJ;
    public static int LJLJLLL;
    public static long LJLL;
    public InterfaceC84230X3y LJLIL;
    public X3S LJLJJI;
    public Future<?> LJLJJLL;
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public InterfaceC84190X2k LJLJI = null;
    public final ARunnableS51S0100000_15 LJLJJL = new ARunnableS51S0100000_15(this, 132);
    public final CountDownLatch LJLJL = new CountDownLatch(1);

    @Override // X.InterfaceC84211X3f
    public final void LJLJI(int i) {
    }

    @Override // X.InterfaceC84211X3f
    public final java.util.Map<Long, C84234X4c> LLJI(int i) {
        return null;
    }

    @Override // X.InterfaceC84211X3f
    public final /* bridge */ /* synthetic */ List LLJJIII(int i) {
        return null;
    }

    @Override // X.InterfaceC84211X3f
    public final void LLZZJLIL() {
    }

    @Override // X.InterfaceC84211X3f
    public final void clearMemoryCacheData(double d) {
    }

    @Override // X.InterfaceC84211X3f
    public final boolean t(int i, java.util.Map<Long, C84234X4c> map) {
        return false;
    }

    @Override // X.InterfaceC84211X3f
    public final boolean LJJLIIIIJ() {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJJLIIIIJ();
            }
            return false;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final void clearData() {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                interfaceC84230X3y.clearData();
            }
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC84211X3f
    public final List<DownloadInfo> getAllDownloadInfo() {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.getAllDownloadInfo();
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final boolean isDownloadCacheSyncSuccess() {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.isDownloadCacheSyncSuccess();
            }
            return false;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public ServiceConnectionC84229X3x() {
        SqlDownloadCacheService.LIZ(C84212X3g.LJ(), this);
    }

    @Override // X.InterfaceC84211X3f
    public final boolean LJIIL(int i) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJIIL(i);
            }
            return false;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final void LJIILIIL(int i) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                interfaceC84230X3y.LJIILIIL(i);
            }
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC84211X3f
    public final boolean LJIILJJIL(int i) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJIILJJIL(i);
            }
            return false;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final void LJIJ(DownloadInfo downloadInfo) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                interfaceC84230X3y.LJIJ(downloadInfo);
            }
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJI(int i) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJJI(i);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJIJIIJI(int i) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJJIJIIJI(i);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJIL(int i) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJJIL(i);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJLIIIJJIZ(int i) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJJLIIIJJIZ(i);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo getDownloadInfo(int i) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.getDownloadInfo(i);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.getDownloadInfoList(str);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.getDownloadInfosByFileExtension(str);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.getSuccessedDownloadInfosWithMimeType(str);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.getUnCompletedDownloadInfosWithMimeType(str);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLIL = null;
        LJLJLJ = false;
    }

    @Override // X.InterfaceC84211X3f
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.updateDownloadInfo(downloadInfo);
            }
            return false;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJIJIL(int i, long j) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJJIJIL(i, j);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJJJLI(int i, long j) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJJJJLI(i, j);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJJLZIJ(int i, long j) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJJJLZIJ(i, j);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJLI(int i, long j) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJJLI(i, j);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC84230X3y c84188X2i;
        LJLJLJ = true;
        this.LJLILLLLZI.removeCallbacks(this.LJLJJL);
        if (iBinder == null) {
            c84188X2i = null;
        } else {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC84230X3y)) {
                    c84188X2i = (InterfaceC84230X3y) queryLocalInterface;
                } else {
                    c84188X2i = new C84188X2i(iBinder);
                }
            } catch (Throwable unused) {
            }
        }
        this.LJLIL = c84188X2i;
        this.LJLJJLL = C84212X3g.LJFF().submit(new ARunnableS34S0200000_15(iBinder, this, 69));
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJIL(int i, String str, String str2, long j) {
        try {
            InterfaceC84230X3y interfaceC84230X3y = this.LJLIL;
            if (interfaceC84230X3y != null) {
                return interfaceC84230X3y.LJIL(i, str, str2, j);
            }
            return null;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.X3Y
    public final void j(SparseArray sparseArray, HashMap hashMap, List list, List list2, C84225X3t c84225X3t) {
        C84212X3g.LJFF().submit(new X3W(this, sparseArray, hashMap, list, c84225X3t));
    }
}
