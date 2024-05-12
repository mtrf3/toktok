package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ICreativeStandardPathService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import fjb.a;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.ui.EditServiceImpl$handleMediaCopy$2", f = "EditServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.HDd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43701HDd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C68322mC<String> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ EditConfig LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43701HDd(C68322mC<String> c68322mC, String str, EditConfig editConfig, InterfaceC67352kd<? super C43701HDd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = str;
        this.LJLJI = editConfig;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43701HDd(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.element = UUID.randomUUID().toString();
        StringBuilder LIZ = X1D.LIZ();
        ICreativeStandardPathService creativeStandardPath = AVExternalServiceImpl.LIZ().creativeStandardPath();
        String str = this.LJLIL.element;
        o.LJI(str);
        LIZ.append(creativeStandardPath.genCreativePath(str));
        LIZ.append(File.separator);
        LIZ.append(new File(this.LJLILLLLZI).getName());
        String LIZIZ = X1D.LIZIZ(LIZ);
        OR7.LLLIIIL(new File(this.LJLILLLLZI), new File(LIZIZ), false, 6);
        this.LJLJI.setMediaInfo(new VideoMedia(LIZIZ));
        this.LJLJI.setCreationId(this.LJLIL.element);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
