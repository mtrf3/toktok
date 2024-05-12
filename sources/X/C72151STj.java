package X;

import Y.ARunnableS48S0100000_12;
import com.ss.android.ugc.aweme.aigc.AIGCApi;
import com.ss.android.ugc.aweme.aigc.AIGCTaskStatus;
import com.ss.android.ugc.aweme.aigc.ResponseAIGCTaskStatus;
import com.ss.android.ugc.aweme.aigc.ResponseGetAvatars;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.STj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72151STj implements InterfaceC72136SSu {
    public static final C72163STv Companion = new C72163STv();
    public static final C5H3<ExecutorService> executor$delegate = C221108m2.LIZIZ(C72166STy.LJLIL);
    public final String LJLIL;
    public ResponseGetAvatars LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final ARunnableS48S0100000_12 LJLJJL;
    public final AIGCApi api;
    public ResponseAIGCTaskStatus currentProcess;
    public int errorTimes;
    public boolean isRunning;
    public final List<STO> listeners;
    public final String taskId;

    public final void stop() {
        this.isRunning = false;
    }

    public final ResponseGetAvatars getAvatarResult() {
        List<String> list;
        ResponseGetAvatars responseGetAvatars = this.LJLILLLLZI;
        if (responseGetAvatars != null) {
            return responseGetAvatars;
        }
        AIGCApi aIGCApi = this.api;
        String str = this.taskId;
        aIGCApi.getClass();
        ResponseGetAvatars LIZIZ = AIGCApi.LIZIZ(str);
        this.LJLILLLLZI = LIZIZ;
        if (LIZIZ == null || (list = LIZIZ.avatarUrls) == null || list.isEmpty()) {
            Thread.sleep(500L);
            AIGCApi aIGCApi2 = this.api;
            String str2 = this.taskId;
            aIGCApi2.getClass();
            this.LJLILLLLZI = AIGCApi.LIZIZ(str2);
        }
        return this.LJLILLLLZI;
    }

    public final String getDefaultErrorMessage() {
        return (String) this.LJLJJI.getValue();
    }

    public final long getPollingFrequency() {
        return ((Number) this.LJLJI.getValue()).longValue();
    }

    @Override // X.InterfaceC72136SSu
    public void start() {
        if (!this.isRunning) {
            this.isRunning = true;
            Companion.getClass();
            executor$delegate.getValue().submit(this.LJLJJL);
        }
    }

    public final ResponseGetAvatars getLastResult() {
        return this.LJLILLLLZI;
    }

    public final ResponseAIGCTaskStatus getLastTask() {
        return this.currentProcess;
    }

    public final String getType() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC72136SSu
    public void registerListener(STO listener) {
        o.LJIIIZ(listener, "listener");
        this.listeners.add(listener);
        ResponseAIGCTaskStatus responseAIGCTaskStatus = this.currentProcess;
        if (responseAIGCTaskStatus != null) {
            int i = responseAIGCTaskStatus.status_code;
            AIGCTaskStatus aIGCTaskStatus = null;
            String str = responseAIGCTaskStatus.status_msg;
            List<AIGCTaskStatus> list = responseAIGCTaskStatus.tasks;
            if (list != null) {
                aIGCTaskStatus = (AIGCTaskStatus) ORZ.LJLLLL(list);
            }
            callback(i, str, aIGCTaskStatus, C47261Igj.LJJIJ(listener));
        }
    }

    @Override // X.InterfaceC72136SSu
    public void unregisterListener(STO listener) {
        o.LJIIIZ(listener, "listener");
        this.listeners.remove(listener);
    }

    public C72151STj(String taskId, AIGCApi api, ResponseAIGCTaskStatus responseAIGCTaskStatus) {
        o.LJIIIZ(taskId, "taskId");
        o.LJIIIZ(api, "api");
        this.taskId = taskId;
        this.api = api;
        this.LJLIL = "slow_path";
        this.LJLJI = C221108m2.LIZIZ(C72157STp.LJLIL);
        if (responseAIGCTaskStatus != null) {
            this.currentProcess = responseAIGCTaskStatus;
        }
        this.listeners = new ArrayList();
        this.LJLJJI = C221108m2.LIZIZ(C72158STq.LJLIL);
        this.LJLJJL = new ARunnableS48S0100000_12(this, 122);
    }

    public final void callback(int i, String str, AIGCTaskStatus aIGCTaskStatus, List<? extends STO> list) {
        Integer num;
        ST8 st8;
        List<String> list2;
        Integer num2 = null;
        if (aIGCTaskStatus != null) {
            num = aIGCTaskStatus.status;
        } else {
            num = null;
        }
        int status = EnumC72155STn.SUBMIT.getStatus();
        if (num == null || num.intValue() != status) {
            int status2 = EnumC72155STn.PROCESS.getStatus();
            if (num == null || num.intValue() != status2) {
                int status3 = EnumC72155STn.SUCCESS.getStatus();
                if (num == null || num.intValue() != status3) {
                    int status4 = EnumC72155STn.FAILED.getStatus();
                    if (num == null || num.intValue() != status4) {
                        this.isRunning = false;
                        st8 = new ST8(STF.NONE, i, str, this.taskId, null, null, null, null, null, 496);
                    } else {
                        this.isRunning = false;
                        st8 = new ST8(STF.FAIL, i, str, this.taskId, aIGCTaskStatus.statusMessage, null, null, aIGCTaskStatus.jobType, null, 352);
                    }
                } else {
                    this.isRunning = false;
                    STF stf = STF.SUCCESS;
                    ResponseGetAvatars avatarResult = getAvatarResult();
                    if (avatarResult != null) {
                        list2 = avatarResult.avatarUrls;
                    } else {
                        list2 = null;
                    }
                    st8 = new ST8(stf, i, str, this.taskId, null, null, new ST6(null, list2, null), aIGCTaskStatus.jobType, null, 304);
                }
            } else {
                STF stf2 = STF.IN_PROGRESS;
                Float f = aIGCTaskStatus.percentage;
                if (f != null) {
                    num2 = Integer.valueOf((int) (f.floatValue() * 100));
                }
                st8 = new ST8(stf2, i, str, this.taskId, null, num2, null, aIGCTaskStatus.jobType, null, 336);
            }
        } else {
            st8 = new ST8(STF.WAITING, i, str, this.taskId, null, null, null, aIGCTaskStatus.jobType, aIGCTaskStatus.waitingTime, 112);
        }
        Iterator<? extends STO> it = list.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(st8);
        }
    }

    public /* synthetic */ C72151STj(String str, AIGCApi aIGCApi, ResponseAIGCTaskStatus responseAIGCTaskStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aIGCApi, (i & 4) != 0 ? null : responseAIGCTaskStatus);
    }
}
