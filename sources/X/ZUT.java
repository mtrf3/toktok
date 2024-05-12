package X;

import com.benchmark.collection.service.ByteBenchProcessInterface;
import com.benchmark.collection.service.ByteBenchService;
import com.benchmark.port.nativePort.ApplogUtilsInvoker;
import com.benchmark.port.nativePort.LogcatInvoker;

/* loaded from: classes19.dex */
public class ZUT extends ZUK {
    public final /* synthetic */ ByteBenchService LJLILLLLZI;

    @Override // X.ZU2
    public final void LLZLL() {
        if (this.LJLILLLLZI.mStatus == ZTW.START) {
            this.LJLILLLLZI.mByteBenchProcess.stopByteBench();
            this.LJLILLLLZI.mStatus = ZTW.STOP;
            ZU3 zu3 = this.LJLILLLLZI.mCallback;
            if (zu3 != null) {
                zu3.LLZLLLL(102, "stop");
                return;
            }
            return;
        }
        ZU3 zu32 = this.LJLILLLLZI.mCallback;
        if (zu32 == null) {
            return;
        }
        zu32.onError(102, -1, "stop failed");
    }

    public ZUT(ByteBenchService byteBenchService) {
        this.LJLILLLLZI = byteBenchService;
    }

    @Override // X.ZU2
    public final void p0(int i, String str, String str2, ZU3 zu3) {
        ByteBenchService byteBenchService = this.LJLILLLLZI;
        byteBenchService.mCallback = zu3;
        ZTW ztw = byteBenchService.mStatus;
        ZTW ztw2 = ZTW.START;
        if (ztw == ztw2 || this.LJLILLLLZI.mStatus == ZTW.DESTROY) {
            return;
        }
        ZTW ztw3 = this.LJLILLLLZI.mStatus;
        ZTW ztw4 = ZTW.INVALID;
        if (ztw3 == ztw4) {
            this.LJLILLLLZI.mByteBenchProcess = new ByteBenchProcessInterface();
            ByteBenchService byteBenchService2 = this.LJLILLLLZI;
            if (byteBenchService2.mByteBenchProcess.init(str, byteBenchService2.mInternalFile, byteBenchService2.mExternalFile, byteBenchService2.mRuntimeLibLoadingPath, byteBenchService2) < 0) {
                C47261Igj.LJIILL("ByteBenchService");
                this.LJLILLLLZI.mStatus = ztw4;
                return;
            }
            this.LJLILLLLZI.mByteBenchProcess.setByteBenchCallback(zu3);
            C47261Igj.LJJJI("ByteBenchService", C09590Zf.LJIILLIIL.LJIILIIL);
            LogcatInvoker.LIZ(C09590Zf.LJIILLIIL.LJIILIIL);
            C38891fp.LJJIJIIJI(new ZUF(this));
            ApplogUtilsInvoker.Init();
            this.LJLILLLLZI.mStatus = ZTW.INIT;
        }
        ByteBenchService byteBenchService3 = this.LJLILLLLZI;
        ByteBenchProcessInterface byteBenchProcessInterface = byteBenchService3.mByteBenchProcess;
        if (byteBenchProcessInterface == null) {
            ZU3 zu32 = byteBenchService3.mCallback;
            if (zu32 != null) {
                zu32.onError(101, -1, "mByteBenchProcess is null, start failed");
                return;
            }
            return;
        }
        int loadByteBench = byteBenchProcessInterface.loadByteBench(str2);
        if (loadByteBench != 0) {
            this.LJLILLLLZI.mStatus = ztw4;
            ZU3 zu33 = this.LJLILLLLZI.mCallback;
            if (zu33 != null) {
                zu33.onError(101, loadByteBench, "init, loadByteBench start failed");
                return;
            }
            return;
        }
        int startTest = this.LJLILLLLZI.mByteBenchProcess.startTest(i, str2);
        if (startTest < 0) {
            ZU3 zu34 = this.LJLILLLLZI.mCallback;
            if (zu34 != null) {
                zu34.onError(101, startTest, "start native task failed");
            }
            this.LJLILLLLZI.mStatus = ZTW.INIT;
            return;
        }
        this.LJLILLLLZI.mStatus = ztw2;
        ZU3 zu35 = this.LJLILLLLZI.mCallback;
        if (zu35 == null) {
            return;
        }
        zu35.LLZLLLL(101, "start");
    }
}
