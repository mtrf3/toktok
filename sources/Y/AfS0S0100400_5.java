package Y;

import X.C0NB;
import X.C30922CBq;
import X.C46104I7o;
import X.C78555UsJ;
import X.CW4;
import X.CWA;
import X.InterfaceC64592gB;
import X.X1D;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.game.model.CreateHighLightResult;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AfS0S0100400_5 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public long j2;
    public long j3;
    public long j4;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS0S0100400_5 afS0S0100400_5, Object obj) {
        boolean z;
        int i;
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.statusCode == 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        Long l = null;
        if (z) {
            AtomicInteger atomicInteger = ((CWA) afS0S0100400_5.l0).LJLLJ;
            atomicInteger.set(atomicInteger.get() + 1);
            CreateHighLightResult createHighLightResult = (CreateHighLightResult) baseResponse.data;
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("request create high light video. result=");
                LIZ.append(createHighLightResult);
                C0NB.LJIIIZ("LiveGameMsgView2", X1D.LIZIZ(LIZ));
            }
            long j = afS0S0100400_5.j1;
            if (createHighLightResult == null || (str = createHighLightResult.fragmentIdStr) == null) {
                str = "";
            }
            C46104I7o.LJJIL(0, j, str, true);
            CWA cwa = (CWA) afS0S0100400_5.l0;
            String string = cwa.getActivity().getString(R.string.l9c);
            o.LJIIIIZZ(string, "activity.getString(R.str….pm_flowball_highsuccess)");
            cwa.LJJII(0, string);
            CWA cwa2 = (CWA) afS0S0100400_5.l0;
            cwa2.LJLLL = afS0S0100400_5.j1;
            cwa2.LJLLLL = createHighLightResult;
            if (createHighLightResult != null) {
                l = Long.valueOf(createHighLightResult.fragmentId);
            }
            C78555UsJ.LJJIJIIJI(l, afS0S0100400_5.j1, afS0S0100400_5.j2, afS0S0100400_5.j3, afS0S0100400_5.j4, ((CWA) afS0S0100400_5.l0).LJLLILLLL);
            ((CWA) afS0S0100400_5.l0).LJLLILLLL = afS0S0100400_5.j2;
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("create highlight error. resCode=");
        if (baseResponse != null) {
            num = Integer.valueOf(baseResponse.statusCode);
        }
        LIZ2.append(num);
        C0NB.LJ("LiveGameMsgView2", X1D.LIZIZ(LIZ2));
        if (baseResponse != null) {
            i = baseResponse.statusCode;
        } else {
            i = -1;
        }
        C78555UsJ.LJJIJ(i, 1, afS0S0100400_5.j2, afS0S0100400_5.j3, afS0S0100400_5.j4, ((CWA) afS0S0100400_5.l0).LJLLILLLL, afS0S0100400_5.j1, "network response error");
    }

    public static final void accept$1(AfS0S0100400_5 afS0S0100400_5, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create highlight error. throwable=");
        LIZ.append(th);
        C0NB.LJ("LiveGameMsgView2", X1D.LIZIZ(LIZ));
        C78555UsJ.LJJIJ(2, 0, afS0S0100400_5.j1, afS0S0100400_5.j2, afS0S0100400_5.j3, ((CWA) afS0S0100400_5.l0).LJLLILLLL, afS0S0100400_5.j4, th.getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS0S0100400_5 afS0S0100400_5, Object obj) {
        boolean z;
        int i;
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.statusCode == 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        Long l = null;
        if (z) {
            AtomicInteger atomicInteger = ((CW4) afS0S0100400_5.l0).LJLLL;
            atomicInteger.set(atomicInteger.get() + 1);
            CreateHighLightResult createHighLightResult = (CreateHighLightResult) baseResponse.data;
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("request create high light video. result=");
                LIZ.append(createHighLightResult);
                C0NB.LJIIIZ("LiveGameMsgView", X1D.LIZIZ(LIZ));
            }
            long j = afS0S0100400_5.j1;
            if (createHighLightResult == null || (str = createHighLightResult.fragmentIdStr) == null) {
                str = "";
            }
            C46104I7o.LJJIL(0, j, str, true);
            CW4 cw4 = (CW4) afS0S0100400_5.l0;
            String string = cw4.getActivity().getString(R.string.l9c);
            o.LJIIIIZZ(string, "activity.getString(R.str….pm_flowball_highsuccess)");
            cw4.LJIJJ(0, string);
            CW4 cw42 = (CW4) afS0S0100400_5.l0;
            cw42.LLD = afS0S0100400_5.j1;
            cw42.LLF = createHighLightResult;
            if (createHighLightResult != null) {
                l = Long.valueOf(createHighLightResult.fragmentId);
            }
            C78555UsJ.LJJIJIIJI(l, afS0S0100400_5.j1, afS0S0100400_5.j2, afS0S0100400_5.j3, afS0S0100400_5.j4, ((CW4) afS0S0100400_5.l0).LJLLJ);
            ((CW4) afS0S0100400_5.l0).LJLLJ = afS0S0100400_5.j2;
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("create highlight error. resCode=");
        if (baseResponse != null) {
            num = Integer.valueOf(baseResponse.statusCode);
        }
        LIZ2.append(num);
        C0NB.LJ("LiveGameMsgView", X1D.LIZIZ(LIZ2));
        if (baseResponse != null) {
            i = baseResponse.statusCode;
        } else {
            i = -1;
        }
        C78555UsJ.LJJIJ(i, 1, afS0S0100400_5.j2, afS0S0100400_5.j3, afS0S0100400_5.j4, ((CW4) afS0S0100400_5.l0).LJLLJ, afS0S0100400_5.j1, "network response error");
    }

    public static final void accept$3(AfS0S0100400_5 afS0S0100400_5, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create highlight error. throwable=");
        LIZ.append(th);
        C0NB.LJ("LiveGameMsgView", X1D.LIZIZ(LIZ));
        C78555UsJ.LJJIJ(2, 0, afS0S0100400_5.j1, afS0S0100400_5.j2, afS0S0100400_5.j3, ((CW4) afS0S0100400_5.l0).LJLLJ, afS0S0100400_5.j4, th.getMessage());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S0100400_5(long r2, long r4, long r6, long r8, X.CW4 r10, int r11) {
        /*
            r1 = this;
            r1.$t = r11
            switch(r11) {
                case 2: goto L14;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.j1 = r2
            r0.j2 = r4
            r0.j3 = r6
            r0.l0 = r10
            r0.j4 = r8
        L10:
            r0.<init>()
            return
        L14:
            r0 = r1
            r0.l0 = r10
            r0.j1 = r2
            r0.j2 = r4
            r0.j3 = r6
            r0.j4 = r8
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0100400_5.<init>(long, long, long, long, X.CW4, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S0100400_5(long r2, long r4, long r6, long r8, X.CWA r10, int r11) {
        /*
            r1 = this;
            r1.$t = r11
            switch(r11) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.j1 = r2
            r0.j2 = r4
            r0.j3 = r6
            r0.l0 = r10
            r0.j4 = r8
        L10:
            r0.<init>()
            return
        L14:
            r0 = r1
            r0.l0 = r10
            r0.j1 = r2
            r0.j2 = r4
            r0.j3 = r6
            r0.j4 = r8
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0100400_5.<init>(long, long, long, long, X.CWA, int):void");
    }
}
