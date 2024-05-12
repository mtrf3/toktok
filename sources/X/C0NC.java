package X;

import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import org.json.JSONObject;

/* renamed from: X.0NC, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0NC implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                C0NE c0ne = (C0NE) this.LJLILLLLZI;
                String str = (String) this.LJLJI;
                C0NB.LJ(str, c0ne.LJFF(str, (JSONObject) this.LJLJJI));
                return;
            default:
                C43870HJq c43870HJq = (C43870HJq) this.LJLILLLLZI;
                InterfaceC43874HJu interfaceC43874HJu = (InterfaceC43874HJu) this.LJLJI;
                RecorderConcatResult recorderConcatResult = (RecorderConcatResult) this.LJLJJI;
                c43870HJq.getClass();
                interfaceC43874HJu.LIZ(recorderConcatResult.ret, recorderConcatResult.videoPath, recorderConcatResult.audioPath, c43870HJq.LIZJ);
                return;
        }
    }

    public /* synthetic */ C0NC(int i, Object obj, Object obj2, Object obj3) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
    }
}
