package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U7r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76683U7r {
    public int LIZ;
    public AbstractC65781Prl LIZIZ;
    public final List<U9K> LIZJ = new ArrayList();

    public C76683U7r() {
        LIZ(new U9K(0, 1));
        LIZ(new U9K(0, 2));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            LIZ(new U9K(0, 3));
        }
        LIZ(new U9K(1, 2));
        LIZ(new U9K(1, 0));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            LIZ(new U9K(1, 3));
        }
        LIZ(new U9K(2, 3));
        LIZ(new U9K(2, 1));
        LIZ(new U9K(2, 6));
        LIZ(new U9K(2, 0));
        LIZ(new U9K(3, 4));
        LIZ(new U9K(3, 1));
        LIZ(new U9K(3, 0));
        LIZ(new U9K(4, 1));
        LIZ(new U9K(4, 0));
        LIZ(new U9K(4, 5));
        LIZ(new U9K(4, 6));
        LIZ(new U9K(5, 1));
        LIZ(new U9K(5, 6));
        LIZ(new U9K(5, 0));
        LIZ(new U9K(6, 0));
        this.LIZ = 0;
    }

    public final void LIZ(U9K u9k) {
        ((ArrayList) this.LIZJ).add(u9k);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.Yns, X.Prl] */
    public final boolean LIZIZ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("transitionTo mState=");
        LIZ.append(this.LIZ);
        LIZ.append(" state=");
        LIZ.append(i);
        U4R.LIZLLL("StateMachine", X1D.LIZIZ(LIZ));
        List<U9K> list = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((U9K) next).LIZ == this.LIZ) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((U9K) next2).LIZIZ == i) {
                    if (next2 != null) {
                        this.LIZ = i;
                        ?? r1 = this.LIZIZ;
                        if (r1 != 0) {
                            r1.invoke(Integer.valueOf(i));
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
