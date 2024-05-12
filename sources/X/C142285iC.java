package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.util.AlbumThumbnailBGColorCacheUtil$cacheBgcolor$1", f = "AlbumThumbnailBGColorCacheUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5iC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142285iC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MediaModel LJLIL;
    public final /* synthetic */ Bitmap LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C142285iC(MediaModel mediaModel, Bitmap bitmap, InterfaceC67352kd<? super C142285iC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = mediaModel;
        this.LJLILLLLZI = bitmap;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C142285iC(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ConcurrentHashMap<String, OSZ<Integer, Integer>> concurrentHashMap = C142325iG.LIZIZ;
        if (concurrentHashMap != null) {
            String str = this.LJLIL.fileLocalUriPath;
            o.LJIIIIZZ(str, "mediaModel.fileLocalUriPath");
            concurrentHashMap.put(str, ((GYB) C142325iG.LIZ.getValue()).LIZIZ(this.LJLILLLLZI));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
