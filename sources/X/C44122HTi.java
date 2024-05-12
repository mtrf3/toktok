package X;

import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HTi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C44122HTi extends TBS implements InterfaceC88473Ynt<String, C44124HTk, List<? extends ReturnEcommerceCommentModel>, C76800UCe> {
    public C44122HTi(Object obj) {
        super(3, obj, C44125HTl.class, "compressProcessFinish", "compressProcessFinish(Ljava/lang/String;Lcom/ss/android/ugc/aweme/shortvideo/jsbopenrecord/ProcessFinishState;Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, C44124HTk c44124HTk, List<? extends ReturnEcommerceCommentModel> list) {
        String p0 = str;
        C44124HTk p1 = c44124HTk;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        ((C44125HTl) this.receiver).LJJLIIIJILLIZJL(p0, p1, list);
        return C76800UCe.LIZ;
    }
}
