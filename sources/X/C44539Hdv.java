package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEWatermarkParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Hdv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44539Hdv extends C44537Hdt {
    public final InterfaceC153045zY LIZLLL;
    public final VEWatermarkParam LJ;
    public final InterfaceC88472Yns<VideoPublishEditModel, InterfaceC147355qN> LJFF;
    public final C44541Hdx LJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44539Hdv(VideoPublishEditModel model, C44549He5 c44549He5, C44530Hdm c44530Hdm, InterfaceC153045zY editor, VEWatermarkParam vEWatermarkParam, C44528Hdk videoSizeProviderCreator, C44541Hdx c44541Hdx) {
        super(model, c44549He5, c44530Hdm);
        o.LJIIIZ(model, "model");
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(videoSizeProviderCreator, "videoSizeProviderCreator");
        this.LIZLLL = editor;
        this.LJ = vEWatermarkParam;
        this.LJFF = videoSizeProviderCreator;
        this.LJI = c44541Hdx;
    }
}
