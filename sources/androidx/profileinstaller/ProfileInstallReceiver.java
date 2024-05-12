package androidx.profileinstaller;

import X.C027809a;
import X.C028109d;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.InterfaceC028009c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int LIZ = 0;

    public final void LIZ(Context context, Intent intent) {
        Bundle LLJJIJI;
        File LLIIIL;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            C028109d.LIZIZ(context, new Executor() { // from class: X.0uT
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new InterfaceC028009c() { // from class: X.1BQ
                @Override // X.InterfaceC028009c
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC028009c
                public final void LJ(int i, Object obj) {
                    ProfileInstallReceiver.this.setResultCode(i);
                }
            }, true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle LLJJIJI2 = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI2 == null) {
                return;
            }
            String string = LLJJIJI2.getString("EXTRA_SKIP_FILE_OPERATION");
            if ("WRITE_SKIP_FILE".equals(string)) {
                InterfaceC028009c interfaceC028009c = new InterfaceC028009c() { // from class: X.1BQ
                    @Override // X.InterfaceC028009c
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC028009c
                    public final void LJ(int i, Object obj) {
                        ProfileInstallReceiver.this.setResultCode(i);
                    }
                };
                try {
                    C028109d.LIZ(C16880lQ.LLLLLLZ(context.getPackageManager(), C16880lQ.LLLLL(context).getPackageName(), 0), C16880lQ.LLIIJLIL(context));
                    interfaceC028009c.LJ(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    interfaceC028009c.LJ(7, e);
                    return;
                }
            }
            if (!"DELETE_SKIP_FILE".equals(string)) {
                return;
            }
            InterfaceC028009c interfaceC028009c2 = new InterfaceC028009c() { // from class: X.1BQ
                @Override // X.InterfaceC028009c
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC028009c
                public final void LJ(int i, Object obj) {
                    ProfileInstallReceiver.this.setResultCode(i);
                }
            };
            C16880lQ.LLLZZIL(new File(C16880lQ.LLIIJLIL(context), "profileinstaller_profileWrittenFor_lastUpdateTime.dat"));
            interfaceC028009c2.LJ(11, null);
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            InterfaceC028009c interfaceC028009c3 = new InterfaceC028009c() { // from class: X.1BQ
                @Override // X.InterfaceC028009c
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC028009c
                public final void LJ(int i, Object obj) {
                    ProfileInstallReceiver.this.setResultCode(i);
                }
            };
            if (Build.VERSION.SDK_INT >= 24) {
                Process.sendSignal(Process.myPid(), 10);
                interfaceC028009c3.LJ(12, null);
                return;
            } else {
                interfaceC028009c3.LJ(13, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (LLJJIJI = C16880lQ.LLJJIJI(intent)) == null) {
            return;
        }
        String string2 = LLJJIJI.getString("EXTRA_BENCHMARK_OPERATION");
        InterfaceC028009c interfaceC028009c4 = new InterfaceC028009c() { // from class: X.1BQ
            @Override // X.InterfaceC028009c
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC028009c
            public final void LJ(int i, Object obj) {
                ProfileInstallReceiver.this.setResultCode(i);
            }
        };
        if ("DROP_SHADER_CACHE".equals(string2)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                LLIIIL = context.createDeviceProtectedStorageContext().getCodeCacheDir();
            } else if (i >= 23) {
                LLIIIL = context.getCodeCacheDir();
            } else {
                LLIIIL = C16880lQ.LLIIIL(context);
            }
            if (C027809a.LIZ(LLIIIL)) {
                interfaceC028009c4.LJ(14, null);
                return;
            } else {
                interfaceC028009c4.LJ(15, null);
                return;
            }
        }
        interfaceC028009c4.LJ(16, null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
