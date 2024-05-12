package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.utils.ImageModeUtils$processDataForImageMode$1$1", f = "ImageModeUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5ni, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145705ni extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MediaModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ CopyOnWriteArrayList<String> LJLJI;
    public final /* synthetic */ ConcurrentHashMap<String, MediaModel> LJLJJI;
    public final /* synthetic */ ConcurrentHashMap<MediaModel, String> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C145705ni(MediaModel mediaModel, String str, CopyOnWriteArrayList<String> copyOnWriteArrayList, ConcurrentHashMap<String, MediaModel> concurrentHashMap, ConcurrentHashMap<MediaModel, String> concurrentHashMap2, InterfaceC67352kd<? super C145705ni> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = mediaModel;
        this.LJLILLLLZI = str;
        this.LJLJI = copyOnWriteArrayList;
        this.LJLJJI = concurrentHashMap;
        this.LJLJJL = concurrentHashMap2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C145705ni(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C151535x7 c151535x7 = C151535x7.LIZ;
        MediaModel mediaModel = this.LJLIL;
        o.LJIIIIZZ(mediaModel, "mediaModel");
        String filePath = this.LJLILLLLZI;
        o.LJIIIIZZ(filePath, "filePath");
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.LJLJI;
        ConcurrentHashMap<String, MediaModel> concurrentHashMap = this.LJLJJI;
        c151535x7.getClass();
        if (!C151535x7.LJIIJJI(mediaModel, filePath, copyOnWriteArrayList, concurrentHashMap)) {
            ConcurrentHashMap<MediaModel, String> concurrentHashMap2 = this.LJLJJL;
            MediaModel mediaModel2 = this.LJLIL;
            o.LJIIIIZZ(mediaModel2, "mediaModel");
            String filePath2 = this.LJLILLLLZI;
            o.LJIIIIZZ(filePath2, "filePath");
            concurrentHashMap2.put(mediaModel2, filePath2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
