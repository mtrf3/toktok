package X;

import android.content.Context;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.mediachoose.LocalVideoLegalChecker$checkVideoLegal$$inlined$editorGetMetaDataOptimization$1", f = "VideoLegalChecker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HMJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ HMO LJLIL;
    public final /* synthetic */ MediaModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMJ(InterfaceC67352kd interfaceC67352kd, HMO hmo, MediaModel mediaModel, boolean z, boolean z2, InterfaceC88472Yns interfaceC88472Yns, long j, String str) {
        super(2, interfaceC67352kd);
        this.LJLIL = hmo;
        this.LJLILLLLZI = mediaModel;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = j;
        this.LJLJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new HMJ(interfaceC67352kd, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        OSZ osz;
        C141335gf.LIZJ(obj);
        Context context = this.LJLIL.LIZ;
        String str2 = this.LJLILLLLZI.fileLocalUriPath;
        if (this.LJLJI) {
            str = "share_to_tt";
        } else {
            str = "video_upload";
        }
        if (!C6KD.LIZ() || this.LJLJJI) {
            z = true;
        } else {
            z = false;
        }
        if (C6KC.LIZJ(context, str2, str, z, 16)) {
            InterfaceC88472Yns interfaceC88472Yns = this.LJLJJL;
            this.LJLIL.getClass();
            interfaceC88472Yns.invoke(new C43933HMb(-12, "LocalVideoLegalChecker", System.currentTimeMillis() - this.LJLJJLL, this.LJLJL, "", false));
            osz = new OSZ(this.LJLILLLLZI.fileLocalUriPath, Boolean.TRUE);
        } else {
            osz = new OSZ(this.LJLILLLLZI.fileLocalUriPath, Boolean.FALSE);
        }
        Object first = osz.getFirst();
        if (((Boolean) osz.getSecond()).booleanValue()) {
            C6KD.LIZIZ.add(first);
        }
        return C76800UCe.LIZ;
    }
}
