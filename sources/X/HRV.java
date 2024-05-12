package X;

import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData;
import defpackage.i0;

/* loaded from: classes8.dex */
public final class HRV {
    public static final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.NONE, HRW.LJLIL);

    public static final boolean LIZIZ() {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        return (C43119Gw7.LIZ() || C1DG.LJIIIIZZ()) ? false : true;
    }

    public static final boolean LIZJ() {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        return C43119Gw7.LIZ() && !C1DG.LJIIIIZZ();
    }

    public static final UploadSingleSelectData LIZ() {
        if (C45871HzP.LIZ()) {
            return (UploadSingleSelectData) LIZ.getValue();
        }
        return (UploadSingleSelectData) i0.LJ(true, "creation_upload_single_select_config", 31744, UploadSingleSelectData.class, null);
    }
}
