package X;

import android.content.Context;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.ss.android.ugc.aweme.actionai.action.data.ImageInfoList;
import com.ss.android.ugc.aweme.actionai.action.data.ImageInfoListKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Ho8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45172Ho8 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final Context LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    static {
        TBT tbt = new TBT(C45172Ho8.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public static ImageInfoList LIZIZ(Meta meta) {
        ImageInfoList imageInfoList = new ImageInfoList(null, null, null, null, null, null, 63, null);
        VecStr vecStr = new VecStr();
        vecStr.LIZJ("image");
        SmartMovieJniJNI.Meta_setIncludes(meta.LIZ, meta, vecStr.LJLIL, vecStr);
        imageInfoList.setMeta(ImageInfoListKt.convertCompat(meta));
        return imageInfoList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[LOOP:0: B:11:0x003a->B:13:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Throwable, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.actionai.action.data.AutoCutFrameOutPut> r15) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45172Ho8.LIZ(X.2kd):java.lang.Object");
    }

    public C45172Ho8(Context context, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(context, "context");
        this.LJLIL = diContainer;
        C45161Hnx.LIZIZ(null);
        this.LJLILLLLZI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJI = C5L7.LIZ();
        this.LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 659));
        this.LJLJJL = C221108m2.LIZIZ(C45150Hnm.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(C173326rA.LJLIL);
    }
}
