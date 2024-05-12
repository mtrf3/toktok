package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HyZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45819HyZ implements InterfaceC43955HMx {
    public final /* synthetic */ LocalMusicTabFragment LIZ;
    public final /* synthetic */ InterfaceC43955HMx LIZIZ;
    public final /* synthetic */ long LIZJ;

    @Override // X.InterfaceC43955HMx
    public final void onFailed(int i) {
        this.LIZ.Vl(new ArrayList(), false);
        HWH hwh = this.LIZ.LJZL;
        if (hwh != null) {
            hwh.dismiss();
        }
        InterfaceC43955HMx interfaceC43955HMx = this.LIZIZ;
        if (interfaceC43955HMx != null) {
            interfaceC43955HMx.onFailed(i);
        }
        C45820Hya.LIZJ(System.currentTimeMillis() - this.LIZJ, 0L, false, i, 0L);
    }

    @Override // X.InterfaceC43955HMx
    public final void onSuccess(List<? extends MusicModel> musicList) {
        long j;
        o.LJIIIZ(musicList, "musicList");
        this.LIZ.Vl(musicList, true);
        HWH hwh = this.LIZ.LJZL;
        if (hwh != null) {
            hwh.dismiss();
        }
        InterfaceC43955HMx interfaceC43955HMx = this.LIZIZ;
        if (interfaceC43955HMx != null) {
            interfaceC43955HMx.onSuccess(musicList);
        }
        File file = new File(AVExternalServiceImpl.LIZ().infoService().getExtractMusicAudioDir());
        File file2 = new File(AVExternalServiceImpl.LIZ().infoService().getExtractMusicThumbDir());
        long currentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles != null) {
            j = 0;
            for (File file3 : listFiles) {
                j += file3.length();
            }
        } else {
            j = 0;
        }
        long j3 = 1024;
        long j4 = j / j3;
        File[] listFiles2 = file2.listFiles();
        if (listFiles2 != null) {
            for (File file4 : listFiles2) {
                j2 += file4.length();
            }
        }
        C45820Hya.LIZJ(currentTimeMillis, j4, true, 0, j2 / j3);
    }

    public C45819HyZ(LocalMusicTabFragment localMusicTabFragment, C84985XWz c84985XWz, long j) {
        this.LIZ = localMusicTabFragment;
        this.LIZIZ = c84985XWz;
        this.LIZJ = j;
    }
}
