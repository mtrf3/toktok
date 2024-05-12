package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.6f0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165786f0 implements InterfaceC166406g0 {
    public final VideoPublishEditModel LIZ;
    public int LIZIZ;

    @Override // X.InterfaceC166406g0
    public final String LIZIZ() {
        InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
        CreativeInfo creativeInfo = this.LIZ.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "publishEditModel.creativeInfo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("origin_vc_extract_");
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        LIZ.append(i);
        LIZ.append('_');
        LIZ.append(System.currentTimeMillis());
        return LIZIZ.LJJJI(creativeInfo, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC166406g0
    public final String LIZJ() {
        InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
        CreativeInfo creativeInfo = this.LIZ.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "publishEditModel.creativeInfo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("origin_vc_temp_upload");
        String str = File.separator;
        LIZ.append(str);
        LIZ.append(System.currentTimeMillis());
        LIZ.append(str);
        LIZ.append(this.LIZIZ);
        return LIZIZ.LJJJI(creativeInfo, X1D.LIZIZ(LIZ));
    }

    public C165786f0(VideoPublishEditModel publishEditModel) {
        o.LJIIIZ(publishEditModel, "publishEditModel");
        this.LIZ = publishEditModel;
    }

    @Override // X.InterfaceC166406g0
    public final String LIZ(String str) {
        InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
        CreativeInfo creativeInfo = this.LIZ.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "publishEditModel.creativeInfo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("origin_vc_");
        LIZ.append(str);
        return LIZIZ.LJJJI(creativeInfo, X1D.LIZIZ(LIZ));
    }
}
