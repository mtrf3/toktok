package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.MultiMedia;
import fjb.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.ui.EditServiceImpl$handleMultiMediaCopy$2", f = "EditServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.HDc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43700HDc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ArrayList<MediaModel> LJLIL;
    public final /* synthetic */ EditConfig LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43700HDc(ArrayList<MediaModel> arrayList, EditConfig editConfig, String str, InterfaceC67352kd<? super C43700HDc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = arrayList;
        this.LJLILLLLZI = editConfig;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43700HDc(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ArrayList<MediaModel> arrayList = this.LJLIL;
        String str = this.LJLJI;
        Iterator<MediaModel> it = arrayList.iterator();
        while (it.hasNext()) {
            MediaModel next = it.next();
            String str2 = next.fileLocalUriPath;
            o.LJIIIIZZ(str2, "it.fileLocalUriPath");
            if (!C78966Uyw.LJJIJIIJIL(str2)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(AVExternalServiceImpl.LIZ().creativeStandardPath().genCreativePath(str));
                LIZ.append(File.separator);
                LIZ.append(new File(next.fileLocalUriPath).getName());
                String LIZIZ = X1D.LIZIZ(LIZ);
                if (!o.LJ(next.fileLocalUriPath, LIZIZ)) {
                    OR7.LLLIIIL(new File(next.fileLocalUriPath), new File(LIZIZ), false, 6);
                    next.fileLocalUriPath = LIZIZ;
                }
            }
        }
        this.LJLILLLLZI.setMediaInfo(new MultiMedia(this.LJLIL));
        this.LJLILLLLZI.setCreationId(this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
