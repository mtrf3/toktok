package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.ImportDeviceSoundsFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XWn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84973XWn implements InterfaceC43955HMx {
    public final /* synthetic */ ImportDeviceSoundsFragment LIZ;

    public C84973XWn(ImportDeviceSoundsFragment importDeviceSoundsFragment) {
        this.LIZ = importDeviceSoundsFragment;
    }

    @Override // X.InterfaceC43955HMx
    public final void onFailed(int i) {
        C2VQ.LIZIZ(new AqS165S0100000_15(this.LIZ, 228), 0L);
        this.LIZ.Ml(new ArrayList(), false);
    }

    @Override // X.InterfaceC43955HMx
    public final void onSuccess(List<? extends MusicModel> musicList) {
        o.LJIIIZ(musicList, "musicList");
        C2VQ.LIZIZ(new AqS165S0100000_15(this.LIZ, 229), 0L);
        ImportDeviceSoundsFragment importDeviceSoundsFragment = this.LIZ;
        importDeviceSoundsFragment.LJLZ += 50;
        importDeviceSoundsFragment.Ml(musicList, true);
    }
}
