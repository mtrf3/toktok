package X;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.view.RenderThumbnailView$renderBackground$1", f = "RenderThumbnailView.kt", l = {33}, m = "invokeSuspend")
/* renamed from: X.5iD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142295iD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Bitmap LJLILLLLZI;
    public final /* synthetic */ MediaModel LJLJI;
    public final /* synthetic */ C164066cE LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C142295iD(Bitmap bitmap, MediaModel mediaModel, C164066cE c164066cE, InterfaceC67352kd<? super C142295iD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = bitmap;
        this.LJLJI = mediaModel;
        this.LJLJJI = c164066cE;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C142295iD(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        OSZ<Integer, Integer> LIZIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Bitmap originalBitmap = this.LJLILLLLZI;
            MediaModel mediaModel = this.LJLJI;
            C164066cE c164066cE = this.LJLJJI;
            o.LJIIIZ(mediaModel, "mediaModel");
            o.LJIIIZ(originalBitmap, "originalBitmap");
            ConcurrentHashMap<String, OSZ<Integer, Integer>> concurrentHashMap = C142325iG.LIZIZ;
            if (concurrentHashMap == null || (LIZIZ = concurrentHashMap.get(mediaModel.fileLocalUriPath)) == null) {
                LIZIZ = ((GYB) C142325iG.LIZ.getValue()).LIZIZ(originalBitmap);
                if (concurrentHashMap != null) {
                    String str = mediaModel.fileLocalUriPath;
                    o.LJIIIIZZ(str, "mediaModel.fileLocalUriPath");
                    concurrentHashMap.put(str, LIZIZ);
                }
            }
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{LIZIZ.getFirst().intValue(), LIZIZ.getSecond().intValue()});
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C142305iE c142305iE = new C142305iE(c164066cE, gradientDrawable, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c142305iE, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
