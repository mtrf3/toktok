package Y;

import X.AlertDialogC45396Hrk;
import X.AlertDialogC46073I6j;
import X.C45344Hqu;
import X.C45346Hqw;
import X.C45354Hr4;
import X.C45378HrS;
import X.C45776Hxs;
import X.C46074I6k;
import X.C46088I6y;
import X.C46089I6z;
import X.C61337O5l;
import X.I7U;
import X.InterfaceC153045zY;
import X.KL2;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDHandlerS20S0100000_7 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            case 2:
                handleMessage$2(this, message);
                return;
            case 3:
                handleMessage$3(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public static final void handleMessage$0(IDHandlerS20S0100000_7 iDHandlerS20S0100000_7, Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i == 1001) {
            C46074I6k c46074I6k = (C46074I6k) iDHandlerS20S0100000_7.l0;
            Object obj = msg.obj;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) obj).floatValue();
            if (floatValue >= 1.0f) {
                VideoSegment videoSegment = c46074I6k.LIZJ;
                if (videoSegment != null) {
                    videoSegment.isGetVideoFrame = true;
                    HashSet<String> hashSet = c46074I6k.LJIIJJI;
                    o.LJI(videoSegment);
                    String LJII = videoSegment.LJII(false);
                    LJII.toString();
                    hashSet.add(LJII);
                }
                int i2 = c46074I6k.LIZIZ + 1;
                c46074I6k.LIZIZ = i2;
                c46074I6k.LJIIIZ = c46074I6k.LJIIIIZZ * i2;
                List<? extends VideoSegment> list = c46074I6k.LJ;
                o.LJI(list);
                if (i2 >= list.size()) {
                    c46074I6k.LIZ(true, false, true);
                    return;
                }
                List<? extends VideoSegment> list2 = c46074I6k.LJ;
                o.LJI(list2);
                VideoSegment videoSegment2 = (VideoSegment) ListProtector.get(list2, c46074I6k.LIZIZ);
                c46074I6k.LIZJ = videoSegment2;
                if (videoSegment2 == null) {
                    c46074I6k.LIZ(false, false, false);
                    return;
                }
                c46074I6k.LIZLLL = videoSegment2.videoIndex;
                if (c46074I6k.LJIIJ) {
                    return;
                }
                InterfaceC153045zY interfaceC153045zY = c46074I6k.LIZ;
                o.LJI(interfaceC153045zY);
                interfaceC153045zY.LLIL(c46074I6k.LIZLLL, new C46088I6y(c46074I6k));
                return;
            }
            float f = (floatValue * c46074I6k.LJIIIIZZ) + c46074I6k.LJIIIZ;
            I7U i7u = c46074I6k.LJFF;
            if (i7u != null) {
                i7u.LIZIZ();
            }
            int i3 = 100;
            int i4 = (int) (f * 100);
            if (i4 < 100) {
                i3 = i4;
            }
            AlertDialogC46073I6j alertDialogC46073I6j = c46074I6k.LJI;
            if (alertDialogC46073I6j == null || !alertDialogC46073I6j.isShowing()) {
                return;
            }
            AlertDialogC46073I6j alertDialogC46073I6j2 = c46074I6k.LJI;
            o.LJI(alertDialogC46073I6j2);
            alertDialogC46073I6j2.LIZ(i3);
            return;
        }
        if (i != 1002) {
            return;
        }
        C46074I6k c46074I6k2 = (C46074I6k) iDHandlerS20S0100000_7.l0;
        Object obj2 = msg.obj;
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Float");
        if (((Float) obj2).floatValue() >= 1.0f) {
            VideoSegment videoSegment3 = c46074I6k2.LIZJ;
            if (videoSegment3 != null) {
                videoSegment3.isGetVideoFrame = true;
            }
            int i5 = c46074I6k2.LIZIZ + 1;
            c46074I6k2.LIZIZ = i5;
            List<? extends VideoSegment> list3 = c46074I6k2.LJ;
            o.LJI(list3);
            if (i5 >= list3.size()) {
                return;
            }
            List<? extends VideoSegment> list4 = c46074I6k2.LJ;
            o.LJI(list4);
            VideoSegment videoSegment4 = (VideoSegment) ListProtector.get(list4, c46074I6k2.LIZIZ);
            c46074I6k2.LIZJ = videoSegment4;
            if (videoSegment4 == null) {
                return;
            }
            c46074I6k2.LIZLLL = videoSegment4.videoIndex;
            InterfaceC153045zY interfaceC153045zY2 = c46074I6k2.LIZ;
            o.LJI(interfaceC153045zY2);
            interfaceC153045zY2.LLIL(c46074I6k2.LIZLLL, new C46089I6z(c46074I6k2));
            return;
        }
        c46074I6k2.getClass();
    }

    public static final void handleMessage$1(IDHandlerS20S0100000_7 iDHandlerS20S0100000_7, Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1) {
            C45776Hxs c45776Hxs = (C45776Hxs) iDHandlerS20S0100000_7.l0;
            c45776Hxs.LIZIZ++;
            c45776Hxs.LIZ();
        }
    }

    public static final void handleMessage$2(IDHandlerS20S0100000_7 iDHandlerS20S0100000_7, Message msg) {
        float f;
        int i;
        Integer num;
        o.LJIIIZ(msg, "msg");
        int i2 = msg.what;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            Object obj = msg.obj;
            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            AlertDialogC45396Hrk alertDialogC45396Hrk = ((C45378HrS) iDHandlerS20S0100000_7.l0).LJ;
            if (alertDialogC45396Hrk == null || !alertDialogC45396Hrk.isShowing()) {
                return;
            }
            alertDialogC45396Hrk.LIZJ(i);
            return;
        }
        C45378HrS c45378HrS = (C45378HrS) iDHandlerS20S0100000_7.l0;
        AlertDialogC45396Hrk alertDialogC45396Hrk2 = c45378HrS.LJ;
        if (alertDialogC45396Hrk2 == null || !alertDialogC45396Hrk2.isShowing()) {
            return;
        }
        if (C45354Hr4.LIZ()) {
            alertDialogC45396Hrk2.LIZIZ();
            Context context = c45378HrS.LIZLLL;
            if (context != null) {
                f = (240.0f * context.getResources().getDisplayMetrics().density) + 0.5f;
            } else {
                f = 0.0f;
            }
            alertDialogC45396Hrk2.LJ((int) f, c45378HrS.LIZLLL);
        }
        alertDialogC45396Hrk2.LJLL = C61337O5l.LJLILLLLZI;
    }

    public static final void handleMessage$3(IDHandlerS20S0100000_7 iDHandlerS20S0100000_7, Message msg) {
        C45344Hqu c45344Hqu;
        AlertDialogC45396Hrk alertDialogC45396Hrk;
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1 && (alertDialogC45396Hrk = (c45344Hqu = (C45344Hqu) iDHandlerS20S0100000_7.l0).LJLL) != null && alertDialogC45396Hrk.isShowing()) {
            if (C45354Hr4.LIZ()) {
                AlertDialogC45396Hrk alertDialogC45396Hrk2 = c45344Hqu.LJLL;
                if (alertDialogC45396Hrk2 != null) {
                    alertDialogC45396Hrk2.LIZIZ();
                }
                AlertDialogC45396Hrk alertDialogC45396Hrk3 = c45344Hqu.LJLL;
                if (alertDialogC45396Hrk3 != null) {
                    alertDialogC45396Hrk3.LJ((int) KL2.LIZJ(c45344Hqu.LJLIL, 240.0f), c45344Hqu.LJLIL);
                }
            }
            alertDialogC45396Hrk.LJLL = new C45346Hqw(c45344Hqu);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS20S0100000_7(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
