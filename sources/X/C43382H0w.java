package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.H0w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C43382H0w extends TBS implements InterfaceC88472Yns<UploadAuthKeyConfig, C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<UploadAuthKeyConfig, C76800UCe> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C43382H0w(InterfaceC88472Yns<? super UploadAuthKeyConfig, C76800UCe> interfaceC88472Yns) {
        super(1, C43383H0x.class, "innerOnSuccess", "requestAuthKey$innerOnSuccess(Lkotlin/jvm/functions/Function1;Lcom/ss/android/ugc/aweme/publish/model/UploadAuthKeyConfig;)V", 0);
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(UploadAuthKeyConfig p0) {
        o.LJIIIZ(p0, "p0");
        this.LJLIL.invoke(p0);
        return C76800UCe.LIZ;
    }
}
