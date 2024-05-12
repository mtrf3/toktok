package com.ss.android.ugc.aweme.scheduler;

import X.AbstractC41479GPr;
import X.C41477GPp;
import X.C41478GPq;
import X.C41505GQr;
import X.C41614GUw;
import X.C60903NvH;
import X.C76800UCe;
import X.GUH;
import X.GUI;
import X.GUX;
import X.H78;
import X.InterfaceC65784Pro;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ParallelPublishCallback extends GUX {
    public InterfaceC65784Pro<C76800UCe> onParallelTaskFinish;
    public final GUI publishTaskList;

    public final InterfaceC65784Pro<C76800UCe> getOnParallelTaskFinish() {
        return this.onParallelTaskFinish;
    }

    public final void setOnParallelTaskFinish(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.onParallelTaskFinish = interfaceC65784Pro;
    }

    public ParallelPublishCallback(GUI publishTaskList, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(publishTaskList, "publishTaskList");
        this.publishTaskList = publishTaskList;
        this.onParallelTaskFinish = interfaceC65784Pro;
    }

    @Override // X.GUX
    public void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        o.LJIIIZ(result, "result");
        super.onFinish(result, obj, publishModel);
        if (((result instanceof C41505GQr) || (result instanceof C41614GUw) || (result instanceof C41478GPq) || (result instanceof C41477GPp)) && this.publishTaskList.LJFF() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PublishParallel ParallelPublishCallback onFinish result: ");
            LIZ.append(result);
            LIZ.append(", publishTaskList size: ");
            LIZ.append(this.publishTaskList.LJFF());
            H78.LJI(X1D.LIZIZ(LIZ));
            if (C60903NvH.LJIIJJI().LJJIII().isRecordingOrEditing()) {
                H78.LJI("PublishParallel ParallelPublishCallback skip next task because of current activity is record or edit");
            } else {
                H78.LJI("PublishParallel ParallelPublishCallback start next task");
                GUH.LJJIFFI();
            }
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.onParallelTaskFinish;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public /* synthetic */ ParallelPublishCallback(GUI gui, InterfaceC65784Pro interfaceC65784Pro, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gui, (i & 2) != 0 ? null : interfaceC65784Pro);
    }
}
