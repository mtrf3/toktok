package X;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JQU extends Handler {
    public final WeakReference<JQT> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQU(JQT controller) {
        super(C16880lQ.LLJJJJ());
        o.LJIIIZ(controller, "controller");
        this.LIZ = new WeakReference<>(controller);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        String str;
        Map.Entry<Integer, JQX> entry;
        JQX jqx;
        Integer num;
        JP7 LLLLIIL;
        String str2;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        Integer num2 = null;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Object obj = msg.obj;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            int i2 = msg.arg1;
            C1JX.LJIIIIZZ("Handler playing aid: ", str);
            JQT jqt = this.LIZ.get();
            if (jqt == null) {
                return;
            }
            Object obj2 = msg.obj;
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            java.util.Set<Map.Entry<Integer, JQX>> entrySet = jqt.LJJ().entrySet();
            o.LJIIIIZZ(entrySet, "holderMap.entries");
            Iterator<Map.Entry<Integer, JQX>> it = entrySet.iterator();
            while (true) {
                if (it.hasNext()) {
                    entry = it.next();
                    Map.Entry<Integer, JQX> entry2 = entry;
                    Aweme currentAweme = entry2.getValue().LLLLIIL().getCurrentAweme();
                    if (currentAweme != null) {
                        str2 = currentAweme.getAid();
                    } else {
                        str2 = null;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onScrolledTo pos #");
                    LIZ.append(entry2.getValue().LLLLIIL().LLJJJ());
                    LIZ.append(", aid ");
                    LIZ.append(str2);
                    X1D.LIZIZ(LIZ);
                    if (o.LJ(str2, obj2) && C78926UyI.LJIILIIL(entry2.getValue()) >= 0) {
                        break;
                    }
                } else {
                    entry = null;
                    break;
                }
            }
            Map.Entry<Integer, JQX> entry3 = entry;
            if (entry3 != null) {
                jqx = entry3.getValue();
            } else {
                jqx = null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onScrolledTo holder #");
            if (jqx != null && (LLLLIIL = jqx.LLLLIIL()) != null) {
                num = Integer.valueOf(LLLLIIL.LLJJJ());
            } else {
                num = null;
            }
            LIZ2.append(num);
            LIZ2.append(" found, playing");
            X1D.LIZIZ(LIZ2);
            jqt.LJZI = false;
            if (jqx != null) {
                jqt.LJJIJIL(jqx, null, null);
                return;
            } else {
                if (!C50989Jzl.LJI(jqt.LJLIL.getContext())) {
                    return;
                }
                C2U8.LIZ(new JRS(i2, 5));
                return;
            }
        }
        this.LIZLLL = true;
        JQT jqt2 = this.LIZ.get();
        if (jqt2 == null) {
            return;
        }
        Object obj3 = msg.obj;
        if (obj3 instanceof Integer) {
            num2 = (Integer) obj3;
        }
        JQX LJIJI = jqt2.LJIJI(0);
        if (LJIJI == null) {
            return;
        }
        jqt2.LJJIJIL(LJIJI, num2, new JQW(jqt2, num2));
    }
}
