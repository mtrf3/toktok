package X;

import Y.IDxS128S0200000_4;
import com.bytedance.touchpoint.core.model.TaskDoneReponse;
import com.bytedance.touchpoint.data.request.INetworkApi;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.9qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249639qx {
    public static void LIZ(final String taskId, final int i, final long j, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        o.LJIIIZ(taskId, "taskId");
        AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc(i, taskId, j) { // from class: X.9qw
            public final /* synthetic */ String LJLIL;
            public final /* synthetic */ int LJLILLLLZI;
            public final /* synthetic */ boolean LJLJI = true;

            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<C249649qy> interfaceC73573Su9) {
                INetworkApi LJFF;
                C76L<TaskDoneReponse> taskAwardByTaskIdWithNewPath;
                try {
                    C95J.LIZ(11);
                    InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                    if (interfaceC247459nR != null && (LJFF = interfaceC247459nR.LJFF()) != null && (taskAwardByTaskIdWithNewPath = LJFF.getTaskAwardByTaskIdWithNewPath(this.LJLIL, this.LJLILLLLZI)) != null) {
                        TaskDoneReponse taskDoneReponse = taskAwardByTaskIdWithNewPath.get();
                        if (taskDoneReponse != null && taskDoneReponse.statusCode == 0) {
                            int i2 = taskDoneReponse.errNo;
                            if (i2 == 0) {
                                interfaceC73573Su9.onNext(new C249649qy(0, "", taskDoneReponse.data));
                                C247749nu.LIZJ(0, this.LJLIL);
                                return;
                            }
                            String str = taskDoneReponse.errorTips;
                            if (!this.LJLJI) {
                                interfaceC73573Su9.onNext(new C249649qy(i2, str, null));
                                C247749nu.LIZJ(i2, this.LJLIL);
                            } else if (i2 != 10006 && i2 != 10009) {
                                interfaceC73573Su9.tryOnError(new Throwable("report Failed"));
                                C247749nu.LIZJ(i2, this.LJLIL);
                            } else {
                                interfaceC73573Su9.onNext(new C249649qy(i2, str, null));
                                C247749nu.LIZJ(i2, this.LJLIL);
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    interfaceC73573Su9.onNext(new C249649qy(ImagePreloadExperiment.PRIORITY_DEFAULT, e.toString(), null));
                } catch (ExecutionException e2) {
                    interfaceC73573Su9.onNext(new C249649qy(ImagePreloadExperiment.PRIORITY_DEFAULT, e2.toString(), null));
                }
            }
        }).LJJJJL(new AYT(2, 3000L)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS128S0200000_4(interfaceC88472Yns, interfaceC88472Yns2, 3));
    }
}
