package X;

import Y.IDRunnableS29S0200000;
import Y.IDRunnableS4S1100000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.highlight.DownloadProgressDialog;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.g0;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.1cS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36801cS implements InterfaceC259510d {
    public DownloadProgressDialog LIZJ;
    public final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public final C259210a LIZIZ = new C259210a();
    public final AtomicInteger LIZLLL = new AtomicInteger(0);

    @Override // X.InterfaceC259510d
    public final void LIZ(ActivityC45651qj activityC45651qj, final GameLiveFragment gameLiveFragment) {
        boolean z;
        String str = gameLiveFragment.downloadUrl;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("downloadVideoAndSaveToDraft(). downloadUrl is null or empty. url=");
            C1EW.LIZLLL(LIZ, gameLiveFragment.downloadUrl, LIZ, "HighLightVideoOperateImpl");
            C78685UuP.LJJLI(0, 3, gameLiveFragment.fragmentIdStr, "download url is empty or null");
            return;
        }
        if (activityC45651qj == null) {
            C0NB.LJ("HighLightVideoOperateImpl", "downloadVideoAndSaveToDraft(). activity is null.");
            C78685UuP.LJJLI(0, 0, gameLiveFragment.fragmentIdStr, "activity is null");
            return;
        }
        C259210a c259210a = this.LIZIZ;
        String str2 = gameLiveFragment.downloadUrl;
        o.LJIIIIZZ(str2, "gameLiveFragment.downloadUrl");
        String str3 = gameLiveFragment.fragmentIdStr;
        o.LJIIIIZZ(str3, "gameLiveFragment.fragmentIdStr");
        c259210a.LIZJ(activityC45651qj, str2, ".mp4", str3, new C10Z() { // from class: X.1cR
            @Override // X.C10Z
            public final void onProgress(DownloadInfo entity) {
                o.LJIIIZ(entity, "entity");
            }

            @Override // X.C10Z
            public final void LIZ(int i) {
                if (C30922CBq.LIZIZ) {
                    QZP.LIZJ("downloadVideoAndSaveToDraft(). onDownloadStart. taskId=", i, "HighLightVideoOperateImpl");
                }
            }

            @Override // X.C10Z
            public final void LJFF(String str4, String fileName) {
                o.LJIIIZ(fileName, "fileName");
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("downloadVideoAndSaveToDraft(). onSuccess. savePath=");
                    LIZ2.append(str4);
                    LIZ2.append(", fileName=");
                    LIZ2.append(fileName);
                    C0NB.LJIIIZ("HighLightVideoOperateImpl", X1D.LIZIZ(LIZ2));
                }
                C36801cS.this.LIZ.post(new IDRunnableS4S1100000(gameLiveFragment, str4, 9));
            }

            @Override // X.C10Z
            public final void LIZIZ(int i, int i2, String errorMsg) {
                o.LJIIIZ(errorMsg, "errorMsg");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("downloadVideoAndSaveToDraft(). onFailure. errorType=");
                LIZ2.append(i);
                LIZ2.append(", failureCode=");
                LIZ2.append(i2);
                LIZ2.append(", errorMsg=");
                C1EW.LIZLLL(LIZ2, errorMsg, LIZ2, "HighLightVideoOperateImpl");
                C78685UuP.LJJLI(i, i2, gameLiveFragment.fragmentIdStr, errorMsg);
            }
        });
    }

    @Override // X.InterfaceC259510d
    public final void U0(Context context, String str, final String str2, String str3, final String str4, final String str5, final String str6, final String str7) {
        boolean z;
        C43588H8u.LIZLLL(str4, "fragmentId", str5, "replayRoomId", str6, "replayTitle", str7, "businessExtra");
        DownloadProgressDialog downloadProgressDialog = this.LIZJ;
        if (downloadProgressDialog != null) {
            downloadProgressDialog.dismiss();
        }
        DownloadProgressDialog downloadProgressDialog2 = new DownloadProgressDialog();
        this.LIZJ = downloadProgressDialog2;
        downloadProgressDialog2.LJLJI = new C0JH() { // from class: X.1cO
            @Override // X.C0JH
            public final void LIZ() {
                int i = C36801cS.this.LIZLLL.get();
                if (i != 0) {
                    C36801cS.this.LIZIZ.getClass();
                    Downloader.getInstance(C15380j0.LIZLLL()).cancel(i);
                }
            }
        };
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("downloadVideoAndJumpShortVideoEditPage(). downloadUrl is null or empty. url=");
            LIZ.append(str);
            C0NB.LJ("HighLightVideoOperateImpl", X1D.LIZIZ(LIZ));
            C78685UuP.LJJLIIIIJ(0, 3, "download url is empty or null", str2);
            return;
        }
        final ActivityC45651qj LJIILL = g0.LJIILL(context);
        if (LJIILL == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("downloadVideoAndJumpShortVideoEditPage(). activity is null. context=");
            LIZ2.append(context);
            C0NB.LJ("HighLightVideoOperateImpl", X1D.LIZIZ(LIZ2));
            C78685UuP.LJJLIIIIJ(0, 0, "activity is null", str2);
            return;
        }
        FragmentManager supportFragmentManager = LJIILL.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        DownloadProgressDialog downloadProgressDialog3 = this.LIZJ;
        if (downloadProgressDialog3 != null) {
            downloadProgressDialog3.show(supportFragmentManager, "DownloadHighLightProgressDialog");
        }
        this.LIZIZ.LIZJ(LJIILL, str, str3, str4, new C10Z() { // from class: X.1cP
            @Override // X.C10Z
            public final void LIZ(int i) {
                C36801cS.this.LIZLLL.set(i);
            }

            @Override // X.C10Z
            public final void onProgress(DownloadInfo entity) {
                o.LJIIIZ(entity, "entity");
                C36801cS c36801cS = C36801cS.this;
                c36801cS.LIZ.post(new IDRunnableS29S0200000(c36801cS, entity, 45));
            }

            @Override // X.C10Z
            public final void LJFF(final String str8, String fileName) {
                o.LJIIIZ(fileName, "fileName");
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("downloadVideoAndJumpShortVideoEditPage(). onSuccess. savePath=");
                    LIZ3.append(str8);
                    LIZ3.append(", fileName=");
                    LIZ3.append(fileName);
                    C0NB.LJIIIZ("HighLightVideoOperateImpl", X1D.LIZIZ(LIZ3));
                }
                final C36801cS c36801cS = C36801cS.this;
                Handler handler = c36801cS.LIZ;
                final ActivityC45651qj activityC45651qj = LJIILL;
                final String str9 = str2;
                final String str10 = str4;
                final String str11 = str5;
                final String str12 = str6;
                final String str13 = str7;
                handler.post(new Runnable() { // from class: X.10c
                    public final void LIZ() {
                        DownloadProgressDialog downloadProgressDialog4 = C36801cS.this.LIZJ;
                        if (downloadProgressDialog4 != null) {
                            downloadProgressDialog4.dismiss();
                        }
                        ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).Xl0(activityC45651qj, str8, str9, str10, str11, str12, CardStruct.IStatusCode.DEFAULT, str13);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ4;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ4) {
                            }
                        }
                    }
                });
                String shootWay = str2;
                o.LJIIIZ(shootWay, "shootWay");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("save_path", str8);
                linkedHashMap.put("file_name", fileName);
                linkedHashMap.put("shoot_way", shootWay);
                C0K2.LJII(0, O5Y.LJJL("ttlive_highlight_jump_edit_result"), linkedHashMap);
            }

            @Override // X.C10Z
            public final void LIZIZ(int i, int i2, String errorMsg) {
                o.LJIIIZ(errorMsg, "errorMsg");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("downloadVideoAndJumpShortVideoEditPage(). onFailure. errorType=");
                LIZ3.append(i);
                LIZ3.append(", failureCode=");
                LIZ3.append(i2);
                LIZ3.append(", errorMsg=");
                C1EW.LIZLLL(LIZ3, errorMsg, LIZ3, "HighLightVideoOperateImpl");
                C36801cS c36801cS = C36801cS.this;
                c36801cS.LIZ.post(new IDRunnableS85S0100000(c36801cS, 113));
                C78685UuP.LJJLIIIIJ(i, i2, errorMsg, str2);
            }
        });
    }
}
