package X;

import Y.ARunnableS27S0200000_8;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.mediakit.medialoader.LoaderEventInfo;
import com.ss.mediakit.medialoader.LoaderListener;

/* renamed from: X.IeO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47116IeO implements LoaderListener {
    public final /* synthetic */ EnginePreloader LIZ;

    public C47116IeO(EnginePreloader enginePreloader) {
        this.LIZ = enginePreloader;
    }

    @Override // com.ss.mediakit.medialoader.LoaderListener
    public final void onLoaderTaskCancel(LoaderEventInfo loaderEventInfo) {
        C46982IcE.LJ.post(new ARunnableS27S0200000_8(this, loaderEventInfo, 44));
    }

    @Override // com.ss.mediakit.medialoader.LoaderListener
    public final void onLoaderTaskCompleted(LoaderEventInfo loaderEventInfo) {
        C46982IcE.LJ.post(new ARunnableS27S0200000_8(this, loaderEventInfo, 43));
    }

    @Override // com.ss.mediakit.medialoader.LoaderListener
    public final void onLoaderTaskStart(LoaderEventInfo loaderEventInfo) {
        C46982IcE.LJ.post(new ARunnableS27S0200000_8(this, loaderEventInfo, 42));
    }
}
